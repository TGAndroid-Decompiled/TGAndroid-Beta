package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.g0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f44326a;
    public final long f44327b;
    public final int f44328c;
    public final String d;
    public final e f44329e;
    public final boolean f44330f;
    public final int h;
    public final int f44331n;
    public final String f44332r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f44326a = fVar;
        this.f44327b = j3;
        this.f44328c = i10;
        this.d = str;
        this.f44329e = eVar;
        this.f44330f = z10;
        this.h = i11;
        this.f44331n = i12;
        this.f44332r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f44326a + ", timestamp=" + this.f44327b + ", usageType=" + this.f44328c + ", status=" + this.f44331n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f44326a, i10);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f44327b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44328c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f44329e, i10);
        g0.s(parcel, 6, 4);
        parcel.writeInt(this.f44330f ? 1 : 0);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f44331n);
        g0.l(parcel, 9, this.f44332r);
        g0.r(parcel, q6);
    }
}
