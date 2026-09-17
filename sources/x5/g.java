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
    public final String f45365a;
    public final String f45366b;
    public final String f45367c;
    public final String d;
    public final Uri e;
    public final String f45368f;
    public final String h;
    public final String f45369n;
    public final u f45370r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45365a = str;
        this.f45366b = str2;
        this.f45367c = str3;
        this.d = str4;
        this.e = uri;
        this.f45368f = str5;
        this.h = str6;
        this.f45369n = str7;
        this.f45370r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45365a, gVar.f45365a) || !l.l(this.f45366b, gVar.f45366b) || !l.l(this.f45367c, gVar.f45367c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45368f, gVar.f45368f) || !l.l(this.h, gVar.h) || !l.l(this.f45369n, gVar.f45369n) || !l.l(this.f45370r, gVar.f45370r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45365a, this.f45366b, this.f45367c, this.d, this.e, this.f45368f, this.h, this.f45369n, this.f45370r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f45365a);
        e0.l(parcel, 2, this.f45366b);
        e0.l(parcel, 3, this.f45367c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.l(parcel, 6, this.f45368f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f45369n);
        e0.k(parcel, 9, this.f45370r, i10);
        e0.r(parcel, q6);
    }
}
