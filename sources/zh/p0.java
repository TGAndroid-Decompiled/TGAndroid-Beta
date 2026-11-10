package zh;

import android.view.ViewPropertyAnimator;
import android.widget.HorizontalScrollView;
import bi.v9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.c50;
public final class p0 implements v10 {
    public final int f60517a;
    public final Object f60518b;

    public p0(Object obj, int i7) {
        this.f60517a = i7;
        this.f60518b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        float f10;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        float f11;
        float f12;
        boolean z11;
        int i13;
        long j3;
        int i14 = this.f60517a;
        int i15 = 3;
        int i16 = 0;
        int i17 = 1;
        Object obj3 = this.f60518b;
        switch (i14) {
            case 0:
                ((g1) obj3).d1((ArrayList) obj, (m41) obj2);
                return;
            case 1:
                z1 z1Var = (z1) obj3;
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                h6 h6Var = z1Var.f60653c;
                up0 up0Var = z1Var.f60651a;
                v9 v9Var = z1Var.f60654e;
                if (v9Var != null) {
                    if ((!v9Var.f4908e || v9Var.f4910g != 783) && v9Var.f4914l.size() <= 0) {
                        v9 v9Var2 = z1Var.f60654e;
                        if (v9Var2.f4912j && !v9Var2.f4911i) {
                            return;
                        }
                    }
                    v9 v9Var3 = z1Var.f60654e;
                    if (v9Var3 == null || (i12 = v9Var3.f4916n) == 0) {
                        i7 = 3;
                        i10 = 3;
                    } else {
                        i7 = 3;
                        i10 = Math.min(3, i12);
                    }
                    int max = Math.max(1, i10);
                    v9 v9Var4 = z1Var.f60654e;
                    if (v9Var4 != null) {
                        ArrayList arrayList2 = v9Var4.f4914l;
                        int size = arrayList2.size();
                        int i18 = i7;
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj4 = arrayList2.get(i19);
                            i19++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z12 = z1Var.d;
                            int i20 = x0.f60606b;
                            x31 K = x31.K(x0.class);
                            K.f40165u = 1;
                            K.f40169z = 0;
                            K.G = savedStarGift;
                            K.f40161q = true;
                            K.f40151f = false;
                            K.f40162r = z12;
                            if (z1Var.h && (z1Var.f60654e != up0Var.d || savedStarGift.pinned_to_top)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            K.h = z9;
                            arrayList.add(K);
                            i18--;
                            if (i18 == 0) {
                                i18 = 3;
                            }
                        }
                        v9 v9Var5 = z1Var.f60654e;
                        if (v9Var5.f4911i || !v9Var5.f4912j) {
                            int i21 = 0;
                            while (true) {
                                if (i18 <= 0) {
                                    i11 = 3;
                                } else {
                                    i11 = i18;
                                }
                                if (i21 < i11) {
                                    i21++;
                                    x31 q10 = x31.q(i21, 34);
                                    q10.f40165u = 1;
                                    arrayList.add(q10);
                                }
                            }
                        }
                    }
                    if (up0Var.d == z1Var.f60654e) {
                        arrayList.add(x31.D(org.telegram.messenger.g0.L(20.0f)));
                        if (up0Var.f60296c == p10.i(z1Var.f60652b).e()) {
                            int i22 = m6.f28300z6;
                            int w02 = m6.w0(i22, h6Var);
                            String M0 = id.M0(2131746671, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i23 = a2.f60211b;
                            x31 K2 = x31.K(a2.class);
                            K2.f40156l = M0;
                            K2.f40169z = 17;
                            K2.B = w02;
                            K2.A = 14.0f;
                            K2.f40153i = L;
                            K2.f40155k = 0;
                            K2.f40161q = false;
                            K2.G = h6Var;
                            K2.H = Integer.valueOf(i22);
                            arrayList.add(K2);
                        }
                        arrayList.add(x31.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList.isEmpty()) {
                        arrayList.add(x31.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList.isEmpty()) {
                        if (z1Var.H) {
                            f10 = 42.0f;
                        } else {
                            f10 = 12.0f;
                        }
                        arrayList.add(0, x31.D(org.telegram.messenger.g0.L(f10)));
                    }
                    if (z1Var.f60655f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new k1(z1Var, max, 1));
                    }
                    up0Var.p();
                    up0Var.post(new wg.a0(up0Var, 9));
                    return;
                }
                return;
            case 2:
                m3 m3Var = (m3) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                m41 m41Var2 = (m41) obj2;
                c3 c3Var = m3Var.d;
                ArrayList arrayList4 = c3Var.d;
                int size2 = arrayList4.size();
                int i24 = 0;
                while (i24 < size2) {
                    Object obj5 = arrayList4.get(i24);
                    i24++;
                    arrayList3.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (c3Var.f60280t || !c3Var.f60281u) {
                    x31 q11 = x31.q(-1, 34);
                    q11.f40165u = 1;
                    arrayList3.add(q11);
                    x31 q12 = x31.q(-2, 34);
                    q12.f40165u = 1;
                    arrayList3.add(q12);
                    x31 q13 = x31.q(-3, 34);
                    q13.f40165u = 1;
                    arrayList3.add(q13);
                    if (c3Var.d.isEmpty()) {
                        x31 q14 = x31.q(-4, 34);
                        q14.f40165u = 1;
                        arrayList3.add(q14);
                        x31 q15 = x31.q(-5, 34);
                        q15.f40165u = 1;
                        arrayList3.add(q15);
                        x31 q16 = x31.q(-6, 34);
                        q16.f40165u = 1;
                        arrayList3.add(q16);
                        x31 q17 = x31.q(-7, 34);
                        q17.f40165u = 1;
                        arrayList3.add(q17);
                        x31 q18 = x31.q(-8, 34);
                        q18.f40165u = 1;
                        arrayList3.add(q18);
                        x31 q19 = x31.q(-9, 34);
                        q19.f40165u = 1;
                        arrayList3.add(q19);
                        x31 q20 = x31.q(-10, 34);
                        q20.f40165u = 1;
                        arrayList3.add(q20);
                        x31 q21 = x31.q(-11, 34);
                        q21.f40165u = 1;
                        arrayList3.add(q21);
                        x31 q22 = x31.q(-12, 34);
                        q22.f40165u = 1;
                        arrayList3.add(q22);
                        x31 q23 = x31.q(-13, 34);
                        q23.f40165u = 1;
                        arrayList3.add(q23);
                        x31 q24 = x31.q(-14, 34);
                        q24.f40165u = 1;
                        arrayList3.add(q24);
                        x31 q25 = x31.q(-15, 34);
                        q25.f40165u = 1;
                        arrayList3.add(q25);
                    }
                }
                if (arrayList3.isEmpty() && !c3Var.f60280t) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (m3Var.f60485x != z10) {
                    m3Var.f60485x = z10;
                    m3Var.f60484w.setVisibility(0);
                    ViewPropertyAnimator animate = m3Var.f60484w.animate();
                    float f13 = 1.0f;
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f11);
                    if (z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.95f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                    if (!z10) {
                        f13 = 0.95f;
                    }
                    scaleX.scaleY(f13).setInterpolator(wq.h).setDuration(320L).setListener(new c50(17, m3Var, z10)).start();
                    return;
                }
                return;
            case 3:
                l3 l3Var = (l3) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                m41 m41Var3 = (m41) obj2;
                k3 k3Var = l3Var.T1;
                if (k3Var != null) {
                    v9 v9Var6 = k3Var.f60429b;
                    c3 c3Var2 = k3Var.f60430c;
                    if (v9Var6 != null && c3Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(l3Var.f28669a).getCurrentTime();
                        arrayList5.add(x31.t(-1, id.M0(2131749770, null)));
                        ArrayList arrayList6 = v9Var6.f4914l;
                        int size3 = arrayList6.size();
                        int i25 = 0;
                        int i26 = 0;
                        boolean z13 = true;
                        while (i26 < size3) {
                            Object obj6 = arrayList6.get(i26);
                            i26++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            int i27 = i17;
                            l3 l3Var2 = l3Var;
                            if (l3Var.f60463b2.contains(Long.valueOf(savedStarGift2.gift.f27189id))) {
                                i17 = i27;
                                l3Var = l3Var2;
                            } else {
                                if (savedStarGift2.can_craft_at <= currentTime) {
                                    z11 = i27;
                                } else {
                                    z11 = 0;
                                }
                                x31 i28 = x0.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i28.f40152g = z11;
                                arrayList5.add(i28);
                                i25++;
                                i17 = i27;
                                l3Var = l3Var2;
                                z13 = false;
                            }
                        }
                        int i29 = i17;
                        l3 l3Var3 = l3Var;
                        if (!v9Var6.f4911i && v9Var6.f4912j) {
                            if (z13) {
                                arrayList5.add(x31.g(id.M0(2131749769, null)));
                            }
                        } else {
                            int i30 = i25 % 3;
                            int i31 = 6 - i30;
                            int i32 = 0;
                            while (i32 < i31) {
                                x31 q26 = x31.q((i32 - i30) + 1, 35);
                                q26.f40165u = i29;
                                arrayList5.add(q26);
                                i32++;
                                i29 = 1;
                            }
                        }
                        if (c3Var2.f60266e > 0 || l3Var3.f60465e2) {
                            l3Var3.f60465e2 = true;
                            String M02 = id.M0(2131749772, null);
                            x31 x31Var = new x31(42);
                            x31Var.d = -2;
                            x31Var.f40159o = M02;
                            arrayList5.add(x31Var);
                            HorizontalScrollView horizontalScrollView = l3Var3.U1;
                            if (horizontalScrollView != null) {
                                arrayList5.add(x31.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList7 = c3Var2.d;
                            int size4 = arrayList7.size();
                            int i33 = 0;
                            while (i33 < size4) {
                                Object obj7 = arrayList7.get(i33);
                                i33++;
                                arrayList5.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (c3Var2.f60280t || !c3Var2.f60281u) {
                                x31 q27 = x31.q(10, 35);
                                q27.f40165u = 1;
                                arrayList5.add(q27);
                                x31 q28 = x31.q(11, 35);
                                q28.f40165u = 1;
                                arrayList5.add(q28);
                                x31 q29 = x31.q(12, 35);
                                q29.f40165u = 1;
                                arrayList5.add(q29);
                                x31 q30 = x31.q(13, 35);
                                q30.f40165u = 1;
                                arrayList5.add(q30);
                                x31 q31 = x31.q(14, 35);
                                q31.f40165u = 1;
                                arrayList5.add(q31);
                                x31 q32 = x31.q(15, 35);
                                q32.f40165u = 1;
                                arrayList5.add(q32);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                o3 o3Var = (o3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                m41 m41Var4 = (m41) obj2;
                v9 v9Var7 = o3Var.T1;
                if (v9Var7 != null) {
                    ArrayList arrayList9 = v9Var7.f4914l;
                    arrayList8.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
                    if (v9Var7.f4911i && arrayList9.isEmpty()) {
                        x31 q33 = x31.q(1, 34);
                        q33.f40165u = 1;
                        arrayList8.add(q33);
                        x31 q34 = x31.q(2, 34);
                        q34.f40165u = 1;
                        arrayList8.add(q34);
                        x31 q35 = x31.q(3, 34);
                        q35.f40165u = 1;
                        arrayList8.add(q35);
                        x31 q36 = x31.q(4, 34);
                        q36.f40165u = 1;
                        arrayList8.add(q36);
                        x31 q37 = x31.q(5, 34);
                        q37.f40165u = 1;
                        arrayList8.add(q37);
                        x31 q38 = x31.q(6, 34);
                        q38.f40165u = 1;
                        arrayList8.add(q38);
                        x31 q39 = x31.q(7, 34);
                        q39.f40165u = 1;
                        arrayList8.add(q39);
                        x31 q40 = x31.q(8, 34);
                        q40.f40165u = 1;
                        arrayList8.add(q40);
                        x31 q41 = x31.q(9, 34);
                        q41.f40165u = 1;
                        arrayList8.add(q41);
                    } else {
                        int size5 = arrayList9.size();
                        int i34 = 3;
                        int i35 = 0;
                        while (i35 < size5) {
                            Object obj8 = arrayList9.get(i35);
                            i35++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(o3Var.S1))) {
                                int i36 = x0.f60606b;
                                x31 K3 = x31.K(x0.class);
                                K3.f40165u = 1;
                                K3.f40169z = 0;
                                K3.G = savedStarGift3;
                                K3.f40161q = true;
                                K3.f40151f = true;
                                K3.f40162r = false;
                                HashSet hashSet = o3Var.U1;
                                int i37 = i15;
                                int i38 = savedStarGift3.msg_id;
                                if (i38 == 0) {
                                    j3 = savedStarGift3.saved_id;
                                } else {
                                    j3 = i38;
                                }
                                K3.L(hashSet.contains(Long.valueOf(j3)));
                                K3.f40165u = 1;
                                arrayList8.add(K3);
                                i34--;
                                if (i34 == 0) {
                                    i34 = i37;
                                }
                                i15 = i37;
                            }
                        }
                        int i39 = i15;
                        if (v9Var7.f4911i || !v9Var7.f4912j) {
                            while (true) {
                                if (i34 <= 0) {
                                    i13 = i39;
                                } else {
                                    i13 = i34;
                                }
                                if (i16 < i13) {
                                    i16++;
                                    x31 q42 = x31.q(i16, 34);
                                    q42.f40165u = 1;
                                    arrayList8.add(q42);
                                }
                            }
                        }
                    }
                    arrayList8.add(x31.D(org.telegram.messenger.g0.L(68.0f)));
                    return;
                }
                return;
        }
    }
}
