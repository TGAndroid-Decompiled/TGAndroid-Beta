package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.g0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f44327a;
    public final long f44328b;
    public final int f44329c;
    public final String d;
    public final e f44330e;
    public final boolean f44331f;
    public final int h;
    public final int f44332n;
    public final String f44333r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f44327a = fVar;
        this.f44328b = j3;
        this.f44329c = i10;
        this.d = str;
        this.f44330e = eVar;
        this.f44331f = z10;
        this.h = i11;
        this.f44332n = i12;
        this.f44333r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f44327a + ", timestamp=" + this.f44328b + ", usageType=" + this.f44329c + ", status=" + this.f44332n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f44327a, i10);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f44328b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44329c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f44330e, i10);
        g0.s(parcel, 6, 4);
        parcel.writeInt(this.f44331f ? 1 : 0);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f44332n);
        g0.l(parcel, 9, this.f44333r);
        g0.r(parcel, q6);
    }
}
