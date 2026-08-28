package qh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class z4 implements c1 {
    public final i5 f46871a;
    public final f5 f46872b;

    public z4(f5 f5Var, i5 i5Var) {
        this.f46872b = f5Var;
        this.f46871a = i5Var;
    }

    @Override
    public final boolean A(d1 d1Var) {
        return false;
    }

    @Override
    public final void B1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f46871a.f46449b;
        if (pagetablecell != null) {
            w5.d(pagetablecell, editable);
        }
        f5 f5Var = this.f46872b;
        f5Var.v.requestLayout();
        v2 v2Var = f5Var.A;
        if (v2Var != null && f5Var.f46834a != null) {
            v2Var.a();
        }
    }

    @Override
    public final void E(int i9, int i10) {
        b2 b2Var;
        f5 f5Var = this.f46872b;
        v2 v2Var = f5Var.A;
        if (v2Var != null && f5Var.f46834a != null && (b2Var = v2Var.f46757a.F3) != null) {
            b2Var.f(i9, i10);
        }
    }

    @Override
    public final boolean T1(boolean z10) {
        return this.f46872b.s(this.f46871a, z10);
    }

    @Override
    public final boolean U1(d1 d1Var) {
        return false;
    }

    @Override
    public final void d(d1 d1Var) {
        v2 v2Var = this.f46872b.A;
        if (v2Var != null) {
            o3 o3Var = v2Var.f46757a;
            o3.M1(o3Var, d1Var);
            o3Var.f46565d3.f1(d1Var, true);
        }
    }

    @Override
    public final void h1(CharSequence charSequence) {
        v2 v2Var = this.f46872b.A;
        if (v2Var != null && charSequence != null && charSequence.length() > 0) {
            v2Var.f46757a.t4(charSequence.toString());
        }
    }

    @Override
    public final void k1(final d1 d1Var, final int i9, final int i10) {
        v2 v2Var;
        final n9 textSelectionHelper;
        final int k10;
        f5 f5Var = this.f46872b;
        if (!f5Var.C && i9 != i10 && (v2Var = f5Var.A) != null && (textSelectionHelper = v2Var.f46757a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != f5Var) && (k10 = f5Var.k(this.f46871a.f46449b)) >= 0) {
                f5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        f5 f5Var2 = z4.this.f46872b;
                        d1 d1Var2 = d1Var;
                        int length = d1Var2.length();
                        int i11 = i10;
                        if (length >= i11 && d1Var2.getSelectionStart() != d1Var2.getSelectionEnd() && textSelectionHelper.k0(f5Var2, k10, i9, i11)) {
                            f5Var2.C = true;
                            d1Var2.setSelection(i11);
                            f5Var2.C = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final boolean p() {
        f5 f5Var = this.f46872b;
        v2 v2Var = f5Var.A;
        if (v2Var != null && f5Var.f46834a != null) {
            return v2Var.f46757a.S4();
        }
        return false;
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void L0(d1 d1Var) {
    }
}
