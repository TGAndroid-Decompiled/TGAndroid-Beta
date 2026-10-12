package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class j3 extends LinearLayout {
    public final TextView f48923a;

    public j3(Context context, c6 c6Var) {
        super(context);
        setOrientation(1);
        z9 z9Var = new z9(context);
        z9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        addView(z9Var, a6.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f48923a = textView;
        yh.n(g6.A6, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        addView(textView, a6.t(-1, -2, 7, 12, 12, 12, 24));
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
        this.f48923a.setText(charSequence);
    }
}
