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
    public final int f40090a = 0;
    public final LaunchActivity f40091b;
    public final TLRPC.TL_error f40092c;
    public final TLObject d;
    public final int e;
    public final String f40093f;
    public final ma0 h;

    public z80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, ma0 ma0Var) {
        this.f40091b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f40093f = str;
        this.f40092c = tL_error;
        this.h = ma0Var;
    }

    @Override
    public final void run() {
        String str;
        org.telegram.ui.Components.vc a02;
        int i10;
        int i11;
        int i12 = this.f40090a;
        ma0 ma0Var = this.h;
        String str2 = this.f40093f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f40092c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.f40091b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18256id);
                    launchActivity.p0(new bo(bundle));
                } else {
                    StringBuilder w10 = a4.a.w("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    w10.append(str);
                    FileLog.e(w10.toString());
                    org.telegram.messenger.y0.p(R.string.NoUsernameFound, org.telegram.ui.Components.vc.a0((org.telegram.ui.ActionBar.n2) hg.c.h(1, launchActivity.f30817d0)), null);
                }
                try {
                    ma0Var.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.vc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.vc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.y0.o(i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.f40091b;
                    MessagesController.getInstance(launchActivity2.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        yh.z3 z3Var = new yh.z3(launchActivity2, this.e, 0L, null, null);
                        z3Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 != null) {
                            if (U2.getLastStoryViewer() != null && U2.getLastStoryViewer().K0) {
                                U2.getLastStoryViewer().showDialog(z3Var);
                            } else {
                                U2.showDialog(z3Var);
                            }
                        } else {
                            z3Var.show();
                        }
                    }
                }
                try {
                    ma0Var.run();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public z80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, ma0 ma0Var) {
        this.f40091b = launchActivity;
        this.f40092c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f40093f = str;
        this.h = ma0Var;
    }
}
