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
public final class vb implements org.telegram.ui.Components.zk0 {
    public final int f41503a = 1;
    public final long f41504b;
    public final Context f41505c;
    public final KeyEvent.Callback d;
    public final Object f41506e;
    public final Object f41507f;

    public vb(cc ccVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, bb1 bb1Var) {
        this.d = ccVar;
        this.f41505c = context;
        this.f41504b = j3;
        this.f41506e = f6Var;
        this.f41507f = bb1Var;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f41503a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f41506e;
                bb1 bb1Var = (bb1) this.f41507f;
                boolean z10 = view instanceof zg.b;
                long j3 = this.f41504b;
                boolean z11 = false;
                if (z10) {
                    zg.b bVar = (zg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        zh.v7.e1(this.f41505c, ccVar.f35059b, j3, boost, f6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(bb1Var.getParentActivity(), bb1Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f32876b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f32876b.setSingleLine(false);
                                ybVar.f32876b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(bb1Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                bb1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ccVar.J.f19869id);
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
                            new ug.d0(bb1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ug.n.m(bb1Var, f6Var, j3, null);
                }
                if (view instanceof zg.c) {
                    ug.n.m(bb1Var, f6Var, j3, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.f35067x.get(i10)).f44071a == 9) {
                    if (ccVar.f35068y == 1) {
                        z11 = true;
                    }
                    ccVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f41505c;
                org.telegram.ui.Components.b70.M((org.telegram.ui.Components.b70) this.d, this.f41504b, (org.telegram.ui.ActionBar.n2) this.f41506e, (a0.i) this.f41507f, context, i10);
                return;
        }
    }

    public vb(org.telegram.ui.Components.b70 b70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = b70Var;
        this.f41504b = j3;
        this.f41506e = n2Var;
        this.f41507f = iVar;
        this.f41505c = context;
    }
}
