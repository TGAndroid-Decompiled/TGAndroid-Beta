package y5;

import a8.df;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import d7.u;
import java.util.Arrays;
import o6.l;
import w8.s;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(29);
    public final String f52055a;
    public final String f52056b;
    public final String f52057c;
    public final String d;
    public final Uri e;
    public final String f52058f;
    public final String h;
    public final String f52059n;
    public final u f52060r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f52055a = str;
        this.f52056b = str2;
        this.f52057c = str3;
        this.d = str4;
        this.e = uri;
        this.f52058f = str5;
        this.h = str6;
        this.f52059n = str7;
        this.f52060r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f52055a, gVar.f52055a) || !l.l(this.f52056b, gVar.f52056b) || !l.l(this.f52057c, gVar.f52057c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f52058f, gVar.f52058f) || !l.l(this.h, gVar.h) || !l.l(this.f52059n, gVar.f52059n) || !l.l(this.f52060r, gVar.f52060r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52055a, this.f52056b, this.f52057c, this.d, this.e, this.f52058f, this.h, this.f52059n, this.f52060r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52055a);
        df.l(parcel, 2, this.f52056b);
        df.l(parcel, 3, this.f52057c);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.l(parcel, 6, this.f52058f);
        df.l(parcel, 7, this.h);
        df.l(parcel, 8, this.f52059n);
        df.k(parcel, 9, this.f52060r, i10);
        df.r(parcel, q5);
    }
}
