package r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import w7.a7;
import w7.e0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f44972a;
    public final int f44973b;
    public final String f44974c;
    public final String d;
    public final int f44975e;
    public final String f44976f;
    public final j h;
    public final t f44977n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f44972a = i10;
        this.f44973b = i11;
        this.f44974c = str;
        this.d = str2;
        this.f44976f = str3;
        this.f44975e = i12;
        r rVar = t.f44996b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.p()) {
                Object[] array = tVar.toArray(q.f44991a);
                int length = array.length;
                if (length == 0) {
                    uVar2 = u.f44997e;
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
                    throw new NullPointerException(i2.g.i(i13, "at index "));
                }
            }
            if (length2 == 0) {
                uVar2 = u.f44997e;
                tVar = uVar2;
            } else {
                uVar = new u(length2, array2);
                tVar = uVar;
            }
        }
        this.f44977n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f44972a == jVar.f44972a && this.f44973b == jVar.f44973b && this.f44975e == jVar.f44975e && this.f44974c.equals(jVar.f44974c) && a7.a(this.d, jVar.d) && a7.a(this.f44976f, jVar.f44976f) && a7.a(this.h, jVar.h) && this.f44977n.equals(jVar.f44977n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44972a), this.f44974c, this.d, this.f44976f});
    }

    public final String toString() {
        String str = this.f44974c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f44972a);
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
        String str3 = this.f44976f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f44972a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f44973b);
        e0.l(parcel, 3, this.f44974c);
        e0.l(parcel, 4, this.d);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.f44975e);
        e0.l(parcel, 6, this.f44976f);
        e0.k(parcel, 7, this.h, i10);
        e0.p(parcel, 8, this.f44977n);
        e0.r(parcel, q6);
    }
}
