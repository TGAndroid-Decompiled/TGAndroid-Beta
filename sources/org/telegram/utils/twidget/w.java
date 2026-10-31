package org.telegram.utils.twidget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.cd;
import org.telegram.messenger.fe;
import org.telegram.messenger.gr;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.q81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.r2;
import org.telegram.ui.Wallet.u2;
public final class w {
    public boolean A;
    public final String f44451a;
    public final String f44452b;
    public final Context f44453c;
    public t7.u e;
    public k0 f44454f;
    public i0 f44455g;
    public q81 h;
    public int f44456i;
    public int f44457j;
    public int f44458k;
    public boolean f44459l;
    public boolean f44461n;
    public boolean f44462o;
    public boolean f44463p;
    public int f44464q;
    public int f44465r;
    public String f44466s;
    public String f44467t;
    public String f44468u;
    public volatile String f44470x;
    public boolean f44471y;
    public boolean f44472z;
    public String v = "{}";
    public String f44469w = "{}";
    public boolean f44460m = false;
    public final int d = 1;

    public w(Context context, String str, String str2) {
        this.f44453c = context.getApplicationContext();
        this.f44451a = str;
        this.f44452b = str2;
    }

    public final void a(int i10, String str, long j10) {
        byte[] bytes;
        k0 k0Var = this.f44454f;
        if (k0Var != null) {
            long j11 = k0Var.f44384t;
            if (!k0Var.f44385u && j11 != 0) {
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                WidgetSandboxNative.answerRequest(j11, j10, i10, bytes);
            }
        }
    }

    public final void b() {
        int i10;
        k0 k0Var = this.f44454f;
        if (k0Var != null && !k0Var.f44385u && k0Var.f44384t != 0 && !k0Var.C) {
            i0 i0Var = k0Var.F;
            if (i0Var == null || (((i10 = k0Var.E) != 0 && Math.abs(i0Var.d - i10) > 1) || !i0Var.a())) {
                k0Var.C = true;
                WidgetSandboxNative.repaint(k0Var.f44384t);
            }
        }
    }

    public final i0 c() {
        i0 i0Var;
        k0 k0Var = this.f44454f;
        if (k0Var == null) {
            i0Var = null;
        } else {
            i0Var = k0Var.F;
        }
        if (i0Var != null && (this.f44455g == null || k0Var.v)) {
            return i0Var;
        }
        i0 i0Var2 = this.f44455g;
        if (i0Var2 != null && Math.abs(i0Var2.d - this.f44457j) <= 1) {
            return this.f44455g;
        }
        if (i0Var != null) {
            return i0Var;
        }
        return this.f44455g;
    }

    public final void d(float f7, float f10, int i10, int i11) {
        k0 k0Var = this.f44454f;
        if (k0Var != null) {
            long j10 = k0Var.f44384t;
            if (!k0Var.f44385u && j10 != 0) {
                WidgetSandboxNative.hover(j10, i10, f7, f10, i11);
            }
        }
    }

