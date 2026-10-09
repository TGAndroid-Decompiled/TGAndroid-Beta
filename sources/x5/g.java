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
    public final String f50677a;
    public final String f50678b;
    public final String f50679c;
    public final String d;
    public final Uri f50680e;
    public final String f50681f;
    public final String h;
    public final String f50682n;
    public final u f50683r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f50677a = str;
        this.f50678b = str2;
        this.f50679c = str3;
        this.d = str4;
        this.f50680e = uri;
        this.f50681f = str5;
        this.h = str6;
        this.f50682n = str7;
        this.f50683r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f50677a, gVar.f50677a) || !l.l(this.f50678b, gVar.f50678b) || !l.l(this.f50679c, gVar.f50679c) || !l.l(this.d, gVar.d) || !l.l(this.f50680e, gVar.f50680e) || !l.l(this.f50681f, gVar.f50681f) || !l.l(this.h, gVar.h) || !l.l(this.f50682n, gVar.f50682n) || !l.l(this.f50683r, gVar.f50683r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50677a, this.f50678b, this.f50679c, this.d, this.f50680e, this.f50681f, this.h, this.f50682n, this.f50683r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f50677a);
        d0.l(parcel, 2, this.f50678b);
        d0.l(parcel, 3, this.f50679c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f50680e, i10);
        d0.l(parcel, 6, this.f50681f);
        d0.l(parcel, 7, this.h);
        d0.l(parcel, 8, this.f50682n);
        d0.k(parcel, 9, this.f50683r, i10);
        d0.r(parcel, q6);
    }
}
