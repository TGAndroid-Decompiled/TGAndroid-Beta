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
public final class vl0 extends org.telegram.ui.Components.tj0 {
    public final Context f52246c;
    public final int d;
    public final cm0 f52247e;

    public vl0(cm0 cm0Var, Context context, int i7) {
        this.f52247e = cm0Var;
        this.f52246c = context;
        this.d = i7;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 6 && i7 != 8 && i7 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f52247e.f46205l0;
    }

    @Override
    public final int d(int i7) {
        cm0 cm0Var = this.f52247e;
        if (i7 == cm0Var.S || i7 == cm0Var.f46201h0 || i7 == cm0Var.U || i7 == cm0Var.f46190a0) {
            return 2;
        }
        if (i7 == cm0Var.R) {
            return 1;
        }
        if (i7 == cm0Var.T) {
            return 3;
        }
        if (i7 == cm0Var.V) {
            return 5;
        }
        if (i7 == cm0Var.W) {
            return 6;
        }
        if (i7 == cm0Var.f46202i0) {
            return 10;
        }
        if (i7 == cm0Var.f46203j0) {
            return 11;
        }
        if (i7 == cm0Var.f46192b0) {
            return 7;
        }
        if (i7 >= cm0Var.f46194c0 && i7 < cm0Var.f46195d0) {
            if (cm0Var.L == null) {
                return 8;
            }
            return 12;
        } else if (i7 >= cm0Var.f46197e0 && i7 < cm0Var.f46199f0) {
            return 9;
        } else {
            if (i7 != cm0Var.f46205l0 - 1 && i7 != cm0Var.f46204k0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        String M0;
        int i11;
        int i12;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i13;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = e1Var.f58535a;
        cm0 cm0Var = this.f52247e;
        HashMap hashMap = cm0Var.N;
        ArrayList arrayList = cm0Var.m0;
        ArrayList arrayList2 = cm0Var.M;
        im0 im0Var = cm0Var.f46210q0;
        int d = d(i7);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z12 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, view, im0Var.getResourceProvider());
                ((fm0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i7 == cm0Var.S) {
                    if (i14 == 1) {
                        if (im0Var.f48084a) {
                            i11 = 2131752434;
                        } else {
                            i11 = 2131743752;
                        }
                        M0 = org.telegram.messenger.hd.M0(i11, null);
                    } else {
                        if (im0Var.f48084a) {
                            i10 = 2131752322;
                        } else {
                            i10 = 2131743734;
                        }
                        M0 = org.telegram.messenger.hd.M0(i10, null);
                    }
                    y8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.a2(this, i14, 24)), true));
                    return;
                } else if (i7 == cm0Var.f46190a0) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    return;
                } else if (i7 == cm0Var.f46201h0) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131743740, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((bm0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.updateColors();
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var, im0Var.getResourceProvider());
                l8Var.updateColors();
                if (i7 == cm0Var.W) {
                    if (im0Var.f48084a) {
                        i12 = 2131752324;
                    } else {
                        i12 = 2131743737;
                    }
                    l8Var.k(org.telegram.messenger.hd.M0(i12, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == cm0Var.f46192b0) {
                    n4Var.c(org.telegram.messenger.hd.M0(2131743741, null), false);
                }
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, im0Var.getResourceProvider());
                return;
            case 8:
                rl0 rl0Var = (rl0) view;
                int i16 = i7 - cm0Var.f46194c0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    rl0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = cm0Var.f46211r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f28280id) || ((tL_peerColorCollectible = cm0Var.f46212s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f28280id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rl0Var.b(z10, false);
                    rl0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                cm0Var.G = view;
                hm0 hm0Var = cm0Var.F;
                arrayList2.clear();
                hashMap.clear();
                i13 = ((org.telegram.ui.ActionBar.e2) im0Var).currentAccount;
                ArrayList arrayList3 = di.v8.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.hd.M0(2131749946, null));
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i17);
                    if ((i14 == 0 || (i14 == i15 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (cm0Var.L == starGift) {
                            i18 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i15);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        p5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(p5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i17++;
                    i15 = 1;
                }
                ul0 ul0Var = new ul0(this, 0);
                ArrayList arrayList4 = hm0Var.f47744f;
                if (hm0Var.L == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hm0Var.L = 0;
                hm0Var.h = ul0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                hm0Var.f47742c.f();
                hm0Var.a(i18, z11);
                cm0Var.l(hm0Var);
                view.post(new sl0(cm0Var, 3));
                return;
            case 11:
                ((am0) view).updateColors();
                return;
            case 12:
                bi.i2 i2Var = (bi.i2) view;
                int i19 = i7 - cm0Var.f46194c0;
                if (cm0Var.K != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    i2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = cm0Var.f46211r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28280id) && ((tL_peerColorCollectible2 = cm0Var.f46212s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f28280id)) {
                        z12 = false;
                    }
                    i2Var.f(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.Components.pz pzVar;
        bm0 bm0Var;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var5;
        cm0 cm0Var = this.f52247e;
        im0 im0Var = cm0Var.f46210q0;
        switch (i7) {
            case 1:
                Context context = cm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e2) im0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
                fm0 fm0Var = new fm0(this.d, i10, context, e6Var);
                cm0Var.f46198f = fm0Var;
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, fm0Var, im0Var.getResourceProvider());
                fm0Var.a(cm0Var.h, false);
                fm0Var.setOnColorClick(new ul0(this, 1));
                bm0Var = fm0Var;
                break;
            case 2:
            default:
                bm0Var = new org.telegram.ui.Cells.y8(cm0Var.getContext(), im0Var.getResourceProvider());
                break;
            case 3:
                bm0 bm0Var2 = new bm0(cm0Var, cm0Var.getContext());
                cm0Var.E = bm0Var2;
                bm0Var2.b(false);
                bm0Var = bm0Var2;
                break;
            case 4:
                View bnVar = new org.telegram.ui.Components.bn(cm0Var.getContext(), 19);
                bnVar.setTag(-33024);
                pzVar = bnVar;
                bm0Var = pzVar;
                break;
            case 5:
                View view = new View(cm0Var.getContext());
                view.setTag(-33024);
                pzVar = view;
                bm0Var = pzVar;
                break;
            case 6:
                View l8Var = new org.telegram.ui.Cells.l8(cm0Var.getContext(), im0Var.getResourceProvider());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var, im0Var.getResourceProvider());
                bm0Var = l8Var;
                break;
            case 7:
                Context context2 = cm0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, e6Var2);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, im0Var.getResourceProvider());
                bm0Var = n4Var;
                break;
            case 8:
                Context context3 = cm0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
                View rl0Var = new rl0(context3, e6Var3, false);
                rl0Var.setTag(-33024);
                pzVar = rl0Var;
                bm0Var = pzVar;
                break;
            case 9:
                Context context4 = this.f52246c;
                e6Var4 = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
                org.telegram.ui.Components.pz pzVar2 = new org.telegram.ui.Components.pz(context4, e6Var4);
                pzVar2.setIsSingleCell(true);
                pzVar2.setViewType(35);
                pzVar2.setTag(-33024);
                pzVar = pzVar2;
                bm0Var = pzVar;
                break;
            case 10:
                View bnVar2 = new org.telegram.ui.Components.bn(cm0Var.getContext(), 20);
                bnVar2.setTag(-33024);
                pzVar = bnVar2;
                bm0Var = pzVar;
                break;
            case 11:
                bm0Var = new am0(cm0Var, cm0Var.getContext());
                break;
            case 12:
                Context context5 = cm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.e2) im0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
                View i2Var = new bi.i2(i11, context5, e6Var5);
                i2Var.setTag(-33024);
                pzVar = i2Var;
                bm0Var = pzVar;
                break;
        }
        return new v4.e1(bm0Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        cm0 cm0Var = this.f52247e;
        ArrayList arrayList = cm0Var.m0;
        int i7 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i7 == 10) {
            cm0Var.G = view;
            view.post(new sl0(cm0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i7 == 8) {
            rl0 rl0Var = (rl0) view;
            int b10 = e1Var.b() - cm0Var.f46194c0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                rl0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = cm0Var.f46211r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f28280id) && ((tL_peerColorCollectible2 = cm0Var.f46212s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f28280id)) {
                    z10 = false;
                }
                rl0Var.b(z10, false);
            }
        } else if (i7 == 12) {
            bi.i2 i2Var = (bi.i2) view;
            int b11 = e1Var.b() - cm0Var.f46194c0;
            if (cm0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                i2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = cm0Var.f46211r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28280id) && ((tL_peerColorCollectible = cm0Var.f46212s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f28280id)) {
                    z10 = false;
                }
                i2Var.f(z10, false);
            }
        }
    }
}
