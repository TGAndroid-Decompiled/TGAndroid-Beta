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
    public final int f42826a = 1;
    public final long f42827b;
    public final Context f42828c;
    public final KeyEvent.Callback d;
    public final Object f42829e;
    public final Object f42830f;

    public xb(dc dcVar, Context context, long j3, org.telegram.ui.ActionBar.d6 d6Var, va1 va1Var) {
        this.d = dcVar;
        this.f42828c = context;
        this.f42827b = j3;
        this.f42829e = d6Var;
        this.f42830f = va1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f42826a) {
            case 0:
                dc dcVar = (dc) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f42829e;
                va1 va1Var = (va1) this.f42830f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f42827b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.x7.k1(this.f42828c, dcVar.f35730b, j3, boost, d6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(va1Var.getParentActivity(), va1Var.getResourceProvider());
                                zbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                zbVar.f33472b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                zbVar.f33472b.setSingleLine(false);
                                zbVar.f33472b.setMaxLines(2);
                                org.telegram.ui.Components.rc.g(va1Var, zbVar, 2750).j();
                            } else if (!z13 && !z12) {
                                va1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-dcVar.I.f20042id);
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
                            new tg.c0(va1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.m(va1Var, d6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.m(va1Var, d6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((cc) dcVar.f35738x.get(i10)).f17187a == 9) {
                    if (dcVar.f35739y == 1) {
                        z11 = true;
                    }
                    dcVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f42828c;
                org.telegram.ui.Components.p70.K((org.telegram.ui.Components.p70) this.d, this.f42827b, (org.telegram.ui.ActionBar.n2) this.f42829e, (a0.i) this.f42830f, context, i10);
                return;
        }
    }

    public xb(org.telegram.ui.Components.p70 p70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = p70Var;
        this.f42827b = j3;
        this.f42829e = n2Var;
        this.f42830f = iVar;
        this.f42828c = context;
    }
}
