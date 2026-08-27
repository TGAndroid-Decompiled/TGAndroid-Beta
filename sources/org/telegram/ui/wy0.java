package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class wy0 extends st0 {

    public final ProfileActivity f44211a;

    public wy0(ProfileActivity profileActivity) {
        this.f44211a = profileActivity;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        cu0 cu0Var;
        int i11;
        boolean z12;
        my0 my0Var;
        my0 my0Var2;
        org.telegram.ui.Components.bh0 bh0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User user;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.f44211a;
            if (profileActivity.U.getScaleX() <= 0.96f || !z11) {
                if (profileActivity.f35923a1 == 0 ? profileActivity.f35929b1 == 0 || (chat = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f35929b1))) == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1))) == null || (userProfilePhoto = user.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z13 = false;
                boolean z14 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                my0 my0Var3 = profileActivity.f35987j0;
                if (my0Var3 == null) {
                    cu0Var = null;
                    i11 = -1;
                    break;
                }
                int realCount = my0Var3.getRealCount();
                i11 = 0;
                while (true) {
                    if (i11 >= realCount) {
                        cu0Var = null;
                        i11 = -1;
                        break;
                    }
                    ImageLocation imageLocationG = profileActivity.f35987j0.G(i11);
                    if (imageLocationG != null && (tL_fileLocationToBeDeprecated = imageLocationG.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                        cu0Var = null;
                        if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && imageLocationG.dc_id == fileLocation.dc_id) {
                            z14 = true;
                            break;
                        }
                    }
                    i11++;
                }
                if (!z14) {
                    return cu0Var;
                }
                org.telegram.ui.Components.n9 n9Var = profileActivity.f35922a0;
                if (i11 < 0 || (my0Var = profileActivity.f35987j0) == null || my0Var.getVisibility() != 0) {
                    z12 = false;
                } else {
                    if (i11 != profileActivity.f35987j0.getRealPosition() && (bh0Var = (my0Var2 = profileActivity.f35987j0).f27451z0) != null) {
                        my0Var2.x(bh0Var.j() + i11, false);
                    }
                    org.telegram.ui.Components.n9 currentItemView = profileActivity.f35987j0.getCurrentItemView();
                    if (currentItemView != null) {
                        n9Var = currentItemView;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                int[] iArr = new int[2];
                n9Var.getLocationInWindow(iArr);
                cu0 cu0Var2 = new cu0();
                cu0Var2.f37154b = iArr[0];
                cu0Var2.f37155c = iArr[1];
                cu0Var2.d = n9Var;
                ImageReceiver imageReceiver = n9Var.getImageReceiver();
                cu0Var2.f37153a = imageReceiver;
                long j10 = profileActivity.f35923a1;
                if (j10 != 0) {
                    cu0Var2.f37157f = j10;
                } else {
                    long j11 = profileActivity.f35929b1;
                    if (j11 != 0) {
                        cu0Var2.f37157f = -j11;
                    }
                }
                cu0Var2.f37156e = imageReceiver.getBitmapSafe();
                cu0Var2.f37158g = -1L;
                cu0Var2.h = n9Var.getImageReceiver().getRoundRadius(true);
                cu0Var2.f37161k = z12 ? 1.0f : profileActivity.U.getScaleX();
                cu0Var2.f37166p = profileActivity.f35923a1 == profileActivity.getUserConfig().clientUserId;
                if (!z12 && profileActivity.U.getScaleX() > 0.96f) {
                    z13 = true;
                }
                cu0Var2.f37168r = z13;
                cu0Var2.f37169s = z12;
                return cu0Var2;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f44211a.f35922a0.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f44211a.m0.q(str, str2, z10);
    }
}
