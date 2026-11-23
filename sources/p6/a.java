package p6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import i5.c;
import java.util.Arrays;
import java.util.Locale;
import m6.e;
import q6.m;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final int f55483a;
    public final Uri f55484b;
    public final int f55485c;
    public final int d;

    public a(int i7, Uri uri, int i10, int i11) {
        this.f55483a = i7;
        this.f55484b = uri;
        this.f55485c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (m.l(this.f55484b, aVar.f55484b) && this.f55485c == aVar.f55485c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55484b, Integer.valueOf(this.f55485c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f55484b.toString();
        StringBuilder n10 = c.n("Image ", this.f55485c, "x", this.d, " ");
        n10.append(uri);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f55483a);
        cc.k(parcel, 2, this.f55484b, i7);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f55485c);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.s(parcel, r10);
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
