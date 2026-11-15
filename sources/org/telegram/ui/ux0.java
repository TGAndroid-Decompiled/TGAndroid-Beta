package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ux0 implements org.telegram.ui.Components.gj0 {
    public final int f52055a;
    public final Object f52056b;

    public ux0(Object obj, int i7) {
        this.f52055a = i7;
        this.f52056b = obj;
    }

    @Override
    public final void b(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.uj0 uj0Var;
        org.telegram.ui.Components.uj0 uj0Var2;
        v4.e1 K;
        int i10 = this.f52055a;
        Object obj = this.f52056b;
        switch (i10) {
            case 0:
                zx0.Z((zx0) obj, view);
                return;
            case 1:
                oy0.Z((oy0) obj, view, i7);
                return;
            case 2:
                vy0.a0((vy0) obj, i7);
                return;
            case 3:
                x11 x11Var = (x11) obj;
                org.telegram.ui.Components.b41 G = x11Var.f53071e2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.f6) view).w(true, true);
                        x11Var.W1 = (TLObject) G.G;
                        x11Var.f1(true);
                        x11Var.f53071e2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((z11) obj).e1(i7, view);
                return;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                return;
            case 6:
                z41 z41Var = (z41) obj;
                ArrayList arrayList = z41Var.O;
                ArrayList arrayList2 = z41Var.P;
                e41 e41Var = z41Var.X;
                int i11 = e41Var.J;
                if (i7 >= i11 && i7 <= e41Var.K) {
                    w41 w41Var = (w41) z41Var.f53877z0.get(i7 - i11);
                    jg0 jg0Var = new jg0(z41Var.f53844b, w41Var.f52431b, true);
                    jg0Var.f48342f0 = w41Var;
                    z41Var.presentFragment(jg0Var);
                    return;
                }
                int i12 = e41Var.V;
                if (i7 >= i12 && i7 <= e41Var.W) {
                    ((s41) z41Var.R.get(i7 - i12)).b(z41Var);
                    return;
                }
                int i13 = e41Var.S;
                if (i7 >= i13 && i7 <= e41Var.T) {
                    ((s41) arrayList2.get(i7 - i13)).b(z41Var);
                    return;
                }
                int i14 = e41Var.Y;
                if (i7 >= i14 && i7 <= e41Var.Z) {
                    ((s41) z41Var.Q.get(i7 - i14)).b(z41Var);
                    return;
                } else if (i7 == e41Var.f46549a0) {
                    int size = arrayList.size() - arrayList2.size();
                    int i15 = z41Var.X.f46549a0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    e41 e41Var2 = z41Var.X;
                    if (e41Var2 != null) {
                        e41Var2.E();
                        z41Var.T.setItemAnimator(z41Var.Y);
                        z41Var.X.o(i15 + 1, size);
                        z41Var.X.s(i15);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                t71 t71Var = (t71) obj;
                if (t71Var.Y0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t71Var.e1(i7);
                if (t71Var.Y0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    t71Var.Q0();
                    t71Var.q1();
                }
                t71Var.s1();
                org.telegram.ui.Components.x61 x61Var = t71Var.L0[1];
                if (t71Var.Y0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                x61Var.a(z12, true);
                t71Var.R0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i16 = left - L;
                if (i16 < 0) {
                    t71Var.R0.w0(i16, 0, null);
                    return;
                }
                int i17 = right + L;
                if (i17 > t71Var.R0.getMeasuredWidth()) {
                    b61 b61Var = t71Var.R0;
                    b61Var.w0(i17 - b61Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                l81 l81Var = (l81) obj;
                int i18 = l81Var.I;
                HashSet hashSet = l81Var.f48904x;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) h4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f28051id))) {
                        hashSet.remove(Long.valueOf(chat.f28051id));
                        h4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f28051id));
                        h4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && l81Var.f48903w != -1 && l81Var.f48900n.getVisibility() == 0) {
                        l81Var.f48903w = -1;
                        l81Var.f48900n.animate().setListener(null).cancel();
                        l81Var.f48900n.animate().translationY(i18).setDuration(200L).setListener(new h81(l81Var, 0)).start();
                        if (l81Var.f48902s.getVisibility() == 0) {
                            uj0Var2 = l81Var.f48896b;
                        } else {
                            uj0Var2 = l81Var.f48895a;
                        }
                        uj0Var2.d1(false);
                        int N0 = ((v4.b0) uj0Var2.getLayoutManager()).N0();
                        if ((N0 == uj0Var2.getAdapter().b() - 1 || (N0 == uj0Var2.getAdapter().b() - 2 && uj0Var2 == l81Var.f48895a)) && (K = uj0Var2.K(N0)) != null) {
                            int bottom = K.f58535a.getBottom();
                            if (N0 == l81Var.d.f47970c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (uj0Var2.getMeasuredHeight() - bottom <= i18) {
                                uj0Var2.setTranslationY(-(uj0Var2.getMeasuredHeight() - bottom));
                                uj0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        l81Var.f48895a.setPadding(0, 0, 0, 0);
                        l81Var.f48896b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && l81Var.f48900n.getVisibility() == 8 && l81Var.f48903w != 1) {
                        l81Var.f48903w = 1;
                        l81Var.f48900n.setVisibility(0);
                        l81Var.f48900n.setTranslationY(i18);
                        l81Var.f48900n.animate().setListener(null).cancel();
                        l81Var.f48900n.animate().translationY(0.0f).setDuration(200L).setListener(new h81(l81Var, 1)).start();
                        l81Var.f48895a.setPadding(0, 0, 0, i18 - org.telegram.messenger.g0.L(12.0f));
                        l81Var.f48896b.setPadding(0, 0, 0, i18);
                    }
                    if (!hashSet.isEmpty()) {
                        l81Var.f48897c.setText(org.telegram.messenger.hd.a0("LeaveChats", null, 2131748999, org.telegram.messenger.hd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (l81Var.f48902s.getVisibility() == 0) {
                            uj0Var = l81Var.f48896b;
                        } else {
                            uj0Var = l81Var.f48895a;
                        }
                        int height = uj0Var.getHeight() - view.getBottom();
                        if (height < i18) {
                            uj0Var.w0(0, i18 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                u91.a0((u91) obj, view);
                return;
            case 10:
                u91 u91Var = ((q91) obj).f50539w0;
                if (view instanceof org.telegram.ui.Cells.ja) {
                    qg.c.m(u91Var, u91Var.f51834a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    return;
                } else if (view instanceof r91) {
                    r91 r91Var = (r91) view;
                    qg.c.m(u91Var, u91Var.f51834a, r91Var.O, r91Var.getMessageId());
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
                StringBuilder m10 = r.b.m(M0, " ");
                String[] strArr = WallpapersListActivity.f44869k0;
                SpannableString spannableString = new SpannableString(i5.c.k(WallpapersListActivity.f44870l0[i7], strArr[i7], m10));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = rc1Var.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.Q("", true);
                rc1Var.f50922n = strArr[i7];
                rc1Var.E("", true);
                return;
        }
    }
}
