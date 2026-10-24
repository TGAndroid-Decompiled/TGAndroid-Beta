package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class d extends FrameLayout {
    public final g6 f50586a;
    public final TextView f50587b;

    public d(Context context, g6 g6Var) {
        super(context);
        int i10;
        this.f50586a = g6Var;
        r6.i(k6.e7, this, g6Var);
        TextView textView = new TextView(getContext());
        this.f50587b = textView;
        k3.m(14.0f, 1, textView);
        r6.W(textView, k6.f7, g6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f50587b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        r6.W(this.f50587b, i10, this.f50586a);
    }
}
