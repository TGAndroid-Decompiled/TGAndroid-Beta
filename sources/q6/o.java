package q6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new r0(22);
    public final Enum f42967a;

    public o(a aVar) {
        this.f42967a = (Enum) aVar;
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
                    if (c0Var2.f42923a == i10) {
                        c0Var = c0Var2;
                        break;
                    }
                    i11++;
                } else {
                    for (p pVar : p.values()) {
                        if (pVar.f42970a == i10) {
                            c0Var = pVar;
                        }
                    }
                    throw new Exception(kf.k0.k(i10, "Algorithm with COSE value ", " not supported"));
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
        if ((obj instanceof o) && this.f42967a.a() == ((o) obj).f42967a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42967a});
    }

    public final String toString() {
        return android.support.v4.media.a.o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f42967a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42967a.a());
    }
}
