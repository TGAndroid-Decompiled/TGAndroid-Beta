package vh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l9;
public final class o0 implements d1 {
    public final r0 f46119a;

    public o0(r0 r0Var) {
        this.f46119a = r0Var;
    }

    @Override
    public final void Q0(CharSequence charSequence) {
        a3 a3Var = this.f46119a.h;
        if (a3Var != null && charSequence != null && charSequence.length() > 0) {
            a3Var.f45875a.s4(charSequence.toString());
        }
    }

    @Override
    public final boolean V0(e1 e1Var) {
        return false;
    }

    @Override
    public final void c(e1 e1Var) {
        a3 a3Var = this.f46119a.h;
        if (a3Var != null) {
            s3 s3Var = a3Var.f45875a;
            s3.L1(s3Var, e1Var);
            s3Var.f46209e3.d(e1Var, true);
        }
    }

    @Override
    public final void g1(e1 e1Var) {
        a aVar;
        s3 s3Var;
        ArrayList arrayList;
        int indexOf;
        r0 r0Var = this.f46119a;
        a3 a3Var = r0Var.h;
        if (a3Var != null && (aVar = r0Var.f46178f) != null && (indexOf = (arrayList = (s3Var = a3Var.f45875a).f46217i3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f45853b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                s3Var.V2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f45857i && !s3.w3((a) arrayList.get(i10))) {
                s3Var.post(new k2(s3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final boolean h() {
        r0 r0Var = this.f46119a;
        a3 a3Var = r0Var.h;
        if (a3Var != null && r0Var.f46178f != null) {
            return a3Var.f45875a.R4();
        }
        return false;
    }

    @Override
    public final boolean h0(e1 e1Var) {
        r0 r0Var = this.f46119a;
        if (r0Var.h != null && r0Var.f46178f != null && e1Var.length() == 0) {
            r0Var.h.a(r0Var.f46178f);
            return true;
        }
        return false;
    }

    @Override
    public final void l1(Editable editable) {
        r0 r0Var = this.f46119a;
        a aVar = r0Var.f46178f;
        if (aVar != null) {
            aVar.f45867s = true;
            aVar.f45866r = r0Var.d.B;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45853b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = y5.f(editable);
            }
        }
        a3 a3Var = r0Var.h;
        if (a3Var != null && r0Var.f46178f != null) {
            s3 s3Var = a3Var.f45875a;
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            s3Var.f46209e3.onContentChanged();
        }
    }

    @Override
    public final void n1(e1 e1Var, int i10, int i11) {
        a3 a3Var;
        l9 textSelectionHelper;
        r0 r0Var = this.f46119a;
        if (!r0Var.f46179n && i10 != i11 && (a3Var = r0Var.h) != null && (textSelectionHelper = a3Var.f45875a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != r0Var) {
                r0Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public final void q0() {
        a aVar;
        r0 r0Var = this.f46119a;
        a3 a3Var = r0Var.h;
        if (a3Var != null && (aVar = r0Var.f46178f) != null) {
            a3Var.a(aVar);
        }
    }

    @Override
    public final boolean w1(boolean z4) {
        return false;
    }

    @Override
    public final void r(int i10, int i11) {
    }
}
