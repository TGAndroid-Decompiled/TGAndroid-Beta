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
    public final int f40696a;
    public final Object f40697b;

    public t21(Object obj, int i10) {
        this.f40696a = i10;
        this.f40697b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.gq0 gq0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.zl0 zl0Var;
        org.telegram.ui.Components.zl0 zl0Var2;
        s4.c1 K;
        int i11 = 0;
        switch (this.f40696a) {
            case 0:
                x21 x21Var = (x21) this.f40697b;
                org.telegram.ui.Components.zl0 zl0Var3 = x21Var.f42808y;
                org.telegram.ui.Components.np npVar = x21Var.f42799b;
                if (npVar.d.get(i10) != x21Var.K && x21Var.O == null) {
                    x21Var.Q = false;
                    x21Var.K = (org.telegram.ui.Components.op) npVar.d.get(i10);
                    npVar.E(i10);
                    x21Var.h.postDelayed(new org.telegram.ui.Components.ld(x21Var, i10, 25), 100L);
                    while (i11 < zl0Var3.getChildCount()) {
                        org.telegram.ui.Components.t21 t21Var = (org.telegram.ui.Components.t21) zl0Var3.getChildAt(i11);
                        if (t21Var != view && (gq0Var = t21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(gq0Var);
                            t21Var.J.run();
                        }
                        i11++;
                    }
                    if (!((org.telegram.ui.Components.op) npVar.d.get(i10)).f29528a.f20509a) {
                        ((org.telegram.ui.Components.t21) view).d();
                    }
                    i21 i21Var = x21Var.J;
                    if (i21Var != null) {
                        i21Var.f37231a.d0(i10, x21Var.K.f29528a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                d31.S((d31) this.f40697b, view);
                return;
            case 2:
                w31.S((w31) this.f40697b, view, i10);
                return;
            case 3:
                f41 f41Var = (f41) this.f40697b;
                ri.a aVar = ri.e.f46458b;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f46450c = true;
                        aVar.f46449b = true;
                        ri.d.f46456a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    f41Var.f36204b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        f41Var.T(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.e1(24));
                        return;
                    } else if (i10 == 3) {
                        f41Var.T(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.e1(25));
                        return;
                    } else if (i10 == 4) {
                        f41Var.T(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.e1(26));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = f41.f36202c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = f41.S(iArr[i11]);
                                i11++;
                            } else {
                                f41Var.T(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.e1(27));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        ri.a aVar2 = ri.e.f46462g;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        f41Var.f36204b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                k71 k71Var = (k71) this.f40697b;
                org.telegram.ui.Components.h61 G = k71Var.f37879i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        k71Var.f37871a0 = (TLObject) G.G;
                        k71Var.S(true);
                        k71Var.f37879i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((n71) this.f40697b).O(i10, view);
                return;
            case 6:
                SessionsActivity.S((SessionsActivity) this.f40697b, i10);
                return;
            case 7:
                ta1 ta1Var = (ta1) this.f40697b;
                ArrayList arrayList = ta1Var.N;
                ArrayList arrayList2 = ta1Var.O;
                y91 y91Var = ta1Var.W;
                int i12 = y91Var.I;
                if (i10 >= i12 && i10 <= y91Var.J) {
                    qa1 qa1Var = (qa1) ta1Var.f40836y0.get(i10 - i12);
                    hj0 hj0Var = new hj0(qa1Var.f39754b, true, ta1Var.f40804b);
                    hj0Var.f37109e0 = qa1Var;
                    ta1Var.presentFragment(hj0Var);
                    return;
                }
                int i13 = y91Var.U;
                if (i10 >= i13 && i10 <= y91Var.V) {
                    ((ma1) ta1Var.Q.get(i10 - i13)).b(ta1Var);
                    return;
                }
                int i14 = y91Var.R;
                if (i10 >= i14 && i10 <= y91Var.S) {
                    ((ma1) arrayList2.get(i10 - i14)).b(ta1Var);
                    return;
                }
                int i15 = y91Var.X;
                if (i10 >= i15 && i10 <= y91Var.Y) {
                    ((ma1) ta1Var.P.get(i10 - i15)).b(ta1Var);
                    return;
                } else if (i10 == y91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = ta1Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    y91 y91Var2 = ta1Var.W;
                    if (y91Var2 != null) {
                        y91Var2.E();
                        ta1Var.S.setItemAnimator(ta1Var.X);
                        ta1Var.W.s(i16 + 1, size);
                        ta1Var.W.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                pd1 pd1Var = (pd1) this.f40697b;
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
                org.telegram.ui.Components.i91 i91Var = pd1Var.J0[1];
                if (pd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i91Var.a(z12, true);
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
                    xb1 xb1Var = pd1Var.P0;
                    xb1Var.w0(i18 - xb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                le1 le1Var = (le1) this.f40697b;
                int i19 = le1Var.H;
                HashSet hashSet = le1Var.f38305w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20047id))) {
                        hashSet.remove(Long.valueOf(chat.f20047id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20047id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && le1Var.v != -1 && le1Var.f38302n.getVisibility() == 0) {
                        le1Var.v = -1;
                        le1Var.f38302n.animate().setListener(null).cancel();
                        le1Var.f38302n.animate().translationY(i19).setDuration(200L).setListener(new he1(le1Var, 0)).start();
                        if (le1Var.f38304s.getVisibility() == 0) {
                            zl0Var2 = le1Var.f38298b;
                        } else {
                            zl0Var2 = le1Var.f38297a;
                        }
                        zl0Var2.d1(false);
                        int N0 = ((s4.c0) zl0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == zl0Var2.getAdapter().h() - 1 || (N0 == zl0Var2.getAdapter().h() - 2 && zl0Var2 == le1Var.f38297a)) && (K = zl0Var2.K(N0)) != null) {
                            int bottom = K.f46538a.getBottom();
                            if (N0 == le1Var.d.f37400c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (zl0Var2.getMeasuredHeight() - bottom <= i19) {
                                zl0Var2.setTranslationY(-(zl0Var2.getMeasuredHeight() - bottom));
                                zl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        le1Var.f38297a.setPadding(0, 0, 0, 0);
                        le1Var.f38298b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && le1Var.f38302n.getVisibility() == 8 && le1Var.v != 1) {
                        le1Var.v = 1;
                        le1Var.f38302n.setVisibility(0);
                        le1Var.f38302n.setTranslationY(i19);
                        le1Var.f38302n.animate().setListener(null).cancel();
                        le1Var.f38302n.animate().translationY(0.0f).setDuration(200L).setListener(new he1(le1Var, 1)).start();
                        le1Var.f38297a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        le1Var.f38298b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        le1Var.f38299c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (le1Var.f38304s.getVisibility() == 0) {
                            zl0Var = le1Var.f38298b;
                        } else {
                            zl0Var = le1Var.f38297a;
                        }
                        int height = zl0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            zl0Var.w0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                wf1.T((wf1) this.f40697b, view);
                return;
            case 11:
                wf1 wf1Var = ((sf1) this.f40697b).f40489v0;
                if (view instanceof org.telegram.ui.Cells.sa) {
                    ng.d.m(wf1Var, wf1Var.f42467a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    return;
                } else if (view instanceof tf1) {
                    tf1 tf1Var = (tf1) view;
                    ng.d.m(wf1Var, wf1Var.f42467a, tf1Var.N, tf1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f40697b, i10);
                return;
            case 13:
                WallpapersListActivity.T((WallpapersListActivity) this.f40697b, i10);
                return;
            default:
                zi1 zi1Var = (zi1) this.f40697b;
                zi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = sa.e.j(string, " ");
                String[] strArr = WallpapersListActivity.f34616l0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = zi1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                zi1Var.f43841n = strArr[i10];
                zi1Var.E("", true);
                return;
        }
    }
}
