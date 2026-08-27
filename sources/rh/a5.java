package rh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;

public final class a5 implements c1 {

    public final j5 f47053a;

    public final g5 f47054b;

    public a5(g5 g5Var, j5 j5Var) {
        this.f47054b = g5Var;
        this.f47053a = j5Var;
    }

    @Override
    public final void B(int i10, int i11) {
        b2 b2Var;
        g5 g5Var = this.f47054b;
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.f47594a == null || (b2Var = w2Var.f47536a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override
    public final void N1(final d1 d1Var, final int i10, final int i11) {
        w2 w2Var;
        final j9 textSelectionHelper;
        final int iK;
        g5 g5Var = this.f47054b;
        if (g5Var.C || i10 == i11 || (w2Var = g5Var.A) == null || (textSelectionHelper = w2Var.f47536a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == g5Var) && (iK = g5Var.k(this.f47053a.f47227b)) >= 0) {
            g5Var.post(new Runnable() {
                @Override
                public final void run() {
                    g5 g5Var2 = this.f47630a.f47054b;
                    d1 d1Var2 = d1Var;
                    int length = d1Var2.length();
                    int i12 = i11;
                    if (length < i12 || d1Var2.getSelectionStart() == d1Var2.getSelectionEnd() || !textSelectionHelper.k0(g5Var2, iK, i10, i12)) {
                        return;
                    }
                    g5Var2.C = true;
                    d1Var2.setSelection(i12);
                    g5Var2.C = false;
                }
            });
        }
    }

    @Override
    public final boolean T1(boolean z10) {
        return this.f47054b.s(this.f47053a, z10);
    }

    @Override
    public final boolean f1(d1 d1Var) {
        return false;
    }

    @Override
    public final void g(d1 d1Var) {
        w2 w2Var = this.f47054b.A;
        if (w2Var != null) {
            p3 p3Var = w2Var.f47536a;
            p3.M1(p3Var, d1Var);
            p3Var.f47340d3.n0(d1Var, true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence) {
        w2 w2Var = this.f47054b.A;
        if (w2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        w2Var.f47536a.t4(charSequence.toString());
    }

    @Override
    public final boolean n() {
        g5 g5Var = this.f47054b;
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.f47594a == null) {
            return false;
        }
        return w2Var.f47536a.S4();
    }

    @Override
    public final boolean o0(d1 d1Var) {
        return false;
    }

    @Override
    public final void r1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f47053a.f47227b;
        if (pagetablecell != null) {
            x5.d(pagetablecell, editable);
        }
        g5 g5Var = this.f47054b;
        g5Var.v.requestLayout();
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.f47594a == null) {
            return;
        }
        w2Var.a();
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void w1(d1 d1Var) {
    }
}
