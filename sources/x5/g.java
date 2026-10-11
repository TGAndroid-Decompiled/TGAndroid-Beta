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
    public final String f50801a;
    public final String f50802b;
    public final String f50803c;
    public final String d;
    public final Uri f50804e;
    public final String f50805f;
    public final String h;
    public final String f50806n;
    public final u f50807r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.h(str);
        this.f50801a = str;
        this.f50802b = str2;
        this.f50803c = str3;
        this.d = str4;
        this.f50804e = uri;
        this.f50805f = str5;
        this.h = str6;
        this.f50806n = str7;
        this.f50807r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.l(this.f50801a, gVar.f50801a) || !m.l(this.f50802b, gVar.f50802b) || !m.l(this.f50803c, gVar.f50803c) || !m.l(this.d, gVar.d) || !m.l(this.f50804e, gVar.f50804e) || !m.l(this.f50805f, gVar.f50805f) || !m.l(this.h, gVar.h) || !m.l(this.f50806n, gVar.f50806n) || !m.l(this.f50807r, gVar.f50807r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50801a, this.f50802b, this.f50803c, this.d, this.f50804e, this.f50805f, this.h, this.f50806n, this.f50807r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f50801a);
        d0.l(parcel, 2, this.f50802b);
        d0.l(parcel, 3, this.f50803c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f50804e, i10);
        d0.l(parcel, 6, this.f50805f);
        d0.l(parcel, 7, this.h);
        d0.l(parcel, 8, this.f50806n);
        d0.k(parcel, 9, this.f50807r, i10);
        d0.r(parcel, q6);
    }
}
