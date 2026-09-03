package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f42795a;
    public final String f42796b;
    public final long f42797c;
    public final boolean d;
    public final String[] e;
    public final boolean f42798f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z4, String[] strArr, boolean z10, boolean z11) {
        this.f42795a = j10;
        this.f42796b = str;
        this.f42797c = j11;
        this.d = z4;
        this.e = strArr;
        this.f42798f = z10;
        this.h = z11;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f42796b);
            long j10 = this.f42795a;
            Pattern pattern = u5.a.f45158a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f42798f);
            jSONObject.put("duration", this.f42797c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.e;
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
        if (u5.a.d(this.f42796b, bVar.f42796b) && this.f42795a == bVar.f42795a && this.f42797c == bVar.f42797c && this.d == bVar.d && Arrays.equals(this.e, bVar.e) && this.f42798f == bVar.f42798f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42796b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.f42795a);
        f5.l(parcel, 3, this.f42796b);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.f42797c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.m(parcel, 6, this.e);
        f5.s(parcel, 7, 4);
        parcel.writeInt(this.f42798f ? 1 : 0);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f5.r(parcel, q10);
    }
}
