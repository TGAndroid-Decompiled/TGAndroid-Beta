package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.m;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f50767a;
    public final String f50768b;
    public final String f50769c;
    public final String d;
    public final Uri f50770e;
    public final String f50771f;
    public final String h;
    public final String f50772n;
    public final u f50773r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.h(str);
        this.f50767a = str;
        this.f50768b = str2;
        this.f50769c = str3;
        this.d = str4;
        this.f50770e = uri;
        this.f50771f = str5;
        this.h = str6;
        this.f50772n = str7;
        this.f50773r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.l(this.f50767a, gVar.f50767a) || !m.l(this.f50768b, gVar.f50768b) || !m.l(this.f50769c, gVar.f50769c) || !m.l(this.d, gVar.d) || !m.l(this.f50770e, gVar.f50770e) || !m.l(this.f50771f, gVar.f50771f) || !m.l(this.h, gVar.h) || !m.l(this.f50772n, gVar.f50772n) || !m.l(this.f50773r, gVar.f50773r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50767a, this.f50768b, this.f50769c, this.d, this.f50770e, this.f50771f, this.h, this.f50772n, this.f50773r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f50767a);
        d0.l(parcel, 2, this.f50768b);
        d0.l(parcel, 3, this.f50769c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f50770e, i10);
        d0.l(parcel, 6, this.f50771f);
        d0.l(parcel, 7, this.h);
        d0.l(parcel, 8, this.f50772n);
        d0.k(parcel, 9, this.f50773r, i10);
        d0.r(parcel, q6);
    }
}
