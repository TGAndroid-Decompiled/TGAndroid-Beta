package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import w7.d0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new j(3);
    public final f f45505a;
    public final long f45506b;
    public final int f45507c;
    public final String d;
    public final e f45508e;
    public final boolean f45509f;
    public final int h;
    public final int f45510n;
    public final String f45511r;

    public n(f fVar, long j3, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f45505a = fVar;
        this.f45506b = j3;
        this.f45507c = i10;
        this.d = str;
        this.f45508e = eVar;
        this.f45509f = z10;
        this.h = i11;
        this.f45510n = i12;
        this.f45511r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f45505a + ", timestamp=" + this.f45506b + ", usageType=" + this.f45507c + ", status=" + this.f45510n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f45505a, i10);
        d0.s(parcel, 2, 8);
        parcel.writeLong(this.f45506b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f45507c);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f45508e, i10);
        d0.s(parcel, 6, 4);
        parcel.writeInt(this.f45509f ? 1 : 0);
        d0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        d0.s(parcel, 8, 4);
        parcel.writeInt(this.f45510n);
        d0.l(parcel, 9, this.f45511r);
        d0.r(parcel, q6);
    }
}
