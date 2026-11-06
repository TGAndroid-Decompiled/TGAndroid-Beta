package org.telegram.utils.twidget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import fi.d1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import jg.c1;
import org.json.JSONObject;
import org.telegram.messenger.br;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.o71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.n0;
import org.telegram.ui.Wallet.s2;
import org.telegram.ui.Wallet.v2;
public final class u {
    public boolean A;
    public final String f52891a;
    public final String f52892b;
    public final Context f52893c;
    public nb.a f52894e;
    public h0 f52895f;
    public f0 f52896g;
    public o71 h;
    public int f52897i;
    public int f52898j;
    public int f52899k;
    public boolean f52900l;
    public boolean f52902n;
    public boolean f52903o;
    public boolean f52904p;
    public int f52905q;
    public int f52906r;
    public String f52907s;
    public String f52908t;
    public String f52909u;
    public volatile String f52911x;
    public boolean f52912y;
    public boolean f52913z;
    public String v = "{}";
    public String f52910w = "{}";
    public boolean f52901m = false;
    public final int d = 1;

    public u(Context context, String str, String str2) {
        this.f52893c = context.getApplicationContext();
        this.f52891a = str;
        this.f52892b = str2;
    }

    public final void a(int i7, String str, long j3) {
        byte[] bytes;
        h0 h0Var = this.f52895f;
        if (h0Var != null) {
            long j10 = h0Var.f52816t;
            if (!h0Var.f52817u && j10 != 0) {
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                WidgetSandboxNative.answerRequest(j10, j3, i7, bytes);
            }
        }
    }

    public final void b() {
        int i7;
        h0 h0Var = this.f52895f;
        if (h0Var != null && !h0Var.f52817u && h0Var.f52816t != 0 && !h0Var.C) {
            f0 f0Var = h0Var.F;
            if (f0Var == null || (((i7 = h0Var.E) != 0 && Math.abs(f0Var.d - i7) > 1) || !f0Var.a())) {
                h0Var.C = true;
                WidgetSandboxNative.repaint(h0Var.f52816t);
            }
        }
    }

    public final f0 c() {
        f0 f0Var;
        h0 h0Var = this.f52895f;
        if (h0Var == null) {
            f0Var = null;
        } else {
            f0Var = h0Var.F;
        }
        if (f0Var != null && (this.f52896g == null || h0Var.v)) {
            return f0Var;
        }
        f0 f0Var2 = this.f52896g;
        if (f0Var2 != null && Math.abs(f0Var2.d - this.f52898j) <= 1) {
            return this.f52896g;
        }
        if (f0Var != null) {
            return f0Var;
        }
        return this.f52896g;
    }

    public final void d(float f10, float f11, int i7, int i10) {
        h0 h0Var = this.f52895f;
        if (h0Var != null) {
            long j3 = h0Var.f52816t;
            if (!h0Var.f52817u && j3 != 0) {
                WidgetSandboxNative.hover(j3, i7, f10, f11, i10);
            }
        }
    }

