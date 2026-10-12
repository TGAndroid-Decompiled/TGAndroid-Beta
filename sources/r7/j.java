package r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import w7.c0;
import w7.c7;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f47224a;
    public final int f47225b;
    public final String f47226c;
    public final String d;
    public final int f47227e;
    public final String f47228f;
    public final j h;
    public final t f47229n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f47224a = i10;
        this.f47225b = i11;
        this.f47226c = str;
        this.d = str2;
        this.f47228f = str3;
        this.f47227e = i12;
        r rVar = t.f47248b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.p()) {
                Object[] array = tVar.toArray(q.f47243a);
                int length = array.length;
                if (length == 0) {
                    uVar2 = u.f47249e;
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
                    throw new NullPointerException(hg.c.i(i13, "at index "));
                }
            }
            if (length2 == 0) {
                uVar2 = u.f47249e;
                tVar = uVar2;
            } else {
                uVar = new u(length2, array2);
                tVar = uVar;
            }
        }
        this.f47229n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f47224a == jVar.f47224a && this.f47225b == jVar.f47225b && this.f47227e == jVar.f47227e && this.f47226c.equals(jVar.f47226c) && c7.a(this.d, jVar.d) && c7.a(this.f47228f, jVar.f47228f) && c7.a(this.h, jVar.h) && this.f47229n.equals(jVar.f47229n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47224a), this.f47226c, this.d, this.f47228f});
    }

    public final String toString() {
        String str = this.f47226c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f47224a);
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
        String str3 = this.f47228f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f47224a);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f47225b);
        c0.l(parcel, 3, this.f47226c);
        c0.l(parcel, 4, this.d);
        c0.s(parcel, 5, 4);
        parcel.writeInt(this.f47227e);
        c0.l(parcel, 6, this.f47228f);
        c0.k(parcel, 7, this.h, i10);
        c0.p(parcel, 8, this.f47229n);
        c0.r(parcel, q6);
    }
}
