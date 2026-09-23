package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f45286a;
    public final a f45287b;
    public final String f45288c;
    public final boolean d;
    public final int e;
    public final c f45289f;
    public final b h;
    public final boolean f45290n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f45286a = dVar;
        l.h(aVar);
        this.f45287b = aVar;
        this.f45288c = str;
        this.d = z10;
        this.e = i10;
        this.f45289f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f45290n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f45286a, eVar.f45286a) || !l.l(this.f45287b, eVar.f45287b) || !l.l(this.f45289f, eVar.f45289f) || !l.l(this.h, eVar.h) || !l.l(this.f45288c, eVar.f45288c) || this.d != eVar.d || this.e != eVar.e || this.f45290n != eVar.f45290n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45286a, this.f45287b, this.f45289f, this.h, this.f45288c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f45290n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f45286a, i10);
        e0.k(parcel, 2, this.f45287b, i10);
        e0.l(parcel, 3, this.f45288c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        e0.k(parcel, 6, this.f45289f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f45290n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
