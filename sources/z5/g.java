package z5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import e7.u;
import java.util.Arrays;
import p6.m;
import y8.i;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new i(7);
    public final String f59783a;
    public final String f59784b;
    public final String f59785c;
    public final String d;
    public final Uri f59786e;
    public final String f59787f;
    public final String h;
    public final String f59788n;
    public final u f59789r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.g(str);
        this.f59783a = str;
        this.f59784b = str2;
        this.f59785c = str3;
        this.d = str4;
        this.f59786e = uri;
        this.f59787f = str5;
        this.h = str6;
        this.f59788n = str7;
        this.f59789r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.k(this.f59783a, gVar.f59783a) || !m.k(this.f59784b, gVar.f59784b) || !m.k(this.f59785c, gVar.f59785c) || !m.k(this.d, gVar.d) || !m.k(this.f59786e, gVar.f59786e) || !m.k(this.f59787f, gVar.f59787f) || !m.k(this.h, gVar.h) || !m.k(this.f59788n, gVar.f59788n) || !m.k(this.f59789r, gVar.f59789r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59783a, this.f59784b, this.f59785c, this.d, this.f59786e, this.f59787f, this.h, this.f59788n, this.f59789r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f59783a);
        j8.a.m(parcel, 2, this.f59784b);
        j8.a.m(parcel, 3, this.f59785c);
        j8.a.m(parcel, 4, this.d);
        j8.a.l(parcel, 5, this.f59786e, i3);
        j8.a.m(parcel, 6, this.f59787f);
        j8.a.m(parcel, 7, this.h);
        j8.a.m(parcel, 8, this.f59788n);
        j8.a.l(parcel, 9, this.f59789r, i3);
        j8.a.t(parcel, s6);
    }
}
