package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(20);
    public final r f42955a;
    public final String f42956b;
    public final int f42957c;

    public k(int i10, int i11, String str) {
        try {
            this.f42955a = r.a(i10);
            this.f42956b = str;
            this.f42957c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!b6.m.l(this.f42955a, kVar.f42955a) || !b6.m.l(this.f42956b, kVar.f42956b) || !b6.m.l(Integer.valueOf(this.f42957c), Integer.valueOf(kVar.f42957c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42955a, this.f42956b, Integer.valueOf(this.f42957c)});
    }

    public final String toString() {
        af.d dVar = new af.d(getClass().getSimpleName(), 8);
        String valueOf = String.valueOf(this.f42955a.f42985a);
        af.d dVar2 = new af.d(7, false);
        ((af.d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.f160c = valueOf;
        dVar2.f159b = "errorCode";
        String str = this.f42956b;
        if (str != null) {
            dVar.D(str, "errorMessage");
        }
        return dVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f42955a.f42985a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f42956b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f42957c);
        f5.r(parcel, q10);
    }
}
