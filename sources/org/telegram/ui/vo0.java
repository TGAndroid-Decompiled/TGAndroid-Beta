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
public final class vo0 extends org.telegram.ui.Components.rl0 {
    public final Context f39227c;
    public final int d;
    public final bp0 e;

    public vo0(bp0 bp0Var, Context context, int i10) {
        this.e = bp0Var;
        this.f39227c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f33000b0;
    }

    @Override
    public final int j(int i10) {
        bp0 bp0Var = this.e;
        if (i10 != bp0Var.J && i10 != bp0Var.V && i10 != bp0Var.L && i10 != bp0Var.O) {
            if (i10 == bp0Var.I) {
                return 1;
            }
            if (i10 == bp0Var.K) {
                return 3;
            }
            if (i10 == bp0Var.M) {
                return 5;
            }
            if (i10 == bp0Var.N) {
                return 6;
            }
            if (i10 == bp0Var.W) {
                return 10;
            }
            if (i10 == bp0Var.f32998a0) {
                return 11;
            }
            if (i10 == bp0Var.P) {
                return 7;
            }
            if (i10 >= bp0Var.Q && i10 < bp0Var.R) {
                if (bp0Var.C == null) {
                    return 8;
                }
                return 12;
            } else if (i10 >= bp0Var.S && i10 < bp0Var.T) {
                return 9;
            } else {
                if (i10 == bp0Var.f33000b0 - 1) {
                    return 4;
                }
            }
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
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
        View view = l1Var.f5785a;
        bp0 bp0Var = this.e;
        HashMap hashMap = bp0Var.E;
        ArrayList arrayList = bp0Var.f33002c0;
        ArrayList arrayList2 = bp0Var.D;
        gp0 gp0Var = bp0Var.f33007g0;
        int j10 = j(i10);
        int i17 = this.d;
        int i18 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                ((ep0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                if (i10 == bp0Var.J) {
                    if (i17 == 1) {
                        if (gp0Var.f34653a) {
                            i14 = R.string.ChannelColorHint;
                        } else {
                            i14 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i14);
                    } else {
                        if (gp0Var.f34653a) {
                            i12 = R.string.ChannelProfileHint;
                        } else {
                            i12 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i12);
                    }
                    a9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.hm(this, i17, 19)), true));
                    Context context = bp0Var.getContext();
                    if (bp0Var.N >= 0) {
                        i13 = R.drawable.greydivider;
                    } else {
                        i13 = R.drawable.greydivider_bottom;
                    }
                    a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, i13, org.telegram.ui.ActionBar.j6.f19871b7));
                    return;
                } else if (i10 == bp0Var.O) {
                    a9Var.setText("");
                    a9Var.setFixedSize(12);
                    Context context2 = bp0Var.getContext();
                    if (bp0Var.P >= 0) {
                        i11 = R.drawable.greydivider;
                    } else {
                        i11 = R.drawable.greydivider_bottom;
                    }
                    a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context2, i11, org.telegram.ui.ActionBar.j6.f19871b7));
                    return;
                } else if (i10 == bp0Var.V) {
                    a9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(bp0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
                    return;
                } else {
                    return;
                }
            case 3:
                ap0 ap0Var = (ap0) view;
                gp0 gp0Var2 = ap0Var.d.f33007g0;
                ap0Var.setBackgroundColor(gp0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                ap0Var.f32685a.setTextColor(gp0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                o8Var.v();
                o8Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                o8Var.v();
                if (i10 == bp0Var.N) {
                    if (gp0Var.f34653a) {
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
                if (i10 == bp0Var.P) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                return;
            case 8:
                ro0 ro0Var = (ro0) view;
                int i19 = i10 - bp0Var.Q;
                if (i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    ro0Var.a(i19, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bp0Var.f33010s;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f19409id) || ((tL_peerColorCollectible = bp0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f19409id)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ro0Var.b(z4, false);
                    ro0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                kh.g2 g2Var = (kh.g2) view;
                arrayList2.clear();
                hashMap.clear();
                i16 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                ArrayList arrayList3 = lh.t7.y(i16, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i20 = 0;
                int i21 = 0;
                while (i20 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i20);
                    if ((i17 == 0 || (i17 == i18 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (bp0Var.C == starGift) {
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
                g2Var.a(0, arrayList2, i21, new uo0(this, 0));
                g2Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                g2Var.b();
                return;
            case 11:
                ((zo0) view).a();
                return;
            case 12:
                kh.x1 x1Var = (kh.x1) view;
                int i22 = i10 - bp0Var.Q;
                if (bp0Var.B != null && i22 >= 0 && i22 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i22);
                    x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = bp0Var.f33010s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f19409id) && ((tL_peerColorCollectible2 = bp0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f19409id)) {
                        z10 = false;
                    }
                    x1Var.e(z10, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var5;
        ap0 ap0Var;
        bp0 bp0Var = this.e;
        gp0 gp0Var = bp0Var.f33007g0;
        switch (i10) {
            case 1:
                Context context = bp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                ep0 ep0Var = new ep0(this.d, i11, context, f6Var);
                bp0Var.h = ep0Var;
                ep0Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                ep0Var.a(bp0Var.f33008n, false);
                ep0Var.setOnColorClick(new uo0(this, 1));
                ap0Var = ep0Var;
                break;
            case 2:
            default:
                ap0Var = new org.telegram.ui.Cells.a9(bp0Var.getContext(), gp0Var.getResourceProvider());
                break;
            case 3:
                ap0 ap0Var2 = new ap0(bp0Var, bp0Var.getContext());
                bp0Var.f33012x = ap0Var2;
                ap0Var2.b(false);
                ap0Var = ap0Var2;
                break;
            case 4:
                View hnVar = new org.telegram.ui.Components.hn(bp0Var.getContext(), 18);
                hnVar.setBackground(org.telegram.ui.ActionBar.j6.V0(bp0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
                ap0Var = hnVar;
                break;
            case 5:
                ap0Var = new org.telegram.ui.Components.hn(bp0Var.getContext(), 17);
                break;
            case 6:
                View o8Var = new org.telegram.ui.Cells.o8(bp0Var.getContext(), gp0Var.getResourceProvider());
                o8Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                ap0Var = o8Var;
                break;
            case 7:
                Context context2 = bp0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, f6Var2);
                m4Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                ap0Var = m4Var;
                break;
            case 8:
                Context context3 = bp0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                ap0Var = new ro0(context3, f6Var3, false);
                break;
            case 9:
                Context context4 = this.f39227c;
                f6Var4 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context4, f6Var4);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(35);
                ap0Var = t00Var;
                break;
            case 10:
                View g2Var = new kh.g2(bp0Var.getContext(), false);
                g2Var.setBackgroundColor(gp0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
                ap0Var = g2Var;
                break;
            case 11:
                ap0Var = new zo0(bp0Var, bp0Var.getContext());
                break;
            case 12:
                Context context5 = bp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.p2) gp0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.p2) gp0Var).resourceProvider;
                ap0Var = new kh.x1(context5, i12, f6Var5);
                break;
        }
        return new f2.l1(ap0Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        bp0 bp0Var = this.e;
        ArrayList arrayList = bp0Var.f33002c0;
        int i10 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z4 = true;
        if (i10 == 8) {
            ro0 ro0Var = (ro0) view;
            int b10 = l1Var.b() - bp0Var.Q;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ro0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = bp0Var.f33010s;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f19409id) && ((tL_peerColorCollectible2 = bp0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f19409id)) {
                    z4 = false;
                }
                ro0Var.b(z4, false);
            }
        } else if (i10 == 12) {
            kh.x1 x1Var = (kh.x1) view;
            int b11 = l1Var.b() - bp0Var.Q;
            if (bp0Var.B != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = bp0Var.f33010s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f19409id) && ((tL_peerColorCollectible = bp0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f19409id)) {
                    z4 = false;
                }
                x1Var.e(z4, false);
            }
        }
    }
}
