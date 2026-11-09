package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import c8.ka;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.wp;
public final class u2 extends TextView {
    public final wp f60558a;
    public final int f60559b;
    public final boolean f60560c;

    public u2(Context context, g6 g6Var, boolean z9) {
        super(context);
        this.f60560c = z9;
        if (z9) {
            s6.U(this, l6.G6, g6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.f60559b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = l6.f28259y8;
            int w02 = l6.w0(i7, g6Var);
            s6.U(this, i7, g6Var);
            org.telegram.ui.Cells.y b02 = l6.b0(l6.r1(0.08f, w02), l6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            o6 K = s6.K(0.08f, i7);
            o6 K2 = s6.K(0.15f, i7);
            setBackground(b02);
            s6.j(this, b02, K, K2, g6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.f60559b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z9) {
            ka.a(this);
        }
        wp wpVar = new wp(2131230873, 0);
        this.f60558a = wpVar;
        wpVar.G = 0.8f;
        wpVar.f40120r = 0.0f;
        wpVar.f40121s = org.telegram.messenger.g0.L(1.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f60559b, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f60560c && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setSorting(zh.b3 r7) {
        throw new UnsupportedOperationException("Method not decompiled: zh.u2.setSorting(zh.b3):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f60558a, append.length() - 1, length, 33);
        setText(append);
    }
}
