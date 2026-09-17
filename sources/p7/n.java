package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f43986a;
    public final long f43987b;
    public final int f43988c;
    public final String d;
    public final e f43989e;
    public final boolean f43990f;
    public final int h;
    public final int f43991n;
    public final String f43992r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f43986a = fVar;
        this.f43987b = j3;
        this.f43988c = i10;
        this.d = str;
        this.f43989e = eVar;
        this.f43990f = z10;
        this.h = i11;
        this.f43991n = i12;
        this.f43992r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f43986a + ", timestamp=" + this.f43987b + ", usageType=" + this.f43988c + ", status=" + this.f43991n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f43986a, i10);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f43987b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f43988c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.f43989e, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f43990f ? 1 : 0);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f43991n);
        e0.l(parcel, 9, this.f43992r);
        e0.r(parcel, q6);
    }
}
