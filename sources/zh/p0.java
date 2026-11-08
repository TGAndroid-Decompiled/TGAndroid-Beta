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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
public final class p0 implements v10 {
    public final int f60499a;
    public final Object f60500b;

    public p0(Object obj, int i7) {
        this.f60499a = i7;
        this.f60500b = obj;
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
        int i14 = this.f60499a;
        int i15 = 3;
        boolean z12 = false;
        Object obj3 = this.f60500b;
        int i16 = 1;
        switch (i14) {
            case 0:
                ((g1) obj3).d1((ArrayList) obj, (l41) obj2);
                return;
            case 1:
                z1 z1Var = (z1) obj3;
                ArrayList arrayList = (ArrayList) obj;
                l41 l41Var = (l41) obj2;
                f6 f6Var = z1Var.f60624c;
                up0 up0Var = z1Var.f60622a;
                v9 v9Var = z1Var.f60625e;
                if (v9Var != null) {
                    if ((!v9Var.f4909e || v9Var.f4911g != 783) && v9Var.f4915l.size() <= 0) {
                        v9 v9Var2 = z1Var.f60625e;
                        if (v9Var2.f4913j && !v9Var2.f4912i) {
                            return;
                        }
                    }
                    v9 v9Var3 = z1Var.f60625e;
                    if (v9Var3 == null || (i12 = v9Var3.f4917n) == 0) {
                        i7 = 3;
                        i10 = 3;
                    } else {
                        i7 = 3;
                        i10 = Math.min(3, i12);
                    }
                    int max = Math.max(1, i10);
                    v9 v9Var4 = z1Var.f60625e;
                    if (v9Var4 != null) {
                        ArrayList arrayList2 = v9Var4.f4915l;
                        int size = arrayList2.size();
                        int i17 = i7;
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj4 = arrayList2.get(i18);
                            i18++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z13 = z1Var.d;
                            int i19 = x0.f60576b;
                            x31 K = x31.K(x0.class);
                            K.f40189u = 1;
                            K.f40193z = 0;
                            K.G = savedStarGift;
                            K.f40185q = true;
                            K.f40175f = false;
                            K.f40186r = z13;
                            if (z1Var.h && (z1Var.f60625e != up0Var.d || savedStarGift.pinned_to_top)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            K.h = z9;
                            arrayList.add(K);
                            i17--;
                            if (i17 == 0) {
                                i17 = 3;
                            }
                        }
                        v9 v9Var5 = z1Var.f60625e;
                        if (v9Var5.f4912i || !v9Var5.f4913j) {
                            int i20 = 0;
                            while (true) {
                                if (i17 <= 0) {
                                    i11 = 3;
                                } else {
                                    i11 = i17;
                                }
                                if (i20 < i11) {
                                    i20++;
                                    x31 q10 = x31.q(i20, 34);
                                    q10.f40189u = 1;
                                    arrayList.add(q10);
                                }
                            }
                        }
                    }
                    if (up0Var.d == z1Var.f60625e) {
                        arrayList.add(x31.D(org.telegram.messenger.g0.L(20.0f)));
                        if (up0Var.f60285c == p10.i(z1Var.f60623b).e()) {
                            int i21 = k6.f28262z6;
                            int w02 = k6.w0(i21, f6Var);
                            String M0 = id.M0(2131746672, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i22 = a2.f60204b;
                            x31 K2 = x31.K(a2.class);
                            K2.f40180l = M0;
                            K2.f40193z = 17;
                            K2.B = w02;
                            K2.A = 14.0f;
                            K2.f40177i = L;
                            K2.f40179k = 0;
                            K2.f40185q = false;
                            K2.G = f6Var;
                            K2.H = Integer.valueOf(i21);
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
                    if (z1Var.f60626f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new k1(z1Var, max, 1));
                    }
                    up0Var.p();
                    up0Var.post(new wg.p(up0Var, 11));
                    return;
                }
                return;
            case 2:
                l3 l3Var = (l3) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                l41 l41Var2 = (l41) obj2;
                b3 b3Var = l3Var.d;
                ArrayList arrayList4 = b3Var.d;
                int size2 = arrayList4.size();
                int i23 = 0;
                while (i23 < size2) {
                    Object obj5 = arrayList4.get(i23);
                    i23++;
                    arrayList3.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (b3Var.f60251t || !b3Var.f60252u) {
                    x31 q11 = x31.q(-1, 34);
                    q11.f40189u = 1;
                    arrayList3.add(q11);
                    x31 q12 = x31.q(-2, 34);
                    q12.f40189u = 1;
                    arrayList3.add(q12);
                    x31 q13 = x31.q(-3, 34);
                    q13.f40189u = 1;
                    arrayList3.add(q13);
                    if (b3Var.d.isEmpty()) {
                        x31 q14 = x31.q(-4, 34);
                        q14.f40189u = 1;
                        arrayList3.add(q14);
                        x31 q15 = x31.q(-5, 34);
                        q15.f40189u = 1;
                        arrayList3.add(q15);
                        x31 q16 = x31.q(-6, 34);
                        q16.f40189u = 1;
                        arrayList3.add(q16);
                        x31 q17 = x31.q(-7, 34);
                        q17.f40189u = 1;
                        arrayList3.add(q17);
                        x31 q18 = x31.q(-8, 34);
                        q18.f40189u = 1;
                        arrayList3.add(q18);
                        x31 q19 = x31.q(-9, 34);
                        q19.f40189u = 1;
                        arrayList3.add(q19);
                        x31 q20 = x31.q(-10, 34);
                        q20.f40189u = 1;
                        arrayList3.add(q20);
                        x31 q21 = x31.q(-11, 34);
                        q21.f40189u = 1;
                        arrayList3.add(q21);
                        x31 q22 = x31.q(-12, 34);
                        q22.f40189u = 1;
                        arrayList3.add(q22);
                        x31 q23 = x31.q(-13, 34);
                        q23.f40189u = 1;
                        arrayList3.add(q23);
                        x31 q24 = x31.q(-14, 34);
                        q24.f40189u = 1;
                        arrayList3.add(q24);
                        x31 q25 = x31.q(-15, 34);
                        q25.f40189u = 1;
                        arrayList3.add(q25);
                    }
                }
                if (arrayList3.isEmpty() && !b3Var.f60251t) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (l3Var.f60456y != z10) {
                    l3Var.f60456y = z10;
                    l3Var.f60455x.setVisibility(0);
                    ViewPropertyAnimator animate = l3Var.f60455x.animate();
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
                    scaleX.scaleY(f13).setInterpolator(xq.h).setDuration(320L).setListener(new n2(l3Var, z10, 1)).start();
                    return;
                }
                return;
            case 3:
                k3 k3Var = (k3) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                l41 l41Var3 = (l41) obj2;
                j3 j3Var = k3Var.Q1;
                if (j3Var != null) {
                    v9 v9Var6 = j3Var.f60407b;
                    b3 b3Var2 = j3Var.f60408c;
                    if (v9Var6 != null && b3Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(k3Var.f28616a).getCurrentTime();
                        arrayList5.add(x31.t(-1, id.M0(2131749771, null)));
                        ArrayList arrayList6 = v9Var6.f4915l;
                        int size3 = arrayList6.size();
                        boolean z14 = true;
                        int i24 = 0;
                        int i25 = 0;
                        while (i25 < size3) {
                            Object obj6 = arrayList6.get(i25);
                            i25++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            int i26 = i16;
                            boolean z15 = z14;
                            if (k3Var.Y1.contains(Long.valueOf(savedStarGift2.gift.f27185id))) {
                                z14 = z15;
                                i16 = i26;
                            } else {
                                if (savedStarGift2.can_craft_at <= currentTime) {
                                    z11 = i26;
                                } else {
                                    z11 = 0;
                                }
                                x31 i27 = x0.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i27.f40176g = z11;
                                arrayList5.add(i27);
                                i24++;
                                i16 = i26;
                                z14 = false;
                            }
                        }
                        int i28 = i16;
                        boolean z16 = z14;
                        if (!v9Var6.f4912i && v9Var6.f4913j) {
                            if (z16) {
                                arrayList5.add(x31.g(id.M0(2131749770, null)));
                            }
                        } else {
                            int i29 = i24 % 3;
                            int i30 = 6 - i29;
                            int i31 = 0;
                            while (i31 < i30) {
                                x31 q26 = x31.q((i31 - i29) + 1, 35);
                                q26.f40189u = i28;
                                arrayList5.add(q26);
                                i31++;
                                i28 = 1;
                            }
                        }
                        if (b3Var2.f60237e > 0 || k3Var.f60419b2) {
                            k3Var.f60419b2 = true;
                            String M02 = id.M0(2131749773, null);
                            x31 x31Var = new x31(42);
                            x31Var.d = -2;
                            x31Var.f40183o = M02;
                            arrayList5.add(x31Var);
                            HorizontalScrollView horizontalScrollView = k3Var.R1;
                            if (horizontalScrollView != null) {
                                arrayList5.add(x31.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList7 = b3Var2.d;
                            int size4 = arrayList7.size();
                            int i32 = 0;
                            while (i32 < size4) {
                                Object obj7 = arrayList7.get(i32);
                                i32++;
                                arrayList5.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (b3Var2.f60251t || !b3Var2.f60252u) {
                                x31 q27 = x31.q(10, 35);
                                q27.f40189u = 1;
                                arrayList5.add(q27);
                                x31 q28 = x31.q(11, 35);
                                q28.f40189u = 1;
                                arrayList5.add(q28);
                                x31 q29 = x31.q(12, 35);
                                q29.f40189u = 1;
                                arrayList5.add(q29);
                                x31 q30 = x31.q(13, 35);
                                q30.f40189u = 1;
                                arrayList5.add(q30);
                                x31 q31 = x31.q(14, 35);
                                q31.f40189u = 1;
                                arrayList5.add(q31);
                                x31 q32 = x31.q(15, 35);
                                q32.f40189u = 1;
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
                n3 n3Var = (n3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                l41 l41Var4 = (l41) obj2;
                v9 v9Var7 = n3Var.Q1;
                if (v9Var7 != null) {
                    ArrayList arrayList9 = v9Var7.f4915l;
                    arrayList8.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
                    if (v9Var7.f4912i && arrayList9.isEmpty()) {
                        x31 q33 = x31.q(1, 34);
                        q33.f40189u = 1;
                        arrayList8.add(q33);
                        x31 q34 = x31.q(2, 34);
                        q34.f40189u = 1;
                        arrayList8.add(q34);
                        x31 q35 = x31.q(3, 34);
                        q35.f40189u = 1;
                        arrayList8.add(q35);
                        x31 q36 = x31.q(4, 34);
                        q36.f40189u = 1;
                        arrayList8.add(q36);
                        x31 q37 = x31.q(5, 34);
                        q37.f40189u = 1;
                        arrayList8.add(q37);
                        x31 q38 = x31.q(6, 34);
                        q38.f40189u = 1;
                        arrayList8.add(q38);
                        x31 q39 = x31.q(7, 34);
                        q39.f40189u = 1;
                        arrayList8.add(q39);
                        x31 q40 = x31.q(8, 34);
                        q40.f40189u = 1;
                        arrayList8.add(q40);
                        x31 q41 = x31.q(9, 34);
                        q41.f40189u = 1;
                        arrayList8.add(q41);
                    } else {
                        int size5 = arrayList9.size();
                        int i33 = 3;
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj8 = arrayList9.get(i34);
                            i34++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(n3Var.P1))) {
                                int i35 = x0.f60576b;
                                x31 K3 = x31.K(x0.class);
                                K3.f40189u = 1;
                                K3.f40193z = z12 ? 1 : 0;
                                K3.G = savedStarGift3;
                                K3.f40185q = true;
                                K3.f40175f = true;
                                K3.f40186r = z12;
                                HashSet hashSet = n3Var.R1;
                                int i36 = i15;
                                int i37 = savedStarGift3.msg_id;
                                n3 n3Var2 = n3Var;
                                if (i37 == 0) {
                                    j3 = savedStarGift3.saved_id;
                                } else {
                                    j3 = i37;
                                }
                                K3.L(hashSet.contains(Long.valueOf(j3)));
                                K3.f40189u = 1;
                                arrayList8.add(K3);
                                i33--;
                                if (i33 == 0) {
                                    i33 = i36;
                                }
                                i15 = i36;
                                n3Var = n3Var2;
                                z12 = false;
                            }
                        }
                        int i38 = i15;
                        if (v9Var7.f4912i || !v9Var7.f4913j) {
                            int i39 = 0;
                            while (true) {
                                if (i33 <= 0) {
                                    i13 = i38;
                                } else {
                                    i13 = i33;
                                }
                                if (i39 < i13) {
                                    i39++;
                                    x31 q42 = x31.q(i39, 34);
                                    q42.f40189u = 1;
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
