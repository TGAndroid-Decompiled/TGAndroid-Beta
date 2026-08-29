package th;

import android.text.Editable;
import org.telegram.messenger.o6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
public final class p5 implements c1 {
    public final t5 f48677a;

    public p5(t5 t5Var) {
        this.f48677a = t5Var;
    }

    @Override
    public final void S0(d1 d1Var) {
        a aVar;
        t5 t5Var = this.f48677a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var != null && (aVar = t5Var.f48785x) != null) {
            p3.P1(((y2) q5Var).f48903a, aVar);
        }
    }

    @Override
    public final void T0(d1 d1Var, int i10, int i11) {
        q5 q5Var;
        k9 textSelectionHelper;
        t5 t5Var = this.f48677a;
        if (!t5Var.f48781n && i10 != i11 && (q5Var = t5Var.f48786y) != null && (textSelectionHelper = ((y2) q5Var).f48903a.getTextSelectionHelper()) != null) {
            d1Var.post(new o6(this, d1Var, i11, textSelectionHelper, i10, 8));
        }
    }

    @Override
    public final void Z0(CharSequence charSequence) {
        q5 q5Var = this.f48677a.f48786y;
        if (q5Var != null) {
            y2 y2Var = (y2) q5Var;
            if (charSequence != null && charSequence.length() > 0) {
                y2Var.f48903a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public final void e(d1 d1Var) {
        q5 q5Var = this.f48677a.f48786y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).f48903a;
            p3.M1(p3Var, d1Var);
            p3Var.f48638d3.U(d1Var, true);
        }
    }

    @Override
    public final boolean i1(d1 d1Var) {
        return false;
    }

    @Override
    public final boolean m() {
        t5 t5Var = this.f48677a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var != null && t5Var.f48785x != null) {
            return ((y2) q5Var).f48903a.S4();
        }
        return false;
    }

    @Override
    public final void n1(Editable editable) {
        t5 t5Var = this.f48677a;
        if (t5Var.f48785x != null) {
            t5Var.w();
            q5 q5Var = t5Var.f48786y;
            if (q5Var != null) {
                p3 p3Var = ((y2) q5Var).f48903a;
                b2 b2Var = p3Var.F3;
                if (b2Var != null) {
                    b2Var.g();
                }
                p3Var.f48638d3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = t5Var.f48785x.f48328b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                t5Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                t5Var.invalidate();
                int measuredWidth = t5Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (t5Var.h(measuredWidth, t5Var.getPaddingBottom() + t5Var.h.getMeasuredHeight() + t5Var.f48777b.getMeasuredHeight() + t5Var.getPaddingTop()) == t5Var.K) {
                        return;
                    }
                }
                t5Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean r0(d1 d1Var) {
        t5 t5Var = this.f48677a;
        t5Var.f48780f.r();
        d1 d1Var2 = t5Var.f48780f;
        d1Var2.setSelection(d1Var2.length());
        return true;
    }

    @Override
    public final boolean t1(boolean z10) {
        return false;
    }

    @Override
    public final void z(int i10, int i11) {
        b2 b2Var;
        t5 t5Var = this.f48677a;
        q5 q5Var = t5Var.f48786y;
        if (q5Var != null && t5Var.f48785x != null && (b2Var = ((y2) q5Var).f48903a.F3) != null) {
            b2Var.f(i10, i11);
        }
    }

    @Override
    public final void u0() {
    }
}
