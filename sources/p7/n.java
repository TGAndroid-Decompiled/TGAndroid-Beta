package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.d0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f45507a;
    public final long f45508b;
    public final int f45509c;
    public final String d;
    public final e f45510e;
    public final boolean f45511f;
    public final int h;
    public final int f45512n;
    public final String f45513r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f45507a = fVar;
        this.f45508b = j3;
        this.f45509c = i10;
        this.d = str;
        this.f45510e = eVar;
        this.f45511f = z10;
        this.h = i11;
        this.f45512n = i12;
        this.f45513r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f45507a + ", timestamp=" + this.f45508b + ", usageType=" + this.f45509c + ", status=" + this.f45512n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f45507a, i10);
        d0.s(parcel, 2, 8);
        parcel.writeLong(this.f45508b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45509c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f45510e, i10);
        d0.s(parcel, 6, 4);
        parcel.writeInt(this.f45511f ? 1 : 0);
        d0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f45512n);
        d0.l(parcel, 9, this.f45513r);
        d0.r(parcel, q6);
    }
}
