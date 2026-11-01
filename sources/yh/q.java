package yh;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ap;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.k20;
import org.telegram.messenger.m5;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.q51;
public final class q implements k20 {
    public final int f54526a;
    public final z f54527b;

    public q(z zVar, int i10) {
        this.f54526a = i10;
        this.f54527b = zVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z10;
        ArrayList arrayList;
        int i10 = this.f54526a;
        boolean z11 = true;
        int i11 = 0;
        z zVar = this.f54527b;
        switch (i10) {
            case 0:
                q51 q51Var = (q51) obj2;
                zVar.J0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    f1.s((FrameLayout) zVar.f21587b, zVar.I0, tL_error, false);
                    return;
                } else {
                    zVar.getClass();
                    return;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                zVar.f54548o1.setLoading(false);
                if (tL_error2 != null) {
                    f1.s((FrameLayout) zVar.f21587b, zVar.I0, tL_error2, false);
                    return;
                } else if (arrayList2 != null) {
                    zVar.H1 = arrayList2;
                    if (arrayList2.isEmpty()) {
                        m5.n(null, 2131751905, new cc((FrameLayout) zVar.f21587b, zVar.I0), 2131624066, 36);
                        return;
                    }
                    zVar.f54553t1.d.f31183f3.O(false);
                    zVar.f54545k1.E(2);
                    return;
                } else {
                    return;
                }
            case 3:
                q51 q51Var2 = (q51) obj2;
                int i12 = z.M1;
                zVar.J0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                q51 q51Var3 = (q51) obj2;
                int i13 = z.M1;
                arrayList3.add(b51.E(99, Math.min(i0.L(176.0f) + i0.f16166m, (int) (i0.f16172q.y * 0.25f))));
                arrayList3.add(b51.E(0, i0.L(56.0f)));
                String L0 = dd.L0(2131751849, null);
                b51 b51Var = new b51(39);
                b51Var.d = 101;
                b51Var.f24643l = L0;
                b51Var.f24656z = 0;
                b51Var.L(zVar.f54547n1);
                arrayList3.add(b51Var);
                arrayList3.add(b51.B(2, dd.L0(2131751848, null)));
                d0 d0Var = zVar.D1;
                if (d0Var.f54481n && d0Var.f54479l == 1 && (arrayList = d0Var.f54477j) != null && arrayList.size() == 1) {
                    arrayList3.add(b51.t(3, dd.L0(2131751904, null)));
                    d0Var.c(arrayList3);
                    arrayList3.add(b51.E(5, i0.L(14.33f)));
                } else {
                    int i14 = d0Var.f54479l;
                    if (i14 > 0) {
                        int i15 = d0Var.f54483p;
                        if (i14 == i15) {
                            G = dd.L0(2131751895, null);
                        } else {
                            G = dd.G(i14, "CommunityPendingRequestsRow", new Object[0]);
                        }
                        if (i15 > 0) {
                            str = Integer.toString(i15);
                        } else {
                            str = null;
                        }
                        int i16 = zh.i.f55806b;
                        b51 K = b51.K(zh.i.class);
                        K.d = 100;
                        K.f24642k = 2131231167;
                        K.f24643l = G;
                        K.f24645n = str;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.f24648q = true;
                        arrayList3.add(K);
                        arrayList3.add(b51.E(5, i0.L(14.33f)));
                    }
                }
                ji.f x10 = wp.r1(zVar.f21584a).x(zVar.l1);
                ArrayList arrayList4 = (ArrayList) x10.e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.f10443c;
                ArrayList arrayList7 = (ArrayList) x10.f10442b;
                if (!arrayList7.isEmpty()) {
                    arrayList3.add(b51.t(21, dd.L0(2131751878, null)));
                    int size = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList7.get(i17);
                        i17++;
                        arrayList3.add(a0.i((ap) obj3, zVar));
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(b51.E(22, i0.L(12.0f)));
                    }
                    arrayList3.add(b51.t(23, dd.L0(2131751875, null)));
                    int size2 = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList6.get(i18);
                        i18++;
                        arrayList3.add(a0.i((ap) obj4, zVar));
                    }
                    z10 = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z10) {
                        arrayList3.add(b51.E(24, i0.L(12.0f)));
                    }
                    arrayList3.add(b51.t(25, dd.L0(2131751876, null)));
                    int size3 = arrayList5.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj5 = arrayList5.get(i19);
                        i19++;
                        arrayList3.add(a0.i((ap) obj5, zVar));
                    }
                } else {
                    z11 = z10;
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(b51.E(26, i0.L(12.0f)));
                    }
                    arrayList3.add(b51.t(27, dd.L0(2131751873, null)));
                    int size4 = arrayList4.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        arrayList3.add(a0.i((ap) obj6, zVar));
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                q51 q51Var4 = (q51) obj2;
                d0 d0Var2 = zVar.D1;
                arrayList8.add(b51.E(99, (int) (i0.f16172q.y * 0.35f)));
                arrayList8.add(b51.E(0, i0.L(48.0f)));
                if (w3.w(2, zVar.f54546m1)) {
                    arrayList8.add(b51.B(1, i0.G2(i0.T2(dd.L0(2131751894, null), new s(zVar, 2)), true)));
                } else {
                    arrayList8.add(b51.B(1, dd.L0(2131751893, null)));
                }
                arrayList8.add(b51.j(2, zVar.C1));
                arrayList8.add(b51.t(3, dd.G(d0Var2.f54479l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                d0Var2.c(arrayList8);
                return;
        }
    }
}
