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
    public final int f47010a;
    public final int f47011b;
    public final String f47012c;
    public final String d;
    public final int f47013e;
    public final String f47014f;
    public final j h;
    public final t f47015n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f47010a = i10;
        this.f47011b = i11;
        this.f47012c = str;
        this.d = str2;
        this.f47014f = str3;
        this.f47013e = i12;
        r rVar = t.f47034b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.p()) {
                Object[] array = tVar.toArray(q.f47029a);
                int length = array.length;
                if (length == 0) {
                    uVar2 = u.f47035e;
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
                uVar2 = u.f47035e;
                tVar = uVar2;
            } else {
                uVar = new u(length2, array2);
                tVar = uVar;
            }
        }
        this.f47015n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f47010a == jVar.f47010a && this.f47011b == jVar.f47011b && this.f47013e == jVar.f47013e && this.f47012c.equals(jVar.f47012c) && c7.a(this.d, jVar.d) && c7.a(this.f47014f, jVar.f47014f) && c7.a(this.h, jVar.h) && this.f47015n.equals(jVar.f47015n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47010a), this.f47012c, this.d, this.f47014f});
    }

    public final String toString() {
        String str = this.f47012c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f47010a);
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
        String str3 = this.f47014f;
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
        parcel.writeInt(this.f47010a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f47011b);
        d0.l(parcel, 3, this.f47012c);
        d0.l(parcel, 4, this.d);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f47013e);
        d0.l(parcel, 6, this.f47014f);
        d0.k(parcel, 7, this.h, i10);
        d0.p(parcel, 8, this.f47015n);
        d0.r(parcel, q6);
    }
}
