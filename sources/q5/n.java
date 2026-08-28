package q5;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import g7.e7;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends q {
    public static final String v;
    public long f46022e;
    public m5.q f46023f;
    public Long f46024g;
    public n2.p h;
    public int f46025i;
    public final p f46026j;
    public final p f46027k;
    public final p f46028l;
    public final p f46029m;
    public final p f46030n;
    public final p f46031o;
    public final p f46032p;
    public final p f46033q;
    public final p f46034r;
    public final p f46035s;
    public final p f46036t;
    public final p f46037u;

    static {
        Pattern pattern = a.f46007a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public n() {
        super(v);
        this.f46025i = -1;
        p pVar = new p(86400000L, "load");
        this.f46026j = pVar;
        p pVar2 = new p(86400000L, "pause");
        this.f46027k = pVar2;
        p pVar3 = new p(86400000L, "play");
        this.f46028l = pVar3;
        p pVar4 = new p(86400000L, "stop");
        p pVar5 = new p(10000L, "seek");
        this.f46029m = pVar5;
        p pVar6 = new p(86400000L, "volume");
        this.f46030n = pVar6;
        p pVar7 = new p(86400000L, "mute");
        this.f46031o = pVar7;
        p pVar8 = new p(86400000L, "status");
        this.f46032p = pVar8;
        p pVar9 = new p(86400000L, "activeTracks");
        p pVar10 = new p(86400000L, "trackStyle");
        p pVar11 = new p(86400000L, "queueInsert");
        p pVar12 = new p(86400000L, "queueUpdate");
        this.f46033q = pVar12;
        p pVar13 = new p(86400000L, "queueRemove");
        p pVar14 = new p(86400000L, "queueReorder");
        p pVar15 = new p(86400000L, "queueFetchItemIds");
        this.f46034r = pVar15;
        p pVar16 = new p(86400000L, "queueFetchItemRange");
        this.f46036t = pVar16;
        this.f46035s = new p(86400000L, "queueFetchItems");
        p pVar17 = new p(86400000L, "setPlaybackRate");
        this.f46037u = pVar17;
        p pVar18 = new p(86400000L, "skipAd");
        a(pVar);
        a(pVar2);
        a(pVar3);
        a(pVar4);
        a(pVar5);
        a(pVar6);
        a(pVar7);
        a(pVar8);
        a(pVar9);
        a(pVar10);
        a(pVar11);
        a(pVar12);
        a(pVar13);
        a(pVar14);
        a(pVar15);
        a(pVar16);
        a(pVar16);
        a(pVar17);
        a(pVar18);
        g();
    }

    public static m f(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        ?? obj = new Object();
        Pattern pattern = a.f46007a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return obj;
    }

    public static int[] m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            iArr[i9] = jSONArray.getInt(i9);
        }
        return iArr;
    }

    public final void d(o oVar, int i9, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i9 != 0) {
                jSONObject.put("jump", i9);
            }
            String b11 = e7.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i10 = this.f46025i;
            if (i10 != -1) {
                jSONObject.put("sequenceNumber", i10);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f46033q.a(b10, new k(this, oVar, 1));
    }

    public final long e(double d, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f46022e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j10;
        }
        long j12 = j10 + ((long) (elapsedRealtime * d));
        if (j11 > 0 && j12 > j11) {
            return j11;
        }
        if (j12 < 0) {
            return 0L;
        }
        return j12;
    }

    public final void g() {
        this.f46022e = 0L;
        this.f46023f = null;
        for (p pVar : this.d) {
            pVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f46025i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f46045a;
        Log.w(bVar.f46009a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        n2.p pVar = this.h;
        if (pVar != null) {
            o5.h hVar = (o5.h) pVar.f18343b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f18990i.iterator();
                while (it2.hasNext()) {
                    ((o5.g) it2.next()).c();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        n2.p pVar = this.h;
        if (pVar != null) {
            o5.h hVar = (o5.h) pVar.f18343b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f18990i.iterator();
                while (it2.hasNext()) {
                    ((o5.g) it2.next()).d();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void k() {
        n2.p pVar = this.h;
        if (pVar != null) {
            o5.h hVar = (o5.h) pVar.f18343b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f18990i.iterator();
                while (it2.hasNext()) {
                    ((o5.g) it2.next()).e();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void l() {
        n2.p pVar = this.h;
        if (pVar != null) {
            o5.h hVar = (o5.h) pVar.f18343b;
            Iterator it = hVar.f18991j.values().iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    if (!hVar.h()) {
                        if (!hVar.h()) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw new ClassCastException();
            }
            Iterator it2 = hVar.h.iterator();
            if (!it2.hasNext()) {
                Iterator it3 = hVar.f18990i.iterator();
                while (it3.hasNext()) {
                    ((o5.g) it3.next()).g();
                }
                return;
            }
            it2.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void n() {
        synchronized (this.d) {
            try {
                for (p pVar : this.d) {
                    pVar.f(2002);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
    }

    public final long o() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j10;
        m5.j jVar;
        m5.q qVar = this.f46023f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f17453a;
        }
        long j11 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l10 = this.f46024g;
            if (l10 != null) {
                if (l10.equals(4294967296000L)) {
                    m5.q qVar2 = this.f46023f;
                    if (qVar2.G != null) {
                        long longValue = l10.longValue();
                        m5.q qVar3 = this.f46023f;
                        if (qVar3 != null && (jVar = qVar3.G) != null) {
                            long j12 = jVar.f17416b;
                            if (!jVar.d) {
                                j11 = e(1.0d, j12, -1L);
                            } else {
                                j11 = j12;
                            }
                        }
                        return Math.min(longValue, j11);
                    }
                    if (qVar2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = qVar2.f17453a;
                    }
                    if (mediaInfo2 != null) {
                        j10 = mediaInfo2.f2709e;
                    } else {
                        j10 = 0;
                    }
                    if (j10 >= 0) {
                        long longValue2 = l10.longValue();
                        m5.q qVar4 = this.f46023f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f17453a;
                        }
                        if (mediaInfo3 != null) {
                            j11 = mediaInfo3.f2709e;
                        }
                        return Math.min(longValue2, j11);
                    }
                }
                return l10.longValue();
            } else if (this.f46022e != 0) {
                double d = qVar.d;
                long j13 = qVar.h;
                int i9 = qVar.f17456e;
                if (d != 0.0d && i9 == 2) {
                    return e(d, j13, mediaInfo.f2709e);
                }
                return j13;
            }
        }
        return 0L;
    }

    public final long p() {
        m5.q qVar = this.f46023f;
        if (qVar != null) {
            return qVar.f17454b;
        }
        throw new Exception();
    }
}
