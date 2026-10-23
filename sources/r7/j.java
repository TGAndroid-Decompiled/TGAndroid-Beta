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
    public final int f45465a;
    public final int f45466b;
    public final String f45467c;
    public final String d;
    public final int e;
    public final String f45468f;
    public final j h;
    public final t f45469n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f45465a = i10;
        this.f45466b = i11;
        this.f45467c = str;
        this.d = str2;
        this.f45468f = str3;
        this.e = i12;
        r rVar = t.f45485b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.o()) {
                Object[] array = tVar.toArray(q.f45481a);
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
        this.f45469n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f45465a == jVar.f45465a && this.f45466b == jVar.f45466b && this.e == jVar.e && this.f45467c.equals(jVar.f45467c) && v6.a(this.d, jVar.d) && v6.a(this.f45468f, jVar.f45468f) && v6.a(this.h, jVar.h) && this.f45469n.equals(jVar.f45469n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45465a), this.f45467c, this.d, this.f45468f});
    }

    public final String toString() {
        String str = this.f45467c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f45465a);
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
        String str3 = this.f45468f;
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
        parcel.writeInt(this.f45465a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f45466b);
        f0.l(parcel, 3, this.f45467c);
        f0.l(parcel, 4, this.d);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f0.l(parcel, 6, this.f45468f);
        f0.k(parcel, 7, this.h, i10);
        f0.p(parcel, 8, this.f45469n);
        f0.r(parcel, q6);
    }
}
