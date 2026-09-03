package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(20);
    public final r f44719a;
    public final String f44720b;
    public final int f44721c;

    public k(int i10, int i11, String str) {
        try {
            this.f44719a = r.a(i10);
            this.f44720b = str;
            this.f44721c = i11;
        } catch (q e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!b6.m.l(this.f44719a, kVar.f44719a) || !b6.m.l(this.f44720b, kVar.f44720b) || !b6.m.l(Integer.valueOf(this.f44721c), Integer.valueOf(kVar.f44721c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44719a, this.f44720b, Integer.valueOf(this.f44721c)});
    }

    public final String toString() {
        androidx.biometric.e eVar = new androidx.biometric.e(getClass().getSimpleName(), 7);
        String valueOf = String.valueOf(this.f44719a.f44750a);
        androidx.biometric.e eVar2 = new androidx.biometric.e(6, false);
        ((androidx.biometric.e) eVar.d).d = eVar2;
        eVar.d = eVar2;
        eVar2.f528c = valueOf;
        eVar2.f527b = "errorCode";
        String str = this.f44720b;
        if (str != null) {
            eVar.D(str, "errorMessage");
        }
        return eVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f44719a.f44750a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.f44720b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f44721c);
        g5.r(parcel, q10);
    }
}
