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
    public final String f45292a;
    public final String f45293b;
    public final String f45294c;
    public final String d;
    public final Uri e;
    public final String f45295f;
    public final String h;
    public final String f45296n;
    public final u f45297r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45292a = str;
        this.f45293b = str2;
        this.f45294c = str3;
        this.d = str4;
        this.e = uri;
        this.f45295f = str5;
        this.h = str6;
        this.f45296n = str7;
        this.f45297r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45292a, gVar.f45292a) || !l.l(this.f45293b, gVar.f45293b) || !l.l(this.f45294c, gVar.f45294c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45295f, gVar.f45295f) || !l.l(this.h, gVar.h) || !l.l(this.f45296n, gVar.f45296n) || !l.l(this.f45297r, gVar.f45297r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45292a, this.f45293b, this.f45294c, this.d, this.e, this.f45295f, this.h, this.f45296n, this.f45297r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f45292a);
        e0.l(parcel, 2, this.f45293b);
        e0.l(parcel, 3, this.f45294c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.l(parcel, 6, this.f45295f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f45296n);
        e0.k(parcel, 9, this.f45297r, i10);
        e0.r(parcel, q6);
    }
}
