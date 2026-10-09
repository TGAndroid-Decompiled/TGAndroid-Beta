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
public final class z21 implements org.telegram.ui.Components.em0 {
    public final int f44467a;
    public final Object f44468b;

    public z21(Object obj, int i10) {
        this.f44467a = i10;
        this.f44468b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.or0 or0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.qm0 qm0Var;
        org.telegram.ui.Components.qm0 qm0Var2;
        s4.d1 K;
        int i11 = 0;
        switch (this.f44467a) {
            case 0:
                d31 d31Var = (d31) this.f44468b;
                org.telegram.ui.Components.qm0 qm0Var3 = d31Var.f36832y;
                org.telegram.ui.Components.aq aqVar = d31Var.f36823b;
                if (aqVar.d.get(i10) != d31Var.K && d31Var.O == null) {
                    d31Var.Q = false;
                    d31Var.K = (org.telegram.ui.Components.bq) aqVar.d.get(i10);
                    aqVar.E(i10);
                    d31Var.h.postDelayed(new org.telegram.ui.Components.nd(d31Var, i10, 26), 100L);
                    while (i11 < qm0Var3.getChildCount()) {
                        org.telegram.ui.Components.z21 z21Var = (org.telegram.ui.Components.z21) qm0Var3.getChildAt(i11);
                        if (z21Var != view && (or0Var = z21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(or0Var);
                            z21Var.J.run();
                        }
                        i11++;
                    }
                    if (!((org.telegram.ui.Components.bq) aqVar.d.get(i10)).f25082a.f20505a) {
                        ((org.telegram.ui.Components.z21) view).d();
                    }
                    o21 o21Var = d31Var.J;
                    if (o21Var != null) {
                        o21Var.f40402a.c0(i10, d31Var.K.f25082a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l31.U((l31) this.f44468b, view);
                return;
            case 2:
                f41.U((f41) this.f44468b, view, i10);
                return;
            case 3:
                n41 n41Var = (n41) this.f44468b;
                pi.a aVar = pi.e.f45893b;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f45885c = true;
                        aVar.f45884b = true;
                        pi.d.f45891a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    n41Var.f40074b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        n41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new a80(13));
                        return;
                    } else if (i10 == 3) {
                        n41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new a80(14));
                        return;
                    } else if (i10 == 4) {
                        n41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new a80(15));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = n41.f40072c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = n41.U(iArr[i11]);
                                i11++;
                            } else {
                                n41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new a80(16));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        pi.a aVar2 = pi.e.f45897g;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        n41Var.f40074b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                u71 u71Var = (u71) this.f44468b;
                org.telegram.ui.Components.p61 G = u71Var.f42360i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).t(true, true);
                        u71Var.f42352a0 = (TLObject) G.G;
                        u71Var.V(true);
                        u71Var.f42360i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((x71) this.f44468b).R(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.f44468b, i10);
                return;
            case 7:
                bb1 bb1Var = (bb1) this.f44468b;
                ArrayList arrayList = bb1Var.N;
                ArrayList arrayList2 = bb1Var.O;
                ga1 ga1Var = bb1Var.X;
                int i12 = ga1Var.I;
                if (i10 >= i12 && i10 <= ga1Var.J) {
                    ya1 ya1Var = (ya1) bb1Var.f36232v0.get(i10 - i12);
                    lj0 lj0Var = new lj0(ya1Var.f44306b, true, bb1Var.f36206b);
                    lj0Var.f39603e0 = ya1Var;
                    bb1Var.presentFragment(lj0Var);
                    return;
                }
                int i13 = ga1Var.U;
                if (i10 >= i13 && i10 <= ga1Var.V) {
                    ((ua1) bb1Var.Q.get(i10 - i13)).b(bb1Var);
                    return;
                }
                int i14 = ga1Var.R;
                if (i10 >= i14 && i10 <= ga1Var.S) {
                    ((ua1) arrayList2.get(i10 - i14)).b(bb1Var);
                    return;
                }
                int i15 = ga1Var.X;
                if (i10 >= i15 && i10 <= ga1Var.Y) {
                    ((ua1) bb1Var.P.get(i10 - i15)).b(bb1Var);
                    return;
                } else if (i10 == ga1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = bb1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ga1 ga1Var2 = bb1Var.X;
                    if (ga1Var2 != null) {
                        ga1Var2.E();
                        bb1Var.S.setItemAnimator(bb1Var.Y);
                        bb1Var.X.s(i16 + 1, size);
                        bb1Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                xd1 xd1Var = (xd1) this.f44468b;
                if (xd1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xd1Var.Z0(i10);
                if (xd1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    xd1Var.M0();
                    xd1Var.l1();
                }
                xd1Var.n1();
                org.telegram.ui.Components.p91 p91Var = xd1Var.J0[1];
                if (xd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p91Var.a(z12, true);
                xd1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    xd1Var.P0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > xd1Var.P0.getMeasuredWidth()) {
                    fc1 fc1Var = xd1Var.P0;
                    fc1Var.v0(i18 - fc1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                ue1 ue1Var = (ue1) this.f44468b;
                int i19 = ue1Var.H;
                HashSet hashSet = ue1Var.f42420w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20038id))) {
                        hashSet.remove(Long.valueOf(chat.f20038id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20038id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ue1Var.v != -1 && ue1Var.f42417n.getVisibility() == 0) {
                        ue1Var.v = -1;
                        ue1Var.f42417n.animate().setListener(null).cancel();
                        ue1Var.f42417n.animate().translationY(i19).setDuration(200L).setListener(new qe1(ue1Var, 0)).start();
                        if (ue1Var.f42419s.getVisibility() == 0) {
                            qm0Var2 = ue1Var.f42413b;
                        } else {
                            qm0Var2 = ue1Var.f42412a;
                        }
                        qm0Var2.d1(false);
                        int N0 = ((s4.d0) qm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == qm0Var2.getAdapter().h() - 1 || (N0 == qm0Var2.getAdapter().h() - 2 && qm0Var2 == ue1Var.f42412a)) && (K = qm0Var2.K(N0)) != null) {
                            int bottom = K.f47658a.getBottom();
                            if (N0 == ue1Var.d.f41401c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (qm0Var2.getMeasuredHeight() - bottom <= i19) {
                                qm0Var2.setTranslationY(-(qm0Var2.getMeasuredHeight() - bottom));
                                qm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ue1Var.f42412a.setPadding(0, 0, 0, 0);
                        ue1Var.f42413b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && ue1Var.f42417n.getVisibility() == 8 && ue1Var.v != 1) {
                        ue1Var.v = 1;
                        ue1Var.f42417n.setVisibility(0);
                        ue1Var.f42417n.setTranslationY(i19);
                        ue1Var.f42417n.animate().setListener(null).cancel();
                        ue1Var.f42417n.animate().translationY(0.0f).setDuration(200L).setListener(new qe1(ue1Var, 1)).start();
                        ue1Var.f42412a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        ue1Var.f42413b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        ue1Var.f42414c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (ue1Var.f42419s.getVisibility() == 0) {
                            qm0Var = ue1Var.f42413b;
                        } else {
                            qm0Var = ue1Var.f42412a;
                        }
                        int height = qm0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            qm0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                fg1.V((fg1) this.f44468b, view);
                return;
            case 11:
                fg1 fg1Var = ((bg1) this.f44468b).f36331t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    ng.d.m(fg1Var, fg1Var.f37558a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else if (view instanceof cg1) {
                    cg1 cg1Var = (cg1) view;
                    ng.d.m(fg1Var, fg1Var.f37558a, cg1Var.N, cg1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f44468b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f44468b, i10);
                return;
            default:
                lj1 lj1Var = (lj1) this.f44468b;
                lj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = sc.v.j(string, " ");
                String[] strArr = WallpapersListActivity.f35763n0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f35764o0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = lj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                lj1Var.f39614n = strArr[i10];
                lj1Var.E("", true);
                return;
        }
    }
}
