package vh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
public final class n0 implements c1 {
    public final q0 f46022a;

    public n0(q0 q0Var) {
        this.f46022a = q0Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        z2 z2Var = this.f46022a.h;
        if (z2Var != null && charSequence != null && charSequence.length() > 0) {
            z2Var.f46334a.t4(charSequence.toString());
        }
    }

    @Override
    public final boolean F(d1 d1Var) {
        return false;
    }

    @Override
    public final void G(d1 d1Var) {
        a aVar;
        r3 r3Var;
        ArrayList arrayList;
        int indexOf;
        q0 q0Var = this.f46022a;
        z2 z2Var = q0Var.h;
        if (z2Var != null && (aVar = q0Var.f46081f) != null && (indexOf = (arrayList = (r3Var = z2Var.f46334a).f46120i3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f45775b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                r3Var.V2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f45779i && !r3.x3((a) arrayList.get(i10))) {
                r3Var.post(new j2(r3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void N(Editable editable) {
        q0 q0Var = this.f46022a;
        a aVar = q0Var.f46081f;
        if (aVar != null) {
            aVar.f45789s = true;
            aVar.f45788r = q0Var.d.B;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45775b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = x5.f(editable);
            }
        }
        z2 z2Var = q0Var.h;
        if (z2Var != null && q0Var.f46081f != null) {
            r3 r3Var = z2Var.f46334a;
            c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.g();
            }
            r3Var.f46112e3.onContentChanged();
        }
    }

    @Override
    public final void O(d1 d1Var, int i10, int i11) {
        z2 z2Var;
        m9 textSelectionHelper;
        q0 q0Var = this.f46022a;
        if (!q0Var.f46082n && i10 != i11 && (z2Var = q0Var.h) != null && (textSelectionHelper = z2Var.f46334a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != q0Var) {
                q0Var.post(new p6(this, d1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public final boolean R(boolean z4) {
        return false;
    }

    @Override
    public final void c(d1 d1Var) {
        z2 z2Var = this.f46022a.h;
        if (z2Var != null) {
            r3 r3Var = z2Var.f46334a;
            r3.M1(r3Var, d1Var);
            r3Var.f46112e3.e(d1Var, true);
        }
    }

    @Override
    public final boolean d() {
        q0 q0Var = this.f46022a;
        z2 z2Var = q0Var.h;
        if (z2Var != null && q0Var.f46081f != null) {
            return z2Var.f46334a.S4();
        }
        return false;
    }

    @Override
    public final boolean o(d1 d1Var) {
        q0 q0Var = this.f46022a;
        if (q0Var.h != null && q0Var.f46081f != null && d1Var.length() == 0) {
            q0Var.h.a(q0Var.f46081f);
            return true;
        }
        return false;
    }

    @Override
    public final void r() {
        a aVar;
        q0 q0Var = this.f46022a;
        z2 z2Var = q0Var.h;
        if (z2Var != null && (aVar = q0Var.f46081f) != null) {
            z2Var.a(aVar);
        }
    }

    @Override
    public final void i(int i10, int i11) {
    }
}
