package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ui1 {
    public String f38857a;
    public final int f38858b;
    public final int f38859c;
    public final int d;
    public final int e;
    public int f38860f;
    public TLRPC.TL_wallPaper f38861g;
    public float h;
    public final File f38862i;
    public final boolean f38863j;
    public final boolean f38864k;
    public TLRPC.WallPaper f38865l;
    public Bitmap f38866m;

    public ui1(int i10, int i11, String str, int i12) {
        this.f38857a = str;
        this.f38858b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f38859c = i13;
        this.f38860f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f38858b));
        sb.append(this.f38859c);
        sb.append(this.d);
        sb.append(this.e);
        sb.append(this.f38860f);
        sb.append(this.h);
        String str = this.f38857a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return Utilities.MD5(sb.toString());
    }

    public final String b() {
        String str;
        String str2;
        String str3 = null;
        int i10 = this.f38859c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f38858b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        if (i12 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i13 = this.e;
        if (i13 != 0) {
            str3 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (i13 >> 8)) & 255), Byte.valueOf((byte) (i13 & 255))).toLowerCase();
        }
        if (str != null && str2 != null) {
            if (str3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(lowerCase);
                sb.append("~");
                sb.append(str);
                sb.append("~");
                sb.append(str2);
                lowerCase = android.support.v4.media.a.r(sb, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String z4 = android.support.v4.media.a.z(lowerCase, "-", str);
            if (this.f38861g != null) {
                StringBuilder f10 = vh.w2.f(z4, "&rotation=");
                f10.append(AndroidUtilities.getWallpaperRotation(this.f38860f, true));
                lowerCase = f10.toString();
            } else {
                StringBuilder f11 = vh.w2.f(z4, "?rotation=");
                f11.append(AndroidUtilities.getWallpaperRotation(this.f38860f, true));
                lowerCase = f11.toString();
            }
        }
        if (this.f38861g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f38861g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f38863j) {
                return vh.w2.k(str4, "&mode=motion");
            }
            return str4;
        }
        return android.support.v4.media.a.p(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public ui1(String str, int i10, int i11, int i12, int i13) {
        this.f38857a = str;
        this.f38858b = i10 | (-16777216);
        this.f38859c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f38864k = true;
    }

    public ui1(String str, int i10, int i11, int i12, int i13, int i14, float f10, boolean z4, File file) {
        this.f38857a = str;
        this.f38858b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f38859c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f38860f = i15 == 0 ? 45 : i14;
        this.h = f10;
        this.f38862i = file;
        this.f38863j = z4;
    }
}
