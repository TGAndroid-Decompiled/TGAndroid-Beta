package r7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new q8.i(8);
    public final f f54429a;
    public final long f54430b;
    public final int f54431c;
    public final String d;
    public final e f54432e;
    public final boolean f54433f;
    public final int h;
    public final int f54434n;
    public final String f54435r;

    public m(f fVar, long j10, int i3, String str, e eVar, boolean z10, int i10, int i11, String str2) {
        this.f54429a = fVar;
        this.f54430b = j10;
        this.f54431c = i3;
        this.d = str;
        this.f54432e = eVar;
        this.f54433f = z10;
        this.h = i10;
        this.f54434n = i11;
        this.f54435r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f54429a + ", timestamp=" + this.f54430b + ", usageType=" + this.f54431c + ", status=" + this.f54434n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f54429a, i3);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.f54430b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f54431c);
        j8.a.m(parcel, 4, this.d);
        j8.a.l(parcel, 5, this.f54432e, i3);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f54433f ? 1 : 0);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.h);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.f54434n);
        j8.a.m(parcel, 9, this.f54435r);
        j8.a.t(parcel, s6);
    }
}
