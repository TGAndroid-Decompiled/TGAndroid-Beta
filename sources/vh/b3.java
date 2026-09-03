package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class b3 implements t5 {
    public final s3 f45897a;

    public b3(s3 s3Var) {
        this.f45897a = s3Var;
    }

    public final int a(a aVar) {
        float f10;
        int i10;
        s3 s3Var = this.f45897a;
        int indexOf = s3Var.f46217i3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < s3Var.f46217i3.size() && ((a) s3Var.f46217i3.get(i10)).f45854c > 0) {
            f10 = 5.0f;
        } else {
            f10 = 11.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final int b(a aVar) {
        float f10;
        s3 s3Var = this.f45897a;
        int indexOf = s3Var.f46217i3.indexOf(aVar);
        if (indexOf > 0 && ((a) s3Var.f46217i3.get(indexOf - 1)).f45854c > 0) {
            f10 = 2.0f;
        } else {
            f10 = 8.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c(a aVar, int i10) {
        s3 s3Var = this.f45897a;
        q3 q3Var = s3Var.f46209e3;
        if (i10 == 7) {
            s3Var.Q4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        s3Var.Y3 = null;
        s3Var.Z3 = aVar;
        d2 d2Var = s3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        if (aVar != null) {
            w5.f(aVar.f45853b, "");
            View y12 = s3Var.y1(aVar);
            if (y12 instanceof w5) {
                ((w5) y12).getEditText().setTextSilently("");
            }
        }
        d2 d2Var2 = s3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        switch (i10) {
            case 1:
                q3Var.n(3);
                return;
            case 2:
                q3Var.n(6);
                return;
            case 3:
                q.U(s3Var.getContext(), "", new org.telegram.ui.web.a1(s3Var, 26), s3Var.f46207d3);
                return;
            case 4:
            case 5:
                q3Var.n(1);
                return;
            case 6:
                s3Var.s3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z4, boolean z10) {
        boolean z11;
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        s3 s3Var = this.f45897a;
        if (z12) {
            if (aVar == null) {
                aVar = s3Var.W4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f45859k;
                if (s3Var.f46217i3.indexOf(aVar) >= 0 && !s3.w3(aVar) && !aVar.f45857i) {
                    d2 d2Var = s3Var.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    if (arrayList.isEmpty() && !w5.p(aVar.f45853b)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f45853b = pageblockblockquote;
                    } else {
                        if (w5.p(aVar.f45853b)) {
                            long a2 = n0.a();
                            TL_iv.RichText k10 = w5.k(aVar.f45853b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                s3Var.f46219j3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f45853b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(n0.a()));
                    }
                    s3Var.r4();
                    if (z11 && (s3Var.findFocus() instanceof e1)) {
                        s3Var.W1();
                        d2 d2Var2 = s3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        s3Var.c3(aVar);
                        return;
                    }
                    s3Var.V2.N(false);
                    d2 d2Var3 = s3Var.G3;
                    if (d2Var3 != null) {
                        d2Var3.h();
                    }
                    s3Var.post(new v2(s3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        s3Var.Q4(aVar, pageBlock, i10, i11, z4, z10);
    }
}
