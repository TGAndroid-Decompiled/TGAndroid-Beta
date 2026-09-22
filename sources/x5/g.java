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
    public final String f45659a;
    public final String f45660b;
    public final String f45661c;
    public final String d;
    public final Uri e;
    public final String f45662f;
    public final String h;
    public final String f45663n;
    public final u f45664r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45659a = str;
        this.f45660b = str2;
        this.f45661c = str3;
        this.d = str4;
        this.e = uri;
        this.f45662f = str5;
        this.h = str6;
        this.f45663n = str7;
        this.f45664r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45659a, gVar.f45659a) || !l.l(this.f45660b, gVar.f45660b) || !l.l(this.f45661c, gVar.f45661c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45662f, gVar.f45662f) || !l.l(this.h, gVar.h) || !l.l(this.f45663n, gVar.f45663n) || !l.l(this.f45664r, gVar.f45664r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45659a, this.f45660b, this.f45661c, this.d, this.e, this.f45662f, this.h, this.f45663n, this.f45664r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45659a);
        f0.l(parcel, 2, this.f45660b);
        f0.l(parcel, 3, this.f45661c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45662f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45663n);
        f0.k(parcel, 9, this.f45664r, i10);
        f0.r(parcel, q6);
    }
}
