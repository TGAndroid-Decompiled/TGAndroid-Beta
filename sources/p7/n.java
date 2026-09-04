package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f43985a;
    public final long f43986b;
    public final int f43987c;
    public final String d;
    public final e f43988e;
    public final boolean f43989f;
    public final int h;
    public final int f43990n;
    public final String f43991r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f43985a = fVar;
        this.f43986b = j3;
        this.f43987c = i10;
        this.d = str;
        this.f43988e = eVar;
        this.f43989f = z10;
        this.h = i11;
        this.f43990n = i12;
        this.f43991r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f43985a + ", timestamp=" + this.f43986b + ", usageType=" + this.f43987c + ", status=" + this.f43990n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f43985a, i10);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f43986b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f43987c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.f43988e, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f43989f ? 1 : 0);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f43990n);
        e0.l(parcel, 9, this.f43991r);
        e0.r(parcel, q6);
    }
}
