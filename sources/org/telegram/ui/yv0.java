package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class yv0 extends org.telegram.ui.Components.yk0 {

    public final PremiumPreviewFragment f44953c;

    public yv0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f44953c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 1 || i10 == 8;
    }

    @Override
    public final int h() {
        return this.f44953c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.f44953c;
        if (i10 >= premiumPreviewFragment.f35859n && i10 < premiumPreviewFragment.f35864r) {
            return 1;
        }
        if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f35871w) {
            return 1;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == premiumPreviewFragment.f35872x || i10 == premiumPreviewFragment.f35873y || i10 == premiumPreviewFragment.A || i10 == premiumPreviewFragment.D) {
            return 5;
        }
        if (i10 == premiumPreviewFragment.B) {
            return 6;
        }
        if (i10 == premiumPreviewFragment.f35866s || i10 == premiumPreviewFragment.C) {
            return 7;
        }
        return i10 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String strSubstring;
        String str;
        int i11;
        View view = o1Var.f5789a;
        PremiumPreviewFragment premiumPreviewFragment = this.f44953c;
        boolean z10 = premiumPreviewFragment.f35848d0;
        int i12 = premiumPreviewFragment.f35859n;
        boolean z11 = true;
        boolean z12 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.f35864r) {
            ((rv0) view).a((gw0) premiumPreviewFragment.f35844b.get(i10 - i12), i10 != premiumPreviewFragment.f35864r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.v;
        if (i10 >= i13 && i10 < premiumPreviewFragment.f35871w) {
            ((rv0) view).a((gw0) premiumPreviewFragment.f35846c.get(i10 - i13), i10 != premiumPreviewFragment.f35871w - 1);
            return;
        }
        String str2 = "";
        if (i10 == premiumPreviewFragment.f35872x) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setText("");
            x8Var.setFixedSize(12);
            return;
        }
        if (i10 != premiumPreviewFragment.f35873y && i10 != premiumPreviewFragment.A && i10 != premiumPreviewFragment.D) {
            if (i10 == premiumPreviewFragment.f35866s) {
                ((org.telegram.ui.Cells.j4) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i10 == premiumPreviewFragment.C) {
                ((org.telegram.ui.Cells.j4) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    z11 = false;
                }
                l8Var.j(string, z11, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
        if (!z10) {
            x8Var2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
            x8Var2.getTextView().setLinkTextColor(-1);
            x8Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.15f, -1)));
        }
        x8Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.D) {
            x8Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new zk0(this, 24)), true));
            return;
        }
        int i14 = premiumPreviewFragment.f35873y;
        if (i10 == i14 && premiumPreviewFragment.f35847c0 == 1) {
            x8Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i10 != i14 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.yz0[] yz0VarArr = (org.telegram.ui.Components.yz0[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.yz0.class);
        int length = yz0VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.xz0 xz0Var = yz0VarArr[i15].f35101b;
            TLRPC.MessageEntity messageEntity = xz0Var.d;
            if (messageEntity != null) {
                String str3 = premiumPromo.status_text;
                int i16 = messageEntity.offset;
                strSubstring = TextUtils.substring(str3, i16, messageEntity.length + i16);
            } else {
                strSubstring = null;
            }
            TLRPC.MessageEntity messageEntity2 = xz0Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.o41(strSubstring, 0, xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str = str2;
                    i11 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.r41(strSubstring, xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.t41(s3.c.e("mailto:", strSubstring), xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (strSubstring.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.p41(strSubstring, xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.p41("http://".concat(strSubstring), xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.r41(s3.c.e("card:", strSubstring), xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String strD = oe.b.d(strSubstring, z12);
                    if (strSubstring.startsWith("+")) {
                        strD = s3.c.e("+", strD);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.p41(s3.c.e("tel:", strD), xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                        org.telegram.ui.Components.t41 t41Var = new org.telegram.ui.Components.t41(xz0Var.d.url, xz0Var);
                        t41Var.f32652b = true;
                        spannableString.setSpan(t41Var, xz0Var.f34735b, xz0Var.f34736c, 33);
                        if (!z10) {
                            spannableString.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), xz0Var.f34735b, xz0Var.f34736c, 33);
                        }
                    } else {
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                            StringBuilder sb2 = new StringBuilder(str2);
                            str = str2;
                            sb2.append(((TLRPC.TL_messageEntityMentionName) xz0Var.d).user_id);
                            spannableString.setSpan(new org.telegram.ui.Components.u41(sb2.toString(), 0, xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                        } else {
                            str = str2;
                            if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                spannableString.setSpan(new org.telegram.ui.Components.u41(str + ((TLRPC.TL_inputMessageEntityMentionName) xz0Var.d).user_id.user_id, 0, xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                            } else if ((xz0Var.f34734a & 4) != 0) {
                                str = str;
                                i11 = 33;
                                spannableString.setSpan(new org.telegram.ui.Components.q41(spannableString, xz0Var.f34735b, xz0Var.f34736c, (byte) 0, xz0Var), xz0Var.f34735b, xz0Var.f34736c, 33);
                            } else {
                                str = str;
                                spannableString.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), xz0Var.f34735b, xz0Var.f34736c, 33);
                            }
                        }
                        i11 = 33;
                    }
                    i15++;
                    str2 = str;
                    z12 = false;
                }
                if ((xz0Var.f34734a & 256) != 0) {
                    spannableString.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), xz0Var.f34735b, xz0Var.f34736c, i11);
                }
                i15++;
                str2 = str;
                z12 = false;
            }
            str = str2;
            i11 = 33;
            if ((xz0Var.f34734a & 256) != 0) {
                spannableString.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), xz0Var.f34735b, xz0Var.f34736c, i11);
            }
            i15++;
            str2 = str;
            z12 = false;
        }
        x8Var2.setText(spannableString);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w2Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                w2Var = new ag.w2(this, context);
                break;
            case 2:
                w2Var = new org.telegram.ui.Cells.w6(context, 0, 0);
                break;
            case 3:
            default:
                w2Var = new aj0(this, context, 4);
                w2Var.setTag(-33024);
                break;
            case 4:
                w2Var = new ag.a(context);
                break;
            case 5:
                w2Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 6:
                w2Var = new View(context);
                w2Var.setTag(-33024);
                break;
            case 7:
                w2Var = new org.telegram.ui.Cells.j4(context);
                break;
            case 8:
                w2Var = new org.telegram.ui.Cells.l8(23, context, ((org.telegram.ui.ActionBar.n2) this.f44953c).resourceProvider, false, true);
                break;
        }
        return org.telegram.ui.Cells.pa.l(w2Var, w2Var, -1, -2);
    }
}
