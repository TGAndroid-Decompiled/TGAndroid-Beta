package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public final class d extends FrameLayout {
    public final f6 f43989a;
    public final TextView f43990b;

    public d(Context context, f6 f6Var) {
        super(context);
        int i10;
        this.f43989a = f6Var;
        setBackgroundColor(j6.v0(j6.e7, f6Var));
        TextView textView = new TextView(getContext());
        this.f43990b = textView;
        e2.k(14.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.f7, f6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, a6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f43990b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f43990b.setTextColor(j6.v0(i10, this.f43989a));
    }
}
