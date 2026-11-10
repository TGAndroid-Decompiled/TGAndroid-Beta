package zh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.zg0;
public final class t2 extends LinearLayout {
    public final TextView f60553a;

    public t2(Context context, h6 h6Var) {
        super(context);
        setOrientation(1);
        k9 k9Var = new k9(context);
        k9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        addView(k9Var, ha.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f60553a = textView;
        t6.U(textView, m6.A6, h6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, ha.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }

    public void set(CharSequence charSequence) {
        this.f60553a.setText(charSequence);
    }
}
