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
    public final String f45593a;
    public final String f45594b;
    public final String f45595c;
    public final String d;
    public final Uri e;
    public final String f45596f;
    public final String h;
    public final String f45597n;
    public final u f45598r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45593a = str;
        this.f45594b = str2;
        this.f45595c = str3;
        this.d = str4;
        this.e = uri;
        this.f45596f = str5;
        this.h = str6;
        this.f45597n = str7;
        this.f45598r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45593a, gVar.f45593a) || !l.l(this.f45594b, gVar.f45594b) || !l.l(this.f45595c, gVar.f45595c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45596f, gVar.f45596f) || !l.l(this.h, gVar.h) || !l.l(this.f45597n, gVar.f45597n) || !l.l(this.f45598r, gVar.f45598r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45593a, this.f45594b, this.f45595c, this.d, this.e, this.f45596f, this.h, this.f45597n, this.f45598r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45593a);
        f0.l(parcel, 2, this.f45594b);
        f0.l(parcel, 3, this.f45595c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45596f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45597n);
        f0.k(parcel, 9, this.f45598r, i10);
        f0.r(parcel, q6);
    }
}
