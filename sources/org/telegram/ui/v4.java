package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;
public final class v4 {
    public final org.telegram.messenger.ic f42590a;
    public final org.telegram.messenger.ic f42591b;
    public final org.telegram.messenger.ic f42592c;
    public final String d;
    public final String e;
    public final String f42593f;
    public final BitmapDrawable f42594g;
    public final Object h;
    public final b5[] f42595i;
    public final x4 f42596j;

    public v4(org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2, org.telegram.messenger.ic icVar3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, b5[] b5VarArr, x4 x4Var) {
        this.f42590a = icVar;
        this.f42591b = icVar2;
        this.f42592c = icVar3;
        this.d = str;
        this.e = str2;
        this.f42593f = str3;
        this.f42594g = bitmapDrawable;
        this.h = obj;
        this.f42595i = b5VarArr;
        this.f42596j = x4Var;
    }

    public static v4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, b5... b5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.ic icVar;
        String str2;
        TLRPC.ChatPhoto chatPhoto;
        org.telegram.messenger.ic m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 0, chat);
        org.telegram.messenger.ic m11 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 1, chat);
        String str3 = null;
        if (m11 != null && (m11.f16104k instanceof TLRPC.TL_photoStrippedSize)) {
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
            TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, chatFull.chat_photo.video_sizes);
            icVar = org.telegram.messenger.ic.j(x10, chatFull.chat_photo);
            str2 = org.telegram.messenger.b8.r(null, x10);
        } else {
            icVar = null;
            str2 = null;
        }
        if (icVar != null && icVar.f16109p == 2) {
            str3 = "g";
        }
        return new v4(m10, m11, icVar, str, str3, str2, bitmapDrawable, chat, b5VarArr, null);
    }

    public static v4 b(TLRPC.User user, int i10, b5... b5VarArr) {
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.messenger.ic m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 0, user);
        org.telegram.messenger.ic m11 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        if (m11 != null && (m11.f16104k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new v4(m10, m11, null, str, null, null, bitmapDrawable, user, b5VarArr, new x4(i10, org.telegram.messenger.zs.E0, user));
    }

    public static v4 c(TLRPC.User user, TLRPC.UserFull userFull, b5... b5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.ic icVar;
        String str2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        org.telegram.messenger.ic m10 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 0, userFull.user);
        String str3 = null;
        if (m10 == null && (photo = userFull.profile_photo) != null) {
            m10 = org.telegram.messenger.ic.i(org.telegram.messenger.b8.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        org.telegram.messenger.ic icVar2 = m10;
        org.telegram.messenger.ic m11 = org.telegram.messenger.ic.m(org.telegram.messenger.d20.f15147s0, 1, userFull.user);
        if (m11 != null && (m11.f16104k instanceof TLRPC.TL_photoStrippedSize)) {
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
            TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, userFull.profile_photo.video_sizes);
            org.telegram.messenger.ic j10 = org.telegram.messenger.ic.j(x10, userFull.profile_photo);
            str2 = org.telegram.messenger.b8.r(null, x10);
            icVar = j10;
        } else {
            icVar = null;
            str2 = null;
        }
        if (icVar != null && icVar.f16109p == 2) {
            str3 = "g";
        }
        return new v4(icVar2, m11, icVar, str, str3, str2, bitmapDrawable, userFull.user, b5VarArr, null);
    }
}
