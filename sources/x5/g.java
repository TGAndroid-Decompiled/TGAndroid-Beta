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
    public final String f49298a;
    public final String f49299b;
    public final String f49300c;
    public final String d;
    public final Uri e;
    public final String f49301f;
    public final String h;
    public final String f49302n;
    public final u f49303r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49298a = str;
        this.f49299b = str2;
        this.f49300c = str3;
        this.d = str4;
        this.e = uri;
        this.f49301f = str5;
        this.h = str6;
        this.f49302n = str7;
        this.f49303r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49298a, gVar.f49298a) || !l.l(this.f49299b, gVar.f49299b) || !l.l(this.f49300c, gVar.f49300c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f49301f, gVar.f49301f) || !l.l(this.h, gVar.h) || !l.l(this.f49302n, gVar.f49302n) || !l.l(this.f49303r, gVar.f49303r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49298a, this.f49299b, this.f49300c, this.d, this.e, this.f49301f, this.h, this.f49302n, this.f49303r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f49298a);
        f0.l(parcel, 2, this.f49299b);
        f0.l(parcel, 3, this.f49300c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f49301f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f49302n);
        f0.k(parcel, 9, this.f49303r, i10);
        f0.r(parcel, q6);
    }
}
