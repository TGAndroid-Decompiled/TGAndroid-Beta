package t7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import k2.p1;
public final class j extends q6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(1);
    public final int f54963a;
    public final int f54964b;
    public final String f54965c;
    public final String d;
    public final int f54966e;
    public final String f54967f;
    public final j h;
    public final r f54968n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i3, int i10, String str, String str2, String str3, int i11, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.f54963a = i3;
        this.f54964b = i10;
        this.f54965c = str;
        this.d = str2;
        this.f54967f = str3;
        this.f54966e = i11;
        p pVar = r.f54977b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.k()) {
                Object[] array = rVar.toArray(o.f54972a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.f54978e;
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
                    throw new NullPointerException(p1.i(i12, "at index "));
                }
            }
            if (length2 == 0) {
                sVar2 = s.f54978e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.f54968n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f54963a == jVar.f54963a && this.f54964b == jVar.f54964b && this.f54966e == jVar.f54966e && this.f54965c.equals(jVar.f54965c) && x7.x.a(this.d, jVar.d) && x7.x.a(this.f54967f, jVar.f54967f) && x7.x.a(this.h, jVar.h) && this.f54968n.equals(jVar.f54968n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f54963a), this.f54965c, this.d, this.f54967f});
    }

    public final String toString() {
        String str = this.f54965c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f54963a);
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
        String str3 = this.f54967f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f54963a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f54964b);
        j8.a.m(parcel, 3, this.f54965c);
        j8.a.m(parcel, 4, this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f54966e);
        j8.a.m(parcel, 6, this.f54967f);
        j8.a.l(parcel, 7, this.h, i3);
        j8.a.q(parcel, 8, this.f54968n);
        j8.a.t(parcel, s6);
    }
}
