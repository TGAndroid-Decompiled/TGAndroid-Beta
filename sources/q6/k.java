package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(20);
    public final r f42925a;
    public final String f42926b;
    public final int f42927c;

    public k(int i10, int i11, String str) {
        try {
            this.f42925a = r.a(i10);
            this.f42926b = str;
            this.f42927c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!b6.m.l(this.f42925a, kVar.f42925a) || !b6.m.l(this.f42926b, kVar.f42926b) || !b6.m.l(Integer.valueOf(this.f42927c), Integer.valueOf(kVar.f42927c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42925a, this.f42926b, Integer.valueOf(this.f42927c)});
    }

    public final String toString() {
        androidx.biometric.e eVar = new androidx.biometric.e(getClass().getSimpleName(), 7);
        String valueOf = String.valueOf(this.f42925a.f42955a);
        androidx.biometric.e eVar2 = new androidx.biometric.e(6, false);
        ((androidx.biometric.e) eVar.d).d = eVar2;
        eVar.d = eVar2;
        eVar2.f479c = valueOf;
        eVar2.f478b = "errorCode";
        String str = this.f42926b;
        if (str != null) {
            eVar.D(str, "errorMessage");
        }
        return eVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f42925a.f42955a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f42926b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f42927c);
        f5.r(parcel, q10);
    }
}
