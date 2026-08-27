package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class x4 {

    public final ImageLocation f44273a;

    public final ImageLocation f44274b;

    public final ImageLocation f44275c;
    public final String d;

    public final String f44276e;

    public final String f44277f;

    public final BitmapDrawable f44278g;
    public final Object h;

    public final d5[] f44279i;

    public final z4 f44280j;

    public x4(ImageLocation imageLocation, ImageLocation imageLocation2, ImageLocation imageLocation3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, d5[] d5VarArr, z4 z4Var) {
        this.f44273a = imageLocation;
        this.f44274b = imageLocation2;
        this.f44275c = imageLocation3;
        this.d = str;
        this.f44276e = str2;
        this.f44277f = str3;
        this.f44278g = bitmapDrawable;
        this.h = obj;
        this.f44279i = d5VarArr;
        this.f44280j = z4Var;
    }

    public static x4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, d5... d5VarArr) {
        ImageLocation forPhoto;
        String attachFileName;
        TLRPC.ChatPhoto chatPhoto;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
        String str = null;
        String str2 = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.strippedBitmap;
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo == null || photo.video_sizes.isEmpty()) {
            forPhoto = null;
            attachFileName = null;
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(chatFull.chat_photo.video_sizes, 1000);
            forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, chatFull.chat_photo);
            attachFileName = FileLoader.getAttachFileName(closestVideoSizeWithSize);
        }
        if (forPhoto != null && forPhoto.imageType == 2) {
            str = "g";
        }
        return new x4(forUserOrChat, forUserOrChat2, forPhoto, str2, str, attachFileName, bitmapDrawable, chat, d5VarArr, null);
    }

    public static x4 b(TLRPC.User user, int i10, d5... d5VarArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(user, 0);
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(user, 1);
        BitmapDrawable bitmapDrawable = null;
        String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new x4(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, user, d5VarArr, new e5(i10, user, NotificationCenter.userInfoDidLoad));
    }

    public static x4 c(TLRPC.User user, TLRPC.UserFull userFull, d5... d5VarArr) {
        ImageLocation imageLocation;
        String attachFileName;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(userFull.user, 0);
        if (forUserOrChat == null && (photo = userFull.profile_photo) != null) {
            forUserOrChat = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 500), userFull.profile_photo);
        }
        ImageLocation imageLocation2 = forUserOrChat;
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(userFull.user, 1);
        String str = null;
        String str2 = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.strippedBitmap;
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 == null || photo2.video_sizes.isEmpty()) {
            imageLocation = null;
            attachFileName = null;
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(userFull.profile_photo.video_sizes, 1000);
            ImageLocation forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, userFull.profile_photo);
            attachFileName = FileLoader.getAttachFileName(closestVideoSizeWithSize);
            imageLocation = forPhoto;
        }
        if (imageLocation != null && imageLocation.imageType == 2) {
            str = "g";
        }
        return new x4(imageLocation2, forUserOrChat2, imageLocation, str2, str, attachFileName, bitmapDrawable, userFull.user, d5VarArr, null);
    }
}
