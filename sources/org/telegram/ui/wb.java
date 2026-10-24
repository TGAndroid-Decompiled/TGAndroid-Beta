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
public final class wb implements org.telegram.ui.Components.zl0 {
    public final int f42974a = 1;
    public final long f42975b;
    public final Context f42976c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f42977f;

    public wb(cc ccVar, Context context, long j10, org.telegram.ui.ActionBar.g6 g6Var, t91 t91Var) {
        this.d = ccVar;
        this.f42976c = context;
        this.f42975b = j10;
        this.e = g6Var;
        this.f42977f = t91Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f42974a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                t91 t91Var = (t91) this.f42977f;
                boolean z10 = view instanceof zg.b;
                long j10 = this.f42975b;
                boolean z11 = false;
                if (z10) {
                    zg.b bVar = (zg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        ai.nd.f1(this.f42976c, ccVar.f36294b, j10, boost, g6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(t91Var.getParentActivity(), t91Var.getResourceProvider());
                                wbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                wbVar.f32176b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                wbVar.f32176b.setSingleLine(false);
                                wbVar.f32176b.setMaxLines(2);
                                org.telegram.ui.Components.oc.g(t91Var, wbVar, 2750).j();
                            } else if (!z13 && !z12) {
                                t91Var.presentFragment(ProfileActivity.o4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ccVar.J.f20344id);
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
                            new ug.a0(t91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ug.l.m(t91Var, g6Var, j10, null);
                }
                if (view instanceof zg.c) {
                    ug.l.m(t91Var, g6Var, j10, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.f36301x.get(i10)).f44712a == 9) {
                    if (ccVar.f36302y == 1) {
                        z11 = true;
                    }
                    ccVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.v70.M((org.telegram.ui.Components.v70) this.d, this.f42975b, (org.telegram.ui.ActionBar.o2) this.e, (a0.h) this.f42977f, this.f42976c, i10);
                return;
        }
    }

    public wb(org.telegram.ui.Components.v70 v70Var, long j10, org.telegram.ui.ActionBar.o2 o2Var, a0.h hVar, Context context) {
        this.d = v70Var;
        this.f42975b = j10;
        this.e = o2Var;
        this.f42977f = hVar;
        this.f42976c = context;
    }
}
