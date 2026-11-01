package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.h0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new n(0);
    public final f f44886a;
    public final long f44887b;
    public final int f44888c;
    public final String d;
    public final e e;
    public final boolean f44889f;
    public final int h;
    public final int f44890n;
    public final String f44891r;

    public m(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f44886a = fVar;
        this.f44887b = j10;
        this.f44888c = i10;
        this.d = str;
        this.e = eVar;
        this.f44889f = z10;
        this.h = i11;
        this.f44890n = i12;
        this.f44891r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f44886a + ", timestamp=" + this.f44887b + ", usageType=" + this.f44888c + ", status=" + this.f44890n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f44886a, i10);
        h0.s(parcel, 2, 8);
        parcel.writeLong(this.f44887b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f44888c);
        h0.l(parcel, 4, this.d);
        h0.k(parcel, 5, this.e, i10);
        h0.s(parcel, 6, 4);
        parcel.writeInt(this.f44889f ? 1 : 0);
        h0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        h0.s(parcel, 8, 4);
        parcel.writeInt(this.f44890n);
        h0.l(parcel, 9, this.f44891r);
        h0.r(parcel, q6);
    }
}
