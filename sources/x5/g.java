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
    public final String f49321a;
    public final String f49322b;
    public final String f49323c;
    public final String d;
    public final Uri e;
    public final String f49324f;
    public final String h;
    public final String f49325n;
    public final u f49326r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49321a = str;
        this.f49322b = str2;
        this.f49323c = str3;
        this.d = str4;
        this.e = uri;
        this.f49324f = str5;
        this.h = str6;
        this.f49325n = str7;
        this.f49326r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49321a, gVar.f49321a) || !l.l(this.f49322b, gVar.f49322b) || !l.l(this.f49323c, gVar.f49323c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f49324f, gVar.f49324f) || !l.l(this.h, gVar.h) || !l.l(this.f49325n, gVar.f49325n) || !l.l(this.f49326r, gVar.f49326r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49321a, this.f49322b, this.f49323c, this.d, this.e, this.f49324f, this.h, this.f49325n, this.f49326r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f49321a);
        f0.l(parcel, 2, this.f49322b);
        f0.l(parcel, 3, this.f49323c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f49324f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f49325n);
        f0.k(parcel, 9, this.f49326r, i10);
        f0.r(parcel, q6);
    }
}
