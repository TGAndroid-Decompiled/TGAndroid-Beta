package wh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;
public final class o0 implements d1 {
    public final r0 f49894a;

    public o0(r0 r0Var) {
        this.f49894a = r0Var;
    }

    @Override
    public final boolean D(e1 e1Var) {
        r0 r0Var = this.f49894a;
        if (r0Var.h != null && r0Var.f49964f != null && e1Var.length() == 0) {
            r0Var.h.a(r0Var.f49964f);
            return true;
        }
        return false;
    }

    @Override
    public final void H(CharSequence charSequence) {
        z2 z2Var = this.f49894a.h;
        if (z2Var != null && charSequence != null && charSequence.length() > 0) {
            z2Var.f50217a.t4(charSequence.toString());
        }
    }

    @Override
    public final void O(Editable editable) {
        r0 r0Var = this.f49894a;
        a aVar = r0Var.f49964f;
        if (aVar != null) {
            aVar.f49631s = true;
            aVar.f49630r = r0Var.d.B;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49616b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = x5.f(editable);
            }
        }
        z2 z2Var = r0Var.h;
        if (z2Var != null && r0Var.f49964f != null) {
            r3 r3Var = z2Var.f50217a;
            d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            r3Var.f49979e3.onContentChanged();
        }
    }

    @Override
    public final boolean T(boolean z4) {
        return false;
    }

    @Override
    public final void c(e1 e1Var) {
        z2 z2Var = this.f49894a.h;
        if (z2Var != null) {
            r3 r3Var = z2Var.f50217a;
            r3.M1(r3Var, e1Var);
            r3Var.f49979e3.h(e1Var, true);
        }
    }

    @Override
    public final boolean e() {
        r0 r0Var = this.f49894a;
        z2 z2Var = r0Var.h;
        if (z2Var != null && r0Var.f49964f != null) {
            return z2Var.f50217a.S4();
        }
        return false;
    }

    @Override
    public final void o(e1 e1Var) {
        a aVar;
        r3 r3Var;
        ArrayList arrayList;
        int indexOf;
        r0 r0Var = this.f49894a;
        z2 z2Var = r0Var.h;
        if (z2Var != null && (aVar = r0Var.f49964f) != null && (indexOf = (arrayList = (r3Var = z2Var.f50217a).f49987i3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f49616b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                r3Var.V2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f49621i && !r3.x3((a) arrayList.get(i10))) {
                r3Var.post(new k2(r3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final boolean r(e1 e1Var) {
        return false;
    }

    @Override
    public final void s(e1 e1Var, int i10, int i11) {
        z2 z2Var;
        m9 textSelectionHelper;
        r0 r0Var = this.f49894a;
        if (!r0Var.f49965n && i10 != i11 && (z2Var = r0Var.h) != null && (textSelectionHelper = z2Var.f50217a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != r0Var) {
                r0Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public final void v() {
        a aVar;
        r0 r0Var = this.f49894a;
        z2 z2Var = r0Var.h;
        if (z2Var != null && (aVar = r0Var.f49964f) != null) {
            z2Var.a(aVar);
        }
    }

    @Override
    public final void j(int i10, int i11) {
    }
}
