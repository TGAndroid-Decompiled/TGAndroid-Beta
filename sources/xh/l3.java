package xh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class l3 extends LinearLayout {
    public final TextView f46259a;

    public l3(Context context, d6 d6Var) {
        super(context);
        setOrientation(1);
        w9 w9Var = new w9(context);
        w9Var.setImageDrawable(new ij0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        addView(w9Var, y5.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f46259a = textView;
        ok.n(h6.A6, d6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        addView(textView, y5.t(-1, -2, 7, 12, 12, 12, 24));
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
        this.f46259a.setText(charSequence);
    }
}
