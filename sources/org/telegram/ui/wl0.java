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
public final class wl0 extends org.telegram.ui.Components.pj0 {
    public final Context f51428c;
    public final int d;
    public final dm0 f51429e;

    public wl0(dm0 dm0Var, Context context, int i7) {
        this.f51429e = dm0Var;
        this.f51428c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 3 && i7 != 6 && i7 != 8 && i7 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f51429e.f45073k0;
    }

    @Override
    public final int d(int i7) {
        dm0 dm0Var = this.f51429e;
        if (i7 == dm0Var.R || i7 == dm0Var.f45069g0 || i7 == dm0Var.T || i7 == dm0Var.W) {
            return 2;
        }
        if (i7 == dm0Var.Q) {
            return 1;
        }
        if (i7 == dm0Var.S) {
            return 3;
        }
        if (i7 == dm0Var.U) {
            return 5;
        }
        if (i7 == dm0Var.V) {
            return 6;
        }
        if (i7 == dm0Var.f45070h0) {
            return 10;
        }
        if (i7 == dm0Var.f45071i0) {
            return 11;
        }
        if (i7 == dm0Var.f45059a0) {
            return 7;
        }
        if (i7 >= dm0Var.f45061b0 && i7 < dm0Var.f45063c0) {
            if (dm0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i7 >= dm0Var.f45064d0 && i7 < dm0Var.f45066e0) {
            return 9;
        } else {
            if (i7 != dm0Var.f45073k0 - 1 && i7 != dm0Var.f45072j0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        String M0;
        int i11;
        int i12;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z9;
        int i13;
        boolean z10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = d1Var.f57056a;
        dm0 dm0Var = this.f51429e;
        HashMap hashMap = dm0Var.M;
        ArrayList arrayList = dm0Var.f45074l0;
        ArrayList arrayList2 = dm0Var.L;
        jm0 jm0Var = dm0Var.f45078p0;
        int d = d(i7);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z11 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, view, jm0Var.getResourceProvider());
                ((gm0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 == dm0Var.R) {
                    if (i14 == 1) {
                        if (jm0Var.f47036a) {
                            i11 = 2131752434;
                        } else {
                            i11 = 2131743752;
                        }
                        M0 = org.telegram.messenger.id.M0(i11, null);
                    } else {
                        if (jm0Var.f47036a) {
                            i10 = 2131752322;
                        } else {
                            i10 = 2131743734;
                        }
                        M0 = org.telegram.messenger.id.M0(i10, null);
                    }
                    z8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.r2(this, i14, 21)), true));
                    return;
                } else if (i7 == dm0Var.W) {
                    z8Var.setText("");
                    z8Var.setFixedSize(12);
                    return;
                } else if (i7 == dm0Var.f45069g0) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131743740, null));
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
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, m8Var, jm0Var.getResourceProvider());
                m8Var.updateColors();
                if (i7 == dm0Var.V) {
                    if (jm0Var.f47036a) {
                        i12 = 2131752324;
                    } else {
                        i12 = 2131743737;
                    }
                    m8Var.k(org.telegram.messenger.id.M0(i12, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == dm0Var.f45059a0) {
                    n4Var.c(org.telegram.messenger.id.M0(2131743741, null), false);
                }
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, n4Var, jm0Var.getResourceProvider());
                return;
            case 8:
                sl0 sl0Var = (sl0) view;
                int i16 = i7 - dm0Var.f45061b0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    sl0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dm0Var.f45079r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f27185id) || ((tL_peerColorCollectible = dm0Var.f45080s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f27185id)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    sl0Var.b(z9, false);
                    sl0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                dm0Var.F = view;
                im0 im0Var = dm0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i13 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                ArrayList arrayList3 = bi.ea.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.id.M0(2131749946, null));
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i17);
                    if ((i14 == 0 || (i14 == i15 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (dm0Var.K == starGift) {
                            i18 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i15);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        r5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(r5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i17++;
                    i15 = 1;
                }
                vl0 vl0Var = new vl0(this, 0);
                ArrayList arrayList4 = im0Var.f46695f;
                if (im0Var.K == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                im0Var.K = 0;
                im0Var.h = vl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                im0Var.f46693c.f();
                im0Var.a(i18, z10);
                dm0Var.l(im0Var);
                view.post(new tl0(dm0Var, 3));
                return;
            case 11:
                ((bm0) view).updateColors();
                return;
            case 12:
                zh.y0 y0Var = (zh.y0) view;
                int i19 = i7 - dm0Var.f45061b0;
                if (dm0Var.J != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    y0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dm0Var.f45079r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f27185id) && ((tL_peerColorCollectible2 = dm0Var.f45080s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f27185id)) {
                        z11 = false;
                    }
                    y0Var.f(z11, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.Components.mz mzVar;
        cm0 cm0Var;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var5;
        dm0 dm0Var = this.f51429e;
        jm0 jm0Var = dm0Var.f45078p0;
        switch (i7) {
            case 1:
                Context context = dm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                gm0 gm0Var = new gm0(this.d, i10, context, g6Var);
                dm0Var.f45067f = gm0Var;
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, gm0Var, jm0Var.getResourceProvider());
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
                dm0Var.D = cm0Var2;
                cm0Var2.b(false);
                cm0Var = cm0Var2;
                break;
            case 4:
                View tmVar = new org.telegram.ui.Components.tm(dm0Var.getContext(), 19);
                tmVar.setTag(-33024);
                mzVar = tmVar;
                cm0Var = mzVar;
                break;
            case 5:
                View view = new View(dm0Var.getContext());
                view.setTag(-33024);
                mzVar = view;
                cm0Var = mzVar;
                break;
            case 6:
                View m8Var = new org.telegram.ui.Cells.m8(dm0Var.getContext(), jm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, m8Var, jm0Var.getResourceProvider());
                cm0Var = m8Var;
                break;
            case 7:
                Context context2 = dm0Var.getContext();
                g6Var2 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, g6Var2);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, n4Var, jm0Var.getResourceProvider());
                cm0Var = n4Var;
                break;
            case 8:
                Context context3 = dm0Var.getContext();
                g6Var3 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                View sl0Var = new sl0(context3, g6Var3, false);
                sl0Var.setTag(-33024);
                mzVar = sl0Var;
                cm0Var = mzVar;
                break;
            case 9:
                Context context4 = this.f51428c;
                g6Var4 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                org.telegram.ui.Components.mz mzVar2 = new org.telegram.ui.Components.mz(context4, g6Var4);
                mzVar2.setIsSingleCell(true);
                mzVar2.setViewType(35);
                mzVar2.setTag(-33024);
                mzVar = mzVar2;
                cm0Var = mzVar;
                break;
            case 10:
                View tmVar2 = new org.telegram.ui.Components.tm(dm0Var.getContext(), 20);
                tmVar2.setTag(-33024);
                mzVar = tmVar2;
                cm0Var = mzVar;
                break;
            case 11:
                cm0Var = new bm0(dm0Var, dm0Var.getContext());
                break;
            case 12:
                Context context5 = dm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                g6Var5 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                View y0Var = new zh.y0(i11, context5, g6Var5);
                y0Var.setTag(-33024);
                mzVar = y0Var;
                cm0Var = mzVar;
                break;
        }
        return new v4.d1(cm0Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        dm0 dm0Var = this.f51429e;
        ArrayList arrayList = dm0Var.f45074l0;
        int i7 = d1Var.f57060f;
        View view = d1Var.f57056a;
        if (i7 == 10) {
            dm0Var.F = view;
            view.post(new tl0(dm0Var, 2));
            return;
        }
        boolean z9 = true;
        if (i7 == 8) {
            sl0 sl0Var = (sl0) view;
            int b10 = d1Var.b() - dm0Var.f45061b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                sl0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dm0Var.f45079r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f27185id) && ((tL_peerColorCollectible2 = dm0Var.f45080s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f27185id)) {
                    z9 = false;
                }
                sl0Var.b(z9, false);
            }
        } else if (i7 == 12) {
            zh.y0 y0Var = (zh.y0) view;
            int b11 = d1Var.b() - dm0Var.f45061b0;
            if (dm0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                y0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dm0Var.f45079r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f27185id) && ((tL_peerColorCollectible = dm0Var.f45080s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f27185id)) {
                    z9 = false;
                }
                y0Var.f(z9, false);
            }
        }
    }
}
