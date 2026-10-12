package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.c0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f45398a;
    public final long f45399b;
    public final int f45400c;
    public final String d;
    public final e f45401e;
    public final boolean f45402f;
    public final int h;
    public final int f45403n;
    public final String f45404r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f45398a = fVar;
        this.f45399b = j3;
        this.f45400c = i10;
        this.d = str;
        this.f45401e = eVar;
        this.f45402f = z10;
        this.h = i11;
        this.f45403n = i12;
        this.f45404r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f45398a + ", timestamp=" + this.f45399b + ", usageType=" + this.f45400c + ", status=" + this.f45403n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 1, this.f45398a, i10);
        c0.s(parcel, 2, 8);
        parcel.writeLong(this.f45399b);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f45400c);
        c0.l(parcel, 4, this.d);
        c0.k(parcel, 5, this.f45401e, i10);
        c0.s(parcel, 6, 4);
        parcel.writeInt(this.f45402f ? 1 : 0);
        c0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        c0.s(parcel, 8, 4);
        parcel.writeInt(this.f45403n);
        c0.l(parcel, 9, this.f45404r);
        c0.r(parcel, q6);
    }
}
