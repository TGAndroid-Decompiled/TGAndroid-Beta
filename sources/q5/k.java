package q5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import j7.g5;
import java.util.Arrays;
import org.json.JSONObject;
public final class k extends c6.a {
    public final MediaInfo f44600a;
    public final n f44601b;
    public final Boolean f44602c;
    public final long d;
    public final double f44603e;
    public final long[] f44604f;
    public String h;
    public final JSONObject f44605n;
    public final String f44606r;
    public final String f44607s;
    public final String v;
    public final String f44608w;
    public final long f44609x;
    public static final u5.b f44599y = new u5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f44600a = mediaInfo;
        this.f44601b = nVar;
        this.f44602c = bool;
        this.d = j10;
        this.f44603e = d;
        this.f44604f = jArr;
        this.f44605n = jSONObject;
        this.f44606r = str;
        this.f44607s = str2;
        this.v = str3;
        this.f44608w = str4;
        this.f44609x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (i6.c.a(this.f44605n, kVar.f44605n) && b6.m.l(this.f44600a, kVar.f44600a) && b6.m.l(this.f44601b, kVar.f44601b) && b6.m.l(this.f44602c, kVar.f44602c) && this.d == kVar.d && this.f44603e == kVar.f44603e && Arrays.equals(this.f44604f, kVar.f44604f) && b6.m.l(this.f44606r, kVar.f44606r) && b6.m.l(this.f44607s, kVar.f44607s) && b6.m.l(this.v, kVar.v) && b6.m.l(this.f44608w, kVar.f44608w) && this.f44609x == kVar.f44609x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44600a, this.f44601b, this.f44602c, Long.valueOf(this.d), Double.valueOf(this.f44603e), this.f44604f, String.valueOf(this.f44605n), this.f44606r, this.f44607s, this.v, this.f44608w, Long.valueOf(this.f44609x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f44605n;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.h = jSONObject;
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f44600a, i10);
        g5.k(parcel, 3, this.f44601b, i10);
        g5.a(parcel, 4, this.f44602c);
        g5.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        g5.s(parcel, 6, 8);
        parcel.writeDouble(this.f44603e);
        g5.j(parcel, 7, this.f44604f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.f44606r);
        g5.l(parcel, 10, this.f44607s);
        g5.l(parcel, 11, this.v);
        g5.l(parcel, 12, this.f44608w);
        g5.s(parcel, 13, 8);
        parcel.writeLong(this.f44609x);
        g5.r(parcel, q10);
    }
}
