package q5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import j7.g5;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends c6.a {
    public final MediaInfo f44569a;
    public final n f44570b;
    public final Boolean f44571c;
    public final long d;
    public final double f44572e;
    public final long[] f44573f;
    public String h;
    public final JSONObject f44574n;
    public final String f44575r;
    public final String f44576s;
    public final String v;
    public final String f44577w;
    public final long f44578x;
    public static final u5.b f44568y = new u5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f44569a = mediaInfo;
        this.f44570b = nVar;
        this.f44571c = bool;
        this.d = j10;
        this.f44572e = d;
        this.f44573f = jArr;
        this.f44574n = jSONObject;
        this.f44575r = str;
        this.f44576s = str2;
        this.v = str3;
        this.f44577w = str4;
        this.f44578x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (i6.c.a(this.f44574n, kVar.f44574n) && b6.m.l(this.f44569a, kVar.f44569a) && b6.m.l(this.f44570b, kVar.f44570b) && b6.m.l(this.f44571c, kVar.f44571c) && this.d == kVar.d && this.f44572e == kVar.f44572e && Arrays.equals(this.f44573f, kVar.f44573f) && b6.m.l(this.f44575r, kVar.f44575r) && b6.m.l(this.f44576s, kVar.f44576s) && b6.m.l(this.v, kVar.v) && b6.m.l(this.f44577w, kVar.f44577w) && this.f44578x == kVar.f44578x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44569a, this.f44570b, this.f44571c, Long.valueOf(this.d), Double.valueOf(this.f44572e), this.f44573f, String.valueOf(this.f44574n), this.f44575r, this.f44576s, this.v, this.f44577w, Long.valueOf(this.f44578x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f44574n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f44569a, i10);
        g5.k(parcel, 3, this.f44570b, i10);
        g5.a(parcel, 4, this.f44571c);
        g5.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        g5.s(parcel, 6, 8);
        parcel.writeDouble(this.f44572e);
        g5.j(parcel, 7, this.f44573f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.f44575r);
        g5.l(parcel, 10, this.f44576s);
        g5.l(parcel, 11, this.v);
        g5.l(parcel, 12, this.f44577w);
        g5.s(parcel, 13, 8);
        parcel.writeLong(this.f44578x);
        g5.r(parcel, q10);
    }
}
