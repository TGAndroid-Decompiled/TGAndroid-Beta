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
public final class wo0 extends org.telegram.ui.Components.hm0 {
    public final Context f42902c;
    public final int d;
    public final dp0 e;

    public wo0(dp0 dp0Var, Context context, int i10) {
        this.e = dp0Var;
        this.f42902c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45941f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f36256k0;
    }

    @Override
    public final int j(int i10) {
        dp0 dp0Var = this.e;
        if (i10 == dp0Var.R || i10 == dp0Var.f36252g0 || i10 == dp0Var.T || i10 == dp0Var.W) {
            return 2;
        }
        if (i10 == dp0Var.Q) {
            return 1;
        }
        if (i10 == dp0Var.S) {
            return 3;
        }
        if (i10 == dp0Var.U) {
            return 5;
        }
        if (i10 == dp0Var.V) {
            return 6;
        }
        if (i10 == dp0Var.f36253h0) {
            return 10;
        }
        if (i10 == dp0Var.f36254i0) {
            return 11;
        }
        if (i10 == dp0Var.f36243a0) {
            return 7;
        }
        if (i10 >= dp0Var.f36245b0 && i10 < dp0Var.f36247c0) {
            if (dp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= dp0Var.f36248d0 && i10 < dp0Var.f36249e0) {
            return 9;
        } else {
            if (i10 != dp0Var.f36256k0 - 1 && i10 != dp0Var.f36255j0) {
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
        View view = b1Var.f45938a;
        dp0 dp0Var = this.e;
        HashMap hashMap = dp0Var.M;
        ArrayList arrayList = dp0Var.f36257l0;
        ArrayList arrayList2 = dp0Var.L;
        jp0 jp0Var = dp0Var.f36261p0;
        int j10 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                ((gp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                if (i10 == dp0Var.R) {
                    if (i15 == 1) {
                        if (jp0Var.f38239a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (jp0Var.f38239a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    d9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.e2(this, i15, 23)), true));
                    return;
                } else if (i10 == dp0Var.W) {
                    d9Var.setText("");
                    d9Var.setFixedSize(12);
                    return;
                } else if (i10 == dp0Var.f36252g0) {
                    d9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                cp0 cp0Var = (cp0) view;
                jp0 jp0Var2 = cp0Var.d.f36261p0;
                cp0Var.setBackgroundColor(jp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                cp0Var.f35969a.setTextColor(jp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.v();
                q8Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                q8Var.v();
                if (i10 == dp0Var.V) {
                    if (jp0Var.f38239a) {
                        i13 = R.string.ChannelProfileColorReset;
                    } else {
                        i13 = R.string.UserProfileColorReset;
                    }
                    q8Var.i(LocaleController.getString(i13), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == dp0Var.f36243a0) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                l4Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                return;
            case 8:
                ro0 ro0Var = (ro0) view;
                int i17 = i10 - dp0Var.f36245b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    ro0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dp0Var.f36262r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20496id) || ((tL_peerColorCollectible = dp0Var.f36263s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20496id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ro0Var.b(z10, false);
                    ro0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                dp0Var.F = view;
                ip0 ip0Var = dp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                ArrayList arrayList3 = ai.fa.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (dp0Var.K == starGift) {
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
                vo0 vo0Var = new vo0(this, 0);
                ArrayList arrayList4 = ip0Var.f37947f;
                if (ip0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ip0Var.K = 0;
                ip0Var.h = vo0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                ip0Var.f37946c.l();
                ip0Var.a(i19, z11);
                dp0Var.l(ip0Var);
                view.post(new to0(dp0Var, 3));
                return;
            case 11:
                ((bp0) view).a();
                return;
            case 12:
                yh.h1 h1Var = (yh.h1) view;
                int i20 = i10 - dp0Var.f36245b0;
                if (dp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dp0Var.f36262r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20496id) && ((tL_peerColorCollectible2 = dp0Var.f36263s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20496id)) {
                        z12 = false;
                    }
                    h1Var.e(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.Components.b10 b10Var;
        cp0 cp0Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        dp0 dp0Var = this.e;
        jp0 jp0Var = dp0Var.f36261p0;
        switch (i10) {
            case 1:
                Context context = dp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                gp0 gp0Var = new gp0(this.d, i11, context, d6Var);
                dp0Var.f36250f = gp0Var;
                gp0Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                gp0Var.a(dp0Var.h, false);
                gp0Var.setOnColorClick(new vo0(this, 1));
                cp0Var = gp0Var;
                break;
            case 2:
            default:
                cp0Var = new org.telegram.ui.Cells.d9(dp0Var.getContext(), jp0Var.getResourceProvider());
                break;
            case 3:
                cp0 cp0Var2 = new cp0(dp0Var, dp0Var.getContext());
                dp0Var.f36266y = cp0Var2;
                cp0Var2.b(false);
                cp0Var = cp0Var2;
                break;
            case 4:
                View unVar = new org.telegram.ui.Components.un(dp0Var.getContext(), 20);
                unVar.setTag(-33024);
                b10Var = unVar;
                cp0Var = b10Var;
                break;
            case 5:
                View view = new View(dp0Var.getContext());
                view.setTag(-33024);
                b10Var = view;
                cp0Var = b10Var;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(dp0Var.getContext(), jp0Var.getResourceProvider());
                q8Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                cp0Var = q8Var;
                break;
            case 7:
                Context context2 = dp0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, d6Var2);
                l4Var.setBackgroundColor(jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                cp0Var = l4Var;
                break;
            case 8:
                Context context3 = dp0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                View ro0Var = new ro0(context3, d6Var3, false);
                ro0Var.setTag(-33024);
                b10Var = ro0Var;
                cp0Var = b10Var;
                break;
            case 9:
                Context context4 = this.f42902c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                org.telegram.ui.Components.b10 b10Var2 = new org.telegram.ui.Components.b10(context4, d6Var4);
                b10Var2.setIsSingleCell(true);
                b10Var2.setViewType(35);
                b10Var2.setTag(-33024);
                b10Var = b10Var2;
                cp0Var = b10Var;
                break;
            case 10:
                View unVar2 = new org.telegram.ui.Components.un(dp0Var.getContext(), 21);
                unVar2.setTag(-33024);
                b10Var = unVar2;
                cp0Var = b10Var;
                break;
            case 11:
                cp0Var = new bp0(dp0Var, dp0Var.getContext());
                break;
            case 12:
                Context context5 = dp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) jp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) jp0Var).resourceProvider;
                View h1Var = new yh.h1(context5, i12, d6Var5);
                h1Var.setTag(-33024);
                b10Var = h1Var;
                cp0Var = b10Var;
                break;
        }
        return new s4.b1(cp0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        dp0 dp0Var = this.e;
        ArrayList arrayList = dp0Var.f36257l0;
        int i10 = b1Var.f45941f;
        View view = b1Var.f45938a;
        if (i10 == 10) {
            dp0Var.F = view;
            view.post(new to0(dp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            ro0 ro0Var = (ro0) view;
            int b10 = b1Var.b() - dp0Var.f36245b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ro0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dp0Var.f36262r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20496id) && ((tL_peerColorCollectible2 = dp0Var.f36263s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20496id)) {
                    z10 = false;
                }
                ro0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            yh.h1 h1Var = (yh.h1) view;
            int b11 = b1Var.b() - dp0Var.f36245b0;
            if (dp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dp0Var.f36262r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20496id) && ((tL_peerColorCollectible = dp0Var.f36263s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20496id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
