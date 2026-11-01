package ph;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.g9;
import w7.b6;
public final class y2 extends LinearLayout {
    public final TextView f45370a;

    public y2(Context context, p6 p6Var) {
        super(context);
        setOrientation(1);
        g9 g9Var = new g9(context);
        g9Var.setImageDrawable(new ci0(2131624317, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
        addView(g9Var, b6.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f45370a = textView;
        a7.V(textView, t6.A6, p6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, b6.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.i0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
    }

    public void set(CharSequence charSequence) {
        this.f45370a.setText(charSequence);
    }
}
