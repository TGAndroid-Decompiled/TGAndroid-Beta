package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final f f47005a;
    public final long f47006b;
    public final int f47007c;
    public final String d;
    public final e e;
    public final boolean f47008f;
    public final int h;
    public final int f47009n;
    public final String f47010r;

    public n(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f47005a = fVar;
        this.f47006b = j10;
        this.f47007c = i10;
        this.d = str;
        this.e = eVar;
        this.f47008f = z10;
        this.h = i11;
        this.f47009n = i12;
        this.f47010r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f47005a + ", timestamp=" + this.f47006b + ", usageType=" + this.f47007c + ", status=" + this.f47009n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f47005a, i10);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.f47006b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f47007c);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.f47008f ? 1 : 0);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f47009n);
        df.l(parcel, 9, this.f47010r);
        df.r(parcel, q5);
    }
}
