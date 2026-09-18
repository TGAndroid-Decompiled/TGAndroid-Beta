package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z21 implements org.telegram.ui.Components.kl0 {
    public final int f39955a;
    public final Object f39956b;

    public z21(Object obj, int i10) {
        this.f39955a = i10;
        this.f39956b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.xq0 xq0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.wl0 wl0Var;
        org.telegram.ui.Components.wl0 wl0Var2;
        s4.c1 L;
        int i11 = this.f39955a;
        Object obj = this.f39956b;
        switch (i11) {
            case 0:
                d31 d31Var = (d31) obj;
                org.telegram.ui.Components.wl0 wl0Var3 = d31Var.f32856y;
                org.telegram.ui.Components.kp kpVar = d31Var.f32848b;
                if (kpVar.d.get(i10) != d31Var.K && d31Var.O == null) {
                    d31Var.Q = false;
                    d31Var.K = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    d31Var.h.postDelayed(new org.telegram.ui.Components.x2(d31Var, i10, 28), 100L);
                    for (int i12 = 0; i12 < wl0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) wl0Var3.getChildAt(i12);
                        if (j21Var != view && (xq0Var = j21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(xq0Var);
                            j21Var.J.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f26230a.f18774a) {
                        ((org.telegram.ui.Components.j21) view).d();
                    }
                    p21 p21Var = d31Var.J;
                    if (p21Var != null) {
                        p21Var.f36306a.d0(i10, d31Var.K.f26230a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l31.U((l31) obj, view);
                return;
            case 2:
                e41.U((e41) obj, view, i10);
                return;
            case 3:
                q71 q71Var = (q71) obj;
                org.telegram.ui.Components.x51 G = q71Var.f36718i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        q71Var.f36710a0 = (TLObject) G.G;
                        q71Var.U(true);
                        q71Var.f36718i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((t71) obj).Q(i10, view);
                return;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 6:
                za1 za1Var = (za1) obj;
                ArrayList arrayList = za1Var.N;
                ArrayList arrayList2 = za1Var.O;
                ea1 ea1Var = za1Var.X;
                int i13 = ea1Var.I;
                if (i10 >= i13 && i10 <= ea1Var.J) {
                    wa1 wa1Var = (wa1) za1Var.f40059v0.get(i10 - i13);
                    kj0 kj0Var = new kj0(wa1Var.f38786b, true, za1Var.f40034b);
                    kj0Var.f35126e0 = wa1Var;
                    za1Var.presentFragment(kj0Var);
                    return;
                }
                int i14 = ea1Var.U;
                if (i10 >= i14 && i10 <= ea1Var.V) {
                    ((sa1) za1Var.Q.get(i10 - i14)).b(za1Var);
                    return;
                }
                int i15 = ea1Var.R;
                if (i10 >= i15 && i10 <= ea1Var.S) {
                    ((sa1) arrayList2.get(i10 - i15)).b(za1Var);
                    return;
                }
                int i16 = ea1Var.X;
                if (i10 >= i16 && i10 <= ea1Var.Y) {
                    ((sa1) za1Var.P.get(i10 - i16)).b(za1Var);
                    return;
                } else if (i10 == ea1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = za1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ea1 ea1Var2 = za1Var.X;
                    if (ea1Var2 != null) {
                        ea1Var2.E();
                        za1Var.S.setItemAnimator(za1Var.Y);
                        za1Var.X.s(i17 + 1, size);
                        za1Var.X.u(i17);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                vd1 vd1Var = (vd1) obj;
                if (vd1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vd1Var.Z0(i10);
                if (vd1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    vd1Var.M0();
                    vd1Var.l1();
                }
                vd1Var.n1();
                org.telegram.ui.Components.y81 y81Var = vd1Var.J0[1];
                if (vd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                y81Var.a(z12, true);
                vd1Var.P0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    vd1Var.P0.w0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > vd1Var.P0.getMeasuredWidth()) {
                    dc1 dc1Var = vd1Var.P0;
                    dc1Var.w0(i19 - dc1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                se1 se1Var = (se1) obj;
                int i20 = se1Var.H;
                HashSet hashSet = se1Var.f37272w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f18296id))) {
                        hashSet.remove(Long.valueOf(chat.f18296id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f18296id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && se1Var.v != -1 && se1Var.f37269n.getVisibility() == 0) {
                        se1Var.v = -1;
                        se1Var.f37269n.animate().setListener(null).cancel();
                        se1Var.f37269n.animate().translationY(i20).setDuration(200L).setListener(new oe1(se1Var, 0)).start();
                        if (se1Var.f37271s.getVisibility() == 0) {
                            wl0Var2 = se1Var.f37266b;
                        } else {
                            wl0Var2 = se1Var.f37265a;
                        }
                        wl0Var2.e1(false);
                        int N0 = ((s4.c0) wl0Var2.getLayoutManager()).N0();
                        if ((N0 == wl0Var2.getAdapter().h() - 1 || (N0 == wl0Var2.getAdapter().h() - 2 && wl0Var2 == se1Var.f37265a)) && (L = wl0Var2.L(N0)) != null) {
                            int bottom = L.f42929a.getBottom();
                            if (N0 == se1Var.d.f36463c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (wl0Var2.getMeasuredHeight() - bottom <= i20) {
                                wl0Var2.setTranslationY(-(wl0Var2.getMeasuredHeight() - bottom));
                                wl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        se1Var.f37265a.setPadding(0, 0, 0, 0);
                        se1Var.f37266b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && se1Var.f37269n.getVisibility() == 8 && se1Var.v != 1) {
                        se1Var.v = 1;
                        se1Var.f37269n.setVisibility(0);
                        se1Var.f37269n.setTranslationY(i20);
                        se1Var.f37269n.animate().setListener(null).cancel();
                        se1Var.f37269n.animate().translationY(0.0f).setDuration(200L).setListener(new oe1(se1Var, 1)).start();
                        se1Var.f37265a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        se1Var.f37266b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        se1Var.f37267c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (se1Var.f37271s.getVisibility() == 0) {
                            wl0Var = se1Var.f37266b;
                        } else {
                            wl0Var = se1Var.f37265a;
                        }
                        int height = wl0Var.getHeight() - view.getBottom();
                        if (height < i20) {
                            wl0Var.w0(0, i20 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                dg1.V((dg1) obj, view);
                return;
            case 10:
                dg1 dg1Var = ((zf1) obj).f40133u0;
                if (view instanceof org.telegram.ui.Cells.sa) {
                    ng.d.m(dg1Var, dg1Var.f32970a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    return;
                } else if (view instanceof ag1) {
                    ag1 ag1Var = (ag1) view;
                    ng.d.m(dg1Var, dg1Var.f32970a, ag1Var.N, ag1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 11:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                return;
            case 12:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                return;
            default:
                hj1 hj1Var = (hj1) obj;
                hj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = t8.b.j(string, " ");
                String[] strArr = WallpapersListActivity.f31865l0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = hj1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                hj1Var.f34175n = strArr[i10];
                hj1Var.E("", true);
                return;
        }
    }
}
