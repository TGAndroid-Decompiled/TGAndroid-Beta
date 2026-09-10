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
    public final String f44682a;
    public final String f44683b;
    public final String f44684c;
    public final String d;
    public final Uri e;
    public final String f44685f;
    public final String h;
    public final String f44686n;
    public final u f44687r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f44682a = str;
        this.f44683b = str2;
        this.f44684c = str3;
        this.d = str4;
        this.e = uri;
        this.f44685f = str5;
        this.h = str6;
        this.f44686n = str7;
        this.f44687r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f44682a, gVar.f44682a) || !l.l(this.f44683b, gVar.f44683b) || !l.l(this.f44684c, gVar.f44684c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f44685f, gVar.f44685f) || !l.l(this.h, gVar.h) || !l.l(this.f44686n, gVar.f44686n) || !l.l(this.f44687r, gVar.f44687r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44682a, this.f44683b, this.f44684c, this.d, this.e, this.f44685f, this.h, this.f44686n, this.f44687r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f44682a);
        e0.l(parcel, 2, this.f44683b);
        e0.l(parcel, 3, this.f44684c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.l(parcel, 6, this.f44685f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f44686n);
        e0.k(parcel, 9, this.f44687r, i10);
        e0.r(parcel, q6);
    }
}
