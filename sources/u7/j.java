package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import c8.pc;
import c8.xb;
import java.util.Arrays;
import java.util.List;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(1);
    public final int f56373a;
    public final int f56374b;
    public final String f56375c;
    public final String d;
    public final int f56376e;
    public final String f56377f;
    public final j h;
    public final r f56378n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i7, int i10, String str, String str2, String str3, int i11, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.f56373a = i7;
        this.f56374b = i10;
        this.f56375c = str;
        this.d = str2;
        this.f56377f = str3;
        this.f56376e = i11;
        p pVar = r.f56387b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.k()) {
                Object[] array = rVar.toArray(o.f56382a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.f56388e;
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
                    throw new NullPointerException(jg.g.j(i12, "at index "));
                }
            }
            if (length2 == 0) {
                sVar2 = s.f56388e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.f56378n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f56373a == jVar.f56373a && this.f56374b == jVar.f56374b && this.f56376e == jVar.f56376e && this.f56375c.equals(jVar.f56375c) && pc.a(this.d, jVar.d) && pc.a(this.f56377f, jVar.f56377f) && pc.a(this.h, jVar.h) && this.f56378n.equals(jVar.f56378n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f56373a), this.f56375c, this.d, this.f56377f});
    }

    public final String toString() {
        String str = this.f56375c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f56373a);
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
        String str3 = this.f56377f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f56373a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f56374b);
        xb.l(parcel, 3, this.f56375c);
        xb.l(parcel, 4, this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f56376e);
        xb.l(parcel, 6, this.f56377f);
        xb.k(parcel, 7, this.h, i7);
        xb.p(parcel, 8, this.f56378n);
        xb.s(parcel, r10);
    }
}
