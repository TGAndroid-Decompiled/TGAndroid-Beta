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
public final class xb implements org.telegram.ui.Components.al0 {
    public final int f39512a = 1;
    public final long f39513b;
    public final Context f39514c;
    public final KeyEvent.Callback d;
    public final Object e;
    public final Object f39515f;

    public xb(ec ecVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, ab1 ab1Var) {
        this.d = ecVar;
        this.f39514c = context;
        this.f39513b = j3;
        this.e = f6Var;
        this.f39515f = ab1Var;
    }

    @Override
    public final void d(int i10, View view) {
        switch (this.f39512a) {
            case 0:
                ec ecVar = (ec) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                ab1 ab1Var = (ab1) this.f39515f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.f39513b;
                boolean z11 = false;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z12 = boost.giveaway;
                    if (z12 && boost.stars > 0) {
                        yh.y7.e1(this.f39514c, ecVar.f33358b, j3, boost, f6Var);
                    } else {
                        boolean z13 = boost.gift;
                        if (((!z13 && !z12) || boost.user_id < 0) && !boost.unclaimed) {
                            if (z12 && boost.user_id == -1) {
                                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(ab1Var.getParentActivity(), ab1Var.getResourceProvider());
                                wbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                wbVar.f29626b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                                wbVar.f29626b.setSingleLine(false);
                                wbVar.f29626b.setMaxLines(2);
                                org.telegram.ui.Components.oc.g(ab1Var, wbVar, 2750).j();
                            } else if (!z13 && !z12) {
                                ab1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                            }
                        } else {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ecVar.J.f18121id);
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
                            new tg.d0(ab1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        }
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.o.m(ab1Var, f6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.o.m(ab1Var, f6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((dc) ecVar.f33365x.get(i10)).f15543a == 9) {
                    if (ecVar.f33366y == 1) {
                        z11 = true;
                    }
                    ecVar.c(Boolean.valueOf(z11));
                    return;
                }
                return;
            default:
                Context context = this.f39514c;
                org.telegram.ui.Components.b70.M((org.telegram.ui.Components.b70) this.d, this.f39513b, (org.telegram.ui.ActionBar.o2) this.e, (a0.i) this.f39515f, context, i10);
                return;
        }
    }

    public xb(org.telegram.ui.Components.b70 b70Var, long j3, org.telegram.ui.ActionBar.o2 o2Var, a0.i iVar, Context context) {
        this.d = b70Var;
        this.f39513b = j3;
        this.e = o2Var;
        this.f39515f = iVar;
        this.f39514c = context;
    }
}
