package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(29);
    public final String f49305a;
    public final String f49306b;
    public final String f49307c;
    public final String d;
    public final Uri e;
    public final String f49308f;
    public final String h;
    public final String f49309n;
    public final u f49310r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49305a = str;
        this.f49306b = str2;
        this.f49307c = str3;
        this.d = str4;
        this.e = uri;
        this.f49308f = str5;
        this.h = str6;
        this.f49309n = str7;
        this.f49310r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49305a, gVar.f49305a) || !l.l(this.f49306b, gVar.f49306b) || !l.l(this.f49307c, gVar.f49307c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f49308f, gVar.f49308f) || !l.l(this.h, gVar.h) || !l.l(this.f49309n, gVar.f49309n) || !l.l(this.f49310r, gVar.f49310r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49305a, this.f49306b, this.f49307c, this.d, this.e, this.f49308f, this.h, this.f49309n, this.f49310r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f49305a);
        f0.l(parcel, 2, this.f49306b);
        f0.l(parcel, 3, this.f49307c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f49308f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f49309n);
        f0.k(parcel, 9, this.f49310r, i10);
        f0.r(parcel, q6);
    }
}
