package th;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.o6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
public final class n0 implements c1 {
    public final q0 f48588a;

    public n0(q0 q0Var) {
        this.f48588a = q0Var;
    }

    @Override
    public final void S0(d1 d1Var) {
        a aVar;
        p3 p3Var;
        ArrayList arrayList;
        int indexOf;
        q0 q0Var = this.f48588a;
        x2 x2Var = q0Var.h;
        if (x2Var != null && (aVar = q0Var.f48686f) != null && (indexOf = (arrayList = (p3Var = x2Var.f48881a).f48646h3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f48328b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                p3Var.U2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f48333i && !p3.x3((a) arrayList.get(i10))) {
                p3Var.post(new i2(p3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void T0(d1 d1Var, int i10, int i11) {
        x2 x2Var;
        k9 textSelectionHelper;
        q0 q0Var = this.f48588a;
        if (!q0Var.f48687n && i10 != i11 && (x2Var = q0Var.h) != null && (textSelectionHelper = x2Var.f48881a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != q0Var) {
                q0Var.post(new o6(this, d1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public final void Z0(CharSequence charSequence) {
        x2 x2Var = this.f48588a.h;
        if (x2Var != null && charSequence != null && charSequence.length() > 0) {
            x2Var.f48881a.t4(charSequence.toString());
        }
    }

    @Override
    public final void e(d1 d1Var) {
        x2 x2Var = this.f48588a.h;
        if (x2Var != null) {
            p3 p3Var = x2Var.f48881a;
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
        q0 q0Var = this.f48588a;
        x2 x2Var = q0Var.h;
        if (x2Var != null && q0Var.f48686f != null) {
            return x2Var.f48881a.S4();
        }
        return false;
    }

    @Override
    public final void n1(Editable editable) {
        q0 q0Var = this.f48588a;
        a aVar = q0Var.f48686f;
        if (aVar != null) {
            aVar.f48343s = true;
            aVar.f48342r = q0Var.d.A;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = v5.f(editable);
            }
        }
        x2 x2Var = q0Var.h;
        if (x2Var != null && q0Var.f48686f != null) {
            p3 p3Var = x2Var.f48881a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.f48638d3.onContentChanged();
        }
    }

    @Override
    public final boolean r0(d1 d1Var) {
        q0 q0Var = this.f48588a;
        if (q0Var.h != null && q0Var.f48686f != null && d1Var.length() == 0) {
            q0Var.h.a(q0Var.f48686f);
            return true;
        }
        return false;
    }

    @Override
    public final boolean t1(boolean z10) {
        return false;
    }

    @Override
    public final void u0() {
        a aVar;
        q0 q0Var = this.f48588a;
        x2 x2Var = q0Var.h;
        if (x2Var != null && (aVar = q0Var.f48686f) != null) {
            x2Var.a(aVar);
        }
    }

    @Override
    public final void z(int i10, int i11) {
    }
}
