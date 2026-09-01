package wh;

import android.text.Editable;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
public final class r5 implements d1 {
    public final v5 f50018a;

    public r5(v5 v5Var) {
        this.f50018a = v5Var;
    }

    @Override
    public final boolean D(e1 e1Var) {
        v5 v5Var = this.f50018a;
        v5Var.f50114f.r();
        e1 e1Var2 = v5Var.f50114f;
        e1Var2.setSelection(e1Var2.length());
        return true;
    }

    @Override
    public final void H(CharSequence charSequence) {
        s5 s5Var = this.f50018a.f50120y;
        if (s5Var != null) {
            a3 a3Var = (a3) s5Var;
            if (charSequence != null && charSequence.length() > 0) {
                a3Var.f49641a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public final void O(Editable editable) {
        v5 v5Var = this.f50018a;
        if (v5Var.f50119x != null) {
            v5Var.w();
            s5 s5Var = v5Var.f50120y;
            if (s5Var != null) {
                r3 r3Var = ((a3) s5Var).f49641a;
                d2 d2Var = r3Var.G3;
                if (d2Var != null) {
                    d2Var.g();
                }
                r3Var.f49980e3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = v5Var.f50119x.f49617b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                v5Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                v5Var.invalidate();
                int measuredWidth = v5Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (v5Var.h(measuredWidth, v5Var.getPaddingBottom() + v5Var.h.getMeasuredHeight() + v5Var.f50111b.getMeasuredHeight() + v5Var.getPaddingTop()) == v5Var.L) {
                        return;
                    }
                }
                v5Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean T(boolean z4) {
        return false;
    }

    @Override
    public final void c(e1 e1Var) {
        s5 s5Var = this.f50018a.f50120y;
        if (s5Var != null) {
            r3 r3Var = ((a3) s5Var).f49641a;
            r3.M1(r3Var, e1Var);
            r3Var.f49980e3.h(e1Var, true);
        }
    }

    @Override
    public final boolean e() {
        v5 v5Var = this.f50018a;
        s5 s5Var = v5Var.f50120y;
        if (s5Var != null && v5Var.f50119x != null) {
            return ((a3) s5Var).f49641a.S4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        d2 d2Var;
        v5 v5Var = this.f50018a;
        s5 s5Var = v5Var.f50120y;
        if (s5Var != null && v5Var.f50119x != null && (d2Var = ((a3) s5Var).f49641a.G3) != null) {
            d2Var.f(i10, i11);
        }
    }

    @Override
    public final void o(e1 e1Var) {
        a aVar;
        v5 v5Var = this.f50018a;
        s5 s5Var = v5Var.f50120y;
        if (s5Var != null && (aVar = v5Var.f50119x) != null) {
            r3.P1(((a3) s5Var).f49641a, aVar);
        }
    }

    @Override
    public final boolean r(e1 e1Var) {
        return false;
    }

    @Override
    public final void s(e1 e1Var, int i10, int i11) {
        s5 s5Var;
        m9 textSelectionHelper;
        v5 v5Var = this.f50018a;
        if (!v5Var.f50115n && i10 != i11 && (s5Var = v5Var.f50120y) != null && (textSelectionHelper = ((a3) s5Var).f49641a.getTextSelectionHelper()) != null) {
            e1Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 8));
        }
    }

    @Override
    public final void v() {
    }
}
