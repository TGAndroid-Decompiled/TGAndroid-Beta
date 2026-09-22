package xh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.rk;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.v9;
import w7.y5;
public final class l3 extends LinearLayout {
    public final TextView f46299a;

    public l3(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        v9 v9Var = new v9(context);
        v9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        addView(v9Var, y5.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f46299a = textView;
        rk.n(j6.A6, f6Var, textView, 1, 14.0f);
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
        this.f46299a.setText(charSequence);
    }
}
