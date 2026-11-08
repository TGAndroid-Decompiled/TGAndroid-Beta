package ti;

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
import c8.ha;
import c8.kc;
import e2.c1;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.z8;
import org.telegram.ui.LaunchActivity;
import p4.x;
public final class q {
    public final l2.i f56132a;
    public LaunchActivity f56133b;
    public r f56134c;
    public v0 d;
    public o f56135e;
    public o f56136f;
    public p f56137g;
    public View h;
    public boolean f56138i;
    public boolean f56139j;
    public x f56140k;
    public final RectF f56141l;
    public final int[] f56142m;
    public String f56143n;
    public boolean f56144o;
    public final Rect f56145p;
    public boolean f56146q;
    public String f56147r;
    public final StringBuilder f56148s;
    public final ArrayList f56149t;
    public boolean f56150u;
    public final androidx.mediarouter.app.f v;

    public q(l2.i iVar) {
        new Rect();
        this.f56141l = new RectF();
        this.f56142m = new int[2];
        this.f56145p = new Rect();
        this.f56148s = new StringBuilder();
        this.f56149t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.f56132a = iVar;
    }

    public final void a(o oVar) {
        PictureInPictureParams b10 = b(oVar);
        String str = this.f56147r;
        if (str != null && str.equals(this.f56143n)) {
            return;
        }
        this.f56143n = this.f56147r;
        g0.w3(this.f56133b, b10);
    }

    public final PictureInPictureParams b(o oVar) {
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.f56148s;
        boolean z9 = false;
        sb2.setLength(0);
        int I = oVar.f56123a.I();
        m mVar = oVar.f56123a;
        int U = mVar.U();
        if (I > 0 && U > 0) {
            float f10 = I / U;
            if (f10 < 0.45f) {
                rational = new Rational(45, 100);
            } else if (f10 > 2.35f) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(I, U);
            }
            builder.setAspectRatio(rational);
            sb2.append(rational);
        }
        int i7 = oVar.f56125c;
        Rect rect = this.f56145p;
        if (i7 != 2) {
            this.f56146q = e(oVar, rect);
        }
        if (this.f56146q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f56149t;
        arrayList2.clear();
        mVar.Z(this.f56133b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            l lVar = (l) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.f56133b.getPackageName());
            intent.putExtra("action_id", lVar.f56118a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f56133b, lVar.f56118a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.f56133b, lVar.f56119b);
            CharSequence charSequence = lVar.f56120c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(lVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.f56150u) {
            this.f56150u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.f56133b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.f56133b.registerReceiver(fVar, intentFilter);
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
            if (i13 >= 31 && oVar.f56125c != 2) {
                z9 = true;
            }
            builder.setAutoEnterEnabled(z9);
            sb2.append('|');
            sb2.append(z9);
        }
        this.f56147r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.f56150u && (launchActivity = this.f56133b) != null) {
            this.f56150u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        r rVar = this.f56134c;
        if (rVar != null) {
            g0.E2(rVar);
            this.f56134c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b();
            this.d = null;
        }
        this.f56133b = null;
        this.f56135e = null;
        this.f56136f = null;
        this.f56137g = null;
        this.f56139j = false;
    }

