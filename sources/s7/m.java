package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f57227a;
    public final long f57228b;
    public final int f57229c;
    public final String d;
    public final e f57230e;
    public final boolean f57231f;
    public final int h;
    public final int f57232n;
    public final String f57233r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.f57227a = fVar;
        this.f57228b = j3;
        this.f57229c = i7;
        this.d = str;
        this.f57230e = eVar;
        this.f57231f = z10;
        this.h = i10;
        this.f57232n = i11;
        this.f57233r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f57227a + ", timestamp=" + this.f57228b + ", usageType=" + this.f57229c + ", status=" + this.f57232n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f57227a, i7);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f57228b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f57229c);
        cc.l(parcel, 4, this.d);
        cc.k(parcel, 5, this.f57230e, i7);
        cc.q(parcel, 6, 4);
        parcel.writeInt(this.f57231f ? 1 : 0);
        cc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        cc.q(parcel, 8, 4);
        parcel.writeInt(this.f57232n);
        cc.l(parcel, 9, this.f57233r);
        cc.s(parcel, r10);
    }
}
