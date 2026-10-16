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
public final class rp0 extends org.telegram.ui.Components.lm0 {
    public final Context f39567c;
    public final int d;
    public final yp0 e;

    public rp0(yp0 yp0Var, Context context, int i10) {
        this.e = yp0Var;
        this.f39567c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f41875k0;
    }

    @Override
    public final int j(int i10) {
        yp0 yp0Var = this.e;
        if (i10 == yp0Var.R || i10 == yp0Var.f41871g0 || i10 == yp0Var.T || i10 == yp0Var.W) {
            return 2;
        }
        if (i10 == yp0Var.Q) {
            return 1;
        }
        if (i10 == yp0Var.S) {
            return 3;
        }
        if (i10 == yp0Var.U) {
            return 5;
        }
        if (i10 == yp0Var.V) {
            return 6;
        }
        if (i10 == yp0Var.f41872h0) {
            return 10;
        }
        if (i10 == yp0Var.f41873i0) {
            return 11;
        }
        if (i10 == yp0Var.f41862a0) {
            return 7;
        }
        if (i10 >= yp0Var.f41864b0 && i10 < yp0Var.f41866c0) {
            if (yp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= yp0Var.f41867d0 && i10 < yp0Var.f41868e0) {
            return 9;
        } else {
            if (i10 != yp0Var.f41875k0 - 1 && i10 != yp0Var.f41874j0) {
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
        View view = b1Var.f44838a;
        yp0 yp0Var = this.e;
        HashMap hashMap = yp0Var.M;
        ArrayList arrayList = yp0Var.f41876l0;
        ArrayList arrayList2 = yp0Var.L;
        eq0 eq0Var = yp0Var.f41880p0;
        int j10 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                ((bq0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == yp0Var.R) {
                    if (i15 == 1) {
                        if (eq0Var.f35347a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (eq0Var.f35347a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.o8(this, i15, 22)), true));
                    return;
                } else if (i10 == yp0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == yp0Var.f41871g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                xp0 xp0Var = (xp0) view;
                eq0 eq0Var2 = xp0Var.d.f41880p0;
                xp0Var.setBackgroundColor(eq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                xp0Var.f41607a.setTextColor(eq0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                r8Var.v();
                if (i10 == yp0Var.V) {
                    if (eq0Var.f35347a) {
                        i13 = R.string.ChannelProfileColorReset;
                    } else {
                        i13 = R.string.UserProfileColorReset;
                    }
                    r8Var.i(LocaleController.getString(i13), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == yp0Var.f41862a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                return;
            case 8:
                mp0 mp0Var = (mp0) view;
                int i17 = i10 - yp0Var.f41864b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    mp0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = yp0Var.f41881r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f19141id) || ((tL_peerColorCollectible = yp0Var.f41882s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f19141id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mp0Var.b(z10, false);
                    mp0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                yp0Var.F = view;
                dq0 dq0Var = yp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                ArrayList arrayList3 = zh.n5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (yp0Var.K == starGift) {
                            i19 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i16);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(starGift.getDocument(), textPaint.getFontMetricsInt());
                        b6Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(b6Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                qp0 qp0Var = new qp0(this, 0);
                ArrayList arrayList4 = dq0Var.f35121f;
                if (dq0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dq0Var.K = 0;
                dq0Var.h = qp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                dq0Var.f35120c.l();
                dq0Var.a(i19, z11);
                yp0Var.l(dq0Var);
                view.post(new op0(yp0Var, 3));
                return;
            case 11:
                ((wp0) view).a();
                return;
            case 12:
                yh.h1 h1Var = (yh.h1) view;
                int i20 = i10 - yp0Var.f41864b0;
                if (yp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = yp0Var.f41881r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f19141id) && ((tL_peerColorCollectible2 = yp0Var.f41882s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f19141id)) {
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
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.Components.f10 f10Var;
        xp0 xp0Var;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        yp0 yp0Var = this.e;
        eq0 eq0Var = yp0Var.f41880p0;
        switch (i10) {
            case 1:
                Context context = yp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                bq0 bq0Var = new bq0(this.d, i11, context, c6Var);
                yp0Var.f41869f = bq0Var;
                bq0Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                bq0Var.a(yp0Var.h, false);
                bq0Var.setOnColorClick(new qp0(this, 1));
                xp0Var = bq0Var;
                break;
            case 2:
            default:
                xp0Var = new org.telegram.ui.Cells.e9(yp0Var.getContext(), eq0Var.getResourceProvider());
                break;
            case 3:
                xp0 xp0Var2 = new xp0(yp0Var, yp0Var.getContext());
                yp0Var.f41885y = xp0Var2;
                xp0Var2.b(false);
                xp0Var = xp0Var2;
                break;
            case 4:
                View xnVar = new org.telegram.ui.Components.xn(yp0Var.getContext(), 20);
                xnVar.setTag(-33024);
                f10Var = xnVar;
                xp0Var = f10Var;
                break;
            case 5:
                View view = new View(yp0Var.getContext());
                view.setTag(-33024);
                f10Var = view;
                xp0Var = f10Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(yp0Var.getContext(), eq0Var.getResourceProvider());
                r8Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                xp0Var = r8Var;
                break;
            case 7:
                Context context2 = yp0Var.getContext();
                c6Var2 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, c6Var2);
                m4Var.setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
                xp0Var = m4Var;
                break;
            case 8:
                Context context3 = yp0Var.getContext();
                c6Var3 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                View mp0Var = new mp0(context3, c6Var3, false);
                mp0Var.setTag(-33024);
                f10Var = mp0Var;
                xp0Var = f10Var;
                break;
            case 9:
                Context context4 = this.f39567c;
                c6Var4 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                org.telegram.ui.Components.f10 f10Var2 = new org.telegram.ui.Components.f10(context4, c6Var4);
                f10Var2.setIsSingleCell(true);
                f10Var2.setViewType(35);
                f10Var2.setTag(-33024);
                f10Var = f10Var2;
                xp0Var = f10Var;
                break;
            case 10:
                View xnVar2 = new org.telegram.ui.Components.xn(yp0Var.getContext(), 21);
                xnVar2.setTag(-33024);
                f10Var = xnVar2;
                xp0Var = f10Var;
                break;
            case 11:
                xp0Var = new wp0(yp0Var, yp0Var.getContext());
                break;
            case 12:
                Context context5 = yp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                c6Var5 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                View h1Var = new yh.h1(context5, i12, c6Var5);
                h1Var.setTag(-33024);
                f10Var = h1Var;
                xp0Var = f10Var;
                break;
        }
        return new s4.b1(xp0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        yp0 yp0Var = this.e;
        ArrayList arrayList = yp0Var.f41876l0;
        int i10 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i10 == 10) {
            yp0Var.F = view;
            view.post(new op0(yp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            mp0 mp0Var = (mp0) view;
            int b10 = b1Var.b() - yp0Var.f41864b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                mp0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = yp0Var.f41881r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f19141id) && ((tL_peerColorCollectible2 = yp0Var.f41882s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f19141id)) {
                    z10 = false;
                }
                mp0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            yh.h1 h1Var = (yh.h1) view;
            int b11 = b1Var.b() - yp0Var.f41864b0;
            if (yp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = yp0Var.f41881r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f19141id) && ((tL_peerColorCollectible = yp0Var.f41882s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f19141id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
