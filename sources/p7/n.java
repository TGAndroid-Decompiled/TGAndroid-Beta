package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final f f44683a;
    public final long f44684b;
    public final int f44685c;
    public final String d;
    public final e e;
    public final boolean f44686f;
    public final int h;
    public final int f44687n;
    public final String f44688r;

    public n(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f44683a = fVar;
        this.f44684b = j10;
        this.f44685c = i10;
        this.d = str;
        this.e = eVar;
        this.f44686f = z10;
        this.h = i11;
        this.f44687n = i12;
        this.f44688r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f44683a + ", timestamp=" + this.f44684b + ", usageType=" + this.f44685c + ", status=" + this.f44687n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f44683a, i10);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f44684b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f44685c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f44686f ? 1 : 0);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f44687n);
        f0.l(parcel, 9, this.f44688r);
        f0.r(parcel, q6);
    }
}
