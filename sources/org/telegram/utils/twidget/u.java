package org.telegram.utils.twidget;

import ai.d3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import gi.d1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.sq;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.q2;
import org.telegram.ui.Wallet.t2;
import org.telegram.ui.hb1;
import org.telegram.ui.na1;
public final class u {
    public boolean A;
    public final String f52956a;
    public final String f52957b;
    public final Context f52958c;
    public mb.b f52959e;
    public h0 f52960f;
    public f0 f52961g;
    public h71 h;
    public int f52962i;
    public int f52963j;
    public int f52964k;
    public boolean f52965l;
    public boolean f52967n;
    public boolean f52968o;
    public boolean f52969p;
    public int f52970q;
    public int f52971r;
    public String f52972s;
    public String f52973t;
    public String f52974u;
    public volatile String f52976x;
    public boolean f52977y;
    public boolean f52978z;
    public String v = "{}";
    public String f52975w = "{}";
    public boolean f52966m = false;
    public final int d = 1;

    public u(Context context, String str, String str2) {
        this.f52958c = context.getApplicationContext();
        this.f52956a = str;
        this.f52957b = str2;
    }

    public final void a(int i3, String str, long j10) {
        byte[] bytes;
        h0 h0Var = this.f52960f;
        if (h0Var != null) {
            long j11 = h0Var.f52881t;
            if (!h0Var.f52882u && j11 != 0) {
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                WidgetSandboxNative.answerRequest(j11, j10, i3, bytes);
            }
        }
    }

    public final void b() {
        int i3;
        h0 h0Var = this.f52960f;
        if (h0Var != null && !h0Var.f52882u && h0Var.f52881t != 0 && !h0Var.C) {
            f0 f0Var = h0Var.F;
            if (f0Var == null || (((i3 = h0Var.E) != 0 && Math.abs(f0Var.d - i3) > 1) || !f0Var.a())) {
                h0Var.C = true;
                WidgetSandboxNative.repaint(h0Var.f52881t);
            }
        }
    }

    public final f0 c() {
        f0 f0Var;
        h0 h0Var = this.f52960f;
        if (h0Var == null) {
            f0Var = null;
        } else {
            f0Var = h0Var.F;
        }
        if (f0Var != null && (this.f52961g == null || h0Var.v)) {
            return f0Var;
        }
        f0 f0Var2 = this.f52961g;
        if (f0Var2 != null && Math.abs(f0Var2.d - this.f52963j) <= 1) {
            return this.f52961g;
        }
        if (f0Var != null) {
            return f0Var;
        }
        return this.f52961g;
    }

    public final void d(float f10, float f11, int i3, int i10) {
        h0 h0Var = this.f52960f;
        if (h0Var != null) {
            long j10 = h0Var.f52881t;
            if (!h0Var.f52882u && j10 != 0) {
                WidgetSandboxNative.hover(j10, i3, f10, f11, i10);
            }
        }
    }

