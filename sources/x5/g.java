package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f49403a;
    public final String f49404b;
    public final String f49405c;
    public final String d;
    public final Uri f49406e;
    public final String f49407f;
    public final String h;
    public final String f49408n;
    public final u f49409r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49403a = str;
        this.f49404b = str2;
        this.f49405c = str3;
        this.d = str4;
        this.f49406e = uri;
        this.f49407f = str5;
        this.h = str6;
        this.f49408n = str7;
        this.f49409r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49403a, gVar.f49403a) || !l.l(this.f49404b, gVar.f49404b) || !l.l(this.f49405c, gVar.f49405c) || !l.l(this.d, gVar.d) || !l.l(this.f49406e, gVar.f49406e) || !l.l(this.f49407f, gVar.f49407f) || !l.l(this.h, gVar.h) || !l.l(this.f49408n, gVar.f49408n) || !l.l(this.f49409r, gVar.f49409r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49403a, this.f49404b, this.f49405c, this.d, this.f49406e, this.f49407f, this.h, this.f49408n, this.f49409r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f49403a);
        g0.l(parcel, 2, this.f49404b);
        g0.l(parcel, 3, this.f49405c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f49406e, i10);
        g0.l(parcel, 6, this.f49407f);
        g0.l(parcel, 7, this.h);
        g0.l(parcel, 8, this.f49408n);
        g0.k(parcel, 9, this.f49409r, i10);
        g0.r(parcel, q6);
    }
}
