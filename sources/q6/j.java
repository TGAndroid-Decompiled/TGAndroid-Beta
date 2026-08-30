package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(19);
    public final b7.w0 f42920a;
    public final b7.w0 f42921b;
    public final b7.w0 f42922c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        b6.m.h(bArr);
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(bArr2);
        b7.w0 t9 = b7.w0.t(bArr2.length, bArr2);
        b6.m.h(bArr3);
        b7.w0 t10 = b7.w0.t(bArr3.length, bArr3);
        this.f42920a = t6;
        this.f42921b = t9;
        this.f42922c = t10;
        b6.m.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject e() {
        throw new UnsupportedOperationException("Method not decompiled: q6.j.e():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (b6.m.l(this.f42920a, jVar.f42920a) && b6.m.l(this.f42921b, jVar.f42921b) && b6.m.l(this.f42922c, jVar.f42922c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f42920a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f42921b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f42922c}))});
    }

    public final String toString() {
        androidx.biometric.e eVar = new androidx.biometric.e(getClass().getSimpleName(), 7);
        b7.o0 o0Var = b7.q0.d;
        byte[] u10 = this.f42920a.u();
        eVar.D(o0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.f42921b.u();
        eVar.D(o0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.f42922c.u();
        eVar.D(o0Var.c(u12.length, u12), "attestationObject");
        eVar.D(Arrays.toString(this.d), "transports");
        return eVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.c(parcel, 2, this.f42920a.u());
        f5.c(parcel, 3, this.f42921b.u());
        f5.c(parcel, 4, this.f42922c.u());
        f5.m(parcel, 5, this.d);
        f5.r(parcel, q10);
    }
}
