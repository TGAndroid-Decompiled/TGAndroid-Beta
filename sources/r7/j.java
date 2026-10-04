package r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import hg.k0;
import java.util.Arrays;
import java.util.List;
import w7.c7;
import w7.g0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f45844a;
    public final int f45845b;
    public final String f45846c;
    public final String d;
    public final int f45847e;
    public final String f45848f;
    public final j h;
    public final t f45849n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f45844a = i10;
        this.f45845b = i11;
        this.f45846c = str;
        this.d = str2;
        this.f45848f = str3;
        this.f45847e = i12;
        r rVar = t.f45868b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.p()) {
                Object[] array = tVar.toArray(q.f45863a);
                int length = array.length;
                if (length == 0) {
                    uVar2 = u.f45869e;
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
                    throw new NullPointerException(k0.h(i13, "at index "));
                }
            }
            if (length2 == 0) {
                uVar2 = u.f45869e;
                tVar = uVar2;
            } else {
                uVar = new u(length2, array2);
                tVar = uVar;
            }
        }
        this.f45849n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f45844a == jVar.f45844a && this.f45845b == jVar.f45845b && this.f45847e == jVar.f45847e && this.f45846c.equals(jVar.f45846c) && c7.a(this.d, jVar.d) && c7.a(this.f45848f, jVar.f45848f) && c7.a(this.h, jVar.h) && this.f45849n.equals(jVar.f45849n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45844a), this.f45846c, this.d, this.f45848f});
    }

    public final String toString() {
        String str = this.f45846c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f45844a);
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
        String str3 = this.f45848f;
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
        parcel.writeInt(this.f45844a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f45845b);
        g0.l(parcel, 3, this.f45846c);
        g0.l(parcel, 4, this.d);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f45847e);
        g0.l(parcel, 6, this.f45848f);
        g0.k(parcel, 7, this.h, i10);
        g0.p(parcel, 8, this.f45849n);
        g0.r(parcel, q6);
    }
}
