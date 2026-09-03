package q6;

import android.os.Parcel;
import android.os.Parcelable;
import b7.n1;
import b7.o1;
import b7.p1;
import java.util.Arrays;
import org.telegram.ui.ai;
public final class u extends c6.a {
    public static final Parcelable.Creator<u> CREATOR = new l4.j(28);
    public final String f42990a;
    public final String f42991b;
    public final b7.w0 f42992c;
    public final j d;
    public final i e;
    public final k f42993f;
    public final g h;
    public final String f42994n;

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
        this.f42990a = str;
        this.f42991b = str2;
        this.f42992c = t6;
        this.d = jVar;
        this.e = iVar;
        this.f42993f = kVar;
        this.h = gVar;
        this.f42994n = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (b6.m.l(this.f42990a, uVar.f42990a) && b6.m.l(this.f42991b, uVar.f42991b) && b6.m.l(this.f42992c, uVar.f42992c) && b6.m.l(this.d, uVar.d) && b6.m.l(this.e, uVar.e) && b6.m.l(this.f42993f, uVar.f42993f) && b6.m.l(this.h, uVar.h) && b6.m.l(this.f42994n, uVar.f42994n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42990a, this.f42991b, this.f42992c, this.e, this.d, this.f42993f, this.h, this.f42994n});
    }

    public final String toString() {
        byte[] u10;
        b7.w0 w0Var = this.f42992c;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        String c3 = i6.b.c(u10);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f42993f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder l10 = ai.l("PublicKeyCredential{\n id='", this.f42990a, "', \n type='", this.f42991b, "', \n rawId=");
        ai.w(l10, c3, ", \n registerResponse=", valueOf, ", \n signResponse=");
        ai.w(l10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        l10.append(valueOf4);
        l10.append(", \n authenticatorAttachment='");
        l10.append(this.f42994n);
        l10.append("'}");
        return l10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        o1 o1Var = (o1) n1.f1723b.f1724a.f1692a;
        p1.f1728a.a();
        throw null;
    }
}
