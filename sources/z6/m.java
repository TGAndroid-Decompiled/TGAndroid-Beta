package z6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Locale;
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new w7.i(25);
    public final f f50336a;
    public final long f50337b;
    public final int f50338c;
    public final String d;
    public final e f50339e;
    public final boolean f50340f;
    public final int h;
    public final int f50341n;
    public final String f50342r;

    public m(f fVar, long j10, int i9, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.f50336a = fVar;
        this.f50337b = j10;
        this.f50338c = i9;
        this.d = str;
        this.f50339e = eVar;
        this.f50340f = z10;
        this.h = i10;
        this.f50341n = i11;
        this.f50342r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f50336a + ", timestamp=" + this.f50337b + ", usageType=" + this.f50338c + ", status=" + this.f50341n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f50336a, i9);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.f50337b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f50338c);
        p8.l(parcel, 4, this.d);
        p8.k(parcel, 5, this.f50339e, i9);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f50340f ? 1 : 0);
        p8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.f50341n);
        p8.l(parcel, 9, this.f50342r);
        p8.r(parcel, q10);
    }
}
