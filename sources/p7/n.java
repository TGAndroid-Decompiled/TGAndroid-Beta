package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public final f f42874a;
    public final long f42875b;
    public final int f42876c;
    public final String d;
    public final e e;
    public final boolean f42877f;
    public final int h;
    public final int f42878n;
    public final String f42879r;

    public n(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f42874a = fVar;
        this.f42875b = j10;
        this.f42876c = i10;
        this.d = str;
        this.e = eVar;
        this.f42877f = z10;
        this.h = i11;
        this.f42878n = i12;
        this.f42879r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f42874a + ", timestamp=" + this.f42875b + ", usageType=" + this.f42876c + ", status=" + this.f42878n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f42874a, i10);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.f42875b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f42876c);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.s(parcel, 6, 4);
        parcel.writeInt(this.f42877f ? 1 : 0);
        f0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f0.s(parcel, 8, 4);
        parcel.writeInt(this.f42878n);
        f0.l(parcel, 9, this.f42879r);
        f0.r(parcel, q6);
    }
}
