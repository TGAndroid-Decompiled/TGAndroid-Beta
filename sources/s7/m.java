package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f54870a;
    public final long f54871b;
    public final int f54872c;
    public final String d;
    public final e f54873e;
    public final boolean f54874f;
    public final int h;
    public final int f54875n;
    public final String f54876r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z9, int i10, int i11, String str2) {
        this.f54870a = fVar;
        this.f54871b = j3;
        this.f54872c = i7;
        this.d = str;
        this.f54873e = eVar;
        this.f54874f = z9;
        this.h = i10;
        this.f54875n = i11;
        this.f54876r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f54870a + ", timestamp=" + this.f54871b + ", usageType=" + this.f54872c + ", status=" + this.f54875n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.f54870a, i7);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.f54871b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f54872c);
        wb.l(parcel, 4, this.d);
        wb.k(parcel, 5, this.f54873e, i7);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f54874f ? 1 : 0);
        wb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.f54875n);
        wb.l(parcel, 9, this.f54876r);
        wb.s(parcel, r10);
    }
}
