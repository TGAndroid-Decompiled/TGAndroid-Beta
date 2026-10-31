package r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import w7.a7;
import w7.h0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(1);
    public final int f46351a;
    public final int f46352b;
    public final String f46353c;
    public final String d;
    public final int e;
    public final String f46354f;
    public final j h;
    public final r f46355n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.f46351a = i10;
        this.f46352b = i11;
        this.f46353c = str;
        this.d = str2;
        this.f46354f = str3;
        this.e = i12;
        p pVar = r.f46363b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.o()) {
                Object[] array = rVar.toArray(o.f46359a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.e;
                    rVar = sVar2;
                } else {
                    sVar = new s(length, array);
                    rVar = sVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i13 = 0; i13 < length2; i13++) {
                if (array2[i13] == null) {
                    throw new NullPointerException(i0.a.i(i13, "at index "));
                }
            }
            if (length2 == 0) {
                sVar2 = s.e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.f46355n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f46351a == jVar.f46351a && this.f46352b == jVar.f46352b && this.e == jVar.e && this.f46353c.equals(jVar.f46353c) && a7.a(this.d, jVar.d) && a7.a(this.f46354f, jVar.f46354f) && a7.a(this.h, jVar.h) && this.f46355n.equals(jVar.f46355n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46351a), this.f46353c, this.d, this.f46354f});
    }

    public final String toString() {
        String str = this.f46353c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f46351a);
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
        String str3 = this.f46354f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f46351a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f46352b);
        h0.l(parcel, 3, this.f46353c);
        h0.l(parcel, 4, this.d);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        h0.l(parcel, 6, this.f46354f);
        h0.k(parcel, 7, this.h, i10);
        h0.p(parcel, 8, this.f46355n);
        h0.r(parcel, q6);
    }
}
