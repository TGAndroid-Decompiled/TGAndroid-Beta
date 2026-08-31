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
public final class xo0 extends org.telegram.ui.Components.sl0 {
    public final Context f43443c;
    public final int d;
    public final dp0 f43444e;

    public xo0(dp0 dp0Var, Context context, int i10) {
        this.f43444e = dp0Var;
        this.f43443c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f43444e.f36274b0;
    }

    @Override
    public final int j(int i10) {
        dp0 dp0Var = this.f43444e;
        if (i10 != dp0Var.J && i10 != dp0Var.V && i10 != dp0Var.L && i10 != dp0Var.O) {
            if (i10 == dp0Var.I) {
                return 1;
            }
            if (i10 == dp0Var.K) {
                return 3;
            }
            if (i10 == dp0Var.M) {
                return 5;
            }
            if (i10 == dp0Var.N) {
                return 6;
            }
            if (i10 == dp0Var.W) {
                return 10;
            }
            if (i10 == dp0Var.f36272a0) {
                return 11;
            }
            if (i10 == dp0Var.P) {
                return 7;
            }
            if (i10 >= dp0Var.Q && i10 < dp0Var.R) {
                if (dp0Var.C == null) {
                    return 8;
                }
                return 12;
            } else if (i10 >= dp0Var.S && i10 < dp0Var.T) {
                return 9;
            } else {
                if (i10 == dp0Var.f36274b0 - 1) {
                    return 4;
                }
            }
        }
        return 2;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        String string;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z4;
        int i16;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = m1Var.f5875a;
        dp0 dp0Var = this.f43444e;
        HashMap hashMap = dp0Var.E;
        ArrayList arrayList = dp0Var.f36276c0;
        ArrayList arrayList2 = dp0Var.D;
        ip0 ip0Var = dp0Var.f36282g0;
        int j10 = j(i10);
        int i17 = this.d;
        int i18 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                ((gp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i10 == dp0Var.J) {
                    if (i17 == 1) {
                        if (ip0Var.f37904a) {
                            i14 = R.string.ChannelColorHint;
                        } else {
                            i14 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i14);
                    } else {
                        if (ip0Var.f37904a) {
                            i12 = R.string.ChannelProfileHint;
                        } else {
                            i12 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i12);
                    }
                    a9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.jm(this, i17, 19)), true));
                    Context context = dp0Var.getContext();
                    if (dp0Var.N >= 0) {
                        i13 = R.drawable.greydivider;
                    } else {
                        i13 = R.drawable.greydivider_bottom;
                    }
                    a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(context, i13, org.telegram.ui.ActionBar.k6.f21624b7));
                    return;
                } else if (i10 == dp0Var.O) {
                    a9Var.setText("");
                    a9Var.setFixedSize(12);
                    Context context2 = dp0Var.getContext();
                    if (dp0Var.P >= 0) {
                        i11 = R.drawable.greydivider;
                    } else {
                        i11 = R.drawable.greydivider_bottom;
                    }
                    a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(context2, i11, org.telegram.ui.ActionBar.k6.f21624b7));
                    return;
                } else if (i10 == dp0Var.V) {
                    a9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(dp0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                    return;
                } else {
                    return;
                }
            case 3:
                cp0 cp0Var = (cp0) view;
                ip0 ip0Var2 = cp0Var.d.f36282g0;
                cp0Var.setBackgroundColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                cp0Var.f35887a.setTextColor(ip0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                o8Var.v();
                o8Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                o8Var.v();
                if (i10 == dp0Var.N) {
                    if (ip0Var.f37904a) {
                        i15 = R.string.ChannelProfileColorReset;
                    } else {
                        i15 = R.string.UserProfileColorReset;
                    }
                    o8Var.i(LocaleController.getString(i15), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == dp0Var.P) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                return;
            case 8:
                to0 to0Var = (to0) view;
                int i19 = i10 - dp0Var.Q;
                if (i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    to0Var.a(i19, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dp0Var.f36285s;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f21070id) || ((tL_peerColorCollectible = dp0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f21070id)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    to0Var.b(z4, false);
                    to0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                lh.f2 f2Var = (lh.f2) view;
                arrayList2.clear();
                hashMap.clear();
                i16 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                ArrayList arrayList3 = mh.t7.y(i16, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i20 = 0;
                int i21 = 0;
                while (i20 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i20);
                    if ((i17 == 0 || (i17 == i18 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (dp0Var.C == starGift) {
                            i21 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i18);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        u5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(u5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i20++;
                    i18 = 1;
                }
                f2Var.a(0, arrayList2, i21, new wo0(this, 0));
                f2Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                f2Var.b();
                return;
            case 11:
                ((bp0) view).a();
                return;
            case 12:
                lh.x1 x1Var = (lh.x1) view;
                int i22 = i10 - dp0Var.Q;
                if (dp0Var.B != null && i22 >= 0 && i22 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i22);
                    x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dp0Var.f36285s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f21070id) && ((tL_peerColorCollectible2 = dp0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f21070id)) {
                        z10 = false;
                    }
                    x1Var.e(z10, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var5;
        cp0 cp0Var;
        dp0 dp0Var = this.f43444e;
        ip0 ip0Var = dp0Var.f36282g0;
        switch (i10) {
            case 1:
                Context context = dp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                gp0 gp0Var = new gp0(this.d, i11, context, g6Var);
                dp0Var.h = gp0Var;
                gp0Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                gp0Var.a(dp0Var.f36283n, false);
                gp0Var.setOnColorClick(new wo0(this, 1));
                cp0Var = gp0Var;
                break;
            case 2:
            default:
                cp0Var = new org.telegram.ui.Cells.a9(dp0Var.getContext(), ip0Var.getResourceProvider());
                break;
            case 3:
                cp0 cp0Var2 = new cp0(dp0Var, dp0Var.getContext());
                dp0Var.f36287x = cp0Var2;
                cp0Var2.b(false);
                cp0Var = cp0Var2;
                break;
            case 4:
                View jnVar = new org.telegram.ui.Components.jn(dp0Var.getContext(), 18);
                jnVar.setBackground(org.telegram.ui.ActionBar.k6.V0(dp0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                cp0Var = jnVar;
                break;
            case 5:
                cp0Var = new org.telegram.ui.Components.jn(dp0Var.getContext(), 17);
                break;
            case 6:
                View o8Var = new org.telegram.ui.Cells.o8(dp0Var.getContext(), ip0Var.getResourceProvider());
                o8Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                cp0Var = o8Var;
                break;
            case 7:
                Context context2 = dp0Var.getContext();
                g6Var2 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, g6Var2);
                m4Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                cp0Var = m4Var;
                break;
            case 8:
                Context context3 = dp0Var.getContext();
                g6Var3 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                cp0Var = new to0(context3, g6Var3, false);
                break;
            case 9:
                Context context4 = this.f43443c;
                g6Var4 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context4, g6Var4);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(35);
                cp0Var = u00Var;
                break;
            case 10:
                View f2Var = new lh.f2(dp0Var.getContext(), false);
                f2Var.setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                cp0Var = f2Var;
                break;
            case 11:
                cp0Var = new bp0(dp0Var, dp0Var.getContext());
                break;
            case 12:
                Context context5 = dp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                g6Var5 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
                cp0Var = new lh.x1(context5, i12, g6Var5);
                break;
        }
        return new f2.m1(cp0Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        dp0 dp0Var = this.f43444e;
        ArrayList arrayList = dp0Var.f36276c0;
        int i10 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z4 = true;
        if (i10 == 8) {
            to0 to0Var = (to0) view;
            int b10 = m1Var.b() - dp0Var.Q;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                to0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = dp0Var.f36285s;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f21070id) && ((tL_peerColorCollectible2 = dp0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f21070id)) {
                    z4 = false;
                }
                to0Var.b(z4, false);
            }
        } else if (i10 == 12) {
            lh.x1 x1Var = (lh.x1) view;
            int b11 = m1Var.b() - dp0Var.Q;
            if (dp0Var.B != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = dp0Var.f36285s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f21070id) && ((tL_peerColorCollectible = dp0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f21070id)) {
                    z4 = false;
                }
                x1Var.e(z4, false);
            }
        }
    }
}
