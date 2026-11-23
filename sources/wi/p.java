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
import c8.na;
import c8.od;
import com.google.android.gms.internal.vision.e2;
import e2.c1;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.y8;
import org.telegram.ui.LaunchActivity;
import p4.r;
import p4.x;
public final class p {
    public final l2.j f60124a;
    public LaunchActivity f60125b;
    public q f60126c;
    public v0 d;
    public n f60127e;
    public n f60128f;
    public o f60129g;
    public View h;
    public boolean f60130i;
    public boolean f60131j;
    public x f60132k;
    public final RectF f60133l;
    public final int[] f60134m;
    public String f60135n;
    public boolean f60136o;
    public final Rect f60137p;
    public boolean f60138q;
    public String f60139r;
    public final StringBuilder f60140s;
    public final ArrayList f60141t;
    public boolean f60142u;
    public final androidx.mediarouter.app.f v;

    public p(l2.j jVar) {
        new Rect();
        this.f60133l = new RectF();
        this.f60134m = new int[2];
        this.f60137p = new Rect();
        this.f60140s = new StringBuilder();
        this.f60141t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.f60124a = jVar;
    }

    public final void a(n nVar) {
        PictureInPictureParams b10 = b(nVar);
        String str = this.f60139r;
        if (str != null && str.equals(this.f60135n)) {
            return;
        }
        this.f60135n = this.f60139r;
        g0.u3(this.f60125b, b10);
    }

    public final PictureInPictureParams b(n nVar) {
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.f60140s;
        boolean z10 = false;
        sb2.setLength(0);
        int b12 = nVar.f60115a.b1();
        l lVar = nVar.f60115a;
        int V1 = lVar.V1();
        if (b12 > 0 && V1 > 0) {
            float f10 = b12 / V1;
            if (f10 < 0.45f) {
                rational = new Rational(45, 100);
            } else if (f10 > 2.35f) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(b12, V1);
            }
            builder.setAspectRatio(rational);
            sb2.append(rational);
        }
        int i7 = nVar.f60117c;
        Rect rect = this.f60137p;
        if (i7 != 2) {
            this.f60138q = e(nVar, rect);
        }
        if (this.f60138q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f60141t;
        arrayList2.clear();
        lVar.n2(this.f60125b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            k kVar = (k) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.f60125b.getPackageName());
            intent.putExtra("action_id", kVar.f60110a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f60125b, kVar.f60110a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.f60125b, kVar.f60111b);
            CharSequence charSequence = kVar.f60112c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(kVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.f60142u) {
            this.f60142u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.f60125b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.f60125b.registerReceiver(fVar, intentFilter);
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
            if (i13 >= 31 && nVar.f60117c != 2) {
                z10 = true;
            }
            builder.setAutoEnterEnabled(z10);
            sb2.append('|');
            sb2.append(z10);
        }
        this.f60139r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.f60142u && (launchActivity = this.f60125b) != null) {
            this.f60142u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        q qVar = this.f60126c;
        if (qVar != null) {
            g0.E2(qVar);
            this.f60126c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.a();
            this.d = null;
        }
        this.f60125b = null;
        this.f60127e = null;
        this.f60128f = null;
        this.f60129g = null;
        this.f60131j = false;
    }

