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
    public final String f49309a;
    public final String f49310b;
    public final String f49311c;
    public final String d;
    public final Uri e;
    public final String f49312f;
    public final String h;
    public final String f49313n;
    public final u f49314r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49309a = str;
        this.f49310b = str2;
        this.f49311c = str3;
        this.d = str4;
        this.e = uri;
        this.f49312f = str5;
        this.h = str6;
        this.f49313n = str7;
        this.f49314r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49309a, gVar.f49309a) || !l.l(this.f49310b, gVar.f49310b) || !l.l(this.f49311c, gVar.f49311c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f49312f, gVar.f49312f) || !l.l(this.h, gVar.h) || !l.l(this.f49313n, gVar.f49313n) || !l.l(this.f49314r, gVar.f49314r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49309a, this.f49310b, this.f49311c, this.d, this.e, this.f49312f, this.h, this.f49313n, this.f49314r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f49309a);
        f0.l(parcel, 2, this.f49310b);
        f0.l(parcel, 3, this.f49311c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f49312f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f49313n);
        f0.k(parcel, 9, this.f49314r, i10);
        f0.r(parcel, q6);
    }
}
