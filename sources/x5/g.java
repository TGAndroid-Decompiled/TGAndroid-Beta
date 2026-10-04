package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f49396a;
    public final String f49397b;
    public final String f49398c;
    public final String d;
    public final Uri f49399e;
    public final String f49400f;
    public final String h;
    public final String f49401n;
    public final u f49402r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49396a = str;
        this.f49397b = str2;
        this.f49398c = str3;
        this.d = str4;
        this.f49399e = uri;
        this.f49400f = str5;
        this.h = str6;
        this.f49401n = str7;
        this.f49402r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49396a, gVar.f49396a) || !l.l(this.f49397b, gVar.f49397b) || !l.l(this.f49398c, gVar.f49398c) || !l.l(this.d, gVar.d) || !l.l(this.f49399e, gVar.f49399e) || !l.l(this.f49400f, gVar.f49400f) || !l.l(this.h, gVar.h) || !l.l(this.f49401n, gVar.f49401n) || !l.l(this.f49402r, gVar.f49402r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49396a, this.f49397b, this.f49398c, this.d, this.f49399e, this.f49400f, this.h, this.f49401n, this.f49402r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f49396a);
        g0.l(parcel, 2, this.f49397b);
        g0.l(parcel, 3, this.f49398c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f49399e, i10);
        g0.l(parcel, 6, this.f49400f);
        g0.l(parcel, 7, this.h);
        g0.l(parcel, 8, this.f49401n);
        g0.k(parcel, 9, this.f49402r, i10);
        g0.r(parcel, q6);
    }
}
