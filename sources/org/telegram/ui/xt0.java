package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class xt0 implements Runnable {
    public final int f51760a;
    public final ProfileActivity f51761b;
    public final TLRPC.User f51762c;

    public xt0(ProfileActivity profileActivity, TLRPC.User user, int i7) {
        this.f51760a = i7;
        this.f51761b = profileActivity;
        this.f51762c = user;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        switch (this.f51760a) {
            case 0:
                ProfileActivity profileActivity = this.f51761b;
                TLRPC.User user = this.f51762c;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(cn.ta(user.f27105id));
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f51761b;
                TLRPC.User user2 = this.f51762c;
                RectF rectF2 = ProfileActivity.V6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.f41840u2;
                    if (userFull != null && userFull.video_calls_available) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    org.telegram.ui.Components.voip.y1.m(user2, false, z9, profileActivity2.getParentActivity(), profileActivity2.f41840u2, profileActivity2.getAccountInstance());
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity3 = this.f51761b;
                TLRPC.User user3 = this.f51762c;
                RectF rectF3 = ProfileActivity.V6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.f41840u2;
                    if (userFull2 != null && userFull2.video_calls_available) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.voip.y1.m(user3, true, z10, profileActivity3.getParentActivity(), profileActivity3.f41840u2, profileActivity3.getAccountInstance());
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity4 = this.f51761b;
                TLRPC.User user4 = this.f51762c;
                RectF rectF4 = ProfileActivity.V6;
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
                ProfileActivity profileActivity5 = this.f51761b;
                TLRPC.User user5 = this.f51762c;
                RectF rectF5 = ProfileActivity.V6;
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (org.telegram.messenger.g0.I3()) {
                        org.telegram.ui.Components.hc.a0(profileActivity5).i(org.telegram.messenger.id.M0(2131747295, null)).j();
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
