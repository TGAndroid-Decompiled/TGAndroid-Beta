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
    public final String f45370a;
    public final String f45371b;
    public final String f45372c;
    public final String d;
    public final Uri e;
    public final String f45373f;
    public final String h;
    public final String f45374n;
    public final u f45375r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45370a = str;
        this.f45371b = str2;
        this.f45372c = str3;
        this.d = str4;
        this.e = uri;
        this.f45373f = str5;
        this.h = str6;
        this.f45374n = str7;
        this.f45375r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45370a, gVar.f45370a) || !l.l(this.f45371b, gVar.f45371b) || !l.l(this.f45372c, gVar.f45372c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45373f, gVar.f45373f) || !l.l(this.h, gVar.h) || !l.l(this.f45374n, gVar.f45374n) || !l.l(this.f45375r, gVar.f45375r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45370a, this.f45371b, this.f45372c, this.d, this.e, this.f45373f, this.h, this.f45374n, this.f45375r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f45370a);
        e0.l(parcel, 2, this.f45371b);
        e0.l(parcel, 3, this.f45372c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.l(parcel, 6, this.f45373f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f45374n);
        e0.k(parcel, 9, this.f45375r, i10);
        e0.r(parcel, q6);
    }
}
