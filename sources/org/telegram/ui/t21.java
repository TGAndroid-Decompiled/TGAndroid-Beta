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
    public final int f40684a;
    public final Object f40685b;

    public t21(Object obj, int i10) {
        this.f40684a = i10;
        this.f40685b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.br0 br0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.zl0 zl0Var;
        org.telegram.ui.Components.zl0 zl0Var2;
        s4.c1 K;
        int i11 = 0;
        switch (this.f40684a) {
            case 0:
                x21 x21Var = (x21) this.f40685b;
                org.telegram.ui.Components.zl0 zl0Var3 = x21Var.f42741y;
                org.telegram.ui.Components.np npVar = x21Var.f42732b;
                if (npVar.d.get(i10) != x21Var.K && x21Var.O == null) {
                    x21Var.Q = false;
                    x21Var.K = (org.telegram.ui.Components.op) npVar.d.get(i10);
                    npVar.E(i10);
                    x21Var.h.postDelayed(new org.telegram.ui.Components.ld(x21Var, i10, 25), 100L);
                    while (i11 < zl0Var3.getChildCount()) {
                        org.telegram.ui.Components.s21 s21Var = (org.telegram.ui.Components.s21) zl0Var3.getChildAt(i11);
                        if (s21Var != view && (br0Var = s21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(br0Var);
                            s21Var.J.run();
                        }
                        i11++;
                    }
                    if (!((org.telegram.ui.Components.op) npVar.d.get(i10)).f29428a.f20504a) {
                        ((org.telegram.ui.Components.s21) view).d();
                    }
                    i21 i21Var = x21Var.J;
                    if (i21Var != null) {
                        i21Var.f37230a.d0(i10, x21Var.K.f29428a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f31.S((f31) this.f40685b, view);
                return;
            case 2:
                y31.S((y31) this.f40685b, view, i10);
                return;
            case 3:
                h41 h41Var = (h41) this.f40685b;
                ri.a aVar = ri.e.f46451b;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f46443c = true;
                        aVar.f46442b = true;
                        ri.d.f46449a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    h41Var.f36864b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        h41Var.T(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.e1(24));
                        return;
                    } else if (i10 == 3) {
                        h41Var.T(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.e1(25));
                        return;
                    } else if (i10 == 4) {
                        h41Var.T(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.e1(26));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = h41.f36862c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = h41.S(iArr[i11]);
                                i11++;
                            } else {
                                h41Var.T(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.e1(27));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        ri.a aVar2 = ri.e.f46455g;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        h41Var.f36864b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                m71 m71Var = (m71) this.f40685b;
                org.telegram.ui.Components.g61 G = m71Var.f38467i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        m71Var.f38459a0 = (TLObject) G.G;
                        m71Var.S(true);
                        m71Var.f38467i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((p71) this.f40685b).O(i10, view);
                return;
            case 6:
                SessionsActivity.S((SessionsActivity) this.f40685b, i10);
                return;
            case 7:
                va1 va1Var = (va1) this.f40685b;
                ArrayList arrayList = va1Var.N;
                ArrayList arrayList2 = va1Var.O;
                aa1 aa1Var = va1Var.W;
                int i12 = aa1Var.I;
                if (i10 >= i12 && i10 <= aa1Var.J) {
                    sa1 sa1Var = (sa1) va1Var.f41679y0.get(i10 - i12);
                    hj0 hj0Var = new hj0(sa1Var.f40443b, true, va1Var.f41647b);
                    hj0Var.f37101e0 = sa1Var;
                    va1Var.presentFragment(hj0Var);
                    return;
                }
                int i13 = aa1Var.U;
                if (i10 >= i13 && i10 <= aa1Var.V) {
                    ((oa1) va1Var.Q.get(i10 - i13)).b(va1Var);
                    return;
                }
                int i14 = aa1Var.R;
                if (i10 >= i14 && i10 <= aa1Var.S) {
                    ((oa1) arrayList2.get(i10 - i14)).b(va1Var);
                    return;
                }
                int i15 = aa1Var.X;
                if (i10 >= i15 && i10 <= aa1Var.Y) {
                    ((oa1) va1Var.P.get(i10 - i15)).b(va1Var);
                    return;
                } else if (i10 == aa1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = va1Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    aa1 aa1Var2 = va1Var.W;
                    if (aa1Var2 != null) {
                        aa1Var2.E();
                        va1Var.S.setItemAnimator(va1Var.X);
                        va1Var.W.s(i16 + 1, size);
                        va1Var.W.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                rd1 rd1Var = (rd1) this.f40685b;
                if (rd1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rd1Var.Z0(i10);
                if (rd1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    rd1Var.M0();
                    rd1Var.l1();
                }
                rd1Var.n1();
                org.telegram.ui.Components.h91 h91Var = rd1Var.J0[1];
                if (rd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h91Var.a(z12, true);
                rd1Var.P0.h1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    rd1Var.P0.w0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > rd1Var.P0.getMeasuredWidth()) {
                    zb1 zb1Var = rd1Var.P0;
                    zb1Var.w0(i18 - zb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                ne1 ne1Var = (ne1) this.f40685b;
                int i19 = ne1Var.H;
                HashSet hashSet = ne1Var.f38969w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20042id))) {
                        hashSet.remove(Long.valueOf(chat.f20042id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20042id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ne1Var.v != -1 && ne1Var.f38966n.getVisibility() == 0) {
                        ne1Var.v = -1;
                        ne1Var.f38966n.animate().setListener(null).cancel();
                        ne1Var.f38966n.animate().translationY(i19).setDuration(200L).setListener(new je1(ne1Var, 0)).start();
                        if (ne1Var.f38968s.getVisibility() == 0) {
                            zl0Var2 = ne1Var.f38962b;
                        } else {
                            zl0Var2 = ne1Var.f38961a;
                        }
                        zl0Var2.e1(false);
                        int N0 = ((s4.c0) zl0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == zl0Var2.getAdapter().h() - 1 || (N0 == zl0Var2.getAdapter().h() - 2 && zl0Var2 == ne1Var.f38961a)) && (K = zl0Var2.K(N0)) != null) {
                            int bottom = K.f46531a.getBottom();
                            if (N0 == ne1Var.d.f37964c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (zl0Var2.getMeasuredHeight() - bottom <= i19) {
                                zl0Var2.setTranslationY(-(zl0Var2.getMeasuredHeight() - bottom));
                                zl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ne1Var.f38961a.setPadding(0, 0, 0, 0);
                        ne1Var.f38962b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && ne1Var.f38966n.getVisibility() == 8 && ne1Var.v != 1) {
                        ne1Var.v = 1;
                        ne1Var.f38966n.setVisibility(0);
                        ne1Var.f38966n.setTranslationY(i19);
                        ne1Var.f38966n.animate().setListener(null).cancel();
                        ne1Var.f38966n.animate().translationY(0.0f).setDuration(200L).setListener(new je1(ne1Var, 1)).start();
                        ne1Var.f38961a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        ne1Var.f38962b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        ne1Var.f38963c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (ne1Var.f38968s.getVisibility() == 0) {
                            zl0Var = ne1Var.f38962b;
                        } else {
                            zl0Var = ne1Var.f38961a;
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
                yf1.T((yf1) this.f40685b, view);
                return;
            case 11:
                yf1 yf1Var = ((uf1) this.f40685b).f41196v0;
                if (view instanceof org.telegram.ui.Cells.sa) {
                    ng.d.m(yf1Var, yf1Var.f43170a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    return;
                } else if (view instanceof vf1) {
                    vf1 vf1Var = (vf1) view;
                    ng.d.m(yf1Var, yf1Var.f43170a, vf1Var.N, vf1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f40685b, i10);
                return;
            case 13:
                WallpapersListActivity.T((WallpapersListActivity) this.f40685b, i10);
                return;
            default:
                bj1 bj1Var = (bj1) this.f40685b;
                bj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = sa.e.j(string, " ");
                String[] strArr = WallpapersListActivity.f34603l0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = bj1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                bj1Var.f35132n = strArr[i10];
                bj1Var.E("", true);
                return;
        }
    }
}
