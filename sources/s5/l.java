package s5;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends o {
    public final int f47058r;
    public final double f47059s;
    public final h f47060t;

    public l(h hVar, double d, int i10) {
        super(hVar, false);
        this.f47058r = i10;
        this.f47060t = hVar;
        this.f47059s = d;
    }

    @Override
    public final void n() {
        switch (this.f47058r) {
            case 0:
                u5.n nVar = this.f47060t.f47047c;
                u5.o o10 = o();
                nVar.getClass();
                double d = this.f47059s;
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    JSONObject jSONObject = new JSONObject();
                    long b10 = nVar.b();
                    try {
                        jSONObject.put("requestId", b10);
                        jSONObject.put("type", "SET_VOLUME");
                        jSONObject.put("mediaSessionId", nVar.p());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("level", d);
                        jSONObject.put("volume", jSONObject2);
                    } catch (JSONException unused) {
                    }
                    nVar.c(b10, jSONObject.toString());
                    nVar.f48370n.a(b10, o10);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                u5.n nVar2 = this.f47060t.f47047c;
                u5.o o11 = o();
                double d10 = this.f47059s;
                if (nVar2.f48363f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = nVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        b6.m.i(nVar2.f48363f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", nVar2.f48363f.f44604b);
                    } catch (JSONException unused2) {
                    }
                    nVar2.c(b11, jSONObject3.toString());
                    nVar2.f48377u.a(b11, o11);
                    return;
                }
                throw new Exception();
        }
    }
}
