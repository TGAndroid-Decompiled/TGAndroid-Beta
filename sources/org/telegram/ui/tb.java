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
public final class tb implements org.telegram.ui.Components.il0 {
    public final int f38629a = 1;
    public final long f38630b;
    public final Context f38631c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f38632f;

    public tb(bc bcVar, Context context, long j10, org.telegram.ui.ActionBar.f6 f6Var, ga1 ga1Var) {
        this.d = bcVar;
        this.f38631c = context;
        this.f38630b = j10;
        this.e = f6Var;
        this.f38632f = ga1Var;
    }

    @Override
    public final void f(int i10, View view) {
        switch (this.f38629a) {
            case 0:
                bc bcVar = (bc) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                ga1 ga1Var = (ga1) this.f38632f;
                boolean z4 = view instanceof lg.b;
                long j10 = this.f38630b;
                boolean z10 = false;
                if (z4) {
                    lg.b bVar = (lg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z11 = boost.giveaway;
                    if (z11 && boost.stars > 0) {
                        lh.ja.e1(this.f38631c, bcVar.f32895b, j10, boost, f6Var);
                    } else {
                        boolean z12 = boost.gift;
                        if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z11 && boost.user_id == -1) {
                                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(ga1Var.getParentActivity(), ga1Var.getResourceProvider());
                                qbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                qbVar.f28100b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                qbVar.f28100b.setSingleLine(false);
                                qbVar.f28100b.setMaxLines(2);
                                org.telegram.ui.Components.ic.g(ga1Var, qbVar, 2750).j();
                            } else if (!z12 && !z11) {
                                ga1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-bcVar.G.f19184id);
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
                            new gg.e1(ga1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.o8) {
                    gg.x.m(ga1Var, f6Var, j10, null);
                }
                if (view instanceof lg.c) {
                    gg.x.m(ga1Var, f6Var, j10, ((lg.c) view).getPrepaidGiveaway());
                }
                if (((ac) bcVar.f32902x.get(i10)).f1808a == 9) {
                    if (bcVar.f32903y == 1) {
                        z10 = true;
                    }
                    bcVar.c(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                Context context = this.f38631c;
                org.telegram.ui.Components.c70.M((org.telegram.ui.Components.c70) this.d, this.f38630b, (org.telegram.ui.ActionBar.p2) this.e, (a0.h) this.f38632f, context, i10);
                return;
        }
    }

    public tb(org.telegram.ui.Components.c70 c70Var, long j10, org.telegram.ui.ActionBar.p2 p2Var, a0.h hVar, Context context) {
        this.d = c70Var;
        this.f38630b = j10;
        this.e = p2Var;
        this.f38632f = hVar;
        this.f38631c = context;
    }
}
