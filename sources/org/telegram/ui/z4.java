package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z4 implements org.telegram.messenger.j20 {
    public final int f44007a;
    public final Object f44008b;

    public z4(Object obj, int i10) {
        this.f44007a = i10;
        this.f44008b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        boolean z16;
        s31 s31Var = (s31) this.f44008b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.p51 p51Var = (org.telegram.ui.Components.p51) obj2;
        r31 r31Var = s31Var.Y1;
        r31 r31Var2 = s31Var.X1;
        TLRPC.User user = s31Var.Q1;
        r31 r31Var3 = s31Var.W1;
        if (r31Var3 != null) {
            ArrayList arrayList2 = r31Var3.d;
            if (r31Var2 != null) {
                ArrayList arrayList3 = r31Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.d20.i(s31Var.f21583a).e()));
                arrayList.add(org.telegram.ui.Components.a51.E(3, org.telegram.messenger.i0.L(64.0f)));
                if (r31Var != null && !TextUtils.isEmpty(r31Var.f41127c.f19792q)) {
                    ArrayList arrayList4 = r31Var.d;
                    int size = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList4.get(i15);
                        i15++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject)));
                            org.telegram.ui.Components.a51 w9 = org.telegram.ui.Components.a51.w(tLObject);
                            if (org.telegram.messenger.o5.d(tLObject) == org.telegram.messenger.o5.d(s31Var.S1)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            w9.L(z16);
                            arrayList.add(w9);
                        }
                    }
                    if (r31Var.f41128f) {
                        arrayList.add(org.telegram.ui.Components.a51.p(29));
                        arrayList.add(org.telegram.ui.Components.a51.p(29));
                        arrayList.add(org.telegram.ui.Components.a51.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.a51.k(s31Var.V1));
                        return;
                    }
                    return;
                }
                if (user != null) {
                    int size2 = arrayList2.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size2) {
                            break;
                        }
                        Object obj4 = arrayList2.get(i16);
                        i16++;
                        if (org.telegram.messenger.o5.d((TLObject) obj4) == org.telegram.messenger.o5.d(user)) {
                            if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(user)))) {
                                if (org.telegram.messenger.w3.V(s31Var.P1)) {
                                    i14 = 2131752516;
                                } else {
                                    i14 = 2131749508;
                                }
                                arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(i14, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(user)));
                                org.telegram.ui.Components.a51 w10 = org.telegram.ui.Components.a51.w(user);
                                i10 = 29;
                                if (org.telegram.messenger.o5.d(user) == org.telegram.messenger.o5.d(s31Var.S1)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                w10.L(z15);
                                arrayList.add(w10);
                                z10 = false;
                            }
                        }
                    }
                }
                i10 = 29;
                z10 = true;
                int size3 = arrayList2.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj5 = arrayList2.get(i17);
                    i17++;
                    TLObject tLObject2 = (TLObject) obj5;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(tLObject2)))) {
                        if (z10) {
                            if (org.telegram.messenger.w3.V(s31Var.P1)) {
                                i13 = 2131752516;
                            } else {
                                i13 = 2131749508;
                            }
                            arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(i13, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject2)));
                        org.telegram.ui.Components.a51 w11 = org.telegram.ui.Components.a51.w(tLObject2);
                        if (org.telegram.messenger.o5.d(tLObject2) == org.telegram.messenger.o5.d(s31Var.S1)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w11.L(z14);
                        arrayList.add(w11);
                    }
                }
                if (r31Var3.f41128f) {
                    arrayList.add(org.telegram.ui.Components.a51.p(i10));
                    arrayList.add(org.telegram.ui.Components.a51.p(i10));
                    arrayList.add(org.telegram.ui.Components.a51.p(i10));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(user)))) {
                    if (org.telegram.messenger.w3.V(s31Var.P1)) {
                        i12 = 2131752288;
                    } else {
                        i12 = 2131749437;
                    }
                    arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(i12, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(user)));
                    org.telegram.ui.Components.a51 w12 = org.telegram.ui.Components.a51.w(user);
                    if (org.telegram.messenger.o5.d(user) == org.telegram.messenger.o5.d(s31Var.S1)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    w12.L(z13);
                    arrayList.add(w12);
                    z11 = false;
                } else {
                    z11 = true;
                }
                int size4 = arrayList3.size();
                int i18 = 0;
                while (i18 < size4) {
                    Object obj6 = arrayList3.get(i18);
                    i18++;
                    TLObject tLObject3 = (TLObject) obj6;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(tLObject3)))) {
                        if (z11) {
                            if (org.telegram.messenger.w3.V(s31Var.P1)) {
                                i11 = 2131752288;
                            } else {
                                i11 = 2131749437;
                            }
                            arrayList.add(org.telegram.ui.Components.a51.r(org.telegram.messenger.cd.L0(i11, null)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject3)));
                        org.telegram.ui.Components.a51 w13 = org.telegram.ui.Components.a51.w(tLObject3);
                        if (org.telegram.messenger.o5.d(tLObject3) == org.telegram.messenger.o5.d(s31Var.S1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w13.L(z12);
                        arrayList.add(w13);
                    }
                }
                if (!arrayList3.isEmpty() && r31Var2.f41128f) {
                    arrayList.add(org.telegram.ui.Components.a51.p(i10));
                    arrayList.add(org.telegram.ui.Components.a51.p(i10));
                    arrayList.add(org.telegram.ui.Components.a51.p(i10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        m51 m51Var = (m51) this.f44008b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.p51 p51Var = (org.telegram.ui.Components.p51) obj2;
        LinearLayout linearLayout = m51Var.Q1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.a51.k(linearLayout));
        }
        LinearLayout linearLayout2 = m51Var.R1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.a51.k(linearLayout2));
        }
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat L0;
        int i10;
        int i11;
        g61 g61Var;
        ArrayList arrayList;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        float f7;
        String str2;
        int i12;
        boolean z10;
        int i13;
        int i14;
        long j10;
        TL_stories.StoryItem storyItem;
        float f10;
        float f11 = 0.25f;
        int i15 = 2;
        org.telegram.ui.Components.vg vgVar = null;
        boolean z11 = true;
        int i16 = 0;
        switch (this.f44007a) {
            case 0:
                a5 a5Var = (a5) this.f44008b;
                a5Var.f35559w.setBackground(new BitmapDrawable((Bitmap) obj));
                a5Var.f35560x = false;
                hi.b bVar = a5Var.h;
                bVar.a((Bitmap) obj2);
                yg.d.c(bVar, a5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = a5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                j9 j9Var = (j9) this.f44008b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var = (org.telegram.ui.Components.p51) obj2;
                boolean isEmpty = j9Var.G.isEmpty();
                ArrayList arrayList3 = j9Var.f38475y;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.a51 c10 = org.telegram.ui.Components.a51.c(1, 2131231769, org.telegram.messenger.cd.L0(2131749499, null));
                    c10.f24297q = true;
                    arrayList2.add(c10);
                    if (!j9Var.getUserConfig().W) {
                        org.telegram.ui.Components.a51 c11 = org.telegram.ui.Components.a51.c(2, 2131231763, org.telegram.messenger.cd.L0(2131749470, null));
                        c11.f24297q = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.a51.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = j9Var.G;
                    int size = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList4.get(i17);
                        i17++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (L0 = j9Var.getMessagesController().L0(l4)) != null) {
                            k8 k8Var = new k8(j9Var, 0);
                            int i18 = h9.f37850b;
                            org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(h9.class);
                            K.G = L0;
                            K.D = k8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.a51.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    while (i16 < size2) {
                        Object obj4 = arrayList3.get(i16);
                        i16++;
                        g9 g9Var = (g9) obj4;
                        ag.t0 t0Var = new ag.t0(28, j9Var, g9Var);
                        int i19 = e9.f36991b;
                        org.telegram.ui.Components.a51 K2 = org.telegram.ui.Components.a51.K(e9.class);
                        K2.G = g9Var;
                        K2.D = t0Var;
                        K2.L(j9Var.j0(g9Var.f37491c));
                        arrayList2.add(K2);
                    }
                    if (!j9Var.F) {
                        arrayList2.add(org.telegram.ui.Components.a51.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.a51.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.a51.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                le leVar = (le) this.f44008b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var2 = (org.telegram.ui.Components.p51) obj2;
                leVar.R0 = -1;
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(leVar.f39206o0).L0(Long.valueOf(-leVar.f39208p0));
                TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(leVar.f39206o0).M0(-leVar.f39208p0);
                if (M0 != null) {
                    i10 = M0.stats_dc;
                } else {
                    i10 = -1;
                }
                if (leVar.f39193b1) {
                    arrayList5.add(org.telegram.ui.Components.a51.g(leVar.f39214s0));
                    g61 g61Var2 = leVar.l1;
                    if (g61Var2 != null && !g61Var2.f37441l) {
                        arrayList5.add(org.telegram.ui.Components.a51.h(5, i10, g61Var2));
                        arrayList5.add(org.telegram.ui.Components.a51.B(-1, null));
                    }
                    g61 g61Var3 = leVar.f39203m1;
                    if (g61Var3 != null && !g61Var3.f37441l) {
                        arrayList5.add(org.telegram.ui.Components.a51.h(2, i10, g61Var3));
                        arrayList5.add(org.telegram.ui.Components.a51.B(-2, null));
                    }
                }
                if (leVar.f39194c1 && (g61Var = leVar.f39205n1) != null && !g61Var.f37441l) {
                    arrayList5.add(org.telegram.ui.Components.a51.h(2, i10, g61Var));
                    arrayList5.add(org.telegram.ui.Components.a51.B(-3, null));
                }
                if (leVar.f39207o1) {
                    arrayList5.add(org.telegram.ui.Components.a51.b(org.telegram.messenger.cd.L0(2131748400, null)));
                    arrayList5.add(org.telegram.ui.Components.a51.v(leVar.f39209p1));
                    arrayList5.add(org.telegram.ui.Components.a51.v(leVar.f39211q1));
                    arrayList5.add(org.telegram.ui.Components.a51.v(leVar.f39213r1));
                    arrayList5.add(org.telegram.ui.Components.a51.B(-4, leVar.f39217u0));
                }
                if (L02 != null && L02.creator) {
                    if (leVar.f39193b1) {
                        arrayList5.add(org.telegram.ui.Components.a51.b(org.telegram.messenger.cd.L0(2131748421, null)));
                        arrayList5.add(org.telegram.ui.Components.a51.k(leVar.f39219w0));
                        arrayList5.add(org.telegram.ui.Components.a51.B(-5, leVar.f39216t0));
                        int i20 = org.telegram.messenger.vp.r1(leVar.f39206o0).A4;
                        String L03 = org.telegram.messenger.cd.L0(2131748380, null);
                        if (leVar.f39212r0 < i20) {
                            i11 = i20;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = org.telegram.messenger.w0.f19025b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(0, new org.telegram.ui.ActionBar.y2(i11, context, null, false));
                            dqVar.f25509s = org.telegram.messenger.i0.L(1.0f);
                            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            L03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.a51 i21 = org.telegram.ui.Components.a51.i(1, L03);
                        i21.L((leVar.f39212r0 < i20 || !leVar.f39201j1) ? false : false);
                        arrayList5.add(i21);
                        arrayList5.add(org.telegram.ui.Components.a51.B(-8, org.telegram.messenger.cd.L0(2131748379, null)));
                    }
                    if (leVar.f39194c1) {
                        arrayList5.add(org.telegram.ui.Components.a51.b(org.telegram.messenger.cd.L0(2131748388, null)));
                        arrayList5.add(org.telegram.ui.Components.a51.j(3, leVar.C0));
                        arrayList5.add(org.telegram.ui.Components.a51.B(-6, leVar.f39218v0));
                    }
                }
                if (org.telegram.messenger.w3.V(org.telegram.messenger.vp.r1(leVar.f39206o0).L0(Long.valueOf(-leVar.f39208p0))) && org.telegram.messenger.vp.r1(leVar.f39206o0).f18803h6) {
                    arrayList5.add(xh.e.i(4, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ik, leVar.f39204n0), oo.h0(org.telegram.messenger.cd.L0(2131752474, null)), org.telegram.messenger.cd.L0(2131752475, null)));
                    arrayList5.add(org.telegram.ui.Components.a51.B(-7, null));
                }
                if (leVar.f39192a1.a()) {
                    leVar.R0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.a51.n(leVar.T0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.a51.B(-10, null));
                return;
            case 3:
                fe feVar = (fe) this.f44008b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var3 = (org.telegram.ui.Components.p51) obj2;
                he heVar = feVar.f37243f;
                int i22 = feVar.d;
                int i23 = he.f37901y;
                if (i22 == 0) {
                    arrayList = heVar.f37907r;
                } else {
                    arrayList = heVar.f37906n;
                }
                int size3 = arrayList.size();
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    int i24 = rh.b8.f46691b;
                    org.telegram.ui.Components.a51 K3 = org.telegram.ui.Components.a51.K(rh.b8.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f24297q = true;
                    arrayList6.add(K3);
                }
                if (i22 == 0) {
                    str = heVar.f37908s;
                } else {
                    str = heVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.a51.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.a51.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.a51.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                oo ooVar = (oo) this.f44008b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ooVar.getClass();
                    org.telegram.ui.Components.cc.a0(ooVar).f0(tL_error, false);
                }
                org.telegram.messenger.i0.E2(ooVar.f40327j0);
                org.telegram.messenger.i0.E2(ooVar.f40324g0);
                org.telegram.messenger.i0.E2(ooVar.f40326i0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.i0.h3(new jq((pr) this.f44008b, 1), 1000L);
                return;
            case 6:
                ((m4.c) this.f44008b).X(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ns nsVar = (ns) this.f44008b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var4 = (org.telegram.ui.Components.p51) obj2;
                TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
                arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.V));
                arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.f40036b));
                arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.f40037c));
                if (TextUtils.isEmpty(nsVar.f0())) {
                    arrayList7.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748424, null)), org.telegram.messenger.h20.j(Z1, true), "%1$s")));
                } else if (nsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("MobileVisibleInfo", null, 2131748423, org.telegram.messenger.h20.j(Z1, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.a51.C(null));
                }
                if (nsVar.I && nsVar.K) {
                    org.telegram.ui.Components.a51 i25 = org.telegram.ui.Components.a51.i(2, org.telegram.messenger.cd.L0(2131754447, null));
                    i25.L(nsVar.X);
                    arrayList7.add(i25);
                    arrayList7.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.a0(null, null, 2131754446, org.telegram.messenger.h20.j(Z1, true))));
                }
                arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.d));
                arrayList7.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131754394, null)));
                if (!nsVar.I) {
                    TLRPC.UserFull a2 = nsVar.getMessagesController().a2(nsVar.H);
                    if (a2 != null && a2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.f40044y));
                    arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.D));
                    if (Z1 != null && (userProfilePhoto = Z1.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.a51.k(nsVar.E));
                    }
                    arrayList7.add(org.telegram.ui.Components.a51.C(null));
                    org.telegram.ui.Components.a51 e = org.telegram.ui.Components.a51.e(1, org.telegram.messenger.cd.L0(2131751553, null));
                    e.f24298r = true;
                    arrayList7.add(e);
                }
                arrayList7.add(org.telegram.ui.Components.a51.C(null));
                if (nsVar.Y) {
                    org.telegram.messenger.i0.g3(new fs(nsVar, Z1, 0));
                    nsVar.Y = false;
                    org.telegram.messenger.i0.h3(new ds(nsVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                lt.a((lt) this.f44008b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                gt gtVar = (gt) this.f44008b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj2;
                lt ltVar = gtVar.f37643a;
                jt jtVar = ltVar.f39396l;
                if (jtVar != null) {
                    String join = TextUtils.join("", ltVar.f39399o);
                    if (q20Var != null) {
                        vgVar = new org.telegram.ui.Components.vg(15, gtVar, q20Var);
                    }
                    jtVar.N(charSequence, join, vgVar);
                    if (q20Var == null) {
                        ltVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ut utVar = (ut) this.f44008b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var5 = (org.telegram.ui.Components.p51) obj2;
                arrayList8.add(org.telegram.ui.Components.a51.k(utVar.P1));
                arrayList8.add(org.telegram.ui.Components.a51.C(null));
                ArrayList arrayList9 = utVar.S1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131749498, null)));
                    while (i16 < arrayList9.size()) {
                        Long l10 = (Long) arrayList9.get(i16);
                        l10.getClass();
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(utVar.f21583a).Z1(l10);
                        if (Z12 != null) {
                            int i26 = qg.j.f45554b;
                            org.telegram.ui.Components.a51 K4 = org.telegram.ui.Components.a51.K(qg.j.class);
                            K4.G = Z12;
                            K4.L(utVar.T1.contains(l10));
                            arrayList8.add(K4);
                            i16++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                ay ayVar = (ay) this.f44008b;
                Long l11 = (Long) obj2;
                ayVar.P1 = (Long) obj;
                ayVar.f5();
                return;
            case 12:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                Long l12 = (Long) obj2;
                ((Runnable) this.f44008b).run();
                return;
            case 13:
                qy qyVar = (qy) this.f44008b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var6 = (org.telegram.ui.Components.p51) obj2;
                String L04 = org.telegram.messenger.cd.L0(2131744014, null);
                org.telegram.ui.Components.a51 a51Var = new org.telegram.ui.Components.a51(2);
                a51Var.f24292l = L04;
                a51Var.f24291k = 2131624296;
                arrayList10.add(a51Var);
                org.telegram.ui.Components.a51 i27 = org.telegram.ui.Components.a51.i(1, org.telegram.messenger.cd.L0(2131744015, null));
                i27.L(qyVar.f41088c);
                arrayList10.add(i27);
                if (qyVar.f41088c) {
                    arrayList10.add(org.telegram.ui.Components.a51.C(null));
                    arrayList10.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131744013, null)));
                    s3 s3Var = new s3(qyVar, 6);
                    int i28 = oy.f40391b;
                    org.telegram.ui.Components.a51 K5 = org.telegram.ui.Components.a51.K(oy.class);
                    K5.d = 2;
                    K5.G = s3Var;
                    if (!qyVar.e) {
                        if (qyVar.d) {
                            i15 = 0;
                        } else {
                            i15 = 1;
                        }
                    }
                    K5.f24305z = i15;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131744012, null)));
                    return;
                }
                return;
            case 14:
                ua0 ua0Var = (ua0) this.f44008b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ua0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.vp.r1(ua0Var.f42101b).V3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.m5.n(null, 2131754974, ua0.d(), 2131624011, 36);
                        return;
                    } else {
                        ua0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                kt0 kt0Var = (kt0) this.f44008b;
                hi.b bVar2 = kt0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                kt0Var.f38947s = (Bitmap) obj;
                Paint paint = new Paint(1);
                kt0Var.f38949x = paint;
                Bitmap bitmap2 = kt0Var.f38947s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                kt0Var.f38948w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f11 = 0.05f;
                }
                org.telegram.messenger.i0.i(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.04f;
                }
                org.telegram.messenger.i0.h(colorMatrix, f7);
                kt0Var.f38949x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                kt0Var.f38950y = new Matrix();
                bVar2.a(bitmap);
                yg.d.c(bVar2, kt0Var.f38938c);
                kt0Var.G.d();
                return;
            case 16:
                rt0 rt0Var = (rt0) this.f44008b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var7 = (org.telegram.ui.Components.p51) obj2;
                String L05 = org.telegram.messenger.cd.L0(2131754276, null);
                org.telegram.ui.Components.a51 a51Var2 = new org.telegram.ui.Components.a51(2);
                a51Var2.f24292l = L05;
                a51Var2.f24291k = 2131623947;
                arrayList11.add(a51Var2);
                org.telegram.ui.Components.a51 i29 = org.telegram.ui.Components.a51.i(1, org.telegram.messenger.cd.L0(2131754277, null));
                i29.L(rt0Var.f41291n);
                arrayList11.add(i29);
                arrayList11.add(org.telegram.ui.Components.a51.B(2, null));
                if (rt0Var.f41291n) {
                    arrayList11.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131746890, null)));
                    int[] a10 = org.telegram.ui.Cells.x7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) rt0Var.getMessagesController().J6);
                    org.telegram.ui.Components.z11 z11Var = new org.telegram.ui.Components.z11(22);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f23408c = a10;
                    w7Var.d = 20;
                    w7Var.e = z11Var;
                    rt0Var.f41288b.d((int) Utilities.k(rt0Var.f41292r, 10000L, 0L), w7Var, new s3(rt0Var, 19));
                    arrayList11.add(org.telegram.ui.Components.a51.j(3, rt0Var.f41288b));
                    if (rt0Var.f41292r > 0) {
                        str2 = rt0Var.a0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.a51.B(4, str2));
                    TLRPC.Chat L06 = rt0Var.getMessagesController().L0(Long.valueOf(rt0Var.f41287a));
                    if (L06 != null && !TextUtils.isEmpty(org.telegram.messenger.w3.K(L06, false))) {
                        rt0Var.f41289c.setLink(rt0Var.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(L06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.a51.j(5, rt0Var.f41289c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f44008b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.E0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f44008b;
                Bitmap bitmap3 = (Bitmap) obj;
                hi.b bVar3 = profileActivity.I6;
                bVar3.a((Bitmap) obj2);
                yg.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.J6.d();
                return;
            case 19:
                b01 b01Var = (b01) this.f44008b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var8 = (org.telegram.ui.Components.p51) obj2;
                org.telegram.ui.Components.u51 u51Var = b01Var.f35922f;
                c01 c01Var = b01Var.f35926w;
                ArrayList arrayList13 = c01Var.f36356o1;
                jg.b1 b1Var = b01Var.h;
                if (b1Var.getMeasuredHeight() <= 0) {
                    b1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.f16026q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.a51 D = org.telegram.ui.Components.a51.D(b1Var.getMeasuredHeight());
                D.d = -1;
                D.f24299s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((b1Var.getMeasuredHeight() / org.telegram.messenger.i0.f16025p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b01Var.f35920b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || b01Var.f35921c != null || b01Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || b01Var.f35921c != null) {
                        Context context2 = b01Var.getContext();
                        int i30 = org.telegram.ui.ActionBar.t6.L6;
                        int i31 = c01.f36350s1;
                        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context2, i30, 21, 0, 0, false, false, c01Var.I0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = b01Var.f35920b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            p4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b01Var.f35921c;
                            if (tL_reportResultChooseOption != null) {
                                p4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, p4Var, c01Var.I0);
                        org.telegram.ui.Components.a51 k10 = org.telegram.ui.Components.a51.k(p4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (b01Var.f35920b != null) {
                        for (int i32 = 0; i32 < b01Var.f35920b.options.size(); i32++) {
                            org.telegram.ui.Components.a51 a51Var3 = new org.telegram.ui.Components.a51(30);
                            a51Var3.f24292l = b01Var.f35920b.options.get(i32).text;
                            a51Var3.f24291k = 2131232058;
                            a51Var3.d = i32;
                            arrayList12.add(a51Var3);
                            measuredHeight += 50;
                        }
                    } else if (b01Var.f35921c != null) {
                        for (int i33 = 0; i33 < b01Var.f35921c.options.size(); i33++) {
                            org.telegram.ui.Components.a51 a51Var4 = new org.telegram.ui.Components.a51(30);
                            a51Var4.f24292l = b01Var.f35921c.options.get(i33).text;
                            a51Var4.f24291k = 2131232058;
                            a51Var4.d = i33;
                            arrayList12.add(a51Var4);
                            measuredHeight += 50;
                        }
                    } else if (b01Var.d != null) {
                        if (b01Var.f35923n == null) {
                            Context context3 = b01Var.getContext();
                            int i34 = c01.f36350s1;
                            zz0 zz0Var = new zz0(b01Var, context3, c01Var.I0);
                            b01Var.f35923n = zz0Var;
                            zz0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.k3 k3Var = b01Var.f35923n.d;
                        if (b01Var.d.optional) {
                            i12 = 2131746253;
                        } else {
                            i12 = 2131746259;
                        }
                        k3Var.setHint(org.telegram.messenger.cd.L0(i12, null));
                        org.telegram.ui.Components.a51 k11 = org.telegram.ui.Components.a51.k(b01Var.f35923n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j11 = c01Var.f36358q1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i13 = 2131746255;
                            } else {
                                i13 = 2131746258;
                            }
                            arrayList12.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(i13, null)));
                        } else if (org.telegram.messenger.o5.E(j11)) {
                            arrayList12.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131746254, null)));
                        } else if (org.telegram.messenger.w3.V(org.telegram.messenger.vp.r1(c01Var.f21583a).L0(Long.valueOf(-j11)))) {
                            arrayList12.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131746257, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131746256, null)));
                        }
                        if (b01Var.f35924r == null) {
                            vh.d dVar = new vh.d(b01Var.getContext(), c01Var.I0, true);
                            b01Var.f35925s = dVar;
                            dVar.i(org.telegram.messenger.cd.L0(2131746252, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(b01Var.getContext());
                            b01Var.f35924r = frameLayout;
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, frameLayout, c01Var.I0);
                            b01Var.f35924r.addView(b01Var.f35925s, w7.b6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(b01Var.getContext());
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d7, view, c01Var.I0);
                            b01Var.f35924r.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.f16025p, 48));
                        }
                        vh.d dVar2 = b01Var.f35925s;
                        if (!b01Var.d.optional && TextUtils.isEmpty(b01Var.f35923n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        b01Var.f35925s.setOnClickListener(new f50(b01Var, 29));
                        org.telegram.ui.Components.a51 k12 = org.telegram.ui.Components.a51.k(b01Var.f35924r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.a51) i0.a.g(1, arrayList12)).f24290j = true;
                    if (c01Var.l1 && b01Var.f35919a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(b01Var.getContext());
                        Drawable mutate = b01Var.getContext().getResources().getDrawable(2131231230).mutate();
                        org.telegram.ui.ActionBar.a7.y(frameLayout2, mutate, org.telegram.ui.ActionBar.t6.f20892b7, c01Var.I0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.a7.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.t6.f20872a7, c01Var.I0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(colorDrawable, mutate, 0, 0);
                        eqVar.f25847x = true;
                        frameLayout2.setBackground(eqVar);
                        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(b01Var.getContext(), null);
                        p80Var.setTextSize(1, 14.0f);
                        p80Var.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.L0(2131746250, null), c01Var.I0, null));
                        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.A6, c01Var.I0);
                        p80Var.setGravity(17);
                        frameLayout2.addView(p80Var, w7.b6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.a51 k13 = org.telegram.ui.Components.a51.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (u51Var != null) {
                    int i35 = c01.f36350s1;
                    if (c01Var.f21586b.getMeasuredHeight() - org.telegram.messenger.i0.f16020m < org.telegram.messenger.i0.L(measuredHeight)) {
                        u51Var.f30818e3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    u51Var.f30818e3.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.p51 p51Var9 = (org.telegram.ui.Components.p51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.a51.k(((g01) this.f44008b).P1));
                return;
            case 21:
                org.telegram.ui.Components.p51 p51Var10 = (org.telegram.ui.Components.p51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.a51.k(((org.telegram.ui.Components.e30) this.f44008b).Q1));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f44008b).getClass();
                return;
            case 23:
                b(obj, obj2);
                return;
            case 24:
                r31 r31Var = (r31) this.f44008b;
                ArrayList arrayList14 = r31Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i36 = r31Var.f41125a;
                ArrayList arrayList15 = r31Var.d;
                if (tL_error5 != null) {
                    if (r31Var.f41130r) {
                        arrayList15.clear();
                        r31Var.f41130r = false;
                    }
                    r31Var.h = true;
                    r31Var.f41128f = false;
                    int size4 = arrayList14.size();
                    while (i16 < size4) {
                        Object obj6 = arrayList14.get(i16);
                        i16++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                org.telegram.messenger.vp.r1(i36).V3(channels_channelparticipants.users, false);
                org.telegram.messenger.vp.r1(i36).P3(channels_channelparticipants.chats, false);
                if (r31Var.f41130r) {
                    arrayList15.clear();
                    r31Var.f41130r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                int size5 = arrayList16.size();
                int i37 = 0;
                while (i37 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i37);
                    i37++;
                    TLObject d22 = org.telegram.messenger.vp.r1(i36).d2(org.telegram.messenger.o5.o(channelParticipant.peer));
                    if (d22 != null) {
                        arrayList15.add(d22);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    r31Var.h = true;
                }
                r31Var.f41128f = false;
                int size6 = arrayList14.size();
                while (i16 < size6) {
                    Object obj7 = arrayList14.get(i16);
                    i16++;
                    ((Runnable) obj7).run();
                }
                return;
            case 25:
                t31 t31Var = (t31) this.f44008b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var11 = (org.telegram.ui.Components.p51) obj2;
                int i38 = t31Var.T1;
                th.x4 x4Var = t31Var.R1;
                if (x4Var != null) {
                    arrayList17.add(org.telegram.ui.Components.a51.D(org.telegram.messenger.i0.L(16.0f)));
                    ArrayList arrayList18 = x4Var.f49636i;
                    int size7 = arrayList18.size();
                    int i39 = i38;
                    int i40 = 0;
                    while (i40 < size7) {
                        Object obj8 = arrayList18.get(i40);
                        i40++;
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj8;
                        int i41 = b71.f36122c;
                        org.telegram.ui.Components.a51 K6 = org.telegram.ui.Components.a51.K(b71.class);
                        K6.f24301u = 1;
                        K6.f24305z = 0;
                        K6.G = jjVar;
                        if (jjVar != null && (storyItem = jjVar.f16341l) != null) {
                            j10 = storyItem.f20031id;
                        } else {
                            j10 = -1;
                        }
                        K6.B = j10;
                        K6.f24287f = true;
                        K6.v = i38;
                        K6.L(t31Var.S1.containsKey(Integer.valueOf(jjVar.f1())));
                        K6.f24301u = 1;
                        arrayList17.add(K6);
                        i39--;
                        if (i39 == 0) {
                            i39 = i38;
                        }
                    }
                    if (x4Var.k() || !x4Var.f49645r) {
                        while (true) {
                            if (i39 <= 0) {
                                i14 = i38;
                            } else {
                                i14 = i39;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.a51 q6 = org.telegram.ui.Components.a51.q(i16, 34);
                                q6.f24301u = 1;
                                arrayList17.add(q6);
                            }
                        }
                    }
                    arrayList17.add(org.telegram.ui.Components.a51.D(org.telegram.messenger.i0.L(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.p51 p51Var12 = (org.telegram.ui.Components.p51) obj2;
                e51.e0((e51) this.f44008b, (ArrayList) obj);
                return;
            case 27:
                c(obj, obj2);
                return;
            default:
                x91 x91Var = (x91) this.f44008b;
                hi.b bVar4 = x91Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                x91Var.f43518r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                x91Var.f43520w = paint2;
                Bitmap bitmap5 = x91Var.f43518r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                x91Var.f43519s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f11 = 0.05f;
                }
                org.telegram.messenger.i0.i(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                org.telegram.messenger.i0.h(colorMatrix2, f10);
                x91Var.f43520w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                x91Var.f43521x = new Matrix();
                bVar4.a(bitmap4);
                yg.d.c(bVar4, x91Var.f43510b);
                x91Var.F.d();
                return;
        }
    }
}
