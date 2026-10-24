package r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import i2.o1;
import java.util.Arrays;
import java.util.List;
import w7.f0;
import w7.v6;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f45464a;
    public final int f45465b;
    public final String f45466c;
    public final String d;
    public final int e;
    public final String f45467f;
    public final j h;
    public final t f45468n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f45464a = i10;
        this.f45465b = i11;
        this.f45466c = str;
        this.d = str2;
        this.f45467f = str3;
        this.e = i12;
        r rVar = t.f45484b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.o()) {
                Object[] array = tVar.toArray(q.f45480a);
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
                    throw new NullPointerException(o1.k(i13, "at index "));
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
        this.f45468n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f45464a == jVar.f45464a && this.f45465b == jVar.f45465b && this.e == jVar.e && this.f45466c.equals(jVar.f45466c) && v6.a(this.d, jVar.d) && v6.a(this.f45467f, jVar.f45467f) && v6.a(this.h, jVar.h) && this.f45468n.equals(jVar.f45468n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45464a), this.f45466c, this.d, this.f45467f});
    }

    public final String toString() {
        String str = this.f45466c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f45464a);
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
        String str3 = this.f45467f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f45464a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f45465b);
        f0.l(parcel, 3, this.f45466c);
        f0.l(parcel, 4, this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f0.l(parcel, 6, this.f45467f);
        f0.k(parcel, 7, this.h, i10);
        f0.p(parcel, 8, this.f45468n);
        f0.r(parcel, q6);
    }
}
