package vg;

import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import c8.kd;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.q40;
import ug.g1;
import wg.a0;
import wg.t;
import wg.w;
import wg.z;
public final class o implements Runnable {
    public final int f58941a;
    public final Object f58942b;

    public o(Object obj, int i7) {
        this.f58941a = i7;
        this.f58942b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7 = this.f58941a;
        Object obj = this.f58942b;
        switch (i7) {
            case 0:
                r rVar = (r) obj;
                s sVar = rVar.f58963a;
                if (sVar.f58977e == rVar) {
                    sVar.f58979n = false;
                    sVar.a();
                    return;
                }
                return;
            case 1:
                ((vh.h) obj).Z1.O(true);
                return;
            case 2:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                cc X = cc.X();
                if (X != null) {
                    X.Q(2131624029, 30, spannableStringBuilder).j();
                    return;
                }
                return;
            case 3:
                ((w) obj).a(null);
                return;
            case 4:
                ((gh) obj).a(Collections.EMPTY_LIST);
                return;
            case 5:
                ((t) obj).a(null);
                return;
            case 6:
                z zVar = (z) obj;
                zVar.getClass();
                a0 a0Var = zVar.f59296r;
                g1 g1Var = new g1(a0Var.f35940s1, a0Var.f29679a, null, null, null, a0Var.J0);
                g1Var.F2 = true;
                g1Var.Y1 = true;
                a0Var.f35940s1.showDialog(g1Var);
                return;
            case 7:
                ((FrameLayout) obj).invalidate();
                return;
            case 8:
                wi.h hVar = (wi.h) ((og.b) obj).f21465b;
                hVar.h.invalidate();
                hVar.f59387i.requestLayout();
                return;
            case 9:
                l2.i iVar = (l2.i) obj;
                ArrayList arrayList = (ArrayList) iVar.f19042c;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    wi.n nVar = (wi.n) arrayList.get(i10);
                    wi.h hVar2 = nVar.f59425e;
                    if (hVar2 != null && nVar.f59424c == 1 && hVar2.f59386g && !hVar2.K) {
                        if (hVar2.f59382b.p() && kd.a(hVar2.f59383c)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 != hVar2.f59385f) {
                            hVar2.l();
                            hVar2.a();
                        }
                    }
                }
                iVar.f();
                return;
            case 10:
                ((wi.l) obj).V();
                return;
            case 11:
                wi.n nVar2 = (wi.n) obj;
                if (nVar2.f59424c == 1) {
                    nVar2.f59422a.Z();
                    return;
                }
                return;
            case 12:
                xi.c cVar = (xi.c) obj;
                g0.i3(new xi.b(cVar.f60049a, cVar.f60050b, 1), 500L);
                return;
            case 13:
                zh.k kVar = (zh.k) obj;
                kVar.f();
                kVar.e(true);
                return;
            default:
                q40 q40Var = (q40) ((ff) obj).f34586b;
                q40Var.f38506r0 = true;
                a8.b("RoundVideo camera flip first frame: elapsedMs=" + q40.m(q40Var));
                q40Var.w(true);
                q40.n(q40Var);
                return;
        }
    }
}
