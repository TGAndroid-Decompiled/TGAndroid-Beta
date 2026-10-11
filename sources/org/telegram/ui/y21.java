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
public final class y21 implements org.telegram.ui.Components.fm0 {
    public final int f44274a;
    public final Object f44275b;

    public y21(Object obj, int i10) {
        this.f44274a = i10;
        this.f44275b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.pr0 pr0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.rm0 rm0Var;
        org.telegram.ui.Components.rm0 rm0Var2;
        s4.d1 K;
        int i11 = 0;
        switch (this.f44274a) {
            case 0:
                c31 c31Var = (c31) this.f44275b;
                org.telegram.ui.Components.rm0 rm0Var3 = c31Var.f36579y;
                org.telegram.ui.Components.aq aqVar = c31Var.f36570b;
                if (aqVar.d.get(i10) != c31Var.K && c31Var.O == null) {
                    c31Var.Q = false;
                    c31Var.K = (org.telegram.ui.Components.bq) aqVar.d.get(i10);
                    aqVar.E(i10);
                    c31Var.h.postDelayed(new org.telegram.ui.Components.nd(c31Var, i10, 27), 100L);
                    while (i11 < rm0Var3.getChildCount()) {
                        org.telegram.ui.Components.a31 a31Var = (org.telegram.ui.Components.a31) rm0Var3.getChildAt(i11);
                        if (a31Var != view && (pr0Var = a31Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(pr0Var);
                            a31Var.J.run();
                        }
                        i11++;
                    }
                    if (!((org.telegram.ui.Components.bq) aqVar.d.get(i10)).f25058a.f20503a) {
                        ((org.telegram.ui.Components.a31) view).d();
                    }
                    n21 n21Var = c31Var.J;
                    if (n21Var != null) {
                        n21Var.f40147a.c0(i10, c31Var.K.f25058a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k31.U((k31) this.f44275b, view);
                return;
            case 2:
                e41.U((e41) this.f44275b, view, i10);
                return;
            case 3:
                m41 m41Var = (m41) this.f44275b;
                qi.a aVar = qi.e.f46846b;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f46838c = true;
                        aVar.f46837b = true;
                        qi.d.f46844a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    m41Var.f39846b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        m41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new v20(15));
                        return;
                    } else if (i10 == 3) {
                        m41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new v20(16));
                        return;
                    } else if (i10 == 4) {
                        m41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new v20(17));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = m41.f39844c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = m41.U(iArr[i11]);
                                i11++;
                            } else {
                                m41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new v20(18));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        qi.a aVar2 = qi.e.f46850g;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        m41Var.f39846b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                t71 t71Var = (t71) this.f44275b;
                org.telegram.ui.Components.q61 G = t71Var.f42149i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).t(true, true);
                        t71Var.f42141a0 = (TLObject) G.G;
                        t71Var.V(true);
                        t71Var.f42149i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((w71) this.f44275b).R(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.f44275b, i10);
                return;
            case 7:
                ab1 ab1Var = (ab1) this.f44275b;
                ArrayList arrayList = ab1Var.N;
                ArrayList arrayList2 = ab1Var.O;
                fa1 fa1Var = ab1Var.X;
                int i12 = fa1Var.I;
                if (i10 >= i12 && i10 <= fa1Var.J) {
                    xa1 xa1Var = (xa1) ab1Var.f36023v0.get(i10 - i12);
                    kj0 kj0Var = new kj0(xa1Var.f44066b, true, ab1Var.f35997b);
                    kj0Var.f39391e0 = xa1Var;
                    ab1Var.presentFragment(kj0Var);
                    return;
                }
                int i13 = fa1Var.U;
                if (i10 >= i13 && i10 <= fa1Var.V) {
                    ((ta1) ab1Var.Q.get(i10 - i13)).b(ab1Var);
                    return;
                }
                int i14 = fa1Var.R;
                if (i10 >= i14 && i10 <= fa1Var.S) {
                    ((ta1) arrayList2.get(i10 - i14)).b(ab1Var);
                    return;
                }
                int i15 = fa1Var.X;
                if (i10 >= i15 && i10 <= fa1Var.Y) {
                    ((ta1) ab1Var.P.get(i10 - i15)).b(ab1Var);
                    return;
                } else if (i10 == fa1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = ab1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    fa1 fa1Var2 = ab1Var.X;
                    if (fa1Var2 != null) {
                        fa1Var2.E();
                        ab1Var.S.setItemAnimator(ab1Var.Y);
                        ab1Var.X.s(i16 + 1, size);
                        ab1Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                wd1 wd1Var = (wd1) this.f44275b;
                if (wd1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wd1Var.Z0(i10);
                if (wd1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    wd1Var.M0();
                    wd1Var.l1();
                }
                wd1Var.n1();
                org.telegram.ui.Components.q91 q91Var = wd1Var.J0[1];
                if (wd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                q91Var.a(z12, true);
                wd1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    wd1Var.P0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > wd1Var.P0.getMeasuredWidth()) {
                    ec1 ec1Var = wd1Var.P0;
                    ec1Var.v0(i18 - ec1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                te1 te1Var = (te1) this.f44275b;
                int i19 = te1Var.H;
                HashSet hashSet = te1Var.f42209w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20068id))) {
                        hashSet.remove(Long.valueOf(chat.f20068id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20068id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && te1Var.v != -1 && te1Var.f42206n.getVisibility() == 0) {
                        te1Var.v = -1;
                        te1Var.f42206n.animate().setListener(null).cancel();
                        te1Var.f42206n.animate().translationY(i19).setDuration(200L).setListener(new pe1(te1Var, 0)).start();
                        if (te1Var.f42208s.getVisibility() == 0) {
                            rm0Var2 = te1Var.f42202b;
                        } else {
                            rm0Var2 = te1Var.f42201a;
                        }
                        rm0Var2.d1(false);
                        int N0 = ((s4.d0) rm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == rm0Var2.getAdapter().h() - 1 || (N0 == rm0Var2.getAdapter().h() - 2 && rm0Var2 == te1Var.f42201a)) && (K = rm0Var2.K(N0)) != null) {
                            int bottom = K.f47782a.getBottom();
                            if (N0 == te1Var.d.f41195c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (rm0Var2.getMeasuredHeight() - bottom <= i19) {
                                rm0Var2.setTranslationY(-(rm0Var2.getMeasuredHeight() - bottom));
                                rm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        te1Var.f42201a.setPadding(0, 0, 0, 0);
                        te1Var.f42202b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && te1Var.f42206n.getVisibility() == 8 && te1Var.v != 1) {
                        te1Var.v = 1;
                        te1Var.f42206n.setVisibility(0);
                        te1Var.f42206n.setTranslationY(i19);
                        te1Var.f42206n.animate().setListener(null).cancel();
                        te1Var.f42206n.animate().translationY(0.0f).setDuration(200L).setListener(new pe1(te1Var, 1)).start();
                        te1Var.f42201a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        te1Var.f42202b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        te1Var.f42203c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (te1Var.f42208s.getVisibility() == 0) {
                            rm0Var = te1Var.f42202b;
                        } else {
                            rm0Var = te1Var.f42201a;
                        }
                        int height = rm0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            rm0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                eg1.V((eg1) this.f44275b, view);
                return;
            case 11:
                eg1 eg1Var = ((ag1) this.f44275b).f36122t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    ng.d.m(eg1Var, eg1Var.f37345a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else if (view instanceof bg1) {
                    bg1 bg1Var = (bg1) view;
                    ng.d.m(eg1Var, eg1Var.f37345a, bg1Var.N, bg1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f44275b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f44275b, i10);
                return;
            default:
                jj1 jj1Var = (jj1) this.f44275b;
                jj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = sc.v.j(string, " ");
                String[] strArr = WallpapersListActivity.f35834n0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f35835o0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = jj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                jj1Var.f39107n = strArr[i10];
                jj1Var.E("", true);
                return;
        }
    }
}
