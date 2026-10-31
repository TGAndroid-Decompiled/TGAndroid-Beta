package yh;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.messenger.m5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p51;
public final class r implements j20 {
    public final int f54525a;
    public final a0 f54526b;

    public r(a0 a0Var, int i10) {
        this.f54525a = i10;
        this.f54526b = a0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z10;
        ArrayList arrayList;
        int i10 = this.f54525a;
        boolean z11 = true;
        int i11 = 0;
        a0 a0Var = this.f54526b;
        switch (i10) {
            case 0:
                p51 p51Var = (p51) obj2;
                a0Var.J0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    f1.s((FrameLayout) a0Var.f21586b, a0Var.I0, tL_error, false);
                    return;
                } else {
                    a0Var.getClass();
                    return;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                a0Var.f54446o1.setLoading(false);
                if (tL_error2 != null) {
                    f1.s((FrameLayout) a0Var.f21586b, a0Var.I0, tL_error2, false);
                    return;
                } else if (arrayList2 != null) {
                    a0Var.H1 = arrayList2;
                    if (arrayList2.isEmpty()) {
                        m5.n(null, 2131751905, new cc((FrameLayout) a0Var.f21586b, a0Var.I0), 2131624066, 36);
                        return;
                    }
                    a0Var.f54451t1.d.f30819f3.O(false);
                    a0Var.f54443k1.E(2);
                    return;
                } else {
                    return;
                }
            case 3:
                p51 p51Var2 = (p51) obj2;
                int i12 = a0.M1;
                a0Var.J0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                p51 p51Var3 = (p51) obj2;
                int i13 = a0.M1;
                arrayList3.add(a51.E(99, Math.min(i0.L(176.0f) + i0.f16020m, (int) (i0.f16026q.y * 0.25f))));
                arrayList3.add(a51.E(0, i0.L(56.0f)));
                String L0 = cd.L0(2131751849, null);
                a51 a51Var = new a51(39);
                a51Var.d = 101;
                a51Var.f24292l = L0;
                a51Var.f24305z = 0;
                a51Var.L(a0Var.f54445n1);
                arrayList3.add(a51Var);
                arrayList3.add(a51.B(2, cd.L0(2131751848, null)));
                e0 e0Var = a0Var.D1;
                if (e0Var.f54483n && e0Var.f54481l == 1 && (arrayList = e0Var.f54479j) != null && arrayList.size() == 1) {
                    arrayList3.add(a51.t(3, cd.L0(2131751904, null)));
                    e0Var.c(arrayList3);
                    arrayList3.add(a51.E(5, i0.L(14.33f)));
                } else {
                    int i14 = e0Var.f54481l;
                    if (i14 > 0) {
                        int i15 = e0Var.f54485p;
                        if (i14 == i15) {
                            G = cd.L0(2131751895, null);
                        } else {
                            G = cd.G(i14, "CommunityPendingRequestsRow", new Object[0]);
                        }
                        if (i15 > 0) {
                            str = Integer.toString(i15);
                        } else {
                            str = null;
                        }
                        int i16 = zh.i.f55788b;
                        a51 K = a51.K(zh.i.class);
                        K.d = 100;
                        K.f24291k = 2131231167;
                        K.f24292l = G;
                        K.f24294n = str;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.f24297q = true;
                        arrayList3.add(K);
                        arrayList3.add(a51.E(5, i0.L(14.33f)));
                    }
                }
                ji.f x10 = vp.r1(a0Var.f21583a).x(a0Var.l1);
                ArrayList arrayList4 = (ArrayList) x10.e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.f10442c;
                ArrayList arrayList7 = (ArrayList) x10.f10441b;
                if (!arrayList7.isEmpty()) {
                    arrayList3.add(a51.t(21, cd.L0(2131751878, null)));
                    int size = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList7.get(i17);
                        i17++;
                        arrayList3.add(b0.i((zo) obj3, a0Var));
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(a51.E(22, i0.L(12.0f)));
                    }
                    arrayList3.add(a51.t(23, cd.L0(2131751875, null)));
                    int size2 = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList6.get(i18);
                        i18++;
                        arrayList3.add(b0.i((zo) obj4, a0Var));
                    }
                    z10 = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z10) {
                        arrayList3.add(a51.E(24, i0.L(12.0f)));
                    }
                    arrayList3.add(a51.t(25, cd.L0(2131751876, null)));
                    int size3 = arrayList5.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj5 = arrayList5.get(i19);
                        i19++;
                        arrayList3.add(b0.i((zo) obj5, a0Var));
                    }
                } else {
                    z11 = z10;
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(a51.E(26, i0.L(12.0f)));
                    }
                    arrayList3.add(a51.t(27, cd.L0(2131751873, null)));
                    int size4 = arrayList4.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList4.get(i11);
                        i11++;
                        arrayList3.add(b0.i((zo) obj6, a0Var));
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                p51 p51Var4 = (p51) obj2;
                e0 e0Var2 = a0Var.D1;
                arrayList8.add(a51.E(99, (int) (i0.f16026q.y * 0.35f)));
                arrayList8.add(a51.E(0, i0.L(48.0f)));
                if (w3.w(2, a0Var.f54444m1)) {
                    arrayList8.add(a51.B(1, i0.G2(i0.T2(cd.L0(2131751894, null), new t(a0Var, 2)), true)));
                } else {
                    arrayList8.add(a51.B(1, cd.L0(2131751893, null)));
                }
                arrayList8.add(a51.j(2, a0Var.C1));
                arrayList8.add(a51.t(3, cd.G(e0Var2.f54481l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                e0Var2.c(arrayList8);
                return;
        }
    }
}
