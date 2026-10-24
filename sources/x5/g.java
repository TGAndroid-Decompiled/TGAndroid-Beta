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
    public final String f49750a;
    public final String f49751b;
    public final String f49752c;
    public final String d;
    public final Uri e;
    public final String f49753f;
    public final String h;
    public final String f49754n;
    public final u f49755r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49750a = str;
        this.f49751b = str2;
        this.f49752c = str3;
        this.d = str4;
        this.e = uri;
        this.f49753f = str5;
        this.h = str6;
        this.f49754n = str7;
        this.f49755r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49750a, gVar.f49750a) || !l.l(this.f49751b, gVar.f49751b) || !l.l(this.f49752c, gVar.f49752c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f49753f, gVar.f49753f) || !l.l(this.h, gVar.h) || !l.l(this.f49754n, gVar.f49754n) || !l.l(this.f49755r, gVar.f49755r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49750a, this.f49751b, this.f49752c, this.d, this.e, this.f49753f, this.h, this.f49754n, this.f49755r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f49750a);
        f0.l(parcel, 2, this.f49751b);
        f0.l(parcel, 3, this.f49752c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f49753f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f49754n);
        f0.k(parcel, 9, this.f49755r, i10);
        f0.r(parcel, q6);
    }
}
