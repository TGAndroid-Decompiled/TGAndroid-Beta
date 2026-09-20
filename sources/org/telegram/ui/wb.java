package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wb implements org.telegram.ui.Components.jl0 {
    public final int f38789a = 1;
    public final long f38790b;
    public final Context f38791c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f38792f;

    public wb(dc dcVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, bb1 bb1Var) {
        this.d = dcVar;
        this.f38791c = context;
        this.f38790b = j3;
        this.e = f6Var;
        this.f38792f = bb1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f38789a) {
            case 0:
                dc dcVar = (dc) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                bb1 bb1Var = (bb1) this.f38792f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f38790b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.w7.e1(this.f38791c, dcVar.f33000b, j3, boost, f6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(bb1Var.getParentActivity(), bb1Var.getResourceProvider());
                                xbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                xbVar.f30222b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                xbVar.f30222b.setSingleLine(false);
                                xbVar.f30222b.setMaxLines(2);
                                org.telegram.ui.Components.pc.g(bb1Var, xbVar, 2750).j();
                            } else if (!z13 && !z12) {
                                bb1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-dcVar.J.f18328id);
                            int i11 = boost.date;
                            tL_payments_checkedGiftCode.date = i11;
                            tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                            int i12 = boost.expires - i11;
                            tL_payments_checkedGiftCode.days = i12 / 86400;
                            tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                            if (boost.unclaimed) {
                                tL_payments_checkedGiftCode.to_id = -1L;
                                tL_payments_checkedGiftCode.flags = -1;
                            } else {
                                tL_payments_checkedGiftCode.boost = boost;
                            }
                            new tg.c0(bb1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.s8) {
                    tg.m.m(bb1Var, f6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.m(bb1Var, f6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((cc) dcVar.f33007x.get(i10)).f15704a == 9) {
                    if (dcVar.f33008y == 1) {
                        z11 = true;
                    }
                    dcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f38791c;
                org.telegram.ui.Components.j70.M((org.telegram.ui.Components.j70) this.d, this.f38790b, (org.telegram.ui.ActionBar.n2) this.e, (a0.i) this.f38792f, context, i10);
                return;
        }
    }

    public wb(org.telegram.ui.Components.j70 j70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = j70Var;
        this.f38790b = j3;
        this.e = n2Var;
        this.f38792f = iVar;
        this.f38791c = context;
    }
}
