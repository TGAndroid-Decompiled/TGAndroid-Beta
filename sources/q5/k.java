package q5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import j7.f5;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends c6.a {
    public final MediaInfo f42847a;
    public final n f42848b;
    public final Boolean f42849c;
    public final long d;
    public final double e;
    public final long[] f42850f;
    public String h;
    public final JSONObject f42851n;
    public final String f42852r;
    public final String f42853s;
    public final String v;
    public final String f42854w;
    public final long f42855x;
    public static final u5.b f42846y = new u5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f42847a = mediaInfo;
        this.f42848b = nVar;
        this.f42849c = bool;
        this.d = j10;
        this.e = d;
        this.f42850f = jArr;
        this.f42851n = jSONObject;
        this.f42852r = str;
        this.f42853s = str2;
        this.v = str3;
        this.f42854w = str4;
        this.f42855x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (i6.c.a(this.f42851n, kVar.f42851n) && b6.m.l(this.f42847a, kVar.f42847a) && b6.m.l(this.f42848b, kVar.f42848b) && b6.m.l(this.f42849c, kVar.f42849c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f42850f, kVar.f42850f) && b6.m.l(this.f42852r, kVar.f42852r) && b6.m.l(this.f42853s, kVar.f42853s) && b6.m.l(this.v, kVar.v) && b6.m.l(this.f42854w, kVar.f42854w) && this.f42855x == kVar.f42855x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42847a, this.f42848b, this.f42849c, Long.valueOf(this.d), Double.valueOf(this.e), this.f42850f, String.valueOf(this.f42851n), this.f42852r, this.f42853s, this.v, this.f42854w, Long.valueOf(this.f42855x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f42851n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42847a, i10);
        f5.k(parcel, 3, this.f42848b, i10);
        f5.a(parcel, 4, this.f42849c);
        f5.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        f5.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        f5.j(parcel, 7, this.f42850f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.f42852r);
        f5.l(parcel, 10, this.f42853s);
        f5.l(parcel, 11, this.v);
        f5.l(parcel, 12, this.f42854w);
        f5.s(parcel, 13, 8);
        parcel.writeLong(this.f42855x);
        f5.r(parcel, q10);
    }
}
