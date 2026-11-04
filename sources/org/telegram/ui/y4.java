package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;
public final class y4 {
    public final org.telegram.messenger.ac f52172a;
    public final org.telegram.messenger.ac f52173b;
    public final org.telegram.messenger.ac f52174c;
    public final String d;
    public final String f52175e;
    public final String f52176f;
    public final BitmapDrawable f52177g;
    public final Object h;
    public final e5[] f52178i;
    public final a5 f52179j;

    public y4(org.telegram.messenger.ac acVar, org.telegram.messenger.ac acVar2, org.telegram.messenger.ac acVar3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, e5[] e5VarArr, a5 a5Var) {
        this.f52172a = acVar;
        this.f52173b = acVar2;
        this.f52174c = acVar3;
        this.d = str;
        this.f52175e = str2;
        this.f52176f = str3;
        this.f52177g = bitmapDrawable;
        this.h = obj;
        this.f52178i = e5VarArr;
        this.f52179j = a5Var;
    }

    public static y4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, e5... e5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.ac acVar;
        String str2;
        TLRPC.ChatPhoto chatPhoto;
        org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 0, chat);
        org.telegram.messenger.ac m11 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 1, chat);
        String str3 = null;
        if (m11 != null && (m11.f21492k instanceof TLRPC.TL_photoStrippedSize)) {
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
            acVar = org.telegram.messenger.ac.j(x10, chatFull.chat_photo);
            str2 = org.telegram.messenger.w7.r(null, x10);
        } else {
            acVar = null;
            str2 = null;
        }
        if (acVar != null && acVar.f21497p == 2) {
            str3 = "g";
        }
        return new y4(m10, m11, acVar, str, str3, str2, bitmapDrawable, chat, e5VarArr, null);
    }

    public static y4 b(TLRPC.User user, int i3, e5... e5VarArr) {
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 0, user);
        org.telegram.messenger.ac m11 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        if (m11 != null && (m11.f21492k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new y4(m10, m11, null, str, null, null, bitmapDrawable, user, e5VarArr, new a5(i3, org.telegram.messenger.hs.E0, user));
    }

    public static y4 c(TLRPC.User user, TLRPC.UserFull userFull, e5... e5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.ac acVar;
        String str2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 0, userFull.user);
        String str3 = null;
        if (m10 == null && (photo = userFull.profile_photo) != null) {
            m10 = org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        org.telegram.messenger.ac acVar2 = m10;
        org.telegram.messenger.ac m11 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 1, userFull.user);
        if (m11 != null && (m11.f21492k instanceof TLRPC.TL_photoStrippedSize)) {
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
            org.telegram.messenger.ac j10 = org.telegram.messenger.ac.j(x10, userFull.profile_photo);
            str2 = org.telegram.messenger.w7.r(null, x10);
            acVar = j10;
        } else {
            acVar = null;
            str2 = null;
        }
        if (acVar != null && acVar.f21497p == 2) {
            str3 = "g";
        }
        return new y4(acVar2, m11, acVar, str, str3, str2, bitmapDrawable, userFull.user, e5VarArr, null);
    }
}
