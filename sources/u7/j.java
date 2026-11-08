package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import c8.pc;
import c8.xb;
import java.util.Arrays;
import java.util.List;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(1);
    public final int f56372a;
    public final int f56373b;
    public final String f56374c;
    public final String d;
    public final int f56375e;
    public final String f56376f;
    public final j h;
    public final r f56377n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i7, int i10, String str, String str2, String str3, int i11, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.f56372a = i7;
        this.f56373b = i10;
        this.f56374c = str;
        this.d = str2;
        this.f56376f = str3;
        this.f56375e = i11;
        p pVar = r.f56386b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.k()) {
                Object[] array = rVar.toArray(o.f56381a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.f56387e;
                    rVar = sVar2;
                } else {
                    sVar = new s(length, array);
                    rVar = sVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                if (array2[i12] == null) {
                    throw new NullPointerException(jg.g.j(i12, "at index "));
                }
            }
            if (length2 == 0) {
                sVar2 = s.f56387e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.f56377n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f56372a == jVar.f56372a && this.f56373b == jVar.f56373b && this.f56375e == jVar.f56375e && this.f56374c.equals(jVar.f56374c) && pc.a(this.d, jVar.d) && pc.a(this.f56376f, jVar.f56376f) && pc.a(this.h, jVar.h) && this.f56377n.equals(jVar.f56377n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f56372a), this.f56374c, this.d, this.f56376f});
    }

    public final String toString() {
        String str = this.f56374c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f56372a);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (str2.startsWith(str)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f56376f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f56372a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f56373b);
        xb.l(parcel, 3, this.f56374c);
        xb.l(parcel, 4, this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f56375e);
        xb.l(parcel, 6, this.f56376f);
        xb.k(parcel, 7, this.h, i7);
        xb.p(parcel, 8, this.f56377n);
        xb.s(parcel, r10);
    }
}
