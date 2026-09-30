package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f41085a;
    public final long f41086b;
    public final int f41087c;
    public final String d;
    public final e e;
    public final boolean f41088f;
    public final int h;
    public final int f41089n;
    public final String f41090r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f41085a = fVar;
        this.f41086b = j3;
        this.f41087c = i10;
        this.d = str;
        this.e = eVar;
        this.f41088f = z10;
        this.h = i11;
        this.f41089n = i12;
        this.f41090r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f41085a + ", timestamp=" + this.f41086b + ", usageType=" + this.f41087c + ", status=" + this.f41089n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f41085a, i10);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f41086b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f41087c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f41088f ? 1 : 0);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f41089n);
        f0.l(parcel, 9, this.f41090r);
        f0.r(parcel, q6);
    }
}
