package x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c7.u;
import java.util.Arrays;
import n6.l;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(1);
    public final String f50723a;
    public final String f50724b;
    public final String f50725c;
    public final String d;
    public final Uri f50726e;
    public final String f50727f;
    public final String h;
    public final String f50728n;
    public final u f50729r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f50723a = str;
        this.f50724b = str2;
        this.f50725c = str3;
        this.d = str4;
        this.f50726e = uri;
        this.f50727f = str5;
        this.h = str6;
        this.f50728n = str7;
        this.f50729r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f50723a, gVar.f50723a) || !l.l(this.f50724b, gVar.f50724b) || !l.l(this.f50725c, gVar.f50725c) || !l.l(this.d, gVar.d) || !l.l(this.f50726e, gVar.f50726e) || !l.l(this.f50727f, gVar.f50727f) || !l.l(this.h, gVar.h) || !l.l(this.f50728n, gVar.f50728n) || !l.l(this.f50729r, gVar.f50729r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50723a, this.f50724b, this.f50725c, this.d, this.f50726e, this.f50727f, this.h, this.f50728n, this.f50729r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f50723a);
        d0.l(parcel, 2, this.f50724b);
        d0.l(parcel, 3, this.f50725c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f50726e, i10);
        d0.l(parcel, 6, this.f50727f);
        d0.l(parcel, 7, this.h);
        d0.l(parcel, 8, this.f50728n);
        d0.k(parcel, 9, this.f50729r, i10);
        d0.r(parcel, q6);
    }
}
