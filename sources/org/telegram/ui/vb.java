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
public final class vb implements org.telegram.ui.Components.hl0 {
    public final int f39064a = 1;
    public final long f39065b;
    public final Context f39066c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f39067f;

    public vb(cc ccVar, Context context, long j10, org.telegram.ui.ActionBar.f6 f6Var, oa1 oa1Var) {
        this.d = ccVar;
        this.f39066c = context;
        this.f39065b = j10;
        this.e = f6Var;
        this.f39067f = oa1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f39064a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                oa1 oa1Var = (oa1) this.f39067f;
                boolean z4 = view instanceof lg.b;
                long j10 = this.f39065b;
                boolean z10 = false;
                if (z4) {
                    lg.b bVar = (lg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z11 = boost.giveaway;
                    if (z11 && boost.stars > 0) {
                        lh.ja.e1(this.f39066c, ccVar.f33071b, j10, boost, f6Var);
                    } else {
                        boolean z12 = boost.gift;
                        if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z11 && boost.user_id == -1) {
                                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(oa1Var.getParentActivity(), oa1Var.getResourceProvider());
                                qbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                qbVar.f28137b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                qbVar.f28137b.setSingleLine(false);
                                qbVar.f28137b.setMaxLines(2);
                                org.telegram.ui.Components.ic.g(oa1Var, qbVar, 2750).j();
                            } else if (!z12 && !z11) {
                                oa1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ccVar.G.f19159id);
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
                            new gg.e1(oa1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.n8) {
                    gg.x.m(oa1Var, f6Var, j10, null);
                }
                if (view instanceof lg.c) {
                    gg.x.m(oa1Var, f6Var, j10, ((lg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.f33078x.get(i10)).f1830a == 9) {
                    if (ccVar.f33079y == 1) {
                        z10 = true;
                    }
                    ccVar.c(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                Context context = this.f39066c;
                org.telegram.ui.Components.d70.M((org.telegram.ui.Components.d70) this.d, this.f39065b, (org.telegram.ui.ActionBar.p2) this.e, (a0.h) this.f39067f, context, i10);
                return;
        }
    }

    public vb(org.telegram.ui.Components.d70 d70Var, long j10, org.telegram.ui.ActionBar.p2 p2Var, a0.h hVar, Context context) {
        this.d = d70Var;
        this.f39065b = j10;
        this.e = p2Var;
        this.f39067f = hVar;
        this.f39066c = context;
    }
}
