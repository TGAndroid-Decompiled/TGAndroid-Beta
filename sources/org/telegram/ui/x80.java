package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x80 implements Runnable {
    public final int f39559a = 0;
    public final LaunchActivity f39560b;
    public final TLRPC.TL_error f39561c;
    public final TLObject d;
    public final int e;
    public final String f39562f;
    public final ea0 h;

    public x80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, ea0 ea0Var) {
        this.f39560b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f39562f = str;
        this.f39561c = tL_error;
        this.h = ea0Var;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.xc a02;
        int i10;
        int i11;
        int i12 = this.f39559a;
        ea0 ea0Var = this.h;
        String str2 = this.f39562f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f39561c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f39560b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18476id);
                    launchActivity.p0(new xn(bundle));
                } else {
                    StringBuilder v = a4.a.v("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    v.append(str);
                    FileLog.e(v.toString());
                    org.telegram.messenger.qk.p(R.string.NoUsernameFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.o2) hg.k0.g(1, launchActivity.f31108d0)), null);
                }
                try {
                    ea0Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
                        org.telegram.messenger.l0.o(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.f39560b;
                    MessagesController.getInstance(launchActivity2.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
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
                    ea0Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public x80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, ea0 ea0Var) {
        this.f39560b = launchActivity;
        this.f39561c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f39562f = str;
        this.h = ea0Var;
    }
}
