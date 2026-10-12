package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.g0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final f f43173a;
    public final long f43174b;
    public final int f43175c;
    public final String d;
    public final e e;
    public final boolean f43176f;
    public final int h;
    public final int f43177n;
    public final String f43178r;

    public n(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f43173a = fVar;
        this.f43174b = j10;
        this.f43175c = i10;
        this.d = str;
        this.e = eVar;
        this.f43176f = z10;
        this.h = i11;
        this.f43177n = i12;
        this.f43178r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f43173a + ", timestamp=" + this.f43174b + ", usageType=" + this.f43175c + ", status=" + this.f43177n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f43173a, i10);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f43174b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f43175c);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.e, i10);
        g0.s(parcel, 6, 4);
        parcel.writeInt(this.f43176f ? 1 : 0);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.f43177n);
        g0.l(parcel, 9, this.f43178r);
        g0.r(parcel, q6);
    }
}
