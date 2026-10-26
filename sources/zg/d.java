package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class d extends FrameLayout {
    public final u6 f52865a;
    public final TextView f52866b;

    public d(Context context, u6 u6Var) {
        super(context);
        int i10;
        this.f52865a = u6Var;
        f7.i(y6.f23376e7, this, u6Var);
        TextView textView = new TextView(getContext());
        this.f52866b = textView;
        ic.a.o(14.0f, 1, textView);
        f7.V(textView, y6.f7, u6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, gb1.h(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f52866b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        f7.V(this.f52866b, i10, this.f52865a);
    }
}
