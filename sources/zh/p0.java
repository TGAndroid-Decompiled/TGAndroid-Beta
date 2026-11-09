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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.b50;
public final class p0 implements v10 {
    public final int f60508a;
    public final Object f60509b;

    public p0(Object obj, int i7) {
        this.f60508a = i7;
        this.f60509b = obj;
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
        int i14 = this.f60508a;
        int i15 = 3;
        int i16 = 0;
        int i17 = 1;
        Object obj3 = this.f60509b;
        switch (i14) {
            case 0:
                ((g1) obj3).d1((ArrayList) obj, (m41) obj2);
                return;
            case 1:
                z1 z1Var = (z1) obj3;
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                g6 g6Var = z1Var.f60641c;
                vp0 vp0Var = z1Var.f60639a;
                v9 v9Var = z1Var.f60642e;
                if (v9Var != null) {
                    if ((!v9Var.f4907e || v9Var.f4909g != 783) && v9Var.f4913l.size() <= 0) {
                        v9 v9Var2 = z1Var.f60642e;
                        if (v9Var2.f4911j && !v9Var2.f4910i) {
                            return;
                        }
                    }
                    v9 v9Var3 = z1Var.f60642e;
                    if (v9Var3 == null || (i12 = v9Var3.f4915n) == 0) {
                        i7 = 3;
                        i10 = 3;
                    } else {
                        i7 = 3;
                        i10 = Math.min(3, i12);
                    }
                    int max = Math.max(1, i10);
                    v9 v9Var4 = z1Var.f60642e;
                    if (v9Var4 != null) {
                        ArrayList arrayList2 = v9Var4.f4913l;
                        int size = arrayList2.size();
                        int i18 = i7;
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj4 = arrayList2.get(i19);
                            i19++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z12 = z1Var.d;
                            int i20 = x0.f60594b;
                            y31 K = y31.K(x0.class);
                            K.f40577u = 1;
                            K.f40581z = 0;
                            K.G = savedStarGift;
                            K.f40573q = true;
                            K.f40563f = false;
                            K.f40574r = z12;
                            if (z1Var.h && (z1Var.f60642e != vp0Var.d || savedStarGift.pinned_to_top)) {
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
                        v9 v9Var5 = z1Var.f60642e;
                        if (v9Var5.f4910i || !v9Var5.f4911j) {
                            int i21 = 0;
                            while (true) {
                                if (i18 <= 0) {
                                    i11 = 3;
                                } else {
                                    i11 = i18;
                                }
                                if (i21 < i11) {
                                    i21++;
                                    y31 q10 = y31.q(i21, 34);
                                    q10.f40577u = 1;
                                    arrayList.add(q10);
                                }
                            }
                        }
                    }
                    if (vp0Var.d == z1Var.f60642e) {
                        arrayList.add(y31.D(org.telegram.messenger.g0.L(20.0f)));
                        if (vp0Var.f60294c == p10.i(z1Var.f60640b).e()) {
                            int i22 = l6.f28275z6;
                            int w02 = l6.w0(i22, g6Var);
                            String M0 = id.M0(2131746671, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i23 = a2.f60213b;
                            y31 K2 = y31.K(a2.class);
                            K2.f40568l = M0;
                            K2.f40581z = 17;
                            K2.B = w02;
                            K2.A = 14.0f;
                            K2.f40565i = L;
                            K2.f40567k = 0;
                            K2.f40573q = false;
                            K2.G = g6Var;
                            K2.H = Integer.valueOf(i22);
                            arrayList.add(K2);
                        }
                        arrayList.add(y31.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList.isEmpty()) {
                        arrayList.add(y31.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList.isEmpty()) {
                        if (z1Var.H) {
                            f10 = 42.0f;
                        } else {
                            f10 = 12.0f;
                        }
                        arrayList.add(0, y31.D(org.telegram.messenger.g0.L(f10)));
                    }
                    if (z1Var.f60643f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new k1(z1Var, max, 1));
                    }
                    vp0Var.p();
                    vp0Var.post(new wg.a0(vp0Var, 9));
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
                if (c3Var.f60278t || !c3Var.f60279u) {
                    y31 q11 = y31.q(-1, 34);
                    q11.f40577u = 1;
                    arrayList3.add(q11);
                    y31 q12 = y31.q(-2, 34);
                    q12.f40577u = 1;
                    arrayList3.add(q12);
                    y31 q13 = y31.q(-3, 34);
                    q13.f40577u = 1;
                    arrayList3.add(q13);
                    if (c3Var.d.isEmpty()) {
                        y31 q14 = y31.q(-4, 34);
                        q14.f40577u = 1;
                        arrayList3.add(q14);
                        y31 q15 = y31.q(-5, 34);
                        q15.f40577u = 1;
                        arrayList3.add(q15);
                        y31 q16 = y31.q(-6, 34);
                        q16.f40577u = 1;
                        arrayList3.add(q16);
                        y31 q17 = y31.q(-7, 34);
                        q17.f40577u = 1;
                        arrayList3.add(q17);
                        y31 q18 = y31.q(-8, 34);
                        q18.f40577u = 1;
                        arrayList3.add(q18);
                        y31 q19 = y31.q(-9, 34);
                        q19.f40577u = 1;
                        arrayList3.add(q19);
                        y31 q20 = y31.q(-10, 34);
                        q20.f40577u = 1;
                        arrayList3.add(q20);
                        y31 q21 = y31.q(-11, 34);
                        q21.f40577u = 1;
                        arrayList3.add(q21);
                        y31 q22 = y31.q(-12, 34);
                        q22.f40577u = 1;
                        arrayList3.add(q22);
                        y31 q23 = y31.q(-13, 34);
                        q23.f40577u = 1;
                        arrayList3.add(q23);
                        y31 q24 = y31.q(-14, 34);
                        q24.f40577u = 1;
                        arrayList3.add(q24);
                        y31 q25 = y31.q(-15, 34);
                        q25.f40577u = 1;
                        arrayList3.add(q25);
                    }
                }
                if (arrayList3.isEmpty() && !c3Var.f60278t) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (m3Var.f60478x != z10) {
                    m3Var.f60478x = z10;
                    m3Var.f60477w.setVisibility(0);
                    ViewPropertyAnimator animate = m3Var.f60477w.animate();
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
                    scaleX.scaleY(f13).setInterpolator(xq.h).setDuration(320L).setListener(new b50(17, m3Var, z10)).start();
                    return;
                }
                return;
            case 3:
                l3 l3Var = (l3) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                m41 m41Var3 = (m41) obj2;
                k3 k3Var = l3Var.Q1;
                if (k3Var != null) {
                    v9 v9Var6 = k3Var.f60427b;
                    c3 c3Var2 = k3Var.f60428c;
                    if (v9Var6 != null && c3Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(l3Var.f28621a).getCurrentTime();
                        arrayList5.add(y31.t(-1, id.M0(2131749770, null)));
                        ArrayList arrayList6 = v9Var6.f4913l;
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
                            if (l3Var.Y1.contains(Long.valueOf(savedStarGift2.gift.f27185id))) {
                                i17 = i27;
                                l3Var = l3Var2;
                            } else {
                                if (savedStarGift2.can_craft_at <= currentTime) {
                                    z11 = i27;
                                } else {
                                    z11 = 0;
                                }
                                y31 i28 = x0.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i28.f40564g = z11;
                                arrayList5.add(i28);
                                i25++;
                                i17 = i27;
                                l3Var = l3Var2;
                                z13 = false;
                            }
                        }
                        int i29 = i17;
                        l3 l3Var3 = l3Var;
                        if (!v9Var6.f4910i && v9Var6.f4911j) {
                            if (z13) {
                                arrayList5.add(y31.g(id.M0(2131749769, null)));
                            }
                        } else {
                            int i30 = i25 % 3;
                            int i31 = 6 - i30;
                            int i32 = 0;
                            while (i32 < i31) {
                                y31 q26 = y31.q((i32 - i30) + 1, 35);
                                q26.f40577u = i29;
                                arrayList5.add(q26);
                                i32++;
                                i29 = 1;
                            }
                        }
                        if (c3Var2.f60264e > 0 || l3Var3.f60458b2) {
                            l3Var3.f60458b2 = true;
                            String M02 = id.M0(2131749772, null);
                            y31 y31Var = new y31(42);
                            y31Var.d = -2;
                            y31Var.f40571o = M02;
                            arrayList5.add(y31Var);
                            HorizontalScrollView horizontalScrollView = l3Var3.R1;
                            if (horizontalScrollView != null) {
                                arrayList5.add(y31.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList7 = c3Var2.d;
                            int size4 = arrayList7.size();
                            int i33 = 0;
                            while (i33 < size4) {
                                Object obj7 = arrayList7.get(i33);
                                i33++;
                                arrayList5.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (c3Var2.f60278t || !c3Var2.f60279u) {
                                y31 q27 = y31.q(10, 35);
                                q27.f40577u = 1;
                                arrayList5.add(q27);
                                y31 q28 = y31.q(11, 35);
                                q28.f40577u = 1;
                                arrayList5.add(q28);
                                y31 q29 = y31.q(12, 35);
                                q29.f40577u = 1;
                                arrayList5.add(q29);
                                y31 q30 = y31.q(13, 35);
                                q30.f40577u = 1;
                                arrayList5.add(q30);
                                y31 q31 = y31.q(14, 35);
                                q31.f40577u = 1;
                                arrayList5.add(q31);
                                y31 q32 = y31.q(15, 35);
                                q32.f40577u = 1;
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
                v9 v9Var7 = o3Var.Q1;
                if (v9Var7 != null) {
                    ArrayList arrayList9 = v9Var7.f4913l;
                    arrayList8.add(y31.D(org.telegram.messenger.g0.L(16.0f)));
                    if (v9Var7.f4910i && arrayList9.isEmpty()) {
                        y31 q33 = y31.q(1, 34);
                        q33.f40577u = 1;
                        arrayList8.add(q33);
                        y31 q34 = y31.q(2, 34);
                        q34.f40577u = 1;
                        arrayList8.add(q34);
                        y31 q35 = y31.q(3, 34);
                        q35.f40577u = 1;
                        arrayList8.add(q35);
                        y31 q36 = y31.q(4, 34);
                        q36.f40577u = 1;
                        arrayList8.add(q36);
                        y31 q37 = y31.q(5, 34);
                        q37.f40577u = 1;
                        arrayList8.add(q37);
                        y31 q38 = y31.q(6, 34);
                        q38.f40577u = 1;
                        arrayList8.add(q38);
                        y31 q39 = y31.q(7, 34);
                        q39.f40577u = 1;
                        arrayList8.add(q39);
                        y31 q40 = y31.q(8, 34);
                        q40.f40577u = 1;
                        arrayList8.add(q40);
                        y31 q41 = y31.q(9, 34);
                        q41.f40577u = 1;
                        arrayList8.add(q41);
                    } else {
                        int size5 = arrayList9.size();
                        int i34 = 3;
                        int i35 = 0;
                        while (i35 < size5) {
                            Object obj8 = arrayList9.get(i35);
                            i35++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(o3Var.P1))) {
                                int i36 = x0.f60594b;
                                y31 K3 = y31.K(x0.class);
                                K3.f40577u = 1;
                                K3.f40581z = 0;
                                K3.G = savedStarGift3;
                                K3.f40573q = true;
                                K3.f40563f = true;
                                K3.f40574r = false;
                                HashSet hashSet = o3Var.R1;
                                int i37 = i15;
                                int i38 = savedStarGift3.msg_id;
                                if (i38 == 0) {
                                    j3 = savedStarGift3.saved_id;
                                } else {
                                    j3 = i38;
                                }
                                K3.L(hashSet.contains(Long.valueOf(j3)));
                                K3.f40577u = 1;
                                arrayList8.add(K3);
                                i34--;
                                if (i34 == 0) {
                                    i34 = i37;
                                }
                                i15 = i37;
                            }
                        }
                        int i39 = i15;
                        if (v9Var7.f4910i || !v9Var7.f4911j) {
                            while (true) {
                                if (i34 <= 0) {
                                    i13 = i39;
                                } else {
                                    i13 = i34;
                                }
                                if (i16 < i13) {
                                    i16++;
                                    y31 q42 = y31.q(i16, 34);
                                    q42.f40577u = 1;
                                    arrayList8.add(q42);
                                }
                            }
                        }
                    }
                    arrayList8.add(y31.D(org.telegram.messenger.g0.L(68.0f)));
                    return;
                }
                return;
        }
    }
}
