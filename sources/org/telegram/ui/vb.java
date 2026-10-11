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
public final class vb implements org.telegram.ui.Components.fm0 {
    public final int f42999a = 1;
    public final long f43000b;
    public final Context f43001c;
    public final KeyEvent.Callback d;
    public final Object f43002e;
    public final Object f43003f;

    public vb(bc bcVar, Context context, long j3, org.telegram.ui.ActionBar.d6 d6Var, ab1 ab1Var) {
        this.d = bcVar;
        this.f43001c = context;
        this.f43000b = j3;
        this.f43002e = d6Var;
        this.f43003f = ab1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f42999a) {
            case 0:
                bc bcVar = (bc) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f43002e;
                ab1 ab1Var = (ab1) this.f43003f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f43000b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.p7.f1(this.f43001c, bcVar.f36366b, j3, boost, d6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(ab1Var.getParentActivity(), ab1Var.getResourceProvider());
                                acVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                acVar.f24555b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                acVar.f24555b.setSingleLine(false);
                                acVar.f24555b.setMaxLines(2);
                                org.telegram.ui.Components.sc.g(ab1Var, acVar, 2750).j();
                            } else if (!z13 && !z12) {
                                ab1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-bcVar.J.f20068id);
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
                            new tg.b0(ab1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.o(ab1Var, d6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.o(ab1Var, d6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((ac) bcVar.f36374x.get(i10)).f17211a == 9) {
                    if (bcVar.f36375y == 1) {
                        z11 = true;
                    }
                    bcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.d80.N((org.telegram.ui.Components.d80) this.d, this.f43000b, (org.telegram.ui.ActionBar.m2) this.f43002e, (a0.i) this.f43003f, this.f43001c, i10);
                return;
        }
    }

    public vb(org.telegram.ui.Components.d80 d80Var, long j3, org.telegram.ui.ActionBar.m2 m2Var, a0.i iVar, Context context) {
        this.d = d80Var;
        this.f43000b = j3;
        this.f43002e = m2Var;
        this.f43003f = iVar;
        this.f43001c = context;
    }
}
