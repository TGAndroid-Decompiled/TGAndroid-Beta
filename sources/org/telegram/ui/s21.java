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
public final class s21 implements org.telegram.ui.Components.al0 {
    public final int f37107a;
    public final Object f37108b;

    public s21(Object obj, int i10) {
        this.f37107a = i10;
        this.f37108b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.jq0 jq0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ml0 ml0Var;
        org.telegram.ui.Components.ml0 ml0Var2;
        s4.c1 K;
        int i11 = this.f37107a;
        Object obj = this.f37108b;
        switch (i11) {
            case 0:
                w21 w21Var = (w21) obj;
                org.telegram.ui.Components.ml0 ml0Var3 = w21Var.f38524y;
                org.telegram.ui.Components.lp lpVar = w21Var.f38516b;
                if (lpVar.d.get(i10) != w21Var.K && w21Var.O == null) {
                    w21Var.Q = false;
                    w21Var.K = (org.telegram.ui.Components.mp) lpVar.d.get(i10);
                    lpVar.E(i10);
                    w21Var.h.postDelayed(new org.telegram.ui.Components.kd(w21Var, i10, 26), 100L);
                    for (int i12 = 0; i12 < ml0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) ml0Var3.getChildAt(i12);
                        if (t11Var != view && (jq0Var = t11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(jq0Var);
                            t11Var.J.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.mp) lpVar.d.get(i10)).f26253a.f18533a) {
                        ((org.telegram.ui.Components.t11) view).d();
                    }
                    i21 i21Var = w21Var.J;
                    if (i21Var != null) {
                        i21Var.f33971a.d0(i10, w21Var.K.f26253a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e31.U((e31) obj, view);
                return;
            case 2:
                x31.U((x31) obj, view, i10);
                return;
            case 3:
                j71 j71Var = (j71) obj;
                org.telegram.ui.Components.h51 G = j71Var.f34355i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        j71Var.f34347a0 = (TLObject) G.G;
                        j71Var.U(true);
                        j71Var.f34355i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((m71) obj).Q(i10, view);
                return;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 6:
                ra1 ra1Var = (ra1) obj;
                ArrayList arrayList = ra1Var.N;
                ArrayList arrayList2 = ra1Var.O;
                w91 w91Var = ra1Var.X;
                int i13 = w91Var.I;
                if (i10 >= i13 && i10 <= w91Var.J) {
                    oa1 oa1Var = (oa1) ra1Var.f36779v0.get(i10 - i13);
                    ej0 ej0Var = new ej0(oa1Var.f35755b, true, ra1Var.f36754b);
                    ej0Var.f32951e0 = oa1Var;
                    ra1Var.presentFragment(ej0Var);
                    return;
                }
                int i14 = w91Var.U;
                if (i10 >= i14 && i10 <= w91Var.V) {
                    ((ka1) ra1Var.Q.get(i10 - i14)).b(ra1Var);
                    return;
                }
                int i15 = w91Var.R;
                if (i10 >= i15 && i10 <= w91Var.S) {
                    ((ka1) arrayList2.get(i10 - i15)).b(ra1Var);
                    return;
                }
                int i16 = w91Var.X;
                if (i10 >= i16 && i10 <= w91Var.Y) {
                    ((ka1) ra1Var.P.get(i10 - i16)).b(ra1Var);
                    return;
                } else if (i10 == w91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = ra1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    w91 w91Var2 = ra1Var.X;
                    if (w91Var2 != null) {
                        w91Var2.E();
                        ra1Var.S.setItemAnimator(ra1Var.Y);
                        ra1Var.X.s(i17 + 1, size);
                        ra1Var.X.u(i17);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                od1 od1Var = (od1) obj;
                if (od1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                od1Var.Z0(i10);
                if (od1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    od1Var.M0();
                    od1Var.l1();
                }
                od1Var.n1();
                org.telegram.ui.Components.i81 i81Var = od1Var.J0[1];
                if (od1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i81Var.a(z12, true);
                od1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    od1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > od1Var.P0.getMeasuredWidth()) {
                    wb1 wb1Var = od1Var.P0;
                    wb1Var.v0(i19 - wb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                le1 le1Var = (le1) obj;
                int i20 = le1Var.H;
                HashSet hashSet = le1Var.f34963w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f18083id))) {
                        hashSet.remove(Long.valueOf(chat.f18083id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f18083id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && le1Var.v != -1 && le1Var.f34960n.getVisibility() == 0) {
                        le1Var.v = -1;
                        le1Var.f34960n.animate().setListener(null).cancel();
                        le1Var.f34960n.animate().translationY(i20).setDuration(200L).setListener(new he1(le1Var, 0)).start();
                        if (le1Var.f34962s.getVisibility() == 0) {
                            ml0Var2 = le1Var.f34957b;
                        } else {
                            ml0Var2 = le1Var.f34956a;
                        }
                        ml0Var2.d1(false);
                        int N0 = ((s4.c0) ml0Var2.getLayoutManager()).N0();
                        if ((N0 == ml0Var2.getAdapter().h() - 1 || (N0 == ml0Var2.getAdapter().h() - 2 && ml0Var2 == le1Var.f34956a)) && (K = ml0Var2.K(N0)) != null) {
                            int bottom = K.f42627a.getBottom();
                            if (N0 == le1Var.d.f34123c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (ml0Var2.getMeasuredHeight() - bottom <= i20) {
                                ml0Var2.setTranslationY(-(ml0Var2.getMeasuredHeight() - bottom));
                                ml0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        le1Var.f34956a.setPadding(0, 0, 0, 0);
                        le1Var.f34957b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && le1Var.f34960n.getVisibility() == 8 && le1Var.v != 1) {
                        le1Var.v = 1;
                        le1Var.f34960n.setVisibility(0);
                        le1Var.f34960n.setTranslationY(i20);
                        le1Var.f34960n.animate().setListener(null).cancel();
                        le1Var.f34960n.animate().translationY(0.0f).setDuration(200L).setListener(new he1(le1Var, 1)).start();
                        le1Var.f34956a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        le1Var.f34957b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        le1Var.f34958c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (le1Var.f34962s.getVisibility() == 0) {
                            ml0Var = le1Var.f34957b;
                        } else {
                            ml0Var = le1Var.f34956a;
                        }
                        int height = ml0Var.getHeight() - view.getBottom();
                        if (height < i20) {
                            ml0Var.v0(0, i20 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                wf1.V((wf1) obj, view);
                return;
            case 10:
                wf1 wf1Var = ((sf1) obj).f37294t0;
                if (view instanceof org.telegram.ui.Cells.ua) {
                    ng.d.m(wf1Var, wf1Var.f38936a, ((org.telegram.ui.Cells.ua) view).getTopic(), 0);
                    return;
                } else if (view instanceof tf1) {
                    tf1 tf1Var = (tf1) view;
                    ng.d.m(wf1Var, wf1Var.f38936a, tf1Var.N, tf1Var.getMessageId());
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
                bj1 bj1Var = (bj1) obj;
                bj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder h = w.c.h(string, " ");
                String[] strArr = WallpapersListActivity.f31591n0;
                h.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f31592o0[i10]));
                SpannableString spannableString = new SpannableString(h.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = bj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                bj1Var.f32132n = strArr[i10];
                bj1Var.E("", true);
                return;
        }
    }
}
