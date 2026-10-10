package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.d0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f45551a;
    public final long f45552b;
    public final int f45553c;
    public final String d;
    public final e f45554e;
    public final boolean f45555f;
    public final int h;
    public final int f45556n;
    public final String f45557r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f45551a = fVar;
        this.f45552b = j3;
        this.f45553c = i10;
        this.d = str;
        this.f45554e = eVar;
        this.f45555f = z10;
        this.h = i11;
        this.f45556n = i12;
        this.f45557r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f45551a + ", timestamp=" + this.f45552b + ", usageType=" + this.f45553c + ", status=" + this.f45556n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f45551a, i10);
        d0.s(parcel, 2, 8);
        parcel.writeLong(this.f45552b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45553c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f45554e, i10);
        d0.s(parcel, 6, 4);
        parcel.writeInt(this.f45555f ? 1 : 0);
        d0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f45556n);
        d0.l(parcel, 9, this.f45557r);
        d0.r(parcel, q6);
    }
}
