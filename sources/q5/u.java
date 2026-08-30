package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class u extends c6.a {
    public final int f42870a;
    public final int f42871b;
    public final int f42872c;
    public static final u5.b d = new u5.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f42870a = i10;
        this.f42871b = i11;
        this.f42872c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f42871b == uVar.f42871b && this.f42870a == uVar.f42870a && this.f42872c == uVar.f42872c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42871b), Integer.valueOf(this.f42870a), Integer.valueOf(this.f42872c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f42870a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f42871b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f42872c);
        f5.r(parcel, q10);
    }
}
