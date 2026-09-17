package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f48929a;
    public final a f48930b;
    public final String f48931c;
    public final boolean d;
    public final int f48932e;
    public final c f48933f;
    public final b h;
    public final boolean f48934n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f48929a = dVar;
        l.h(aVar);
        this.f48930b = aVar;
        this.f48931c = str;
        this.d = z10;
        this.f48932e = i10;
        this.f48933f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f48934n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f48929a, eVar.f48929a) || !l.l(this.f48930b, eVar.f48930b) || !l.l(this.f48933f, eVar.f48933f) || !l.l(this.h, eVar.h) || !l.l(this.f48931c, eVar.f48931c) || this.d != eVar.d || this.f48932e != eVar.f48932e || this.f48934n != eVar.f48934n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48929a, this.f48930b, this.f48933f, this.h, this.f48931c, Boolean.valueOf(this.d), Integer.valueOf(this.f48932e), Boolean.valueOf(this.f48934n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f48929a, i10);
        e0.k(parcel, 2, this.f48930b, i10);
        e0.l(parcel, 3, this.f48931c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f48932e);
        e0.k(parcel, 6, this.f48933f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f48934n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
