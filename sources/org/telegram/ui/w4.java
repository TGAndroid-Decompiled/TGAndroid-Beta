package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;
public final class w4 {
    public final org.telegram.messenger.gc f52393a;
    public final org.telegram.messenger.gc f52394b;
    public final org.telegram.messenger.gc f52395c;
    public final String d;
    public final String f52396e;
    public final String f52397f;
    public final BitmapDrawable f52398g;
    public final Object h;
    public final c5[] f52399i;
    public final y4 f52400j;

    public w4(org.telegram.messenger.gc gcVar, org.telegram.messenger.gc gcVar2, org.telegram.messenger.gc gcVar3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, c5[] c5VarArr, y4 y4Var) {
        this.f52393a = gcVar;
        this.f52394b = gcVar2;
        this.f52395c = gcVar3;
        this.d = str;
        this.f52396e = str2;
        this.f52397f = str3;
        this.f52398g = bitmapDrawable;
        this.h = obj;
        this.f52399i = c5VarArr;
        this.f52400j = y4Var;
    }

    public static w4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, c5... c5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.gc gcVar;
        String str2;
        TLRPC.ChatPhoto chatPhoto;
        org.telegram.messenger.gc m10 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24940t0, 0, chat);
        org.telegram.messenger.gc m11 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24940t0, 1, chat);
        String str3 = null;
        if (m11 != null && (m11.f23721k instanceof TLRPC.TL_photoStrippedSize)) {
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
            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, chatFull.chat_photo.video_sizes);
            gcVar = org.telegram.messenger.gc.j(x10, chatFull.chat_photo);
            str2 = org.telegram.messenger.w7.r(null, x10);
        } else {
            gcVar = null;
            str2 = null;
        }
        if (gcVar != null && gcVar.f23726p == 2) {
            str3 = "g";
        }
        return new w4(m10, m11, gcVar, str, str3, str2, bitmapDrawable, chat, c5VarArr, null);
    }

    public static w4 b(TLRPC.User user, int i7, c5... c5VarArr) {
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.messenger.gc m10 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24940t0, 0, user);
        org.telegram.messenger.gc m11 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24940t0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        if (m11 != null && (m11.f23721k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new w4(m10, m11, null, str, null, null, bitmapDrawable, user, c5VarArr, new y4(i7, org.telegram.messenger.ns.E0, user));
    }

    public static w4 c(TLRPC.User user, TLRPC.UserFull userFull, c5... c5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.gc gcVar;
        String str2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        org.telegram.messenger.gc m10 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24940t0, 0, userFull.user);
        String str3 = null;
        if (m10 == null && (photo = userFull.profile_photo) != null) {
            m10 = org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        org.telegram.messenger.gc gcVar2 = m10;
        org.telegram.messenger.gc m11 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24940t0, 1, userFull.user);
        if (m11 != null && (m11.f23721k instanceof TLRPC.TL_photoStrippedSize)) {
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
            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, userFull.profile_photo.video_sizes);
            org.telegram.messenger.gc j3 = org.telegram.messenger.gc.j(x10, userFull.profile_photo);
            str2 = org.telegram.messenger.w7.r(null, x10);
            gcVar = j3;
        } else {
            gcVar = null;
            str2 = null;
        }
        if (gcVar != null && gcVar.f23726p == 2) {
            str3 = "g";
        }
        return new w4(gcVar2, m11, gcVar, str, str3, str2, bitmapDrawable, userFull.user, c5VarArr, null);
    }
}
