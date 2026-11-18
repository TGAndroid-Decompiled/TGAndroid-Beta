package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import c8.bc;
import c8.sc;
import java.util.Arrays;
import java.util.List;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(1);
    public final int f58449a;
    public final int f58450b;
    public final String f58451c;
    public final String d;
    public final int f58452e;
    public final String f58453f;
    public final j h;
    public final r f58454n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i7, int i10, String str, String str2, String str3, int i11, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.f58449a = i7;
        this.f58450b = i10;
        this.f58451c = str;
        this.d = str2;
        this.f58453f = str3;
        this.f58452e = i11;
        p pVar = r.f58463b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.k()) {
                Object[] array = rVar.toArray(o.f58458a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.f58464e;
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
                    throw new NullPointerException(i5.c.i(i12, "at index "));
                }
            }
            if (length2 == 0) {
                sVar2 = s.f58464e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.f58454n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f58449a == jVar.f58449a && this.f58450b == jVar.f58450b && this.f58452e == jVar.f58452e && this.f58451c.equals(jVar.f58451c) && sc.a(this.d, jVar.d) && sc.a(this.f58453f, jVar.f58453f) && sc.a(this.h, jVar.h) && this.f58454n.equals(jVar.f58454n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f58449a), this.f58451c, this.d, this.f58453f});
    }

    public final String toString() {
        String str = this.f58451c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f58449a);
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
        String str3 = this.f58453f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f58449a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f58450b);
        bc.l(parcel, 3, this.f58451c);
        bc.l(parcel, 4, this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f58452e);
        bc.l(parcel, 6, this.f58453f);
        bc.k(parcel, 7, this.h, i7);
        bc.p(parcel, 8, this.f58454n);
        bc.s(parcel, r10);
    }
}
