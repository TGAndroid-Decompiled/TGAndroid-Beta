package s5;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class j extends o {
    public final int f44081r;
    public final h f44082s;
    public final Object f44083t;

    public j(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f44081r = i10;
        this.f44082s = hVar;
        this.f44083t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f44081r;
        Object obj = this.f44083t;
        h hVar = this.f44082s;
        switch (i10) {
            case 0:
                u5.n nVar = hVar.f44074c;
                u5.o o10 = o();
                int[] iArr = (int[]) obj;
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = nVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", nVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i11 : iArr) {
                        jSONArray.put(i11);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                nVar.c(b10, jSONObject.toString());
                nVar.f45122s.a(b10, o10);
                return;
            case 1:
                u5.n nVar2 = hVar.f44074c;
                u5.o o11 = o();
                q5.k kVar = (q5.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.f42817a;
                q5.n nVar3 = kVar.f42818b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f42820f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f42817a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.e());
                    }
                    if (nVar3 != null) {
                        jSONObject2.put("queueData", nVar3.e());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f42819c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = u5.a.f45096a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.e);
                    jSONObject2.putOpt("credentials", kVar.f42822r);
                    jSONObject2.putOpt("credentialsType", kVar.f42823s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f42824w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f42821n);
                    jSONObject2.put("requestId", kVar.f42825x);
                } catch (JSONException e) {
                    u5.b bVar = q5.k.f42816y;
                    Log.e(bVar.f45098a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject2 = new JSONObject();
                }
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.f45113j.a(b11, o11);
                return;
            default:
                u5.n nVar4 = hVar.f44074c;
                u5.o o12 = o();
                nVar4.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar4.b();
                long j11 = ((q5.p) obj).f42845a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = u5.a.f45096a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                } catch (JSONException unused3) {
                }
                nVar4.c(b12, jSONObject3.toString());
                nVar4.f45111g = Long.valueOf(j11);
                nVar4.f45116m.a(b12, new u5.k(nVar4, o12, 0));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f44081r = 0;
        this.f44082s = hVar;
        this.f44083t = iArr;
    }
}
