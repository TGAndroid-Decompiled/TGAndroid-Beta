package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new v(5);
    public final boolean f42840a;
    public final String f42841b;
    public final boolean f42842c;
    public final h d;

    public i(boolean z4, String str, boolean z10, h hVar) {
        this.f42840a = z4;
        this.f42841b = str;
        this.f42842c = z10;
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
        if (this.f42840a == iVar.f42840a && u5.a.d(this.f42841b, iVar.f42841b) && this.f42842c == iVar.f42842c && u5.a.d(this.d, iVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f42840a), this.f42841b, Boolean.valueOf(this.f42842c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f42840a + ", language=" + this.f42841b + ", androidReceiverCompatible: " + this.f42842c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f42840a ? 1 : 0);
        f5.l(parcel, 3, this.f42841b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f42842c ? 1 : 0);
        f5.k(parcel, 5, this.d, i10);
        f5.r(parcel, q10);
    }

    public i() {
        throw new UnsupportedOperationException("Method not decompiled: q5.i.<init>():void");
    }
}
