package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import j7.g5;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f44500a;
    public final String f44501b;
    public final long f44502c;
    public final String d;
    public final String f44503e;
    public final String f44504f;
    public final String h;
    public final String f44505n;
    public final String f44506r;
    public final long f44507s;
    public final String v;
    public final t f44508w;
    public final JSONObject f44509x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f44500a = str;
        this.f44501b = str2;
        this.f44502c = j10;
        this.d = str3;
        this.f44503e = str4;
        this.f44504f = str5;
        this.h = str6;
        this.f44505n = str7;
        this.f44506r = str8;
        this.f44507s = j11;
        this.v = str9;
        this.f44508w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f44509x = new JSONObject(str6);
                return;
            } catch (JSONException e6) {
                Locale locale = Locale.ROOT;
                String message = e6.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f44509x = new JSONObject();
                return;
            }
        }
        this.f44509x = new JSONObject();
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f44500a);
            long j10 = this.f44502c;
            Pattern pattern = u5.a.f48347a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f44507s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f44505n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f44503e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f44501b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f44504f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f44509x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f44506r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f44508w;
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
        if (u5.a.d(this.f44500a, aVar.f44500a) && u5.a.d(this.f44501b, aVar.f44501b) && this.f44502c == aVar.f44502c && u5.a.d(this.d, aVar.d) && u5.a.d(this.f44503e, aVar.f44503e) && u5.a.d(this.f44504f, aVar.f44504f) && u5.a.d(this.h, aVar.h) && u5.a.d(this.f44505n, aVar.f44505n) && u5.a.d(this.f44506r, aVar.f44506r) && this.f44507s == aVar.f44507s && u5.a.d(this.v, aVar.v) && u5.a.d(this.f44508w, aVar.f44508w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44500a, this.f44501b, Long.valueOf(this.f44502c), this.d, this.f44503e, this.f44504f, this.h, this.f44505n, this.f44506r, Long.valueOf(this.f44507s), this.v, this.f44508w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44500a);
        g5.l(parcel, 3, this.f44501b);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.f44502c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.f44503e);
        g5.l(parcel, 7, this.f44504f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.f44505n);
        g5.l(parcel, 10, this.f44506r);
        g5.s(parcel, 11, 8);
        parcel.writeLong(this.f44507s);
        g5.l(parcel, 12, this.v);
        g5.k(parcel, 13, this.f44508w, i10);
        g5.r(parcel, q10);
    }
}
