package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class st0 implements Runnable {
    public final int f51273a;
    public final ProfileActivity f51274b;
    public final TLRPC.User f51275c;

    public st0(ProfileActivity profileActivity, TLRPC.User user, int i7) {
        this.f51273a = i7;
        this.f51274b = profileActivity;
        this.f51275c = user;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f51273a) {
            case 0:
                ProfileActivity profileActivity = this.f51274b;
                TLRPC.User user = this.f51275c;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                profileActivity.presentFragment(an.ua(user.f28200id));
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f51274b;
                TLRPC.User user2 = this.f51275c;
                RectF rectF2 = ProfileActivity.X6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.f43219w2;
                    if (userFull != null && userFull.video_calls_available) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.voip.c2.m(user2, false, z10, profileActivity2.getParentActivity(), profileActivity2.f43219w2, profileActivity2.getAccountInstance());
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity3 = this.f51274b;
                TLRPC.User user3 = this.f51275c;
                RectF rectF3 = ProfileActivity.X6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.f43219w2;
                    if (userFull2 != null && userFull2.video_calls_available) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.voip.c2.m(user3, true, z11, profileActivity3.getParentActivity(), profileActivity3.f43219w2, profileActivity3.getAccountInstance());
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity4 = this.f51274b;
                TLRPC.User user4 = this.f51275c;
                RectF rectF4 = ProfileActivity.X6;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(268435456);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.f51274b;
                TLRPC.User user5 = this.f51275c;
                RectF rectF5 = ProfileActivity.X6;
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f26609b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (org.telegram.messenger.g0.H3()) {
                        org.telegram.ui.Components.cc.a0(profileActivity5).i(org.telegram.messenger.hd.M0(2131747295, null)).j();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
