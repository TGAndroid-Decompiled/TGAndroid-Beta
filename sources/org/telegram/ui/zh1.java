package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zh1 {
    public String f45225a;
    public final int f45226b;
    public final int f45227c;
    public final int d;
    public final int f45228e;
    public int f45229f;
    public TLRPC.TL_wallPaper f45230g;
    public float h;
    public final File f45231i;
    public final boolean f45232j;
    public final boolean f45233k;
    public TLRPC.WallPaper f45234l;
    public Bitmap f45235m;

    public zh1(int i10, int i11, String str, int i12) {
        this.f45225a = str;
        this.f45226b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f45227c = i13;
        this.f45229f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f45226b));
        sb2.append(this.f45227c);
        sb2.append(this.d);
        sb2.append(this.f45228e);
        sb2.append(this.f45229f);
        sb2.append(this.h);
        String str = this.f45225a;
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
        int i10 = this.f45227c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f45226b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        if (i12 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i13 = this.f45228e;
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
                lowerCase = a4.w.q(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String y8 = a4.w.y(lowerCase, "-", str);
            if (this.f45230g != null) {
                StringBuilder f9 = u3.c.f(y8, "&rotation=");
                f9.append(AndroidUtilities.getWallpaperRotation(this.f45229f, true));
                lowerCase = f9.toString();
            } else {
                StringBuilder f10 = u3.c.f(y8, "?rotation=");
                f10.append(AndroidUtilities.getWallpaperRotation(this.f45229f, true));
                lowerCase = f10.toString();
            }
        }
        if (this.f45230g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f45230g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f45232j) {
                return u3.c.k(str4, "&mode=motion");
            }
            return str4;
        }
        return a4.w.o(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public zh1(String str, int i10, int i11, int i12, int i13) {
        this.f45225a = str;
        this.f45226b = i10 | (-16777216);
        this.f45227c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f45228e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f45233k = true;
    }

    public zh1(String str, int i10, int i11, int i12, int i13, int i14, float f9, boolean z10, File file) {
        this.f45225a = str;
        this.f45226b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f45227c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f45228e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f45229f = i15 == 0 ? 45 : i14;
        this.h = f9;
        this.f45231i = file;
        this.f45232j = z10;
    }
}
