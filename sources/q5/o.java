package q5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import j7.f5;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo f42839a;
    public int f42840b;
    public boolean f42841c;
    public double d;
    public double e;
    public double f42842f;
    public long[] h;
    public String f42843n;
    public JSONObject f42844r;

    public o(MediaInfo mediaInfo, int i10, boolean z4, double d, double d10, double d11, long[] jArr, String str) {
        this.f42839a = mediaInfo;
        this.f42840b = i10;
        this.f42841c = z4;
        this.d = d;
        this.e = d10;
        this.f42842f = d11;
        this.h = jArr;
        this.f42843n = str;
        if (str == null) {
            this.f42844r = null;
            return;
        }
        try {
            this.f42844r = new JSONObject(this.f42843n);
        } catch (JSONException unused) {
            this.f42844r = null;
            this.f42843n = null;
        }
    }

    public final boolean e(JSONObject jSONObject) {
        boolean z4;
        long[] jArr;
        boolean z10;
        int i10;
        boolean z11 = false;
        if (jSONObject.has("media")) {
            this.f42839a = new MediaInfo(jSONObject.getJSONObject("media"));
            z4 = true;
        } else {
            z4 = false;
        }
        if (jSONObject.has("itemId") && this.f42840b != (i10 = jSONObject.getInt("itemId"))) {
            this.f42840b = i10;
            z4 = true;
        }
        if (jSONObject.has("autoplay") && this.f42841c != (z10 = jSONObject.getBoolean("autoplay"))) {
            this.f42841c = z10;
            z4 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z4 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z4 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f42842f) > 1.0E-7d) {
                this.f42842f = d10;
                z4 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                jArr[i11] = jSONArray.getLong(i11);
            }
            long[] jArr2 = this.h;
            if (jArr2 != null && jArr2.length == length) {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.h[i12] == jArr[i12]) {
                    }
                }
            }
            z11 = true;
            break;
        } else {
            jArr = null;
        }
        if (z11) {
            this.h = jArr;
            z4 = true;
        }
        if (jSONObject.has("customData")) {
            this.f42844r = jSONObject.getJSONObject("customData");
            return true;
        }
        return z4;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        JSONObject jSONObject = this.f42844r;
        if (jSONObject != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        JSONObject jSONObject2 = oVar.f42844r;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z4 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || i6.c.a(jSONObject, jSONObject2)) && u5.a.d(this.f42839a, oVar.f42839a) && this.f42840b == oVar.f42840b && this.f42841c == oVar.f42841c && (((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.e == oVar.e && this.f42842f == oVar.f42842f && Arrays.equals(this.h, oVar.h))) {
            return true;
        }
        return false;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f42839a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.e());
            }
            int i10 = this.f42840b;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.f42841c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f42842f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f42844r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42839a, Integer.valueOf(this.f42840b), Boolean.valueOf(this.f42841c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f42842f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.f42844r)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f42844r;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f42843n = jSONObject;
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f42839a, i10);
        int i11 = this.f42840b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z4 = this.f42841c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        double d = this.d;
        f5.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.e;
        f5.s(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f42842f;
        f5.s(parcel, 7, 8);
        parcel.writeDouble(d11);
        f5.j(parcel, 8, this.h);
        f5.l(parcel, 9, this.f42843n);
        f5.r(parcel, q10);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        e(jSONObject);
    }
}
