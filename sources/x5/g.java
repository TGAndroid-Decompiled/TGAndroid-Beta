package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(29);
    public final String f49751a;
    public final String f49752b;
    public final String f49753c;
    public final String d;
    public final Uri e;
    public final String f49754f;
    public final String h;
    public final String f49755n;
    public final u f49756r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49751a = str;
        this.f49752b = str2;
        this.f49753c = str3;
        this.d = str4;
        this.e = uri;
        this.f49754f = str5;
        this.h = str6;
        this.f49755n = str7;
        this.f49756r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49751a, gVar.f49751a) || !l.l(this.f49752b, gVar.f49752b) || !l.l(this.f49753c, gVar.f49753c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f49754f, gVar.f49754f) || !l.l(this.h, gVar.h) || !l.l(this.f49755n, gVar.f49755n) || !l.l(this.f49756r, gVar.f49756r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49751a, this.f49752b, this.f49753c, this.d, this.e, this.f49754f, this.h, this.f49755n, this.f49756r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f49751a);
        f0.l(parcel, 2, this.f49752b);
        f0.l(parcel, 3, this.f49753c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f49754f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f49755n);
        f0.k(parcel, 9, this.f49756r, i10);
        f0.r(parcel, q6);
    }
}
