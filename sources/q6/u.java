package q6;

import android.os.Parcel;
import android.os.Parcelable;
import b7.n1;
import b7.o1;
import b7.p1;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class u extends c6.a {
    public static final Parcelable.Creator<u> CREATOR = new l4.j(28);
    public final String f44755a;
    public final String f44756b;
    public final b7.w0 f44757c;
    public final j d;
    public final i f44758e;
    public final k f44759f;
    public final g h;
    public final String f44760n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        b7.w0 t6;
        boolean z4;
        if (bArr == null) {
            t6 = null;
        } else {
            t6 = b7.w0.t(bArr.length, bArr);
        }
        boolean z10 = false;
        if ((jVar != null && iVar == null && kVar == null) || ((jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null))) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.a("Must provide a response object.", z4);
        if (kVar != null || (str != null && t6 != null)) {
            z10 = true;
        }
        b6.m.a("Must provide id and rawId if not an error response.", z10);
        this.f44755a = str;
        this.f44756b = str2;
        this.f44757c = t6;
        this.d = jVar;
        this.f44758e = iVar;
        this.f44759f = kVar;
        this.h = gVar;
        this.f44760n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (b6.m.l(this.f44755a, uVar.f44755a) && b6.m.l(this.f44756b, uVar.f44756b) && b6.m.l(this.f44757c, uVar.f44757c) && b6.m.l(this.d, uVar.d) && b6.m.l(this.f44758e, uVar.f44758e) && b6.m.l(this.f44759f, uVar.f44759f) && b6.m.l(this.h, uVar.h) && b6.m.l(this.f44760n, uVar.f44760n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44755a, this.f44756b, this.f44757c, this.f44758e, this.d, this.f44759f, this.h, this.f44760n});
    }

    public final String toString() {
        byte[] u10;
        b7.w0 w0Var = this.f44757c;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        String c3 = i6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f44758e);
        String valueOf3 = String.valueOf(this.f44759f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder m9 = yh.m("PublicKeyCredential{\n id='", this.f44755a, "', \n type='", this.f44756b, "', \n rawId=");
        yh.w(m9, c3, ", \n registerResponse=", valueOf, ", \n signResponse=");
        yh.w(m9, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        m9.append(valueOf4);
        m9.append(", \n authenticatorAttachment='");
        m9.append(this.f44760n);
        m9.append("'}");
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        o1 o1Var = (o1) n1.f1854b.f1855a.f1820a;
        p1.f1860a.a();
        throw null;
    }
}
