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
import org.telegram.messenger.z8;
import org.telegram.ui.LaunchActivity;
import p4.r;
import p4.x;
public final class p {
    public final l2.i f60041a;
    public LaunchActivity f60042b;
    public q f60043c;
    public v0 d;
    public n f60044e;
    public n f60045f;
    public o f60046g;
    public View h;
    public boolean f60047i;
    public boolean f60048j;
    public x f60049k;
    public final RectF f60050l;
    public final int[] f60051m;
    public String f60052n;
    public boolean f60053o;
    public final Rect f60054p;
    public boolean f60055q;
    public String f60056r;
    public final StringBuilder f60057s;
    public final ArrayList f60058t;
    public boolean f60059u;
    public final androidx.mediarouter.app.f v;

    public p(l2.i iVar) {
        new Rect();
        this.f60050l = new RectF();
        this.f60051m = new int[2];
        this.f60054p = new Rect();
        this.f60057s = new StringBuilder();
        this.f60058t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.f60041a = iVar;
    }

    public final void a(n nVar) {
        PictureInPictureParams b10 = b(nVar);
        String str = this.f60056r;
        if (str != null && str.equals(this.f60052n)) {
            return;
        }
        this.f60052n = this.f60056r;
        g0.u3(this.f60042b, b10);
    }

