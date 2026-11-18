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
public final class yl0 extends org.telegram.ui.Components.bk0 {
    public final Context f54183c;
    public final int d;
    public final fm0 f54184e;

    public yl0(fm0 fm0Var, Context context, int i7) {
        this.f54184e = fm0Var;
        this.f54183c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 != 3 && i7 != 6 && i7 != 8 && i7 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f54184e.f47710l0;
    }

    @Override
    public final int d(int i7) {
        fm0 fm0Var = this.f54184e;
        if (i7 == fm0Var.S || i7 == fm0Var.f47706h0 || i7 == fm0Var.U || i7 == fm0Var.f47695a0) {
            return 2;
        }
        if (i7 == fm0Var.R) {
            return 1;
        }
        if (i7 == fm0Var.T) {
            return 3;
        }
        if (i7 == fm0Var.V) {
            return 5;
        }
        if (i7 == fm0Var.W) {
            return 6;
        }
        if (i7 == fm0Var.f47707i0) {
            return 10;
        }
        if (i7 == fm0Var.f47708j0) {
            return 11;
        }
        if (i7 == fm0Var.f47697b0) {
            return 7;
        }
        if (i7 >= fm0Var.f47699c0 && i7 < fm0Var.f47700d0) {
            if (fm0Var.L == null) {
                return 8;
            }
            return 12;
        } else if (i7 >= fm0Var.f47702e0 && i7 < fm0Var.f47704f0) {
            return 9;
        } else {
            if (i7 != fm0Var.f47710l0 - 1 && i7 != fm0Var.f47709k0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String M0;
        int i11;
        int i12;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i13;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = f1Var.f59123a;
        fm0 fm0Var = this.f54184e;
        HashMap hashMap = fm0Var.N;
        ArrayList arrayList = fm0Var.m0;
        ArrayList arrayList2 = fm0Var.M;
        lm0 lm0Var = fm0Var.f47715q0;
        int d = d(i7);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z12 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, view, lm0Var.getResourceProvider());
                ((im0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i7 == fm0Var.S) {
                    if (i14 == 1) {
                        if (lm0Var.f49591a) {
                            i11 = 2131752423;
                        } else {
                            i11 = 2131743515;
                        }
                        M0 = org.telegram.messenger.gd.M0(i11, null);
                    } else {
                        if (lm0Var.f49591a) {
                            i10 = 2131752311;
                        } else {
                            i10 = 2131743497;
                        }
                        M0 = org.telegram.messenger.gd.M0(i10, null);
                    }
                    a9Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(M0, new ii(this, i14, 27)), true));
                    return;
                } else if (i7 == fm0Var.f47695a0) {
                    a9Var.setText("");
                    a9Var.setFixedSize(12);
                    return;
                } else if (i7 == fm0Var.f47706h0) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131743503, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((em0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                n8Var.updateColors();
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, n8Var, lm0Var.getResourceProvider());
                n8Var.updateColors();
                if (i7 == fm0Var.W) {
                    if (lm0Var.f49591a) {
                        i12 = 2131752313;
                    } else {
                        i12 = 2131743500;
                    }
                    n8Var.k(org.telegram.messenger.gd.M0(i12, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == fm0Var.f47697b0) {
                    o4Var.c(org.telegram.messenger.gd.M0(2131743504, null), false);
                }
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var, lm0Var.getResourceProvider());
                return;
            case 8:
                ul0 ul0Var = (ul0) view;
                int i16 = i7 - fm0Var.f47699c0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    ul0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = fm0Var.f47716r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f28632id) || ((tL_peerColorCollectible = fm0Var.f47717s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f28632id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ul0Var.b(z10, false);
                    ul0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                fm0Var.G = view;
                km0 km0Var = fm0Var.F;
                arrayList2.clear();
                hashMap.clear();
                i13 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                ArrayList arrayList3 = di.x8.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.gd.M0(2131749930, null));
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i17);
                    if ((i14 == 0 || (i14 == i15 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (fm0Var.L == starGift) {
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
                xl0 xl0Var = new xl0(this, 0);
                ArrayList arrayList4 = km0Var.f49314f;
                if (km0Var.L == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                km0Var.L = 0;
                km0Var.h = xl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                km0Var.f49312c.f();
                km0Var.a(i18, z11);
                fm0Var.l(km0Var);
                view.post(new vl0(fm0Var, 3));
                return;
            case 11:
                ((dm0) view).updateColors();
                return;
            case 12:
                bi.c3 c3Var = (bi.c3) view;
                int i19 = i7 - fm0Var.f47699c0;
                if (fm0Var.K != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    c3Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = fm0Var.f47716r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28632id) && ((tL_peerColorCollectible2 = fm0Var.f47717s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f28632id)) {
                        z12 = false;
                    }
                    c3Var.f(z12, false);
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
        org.telegram.ui.Components.wz wzVar;
        em0 em0Var;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var5;
        fm0 fm0Var = this.f54184e;
        lm0 lm0Var = fm0Var.f47715q0;
        switch (i7) {
            case 1:
                Context context = fm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                i6Var = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                im0 im0Var = new im0(this.d, i10, context, i6Var);
                fm0Var.f47703f = im0Var;
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, im0Var, lm0Var.getResourceProvider());
                im0Var.a(fm0Var.h, false);
                im0Var.setOnColorClick(new xl0(this, 1));
                em0Var = im0Var;
                break;
            case 2:
            default:
                em0Var = new org.telegram.ui.Cells.a9(fm0Var.getContext(), lm0Var.getResourceProvider());
                break;
            case 3:
                em0 em0Var2 = new em0(fm0Var, fm0Var.getContext());
                fm0Var.E = em0Var2;
                em0Var2.b(false);
                em0Var = em0Var2;
                break;
            case 4:
                View jnVar = new org.telegram.ui.Components.jn(fm0Var.getContext(), 19);
                jnVar.setTag(-33024);
                wzVar = jnVar;
                em0Var = wzVar;
                break;
            case 5:
                View view = new View(fm0Var.getContext());
                view.setTag(-33024);
                wzVar = view;
                em0Var = wzVar;
                break;
            case 6:
                View n8Var = new org.telegram.ui.Cells.n8(fm0Var.getContext(), lm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, n8Var, lm0Var.getResourceProvider());
                em0Var = n8Var;
                break;
            case 7:
                Context context2 = fm0Var.getContext();
                i6Var2 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                View o4Var = new org.telegram.ui.Cells.o4(context2, i6Var2);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var, lm0Var.getResourceProvider());
                em0Var = o4Var;
                break;
            case 8:
                Context context3 = fm0Var.getContext();
                i6Var3 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                View ul0Var = new ul0(context3, i6Var3, false);
                ul0Var.setTag(-33024);
                wzVar = ul0Var;
                em0Var = wzVar;
                break;
            case 9:
                Context context4 = this.f54183c;
                i6Var4 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                org.telegram.ui.Components.wz wzVar2 = new org.telegram.ui.Components.wz(context4, i6Var4);
                wzVar2.setIsSingleCell(true);
                wzVar2.setViewType(35);
                wzVar2.setTag(-33024);
                wzVar = wzVar2;
                em0Var = wzVar;
                break;
            case 10:
                View jnVar2 = new org.telegram.ui.Components.jn(fm0Var.getContext(), 20);
                jnVar2.setTag(-33024);
                wzVar = jnVar2;
                em0Var = wzVar;
                break;
            case 11:
                em0Var = new dm0(fm0Var, fm0Var.getContext());
                break;
            case 12:
                Context context5 = fm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                i6Var5 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                View c3Var = new bi.c3(i11, context5, i6Var5);
                c3Var.setTag(-33024);
                wzVar = c3Var;
                em0Var = wzVar;
                break;
        }
        return new v4.f1(em0Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        fm0 fm0Var = this.f54184e;
        ArrayList arrayList = fm0Var.m0;
        int i7 = f1Var.f59127f;
        View view = f1Var.f59123a;
        if (i7 == 10) {
            fm0Var.G = view;
            view.post(new vl0(fm0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i7 == 8) {
            ul0 ul0Var = (ul0) view;
            int b10 = f1Var.b() - fm0Var.f47699c0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ul0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = fm0Var.f47716r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f28632id) && ((tL_peerColorCollectible2 = fm0Var.f47717s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f28632id)) {
                    z10 = false;
                }
                ul0Var.b(z10, false);
            }
        } else if (i7 == 12) {
            bi.c3 c3Var = (bi.c3) view;
            int b11 = f1Var.b() - fm0Var.f47699c0;
            if (fm0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                c3Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = fm0Var.f47716r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28632id) && ((tL_peerColorCollectible = fm0Var.f47717s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f28632id)) {
                    z10 = false;
                }
                c3Var.f(z10, false);
            }
        }
    }
}
