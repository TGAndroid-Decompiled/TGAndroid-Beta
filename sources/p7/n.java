package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.g0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f44341a;
    public final long f44342b;
    public final int f44343c;
    public final String d;
    public final e f44344e;
    public final boolean f44345f;
    public final int h;
    public final int f44346n;
    public final String f44347r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f44341a = fVar;
        this.f44342b = j3;
        this.f44343c = i10;
        this.d = str;
        this.f44344e = eVar;
        this.f44345f = z10;
        this.h = i11;
        this.f44346n = i12;
        this.f44347r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f44341a + ", timestamp=" + this.f44342b + ", usageType=" + this.f44343c + ", status=" + this.f44346n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f44341a, i10);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f44342b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f44343c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f44344e, i10);
        g0.s(parcel, 6, 4);
        parcel.writeInt(this.f44345f ? 1 : 0);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f44346n);
        g0.l(parcel, 9, this.f44347r);
        g0.r(parcel, q6);
    }
}
