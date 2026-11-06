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
import c8.jc;
import e2.c1;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.z8;
import org.telegram.ui.LaunchActivity;
import p4.x;
public final class r {
    public final l2.i f56043a;
    public LaunchActivity f56044b;
    public s f56045c;
    public v0 d;
    public o f56046e;
    public o f56047f;
    public q f56048g;
    public View h;
    public boolean f56049i;
    public boolean f56050j;
    public x f56051k;
    public final RectF f56052l;
    public final int[] f56053m;
    public String f56054n;
    public boolean f56055o;
    public final Rect f56056p;
    public boolean f56057q;
    public String f56058r;
    public final StringBuilder f56059s;
    public final ArrayList f56060t;
    public boolean f56061u;
    public final androidx.mediarouter.app.f v;

    public r(l2.i iVar) {
        new Rect();
        this.f56052l = new RectF();
        this.f56053m = new int[2];
        this.f56056p = new Rect();
        this.f56059s = new StringBuilder();
        this.f56060t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.f56043a = iVar;
    }

    public final void a(o oVar) {
        PictureInPictureParams b10 = b(oVar);
        String str = this.f56058r;
        if (str != null && str.equals(this.f56054n)) {
            return;
        }
        this.f56054n = this.f56058r;
        g0.w3(this.f56044b, b10);
    }

