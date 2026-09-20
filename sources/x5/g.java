package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f45638a;
    public final String f45639b;
    public final String f45640c;
    public final String d;
    public final Uri e;
    public final String f45641f;
    public final String h;
    public final String f45642n;
    public final u f45643r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45638a = str;
        this.f45639b = str2;
        this.f45640c = str3;
        this.d = str4;
        this.e = uri;
        this.f45641f = str5;
        this.h = str6;
        this.f45642n = str7;
        this.f45643r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45638a, gVar.f45638a) || !l.l(this.f45639b, gVar.f45639b) || !l.l(this.f45640c, gVar.f45640c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45641f, gVar.f45641f) || !l.l(this.h, gVar.h) || !l.l(this.f45642n, gVar.f45642n) || !l.l(this.f45643r, gVar.f45643r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45638a, this.f45639b, this.f45640c, this.d, this.e, this.f45641f, this.h, this.f45642n, this.f45643r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45638a);
        f0.l(parcel, 2, this.f45639b);
        f0.l(parcel, 3, this.f45640c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45641f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45642n);
        f0.k(parcel, 9, this.f45643r, i10);
        f0.r(parcel, q6);
    }
}
