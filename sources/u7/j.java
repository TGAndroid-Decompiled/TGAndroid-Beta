package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import c8.oc;
import c8.wb;
import java.util.Arrays;
import java.util.List;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(1);
    public final int f56259a;
    public final int f56260b;
    public final String f56261c;
    public final String d;
    public final int f56262e;
    public final String f56263f;
    public final j h;
    public final r f56264n;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i7, int i10, String str, String str2, String str3, int i11, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.f56259a = i7;
        this.f56260b = i10;
        this.f56261c = str;
        this.d = str2;
        this.f56263f = str3;
        this.f56262e = i11;
        p pVar = r.f56273b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.k()) {
                Object[] array = rVar.toArray(o.f56268a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.f56274e;
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
                sVar2 = s.f56274e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.f56264n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f56259a == jVar.f56259a && this.f56260b == jVar.f56260b && this.f56262e == jVar.f56262e && this.f56261c.equals(jVar.f56261c) && oc.a(this.d, jVar.d) && oc.a(this.f56263f, jVar.f56263f) && oc.a(this.h, jVar.h) && this.f56264n.equals(jVar.f56264n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f56259a), this.f56261c, this.d, this.f56263f});
    }

    public final String toString() {
        String str = this.f56261c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f56259a);
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
        String str3 = this.f56263f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f56259a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f56260b);
        wb.l(parcel, 3, this.f56261c);
        wb.l(parcel, 4, this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f56262e);
        wb.l(parcel, 6, this.f56263f);
        wb.k(parcel, 7, this.h, i7);
        wb.p(parcel, 8, this.f56264n);
        wb.s(parcel, r10);
    }
}
