package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.ai;
public final class w extends c6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 f43008a;
    public final b7.w0 f43009b;
    public final List f43010c;

    static {
        b7.q.r(2, b7.b.f1677c, b7.b.d);
        CREATOR = new l4.j(29);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        b7.w0 w0Var = b7.w0.f1747c;
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(str);
        try {
            this.f43008a = a0.a(str);
            this.f43009b = t6;
            this.f43010c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            List list = wVar.f43010c;
            if (this.f43008a.equals(wVar.f43008a) && b6.m.l(this.f43009b, wVar.f43009b)) {
                List list2 = this.f43010c;
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
        return Arrays.hashCode(new Object[]{this.f43008a, this.f43009b, this.f43010c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f43008a);
        String c3 = i6.b.c(this.f43009b.u());
        return android.support.v4.media.a.r(ai.l("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c3, ", \n transports="), String.valueOf(this.f43010c), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        this.f43008a.getClass();
        f5.l(parcel, 2, "public-key");
        f5.c(parcel, 3, this.f43009b.u());
        f5.p(parcel, 4, this.f43010c);
        f5.r(parcel, q10);
    }
}
