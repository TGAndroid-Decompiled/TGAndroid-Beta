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
    public final String f49387a;
    public final String f49388b;
    public final String f49389c;
    public final String d;
    public final Uri f49390e;
    public final String f49391f;
    public final String h;
    public final String f49392n;
    public final u f49393r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49387a = str;
        this.f49388b = str2;
        this.f49389c = str3;
        this.d = str4;
        this.f49390e = uri;
        this.f49391f = str5;
        this.h = str6;
        this.f49392n = str7;
        this.f49393r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49387a, gVar.f49387a) || !l.l(this.f49388b, gVar.f49388b) || !l.l(this.f49389c, gVar.f49389c) || !l.l(this.d, gVar.d) || !l.l(this.f49390e, gVar.f49390e) || !l.l(this.f49391f, gVar.f49391f) || !l.l(this.h, gVar.h) || !l.l(this.f49392n, gVar.f49392n) || !l.l(this.f49393r, gVar.f49393r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49387a, this.f49388b, this.f49389c, this.d, this.f49390e, this.f49391f, this.h, this.f49392n, this.f49393r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f49387a);
        g0.l(parcel, 2, this.f49388b);
        g0.l(parcel, 3, this.f49389c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f49390e, i10);
        g0.l(parcel, 6, this.f49391f);
        g0.l(parcel, 7, this.h);
        g0.l(parcel, 8, this.f49392n);
        g0.k(parcel, 9, this.f49393r, i10);
        g0.r(parcel, q6);
    }
}
