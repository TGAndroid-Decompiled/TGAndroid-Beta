package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

public final class f implements e, g {

    public final int f46584a = 0;

    public ClipData f46585b;

    public int f46586c;
    public int d;

    public Uri f46587e;

    public Bundle f46588f;

    public f() {
    }

    @Override
    public ClipData a() {
        return this.f46585b;
    }

    @Override
    public void b(Uri uri) {
        this.f46587e = uri;
    }

    @Override
    public h build() {
        return new h(new f(this));
    }

    @Override
    public void c(int i10) {
        this.d = i10;
    }

    @Override
    public ContentInfo d() {
        return null;
    }

    @Override
    public int e() {
        return this.f46586c;
    }

    @Override
    public int f() {
        return this.d;
    }

    @Override
    public void setExtras(Bundle bundle) {
        this.f46588f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f46584a) {
            case 1:
                Uri uri = this.f46587e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f46585b.getDescription());
                sb2.append(", source=");
                int i10 = this.f46586c;
                if (i10 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i10 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i10 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i10 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i10 != 4) {
                    strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb2.append(strValueOf);
                sb2.append(", flags=");
                int i11 = this.d;
                sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return a9.p.p(sb2, this.f46588f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public f(f fVar) {
        ClipData clipData = fVar.f46585b;
        clipData.getClass();
        this.f46585b = clipData;
        int i10 = fVar.f46586c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f46586c = i10;
        int i11 = fVar.d;
        if ((i11 & 1) == i11) {
            this.d = i11;
            this.f46587e = fVar.f46587e;
            this.f46588f = fVar.f46588f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
