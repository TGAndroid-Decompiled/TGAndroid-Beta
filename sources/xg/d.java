package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import w7.x5;
public final class d extends FrameLayout {
    public final e6 f51131a;
    public final TextView f51132b;

    public d(Context context, e6 e6Var) {
        super(context);
        int i10;
        this.f51131a = e6Var;
        setBackgroundColor(i6.w0(i6.e7, e6Var));
        TextView textView = new TextView(getContext());
        this.f51132b = textView;
        e2.l(14.0f, 1, textView);
        textView.setTextColor(i6.w0(i6.f7, e6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, x5.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f51132b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f51132b.setTextColor(i6.w0(i10, this.f51131a));
    }
}
