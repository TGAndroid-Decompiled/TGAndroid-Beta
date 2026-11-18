package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f57103a;
    public final long f57104b;
    public final int f57105c;
    public final String d;
    public final e f57106e;
    public final boolean f57107f;
    public final int h;
    public final int f57108n;
    public final String f57109r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.f57103a = fVar;
        this.f57104b = j3;
        this.f57105c = i7;
        this.d = str;
        this.f57106e = eVar;
        this.f57107f = z10;
        this.h = i10;
        this.f57108n = i11;
        this.f57109r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f57103a + ", timestamp=" + this.f57104b + ", usageType=" + this.f57105c + ", status=" + this.f57108n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f57103a, i7);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f57104b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f57105c);
        bc.l(parcel, 4, this.d);
        bc.k(parcel, 5, this.f57106e, i7);
        bc.q(parcel, 6, 4);
        parcel.writeInt(this.f57107f ? 1 : 0);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f57108n);
        bc.l(parcel, 9, this.f57109r);
        bc.s(parcel, r10);
    }
}
