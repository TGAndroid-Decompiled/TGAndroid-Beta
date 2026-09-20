package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f41013a;
    public final long f41014b;
    public final int f41015c;
    public final String d;
    public final e e;
    public final boolean f41016f;
    public final int h;
    public final int f41017n;
    public final String f41018r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f41013a = fVar;
        this.f41014b = j3;
        this.f41015c = i10;
        this.d = str;
        this.e = eVar;
        this.f41016f = z10;
        this.h = i11;
        this.f41017n = i12;
        this.f41018r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f41013a + ", timestamp=" + this.f41014b + ", usageType=" + this.f41015c + ", status=" + this.f41017n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f41013a, i10);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f41014b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f41015c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f41016f ? 1 : 0);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f41017n);
        f0.l(parcel, 9, this.f41018r);
        f0.r(parcel, q6);
    }
}
