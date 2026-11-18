package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r60 implements Runnable {
    public final int f51474a = 1;
    public final LaunchActivity f51475b;
    public final TLObject f51476c;
    public final int d;
    public final String f51477e;
    public final TLRPC.TL_error f51478f;
    public final o60 h;

    public r60(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, TLRPC.TL_error tL_error, o60 o60Var) {
        this.f51475b = launchActivity;
        this.f51476c = tLObject;
        this.d = i7;
        this.f51477e = str;
        this.f51478f = tL_error;
        this.h = o60Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lc b02;
        int i7;
        int i10;
        String str;
        int i11 = this.f51474a;
        o60 o60Var = this.h;
        TLRPC.TL_error tL_error = this.f51478f;
        String str2 = this.f51477e;
        TLObject tLObject = this.f51476c;
        switch (i11) {
            case 0:
                String str3 = LaunchActivity.C1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            b02 = org.telegram.ui.Components.lc.b0(T);
                            i7 = 2131624021;
                            i10 = 2131743643;
                        } else {
                            b02 = org.telegram.ui.Components.lc.b0(T);
                            i7 = 2131624012;
                            i10 = 2131743644;
                        }
                        org.telegram.messenger.f3.n(null, i10, b02, i7, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.f51475b;
                    org.telegram.messenger.mp.u1(launchActivity.P).f4(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.mp.u1(launchActivity.P).Z3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        di.f6 f6Var = new di.f6(launchActivity, this.d, 0L, null, null);
                        f6Var.u2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 != null) {
                            if (T2.getLastStoryViewer() != null && T2.getLastStoryViewer().K0) {
                                T2.getLastStoryViewer().t(f6Var);
                            } else {
                                T2.showDialog(f6Var);
                            }
                        } else {
                            f6Var.show();
                        }
                    }
                }
                try {
                    o60Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                String str4 = LaunchActivity.C1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.f51475b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.mp.u1(this.d).e4(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28552id);
                    launchActivity2.t0(new bn(bundle));
                } else {
                    StringBuilder u10 = a8.p0.u("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    u10.append(str);
                    org.telegram.messenger.a8.d(u10.toString());
                    org.telegram.messenger.f3.o(null, 2131747942, org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity2.f43075e0)), null);
                }
                try {
                    o60Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }

    public r60(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, String str, o60 o60Var) {
        this.f51475b = launchActivity;
        this.f51478f = tL_error;
        this.f51476c = tLObject;
        this.d = i7;
        this.f51477e = str;
        this.h = o60Var;
    }
}
