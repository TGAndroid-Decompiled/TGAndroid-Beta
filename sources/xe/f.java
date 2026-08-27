package xe;

import android.net.Uri;
import android.os.Bundle;
import f2.e1;
import m5.l;

public final class f {

    public final String f49407a;

    public final l f49408b;

    public final Uri f49409c;
    public final String d;

    public final int f49410e;

    public final int f49411f;

    public f(e1 e1Var) {
        l lVar;
        Bundle bundle;
        StringBuilder sb2;
        StringBuilder sb3;
        String str;
        String str2;
        int i10;
        String str3 = (String) e1Var.f5649c;
        this.f49407a = str3;
        str3.getClass();
        int i11 = 3;
        switch (str3) {
            case "image/jpeg":
            case "image/png":
                i11 = 4;
                lVar = (l) e1Var.f5651f;
                lVar = lVar == null ? new l(i11) : lVar;
                bundle = lVar.f17808b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str = (String) e1Var.f5652g;
                if (str != null) {
                    sb2.append(str);
                }
                str2 = (String) e1Var.h;
                if (str2 != null) {
                    sb3.append(str2);
                }
                i10 = e1Var.f5647a;
                if (i10 != 0 && e1Var.f5648b != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                    int i12 = e1Var.f5648b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i12);
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append("(");
                    sb3.append(e1Var.f5647a);
                    sb3.append("x");
                    sb3.append(e1Var.f5648b);
                    sb3.append(")");
                }
                if (sb2.length() > 0) {
                    lVar.b("com.google.android.gms.cast.metadata.TITLE", sb2.toString());
                } else {
                    lVar.b("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb3.length() > 0) {
                    lVar.b("com.google.android.gms.cast.metadata.SUBTITLE", sb3.toString());
                    break;
                }
                break;
            case "application/x-mpegURL":
            case "video/mp4":
                i11 = 1;
                lVar = (l) e1Var.f5651f;
                if (lVar == null) {
                }
                bundle = lVar.f17808b;
                sb2 = new StringBuilder();
                sb3 = new StringBuilder();
                str = (String) e1Var.f5652g;
                if (str != null) {
                    sb2.append(str);
                }
                str2 = (String) e1Var.h;
                if (str2 != null) {
                    sb3.append(str2);
                }
                i10 = e1Var.f5647a;
                if (i10 != 0) {
                    l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                    bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                    int i13 = e1Var.f5648b;
                    l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                    bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i13);
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append("(");
                    sb3.append(e1Var.f5647a);
                    sb3.append("x");
                    sb3.append(e1Var.f5648b);
                    sb3.append(")");
                }
                if (sb2.length() > 0) {
                    lVar.b("com.google.android.gms.cast.metadata.TITLE", sb2.toString());
                } else {
                    lVar.b("com.google.android.gms.cast.metadata.TITLE", "No Title");
                }
                if (sb3.length() > 0) {
                    lVar.b("com.google.android.gms.cast.metadata.SUBTITLE", sb3.toString());
                    break;
                }
                break;
            default:
                if (str3.startsWith("audio/")) {
                    lVar = (l) e1Var.f5651f;
                    if (lVar == null) {
                    }
                    bundle = lVar.f17808b;
                    sb2 = new StringBuilder();
                    sb3 = new StringBuilder();
                    str = (String) e1Var.f5652g;
                    if (str != null) {
                        sb2.append(str);
                    }
                    str2 = (String) e1Var.h;
                    if (str2 != null) {
                        sb3.append(str2);
                    }
                    i10 = e1Var.f5647a;
                    if (i10 != 0) {
                        l.c(2, "com.google.android.gms.cast.metadata.WIDTH");
                        bundle.putInt("com.google.android.gms.cast.metadata.WIDTH", i10);
                        int i14 = e1Var.f5648b;
                        l.c(2, "com.google.android.gms.cast.metadata.HEIGHT");
                        bundle.putInt("com.google.android.gms.cast.metadata.HEIGHT", i14);
                        if (sb3.length() > 0) {
                            sb3.append(' ');
                        }
                        sb3.append("(");
                        sb3.append(e1Var.f5647a);
                        sb3.append("x");
                        sb3.append(e1Var.f5648b);
                        sb3.append(")");
                    }
                    if (sb2.length() > 0) {
                        lVar.b("com.google.android.gms.cast.metadata.TITLE", sb2.toString());
                    } else {
                        lVar.b("com.google.android.gms.cast.metadata.TITLE", "No Title");
                    }
                    if (sb3.length() > 0) {
                        lVar.b("com.google.android.gms.cast.metadata.SUBTITLE", sb3.toString());
                    }
                    break;
                } else {
                    lVar = null;
                    break;
                }
                break;
        }
        this.f49408b = lVar;
        this.f49409c = (Uri) e1Var.d;
        this.d = (String) e1Var.f5650e;
        this.f49410e = e1Var.f5647a;
        this.f49411f = e1Var.f5648b;
    }
}
