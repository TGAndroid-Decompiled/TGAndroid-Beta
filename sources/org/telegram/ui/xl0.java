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
public final class xl0 extends org.telegram.ui.Components.oj0 {
    public final Context f51745c;
    public final int d;
    public final em0 f51746e;

    public xl0(em0 em0Var, Context context, int i7) {
        this.f51746e = em0Var;
        this.f51745c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 != 6 && i7 != 8 && i7 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f51746e.f45396k0;
    }

    @Override
    public final int d(int i7) {
        em0 em0Var = this.f51746e;
        if (i7 == em0Var.R || i7 == em0Var.f45392g0 || i7 == em0Var.T || i7 == em0Var.W) {
            return 2;
        }
        if (i7 == em0Var.Q) {
            return 1;
        }
        if (i7 == em0Var.S) {
            return 3;
        }
        if (i7 == em0Var.U) {
            return 5;
        }
        if (i7 == em0Var.V) {
            return 6;
        }
        if (i7 == em0Var.f45393h0) {
            return 10;
        }
        if (i7 == em0Var.f45394i0) {
            return 11;
        }
        if (i7 == em0Var.f45382a0) {
            return 7;
        }
        if (i7 >= em0Var.f45384b0 && i7 < em0Var.f45386c0) {
            if (em0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i7 >= em0Var.f45387d0 && i7 < em0Var.f45389e0) {
            return 9;
        } else {
            if (i7 != em0Var.f45396k0 - 1 && i7 != em0Var.f45395j0) {
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
        View view = d1Var.f57052a;
        em0 em0Var = this.f51746e;
        HashMap hashMap = em0Var.M;
        ArrayList arrayList = em0Var.f45397l0;
        ArrayList arrayList2 = em0Var.L;
        km0 km0Var = em0Var.f45401p0;
        int d = d(i7);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z11 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, view, km0Var.getResourceProvider());
                ((hm0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 == em0Var.R) {
                    if (i14 == 1) {
                        if (km0Var.f47367a) {
                            i11 = 2131752434;
                        } else {
                            i11 = 2131743752;
                        }
                        M0 = org.telegram.messenger.id.M0(i11, null);
                    } else {
                        if (km0Var.f47367a) {
                            i10 = 2131752322;
                        } else {
                            i10 = 2131743734;
                        }
                        M0 = org.telegram.messenger.id.M0(i10, null);
                    }
                    z8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.q2(this, i14, 21)), true));
                    return;
                } else if (i7 == em0Var.W) {
                    z8Var.setText("");
                    z8Var.setFixedSize(12);
                    return;
                } else if (i7 == em0Var.f45392g0) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131743740, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((dm0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.updateColors();
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, m8Var, km0Var.getResourceProvider());
                m8Var.updateColors();
                if (i7 == em0Var.V) {
                    if (km0Var.f47367a) {
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
                if (i7 == em0Var.f45382a0) {
                    n4Var.c(org.telegram.messenger.id.M0(2131743741, null), false);
                }
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var, km0Var.getResourceProvider());
                return;
            case 8:
                tl0 tl0Var = (tl0) view;
                int i16 = i7 - em0Var.f45384b0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    tl0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = em0Var.f45402r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f27189id) || ((tL_peerColorCollectible = em0Var.f45403s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f27189id)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    tl0Var.b(z9, false);
                    tl0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                em0Var.F = view;
                jm0 jm0Var = em0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i13 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                ArrayList arrayList3 = bi.ea.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.id.M0(2131749946, null));
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i17);
                    if ((i14 == 0 || (i14 == i15 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (em0Var.K == starGift) {
                            i18 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i15);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        q5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(q5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i17++;
                    i15 = 1;
                }
                wl0 wl0Var = new wl0(this, 0);
                ArrayList arrayList4 = jm0Var.f47040f;
                if (jm0Var.K == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jm0Var.K = 0;
                jm0Var.h = wl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                jm0Var.f47038c.f();
                jm0Var.a(i18, z10);
                em0Var.l(jm0Var);
                view.post(new ul0(em0Var, 3));
                return;
            case 11:
                ((cm0) view).updateColors();
                return;
            case 12:
                zh.y0 y0Var = (zh.y0) view;
                int i19 = i7 - em0Var.f45384b0;
                if (em0Var.J != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    y0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = em0Var.f45402r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f27189id) && ((tL_peerColorCollectible2 = em0Var.f45403s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f27189id)) {
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
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        org.telegram.ui.ActionBar.h6 h6Var4;
        org.telegram.ui.Components.lz lzVar;
        dm0 dm0Var;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var5;
        em0 em0Var = this.f51746e;
        km0 km0Var = em0Var.f45401p0;
        switch (i7) {
            case 1:
                Context context = em0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                h6Var = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                hm0 hm0Var = new hm0(this.d, i10, context, h6Var);
                em0Var.f45390f = hm0Var;
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, hm0Var, km0Var.getResourceProvider());
                hm0Var.a(em0Var.h, false);
                hm0Var.setOnColorClick(new wl0(this, 1));
                dm0Var = hm0Var;
                break;
            case 2:
            default:
                dm0Var = new org.telegram.ui.Cells.z8(em0Var.getContext(), km0Var.getResourceProvider());
                break;
            case 3:
                dm0 dm0Var2 = new dm0(em0Var, em0Var.getContext());
                em0Var.D = dm0Var2;
                dm0Var2.b(false);
                dm0Var = dm0Var2;
                break;
            case 4:
                View smVar = new org.telegram.ui.Components.sm(em0Var.getContext(), 19);
                smVar.setTag(-33024);
                lzVar = smVar;
                dm0Var = lzVar;
                break;
            case 5:
                View view = new View(em0Var.getContext());
                view.setTag(-33024);
                lzVar = view;
                dm0Var = lzVar;
                break;
            case 6:
                View m8Var = new org.telegram.ui.Cells.m8(em0Var.getContext(), km0Var.getResourceProvider());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, m8Var, km0Var.getResourceProvider());
                dm0Var = m8Var;
                break;
            case 7:
                Context context2 = em0Var.getContext();
                h6Var2 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, h6Var2);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var, km0Var.getResourceProvider());
                dm0Var = n4Var;
                break;
            case 8:
                Context context3 = em0Var.getContext();
                h6Var3 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                View tl0Var = new tl0(context3, h6Var3, false);
                tl0Var.setTag(-33024);
                lzVar = tl0Var;
                dm0Var = lzVar;
                break;
            case 9:
                Context context4 = this.f51745c;
                h6Var4 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                org.telegram.ui.Components.lz lzVar2 = new org.telegram.ui.Components.lz(context4, h6Var4);
                lzVar2.setIsSingleCell(true);
                lzVar2.setViewType(35);
                lzVar2.setTag(-33024);
                lzVar = lzVar2;
                dm0Var = lzVar;
                break;
            case 10:
                View smVar2 = new org.telegram.ui.Components.sm(em0Var.getContext(), 20);
                smVar2.setTag(-33024);
                lzVar = smVar2;
                dm0Var = lzVar;
                break;
            case 11:
                dm0Var = new cm0(em0Var, em0Var.getContext());
                break;
            case 12:
                Context context5 = em0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                h6Var5 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                View y0Var = new zh.y0(i11, context5, h6Var5);
                y0Var.setTag(-33024);
                lzVar = y0Var;
                dm0Var = lzVar;
                break;
        }
        return new v4.d1(dm0Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        em0 em0Var = this.f51746e;
        ArrayList arrayList = em0Var.f45397l0;
        int i7 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i7 == 10) {
            em0Var.F = view;
            view.post(new ul0(em0Var, 2));
            return;
        }
        boolean z9 = true;
        if (i7 == 8) {
            tl0 tl0Var = (tl0) view;
            int b10 = d1Var.b() - em0Var.f45384b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                tl0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = em0Var.f45402r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f27189id) && ((tL_peerColorCollectible2 = em0Var.f45403s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f27189id)) {
                    z9 = false;
                }
                tl0Var.b(z9, false);
            }
        } else if (i7 == 12) {
            zh.y0 y0Var = (zh.y0) view;
            int b11 = d1Var.b() - em0Var.f45384b0;
            if (em0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                y0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = em0Var.f45402r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f27189id) && ((tL_peerColorCollectible = em0Var.f45403s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f27189id)) {
                    z9 = false;
                }
                y0Var.f(z9, false);
            }
        }
    }
}
