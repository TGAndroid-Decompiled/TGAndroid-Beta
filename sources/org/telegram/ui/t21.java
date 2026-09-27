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
public final class t21 implements org.telegram.ui.Components.ml0 {
    public final int f37637a;
    public final Object f37638b;

    public t21(Object obj, int i10) {
        this.f37637a = i10;
        this.f37638b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.xq0 xq0Var;
        qi.a aVar;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.yl0 yl0Var;
        org.telegram.ui.Components.yl0 yl0Var2;
        s4.c1 L;
        int i11 = 0;
        switch (this.f37637a) {
            case 0:
                x21 x21Var = (x21) this.f37638b;
                org.telegram.ui.Components.yl0 yl0Var3 = x21Var.f39510y;
                org.telegram.ui.Components.mp mpVar = x21Var.f39502b;
                if (mpVar.d.get(i10) != x21Var.K && x21Var.O == null) {
                    x21Var.Q = false;
                    x21Var.K = (org.telegram.ui.Components.np) mpVar.d.get(i10);
                    mpVar.E(i10);
                    x21Var.h.postDelayed(new org.telegram.ui.Components.kd(x21Var, i10, 25), 100L);
                    while (i11 < yl0Var3.getChildCount()) {
                        org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) yl0Var3.getChildAt(i11);
                        if (j21Var != view && (xq0Var = j21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(xq0Var);
                            j21Var.J.run();
                        }
                        i11++;
                    }
                    if (!((org.telegram.ui.Components.np) mpVar.d.get(i10)).f26877a.f18800a) {
                        ((org.telegram.ui.Components.j21) view).d();
                    }
                    i21 i21Var = x21Var.J;
                    if (i21Var != null) {
                        i21Var.f34344a.d0(i10, x21Var.K.f26877a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f31.U((f31) this.f37638b, view);
                return;
            case 2:
                y31.U((y31) this.f37638b, view, i10);
                return;
            case 3:
                h41 h41Var = (h41) this.f37638b;
                qi.a aVar2 = qi.e.f42134b;
                if (i10 == 1) {
                    boolean z13 = !aVar2.a();
                    synchronized (aVar2) {
                        aVar2.f42126c = z13;
                        aVar2.f42125b = true;
                        qi.d.f42132a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    h41Var.f34134b.l();
                    return;
                } else if (aVar2.a()) {
                    if (i10 == 2) {
                        h41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.e1(23));
                        return;
                    } else if (i10 == 3) {
                        h41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.e1(24));
                        return;
                    } else if (i10 == 4) {
                        h41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.e1(25));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = h41.f34132c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = h41.U(iArr[i11]);
                                i11++;
                            } else {
                                h41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.e1(26));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        qi.e.f42137g.b(!aVar.a());
                        h41Var.f34134b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                m71 m71Var = (m71) this.f37638b;
                org.telegram.ui.Components.x51 G = m71Var.f35545i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        m71Var.f35537a0 = (TLObject) G.G;
                        m71Var.U(true);
                        m71Var.f35545i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((p71) this.f37638b).Q(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.f37638b, i10);
                return;
            case 7:
                ra1 ra1Var = (ra1) this.f37638b;
                ArrayList arrayList = ra1Var.N;
                ArrayList arrayList2 = ra1Var.O;
                w91 w91Var = ra1Var.W;
                int i12 = w91Var.I;
                if (i10 >= i12 && i10 <= w91Var.J) {
                    oa1 oa1Var = (oa1) ra1Var.f37081v0.get(i10 - i12);
                    gj0 gj0Var = new gj0(oa1Var.f36173b, true, ra1Var.f37056b);
                    gj0Var.f33961e0 = oa1Var;
                    ra1Var.presentFragment(gj0Var);
                    return;
                }
                int i13 = w91Var.U;
                if (i10 >= i13 && i10 <= w91Var.V) {
                    ((ka1) ra1Var.Q.get(i10 - i13)).b(ra1Var);
                    return;
                }
                int i14 = w91Var.R;
                if (i10 >= i14 && i10 <= w91Var.S) {
                    ((ka1) arrayList2.get(i10 - i14)).b(ra1Var);
                    return;
                }
                int i15 = w91Var.X;
                if (i10 >= i15 && i10 <= w91Var.Y) {
                    ((ka1) ra1Var.P.get(i10 - i15)).b(ra1Var);
                    return;
                } else if (i10 == w91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = ra1Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    w91 w91Var2 = ra1Var.W;
                    if (w91Var2 != null) {
                        w91Var2.E();
                        ra1Var.S.setItemAnimator(ra1Var.X);
                        ra1Var.W.s(i16 + 1, size);
                        ra1Var.W.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                pd1 pd1Var = (pd1) this.f37638b;
                if (pd1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pd1Var.Z0(i10);
                if (pd1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    pd1Var.M0();
                    pd1Var.l1();
                }
                pd1Var.n1();
                org.telegram.ui.Components.z81 z81Var = pd1Var.J0[1];
                if (pd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z81Var.a(z12, true);
                pd1Var.P0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    pd1Var.P0.w0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > pd1Var.P0.getMeasuredWidth()) {
                    wb1 wb1Var = pd1Var.P0;
                    wb1Var.w0(i18 - wb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                le1 le1Var = (le1) this.f37638b;
                int i19 = le1Var.H;
                HashSet hashSet = le1Var.f35335w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f18329id))) {
                        hashSet.remove(Long.valueOf(chat.f18329id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f18329id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && le1Var.v != -1 && le1Var.f35332n.getVisibility() == 0) {
                        le1Var.v = -1;
                        le1Var.f35332n.animate().setListener(null).cancel();
                        le1Var.f35332n.animate().translationY(i19).setDuration(200L).setListener(new he1(le1Var, 0)).start();
                        if (le1Var.f35334s.getVisibility() == 0) {
                            yl0Var2 = le1Var.f35329b;
                        } else {
                            yl0Var2 = le1Var.f35328a;
                        }
                        yl0Var2.e1(false);
                        int N0 = ((s4.c0) yl0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == yl0Var2.getAdapter().h() - 1 || (N0 == yl0Var2.getAdapter().h() - 2 && yl0Var2 == le1Var.f35328a)) && (L = yl0Var2.L(N0)) != null) {
                            int bottom = L.f43005a.getBottom();
                            if (N0 == le1Var.d.f34458c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (yl0Var2.getMeasuredHeight() - bottom <= i19) {
                                yl0Var2.setTranslationY(-(yl0Var2.getMeasuredHeight() - bottom));
                                yl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        le1Var.f35328a.setPadding(0, 0, 0, 0);
                        le1Var.f35329b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && le1Var.f35332n.getVisibility() == 8 && le1Var.v != 1) {
                        le1Var.v = 1;
                        le1Var.f35332n.setVisibility(0);
                        le1Var.f35332n.setTranslationY(i19);
                        le1Var.f35332n.animate().setListener(null).cancel();
                        le1Var.f35332n.animate().translationY(0.0f).setDuration(200L).setListener(new he1(le1Var, 1)).start();
                        le1Var.f35328a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        le1Var.f35329b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        le1Var.f35330c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (le1Var.f35334s.getVisibility() == 0) {
                            yl0Var = le1Var.f35329b;
                        } else {
                            yl0Var = le1Var.f35328a;
                        }
                        int height = yl0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            yl0Var.w0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                wf1.V((wf1) this.f37638b, view);
                return;
            case 11:
                wf1 wf1Var = ((sf1) this.f37638b).f37444u0;
                if (view instanceof org.telegram.ui.Cells.sa) {
                    ng.d.m(wf1Var, wf1Var.f39287a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    return;
                } else if (view instanceof tf1) {
                    tf1 tf1Var = (tf1) view;
                    ng.d.m(wf1Var, wf1Var.f39287a, tf1Var.N, tf1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f37638b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f37638b, i10);
                return;
            default:
                zi1 zi1Var = (zi1) this.f37638b;
                zi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder h = v7.k0.h(string, " ");
                String[] strArr = WallpapersListActivity.f31909l0;
                h.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(h.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = zi1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                zi1Var.f40538n = strArr[i10];
                zi1Var.E("", true);
                return;
        }
    }
}
