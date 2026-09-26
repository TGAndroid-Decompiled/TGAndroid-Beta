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
public final class vb implements org.telegram.ui.Components.kl0 {
    public final int f38680a = 1;
    public final long f38681b;
    public final Context f38682c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f38683f;

    public vb(bc bcVar, Context context, long j3, org.telegram.ui.ActionBar.d6 d6Var, sa1 sa1Var) {
        this.d = bcVar;
        this.f38682c = context;
        this.f38681b = j3;
        this.e = d6Var;
        this.f38683f = sa1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f38680a) {
            case 0:
                bc bcVar = (bc) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                sa1 sa1Var = (sa1) this.f38683f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f38681b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.w7.e1(this.f38682c, bcVar.f32375b, j3, boost, d6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(sa1Var.getParentActivity(), sa1Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f30582b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f30582b.setSingleLine(false);
                                ybVar.f30582b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(sa1Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                sa1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-bcVar.J.f18335id);
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
                            new tg.c0(sa1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.m(sa1Var, d6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.m(sa1Var, d6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((ac) bcVar.f32382x.get(i10)).f15715a == 9) {
                    if (bcVar.f32383y == 1) {
                        z11 = true;
                    }
                    bcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f38682c;
                org.telegram.ui.Components.m70.M((org.telegram.ui.Components.m70) this.d, this.f38681b, (org.telegram.ui.ActionBar.m2) this.e, (a0.i) this.f38683f, context, i10);
                return;
        }
    }

    public vb(org.telegram.ui.Components.m70 m70Var, long j3, org.telegram.ui.ActionBar.m2 m2Var, a0.i iVar, Context context) {
        this.d = m70Var;
        this.f38681b = j3;
        this.e = m2Var;
        this.f38683f = iVar;
        this.f38682c = context;
    }
}
