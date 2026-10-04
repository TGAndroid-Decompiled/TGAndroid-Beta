package r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import w7.c7;
import w7.g0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f45851a;
    public final int f45852b;
    public final String f45853c;
    public final String d;
    public final int f45854e;
    public final String f45855f;
    public final j h;
    public final t f45856n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f45851a = i10;
        this.f45852b = i11;
        this.f45853c = str;
        this.d = str2;
        this.f45855f = str3;
        this.f45854e = i12;
        r rVar = t.f45875b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.p()) {
                Object[] array = tVar.toArray(q.f45870a);
                int length = array.length;
                if (length == 0) {
                    uVar2 = u.f45876e;
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
                uVar2 = u.f45876e;
                tVar = uVar2;
            } else {
                uVar = new u(length2, array2);
                tVar = uVar;
            }
        }
        this.f45856n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f45851a == jVar.f45851a && this.f45852b == jVar.f45852b && this.f45854e == jVar.f45854e && this.f45853c.equals(jVar.f45853c) && c7.a(this.d, jVar.d) && c7.a(this.f45855f, jVar.f45855f) && c7.a(this.h, jVar.h) && this.f45856n.equals(jVar.f45856n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45851a), this.f45853c, this.d, this.f45855f});
    }

    public final String toString() {
        String str = this.f45853c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f45851a);
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
        String str3 = this.f45855f;
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
        parcel.writeInt(this.f45851a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f45852b);
        g0.l(parcel, 3, this.f45853c);
        g0.l(parcel, 4, this.d);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f45854e);
        g0.l(parcel, 6, this.f45855f);
        g0.k(parcel, 7, this.h, i10);
        g0.p(parcel, 8, this.f45856n);
        g0.r(parcel, q6);
    }
}
