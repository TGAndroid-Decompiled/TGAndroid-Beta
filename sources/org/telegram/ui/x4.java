package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class x4 {
    public final ImageLocation f44453a;
    public final ImageLocation f44454b;
    public final ImageLocation f44455c;
    public final String d;
    public final String f44456e;
    public final String f44457f;
    public final BitmapDrawable f44458g;
    public final Object h;
    public final d5[] f44459i;
    public final z4 f44460j;

    public x4(ImageLocation imageLocation, ImageLocation imageLocation2, ImageLocation imageLocation3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, d5[] d5VarArr, z4 z4Var) {
        this.f44453a = imageLocation;
        this.f44454b = imageLocation2;
        this.f44455c = imageLocation3;
        this.d = str;
        this.f44456e = str2;
        this.f44457f = str3;
        this.f44458g = bitmapDrawable;
        this.h = obj;
        this.f44459i = d5VarArr;
        this.f44460j = z4Var;
    }

    public static x4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, d5... d5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        ImageLocation imageLocation;
        String str2;
        TLRPC.ChatPhoto chatPhoto;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
        String str3 = null;
        if (forUserOrChat2 != null && (forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (chat != null && (chatPhoto = chat.photo) != null) {
            bitmapDrawable = chatPhoto.strippedBitmap;
        } else {
            bitmapDrawable = null;
        }
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo != null && !photo.video_sizes.isEmpty()) {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(chatFull.chat_photo.video_sizes, 1000);
            imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize, chatFull.chat_photo);
            str2 = FileLoader.getAttachFileName(closestVideoSizeWithSize);
        } else {
            imageLocation = null;
            str2 = null;
        }
        if (imageLocation != null && imageLocation.imageType == 2) {
            str3 = "g";
        }
        return new x4(forUserOrChat, forUserOrChat2, imageLocation, str, str3, str2, bitmapDrawable, chat, d5VarArr, null);
    }

    public static x4 b(TLRPC.User user, int i10, d5... d5VarArr) {
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(user, 0);
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(user, 1);
        BitmapDrawable bitmapDrawable = null;
        if (forUserOrChat2 != null && (forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new x4(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, user, d5VarArr, new z4(i10, user, NotificationCenter.userInfoDidLoad));
    }

    public static x4 c(TLRPC.User user, TLRPC.UserFull userFull, d5... d5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        ImageLocation imageLocation;
        String str2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(userFull.user, 0);
        if (forUserOrChat == null && (photo = userFull.profile_photo) != null) {
            forUserOrChat = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 500), userFull.profile_photo);
        }
        ImageLocation imageLocation2 = forUserOrChat;
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(userFull.user, 1);
        String str3 = null;
        if (forUserOrChat2 != null && (forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        } else {
            bitmapDrawable = null;
        }
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 != null && !photo2.video_sizes.isEmpty()) {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(userFull.profile_photo.video_sizes, 1000);
            ImageLocation forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, userFull.profile_photo);
            str2 = FileLoader.getAttachFileName(closestVideoSizeWithSize);
            imageLocation = forPhoto;
        } else {
            imageLocation = null;
            str2 = null;
        }
        if (imageLocation != null && imageLocation.imageType == 2) {
            str3 = "g";
        }
        return new x4(imageLocation2, forUserOrChat2, imageLocation, str, str3, str2, bitmapDrawable, userFull.user, d5VarArr, null);
    }
}
