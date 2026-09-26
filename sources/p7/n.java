package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f40985a;
    public final long f40986b;
    public final int f40987c;
    public final String d;
    public final e e;
    public final boolean f40988f;
    public final int h;
    public final int f40989n;
    public final String f40990r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f40985a = fVar;
        this.f40986b = j3;
        this.f40987c = i10;
        this.d = str;
        this.e = eVar;
        this.f40988f = z10;
        this.h = i11;
        this.f40989n = i12;
        this.f40990r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f40985a + ", timestamp=" + this.f40986b + ", usageType=" + this.f40987c + ", status=" + this.f40989n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f40985a, i10);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f40986b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f40987c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f40988f ? 1 : 0);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f40989n);
        f0.l(parcel, 9, this.f40990r);
        f0.r(parcel, q6);
    }
}
