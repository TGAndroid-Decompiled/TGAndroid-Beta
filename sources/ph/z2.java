package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.dq;
import w7.e6;
public final class z2 extends TextView {
    public final dq f45399a;

    public z2(Context context, p6 p6Var) {
        super(context);
        int i10 = t6.f21314y8;
        int w02 = t6.w0(i10, p6Var);
        a7.V(this, i10, p6Var);
        org.telegram.ui.Cells.y b02 = t6.b0(t6.r1(0.08f, w02), t6.r1(0.15f, w02), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f));
        w6 L = a7.L(0.08f, i10);
        w6 L2 = a7.L(0.15f, i10);
        setBackground(b02);
        a7.k(this, b02, L, L2, p6Var);
        setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), 0);
        setGravity(17);
        setTypeface(org.telegram.messenger.i0.o());
        e6.a(this);
        dq dqVar = new dq(2131230873, 0);
        this.f45399a = dqVar;
        dqVar.G = 0.8f;
        dqVar.f25568r = 0.0f;
        dqVar.f25569s = org.telegram.messenger.i0.L(1.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(26.0f), 1073741824));
    }

    public void setSorting(ph.g3 r7) {
        throw new UnsupportedOperationException("Method not decompiled: ph.z2.setSorting(ph.g3):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f45399a, append.length() - 1, length, 33);
        setText(append);
    }
}
