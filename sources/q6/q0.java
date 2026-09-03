package q6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j7.g5;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
public final class q0 extends c6.a {
    public static final Parcelable.Creator<q0> CREATOR = new l4.j(26);
    public static final byte[] f44738b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] f44739a;

    public q0(byte[][] bArr) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (bArr != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.b(z4);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        b6.m.b(z10);
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            if (i10 == 0 || bArr[i10] != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            b6.m.b(z11);
            int i11 = i10 + 1;
            if (bArr[i11] != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            b6.m.b(z12);
            int length = bArr[i11].length;
            if (length == 32 || length == 64) {
                z13 = true;
            } else {
                z13 = false;
            }
            b6.m.b(z13);
        }
        this.f44739a = bArr;
    }

    public static q0 e(JSONObject jSONObject, boolean z4) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z4) {
                    arrayList.add(h(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(j(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(i6.b.b(next));
                    if (z4) {
                        arrayList.add(h(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(j(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new q0((byte[][]) arrayList.toArray(new byte[0]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject f(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] g(byte[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: q6.q0.g(byte[]):byte[]");
    }

    public static byte[] h(JSONObject jSONObject) {
        byte[] b10 = i6.b.b(jSONObject.getString("first"));
        if (b10.length == 32) {
            if (!jSONObject.has("second")) {
                return b10;
            }
            byte[] b11 = i6.b.b(jSONObject.getString("second"));
            if (b11.length == 32) {
                return b7.b.j(b10, b11);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] j(JSONObject jSONObject) {
        byte[] g10 = g(i6.b.b(jSONObject.getString("first")));
        if (!jSONObject.has("second")) {
            return g10;
        }
        return b7.b.j(g10, g(i6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        return Arrays.deepEquals(this.f44739a, ((q0) obj).f44739a);
    }

    public final int hashCode() {
        byte[][] bArr;
        int i10 = 0;
        for (byte[] bArr2 : this.f44739a) {
            if (bArr2 != null) {
                i10 ^= Arrays.hashCode(new Object[]{bArr2});
            }
        }
        return i10;
    }

    public final String toString() {
        byte[][] bArr = this.f44739a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", f(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(i6.b.c(bArr[i10]), f(bArr[i10 + 1]));
                }
            }
            String obj = jSONObject.toString();
            return "PrfExtension{" + obj + "}";
        } catch (JSONException e6) {
            return android.support.v4.media.a.o("PrfExtension{Exception:", e6.getMessage(), "}");
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.d(parcel, 1, this.f44739a);
        g5.r(parcel, q10);
    }
}
