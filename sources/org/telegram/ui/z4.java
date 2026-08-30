package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class z4 {
    public final ImageLocation f40663a;
    public final ImageLocation f40664b;
    public final ImageLocation f40665c;
    public final String d;
    public final String e;
    public final String f40666f;
    public final BitmapDrawable f40667g;
    public final Object h;
    public final f5[] f40668i;
    public final b5 f40669j;

    public z4(ImageLocation imageLocation, ImageLocation imageLocation2, ImageLocation imageLocation3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, f5[] f5VarArr, b5 b5Var) {
        this.f40663a = imageLocation;
        this.f40664b = imageLocation2;
        this.f40665c = imageLocation3;
        this.d = str;
        this.e = str2;
        this.f40666f = str3;
        this.f40667g = bitmapDrawable;
        this.h = obj;
        this.f40668i = f5VarArr;
        this.f40669j = b5Var;
    }

    public static z4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, f5... f5VarArr) {
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
        return new z4(forUserOrChat, forUserOrChat2, imageLocation, str, str3, str2, bitmapDrawable, chat, f5VarArr, null);
    }

    public static z4 b(TLRPC.User user, int i10, f5... f5VarArr) {
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
        return new z4(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, user, f5VarArr, new b5(i10, user, NotificationCenter.userInfoDidLoad));
    }

    public static z4 c(TLRPC.User user, TLRPC.UserFull userFull, f5... f5VarArr) {
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
        return new z4(imageLocation2, forUserOrChat2, imageLocation, str, str3, str2, bitmapDrawable, userFull.user, f5VarArr, null);
    }
}
