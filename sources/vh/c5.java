package vh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
public final class c5 implements c1 {
    public final l5 f45840a;
    public final i5 f45841b;

    public c5(i5 i5Var, l5 l5Var) {
        this.f45841b = i5Var;
        this.f45840a = l5Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        y2 y2Var = this.f45841b.B;
        if (y2Var != null && charSequence != null && charSequence.length() > 0) {
            y2Var.f46324a.t4(charSequence.toString());
        }
    }

    @Override
    public final boolean F(d1 d1Var) {
        return false;
    }

    @Override
    public final void N(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f45840a.f46007b;
        if (pagetablecell != null) {
            z5.d(pagetablecell, editable);
        }
        i5 i5Var = this.f45841b;
        i5Var.v.requestLayout();
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f46283a != null) {
            y2Var.a();
        }
    }

    @Override
    public final void O(final d1 d1Var, final int i10, final int i11) {
        y2 y2Var;
        final m9 textSelectionHelper;
        final int k10;
        i5 i5Var = this.f45841b;
        if (!i5Var.D && i10 != i11 && (y2Var = i5Var.B) != null && (textSelectionHelper = y2Var.f46324a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != i5Var) && (k10 = i5Var.k(this.f45840a.f46007b)) >= 0) {
                i5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        i5 i5Var2 = c5.this.f45841b;
                        d1 d1Var2 = d1Var;
                        int length = d1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && d1Var2.getSelectionStart() != d1Var2.getSelectionEnd() && textSelectionHelper.k0(i5Var2, k10, i10, i12)) {
                            i5Var2.D = true;
                            d1Var2.setSelection(i12);
                            i5Var2.D = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final boolean R(boolean z4) {
        return this.f45841b.s(this.f45840a, z4);
    }

    @Override
    public final void c(d1 d1Var) {
        y2 y2Var = this.f45841b.B;
        if (y2Var != null) {
            r3 r3Var = y2Var.f46324a;
            r3.M1(r3Var, d1Var);
            r3Var.f46112e3.e(d1Var, true);
        }
    }

    @Override
    public final boolean d() {
        i5 i5Var = this.f45841b;
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f46283a != null) {
            return y2Var.f46324a.S4();
        }
        return false;
    }

    @Override
    public final void i(int i10, int i11) {
        c2 c2Var;
        i5 i5Var = this.f45841b;
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f46283a != null && (c2Var = y2Var.f46324a.G3) != null) {
            c2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean o(d1 d1Var) {
        return false;
    }

    @Override
    public final void r() {
    }

    @Override
    public final void G(d1 d1Var) {
    }
}
