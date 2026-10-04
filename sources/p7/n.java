package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.g0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f44334a;
    public final long f44335b;
    public final int f44336c;
    public final String d;
    public final e f44337e;
    public final boolean f44338f;
    public final int h;
    public final int f44339n;
    public final String f44340r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f44334a = fVar;
        this.f44335b = j3;
        this.f44336c = i10;
        this.d = str;
        this.f44337e = eVar;
        this.f44338f = z10;
        this.h = i11;
        this.f44339n = i12;
        this.f44340r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f44334a + ", timestamp=" + this.f44335b + ", usageType=" + this.f44336c + ", status=" + this.f44339n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f44334a, i10);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f44335b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44336c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f44337e, i10);
        g0.s(parcel, 6, 4);
        parcel.writeInt(this.f44338f ? 1 : 0);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f44339n);
        g0.l(parcel, 9, this.f44340r);
        g0.r(parcel, q6);
    }
}
