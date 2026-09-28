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
    public final String f45620a;
    public final String f45621b;
    public final String f45622c;
    public final String d;
    public final Uri e;
    public final String f45623f;
    public final String h;
    public final String f45624n;
    public final u f45625r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45620a = str;
        this.f45621b = str2;
        this.f45622c = str3;
        this.d = str4;
        this.e = uri;
        this.f45623f = str5;
        this.h = str6;
        this.f45624n = str7;
        this.f45625r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45620a, gVar.f45620a) || !l.l(this.f45621b, gVar.f45621b) || !l.l(this.f45622c, gVar.f45622c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45623f, gVar.f45623f) || !l.l(this.h, gVar.h) || !l.l(this.f45624n, gVar.f45624n) || !l.l(this.f45625r, gVar.f45625r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45620a, this.f45621b, this.f45622c, this.d, this.e, this.f45623f, this.h, this.f45624n, this.f45625r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45620a);
        f0.l(parcel, 2, this.f45621b);
        f0.l(parcel, 3, this.f45622c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45623f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45624n);
        f0.k(parcel, 9, this.f45625r, i10);
        f0.r(parcel, q6);
    }
}
