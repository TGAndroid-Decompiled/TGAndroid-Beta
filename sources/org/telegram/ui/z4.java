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
public final class z4 implements org.telegram.messenger.k20 {
    public final int f43812a;
    public final Object f43813b;

    public z4(Object obj, int i10) {
        this.f43812a = i10;
        this.f43813b = obj;
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
        q31 q31Var = (q31) this.f43813b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) obj2;
        p31 p31Var = q31Var.Y1;
        p31 p31Var2 = q31Var.X1;
        TLRPC.User user = q31Var.Q1;
        p31 p31Var3 = q31Var.W1;
        if (p31Var3 != null) {
            ArrayList arrayList2 = p31Var3.d;
            if (p31Var2 != null) {
                ArrayList arrayList3 = p31Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.e20.i(q31Var.f21584a).e()));
                arrayList.add(org.telegram.ui.Components.b51.E(3, org.telegram.messenger.i0.L(64.0f)));
                if (p31Var != null && !TextUtils.isEmpty(p31Var.f40355c.f19793q)) {
                    ArrayList arrayList4 = p31Var.d;
                    int size = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList4.get(i15);
                        i15++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject)));
                            org.telegram.ui.Components.b51 w9 = org.telegram.ui.Components.b51.w(tLObject);
                            if (org.telegram.messenger.o5.d(tLObject) == org.telegram.messenger.o5.d(q31Var.S1)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            w9.L(z16);
                            arrayList.add(w9);
                        }
                    }
                    if (p31Var.f40356f) {
                        arrayList.add(org.telegram.ui.Components.b51.p(29));
                        arrayList.add(org.telegram.ui.Components.b51.p(29));
                        arrayList.add(org.telegram.ui.Components.b51.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.b51.k(q31Var.V1));
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
                                if (org.telegram.messenger.w3.V(q31Var.P1)) {
                                    i14 = 2131752516;
                                } else {
                                    i14 = 2131749508;
                                }
                                arrayList.add(org.telegram.ui.Components.b51.r(org.telegram.messenger.dd.L0(i14, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(user)));
                                org.telegram.ui.Components.b51 w10 = org.telegram.ui.Components.b51.w(user);
                                i10 = 29;
                                if (org.telegram.messenger.o5.d(user) == org.telegram.messenger.o5.d(q31Var.S1)) {
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
                            if (org.telegram.messenger.w3.V(q31Var.P1)) {
                                i13 = 2131752516;
                            } else {
                                i13 = 2131749508;
                            }
                            arrayList.add(org.telegram.ui.Components.b51.r(org.telegram.messenger.dd.L0(i13, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject2)));
                        org.telegram.ui.Components.b51 w11 = org.telegram.ui.Components.b51.w(tLObject2);
                        if (org.telegram.messenger.o5.d(tLObject2) == org.telegram.messenger.o5.d(q31Var.S1)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w11.L(z14);
                        arrayList.add(w11);
                    }
                }
                if (p31Var3.f40356f) {
                    arrayList.add(org.telegram.ui.Components.b51.p(i10));
                    arrayList.add(org.telegram.ui.Components.b51.p(i10));
                    arrayList.add(org.telegram.ui.Components.b51.p(i10));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.o5.d(user)))) {
                    if (org.telegram.messenger.w3.V(q31Var.P1)) {
                        i12 = 2131752288;
                    } else {
                        i12 = 2131749437;
                    }
                    arrayList.add(org.telegram.ui.Components.b51.r(org.telegram.messenger.dd.L0(i12, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(user)));
                    org.telegram.ui.Components.b51 w12 = org.telegram.ui.Components.b51.w(user);
                    if (org.telegram.messenger.o5.d(user) == org.telegram.messenger.o5.d(q31Var.S1)) {
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
                            if (org.telegram.messenger.w3.V(q31Var.P1)) {
                                i11 = 2131752288;
                            } else {
                                i11 = 2131749437;
                            }
                            arrayList.add(org.telegram.ui.Components.b51.r(org.telegram.messenger.dd.L0(i11, null)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.d(tLObject3)));
                        org.telegram.ui.Components.b51 w13 = org.telegram.ui.Components.b51.w(tLObject3);
                        if (org.telegram.messenger.o5.d(tLObject3) == org.telegram.messenger.o5.d(q31Var.S1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w13.L(z12);
                        arrayList.add(w13);
                    }
                }
                if (!arrayList3.isEmpty() && p31Var2.f40356f) {
                    arrayList.add(org.telegram.ui.Components.b51.p(i10));
                    arrayList.add(org.telegram.ui.Components.b51.p(i10));
                    arrayList.add(org.telegram.ui.Components.b51.p(i10));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        k51 k51Var = (k51) this.f43813b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) obj2;
        LinearLayout linearLayout = k51Var.Q1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.b51.k(linearLayout));
        }
        LinearLayout linearLayout2 = k51Var.R1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.b51.k(linearLayout2));
        }
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat L0;
        int i10;
        int i11;
        e61 e61Var;
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
        switch (this.f43812a) {
            case 0:
                a5 a5Var = (a5) this.f43813b;
                a5Var.f35570w.setBackground(new BitmapDrawable((Bitmap) obj));
                a5Var.f35571x = false;
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
                j9 j9Var = (j9) this.f43813b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) obj2;
                boolean isEmpty = j9Var.G.isEmpty();
                ArrayList arrayList3 = j9Var.f38318y;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.b51 c10 = org.telegram.ui.Components.b51.c(1, 2131231769, org.telegram.messenger.dd.L0(2131749499, null));
                    c10.f24648q = true;
                    arrayList2.add(c10);
                    if (!j9Var.getUserConfig().W) {
                        org.telegram.ui.Components.b51 c11 = org.telegram.ui.Components.b51.c(2, 2131231763, org.telegram.messenger.dd.L0(2131749470, null));
                        c11.f24648q = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.b51.C(null));
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
                            int i18 = h9.f37760b;
                            org.telegram.ui.Components.b51 K = org.telegram.ui.Components.b51.K(h9.class);
                            K.G = L0;
                            K.D = k8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.b51.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    while (i16 < size2) {
                        Object obj4 = arrayList3.get(i16);
                        i16++;
                        g9 g9Var = (g9) obj4;
                        ag.t0 t0Var = new ag.t0(28, j9Var, g9Var);
                        int i19 = e9.f36781b;
                        org.telegram.ui.Components.b51 K2 = org.telegram.ui.Components.b51.K(e9.class);
                        K2.G = g9Var;
                        K2.D = t0Var;
                        K2.L(j9Var.k0(g9Var.f37407c));
                        arrayList2.add(K2);
                    }
                    if (!j9Var.F) {
                        arrayList2.add(org.telegram.ui.Components.b51.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.b51.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.b51.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                le leVar = (le) this.f43813b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var2 = (org.telegram.ui.Components.q51) obj2;
                leVar.R0 = -1;
                TLRPC.Chat L02 = org.telegram.messenger.wp.r1(leVar.f39215o0).L0(Long.valueOf(-leVar.f39217p0));
                TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(leVar.f39215o0).M0(-leVar.f39217p0);
                if (M0 != null) {
                    i10 = M0.stats_dc;
                } else {
                    i10 = -1;
                }
                if (leVar.f39202b1) {
                    arrayList5.add(org.telegram.ui.Components.b51.g(leVar.f39223s0));
                    e61 e61Var2 = leVar.l1;
                    if (e61Var2 != null && !e61Var2.f36756l) {
                        arrayList5.add(org.telegram.ui.Components.b51.h(5, i10, e61Var2));
                        arrayList5.add(org.telegram.ui.Components.b51.B(-1, null));
                    }
                    e61 e61Var3 = leVar.f39212m1;
                    if (e61Var3 != null && !e61Var3.f36756l) {
                        arrayList5.add(org.telegram.ui.Components.b51.h(2, i10, e61Var3));
                        arrayList5.add(org.telegram.ui.Components.b51.B(-2, null));
                    }
                }
                if (leVar.f39203c1 && (e61Var = leVar.f39214n1) != null && !e61Var.f36756l) {
                    arrayList5.add(org.telegram.ui.Components.b51.h(2, i10, e61Var));
                    arrayList5.add(org.telegram.ui.Components.b51.B(-3, null));
                }
                if (leVar.f39216o1) {
                    arrayList5.add(org.telegram.ui.Components.b51.b(org.telegram.messenger.dd.L0(2131748400, null)));
                    arrayList5.add(org.telegram.ui.Components.b51.v(leVar.f39218p1));
                    arrayList5.add(org.telegram.ui.Components.b51.v(leVar.f39220q1));
                    arrayList5.add(org.telegram.ui.Components.b51.v(leVar.f39222r1));
                    arrayList5.add(org.telegram.ui.Components.b51.B(-4, leVar.f39226u0));
                }
                if (L02 != null && L02.creator) {
                    if (leVar.f39202b1) {
                        arrayList5.add(org.telegram.ui.Components.b51.b(org.telegram.messenger.dd.L0(2131748421, null)));
                        arrayList5.add(org.telegram.ui.Components.b51.k(leVar.f39228w0));
                        arrayList5.add(org.telegram.ui.Components.b51.B(-5, leVar.f39225t0));
                        int i20 = org.telegram.messenger.wp.r1(leVar.f39215o0).A4;
                        String L03 = org.telegram.messenger.dd.L0(2131748380, null);
                        if (leVar.f39221r0 < i20) {
                            i11 = i20;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = org.telegram.messenger.w0.f18945b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(0, new org.telegram.ui.ActionBar.y2(i11, context, null, false));
                            dqVar.f25569s = org.telegram.messenger.i0.L(1.0f);
                            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            L03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.b51 i21 = org.telegram.ui.Components.b51.i(1, L03);
                        i21.L((leVar.f39221r0 < i20 || !leVar.f39210j1) ? false : false);
                        arrayList5.add(i21);
                        arrayList5.add(org.telegram.ui.Components.b51.B(-8, org.telegram.messenger.dd.L0(2131748379, null)));
                    }
                    if (leVar.f39203c1) {
                        arrayList5.add(org.telegram.ui.Components.b51.b(org.telegram.messenger.dd.L0(2131748388, null)));
                        arrayList5.add(org.telegram.ui.Components.b51.j(3, leVar.C0));
                        arrayList5.add(org.telegram.ui.Components.b51.B(-6, leVar.f39227v0));
                    }
                }
                if (org.telegram.messenger.w3.V(org.telegram.messenger.wp.r1(leVar.f39215o0).L0(Long.valueOf(-leVar.f39217p0))) && org.telegram.messenger.wp.r1(leVar.f39215o0).f19146h6) {
                    arrayList5.add(xh.e.i(4, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ik, leVar.f39213n0), oo.i0(org.telegram.messenger.dd.L0(2131752474, null)), org.telegram.messenger.dd.L0(2131752475, null)));
                    arrayList5.add(org.telegram.ui.Components.b51.B(-7, null));
                }
                if (leVar.f39201a1.a()) {
                    leVar.R0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.b51.n(leVar.T0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.b51.B(-10, null));
                return;
            case 3:
                fe feVar = (fe) this.f43813b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var3 = (org.telegram.ui.Components.q51) obj2;
                he heVar = feVar.f37115f;
                int i22 = feVar.d;
                int i23 = he.f37794y;
                if (i22 == 0) {
                    arrayList = heVar.f37800r;
                } else {
                    arrayList = heVar.f37799n;
                }
                int size3 = arrayList.size();
                while (i16 < size3) {
                    Object obj5 = arrayList.get(i16);
                    i16++;
                    int i24 = rh.b8.f46705b;
                    org.telegram.ui.Components.b51 K3 = org.telegram.ui.Components.b51.K(rh.b8.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f24648q = true;
                    arrayList6.add(K3);
                }
                if (i22 == 0) {
                    str = heVar.f37801s;
                } else {
                    str = heVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.b51.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.b51.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.b51.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                oo ooVar = (oo) this.f43813b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ooVar.getClass();
                    org.telegram.ui.Components.cc.a0(ooVar).f0(tL_error, false);
                }
                org.telegram.messenger.i0.E2(ooVar.f40216j0);
                org.telegram.messenger.i0.E2(ooVar.f40213g0);
                org.telegram.messenger.i0.E2(ooVar.f40215i0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.i0.h3(new jq((pr) this.f43813b, 1), 1000L);
                return;
            case 6:
                ((m4.c) this.f43813b).X(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ns nsVar = (ns) this.f43813b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var4 = (org.telegram.ui.Components.q51) obj2;
                TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
                arrayList7.add(org.telegram.ui.Components.b51.k(nsVar.V));
                arrayList7.add(org.telegram.ui.Components.b51.k(nsVar.f39963b));
                arrayList7.add(org.telegram.ui.Components.b51.k(nsVar.f39964c));
                if (TextUtils.isEmpty(nsVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131748424, null)), org.telegram.messenger.i20.j(Z1, true), "%1$s")));
                } else if (nsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("MobileVisibleInfo", null, 2131748423, org.telegram.messenger.i20.j(Z1, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.b51.C(null));
                }
                if (nsVar.I && nsVar.K) {
                    org.telegram.ui.Components.b51 i25 = org.telegram.ui.Components.b51.i(2, org.telegram.messenger.dd.L0(2131754447, null));
                    i25.L(nsVar.X);
                    arrayList7.add(i25);
                    arrayList7.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.a0(null, null, 2131754446, org.telegram.messenger.i20.j(Z1, true))));
                }
                arrayList7.add(org.telegram.ui.Components.b51.k(nsVar.d));
                arrayList7.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131754394, null)));
                if (!nsVar.I) {
                    TLRPC.UserFull a2 = nsVar.getMessagesController().a2(nsVar.H);
                    if (a2 != null && a2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.b51.k(nsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.b51.k(nsVar.f39971y));
                    arrayList7.add(org.telegram.ui.Components.b51.k(nsVar.D));
                    if (Z1 != null && (userProfilePhoto = Z1.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.b51.k(nsVar.E));
                    }
                    arrayList7.add(org.telegram.ui.Components.b51.C(null));
                    org.telegram.ui.Components.b51 e = org.telegram.ui.Components.b51.e(1, org.telegram.messenger.dd.L0(2131751553, null));
                    e.f24649r = true;
                    arrayList7.add(e);
                }
                arrayList7.add(org.telegram.ui.Components.b51.C(null));
                if (nsVar.Y) {
                    org.telegram.messenger.i0.g3(new fs(nsVar, Z1, 0));
                    nsVar.Y = false;
                    org.telegram.messenger.i0.h3(new ds(nsVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                kt.a((kt) this.f43813b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                ft ftVar = (ft) this.f43813b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) obj2;
                kt ktVar = ftVar.f37231a;
                ht htVar = ktVar.f38986l;
                if (htVar != null) {
                    String join = TextUtils.join("", ktVar.f38989o);
                    if (r20Var != null) {
                        vgVar = new org.telegram.ui.Components.vg(16, ftVar, r20Var);
                    }
                    htVar.N(charSequence, join, vgVar);
                    if (r20Var == null) {
                        ktVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                tt ttVar = (tt) this.f43813b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var5 = (org.telegram.ui.Components.q51) obj2;
                arrayList8.add(org.telegram.ui.Components.b51.k(ttVar.P1));
                arrayList8.add(org.telegram.ui.Components.b51.C(null));
                ArrayList arrayList9 = ttVar.S1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131749498, null)));
                    while (i16 < arrayList9.size()) {
                        Long l10 = (Long) arrayList9.get(i16);
                        l10.getClass();
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(ttVar.f21584a).Z1(l10);
                        if (Z12 != null) {
                            int i26 = qg.j.f45565b;
                            org.telegram.ui.Components.b51 K4 = org.telegram.ui.Components.b51.K(qg.j.class);
                            K4.G = Z12;
                            K4.L(ttVar.T1.contains(l10));
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
                zx zxVar = (zx) this.f43813b;
                Long l11 = (Long) obj2;
                zxVar.P1 = (Long) obj;
                zxVar.g5();
                return;
            case 12:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                Long l12 = (Long) obj2;
                ((Runnable) this.f43813b).run();
                return;
            case 13:
                py pyVar = (py) this.f43813b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var6 = (org.telegram.ui.Components.q51) obj2;
                String L04 = org.telegram.messenger.dd.L0(2131744014, null);
                org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(2);
                b51Var.f24643l = L04;
                b51Var.f24642k = 2131624296;
                arrayList10.add(b51Var);
                org.telegram.ui.Components.b51 i27 = org.telegram.ui.Components.b51.i(1, org.telegram.messenger.dd.L0(2131744015, null));
                i27.L(pyVar.f40635c);
                arrayList10.add(i27);
                if (pyVar.f40635c) {
                    arrayList10.add(org.telegram.ui.Components.b51.C(null));
                    arrayList10.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131744013, null)));
                    s3 s3Var = new s3(pyVar, 6);
                    int i28 = ny.f39983b;
                    org.telegram.ui.Components.b51 K5 = org.telegram.ui.Components.b51.K(ny.class);
                    K5.d = 2;
                    K5.G = s3Var;
                    if (!pyVar.e) {
                        if (pyVar.d) {
                            i15 = 0;
                        } else {
                            i15 = 1;
                        }
                    }
                    K5.f24656z = i15;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131744012, null)));
                    return;
                }
                return;
            case 14:
                ta0 ta0Var = (ta0) this.f43813b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ta0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.wp.r1(ta0Var.f41598b).V3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.m5.n(null, 2131754974, ta0.d(), 2131624011, 36);
                        return;
                    } else {
                        ta0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                jt0 jt0Var = (jt0) this.f43813b;
                hi.b bVar2 = jt0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                jt0Var.f38553s = (Bitmap) obj;
                Paint paint = new Paint(1);
                jt0Var.f38555x = paint;
                Bitmap bitmap2 = jt0Var.f38553s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                jt0Var.f38554w = bitmapShader;
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
                jt0Var.f38555x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                jt0Var.f38556y = new Matrix();
                bVar2.a(bitmap);
                yg.d.c(bVar2, jt0Var.f38544c);
                jt0Var.G.d();
                return;
            case 16:
                qt0 qt0Var = (qt0) this.f43813b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var7 = (org.telegram.ui.Components.q51) obj2;
                String L05 = org.telegram.messenger.dd.L0(2131754276, null);
                org.telegram.ui.Components.b51 b51Var2 = new org.telegram.ui.Components.b51(2);
                b51Var2.f24643l = L05;
                b51Var2.f24642k = 2131623947;
                arrayList11.add(b51Var2);
                org.telegram.ui.Components.b51 i29 = org.telegram.ui.Components.b51.i(1, org.telegram.messenger.dd.L0(2131754277, null));
                i29.L(qt0Var.f40903n);
                arrayList11.add(i29);
                arrayList11.add(org.telegram.ui.Components.b51.B(2, null));
                if (qt0Var.f40903n) {
                    arrayList11.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131746890, null)));
                    int[] a10 = org.telegram.ui.Cells.x7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) qt0Var.getMessagesController().J6);
                    org.telegram.ui.Components.a21 a21Var = new org.telegram.ui.Components.a21(22);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f23409c = a10;
                    w7Var.d = 20;
                    w7Var.e = a21Var;
                    qt0Var.f40900b.d((int) Utilities.k(qt0Var.f40904r, 10000L, 0L), w7Var, new s3(qt0Var, 19));
                    arrayList11.add(org.telegram.ui.Components.b51.j(3, qt0Var.f40900b));
                    if (qt0Var.f40904r > 0) {
                        str2 = qt0Var.b0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.b51.B(4, str2));
                    TLRPC.Chat L06 = qt0Var.getMessagesController().L0(Long.valueOf(qt0Var.f40899a));
                    if (L06 != null && !TextUtils.isEmpty(org.telegram.messenger.w3.K(L06, false))) {
                        qt0Var.f40901c.setLink(qt0Var.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(L06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.b51.j(5, qt0Var.f40901c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f43813b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f43813b;
                Bitmap bitmap3 = (Bitmap) obj;
                hi.b bVar3 = profileActivity.J6;
                bVar3.a((Bitmap) obj2);
                yg.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.K6.d();
                return;
            case 19:
                a01 a01Var = (a01) this.f43813b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var8 = (org.telegram.ui.Components.q51) obj2;
                org.telegram.ui.Components.v51 v51Var = a01Var.f35507f;
                b01 b01Var = a01Var.f35511w;
                ArrayList arrayList13 = b01Var.f35891o1;
                jg.b1 b1Var = a01Var.h;
                if (b1Var.getMeasuredHeight() <= 0) {
                    b1Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.f16172q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.b51 D = org.telegram.ui.Components.b51.D(b1Var.getMeasuredHeight());
                D.d = -1;
                D.f24650s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((b1Var.getMeasuredHeight() / org.telegram.messenger.i0.f16171p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a01Var.f35505b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || a01Var.f35506c != null || a01Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || a01Var.f35506c != null) {
                        Context context2 = a01Var.getContext();
                        int i30 = org.telegram.ui.ActionBar.t6.L6;
                        int i31 = b01.f35885s1;
                        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context2, i30, 21, 0, 0, false, false, b01Var.I0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = a01Var.f35505b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            p4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a01Var.f35506c;
                            if (tL_reportResultChooseOption != null) {
                                p4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, p4Var, b01Var.I0);
                        org.telegram.ui.Components.b51 k10 = org.telegram.ui.Components.b51.k(p4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (a01Var.f35505b != null) {
                        for (int i32 = 0; i32 < a01Var.f35505b.options.size(); i32++) {
                            org.telegram.ui.Components.b51 b51Var3 = new org.telegram.ui.Components.b51(30);
                            b51Var3.f24643l = a01Var.f35505b.options.get(i32).text;
                            b51Var3.f24642k = 2131232058;
                            b51Var3.d = i32;
                            arrayList12.add(b51Var3);
                            measuredHeight += 50;
                        }
                    } else if (a01Var.f35506c != null) {
                        for (int i33 = 0; i33 < a01Var.f35506c.options.size(); i33++) {
                            org.telegram.ui.Components.b51 b51Var4 = new org.telegram.ui.Components.b51(30);
                            b51Var4.f24643l = a01Var.f35506c.options.get(i33).text;
                            b51Var4.f24642k = 2131232058;
                            b51Var4.d = i33;
                            arrayList12.add(b51Var4);
                            measuredHeight += 50;
                        }
                    } else if (a01Var.d != null) {
                        if (a01Var.f35508n == null) {
                            Context context3 = a01Var.getContext();
                            int i34 = b01.f35885s1;
                            yz0 yz0Var = new yz0(a01Var, context3, b01Var.I0);
                            a01Var.f35508n = yz0Var;
                            yz0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.k3 k3Var = a01Var.f35508n.d;
                        if (a01Var.d.optional) {
                            i12 = 2131746253;
                        } else {
                            i12 = 2131746259;
                        }
                        k3Var.setHint(org.telegram.messenger.dd.L0(i12, null));
                        org.telegram.ui.Components.b51 k11 = org.telegram.ui.Components.b51.k(a01Var.f35508n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j11 = b01Var.f35893q1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i13 = 2131746255;
                            } else {
                                i13 = 2131746258;
                            }
                            arrayList12.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(i13, null)));
                        } else if (org.telegram.messenger.o5.E(j11)) {
                            arrayList12.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131746254, null)));
                        } else if (org.telegram.messenger.w3.V(org.telegram.messenger.wp.r1(b01Var.f21584a).L0(Long.valueOf(-j11)))) {
                            arrayList12.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131746257, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131746256, null)));
                        }
                        if (a01Var.f35509r == null) {
                            vh.d dVar = new vh.d(a01Var.getContext(), b01Var.I0, true);
                            a01Var.f35510s = dVar;
                            dVar.i(org.telegram.messenger.dd.L0(2131746252, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(a01Var.getContext());
                            a01Var.f35509r = frameLayout;
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, frameLayout, b01Var.I0);
                            a01Var.f35509r.addView(a01Var.f35510s, w7.b6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(a01Var.getContext());
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, b01Var.I0);
                            a01Var.f35509r.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.f16171p, 48));
                        }
                        vh.d dVar2 = a01Var.f35510s;
                        if (!a01Var.d.optional && TextUtils.isEmpty(a01Var.f35508n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        a01Var.f35510s.setOnClickListener(new e50(a01Var, 29));
                        org.telegram.ui.Components.b51 k12 = org.telegram.ui.Components.b51.k(a01Var.f35509r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.b51) i0.a.g(1, arrayList12)).f24641j = true;
                    if (b01Var.l1 && a01Var.f35504a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(a01Var.getContext());
                        Drawable mutate = a01Var.getContext().getResources().getDrawable(2131231230).mutate();
                        org.telegram.ui.ActionBar.a7.y(frameLayout2, mutate, org.telegram.ui.ActionBar.t6.f20893b7, b01Var.I0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.a7.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.t6.f20873a7, b01Var.I0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(colorDrawable, mutate, 0, 0);
                        eqVar.f25909x = true;
                        frameLayout2.setBackground(eqVar);
                        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(a01Var.getContext(), null);
                        p80Var.setTextSize(1, 14.0f);
                        p80Var.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.dd.L0(2131746250, null), b01Var.I0, null));
                        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.A6, b01Var.I0);
                        p80Var.setGravity(17);
                        frameLayout2.addView(p80Var, w7.b6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.b51 k13 = org.telegram.ui.Components.b51.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (v51Var != null) {
                    int i35 = b01.f35885s1;
                    if (b01Var.f21587b.getMeasuredHeight() - org.telegram.messenger.i0.f16166m < org.telegram.messenger.i0.L(measuredHeight)) {
                        v51Var.f31182e3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    v51Var.f31182e3.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.q51 q51Var9 = (org.telegram.ui.Components.q51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.b51.k(((g01) this.f43813b).P1));
                return;
            case 21:
                org.telegram.ui.Components.q51 q51Var10 = (org.telegram.ui.Components.q51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.b51.k(((org.telegram.ui.Components.e30) this.f43813b).Q1));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f43813b).getClass();
                return;
            case 23:
                b(obj, obj2);
                return;
            case 24:
                p31 p31Var = (p31) this.f43813b;
                ArrayList arrayList14 = p31Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i36 = p31Var.f40353a;
                ArrayList arrayList15 = p31Var.d;
                if (tL_error5 != null) {
                    if (p31Var.f40358r) {
                        arrayList15.clear();
                        p31Var.f40358r = false;
                    }
                    p31Var.h = true;
                    p31Var.f40356f = false;
                    int size4 = arrayList14.size();
                    while (i16 < size4) {
                        Object obj6 = arrayList14.get(i16);
                        i16++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                org.telegram.messenger.wp.r1(i36).V3(channels_channelparticipants.users, false);
                org.telegram.messenger.wp.r1(i36).P3(channels_channelparticipants.chats, false);
                if (p31Var.f40358r) {
                    arrayList15.clear();
                    p31Var.f40358r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                int size5 = arrayList16.size();
                int i37 = 0;
                while (i37 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i37);
                    i37++;
                    TLObject d22 = org.telegram.messenger.wp.r1(i36).d2(org.telegram.messenger.o5.o(channelParticipant.peer));
                    if (d22 != null) {
                        arrayList15.add(d22);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    p31Var.h = true;
                }
                p31Var.f40356f = false;
                int size6 = arrayList14.size();
                while (i16 < size6) {
                    Object obj7 = arrayList14.get(i16);
                    i16++;
                    ((Runnable) obj7).run();
                }
                return;
            case 25:
                r31 r31Var = (r31) this.f43813b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.Components.q51 q51Var11 = (org.telegram.ui.Components.q51) obj2;
                int i38 = r31Var.T1;
                th.x4 x4Var = r31Var.R1;
                if (x4Var != null) {
                    arrayList17.add(org.telegram.ui.Components.b51.D(org.telegram.messenger.i0.L(16.0f)));
                    ArrayList arrayList18 = x4Var.f49650i;
                    int size7 = arrayList18.size();
                    int i39 = i38;
                    int i40 = 0;
                    while (i40 < size7) {
                        Object obj8 = arrayList18.get(i40);
                        i40++;
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj8;
                        int i41 = z61.f43836c;
                        org.telegram.ui.Components.b51 K6 = org.telegram.ui.Components.b51.K(z61.class);
                        K6.f24652u = 1;
                        K6.f24656z = 0;
                        K6.G = kjVar;
                        if (kjVar != null && (storyItem = kjVar.f16694l) != null) {
                            j10 = storyItem.f20032id;
                        } else {
                            j10 = -1;
                        }
                        K6.B = j10;
                        K6.f24638f = true;
                        K6.v = i38;
                        K6.L(r31Var.S1.containsKey(Integer.valueOf(kjVar.f1())));
                        K6.f24652u = 1;
                        arrayList17.add(K6);
                        i39--;
                        if (i39 == 0) {
                            i39 = i38;
                        }
                    }
                    if (x4Var.k() || !x4Var.f49659r) {
                        while (true) {
                            if (i39 <= 0) {
                                i14 = i38;
                            } else {
                                i14 = i39;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.b51 q6 = org.telegram.ui.Components.b51.q(i16, 34);
                                q6.f24652u = 1;
                                arrayList17.add(q6);
                            }
                        }
                    }
                    arrayList17.add(org.telegram.ui.Components.b51.D(org.telegram.messenger.i0.L(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.q51 q51Var12 = (org.telegram.ui.Components.q51) obj2;
                c51.f0((c51) this.f43813b, (ArrayList) obj);
                return;
            case 27:
                c(obj, obj2);
                return;
            default:
                v91 v91Var = (v91) this.f43813b;
                hi.b bVar4 = v91Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                v91Var.f42458r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                v91Var.f42460w = paint2;
                Bitmap bitmap5 = v91Var.f42458r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                v91Var.f42459s = bitmapShader2;
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
                v91Var.f42460w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                v91Var.f42461x = new Matrix();
                bVar4.a(bitmap4);
                yg.d.c(bVar4, v91Var.f42450b);
                v91Var.F.d();
                return;
        }
    }
}
