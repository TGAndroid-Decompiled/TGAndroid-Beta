package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(18);
    public final b7.w0 f42946a;
    public final b7.w0 f42947b;
    public final b7.w0 f42948c;
    public final b7.w0 d;
    public final b7.w0 e;

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
        this.f42946a = t9;
        this.f42947b = t10;
        this.f42948c = t11;
        this.d = t12;
        this.e = t6;
    }

    public final JSONObject e() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", i6.b.c(this.f42947b.u()));
            jSONObject.put("authenticatorData", i6.b.c(this.f42948c.u()));
            jSONObject.put("signature", i6.b.c(this.d.u()));
            b7.w0 w0Var = this.e;
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
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (b6.m.l(this.f42946a, iVar.f42946a) && b6.m.l(this.f42947b, iVar.f42947b) && b6.m.l(this.f42948c, iVar.f42948c) && b6.m.l(this.d, iVar.d) && b6.m.l(this.e, iVar.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f42946a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f42947b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f42948c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        byte[] u10;
        af.d dVar = new af.d(getClass().getSimpleName(), 8);
        b7.o0 o0Var = b7.q0.d;
        byte[] u11 = this.f42946a.u();
        dVar.D(o0Var.c(u11.length, u11), "keyHandle");
        byte[] u12 = this.f42947b.u();
        dVar.D(o0Var.c(u12.length, u12), "clientDataJSON");
        byte[] u13 = this.f42948c.u();
        dVar.D(o0Var.c(u13.length, u13), "authenticatorData");
        byte[] u14 = this.d.u();
        dVar.D(o0Var.c(u14.length, u14), "signature");
        b7.w0 w0Var = this.e;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        if (u10 != null) {
            dVar.D(o0Var.c(u10.length, u10), "userHandle");
        }
        return dVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q10 = f5.q(parcel, 20293);
        f5.c(parcel, 2, this.f42946a.u());
        f5.c(parcel, 3, this.f42947b.u());
        f5.c(parcel, 4, this.f42948c.u());
        f5.c(parcel, 5, this.d.u());
        b7.w0 w0Var = this.e;
        if (w0Var == null) {
            u10 = null;
        } else {
            u10 = w0Var.u();
        }
        f5.c(parcel, 6, u10);
        f5.r(parcel, q10);
    }
}
