package r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import w7.g0;
import w7.z6;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f43952a;
    public final int f43953b;
    public final String f43954c;
    public final String d;
    public final int e;
    public final String f43955f;
    public final j h;
    public final t f43956n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f43952a = i10;
        this.f43953b = i11;
        this.f43954c = str;
        this.d = str2;
        this.f43955f = str3;
        this.e = i12;
        r rVar = t.f43972b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.o()) {
                Object[] array = tVar.toArray(q.f43968a);
                int length = array.length;
                if (length == 0) {
                    uVar2 = u.e;
                    tVar = uVar2;
                } else {
                    uVar = new u(length, array);
                    tVar = uVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i13 = 0; i13 < length2; i13++) {
                if (array2[i13] == null) {
                    throw new NullPointerException(i2.d.i(i13, "at index "));
                }
            }
            if (length2 == 0) {
                uVar2 = u.e;
                tVar = uVar2;
            } else {
                uVar = new u(length2, array2);
                tVar = uVar;
            }
        }
        this.f43956n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f43952a == jVar.f43952a && this.f43953b == jVar.f43953b && this.e == jVar.e && this.f43954c.equals(jVar.f43954c) && z6.a(this.d, jVar.d) && z6.a(this.f43955f, jVar.f43955f) && z6.a(this.h, jVar.h) && this.f43956n.equals(jVar.f43956n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43952a), this.f43954c, this.d, this.f43955f});
    }

    public final String toString() {
        String str = this.f43954c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f43952a);
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
        String str3 = this.f43955f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f43952a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f43953b);
        g0.l(parcel, 3, this.f43954c);
        g0.l(parcel, 4, this.d);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        g0.l(parcel, 6, this.f43955f);
        g0.k(parcel, 7, this.h, i10);
        g0.p(parcel, 8, this.f43956n);
        g0.r(parcel, q6);
    }
}
