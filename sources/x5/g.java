package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(29);
    public final String f47913a;
    public final String f47914b;
    public final String f47915c;
    public final String d;
    public final Uri e;
    public final String f47916f;
    public final String h;
    public final String f47917n;
    public final u f47918r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f47913a = str;
        this.f47914b = str2;
        this.f47915c = str3;
        this.d = str4;
        this.e = uri;
        this.f47916f = str5;
        this.h = str6;
        this.f47917n = str7;
        this.f47918r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f47913a, gVar.f47913a) || !l.l(this.f47914b, gVar.f47914b) || !l.l(this.f47915c, gVar.f47915c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f47916f, gVar.f47916f) || !l.l(this.h, gVar.h) || !l.l(this.f47917n, gVar.f47917n) || !l.l(this.f47918r, gVar.f47918r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47913a, this.f47914b, this.f47915c, this.d, this.e, this.f47916f, this.h, this.f47917n, this.f47918r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f47913a);
        g0.l(parcel, 2, this.f47914b);
        g0.l(parcel, 3, this.f47915c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.e, i10);
        g0.l(parcel, 6, this.f47916f);
        g0.l(parcel, 7, this.h);
        g0.l(parcel, 8, this.f47917n);
        g0.k(parcel, 9, this.f47918r, i10);
        g0.r(parcel, q6);
    }
}
