package qh;

import android.view.View;
import java.util.ArrayList;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class x2 implements p5 {
    public final o3 f46827a;

    public x2(o3 o3Var) {
        this.f46827a = o3Var;
    }

    public final int a(a aVar) {
        float f10;
        int i9;
        o3 o3Var = this.f46827a;
        int indexOf = o3Var.f46573h3.indexOf(aVar);
        if (indexOf >= 0 && (i9 = indexOf + 1) < o3Var.f46573h3.size() && ((a) o3Var.f46573h3.get(i9)).f46270c > 0) {
            f10 = 5.0f;
        } else {
            f10 = 11.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final int b(a aVar) {
        float f10;
        o3 o3Var = this.f46827a;
        int indexOf = o3Var.f46573h3.indexOf(aVar);
        if (indexOf > 0 && ((a) o3Var.f46573h3.get(indexOf - 1)).f46270c > 0) {
            f10 = 2.0f;
        } else {
            f10 = 8.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c(a aVar, int i9) {
        o3 o3Var = this.f46827a;
        m3 m3Var = o3Var.f46565d3;
        if (i9 == 7) {
            o3Var.R4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        o3Var.X3 = null;
        o3Var.Y3 = aVar;
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        if (aVar != null) {
            s5.f(aVar.f46269b, "");
            View z12 = o3Var.z1(aVar);
            if (z12 instanceof s5) {
                ((s5) z12).getEditText().setTextSilently("");
            }
        }
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        switch (i9) {
            case 1:
                m3Var.c0(3);
                return;
            case 2:
                m3Var.c0(6);
                return;
            case 3:
                p.T(o3Var.getContext(), "", new i9(o3Var, 19), o3Var.f46563c3);
                return;
            case 4:
            case 5:
                m3Var.c0(1);
                return;
            case 6:
                o3Var.t3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i9, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        o3 o3Var = this.f46827a;
        if (z13) {
            if (aVar == null) {
                aVar = o3Var.X4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f46276k;
                if (o3Var.f46573h3.indexOf(aVar) >= 0 && !o3.x3(aVar) && !aVar.f46274i) {
                    b2 b2Var = o3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    if (arrayList.isEmpty() && !s5.p(aVar.f46269b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f46269b = pageblockblockquote;
                    } else {
                        if (s5.p(aVar.f46269b)) {
                            long a2 = m0.a();
                            TL_iv.RichText k10 = s5.k(aVar.f46269b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                o3Var.f46575i3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f46269b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(m0.a()));
                    }
                    o3Var.s4();
                    if (z12 && (o3Var.findFocus() instanceof d1)) {
                        o3Var.X1();
                        b2 b2Var2 = o3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        o3Var.d3(aVar);
                        return;
                    }
                    o3Var.U2.N(false);
                    b2 b2Var3 = o3Var.F3;
                    if (b2Var3 != null) {
                        b2Var3.h();
                    }
                    o3Var.post(new s2(o3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        o3Var.R4(aVar, pageBlock, i9, i10, z10, z11);
    }
}
