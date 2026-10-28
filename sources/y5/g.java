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
    public final String f52116a;
    public final String f52117b;
    public final String f52118c;
    public final String d;
    public final Uri e;
    public final String f52119f;
    public final String h;
    public final String f52120n;
    public final u f52121r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f52116a = str;
        this.f52117b = str2;
        this.f52118c = str3;
        this.d = str4;
        this.e = uri;
        this.f52119f = str5;
        this.h = str6;
        this.f52120n = str7;
        this.f52121r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f52116a, gVar.f52116a) || !l.l(this.f52117b, gVar.f52117b) || !l.l(this.f52118c, gVar.f52118c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f52119f, gVar.f52119f) || !l.l(this.h, gVar.h) || !l.l(this.f52120n, gVar.f52120n) || !l.l(this.f52121r, gVar.f52121r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52116a, this.f52117b, this.f52118c, this.d, this.e, this.f52119f, this.h, this.f52120n, this.f52121r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f52116a);
        df.l(parcel, 2, this.f52117b);
        df.l(parcel, 3, this.f52118c);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.l(parcel, 6, this.f52119f);
        df.l(parcel, 7, this.h);
        df.l(parcel, 8, this.f52120n);
        df.k(parcel, 9, this.f52121r, i10);
        df.r(parcel, q5);
    }
}
