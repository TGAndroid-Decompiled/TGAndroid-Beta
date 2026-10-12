package xh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.y9;
import w7.w5;
public final class k3 extends LinearLayout {
    public final TextView f51552a;

    public k3(Context context, c6 c6Var) {
        super(context);
        setOrientation(1);
        y9 y9Var = new y9(context);
        y9Var.setImageDrawable(new fk0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        addView(y9Var, w5.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f51552a = textView;
        am.o(h6.A6, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        addView(textView, w5.t(-1, -2, 7, 12, 12, 12, 24));
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
        this.f51552a.setText(charSequence);
    }
}
