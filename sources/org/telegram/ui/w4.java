package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;
public final class w4 {
    public final org.telegram.messenger.hc f50910a;
    public final org.telegram.messenger.hc f50911b;
    public final org.telegram.messenger.hc f50912c;
    public final String d;
    public final String f50913e;
    public final String f50914f;
    public final BitmapDrawable f50915g;
    public final Object h;
    public final c5[] f50916i;
    public final y4 f50917j;

    public w4(org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2, org.telegram.messenger.hc hcVar3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, c5[] c5VarArr, y4 y4Var) {
        this.f50910a = hcVar;
        this.f50911b = hcVar2;
        this.f50912c = hcVar3;
        this.d = str;
        this.f50913e = str2;
        this.f50914f = str3;
        this.f50915g = bitmapDrawable;
        this.h = obj;
        this.f50916i = c5VarArr;
        this.f50917j = y4Var;
    }

    public static w4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, c5... c5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.hc hcVar;
        String str2;
        TLRPC.ChatPhoto chatPhoto;
        org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24459s0, 0, chat);
        org.telegram.messenger.hc m11 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24459s0, 1, chat);
        String str3 = null;
        if (m11 != null && (m11.f22860k instanceof TLRPC.TL_photoStrippedSize)) {
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
            hcVar = org.telegram.messenger.hc.j(x10, chatFull.chat_photo);
            str2 = org.telegram.messenger.w7.r(null, x10);
        } else {
            hcVar = null;
            str2 = null;
        }
        if (hcVar != null && hcVar.f22865p == 2) {
            str3 = "g";
        }
        return new w4(m10, m11, hcVar, str, str3, str2, bitmapDrawable, chat, c5VarArr, null);
    }

    public static w4 b(TLRPC.User user, int i7, c5... c5VarArr) {
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24459s0, 0, user);
        org.telegram.messenger.hc m11 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24459s0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        if (m11 != null && (m11.f22860k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new w4(m10, m11, null, str, null, null, bitmapDrawable, user, c5VarArr, new y4(i7, org.telegram.messenger.qs.E0, user));
    }

    public static w4 c(TLRPC.User user, TLRPC.UserFull userFull, c5... c5VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        org.telegram.messenger.hc hcVar;
        String str2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24459s0, 0, userFull.user);
        String str3 = null;
        if (m10 == null && (photo = userFull.profile_photo) != null) {
            m10 = org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        org.telegram.messenger.hc hcVar2 = m10;
        org.telegram.messenger.hc m11 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.f24459s0, 1, userFull.user);
        if (m11 != null && (m11.f22860k instanceof TLRPC.TL_photoStrippedSize)) {
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
            org.telegram.messenger.hc j3 = org.telegram.messenger.hc.j(x10, userFull.profile_photo);
            str2 = org.telegram.messenger.w7.r(null, x10);
            hcVar = j3;
        } else {
            hcVar = null;
            str2 = null;
        }
        if (hcVar != null && hcVar.f22865p == 2) {
            str3 = "g";
        }
        return new w4(hcVar2, m11, hcVar, str, str3, str2, bitmapDrawable, userFull.user, c5VarArr, null);
    }
}
