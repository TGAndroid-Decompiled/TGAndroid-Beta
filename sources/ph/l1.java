package ph;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.k6;
import org.telegram.messenger.o5;
import org.telegram.messenger.qk;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg0;
import org.telegram.ui.xa;
import rh.e6;
import rh.o7;
import rh.v5;
import rh.w7;
public final class l1 extends ha implements us {
    public static final int f45193q2 = 0;
    public final int P1;
    public p51 Q1;
    public List R1;
    public TLRPC.DisallowedGiftsSettings S1;
    public final long T1;
    public final boolean U1;
    public final String V1;
    public final w7 W1;
    public final dg0 X1;
    public final FrameLayout Y1;
    public final LinearLayout Z1;
    public final yy a2;
    public final u0 f45194b2;
    public final kg.t1 f45195c2;
    public final kg.t1 f45196d2;
    public final ArrayList f45197e2;
    public final v5 f45198f2;
    public int f45199g2;
    public int f45200h2;
    public int f45201i2;
    public int f45202j2;
    public boolean f45203k2;
    public boolean f45204l2;
    public boolean f45205m2;
    public o7 f45206n2;
    public final p80 f45207o2;
    public boolean f45208p2;

    public l1(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.f26666k1, getContext(), this.P1, 0, true, new ag.a(this, 25), this.I0);
        this.Q1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.U1) {
            return cd.L0(2131749948, null);
        }
        return k6.m(cd.a0(null, null, 2131749857, this.V1), null, false, null, 0);
    }

    public final void d1(ArrayList arrayList, p51 p51Var) {
        long j10;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        float f7;
        TL_stars.StarGift starGift;
        boolean z13;
        boolean z14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z15;
        boolean z16;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        float f10;
        float f11;
        float f12;
        float f13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        dg0 dg0Var = this.X1;
        long j11 = this.T1;
        long j12 = 0;
        boolean z17 = this.U1;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.S1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(a51.k(dg0Var));
            arrayList.add(a51.k(this.Y1));
            ArrayList arrayList3 = this.f45197e2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = b1.f44980b;
                    a51 K = a51.K(b1.class);
                    K.f24301u = 1;
                    K.G = (kg.m) obj;
                    arrayList.add(K);
                    j12 = j12;
                }
                j10 = j12;
            } else {
                j10 = 0;
                a51 q6 = a51.q(1, 34);
                q6.f24301u = 1;
                arrayList.add(q6);
                a51 q10 = a51.q(2, 34);
                q10.f24301u = 1;
                arrayList.add(q10);
                a51 q11 = a51.q(3, 34);
                q11.f24301u = 1;
                arrayList.add(q11);
            }
            z10 = true;
        }
        int i12 = this.P1;
        e6 y3 = e6.y(i12, false);
        if (this.f45203k2) {
            arrayList2 = y3.J;
        } else {
            arrayList2 = y3.I;
        }
        if (this.S1 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new xh.d1(this, 2)).collect(Collectors.toCollection(new qk(1)));
        }
        int i13 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new xa(3)).collect(Collectors.toCollection(new qk(1)));
        }
        int i14 = (j11 > d20.i(i12).e() ? 1 : (j11 == d20.i(i12).e() ? 0 : -1));
        v5 v5Var = this.f45198f2;
        if (i14 != 0 && v5Var != null) {
            ArrayList arrayList4 = v5Var.f47582l;
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList4.get(i15);
                i15++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!vp.r1(i12).Z5 && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.S1) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && v5Var != null && !v5Var.f47582l.isEmpty()))) {
            if (!z10) {
                arrayList.add(a51.k(dg0Var));
            } else {
                arrayList.add(a51.D(org.telegram.messenger.i0.L(16.0f)));
            }
            arrayList.add(a51.k(this.Z1));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.S1;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i16)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f45200h2 = -1;
            this.f45199g2 = -1;
            if (!arrayList2.isEmpty()) {
                this.f45199g2 = arrayList5.size();
                arrayList5.add(cd.L0(2131749959, null));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.S1;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.f45200h2 = arrayList5.size();
                arrayList5.add(cd.L0(2131749955, null));
            }
            this.f45201i2 = arrayList5.size();
            arrayList5.add(cd.L0(2131749958, null));
            if (this.f45204l2 && !this.f45205m2) {
                this.f45205m2 = true;
                this.f45202j2 = this.f45201i2;
            }
            int i17 = this.f45202j2;
            q0 q0Var = new q0(this, 0);
            int i18 = j1.f45127b;
            a51 K2 = a51.K(j1.class);
            K2.d = 1;
            K2.G = arrayList5;
            K2.f24305z = i17;
            K2.H = q0Var;
            arrayList.add(K2);
            if (this.f45202j2 == this.f45201i2 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f45208p2) {
                this.f45208p2 = z12;
                ViewPropertyAnimator animate = this.f45195c2.animate();
                float f14 = 0.0f;
                float f15 = 1.0f;
                if (!z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (!z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z12) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.85f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(380L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                ViewPropertyAnimator animate2 = this.f45196d2.animate();
                if (z12) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!z12) {
                    f15 = 0.85f;
                }
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(grVar).start();
            }
            if (v5Var != null && this.f45202j2 == this.f45200h2) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = v5Var.f47582l;
                int size3 = arrayList6.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj3 = arrayList6.get(i19);
                    i19++;
                    TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift2);
                    }
                }
            }
            int i20 = 0;
            for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList2.get(i21);
                int i22 = this.f45202j2;
                if (i22 == this.f45199g2 || i22 == this.f45200h2 || (i22 == this.f45201i2 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i22 != this.f45201i2) {
                        if (i22 == this.f45200h2) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.S1) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        a51 i23 = b1.i(i22, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(i23);
                        i20++;
                    } else {
                        starGift = starGift3;
                    }
                    int i24 = this.f45202j2;
                    if (i24 == this.f45200h2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.S1) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(b1.i(i24, starGift, z13, z14, true, false, false));
                    i20++;
                }
            }
            int i25 = this.f45202j2;
            int i26 = this.f45200h2;
            if (i25 == i26 && v5Var != null && !v5Var.f47580j) {
                v5Var.b();
                a51 q12 = a51.q(4, 34);
                q12.f24301u = 1;
                arrayList.add(q12);
                a51 q13 = a51.q(5, 34);
                q13.f24301u = 1;
                arrayList.add(q13);
                a51 q14 = a51.q(6, 34);
                q14.f24301u = 1;
                arrayList.add(q14);
            } else if (i25 != i26 && y3.C) {
                a51 q15 = a51.q(4, 34);
                q15.f24301u = 1;
                arrayList.add(q15);
                a51 q16 = a51.q(5, 34);
                q16.f24301u = 1;
                arrayList.add(q16);
                a51 q17 = a51.q(6, 34);
                q17.f24301u = 1;
                arrayList.add(q17);
            }
            if (i20 < 9) {
                f7 = 300.0f;
            } else {
                f7 = 40.0f;
            }
            arrayList.add(a51.D(org.telegram.messenger.i0.L(f7)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.S1;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(a51.D(org.telegram.messenger.i0.L(300.0f)));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == zs.f19637j5) {
            f1();
        } else if (i10 == zs.F3) {
            p51 p51Var2 = this.Q1;
            if (p51Var2 != null) {
                p51Var2.O(true);
            }
        } else if (i10 == zs.E0) {
            if (!this.I) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.T1;
                if (longValue == j10 && j10 > 0) {
                    int i12 = this.P1;
                    TLRPC.UserFull a2 = vp.r1(i12).a2(j10);
                    if (j10 != d20.i(i12).e() && a2 != null) {
                        disallowedGiftsSettings = a2.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.S1 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            z20.s(cd.a0(null, null, 2131743768, o5.t(j10)), cc.a0(T), 2131624011, 36);
                            return;
                        }
                        return;
                    }
                    p51 p51Var3 = this.Q1;
                    if (p51Var3 != null) {
                        p51Var3.O(true);
                    }
                }
                ArrayList arrayList = this.f45197e2;
                if (arrayList == null || arrayList.isEmpty()) {
                    f1();
                    p51 p51Var4 = this.Q1;
                    if (p51Var4 != null) {
                        p51Var4.O(true);
                    }
                }
            }
        } else if (i10 == zs.I3) {
            if (!this.I) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new cc(this.f21589c, this.I0).s(starGift.sticker, cd.L0(2131749976, null), org.telegram.messenger.i0.W2(cd.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
                p51 p51Var5 = this.Q1;
                if (p51Var5 != null) {
                    p51Var5.O(true);
                }
            }
        } else if (i10 == zs.G3 && objArr[1] == this.f45198f2 && (p51Var = this.Q1) != null) {
            p51Var.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i10 = this.P1;
        zs.f(i10).n(this, zs.f19637j5);
        zs.f(i10).n(this, zs.F3);
        zs.f(i10).n(this, zs.E0);
        zs.f(i10).n(this, zs.I3);
        zs.f(i10).n(this, zs.G3);
    }

    public final void e1(boolean z10) {
        this.f45203k2 = z10;
        this.Q1.O(false);
    }

    public final void f1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f45197e2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.R1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.R1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.R1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.R1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                            if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                                break;
                            }
                        } else {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                    }
                    kg.m mVar = new kg.m(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(mVar);
                    if (org.telegram.messenger.v2.b()) {
                        if (mVar.f() > j10) {
                            j10 = mVar.f();
                        }
                    } else if (mVar.h() != null && org.telegram.messenger.u1.i().k()) {
                        c5.a aVar = new c5.a();
                        aVar.f3732c = "inapp";
                        aVar.f3731b = mVar.h();
                        arrayList2.add(aVar.a());
                    }
                }
            }
            if (org.telegram.messenger.v2.b()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((kg.m) obj).f11182g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.u1.i().o(arrayList2, new mg.l(this, 22));
            }
        }
        if (arrayList.isEmpty()) {
            mg.k0.j(this.P1, null, new q0(this, 1));
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        int i10 = this.P1;
        if (vp.r1(i10).u2()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.S1;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T != null) {
                z20.s(cd.a0(null, null, 2131743768, o5.t(this.T1)), cc.a0(T), 2131624011, 36);
                return;
            }
            return;
        }
        super.show();
    }

    public l1(final android.content.Context r28, final int r29, final long r30, java.util.List r32, final org.telegram.messenger.q20 r33) {
        throw new UnsupportedOperationException("Method not decompiled: ph.l1.<init>(android.content.Context, int, long, java.util.List, org.telegram.messenger.q20):void");
    }
}
