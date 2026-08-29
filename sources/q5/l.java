package q5;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends n {
    public final int f46404r;
    public final double f46405s;
    public final h f46406t;

    public l(h hVar, double d, int i10) {
        super(hVar, false);
        this.f46404r = i10;
        this.f46406t = hVar;
        this.f46405s = d;
    }

    @Override
    public final void n() {
        switch (this.f46404r) {
            case 0:
                s5.n nVar = this.f46406t.f46393c;
                s5.o o10 = o();
                nVar.getClass();
                double d = this.f46405s;
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
                    nVar.f47601n.a(b10, o10);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                s5.n nVar2 = this.f46406t.f46393c;
                s5.o o11 = o();
                double d10 = this.f46405s;
                if (nVar2.f47594f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = nVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        z5.l.i(nVar2.f47594f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", nVar2.f47594f.f19313b);
                    } catch (JSONException unused2) {
                    }
                    nVar2.c(b11, jSONObject3.toString());
                    nVar2.f47608u.a(b11, o11);
                    return;
                }
                throw new Exception();
        }
    }
}
