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
    public final String f45622a;
    public final String f45623b;
    public final String f45624c;
    public final String d;
    public final Uri e;
    public final String f45625f;
    public final String h;
    public final String f45626n;
    public final u f45627r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45622a = str;
        this.f45623b = str2;
        this.f45624c = str3;
        this.d = str4;
        this.e = uri;
        this.f45625f = str5;
        this.h = str6;
        this.f45626n = str7;
        this.f45627r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45622a, gVar.f45622a) || !l.l(this.f45623b, gVar.f45623b) || !l.l(this.f45624c, gVar.f45624c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45625f, gVar.f45625f) || !l.l(this.h, gVar.h) || !l.l(this.f45626n, gVar.f45626n) || !l.l(this.f45627r, gVar.f45627r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45622a, this.f45623b, this.f45624c, this.d, this.e, this.f45625f, this.h, this.f45626n, this.f45627r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45622a);
        f0.l(parcel, 2, this.f45623b);
        f0.l(parcel, 3, this.f45624c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45625f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45626n);
        f0.k(parcel, 9, this.f45627r, i10);
        f0.r(parcel, q6);
    }
}
