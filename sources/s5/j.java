package s5;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class j extends o {
    public final int f44146r;
    public final h f44147s;
    public final Object f44148t;

    public j(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f44146r = i10;
        this.f44147s = hVar;
        this.f44148t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f44146r;
        Object obj = this.f44148t;
        h hVar = this.f44147s;
        switch (i10) {
            case 0:
                u5.n nVar = hVar.f44139c;
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
                nVar.f45184s.a(b10, o10);
                return;
            case 1:
                u5.n nVar2 = hVar.f44139c;
                u5.o o11 = o();
                q5.k kVar = (q5.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.f42847a;
                q5.n nVar3 = kVar.f42848b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f42850f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f42847a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.e());
                    }
                    if (nVar3 != null) {
                        jSONObject2.put("queueData", nVar3.e());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f42849c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = u5.a.f45158a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.e);
                    jSONObject2.putOpt("credentials", kVar.f42852r);
                    jSONObject2.putOpt("credentialsType", kVar.f42853s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f42854w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f42851n);
                    jSONObject2.put("requestId", kVar.f42855x);
                } catch (JSONException e) {
                    u5.b bVar = q5.k.f42846y;
                    Log.e(bVar.f45160a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject2 = new JSONObject();
                }
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.f45175j.a(b11, o11);
                return;
            default:
                u5.n nVar4 = hVar.f44139c;
                u5.o o12 = o();
                nVar4.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar4.b();
                long j11 = ((q5.p) obj).f42875a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = u5.a.f45158a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                } catch (JSONException unused3) {
                }
                nVar4.c(b12, jSONObject3.toString());
                nVar4.f45173g = Long.valueOf(j11);
                nVar4.f45178m.a(b12, new u5.k(nVar4, o12, 0));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f44146r = 0;
        this.f44147s = hVar;
        this.f44148t = iArr;
    }
}