    public final PictureInPictureParams b(o oVar) {
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.f56059s;
        boolean z9 = false;
        sb2.setLength(0);
        int I = oVar.f56031a.I();
        m mVar = oVar.f56031a;
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
        int i7 = oVar.f56033c;
        Rect rect = this.f56056p;
        if (i7 != 2) {
            this.f56057q = e(oVar, rect);
        }
        if (this.f56057q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f56060t;
        arrayList2.clear();
        mVar.Z(this.f56044b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            l lVar = (l) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.f56044b.getPackageName());
            intent.putExtra("action_id", lVar.f56026a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f56044b, lVar.f56026a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.f56044b, lVar.f56027b);
            CharSequence charSequence = lVar.f56028c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(lVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.f56061u) {
            this.f56061u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.f56044b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.f56044b.registerReceiver(fVar, intentFilter);
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
            if (i13 >= 31 && oVar.f56033c != 2) {
                z9 = true;
            }
            builder.setAutoEnterEnabled(z9);
            sb2.append('|');
            sb2.append(z9);
        }
        this.f56058r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.f56061u && (launchActivity = this.f56044b) != null) {
            this.f56061u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        s sVar = this.f56045c;
        if (sVar != null) {
            g0.E2(sVar);
            this.f56045c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b();
            this.d = null;
        }
        this.f56044b = null;
        this.f56046e = null;
        this.f56047f = null;
        this.f56048g = null;
        this.f56050j = false;
    }

    public final void d() {
        i iVar;
        o oVar = this.f56047f;
        q qVar = this.f56048g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f56047f = null;
        this.f56048g = null;
        this.h = null;
        this.f56049i = false;
        this.f56055o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.c(false);
        }
        s sVar = this.f56045c;
        if (sVar != null) {
            sVar.a(null, null);
        }
        l2.i iVar2 = this.f56043a;
        if (oVar != null) {
            m mVar = oVar.f56031a;
            if (view != null) {
                oVar.f56033c = oVar.d;
                mVar.e(view);
                mVar.y(view);
                iVar2.f();
                return;
            }
        }
        if (oVar != null && qVar != null) {
            if (oVar.d == 1 && (iVar = oVar.f56034e) != null) {
                oVar.f56033c = 1;
                iVar.f55997j = qVar;
                g0.E2(qVar);
                iVar.f55996i.addView(qVar, 0, ha.c(-1.0f, -1));
                iVar.a();
                iVar.k();
            } else {
                oVar.f56033c = 0;
                SurfaceTexture surfaceTexture = qVar.f56040a;
                qVar.f56040a = null;
                if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                    surfaceTexture = z8.c();
                }
                if (surfaceTexture != null) {
                    oVar.f56031a.C(surfaceTexture);
                }
            }
            iVar2.f();
            return;
        }
        iVar2.f();
    }

    public final boolean e(o oVar, Rect rect) {
        if (this.f56044b != null) {
            if (oVar.e()) {
                i iVar = oVar.f56034e;
                RectF rectF = this.f56052l;
                iVar.g(rectF);
                rectF.round(rect);
            } else {
                oVar.f56031a.v(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.f56044b.getWindow().getDecorView();
                int[] iArr = this.f56053m;
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
        if (Build.VERSION.SDK_INT >= 35 && com.google.android.recaptcha.internal.a.u(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f56047f == null && (oVar = this.f56046e) != null) {
            i(oVar);
        }
    }

    public final void g() {
        int i7;
        if (this.f56044b != null && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 < 31 && this.f56047f == null) {
            j();
            o oVar = this.f56046e;
            if (oVar != null) {
                PictureInPictureParams b10 = b(oVar);
                i(this.f56046e);
                try {
                    if (!this.f56044b.enterPictureInPictureMode(b10)) {
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
        x xVar = this.f56051k;
        if (xVar != null) {
            try {
                synchronized (x.f53370b) {
                    x.f53371c.remove(xVar.f53372a.f53115i);
                }
                xVar.f53372a.r();
            } catch (Exception unused) {
            }
            this.f56051k = null;
        }
    }

    public final void i(o oVar) {
        View view;
        boolean z9;
        i iVar;
        if (this.f56045c != null && this.f56044b != null) {
            StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
            int i7 = oVar.f56033c;
            m mVar = oVar.f56031a;
            sb2.append(i7);
            l2.i.g(sb2.toString());
            Rect rect = new Rect();
            if (!e(oVar, rect)) {
                rect.setEmpty();
            }
            this.f56047f = oVar;
            q qVar = null;
            this.f56046e = null;
            this.f56055o = true;
            oVar.d = oVar.f56033c;
            if (oVar.f56034e == null) {
                view = mVar.x(this.f56044b);
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
                this.f56045c.a(view, rect);
                mVar.S(view);
            } else if (oVar.f56033c == 1 && (iVar = oVar.f56034e) != null) {
                q qVar2 = iVar.f55997j;
                iVar.f55997j = null;
                iVar.d();
                iVar.l();
                if (qVar2 != null) {
                    g0.E2(qVar2);
                }
                this.f56045c.a(qVar2, rect);
                qVar = qVar2;
            } else {
                qVar = new q(this.f56044b);
                this.f56045c.a(qVar, rect);
                mVar.g(qVar);
            }
            this.f56045c.bringToFront();
            this.f56048g = qVar;
            this.h = view;
            oVar.f56033c = 2;
        }
    }

    public final void j() {
        o oVar;
        i iVar;
        LaunchActivity launchActivity = this.f56044b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            o oVar2 = this.f56047f;
            if (oVar2 != null) {
                if (!this.f56055o) {
                    a(oVar2);
                }
                k(this.f56047f);
                return;
            }
            if (jc.b(launchActivity) && !jc.a(this.f56044b)) {
                ArrayList arrayList = (ArrayList) this.f56043a.f17846c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        oVar = (o) arrayList.get(size);
                        int i7 = oVar.f56033c;
                        m mVar = oVar.f56031a;
                        if (i7 == 0 && mVar.D() == null && mVar.E() && mVar.K()) {
                            break;
                        }
                        size--;
                    } else {
                        oVar = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            o oVar3 = (o) arrayList.get(size2);
                            int i10 = oVar3.f56033c;
                            m mVar2 = oVar3.f56031a;
                            if (i10 == 1 && mVar2.K() && ((iVar = oVar3.f56034e) == null ? !(!oVar3.f56035f || oVar3.f56036g) : !(iVar.f55994f || iVar.f55998k != null)) && (oVar == null || mVar2.j() > oVar.f56031a.j())) {
                                oVar = oVar3;
                            }
                        }
                        if (oVar == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                o oVar4 = (o) arrayList.get(size3);
                                int i11 = oVar4.f56033c;
                                m mVar3 = oVar4.f56031a;
                                if (i11 == 0 && mVar3.P() && mVar3.K() && (oVar == null || mVar3.j() > oVar.f56031a.j())) {
                                    oVar = oVar4;
                                }
                            }
                        }
                    }
                }
            } else {
                oVar = null;
            }
            this.f56046e = oVar;
            if (oVar != null) {
                this.f56050j = true;
                a(oVar);
            } else if (this.f56050j) {
                this.f56050j = false;
                this.f56054n = null;
                g0.c3(this.f56044b);
            }
            k(this.f56046e);
        }
    }

    public final void k(o oVar) {
        c1 c1Var;
        if (oVar != null) {
            c1Var = oVar.f56031a.M();
        } else {
            c1Var = null;
        }
        if (c1Var == null) {
            h();
            return;
        }
        x xVar = this.f56051k;
        if (xVar != null && xVar.f53372a.f53126t.f53188a == c1Var) {
            return;
        }
        h();
        try {
            p4.r rVar = new p4.r(this.f56044b, c1Var);
            rVar.f53338c = "utils-pip-media-session";
            this.f56051k = rVar.a();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
