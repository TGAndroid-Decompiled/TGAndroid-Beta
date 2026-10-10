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
public final class wb implements org.telegram.ui.Components.fm0 {
    public final int f43220a = 1;
    public final long f43221b;
    public final Context f43222c;
    public final KeyEvent.Callback d;
    public final Object f43223e;
    public final Object f43224f;

    public wb(cc ccVar, Context context, long j3, org.telegram.ui.ActionBar.e6 e6Var, bb1 bb1Var) {
        this.d = ccVar;
        this.f43222c = context;
        this.f43221b = j3;
        this.f43223e = e6Var;
        this.f43224f = bb1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f43220a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f43223e;
                bb1 bb1Var = (bb1) this.f43224f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f43221b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.p7.f1(this.f43222c, ccVar.f36659b, j3, boost, e6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(bb1Var.getParentActivity(), bb1Var.getResourceProvider());
                                bcVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                bcVar.f24917b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                bcVar.f24917b.setSingleLine(false);
                                bcVar.f24917b.setMaxLines(2);
                                org.telegram.ui.Components.tc.g(bb1Var, bcVar, 2750).j();
                            } else if (!z13 && !z12) {
                                bb1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ccVar.J.f20042id);
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
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.o(bb1Var, e6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.o(bb1Var, e6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.f36667x.get(i10)).f17129a == 9) {
                    if (ccVar.f36668y == 1) {
                        z11 = true;
                    }
                    ccVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.e80.N((org.telegram.ui.Components.e80) this.d, this.f43221b, (org.telegram.ui.ActionBar.n2) this.f43223e, (a0.i) this.f43224f, this.f43222c, i10);
                return;
        }
    }

    public wb(org.telegram.ui.Components.e80 e80Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = e80Var;
        this.f43221b = j3;
        this.f43223e = n2Var;
        this.f43224f = iVar;
        this.f43222c = context;
    }
}
