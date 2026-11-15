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
public final class wl0 extends org.telegram.ui.Components.tj0 {
    public final Context f52931c;
    public final int d;
    public final dm0 f52932e;

    public wl0(dm0 dm0Var, Context context, int i7) {
        this.f52932e = dm0Var;
        this.f52931c = context;
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
        return this.f52932e.f46414l0;
    }

    @Override
    public final int d(int i7) {
        dm0 dm0Var = this.f52932e;
        if (i7 == dm0Var.S || i7 == dm0Var.f46410h0 || i7 == dm0Var.U || i7 == dm0Var.f46399a0) {
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
        if (i7 == dm0Var.f46411i0) {
            return 10;
        }
        if (i7 == dm0Var.f46412j0) {
            return 11;
        }
        if (i7 == dm0Var.f46401b0) {
            return 7;
        }
        if (i7 >= dm0Var.f46403c0 && i7 < dm0Var.f46404d0) {
            if (dm0Var.L == null) {
                return 8;
            }
            return 12;
        } else if (i7 >= dm0Var.f46406e0 && i7 < dm0Var.f46408f0) {
            return 9;
        } else {
            if (i7 != dm0Var.f46414l0 - 1 && i7 != dm0Var.f46413k0) {
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
        dm0 dm0Var = this.f52932e;
        HashMap hashMap = dm0Var.N;
        ArrayList arrayList = dm0Var.m0;
        ArrayList arrayList2 = dm0Var.M;
        jm0 jm0Var = dm0Var.f46419q0;
        int d = d(i7);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z12 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, view, jm0Var.getResourceProvider());
                ((gm0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i7 == dm0Var.S) {
                    if (i14 == 1) {
                        if (jm0Var.f48368a) {
                            i11 = 2131752434;
                        } else {
                            i11 = 2131743752;
                        }
                        M0 = org.telegram.messenger.hd.M0(i11, null);
                    } else {
                        if (jm0Var.f48368a) {
                            i10 = 2131752322;
                        } else {
                            i10 = 2131743734;
                        }
                        M0 = org.telegram.messenger.hd.M0(i10, null);
                    }
                    y8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.a2(this, i14, 24)), true));
                    return;
                } else if (i7 == dm0Var.f46399a0) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    return;
                } else if (i7 == dm0Var.f46410h0) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131743740, null));
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
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.updateColors();
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var, jm0Var.getResourceProvider());
                l8Var.updateColors();
                if (i7 == dm0Var.W) {
                    if (jm0Var.f48368a) {
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
                if (i7 == dm0Var.f46401b0) {
                    n4Var.c(org.telegram.messenger.hd.M0(2131743741, null), false);
                }
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, jm0Var.getResourceProvider());
                return;
            case 8:
                sl0 sl0Var = (sl0) view;
                int i16 = i7 - dm0Var.f46403c0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    sl0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dm0Var.f46420r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f28280id) || ((tL_peerColorCollectible = dm0Var.f46421s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f28280id)) {
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
                i13 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                ArrayList arrayList3 = di.u8.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.hd.M0(2131749946, null));
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
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        p5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(p5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i17++;
                    i15 = 1;
                }
                vl0 vl0Var = new vl0(this, 0);
                ArrayList arrayList4 = im0Var.f48078f;
                if (im0Var.L == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                im0Var.L = 0;
                im0Var.h = vl0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                im0Var.f48076c.f();
                im0Var.a(i18, z11);
                dm0Var.l(im0Var);
                view.post(new tl0(dm0Var, 3));
                return;
            case 11:
                ((bm0) view).updateColors();
                return;
            case 12:
                bi.i2 i2Var = (bi.i2) view;
                int i19 = i7 - dm0Var.f46403c0;
                if (dm0Var.K != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    i2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dm0Var.f46420r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28280id) && ((tL_peerColorCollectible2 = dm0Var.f46421s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f28280id)) {
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
        cm0 cm0Var;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var5;
        dm0 dm0Var = this.f52932e;
        jm0 jm0Var = dm0Var.f46419q0;
        switch (i7) {
            case 1:
                Context context = dm0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                gm0 gm0Var = new gm0(this.d, i10, context, e6Var);
                dm0Var.f46407f = gm0Var;
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, gm0Var, jm0Var.getResourceProvider());
                gm0Var.a(dm0Var.h, false);
                gm0Var.setOnColorClick(new vl0(this, 1));
                cm0Var = gm0Var;
                break;
            case 2:
            default:
                cm0Var = new org.telegram.ui.Cells.y8(dm0Var.getContext(), jm0Var.getResourceProvider());
                break;
            case 3:
                cm0 cm0Var2 = new cm0(dm0Var, dm0Var.getContext());
                dm0Var.E = cm0Var2;
                cm0Var2.b(false);
                cm0Var = cm0Var2;
                break;
            case 4:
                View bnVar = new org.telegram.ui.Components.bn(dm0Var.getContext(), 19);
                bnVar.setTag(-33024);
                pzVar = bnVar;
                cm0Var = pzVar;
                break;
            case 5:
                View view = new View(dm0Var.getContext());
                view.setTag(-33024);
                pzVar = view;
                cm0Var = pzVar;
                break;
            case 6:
                View l8Var = new org.telegram.ui.Cells.l8(dm0Var.getContext(), jm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var, jm0Var.getResourceProvider());
                cm0Var = l8Var;
                break;
            case 7:
                Context context2 = dm0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, e6Var2);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, jm0Var.getResourceProvider());
                cm0Var = n4Var;
                break;
            case 8:
                Context context3 = dm0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                View sl0Var = new sl0(context3, e6Var3, false);
                sl0Var.setTag(-33024);
                pzVar = sl0Var;
                cm0Var = pzVar;
                break;
            case 9:
                Context context4 = this.f52931c;
                e6Var4 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                org.telegram.ui.Components.pz pzVar2 = new org.telegram.ui.Components.pz(context4, e6Var4);
                pzVar2.setIsSingleCell(true);
                pzVar2.setViewType(35);
                pzVar2.setTag(-33024);
                pzVar = pzVar2;
                cm0Var = pzVar;
                break;
            case 10:
                View bnVar2 = new org.telegram.ui.Components.bn(dm0Var.getContext(), 20);
                bnVar2.setTag(-33024);
                pzVar = bnVar2;
                cm0Var = pzVar;
                break;
            case 11:
                cm0Var = new bm0(dm0Var, dm0Var.getContext());
                break;
            case 12:
                Context context5 = dm0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                View i2Var = new bi.i2(i11, context5, e6Var5);
                i2Var.setTag(-33024);
                pzVar = i2Var;
                cm0Var = pzVar;
                break;
        }
        return new v4.e1(cm0Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        dm0 dm0Var = this.f52932e;
        ArrayList arrayList = dm0Var.m0;
        int i7 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i7 == 10) {
            dm0Var.G = view;
            view.post(new tl0(dm0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i7 == 8) {
            sl0 sl0Var = (sl0) view;
            int b10 = e1Var.b() - dm0Var.f46403c0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                sl0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dm0Var.f46420r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f28280id) && ((tL_peerColorCollectible2 = dm0Var.f46421s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f28280id)) {
                    z10 = false;
                }
                sl0Var.b(z10, false);
            }
        } else if (i7 == 12) {
            bi.i2 i2Var = (bi.i2) view;
            int b11 = e1Var.b() - dm0Var.f46403c0;
            if (dm0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                i2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dm0Var.f46420r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f28280id) && ((tL_peerColorCollectible = dm0Var.f46421s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f28280id)) {
                    z10 = false;
                }
                i2Var.f(z10, false);
            }
        }
    }
}
