package zh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y9;
public final class k3 extends LinearLayout {
    public final TextView f53088a;

    public k3(Context context, u6 u6Var) {
        super(context);
        setOrientation(1);
        y9 y9Var = new y9(context);
        y9Var.setImageDrawable(new xj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        addView(y9Var, gb1.x(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f53088a = textView;
        f7.V(textView, y6.A6, u6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, gb1.x(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
    }

    public void set(CharSequence charSequence) {
        this.f53088a.setText(charSequence);
    }
}
