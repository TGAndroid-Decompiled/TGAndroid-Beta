package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f45338a;
    public final String f45339b;
    public final String f45340c;
    public final String d;
    public final Uri e;
    public final String f45341f;
    public final String h;
    public final String f45342n;
    public final u f45343r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f45338a = str;
        this.f45339b = str2;
        this.f45340c = str3;
        this.d = str4;
        this.e = uri;
        this.f45341f = str5;
        this.h = str6;
        this.f45342n = str7;
        this.f45343r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f45338a, gVar.f45338a) || !l.l(this.f45339b, gVar.f45339b) || !l.l(this.f45340c, gVar.f45340c) || !l.l(this.d, gVar.d) || !l.l(this.e, gVar.e) || !l.l(this.f45341f, gVar.f45341f) || !l.l(this.h, gVar.h) || !l.l(this.f45342n, gVar.f45342n) || !l.l(this.f45343r, gVar.f45343r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45338a, this.f45339b, this.f45340c, this.d, this.e, this.f45341f, this.h, this.f45342n, this.f45343r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f45338a);
        e0.l(parcel, 2, this.f45339b);
        e0.l(parcel, 3, this.f45340c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.l(parcel, 6, this.f45341f);
        e0.l(parcel, 7, this.h);
        e0.l(parcel, 8, this.f45342n);
        e0.k(parcel, 9, this.f45343r, i10);
        e0.r(parcel, q6);
    }
}
