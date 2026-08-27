package rh;

import android.view.View;
import java.util.ArrayList;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

public final class y2 implements q5 {

    public final p3 f47605a;

    public y2(p3 p3Var) {
        this.f47605a = p3Var;
    }

    public final int a(a aVar) {
        int i10;
        p3 p3Var = this.f47605a;
        int iIndexOf = p3Var.f47348h3.indexOf(aVar);
        return AndroidUtilities.dp((iIndexOf < 0 || (i10 = iIndexOf + 1) >= p3Var.f47348h3.size() || ((a) p3Var.f47348h3.get(i10)).f47029c <= 0) ? 11.0f : 5.0f);
    }

    public final int b(a aVar) {
        p3 p3Var = this.f47605a;
        int iIndexOf = p3Var.f47348h3.indexOf(aVar);
        return AndroidUtilities.dp((iIndexOf <= 0 || ((a) p3Var.f47348h3.get(iIndexOf + (-1))).f47029c <= 0) ? 8.0f : 2.0f);
    }

    public final void c(a aVar, int i10) {
        p3 p3Var = this.f47605a;
        n3 n3Var = p3Var.f47340d3;
        if (i10 == 7) {
            p3Var.R4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
        }
        p3Var.X3 = null;
        p3Var.Y3 = aVar;
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        if (aVar != null) {
            t5.f(aVar.f47028b, "");
            View viewZ1 = p3Var.z1(aVar);
            if (viewZ1 instanceof t5) {
                ((t5) viewZ1).getEditText().setTextSilently("");
            }
        }
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        switch (i10) {
            case 1:
                n3Var.c0(3);
                break;
            case 2:
                n3Var.c0(6);
                break;
            case 3:
                p.U(p3Var.getContext(), "", new n6(p3Var, 21), p3Var.f47338c3);
                break;
            case 4:
            case 5:
                n3Var.c0(1);
                break;
            case 6:
                p3Var.t3();
                break;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        p3 p3Var = this.f47605a;
        if (!z12) {
            p3Var.R4(aVar, pageBlock, i10, i11, z10, z11);
            return;
        }
        if (aVar == null) {
            aVar = p3Var.X4();
        }
        if (aVar != null) {
            ArrayList arrayList = aVar.f47035k;
            if (p3Var.f47348h3.indexOf(aVar) < 0 || p3.x3(aVar) || aVar.f47033i) {
                return;
            }
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            boolean z13 = arrayList.isEmpty() && !t5.p(aVar.f47028b);
            if (z13) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                aVar.f47028b = pageblockblockquote;
            } else {
                if (t5.p(aVar.f47028b)) {
                    long jA = m0.a();
                    TL_iv.RichText richTextK = t5.k(aVar.f47028b);
                    if (richTextK != null && !(richTextK instanceof TL_iv.textEmpty)) {
                        p3Var.f47350i3.put(Long.valueOf(jA), richTextK);
                    }
                    arrayList.add(Long.valueOf(jA));
                }
                aVar.f47028b = new TL_iv.pageBlockParagraph();
                arrayList.add(Long.valueOf(m0.a()));
            }
            p3Var.s4();
            if (z13 && (p3Var.findFocus() instanceof d1)) {
                p3Var.X1();
                b2 b2Var2 = p3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                p3Var.d3(aVar);
                return;
            }
            p3Var.U2.N(false);
            b2 b2Var3 = p3Var.F3;
            if (b2Var3 != null) {
                b2Var3.h();
            }
            p3Var.post(new t2(p3Var, aVar, 5));
        }
    }
}
