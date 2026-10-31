package qg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public final class d extends FrameLayout {
    public final p6 f45529a;
    public final TextView f45530b;

    public d(Context context, p6 p6Var) {
        super(context);
        int i10;
        this.f45529a = p6Var;
        a7.i(t6.e7, this, p6Var);
        TextView textView = new TextView(getContext());
        this.f45530b = textView;
        sc.e.t(textView, 1, 14.0f);
        a7.V(textView, t6.f7, p6Var);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, b6.d(-1, -1.0f, (cd.X ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f45530b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        a7.V(this.f45530b, i10, this.f45529a);
    }
}
