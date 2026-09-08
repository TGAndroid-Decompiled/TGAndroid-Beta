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
    public final String f48935a;
    public final String f48936b;
    public final String f48937c;
    public final String d;
    public final Uri f48938e;
    public final String f48939f;
    public final String h;
    public final String f48940n;
    public final u f48941r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f48935a = str;
        this.f48936b = str2;
        this.f48937c = str3;
        this.d = str4;
        this.f48938e = uri;
        this.f48939f = str5;
        this.h = str6;
        this.f48940n = str7;
        this.f48941r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f48935a, gVar.f48935a) || !l.l(this.f48936b, gVar.f48936b) || !l.l(this.f48937c, gVar.f48937c) || !l.l(this.d, gVar.d) || !l.l(this.f48938e, gVar.f48938e) || !l.l(this.f48939f, gVar.f48939f) || !l.l(this.h, gVar.h) || !l.l(this.f48940n, gVar.f48940n) || !l.l(this.f48941r, gVar.f48941r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48935a, this.f48936b, this.f48937c, this.d, this.f48938e, this.f48939f, this.h, this.f48940n, this.f48941r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f48935a);
        e0.l(parcel, 2, this.f48936b);
        e0.l(parcel, 3, this.f48937c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.f48938e, i10);
        e0.l(parcel, 6, this.f48939f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f48940n);
        e0.k(parcel, 9, this.f48941r, i10);
        e0.r(parcel, q6);
    }
}
