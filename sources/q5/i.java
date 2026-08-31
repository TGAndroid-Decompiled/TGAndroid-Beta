package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f44561a;
    public final String f44562b;
    public final boolean f44563c;
    public final h d;

    public i(boolean z4, String str, boolean z10, h hVar) {
        this.f44561a = z4;
        this.f44562b = str;
        this.f44563c = z10;
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
        if (this.f44561a == iVar.f44561a && u5.a.d(this.f44562b, iVar.f44562b) && this.f44563c == iVar.f44563c && u5.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f44561a), this.f44562b, Boolean.valueOf(this.f44563c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f44561a + ", language=" + this.f44562b + ", androidReceiverCompatible: " + this.f44563c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f44561a ? 1 : 0);
        g5.l(parcel, 3, this.f44562b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f44563c ? 1 : 0);
        g5.k(parcel, 5, this.d, i10);
        g5.r(parcel, q10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: q5.i.<init>():void");
    }
}
