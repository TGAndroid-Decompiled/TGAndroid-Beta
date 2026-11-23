package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import c8.cc;
import c8.tc;
import java.util.Arrays;
import java.util.List;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(1);
    public final int f58459a;
    public final int f58460b;
    public final String f58461c;
    public final String d;
    public final int f58462e;
    public final String f58463f;
    public final j h;
    public final r f58464n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i7, int i10, String str, String str2, String str3, int i11, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.f58459a = i7;
        this.f58460b = i10;
        this.f58461c = str;
        this.d = str2;
        this.f58463f = str3;
        this.f58462e = i11;
        p pVar = r.f58473b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.k()) {
                Object[] array = rVar.toArray(o.f58468a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.f58474e;
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
                    throw new NullPointerException(i5.c.i(i12, "at index "));
                }
            }
            if (length2 == 0) {
                sVar2 = s.f58474e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.f58464n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f58459a == jVar.f58459a && this.f58460b == jVar.f58460b && this.f58462e == jVar.f58462e && this.f58461c.equals(jVar.f58461c) && tc.a(this.d, jVar.d) && tc.a(this.f58463f, jVar.f58463f) && tc.a(this.h, jVar.h) && this.f58464n.equals(jVar.f58464n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f58459a), this.f58461c, this.d, this.f58463f});
    }

    public final String toString() {
        String str = this.f58461c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f58459a);
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
        String str3 = this.f58463f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f58459a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f58460b);
        cc.l(parcel, 3, this.f58461c);
        cc.l(parcel, 4, this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f58462e);
        cc.l(parcel, 6, this.f58463f);
        cc.k(parcel, 7, this.h, i7);
        cc.p(parcel, 8, this.f58464n);
        cc.s(parcel, r10);
    }
}
