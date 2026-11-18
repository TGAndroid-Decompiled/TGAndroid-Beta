package org.telegram.utils.twidget;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.z71;
import org.telegram.ui.cd0;
public final class j1 implements Runnable {
    public final int f54797a;
    public final p1 f54798b;

    public j1(p1 p1Var, int i7) {
        this.f54797a = i7;
        this.f54798b = p1Var;
    }

    private final void a() {
        n1 n1Var;
        JSONObject jSONObject;
        d1 d1Var;
        a81 a81Var;
        p1 p1Var;
        k0 h;
        int i7;
        p1 p1Var2 = this.f54798b;
        synchronized (p1Var2.f54901s) {
            n1Var = p1Var2.O;
            p1Var2.O = null;
            jSONObject = p1Var2.P;
            p1Var2.P = null;
            p1Var2.Q = false;
        }
        if (p1Var2.A) {
            if (n1Var != null) {
                n1Var.f54856a.b();
                return;
            }
            return;
        }
        if (n1Var != null && (i7 = p1Var2.M) != 0 && Math.abs(n1Var.d - i7) > 1) {
            n1Var.f54856a.b();
            p1Var2.K = false;
            n1Var = null;
        }
        if (n1Var != null) {
            p1Var2.N = n1Var;
            p1Var2.K = false;
            d1 d1Var2 = p1Var2.R;
            if (d1Var2 != null) {
                d1Var2.g(p1Var2);
            }
        }
        if (jSONObject != null && (d1Var = p1Var2.R) != null) {
            if (d1Var.f54693e != null) {
                String optString = jSONObject.optString("dead");
                if (!TextUtils.isEmpty(optString) && (h = n0.h(d1Var)) != null) {
                    int i10 = h.C;
                    int i11 = d1Var.f54704q;
                    if (i10 != i11) {
                        h.C = i11;
                        h.B++;
                        h.D = true;
                        a8.b("widget " + d1Var.f54690a + " stopped (" + h.B + "): " + optString);
                        n0.a(h);
                        n0.b();
                    }
                }
            }
            if (jSONObject.optBoolean("loaded") && d1Var.f54695g != null && (p1Var = d1Var.f54694f) != null) {
                d1Var.g(p1Var);
            } else if (d1Var.e() && (a81Var = d1Var.h) != null) {
                z71 z71Var = a81Var.f33266a;
                z71Var.j();
                z71Var.h();
            }
        }
    }

    @Override
    public final void run() {
        HashMap hashMap;
        k0 h;
        String str;
        switch (this.f54797a) {
            case 0:
                a();
                return;
            case 1:
                this.f54798b.e();
                return;
            case 2:
                p1 p1Var = this.f54798b;
                p1Var.f54900r.set(true);
                p1Var.e();
                return;
            case 3:
                p1 p1Var2 = this.f54798b;
                p1Var2.f54881a0 = false;
                long j3 = p1Var2.v;
                if (!p1Var2.A && j3 != 0 && p1Var2.f54897o.get()) {
                    if (p1Var2.L && SystemClock.uptimeMillis() - p1Var2.Z > 15000) {
                        p1Var2.f54884c.g(j3);
                        return;
                    }
                    p1Var2.f54881a0 = true;
                    p1Var2.f54880a.postDelayed(p1Var2.f54883b0, 5000L);
                    return;
                }
                return;
            case 4:
                p1 p1Var3 = this.f54798b;
                long j10 = p1Var3.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f24122r));
                if (!p1Var3.A && j10 != 0 && p1Var3.L && p1Var3.f54898p.get() && nanoTime - p1Var3.f54885c0 >= (max * 9) / 10 && p1Var3.f54897o.compareAndSet(false, true)) {
                    p1Var3.f54898p.set(false);
                    p1Var3.f54885c0 = nanoTime;
                    p1Var3.Z = SystemClock.uptimeMillis();
                    if (!p1Var3.f54881a0) {
                        p1Var3.f54881a0 = true;
                        p1Var3.f54880a.postDelayed(p1Var3.f54883b0, 5000L);
                    }
                    p1Var3.f54884c.l(j10, ((float) (nanoTime - p1Var3.f54895m)) / 1000000.0f, true, false, false);
                    return;
                }
                p1Var3.e();
                return;
            case 5:
                p1 p1Var4 = this.f54798b;
                p1Var4.f54906y.set(false);
                float f10 = p1Var4.f54905x;
                if (!p1Var4.A) {
                    p1Var4.f54880a.removeCallbacks(p1Var4.X);
                    int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i7 > 0) {
                        p1Var4.f54880a.postDelayed(p1Var4.X, (long) Math.ceil(Math.min(f10, 3600000.0f)));
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
                p1 p1Var5 = this.f54798b;
                synchronized (p1Var5.f54904w) {
                    hashMap = new HashMap(p1Var5.f54904w);
                    p1Var5.f54904w.clear();
                }
                if (p1Var5.T != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        d1 d1Var = p1Var5.T;
                        String str2 = (String) entry.getKey();
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        if (d1Var.f54693e != null && (h = n0.h(d1Var)) != null) {
                            String a10 = h.a();
                            JSONObject jSONObject2 = (JSONObject) n0.f54847c.get(a10);
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            try {
                                jSONObject2.put(str2, jSONObject);
                            } catch (Exception unused) {
                            }
                            n0.f54847c.put(a10, jSONObject2);
                            for (k0 k0Var : n0.f54845a.values()) {
                                if (k0Var.f54816t != null && a10.equals(k0Var.a())) {
                                    d1 d1Var2 = k0Var.f54816t;
                                    try {
                                        str = gd.E0().f24244y.toLanguageTag();
                                    } catch (Exception unused2) {
                                        str = null;
                                    }
                                    String jSONObject3 = jSONObject2.toString();
                                    d1Var2.f54707t = str;
                                    d1Var2.f54708u = jSONObject3;
                                }
                            }
                            if ("local".equals(str2)) {
                                n0.d.put(a10, h);
                                cd0 cd0Var = n0.f54848e;
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
