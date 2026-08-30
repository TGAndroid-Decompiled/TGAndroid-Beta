package q6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kh.a2;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new r0(22);
    public final Enum f42937a;

    public o(a aVar) {
        this.f42937a = (Enum) aVar;
    }

    public static o a(int i10) {
        p[] values;
        c0 c0Var;
        if (i10 == -262) {
            c0Var = c0.RS1;
        } else {
            c0[] values2 = c0.values();
            int length = values2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    c0 c0Var2 = values2[i11];
                    if (c0Var2.f42893a == i10) {
                        c0Var = c0Var2;
                        break;
                    }
                    i11++;
                } else {
                    for (p pVar : p.values()) {
                        if (pVar.f42940a == i10) {
                            c0Var = pVar;
                        }
                    }
                    throw new Exception(a2.k(i10, "Algorithm with COSE value ", " not supported"));
                }
            }
        }
        return new o(c0Var);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && this.f42937a.a() == ((o) obj).f42937a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42937a});
    }

    public final String toString() {
        return android.support.v4.media.a.o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f42937a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42937a.a());
    }
}
