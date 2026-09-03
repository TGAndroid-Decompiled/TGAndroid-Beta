package vh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l9;
public final class d5 implements d1 {
    public final m5 f45937a;
    public final j5 f45938b;

    public d5(j5 j5Var, m5 m5Var) {
        this.f45938b = j5Var;
        this.f45937a = m5Var;
    }

    @Override
    public final void Q0(CharSequence charSequence) {
        z2 z2Var = this.f45938b.B;
        if (z2Var != null && charSequence != null && charSequence.length() > 0) {
            z2Var.f46422a.s4(charSequence.toString());
        }
    }

    @Override
    public final boolean V0(e1 e1Var) {
        return false;
    }

    @Override
    public final void c(e1 e1Var) {
        z2 z2Var = this.f45938b.B;
        if (z2Var != null) {
            s3 s3Var = z2Var.f46422a;
            s3.L1(s3Var, e1Var);
            s3Var.f46209e3.d(e1Var, true);
        }
    }

    @Override
    public final boolean h() {
        j5 j5Var = this.f45938b;
        z2 z2Var = j5Var.B;
        if (z2Var != null && j5Var.f46414a != null) {
            return z2Var.f46422a.R4();
        }
        return false;
    }

    @Override
    public final boolean h0(e1 e1Var) {
        return false;
    }

    @Override
    public final void l1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f45937a.f46104b;
        if (pagetablecell != null) {
            a6.d(pagetablecell, editable);
        }
        j5 j5Var = this.f45938b;
        j5Var.v.requestLayout();
        z2 z2Var = j5Var.B;
        if (z2Var != null && j5Var.f46414a != null) {
            z2Var.a();
        }
    }

    @Override
    public final void n1(final e1 e1Var, final int i10, final int i11) {
        z2 z2Var;
        final l9 textSelectionHelper;
        final int k10;
        j5 j5Var = this.f45938b;
        if (!j5Var.D && i10 != i11 && (z2Var = j5Var.B) != null && (textSelectionHelper = z2Var.f46422a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != j5Var) && (k10 = j5Var.k(this.f45937a.f46104b)) >= 0) {
                j5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        j5 j5Var2 = d5.this.f45938b;
                        e1 e1Var2 = e1Var;
                        int length = e1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && e1Var2.getSelectionStart() != e1Var2.getSelectionEnd() && textSelectionHelper.k0(j5Var2, k10, i10, i12)) {
                            j5Var2.D = true;
                            e1Var2.setSelection(i12);
                            j5Var2.D = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void r(int i10, int i11) {
        d2 d2Var;
        j5 j5Var = this.f45938b;
        z2 z2Var = j5Var.B;
        if (z2Var != null && j5Var.f46414a != null && (d2Var = z2Var.f46422a.G3) != null) {
            d2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean w1(boolean z4) {
        return this.f45938b.s(this.f45937a, z4);
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void g1(e1 e1Var) {
    }
}
