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
public final class wb implements org.telegram.ui.Components.wl0 {
    public final int f42521a = 1;
    public final long f42522b;
    public final Context f42523c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f42524f;

    public wb(cc ccVar, Context context, long j10, org.telegram.ui.ActionBar.d6 d6Var, p91 p91Var) {
        this.d = ccVar;
        this.f42523c = context;
        this.f42522b = j10;
        this.e = d6Var;
        this.f42524f = p91Var;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f42521a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                p91 p91Var = (p91) this.f42524f;
                boolean z10 = view instanceof zg.b;
                long j10 = this.f42522b;
                boolean z11 = false;
                if (z10) {
                    zg.b bVar = (zg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        ai.md.f1(this.f42523c, ccVar.f35921b, j10, boost, d6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(p91Var.getParentActivity(), p91Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f32591b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f32591b.setSingleLine(false);
                                ybVar.f32591b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(p91Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                p91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ccVar.J.f20273id);
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
                            new ug.b0(p91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ug.m.n(p91Var, d6Var, j10, null);
                }
                if (view instanceof zg.c) {
                    ug.m.n(p91Var, d6Var, j10, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.f35928x.get(i10)).f44288a == 9) {
                    if (ccVar.f35929y == 1) {
                        z11 = true;
                    }
                    ccVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.v70.N((org.telegram.ui.Components.v70) this.d, this.f42522b, (org.telegram.ui.ActionBar.n2) this.e, (a0.h) this.f42524f, this.f42523c, i10);
                return;
        }
    }

    public wb(org.telegram.ui.Components.v70 v70Var, long j10, org.telegram.ui.ActionBar.n2 n2Var, a0.h hVar, Context context) {
        this.d = v70Var;
        this.f42522b = j10;
        this.e = n2Var;
        this.f42524f = hVar;
        this.f42523c = context;
    }
}
