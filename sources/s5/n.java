package s5;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import i7.t7;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends q {
    public static final String v;
    public long f47593e;
    public o5.q f47594f;
    public Long f47595g;
    public o4.g h;
    public int f47596i;
    public final p f47597j;
    public final p f47598k;
    public final p f47599l;
    public final p f47600m;
    public final p f47601n;
    public final p f47602o;
    public final p f47603p;
    public final p f47604q;
    public final p f47605r;
    public final p f47606s;
    public final p f47607t;
    public final p f47608u;

    static {
        Pattern pattern = a.f47578a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public n() {
        super(v);
        this.f47596i = -1;
        p pVar = new p(86400000L, "load");
        this.f47597j = pVar;
        p pVar2 = new p(86400000L, "pause");
        this.f47598k = pVar2;
        p pVar3 = new p(86400000L, "play");
        this.f47599l = pVar3;
        p pVar4 = new p(86400000L, "stop");
        p pVar5 = new p(10000L, "seek");
        this.f47600m = pVar5;
        p pVar6 = new p(86400000L, "volume");
        this.f47601n = pVar6;
        p pVar7 = new p(86400000L, "mute");
        this.f47602o = pVar7;
        p pVar8 = new p(86400000L, "status");
        this.f47603p = pVar8;
        p pVar9 = new p(86400000L, "activeTracks");
        p pVar10 = new p(86400000L, "trackStyle");
        p pVar11 = new p(86400000L, "queueInsert");
        p pVar12 = new p(86400000L, "queueUpdate");
        this.f47604q = pVar12;
        p pVar13 = new p(86400000L, "queueRemove");
        p pVar14 = new p(86400000L, "queueReorder");
        p pVar15 = new p(86400000L, "queueFetchItemIds");
        this.f47605r = pVar15;
        p pVar16 = new p(86400000L, "queueFetchItemRange");
        this.f47607t = pVar16;
        this.f47606s = new p(86400000L, "queueFetchItems");
        p pVar17 = new p(86400000L, "setPlaybackRate");
        this.f47608u = pVar17;
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
        Pattern pattern = a.f47578a;
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
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    public final void d(o oVar, int i10, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i10 != 0) {
                jSONObject.put("jump", i10);
            }
            String b11 = t7.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i11 = this.f47596i;
            if (i11 != -1) {
                jSONObject.put("sequenceNumber", i11);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f47604q.a(b10, new k(this, oVar, 1));
    }

    public final long e(double d, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f47593e;
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
        this.f47593e = 0L;
        this.f47594f = null;
        for (p pVar : this.d) {
            pVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f47596i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f47616a;
        Log.w(bVar.f47580a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        o4.g gVar = this.h;
        if (gVar != null) {
            q5.h hVar = (q5.h) gVar.f19159b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f46397i.iterator();
                while (it2.hasNext()) {
                    ((q5.g) it2.next()).c();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        o4.g gVar = this.h;
        if (gVar != null) {
            q5.h hVar = (q5.h) gVar.f19159b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f46397i.iterator();
                while (it2.hasNext()) {
                    ((q5.g) it2.next()).d();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void k() {
        o4.g gVar = this.h;
        if (gVar != null) {
            q5.h hVar = (q5.h) gVar.f19159b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f46397i.iterator();
                while (it2.hasNext()) {
                    ((q5.g) it2.next()).e();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void l() {
        o4.g gVar = this.h;
        if (gVar != null) {
            q5.h hVar = (q5.h) gVar.f19159b;
            Iterator it = hVar.f46398j.values().iterator();
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
                Iterator it3 = hVar.f46397i.iterator();
                while (it3.hasNext()) {
                    ((q5.g) it3.next()).g();
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
    }

    public final long o() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j10;
        o5.j jVar;
        o5.q qVar = this.f47594f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f19312a;
        }
        long j11 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l10 = this.f47595g;
            if (l10 != null) {
                if (l10.equals(4294967296000L)) {
                    o5.q qVar2 = this.f47594f;
                    if (qVar2.G != null) {
                        long longValue = l10.longValue();
                        o5.q qVar3 = this.f47594f;
                        if (qVar3 != null && (jVar = qVar3.G) != null) {
                            long j12 = jVar.f19275b;
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
                        mediaInfo2 = qVar2.f19312a;
                    }
                    if (mediaInfo2 != null) {
                        j10 = mediaInfo2.f3723e;
                    } else {
                        j10 = 0;
                    }
                    if (j10 >= 0) {
                        long longValue2 = l10.longValue();
                        o5.q qVar4 = this.f47594f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f19312a;
                        }
                        if (mediaInfo3 != null) {
                            j11 = mediaInfo3.f3723e;
                        }
                        return Math.min(longValue2, j11);
                    }
                }
                return l10.longValue();
            } else if (this.f47593e != 0) {
                double d = qVar.d;
                long j13 = qVar.h;
                int i10 = qVar.f19315e;
                if (d != 0.0d && i10 == 2) {
                    return e(d, j13, mediaInfo.f3723e);
                }
                return j13;
            }
        }
        return 0L;
    }

    public final long p() {
        o5.q qVar = this.f47594f;
        if (qVar != null) {
            return qVar.f19313b;
        }
        throw new Exception();
    }
}
