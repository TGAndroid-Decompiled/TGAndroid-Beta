package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zh1 {
    public String f44151a;
    public final int f44152b;
    public final int f44153c;
    public final int d;
    public final int e;
    public int f44154f;
    public TLRPC.TL_wallPaper f44155g;
    public float h;
    public final File f44156i;
    public final boolean f44157j;
    public final boolean f44158k;
    public TLRPC.WallPaper f44159l;
    public Bitmap f44160m;

    public zh1(int i10, int i11, String str, int i12) {
        this.f44151a = str;
        this.f44152b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f44153c = i13;
        this.f44154f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f44152b));
        sb2.append(this.f44153c);
        sb2.append(this.d);
        sb2.append(this.e);
        sb2.append(this.f44154f);
        sb2.append(this.h);
        String str = this.f44151a;
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
        int i10 = this.f44153c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f44152b;
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
            if (this.f44155g != null) {
                StringBuilder i14 = si.o0.i(D, "&rotation=");
                i14.append(AndroidUtilities.getWallpaperRotation(this.f44154f, true));
                lowerCase = i14.toString();
            } else {
                StringBuilder i15 = si.o0.i(D, "?rotation=");
                i15.append(AndroidUtilities.getWallpaperRotation(this.f44154f, true));
                lowerCase = i15.toString();
            }
        }
        if (this.f44155g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f44155g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f44157j) {
                return si.o0.u(str4, "&mode=motion");
            }
            return str4;
        }
        return a1.g.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public zh1(String str, int i10, int i11, int i12, int i13) {
        this.f44151a = str;
        this.f44152b = i10 | (-16777216);
        this.f44153c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f44158k = true;
    }

    public zh1(String str, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, File file) {
        this.f44151a = str;
        this.f44152b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f44153c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f44154f = i15 == 0 ? 45 : i14;
        this.h = f7;
        this.f44156i = file;
        this.f44157j = z10;
    }
}