    public final boolean e() {
        h0 h0Var;
        f0 f0Var;
        if (this.f52971r != this.f52970q && (h0Var = this.f52960f) != null && (f0Var = h0Var.F) != null) {
            if (f0Var.f52853g || h0Var.f52884x) {
                this.f52971r = this.f52970q;
                if (this.f52959e != null) {
                    p.b();
                    m h = p.h(this);
                    if (h != null) {
                        p.a(h);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(JSONObject jSONObject) {
        d2 T;
        int i3;
        gk0 gk0Var;
        if (this.f52959e != null) {
            m h = p.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.f52930x > 0 && (gk0Var = h.f52929w) != null) {
                        view = gk0Var.W;
                    }
                    if (view != null) {
                        String optString2 = jSONObject.optString("haptic");
                        if ("selection".equals(optString2)) {
                            i3 = 4;
                        } else if ("notification".equals(optString2)) {
                            i3 = 16;
                        } else {
                            i3 = 3;
                        }
                        view.performHapticFeedback(i3);
                        return;
                    }
                    return;
                }
                return;
            }
            String optString3 = jSONObject.optString("url");
            boolean equals = "openTelegramLink".equals(optString);
            if (!TextUtils.isEmpty(optString3) && !p.f52947i && (T = LaunchActivity.T()) != null && T.getParentActivity() != null) {
                Activity parentActivity = T.getParentActivity();
                if (equals) {
                    sf.c.t(parentActivity, optString3);
                    return;
                }
                p.f52947i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, T.getResourceProvider());
                String M0 = bd.M0(2131742882, null);
                s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.a0(null, null, 2131742883, optString3);
                alertDialog$Builder.k(bd.M0(2131747825, null), new na1(10, parentActivity, optString3));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                s1Var.setOnDismissListener(new d1(7));
                if (T.showDialog(s1Var) == null) {
                    p.f52947i = false;
                }
            }
        }
    }

    public final void g(h0 h0Var) {
        f0 f0Var;
        Object[] objArr;
        m h;
        h71 h71Var;
        if (h0Var == this.f52960f && (f0Var = h0Var.F) != null) {
            if (this.f52961g == null || h0Var.v) {
                this.f52961g = null;
                this.f52964k = f0Var.d;
                boolean z10 = f0Var.h;
                boolean z11 = false;
                if (z10 != this.f52965l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f52965l = z10;
                int max = Math.max(1, f0Var.f52851e);
                if (max != this.f52962i) {
                    z11 = true;
                }
                this.f52962i = max;
                h71 h71Var2 = this.h;
                if (h71Var2 != null) {
                    g71 g71Var = h71Var2.f34318a;
                    if (z11) {
                        g71Var.j();
                    }
                    g71Var.h();
                }
                if ((z11 || objArr != null) && this.f52959e != null && (h = p.h(this)) != null && this.f52962i > 0) {
                    int f10 = p.f(this.f52964k);
                    int max2 = Math.max(50, Math.min(600, p.f(this.f52962i)));
                    boolean z12 = this.f52965l;
                    if (f10 > 0 && h.f52914f == 0 && !h.f52918k && p.l(h.a()).a(f10, max2, z12)) {
                        qr a02 = qr.a0(h.f52911b);
                        a02.f24934a.c(new sq(a02, h.f52912c, h.d, f10, max2, z12 ? 1 : 0, 1));
                    }
                    gk0 gk0Var = h.f52928u;
                    if (gk0Var != null) {
                        gk0Var.p0("frame off screen");
                    }
                }
                if (e() && !z11 && (h71Var = this.h) != null) {
                    g71 g71Var2 = h71Var.f34318a;
                    g71Var2.j();
                    g71Var2.h();
                }
            }
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        m h;
        String str2;
        if (this.f52959e != null && (h = p.h(this)) != null) {
            String a10 = h.a();
            JSONObject jSONObject2 = (JSONObject) p.f52943c.get(a10);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            p.f52943c.put(a10, jSONObject2);
            for (m mVar : p.f52941a.values()) {
                if (mVar.f52927t != null && a10.equals(mVar.a())) {
                    u uVar = mVar.f52927t;
                    try {
                        str2 = bd.E0().f21812y.toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    uVar.f52973t = str2;
                    uVar.f52974u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                p.d.put(a10, h);
                hb1 hb1Var = p.f52944e;
                org.telegram.messenger.g0.r(hb1Var);
                org.telegram.messenger.g0.i3(hb1Var, 1000L);
            }
        }
    }

    public final void i(long j10, JSONObject jSONObject) {
        TLRPC.User user;
        if (this.f52959e != null) {
            m h = p.h(this);
            if (h != null) {
                long j11 = h.f52921n;
                if (j11 != 0) {
                    user = hp.s1(h.f52911b).a2(Long.valueOf(j11));
                    d2 T = LaunchActivity.T();
                    if (h == null && p.D(h) && user != null && user.bot) {
                        if (T != null && T.getContext() != null) {
                            byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                            Context context = T.getContext();
                            int i3 = h.f52911b;
                            e6 resourceProvider = T.getResourceProvider();
                            k kVar = new k(h, this, j10, bytes);
                            ArrayList arrayList = t2.f43197a;
                            q2 q2Var = new q2(new boolean[]{false}, kVar);
                            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i3);
                            boolean[] zArr = {false};
                            d3 d3Var = new d3(zArr, context, i3, user, jSONObject, resourceProvider, q2Var);
                            if (x10.G()) {
                                d3Var.run();
                                return;
                            }
                            t2.f43197a.add(d3Var);
                            x10.m0(d3Var);
                            org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.g(d3Var, zArr, q2Var, 8), 10000L);
                            return;
                        }
                        a(3, null, j10);
                        return;
                    }
                    a(5, null, j10);
                    return;
                }
            }
            user = null;
            d2 T2 = LaunchActivity.T();
            if (h == null) {
            }
            a(5, null, j10);
            return;
        }
        a(3, null, j10);
    }

    public final void j(String str) {
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            h0 h0Var = this.f52960f;
            if (h0Var != null) {
                long j10 = h0Var.f52881t;
                if (!h0Var.f52882u && j10 != 0) {
                    WidgetSandboxNative.data(j10, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final synchronized void k(float f10, float f11, boolean z10) {
        boolean z11;
        if (f10 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (this.f52977y && z11 == this.f52978z) {
                return;
            }
        }
        this.f52977y = z10;
        this.f52978z = z11;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f52976x)) {
            return;
        }
        this.f52976x = format;
        org.telegram.messenger.g0.h3(new l(this, 2));
    }

    public final void l(String str) {
        if (str != null && !str.equals(this.f52972s)) {
            this.f52972s = str;
            this.f52966m = str.contains("\"dark\"");
            h0 h0Var = this.f52960f;
            if (h0Var != null && !h0Var.f52882u && !str.equals(h0Var.f52886z)) {
                h0Var.f52886z = str;
                str.contains("\"dark\"");
                long j10 = h0Var.f52881t;
                if (j10 != 0) {
                    WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void m(boolean z10) {
        boolean z11;
        this.f52967n = z10;
        h0 h0Var = this.f52960f;
        if (h0Var != null) {
            if (z10 && !this.f52969p) {
                z11 = true;
            } else {
                z11 = false;
            }
            h0Var.d(z11);
        }
    }

    public final void n(int i3) {
        if (i3 > 0 && i3 != this.f52963j) {
            this.f52963j = i3;
            h0 h0Var = this.f52960f;
            if (h0Var != null && i3 > 0 && i3 != h0Var.E && !h0Var.f52882u) {
                h0Var.E = i3;
                long j10 = h0Var.f52881t;
                if (j10 != 0) {
                    WidgetSandboxNative.width(j10, i3 / h0Var.f52871j);
                }
            }
        }
    }

    public final void o(int i3, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        h0 h0Var = this.f52960f;
        if (h0Var != null) {
            long j10 = h0Var.f52881t;
            if (!h0Var.f52882u && j10 != 0) {
                WidgetSandboxNative.touch(j10, i3, f10, f11, i10, z10, z11, i11, i12);
            }
        }
    }

    public final void p() {
        this.f52968o = false;
        if (this.f52960f != null) {
            f0 c2 = c();
            if (c2 != null) {
                this.f52961g = c2;
            }
            h0 h0Var = this.f52960f;
            if (!h0Var.f52882u) {
                h0Var.f52882u = true;
                h0Var.J = null;
                h0Var.f52864a.removeCallbacks(h0Var.N);
                h0Var.f52864a.removeCallbacks(h0Var.M);
                h0Var.f52864a.removeCallbacks(h0Var.O);
                if (h0Var.B) {
                    Choreographer.getInstance().removeFrameCallback(h0Var.P);
                }
                h0Var.B = false;
                synchronized (h0Var.f52878q) {
                    try {
                        f0 f0Var = h0Var.G;
                        if (f0Var != null) {
                            f0Var.f52848a.c();
                        }
                        h0Var.G = null;
                        h0Var.H = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j10 = h0Var.f52881t;
                h0Var.f52881t = 0L;
                if (j10 != 0) {
                    z.f53000a.execute(new a0(j10));
                }
            }
            this.f52960f = null;
            if (this.A) {
                this.A = false;
                if (this.f52959e != null) {
                    p.C();
                }
            }
        }
    }
}