    public final PictureInPictureParams b(n nVar) {
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.f60057s;
        boolean z10 = false;
        sb2.setLength(0);
        int J = nVar.f60032a.J();
        l lVar = nVar.f60032a;
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
        int i7 = nVar.f60034c;
        Rect rect = this.f60054p;
        if (i7 != 2) {
            this.f60055q = e(nVar, rect);
        }
        if (this.f60055q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f60058t;
        arrayList2.clear();
        lVar.h0(this.f60042b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            k kVar = (k) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.f60042b.getPackageName());
            intent.putExtra("action_id", kVar.f60027a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f60042b, kVar.f60027a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.f60042b, kVar.f60028b);
            CharSequence charSequence = kVar.f60029c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(kVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.f60059u) {
            this.f60059u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.f60042b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.f60042b.registerReceiver(fVar, intentFilter);
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
            if (i13 >= 31 && nVar.f60034c != 2) {
                z10 = true;
            }
            builder.setAutoEnterEnabled(z10);
            sb2.append('|');
            sb2.append(z10);
        }
        this.f60056r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.f60059u && (launchActivity = this.f60042b) != null) {
            this.f60059u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        q qVar = this.f60043c;
        if (qVar != null) {
            g0.E2(qVar);
            this.f60043c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.a();
            this.d = null;
        }
        this.f60042b = null;
        this.f60044e = null;
        this.f60045f = null;
        this.f60046g = null;
        this.f60048j = false;
    }

    public final void d() {
        h hVar;
        n nVar = this.f60045f;
        o oVar = this.f60046g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f60045f = null;
        this.f60046g = null;
        this.h = null;
        this.f60047i = false;
        this.f60053o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b(false);
        }
        q qVar = this.f60043c;
        if (qVar != null) {
            qVar.a(null, null);
        }
        l2.i iVar = this.f60041a;
        if (nVar != null) {
            l lVar = nVar.f60032a;
            if (view != null) {
                nVar.f60034c = nVar.d;
                lVar.d(view);
                lVar.w(view);
                iVar.f();
                return;
            }
        }
        if (nVar != null && oVar != null) {
            if (nVar.d == 1 && (hVar = nVar.f60035e) != null) {
                nVar.f60034c = 1;
                hVar.f59998j = oVar;
                g0.E2(oVar);
                hVar.f59997i.addView(oVar, 0, ma.c(-1.0f, -1));
                hVar.a();
                hVar.k();
            } else {
                nVar.f60034c = 0;
                SurfaceTexture surfaceTexture = oVar.f60038a;
                oVar.f60038a = null;
                if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                    surfaceTexture = z8.c();
                }
                if (surfaceTexture != null) {
                    nVar.f60032a.D(surfaceTexture);
                }
            }
            iVar.f();
            return;
        }
        iVar.f();
    }

    public final boolean e(n nVar, Rect rect) {
        if (this.f60042b != null) {
            if (nVar.e()) {
                h hVar = nVar.f60035e;
                RectF rectF = this.f60050l;
                hVar.g(rectF);
                rectF.round(rect);
            } else {
                nVar.f60032a.u(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.f60042b.getWindow().getDecorView();
                int[] iArr = this.f60051m;
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
        if (Build.VERSION.SDK_INT >= 35 && e2.s(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f60045f == null && (nVar = this.f60044e) != null) {
            i(nVar);
        }
    }

    public final void g() {
        int i7;
        if (this.f60042b != null && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 < 31 && this.f60045f == null) {
            j();
            n nVar = this.f60044e;
            if (nVar != null) {
                PictureInPictureParams b10 = b(nVar);
                i(this.f60044e);
                try {
                    if (!this.f60042b.enterPictureInPictureMode(b10)) {
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
        x xVar = this.f60049k;
        if (xVar != null) {
            try {
                synchronized (x.f55496b) {
                    x.f55497c.remove(xVar.f55498a.f55238i);
                }
                xVar.f55498a.r();
            } catch (Exception unused) {
            }
            this.f60049k = null;
        }
    }

    public final void i(n nVar) {
        View view;
        boolean z10;
        h hVar;
        if (this.f60043c != null && this.f60042b != null) {
            StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
            int i7 = nVar.f60034c;
            l lVar = nVar.f60032a;
            sb2.append(i7);
            l2.i.g(sb2.toString());
            Rect rect = new Rect();
            if (!e(nVar, rect)) {
                rect.setEmpty();
            }
            this.f60045f = nVar;
            o oVar = null;
            this.f60044e = null;
            this.f60053o = true;
            nVar.d = nVar.f60034c;
            if (nVar.f60035e == null) {
                view = lVar.v(this.f60042b);
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
                this.f60043c.a(view, rect);
                lVar.X(view);
            } else if (nVar.f60034c == 1 && (hVar = nVar.f60035e) != null) {
                o oVar2 = hVar.f59998j;
                hVar.f59998j = null;
                hVar.d();
                hVar.l();
                if (oVar2 != null) {
                    g0.E2(oVar2);
                }
                this.f60043c.a(oVar2, rect);
                oVar = oVar2;
            } else {
                oVar = new o(this.f60042b);
                this.f60043c.a(oVar, rect);
                lVar.i(oVar);
            }
            this.f60043c.bringToFront();
            this.f60046g = oVar;
            this.h = view;
            nVar.f60034c = 2;
            k(nVar);
        }
    }

    public final void j() {
        n nVar;
        h hVar;
        LaunchActivity launchActivity = this.f60042b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            n nVar2 = this.f60045f;
            if (nVar2 != null) {
                if (!this.f60053o) {
                    a(nVar2);
                }
                k(this.f60045f);
                return;
            }
            if (nd.b(launchActivity) && !nd.a(this.f60042b)) {
                ArrayList arrayList = (ArrayList) this.f60041a.f19437c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        nVar = (n) arrayList.get(size);
                        int i7 = nVar.f60034c;
                        l lVar = nVar.f60032a;
                        if (i7 == 0 && lVar.E() == null && lVar.G() && lVar.N()) {
                            break;
                        }
                        size--;
                    } else {
                        nVar = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            n nVar3 = (n) arrayList.get(size2);
                            int i10 = nVar3.f60034c;
                            l lVar2 = nVar3.f60032a;
                            if (i10 == 1 && lVar2.N() && ((hVar = nVar3.f60035e) == null ? !(!nVar3.f60036f || nVar3.f60037g) : !(hVar.f59995f || hVar.f59999k != null)) && (nVar == null || lVar2.e() > nVar.f60032a.e())) {
                                nVar = nVar3;
                            }
                        }
                        if (nVar == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                n nVar4 = (n) arrayList.get(size3);
                                int i11 = nVar4.f60034c;
                                l lVar3 = nVar4.f60032a;
                                if (i11 == 0 && lVar3.S() && lVar3.N() && (nVar == null || lVar3.e() > nVar.f60032a.e())) {
                                    nVar = nVar4;
                                }
                            }
                        }
                    }
                }
            } else {
                nVar = null;
            }
            this.f60044e = nVar;
            if (nVar != null) {
                this.f60048j = true;
                a(nVar);
            } else if (this.f60048j) {
                this.f60048j = false;
                this.f60052n = null;
                g0.b3(this.f60042b);
            }
            h();
        }
    }

    public final void k(n nVar) {
        c1 c1Var;
        if (nVar != null) {
            c1Var = nVar.f60032a.Q();
        } else {
            c1Var = null;
        }
        if (c1Var == null) {
            h();
            return;
        }
        x xVar = this.f60049k;
        if (xVar != null && xVar.f55498a.f55249t.f55332a == c1Var) {
            return;
        }
        h();
        try {
            r rVar = new r(this.f60042b, c1Var);
            rVar.f55461c = "utils-pip-media-session";
            this.f60049k = rVar.a();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
