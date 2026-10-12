package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.c0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f45393a;
    public final long f45394b;
    public final int f45395c;
    public final String d;
    public final e f45396e;
    public final boolean f45397f;
    public final int h;
    public final int f45398n;
    public final String f45399r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f45393a = fVar;
        this.f45394b = j3;
        this.f45395c = i10;
        this.d = str;
        this.f45396e = eVar;
        this.f45397f = z10;
        this.h = i11;
        this.f45398n = i12;
        this.f45399r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f45393a + ", timestamp=" + this.f45394b + ", usageType=" + this.f45395c + ", status=" + this.f45398n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 1, this.f45393a, i10);
        c0.s(parcel, 2, 8);
        parcel.writeLong(this.f45394b);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f45395c);
        c0.l(parcel, 4, this.d);
        c0.k(parcel, 5, this.f45396e, i10);
        c0.s(parcel, 6, 4);
        parcel.writeInt(this.f45397f ? 1 : 0);
        c0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        c0.s(parcel, 8, 4);
        parcel.writeInt(this.f45398n);
        c0.l(parcel, 9, this.f45399r);
        c0.r(parcel, q6);
    }
}
