package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.xj0;
import w7.z5;
public final class i3 extends LinearLayout {
    public final TextView f50758a;

    public i3(Context context, g6 g6Var) {
        super(context);
        setOrientation(1);
        u9 u9Var = new u9(context);
        u9Var.setImageDrawable(new xj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        addView(u9Var, z5.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f50758a = textView;
        r6.W(textView, k6.A6, g6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, z5.t(-1, -2, 7, 12, 12, 12, 24));
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
        this.f50758a.setText(charSequence);
    }
}
