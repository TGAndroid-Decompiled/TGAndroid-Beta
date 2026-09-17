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
    public final String f48936a;
    public final String f48937b;
    public final String f48938c;
    public final String d;
    public final Uri f48939e;
    public final String f48940f;
    public final String h;
    public final String f48941n;
    public final u f48942r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f48936a = str;
        this.f48937b = str2;
        this.f48938c = str3;
        this.d = str4;
        this.f48939e = uri;
        this.f48940f = str5;
        this.h = str6;
        this.f48941n = str7;
        this.f48942r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f48936a, gVar.f48936a) || !l.l(this.f48937b, gVar.f48937b) || !l.l(this.f48938c, gVar.f48938c) || !l.l(this.d, gVar.d) || !l.l(this.f48939e, gVar.f48939e) || !l.l(this.f48940f, gVar.f48940f) || !l.l(this.h, gVar.h) || !l.l(this.f48941n, gVar.f48941n) || !l.l(this.f48942r, gVar.f48942r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48936a, this.f48937b, this.f48938c, this.d, this.f48939e, this.f48940f, this.h, this.f48941n, this.f48942r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f48936a);
        e0.l(parcel, 2, this.f48937b);
        e0.l(parcel, 3, this.f48938c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.f48939e, i10);
        e0.l(parcel, 6, this.f48940f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f48941n);
        e0.k(parcel, 9, this.f48942r, i10);
        e0.r(parcel, q6);
    }
}
