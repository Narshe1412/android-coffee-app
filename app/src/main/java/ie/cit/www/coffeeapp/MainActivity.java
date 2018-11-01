package ie.cit.www.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Order order = new Order();

        EditText customerTxt = findViewById(R.id.edit_text_name);

        Button incrementBtn = findViewById(R.id.button_increment);
        Button decrementBtn = findViewById(R.id.button_decrement);
        Button orderBtn = findViewById(R.id.button_send_order);

        CheckBox whippedCb = findViewById(R.id.cb_whipped_cream);
        CheckBox chocolateCb = findViewById(R.id.cb_whipped_cream);

        TextView quantityTxt = findViewById(R.id.tv_quantity_coffee);
        quantityTxt.setText(order.getQuantity() + "");
        TextView orderSummaryTxt = findViewById(R.id.tv_order_summary);
        TextView orderTotalTxt = findViewById(R.id.tv_order_total);

        incrementBtn.setOnClickListener((event) -> {
            order.increaseQuantity();
            quantityTxt.setText(String.valueOf(order.getQuantity()));
        });
        decrementBtn.setOnClickListener((event) -> {
            order.decreaseQuantity();
            quantityTxt.setText(String.valueOf(order.getQuantity()));
        });
    }
}