    public final void d() {
        h hVar;
        n nVar = this.f60128f;
        o oVar = this.f60129g;
        View view = this.h;
        l2.j.g("system: exit to app");
        this.f60128f = null;
        this.f60129g = null;
        this.h = null;
        this.f60130i = false;
        this.f60136o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b(false);
        }
        q qVar = this.f60126c;
        if (qVar != null) {
            qVar.a(null, null);
        }
        l2.j jVar = this.f60124a;
        if (nVar != null) {
            l lVar = nVar.f60115a;
            if (view != null) {
                nVar.f60117c = nVar.d;
                lVar.l(view);
                lVar.z0(view);
                jVar.f();
                return;
            }
        }
        if (nVar != null && oVar != null) {
            if (nVar.d == 1 && (hVar = nVar.f60118e) != null) {
                nVar.f60117c = 1;
                hVar.f60081j = oVar;
                g0.E2(oVar);
                hVar.f60080i.addView(oVar, 0, na.c(-1.0f, -1));
                hVar.a();
                hVar.k();
            } else {
                nVar.f60117c = 0;
                SurfaceTexture surfaceTexture = oVar.f60121a;
                oVar.f60121a = null;
                if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                    surfaceTexture = y8.c();
                }
                if (surfaceTexture != null) {
                    nVar.f60115a.E0(surfaceTexture);
                }
            }
            jVar.f();
            return;
        }
        jVar.f();
    }

    public final boolean e(n nVar, Rect rect) {
        if (this.f60125b != null) {
            if (nVar.e()) {
                h hVar = nVar.f60118e;
                RectF rectF = this.f60133l;
                hVar.g(rectF);
                rectF.round(rect);
            } else {
                nVar.f60115a.w0(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.f60125b.getWindow().getDecorView();
                int[] iArr = this.f60134m;
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
        if (Build.VERSION.SDK_INT >= 35 && e2.s(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f60128f == null && (nVar = this.f60127e) != null) {
            i(nVar);
        }
    }

    public final void g() {
        int i7;
        if (this.f60125b != null && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 < 31 && this.f60128f == null) {
            j();
            n nVar = this.f60127e;
            if (nVar != null) {
                PictureInPictureParams b10 = b(nVar);
                i(this.f60127e);
                try {
                    if (!this.f60125b.enterPictureInPictureMode(b10)) {
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
        x xVar = this.f60132k;
        if (xVar != null) {
            try {
                synchronized (x.f55577b) {
                    x.f55578c.remove(xVar.f55579a.f55313i);
                }
                xVar.f55579a.r();
            } catch (Exception unused) {
            }
            this.f60132k = null;
        }
    }

    public final void i(n nVar) {
        View view;
        boolean z10;
        h hVar;
        if (this.f60126c != null && this.f60125b != null) {
            StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
            int i7 = nVar.f60117c;
            l lVar = nVar.f60115a;
            sb2.append(i7);
            l2.j.g(sb2.toString());
            Rect rect = new Rect();
            if (!e(nVar, rect)) {
                rect.setEmpty();
            }
            this.f60128f = nVar;
            o oVar = null;
            this.f60127e = null;
            this.f60136o = true;
            nVar.d = nVar.f60117c;
            if (nVar.f60118e == null) {
                view = lVar.y0(this.f60125b);
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
                this.f60126c.a(view, rect);
                lVar.D1(view);
            } else if (nVar.f60117c == 1 && (hVar = nVar.f60118e) != null) {
                o oVar2 = hVar.f60081j;
                hVar.f60081j = null;
                hVar.d();
                hVar.l();
                if (oVar2 != null) {
                    g0.E2(oVar2);
                }
                this.f60126c.a(oVar2, rect);
                oVar = oVar2;
            } else {
                oVar = new o(this.f60125b);
                this.f60126c.a(oVar, rect);
                lVar.I(oVar);
            }
            this.f60126c.bringToFront();
            this.f60129g = oVar;
            this.h = view;
            nVar.f60117c = 2;
            k(nVar);
        }
    }

    public final void j() {
        n nVar;
        h hVar;
        LaunchActivity launchActivity = this.f60125b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            n nVar2 = this.f60128f;
            if (nVar2 != null) {
                if (!this.f60136o) {
                    a(nVar2);
                }
                k(this.f60128f);
                return;
            }
            if (od.b(launchActivity) && !od.a(this.f60125b)) {
                ArrayList arrayList = (ArrayList) this.f60124a.f19507c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        nVar = (n) arrayList.get(size);
                        int i7 = nVar.f60117c;
                        l lVar = nVar.f60115a;
                        if (i7 == 0 && lVar.K0() == null && lVar.O0() && lVar.h1()) {
                            break;
                        }
                        size--;
                    } else {
                        nVar = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            n nVar3 = (n) arrayList.get(size2);
                            int i10 = nVar3.f60117c;
                            l lVar2 = nVar3.f60115a;
                            if (i10 == 1 && lVar2.h1() && ((hVar = nVar3.f60118e) == null ? !(!nVar3.f60119f || nVar3.f60120g) : !(hVar.f60078f || hVar.f60082k != null)) && (nVar == null || lVar2.y() > nVar.f60115a.y())) {
                                nVar = nVar3;
                            }
                        }
                        if (nVar == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                n nVar4 = (n) arrayList.get(size3);
                                int i11 = nVar4.f60117c;
                                l lVar3 = nVar4.f60115a;
                                if (i11 == 0 && lVar3.o1() && lVar3.h1() && (nVar == null || lVar3.y() > nVar.f60115a.y())) {
                                    nVar = nVar4;
                                }
                            }
                        }
                    }
                }
            } else {
                nVar = null;
            }
            this.f60127e = nVar;
            if (nVar != null) {
                this.f60131j = true;
                a(nVar);
            } else if (this.f60131j) {
                this.f60131j = false;
                this.f60135n = null;
                g0.b3(this.f60125b);
            }
            h();
        }
    }

    public final void k(n nVar) {
        c1 c1Var;
        if (nVar != null) {
            c1Var = nVar.f60115a.n1();
        } else {
            c1Var = null;
        }
        if (c1Var == null) {
            h();
            return;
        }
        x xVar = this.f60132k;
        if (xVar != null && xVar.f55579a.f55324t.f55401a == c1Var) {
            return;
        }
        h();
        try {
            r rVar = new r(this.f60125b, c1Var);
            rVar.f55543c = "utils-pip-media-session";
            this.f60132k = rVar.a();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
