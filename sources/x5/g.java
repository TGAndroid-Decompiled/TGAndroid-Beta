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
    public final String f45728a;
    public final String f45729b;
    public final String f45730c;
    public final String d;
    public final Uri e;
    public final String f45731f;
    public final String h;
    public final String f45732n;
    public final u f45733r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45728a = str;
        this.f45729b = str2;
        this.f45730c = str3;
        this.d = str4;
        this.e = uri;
        this.f45731f = str5;
        this.h = str6;
        this.f45732n = str7;
        this.f45733r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45728a, gVar.f45728a) || !l.l(this.f45729b, gVar.f45729b) || !l.l(this.f45730c, gVar.f45730c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45731f, gVar.f45731f) || !l.l(this.h, gVar.h) || !l.l(this.f45732n, gVar.f45732n) || !l.l(this.f45733r, gVar.f45733r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45728a, this.f45729b, this.f45730c, this.d, this.e, this.f45731f, this.h, this.f45732n, this.f45733r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45728a);
        f0.l(parcel, 2, this.f45729b);
        f0.l(parcel, 3, this.f45730c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45731f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45732n);
        f0.k(parcel, 9, this.f45733r, i10);
        f0.r(parcel, q6);
    }
}
