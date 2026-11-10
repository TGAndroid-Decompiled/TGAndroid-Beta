package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t60 implements Runnable {
    public final int f50143a = 1;
    public final LaunchActivity f50144b;
    public final TLObject f50145c;
    public final int d;
    public final String f50146e;
    public final TLRPC.TL_error f50147f;
    public final f10 h;

    public t60(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, TLRPC.TL_error tL_error, f10 f10Var) {
        this.f50144b = launchActivity;
        this.f50145c = tLObject;
        this.d = i7;
        this.f50146e = str;
        this.f50147f = tL_error;
        this.h = f10Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.gc a02;
        int i7;
        int i10;
        String str;
        int i11 = this.f50143a;
        f10 f10Var = this.h;
        TLRPC.TL_error tL_error = this.f50147f;
        String str2 = this.f50146e;
        TLObject tLObject = this.f50145c;
        switch (i11) {
            case 0:
                String str3 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.gc.a0(T);
                            i7 = 2131624020;
                            i10 = 2131743880;
                        } else {
                            a02 = org.telegram.ui.Components.gc.a0(T);
                            i7 = 2131624011;
                            i10 = 2131743881;
                        }
                        org.telegram.messenger.k5.o(null, i10, a02, i7, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.f50144b;
                    org.telegram.messenger.qp.s1(launchActivity.O).Y3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.qp.s1(launchActivity.O).S3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        bi.k7 k7Var = new bi.k7(launchActivity, this.d, 0L, null, null);
                        k7Var.g2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 != null) {
                            if (T2.getLastStoryViewer() != null && T2.getLastStoryViewer().J0) {
                                T2.getLastStoryViewer().t(k7Var);
                            } else {
                                T2.showDialog(k7Var);
                            }
                        } else {
                            k7Var.show();
                        }
                    }
                }
                try {
                    f10Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                String str4 = LaunchActivity.B1;
                boolean z9 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.f50144b;
                if (z9) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.qp.s1(this.d).X3(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27109id);
                    launchActivity2.t0(new cn(bundle));
                } else {
                    StringBuilder u10 = a8.p0.u("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    u10.append(str);
                    org.telegram.messenger.a8.d(u10.toString());
                    org.telegram.messenger.k5.p(null, 2131748134, org.telegram.ui.Components.gc.a0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity2.f41258d0)), null);
                }
                try {
                    f10Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }

    public t60(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, String str, f10 f10Var) {
        this.f50144b = launchActivity;
        this.f50147f = tL_error;
        this.f50145c = tLObject;
        this.d = i7;
        this.f50146e = str;
        this.h = f10Var;
    }
}
