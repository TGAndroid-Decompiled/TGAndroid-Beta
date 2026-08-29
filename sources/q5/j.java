package q5;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class j extends n {
    public final int f46401r;
    public final h f46402s;
    public final Object f46403t;

    public j(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f46401r = i10;
        this.f46402s = hVar;
        this.f46403t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f46401r;
        Object obj = this.f46403t;
        h hVar = this.f46402s;
        switch (i10) {
            case 0:
                s5.n nVar = hVar.f46393c;
                s5.o o10 = o();
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
                nVar.f47606s.a(b10, o10);
                return;
            case 1:
                s5.n nVar2 = hVar.f46393c;
                s5.o o11 = o();
                o5.k kVar = (o5.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.f19278a;
                o5.n nVar3 = kVar.f19279b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f19282f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f19278a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar3 != null) {
                        jSONObject2.put("queueData", nVar3.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f19280c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = s5.a.f47578a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f19281e);
                    jSONObject2.putOpt("credentials", kVar.f19284r);
                    jSONObject2.putOpt("credentialsType", kVar.f19285s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f19286w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f19283n);
                    jSONObject2.put("requestId", kVar.f19287x);
                } catch (JSONException e10) {
                    s5.b bVar = o5.k.f19277y;
                    Log.e(bVar.f47580a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e10));
                    jSONObject2 = new JSONObject();
                }
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.f47597j.a(b11, o11);
                return;
            default:
                s5.n nVar4 = hVar.f46393c;
                s5.o o12 = o();
                nVar4.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar4.b();
                long j11 = ((o5.p) obj).f19311a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = s5.a.f47578a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                } catch (JSONException unused3) {
                }
                nVar4.c(b12, jSONObject3.toString());
                nVar4.f47595g = Long.valueOf(j11);
                nVar4.f47600m.a(b12, new s5.k(nVar4, o12, 0));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f46401r = 0;
        this.f46402s = hVar;
        this.f46403t = iArr;
    }
}
