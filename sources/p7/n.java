package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f40988a;
    public final long f40989b;
    public final int f40990c;
    public final String d;
    public final e e;
    public final boolean f40991f;
    public final int h;
    public final int f40992n;
    public final String f40993r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f40988a = fVar;
        this.f40989b = j3;
        this.f40990c = i10;
        this.d = str;
        this.e = eVar;
        this.f40991f = z10;
        this.h = i11;
        this.f40992n = i12;
        this.f40993r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f40988a + ", timestamp=" + this.f40989b + ", usageType=" + this.f40990c + ", status=" + this.f40992n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f40988a, i10);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f40989b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40990c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f40991f ? 1 : 0);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f40992n);
        f0.l(parcel, 9, this.f40993r);
        f0.r(parcel, q6);
    }
}