    public final void d() {
        i iVar;
        o oVar = this.f56136f;
        p pVar = this.f56137g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f56136f = null;
        this.f56137g = null;
        this.h = null;
        this.f56138i = false;
        this.f56144o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.c(false);
        }
        r rVar = this.f56134c;
        if (rVar != null) {
            rVar.a(null, null);
        }
        l2.i iVar2 = this.f56132a;
        if (oVar != null) {
            m mVar = oVar.f56123a;
            if (view != null) {
                oVar.f56125c = oVar.d;
                mVar.e(view);
                mVar.y(view);
                iVar2.f();
                return;
            }
        }
        if (oVar != null && pVar != null) {
            if (oVar.d == 1 && (iVar = oVar.f56126e) != null) {
                oVar.f56125c = 1;
                iVar.f56089j = pVar;
                g0.E2(pVar);
                iVar.f56088i.addView(pVar, 0, ha.c(-1.0f, -1));
                iVar.a();
                iVar.k();
            } else {
                oVar.f56125c = 0;
                SurfaceTexture surfaceTexture = pVar.f56129a;
                pVar.f56129a = null;
                if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                    surfaceTexture = z8.c();
                }
                if (surfaceTexture != null) {
                    oVar.f56123a.C(surfaceTexture);
                }
            }
            iVar2.f();
            return;
        }
        iVar2.f();
    }

    public final boolean e(o oVar, Rect rect) {
        if (this.f56133b != null) {
            if (oVar.e()) {
                i iVar = oVar.f56126e;
                RectF rectF = this.f56141l;
                iVar.g(rectF);
                rectF.round(rect);
            } else {
                oVar.f56123a.v(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.f56133b.getWindow().getDecorView();
                int[] iArr = this.f56142m;
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
        o oVar;
        if (Build.VERSION.SDK_INT >= 35 && com.google.android.recaptcha.internal.a.u(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f56136f == null && (oVar = this.f56135e) != null) {
            i(oVar);
        }
    }

    public final void g() {
        int i7;
        if (this.f56133b != null && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 < 31 && this.f56136f == null) {
            j();
            o oVar = this.f56135e;
            if (oVar != null) {
                PictureInPictureParams b10 = b(oVar);
                i(this.f56135e);
                try {
                    if (!this.f56133b.enterPictureInPictureMode(b10)) {
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
        x xVar = this.f56140k;
        if (xVar != null) {
            try {
                synchronized (x.f53462b) {
                    x.f53463c.remove(xVar.f53464a.f53207i);
                }
                xVar.f53464a.r();
            } catch (Exception unused) {
            }
            this.f56140k = null;
        }
    }

    public final void i(o oVar) {
        View view;
        boolean z9;
        i iVar;
        if (this.f56134c != null && this.f56133b != null) {
            StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
            int i7 = oVar.f56125c;
            m mVar = oVar.f56123a;
            sb2.append(i7);
            l2.i.g(sb2.toString());
            Rect rect = new Rect();
            if (!e(oVar, rect)) {
                rect.setEmpty();
            }
            this.f56136f = oVar;
            p pVar = null;
            this.f56135e = null;
            this.f56144o = true;
            oVar.d = oVar.f56125c;
            if (oVar.f56126e == null) {
                view = mVar.x(this.f56133b);
            } else {
                view = null;
            }
            if (view != null && rect.isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            v0 v0Var = this.d;
            if (v0Var != null && !z9) {
                v0Var.c(true);
            }
            if (view != null) {
                if (z9) {
                    view.setVisibility(4);
                }
                this.f56134c.a(view, rect);
                mVar.S(view);
            } else if (oVar.f56125c == 1 && (iVar = oVar.f56126e) != null) {
                p pVar2 = iVar.f56089j;
                iVar.f56089j = null;
                iVar.d();
                iVar.l();
                if (pVar2 != null) {
                    g0.E2(pVar2);
                }
                this.f56134c.a(pVar2, rect);
                pVar = pVar2;
            } else {
                pVar = new p(this.f56133b);
                this.f56134c.a(pVar, rect);
                mVar.g(pVar);
            }
            this.f56134c.bringToFront();
            this.f56137g = pVar;
            this.h = view;
            oVar.f56125c = 2;
            k(oVar);
        }
    }

    public final void j() {
        o oVar;
        i iVar;
        LaunchActivity launchActivity = this.f56133b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            o oVar2 = this.f56136f;
            if (oVar2 != null) {
                if (!this.f56144o) {
                    a(oVar2);
                }
                k(this.f56136f);
                return;
            }
            if (kc.b(launchActivity) && !kc.a(this.f56133b)) {
                ArrayList arrayList = (ArrayList) this.f56132a.f17849c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        oVar = (o) arrayList.get(size);
                        int i7 = oVar.f56125c;
                        m mVar = oVar.f56123a;
                        if (i7 == 0 && mVar.D() == null && mVar.E() && mVar.K()) {
                            break;
                        }
                        size--;
                    } else {
                        oVar = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            o oVar3 = (o) arrayList.get(size2);
                            int i10 = oVar3.f56125c;
                            m mVar2 = oVar3.f56123a;
                            if (i10 == 1 && mVar2.K() && ((iVar = oVar3.f56126e) == null ? !(!oVar3.f56127f || oVar3.f56128g) : !(iVar.f56086f || iVar.f56090k != null)) && (oVar == null || mVar2.j() > oVar.f56123a.j())) {
                                oVar = oVar3;
                            }
                        }
                        if (oVar == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                o oVar4 = (o) arrayList.get(size3);
                                int i11 = oVar4.f56125c;
                                m mVar3 = oVar4.f56123a;
                                if (i11 == 0 && mVar3.P() && mVar3.K() && (oVar == null || mVar3.j() > oVar.f56123a.j())) {
                                    oVar = oVar4;
                                }
                            }
                        }
                    }
                }
            } else {
                oVar = null;
            }
            this.f56135e = oVar;
            if (oVar != null) {
                this.f56139j = true;
                a(oVar);
            } else if (this.f56139j) {
                this.f56139j = false;
                this.f56143n = null;
                g0.c3(this.f56133b);
            }
            h();
        }
    }

    public final void k(o oVar) {
        c1 c1Var;
        if (oVar != null) {
            c1Var = oVar.f56123a.M();
        } else {
            c1Var = null;
        }
        if (c1Var == null) {
            h();
            return;
        }
        x xVar = this.f56140k;
        if (xVar != null && xVar.f53464a.f53218t.f53280a == c1Var) {
            return;
        }
        h();
        try {
            p4.r rVar = new p4.r(this.f56133b, c1Var);
            rVar.f53430c = "utils-pip-media-session";
            this.f56140k = rVar.a();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
