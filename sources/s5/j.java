package s5;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class j extends o {
    public final int f47086r;
    public final h f47087s;
    public final Object f47088t;

    public j(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f47086r = i10;
        this.f47087s = hVar;
        this.f47088t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f47086r;
        Object obj = this.f47088t;
        h hVar = this.f47087s;
        switch (i10) {
            case 0:
                u5.n nVar = hVar.f47078c;
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
                nVar.f48411s.a(b10, o10);
                return;
            case 1:
                u5.n nVar2 = hVar.f47078c;
                u5.o o11 = o();
                q5.k kVar = (q5.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.f44600a;
                q5.n nVar3 = kVar.f44601b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f44604f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f44600a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.e());
                    }
                    if (nVar3 != null) {
                        jSONObject2.put("queueData", nVar3.e());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f44602c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = u5.a.f48383a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f44603e);
                    jSONObject2.putOpt("credentials", kVar.f44606r);
                    jSONObject2.putOpt("credentialsType", kVar.f44607s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f44608w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f44605n);
                    jSONObject2.put("requestId", kVar.f44609x);
                } catch (JSONException e6) {
                    u5.b bVar = q5.k.f44599y;
                    Log.e(bVar.f48385a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e6));
                    jSONObject2 = new JSONObject();
                }
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.f48402j.a(b11, o11);
                return;
            default:
                u5.n nVar4 = hVar.f47078c;
                u5.o o12 = o();
                nVar4.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar4.b();
                long j11 = ((q5.p) obj).f44633a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = u5.a.f48383a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                } catch (JSONException unused3) {
                }
                nVar4.c(b12, jSONObject3.toString());
                nVar4.f48400g = Long.valueOf(j11);
                nVar4.f48405m.a(b12, new u5.k(nVar4, o12, 0));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f47086r = 0;
        this.f47087s = hVar;
        this.f47088t = iArr;
    }
}
