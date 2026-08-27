package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class wh1 {

    public String f44120a;

    public final int f44121b;

    public final int f44122c;
    public final int d;

    public final int f44123e;

    public int f44124f;

    public TLRPC.TL_wallPaper f44125g;
    public float h;

    public final File f44126i;

    public final boolean f44127j;

    public final boolean f44128k;

    public TLRPC.WallPaper f44129l;

    public Bitmap f44130m;

    public wh1(int i10, int i11, String str, int i12) {
        this.f44120a = str;
        this.f44121b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f44122c = i13;
        this.f44124f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f44121b));
        sb2.append(this.f44122c);
        sb2.append(this.d);
        sb2.append(this.f44123e);
        sb2.append(this.f44124f);
        sb2.append(this.h);
        String str = this.f44120a;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return Utilities.MD5(sb2.toString());
    }

    public final String b() {
        int i10 = this.f44122c;
        String lowerCase = i10 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase() : null;
        int i11 = this.f44121b;
        String lowerCase2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        String lowerCase3 = i12 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase() : null;
        int i13 = this.f44123e;
        String lowerCase4 = i13 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (i13 >> 8)) & 255), Byte.valueOf((byte) (i13 & 255))).toLowerCase() : null;
        if (lowerCase == null || lowerCase3 == null) {
            if (lowerCase != null) {
                String strW = a9.p.w(lowerCase2, "-", lowerCase);
                if (this.f44125g != null) {
                    StringBuilder sbF = s3.c.f(strW, "&rotation=");
                    sbF.append(AndroidUtilities.getWallpaperRotation(this.f44124f, true));
                    lowerCase2 = sbF.toString();
                } else {
                    StringBuilder sbF2 = s3.c.f(strW, "?rotation=");
                    sbF2.append(AndroidUtilities.getWallpaperRotation(this.f44124f, true));
                    lowerCase2 = sbF2.toString();
                }
            }
        } else if (lowerCase4 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lowerCase2);
            sb2.append("~");
            sb2.append(lowerCase);
            sb2.append("~");
            sb2.append(lowerCase3);
            lowerCase2 = a9.p.p(sb2, "~", lowerCase4);
        } else {
            lowerCase2 = lowerCase2 + "~" + lowerCase + "~" + lowerCase3;
        }
        if (this.f44125g == null) {
            return a9.p.n(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase2, new StringBuilder("https://"));
        }
        String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f44125g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase2;
        return this.f44127j ? s3.c.l(str, "&mode=motion") : str;
    }

    public wh1(String str, int i10, int i11, int i12, int i13) {
        this.f44120a = str;
        this.f44121b = i10 | (-16777216);
        this.f44122c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f44123e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f44128k = true;
    }

    public wh1(String str, int i10, int i11, int i12, int i13, int i14, float f10, boolean z10, File file) {
        this.f44120a = str;
        this.f44121b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f44122c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f44123e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f44124f = i15 == 0 ? 45 : i14;
        this.h = f10;
        this.f44126i = file;
        this.f44127j = z10;
    }
}
