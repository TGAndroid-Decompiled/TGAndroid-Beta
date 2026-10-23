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
public final class wb implements org.telegram.ui.Components.am0 {
    public final int f42989a = 1;
    public final long f42990b;
    public final Context f42991c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f42992f;

    public wb(cc ccVar, Context context, long j10, org.telegram.ui.ActionBar.g6 g6Var, u91 u91Var) {
        this.d = ccVar;
        this.f42991c = context;
        this.f42990b = j10;
        this.e = g6Var;
        this.f42992f = u91Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f42989a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                u91 u91Var = (u91) this.f42992f;
                boolean z10 = view instanceof zg.b;
                long j10 = this.f42990b;
                boolean z11 = false;
                if (z10) {
                    zg.b bVar = (zg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        ai.nd.f1(this.f42991c, ccVar.f36322b, j10, boost, g6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(u91Var.getParentActivity(), u91Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f32863b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f32863b.setSingleLine(false);
                                ybVar.f32863b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(u91Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                u91Var.presentFragment(ProfileActivity.o4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ccVar.J.f20343id);
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
                            new ug.a0(u91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ug.l.m(u91Var, g6Var, j10, null);
                }
                if (view instanceof zg.c) {
                    ug.l.m(u91Var, g6Var, j10, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.f36329x.get(i10)).f44713a == 9) {
                    if (ccVar.f36330y == 1) {
                        z11 = true;
                    }
                    ccVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.x70.M((org.telegram.ui.Components.x70) this.d, this.f42990b, (org.telegram.ui.ActionBar.o2) this.e, (a0.h) this.f42992f, this.f42991c, i10);
                return;
        }
    }

    public wb(org.telegram.ui.Components.x70 x70Var, long j10, org.telegram.ui.ActionBar.o2 o2Var, a0.h hVar, Context context) {
        this.d = x70Var;
        this.f42990b = j10;
        this.e = o2Var;
        this.f42992f = hVar;
        this.f42991c = context;
    }
}
