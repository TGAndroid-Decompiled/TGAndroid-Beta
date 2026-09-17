package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.e0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f44013a;
    public final long f44014b;
    public final int f44015c;
    public final String d;
    public final e f44016e;
    public final boolean f44017f;
    public final int h;
    public final int f44018n;
    public final String f44019r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f44013a = fVar;
        this.f44014b = j3;
        this.f44015c = i10;
        this.d = str;
        this.f44016e = eVar;
        this.f44017f = z10;
        this.h = i11;
        this.f44018n = i12;
        this.f44019r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f44013a + ", timestamp=" + this.f44014b + ", usageType=" + this.f44015c + ", status=" + this.f44018n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f44013a, i10);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.f44014b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f44015c);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.f44016e, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f44017f ? 1 : 0);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.f44018n);
        e0.l(parcel, 9, this.f44019r);
        e0.r(parcel, q6);
    }
}
