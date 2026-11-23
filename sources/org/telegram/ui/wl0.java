package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wl0 extends org.telegram.ui.Components.dk0 {
    public final Context f53701c;
    public final int d;
    public final dm0 f53702e;

    public wl0(dm0 dm0Var, Context context, int i7) {
        this.f53702e = dm0Var;
        this.f53701c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 != 6 && i7 != 8 && i7 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f53702e.f47180l0;
    }

    @Override
    public final int d(int i7) {
        dm0 dm0Var = this.f53702e;
        if (i7 == dm0Var.S || i7 == dm0Var.f47176h0 || i7 == dm0Var.U || i7 == dm0Var.f47165a0) {
            return 2;
        }
        if (i7 == dm0Var.R) {
            return 1;
        }
        if (i7 == dm0Var.T) {
            return 3;
        }
        if (i7 == dm0Var.V) {
            return 5;
        }
        if (i7 == dm0Var.W) {
            return 6;
        }
        if (i7 == dm0Var.f47177i0) {
            return 10;
        }
        if (i7 == dm0Var.f47178j0) {
            return 11;
        }
        if (i7 == dm0Var.f47167b0) {
            return 7;
        }
        if (i7 >= dm0Var.f47169c0 && i7 < dm0Var.f47170d0) {
            if (dm0Var.L == null) {
                return 8;
            }
            return 12;
        } else if (i7 >= dm0Var.f47172e0 && i7 < dm0Var.f47174f0) {
            return 9;
        } else {
            if (i7 != dm0Var.f47180l0 - 1 && i7 != dm0Var.f47179k0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String N0;
        int i11;
        int i12;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i13;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = f1Var.f59245a;
        dm0 dm0Var = this.f53702e;
        HashMap hashMap = dm0Var.N;
        ArrayList arrayList = dm0Var.m0;
        ArrayList arrayList2 = dm0Var.M;
        jm0 jm0Var = dm0Var.f47185q0;
        int d = d(i7);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z12 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, view, jm0Var.getResourceProvider());
                ((gm0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 == dm0Var.S) {
                    if (i14 == 1) {
                        if (jm0Var.f49154a) {
                            i11 = 2131752422;
                        } else {
                            i11 = 2131743505;
                        }
                        N0 = org.telegram.messenger.gd.N0(i11, null);
                    } else {
                        if (jm0Var.f49154a) {
                            i10 = 2131752310;
                        } else {
                            i10 = 2131743487;
                        }
                        N0 = org.telegram.messenger.gd.N0(i10, null);
                    }
                    z8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(N0, new ii(this, i14, 29)), true));
                    return;
                } else if (i7 == dm0Var.f47165a0) {
                    z8Var.setText("");
                    z8Var.setFixedSize(12);
                    return;
                } else if (i7 == dm0Var.f47176h0) {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131743493, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((cm0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.updateColors();
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var, jm0Var.getResourceProvider());
                m8Var.updateColors();
                if (i7 == dm0Var.W) {
                    if (jm0Var.f49154a) {
                        i12 = 2131752312;
                    } else {
                        i12 = 2131743490;
                    }
                    m8Var.k(org.telegram.messenger.gd.N0(i12, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == dm0Var.f47167b0) {
                    o4Var.c(org.telegram.messenger.gd.N0(2131743494, null), false);
                }
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, o4Var, jm0Var.getResourceProvider());
                return;
            case 8:
                sl0 sl0Var = (sl0) view;
                int i16 = i7 - dm0Var.f47169c0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    sl0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dm0Var.f47186r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f28721id) || ((tL_peerColorCollectible = dm0Var.f47187s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f28721id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sl0Var.b(z10, false);
                    sl0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                dm0Var.G = view;
                im0 im0Var = dm0Var.F;
                arrayList2.clear();
                hashMap.clear();
                i13 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                ArrayList arrayList3 = di.y8.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.gd.N0(2131749929, null));
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i17);
                    if ((i14 == 0 || (i14 == i15 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (dm0Var.L == starGift) {
                            i18 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i15);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        x5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(x5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i17++;
                    i15 = 1;
                }
                vl0 vl0Var = new vl0(this, 0);
                ArrayList arrayList4 = im0Var.f48849f;
                if (im0Var.L == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                im0Var.L = 0;
                im0Var.h = vl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                im0Var.f48847c.f();
                im0Var.a(i18, z11);
                dm0Var.l(im0Var);
                view.post(new tl0(dm0Var, 3));
                return;
            case 11:
                ((bm0) view).updateColors();
                return;
            case 12:
                bi.i3 i3Var = (bi.i3) view;
                int i19 = i7 - dm0Var.f47169c0;
                if (dm0Var.K != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    i3Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dm0Var.f47186r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28721id) && ((tL_peerColorCollectible2 = dm0Var.f47187s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f28721id)) {
                        z12 = false;
                    }
                    i3Var.f(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        org.telegram.ui.Components.vz vzVar;
        cm0 cm0Var;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var5;
        dm0 dm0Var = this.f53702e;
        jm0 jm0Var = dm0Var.f47185q0;
        switch (i7) {
            case 1:
                Context context = dm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                i6Var = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                gm0 gm0Var = new gm0(this.d, i10, context, i6Var);
                dm0Var.f47173f = gm0Var;
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, gm0Var, jm0Var.getResourceProvider());
                gm0Var.a(dm0Var.h, false);
                gm0Var.setOnColorClick(new vl0(this, 1));
                cm0Var = gm0Var;
                break;
            case 2:
            default:
                cm0Var = new org.telegram.ui.Cells.z8(dm0Var.getContext(), jm0Var.getResourceProvider());
                break;
            case 3:
                cm0 cm0Var2 = new cm0(dm0Var, dm0Var.getContext());
                dm0Var.E = cm0Var2;
                cm0Var2.b(false);
                cm0Var = cm0Var2;
                break;
            case 4:
                View inVar = new org.telegram.ui.Components.in(dm0Var.getContext(), 19);
                inVar.setTag(-33024);
                vzVar = inVar;
                cm0Var = vzVar;
                break;
            case 5:
                View view = new View(dm0Var.getContext());
                view.setTag(-33024);
                vzVar = view;
                cm0Var = vzVar;
                break;
            case 6:
                View m8Var = new org.telegram.ui.Cells.m8(dm0Var.getContext(), jm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var, jm0Var.getResourceProvider());
                cm0Var = m8Var;
                break;
            case 7:
                Context context2 = dm0Var.getContext();
                i6Var2 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                View o4Var = new org.telegram.ui.Cells.o4(context2, i6Var2);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, o4Var, jm0Var.getResourceProvider());
                cm0Var = o4Var;
                break;
            case 8:
                Context context3 = dm0Var.getContext();
                i6Var3 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                View sl0Var = new sl0(context3, i6Var3, false);
                sl0Var.setTag(-33024);
                vzVar = sl0Var;
                cm0Var = vzVar;
                break;
            case 9:
                Context context4 = this.f53701c;
                i6Var4 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                org.telegram.ui.Components.vz vzVar2 = new org.telegram.ui.Components.vz(context4, i6Var4);
                vzVar2.setIsSingleCell(true);
                vzVar2.setViewType(35);
                vzVar2.setTag(-33024);
                vzVar = vzVar2;
                cm0Var = vzVar;
                break;
            case 10:
                View inVar2 = new org.telegram.ui.Components.in(dm0Var.getContext(), 20);
                inVar2.setTag(-33024);
                vzVar = inVar2;
                cm0Var = vzVar;
                break;
            case 11:
                cm0Var = new bm0(dm0Var, dm0Var.getContext());
                break;
            case 12:
                Context context5 = dm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                i6Var5 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                View i3Var = new bi.i3(i11, context5, i6Var5);
                i3Var.setTag(-33024);
                vzVar = i3Var;
                cm0Var = vzVar;
                break;
        }
        return new v4.f1(cm0Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        dm0 dm0Var = this.f53702e;
        ArrayList arrayList = dm0Var.m0;
        int i7 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i7 == 10) {
            dm0Var.G = view;
            view.post(new tl0(dm0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i7 == 8) {
            sl0 sl0Var = (sl0) view;
            int b10 = f1Var.b() - dm0Var.f47169c0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                sl0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dm0Var.f47186r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f28721id) && ((tL_peerColorCollectible2 = dm0Var.f47187s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f28721id)) {
                    z10 = false;
                }
                sl0Var.b(z10, false);
            }
        } else if (i7 == 12) {
            bi.i3 i3Var = (bi.i3) view;
            int b11 = f1Var.b() - dm0Var.f47169c0;
            if (dm0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                i3Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dm0Var.f47186r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28721id) && ((tL_peerColorCollectible = dm0Var.f47187s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f28721id)) {
                    z10 = false;
                }
                i3Var.f(z10, false);
            }
        }
    }
}
