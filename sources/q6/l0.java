package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class l0 extends c6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(12);
    public final int f44723a;
    public final short f44724b;
    public final short f44725c;

    public l0(int i10, short s6, short s9) {
        this.f44723a = i10;
        this.f44724b = s6;
        this.f44725c = s9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f44723a != l0Var.f44723a || this.f44724b != l0Var.f44724b || this.f44725c != l0Var.f44725c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44723a), Short.valueOf(this.f44724b), Short.valueOf(this.f44725c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f44723a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f44724b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f44725c);
        g5.r(parcel, q10);
    }
}
