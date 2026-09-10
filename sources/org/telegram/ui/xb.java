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
public final class xb implements org.telegram.ui.Components.jl0 {
    public final int f38657a = 1;
    public final long f38658b;
    public final Context f38659c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f38660f;

    public xb(ec ecVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, fb1 fb1Var) {
        this.d = ecVar;
        this.f38659c = context;
        this.f38658b = j3;
        this.e = f6Var;
        this.f38660f = fb1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f38657a) {
            case 0:
                ec ecVar = (ec) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                fb1 fb1Var = (fb1) this.f38660f;
                boolean z10 = view instanceof xg.b;
                long j3 = this.f38658b;
                boolean z11 = false;
                if (z10) {
                    xg.b bVar = (xg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        xh.z7.e1(this.f38659c, ecVar.f32146b, j3, boost, f6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(fb1Var.getParentActivity(), fb1Var.getResourceProvider());
                                xbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                xbVar.f29000b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                xbVar.f29000b.setSingleLine(false);
                                xbVar.f29000b.setMaxLines(2);
                                org.telegram.ui.Components.pc.g(fb1Var, xbVar, 2750).j();
                            } else if (!z13 && !z12) {
                                fb1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ecVar.J.f17195id);
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
                            new sg.c0(fb1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.s8) {
                    sg.m.m(fb1Var, f6Var, j3, null);
                }
                if (view instanceof xg.c) {
                    sg.m.m(fb1Var, f6Var, j3, ((xg.c) view).getPrepaidGiveaway());
                }
                if (((dc) ecVar.f32153x.get(i10)).f14046a == 9) {
                    if (ecVar.f32154y == 1) {
                        z11 = true;
                    }
                    ecVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f38659c;
                org.telegram.ui.Components.k70.M((org.telegram.ui.Components.k70) this.d, this.f38658b, (org.telegram.ui.ActionBar.p2) this.e, (a0.i) this.f38660f, context, i10);
                return;
        }
    }

    public xb(org.telegram.ui.Components.k70 k70Var, long j3, org.telegram.ui.ActionBar.p2 p2Var, a0.i iVar, Context context) {
        this.d = k70Var;
        this.f38658b = j3;
        this.e = p2Var;
        this.f38660f = iVar;
        this.f38659c = context;
    }
}
