package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.y5;
public final class d extends FrameLayout {
    public final d6 f46037a;
    public final TextView f46038b;

    public d(Context context, d6 d6Var) {
        super(context);
        int i10;
        this.f46037a = d6Var;
        setBackgroundColor(h6.v0(h6.e7, d6Var));
        TextView textView = new TextView(getContext());
        this.f46038b = textView;
        e2.l(14.0f, 1, textView);
        textView.setTextColor(h6.v0(h6.f7, d6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, y5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f46038b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f46038b.setTextColor(h6.v0(i10, this.f46037a));
    }
}
