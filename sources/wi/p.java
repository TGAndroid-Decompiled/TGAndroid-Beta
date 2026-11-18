package wi;

import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.app.RemoteAction;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Rational;
import android.view.View;
import bg.v0;
import c8.ma;
import c8.nd;
import com.google.android.gms.internal.vision.e2;
import e2.c1;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.LaunchActivity;
import p4.r;
import p4.x;
public final class p {
    public final l2.i f59996a;
    public LaunchActivity f59997b;
    public q f59998c;
    public v0 d;
    public n f59999e;
    public n f60000f;
    public o f60001g;
    public View h;
    public boolean f60002i;
    public boolean f60003j;
    public x f60004k;
    public final RectF f60005l;
    public final int[] f60006m;
    public String f60007n;
    public boolean f60008o;
    public final Rect f60009p;
    public boolean f60010q;
    public String f60011r;
    public final StringBuilder f60012s;
    public final ArrayList f60013t;
    public boolean f60014u;
    public final androidx.mediarouter.app.f v;

    public p(l2.i iVar) {
        new Rect();
        this.f60005l = new RectF();
        this.f60006m = new int[2];
        this.f60009p = new Rect();
        this.f60012s = new StringBuilder();
        this.f60013t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.f59996a = iVar;
    }

    public final void a(n nVar) {
        PictureInPictureParams b10 = b(nVar);
        String str = this.f60011r;
        if (str != null && str.equals(this.f60007n)) {
            return;
        }
        this.f60007n = this.f60011r;
        g0.u3(this.f59997b, b10);
    }

