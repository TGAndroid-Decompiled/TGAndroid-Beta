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
    public final e6 f45760a;
    public final TextView f45761b;

    public d(Context context, e6 e6Var) {
        super(context);
        int i10;
        this.f45760a = e6Var;
        setBackgroundColor(i6.v0(i6.e7, e6Var));
        TextView textView = new TextView(getContext());
        this.f45761b = textView;
        e2.l(14.0f, 1, textView);
        textView.setTextColor(i6.v0(i6.f7, e6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, x5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f45761b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f45761b.setTextColor(i6.v0(i10, this.f45760a));
    }
}
