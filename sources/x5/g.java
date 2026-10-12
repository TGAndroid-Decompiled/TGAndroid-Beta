package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.m;
import w7.c0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f50916a;
    public final String f50917b;
    public final String f50918c;
    public final String d;
    public final Uri f50919e;
    public final String f50920f;
    public final String h;
    public final String f50921n;
    public final u f50922r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.h(str);
        this.f50916a = str;
        this.f50917b = str2;
        this.f50918c = str3;
        this.d = str4;
        this.f50919e = uri;
        this.f50920f = str5;
        this.h = str6;
        this.f50921n = str7;
        this.f50922r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.l(this.f50916a, gVar.f50916a) || !m.l(this.f50917b, gVar.f50917b) || !m.l(this.f50918c, gVar.f50918c) || !m.l(this.d, gVar.d) || !m.l(this.f50919e, gVar.f50919e) || !m.l(this.f50920f, gVar.f50920f) || !m.l(this.h, gVar.h) || !m.l(this.f50921n, gVar.f50921n) || !m.l(this.f50922r, gVar.f50922r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50916a, this.f50917b, this.f50918c, this.d, this.f50919e, this.f50920f, this.h, this.f50921n, this.f50922r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f50916a);
        c0.l(parcel, 2, this.f50917b);
        c0.l(parcel, 3, this.f50918c);
        c0.l(parcel, 4, this.d);
        c0.k(parcel, 5, this.f50919e, i10);
        c0.l(parcel, 6, this.f50920f);
        c0.l(parcel, 7, this.h);
        c0.l(parcel, 8, this.f50921n);
        c0.k(parcel, 9, this.f50922r, i10);
        c0.r(parcel, q6);
    }
}
