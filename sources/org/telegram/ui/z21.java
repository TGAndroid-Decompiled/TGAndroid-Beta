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
public final class z21 implements org.telegram.ui.Components.zk0 {
    public final int f40050a;
    public final Object f40051b;

    public z21(Object obj, int i10) {
        this.f40050a = i10;
        this.f40051b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.jq0 jq0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ll0 ll0Var;
        org.telegram.ui.Components.ll0 ll0Var2;
        s4.c1 K;
        int i11 = this.f40050a;
        Object obj = this.f40051b;
        switch (i11) {
            case 0:
                d31 d31Var = (d31) obj;
                org.telegram.ui.Components.ll0 ll0Var3 = d31Var.f32914y;
                org.telegram.ui.Components.kp kpVar = d31Var.f32906b;
                if (kpVar.d.get(i10) != d31Var.K && d31Var.O == null) {
                    d31Var.Q = false;
                    d31Var.K = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    d31Var.h.postDelayed(new org.telegram.ui.Components.id(d31Var, i10, 26), 100L);
                    for (int i12 = 0; i12 < ll0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) ll0Var3.getChildAt(i12);
                        if (u11Var != view && (jq0Var = u11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(jq0Var);
                            u11Var.J.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f25994a.f18589a) {
                        ((org.telegram.ui.Components.u11) view).d();
                    }
                    p21 p21Var = d31Var.J;
                    if (p21Var != null) {
                        p21Var.f36399a.d0(i10, d31Var.K.f25994a, true);
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
                org.telegram.ui.Components.i51 G = q71Var.f36796i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        q71Var.f36788a0 = (TLObject) G.G;
                        q71Var.U(true);
                        q71Var.f36796i0.N(true);
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
                ya1 ya1Var = (ya1) obj;
                ArrayList arrayList = ya1Var.N;
                ArrayList arrayList2 = ya1Var.O;
                da1 da1Var = ya1Var.X;
                int i13 = da1Var.I;
                if (i10 >= i13 && i10 <= da1Var.J) {
                    va1 va1Var = (va1) ya1Var.f39822v0.get(i10 - i13);
                    jj0 jj0Var = new jj0(va1Var.f38488b, true, ya1Var.f39797b);
                    jj0Var.f34922e0 = va1Var;
                    ya1Var.presentFragment(jj0Var);
                    return;
                }
                int i14 = da1Var.U;
                if (i10 >= i14 && i10 <= da1Var.V) {
                    ((ra1) ya1Var.Q.get(i10 - i14)).b(ya1Var);
                    return;
                }
                int i15 = da1Var.R;
                if (i10 >= i15 && i10 <= da1Var.S) {
                    ((ra1) arrayList2.get(i10 - i15)).b(ya1Var);
                    return;
                }
                int i16 = da1Var.X;
                if (i10 >= i16 && i10 <= da1Var.Y) {
                    ((ra1) ya1Var.P.get(i10 - i16)).b(ya1Var);
                    return;
                } else if (i10 == da1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = ya1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    da1 da1Var2 = ya1Var.X;
                    if (da1Var2 != null) {
                        da1Var2.E();
                        ya1Var.S.setItemAnimator(ya1Var.Y);
                        ya1Var.X.s(i17 + 1, size);
                        ya1Var.X.u(i17);
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
                org.telegram.ui.Components.j81 j81Var = vd1Var.J0[1];
                if (vd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j81Var.a(z12, true);
                vd1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    vd1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > vd1Var.P0.getMeasuredWidth()) {
                    dc1 dc1Var = vd1Var.P0;
                    dc1Var.v0(i19 - dc1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                se1 se1Var = (se1) obj;
                int i20 = se1Var.H;
                HashSet hashSet = se1Var.f37375w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f18112id))) {
                        hashSet.remove(Long.valueOf(chat.f18112id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f18112id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && se1Var.v != -1 && se1Var.f37372n.getVisibility() == 0) {
                        se1Var.v = -1;
                        se1Var.f37372n.animate().setListener(null).cancel();
                        se1Var.f37372n.animate().translationY(i20).setDuration(200L).setListener(new oe1(se1Var, 0)).start();
                        if (se1Var.f37374s.getVisibility() == 0) {
                            ll0Var2 = se1Var.f37369b;
                        } else {
                            ll0Var2 = se1Var.f37368a;
                        }
                        ll0Var2.d1(false);
                        int N0 = ((s4.c0) ll0Var2.getLayoutManager()).N0();
                        if ((N0 == ll0Var2.getAdapter().h() - 1 || (N0 == ll0Var2.getAdapter().h() - 2 && ll0Var2 == se1Var.f37368a)) && (K = ll0Var2.K(N0)) != null) {
                            int bottom = K.f42675a.getBottom();
                            if (N0 == se1Var.d.f36560c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (ll0Var2.getMeasuredHeight() - bottom <= i20) {
                                ll0Var2.setTranslationY(-(ll0Var2.getMeasuredHeight() - bottom));
                                ll0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        se1Var.f37368a.setPadding(0, 0, 0, 0);
                        se1Var.f37369b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && se1Var.f37372n.getVisibility() == 8 && se1Var.v != 1) {
                        se1Var.v = 1;
                        se1Var.f37372n.setVisibility(0);
                        se1Var.f37372n.setTranslationY(i20);
                        se1Var.f37372n.animate().setListener(null).cancel();
                        se1Var.f37372n.animate().translationY(0.0f).setDuration(200L).setListener(new oe1(se1Var, 1)).start();
                        se1Var.f37368a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        se1Var.f37369b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        se1Var.f37370c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (se1Var.f37374s.getVisibility() == 0) {
                            ll0Var = se1Var.f37369b;
                        } else {
                            ll0Var = se1Var.f37368a;
                        }
                        int height = ll0Var.getHeight() - view.getBottom();
                        if (height < i20) {
                            ll0Var.v0(0, i20 - height, null);
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
                dg1 dg1Var = ((zf1) obj).f40207t0;
                if (view instanceof org.telegram.ui.Cells.ta) {
                    ng.d.m(dg1Var, dg1Var.f33012a, ((org.telegram.ui.Cells.ta) view).getTopic(), 0);
                    return;
                } else if (view instanceof ag1) {
                    ag1 ag1Var = (ag1) view;
                    ng.d.m(dg1Var, dg1Var.f33012a, ag1Var.N, ag1Var.getMessageId());
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
                ij1 ij1Var = (ij1) obj;
                ij1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder g10 = w.f.g(string, " ");
                String[] strArr = WallpapersListActivity.m0;
                g10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f31621n0[i10]));
                SpannableString spannableString = new SpannableString(g10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ij1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                ij1Var.f34694n = strArr[i10];
                ij1Var.E("", true);
                return;
        }
    }
}
