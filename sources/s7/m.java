package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f57144a;
    public final long f57145b;
    public final int f57146c;
    public final String d;
    public final e f57147e;
    public final boolean f57148f;
    public final int h;
    public final int f57149n;
    public final String f57150r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.f57144a = fVar;
        this.f57145b = j3;
        this.f57146c = i7;
        this.d = str;
        this.f57147e = eVar;
        this.f57148f = z10;
        this.h = i10;
        this.f57149n = i11;
        this.f57150r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f57144a + ", timestamp=" + this.f57145b + ", usageType=" + this.f57146c + ", status=" + this.f57149n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f57144a, i7);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f57145b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f57146c);
        bc.l(parcel, 4, this.d);
        bc.k(parcel, 5, this.f57147e, i7);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f57148f ? 1 : 0);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f57149n);
        bc.l(parcel, 9, this.f57150r);
        bc.s(parcel, r10);
    }
}
