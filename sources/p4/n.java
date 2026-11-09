package p4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
public abstract class n {
    public static final int f53399a = 0;

    static {
        h9.t0.s("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    public static long a(int i7) {
        switch (i7) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(jg.g.j(i7, "Unrecognized FolderType: "));
        }
    }

    public static q4.i b(e2.o0 o0Var, String str, Uri uri, long j3, Bitmap bitmap) {
        Long l10;
        ?? obj = new Object();
        obj.f53824a = new Bundle();
        obj.f("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = o0Var.f10427a;
        Bundle bundle = o0Var.J;
        Integer num = o0Var.f10441q;
        Uri uri2 = o0Var.f10438n;
        if (charSequence != null) {
            obj.g(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = o0Var.f10430e;
        if (charSequence2 != null) {
            obj.g(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = o0Var.f10431f;
        if (charSequence3 != null) {
            obj.g(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = o0Var.f10432g;
        if (charSequence4 != null) {
            obj.g(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = o0Var.f10428b;
        if (charSequence5 != null) {
            obj.g(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = o0Var.f10429c;
        if (charSequence6 != null) {
            obj.g(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = o0Var.d;
        if (charSequence7 != null) {
            obj.g(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = o0Var.f10445u;
        if (num2 != null) {
            obj.d(num2.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = o0Var.A;
        if (charSequence8 != null) {
            obj.g(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = o0Var.B;
        if (charSequence9 != null) {
            obj.g(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            obj.f("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            obj.f("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            obj.f("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            obj.f("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            obj.c("android.media.metadata.DISPLAY_ICON", bitmap);
            obj.c("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            obj.d(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j3 == -9223372036854775807L && (l10 = o0Var.h) != null) {
            j3 = l10.longValue();
        }
        if (j3 == -9223372036854775807L) {
            j3 = -1;
        }
        obj.d(j3, "android.media.metadata.DURATION");
        q4.y d = d(o0Var.f10433i);
        if (d != null) {
            obj.e("android.media.metadata.USER_RATING", d);
        }
        q4.y d2 = d(o0Var.f10434j);
        if (d2 != null) {
            obj.e("android.media.metadata.RATING", d2);
        }
        Integer num3 = o0Var.I;
        if (num3 != null) {
            obj.d(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (obj2 != null && !(obj2 instanceof CharSequence)) {
                    if ((obj2 instanceof Byte) || (obj2 instanceof Short) || (obj2 instanceof Integer) || (obj2 instanceof Long)) {
                        obj.d(((Number) obj2).longValue(), str2);
                    }
                } else {
                    obj.g((CharSequence) obj2, str2);
                }
            }
        }
        return new q4.i((Bundle) obj.f53824a);
    }

    public static e2.d1 c(q4.y yVar) {
        if (yVar != null) {
            float f10 = yVar.f53840b;
            int i7 = yVar.f53839a;
            boolean z9 = true;
            switch (i7) {
                case 1:
                    if (yVar.b()) {
                        if (i7 != 1 || f10 != 1.0f) {
                            z9 = false;
                        }
                        return new e2.w(z9);
                    }
                    return new e2.w();
                case 2:
                    if (yVar.b()) {
                        if (i7 != 2 || f10 != 1.0f) {
                            z9 = false;
                        }
                        return new e2.g1(z9);
                    }
                    return new e2.g1();
                case 3:
                    if (yVar.b()) {
                        return new e2.e1(3, yVar.a());
                    }
                    return new e2.e1(3);
                case 4:
                    if (yVar.b()) {
                        return new e2.e1(4, yVar.a());
                    }
                    return new e2.e1(4);
                case 5:
                    if (yVar.b()) {
                        return new e2.e1(5, yVar.a());
                    }
                    return new e2.e1(5);
                case 6:
                    if (yVar.b()) {
                        return new e2.u0((i7 == 6 && yVar.b()) ? -1.0f : -1.0f);
                    }
                    return new e2.u0();
                default:
                    return null;
            }
        }
        return null;
    }

    public static q4.y d(e2.d1 d1Var) {
        if (d1Var != null) {
            int e10 = e(d1Var);
            if (!d1Var.b()) {
                switch (e10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new q4.y(e10, -1.0f);
                    default:
                        return null;
                }
            }
            float f10 = 0.0f;
            switch (e10) {
                case 1:
                    if (((e2.w) d1Var).f10635c) {
                        f10 = 1.0f;
                    }
                    return new q4.y(1, f10);
                case 2:
                    if (((e2.g1) d1Var).f10267c) {
                        f10 = 1.0f;
                    }
                    return new q4.y(2, f10);
                case 3:
                case 4:
                case 5:
                    return q4.y.d(((e2.e1) d1Var).f10235c, e10);
                case 6:
                    return q4.y.c(((e2.u0) d1Var).f10623b);
            }
        }
        return null;
    }

    public static int e(e2.d1 d1Var) {
        if (d1Var instanceof e2.w) {
            return 1;
        }
        if (d1Var instanceof e2.g1) {
            return 2;
        }
        if (d1Var instanceof e2.e1) {
            int i7 = ((e2.e1) d1Var).f10234b;
            int i10 = 3;
            if (i7 != 3) {
                i10 = 4;
                if (i7 != 4) {
                    i10 = 5;
                    if (i7 != 5) {
                        return 0;
                    }
                }
            }
            return i10;
        } else if (d1Var instanceof e2.u0) {
            return 6;
        } else {
            return 0;
        }
    }
}
