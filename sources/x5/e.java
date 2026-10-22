package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.s;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(23);
    public final d f49302a;
    public final a f49303b;
    public final String f49304c;
    public final boolean d;
    public final int e;
    public final c f49305f;
    public final b h;
    public final boolean f49306n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f49302a = dVar;
        l.h(aVar);
        this.f49303b = aVar;
        this.f49304c = str;
        this.d = z10;
        this.e = i10;
        this.f49305f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f49306n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f49302a, eVar.f49302a) || !l.l(this.f49303b, eVar.f49303b) || !l.l(this.f49305f, eVar.f49305f) || !l.l(this.h, eVar.h) || !l.l(this.f49304c, eVar.f49304c) || this.d != eVar.d || this.e != eVar.e || this.f49306n != eVar.f49306n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49302a, this.f49303b, this.f49305f, this.h, this.f49304c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f49306n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f49302a, i10);
        f0.k(parcel, 2, this.f49303b, i10);
        f0.l(parcel, 3, this.f49304c);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f0.k(parcel, 6, this.f49305f, i10);
        f0.k(parcel, 7, this.h, i10);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f49306n ? 1 : 0);
        f0.r(parcel, q6);
    }
}
