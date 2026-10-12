package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.m;
import v8.r;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f50909a;
    public final a f50910b;
    public final String f50911c;
    public final boolean d;
    public final int f50912e;
    public final c f50913f;
    public final b h;
    public final boolean f50914n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        m.h(dVar);
        this.f50909a = dVar;
        m.h(aVar);
        this.f50910b = aVar;
        this.f50911c = str;
        this.d = z10;
        this.f50912e = i10;
        this.f50913f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f50914n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.l(this.f50909a, eVar.f50909a) || !m.l(this.f50910b, eVar.f50910b) || !m.l(this.f50913f, eVar.f50913f) || !m.l(this.h, eVar.h) || !m.l(this.f50911c, eVar.f50911c) || this.d != eVar.d || this.f50912e != eVar.f50912e || this.f50914n != eVar.f50914n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50909a, this.f50910b, this.f50913f, this.h, this.f50911c, Boolean.valueOf(this.d), Integer.valueOf(this.f50912e), Boolean.valueOf(this.f50914n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 1, this.f50909a, i10);
        c0.k(parcel, 2, this.f50910b, i10);
        c0.l(parcel, 3, this.f50911c);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        c0.s(parcel, 5, 4);
        parcel.writeInt(this.f50912e);
        c0.k(parcel, 6, this.f50913f, i10);
        c0.k(parcel, 7, this.h, i10);
        c0.s(parcel, 8, 4);
        parcel.writeInt(this.f50914n ? 1 : 0);
        c0.r(parcel, q6);
    }
}
