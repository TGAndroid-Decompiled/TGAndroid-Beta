package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zx0 implements org.telegram.ui.Components.oj0 {
    public final int f54611a;
    public final Object f54612b;

    public zx0(Object obj, int i7) {
        this.f54611a = i7;
        this.f54612b = obj;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ck0 ck0Var;
        org.telegram.ui.Components.ck0 ck0Var2;
        v4.f1 K;
        int i10 = this.f54611a;
        Object obj = this.f54612b;
        switch (i10) {
            case 0:
                ey0.Z((ey0) obj, view);
                return;
            case 1:
                sy0.Z((sy0) obj, view, i7);
                return;
            case 2:
                zy0.a0((zy0) obj, i7);
                return;
            case 3:
                b21 b21Var = (b21) obj;
                org.telegram.ui.Components.l41 G = b21Var.f45736e2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.H;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).w(true, true);
                        b21Var.W1 = (TLObject) G.H;
                        b21Var.g1(true);
                        b21Var.f45736e2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((d21) obj).f1(i7, view);
                return;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                return;
            case 6:
                c51 c51Var = (c51) obj;
                ArrayList arrayList = c51Var.O;
                ArrayList arrayList2 = c51Var.P;
                h41 h41Var = c51Var.X;
                int i11 = h41Var.J;
                if (i7 >= i11 && i7 <= h41Var.K) {
                    z41 z41Var = (z41) c51Var.f46440z0.get(i7 - i11);
                    ng0 ng0Var = new ng0(c51Var.f46407b, z41Var.f54430b, true);
                    ng0Var.f50186f0 = z41Var;
                    c51Var.presentFragment(ng0Var);
                    return;
                }
                int i12 = h41Var.V;
                if (i7 >= i12 && i7 <= h41Var.W) {
                    ((v41) c51Var.R.get(i7 - i12)).b(c51Var);
                    return;
                }
                int i13 = h41Var.S;
                if (i7 >= i13 && i7 <= h41Var.T) {
                    ((v41) arrayList2.get(i7 - i13)).b(c51Var);
                    return;
                }
                int i14 = h41Var.Y;
                if (i7 >= i14 && i7 <= h41Var.Z) {
                    ((v41) c51Var.Q.get(i7 - i14)).b(c51Var);
                    return;
                } else if (i7 == h41Var.f48210a0) {
                    int size = arrayList.size() - arrayList2.size();
                    int i15 = c51Var.X.f48210a0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    h41 h41Var2 = c51Var.X;
                    if (h41Var2 != null) {
                        h41Var2.E();
                        c51Var.T.setItemAnimator(c51Var.Y);
                        c51Var.X.o(i15 + 1, size);
                        c51Var.X.s(i15);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                x71 x71Var = (x71) obj;
                if (x71Var.Y0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x71Var.e1(i7);
                if (x71Var.Y0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    x71Var.Q0();
                    x71Var.q1();
                }
                x71Var.s1();
                org.telegram.ui.Components.h71 h71Var = x71Var.L0[1];
                if (x71Var.Y0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h71Var.a(z12, true);
                x71Var.R0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i16 = left - L;
                if (i16 < 0) {
                    x71Var.R0.w0(i16, 0, null);
                    return;
                }
                int i17 = right + L;
                if (i17 > x71Var.R0.getMeasuredWidth()) {
                    f61 f61Var = x71Var.R0;
                    f61Var.w0(i17 - f61Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                p81 p81Var = (p81) obj;
                int i18 = p81Var.I;
                HashSet hashSet = p81Var.f50824x;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) h4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f28405id))) {
                        hashSet.remove(Long.valueOf(chat.f28405id));
                        h4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f28405id));
                        h4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && p81Var.f50823w != -1 && p81Var.f50820n.getVisibility() == 0) {
                        p81Var.f50823w = -1;
                        p81Var.f50820n.animate().setListener(null).cancel();
                        p81Var.f50820n.animate().translationY(i18).setDuration(200L).setListener(new l81(p81Var, 0)).start();
                        if (p81Var.f50822s.getVisibility() == 0) {
                            ck0Var2 = p81Var.f50816b;
                        } else {
                            ck0Var2 = p81Var.f50815a;
                        }
                        ck0Var2.d1(false);
                        int N0 = ((v4.c0) ck0Var2.getLayoutManager()).N0();
                        if ((N0 == ck0Var2.getAdapter().b() - 1 || (N0 == ck0Var2.getAdapter().b() - 2 && ck0Var2 == p81Var.f50815a)) && (K = ck0Var2.K(N0)) != null) {
                            int bottom = K.f59122a.getBottom();
                            if (N0 == p81Var.d.f49805c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (ck0Var2.getMeasuredHeight() - bottom <= i18) {
                                ck0Var2.setTranslationY(-(ck0Var2.getMeasuredHeight() - bottom));
                                ck0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        p81Var.f50815a.setPadding(0, 0, 0, 0);
                        p81Var.f50816b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && p81Var.f50820n.getVisibility() == 8 && p81Var.f50823w != 1) {
                        p81Var.f50823w = 1;
                        p81Var.f50820n.setVisibility(0);
                        p81Var.f50820n.setTranslationY(i18);
                        p81Var.f50820n.animate().setListener(null).cancel();
                        p81Var.f50820n.animate().translationY(0.0f).setDuration(200L).setListener(new l81(p81Var, 1)).start();
                        p81Var.f50815a.setPadding(0, 0, 0, i18 - org.telegram.messenger.g0.L(12.0f));
                        p81Var.f50816b.setPadding(0, 0, 0, i18);
                    }
                    if (!hashSet.isEmpty()) {
                        p81Var.f50817c.setText(org.telegram.messenger.gd.a0("LeaveChats", null, 2131748807, org.telegram.messenger.gd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (p81Var.f50822s.getVisibility() == 0) {
                            ck0Var = p81Var.f50816b;
                        } else {
                            ck0Var = p81Var.f50815a;
                        }
                        int height = ck0Var.getHeight() - view.getBottom();
                        if (height < i18) {
                            ck0Var.w0(0, i18 - height, null);
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
                y91 y91Var = ((u91) obj).f52498w0;
                if (view instanceof org.telegram.ui.Cells.ka) {
                    qg.c.n(y91Var, y91Var.f54109a, ((org.telegram.ui.Cells.ka) view).getTopic(), 0);
                    return;
                } else if (view instanceof v91) {
                    v91 v91Var = (v91) view;
                    qg.c.n(y91Var, y91Var.f54109a, v91Var.O, v91Var.getMessageId());
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
                uc1 uc1Var = (uc1) obj;
                String M0 = org.telegram.messenger.gd.M0(2131753736, null);
                StringBuilder n10 = p5.c.n(M0, " ");
                String[] strArr = WallpapersListActivity.f45376k0;
                SpannableString spannableString = new SpannableString(i5.c.k(WallpapersListActivity.f45377l0[i7], strArr[i7], n10));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = uc1Var.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.Q("", true);
                uc1Var.f52525n = strArr[i7];
                uc1Var.E("", true);
                return;
        }
    }
}
