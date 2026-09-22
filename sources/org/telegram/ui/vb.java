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
    public final int f38501a = 1;
    public final long f38502b;
    public final Context f38503c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f38504f;

    public vb(cc ccVar, Context context, long j3, org.telegram.ui.ActionBar.e6 e6Var, za1 za1Var) {
        this.d = ccVar;
        this.f38503c = context;
        this.f38502b = j3;
        this.e = e6Var;
        this.f38504f = za1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f38501a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                za1 za1Var = (za1) this.f38504f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f38502b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.x7.e1(this.f38503c, ccVar.f32743b, j3, boost, e6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(za1Var.getParentActivity(), za1Var.getResourceProvider());
                                wbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                wbVar.f29679b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                wbVar.f29679b.setSingleLine(false);
                                wbVar.f29679b.setMaxLines(2);
                                org.telegram.ui.Components.oc.g(za1Var, wbVar, 2750).j();
                            } else if (!z13 && !z12) {
                                za1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ccVar.J.f18109id);
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
                            new tg.d0(za1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.o.m(za1Var, e6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.o.m(za1Var, e6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.f32750x.get(i10)).f15531a == 9) {
                    if (ccVar.f32751y == 1) {
                        z11 = true;
                    }
                    ccVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f38503c;
                org.telegram.ui.Components.b70.M((org.telegram.ui.Components.b70) this.d, this.f38502b, (org.telegram.ui.ActionBar.n2) this.e, (a0.i) this.f38504f, context, i10);
                return;
        }
    }

    public vb(org.telegram.ui.Components.b70 b70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = b70Var;
        this.f38502b = j3;
        this.e = n2Var;
        this.f38504f = iVar;
        this.f38503c = context;
    }
}
