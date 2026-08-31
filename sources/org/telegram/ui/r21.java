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
public final class r21 implements org.telegram.ui.Components.jl0 {
    public final int f40756a;
    public final Object f40757b;

    public r21(Object obj, int i10) {
        this.f40756a = i10;
        this.f40757b = obj;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.tl0 tl0Var;
        org.telegram.ui.Components.tl0 tl0Var2;
        f2.m1 K;
        int i11 = this.f40756a;
        Object obj = this.f40757b;
        switch (i11) {
            case 0:
                w21.U((w21) obj, view);
                return;
            case 1:
                p31.U((p31) obj, view, i10);
                return;
            case 2:
                c71 c71Var = (c71) obj;
                org.telegram.ui.Components.j51 G = c71Var.f35701f0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        c71Var.X = (TLObject) G.G;
                        c71Var.U(true);
                        c71Var.f35701f0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((f71) obj).Q(i10, view);
                return;
            case 4:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 5:
                ha1 ha1Var = (ha1) obj;
                ArrayList arrayList = ha1Var.K;
                ArrayList arrayList2 = ha1Var.L;
                m91 m91Var = ha1Var.U;
                int i12 = m91Var.F;
                if (i10 >= i12 && i10 <= m91Var.G) {
                    ea1 ea1Var = (ea1) ha1Var.f37441s0.get(i10 - i12);
                    bj0 bj0Var = new bj0(ea1Var.f36456b, true, ha1Var.f37418b);
                    bj0Var.f35539b0 = ea1Var;
                    ha1Var.presentFragment(bj0Var);
                    return;
                }
                int i13 = m91Var.R;
                if (i10 >= i13 && i10 <= m91Var.S) {
                    ((aa1) ha1Var.N.get(i10 - i13)).b(ha1Var);
                    return;
                }
                int i14 = m91Var.O;
                if (i10 >= i14 && i10 <= m91Var.P) {
                    ((aa1) arrayList2.get(i10 - i14)).b(ha1Var);
                    return;
                }
                int i15 = m91Var.U;
                if (i10 >= i15 && i10 <= m91Var.V) {
                    ((aa1) ha1Var.M.get(i10 - i15)).b(ha1Var);
                    return;
                } else if (i10 == m91Var.W) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = ha1Var.U.W;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    m91 m91Var2 = ha1Var.U;
                    if (m91Var2 != null) {
                        m91Var2.E();
                        ha1Var.P.setItemAnimator(ha1Var.V);
                        ha1Var.U.s(i16 + 1, size);
                        ha1Var.U.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                ed1 ed1Var = (ed1) obj;
                if (ed1Var.T0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ed1Var.Z0(i10);
                if (ed1Var.T0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z4 == z10) {
                    ed1Var.M0();
                    ed1Var.l1();
                }
                ed1Var.n1();
                org.telegram.ui.Components.n81 n81Var = ed1Var.G0[1];
                if (ed1Var.T0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n81Var.a(z11, true);
                ed1Var.M0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    ed1Var.M0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > ed1Var.M0.getMeasuredWidth()) {
                    kb1 kb1Var = ed1Var.M0;
                    kb1Var.v0(i18 - kb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 7:
                be1 be1Var = (be1) obj;
                int i19 = be1Var.E;
                HashSet hashSet = be1Var.f35499w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20843id))) {
                        hashSet.remove(Long.valueOf(chat.f20843id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20843id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && be1Var.v != -1 && be1Var.f35496n.getVisibility() == 0) {
                        be1Var.v = -1;
                        be1Var.f35496n.animate().setListener(null).cancel();
                        be1Var.f35496n.animate().translationY(i19).setDuration(200L).setListener(new xd1(be1Var, 0)).start();
                        if (be1Var.f35498s.getVisibility() == 0) {
                            tl0Var2 = be1Var.f35492b;
                        } else {
                            tl0Var2 = be1Var.f35491a;
                        }
                        tl0Var2.d1(false);
                        int N0 = ((f2.j0) tl0Var2.getLayoutManager()).N0();
                        if ((N0 == tl0Var2.getAdapter().h() - 1 || (N0 == tl0Var2.getAdapter().h() - 2 && tl0Var2 == be1Var.f35491a)) && (K = tl0Var2.K(N0)) != null) {
                            int bottom = K.f5875a.getBottom();
                            if (N0 == be1Var.d.f43606c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (tl0Var2.getMeasuredHeight() - bottom <= i19) {
                                tl0Var2.setTranslationY(-(tl0Var2.getMeasuredHeight() - bottom));
                                tl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        be1Var.f35491a.setPadding(0, 0, 0, 0);
                        be1Var.f35492b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && be1Var.f35496n.getVisibility() == 8 && be1Var.v != 1) {
                        be1Var.v = 1;
                        be1Var.f35496n.setVisibility(0);
                        be1Var.f35496n.setTranslationY(i19);
                        be1Var.f35496n.animate().setListener(null).cancel();
                        be1Var.f35496n.animate().translationY(0.0f).setDuration(200L).setListener(new xd1(be1Var, 1)).start();
                        be1Var.f35491a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(12.0f));
                        be1Var.f35492b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        be1Var.f35493c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (be1Var.f35498s.getVisibility() == 0) {
                            tl0Var = be1Var.f35492b;
                        } else {
                            tl0Var = be1Var.f35491a;
                        }
                        int height = tl0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            tl0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                mf1.V((mf1) obj, view);
                return;
            case 9:
                mf1 mf1Var = ((if1) obj).f37849q0;
                if (view instanceof org.telegram.ui.Cells.oa) {
                    bg.e.m(mf1Var, mf1Var.f39102a, ((org.telegram.ui.Cells.oa) view).getTopic(), 0);
                    return;
                } else if (view instanceof jf1) {
                    jf1 jf1Var = (jf1) view;
                    bg.e.m(mf1Var, mf1Var.f39102a, jf1Var.K, jf1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 10:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                return;
            case 11:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                return;
            default:
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = w.c.f(string, " ");
                String[] strArr = WallpapersListActivity.f34944k0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f34945l0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = si1Var.B;
                wallpapersListActivity.I.setSearchFieldCaption(spannableString);
                wallpapersListActivity.I.setSearchFieldHint(null);
                wallpapersListActivity.I.H("", true);
                si1Var.f41304n = strArr[i10];
                si1Var.E("", true);
                return;
        }
    }
}
