package u5;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import k7.f8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.web.e0;
public final class n extends q {
    public static final String v;
    public long f48398e;
    public q5.q f48399f;
    public Long f48400g;
    public e0 h;
    public int f48401i;
    public final p f48402j;
    public final p f48403k;
    public final p f48404l;
    public final p f48405m;
    public final p f48406n;
    public final p f48407o;
    public final p f48408p;
    public final p f48409q;
    public final p f48410r;
    public final p f48411s;
    public final p f48412t;
    public final p f48413u;

    static {
        Pattern pattern = a.f48383a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public n() {
        super(v);
        this.f48401i = -1;
        p pVar = new p(86400000L, "load");
        this.f48402j = pVar;
        p pVar2 = new p(86400000L, "pause");
        this.f48403k = pVar2;
        p pVar3 = new p(86400000L, "play");
        this.f48404l = pVar3;
        p pVar4 = new p(86400000L, "stop");
        p pVar5 = new p(10000L, "seek");
        this.f48405m = pVar5;
        p pVar6 = new p(86400000L, "volume");
        this.f48406n = pVar6;
        p pVar7 = new p(86400000L, "mute");
        this.f48407o = pVar7;
        p pVar8 = new p(86400000L, "status");
        this.f48408p = pVar8;
        p pVar9 = new p(86400000L, "activeTracks");
        p pVar10 = new p(86400000L, "trackStyle");
        p pVar11 = new p(86400000L, "queueInsert");
        p pVar12 = new p(86400000L, "queueUpdate");
        this.f48409q = pVar12;
        p pVar13 = new p(86400000L, "queueRemove");
        p pVar14 = new p(86400000L, "queueReorder");
        p pVar15 = new p(86400000L, "queueFetchItemIds");
        this.f48410r = pVar15;
        p pVar16 = new p(86400000L, "queueFetchItemRange");
        this.f48412t = pVar16;
        this.f48411s = new p(86400000L, "queueFetchItems");
        p pVar17 = new p(86400000L, "setPlaybackRate");
        this.f48413u = pVar17;
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
        MediaError.e(jSONObject);
        ?? obj = new Object();
        Pattern pattern = a.f48383a;
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
            String b11 = f8.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i11 = this.f48401i;
            if (i11 != -1) {
                jSONObject.put("sequenceNumber", i11);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f48409q.a(b10, new k(this, oVar, 1));
    }

    public final long e(double d, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f48398e;
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
        this.f48398e = 0L;
        this.f48399f = null;
        for (p pVar : this.d) {
            pVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f48401i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f48421a;
        Log.w(bVar.f48385a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        e0 e0Var = this.h;
        if (e0Var != null) {
            s5.h hVar = (s5.h) e0Var.f42491b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f47082i.iterator();
                while (it2.hasNext()) {
                    ((s5.g) it2.next()).c();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        e0 e0Var = this.h;
        if (e0Var != null) {
            s5.h hVar = (s5.h) e0Var.f42491b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f47082i.iterator();
                while (it2.hasNext()) {
                    ((s5.g) it2.next()).d();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void k() {
        e0 e0Var = this.h;
        if (e0Var != null) {
            s5.h hVar = (s5.h) e0Var.f42491b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f47082i.iterator();
                while (it2.hasNext()) {
                    ((s5.g) it2.next()).e();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void l() {
        e0 e0Var = this.h;
        if (e0Var != null) {
            s5.h hVar = (s5.h) e0Var.f42491b;
            Iterator it = hVar.f47083j.values().iterator();
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
                Iterator it3 = hVar.f47082i.iterator();
                while (it3.hasNext()) {
                    ((s5.g) it3.next()).g();
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
        q5.j jVar;
        q5.q qVar = this.f48399f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f44634a;
        }
        long j11 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l10 = this.f48400g;
            if (l10 != null) {
                if (l10.equals(4294967296000L)) {
                    q5.q qVar2 = this.f48399f;
                    if (qVar2.H != null) {
                        long longValue = l10.longValue();
                        q5.q qVar3 = this.f48399f;
                        if (qVar3 != null && (jVar = qVar3.H) != null) {
                            long j12 = jVar.f44597b;
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
                        mediaInfo2 = qVar2.f44634a;
                    }
                    if (mediaInfo2 != null) {
                        j10 = mediaInfo2.f2614e;
                    } else {
                        j10 = 0;
                    }
                    if (j10 >= 0) {
                        long longValue2 = l10.longValue();
                        q5.q qVar4 = this.f48399f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f44634a;
                        }
                        if (mediaInfo3 != null) {
                            j11 = mediaInfo3.f2614e;
                        }
                        return Math.min(longValue2, j11);
                    }
                }
                return l10.longValue();
            } else if (this.f48398e != 0) {
                double d = qVar.d;
                long j13 = qVar.h;
                int i10 = qVar.f44637e;
                if (d != 0.0d && i10 == 2) {
                    return e(d, j13, mediaInfo.f2614e);
                }
                return j13;
            }
        }
        return 0L;
    }

    public final long p() {
        q5.q qVar = this.f48399f;
        if (qVar != null) {
            return qVar.f44635b;
        }
        throw new Exception();
    }
}
