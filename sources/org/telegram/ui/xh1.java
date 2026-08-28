package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xh1 {
    public String f44520a;
    public final int f44521b;
    public final int f44522c;
    public final int d;
    public final int f44523e;
    public int f44524f;
    public TLRPC.TL_wallPaper f44525g;
    public float h;
    public final File f44526i;
    public final boolean f44527j;
    public final boolean f44528k;
    public TLRPC.WallPaper f44529l;
    public Bitmap f44530m;

    public xh1(int i9, int i10, String str, int i11) {
        this.f44520a = str;
        this.f44521b = i9 | (-16777216);
        int i12 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f44522c = i12;
        this.f44524f = i12 == 0 ? 0 : i11;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f44521b));
        sb2.append(this.f44522c);
        sb2.append(this.d);
        sb2.append(this.f44523e);
        sb2.append(this.f44524f);
        sb2.append(this.h);
        String str = this.f44520a;
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
        int i9 = this.f44522c;
        if (i9 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i9 >> 16)) & 255), Integer.valueOf(((byte) (i9 >> 8)) & 255), Byte.valueOf((byte) (i9 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i10 = this.f44521b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        int i11 = this.d;
        if (i11 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i12 = this.f44523e;
        if (i12 != 0) {
            str3 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        }
        if (str != null && str2 != null) {
            if (str3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lowerCase);
                sb2.append("~");
                sb2.append(str);
                sb2.append("~");
                sb2.append(str2);
                lowerCase = aa.d.r(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String z10 = aa.d.z(lowerCase, "-", str);
            if (this.f44525g != null) {
                StringBuilder e10 = ta.b.e(z10, "&rotation=");
                e10.append(AndroidUtilities.getWallpaperRotation(this.f44524f, true));
                lowerCase = e10.toString();
            } else {
                StringBuilder e11 = ta.b.e(z10, "?rotation=");
                e11.append(AndroidUtilities.getWallpaperRotation(this.f44524f, true));
                lowerCase = e11.toString();
            }
        }
        if (this.f44525g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f44525g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f44527j) {
                return ta.b.j(str4, "&mode=motion");
            }
            return str4;
        }
        return aa.d.p(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public xh1(String str, int i9, int i10, int i11, int i12) {
        this.f44520a = str;
        this.f44521b = i9 | (-16777216);
        this.f44522c = i10 == 0 ? 0 : i10 | (-16777216);
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f44523e = i12 != 0 ? i12 | (-16777216) : 0;
        this.h = 1.0f;
        this.f44528k = true;
    }

    public xh1(String str, int i9, int i10, int i11, int i12, int i13, float f10, boolean z10, File file) {
        this.f44520a = str;
        this.f44521b = i9 | (-16777216);
        int i14 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f44522c = i14;
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f44523e = i12 != 0 ? i12 | (-16777216) : 0;
        this.f44524f = i14 == 0 ? 45 : i13;
        this.h = f10;
        this.f44526i = file;
        this.f44527j = z10;
    }
}
