package y5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import java.util.Locale;
import w5.k;
import z5.l;
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new k(7);
    public final int f50493a;
    public final Uri f50494b;
    public final int f50495c;
    public final int d;

    public a(int i10, Uri uri, int i11, int i12) {
        this.f50493a = i10;
        this.f50494b = uri;
        this.f50495c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (l.l(this.f50494b, aVar.f50494b) && this.f50495c == aVar.f50495c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50494b, Integer.valueOf(this.f50495c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String uri = this.f50494b.toString();
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("Image ", this.f50495c, "x", this.d, " ");
        o10.append(uri);
        return o10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f50493a);
        o.k(parcel, 2, this.f50494b, i10);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.f50495c);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        o.r(parcel, q6);
    }

    public a(Uri uri, int i10, int i11) {
        this(1, uri, i10, i11);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public a(org.json.JSONObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: y5.a.<init>(org.json.JSONObject):void");
    }
}
