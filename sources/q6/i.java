package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(18);
    public final b7.w0 f44709a;
    public final b7.w0 f44710b;
    public final b7.w0 f44711c;
    public final b7.w0 d;
    public final b7.w0 f44712e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        b7.w0 t6;
        b6.m.h(bArr);
        b7.w0 t9 = b7.w0.t(bArr.length, bArr);
        b6.m.h(bArr2);
        b7.w0 t10 = b7.w0.t(bArr2.length, bArr2);
        b6.m.h(bArr3);
        b7.w0 t11 = b7.w0.t(bArr3.length, bArr3);
        b6.m.h(bArr4);
        b7.w0 t12 = b7.w0.t(bArr4.length, bArr4);
        if (bArr5 == null) {
            t6 = null;
        } else {
            t6 = b7.w0.t(bArr5.length, bArr5);
        }
        this.f44709a = t9;
        this.f44710b = t10;
        this.f44711c = t11;
        this.d = t12;
        this.f44712e = t6;
    }

    public final JSONObject e() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", i6.b.c(this.f44710b.u()));
            jSONObject.put("authenticatorData", i6.b.c(this.f44711c.u()));
            jSONObject.put("signature", i6.b.c(this.d.u()));
            b7.w0 w0Var = this.f44712e;
            if (w0Var != null) {
                if (w0Var == null) {
                    u10 = null;
                } else {
                    u10 = w0Var.u();
                }
                jSONObject.put("userHandle", i6.b.c(u10));
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e6) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (b6.m.l(this.f44709a, iVar.f44709a) && b6.m.l(this.f44710b, iVar.f44710b) && b6.m.l(this.f44711c, iVar.f44711c) && b6.m.l(this.d, iVar.d) && b6.m.l(this.f44712e, iVar.f44712e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f44709a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f44710b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f44711c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f44712e}))});
    }

    public final String toString() {
        byte[] u10;
        androidx.biometric.e eVar = new androidx.biometric.e(getClass().getSimpleName(), 7);
        b7.o0 o0Var = b7.q0.d;
        byte[] u11 = this.f44709a.u();
        eVar.D(o0Var.c(u11.length, u11), "keyHandle");
        byte[] u12 = this.f44710b.u();
        eVar.D(o0Var.c(u12.length, u12), "clientDataJSON");
        byte[] u13 = this.f44711c.u();
        eVar.D(o0Var.c(u13.length, u13), "authenticatorData");
        byte[] u14 = this.d.u();
        eVar.D(o0Var.c(u14.length, u14), "signature");
        b7.w0 w0Var = this.f44712e;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        if (u10 != null) {
            eVar.D(o0Var.c(u10.length, u10), "userHandle");
        }
        return eVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q10 = g5.q(parcel, 20293);
        g5.c(parcel, 2, this.f44709a.u());
        g5.c(parcel, 3, this.f44710b.u());
        g5.c(parcel, 4, this.f44711c.u());
        g5.c(parcel, 5, this.d.u());
        b7.w0 w0Var = this.f44712e;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        g5.c(parcel, 6, u10);
        g5.r(parcel, q10);
    }
}
