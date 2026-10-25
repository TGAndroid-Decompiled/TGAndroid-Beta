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
public final class xb implements org.telegram.ui.Components.zl0 {
    public final int f45712a = 1;
    public final long f45713b;
    public final Context f45714c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f45715f;

    public xb(dc dcVar, Context context, long j10, org.telegram.ui.ActionBar.u6 u6Var, w91 w91Var) {
        this.d = dcVar;
        this.f45714c = context;
        this.f45713b = j10;
        this.e = u6Var;
        this.f45715f = w91Var;
    }

    @Override
    public final void c(int i10, View view) {
        switch (this.f45712a) {
            case 0:
                dc dcVar = (dc) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
                w91 w91Var = (w91) this.f45715f;
                boolean z10 = view instanceof ah.b;
                long j10 = this.f45713b;
                boolean z11 = false;
                if (z10) {
                    ah.b bVar = (ah.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        bi.dd.d1(this.f45714c, dcVar.f38825b, j10, boost, u6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(w91Var.getParentActivity(), w91Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f34998b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f34998b.setSingleLine(false);
                                ybVar.f34998b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(w91Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                w91Var.presentFragment(ProfileActivity.t4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-dcVar.I.f22027id);
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
                            new vg.c0(w91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.v8) {
                    vg.n.m(w91Var, u6Var, j10, null);
                }
                if (view instanceof ah.c) {
                    vg.n.m(w91Var, u6Var, j10, ((ah.c) view).getPrepaidGiveaway());
                }
                if (((cc) dcVar.f38832x.get(i10)).f47037a == 9) {
                    if (dcVar.f38833y == 1) {
                        z11 = true;
                    }
                    dcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.y70.M((org.telegram.ui.Components.y70) this.d, this.f45713b, (org.telegram.ui.ActionBar.r2) this.e, (a0.h) this.f45715f, this.f45714c, i10);
                return;
        }
    }

    public xb(org.telegram.ui.Components.y70 y70Var, long j10, org.telegram.ui.ActionBar.r2 r2Var, a0.h hVar, Context context) {
        this.d = y70Var;
        this.f45713b = j10;
        this.e = r2Var;
        this.f45715f = hVar;
        this.f45714c = context;
    }
}
