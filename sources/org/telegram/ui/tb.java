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
public final class tb implements org.telegram.ui.Components.jl0 {
    public final int f41563a = 1;
    public final long f41564b;
    public final Context f41565c;
    public final KeyEvent.Callback d;
    public final Object f41566e;
    public final Object f41567f;

    public tb(ac acVar, Context context, long j10, org.telegram.ui.ActionBar.g6 g6Var, ha1 ha1Var) {
        this.d = acVar;
        this.f41565c = context;
        this.f41564b = j10;
        this.f41566e = g6Var;
        this.f41567f = ha1Var;
    }

    @Override
    public final void f(int i10, View view) {
        switch (this.f41563a) {
            case 0:
                ac acVar = (ac) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f41566e;
                ha1 ha1Var = (ha1) this.f41567f;
                boolean z4 = view instanceof mg.b;
                long j10 = this.f41564b;
                boolean z10 = false;
                if (z4) {
                    mg.b bVar = (mg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z11 = boost.giveaway;
                    if (z11 && boost.stars > 0) {
                        mh.ja.e1(this.f41565c, acVar.f35119b, j10, boost, g6Var);
                    } else {
                        boolean z12 = boost.gift;
                        if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z11 && boost.user_id == -1) {
                                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(ha1Var.getParentActivity(), ha1Var.getResourceProvider());
                                qbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                qbVar.f30359b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                qbVar.f30359b.setSingleLine(false);
                                qbVar.f30359b.setMaxLines(2);
                                org.telegram.ui.Components.ic.g(ha1Var, qbVar, 2750).j();
                            } else if (!z12 && !z11) {
                                ha1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-acVar.G.f20843id);
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
                            new hg.e1(ha1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.o8) {
                    hg.x.m(ha1Var, g6Var, j10, null);
                }
                if (view instanceof mg.c) {
                    hg.x.m(ha1Var, g6Var, j10, ((mg.c) view).getPrepaidGiveaway());
                }
                if (((zb) acVar.f35127x.get(i10)).f2505a == 9) {
                    if (acVar.f35128y == 1) {
                        z10 = true;
                    }
                    acVar.c(Boolean.valueOf(z10));
                    return;
                }
                return;
            default:
                Context context = this.f41565c;
                org.telegram.ui.Components.e70.M((org.telegram.ui.Components.e70) this.d, this.f41564b, (org.telegram.ui.ActionBar.p2) this.f41566e, (a0.h) this.f41567f, context, i10);
                return;
        }
    }

    public tb(org.telegram.ui.Components.e70 e70Var, long j10, org.telegram.ui.ActionBar.p2 p2Var, a0.h hVar, Context context) {
        this.d = e70Var;
        this.f41564b = j10;
        this.f41566e = p2Var;
        this.f41567f = hVar;
        this.f41565c = context;
    }
}
