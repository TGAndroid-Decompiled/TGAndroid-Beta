package wh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class a3 implements s5 {
    public final r3 f49640a;

    public a3(r3 r3Var) {
        this.f49640a = r3Var;
    }

    public final int a(a aVar) {
        float f10;
        int i10;
        r3 r3Var = this.f49640a;
        int indexOf = r3Var.f49987i3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < r3Var.f49987i3.size() && ((a) r3Var.f49987i3.get(i10)).f49617c > 0) {
            f10 = 5.0f;
        } else {
            f10 = 11.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final int b(a aVar) {
        float f10;
        r3 r3Var = this.f49640a;
        int indexOf = r3Var.f49987i3.indexOf(aVar);
        if (indexOf > 0 && ((a) r3Var.f49987i3.get(indexOf - 1)).f49617c > 0) {
            f10 = 2.0f;
        } else {
            f10 = 8.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c(a aVar, int i10) {
        r3 r3Var = this.f49640a;
        p3 p3Var = r3Var.f49979e3;
        if (i10 == 7) {
            r3Var.R4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        r3Var.Y3 = null;
        r3Var.Z3 = aVar;
        d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        if (aVar != null) {
            v5.f(aVar.f49616b, "");
            View z12 = r3Var.z1(aVar);
            if (z12 instanceof v5) {
                ((v5) z12).getEditText().setTextSilently("");
            }
        }
        d2 d2Var2 = r3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        switch (i10) {
            case 1:
                p3Var.p(3);
                return;
            case 2:
                p3Var.p(6);
                return;
            case 3:
                q.U(r3Var.getContext(), "", new org.telegram.ui.web.d1(r3Var, 26), r3Var.f49977d3);
                return;
            case 4:
            case 5:
                p3Var.p(1);
                return;
            case 6:
                r3Var.t3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z4, boolean z10) {
        boolean z11;
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        r3 r3Var = this.f49640a;
        if (z12) {
            if (aVar == null) {
                aVar = r3Var.X4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f49623k;
                if (r3Var.f49987i3.indexOf(aVar) >= 0 && !r3.x3(aVar) && !aVar.f49621i) {
                    d2 d2Var = r3Var.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    if (arrayList.isEmpty() && !v5.p(aVar.f49616b)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f49616b = pageblockblockquote;
                    } else {
                        if (v5.p(aVar.f49616b)) {
                            long a2 = n0.a();
                            TL_iv.RichText k10 = v5.k(aVar.f49616b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                r3Var.f49989j3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f49616b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(n0.a()));
                    }
                    r3Var.s4();
                    if (z11 && (r3Var.findFocus() instanceof e1)) {
                        r3Var.X1();
                        d2 d2Var2 = r3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        r3Var.d3(aVar);
                        return;
                    }
                    r3Var.V2.N(false);
                    d2 d2Var3 = r3Var.G3;
                    if (d2Var3 != null) {
                        d2Var3.h();
                    }
                    r3Var.post(new v2(r3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        r3Var.R4(aVar, pageBlock, i10, i11, z4, z10);
    }
}
