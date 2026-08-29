package th;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class y2 implements q5 {
    public final p3 f48903a;

    public y2(p3 p3Var) {
        this.f48903a = p3Var;
    }

    public final int a(a aVar) {
        float f9;
        int i10;
        p3 p3Var = this.f48903a;
        int indexOf = p3Var.f48646h3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < p3Var.f48646h3.size() && ((a) p3Var.f48646h3.get(i10)).f48329c > 0) {
            f9 = 5.0f;
        } else {
            f9 = 11.0f;
        }
        return AndroidUtilities.dp(f9);
    }

    public final int b(a aVar) {
        float f9;
        p3 p3Var = this.f48903a;
        int indexOf = p3Var.f48646h3.indexOf(aVar);
        if (indexOf > 0 && ((a) p3Var.f48646h3.get(indexOf - 1)).f48329c > 0) {
            f9 = 2.0f;
        } else {
            f9 = 8.0f;
        }
        return AndroidUtilities.dp(f9);
    }

    public final void c(a aVar, int i10) {
        p3 p3Var = this.f48903a;
        n3 n3Var = p3Var.f48638d3;
        if (i10 == 7) {
            p3Var.R4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        p3Var.X3 = null;
        p3Var.Y3 = aVar;
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        if (aVar != null) {
            t5.f(aVar.f48328b, "");
            View z12 = p3Var.z1(aVar);
            if (z12 instanceof t5) {
                ((t5) z12).getEditText().setTextSilently("");
            }
        }
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        switch (i10) {
            case 1:
                n3Var.W(3);
                return;
            case 2:
                n3Var.W(6);
                return;
            case 3:
                p.U(p3Var.getContext(), "", new nh.b0(p3Var, 26), p3Var.c3);
                return;
            case 4:
            case 5:
                n3Var.W(1);
                return;
            case 6:
                p3Var.t3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        p3 p3Var = this.f48903a;
        if (z13) {
            if (aVar == null) {
                aVar = p3Var.X4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f48335k;
                if (p3Var.f48646h3.indexOf(aVar) >= 0 && !p3.x3(aVar) && !aVar.f48333i) {
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    if (arrayList.isEmpty() && !t5.p(aVar.f48328b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f48328b = pageblockblockquote;
                    } else {
                        if (t5.p(aVar.f48328b)) {
                            long a2 = m0.a();
                            TL_iv.RichText k9 = t5.k(aVar.f48328b);
                            if (k9 != null && !(k9 instanceof TL_iv.textEmpty)) {
                                p3Var.f48648i3.put(Long.valueOf(a2), k9);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f48328b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(m0.a()));
                    }
                    p3Var.s4();
                    if (z12 && (p3Var.findFocus() instanceof d1)) {
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
                    return;
                }
                return;
            }
            return;
        }
        p3Var.R4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
