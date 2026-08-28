package qh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class n0 implements c1 {
    public final q0 f46526a;

    public n0(q0 q0Var) {
        this.f46526a = q0Var;
    }

    @Override
    public final boolean A(d1 d1Var) {
        q0 q0Var = this.f46526a;
        if (q0Var.h != null && q0Var.f46625f != null && d1Var.length() == 0) {
            q0Var.h.a(q0Var.f46625f);
            return true;
        }
        return false;
    }

    @Override
    public final void B1(Editable editable) {
        q0 q0Var = this.f46526a;
        a aVar = q0Var.f46625f;
        if (aVar != null) {
            aVar.f46284s = true;
            aVar.f46283r = q0Var.d.A;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = u5.f(editable);
            }
        }
        w2 w2Var = q0Var.h;
        if (w2Var != null && q0Var.f46625f != null) {
            o3 o3Var = w2Var.f46773a;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            o3Var.f46565d3.onContentChanged();
        }
    }

    @Override
    public final void J0() {
        a aVar;
        q0 q0Var = this.f46526a;
        w2 w2Var = q0Var.h;
        if (w2Var != null && (aVar = q0Var.f46625f) != null) {
            w2Var.a(aVar);
        }
    }

    @Override
    public final void L0(d1 d1Var) {
        a aVar;
        o3 o3Var;
        ArrayList arrayList;
        int indexOf;
        q0 q0Var = this.f46526a;
        w2 w2Var = q0Var.h;
        if (w2Var != null && (aVar = q0Var.f46625f) != null && (indexOf = (arrayList = (o3Var = w2Var.f46773a).f46573h3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f46269b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                o3Var.U2.N(true);
            }
            int i9 = indexOf + 1;
            if (i9 < arrayList.size() && !((a) arrayList.get(i9)).f46274i && !o3.x3((a) arrayList.get(i9))) {
                o3Var.post(new i2(o3Var, (a) arrayList.get(i9), 24));
            }
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
        w2 w2Var = this.f46526a.h;
        if (w2Var != null) {
            o3 o3Var = w2Var.f46773a;
            o3.M1(o3Var, d1Var);
            o3Var.f46565d3.f1(d1Var, true);
        }
    }

    @Override
    public final void h1(CharSequence charSequence) {
        w2 w2Var = this.f46526a.h;
        if (w2Var != null && charSequence != null && charSequence.length() > 0) {
            w2Var.f46773a.t4(charSequence.toString());
        }
    }

    @Override
    public final void k1(d1 d1Var, int i9, int i10) {
        w2 w2Var;
        n9 textSelectionHelper;
        q0 q0Var = this.f46526a;
        if (!q0Var.f46626n && i9 != i10 && (w2Var = q0Var.h) != null && (textSelectionHelper = w2Var.f46773a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != q0Var) {
                q0Var.post(new mh.l4(this, d1Var, i10, textSelectionHelper, i9, 4));
            }
        }
    }

    @Override
    public final boolean p() {
        q0 q0Var = this.f46526a;
        w2 w2Var = q0Var.h;
        if (w2Var != null && q0Var.f46625f != null) {
            return w2Var.f46773a.S4();
        }
        return false;
    }

    @Override
    public final void E(int i9, int i10) {
    }
}
