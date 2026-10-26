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
    public final String f52058a;
    public final String f52059b;
    public final String f52060c;
    public final String d;
    public final Uri e;
    public final String f52061f;
    public final String h;
    public final String f52062n;
    public final u f52063r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f52058a = str;
        this.f52059b = str2;
        this.f52060c = str3;
        this.d = str4;
        this.e = uri;
        this.f52061f = str5;
        this.h = str6;
        this.f52062n = str7;
        this.f52063r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f52058a, gVar.f52058a) || !l.l(this.f52059b, gVar.f52059b) || !l.l(this.f52060c, gVar.f52060c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f52061f, gVar.f52061f) || !l.l(this.h, gVar.h) || !l.l(this.f52062n, gVar.f52062n) || !l.l(this.f52063r, gVar.f52063r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52058a, this.f52059b, this.f52060c, this.d, this.e, this.f52061f, this.h, this.f52062n, this.f52063r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52058a);
        df.l(parcel, 2, this.f52059b);
        df.l(parcel, 3, this.f52060c);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.l(parcel, 6, this.f52061f);
        df.l(parcel, 7, this.h);
        df.l(parcel, 8, this.f52062n);
        df.k(parcel, 9, this.f52063r, i10);
        df.r(parcel, q5);
    }
}
