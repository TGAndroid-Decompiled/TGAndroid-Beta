package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Locale;
import q4.x;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new x(23);
    public final f f54962a;
    public final long f54963b;
    public final int f54964c;
    public final String d;
    public final e f54965e;
    public final boolean f54966f;
    public final int h;
    public final int f54967n;
    public final String f54968r;

    public m(f fVar, long j3, int i7, String str, e eVar, boolean z9, int i10, int i11, String str2) {
        this.f54962a = fVar;
        this.f54963b = j3;
        this.f54964c = i7;
        this.d = str;
        this.f54965e = eVar;
        this.f54966f = z9;
        this.h = i10;
        this.f54967n = i11;
        this.f54968r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f54962a + ", timestamp=" + this.f54963b + ", usageType=" + this.f54964c + ", status=" + this.f54967n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f54962a, i7);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f54963b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f54964c);
        xb.l(parcel, 4, this.d);
        xb.k(parcel, 5, this.f54965e, i7);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f54966f ? 1 : 0);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.f54967n);
        xb.l(parcel, 9, this.f54968r);
        xb.s(parcel, r10);
    }
}
