package rh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;

public final class p5 implements c1 {

    public final t5 f47379a;

    public p5(t5 t5Var) {
        this.f47379a = t5Var;
    }

    @Override
    public final void B(int i10, int i11) {
        b2 b2Var;
        t5 t5Var = this.f47379a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var == null || t5Var.f47487x == null || (b2Var = ((y2) q5Var).f47605a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override
    public final void N1(d1 d1Var, int i10, int i11) {
        q5 q5Var;
        j9 textSelectionHelper;
        t5 t5Var = this.f47379a;
        if (t5Var.f47483n || i10 == i11 || (q5Var = t5Var.f47488y) == null || (textSelectionHelper = ((y2) q5Var).f47605a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new nh.j4(this, d1Var, i11, textSelectionHelper, i10, 8));
    }

    @Override
    public final boolean T1(boolean z10) {
        return false;
    }

    @Override
    public final boolean f1(d1 d1Var) {
        t5 t5Var = this.f47379a;
        t5Var.f47482f.r();
        d1 d1Var2 = t5Var.f47482f;
        d1Var2.setSelection(d1Var2.length());
        return true;
    }

    @Override
    public final void g(d1 d1Var) {
        q5 q5Var = this.f47379a.f47488y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).f47605a;
            p3.M1(p3Var, d1Var);
            p3Var.f47340d3.n0(d1Var, true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence) {
        q5 q5Var = this.f47379a.f47488y;
        if (q5Var != null) {
            y2 y2Var = (y2) q5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            y2Var.f47605a.t4(charSequence.toString());
        }
    }

    @Override
    public final boolean n() {
        t5 t5Var = this.f47379a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var == null || t5Var.f47487x == null) {
            return false;
        }
        return ((y2) q5Var).f47605a.S4();
    }

    @Override
    public final boolean o0(d1 d1Var) {
        return false;
    }

    @Override
    public final void r1(Editable editable) {
        t5 t5Var = this.f47379a;
        if (t5Var.f47487x == null) {
            return;
        }
        t5Var.w();
        q5 q5Var = t5Var.f47488y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).f47605a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.f47340d3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = t5Var.f47487x.f47028b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            t5Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            t5Var.invalidate();
            int measuredWidth = t5Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (t5Var.h(measuredWidth, t5Var.getPaddingBottom() + t5Var.h.getMeasuredHeight() + t5Var.f47479b.getMeasuredHeight() + t5Var.getPaddingTop()) == t5Var.K) {
                    return;
                }
            }
            t5Var.requestLayout();
        }
    }

    @Override
    public final void w1(d1 d1Var) {
        a aVar;
        t5 t5Var = this.f47379a;
        q5 q5Var = t5Var.f47488y;
        if (q5Var == null || (aVar = t5Var.f47487x) == null) {
            return;
        }
        p3.P1(((y2) q5Var).f47605a, aVar);
    }

    @Override
    public final void K0() {
    }
}
