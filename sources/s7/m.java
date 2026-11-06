package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f54845a;
    public final long f54846b;
    public final int f54847c;
    public final String d;
    public final e f54848e;
    public final boolean f54849f;
    public final int h;
    public final int f54850n;
    public final String f54851r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z9, int i10, int i11, String str2) {
        this.f54845a = fVar;
        this.f54846b = j3;
        this.f54847c = i7;
        this.d = str;
        this.f54848e = eVar;
        this.f54849f = z9;
        this.h = i10;
        this.f54850n = i11;
        this.f54851r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f54845a + ", timestamp=" + this.f54846b + ", usageType=" + this.f54847c + ", status=" + this.f54850n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.f54845a, i7);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.f54846b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f54847c);
        wb.l(parcel, 4, this.d);
        wb.k(parcel, 5, this.f54848e, i7);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f54849f ? 1 : 0);
        wb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.f54850n);
        wb.l(parcel, 9, this.f54851r);
        wb.s(parcel, r10);
    }
}
