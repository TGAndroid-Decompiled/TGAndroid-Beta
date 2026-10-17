package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uh1 {
    public String f41992a;
    public final int f41993b;
    public final int f41994c;
    public final int d;
    public final int e;
    public int f41995f;
    public TLRPC.TL_wallPaper f41996g;
    public float h;
    public final File f41997i;
    public final boolean f41998j;
    public final boolean f41999k;
    public TLRPC.WallPaper f42000l;
    public Bitmap f42001m;

    public uh1(int i10, int i11, String str, int i12) {
        this.f41992a = str;
        this.f41993b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f41994c = i13;
        this.f41995f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f41993b));
        sb2.append(this.f41994c);
        sb2.append(this.d);
        sb2.append(this.e);
        sb2.append(this.f41995f);
        sb2.append(this.h);
        String str = this.f41992a;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return Utilities.MD5(sb2.toString());
    }

    public final String b() {
        String str;
        String str2;
        String str3 = null;
        int i10 = this.f41994c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f41993b;
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
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lowerCase);
                sb2.append("~");
                sb2.append(str);
                sb2.append("~");
                sb2.append(str2);
                lowerCase = a1.g.s(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String D = a1.g.D(lowerCase, "-", str);
            if (this.f41996g != null) {
                StringBuilder i14 = r.c.i(D, "&rotation=");
                i14.append(AndroidUtilities.getWallpaperRotation(this.f41995f, true));
                lowerCase = i14.toString();
            } else {
                StringBuilder i15 = r.c.i(D, "?rotation=");
                i15.append(AndroidUtilities.getWallpaperRotation(this.f41995f, true));
                lowerCase = i15.toString();
            }
        }
        if (this.f41996g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f41996g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f41998j) {
                return r.c.u(str4, "&mode=motion");
            }
            return str4;
        }
        return a1.g.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public uh1(String str, int i10, int i11, int i12, int i13) {
        this.f41992a = str;
        this.f41993b = i10 | (-16777216);
        this.f41994c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f41999k = true;
    }

    public uh1(String str, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, File file) {
        this.f41992a = str;
        this.f41993b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f41994c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f41995f = i15 == 0 ? 45 : i14;
        this.h = f7;
        this.f41997i = file;
        this.f41998j = z10;
    }
}
