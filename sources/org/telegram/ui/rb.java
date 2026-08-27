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

public final class rb implements org.telegram.ui.Components.pk0 {

    public final int f41888a = 1;

    public final long f41889b;

    public final Context f41890c;
    public final KeyEvent.Callback d;

    public final Object f41891e;

    public final Object f41892f;

    public rb(yb ybVar, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, q91 q91Var) {
        this.d = ybVar;
        this.f41890c = context;
        this.f41889b = j10;
        this.f41891e = c6Var;
        this.f41892f = q91Var;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f41888a) {
            case 0:
                yb ybVar = (yb) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f41891e;
                q91 q91Var = (q91) this.f41892f;
                boolean z10 = view instanceof hg.b;
                long j10 = this.f41889b;
                if (z10) {
                    hg.b bVar = (hg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z11 = boost.giveaway;
                    if (!z11 || boost.stars <= 0) {
                        boolean z12 = boost.gift;
                        if (((z12 || z11) && boost.user_id >= 0) || boost.unclaimed) {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ybVar.F.f22380id);
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
                            new cg.g1(q91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(q91Var.getParentActivity(), q91Var.getResourceProvider());
                            mbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            mbVar.f30639b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            mbVar.f30639b.setSingleLine(false);
                            mbVar.f30639b.setMaxLines(2);
                            org.telegram.ui.Components.ec.g(q91Var, mbVar, 2750).j();
                        } else if (!z12 && !z11) {
                            q91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        hh.oa.e1(this.f41890c, ybVar.f44753b, j10, boost, c6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.l8) {
                    cg.x.m(q91Var, c6Var, j10, null);
                }
                if (view instanceof hg.c) {
                    cg.x.m(q91Var, c6Var, j10, ((hg.c) view).getPrepaidGiveaway());
                }
                if (((xb) ybVar.f44761x.get(i10)).f49413a == 9) {
                    ybVar.c(Boolean.valueOf(ybVar.f44762y == 1));
                }
                break;
            default:
                org.telegram.ui.Components.p60.M((org.telegram.ui.Components.p60) this.d, this.f41889b, (org.telegram.ui.ActionBar.n2) this.f41891e, (a0.h) this.f41892f, this.f41890c, i10);
                break;
        }
    }

    public rb(org.telegram.ui.Components.p60 p60Var, long j10, org.telegram.ui.ActionBar.n2 n2Var, a0.h hVar, Context context) {
        this.d = p60Var;
        this.f41889b = j10;
        this.f41891e = n2Var;
        this.f41892f = hVar;
        this.f41890c = context;
    }
}