    public final boolean e() {
        h0 h0Var;
        f0 f0Var;
        if (this.f52906r != this.f52905q && (h0Var = this.f52895f) != null && (f0Var = h0Var.F) != null) {
            if (f0Var.f52788g || h0Var.f52819x) {
                this.f52906r = this.f52905q;
                if (this.f52894e != null) {
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
        f2 T;
        int i7;
        ck0 ck0Var;
        if (this.f52894e != null) {
            m h = p.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.f52865x > 0 && (ck0Var = h.f52864w) != null) {
                        view = ck0Var.V;
                    }
                    if (view != null) {
                        String optString2 = jSONObject.optString("haptic");
                        if ("selection".equals(optString2)) {
                            i7 = 4;
                        } else if ("notification".equals(optString2)) {
                            i7 = 16;
                        } else {
                            i7 = 3;
                        }
                        view.performHapticFeedback(i7);
                        return;
                    }
                    return;
                }
                return;
            }
            String optString3 = jSONObject.optString("url");
            boolean equals = "openTelegramLink".equals(optString);
            if (!TextUtils.isEmpty(optString3) && !p.f52882i && (T = LaunchActivity.T()) != null && T.getParentActivity() != null) {
                Activity parentActivity = T.getParentActivity();
                if (equals) {
                    vf.c.t(parentActivity, optString3);
                    return;
                }
                p.f52882i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, T.getResourceProvider());
                String M0 = hd.M0(2131742873, null);
                u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = hd.a0(null, null, 2131742874, optString3);
                alertDialog$Builder.k(hd.M0(2131747816, null), new org.telegram.ui.web.a0(2, parentActivity, optString3));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                u1Var.setOnDismissListener(new d1(7));
                if (T.showDialog(u1Var) == null) {
                    p.f52882i = false;
                }
            }
        }
    }

    public final void g(h0 h0Var) {
        f0 f0Var;
        Object[] objArr;
        m h;
        o71 o71Var;
        if (h0Var == this.f52895f && (f0Var = h0Var.F) != null) {
            if (this.f52896g == null || h0Var.v) {
                this.f52896g = null;
                this.f52899k = f0Var.d;
                boolean z9 = f0Var.h;
                boolean z10 = false;
                if (z9 != this.f52900l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f52900l = z9;
                int max = Math.max(1, f0Var.f52786e);
                if (max != this.f52897i) {
                    z10 = true;
                }
                this.f52897i = max;
                o71 o71Var2 = this.h;
                if (o71Var2 != null) {
                    n71 n71Var = o71Var2.f36524a;
                    if (z10) {
                        n71Var.j();
                    }
                    n71Var.h();
                }
                if ((z10 || objArr != null) && this.f52894e != null && (h = p.h(this)) != null && this.f52897i > 0) {
                    int f10 = p.f(this.f52899k);
                    int max2 = Math.max(50, Math.min(600, p.f(this.f52897i)));
                    boolean z11 = this.f52900l;
                    if (f10 > 0 && h.f52849f == 0 && !h.f52853k && p.l(h.a()).a(f10, max2, z11)) {
                        yr a02 = yr.a0(h.f52846b);
                        a02.f26688a.c(new br(a02, h.f52847c, h.d, f10, max2, z11 ? 1 : 0, 1));
                    }
                    ck0 ck0Var = h.f52863u;
                    if (ck0Var != null) {
                        ck0Var.p0("frame off screen");
                    }
                }
                if (e() && !z10 && (o71Var = this.h) != null) {
                    n71 n71Var2 = o71Var.f36524a;
                    n71Var2.j();
                    n71Var2.h();
                }
            }
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        m h;
        String str2;
        if (this.f52894e != null && (h = p.h(this)) != null) {
            String a10 = h.a();
            JSONObject jSONObject2 = (JSONObject) p.f52878c.get(a10);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            p.f52878c.put(a10, jSONObject2);
            for (m mVar : p.f52876a.values()) {
                if (mVar.f52862t != null && a10.equals(mVar.a())) {
                    u uVar = mVar.f52862t;
                    try {
                        str2 = hd.E0().f22899y.toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    uVar.f52908t = str2;
                    uVar.f52909u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                p.d.put(a10, h);
                org.telegram.ui.Wallet.z zVar = p.f52879e;
                org.telegram.messenger.g0.r(zVar);
                org.telegram.messenger.g0.i3(zVar, 1000L);
            }
        }
    }

    public final void i(long j3, JSONObject jSONObject) {
        TLRPC.User user;
        if (this.f52894e != null) {
            m h = p.h(this);
            if (h != null) {
                long j10 = h.f52856n;
                if (j10 != 0) {
                    user = qp.s1(h.f52846b).a2(Long.valueOf(j10));
                    f2 T = LaunchActivity.T();
                    if (h == null && p.D(h) && user != null && user.bot) {
                        if (T != null && T.getContext() != null) {
                            byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                            Context context = T.getContext();
                            int i7 = h.f52846b;
                            f6 resourceProvider = T.getResourceProvider();
                            k kVar = new k(h, this, j3, bytes);
                            ArrayList arrayList = v2.f43231a;
                            s2 s2Var = new s2(new boolean[]{false}, kVar);
                            n0 x10 = n0.x(i7);
                            boolean[] zArr = {false};
                            c1 c1Var = new c1(zArr, context, i7, user, jSONObject, resourceProvider, s2Var, 16);
                            if (x10.G()) {
                                c1Var.run();
                                return;
                            }
                            v2.f43231a.add(c1Var);
                            x10.m0(c1Var);
                            org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.g(c1Var, zArr, s2Var, 8), 10000L);
                            return;
                        }
                        a(3, null, j3);
                        return;
                    }
                    a(5, null, j3);
                    return;
                }
            }
            user = null;
            f2 T2 = LaunchActivity.T();
            if (h == null) {
            }
            a(5, null, j3);
            return;
        }
        a(3, null, j3);
    }

    public final void j(String str) {
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            h0 h0Var = this.f52895f;
            if (h0Var != null) {
                long j3 = h0Var.f52816t;
                if (!h0Var.f52817u && j3 != 0) {
                    WidgetSandboxNative.data(j3, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final synchronized void k(float f10, float f11, boolean z9) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z9) {
            if (this.f52912y && z10 == this.f52913z) {
                return;
            }
        }
        this.f52912y = z9;
        this.f52913z = z10;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f52911x)) {
            return;
        }
        this.f52911x = format;
        org.telegram.messenger.g0.h3(new l(this, 2));
    }

    public final void l(String str) {
        if (str != null && !str.equals(this.f52907s)) {
            this.f52907s = str;
            this.f52901m = str.contains("\"dark\"");
            h0 h0Var = this.f52895f;
            if (h0Var != null && !h0Var.f52817u && !str.equals(h0Var.f52821z)) {
                h0Var.f52821z = str;
                str.contains("\"dark\"");
                long j3 = h0Var.f52816t;
                if (j3 != 0) {
                    WidgetSandboxNative.theme(j3, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void m(boolean z9) {
        boolean z10;
        this.f52902n = z9;
        h0 h0Var = this.f52895f;
        if (h0Var != null) {
            if (z9 && !this.f52904p) {
                z10 = true;
            } else {
                z10 = false;
            }
            h0Var.d(z10);
        }
    }

    public final void n(int i7) {
        if (i7 > 0 && i7 != this.f52898j) {
            this.f52898j = i7;
            h0 h0Var = this.f52895f;
            if (h0Var != null && i7 > 0 && i7 != h0Var.E && !h0Var.f52817u) {
                h0Var.E = i7;
                long j3 = h0Var.f52816t;
                if (j3 != 0) {
                    WidgetSandboxNative.width(j3, i7 / h0Var.f52806j);
                }
            }
        }
    }

    public final void o(int i7, float f10, float f11, int i10, boolean z9, boolean z10, int i11, int i12) {
        h0 h0Var = this.f52895f;
        if (h0Var != null) {
            long j3 = h0Var.f52816t;
            if (!h0Var.f52817u && j3 != 0) {
                WidgetSandboxNative.touch(j3, i7, f10, f11, i10, z9, z10, i11, i12);
            }
        }
    }

    public final void p() {
        this.f52903o = false;
        if (this.f52895f != null) {
            f0 c10 = c();
            if (c10 != null) {
                this.f52896g = c10;
            }
            h0 h0Var = this.f52895f;
            if (!h0Var.f52817u) {
                h0Var.f52817u = true;
                h0Var.J = null;
                h0Var.f52799a.removeCallbacks(h0Var.N);
                h0Var.f52799a.removeCallbacks(h0Var.M);
                h0Var.f52799a.removeCallbacks(h0Var.O);
                if (h0Var.B) {
                    Choreographer.getInstance().removeFrameCallback(h0Var.P);
                }
                h0Var.B = false;
                synchronized (h0Var.f52813q) {
                    try {
                        f0 f0Var = h0Var.G;
                        if (f0Var != null) {
                            f0Var.f52783a.c();
                        }
                        h0Var.G = null;
                        h0Var.H = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j3 = h0Var.f52816t;
                h0Var.f52816t = 0L;
                if (j3 != 0) {
                    z.f52935a.execute(new a0(j3));
                }
            }
            this.f52895f = null;
            if (this.A) {
                this.A = false;
                if (this.f52894e != null) {
                    p.C();
                }
            }
        }
    }
}
