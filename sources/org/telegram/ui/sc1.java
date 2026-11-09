package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class sc1 {
    public String f49874a;
    public final int f49875b;
    public final int f49876c;
    public final int d;
    public final int f49877e;
    public int f49878f;
    public TLRPC.TL_wallPaper f49879g;
    public float h;
    public final File f49880i;
    public final boolean f49881j;
    public final boolean f49882k;
    public TLRPC.WallPaper f49883l;
    public Bitmap f49884m;

    public sc1(int i7, int i10, int i11, String str) {
        this.f49874a = str;
        this.f49875b = i7 | (-16777216);
        int i12 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f49876c = i12;
        this.f49878f = i12 == 0 ? 0 : i11;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f49875b));
        sb2.append(this.f49876c);
        sb2.append(this.d);
        sb2.append(this.f49877e);
        sb2.append(this.f49878f);
        sb2.append(this.h);
        String str = this.f49874a;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return Utilities.a(sb2.toString());
    }

    public final String b() {
        String str;
        String str2;
        String str3 = null;
        int i7 = this.f49876c;
        if (i7 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i7 >> 16)) & 255), Integer.valueOf(((byte) (i7 >> 8)) & 255), Byte.valueOf((byte) (i7 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i10 = this.f49875b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        int i11 = this.d;
        if (i11 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i12 = this.f49877e;
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
                lowerCase = a8.p0.s(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String D = a8.p0.D(lowerCase, "-", str);
            if (this.f49879g != null) {
                StringBuilder j3 = rf.b.j(D, "&rotation=");
                j3.append(org.telegram.messenger.g0.s1(this.f49878f, true));
                lowerCase = j3.toString();
            } else {
                StringBuilder j10 = rf.b.j(D, "?rotation=");
                j10.append(org.telegram.messenger.g0.s1(this.f49878f, true));
                lowerCase = j10.toString();
            }
        }
        if (this.f49879g != null) {
            String str4 = "https://" + org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).U2 + "/bg/" + this.f49879g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f49881j) {
                return rf.b.r(str4, "&mode=motion");
            }
            return str4;
        }
        return org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).U2, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public sc1(String str, int i7, int i10, int i11, int i12) {
        this.f49874a = str;
        this.f49875b = i7 | (-16777216);
        this.f49876c = i10 == 0 ? 0 : i10 | (-16777216);
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f49877e = i12 != 0 ? i12 | (-16777216) : 0;
        this.h = 1.0f;
        this.f49882k = true;
    }

    public sc1(String str, int i7, int i10, int i11, int i12, int i13, float f10, boolean z9, File file) {
        this.f49874a = str;
        this.f49875b = i7 | (-16777216);
        int i14 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f49876c = i14;
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f49877e = i12 != 0 ? i12 | (-16777216) : 0;
        this.f49878f = i14 == 0 ? 45 : i13;
        this.h = f10;
        this.f49880i = file;
        this.f49881j = z9;
    }
}
