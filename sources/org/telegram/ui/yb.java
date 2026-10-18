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
public final class yb implements org.telegram.ui.Components.wl0 {
    public final int f43401a = 1;
    public final long f43402b;
    public final Context f43403c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f43404f;

    public yb(ec ecVar, Context context, long j10, org.telegram.ui.ActionBar.d6 d6Var, r91 r91Var) {
        this.d = ecVar;
        this.f43403c = context;
        this.f43402b = j10;
        this.e = d6Var;
        this.f43404f = r91Var;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f43401a) {
            case 0:
                ec ecVar = (ec) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                r91 r91Var = (r91) this.f43404f;
                boolean z10 = view instanceof zg.b;
                long j10 = this.f43402b;
                boolean z11 = false;
                if (z10) {
                    zg.b bVar = (zg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        ai.md.f1(this.f43403c, ecVar.f36490b, j10, boost, d6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(r91Var.getParentActivity(), r91Var.getResourceProvider());
                                ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ybVar.f32606b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                ybVar.f32606b.setSingleLine(false);
                                ybVar.f32606b.setMaxLines(2);
                                org.telegram.ui.Components.qc.g(r91Var, ybVar, 2750).j();
                            } else if (!z13 && !z12) {
                                r91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ecVar.J.f20279id);
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
                            new ug.b0(r91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ug.m.n(r91Var, d6Var, j10, null);
                }
                if (view instanceof zg.c) {
                    ug.m.n(r91Var, d6Var, j10, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((dc) ecVar.f36497x.get(i10)).f44334a == 9) {
                    if (ecVar.f36498y == 1) {
                        z11 = true;
                    }
                    ecVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.v70.N((org.telegram.ui.Components.v70) this.d, this.f43402b, (org.telegram.ui.ActionBar.n2) this.e, (a0.h) this.f43404f, this.f43403c, i10);
                return;
        }
    }

    public yb(org.telegram.ui.Components.v70 v70Var, long j10, org.telegram.ui.ActionBar.n2 n2Var, a0.h hVar, Context context) {
        this.d = v70Var;
        this.f43402b = j10;
        this.e = n2Var;
        this.f43404f = hVar;
        this.f43403c = context;
    }
}
