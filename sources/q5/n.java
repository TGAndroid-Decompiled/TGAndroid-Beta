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
    public String f44618a;
    public String f44619b;
    public int f44620c;
    public String d;
    public m f44621e;
    public int f44622f;
    public List h;
    public int f44623n;
    public long f44624r;
    public boolean f44625s;

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f44618a)) {
                jSONObject.put("id", this.f44618a);
            }
            if (!TextUtils.isEmpty(this.f44619b)) {
                jSONObject.put("entity", this.f44619b);
            }
            switch (this.f44620c) {
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
            m mVar = this.f44621e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.e());
            }
            String b10 = f8.b(Integer.valueOf(this.f44622f));
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
            jSONObject.put("startIndex", this.f44623n);
            long j10 = this.f44624r;
            if (j10 != -1) {
                Pattern pattern = u5.a.f48383a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f44625s);
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
        if (TextUtils.equals(this.f44618a, nVar.f44618a) && TextUtils.equals(this.f44619b, nVar.f44619b) && this.f44620c == nVar.f44620c && TextUtils.equals(this.d, nVar.d) && b6.m.l(this.f44621e, nVar.f44621e) && this.f44622f == nVar.f44622f && b6.m.l(this.h, nVar.h) && this.f44623n == nVar.f44623n && this.f44624r == nVar.f44624r && this.f44625s == nVar.f44625s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44618a, this.f44619b, Integer.valueOf(this.f44620c), this.d, this.f44621e, Integer.valueOf(this.f44622f), this.h, Integer.valueOf(this.f44623n), Long.valueOf(this.f44624r), Boolean.valueOf(this.f44625s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f44618a);
        g5.l(parcel, 3, this.f44619b);
        int i11 = this.f44620c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 5, this.d);
        g5.k(parcel, 6, this.f44621e, i10);
        int i12 = this.f44622f;
        g5.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        g5.p(parcel, 8, unmodifiableList);
        int i13 = this.f44623n;
        g5.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f44624r;
        g5.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z4 = this.f44625s;
        g5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.r(parcel, q10);
    }
}
