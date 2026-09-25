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
    public final String f45621a;
    public final String f45622b;
    public final String f45623c;
    public final String d;
    public final Uri e;
    public final String f45624f;
    public final String h;
    public final String f45625n;
    public final u f45626r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45621a = str;
        this.f45622b = str2;
        this.f45623c = str3;
        this.d = str4;
        this.e = uri;
        this.f45624f = str5;
        this.h = str6;
        this.f45625n = str7;
        this.f45626r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45621a, gVar.f45621a) || !l.l(this.f45622b, gVar.f45622b) || !l.l(this.f45623c, gVar.f45623c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45624f, gVar.f45624f) || !l.l(this.h, gVar.h) || !l.l(this.f45625n, gVar.f45625n) || !l.l(this.f45626r, gVar.f45626r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45621a, this.f45622b, this.f45623c, this.d, this.e, this.f45624f, this.h, this.f45625n, this.f45626r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45621a);
        f0.l(parcel, 2, this.f45622b);
        f0.l(parcel, 3, this.f45623c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45624f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45625n);
        f0.k(parcel, 9, this.f45626r, i10);
        f0.r(parcel, q6);
    }
}
