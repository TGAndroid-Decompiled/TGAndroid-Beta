package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f40987a;
    public final long f40988b;
    public final int f40989c;
    public final String d;
    public final e e;
    public final boolean f40990f;
    public final int h;
    public final int f40991n;
    public final String f40992r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f40987a = fVar;
        this.f40988b = j3;
        this.f40989c = i10;
        this.d = str;
        this.e = eVar;
        this.f40990f = z10;
        this.h = i11;
        this.f40991n = i12;
        this.f40992r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f40987a + ", timestamp=" + this.f40988b + ", usageType=" + this.f40989c + ", status=" + this.f40991n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f40987a, i10);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f40988b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40989c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f40990f ? 1 : 0);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f40991n);
        f0.l(parcel, 9, this.f40992r);
        f0.r(parcel, q6);
    }
}
