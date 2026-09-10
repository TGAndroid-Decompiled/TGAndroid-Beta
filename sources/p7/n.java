package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f39844a;
    public final long f39845b;
    public final int f39846c;
    public final String d;
    public final e e;
    public final boolean f39847f;
    public final int h;
    public final int f39848n;
    public final String f39849r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f39844a = fVar;
        this.f39845b = j3;
        this.f39846c = i10;
        this.d = str;
        this.e = eVar;
        this.f39847f = z10;
        this.h = i11;
        this.f39848n = i12;
        this.f39849r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f39844a + ", timestamp=" + this.f39845b + ", usageType=" + this.f39846c + ", status=" + this.f39848n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f39844a, i10);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f39845b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f39846c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f39847f ? 1 : 0);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f39848n);
        e0.l(parcel, 9, this.f39849r);
        e0.r(parcel, q6);
    }
}
