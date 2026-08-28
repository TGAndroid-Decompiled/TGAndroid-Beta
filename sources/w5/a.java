package w5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import e2.c;
import g7.p8;
import java.util.Arrays;
import java.util.Locale;
import q7.j;
import x5.l;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new j(25);
    public final int f48763a;
    public final Uri f48764b;
    public final int f48765c;
    public final int d;

    public a(int i9, Uri uri, int i10, int i11) {
        this.f48763a = i9;
        this.f48764b = uri;
        this.f48765c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f48764b, aVar.f48764b) && this.f48765c == aVar.f48765c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48764b, Integer.valueOf(this.f48765c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f48764b.toString();
        StringBuilder o6 = c.o("Image ", this.f48765c, "x", this.d, " ");
        o6.append(uri);
        return o6.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f48763a);
        p8.k(parcel, 2, this.f48764b, i9);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f48765c);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }

    public a(Uri uri, int i9, int i10) {
        this(1, uri, i9, i10);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i9 < 0 || i10 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public a(org.json.JSONObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: w5.a.<init>(org.json.JSONObject):void");
    }
}
