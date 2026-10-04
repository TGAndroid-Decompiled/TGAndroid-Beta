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
    public final String f49388a;
    public final String f49389b;
    public final String f49390c;
    public final String d;
    public final Uri f49391e;
    public final String f49392f;
    public final String h;
    public final String f49393n;
    public final u f49394r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49388a = str;
        this.f49389b = str2;
        this.f49390c = str3;
        this.d = str4;
        this.f49391e = uri;
        this.f49392f = str5;
        this.h = str6;
        this.f49393n = str7;
        this.f49394r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49388a, gVar.f49388a) || !l.l(this.f49389b, gVar.f49389b) || !l.l(this.f49390c, gVar.f49390c) || !l.l(this.d, gVar.d) || !l.l(this.f49391e, gVar.f49391e) || !l.l(this.f49392f, gVar.f49392f) || !l.l(this.h, gVar.h) || !l.l(this.f49393n, gVar.f49393n) || !l.l(this.f49394r, gVar.f49394r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49388a, this.f49389b, this.f49390c, this.d, this.f49391e, this.f49392f, this.h, this.f49393n, this.f49394r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f49388a);
        g0.l(parcel, 2, this.f49389b);
        g0.l(parcel, 3, this.f49390c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f49391e, i10);
        g0.l(parcel, 6, this.f49392f);
        g0.l(parcel, 7, this.h);
        g0.l(parcel, 8, this.f49393n);
        g0.k(parcel, 9, this.f49394r, i10);
        g0.r(parcel, q6);
    }
}
