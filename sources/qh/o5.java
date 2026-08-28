package qh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class o5 implements c1 {
    public final s5 f46604a;

    public o5(s5 s5Var) {
        this.f46604a = s5Var;
    }

    @Override
    public final boolean A(d1 d1Var) {
        s5 s5Var = this.f46604a;
        s5Var.f46704f.r();
        d1 d1Var2 = s5Var.f46704f;
        d1Var2.setSelection(d1Var2.length());
        return true;
    }

    @Override
    public final void B1(Editable editable) {
        s5 s5Var = this.f46604a;
        if (s5Var.f46709x != null) {
            s5Var.w();
            p5 p5Var = s5Var.f46710y;
            if (p5Var != null) {
                o3 o3Var = ((x2) p5Var).f46827a;
                b2 b2Var = o3Var.F3;
                if (b2Var != null) {
                    b2Var.g();
                }
                o3Var.f46565d3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = s5Var.f46709x.f46269b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                s5Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                s5Var.invalidate();
                int measuredWidth = s5Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (s5Var.h(measuredWidth, s5Var.getPaddingBottom() + s5Var.h.getMeasuredHeight() + s5Var.f46701b.getMeasuredHeight() + s5Var.getPaddingTop()) == s5Var.K) {
                        return;
                    }
                }
                s5Var.requestLayout();
            }
        }
    }

    @Override
    public final void E(int i9, int i10) {
        b2 b2Var;
        s5 s5Var = this.f46604a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var != null && s5Var.f46709x != null && (b2Var = ((x2) p5Var).f46827a.F3) != null) {
            b2Var.f(i9, i10);
        }
    }

    @Override
    public final void L0(d1 d1Var) {
        a aVar;
        s5 s5Var = this.f46604a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var != null && (aVar = s5Var.f46709x) != null) {
            o3.P1(((x2) p5Var).f46827a, aVar);
        }
    }

    @Override
    public final boolean T1(boolean z10) {
        return false;
    }

    @Override
    public final boolean U1(d1 d1Var) {
        return false;
    }

    @Override
    public final void d(d1 d1Var) {
        p5 p5Var = this.f46604a.f46710y;
        if (p5Var != null) {
            o3 o3Var = ((x2) p5Var).f46827a;
            o3.M1(o3Var, d1Var);
            o3Var.f46565d3.f1(d1Var, true);
        }
    }

    @Override
    public final void h1(CharSequence charSequence) {
        p5 p5Var = this.f46604a.f46710y;
        if (p5Var != null) {
            x2 x2Var = (x2) p5Var;
            if (charSequence != null && charSequence.length() > 0) {
                x2Var.f46827a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public final void k1(d1 d1Var, int i9, int i10) {
        p5 p5Var;
        n9 textSelectionHelper;
        s5 s5Var = this.f46604a;
        if (!s5Var.f46705n && i9 != i10 && (p5Var = s5Var.f46710y) != null && (textSelectionHelper = ((x2) p5Var).f46827a.getTextSelectionHelper()) != null) {
            d1Var.post(new mh.l4(this, d1Var, i10, textSelectionHelper, i9, 8));
        }
    }

    @Override
    public final boolean p() {
        s5 s5Var = this.f46604a;
        p5 p5Var = s5Var.f46710y;
        if (p5Var != null && s5Var.f46709x != null) {
            return ((x2) p5Var).f46827a.S4();
        }
        return false;
    }

    @Override
    public final void J0() {
    }
}
