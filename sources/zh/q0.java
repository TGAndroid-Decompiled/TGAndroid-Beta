package zh;

import android.view.ViewPropertyAnimator;
import bi.t9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vs0;
public final class q0 implements Utilities.Callback2 {
    public final int f53215a;
    public final Object f53216b;

    public q0(Object obj, int i10) {
        this.f53215a = i10;
        this.f53216b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        float f7;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        float f10;
        float f11;
        int i14;
        long j10;
        int i15 = this.f53215a;
        boolean z12 = false;
        Object obj3 = this.f53216b;
        switch (i15) {
            case 0:
                ((p1) obj3).U((ArrayList) obj, (j71) obj2);
                return;
            case 1:
                m2 m2Var = (m2) obj3;
                ArrayList arrayList = (ArrayList) obj;
                j71 j71Var = (j71) obj2;
                u6 u6Var = m2Var.f53142c;
                vs0 vs0Var = m2Var.f53140a;
                t9 t9Var = m2Var.e;
                if (t9Var != null) {
                    if ((!t9Var.e || t9Var.f5467g != 783) && t9Var.f5471l.size() <= 0) {
                        t9 t9Var2 = m2Var.e;
                        if (t9Var2.f5469j && !t9Var2.f5468i) {
                            return;
                        }
                    }
                    t9 t9Var3 = m2Var.e;
                    if (t9Var3 == null || (i13 = t9Var3.f5473n) == 0) {
                        i10 = 3;
                        i11 = 3;
                    } else {
                        i10 = 3;
                        i11 = Math.min(3, i13);
                    }
                    int max = Math.max(1, i11);
                    t9 t9Var4 = m2Var.e;
                    if (t9Var4 != null) {
                        ArrayList arrayList2 = t9Var4.f5471l;
                        int size = arrayList2.size();
                        int i16 = i10;
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj4 = arrayList2.get(i17);
                            i17++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z13 = m2Var.d;
                            int i18 = f1.f52966a;
                            t61 K = t61.K(f1.class);
                            K.f32881u = 1;
                            K.f32885z = 0;
                            K.G = savedStarGift;
                            K.f32877q = true;
                            K.f32867f = false;
                            K.f32878r = z13;
                            if (m2Var.h && (m2Var.e != vs0Var.d || savedStarGift.pinned_to_top)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.h = z10;
                            arrayList.add(K);
                            i16--;
                            if (i16 == 0) {
                                i16 = 3;
                            }
                        }
                        t9 t9Var5 = m2Var.e;
                        if (t9Var5.f5468i || !t9Var5.f5469j) {
                            int i19 = 0;
                            while (true) {
                                if (i16 <= 0) {
                                    i12 = 3;
                                } else {
                                    i12 = i16;
                                }
                                if (i19 < i12) {
                                    i19++;
                                    t61 q5 = t61.q(i19, 34);
                                    q5.f32881u = 1;
                                    arrayList.add(q5);
                                }
                            }
                        }
                    }
                    if (vs0Var.d == m2Var.e) {
                        arrayList.add(t61.D(AndroidUtilities.dp(20.0f)));
                        if (vs0Var.f53229c == UserConfig.getInstance(m2Var.f53141b).getClientUserId()) {
                            int i20 = y6.f23765z6;
                            int w02 = y6.w0(i20, u6Var);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp = AndroidUtilities.dp(24.0f);
                            int i21 = n2.f53159a;
                            t61 K2 = t61.K(n2.class);
                            K2.f32872l = string;
                            K2.f32885z = 17;
                            K2.B = w02;
                            K2.A = 14.0f;
                            K2.f32869i = dp;
                            K2.f32871k = 0;
                            K2.f32877q = false;
                            K2.G = u6Var;
                            K2.H = Integer.valueOf(i20);
                            arrayList.add(K2);
                        }
                        arrayList.add(t61.D(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList.isEmpty()) {
                        arrayList.add(t61.D(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList.isEmpty()) {
                        if (m2Var.H) {
                            f7 = 42.0f;
                        } else {
                            f7 = 12.0f;
                        }
                        arrayList.add(0, t61.D(AndroidUtilities.dp(f7)));
                    }
                    if (m2Var.f53143f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new q1(m2Var, max, 1));
                    }
                    vs0Var.p();
                    vs0Var.post(new ti.g(vs0Var, 23));
                    return;
                }
                return;
            case 2:
                h4 h4Var = (h4) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                j71 j71Var2 = (j71) obj2;
                u3 u3Var = h4Var.d;
                ArrayList arrayList4 = u3Var.d;
                int size2 = arrayList4.size();
                int i22 = 0;
                while (i22 < size2) {
                    Object obj5 = arrayList4.get(i22);
                    i22++;
                    arrayList3.add(f1.a(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (u3Var.f53278t || !u3Var.f53279u) {
                    t61 q9 = t61.q(-1, 34);
                    q9.f32881u = 1;
                    arrayList3.add(q9);
                    t61 q10 = t61.q(-2, 34);
                    q10.f32881u = 1;
                    arrayList3.add(q10);
                    t61 q11 = t61.q(-3, 34);
                    q11.f32881u = 1;
                    arrayList3.add(q11);
                    if (u3Var.d.isEmpty()) {
                        t61 q12 = t61.q(-4, 34);
                        q12.f32881u = 1;
                        arrayList3.add(q12);
                        t61 q13 = t61.q(-5, 34);
                        q13.f32881u = 1;
                        arrayList3.add(q13);
                        t61 q14 = t61.q(-6, 34);
                        q14.f32881u = 1;
                        arrayList3.add(q14);
                        t61 q15 = t61.q(-7, 34);
                        q15.f32881u = 1;
                        arrayList3.add(q15);
                        t61 q16 = t61.q(-8, 34);
                        q16.f32881u = 1;
                        arrayList3.add(q16);
                        t61 q17 = t61.q(-9, 34);
                        q17.f32881u = 1;
                        arrayList3.add(q17);
                        t61 q18 = t61.q(-10, 34);
                        q18.f32881u = 1;
                        arrayList3.add(q18);
                        t61 q19 = t61.q(-11, 34);
                        q19.f32881u = 1;
                        arrayList3.add(q19);
                        t61 q20 = t61.q(-12, 34);
                        q20.f32881u = 1;
                        arrayList3.add(q20);
                        t61 q21 = t61.q(-13, 34);
                        q21.f32881u = 1;
                        arrayList3.add(q21);
                        t61 q22 = t61.q(-14, 34);
                        q22.f32881u = 1;
                        arrayList3.add(q22);
                        t61 q23 = t61.q(-15, 34);
                        q23.f32881u = 1;
                        arrayList3.add(q23);
                    }
                }
                if (arrayList3.isEmpty() && !u3Var.f53278t) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (h4Var.f53032x != z11) {
                    h4Var.f53032x = z11;
                    h4Var.f53031w.setVisibility(0);
                    ViewPropertyAnimator animate = h4Var.f53031w.animate();
                    float f12 = 1.0f;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.95f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                    if (!z11) {
                        f12 = 0.95f;
                    }
                    scaleX.scaleY(f12).setInterpolator(ds.h).setDuration(320L).setListener(new b3(h4Var, z11, 1)).start();
                    return;
                }
                return;
            case 3:
                j71 j71Var3 = (j71) obj2;
                g4.T((g4) obj3, (ArrayList) obj);
                return;
            default:
                l4 l4Var = (l4) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                j71 j71Var4 = (j71) obj2;
                t9 t9Var6 = l4Var.Y;
                if (t9Var6 != null) {
                    ArrayList arrayList6 = t9Var6.f5471l;
                    arrayList5.add(t61.D(AndroidUtilities.dp(16.0f)));
                    if (t9Var6.f5468i && arrayList6.isEmpty()) {
                        t61 q24 = t61.q(1, 34);
                        q24.f32881u = 1;
                        arrayList5.add(q24);
                        t61 q25 = t61.q(2, 34);
                        q25.f32881u = 1;
                        arrayList5.add(q25);
                        t61 q26 = t61.q(3, 34);
                        q26.f32881u = 1;
                        arrayList5.add(q26);
                        t61 q27 = t61.q(4, 34);
                        q27.f32881u = 1;
                        arrayList5.add(q27);
                        t61 q28 = t61.q(5, 34);
                        q28.f32881u = 1;
                        arrayList5.add(q28);
                        t61 q29 = t61.q(6, 34);
                        q29.f32881u = 1;
                        arrayList5.add(q29);
                        t61 q30 = t61.q(7, 34);
                        q30.f32881u = 1;
                        arrayList5.add(q30);
                        t61 q31 = t61.q(8, 34);
                        q31.f32881u = 1;
                        arrayList5.add(q31);
                        t61 q32 = t61.q(9, 34);
                        q32.f32881u = 1;
                        arrayList5.add(q32);
                    } else {
                        int size3 = arrayList6.size();
                        int i23 = 3;
                        int i24 = 0;
                        while (i24 < size3) {
                            Object obj6 = arrayList6.get(i24);
                            i24++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(l4Var.X))) {
                                int i25 = f1.f52966a;
                                t61 K3 = t61.K(f1.class);
                                K3.f32881u = 1;
                                K3.f32885z = z12 ? 1 : 0;
                                K3.G = savedStarGift2;
                                K3.f32877q = true;
                                K3.f32867f = true;
                                K3.f32878r = z12;
                                HashSet hashSet = l4Var.Z;
                                int i26 = savedStarGift2.msg_id;
                                if (i26 == 0) {
                                    j10 = savedStarGift2.saved_id;
                                } else {
                                    j10 = i26;
                                }
                                K3.L(hashSet.contains(Long.valueOf(j10)));
                                K3.f32881u = 1;
                                arrayList5.add(K3);
                                i23--;
                                if (i23 == 0) {
                                    i23 = 3;
                                }
                                z12 = false;
                            }
                        }
                        if (t9Var6.f5468i || !t9Var6.f5469j) {
                            int i27 = 0;
                            while (true) {
                                if (i23 <= 0) {
                                    i14 = 3;
                                } else {
                                    i14 = i23;
                                }
                                if (i27 < i14) {
                                    i27++;
                                    t61 q33 = t61.q(i27, 34);
                                    q33.f32881u = 1;
                                    arrayList5.add(q33);
                                }
                            }
                        }
                    }
                    arrayList5.add(t61.D(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
        }
    }
}
