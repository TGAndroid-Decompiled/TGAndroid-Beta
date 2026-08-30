package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r80 implements Runnable {
    public final int f37939a = 0;
    public final LaunchActivity f37940b;
    public final TLRPC.TL_error f37941c;
    public final TLObject d;
    public final int e;
    public final String f37942f;
    public final g00 h;

    public r80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, g00 g00Var) {
        this.f37940b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f37942f = str;
        this.f37941c = tL_error;
        this.h = g00Var;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f37939a;
        g00 g00Var = this.h;
        String str2 = this.f37942f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f37941c;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
                boolean z4 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f37940b;
                if (z4) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19331id);
                    launchActivity.p0(new xn(bundle));
                } else {
                    StringBuilder t6 = android.support.v4.media.a.t("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    t6.append(str);
                    FileLog.e(t6.toString());
                    org.telegram.messenger.y3.s(R.string.NoUsernameFound, org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) kh.a2.i(1, launchActivity.f31614a0)), null);
                }
                try {
                    g00Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.f31612y1;
                LaunchActivity launchActivity2 = this.f37940b;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            org.telegram.ui.Components.qc.a0(U).Q(R.raw.fire_on, 36, launchActivity2.getString(R.string.UniqueGiftNotFoundBurned)).j();
                        } else {
                            org.telegram.ui.Components.qc.a0(U).Q(R.raw.error, 36, launchActivity2.getString(R.string.UniqueGiftNotFound)).j();
                        }
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    MessagesController.getInstance(launchActivity2.L).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.L).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        lh.g5 g5Var = new lh.g5(launchActivity2, this.e, 0L, null, null);
                        g5Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().H0) {
                                U2.getLastStoryViewer().showDialog(g5Var);
                            } else {
                                U2.showDialog(g5Var);
                            }
                        } else {
                            g5Var.show();
                        }
                    }
                }
                try {
                    g00Var.run();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    public r80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, g00 g00Var) {
        this.f37940b = launchActivity;
        this.f37941c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f37942f = str;
        this.h = g00Var;
    }
}
