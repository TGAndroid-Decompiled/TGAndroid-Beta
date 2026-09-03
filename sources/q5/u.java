package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class u extends c6.a {
    public final int f44660a;
    public final int f44661b;
    public final int f44662c;
    public static final u5.b d = new u5.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f44660a = i10;
        this.f44661b = i11;
        this.f44662c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f44661b == uVar.f44661b && this.f44660a == uVar.f44660a && this.f44662c == uVar.f44662c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44661b), Integer.valueOf(this.f44660a), Integer.valueOf(this.f44662c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f44660a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f44661b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.f44662c);
        g5.r(parcel, q10);
    }
}
