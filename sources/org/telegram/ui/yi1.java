package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yi1 {
    public String f40166a;
    public final int f40167b;
    public final int f40168c;
    public final int d;
    public final int e;
    public int f40169f;
    public TLRPC.TL_wallPaper f40170g;
    public float h;
    public final File f40171i;
    public final boolean f40172j;
    public final boolean f40173k;
    public TLRPC.WallPaper f40174l;
    public Bitmap f40175m;

    public yi1(int i10, int i11, String str, int i12) {
        this.f40166a = str;
        this.f40167b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f40168c = i13;
        this.f40169f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f40167b));
        sb2.append(this.f40168c);
        sb2.append(this.d);
        sb2.append(this.e);
        sb2.append(this.f40169f);
        sb2.append(this.h);
        String str = this.f40166a;
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
        int i10 = this.f40168c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f40167b;
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
                lowerCase = a4.a.t(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String D = a4.a.D(lowerCase, "-", str);
            if (this.f40170g != null) {
                StringBuilder h = v7.j.h(D, "&rotation=");
                h.append(AndroidUtilities.getWallpaperRotation(this.f40169f, true));
                lowerCase = h.toString();
            } else {
                StringBuilder h10 = v7.j.h(D, "?rotation=");
                h10.append(AndroidUtilities.getWallpaperRotation(this.f40169f, true));
                lowerCase = h10.toString();
            }
        }
        if (this.f40170g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f40170g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f40172j) {
                return v7.j.t(str4, "&mode=motion");
            }
            return str4;
        }
        return a4.a.r(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public yi1(String str, int i10, int i11, int i12, int i13) {
        this.f40166a = str;
        this.f40167b = i10 | (-16777216);
        this.f40168c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f40173k = true;
    }

    public yi1(String str, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, File file) {
        this.f40166a = str;
        this.f40167b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f40168c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f40169f = i15 == 0 ? 45 : i14;
        this.h = f7;
        this.f40171i = file;
        this.f40172j = z10;
    }
}
