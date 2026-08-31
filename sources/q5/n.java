package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j7.g5;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import k7.f8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends c6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f44587a;
    public String f44588b;
    public int f44589c;
    public String d;
    public m f44590e;
    public int f44591f;
    public List h;
    public int f44592n;
    public long f44593r;
    public boolean f44594s;

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f44587a)) {
                jSONObject.put("id", this.f44587a);
            }
            if (!TextUtils.isEmpty(this.f44588b)) {
                jSONObject.put("entity", this.f44588b);
            }
            switch (this.f44589c) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("name", this.d);
            }
            m mVar = this.f44590e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.e());
            }
            String b10 = f8.b(Integer.valueOf(this.f44591f));
            if (b10 != null) {
                jSONObject.put("repeatMode", b10);
            }
            List list = this.h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (o oVar : this.h) {
                    jSONArray.put(oVar.f());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f44592n);
            long j10 = this.f44593r;
            if (j10 != -1) {
                Pattern pattern = u5.a.f48347a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f44594s);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (TextUtils.equals(this.f44587a, nVar.f44587a) && TextUtils.equals(this.f44588b, nVar.f44588b) && this.f44589c == nVar.f44589c && TextUtils.equals(this.d, nVar.d) && b6.m.l(this.f44590e, nVar.f44590e) && this.f44591f == nVar.f44591f && b6.m.l(this.h, nVar.h) && this.f44592n == nVar.f44592n && this.f44593r == nVar.f44593r && this.f44594s == nVar.f44594s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44587a, this.f44588b, Integer.valueOf(this.f44589c), this.d, this.f44590e, Integer.valueOf(this.f44591f), this.h, Integer.valueOf(this.f44592n), Long.valueOf(this.f44593r), Boolean.valueOf(this.f44594s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44587a);
        g5.l(parcel, 3, this.f44588b);
        int i11 = this.f44589c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 5, this.d);
        g5.k(parcel, 6, this.f44590e, i10);
        int i12 = this.f44591f;
        g5.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        g5.p(parcel, 8, unmodifiableList);
        int i13 = this.f44592n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f44593r;
        g5.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z4 = this.f44594s;
        g5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.r(parcel, q10);
    }
}
