package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yo0 extends org.telegram.ui.Components.lm0 {
    public final Context f43942c;
    public final int d;
    public final fp0 e;

    public yo0(fp0 fp0Var, Context context, int i10) {
        this.e = fp0Var;
        this.f43942c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f37397k0;
    }

    @Override
    public final int j(int i10) {
        fp0 fp0Var = this.e;
        if (i10 == fp0Var.R || i10 == fp0Var.f37393g0 || i10 == fp0Var.T || i10 == fp0Var.W) {
            return 2;
        }
        if (i10 == fp0Var.Q) {
            return 1;
        }
        if (i10 == fp0Var.S) {
            return 3;
        }
        if (i10 == fp0Var.U) {
            return 5;
        }
        if (i10 == fp0Var.V) {
            return 6;
        }
        if (i10 == fp0Var.f37394h0) {
            return 10;
        }
        if (i10 == fp0Var.f37395i0) {
            return 11;
        }
        if (i10 == fp0Var.f37384a0) {
            return 7;
        }
        if (i10 >= fp0Var.f37386b0 && i10 < fp0Var.f37388c0) {
            if (fp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= fp0Var.f37389d0 && i10 < fp0Var.f37390e0) {
            return 9;
        } else {
            if (i10 != fp0Var.f37397k0 - 1 && i10 != fp0Var.f37396j0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String string;
        int i12;
        int i13;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i14;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = b1Var.f46343a;
        fp0 fp0Var = this.e;
        HashMap hashMap = fp0Var.M;
        ArrayList arrayList = fp0Var.f37398l0;
        ArrayList arrayList2 = fp0Var.L;
        lp0 lp0Var = fp0Var.f37402p0;
        int j10 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j10) {
            case 1:
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, view, lp0Var.getResourceProvider());
                ((ip0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == fp0Var.R) {
                    if (i15 == 1) {
                        if (lp0Var.f39290a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (lp0Var.f39290a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.d2(this, i15, 24)), true));
                    return;
                } else if (i10 == fp0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == fp0Var.f37393g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                ((ep0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.updateColors();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, r8Var, lp0Var.getResourceProvider());
                r8Var.updateColors();
                if (i10 == fp0Var.V) {
                    if (lp0Var.f39290a) {
                        i13 = R.string.ChannelProfileColorReset;
                    } else {
                        i13 = R.string.UserProfileColorReset;
                    }
                    r8Var.k(LocaleController.getString(i13), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == fp0Var.f37384a0) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, l4Var, lp0Var.getResourceProvider());
                return;
            case 8:
                to0 to0Var = (to0) view;
                int i17 = i10 - fp0Var.f37386b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    to0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = fp0Var.f37403r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20567id) || ((tL_peerColorCollectible = fp0Var.f37404s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20567id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    to0Var.b(z10, false);
                    to0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                fp0Var.F = view;
                kp0 kp0Var = fp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                ArrayList arrayList3 = ai.ha.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (fp0Var.K == starGift) {
                            i19 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i16);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(starGift.getDocument(), textPaint.getFontMetricsInt());
                        a6Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(a6Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                xo0 xo0Var = new xo0(this, 0);
                ArrayList arrayList4 = kp0Var.f39033f;
                if (kp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kp0Var.K = 0;
                kp0Var.h = xo0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                kp0Var.f39032c.l();
                kp0Var.a(i19, z11);
                fp0Var.l(kp0Var);
                view.post(new vo0(fp0Var, 3));
                return;
            case 11:
                ((dp0) view).updateColors();
                return;
            case 12:
                yh.g1 g1Var = (yh.g1) view;
                int i20 = i10 - fp0Var.f37386b0;
                if (fp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    g1Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = fp0Var.f37403r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20567id) && ((tL_peerColorCollectible2 = fp0Var.f37404s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20567id)) {
                        z12 = false;
                    }
                    g1Var.f(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.Components.b10 b10Var;
        ep0 ep0Var;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var5;
        fp0 fp0Var = this.e;
        lp0 lp0Var = fp0Var.f37402p0;
        switch (i10) {
            case 1:
                Context context = fp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                ip0 ip0Var = new ip0(this.d, i11, context, g6Var);
                fp0Var.f37391f = ip0Var;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, ip0Var, lp0Var.getResourceProvider());
                ip0Var.a(fp0Var.h, false);
                ip0Var.setOnColorClick(new xo0(this, 1));
                ep0Var = ip0Var;
                break;
            case 2:
            default:
                ep0Var = new org.telegram.ui.Cells.e9(fp0Var.getContext(), lp0Var.getResourceProvider());
                break;
            case 3:
                ep0 ep0Var2 = new ep0(fp0Var, fp0Var.getContext());
                fp0Var.f37407y = ep0Var2;
                ep0Var2.b(false);
                ep0Var = ep0Var2;
                break;
            case 4:
                View unVar = new org.telegram.ui.Components.un(fp0Var.getContext(), 20);
                unVar.setTag(-33024);
                b10Var = unVar;
                ep0Var = b10Var;
                break;
            case 5:
                View view = new View(fp0Var.getContext());
                view.setTag(-33024);
                b10Var = view;
                ep0Var = b10Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(fp0Var.getContext(), lp0Var.getResourceProvider());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, r8Var, lp0Var.getResourceProvider());
                ep0Var = r8Var;
                break;
            case 7:
                Context context2 = fp0Var.getContext();
                g6Var2 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, g6Var2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, l4Var, lp0Var.getResourceProvider());
                ep0Var = l4Var;
                break;
            case 8:
                Context context3 = fp0Var.getContext();
                g6Var3 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                View to0Var = new to0(context3, g6Var3, false);
                to0Var.setTag(-33024);
                b10Var = to0Var;
                ep0Var = b10Var;
                break;
            case 9:
                Context context4 = this.f43942c;
                g6Var4 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                org.telegram.ui.Components.b10 b10Var2 = new org.telegram.ui.Components.b10(context4, g6Var4);
                b10Var2.setIsSingleCell(true);
                b10Var2.setViewType(35);
                b10Var2.setTag(-33024);
                b10Var = b10Var2;
                ep0Var = b10Var;
                break;
            case 10:
                View unVar2 = new org.telegram.ui.Components.un(fp0Var.getContext(), 21);
                unVar2.setTag(-33024);
                b10Var = unVar2;
                ep0Var = b10Var;
                break;
            case 11:
                ep0Var = new dp0(fp0Var, fp0Var.getContext());
                break;
            case 12:
                Context context5 = fp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                g6Var5 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
                View g1Var = new yh.g1(context5, i12, g6Var5);
                g1Var.setTag(-33024);
                b10Var = g1Var;
                ep0Var = b10Var;
                break;
        }
        return new s4.b1(ep0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        fp0 fp0Var = this.e;
        ArrayList arrayList = fp0Var.f37398l0;
        int i10 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i10 == 10) {
            fp0Var.F = view;
            view.post(new vo0(fp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            to0 to0Var = (to0) view;
            int b10 = b1Var.b() - fp0Var.f37386b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                to0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = fp0Var.f37403r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20567id) && ((tL_peerColorCollectible2 = fp0Var.f37404s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20567id)) {
                    z10 = false;
                }
                to0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            yh.g1 g1Var = (yh.g1) view;
            int b11 = b1Var.b() - fp0Var.f37386b0;
            if (fp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                g1Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = fp0Var.f37403r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20567id) && ((tL_peerColorCollectible = fp0Var.f37404s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20567id)) {
                    z10 = false;
                }
                g1Var.f(z10, false);
            }
        }
    }
}
