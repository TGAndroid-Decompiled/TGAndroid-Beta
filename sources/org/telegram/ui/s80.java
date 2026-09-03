package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s80 implements Runnable {
    public final int f41048a = 0;
    public final LaunchActivity f41049b;
    public final TLRPC.TL_error f41050c;
    public final TLObject d;
    public final int f41051e;
    public final String f41052f;
    public final z10 h;

    public s80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, z10 z10Var) {
        this.f41049b = launchActivity;
        this.d = tLObject;
        this.f41051e = i10;
        this.f41052f = str;
        this.f41050c = tL_error;
        this.h = z10Var;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.qc a02;
        int i10;
        int i11;
        int i12 = this.f41048a;
        z10 z10Var = this.h;
        String str2 = this.f41052f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f41050c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                boolean z4 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f41049b;
                if (z4) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.f41051e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20992id);
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
                    org.telegram.messenger.y3.s(R.string.NoUsernameFound, org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) l.d.i(1, launchActivity.f34136a0)), null);
                }
                try {
                    z10Var.run();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.f34134y1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.qc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.qc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        l.d.v(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.f41049b;
                    MessagesController.getInstance(launchActivity2.L).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.L).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        mh.g5 g5Var = new mh.g5(launchActivity2, this.f41051e, 0L, null, null);
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
                    z10Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public s80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, z10 z10Var) {
        this.f41049b = launchActivity;
        this.f41050c = tL_error;
        this.d = tLObject;
        this.f41051e = i10;
        this.f41052f = str;
        this.h = z10Var;
    }
}
