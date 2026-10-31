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
    public final String f53079a;
    public final String f53080b;
    public final String f53081c;
    public final String d;
    public final Uri e;
    public final String f53082f;
    public final String h;
    public final String f53083n;
    public final u f53084r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.g(str);
        this.f53079a = str;
        this.f53080b = str2;
        this.f53081c = str3;
        this.d = str4;
        this.e = uri;
        this.f53082f = str5;
        this.h = str6;
        this.f53083n = str7;
        this.f53084r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.k(this.f53079a, gVar.f53079a) || !l.k(this.f53080b, gVar.f53080b) || !l.k(this.f53081c, gVar.f53081c) || !l.k(this.d, gVar.d) || !l.k(this.e, gVar.e) || !l.k(this.f53082f, gVar.f53082f) || !l.k(this.h, gVar.h) || !l.k(this.f53083n, gVar.f53083n) || !l.k(this.f53084r, gVar.f53084r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53079a, this.f53080b, this.f53081c, this.d, this.e, this.f53082f, this.h, this.f53083n, this.f53084r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f53079a);
        h0.l(parcel, 2, this.f53080b);
        h0.l(parcel, 3, this.f53081c);
        h0.l(parcel, 4, this.d);
        h0.k(parcel, 5, this.e, i10);
        h0.l(parcel, 6, this.f53082f);
        h0.l(parcel, 7, this.h);
        h0.l(parcel, 8, this.f53083n);
        h0.k(parcel, 9, this.f53084r, i10);
        h0.r(parcel, q6);
    }
}
