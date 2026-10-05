package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wi1 {
    public String f42567a;
    public final int f42568b;
    public final int f42569c;
    public final int d;
    public final int f42570e;
    public int f42571f;
    public TLRPC.TL_wallPaper f42572g;
    public float h;
    public final File f42573i;
    public final boolean f42574j;
    public final boolean f42575k;
    public TLRPC.WallPaper f42576l;
    public Bitmap f42577m;

    public wi1(int i10, int i11, String str, int i12) {
        this.f42567a = str;
        this.f42568b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f42569c = i13;
        this.f42571f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f42568b));
        sb2.append(this.f42569c);
        sb2.append(this.d);
        sb2.append(this.f42570e);
        sb2.append(this.f42571f);
        sb2.append(this.h);
        String str = this.f42567a;
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
        int i10 = this.f42569c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f42568b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        if (i12 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i13 = this.f42570e;
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
            if (this.f42572g != null) {
                StringBuilder j3 = sa.e.j(D, "&rotation=");
                j3.append(AndroidUtilities.getWallpaperRotation(this.f42571f, true));
                lowerCase = j3.toString();
            } else {
                StringBuilder j10 = sa.e.j(D, "?rotation=");
                j10.append(AndroidUtilities.getWallpaperRotation(this.f42571f, true));
                lowerCase = j10.toString();
            }
        }
        if (this.f42572g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f42572g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f42574j) {
                return sa.e.v(str4, "&mode=motion");
            }
            return str4;
        }
        return a4.a.r(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public wi1(String str, int i10, int i11, int i12, int i13) {
        this.f42567a = str;
        this.f42568b = i10 | (-16777216);
        this.f42569c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f42570e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f42575k = true;
    }

    public wi1(String str, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, File file) {
        this.f42567a = str;
        this.f42568b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f42569c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f42570e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f42571f = i15 == 0 ? 45 : i14;
        this.h = f7;
        this.f42573i = file;
        this.f42574j = z10;
    }
}
