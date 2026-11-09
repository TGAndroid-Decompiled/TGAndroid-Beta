package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f54974a;
    public final long f54975b;
    public final int f54976c;
    public final String d;
    public final e f54977e;
    public final boolean f54978f;
    public final int h;
    public final int f54979n;
    public final String f54980r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z9, int i10, int i11, String str2) {
        this.f54974a = fVar;
        this.f54975b = j3;
        this.f54976c = i7;
        this.d = str;
        this.f54977e = eVar;
        this.f54978f = z9;
        this.h = i10;
        this.f54979n = i11;
        this.f54980r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f54974a + ", timestamp=" + this.f54975b + ", usageType=" + this.f54976c + ", status=" + this.f54979n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f54974a, i7);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f54975b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54976c);
        xb.l(parcel, 4, this.d);
        xb.k(parcel, 5, this.f54977e, i7);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f54978f ? 1 : 0);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f54979n);
        xb.l(parcel, 9, this.f54980r);
        xb.s(parcel, r10);
    }
}
