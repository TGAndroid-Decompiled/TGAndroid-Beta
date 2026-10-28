package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final f f47043a;
    public final long f47044b;
    public final int f47045c;
    public final String d;
    public final e e;
    public final boolean f47046f;
    public final int h;
    public final int f47047n;
    public final String f47048r;

    public n(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f47043a = fVar;
        this.f47044b = j10;
        this.f47045c = i10;
        this.d = str;
        this.e = eVar;
        this.f47046f = z10;
        this.h = i11;
        this.f47047n = i12;
        this.f47048r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f47043a + ", timestamp=" + this.f47044b + ", usageType=" + this.f47045c + ", status=" + this.f47047n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f47043a, i10);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.f47044b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f47045c);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.f47046f ? 1 : 0);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f47047n);
        df.l(parcel, 9, this.f47048r);
        df.r(parcel, q5);
    }
}
