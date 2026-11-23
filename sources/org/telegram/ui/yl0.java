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
public final class yl0 extends org.telegram.ui.Components.dk0 {
    public final Context f54229c;
    public final int d;
    public final fm0 f54230e;

    public yl0(fm0 fm0Var, Context context, int i7) {
        this.f54230e = fm0Var;
        this.f54229c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 3 && i7 != 6 && i7 != 8 && i7 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f54230e.f47781l0;
    }

    @Override
    public final int d(int i7) {
        fm0 fm0Var = this.f54230e;
        if (i7 == fm0Var.S || i7 == fm0Var.f47777h0 || i7 == fm0Var.U || i7 == fm0Var.f47766a0) {
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
        if (i7 == fm0Var.f47778i0) {
            return 10;
        }
        if (i7 == fm0Var.f47779j0) {
            return 11;
        }
        if (i7 == fm0Var.f47768b0) {
            return 7;
        }
        if (i7 >= fm0Var.f47770c0 && i7 < fm0Var.f47771d0) {
            if (fm0Var.L == null) {
                return 8;
            }
            return 12;
        } else if (i7 >= fm0Var.f47773e0 && i7 < fm0Var.f47775f0) {
            return 9;
        } else {
            if (i7 != fm0Var.f47781l0 - 1 && i7 != fm0Var.f47780k0) {
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
        View view = f1Var.f59165a;
        fm0 fm0Var = this.f54230e;
        HashMap hashMap = fm0Var.N;
        ArrayList arrayList = fm0Var.m0;
        ArrayList arrayList2 = fm0Var.M;
        lm0 lm0Var = fm0Var.f47786q0;
        int d = d(i7);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z12 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, view, lm0Var.getResourceProvider());
                ((im0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i7 == fm0Var.S) {
                    if (i14 == 1) {
                        if (lm0Var.f49646a) {
                            i11 = 2131752422;
                        } else {
                            i11 = 2131743507;
                        }
                        N0 = org.telegram.messenger.hd.N0(i11, null);
                    } else {
                        if (lm0Var.f49646a) {
                            i10 = 2131752310;
                        } else {
                            i10 = 2131743489;
                        }
                        N0 = org.telegram.messenger.hd.N0(i10, null);
                    }
                    a9Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(N0, new ii(this, i14, 27)), true));
                    return;
                } else if (i7 == fm0Var.f47766a0) {
                    a9Var.setText("");
                    a9Var.setFixedSize(12);
                    return;
                } else if (i7 == fm0Var.f47777h0) {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131743495, null));
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
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, n8Var, lm0Var.getResourceProvider());
                n8Var.updateColors();
                if (i7 == fm0Var.W) {
                    if (lm0Var.f49646a) {
                        i12 = 2131752312;
                    } else {
                        i12 = 2131743492;
                    }
                    n8Var.k(org.telegram.messenger.hd.N0(i12, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == fm0Var.f47768b0) {
                    o4Var.c(org.telegram.messenger.hd.N0(2131743496, null), false);
                }
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, o4Var, lm0Var.getResourceProvider());
                return;
            case 8:
                ul0 ul0Var = (ul0) view;
                int i16 = i7 - fm0Var.f47770c0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    ul0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = fm0Var.f47787r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f28663id) || ((tL_peerColorCollectible = fm0Var.f47788s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f28663id)) {
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
                i13 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                ArrayList arrayList3 = di.y8.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.hd.N0(2131749929, null));
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
                        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        y5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(y5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i17++;
                    i15 = 1;
                }
                xl0 xl0Var = new xl0(this, 0);
                ArrayList arrayList4 = km0Var.f49359f;
                if (km0Var.L == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                km0Var.L = 0;
                km0Var.h = xl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                km0Var.f49357c.f();
                km0Var.a(i18, z11);
                fm0Var.l(km0Var);
                view.post(new vl0(fm0Var, 3));
                return;
            case 11:
                ((dm0) view).updateColors();
                return;
            case 12:
                bi.g3 g3Var = (bi.g3) view;
                int i19 = i7 - fm0Var.f47770c0;
                if (fm0Var.K != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    g3Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = fm0Var.f47787r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28663id) && ((tL_peerColorCollectible2 = fm0Var.f47788s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f28663id)) {
                        z12 = false;
                    }
                    g3Var.f(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        org.telegram.ui.ActionBar.h6 h6Var4;
        org.telegram.ui.Components.yz yzVar;
        em0 em0Var;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var5;
        fm0 fm0Var = this.f54230e;
        lm0 lm0Var = fm0Var.f47786q0;
        switch (i7) {
            case 1:
                Context context = fm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                h6Var = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                im0 im0Var = new im0(this.d, i10, context, h6Var);
                fm0Var.f47774f = im0Var;
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, im0Var, lm0Var.getResourceProvider());
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
                View lnVar = new org.telegram.ui.Components.ln(fm0Var.getContext(), 19);
                lnVar.setTag(-33024);
                yzVar = lnVar;
                em0Var = yzVar;
                break;
            case 5:
                View view = new View(fm0Var.getContext());
                view.setTag(-33024);
                yzVar = view;
                em0Var = yzVar;
                break;
            case 6:
                View n8Var = new org.telegram.ui.Cells.n8(fm0Var.getContext(), lm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, n8Var, lm0Var.getResourceProvider());
                em0Var = n8Var;
                break;
            case 7:
                Context context2 = fm0Var.getContext();
                h6Var2 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                View o4Var = new org.telegram.ui.Cells.o4(context2, h6Var2);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, o4Var, lm0Var.getResourceProvider());
                em0Var = o4Var;
                break;
            case 8:
                Context context3 = fm0Var.getContext();
                h6Var3 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                View ul0Var = new ul0(context3, h6Var3, false);
                ul0Var.setTag(-33024);
                yzVar = ul0Var;
                em0Var = yzVar;
                break;
            case 9:
                Context context4 = this.f54229c;
                h6Var4 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                org.telegram.ui.Components.yz yzVar2 = new org.telegram.ui.Components.yz(context4, h6Var4);
                yzVar2.setIsSingleCell(true);
                yzVar2.setViewType(35);
                yzVar2.setTag(-33024);
                yzVar = yzVar2;
                em0Var = yzVar;
                break;
            case 10:
                View lnVar2 = new org.telegram.ui.Components.ln(fm0Var.getContext(), 20);
                lnVar2.setTag(-33024);
                yzVar = lnVar2;
                em0Var = yzVar;
                break;
            case 11:
                em0Var = new dm0(fm0Var, fm0Var.getContext());
                break;
            case 12:
                Context context5 = fm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                h6Var5 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                View g3Var = new bi.g3(i11, context5, h6Var5);
                g3Var.setTag(-33024);
                yzVar = g3Var;
                em0Var = yzVar;
                break;
        }
        return new v4.f1(em0Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        fm0 fm0Var = this.f54230e;
        ArrayList arrayList = fm0Var.m0;
        int i7 = f1Var.f59169f;
        View view = f1Var.f59165a;
        if (i7 == 10) {
            fm0Var.G = view;
            view.post(new vl0(fm0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i7 == 8) {
            ul0 ul0Var = (ul0) view;
            int b10 = f1Var.b() - fm0Var.f47770c0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ul0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = fm0Var.f47787r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f28663id) && ((tL_peerColorCollectible2 = fm0Var.f47788s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f28663id)) {
                    z10 = false;
                }
                ul0Var.b(z10, false);
            }
        } else if (i7 == 12) {
            bi.g3 g3Var = (bi.g3) view;
            int b11 = f1Var.b() - fm0Var.f47770c0;
            if (fm0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                g3Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = fm0Var.f47787r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28663id) && ((tL_peerColorCollectible = fm0Var.f47788s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f28663id)) {
                    z10 = false;
                }
                g3Var.f(z10, false);
            }
        }
    }
}
