package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.z5;
public final class d extends FrameLayout {
    public final c6 f48754a;
    public final TextView f48755b;

    public d(Context context, c6 c6Var) {
        super(context);
        int i10;
        this.f48754a = c6Var;
        setBackgroundColor(g6.w0(g6.e7, c6Var));
        TextView textView = new TextView(getContext());
        this.f48755b = textView;
        k3.m(14.0f, 1, textView);
        textView.setTextColor(g6.w0(g6.f7, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, z5.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f48755b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f48755b.setTextColor(g6.w0(i10, this.f48754a));
    }
}
