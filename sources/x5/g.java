package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.h0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(28);
    public final String f53097a;
    public final String f53098b;
    public final String f53099c;
    public final String d;
    public final Uri e;
    public final String f53100f;
    public final String h;
    public final String f53101n;
    public final u f53102r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.g(str);
        this.f53097a = str;
        this.f53098b = str2;
        this.f53099c = str3;
        this.d = str4;
        this.e = uri;
        this.f53100f = str5;
        this.h = str6;
        this.f53101n = str7;
        this.f53102r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.k(this.f53097a, gVar.f53097a) || !l.k(this.f53098b, gVar.f53098b) || !l.k(this.f53099c, gVar.f53099c) || !l.k(this.d, gVar.d) || !l.k(this.e, gVar.e) || !l.k(this.f53100f, gVar.f53100f) || !l.k(this.h, gVar.h) || !l.k(this.f53101n, gVar.f53101n) || !l.k(this.f53102r, gVar.f53102r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53097a, this.f53098b, this.f53099c, this.d, this.e, this.f53100f, this.h, this.f53101n, this.f53102r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f53097a);
        h0.l(parcel, 2, this.f53098b);
        h0.l(parcel, 3, this.f53099c);
        h0.l(parcel, 4, this.d);
        h0.k(parcel, 5, this.e, i10);
        h0.l(parcel, 6, this.f53100f);
        h0.l(parcel, 7, this.h);
        h0.l(parcel, 8, this.f53101n);
        h0.k(parcel, 9, this.f53102r, i10);
        h0.r(parcel, q6);
    }
}
