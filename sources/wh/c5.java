package wh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
public final class c5 implements d1 {
    public final l5 f49690a;
    public final i5 f49691b;

    public c5(i5 i5Var, l5 l5Var) {
        this.f49691b = i5Var;
        this.f49690a = l5Var;
    }

    @Override
    public final boolean D(e1 e1Var) {
        return false;
    }

    @Override
    public final void H(CharSequence charSequence) {
        y2 y2Var = this.f49691b.B;
        if (y2Var != null && charSequence != null && charSequence.length() > 0) {
            y2Var.f50171a.t4(charSequence.toString());
        }
    }

    @Override
    public final void O(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f49690a.f49868b;
        if (pagetablecell != null) {
            z5.d(pagetablecell, editable);
        }
        i5 i5Var = this.f49691b;
        i5Var.v.requestLayout();
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f50175a != null) {
            y2Var.a();
        }
    }

    @Override
    public final boolean T(boolean z4) {
        return this.f49691b.s(this.f49690a, z4);
    }

    @Override
    public final void c(e1 e1Var) {
        y2 y2Var = this.f49691b.B;
        if (y2Var != null) {
            r3 r3Var = y2Var.f50171a;
            r3.M1(r3Var, e1Var);
            r3Var.f49980e3.h(e1Var, true);
        }
    }

    @Override
    public final boolean e() {
        i5 i5Var = this.f49691b;
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f50175a != null) {
            return y2Var.f50171a.S4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        d2 d2Var;
        i5 i5Var = this.f49691b;
        y2 y2Var = i5Var.B;
        if (y2Var != null && i5Var.f50175a != null && (d2Var = y2Var.f50171a.G3) != null) {
            d2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean r(e1 e1Var) {
        return false;
    }

    @Override
    public final void s(final e1 e1Var, final int i10, final int i11) {
        y2 y2Var;
        final m9 textSelectionHelper;
        final int k10;
        i5 i5Var = this.f49691b;
        if (!i5Var.D && i10 != i11 && (y2Var = i5Var.B) != null && (textSelectionHelper = y2Var.f50171a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != i5Var) && (k10 = i5Var.k(this.f49690a.f49868b)) >= 0) {
                i5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        i5 i5Var2 = c5.this.f49691b;
                        e1 e1Var2 = e1Var;
                        int length = e1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && e1Var2.getSelectionStart() != e1Var2.getSelectionEnd() && textSelectionHelper.k0(i5Var2, k10, i10, i12)) {
                            i5Var2.D = true;
                            e1Var2.setSelection(i12);
                            i5Var2.D = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void v() {
    }

    @Override
    public final void o(e1 e1Var) {
    }
}
