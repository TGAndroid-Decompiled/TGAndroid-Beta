package zh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.l9;
public final class t2 extends LinearLayout {
    public final TextView f60544a;

    public t2(Context context, g6 g6Var) {
        super(context);
        setOrientation(1);
        l9 l9Var = new l9(context);
        l9Var.setImageDrawable(new ah0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        addView(l9Var, ha.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f60544a = textView;
        s6.U(textView, l6.A6, g6Var);
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
        this.f60544a.setText(charSequence);
    }
}
