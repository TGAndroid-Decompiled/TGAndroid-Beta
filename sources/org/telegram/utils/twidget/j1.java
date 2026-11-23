package org.telegram.utils.twidget;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.ui.cd0;
public final class j1 implements Runnable {
    public final int f54924a;
    public final p1 f54925b;

    public j1(p1 p1Var, int i7) {
        this.f54924a = i7;
        this.f54925b = p1Var;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.j1.a():void");
    }

    @Override
    public final void run() {
        HashMap hashMap;
        k0 h;
        String str;
        switch (this.f54924a) {
            case 0:
                a();
                return;
            case 1:
                this.f54925b.e();
                return;
            case 2:
                p1 p1Var = this.f54925b;
                p1Var.f55026r.set(true);
                p1Var.e();
                return;
            case 3:
                p1 p1Var2 = this.f54925b;
                p1Var2.f55008a0 = false;
                long j3 = p1Var2.v;
                if (!p1Var2.A && j3 != 0 && p1Var2.f55023o.get()) {
                    if (p1Var2.L && SystemClock.uptimeMillis() - p1Var2.Z > 15000) {
                        p1Var2.f55011c.g(j3);
                        return;
                    }
                    p1Var2.f55008a0 = true;
                    p1Var2.f55007a.postDelayed(p1Var2.f55010b0, 5000L);
                    return;
                }
                return;
            case 4:
                p1 p1Var3 = this.f54925b;
                long j10 = p1Var3.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f24227r));
                if (!p1Var3.A && j10 != 0 && p1Var3.L && p1Var3.f55024p.get() && nanoTime - p1Var3.f55012c0 >= (max * 9) / 10 && p1Var3.f55023o.compareAndSet(false, true)) {
                    p1Var3.f55024p.set(false);
                    p1Var3.f55012c0 = nanoTime;
                    p1Var3.Z = SystemClock.uptimeMillis();
                    if (!p1Var3.f55008a0) {
                        p1Var3.f55008a0 = true;
                        p1Var3.f55007a.postDelayed(p1Var3.f55010b0, 5000L);
                    }
                    p1Var3.f55011c.l(j10, ((float) (nanoTime - p1Var3.f55021m)) / 1000000.0f, true, false, false);
                    return;
                }
                p1Var3.e();
                return;
            case 5:
                p1 p1Var4 = this.f54925b;
                p1Var4.f55032y.set(false);
                float f10 = p1Var4.f55031x;
                if (!p1Var4.A) {
                    p1Var4.f55007a.removeCallbacks(p1Var4.X);
                    int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i7 > 0) {
                        p1Var4.f55007a.postDelayed(p1Var4.X, (long) Math.ceil(Math.min(f10, 3600000.0f)));
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
                p1 p1Var5 = this.f54925b;
                synchronized (p1Var5.f55030w) {
                    hashMap = new HashMap(p1Var5.f55030w);
                    p1Var5.f55030w.clear();
                }
                if (p1Var5.T != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        d1 d1Var = p1Var5.T;
                        String str2 = (String) entry.getKey();
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        if (d1Var.f54820e != null && (h = n0.h(d1Var)) != null) {
                            String a10 = h.a();
                            JSONObject jSONObject2 = (JSONObject) n0.f54974c.get(a10);
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            try {
                                jSONObject2.put(str2, jSONObject);
                            } catch (Exception unused) {
                            }
                            n0.f54974c.put(a10, jSONObject2);
                            for (k0 k0Var : n0.f54972a.values()) {
                                if (k0Var.f54943t != null && a10.equals(k0Var.a())) {
                                    d1 d1Var2 = k0Var.f54943t;
                                    try {
                                        str = gd.E0().f24342y.toLanguageTag();
                                    } catch (Exception unused2) {
                                        str = null;
                                    }
                                    String jSONObject3 = jSONObject2.toString();
                                    d1Var2.f54834t = str;
                                    d1Var2.f54835u = jSONObject3;
                                }
                            }
                            if ("local".equals(str2)) {
                                n0.d.put(a10, h);
                                cd0 cd0Var = n0.f54975e;
                                org.telegram.messenger.g0.r(cd0Var);
                                org.telegram.messenger.g0.h3(cd0Var, 1000L);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
