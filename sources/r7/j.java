package r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import w7.c7;
import w7.d0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f47134a;
    public final int f47135b;
    public final String f47136c;
    public final String d;
    public final int f47137e;
    public final String f47138f;
    public final j h;
    public final t f47139n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f47134a = i10;
        this.f47135b = i11;
        this.f47136c = str;
        this.d = str2;
        this.f47138f = str3;
        this.f47137e = i12;
        r rVar = t.f47158b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.p()) {
                Object[] array = tVar.toArray(q.f47153a);
                int length = array.length;
                if (length == 0) {
                    uVar2 = u.f47159e;
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
                    throw new NullPointerException(hg.c.h(i13, "at index "));
                }
            }
            if (length2 == 0) {
                uVar2 = u.f47159e;
                tVar = uVar2;
            } else {
                uVar = new u(length2, array2);
                tVar = uVar;
            }
        }
        this.f47139n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f47134a == jVar.f47134a && this.f47135b == jVar.f47135b && this.f47137e == jVar.f47137e && this.f47136c.equals(jVar.f47136c) && c7.a(this.d, jVar.d) && c7.a(this.f47138f, jVar.f47138f) && c7.a(this.h, jVar.h) && this.f47139n.equals(jVar.f47139n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47134a), this.f47136c, this.d, this.f47138f});
    }

    public final String toString() {
        String str = this.f47136c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f47134a);
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
        String str3 = this.f47138f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f47134a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f47135b);
        d0.l(parcel, 3, this.f47136c);
        d0.l(parcel, 4, this.d);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f47137e);
        d0.l(parcel, 6, this.f47138f);
        d0.k(parcel, 7, this.h, i10);
        d0.p(parcel, 8, this.f47139n);
        d0.r(parcel, q6);
    }
}
