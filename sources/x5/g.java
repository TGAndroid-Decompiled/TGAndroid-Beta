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
    public final String f47912a;
    public final String f47913b;
    public final String f47914c;
    public final String d;
    public final Uri e;
    public final String f47915f;
    public final String h;
    public final String f47916n;
    public final u f47917r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f47912a = str;
        this.f47913b = str2;
        this.f47914c = str3;
        this.d = str4;
        this.e = uri;
        this.f47915f = str5;
        this.h = str6;
        this.f47916n = str7;
        this.f47917r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f47912a, gVar.f47912a) || !l.l(this.f47913b, gVar.f47913b) || !l.l(this.f47914c, gVar.f47914c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f47915f, gVar.f47915f) || !l.l(this.h, gVar.h) || !l.l(this.f47916n, gVar.f47916n) || !l.l(this.f47917r, gVar.f47917r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47912a, this.f47913b, this.f47914c, this.d, this.e, this.f47915f, this.h, this.f47916n, this.f47917r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f47912a);
        f0.l(parcel, 2, this.f47913b);
        f0.l(parcel, 3, this.f47914c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f47915f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f47916n);
        f0.k(parcel, 9, this.f47917r, i10);
        f0.r(parcel, q6);
    }
}
