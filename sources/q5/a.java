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
    public final String f44531a;
    public final String f44532b;
    public final long f44533c;
    public final String d;
    public final String f44534e;
    public final String f44535f;
    public final String h;
    public final String f44536n;
    public final String f44537r;
    public final long f44538s;
    public final String v;
    public final t f44539w;
    public final JSONObject f44540x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f44531a = str;
        this.f44532b = str2;
        this.f44533c = j10;
        this.d = str3;
        this.f44534e = str4;
        this.f44535f = str5;
        this.h = str6;
        this.f44536n = str7;
        this.f44537r = str8;
        this.f44538s = j11;
        this.v = str9;
        this.f44539w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f44540x = new JSONObject(str6);
                return;
            } catch (JSONException e6) {
                Locale locale = Locale.ROOT;
                String message = e6.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f44540x = new JSONObject();
                return;
            }
        }
        this.f44540x = new JSONObject();
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f44531a);
            long j10 = this.f44533c;
            Pattern pattern = u5.a.f48383a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f44538s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f44536n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f44534e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f44532b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f44535f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f44540x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f44537r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f44539w;
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
        if (u5.a.d(this.f44531a, aVar.f44531a) && u5.a.d(this.f44532b, aVar.f44532b) && this.f44533c == aVar.f44533c && u5.a.d(this.d, aVar.d) && u5.a.d(this.f44534e, aVar.f44534e) && u5.a.d(this.f44535f, aVar.f44535f) && u5.a.d(this.h, aVar.h) && u5.a.d(this.f44536n, aVar.f44536n) && u5.a.d(this.f44537r, aVar.f44537r) && this.f44538s == aVar.f44538s && u5.a.d(this.v, aVar.v) && u5.a.d(this.f44539w, aVar.f44539w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44531a, this.f44532b, Long.valueOf(this.f44533c), this.d, this.f44534e, this.f44535f, this.h, this.f44536n, this.f44537r, Long.valueOf(this.f44538s), this.v, this.f44539w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44531a);
        g5.l(parcel, 3, this.f44532b);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.f44533c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.f44534e);
        g5.l(parcel, 7, this.f44535f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.f44536n);
        g5.l(parcel, 10, this.f44537r);
        g5.s(parcel, 11, 8);
        parcel.writeLong(this.f44538s);
        g5.l(parcel, 12, this.v);
        g5.k(parcel, 13, this.f44539w, i10);
        g5.r(parcel, q10);
    }
}
