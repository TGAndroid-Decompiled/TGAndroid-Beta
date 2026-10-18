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
    public final String f49346a;
    public final String f49347b;
    public final String f49348c;
    public final String d;
    public final Uri e;
    public final String f49349f;
    public final String h;
    public final String f49350n;
    public final u f49351r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f49346a = str;
        this.f49347b = str2;
        this.f49348c = str3;
        this.d = str4;
        this.e = uri;
        this.f49349f = str5;
        this.h = str6;
        this.f49350n = str7;
        this.f49351r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f49346a, gVar.f49346a) || !l.l(this.f49347b, gVar.f49347b) || !l.l(this.f49348c, gVar.f49348c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f49349f, gVar.f49349f) || !l.l(this.h, gVar.h) || !l.l(this.f49350n, gVar.f49350n) || !l.l(this.f49351r, gVar.f49351r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49346a, this.f49347b, this.f49348c, this.d, this.e, this.f49349f, this.h, this.f49350n, this.f49351r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f49346a);
        f0.l(parcel, 2, this.f49347b);
        f0.l(parcel, 3, this.f49348c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.l(parcel, 6, this.f49349f);
        f0.l(parcel, 7, this.h);
        f0.l(parcel, 8, this.f49350n);
        f0.k(parcel, 9, this.f49351r, i10);
        f0.r(parcel, q6);
    }
}
