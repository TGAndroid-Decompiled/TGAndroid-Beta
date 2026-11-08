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
public final class ul0 extends org.telegram.ui.Components.oj0 {
    public final Context f50372c;
    public final int d;
    public final bm0 f50373e;

    public ul0(bm0 bm0Var, Context context, int i7) {
        this.f50373e = bm0Var;
        this.f50372c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57047f;
        if (i7 != 3 && i7 != 6 && i7 != 8 && i7 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f50373e.f44444k0;
    }

    @Override
    public final int d(int i7) {
        bm0 bm0Var = this.f50373e;
        if (i7 == bm0Var.R || i7 == bm0Var.f44440g0 || i7 == bm0Var.T || i7 == bm0Var.W) {
            return 2;
        }
        if (i7 == bm0Var.Q) {
            return 1;
        }
        if (i7 == bm0Var.S) {
            return 3;
        }
        if (i7 == bm0Var.U) {
            return 5;
        }
        if (i7 == bm0Var.V) {
            return 6;
        }
        if (i7 == bm0Var.f44441h0) {
            return 10;
        }
        if (i7 == bm0Var.f44442i0) {
            return 11;
        }
        if (i7 == bm0Var.f44430a0) {
            return 7;
        }
        if (i7 >= bm0Var.f44432b0 && i7 < bm0Var.f44434c0) {
            if (bm0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i7 >= bm0Var.f44435d0 && i7 < bm0Var.f44437e0) {
            return 9;
        } else {
            if (i7 != bm0Var.f44444k0 - 1 && i7 != bm0Var.f44443j0) {
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
        View view = d1Var.f57043a;
        bm0 bm0Var = this.f50373e;
        HashMap hashMap = bm0Var.M;
        ArrayList arrayList = bm0Var.f44445l0;
        ArrayList arrayList2 = bm0Var.L;
        hm0 hm0Var = bm0Var.f44449p0;
        int d = d(i7);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z11 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, view, hm0Var.getResourceProvider());
                ((em0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i7 == bm0Var.R) {
                    if (i14 == 1) {
                        if (hm0Var.f46448a) {
                            i11 = 2131752434;
                        } else {
                            i11 = 2131743755;
                        }
                        M0 = org.telegram.messenger.id.M0(i11, null);
                    } else {
                        if (hm0Var.f46448a) {
                            i10 = 2131752322;
                        } else {
                            i10 = 2131743737;
                        }
                        M0 = org.telegram.messenger.id.M0(i10, null);
                    }
                    z8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.r2(this, i14, 21)), true));
                    return;
                } else if (i7 == bm0Var.W) {
                    z8Var.setText("");
                    z8Var.setFixedSize(12);
                    return;
                } else if (i7 == bm0Var.f44440g0) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131743743, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((am0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.updateColors();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, m8Var, hm0Var.getResourceProvider());
                m8Var.updateColors();
                if (i7 == bm0Var.V) {
                    if (hm0Var.f46448a) {
                        i12 = 2131752324;
                    } else {
                        i12 = 2131743740;
                    }
                    m8Var.k(org.telegram.messenger.id.M0(i12, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == bm0Var.f44430a0) {
                    n4Var.c(org.telegram.messenger.id.M0(2131743744, null), false);
                }
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, hm0Var.getResourceProvider());
                return;
            case 8:
                ql0 ql0Var = (ql0) view;
                int i16 = i7 - bm0Var.f44432b0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    ql0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bm0Var.f44450r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f27185id) || ((tL_peerColorCollectible = bm0Var.f44451s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f27185id)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ql0Var.b(z9, false);
                    ql0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                bm0Var.F = view;
                gm0 gm0Var = bm0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i13 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                ArrayList arrayList3 = bi.ea.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.id.M0(2131749947, null));
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i17);
                    if ((i14 == 0 || (i14 == i15 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (bm0Var.K == starGift) {
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
                tl0 tl0Var = new tl0(this, 0);
                ArrayList arrayList4 = gm0Var.f46034f;
                if (gm0Var.K == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gm0Var.K = 0;
                gm0Var.h = tl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                gm0Var.f46032c.f();
                gm0Var.a(i18, z10);
                bm0Var.l(gm0Var);
                view.post(new rl0(bm0Var, 3));
                return;
            case 11:
                ((zl0) view).updateColors();
                return;
            case 12:
                zh.y0 y0Var = (zh.y0) view;
                int i19 = i7 - bm0Var.f44432b0;
                if (bm0Var.J != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    y0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = bm0Var.f44450r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f27185id) && ((tL_peerColorCollectible2 = bm0Var.f44451s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f27185id)) {
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.Components.mz mzVar;
        am0 am0Var;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var5;
        bm0 bm0Var = this.f50373e;
        hm0 hm0Var = bm0Var.f44449p0;
        switch (i7) {
            case 1:
                Context context = bm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                em0 em0Var = new em0(this.d, i10, context, f6Var);
                bm0Var.f44438f = em0Var;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, em0Var, hm0Var.getResourceProvider());
                em0Var.a(bm0Var.h, false);
                em0Var.setOnColorClick(new tl0(this, 1));
                am0Var = em0Var;
                break;
            case 2:
            default:
                am0Var = new org.telegram.ui.Cells.z8(bm0Var.getContext(), hm0Var.getResourceProvider());
                break;
            case 3:
                am0 am0Var2 = new am0(bm0Var, bm0Var.getContext());
                bm0Var.D = am0Var2;
                am0Var2.b(false);
                am0Var = am0Var2;
                break;
            case 4:
                View tmVar = new org.telegram.ui.Components.tm(bm0Var.getContext(), 19);
                tmVar.setTag(-33024);
                mzVar = tmVar;
                am0Var = mzVar;
                break;
            case 5:
                View view = new View(bm0Var.getContext());
                view.setTag(-33024);
                mzVar = view;
                am0Var = mzVar;
                break;
            case 6:
                View m8Var = new org.telegram.ui.Cells.m8(bm0Var.getContext(), hm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, m8Var, hm0Var.getResourceProvider());
                am0Var = m8Var;
                break;
            case 7:
                Context context2 = bm0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, f6Var2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, hm0Var.getResourceProvider());
                am0Var = n4Var;
                break;
            case 8:
                Context context3 = bm0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                View ql0Var = new ql0(context3, f6Var3, false);
                ql0Var.setTag(-33024);
                mzVar = ql0Var;
                am0Var = mzVar;
                break;
            case 9:
                Context context4 = this.f50372c;
                f6Var4 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                org.telegram.ui.Components.mz mzVar2 = new org.telegram.ui.Components.mz(context4, f6Var4);
                mzVar2.setIsSingleCell(true);
                mzVar2.setViewType(35);
                mzVar2.setTag(-33024);
                mzVar = mzVar2;
                am0Var = mzVar;
                break;
            case 10:
                View tmVar2 = new org.telegram.ui.Components.tm(bm0Var.getContext(), 20);
                tmVar2.setTag(-33024);
                mzVar = tmVar2;
                am0Var = mzVar;
                break;
            case 11:
                am0Var = new zl0(bm0Var, bm0Var.getContext());
                break;
            case 12:
                Context context5 = bm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                View y0Var = new zh.y0(i11, context5, f6Var5);
                y0Var.setTag(-33024);
                mzVar = y0Var;
                am0Var = mzVar;
                break;
        }
        return new v4.d1(am0Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        bm0 bm0Var = this.f50373e;
        ArrayList arrayList = bm0Var.f44445l0;
        int i7 = d1Var.f57047f;
        View view = d1Var.f57043a;
        if (i7 == 10) {
            bm0Var.F = view;
            view.post(new rl0(bm0Var, 2));
            return;
        }
        boolean z9 = true;
        if (i7 == 8) {
            ql0 ql0Var = (ql0) view;
            int b10 = d1Var.b() - bm0Var.f44432b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ql0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bm0Var.f44450r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f27185id) && ((tL_peerColorCollectible2 = bm0Var.f44451s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f27185id)) {
                    z9 = false;
                }
                ql0Var.b(z9, false);
            }
        } else if (i7 == 12) {
            zh.y0 y0Var = (zh.y0) view;
            int b11 = d1Var.b() - bm0Var.f44432b0;
            if (bm0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                y0Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = bm0Var.f44450r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f27185id) && ((tL_peerColorCollectible = bm0Var.f44451s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f27185id)) {
                    z9 = false;
                }
                y0Var.f(z9, false);
            }
        }
    }
}
