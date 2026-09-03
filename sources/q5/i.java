package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f44592a;
    public final String f44593b;
    public final boolean f44594c;
    public final h d;

    public i(boolean z4, String str, boolean z10, h hVar) {
        this.f44592a = z4;
        this.f44593b = str;
        this.f44594c = z10;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f44592a == iVar.f44592a && u5.a.d(this.f44593b, iVar.f44593b) && this.f44594c == iVar.f44594c && u5.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44592a), this.f44593b, Boolean.valueOf(this.f44594c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f44592a + ", language=" + this.f44593b + ", androidReceiverCompatible: " + this.f44594c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f44592a ? 1 : 0);
        g5.l(parcel, 3, this.f44593b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f44594c ? 1 : 0);
        g5.k(parcel, 5, this.d, i10);
        g5.r(parcel, q10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: q5.i.<init>():void");
    }
}
