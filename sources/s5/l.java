package s5;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends o {
    public final int f47089r;
    public final double f47090s;
    public final h f47091t;

    public l(h hVar, double d, int i10) {
        super(hVar, false);
        this.f47089r = i10;
        this.f47091t = hVar;
        this.f47090s = d;
    }

    @Override
    public final void n() {
        switch (this.f47089r) {
            case 0:
                u5.n nVar = this.f47091t.f47078c;
                u5.o o10 = o();
                nVar.getClass();
                double d = this.f47090s;
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
                    nVar.f48406n.a(b10, o10);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                u5.n nVar2 = this.f47091t.f47078c;
                u5.o o11 = o();
                double d10 = this.f47090s;
                if (nVar2.f48399f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = nVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        b6.m.i(nVar2.f48399f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", nVar2.f48399f.f44635b);
                    } catch (JSONException unused2) {
                    }
                    nVar2.c(b11, jSONObject3.toString());
                    nVar2.f48413u.a(b11, o11);
                    return;
                }
                throw new Exception();
        }
    }
}
