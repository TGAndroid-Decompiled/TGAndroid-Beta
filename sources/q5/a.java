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
    public final String f42783a;
    public final String f42784b;
    public final long f42785c;
    public final String d;
    public final String e;
    public final String f42786f;
    public final String h;
    public final String f42787n;
    public final String f42788r;
    public final long f42789s;
    public final String v;
    public final t f42790w;
    public final JSONObject f42791x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f42783a = str;
        this.f42784b = str2;
        this.f42785c = j10;
        this.d = str3;
        this.e = str4;
        this.f42786f = str5;
        this.h = str6;
        this.f42787n = str7;
        this.f42788r = str8;
        this.f42789s = j11;
        this.v = str9;
        this.f42790w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f42791x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f42791x = new JSONObject();
                return;
            }
        }
        this.f42791x = new JSONObject();
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f42783a);
            long j10 = this.f42785c;
            Pattern pattern = u5.a.f45158a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f42789s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f42787n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f42784b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f42786f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f42791x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f42788r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f42790w;
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
        if (u5.a.d(this.f42783a, aVar.f42783a) && u5.a.d(this.f42784b, aVar.f42784b) && this.f42785c == aVar.f42785c && u5.a.d(this.d, aVar.d) && u5.a.d(this.e, aVar.e) && u5.a.d(this.f42786f, aVar.f42786f) && u5.a.d(this.h, aVar.h) && u5.a.d(this.f42787n, aVar.f42787n) && u5.a.d(this.f42788r, aVar.f42788r) && this.f42789s == aVar.f42789s && u5.a.d(this.v, aVar.v) && u5.a.d(this.f42790w, aVar.f42790w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42783a, this.f42784b, Long.valueOf(this.f42785c), this.d, this.e, this.f42786f, this.h, this.f42787n, this.f42788r, Long.valueOf(this.f42789s), this.v, this.f42790w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42783a);
        f5.l(parcel, 3, this.f42784b);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.f42785c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f42786f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.f42787n);
        f5.l(parcel, 10, this.f42788r);
        f5.s(parcel, 11, 8);
        parcel.writeLong(this.f42789s);
        f5.l(parcel, 12, this.v);
        f5.k(parcel, 13, this.f42790w, i10);
        f5.r(parcel, q10);
    }
}
