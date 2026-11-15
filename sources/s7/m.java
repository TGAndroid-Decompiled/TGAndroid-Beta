package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f56529a;
    public final long f56530b;
    public final int f56531c;
    public final String d;
    public final e f56532e;
    public final boolean f56533f;
    public final int h;
    public final int f56534n;
    public final String f56535r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.f56529a = fVar;
        this.f56530b = j3;
        this.f56531c = i7;
        this.d = str;
        this.f56532e = eVar;
        this.f56533f = z10;
        this.h = i10;
        this.f56534n = i11;
        this.f56535r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f56529a + ", timestamp=" + this.f56530b + ", usageType=" + this.f56531c + ", status=" + this.f56534n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.f56529a, i7);
        yb.q(parcel, 2, 8);
        parcel.writeLong(this.f56530b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f56531c);
        yb.l(parcel, 4, this.d);
        yb.k(parcel, 5, this.f56532e, i7);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.f56533f ? 1 : 0);
        yb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.f56534n);
        yb.l(parcel, 9, this.f56535r);
        yb.s(parcel, r10);
    }
}
