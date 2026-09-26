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
    public final String f45619a;
    public final String f45620b;
    public final String f45621c;
    public final String d;
    public final Uri e;
    public final String f45622f;
    public final String h;
    public final String f45623n;
    public final u f45624r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45619a = str;
        this.f45620b = str2;
        this.f45621c = str3;
        this.d = str4;
        this.e = uri;
        this.f45622f = str5;
        this.h = str6;
        this.f45623n = str7;
        this.f45624r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45619a, gVar.f45619a) || !l.l(this.f45620b, gVar.f45620b) || !l.l(this.f45621c, gVar.f45621c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45622f, gVar.f45622f) || !l.l(this.h, gVar.h) || !l.l(this.f45623n, gVar.f45623n) || !l.l(this.f45624r, gVar.f45624r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45619a, this.f45620b, this.f45621c, this.d, this.e, this.f45622f, this.h, this.f45623n, this.f45624r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45619a);
        f0.l(parcel, 2, this.f45620b);
        f0.l(parcel, 3, this.f45621c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45622f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45623n);
        f0.k(parcel, 9, this.f45624r, i10);
        f0.r(parcel, q6);
    }
}
