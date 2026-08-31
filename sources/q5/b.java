package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f44513a;
    public final String f44514b;
    public final long f44515c;
    public final boolean d;
    public final String[] f44516e;
    public final boolean f44517f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z4, String[] strArr, boolean z10, boolean z11) {
        this.f44513a = j10;
        this.f44514b = str;
        this.f44515c = j11;
        this.d = z4;
        this.f44516e = strArr;
        this.f44517f = z10;
        this.h = z11;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f44514b);
            long j10 = this.f44513a;
            Pattern pattern = u5.a.f48347a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f44517f);
            jSONObject.put("duration", this.f44515c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f44516e;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (u5.a.d(this.f44514b, bVar.f44514b) && this.f44513a == bVar.f44513a && this.f44515c == bVar.f44515c && this.d == bVar.d && Arrays.equals(this.f44516e, bVar.f44516e) && this.f44517f == bVar.f44517f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44514b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 8);
        parcel.writeLong(this.f44513a);
        g5.l(parcel, 3, this.f44514b);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.f44515c);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.m(parcel, 6, this.f44516e);
        g5.s(parcel, 7, 4);
        parcel.writeInt(this.f44517f ? 1 : 0);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g5.r(parcel, q10);
    }
}
