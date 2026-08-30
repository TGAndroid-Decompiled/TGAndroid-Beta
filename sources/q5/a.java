package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import j7.f5;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f42753a;
    public final String f42754b;
    public final long f42755c;
    public final String d;
    public final String e;
    public final String f42756f;
    public final String h;
    public final String f42757n;
    public final String f42758r;
    public final long f42759s;
    public final String v;
    public final t f42760w;
    public final JSONObject f42761x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f42753a = str;
        this.f42754b = str2;
        this.f42755c = j10;
        this.d = str3;
        this.e = str4;
        this.f42756f = str5;
        this.h = str6;
        this.f42757n = str7;
        this.f42758r = str8;
        this.f42759s = j11;
        this.v = str9;
        this.f42760w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f42761x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f42761x = new JSONObject();
                return;
            }
        }
        this.f42761x = new JSONObject();
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f42753a);
            long j10 = this.f42755c;
            Pattern pattern = u5.a.f45096a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f42759s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f42757n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f42754b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f42756f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f42761x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f42758r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f42760w;
            if (tVar != null) {
                jSONObject.put("vastAdsRequest", tVar.e());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (u5.a.d(this.f42753a, aVar.f42753a) && u5.a.d(this.f42754b, aVar.f42754b) && this.f42755c == aVar.f42755c && u5.a.d(this.d, aVar.d) && u5.a.d(this.e, aVar.e) && u5.a.d(this.f42756f, aVar.f42756f) && u5.a.d(this.h, aVar.h) && u5.a.d(this.f42757n, aVar.f42757n) && u5.a.d(this.f42758r, aVar.f42758r) && this.f42759s == aVar.f42759s && u5.a.d(this.v, aVar.v) && u5.a.d(this.f42760w, aVar.f42760w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42753a, this.f42754b, Long.valueOf(this.f42755c), this.d, this.e, this.f42756f, this.h, this.f42757n, this.f42758r, Long.valueOf(this.f42759s), this.v, this.f42760w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42753a);
        f5.l(parcel, 3, this.f42754b);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.f42755c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f42756f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.f42757n);
        f5.l(parcel, 10, this.f42758r);
        f5.s(parcel, 11, 8);
        parcel.writeLong(this.f42759s);
        f5.l(parcel, 12, this.v);
        f5.k(parcel, 13, this.f42760w, i10);
        f5.r(parcel, q10);
    }
}
