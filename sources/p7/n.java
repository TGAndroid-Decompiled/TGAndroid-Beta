package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.d0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f45541a;
    public final long f45542b;
    public final int f45543c;
    public final String d;
    public final e f45544e;
    public final boolean f45545f;
    public final int h;
    public final int f45546n;
    public final String f45547r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f45541a = fVar;
        this.f45542b = j3;
        this.f45543c = i10;
        this.d = str;
        this.f45544e = eVar;
        this.f45545f = z10;
        this.h = i11;
        this.f45546n = i12;
        this.f45547r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f45541a + ", timestamp=" + this.f45542b + ", usageType=" + this.f45543c + ", status=" + this.f45546n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f45541a, i10);
        d0.s(parcel, 2, 8);
        parcel.writeLong(this.f45542b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45543c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f45544e, i10);
        d0.s(parcel, 6, 4);
        parcel.writeInt(this.f45545f ? 1 : 0);
        d0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f45546n);
        d0.l(parcel, 9, this.f45547r);
        d0.r(parcel, q6);
    }
}
