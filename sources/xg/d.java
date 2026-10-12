package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import w7.w5;
public final class d extends FrameLayout {
    public final c6 f51359a;
    public final TextView f51360b;

    public d(Context context, c6 c6Var) {
        super(context);
        int i10;
        this.f51359a = c6Var;
        setBackgroundColor(h6.w0(h6.e7, c6Var));
        TextView textView = new TextView(getContext());
        this.f51360b = textView;
        e2.l(14.0f, 1, textView);
        textView.setTextColor(h6.w0(h6.f7, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, w5.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f51360b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f51360b.setTextColor(h6.w0(i10, this.f51359a));
    }
}
