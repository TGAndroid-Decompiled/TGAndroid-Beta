package zh;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.ea;
import bi.gc;
import bi.sc;
import bi.v9;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.nk;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.vq0;
public final class g1 extends ma implements ls {
    public static final int f60335t2 = 0;
    public final int S1;
    public m41 T1;
    public List U1;
    public TLRPC.DisallowedGiftsSettings V1;
    public final long W1;
    public final boolean X1;
    public final String Y1;
    public final sc Z1;
    public final vq0 f60336a2;
    public final FrameLayout f60337b2;
    public final LinearLayout f60338c2;
    public final jy d2;
    public final r0 f60339e2;
    public final ib f60340f2;
    public final ib f60341g2;
    public final ArrayList f60342h2;
    public final v9 f60343i2;
    public int f60344j2;
    public int f60345k2;
    public int f60346l2;
    public int f60347m2;
    public boolean f60348n2;
    public boolean f60349o2;
    public boolean f60350p2;
    public gc f60351q2;
    public final w70 f60352r2;
    public boolean f60353s2;

    public g1(LaunchActivity launchActivity, int i7, long j3) {
        this(launchActivity, i7, j3, null, null);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.S1, 0, true, new p0(this, 0), this.I0);
        this.T1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.X1) {
            return id.M0(2131749939, null);
        }
        return i6.m(id.a0(null, null, 2131749848, this.Y1), null, false, null, 0);
    }

    public final void d1(ArrayList arrayList, m41 m41Var) {
        long j3;
        boolean z9;
        ArrayList arrayList2;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        boolean z12;
        boolean z13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z14;
        boolean z15;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        float f10;
        float f11;
        float f12;
        float f13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        vq0 vq0Var = this.f60336a2;
        long j10 = this.W1;
        long j11 = 0;
        boolean z16 = this.X1;
        if (z16 || j10 < 0 || ((disallowedGiftsSettings4 = this.V1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j3 = 0;
            z9 = false;
        } else {
            arrayList.add(x31.k(vq0Var));
            arrayList.add(x31.k(this.f60337b2));
            ArrayList arrayList3 = this.f60342h2;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList3.get(i7);
                    i7++;
                    int i10 = x0.f60606b;
                    long j12 = j11;
                    x31 K = x31.K(x0.class);
                    K.f40165u = 1;
                    K.G = (ug.j) obj;
                    arrayList.add(K);
                    j11 = j12;
                }
                j3 = j11;
            } else {
                j3 = 0;
                x31 q10 = x31.q(1, 34);
                q10.f40165u = 1;
                arrayList.add(q10);
                x31 q11 = x31.q(2, 34);
                q11.f40165u = 1;
                arrayList.add(q11);
                x31 q12 = x31.q(3, 34);
                q12.f40165u = 1;
                arrayList.add(q12);
            }
            z9 = true;
        }
        int i11 = this.S1;
        ea y10 = ea.y(i11, false);
        if (this.f60348n2) {
            arrayList2 = y10.J;
        } else {
            arrayList2 = y10.I;
        }
        if (this.V1 != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new hi.j1(this, 2)).collect(Collectors.toCollection(new nk(1)));
        }
        int i12 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
        if (i12 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new aa.m(7)).collect(Collectors.toCollection(new nk(1)));
        }
        int i13 = (j10 > p10.i(i11).e() ? 1 : (j10 == p10.i(i11).e() ? 0 : -1));
        v9 v9Var = this.f60343i2;
        if (i13 != 0 && v9Var != null) {
            ArrayList arrayList4 = v9Var.f4914l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        float f14 = 300.0f;
        if (!qp.s1(i11).Y5 && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.V1) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && v9Var != null && !v9Var.f4914l.isEmpty()))) {
            if (!z9) {
                arrayList.add(x31.k(vq0Var));
            } else {
                arrayList.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
            }
            arrayList.add(x31.k(this.f60338c2));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.V1;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f60345k2 = -1;
            this.f60344j2 = -1;
            if (!arrayList2.isEmpty()) {
                this.f60344j2 = arrayList5.size();
                arrayList5.add(id.M0(2131749950, null));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.V1;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z10) {
                this.f60345k2 = arrayList5.size();
                arrayList5.add(id.M0(2131749946, null));
            }
            this.f60346l2 = arrayList5.size();
            arrayList5.add(id.M0(2131749949, null));
            if (this.f60349o2 && !this.f60350p2) {
                this.f60350p2 = true;
                this.f60347m2 = this.f60346l2;
            }
            int i16 = this.f60347m2;
            m0 m0Var = new m0(this, 0);
            int i17 = e1.f60315b;
            x31 K2 = x31.K(e1.class);
            K2.d = 1;
            K2.G = arrayList5;
            K2.f40169z = i16;
            K2.H = m0Var;
            arrayList.add(K2);
            if (this.f60347m2 == this.f60346l2 && !z16 && i12 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != this.f60353s2) {
                this.f60353s2 = z11;
                ViewPropertyAnimator animate = this.f60340f2.animate();
                float f15 = 0.0f;
                float f16 = 1.0f;
                if (!z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (!z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.85f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(380L);
                wq wqVar = wq.h;
                duration.setInterpolator(wqVar).start();
                ViewPropertyAnimator animate2 = this.f60341g2.animate();
                if (z11) {
                    f15 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!z11) {
                    f16 = 0.85f;
                }
                scaleX2.scaleY(f16).setDuration(380L).setInterpolator(wqVar).start();
            }
            if (v9Var != null && this.f60347m2 == this.f60345k2) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = v9Var.f4914l;
                int size3 = arrayList6.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList6.get(i18);
                    i18++;
                    TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift2);
                    }
                }
            }
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList2.get(i20);
                int i21 = this.f60347m2;
                if (i21 == this.f60344j2 || i21 == this.f60345k2 || (i21 == this.f60346l2 && (starGift3.availability_resale > j3 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j3 && i21 != this.f60346l2) {
                        if (i21 == this.f60345k2) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.V1) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        x31 i22 = x0.i(i21, starGift3, z14, z15, false, false, false);
                        starGift = starGift3;
                        arrayList.add(i22);
                        i19++;
                    } else {
                        starGift = starGift3;
                    }
                    int i23 = this.f60347m2;
                    if (i23 == this.f60345k2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.V1) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    arrayList.add(x0.i(i23, starGift, z12, z13, true, false, false));
                    i19++;
                }
            }
            int i24 = this.f60347m2;
            int i25 = this.f60345k2;
            if (i24 == i25 && v9Var != null && !v9Var.f4912j) {
                v9Var.a();
                x31 q13 = x31.q(4, 34);
                q13.f40165u = 1;
                arrayList.add(q13);
                x31 q14 = x31.q(5, 34);
                q14.f40165u = 1;
                arrayList.add(q14);
                x31 q15 = x31.q(6, 34);
                q15.f40165u = 1;
                arrayList.add(q15);
            } else if (i24 != i25 && y10.C) {
                x31 q16 = x31.q(4, 34);
                q16.f40165u = 1;
                arrayList.add(q16);
                x31 q17 = x31.q(5, 34);
                q17.f40165u = 1;
                arrayList.add(q17);
                x31 q18 = x31.q(6, 34);
                q18.f40165u = 1;
                arrayList.add(q18);
            }
            if (i19 >= 9) {
                f14 = 40.0f;
            }
            arrayList.add(x31.D(org.telegram.messenger.g0.L(f14)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.V1;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(x31.D(org.telegram.messenger.g0.L(300.0f)));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i7 == qs.f25028j5) {
            f1();
        } else if (i7 == qs.F3) {
            m41 m41Var2 = this.T1;
            if (m41Var2 != null) {
                m41Var2.O(true);
            }
        } else if (i7 == qs.E0) {
            if (!this.I) {
                long longValue = ((Long) objArr[0]).longValue();
                long j3 = this.W1;
                if (longValue == j3 && j3 > 0) {
                    int i11 = this.S1;
                    TLRPC.UserFull b22 = qp.s1(i11).b2(j3);
                    if (j3 != p10.i(i11).e() && b22 != null) {
                        disallowedGiftsSettings = b22.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.V1 = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            org.telegram.messenger.camera.q.s(id.a0(null, null, 2131743742, m5.t(j3)), org.telegram.ui.Components.gc.a0(T), 2131624011, 36);
                            return;
                        }
                        return;
                    }
                    m41 m41Var3 = this.T1;
                    if (m41Var3 != null) {
                        m41Var3.O(true);
                    }
                }
                ArrayList arrayList = this.f60342h2;
                if (arrayList == null || arrayList.isEmpty()) {
                    f1();
                    m41 m41Var4 = this.T1;
                    if (m41Var4 != null) {
                        m41Var4.O(true);
                    }
                }
            }
        } else if (i7 == qs.I3) {
            if (!this.I) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new org.telegram.ui.Components.gc(this.f28675c, this.I0).s(starGift.sticker, id.M0(2131749967, null), org.telegram.messenger.g0.X2(id.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
                m41 m41Var5 = this.T1;
                if (m41Var5 != null) {
                    m41Var5.O(true);
                }
            }
        } else if (i7 == qs.G3 && objArr[1] == this.f60343i2 && (m41Var = this.T1) != null) {
            m41Var.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i7 = this.S1;
        qs.f(i7).n(this, qs.f25028j5);
        qs.f(i7).n(this, qs.F3);
        qs.f(i7).n(this, qs.E0);
        qs.f(i7).n(this, qs.I3);
        qs.f(i7).n(this, qs.G3);
    }

    public final void e1(boolean z9) {
        this.f60348n2 = z9;
        this.T1.O(false);
    }

    public final void f1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f60342h2;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.U1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j3 = 0;
            for (int size = this.U1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.U1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.U1.iterator();
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
                    ug.j jVar = new ug.j(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(jVar);
                    if (org.telegram.messenger.r2.b()) {
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    } else if (jVar.h() != null && org.telegram.messenger.r1.i().k()) {
                        ?? obj = new Object();
                        obj.f11118b = "inapp";
                        obj.f11117a = jVar.h();
                        arrayList2.add(obj.a());
                    }
                }
            }
            if (org.telegram.messenger.r2.b()) {
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    ((ug.j) obj2).f56654g = j3;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                org.telegram.messenger.r1.i().o(arrayList2, new u5.e(this, 15));
            }
        }
        if (arrayList.isEmpty()) {
            wg.r.j(this.S1, null, new m0(this, 1));
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        int i7 = this.S1;
        if (qp.s1(i7).v2()) {
            org.telegram.ui.b.b(i7);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.V1;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T != null) {
                org.telegram.messenger.camera.q.s(id.a0(null, null, 2131743742, m5.t(this.W1)), org.telegram.ui.Components.gc.a0(T), 2131624011, 36);
                return;
            }
            return;
        }
        super.show();
    }

    public g1(final android.content.Context r29, final int r30, final long r31, java.util.List r33, final org.telegram.messenger.c20 r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.g1.<init>(android.content.Context, int, long, java.util.List, org.telegram.messenger.c20):void");
    }
}
