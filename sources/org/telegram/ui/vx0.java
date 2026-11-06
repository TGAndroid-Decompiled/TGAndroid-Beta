package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vx0 implements org.telegram.ui.Components.bj0 {
    public final int f50846a;
    public final Object f50847b;

    public vx0(Object obj, int i7) {
        this.f50846a = i7;
        this.f50847b = obj;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.pj0 pj0Var;
        org.telegram.ui.Components.pj0 pj0Var2;
        v4.d1 K;
        int i10 = this.f50846a;
        Object obj = this.f50847b;
        switch (i10) {
            case 0:
                ay0.Z((ay0) obj, view);
                return;
            case 1:
                qy0.Z((qy0) obj, view, i7);
                return;
            case 2:
                xy0.a0((xy0) obj, i7);
                return;
            case 3:
                a21 a21Var = (a21) obj;
                org.telegram.ui.Components.r31 G = a21Var.f43527a2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).w(true, true);
                        a21Var.S1 = (TLObject) G.G;
                        a21Var.f1(true);
                        a21Var.f43527a2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((c21) obj).e1(i7, view);
                return;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                return;
            case 6:
                c51 c51Var = (c51) obj;
                ArrayList arrayList = c51Var.N;
                ArrayList arrayList2 = c51Var.O;
                g41 g41Var = c51Var.W;
                int i11 = g41Var.I;
                if (i7 >= i11 && i7 <= g41Var.J) {
                    z41 z41Var = (z41) c51Var.f44677y0.get(i7 - i11);
                    jg0 jg0Var = new jg0(c51Var.f44645b, z41Var.f52467b, true);
                    jg0Var.f46945e0 = z41Var;
                    c51Var.presentFragment(jg0Var);
                    return;
                }
                int i12 = g41Var.U;
                if (i7 >= i12 && i7 <= g41Var.V) {
                    ((v41) c51Var.Q.get(i7 - i12)).b(c51Var);
                    return;
                }
                int i13 = g41Var.R;
                if (i7 >= i13 && i7 <= g41Var.S) {
                    ((v41) arrayList2.get(i7 - i13)).b(c51Var);
                    return;
                }
                int i14 = g41Var.X;
                if (i7 >= i14 && i7 <= g41Var.Y) {
                    ((v41) c51Var.P.get(i7 - i14)).b(c51Var);
                    return;
                } else if (i7 == g41Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i15 = c51Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    g41 g41Var2 = c51Var.W;
                    if (g41Var2 != null) {
                        g41Var2.E();
                        c51Var.S.setItemAnimator(c51Var.X);
                        c51Var.W.o(i15 + 1, size);
                        c51Var.W.s(i15);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                u71 u71Var = (u71) obj;
                if (u71Var.X0 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                u71Var.e1(i7);
                if (u71Var.X0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 == z10) {
                    u71Var.Q0();
                    u71Var.q1();
                }
                u71Var.s1();
                org.telegram.ui.Components.q61 q61Var = u71Var.K0[1];
                if (u71Var.X0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                q61Var.a(z11, true);
                u71Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i16 = left - L;
                if (i16 < 0) {
                    u71Var.Q0.w0(i16, 0, null);
                    return;
                }
                int i17 = right + L;
                if (i17 > u71Var.Q0.getMeasuredWidth()) {
                    e61 e61Var = u71Var.Q0;
                    e61Var.w0(i17 - e61Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                m81 m81Var = (m81) obj;
                int i18 = m81Var.H;
                HashSet hashSet = m81Var.f47708x;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) h4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f26952id))) {
                        hashSet.remove(Long.valueOf(chat.f26952id));
                        h4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f26952id));
                        h4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && m81Var.f47707w != -1 && m81Var.f47704n.getVisibility() == 0) {
                        m81Var.f47707w = -1;
                        m81Var.f47704n.animate().setListener(null).cancel();
                        m81Var.f47704n.animate().translationY(i18).setDuration(200L).setListener(new i81(m81Var, 0)).start();
                        if (m81Var.f47706s.getVisibility() == 0) {
                            pj0Var2 = m81Var.f47700b;
                        } else {
                            pj0Var2 = m81Var.f47699a;
                        }
                        pj0Var2.d1(false);
                        int N0 = ((v4.b0) pj0Var2.getLayoutManager()).N0();
                        if ((N0 == pj0Var2.getAdapter().b() - 1 || (N0 == pj0Var2.getAdapter().b() - 2 && pj0Var2 == m81Var.f47699a)) && (K = pj0Var2.K(N0)) != null) {
                            int bottom = K.f56927a.getBottom();
                            if (N0 == m81Var.d.f46876c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (pj0Var2.getMeasuredHeight() - bottom <= i18) {
                                pj0Var2.setTranslationY(-(pj0Var2.getMeasuredHeight() - bottom));
                                pj0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        m81Var.f47699a.setPadding(0, 0, 0, 0);
                        m81Var.f47700b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && m81Var.f47704n.getVisibility() == 8 && m81Var.f47707w != 1) {
                        m81Var.f47707w = 1;
                        m81Var.f47704n.setVisibility(0);
                        m81Var.f47704n.setTranslationY(i18);
                        m81Var.f47704n.animate().setListener(null).cancel();
                        m81Var.f47704n.animate().translationY(0.0f).setDuration(200L).setListener(new i81(m81Var, 1)).start();
                        m81Var.f47699a.setPadding(0, 0, 0, i18 - org.telegram.messenger.g0.L(12.0f));
                        m81Var.f47700b.setPadding(0, 0, 0, i18);
                    }
                    if (!hashSet.isEmpty()) {
                        m81Var.f47701c.setText(org.telegram.messenger.hd.a0("LeaveChats", null, 2131748998, org.telegram.messenger.hd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (m81Var.f47706s.getVisibility() == 0) {
                            pj0Var = m81Var.f47700b;
                        } else {
                            pj0Var = m81Var.f47699a;
                        }
                        int height = pj0Var.getHeight() - view.getBottom();
                        if (height < i18) {
                            pj0Var.w0(0, i18 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                v91.a0((v91) obj, view);
                return;
            case 10:
                v91 v91Var = ((r91) obj).f49415v0;
                if (view instanceof org.telegram.ui.Cells.ja) {
                    qg.d.m(v91Var, v91Var.f50619a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    return;
                } else if (view instanceof s91) {
                    s91 s91Var = (s91) view;
                    qg.d.m(v91Var, v91Var.f50619a, s91Var.N, s91Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 11:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj, i7);
                return;
            case 12:
                WallpapersListActivity.Z((WallpapersListActivity) obj, i7);
                return;
            default:
                rc1 rc1Var = (rc1) obj;
                String M0 = org.telegram.messenger.hd.M0(2131753738, null);
                StringBuilder j3 = rf.b.j(M0, " ");
                String[] strArr = WallpapersListActivity.f43455j0;
                SpannableString spannableString = new SpannableString(jg.g.l(WallpapersListActivity.f43456k0[i7], strArr[i7], j3));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = rc1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                rc1Var.f49467n = strArr[i7];
                rc1Var.E("", true);
                return;
        }
    }
}
