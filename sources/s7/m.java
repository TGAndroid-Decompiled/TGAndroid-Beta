package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f54869a;
    public final long f54870b;
    public final int f54871c;
    public final String d;
    public final e f54872e;
    public final boolean f54873f;
    public final int h;
    public final int f54874n;
    public final String f54875r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z9, int i10, int i11, String str2) {
        this.f54869a = fVar;
        this.f54870b = j3;
        this.f54871c = i7;
        this.d = str;
        this.f54872e = eVar;
        this.f54873f = z9;
        this.h = i10;
        this.f54874n = i11;
        this.f54875r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f54869a + ", timestamp=" + this.f54870b + ", usageType=" + this.f54871c + ", status=" + this.f54874n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f54869a, i7);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f54870b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54871c);
        xb.l(parcel, 4, this.d);
        xb.k(parcel, 5, this.f54872e, i7);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f54873f ? 1 : 0);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f54874n);
        xb.l(parcel, 9, this.f54875r);
        xb.s(parcel, r10);
    }
}
