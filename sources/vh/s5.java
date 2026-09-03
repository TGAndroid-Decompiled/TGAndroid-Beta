package vh;

import android.text.Editable;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l9;
public final class s5 implements d1 {
    public final w5 f46246a;

    public s5(w5 w5Var) {
        this.f46246a = w5Var;
    }

    @Override
    public final void Q0(CharSequence charSequence) {
        t5 t5Var = this.f46246a.f46347y;
        if (t5Var != null) {
            b3 b3Var = (b3) t5Var;
            if (charSequence != null && charSequence.length() > 0) {
                b3Var.f45897a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean V0(e1 e1Var) {
        return false;
    }

    @Override
    public final void c(e1 e1Var) {
        t5 t5Var = this.f46246a.f46347y;
        if (t5Var != null) {
            s3 s3Var = ((b3) t5Var).f45897a;
            s3.L1(s3Var, e1Var);
            s3Var.f46209e3.d(e1Var, true);
        }
    }

    @Override
    public final void g1(e1 e1Var) {
        a aVar;
        w5 w5Var = this.f46246a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var != null && (aVar = w5Var.f46346x) != null) {
            s3.O1(((b3) t5Var).f45897a, aVar);
        }
    }

    @Override
    public final boolean h() {
        w5 w5Var = this.f46246a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var != null && w5Var.f46346x != null) {
            return ((b3) t5Var).f45897a.R4();
        }
        return false;
    }

    @Override
    public final boolean h0(e1 e1Var) {
        w5 w5Var = this.f46246a;
        w5Var.f46341f.r();
        e1 e1Var2 = w5Var.f46341f;
        e1Var2.setSelection(e1Var2.length());
        return true;
    }

    @Override
    public final void l1(Editable editable) {
        w5 w5Var = this.f46246a;
        if (w5Var.f46346x != null) {
            w5Var.w();
            t5 t5Var = w5Var.f46347y;
            if (t5Var != null) {
                s3 s3Var = ((b3) t5Var).f45897a;
                d2 d2Var = s3Var.G3;
                if (d2Var != null) {
                    d2Var.g();
                }
                s3Var.f46209e3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = w5Var.f46346x.f45853b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                w5Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                w5Var.invalidate();
                int measuredWidth = w5Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (w5Var.h(measuredWidth, w5Var.getPaddingBottom() + w5Var.h.getMeasuredHeight() + w5Var.f46339b.getMeasuredHeight() + w5Var.getPaddingTop()) == w5Var.L) {
                        return;
                    }
                }
                w5Var.requestLayout();
            }
        }
    }

    @Override
    public final void n1(e1 e1Var, int i10, int i11) {
        t5 t5Var;
        l9 textSelectionHelper;
        w5 w5Var = this.f46246a;
        if (!w5Var.f46342n && i10 != i11 && (t5Var = w5Var.f46347y) != null && (textSelectionHelper = ((b3) t5Var).f45897a.getTextSelectionHelper()) != null) {
            e1Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 8));
        }
    }

    @Override
    public final void r(int i10, int i11) {
        d2 d2Var;
        w5 w5Var = this.f46246a;
        t5 t5Var = w5Var.f46347y;
        if (t5Var != null && w5Var.f46346x != null && (d2Var = ((b3) t5Var).f45897a.G3) != null) {
            d2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean w1(boolean z4) {
        return false;
    }

    @Override
    public final void q0() {
    }
}
