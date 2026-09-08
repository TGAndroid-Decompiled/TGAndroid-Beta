package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import v8.r;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(25);
    public final d f48928a;
    public final a f48929b;
    public final String f48930c;
    public final boolean d;
    public final int f48931e;
    public final c f48932f;
    public final b h;
    public final boolean f48933n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f48928a = dVar;
        l.h(aVar);
        this.f48929b = aVar;
        this.f48930c = str;
        this.d = z10;
        this.f48931e = i10;
        this.f48932f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f48933n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f48928a, eVar.f48928a) || !l.l(this.f48929b, eVar.f48929b) || !l.l(this.f48932f, eVar.f48932f) || !l.l(this.h, eVar.h) || !l.l(this.f48930c, eVar.f48930c) || this.d != eVar.d || this.f48931e != eVar.f48931e || this.f48933n != eVar.f48933n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48928a, this.f48929b, this.f48932f, this.h, this.f48930c, Boolean.valueOf(this.d), Integer.valueOf(this.f48931e), Boolean.valueOf(this.f48933n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f48928a, i10);
        e0.k(parcel, 2, this.f48929b, i10);
        e0.l(parcel, 3, this.f48930c);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f48931e);
        e0.k(parcel, 6, this.f48932f, i10);
        e0.k(parcel, 7, this.h, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f48933n ? 1 : 0);
        e0.r(parcel, q6);
    }
}
