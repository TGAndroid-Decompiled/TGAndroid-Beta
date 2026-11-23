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
    public final int f58574a;
    public final int f58575b;
    public final String f58576c;
    public final String d;
    public final int f58577e;
    public final String f58578f;
    public final j h;
    public final r f58579n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i7, int i10, String str, String str2, String str3, int i11, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.f58574a = i7;
        this.f58575b = i10;
        this.f58576c = str;
        this.d = str2;
        this.f58578f = str3;
        this.f58577e = i11;
        p pVar = r.f58588b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.k()) {
                Object[] array = rVar.toArray(o.f58583a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.f58589e;
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
                sVar2 = s.f58589e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.f58579n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f58574a == jVar.f58574a && this.f58575b == jVar.f58575b && this.f58577e == jVar.f58577e && this.f58576c.equals(jVar.f58576c) && tc.a(this.d, jVar.d) && tc.a(this.f58578f, jVar.f58578f) && tc.a(this.h, jVar.h) && this.f58579n.equals(jVar.f58579n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f58574a), this.f58576c, this.d, this.f58578f});
    }

    public final String toString() {
        String str = this.f58576c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f58574a);
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
        String str3 = this.f58578f;
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
        parcel.writeInt(this.f58574a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f58575b);
        cc.l(parcel, 3, this.f58576c);
        cc.l(parcel, 4, this.d);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f58577e);
        cc.l(parcel, 6, this.f58578f);
        cc.k(parcel, 7, this.h, i7);
        cc.p(parcel, 8, this.f58579n);
        cc.s(parcel, r10);
    }
}
