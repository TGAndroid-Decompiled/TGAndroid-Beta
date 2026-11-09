package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zx0 implements org.telegram.ui.Components.cj0 {
    public final int f52702a;
    public final Object f52703b;

    public zx0(Object obj, int i7) {
        this.f52702a = i7;
        this.f52703b = obj;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.qj0 qj0Var;
        org.telegram.ui.Components.qj0 qj0Var2;
        v4.d1 K;
        int i10 = this.f52702a;
        Object obj = this.f52703b;
        switch (i10) {
            case 0:
                ey0.Z((ey0) obj, view);
                return;
            case 1:
                ty0.Z((ty0) obj, view, i7);
                return;
            case 2:
                az0.a0((az0) obj, i7);
                return;
            case 3:
                c21 c21Var = (c21) obj;
                org.telegram.ui.Components.y31 G = c21Var.f44201a2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).w(true, true);
                        c21Var.S1 = (TLObject) G.G;
                        c21Var.f1(true);
                        c21Var.f44201a2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((e21) obj).e1(i7, view);
                return;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                return;
            case 6:
                d51 d51Var = (d51) obj;
                ArrayList arrayList = d51Var.N;
                ArrayList arrayList2 = d51Var.O;
                h41 h41Var = d51Var.W;
                int i11 = h41Var.I;
                if (i7 >= i11 && i7 <= h41Var.J) {
                    a51 a51Var = (a51) d51Var.f44859y0.get(i7 - i11);
                    lg0 lg0Var = new lg0(d51Var.f44827b, a51Var.f43589b, true);
                    lg0Var.f47609e0 = a51Var;
                    d51Var.presentFragment(lg0Var);
                    return;
                }
                int i12 = h41Var.U;
                if (i7 >= i12 && i7 <= h41Var.V) {
                    ((w41) d51Var.Q.get(i7 - i12)).b(d51Var);
                    return;
                }
                int i13 = h41Var.R;
                if (i7 >= i13 && i7 <= h41Var.S) {
                    ((w41) arrayList2.get(i7 - i13)).b(d51Var);
                    return;
                }
                int i14 = h41Var.X;
                if (i7 >= i14 && i7 <= h41Var.Y) {
                    ((w41) d51Var.P.get(i7 - i14)).b(d51Var);
                    return;
                } else if (i7 == h41Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i15 = d51Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    h41 h41Var2 = d51Var.W;
                    if (h41Var2 != null) {
                        h41Var2.E();
                        d51Var.S.setItemAnimator(d51Var.X);
                        d51Var.W.o(i15 + 1, size);
                        d51Var.W.s(i15);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                w71 w71Var = (w71) obj;
                if (w71Var.X0 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                w71Var.e1(i7);
                if (w71Var.X0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 == z10) {
                    w71Var.Q0();
                    w71Var.q1();
                }
                w71Var.s1();
                org.telegram.ui.Components.x61 x61Var = w71Var.K0[1];
                if (w71Var.X0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x61Var.a(z11, true);
                w71Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i16 = left - L;
                if (i16 < 0) {
                    w71Var.Q0.w0(i16, 0, null);
                    return;
                }
                int i17 = right + L;
                if (i17 > w71Var.Q0.getMeasuredWidth()) {
                    f61 f61Var = w71Var.Q0;
                    f61Var.w0(i17 - f61Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                o81 o81Var = (o81) obj;
                int i18 = o81Var.H;
                HashSet hashSet = o81Var.f48408x;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) h4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f26956id))) {
                        hashSet.remove(Long.valueOf(chat.f26956id));
                        h4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f26956id));
                        h4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && o81Var.f48407w != -1 && o81Var.f48404n.getVisibility() == 0) {
                        o81Var.f48407w = -1;
                        o81Var.f48404n.animate().setListener(null).cancel();
                        o81Var.f48404n.animate().translationY(i18).setDuration(200L).setListener(new k81(o81Var, 0)).start();
                        if (o81Var.f48406s.getVisibility() == 0) {
                            qj0Var2 = o81Var.f48400b;
                        } else {
                            qj0Var2 = o81Var.f48399a;
                        }
                        qj0Var2.d1(false);
                        int N0 = ((v4.b0) qj0Var2.getLayoutManager()).N0();
                        if ((N0 == qj0Var2.getAdapter().b() - 1 || (N0 == qj0Var2.getAdapter().b() - 2 && qj0Var2 == o81Var.f48399a)) && (K = qj0Var2.K(N0)) != null) {
                            int bottom = K.f57056a.getBottom();
                            if (N0 == o81Var.d.f47527c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (qj0Var2.getMeasuredHeight() - bottom <= i18) {
                                qj0Var2.setTranslationY(-(qj0Var2.getMeasuredHeight() - bottom));
                                qj0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        o81Var.f48399a.setPadding(0, 0, 0, 0);
                        o81Var.f48400b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && o81Var.f48404n.getVisibility() == 8 && o81Var.f48407w != 1) {
                        o81Var.f48407w = 1;
                        o81Var.f48404n.setVisibility(0);
                        o81Var.f48404n.setTranslationY(i18);
                        o81Var.f48404n.animate().setListener(null).cancel();
                        o81Var.f48404n.animate().translationY(0.0f).setDuration(200L).setListener(new k81(o81Var, 1)).start();
                        o81Var.f48399a.setPadding(0, 0, 0, i18 - org.telegram.messenger.g0.L(12.0f));
                        o81Var.f48400b.setPadding(0, 0, 0, i18);
                    }
                    if (!hashSet.isEmpty()) {
                        o81Var.f48401c.setText(org.telegram.messenger.id.a0("LeaveChats", null, 2131748999, org.telegram.messenger.id.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (o81Var.f48406s.getVisibility() == 0) {
                            qj0Var = o81Var.f48400b;
                        } else {
                            qj0Var = o81Var.f48399a;
                        }
                        int height = qj0Var.getHeight() - view.getBottom();
                        if (height < i18) {
                            qj0Var.w0(0, i18 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                y91.a0((y91) obj, view);
                return;
            case 10:
                y91 y91Var = ((u91) obj).f50344v0;
                if (view instanceof org.telegram.ui.Cells.ja) {
                    qg.d.m(y91Var, y91Var.f52013a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    return;
                } else if (view instanceof v91) {
                    v91 v91Var = (v91) view;
                    qg.d.m(y91Var, y91Var.f52013a, v91Var.N, v91Var.getMessageId());
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
                vc1 vc1Var = (vc1) obj;
                String M0 = org.telegram.messenger.id.M0(2131753738, null);
                StringBuilder j3 = rf.b.j(M0, " ");
                String[] strArr = WallpapersListActivity.f43486j0;
                SpannableString spannableString = new SpannableString(jg.g.l(WallpapersListActivity.f43487k0[i7], strArr[i7], j3));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = vc1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                vc1Var.f50647n = strArr[i7];
                vc1Var.E("", true);
                return;
        }
    }
}
