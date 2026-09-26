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
public final class r21 implements org.telegram.ui.Components.ll0 {
    public final int f37173a;
    public final Object f37174b;

    public r21(Object obj, int i10) {
        this.f37173a = i10;
        this.f37174b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.xq0 xq0Var;
        pi.a aVar;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.xl0 xl0Var;
        org.telegram.ui.Components.xl0 xl0Var2;
        s4.c1 K;
        int i11 = 0;
        switch (this.f37173a) {
            case 0:
                v21 v21Var = (v21) this.f37174b;
                org.telegram.ui.Components.xl0 xl0Var3 = v21Var.f38616y;
                org.telegram.ui.Components.mp mpVar = v21Var.f38608b;
                if (mpVar.d.get(i10) != v21Var.K && v21Var.O == null) {
                    v21Var.Q = false;
                    v21Var.K = (org.telegram.ui.Components.np) mpVar.d.get(i10);
                    mpVar.E(i10);
                    v21Var.h.postDelayed(new org.telegram.ui.Components.ld(v21Var, i10, 26), 100L);
                    while (i11 < xl0Var3.getChildCount()) {
                        org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) xl0Var3.getChildAt(i11);
                        if (i21Var != view && (xq0Var = i21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(xq0Var);
                            i21Var.J.run();
                        }
                        i11++;
                    }
                    if (!((org.telegram.ui.Components.np) mpVar.d.get(i10)).f26860a.f18756a) {
                        ((org.telegram.ui.Components.i21) view).d();
                    }
                    g21 g21Var = v21Var.J;
                    if (g21Var != null) {
                        g21Var.f33805a.d0(i10, v21Var.K.f26860a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                d31.U((d31) this.f37174b, view);
                return;
            case 2:
                w31.U((w31) this.f37174b, view, i10);
                return;
            case 3:
                f41 f41Var = (f41) this.f37174b;
                pi.a aVar2 = pi.e.f41358b;
                if (i10 == 1) {
                    boolean z13 = !aVar2.a();
                    synchronized (aVar2) {
                        aVar2.f41350c = z13;
                        aVar2.f41349b = true;
                        pi.d.f41356a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    f41Var.f33544b.l();
                    return;
                } else if (aVar2.a()) {
                    if (i10 == 2) {
                        f41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.e1(22));
                        return;
                    } else if (i10 == 3) {
                        f41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.e1(23));
                        return;
                    } else if (i10 == 4) {
                        f41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.e1(24));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = f41.f33542c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = f41.U(iArr[i11]);
                                i11++;
                            } else {
                                f41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.e1(25));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        pi.e.f41361g.b(!aVar.a());
                        f41Var.f33544b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                k71 k71Var = (k71) this.f37174b;
                org.telegram.ui.Components.w51 G = k71Var.f34967i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        k71Var.f34959a0 = (TLObject) G.G;
                        k71Var.U(true);
                        k71Var.f34967i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((n71) this.f37174b).Q(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.f37174b, i10);
                return;
            case 7:
                sa1 sa1Var = (sa1) this.f37174b;
                ArrayList arrayList = sa1Var.N;
                ArrayList arrayList2 = sa1Var.O;
                x91 x91Var = sa1Var.X;
                int i12 = x91Var.I;
                if (i10 >= i12 && i10 <= x91Var.J) {
                    pa1 pa1Var = (pa1) sa1Var.f37693v0.get(i10 - i12);
                    dj0 dj0Var = new dj0(pa1Var.f36485b, true, sa1Var.f37668b);
                    dj0Var.f33138e0 = pa1Var;
                    sa1Var.presentFragment(dj0Var);
                    return;
                }
                int i13 = x91Var.U;
                if (i10 >= i13 && i10 <= x91Var.V) {
                    ((la1) sa1Var.Q.get(i10 - i13)).b(sa1Var);
                    return;
                }
                int i14 = x91Var.R;
                if (i10 >= i14 && i10 <= x91Var.S) {
                    ((la1) arrayList2.get(i10 - i14)).b(sa1Var);
                    return;
                }
                int i15 = x91Var.X;
                if (i10 >= i15 && i10 <= x91Var.Y) {
                    ((la1) sa1Var.P.get(i10 - i15)).b(sa1Var);
                    return;
                } else if (i10 == x91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = sa1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    x91 x91Var2 = sa1Var.X;
                    if (x91Var2 != null) {
                        x91Var2.E();
                        sa1Var.S.setItemAnimator(sa1Var.Y);
                        sa1Var.X.s(i16 + 1, size);
                        sa1Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                od1 od1Var = (od1) this.f37174b;
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
                org.telegram.ui.Components.y81 y81Var = od1Var.J0[1];
                if (od1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                y81Var.a(z12, true);
                od1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    od1Var.P0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > od1Var.P0.getMeasuredWidth()) {
                    wb1 wb1Var = od1Var.P0;
                    wb1Var.v0(i18 - wb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                le1 le1Var = (le1) this.f37174b;
                int i19 = le1Var.H;
                HashSet hashSet = le1Var.f35345w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f18335id))) {
                        hashSet.remove(Long.valueOf(chat.f18335id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f18335id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && le1Var.v != -1 && le1Var.f35342n.getVisibility() == 0) {
                        le1Var.v = -1;
                        le1Var.f35342n.animate().setListener(null).cancel();
                        le1Var.f35342n.animate().translationY(i19).setDuration(200L).setListener(new he1(le1Var, 0)).start();
                        if (le1Var.f35344s.getVisibility() == 0) {
                            xl0Var2 = le1Var.f35339b;
                        } else {
                            xl0Var2 = le1Var.f35338a;
                        }
                        xl0Var2.d1(false);
                        int N0 = ((s4.c0) xl0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == xl0Var2.getAdapter().h() - 1 || (N0 == xl0Var2.getAdapter().h() - 2 && xl0Var2 == le1Var.f35338a)) && (K = xl0Var2.K(N0)) != null) {
                            int bottom = K.f42959a.getBottom();
                            if (N0 == le1Var.d.f34504c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (xl0Var2.getMeasuredHeight() - bottom <= i19) {
                                xl0Var2.setTranslationY(-(xl0Var2.getMeasuredHeight() - bottom));
                                xl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        le1Var.f35338a.setPadding(0, 0, 0, 0);
                        le1Var.f35339b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && le1Var.f35342n.getVisibility() == 8 && le1Var.v != 1) {
                        le1Var.v = 1;
                        le1Var.f35342n.setVisibility(0);
                        le1Var.f35342n.setTranslationY(i19);
                        le1Var.f35342n.animate().setListener(null).cancel();
                        le1Var.f35342n.animate().translationY(0.0f).setDuration(200L).setListener(new he1(le1Var, 1)).start();
                        le1Var.f35338a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        le1Var.f35339b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        le1Var.f35340c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (le1Var.f35344s.getVisibility() == 0) {
                            xl0Var = le1Var.f35339b;
                        } else {
                            xl0Var = le1Var.f35338a;
                        }
                        int height = xl0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            xl0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                wf1.V((wf1) this.f37174b, view);
                return;
            case 11:
                wf1 wf1Var = ((sf1) this.f37174b).f37752t0;
                if (view instanceof org.telegram.ui.Cells.sa) {
                    ng.d.m(wf1Var, wf1Var.f39307a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    return;
                } else if (view instanceof tf1) {
                    tf1 tf1Var = (tf1) view;
                    ng.d.m(wf1Var, wf1Var.f39307a, tf1Var.N, tf1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f37174b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f37174b, i10);
                return;
            default:
                bj1 bj1Var = (bj1) this.f37174b;
                bj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder h = v7.j.h(string, " ");
                String[] strArr = WallpapersListActivity.f31905n0;
                h.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f31906o0[i10]));
                SpannableString spannableString = new SpannableString(h.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = bj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                bj1Var.f32438n = strArr[i10];
                bj1Var.E("", true);
                return;
        }
    }
}
