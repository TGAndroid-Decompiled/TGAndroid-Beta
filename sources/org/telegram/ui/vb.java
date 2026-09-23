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
public final class vb implements org.telegram.ui.Components.al0 {
    public final int f38343a = 1;
    public final long f38344b;
    public final Context f38345c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f38346f;

    public vb(bc bcVar, Context context, long j3, org.telegram.ui.ActionBar.d6 d6Var, ra1 ra1Var) {
        this.d = bcVar;
        this.f38345c = context;
        this.f38344b = j3;
        this.e = d6Var;
        this.f38346f = ra1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f38343a) {
            case 0:
                bc bcVar = (bc) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                ra1 ra1Var = (ra1) this.f38346f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f38344b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.w7.e1(this.f38345c, bcVar.f32066b, j3, boost, d6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(ra1Var.getParentActivity(), ra1Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f30192b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f30192b.setSingleLine(false);
                                ybVar.f30192b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(ra1Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                ra1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-bcVar.J.f18083id);
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
                            new tg.d0(ra1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.s8) {
                    tg.o.m(ra1Var, d6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.o.m(ra1Var, d6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((ac) bcVar.f32073x.get(i10)).f15508a == 9) {
                    if (bcVar.f32074y == 1) {
                        z11 = true;
                    }
                    bcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f38345c;
                org.telegram.ui.Components.c70.M((org.telegram.ui.Components.c70) this.d, this.f38344b, (org.telegram.ui.ActionBar.n2) this.e, (a0.i) this.f38346f, context, i10);
                return;
        }
    }

    public vb(org.telegram.ui.Components.c70 c70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = c70Var;
        this.f38344b = j3;
        this.e = n2Var;
        this.f38346f = iVar;
        this.f38345c = context;
    }
}
