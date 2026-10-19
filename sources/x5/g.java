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
    public final String f49300a;
    public final String f49301b;
    public final String f49302c;
    public final String d;
    public final Uri e;
    public final String f49303f;
    public final String h;
    public final String f49304n;
    public final u f49305r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49300a = str;
        this.f49301b = str2;
        this.f49302c = str3;
        this.d = str4;
        this.e = uri;
        this.f49303f = str5;
        this.h = str6;
        this.f49304n = str7;
        this.f49305r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49300a, gVar.f49300a) || !l.l(this.f49301b, gVar.f49301b) || !l.l(this.f49302c, gVar.f49302c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f49303f, gVar.f49303f) || !l.l(this.h, gVar.h) || !l.l(this.f49304n, gVar.f49304n) || !l.l(this.f49305r, gVar.f49305r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49300a, this.f49301b, this.f49302c, this.d, this.e, this.f49303f, this.h, this.f49304n, this.f49305r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f49300a);
        f0.l(parcel, 2, this.f49301b);
        f0.l(parcel, 3, this.f49302c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f49303f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f49304n);
        f0.k(parcel, 9, this.f49305r, i10);
        f0.r(parcel, q6);
    }
}
