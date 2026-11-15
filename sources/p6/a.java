package p6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import i5.c;
import java.util.Arrays;
import java.util.Locale;
import m6.e;
import q6.m;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final int f54897a;
    public final Uri f54898b;
    public final int f54899c;
    public final int d;

    public a(int i7, Uri uri, int i10, int i11) {
        this.f54897a = i7;
        this.f54898b = uri;
        this.f54899c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (m.k(this.f54898b, aVar.f54898b) && this.f54899c == aVar.f54899c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54898b, Integer.valueOf(this.f54899c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f54898b.toString();
        StringBuilder n10 = c.n("Image ", this.f54899c, "x", this.d, " ");
        n10.append(uri);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f54897a);
        yb.k(parcel, 2, this.f54898b, i7);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f54899c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.s(parcel, r10);
    }

    public a(Uri uri, int i7, int i10) {
        this(1, uri, i7, i10);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i7 < 0 || i10 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public a(org.json.JSONObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: p6.a.<init>(org.json.JSONObject):void");
    }
}
