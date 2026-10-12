package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.m;
import w7.c0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f50908a;
    public final String f50909b;
    public final String f50910c;
    public final String d;
    public final Uri f50911e;
    public final String f50912f;
    public final String h;
    public final String f50913n;
    public final u f50914r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.h(str);
        this.f50908a = str;
        this.f50909b = str2;
        this.f50910c = str3;
        this.d = str4;
        this.f50911e = uri;
        this.f50912f = str5;
        this.h = str6;
        this.f50913n = str7;
        this.f50914r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.l(this.f50908a, gVar.f50908a) || !m.l(this.f50909b, gVar.f50909b) || !m.l(this.f50910c, gVar.f50910c) || !m.l(this.d, gVar.d) || !m.l(this.f50911e, gVar.f50911e) || !m.l(this.f50912f, gVar.f50912f) || !m.l(this.h, gVar.h) || !m.l(this.f50913n, gVar.f50913n) || !m.l(this.f50914r, gVar.f50914r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50908a, this.f50909b, this.f50910c, this.d, this.f50911e, this.f50912f, this.h, this.f50913n, this.f50914r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f50908a);
        c0.l(parcel, 2, this.f50909b);
        c0.l(parcel, 3, this.f50910c);
        c0.l(parcel, 4, this.d);
        c0.k(parcel, 5, this.f50911e, i10);
        c0.l(parcel, 6, this.f50912f);
        c0.l(parcel, 7, this.h);
        c0.l(parcel, 8, this.f50913n);
        c0.k(parcel, 9, this.f50914r, i10);
        c0.r(parcel, q6);
    }
}
