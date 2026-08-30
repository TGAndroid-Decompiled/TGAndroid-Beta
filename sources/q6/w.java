package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.yh;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f42978a;
    public final b7.w0 f42979b;
    public final List f42980c;

    static {
        b7.q.r(2, b7.b.f1666c, b7.b.d);
        CREATOR = new l4.j(29);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        b7.w0 w0Var = b7.w0.f1736c;
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(str);
        try {
            this.f42978a = a0.a(str);
            this.f42979b = t6;
            this.f42980c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f42980c;
            if (this.f42978a.equals(wVar.f42978a) && b6.m.l(this.f42979b, wVar.f42979b)) {
                List list2 = this.f42980c;
                if (list2 != null || list != null) {
                    if (list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42978a, this.f42979b, this.f42980c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42978a);
        String c3 = i6.b.c(this.f42979b.u());
        return android.support.v4.media.a.r(yh.m("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c3, ", \n transports="), String.valueOf(this.f42980c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        this.f42978a.getClass();
        f5.l(parcel, 2, "public-key");
        f5.c(parcel, 3, this.f42979b.u());
        f5.p(parcel, 4, this.f42980c);
        f5.r(parcel, q10);
    }
}
