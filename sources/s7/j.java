package s7;

import a8.ag;
import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
public final class j extends p6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(3);
    public final int f47903a;
    public final int f47904b;
    public final String f47905c;
    public final String d;
    public final int e;
    public final String f47906f;
    public final j h;
    public final t f47907n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i10, int i11, String str, String str2, String str3, int i12, List list, j jVar) {
        u uVar;
        u uVar2;
        t tVar;
        this.f47903a = i10;
        this.f47904b = i11;
        this.f47905c = str;
        this.d = str2;
        this.f47906f = str3;
        this.e = i12;
        r rVar = t.f47923b;
        if (list instanceof q) {
            tVar = (t) ((q) list);
            if (tVar.o()) {
                Object[] array = tVar.toArray(q.f47919a);
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
                    throw new NullPointerException(ic.a.i(i13, "at index "));
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
        this.f47907n = tVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f47903a == jVar.f47903a && this.f47904b == jVar.f47904b && this.e == jVar.e && this.f47905c.equals(jVar.f47905c) && ag.a(this.d, jVar.d) && ag.a(this.f47906f, jVar.f47906f) && ag.a(this.h, jVar.h) && this.f47907n.equals(jVar.f47907n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47903a), this.f47905c, this.d, this.f47906f});
    }

    public final String toString() {
        String str = this.f47905c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f47903a);
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
        String str3 = this.f47906f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f47903a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f47904b);
        df.l(parcel, 3, this.f47905c);
        df.l(parcel, 4, this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.l(parcel, 6, this.f47906f);
        df.k(parcel, 7, this.h, i10);
        df.p(parcel, 8, this.f47907n);
        df.r(parcel, q5);
    }
}
