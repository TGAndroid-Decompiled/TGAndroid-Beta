package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import c8.ka;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.wp;
public final class u2 extends TextView {
    public final wp f60570a;
    public final int f60571b;
    public final boolean f60572c;

    public u2(Context context, h6 h6Var, boolean z9) {
        super(context);
        this.f60572c = z9;
        if (z9) {
            t6.U(this, m6.G6, h6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.f60571b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = m6.f28284y8;
            int w02 = m6.w0(i7, h6Var);
            t6.U(this, i7, h6Var);
            org.telegram.ui.Cells.y b02 = m6.b0(m6.r1(0.08f, w02), m6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            p6 K = t6.K(0.08f, i7);
            p6 K2 = t6.K(0.15f, i7);
            setBackground(b02);
            t6.j(this, b02, K, K2, h6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.f60571b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z9) {
            ka.a(this);
        }
        wp wpVar = new wp(2131230873, 0);
        this.f60570a = wpVar;
        wpVar.G = 0.8f;
        wpVar.f40038r = 0.0f;
        wpVar.f40039s = org.telegram.messenger.g0.L(1.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f60571b, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f60572c && super.onTouchEvent(motionEvent)) {
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
        append.setSpan(this.f60570a, append.length() - 1, length, 33);
        setText(append);
    }
}
