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
public final class wb implements org.telegram.ui.Components.kl0 {
    public final int f38787a = 1;
    public final long f38788b;
    public final Context f38789c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f38790f;

    public wb(dc dcVar, Context context, long j3, org.telegram.ui.ActionBar.e6 e6Var, za1 za1Var) {
        this.d = dcVar;
        this.f38789c = context;
        this.f38788b = j3;
        this.e = e6Var;
        this.f38790f = za1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f38787a) {
            case 0:
                dc dcVar = (dc) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                za1 za1Var = (za1) this.f38790f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f38788b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.v7.e1(this.f38789c, dcVar.f32929b, j3, boost, e6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(za1Var.getParentActivity(), za1Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f30530b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f30530b.setSingleLine(false);
                                ybVar.f30530b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(za1Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                za1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-dcVar.J.f18296id);
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
                            new tg.c0(za1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.m(za1Var, e6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.m(za1Var, e6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((cc) dcVar.f32936x.get(i10)).f15672a == 9) {
                    if (dcVar.f32937y == 1) {
                        z11 = true;
                    }
                    dcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f38789c;
                org.telegram.ui.Components.k70.M((org.telegram.ui.Components.k70) this.d, this.f38788b, (org.telegram.ui.ActionBar.n2) this.e, (a0.i) this.f38790f, context, i10);
                return;
        }
    }

    public wb(org.telegram.ui.Components.k70 k70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = k70Var;
        this.f38788b = j3;
        this.e = n2Var;
        this.f38790f = iVar;
        this.f38789c = context;
    }
}
