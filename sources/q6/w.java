package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.yh;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f44775a;
    public final b7.w0 f44776b;
    public final List f44777c;

    static {
        b7.q.r(2, b7.b.f1804c, b7.b.d);
        CREATOR = new l4.j(29);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        b7.w0 w0Var = b7.w0.f1882c;
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(str);
        try {
            this.f44775a = a0.a(str);
            this.f44776b = t6;
            this.f44777c = arrayList;
        } catch (z e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f44777c;
            if (this.f44775a.equals(wVar.f44775a) && b6.m.l(this.f44776b, wVar.f44776b)) {
                List list2 = this.f44777c;
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
        return Arrays.hashCode(new Object[]{this.f44775a, this.f44776b, this.f44777c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f44775a);
        String c3 = i6.b.c(this.f44776b.u());
        return android.support.v4.media.a.r(yh.m("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c3, ", \n transports="), String.valueOf(this.f44777c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        this.f44775a.getClass();
        g5.l(parcel, 2, "public-key");
        g5.c(parcel, 3, this.f44776b.u());
        g5.p(parcel, 4, this.f44777c);
        g5.r(parcel, q10);
    }
}
