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
import org.telegram.messenger.dd;
import org.telegram.messenger.ge;
import org.telegram.messenger.hr;
import org.telegram.messenger.is;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.r81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.s2;
import org.telegram.ui.Wallet.v2;
public final class w {
    public boolean A;
    public final String f44462a;
    public final String f44463b;
    public final Context f44464c;
    public t7.u e;
    public k0 f44465f;
    public i0 f44466g;
    public r81 h;
    public int f44467i;
    public int f44468j;
    public int f44469k;
    public boolean f44470l;
    public boolean f44472n;
    public boolean f44473o;
    public boolean f44474p;
    public int f44475q;
    public int f44476r;
    public String f44477s;
    public String f44478t;
    public String f44479u;
    public volatile String f44481x;
    public boolean f44482y;
    public boolean f44483z;
    public String v = "{}";
    public String f44480w = "{}";
    public boolean f44471m = false;
    public final int d = 1;

    public w(Context context, String str, String str2) {
        this.f44464c = context.getApplicationContext();
        this.f44462a = str;
        this.f44463b = str2;
    }

    public final void a(int i10, String str, long j10) {
        byte[] bytes;
        k0 k0Var = this.f44465f;
        if (k0Var != null) {
            long j11 = k0Var.f44395t;
            if (!k0Var.f44396u && j11 != 0) {
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
        k0 k0Var = this.f44465f;
        if (k0Var != null && !k0Var.f44396u && k0Var.f44395t != 0 && !k0Var.C) {
            i0 i0Var = k0Var.F;
            if (i0Var == null || (((i10 = k0Var.E) != 0 && Math.abs(i0Var.d - i10) > 1) || !i0Var.a())) {
                k0Var.C = true;
                WidgetSandboxNative.repaint(k0Var.f44395t);
            }
        }
    }

    public final i0 c() {
        i0 i0Var;
        k0 k0Var = this.f44465f;
        if (k0Var == null) {
            i0Var = null;
        } else {
            i0Var = k0Var.F;
        }
        if (i0Var != null && (this.f44466g == null || k0Var.v)) {
            return i0Var;
        }
        i0 i0Var2 = this.f44466g;
        if (i0Var2 != null && Math.abs(i0Var2.d - this.f44468j) <= 1) {
            return this.f44466g;
        }
        if (i0Var != null) {
            return i0Var;
        }
        return this.f44466g;
    }

    public final void d(float f7, float f10, int i10, int i11) {
        k0 k0Var = this.f44465f;
        if (k0Var != null) {
            long j10 = k0Var.f44395t;
            if (!k0Var.f44396u && j10 != 0) {
                WidgetSandboxNative.hover(j10, i10, f7, f10, i11);
            }
        }
    }

    public final boolean e() {
        k0 k0Var;
        i0 i0Var;
        if (this.f44476r != this.f44475q && (k0Var = this.f44465f) != null && (i0Var = k0Var.F) != null) {
            if (i0Var.h || k0Var.f44398x) {
                this.f44476r = this.f44475q;
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
        hl0 hl0Var;
        if (this.e != null) {
            m h = p.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.f44426y > 0 && (hl0Var = h.f44425x) != null) {
                        view = hl0Var.V;
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
            if (!TextUtils.isEmpty(optString3) && !p.f44446i && (T = LaunchActivity.T()) != null && T.getParentActivity() != null) {
                Activity parentActivity = T.getParentActivity();
                if (equals) {
                    gf.f.r(parentActivity, optString3);
                    return;
                }
                p.f44446i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, T.getResourceProvider());
                String L0 = dd.L0(2131742897, null);
                x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = dd.a0(null, null, 2131742898, optString3);
                alertDialog$Builder.k(dd.L0(2131747833, null), new org.telegram.ui.web.k0(1, parentActivity, optString3));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                x1Var.setOnDismissListener(new jg.z(7));
                if (T.showDialog(x1Var) == null) {
                    p.f44446i = false;
                }
            }
        }
    }

    public final void g(k0 k0Var) {
        i0 i0Var;
        Object[] objArr;
        m h;
        r81 r81Var;
        if (k0Var == this.f44465f && (i0Var = k0Var.F) != null) {
            if (this.f44466g == null || k0Var.v) {
                this.f44466g = null;
                this.f44469k = i0Var.d;
                boolean z10 = i0Var.f44369i;
                boolean z11 = false;
                if (z10 != this.f44470l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f44470l = z10;
                int max = Math.max(1, i0Var.e);
                if (max != this.f44467i) {
                    z11 = true;
                }
                this.f44467i = max;
                r81 r81Var2 = this.h;
                if (r81Var2 != null) {
                    q81 q81Var = r81Var2.f29940a;
                    if (z11) {
                        q81Var.j();
                    }
                    q81Var.h();
                }
                if ((z11 || objArr != null) && this.e != null && (h = p.h(this)) != null && this.f44467i > 0) {
                    int f7 = p.f(this.f44469k);
                    int max2 = Math.max(50, Math.min(600, p.f(this.f44467i)));
                    boolean z12 = this.f44470l;
                    if (f7 > 0 && h.f44409f == 0 && !h.f44413k && p.l(h.a()).a(f7, max2, z12)) {
                        is a02 = is.a0(h.f44407b);
                        a02.f16331a.c(new hr(a02, h.f44408c, h.d, f7, max2, z12 ? 1 : 0, 1));
                    }
                    hl0 hl0Var = h.v;
                    if (hl0Var != null) {
                        hl0Var.p0("frame off screen");
                    }
                }
                if (e() && !z11 && (r81Var = this.h) != null) {
                    q81 q81Var2 = r81Var.f29940a;
                    q81Var2.j();
                    q81Var2.h();
                }
            }
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        m h;
        String str2;
        if (this.e != null && (h = p.h(this)) != null) {
            String a2 = h.a();
            JSONObject jSONObject2 = (JSONObject) p.f44443c.get(a2);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            p.f44443c.put(a2, jSONObject2);
            for (m mVar : p.f44441a.values()) {
                if (mVar.f44423u != null && a2.equals(mVar.a())) {
                    w wVar = mVar.f44423u;
                    try {
                        str2 = dd.D0().f15365y.toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    wVar.f44478t = str2;
                    wVar.f44479u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                p.d.put(a2, h);
                org.telegram.ui.Components.voip.n0 n0Var = p.e;
                org.telegram.messenger.i0.r(n0Var);
                org.telegram.messenger.i0.h3(n0Var, 1000L);
            }
        }
    }

    public final void i(long j10, JSONObject jSONObject) {
        TLRPC.User user;
        if (this.e != null) {
            m h = p.h(this);
            if (h != null) {
                long j11 = h.f44416n;
                if (j11 != 0) {
                    user = wp.r1(h.f44407b).Z1(Long.valueOf(j11));
                    k2 T = LaunchActivity.T();
                    if (h == null && p.D(h) && user != null && user.bot) {
                        if (T != null && T.getContext() != null) {
                            byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                            Context context = T.getContext();
                            int i10 = h.f44407b;
                            p6 resourceProvider = T.getResourceProvider();
                            k kVar = new k(h, this, j10, bytes);
                            ArrayList arrayList = v2.f35308a;
                            s2 s2Var = new s2(new boolean[]{false}, kVar);
                            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                            boolean[] zArr = {false};
                            ge geVar = new ge(zArr, context, i10, user, jSONObject, resourceProvider, s2Var, 15);
                            if (x10.G()) {
                                geVar.run();
                                return;
                            }
                            v2.f35308a.add(geVar);
                            x10.m0(geVar);
                            org.telegram.messenger.i0.h3(new org.telegram.ui.Wallet.g(geVar, zArr, s2Var, 8), 10000L);
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
            k0 k0Var = this.f44465f;
            if (k0Var != null) {
                long j10 = k0Var.f44395t;
                if (!k0Var.f44396u && j10 != 0) {
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
            if (this.f44482y && z11 == this.f44483z) {
                return;
            }
        }
        this.f44482y = z10;
        this.f44483z = z11;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f7), Float.valueOf(f10));
        if (format.equals(this.f44481x)) {
            return;
        }
        this.f44481x = format;
        org.telegram.messenger.i0.g3(new l(this, 2));
    }

    public final void l(String str) {
        if (str != null && !str.equals(this.f44477s)) {
            this.f44477s = str;
            this.f44471m = str.contains("\"dark\"");
            k0 k0Var = this.f44465f;
            if (k0Var != null && !k0Var.f44396u && str != null && !str.equals(k0Var.f44400z)) {
                k0Var.f44400z = str;
                str.contains("\"dark\"");
                long j10 = k0Var.f44395t;
                if (j10 != 0) {
                    WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void m(boolean z10) {
        boolean z11;
        this.f44472n = z10;
        k0 k0Var = this.f44465f;
        if (k0Var != null) {
            if (z10 && !this.f44474p) {
                z11 = true;
            } else {
                z11 = false;
            }
            k0Var.d(z11);
        }
    }

    public final void n(int i10) {
        if (i10 > 0 && i10 != this.f44468j) {
            this.f44468j = i10;
            k0 k0Var = this.f44465f;
            if (k0Var != null && i10 > 0 && i10 != k0Var.E && !k0Var.f44396u) {
                k0Var.E = i10;
                long j10 = k0Var.f44395t;
                if (j10 != 0) {
                    WidgetSandboxNative.width(j10, i10 / k0Var.f44385j);
                }
            }
        }
    }

    public final void o(int i10, float f7, float f10, int i11, boolean z10, boolean z11, int i12, int i13) {
        k0 k0Var = this.f44465f;
        if (k0Var != null) {
            long j10 = k0Var.f44395t;
            if (!k0Var.f44396u && j10 != 0) {
                WidgetSandboxNative.touch(j10, i10, f7, f10, i11, z10, z11, i12, i13);
            }
        }
    }

    public final void p() {
        this.f44473o = false;
        if (this.f44465f != null) {
            i0 c10 = c();
            if (c10 != null) {
                this.f44466g = c10;
            }
            k0 k0Var = this.f44465f;
            if (!k0Var.f44396u) {
                k0Var.f44396u = true;
                k0Var.J = null;
                k0Var.f44379a.removeCallbacks(k0Var.O);
                k0Var.f44379a.removeCallbacks(k0Var.N);
                k0Var.f44379a.removeCallbacks(k0Var.P);
                if (k0Var.B) {
                    Choreographer.getInstance().removeFrameCallback(k0Var.Q);
                }
                k0Var.B = false;
                synchronized (k0Var.f44392q) {
                    try {
                        i0 i0Var = k0Var.G;
                        if (i0Var != null) {
                            i0Var.f44364a.c();
                        }
                        k0Var.G = null;
                        k0Var.H = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j10 = k0Var.f44395t;
                k0Var.f44395t = 0L;
                if (j10 != 0) {
                    b0.f44319a.execute(new d0(j10));
                }
            }
            this.f44465f = null;
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
