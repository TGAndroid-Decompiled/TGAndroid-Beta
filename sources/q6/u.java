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
    public final String f42960a;
    public final String f42961b;
    public final b7.w0 f42962c;
    public final j d;
    public final i e;
    public final k f42963f;
    public final g h;
    public final String f42964n;

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
        this.f42960a = str;
        this.f42961b = str2;
        this.f42962c = t6;
        this.d = jVar;
        this.e = iVar;
        this.f42963f = kVar;
        this.h = gVar;
        this.f42964n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (b6.m.l(this.f42960a, uVar.f42960a) && b6.m.l(this.f42961b, uVar.f42961b) && b6.m.l(this.f42962c, uVar.f42962c) && b6.m.l(this.d, uVar.d) && b6.m.l(this.e, uVar.e) && b6.m.l(this.f42963f, uVar.f42963f) && b6.m.l(this.h, uVar.h) && b6.m.l(this.f42964n, uVar.f42964n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42960a, this.f42961b, this.f42962c, this.e, this.d, this.f42963f, this.h, this.f42964n});
    }

    public final String toString() {
        byte[] u10;
        b7.w0 w0Var = this.f42962c;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        String c3 = i6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f42963f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder m9 = yh.m("PublicKeyCredential{\n id='", this.f42960a, "', \n type='", this.f42961b, "', \n rawId=");
        yh.x(m9, c3, ", \n registerResponse=", valueOf, ", \n signResponse=");
        yh.x(m9, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        m9.append(valueOf4);
        m9.append(", \n authenticatorAttachment='");
        m9.append(this.f42964n);
        m9.append("'}");
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        o1 o1Var = (o1) n1.f1712b.f1713a.f1681a;
        p1.f1717a.b();
        throw null;
    }
}
