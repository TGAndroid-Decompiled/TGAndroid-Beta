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
    public final String f45606a;
    public final String f45607b;
    public final String f45608c;
    public final String d;
    public final Uri e;
    public final String f45609f;
    public final String h;
    public final String f45610n;
    public final u f45611r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45606a = str;
        this.f45607b = str2;
        this.f45608c = str3;
        this.d = str4;
        this.e = uri;
        this.f45609f = str5;
        this.h = str6;
        this.f45610n = str7;
        this.f45611r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45606a, gVar.f45606a) || !l.l(this.f45607b, gVar.f45607b) || !l.l(this.f45608c, gVar.f45608c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45609f, gVar.f45609f) || !l.l(this.h, gVar.h) || !l.l(this.f45610n, gVar.f45610n) || !l.l(this.f45611r, gVar.f45611r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45606a, this.f45607b, this.f45608c, this.d, this.e, this.f45609f, this.h, this.f45610n, this.f45611r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f45606a);
        f0.l(parcel, 2, this.f45607b);
        f0.l(parcel, 3, this.f45608c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f45609f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f45610n);
        f0.k(parcel, 9, this.f45611r, i10);
        f0.r(parcel, q6);
    }
}
