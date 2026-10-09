package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f50679a;
    public final String f50680b;
    public final String f50681c;
    public final String d;
    public final Uri f50682e;
    public final String f50683f;
    public final String h;
    public final String f50684n;
    public final u f50685r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f50679a = str;
        this.f50680b = str2;
        this.f50681c = str3;
        this.d = str4;
        this.f50682e = uri;
        this.f50683f = str5;
        this.h = str6;
        this.f50684n = str7;
        this.f50685r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f50679a, gVar.f50679a) || !l.l(this.f50680b, gVar.f50680b) || !l.l(this.f50681c, gVar.f50681c) || !l.l(this.d, gVar.d) || !l.l(this.f50682e, gVar.f50682e) || !l.l(this.f50683f, gVar.f50683f) || !l.l(this.h, gVar.h) || !l.l(this.f50684n, gVar.f50684n) || !l.l(this.f50685r, gVar.f50685r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50679a, this.f50680b, this.f50681c, this.d, this.f50682e, this.f50683f, this.h, this.f50684n, this.f50685r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f50679a);
        d0.l(parcel, 2, this.f50680b);
        d0.l(parcel, 3, this.f50681c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f50682e, i10);
        d0.l(parcel, 6, this.f50683f);
        d0.l(parcel, 7, this.h);
        d0.l(parcel, 8, this.f50684n);
        d0.k(parcel, 9, this.f50685r, i10);
        d0.r(parcel, q6);
    }
}