    public final PictureInPictureParams b(n nVar) {
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.f60012s;
        boolean z10 = false;
        sb2.setLength(0);
        int J = nVar.f59987a.J();
        l lVar = nVar.f59987a;
        int a02 = lVar.a0();
        if (J > 0 && a02 > 0) {
            float f10 = J / a02;
            if (f10 < 0.45f) {
                rational = new Rational(45, 100);
            } else if (f10 > 2.35f) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(J, a02);
            }
            builder.setAspectRatio(rational);
            sb2.append(rational);
        }
        int i7 = nVar.f59989c;
        Rect rect = this.f60009p;
        if (i7 != 2) {
            this.f60010q = e(nVar, rect);
        }
        if (this.f60010q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f60013t;
        arrayList2.clear();
        lVar.h0(this.f59997b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            k kVar = (k) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.f59997b.getPackageName());
            intent.putExtra("action_id", kVar.f59982a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f59997b, kVar.f59982a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.f59997b, kVar.f59983b);
            CharSequence charSequence = kVar.f59984c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(kVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.f60014u) {
            this.f60014u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.f59997b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.f59997b.registerReceiver(fVar, intentFilter);
            }
        }
        builder.setActions(arrayList);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            RemoteAction remoteAction2 = (RemoteAction) arrayList.get(i12);
            sb2.append('|');
            sb2.append(remoteAction2.getTitle());
            sb2.append(remoteAction2.isEnabled());
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            if (i13 >= 31 && nVar.f59989c != 2) {
                z10 = true;
            }
            builder.setAutoEnterEnabled(z10);
            sb2.append('|');
            sb2.append(z10);
        }
        this.f60011r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.f60014u && (launchActivity = this.f59997b) != null) {
            this.f60014u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        q qVar = this.f59998c;
        if (qVar != null) {
            g0.E2(qVar);
            this.f59998c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.a();
            this.d = null;
        }
        this.f59997b = null;
        this.f59999e = null;
        this.f60000f = null;
        this.f60001g = null;
        this.f60003j = false;
    }

    public final void d() {
        h hVar;
        n nVar = this.f60000f;
        o oVar = this.f60001g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f60000f = null;
        this.f60001g = null;
        this.h = null;
        this.f60002i = false;
        this.f60008o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b(false);
        }
        q qVar = this.f59998c;
        if (qVar != null) {
            qVar.a(null, null);
        }
        l2.i iVar = this.f59996a;
        if (nVar != null) {
            l lVar = nVar.f59987a;
            if (view != null) {
                nVar.f59989c = nVar.d;
                lVar.d(view);
                lVar.w(view);
                iVar.f();
                return;
            }
        }
        if (nVar != null && oVar != null) {
            if (nVar.d == 1 && (hVar = nVar.f59990e) != null) {
                nVar.f59989c = 1;
                hVar.f59953j = oVar;
                g0.E2(oVar);
                hVar.f59952i.addView(oVar, 0, ma.c(-1.0f, -1));
                hVar.a();
                hVar.k();
            } else {
                nVar.f59989c = 0;
                SurfaceTexture surfaceTexture = oVar.f59993a;
                oVar.f59993a = null;
                if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                    surfaceTexture = f9.b.d();
                }
                if (surfaceTexture != null) {
                    nVar.f59987a.D(surfaceTexture);
                }
            }
            iVar.f();
            return;
        }
        iVar.f();
    }

    public final boolean e(n nVar, Rect rect) {
        if (this.f59997b != null) {
            if (nVar.e()) {
                h hVar = nVar.f59990e;
                RectF rectF = this.f60005l;
                hVar.g(rectF);
                rectF.round(rect);
            } else {
                nVar.f59987a.u(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.f59997b.getWindow().getDecorView();
                int[] iArr = this.f60006m;
                decorView.getLocationOnScreen(iArr);
                rect.offset(-iArr[0], -iArr[1]);
                float width = rect.width() / rect.height();
                if (rect.intersect(0, 0, decorView.getWidth(), decorView.getHeight()) && Math.abs(((rect.width() / rect.height()) / width) - 1.0f) < 0.02f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(Object obj) {
        n nVar;
        if (Build.VERSION.SDK_INT >= 35 && e2.s(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f60000f == null && (nVar = this.f59999e) != null) {
            i(nVar);
        }
    }

    public final void g() {
        int i7;
        if (this.f59997b != null && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 < 31 && this.f60000f == null) {
            j();
            n nVar = this.f59999e;
            if (nVar != null) {
                PictureInPictureParams b10 = b(nVar);
                i(this.f59999e);
                try {
                    if (!this.f59997b.enterPictureInPictureMode(b10)) {
                        d();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    d();
                }
            }
        }
    }

    public final void h() {
        x xVar = this.f60004k;
        if (xVar != null) {
            try {
                synchronized (x.f55451b) {
                    x.f55452c.remove(xVar.f55453a.f55184i);
                }
                xVar.f55453a.r();
            } catch (Exception unused) {
            }
            this.f60004k = null;
        }
    }

    public final void i(n nVar) {
        View view;
        boolean z10;
        h hVar;
        if (this.f59998c != null && this.f59997b != null) {
            StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
            int i7 = nVar.f59989c;
            l lVar = nVar.f59987a;
            sb2.append(i7);
            l2.i.g(sb2.toString());
            Rect rect = new Rect();
            if (!e(nVar, rect)) {
                rect.setEmpty();
            }
            this.f60000f = nVar;
            o oVar = null;
            this.f59999e = null;
            this.f60008o = true;
            nVar.d = nVar.f59989c;
            if (nVar.f59990e == null) {
                view = lVar.v(this.f59997b);
            } else {
                view = null;
            }
            if (view != null && rect.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            v0 v0Var = this.d;
            if (v0Var != null && !z10) {
                v0Var.b(true);
            }
            if (view != null) {
                if (z10) {
                    view.setVisibility(4);
                }
                this.f59998c.a(view, rect);
                lVar.X(view);
            } else if (nVar.f59989c == 1 && (hVar = nVar.f59990e) != null) {
                o oVar2 = hVar.f59953j;
                hVar.f59953j = null;
                hVar.d();
                hVar.l();
                if (oVar2 != null) {
                    g0.E2(oVar2);
                }
                this.f59998c.a(oVar2, rect);
                oVar = oVar2;
            } else {
                oVar = new o(this.f59997b);
                this.f59998c.a(oVar, rect);
                lVar.i(oVar);
            }
            this.f59998c.bringToFront();
            this.f60001g = oVar;
            this.h = view;
            nVar.f59989c = 2;
            k(nVar);
        }
    }

    public final void j() {
        n nVar;
        h hVar;
        LaunchActivity launchActivity = this.f59997b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            n nVar2 = this.f60000f;
            if (nVar2 != null) {
                if (!this.f60008o) {
                    a(nVar2);
                }
                k(this.f60000f);
                return;
            }
            if (nd.b(launchActivity) && !nd.a(this.f59997b)) {
                ArrayList arrayList = (ArrayList) this.f59996a.f19406c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        nVar = (n) arrayList.get(size);
                        int i7 = nVar.f59989c;
                        l lVar = nVar.f59987a;
                        if (i7 == 0 && lVar.E() == null && lVar.G() && lVar.N()) {
                            break;
                        }
                        size--;
                    } else {
                        nVar = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            n nVar3 = (n) arrayList.get(size2);
                            int i10 = nVar3.f59989c;
                            l lVar2 = nVar3.f59987a;
                            if (i10 == 1 && lVar2.N() && ((hVar = nVar3.f59990e) == null ? !(!nVar3.f59991f || nVar3.f59992g) : !(hVar.f59950f || hVar.f59954k != null)) && (nVar == null || lVar2.e() > nVar.f59987a.e())) {
                                nVar = nVar3;
                            }
                        }
                        if (nVar == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                n nVar4 = (n) arrayList.get(size3);
                                int i11 = nVar4.f59989c;
                                l lVar3 = nVar4.f59987a;
                                if (i11 == 0 && lVar3.S() && lVar3.N() && (nVar == null || lVar3.e() > nVar.f59987a.e())) {
                                    nVar = nVar4;
                                }
                            }
                        }
                    }
                }
            } else {
                nVar = null;
            }
            this.f59999e = nVar;
            if (nVar != null) {
                this.f60003j = true;
                a(nVar);
            } else if (this.f60003j) {
                this.f60003j = false;
                this.f60007n = null;
                g0.b3(this.f59997b);
            }
            h();
        }
    }

    public final void k(n nVar) {
        c1 c1Var;
        if (nVar != null) {
            c1Var = nVar.f59987a.Q();
        } else {
            c1Var = null;
        }
        if (c1Var == null) {
            h();
            return;
        }
        x xVar = this.f60004k;
        if (xVar != null && xVar.f55453a.f55195t.f55287a == c1Var) {
            return;
        }
        h();
        try {
            r rVar = new r(this.f59997b, c1Var);
            rVar.f55416c = "utils-pip-media-session";
            this.f60004k = rVar.a();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
