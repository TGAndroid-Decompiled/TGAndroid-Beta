package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z80 implements Runnable {
    public final int f39229a = 0;
    public final LaunchActivity f39230b;
    public final TLRPC.TL_error f39231c;
    public final TLObject d;
    public final int e;
    public final String f39232f;
    public final h90 h;

    public z80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, h90 h90Var) {
        this.f39230b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f39232f = str;
        this.f39231c = tL_error;
        this.h = h90Var;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.wc a02;
        int i10;
        int i11;
        int i12 = this.f39229a;
        h90 h90Var = this.h;
        String str2 = this.f39232f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f39231c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f39230b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f17342id);
                    launchActivity.p0(new eo(bundle));
                } else {
                    StringBuilder v = a4.a.v("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    v.append(str);
                    FileLog.e(v.toString());
                    org.telegram.messenger.a2.p(R.string.NoUsernameFound, org.telegram.ui.Components.wc.a0((org.telegram.ui.ActionBar.p2) hc.b.i(1, launchActivity.f29933d0)), null);
                }
                try {
                    h90Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.wc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.wc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.a2.o(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.f39230b;
                    MessagesController.getInstance(launchActivity2.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        xh.x3 x3Var = new xh.x3(launchActivity2, this.e, 0L, null, null);
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
                    h90Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public z80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, h90 h90Var) {
        this.f39230b = launchActivity;
        this.f39231c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f39232f = str;
        this.h = h90Var;
    }
}
