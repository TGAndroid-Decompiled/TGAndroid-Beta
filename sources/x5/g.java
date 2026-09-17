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
    public final String f48907a;
    public final String f48908b;
    public final String f48909c;
    public final String d;
    public final Uri f48910e;
    public final String f48911f;
    public final String h;
    public final String f48912n;
    public final u f48913r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f48907a = str;
        this.f48908b = str2;
        this.f48909c = str3;
        this.d = str4;
        this.f48910e = uri;
        this.f48911f = str5;
        this.h = str6;
        this.f48912n = str7;
        this.f48913r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f48907a, gVar.f48907a) || !l.l(this.f48908b, gVar.f48908b) || !l.l(this.f48909c, gVar.f48909c) || !l.l(this.d, gVar.d) || !l.l(this.f48910e, gVar.f48910e) || !l.l(this.f48911f, gVar.f48911f) || !l.l(this.h, gVar.h) || !l.l(this.f48912n, gVar.f48912n) || !l.l(this.f48913r, gVar.f48913r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48907a, this.f48908b, this.f48909c, this.d, this.f48910e, this.f48911f, this.h, this.f48912n, this.f48913r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f48907a);
        e0.l(parcel, 2, this.f48908b);
        e0.l(parcel, 3, this.f48909c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.f48910e, i10);
        e0.l(parcel, 6, this.f48911f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f48912n);
        e0.k(parcel, 9, this.f48913r, i10);
        e0.r(parcel, q6);
    }
}
