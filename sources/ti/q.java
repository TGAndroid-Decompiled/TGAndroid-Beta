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
    public final l2.i f56131a;
    public LaunchActivity f56132b;
    public r f56133c;
    public v0 d;
    public o f56134e;
    public o f56135f;
    public p f56136g;
    public View h;
    public boolean f56137i;
    public boolean f56138j;
    public x f56139k;
    public final RectF f56140l;
    public final int[] f56141m;
    public String f56142n;
    public boolean f56143o;
    public final Rect f56144p;
    public boolean f56145q;
    public String f56146r;
    public final StringBuilder f56147s;
    public final ArrayList f56148t;
    public boolean f56149u;
    public final androidx.mediarouter.app.f v;

    public q(l2.i iVar) {
        new Rect();
        this.f56140l = new RectF();
        this.f56141m = new int[2];
        this.f56144p = new Rect();
        this.f56147s = new StringBuilder();
        this.f56148t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.f56131a = iVar;
    }

    public final void a(o oVar) {
        PictureInPictureParams b10 = b(oVar);
        String str = this.f56146r;
        if (str != null && str.equals(this.f56142n)) {
            return;
        }
        this.f56142n = this.f56146r;
        g0.w3(this.f56132b, b10);
    }

    public final PictureInPictureParams b(o oVar) {
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.f56147s;
        boolean z9 = false;
        sb2.setLength(0);
        int I = oVar.f56122a.I();
        m mVar = oVar.f56122a;
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
        int i7 = oVar.f56124c;
        Rect rect = this.f56144p;
        if (i7 != 2) {
            this.f56145q = e(oVar, rect);
        }
        if (this.f56145q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f56148t;
        arrayList2.clear();
        mVar.Z(this.f56132b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            l lVar = (l) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.f56132b.getPackageName());
            intent.putExtra("action_id", lVar.f56117a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f56132b, lVar.f56117a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.f56132b, lVar.f56118b);
            CharSequence charSequence = lVar.f56119c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(lVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.f56149u) {
            this.f56149u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.f56132b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.f56132b.registerReceiver(fVar, intentFilter);
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
            if (i13 >= 31 && oVar.f56124c != 2) {
                z9 = true;
            }
            builder.setAutoEnterEnabled(z9);
            sb2.append('|');
            sb2.append(z9);
        }
        this.f56146r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.f56149u && (launchActivity = this.f56132b) != null) {
            this.f56149u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        r rVar = this.f56133c;
        if (rVar != null) {
            g0.E2(rVar);
            this.f56133c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b();
            this.d = null;
        }
        this.f56132b = null;
        this.f56134e = null;
        this.f56135f = null;
        this.f56136g = null;
        this.f56138j = false;
    }

    public final void d() {
        i iVar;
        o oVar = this.f56135f;
        p pVar = this.f56136g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f56135f = null;
        this.f56136g = null;
        this.h = null;
        this.f56137i = false;
        this.f56143o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.c(false);
        }
        r rVar = this.f56133c;
        if (rVar != null) {
            rVar.a(null, null);
        }
        l2.i iVar2 = this.f56131a;
        if (oVar != null) {
            m mVar = oVar.f56122a;
            if (view != null) {
                oVar.f56124c = oVar.d;
                mVar.e(view);
                mVar.y(view);
                iVar2.f();
                return;
            }
        }
        if (oVar != null && pVar != null) {
            if (oVar.d == 1 && (iVar = oVar.f56125e) != null) {
                oVar.f56124c = 1;
                iVar.f56088j = pVar;
                g0.E2(pVar);
                iVar.f56087i.addView(pVar, 0, ha.c(-1.0f, -1));
                iVar.a();
                iVar.k();
            } else {
                oVar.f56124c = 0;
                SurfaceTexture surfaceTexture = pVar.f56128a;
                pVar.f56128a = null;
                if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                    surfaceTexture = z8.c();
                }
                if (surfaceTexture != null) {
                    oVar.f56122a.C(surfaceTexture);
                }
            }
            iVar2.f();
            return;
        }
        iVar2.f();
    }

    public final boolean e(o oVar, Rect rect) {
        if (this.f56132b != null) {
            if (oVar.e()) {
                i iVar = oVar.f56125e;
                RectF rectF = this.f56140l;
                iVar.g(rectF);
                rectF.round(rect);
            } else {
                oVar.f56122a.v(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.f56132b.getWindow().getDecorView();
                int[] iArr = this.f56141m;
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
        if (Build.VERSION.SDK_INT >= 35 && com.google.android.recaptcha.internal.a.u(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f56135f == null && (oVar = this.f56134e) != null) {
            i(oVar);
        }
    }

    public final void g() {
        int i7;
        if (this.f56132b != null && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 < 31 && this.f56135f == null) {
            j();
            o oVar = this.f56134e;
            if (oVar != null) {
                PictureInPictureParams b10 = b(oVar);
                i(this.f56134e);
                try {
                    if (!this.f56132b.enterPictureInPictureMode(b10)) {
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
        x xVar = this.f56139k;
        if (xVar != null) {
            try {
                synchronized (x.f53461b) {
                    x.f53462c.remove(xVar.f53463a.f53206i);
                }
                xVar.f53463a.r();
            } catch (Exception unused) {
            }
            this.f56139k = null;
        }
    }

    public final void i(o oVar) {
        View view;
        boolean z9;
        i iVar;
        if (this.f56133c != null && this.f56132b != null) {
            StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
            int i7 = oVar.f56124c;
            m mVar = oVar.f56122a;
            sb2.append(i7);
            l2.i.g(sb2.toString());
            Rect rect = new Rect();
            if (!e(oVar, rect)) {
                rect.setEmpty();
            }
            this.f56135f = oVar;
            p pVar = null;
            this.f56134e = null;
            this.f56143o = true;
            oVar.d = oVar.f56124c;
            if (oVar.f56125e == null) {
                view = mVar.x(this.f56132b);
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
                this.f56133c.a(view, rect);
                mVar.S(view);
            } else if (oVar.f56124c == 1 && (iVar = oVar.f56125e) != null) {
                p pVar2 = iVar.f56088j;
                iVar.f56088j = null;
                iVar.d();
                iVar.l();
                if (pVar2 != null) {
                    g0.E2(pVar2);
                }
                this.f56133c.a(pVar2, rect);
                pVar = pVar2;
            } else {
                pVar = new p(this.f56132b);
                this.f56133c.a(pVar, rect);
                mVar.g(pVar);
            }
            this.f56133c.bringToFront();
            this.f56136g = pVar;
            this.h = view;
            oVar.f56124c = 2;
            k(oVar);
        }
    }

    public final void j() {
        o oVar;
        i iVar;
        LaunchActivity launchActivity = this.f56132b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            o oVar2 = this.f56135f;
            if (oVar2 != null) {
                if (!this.f56143o) {
                    a(oVar2);
                }
                k(this.f56135f);
                return;
            }
            if (kc.b(launchActivity) && !kc.a(this.f56132b)) {
                ArrayList arrayList = (ArrayList) this.f56131a.f17849c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        oVar = (o) arrayList.get(size);
                        int i7 = oVar.f56124c;
                        m mVar = oVar.f56122a;
                        if (i7 == 0 && mVar.D() == null && mVar.E() && mVar.K()) {
                            break;
                        }
                        size--;
                    } else {
                        oVar = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            o oVar3 = (o) arrayList.get(size2);
                            int i10 = oVar3.f56124c;
                            m mVar2 = oVar3.f56122a;
                            if (i10 == 1 && mVar2.K() && ((iVar = oVar3.f56125e) == null ? !(!oVar3.f56126f || oVar3.f56127g) : !(iVar.f56085f || iVar.f56089k != null)) && (oVar == null || mVar2.j() > oVar.f56122a.j())) {
                                oVar = oVar3;
                            }
                        }
                        if (oVar == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                o oVar4 = (o) arrayList.get(size3);
                                int i11 = oVar4.f56124c;
                                m mVar3 = oVar4.f56122a;
                                if (i11 == 0 && mVar3.P() && mVar3.K() && (oVar == null || mVar3.j() > oVar.f56122a.j())) {
                                    oVar = oVar4;
                                }
                            }
                        }
                    }
                }
            } else {
                oVar = null;
            }
            this.f56134e = oVar;
            if (oVar != null) {
                this.f56138j = true;
                a(oVar);
            } else if (this.f56138j) {
                this.f56138j = false;
                this.f56142n = null;
                g0.c3(this.f56132b);
            }
            h();
        }
    }

    public final void k(o oVar) {
        c1 c1Var;
        if (oVar != null) {
            c1Var = oVar.f56122a.M();
        } else {
            c1Var = null;
        }
        if (c1Var == null) {
            h();
            return;
        }
        x xVar = this.f56139k;
        if (xVar != null && xVar.f53463a.f53217t.f53279a == c1Var) {
            return;
        }
        h();
        try {
            p4.r rVar = new p4.r(this.f56132b, c1Var);
            rVar.f53429c = "utils-pip-media-session";
            this.f56139k = rVar.a();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
