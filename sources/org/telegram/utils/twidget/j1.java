package org.telegram.utils.twidget;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.ui.dd0;
public final class j1 implements Runnable {
    public final int f54798a;
    public final p1 f54799b;

    public j1(p1 p1Var, int i7) {
        this.f54798a = i7;
        this.f54799b = p1Var;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.j1.a():void");
    }

    @Override
    public final void run() {
        HashMap hashMap;
        k0 h;
        String str;
        switch (this.f54798a) {
            case 0:
                a();
                return;
            case 1:
                this.f54799b.e();
                return;
            case 2:
                p1 p1Var = this.f54799b;
                p1Var.f54900r.set(true);
                p1Var.e();
                return;
            case 3:
                p1 p1Var2 = this.f54799b;
                p1Var2.f54882a0 = false;
                long j3 = p1Var2.v;
                if (!p1Var2.A && j3 != 0 && p1Var2.f54897o.get()) {
                    if (p1Var2.L && SystemClock.uptimeMillis() - p1Var2.Z > 15000) {
                        p1Var2.f54885c.g(j3);
                        return;
                    }
                    p1Var2.f54882a0 = true;
                    p1Var2.f54881a.postDelayed(p1Var2.f54884b0, 5000L);
                    return;
                }
                return;
            case 4:
                p1 p1Var3 = this.f54799b;
                long j10 = p1Var3.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f24119r));
                if (!p1Var3.A && j10 != 0 && p1Var3.L && p1Var3.f54898p.get() && nanoTime - p1Var3.f54886c0 >= (max * 9) / 10 && p1Var3.f54897o.compareAndSet(false, true)) {
                    p1Var3.f54898p.set(false);
                    p1Var3.f54886c0 = nanoTime;
                    p1Var3.Z = SystemClock.uptimeMillis();
                    if (!p1Var3.f54882a0) {
                        p1Var3.f54882a0 = true;
                        p1Var3.f54881a.postDelayed(p1Var3.f54884b0, 5000L);
                    }
                    p1Var3.f54885c.l(j10, ((float) (nanoTime - p1Var3.f54895m)) / 1000000.0f, true, false, false);
                    return;
                }
                p1Var3.e();
                return;
            case 5:
                p1 p1Var4 = this.f54799b;
                p1Var4.f54906y.set(false);
                float f10 = p1Var4.f54905x;
                if (!p1Var4.A) {
                    p1Var4.f54881a.removeCallbacks(p1Var4.X);
                    int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i7 > 0) {
                        p1Var4.f54881a.postDelayed(p1Var4.X, (long) Math.ceil(Math.min(f10, 3600000.0f)));
                        return;
                    } else if (i7 == 0) {
                        p1Var4.e();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                p1 p1Var5 = this.f54799b;
                synchronized (p1Var5.f54904w) {
                    hashMap = new HashMap(p1Var5.f54904w);
                    p1Var5.f54904w.clear();
                }
                if (p1Var5.T != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        d1 d1Var = p1Var5.T;
                        String str2 = (String) entry.getKey();
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        if (d1Var.f54694e != null && (h = n0.h(d1Var)) != null) {
                            String a10 = h.a();
                            JSONObject jSONObject2 = (JSONObject) n0.f54848c.get(a10);
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            try {
                                jSONObject2.put(str2, jSONObject);
                            } catch (Exception unused) {
                            }
                            n0.f54848c.put(a10, jSONObject2);
                            for (k0 k0Var : n0.f54846a.values()) {
                                if (k0Var.f54817t != null && a10.equals(k0Var.a())) {
                                    d1 d1Var2 = k0Var.f54817t;
                                    try {
                                        str = gd.E0().f24241y.toLanguageTag();
                                    } catch (Exception unused2) {
                                        str = null;
                                    }
                                    String jSONObject3 = jSONObject2.toString();
                                    d1Var2.f54708t = str;
                                    d1Var2.f54709u = jSONObject3;
                                }
                            }
                            if ("local".equals(str2)) {
                                n0.d.put(a10, h);
                                dd0 dd0Var = n0.f54849e;
                                org.telegram.messenger.g0.r(dd0Var);
                                org.telegram.messenger.g0.h3(dd0Var, 1000L);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