    public final boolean e() {
        k0 k0Var;
        i0 i0Var;
        if (this.f44465r != this.f44464q && (k0Var = this.f44454f) != null && (i0Var = k0Var.F) != null) {
            if (i0Var.h || k0Var.f44387x) {
                this.f44465r = this.f44464q;
                if (this.e != null) {
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
        k2 T;
        int i10;
        gl0 gl0Var;
        if (this.e != null) {
            m h = p.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.f44415y > 0 && (gl0Var = h.f44414x) != null) {
                        view = gl0Var.V;
                    }
                    if (view != null) {
                        String optString2 = jSONObject.optString("haptic");
                        if ("selection".equals(optString2)) {
                            i10 = 4;
                        } else if ("notification".equals(optString2)) {
                            i10 = 16;
                        } else {
                            i10 = 3;
                        }
                        view.performHapticFeedback(i10);
                        return;
                    }
                    return;
                }
                return;
            }
            String optString3 = jSONObject.optString("url");
            boolean equals = "openTelegramLink".equals(optString);
            if (!TextUtils.isEmpty(optString3) && !p.f44435i && (T = LaunchActivity.T()) != null && T.getParentActivity() != null) {
                Activity parentActivity = T.getParentActivity();
                if (equals) {
                    gf.f.r(parentActivity, optString3);
                    return;
                }
                p.f44435i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, T.getResourceProvider());
                String L0 = cd.L0(2131742897, null);
                x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.a0(null, null, 2131742898, optString3);
                alertDialog$Builder.k(cd.L0(2131747833, null), new org.telegram.ui.web.k0(1, parentActivity, optString3));
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                x1Var.setOnDismissListener(new jg.z(7));
                if (T.showDialog(x1Var) == null) {
                    p.f44435i = false;
                }
            }
        }
    }

    public final void g(k0 k0Var) {
        i0 i0Var;
        Object[] objArr;
        m h;
        q81 q81Var;
        if (k0Var == this.f44454f && (i0Var = k0Var.F) != null) {
            if (this.f44455g == null || k0Var.v) {
                this.f44455g = null;
                this.f44458k = i0Var.d;
                boolean z10 = i0Var.f44358i;
                boolean z11 = false;
                if (z10 != this.f44459l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f44459l = z10;
                int max = Math.max(1, i0Var.e);
                if (max != this.f44456i) {
                    z11 = true;
                }
                this.f44456i = max;
                q81 q81Var2 = this.h;
                if (q81Var2 != null) {
                    p81 p81Var = q81Var2.f29578a;
                    if (z11) {
                        p81Var.j();
                    }
                    p81Var.h();
                }
                if ((z11 || objArr != null) && this.e != null && (h = p.h(this)) != null && this.f44456i > 0) {
                    int f7 = p.f(this.f44458k);
                    int max2 = Math.max(50, Math.min(600, p.f(this.f44456i)));
                    boolean z12 = this.f44459l;
                    if (f7 > 0 && h.f44398f == 0 && !h.f44402k && p.l(h.a()).a(f7, max2, z12)) {
                        hs a02 = hs.a0(h.f44396b);
                        a02.f15938a.c(new gr(a02, h.f44397c, h.d, f7, max2, z12 ? 1 : 0, 1));
                    }
                    gl0 gl0Var = h.v;
                    if (gl0Var != null) {
                        gl0Var.p0("frame off screen");
                    }
                }
                if (e() && !z11 && (q81Var = this.h) != null) {
                    p81 p81Var2 = q81Var.f29578a;
                    p81Var2.j();
                    p81Var2.h();
                }
            }
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        m h;
        String str2;
        if (this.e != null && (h = p.h(this)) != null) {
            String a2 = h.a();
            JSONObject jSONObject2 = (JSONObject) p.f44432c.get(a2);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            p.f44432c.put(a2, jSONObject2);
            for (m mVar : p.f44430a.values()) {
                if (mVar.f44412u != null && a2.equals(mVar.a())) {
                    w wVar = mVar.f44412u;
                    try {
                        str2 = cd.D0().f15003y.toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    wVar.f44467t = str2;
                    wVar.f44468u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                p.d.put(a2, h);
                org.telegram.ui.Components.voip.m0 m0Var = p.e;
                org.telegram.messenger.i0.r(m0Var);
                org.telegram.messenger.i0.h3(m0Var, 1000L);
            }
        }
    }

    public final void i(long j10, JSONObject jSONObject) {
        TLRPC.User user;
        if (this.e != null) {
            m h = p.h(this);
            if (h != null) {
                long j11 = h.f44405n;
                if (j11 != 0) {
                    user = vp.r1(h.f44396b).Z1(Long.valueOf(j11));
                    k2 T = LaunchActivity.T();
                    if (h == null && p.D(h) && user != null && user.bot) {
                        if (T != null && T.getContext() != null) {
                            byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                            Context context = T.getContext();
                            int i10 = h.f44396b;
                            p6 resourceProvider = T.getResourceProvider();
                            k kVar = new k(h, this, j10, bytes);
                            ArrayList arrayList = u2.f35268a;
                            r2 r2Var = new r2(new boolean[]{false}, kVar);
                            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                            boolean[] zArr = {false};
                            fe feVar = new fe(zArr, context, i10, user, jSONObject, resourceProvider, r2Var, 15);
                            if (x10.G()) {
                                feVar.run();
                                return;
                            }
                            u2.f35268a.add(feVar);
                            x10.m0(feVar);
                            org.telegram.messenger.i0.h3(new org.telegram.ui.Wallet.g(feVar, zArr, r2Var, 8), 10000L);
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
            k2 T2 = LaunchActivity.T();
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
            k0 k0Var = this.f44454f;
            if (k0Var != null) {
                long j10 = k0Var.f44384t;
                if (!k0Var.f44385u && j10 != 0) {
                    WidgetSandboxNative.data(j10, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final synchronized void k(float f7, float f10, boolean z10) {
        boolean z11;
        if (f7 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (this.f44471y && z11 == this.f44472z) {
                return;
            }
        }
        this.f44471y = z10;
        this.f44472z = z11;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f7), Float.valueOf(f10));
        if (format.equals(this.f44470x)) {
            return;
        }
        this.f44470x = format;
        org.telegram.messenger.i0.g3(new l(this, 2));
    }

    public final void l(String str) {
        if (str != null && !str.equals(this.f44466s)) {
            this.f44466s = str;
            this.f44460m = str.contains("\"dark\"");
            k0 k0Var = this.f44454f;
            if (k0Var != null && !k0Var.f44385u && str != null && !str.equals(k0Var.f44389z)) {
                k0Var.f44389z = str;
                str.contains("\"dark\"");
                long j10 = k0Var.f44384t;
                if (j10 != 0) {
                    WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void m(boolean z10) {
        boolean z11;
        this.f44461n = z10;
        k0 k0Var = this.f44454f;
        if (k0Var != null) {
            if (z10 && !this.f44463p) {
                z11 = true;
            } else {
                z11 = false;
            }
            k0Var.d(z11);
        }
    }

    public final void n(int i10) {
        if (i10 > 0 && i10 != this.f44457j) {
            this.f44457j = i10;
            k0 k0Var = this.f44454f;
            if (k0Var != null && i10 > 0 && i10 != k0Var.E && !k0Var.f44385u) {
                k0Var.E = i10;
                long j10 = k0Var.f44384t;
                if (j10 != 0) {
                    WidgetSandboxNative.width(j10, i10 / k0Var.f44374j);
                }
            }
        }
    }

    public final void o(int i10, float f7, float f10, int i11, boolean z10, boolean z11, int i12, int i13) {
        k0 k0Var = this.f44454f;
        if (k0Var != null) {
            long j10 = k0Var.f44384t;
            if (!k0Var.f44385u && j10 != 0) {
                WidgetSandboxNative.touch(j10, i10, f7, f10, i11, z10, z11, i12, i13);
            }
        }
    }

    public final void p() {
        this.f44462o = false;
        if (this.f44454f != null) {
            i0 c10 = c();
            if (c10 != null) {
                this.f44455g = c10;
            }
            k0 k0Var = this.f44454f;
            if (!k0Var.f44385u) {
                k0Var.f44385u = true;
                k0Var.J = null;
                k0Var.f44368a.removeCallbacks(k0Var.O);
                k0Var.f44368a.removeCallbacks(k0Var.N);
                k0Var.f44368a.removeCallbacks(k0Var.P);
                if (k0Var.B) {
                    Choreographer.getInstance().removeFrameCallback(k0Var.Q);
                }
                k0Var.B = false;
                synchronized (k0Var.f44381q) {
                    try {
                        i0 i0Var = k0Var.G;
                        if (i0Var != null) {
                            i0Var.f44353a.c();
                        }
                        k0Var.G = null;
                        k0Var.H = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j10 = k0Var.f44384t;
                k0Var.f44384t = 0L;
                if (j10 != 0) {
                    b0.f44315a.execute(new d0(j10));
                }
            }
            this.f44454f = null;
            if (this.A) {
                this.A = false;
                t7.u uVar = this.e;
                if (uVar != null) {
                    uVar.getClass();
                    p.C();
                }
            }
        }
    }
}
