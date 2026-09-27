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
public final class xb implements org.telegram.ui.Components.ml0 {
    public final int f39596a = 1;
    public final long f39597b;
    public final Context f39598c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f39599f;

    public xb(dc dcVar, Context context, long j3, org.telegram.ui.ActionBar.e6 e6Var, ra1 ra1Var) {
        this.d = dcVar;
        this.f39598c = context;
        this.f39597b = j3;
        this.e = e6Var;
        this.f39599f = ra1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f39596a) {
            case 0:
                dc dcVar = (dc) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                ra1 ra1Var = (ra1) this.f39599f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f39597b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.v7.e1(this.f39598c, dcVar.f32924b, j3, boost, e6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(ra1Var.getParentActivity(), ra1Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f30642b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f30642b.setSingleLine(false);
                                ybVar.f30642b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(ra1Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                ra1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-dcVar.I.f18329id);
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
                            new tg.c0(ra1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.m(ra1Var, e6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.m(ra1Var, e6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((cc) dcVar.f32931x.get(i10)).f15754a == 9) {
                    if (dcVar.f32932y == 1) {
                        z11 = true;
                    }
                    dcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f39598c;
                org.telegram.ui.Components.o70.M((org.telegram.ui.Components.o70) this.d, this.f39597b, (org.telegram.ui.ActionBar.o2) this.e, (a0.i) this.f39599f, context, i10);
                return;
        }
    }

    public xb(org.telegram.ui.Components.o70 o70Var, long j3, org.telegram.ui.ActionBar.o2 o2Var, a0.i iVar, Context context) {
        this.d = o70Var;
        this.f39597b = j3;
        this.e = o2Var;
        this.f39599f = iVar;
        this.f39598c = context;
    }
}
