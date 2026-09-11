package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f48906a;
    public final String f48907b;
    public final String f48908c;
    public final String d;
    public final Uri f48909e;
    public final String f48910f;
    public final String h;
    public final String f48911n;
    public final u f48912r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f48906a = str;
        this.f48907b = str2;
        this.f48908c = str3;
        this.d = str4;
        this.f48909e = uri;
        this.f48910f = str5;
        this.h = str6;
        this.f48911n = str7;
        this.f48912r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f48906a, gVar.f48906a) || !l.l(this.f48907b, gVar.f48907b) || !l.l(this.f48908c, gVar.f48908c) || !l.l(this.d, gVar.d) || !l.l(this.f48909e, gVar.f48909e) || !l.l(this.f48910f, gVar.f48910f) || !l.l(this.h, gVar.h) || !l.l(this.f48911n, gVar.f48911n) || !l.l(this.f48912r, gVar.f48912r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48906a, this.f48907b, this.f48908c, this.d, this.f48909e, this.f48910f, this.h, this.f48911n, this.f48912r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f48906a);
        e0.l(parcel, 2, this.f48907b);
        e0.l(parcel, 3, this.f48908c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.f48909e, i10);
        e0.l(parcel, 6, this.f48910f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f48911n);
        e0.k(parcel, 9, this.f48912r, i10);
        e0.r(parcel, q6);
    }
}
