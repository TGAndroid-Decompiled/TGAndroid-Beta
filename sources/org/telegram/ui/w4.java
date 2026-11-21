package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;
public final class w4 {
    public final org.telegram.messenger.fc f52960a;
    public final org.telegram.messenger.fc f52961b;
    public final org.telegram.messenger.fc f52962c;
    public final String d;
    public final String f52963e;
    public final String f52964f;
    public final BitmapDrawable f52965g;
    public final Object h;
    public final c5[] f52966i;
    public final y4 f52967j;

    public w4(org.telegram.messenger.fc fcVar, org.telegram.messenger.fc fcVar2, org.telegram.messenger.fc fcVar3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, c5[] c5VarArr, y4 y4Var) {
        this.f52960a = fcVar;
        this.f52961b = fcVar2;
        this.f52962c = fcVar3;
        this.d = str;
        this.f52963e = str2;
        this.f52964f = str3;
        this.f52965g = bitmapDrawable;
        this.h = obj;
        this.f52966i = c5VarArr;
        this.f52967j = y4Var;
    }

    public static w4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, c5... c5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.fc fcVar;
        String str2;
        TLRPC.ChatPhoto chatPhoto;
        org.telegram.messenger.fc m10 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24798t0, 0, chat);
        org.telegram.messenger.fc m11 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24798t0, 1, chat);
        String str3 = null;
        if (m11 != null && (m11.f23900k instanceof TLRPC.TL_photoStrippedSize)) {
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
            fcVar = org.telegram.messenger.fc.j(x10, chatFull.chat_photo);
            str2 = org.telegram.messenger.w7.r(null, x10);
        } else {
            fcVar = null;
            str2 = null;
        }
        if (fcVar != null && fcVar.f23905p == 2) {
            str3 = "g";
        }
        return new w4(m10, m11, fcVar, str, str3, str2, bitmapDrawable, chat, c5VarArr, null);
    }

    public static w4 b(TLRPC.User user, int i7, c5... c5VarArr) {
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.messenger.fc m10 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24798t0, 0, user);
        org.telegram.messenger.fc m11 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24798t0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        if (m11 != null && (m11.f23900k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new w4(m10, m11, null, str, null, null, bitmapDrawable, user, c5VarArr, new y4(i7, org.telegram.messenger.ks.E0, user));
    }

    public static w4 c(TLRPC.User user, TLRPC.UserFull userFull, c5... c5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.fc fcVar;
        String str2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        org.telegram.messenger.fc m10 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24798t0, 0, userFull.user);
        String str3 = null;
        if (m10 == null && (photo = userFull.profile_photo) != null) {
            m10 = org.telegram.messenger.fc.i(org.telegram.messenger.w7.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        org.telegram.messenger.fc fcVar2 = m10;
        org.telegram.messenger.fc m11 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24798t0, 1, userFull.user);
        if (m11 != null && (m11.f23900k instanceof TLRPC.TL_photoStrippedSize)) {
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
            org.telegram.messenger.fc j3 = org.telegram.messenger.fc.j(x10, userFull.profile_photo);
            str2 = org.telegram.messenger.w7.r(null, x10);
            fcVar = j3;
        } else {
            fcVar = null;
            str2 = null;
        }
        if (fcVar != null && fcVar.f23905p == 2) {
            str3 = "g";
        }
        return new w4(fcVar2, m11, fcVar, str, str3, str2, bitmapDrawable, userFull.user, c5VarArr, null);
    }
}
