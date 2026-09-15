package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f40719a;
    public final long f40720b;
    public final int f40721c;
    public final String d;
    public final e e;
    public final boolean f40722f;
    public final int h;
    public final int f40723n;
    public final String f40724r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f40719a = fVar;
        this.f40720b = j3;
        this.f40721c = i10;
        this.d = str;
        this.e = eVar;
        this.f40722f = z10;
        this.h = i11;
        this.f40723n = i12;
        this.f40724r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f40719a + ", timestamp=" + this.f40720b + ", usageType=" + this.f40721c + ", status=" + this.f40723n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f40719a, i10);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f40720b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f40721c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f40722f ? 1 : 0);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f40723n);
        e0.l(parcel, 9, this.f40724r);
        e0.r(parcel, q6);
    }
}
