package zh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.zg0;
public final class u2 extends LinearLayout {
    public final TextView f60451a;

    public u2(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        l9 l9Var = new l9(context);
        l9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        addView(l9Var, ha.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f60451a = textView;
        r6.V(textView, k6.A6, f6Var);
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
        this.f60451a.setText(charSequence);
    }
}
