package th;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
public final class a5 implements c1 {
    public final j5 f48353a;
    public final g5 f48354b;

    public a5(g5 g5Var, j5 j5Var) {
        this.f48354b = g5Var;
        this.f48353a = j5Var;
    }

    @Override
    public final void T0(final d1 d1Var, final int i10, final int i11) {
        w2 w2Var;
        final k9 textSelectionHelper;
        final int k9;
        g5 g5Var = this.f48354b;
        if (!g5Var.C && i10 != i11 && (w2Var = g5Var.A) != null && (textSelectionHelper = w2Var.f48834a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != g5Var) && (k9 = g5Var.k(this.f48353a.f48527b)) >= 0) {
                g5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        g5 g5Var2 = a5.this.f48354b;
                        d1 d1Var2 = d1Var;
                        int length = d1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && d1Var2.getSelectionStart() != d1Var2.getSelectionEnd() && textSelectionHelper.k0(g5Var2, k9, i10, i12)) {
                            g5Var2.C = true;
                            d1Var2.setSelection(i12);
                            g5Var2.C = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void Z0(CharSequence charSequence) {
        w2 w2Var = this.f48354b.A;
        if (w2Var != null && charSequence != null && charSequence.length() > 0) {
            w2Var.f48834a.t4(charSequence.toString());
        }
    }

    @Override
    public final void e(d1 d1Var) {
        w2 w2Var = this.f48354b.A;
        if (w2Var != null) {
            p3 p3Var = w2Var.f48834a;
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
        g5 g5Var = this.f48354b;
        w2 w2Var = g5Var.A;
        if (w2Var != null && g5Var.f48892a != null) {
            return w2Var.f48834a.S4();
        }
        return false;
    }

    @Override
    public final void n1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f48353a.f48527b;
        if (pagetablecell != null) {
            x5.d(pagetablecell, editable);
        }
        g5 g5Var = this.f48354b;
        g5Var.v.requestLayout();
        w2 w2Var = g5Var.A;
        if (w2Var != null && g5Var.f48892a != null) {
            w2Var.a();
        }
    }

    @Override
    public final boolean r0(d1 d1Var) {
        return false;
    }

    @Override
    public final boolean t1(boolean z10) {
        return this.f48354b.s(this.f48353a, z10);
    }

    @Override
    public final void z(int i10, int i11) {
        b2 b2Var;
        g5 g5Var = this.f48354b;
        w2 w2Var = g5Var.A;
        if (w2Var != null && g5Var.f48892a != null && (b2Var = w2Var.f48834a.F3) != null) {
            b2Var.f(i10, i11);
        }
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void S0(d1 d1Var) {
    }
}
