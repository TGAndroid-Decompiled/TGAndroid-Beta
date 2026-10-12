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
public final class zb implements org.telegram.ui.Components.km0 {
    public final int f44701a = 1;
    public final long f44702b;
    public final Context f44703c;
    public final KeyEvent.Callback d;
    public final Object f44704e;
    public final Object f44705f;

    public zb(fc fcVar, Context context, long j3, org.telegram.ui.ActionBar.c6 c6Var, db1 db1Var) {
        this.d = fcVar;
        this.f44703c = context;
        this.f44702b = j3;
        this.f44704e = c6Var;
        this.f44705f = db1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f44701a) {
            case 0:
                fc fcVar = (fc) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f44704e;
                db1 db1Var = (db1) this.f44705f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f44702b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.p7.f1(this.f44703c, fcVar.f37700b, j3, boost, c6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(db1Var.getParentActivity(), db1Var.getResourceProvider());
                                acVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                acVar.f24276b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                acVar.f24276b.setSingleLine(false);
                                acVar.f24276b.setMaxLines(2);
                                org.telegram.ui.Components.sc.g(db1Var, acVar, 2750).j();
                            } else if (!z13 && !z12) {
                                db1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-fcVar.J.f19802id);
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
                            new tg.b0(db1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.o(db1Var, c6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.o(db1Var, c6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((ec) fcVar.f37708x.get(i10)).f16876a == 9) {
                    if (fcVar.f37709y == 1) {
                        z11 = true;
                    }
                    fcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.g80.N((org.telegram.ui.Components.g80) this.d, this.f44702b, (org.telegram.ui.ActionBar.m2) this.f44704e, (a0.i) this.f44705f, this.f44703c, i10);
                return;
        }
    }

    public zb(org.telegram.ui.Components.g80 g80Var, long j3, org.telegram.ui.ActionBar.m2 m2Var, a0.i iVar, Context context) {
        this.d = g80Var;
        this.f44702b = j3;
        this.f44704e = m2Var;
        this.f44705f = iVar;
        this.f44703c = context;
    }
}
