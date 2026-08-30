package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import k7.e8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends c6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f42832a;
    public String f42833b;
    public int f42834c;
    public String d;
    public m e;
    public int f42835f;
    public List h;
    public int f42836n;
    public long f42837r;
    public boolean f42838s;

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f42832a)) {
                jSONObject.put("id", this.f42832a);
            }
            if (!TextUtils.isEmpty(this.f42833b)) {
                jSONObject.put("entity", this.f42833b);
            }
            switch (this.f42834c) {
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
            m mVar = this.e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.e());
            }
            String b10 = e8.b(Integer.valueOf(this.f42835f));
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
            jSONObject.put("startIndex", this.f42836n);
            long j10 = this.f42837r;
            if (j10 != -1) {
                Pattern pattern = u5.a.f45096a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f42838s);
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
        if (TextUtils.equals(this.f42832a, nVar.f42832a) && TextUtils.equals(this.f42833b, nVar.f42833b) && this.f42834c == nVar.f42834c && TextUtils.equals(this.d, nVar.d) && b6.m.l(this.e, nVar.e) && this.f42835f == nVar.f42835f && b6.m.l(this.h, nVar.h) && this.f42836n == nVar.f42836n && this.f42837r == nVar.f42837r && this.f42838s == nVar.f42838s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42832a, this.f42833b, Integer.valueOf(this.f42834c), this.d, this.e, Integer.valueOf(this.f42835f), this.h, Integer.valueOf(this.f42836n), Long.valueOf(this.f42837r), Boolean.valueOf(this.f42838s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f42832a);
        f5.l(parcel, 3, this.f42833b);
        int i11 = this.f42834c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 5, this.d);
        f5.k(parcel, 6, this.e, i10);
        int i12 = this.f42835f;
        f5.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        f5.p(parcel, 8, unmodifiableList);
        int i13 = this.f42836n;
        f5.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f42837r;
        f5.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z4 = this.f42838s;
        f5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.r(parcel, q10);
    }
}
