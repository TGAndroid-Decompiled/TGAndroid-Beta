package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f45666a;
    public final String f45667b;
    public final String f45668c;
    public final String d;
    public final Uri e;
    public final String f45669f;
    public final String h;
    public final String f45670n;
    public final u f45671r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45666a = str;
        this.f45667b = str2;
        this.f45668c = str3;
        this.d = str4;
        this.e = uri;
        this.f45669f = str5;
        this.h = str6;
        this.f45670n = str7;
        this.f45671r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45666a, gVar.f45666a) || !l.l(this.f45667b, gVar.f45667b) || !l.l(this.f45668c, gVar.f45668c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45669f, gVar.f45669f) || !l.l(this.h, gVar.h) || !l.l(this.f45670n, gVar.f45670n) || !l.l(this.f45671r, gVar.f45671r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45666a, this.f45667b, this.f45668c, this.d, this.e, this.f45669f, this.h, this.f45670n, this.f45671r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45666a);
        f0.l(parcel, 2, this.f45667b);
        f0.l(parcel, 3, this.f45668c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45669f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45670n);
        f0.k(parcel, 9, this.f45671r, i10);
        f0.r(parcel, q6);
    }
}
