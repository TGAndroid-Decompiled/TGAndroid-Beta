package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f57148a;
    public final long f57149b;
    public final int f57150c;
    public final String d;
    public final e f57151e;
    public final boolean f57152f;
    public final int h;
    public final int f57153n;
    public final String f57154r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.f57148a = fVar;
        this.f57149b = j3;
        this.f57150c = i7;
        this.d = str;
        this.f57151e = eVar;
        this.f57152f = z10;
        this.h = i10;
        this.f57153n = i11;
        this.f57154r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f57148a + ", timestamp=" + this.f57149b + ", usageType=" + this.f57150c + ", status=" + this.f57153n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f57148a, i7);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f57149b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f57150c);
        bc.l(parcel, 4, this.d);
        bc.k(parcel, 5, this.f57151e, i7);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f57152f ? 1 : 0);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f57153n);
        bc.l(parcel, 9, this.f57154r);
        bc.s(parcel, r10);
    }
}
