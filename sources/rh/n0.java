package rh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;

public final class n0 implements c1 {

    public final q0 f47288a;

    public n0(q0 q0Var) {
        this.f47288a = q0Var;
    }

    @Override
    public final void K0() {
        a aVar;
        q0 q0Var = this.f47288a;
        x2 x2Var = q0Var.h;
        if (x2Var == null || (aVar = q0Var.f47388f) == null) {
            return;
        }
        x2Var.a(aVar);
    }

    @Override
    public final void N1(d1 d1Var, int i10, int i11) {
        x2 x2Var;
        j9 textSelectionHelper;
        q0 q0Var = this.f47288a;
        if (q0Var.f47389n || i10 == i11 || (x2Var = q0Var.h) == null || (textSelectionHelper = x2Var.f47583a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == q0Var) {
            return;
        }
        q0Var.post(new nh.j4(this, d1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override
    public final boolean T1(boolean z10) {
        return false;
    }

    @Override
    public final boolean f1(d1 d1Var) {
        q0 q0Var = this.f47288a;
        if (q0Var.h == null || q0Var.f47388f == null || d1Var.length() != 0) {
            return false;
        }
        q0Var.h.a(q0Var.f47388f);
        return true;
    }

    @Override
    public final void g(d1 d1Var) {
        x2 x2Var = this.f47288a.h;
        if (x2Var != null) {
            p3 p3Var = x2Var.f47583a;
            p3.M1(p3Var, d1Var);
            p3Var.f47340d3.n0(d1Var, true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence) {
        x2 x2Var = this.f47288a.h;
        if (x2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        x2Var.f47583a.t4(charSequence.toString());
    }

    @Override
    public final boolean n() {
        q0 q0Var = this.f47288a;
        x2 x2Var = q0Var.h;
        if (x2Var == null || q0Var.f47388f == null) {
            return false;
        }
        return x2Var.f47583a.S4();
    }

    @Override
    public final boolean o0(d1 d1Var) {
        return false;
    }

    @Override
    public final void r1(Editable editable) {
        q0 q0Var = this.f47288a;
        a aVar = q0Var.f47388f;
        if (aVar != null) {
            aVar.f47043s = true;
            aVar.f47042r = q0Var.d.A;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = v5.f(editable);
            }
        }
        x2 x2Var = q0Var.h;
        if (x2Var == null || q0Var.f47388f == null) {
            return;
        }
        p3 p3Var = x2Var.f47583a;
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.g();
        }
        p3Var.f47340d3.onContentChanged();
    }

    @Override
    public final void w1(d1 d1Var) {
        a aVar;
        p3 p3Var;
        ArrayList arrayList;
        int iIndexOf;
        q0 q0Var = this.f47288a;
        x2 x2Var = q0Var.h;
        if (x2Var == null || (aVar = q0Var.f47388f) == null || (iIndexOf = (arrayList = (p3Var = x2Var.f47583a).f47348h3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f47028b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            p3Var.U2.N(true);
        }
        int i10 = iIndexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).f47033i || p3.x3((a) arrayList.get(i10))) {
            return;
        }
        p3Var.post(new i2(p3Var, (a) arrayList.get(i10), 24));
    }

    @Override
    public final void B(int i10, int i11) {
    }
}
