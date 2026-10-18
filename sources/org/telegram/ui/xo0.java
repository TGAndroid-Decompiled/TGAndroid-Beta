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
public final class xo0 extends org.telegram.ui.Components.hm0 {
    public final Context f43211c;
    public final int d;
    public final ep0 e;

    public xo0(ep0 ep0Var, Context context, int i10) {
        this.e = ep0Var;
        this.f43211c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f36578k0;
    }

    @Override
    public final int j(int i10) {
        ep0 ep0Var = this.e;
        if (i10 == ep0Var.R || i10 == ep0Var.f36574g0 || i10 == ep0Var.T || i10 == ep0Var.W) {
            return 2;
        }
        if (i10 == ep0Var.Q) {
            return 1;
        }
        if (i10 == ep0Var.S) {
            return 3;
        }
        if (i10 == ep0Var.U) {
            return 5;
        }
        if (i10 == ep0Var.V) {
            return 6;
        }
        if (i10 == ep0Var.f36575h0) {
            return 10;
        }
        if (i10 == ep0Var.f36576i0) {
            return 11;
        }
        if (i10 == ep0Var.f36565a0) {
            return 7;
        }
        if (i10 >= ep0Var.f36567b0 && i10 < ep0Var.f36569c0) {
            if (ep0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= ep0Var.f36570d0 && i10 < ep0Var.f36571e0) {
            return 9;
        } else {
            if (i10 != ep0Var.f36578k0 - 1 && i10 != ep0Var.f36577j0) {
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
        View view = b1Var.f45910a;
        ep0 ep0Var = this.e;
        HashMap hashMap = ep0Var.M;
        ArrayList arrayList = ep0Var.f36579l0;
        ArrayList arrayList2 = ep0Var.L;
        kp0 kp0Var = ep0Var.f36583p0;
        int j10 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                ((hp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                if (i10 == ep0Var.R) {
                    if (i15 == 1) {
                        if (kp0Var.f38593a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (kp0Var.f38593a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    d9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.e2(this, i15, 23)), true));
                    return;
                } else if (i10 == ep0Var.W) {
                    d9Var.setText("");
                    d9Var.setFixedSize(12);
                    return;
                } else if (i10 == ep0Var.f36574g0) {
                    d9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                dp0 dp0Var = (dp0) view;
                kp0 kp0Var2 = dp0Var.d.f36583p0;
                dp0Var.setBackgroundColor(kp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                dp0Var.f36226a.setTextColor(kp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                q8Var.v();
                q8Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                q8Var.v();
                if (i10 == ep0Var.V) {
                    if (kp0Var.f38593a) {
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
                if (i10 == ep0Var.f36565a0) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                l4Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                return;
            case 8:
                so0 so0Var = (so0) view;
                int i17 = i10 - ep0Var.f36567b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    so0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = ep0Var.f36584r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20496id) || ((tL_peerColorCollectible = ep0Var.f36585s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20496id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    so0Var.b(z10, false);
                    so0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                ep0Var.F = view;
                jp0 jp0Var = ep0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                ArrayList arrayList3 = ai.ga.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (ep0Var.K == starGift) {
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
                wo0 wo0Var = new wo0(this, 0);
                ArrayList arrayList4 = jp0Var.f38246f;
                if (jp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                jp0Var.K = 0;
                jp0Var.h = wo0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                jp0Var.f38245c.l();
                jp0Var.a(i19, z11);
                ep0Var.l(jp0Var);
                view.post(new uo0(ep0Var, 3));
                return;
            case 11:
                ((cp0) view).a();
                return;
            case 12:
                yh.g1 g1Var = (yh.g1) view;
                int i20 = i10 - ep0Var.f36567b0;
                if (ep0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    g1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = ep0Var.f36584r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20496id) && ((tL_peerColorCollectible2 = ep0Var.f36585s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20496id)) {
                        z12 = false;
                    }
                    g1Var.e(z12, false);
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
        dp0 dp0Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        ep0 ep0Var = this.e;
        kp0 kp0Var = ep0Var.f36583p0;
        switch (i10) {
            case 1:
                Context context = ep0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                hp0 hp0Var = new hp0(this.d, i11, context, d6Var);
                ep0Var.f36572f = hp0Var;
                hp0Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                hp0Var.a(ep0Var.h, false);
                hp0Var.setOnColorClick(new wo0(this, 1));
                dp0Var = hp0Var;
                break;
            case 2:
            default:
                dp0Var = new org.telegram.ui.Cells.d9(ep0Var.getContext(), kp0Var.getResourceProvider());
                break;
            case 3:
                dp0 dp0Var2 = new dp0(ep0Var, ep0Var.getContext());
                ep0Var.f36588y = dp0Var2;
                dp0Var2.b(false);
                dp0Var = dp0Var2;
                break;
            case 4:
                View unVar = new org.telegram.ui.Components.un(ep0Var.getContext(), 20);
                unVar.setTag(-33024);
                b10Var = unVar;
                dp0Var = b10Var;
                break;
            case 5:
                View view = new View(ep0Var.getContext());
                view.setTag(-33024);
                b10Var = view;
                dp0Var = b10Var;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(ep0Var.getContext(), kp0Var.getResourceProvider());
                q8Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                dp0Var = q8Var;
                break;
            case 7:
                Context context2 = ep0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, d6Var2);
                l4Var.setBackgroundColor(kp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                dp0Var = l4Var;
                break;
            case 8:
                Context context3 = ep0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                View so0Var = new so0(context3, d6Var3, false);
                so0Var.setTag(-33024);
                b10Var = so0Var;
                dp0Var = b10Var;
                break;
            case 9:
                Context context4 = this.f43211c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                org.telegram.ui.Components.b10 b10Var2 = new org.telegram.ui.Components.b10(context4, d6Var4);
                b10Var2.setIsSingleCell(true);
                b10Var2.setViewType(35);
                b10Var2.setTag(-33024);
                b10Var = b10Var2;
                dp0Var = b10Var;
                break;
            case 10:
                View unVar2 = new org.telegram.ui.Components.un(ep0Var.getContext(), 21);
                unVar2.setTag(-33024);
                b10Var = unVar2;
                dp0Var = b10Var;
                break;
            case 11:
                dp0Var = new cp0(ep0Var, ep0Var.getContext());
                break;
            case 12:
                Context context5 = ep0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) kp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) kp0Var).resourceProvider;
                View g1Var = new yh.g1(context5, i12, d6Var5);
                g1Var.setTag(-33024);
                b10Var = g1Var;
                dp0Var = b10Var;
                break;
        }
        return new s4.b1(dp0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        ep0 ep0Var = this.e;
        ArrayList arrayList = ep0Var.f36579l0;
        int i10 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i10 == 10) {
            ep0Var.F = view;
            view.post(new uo0(ep0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            so0 so0Var = (so0) view;
            int b10 = b1Var.b() - ep0Var.f36567b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                so0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = ep0Var.f36584r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20496id) && ((tL_peerColorCollectible2 = ep0Var.f36585s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20496id)) {
                    z10 = false;
                }
                so0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            yh.g1 g1Var = (yh.g1) view;
            int b11 = b1Var.b() - ep0Var.f36567b0;
            if (ep0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                g1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = ep0Var.f36584r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20496id) && ((tL_peerColorCollectible = ep0Var.f36585s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20496id)) {
                    z10 = false;
                }
                g1Var.e(z10, false);
            }
        }
    }
}
