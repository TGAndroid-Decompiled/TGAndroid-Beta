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
    public final String f45342a;
    public final String f45343b;
    public final String f45344c;
    public final String d;
    public final Uri e;
    public final String f45345f;
    public final String h;
    public final String f45346n;
    public final u f45347r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45342a = str;
        this.f45343b = str2;
        this.f45344c = str3;
        this.d = str4;
        this.e = uri;
        this.f45345f = str5;
        this.h = str6;
        this.f45346n = str7;
        this.f45347r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45342a, gVar.f45342a) || !l.l(this.f45343b, gVar.f45343b) || !l.l(this.f45344c, gVar.f45344c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45345f, gVar.f45345f) || !l.l(this.h, gVar.h) || !l.l(this.f45346n, gVar.f45346n) || !l.l(this.f45347r, gVar.f45347r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45342a, this.f45343b, this.f45344c, this.d, this.e, this.f45345f, this.h, this.f45346n, this.f45347r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f45342a);
        e0.l(parcel, 2, this.f45343b);
        e0.l(parcel, 3, this.f45344c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.l(parcel, 6, this.f45345f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f45346n);
        e0.k(parcel, 9, this.f45347r, i10);
        e0.r(parcel, q6);
    }
}
