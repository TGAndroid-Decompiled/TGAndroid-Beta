package s5;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends o {
    public final int f44149r;
    public final double f44150s;
    public final h f44151t;

    public l(h hVar, double d, int i10) {
        super(hVar, false);
        this.f44149r = i10;
        this.f44151t = hVar;
        this.f44150s = d;
    }

    @Override
    public final void n() {
        switch (this.f44149r) {
            case 0:
                u5.n nVar = this.f44151t.f44139c;
                u5.o o10 = o();
                nVar.getClass();
                double d = this.f44150s;
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
                    nVar.f45179n.a(b10, o10);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                u5.n nVar2 = this.f44151t.f44139c;
                u5.o o11 = o();
                double d10 = this.f44150s;
                if (nVar2.f45172f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = nVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        b6.m.i(nVar2.f45172f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", nVar2.f45172f.f42877b);
                    } catch (JSONException unused2) {
                    }
                    nVar2.c(b11, jSONObject3.toString());
                    nVar2.f45186u.a(b11, o11);
                    return;
                }
                throw new Exception();
        }
    }
}
