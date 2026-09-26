package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v80 implements Runnable {
    public final int f38663a = 0;
    public final LaunchActivity f38664b;
    public final TLRPC.TL_error f38665c;
    public final TLObject d;
    public final int e;
    public final String f38666f;
    public final n80 h;

    public v80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, n80 n80Var) {
        this.f38664b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f38666f = str;
        this.f38665c = tL_error;
        this.h = n80Var;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.xc a02;
        int i10;
        int i11;
        int i12 = this.f38663a;
        n80 n80Var = this.h;
        String str2 = this.f38666f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f38665c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f38664b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18482id);
                    launchActivity.p0(new wn(bundle));
                } else {
                    StringBuilder w10 = a4.a.w("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    w10.append(str);
                    FileLog.e(w10.toString());
                    org.telegram.messenger.ok.p(R.string.NoUsernameFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.m2) hg.c.g(1, launchActivity.f31105d0)), null);
                }
                try {
                    n80Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.xc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.xc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.f0.p(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.f38664b;
                    MessagesController.getInstance(launchActivity2.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        yh.x3 x3Var = new yh.x3(launchActivity2, this.e, 0L, null, null);
                        x3Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().K0) {
                                U2.getLastStoryViewer().showDialog(x3Var);
                            } else {
                                U2.showDialog(x3Var);
                            }
                        } else {
                            x3Var.show();
                        }
                    }
                }
                try {
                    n80Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public v80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, n80 n80Var) {
        this.f38664b = launchActivity;
        this.f38665c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f38666f = str;
        this.h = n80Var;
    }
}
