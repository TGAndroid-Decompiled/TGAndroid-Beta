package vh;

import android.text.Editable;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
public final class r5 implements c1 {
    public final v5 f46149a;

    public r5(v5 v5Var) {
        this.f46149a = v5Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        s5 s5Var = this.f46149a.f46246y;
        if (s5Var != null) {
            a3 a3Var = (a3) s5Var;
            if (charSequence != null && charSequence.length() > 0) {
                a3Var.f45801a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean F(d1 d1Var) {
        return false;
    }

    @Override
    public final void G(d1 d1Var) {
        a aVar;
        v5 v5Var = this.f46149a;
        s5 s5Var = v5Var.f46246y;
        if (s5Var != null && (aVar = v5Var.f46245x) != null) {
            r3.P1(((a3) s5Var).f45801a, aVar);
        }
    }

    @Override
    public final void N(Editable editable) {
        v5 v5Var = this.f46149a;
        if (v5Var.f46245x != null) {
            v5Var.w();
            s5 s5Var = v5Var.f46246y;
            if (s5Var != null) {
                r3 r3Var = ((a3) s5Var).f45801a;
                c2 c2Var = r3Var.G3;
                if (c2Var != null) {
                    c2Var.g();
                }
                r3Var.f46112e3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = v5Var.f46245x.f45775b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                v5Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                v5Var.invalidate();
                int measuredWidth = v5Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (v5Var.h(measuredWidth, v5Var.getPaddingBottom() + v5Var.h.getMeasuredHeight() + v5Var.f46238b.getMeasuredHeight() + v5Var.getPaddingTop()) == v5Var.L) {
                        return;
                    }
                }
                v5Var.requestLayout();
            }
        }
    }

    @Override
    public final void O(d1 d1Var, int i10, int i11) {
        s5 s5Var;
        m9 textSelectionHelper;
        v5 v5Var = this.f46149a;
        if (!v5Var.f46241n && i10 != i11 && (s5Var = v5Var.f46246y) != null && (textSelectionHelper = ((a3) s5Var).f45801a.getTextSelectionHelper()) != null) {
            d1Var.post(new p6(this, d1Var, i11, textSelectionHelper, i10, 8));
        }
    }

    @Override
    public final boolean R(boolean z4) {
        return false;
    }

    @Override
    public final void c(d1 d1Var) {
        s5 s5Var = this.f46149a.f46246y;
        if (s5Var != null) {
            r3 r3Var = ((a3) s5Var).f45801a;
            r3.M1(r3Var, d1Var);
            r3Var.f46112e3.e(d1Var, true);
        }
    }

    @Override
    public final boolean d() {
        v5 v5Var = this.f46149a;
        s5 s5Var = v5Var.f46246y;
        if (s5Var != null && v5Var.f46245x != null) {
            return ((a3) s5Var).f45801a.S4();
        }
        return false;
    }

    @Override
    public final void i(int i10, int i11) {
        c2 c2Var;
        v5 v5Var = this.f46149a;
        s5 s5Var = v5Var.f46246y;
        if (s5Var != null && v5Var.f46245x != null && (c2Var = ((a3) s5Var).f45801a.G3) != null) {
            c2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean o(d1 d1Var) {
        v5 v5Var = this.f46149a;
        v5Var.f46240f.r();
        d1 d1Var2 = v5Var.f46240f;
        d1Var2.setSelection(d1Var2.length());
        return true;
    }

    @Override
    public final void r() {
    }
}
