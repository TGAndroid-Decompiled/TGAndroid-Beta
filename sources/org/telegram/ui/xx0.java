package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xx0 implements org.telegram.ui.Components.qj0 {
    public final int f54117a;
    public final Object f54118b;

    public xx0(Object obj, int i7) {
        this.f54117a = i7;
        this.f54118b = obj;
    }

    @Override
    public final void b(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ek0 ek0Var;
        org.telegram.ui.Components.ek0 ek0Var2;
        v4.f1 K;
        int i10 = this.f54117a;
        Object obj = this.f54118b;
        switch (i10) {
            case 0:
                cy0.Z((cy0) obj, view);
                return;
            case 1:
                ry0.Z((ry0) obj, view, i7);
                return;
            case 2:
                yy0.a0((yy0) obj, i7);
                return;
            case 3:
                a21 a21Var = (a21) obj;
                org.telegram.ui.Components.n41 G = a21Var.f45571e2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.H;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).x(true, true);
                        a21Var.W1 = (TLObject) G.H;
                        a21Var.g1(true);
                        a21Var.f45571e2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((c21) obj).f1(i7, view);
                return;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                return;
            case 6:
                b51 b51Var = (b51) obj;
                ArrayList arrayList = b51Var.O;
                ArrayList arrayList2 = b51Var.P;
                g41 g41Var = b51Var.X;
                int i11 = g41Var.J;
                if (i7 >= i11 && i7 <= g41Var.K) {
                    y41 y41Var = (y41) b51Var.f45959z0.get(i7 - i11);
                    mg0 mg0Var = new mg0(b51Var.f45926b, y41Var.f54223b, true);
                    mg0Var.f50064f0 = y41Var;
                    b51Var.presentFragment(mg0Var);
                    return;
                }
                int i12 = g41Var.V;
                if (i7 >= i12 && i7 <= g41Var.W) {
                    ((u41) b51Var.R.get(i7 - i12)).b(b51Var);
                    return;
                }
                int i13 = g41Var.S;
                if (i7 >= i13 && i7 <= g41Var.T) {
                    ((u41) arrayList2.get(i7 - i13)).b(b51Var);
                    return;
                }
                int i14 = g41Var.Y;
                if (i7 >= i14 && i7 <= g41Var.Z) {
                    ((u41) b51Var.Q.get(i7 - i14)).b(b51Var);
                    return;
                } else if (i7 == g41Var.f48089a0) {
                    int size = arrayList.size() - arrayList2.size();
                    int i15 = b51Var.X.f48089a0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    g41 g41Var2 = b51Var.X;
                    if (g41Var2 != null) {
                        g41Var2.E();
                        b51Var.T.setItemAnimator(b51Var.Y);
                        b51Var.X.o(i15 + 1, size);
                        b51Var.X.s(i15);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                v71 v71Var = (v71) obj;
                if (v71Var.Y0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v71Var.e1(i7);
                if (v71Var.Y0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    v71Var.Q0();
                    v71Var.q1();
                }
                v71Var.s1();
                org.telegram.ui.Components.l71 l71Var = v71Var.L0[1];
                if (v71Var.Y0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                l71Var.a(z12, true);
                v71Var.R0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i16 = left - L;
                if (i16 < 0) {
                    v71Var.R0.w0(i16, 0, null);
                    return;
                }
                int i17 = right + L;
                if (i17 > v71Var.R0.getMeasuredWidth()) {
                    d61 d61Var = v71Var.R0;
                    d61Var.w0(i17 - d61Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                n81 n81Var = (n81) obj;
                int i18 = n81Var.I;
                HashSet hashSet = n81Var.f50270x;
                if (view instanceof org.telegram.ui.Cells.i4) {
                    org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) i4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f28492id))) {
                        hashSet.remove(Long.valueOf(chat.f28492id));
                        i4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f28492id));
                        i4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && n81Var.f50269w != -1 && n81Var.f50266n.getVisibility() == 0) {
                        n81Var.f50269w = -1;
                        n81Var.f50266n.animate().setListener(null).cancel();
                        n81Var.f50266n.animate().translationY(i18).setDuration(200L).setListener(new j81(n81Var, 0)).start();
                        if (n81Var.f50268s.getVisibility() == 0) {
                            ek0Var2 = n81Var.f50262b;
                        } else {
                            ek0Var2 = n81Var.f50261a;
                        }
                        ek0Var2.d1(false);
                        int N0 = ((v4.c0) ek0Var2.getLayoutManager()).N0();
                        if ((N0 == ek0Var2.getAdapter().b() - 1 || (N0 == ek0Var2.getAdapter().b() - 2 && ek0Var2 == n81Var.f50261a)) && (K = ek0Var2.K(N0)) != null) {
                            int bottom = K.f59245a.getBottom();
                            if (N0 == n81Var.d.f49368c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (ek0Var2.getMeasuredHeight() - bottom <= i18) {
                                ek0Var2.setTranslationY(-(ek0Var2.getMeasuredHeight() - bottom));
                                ek0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        n81Var.f50261a.setPadding(0, 0, 0, 0);
                        n81Var.f50262b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && n81Var.f50266n.getVisibility() == 8 && n81Var.f50269w != 1) {
                        n81Var.f50269w = 1;
                        n81Var.f50266n.setVisibility(0);
                        n81Var.f50266n.setTranslationY(i18);
                        n81Var.f50266n.animate().setListener(null).cancel();
                        n81Var.f50266n.animate().translationY(0.0f).setDuration(200L).setListener(new j81(n81Var, 1)).start();
                        n81Var.f50261a.setPadding(0, 0, 0, i18 - org.telegram.messenger.g0.L(12.0f));
                        n81Var.f50262b.setPadding(0, 0, 0, i18);
                    }
                    if (!hashSet.isEmpty()) {
                        n81Var.f50263c.setText(org.telegram.messenger.gd.a0("LeaveChats", null, 2131748806, org.telegram.messenger.gd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (n81Var.f50268s.getVisibility() == 0) {
                            ek0Var = n81Var.f50262b;
                        } else {
                            ek0Var = n81Var.f50261a;
                        }
                        int height = ek0Var.getHeight() - view.getBottom();
                        if (height < i18) {
                            ek0Var.w0(0, i18 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                w91.a0((w91) obj, view);
                return;
            case 10:
                w91 w91Var = ((s91) obj).f52027w0;
                if (view instanceof org.telegram.ui.Cells.ma) {
                    qg.c.n(w91Var, w91Var.f53216a, ((org.telegram.ui.Cells.ma) view).getTopic(), 0);
                    return;
                } else if (view instanceof t91) {
                    t91 t91Var = (t91) view;
                    qg.c.n(w91Var, w91Var.f53216a, t91Var.O, t91Var.getMessageId());
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
                sc1 sc1Var = (sc1) obj;
                String N02 = org.telegram.messenger.gd.N0(2131753735, null);
                StringBuilder n10 = p5.c.n(N02, " ");
                String[] strArr = WallpapersListActivity.f45504k0;
                SpannableString spannableString = new SpannableString(i5.c.k(WallpapersListActivity.f45505l0[i7], strArr[i7], n10));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B8, false)), N02.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = sc1Var.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.Q("", true);
                sc1Var.f52057n = strArr[i7];
                sc1Var.E("", true);
                return;
        }
    }
}
