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
    public final long f44544a;
    public final String f44545b;
    public final long f44546c;
    public final boolean d;
    public final String[] f44547e;
    public final boolean f44548f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z4, String[] strArr, boolean z10, boolean z11) {
        this.f44544a = j10;
        this.f44545b = str;
        this.f44546c = j11;
        this.d = z4;
        this.f44547e = strArr;
        this.f44548f = z10;
        this.h = z11;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f44545b);
            long j10 = this.f44544a;
            Pattern pattern = u5.a.f48383a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f44548f);
            jSONObject.put("duration", this.f44546c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f44547e;
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
        if (u5.a.d(this.f44545b, bVar.f44545b) && this.f44544a == bVar.f44544a && this.f44546c == bVar.f44546c && this.d == bVar.d && Arrays.equals(this.f44547e, bVar.f44547e) && this.f44548f == bVar.f44548f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44545b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 8);
        parcel.writeLong(this.f44544a);
        g5.l(parcel, 3, this.f44545b);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.f44546c);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.m(parcel, 6, this.f44547e);
        g5.s(parcel, 7, 4);
        parcel.writeInt(this.f44548f ? 1 : 0);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g5.r(parcel, q10);
    }
}
