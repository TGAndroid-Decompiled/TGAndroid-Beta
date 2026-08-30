package q5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import j7.f5;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends c6.a {
    public final MediaInfo f42817a;
    public final n f42818b;
    public final Boolean f42819c;
    public final long d;
    public final double e;
    public final long[] f42820f;
    public String h;
    public final JSONObject f42821n;
    public final String f42822r;
    public final String f42823s;
    public final String v;
    public final String f42824w;
    public final long f42825x;
    public static final u5.b f42816y = new u5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f42817a = mediaInfo;
        this.f42818b = nVar;
        this.f42819c = bool;
        this.d = j10;
        this.e = d;
        this.f42820f = jArr;
        this.f42821n = jSONObject;
        this.f42822r = str;
        this.f42823s = str2;
        this.v = str3;
        this.f42824w = str4;
        this.f42825x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (i6.c.a(this.f42821n, kVar.f42821n) && b6.m.l(this.f42817a, kVar.f42817a) && b6.m.l(this.f42818b, kVar.f42818b) && b6.m.l(this.f42819c, kVar.f42819c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f42820f, kVar.f42820f) && b6.m.l(this.f42822r, kVar.f42822r) && b6.m.l(this.f42823s, kVar.f42823s) && b6.m.l(this.v, kVar.v) && b6.m.l(this.f42824w, kVar.f42824w) && this.f42825x == kVar.f42825x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42817a, this.f42818b, this.f42819c, Long.valueOf(this.d), Double.valueOf(this.e), this.f42820f, String.valueOf(this.f42821n), this.f42822r, this.f42823s, this.v, this.f42824w, Long.valueOf(this.f42825x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f42821n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42817a, i10);
        f5.k(parcel, 3, this.f42818b, i10);
        f5.a(parcel, 4, this.f42819c);
        f5.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        f5.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        f5.j(parcel, 7, this.f42820f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.f42822r);
        f5.l(parcel, 10, this.f42823s);
        f5.l(parcel, 11, this.v);
        f5.l(parcel, 12, this.f42824w);
        f5.s(parcel, 13, 8);
        parcel.writeLong(this.f42825x);
        f5.r(parcel, q10);
    }
}
