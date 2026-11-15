package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import c8.pc;
import c8.yb;
import java.util.Arrays;
import java.util.List;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new n(1);
    public final int f57883a;
    public final int f57884b;
    public final String f57885c;
    public final String d;
    public final int f57886e;
    public final String f57887f;
    public final k h;
    public final s f57888n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public k(int i7, int i10, String str, String str2, String str3, int i11, List list, k kVar) {
        t tVar;
        t tVar2;
        s sVar;
        this.f57883a = i7;
        this.f57884b = i10;
        this.f57885c = str;
        this.d = str2;
        this.f57887f = str3;
        this.f57886e = i11;
        q qVar = s.f57897b;
        if (list instanceof p) {
            sVar = (s) ((p) list);
            if (sVar.k()) {
                Object[] array = sVar.toArray(p.f57892a);
                int length = array.length;
                if (length == 0) {
                    tVar2 = t.f57898e;
                    sVar = tVar2;
                } else {
                    tVar = new t(length, array);
                    sVar = tVar;
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
                tVar2 = t.f57898e;
                sVar = tVar2;
            } else {
                tVar = new t(length2, array2);
                sVar = tVar;
            }
        }
        this.f57888n = sVar;
        this.h = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f57883a == kVar.f57883a && this.f57884b == kVar.f57884b && this.f57886e == kVar.f57886e && this.f57885c.equals(kVar.f57885c) && pc.a(this.d, kVar.d) && pc.a(this.f57887f, kVar.f57887f) && pc.a(this.h, kVar.h) && this.f57888n.equals(kVar.f57888n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f57883a), this.f57885c, this.d, this.f57887f});
    }

    public final String toString() {
        String str = this.f57885c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f57883a);
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
        String str3 = this.f57887f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f57883a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f57884b);
        yb.l(parcel, 3, this.f57885c);
        yb.l(parcel, 4, this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f57886e);
        yb.l(parcel, 6, this.f57887f);
        yb.k(parcel, 7, this.h, i7);
        yb.p(parcel, 8, this.f57888n);
        yb.s(parcel, r10);
    }
}
