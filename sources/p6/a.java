package p6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import java.util.Locale;
import jg.g;
import m6.e;
import q6.m;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final int f53479a;
    public final Uri f53480b;
    public final int f53481c;
    public final int d;

    public a(int i7, Uri uri, int i10, int i11) {
        this.f53479a = i7;
        this.f53480b = uri;
        this.f53481c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (m.k(this.f53480b, aVar.f53480b) && this.f53481c == aVar.f53481c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53480b, Integer.valueOf(this.f53481c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f53480b.toString();
        StringBuilder o4 = g.o("Image ", this.f53481c, "x", this.d, " ");
        o4.append(uri);
        return o4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53479a);
        xb.k(parcel, 2, this.f53480b, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53481c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.s(parcel, r10);
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
