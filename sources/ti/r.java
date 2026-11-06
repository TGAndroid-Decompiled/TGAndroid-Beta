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
    public final l2.i f56018a;
    public LaunchActivity f56019b;
    public s f56020c;
    public v0 d;
    public o f56021e;
    public o f56022f;
    public q f56023g;
    public View h;
    public boolean f56024i;
    public boolean f56025j;
    public x f56026k;
    public final RectF f56027l;
    public final int[] f56028m;
    public String f56029n;
    public boolean f56030o;
    public final Rect f56031p;
    public boolean f56032q;
    public String f56033r;
    public final StringBuilder f56034s;
    public final ArrayList f56035t;
    public boolean f56036u;
    public final androidx.mediarouter.app.f v;

    public r(l2.i iVar) {
        new Rect();
        this.f56027l = new RectF();
        this.f56028m = new int[2];
        this.f56031p = new Rect();
        this.f56034s = new StringBuilder();
        this.f56035t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.f56018a = iVar;
    }

    public final void a(o oVar) {
        PictureInPictureParams b10 = b(oVar);
        String str = this.f56033r;
        if (str != null && str.equals(this.f56029n)) {
            return;
        }
        this.f56029n = this.f56033r;
        g0.w3(this.f56019b, b10);
    }

    public final PictureInPictureParams b(o oVar) {
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.f56034s;
        boolean z9 = false;
        sb2.setLength(0);
        int I = oVar.f56006a.I();
        m mVar = oVar.f56006a;
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
        int i7 = oVar.f56008c;
        Rect rect = this.f56031p;
        if (i7 != 2) {
            this.f56032q = e(oVar, rect);
        }
        if (this.f56032q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f56035t;
        arrayList2.clear();
        mVar.Z(this.f56019b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            l lVar = (l) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.f56019b.getPackageName());
            intent.putExtra("action_id", lVar.f56001a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f56019b, lVar.f56001a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.f56019b, lVar.f56002b);
            CharSequence charSequence = lVar.f56003c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(lVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.f56036u) {
            this.f56036u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.f56019b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.f56019b.registerReceiver(fVar, intentFilter);
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
            if (i13 >= 31 && oVar.f56008c != 2) {
                z9 = true;
            }
            builder.setAutoEnterEnabled(z9);
            sb2.append('|');
            sb2.append(z9);
        }
        this.f56033r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.f56036u && (launchActivity = this.f56019b) != null) {
            this.f56036u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        s sVar = this.f56020c;
        if (sVar != null) {
            g0.E2(sVar);
            this.f56020c = null;
        }
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.b();
            this.d = null;
        }
        this.f56019b = null;
        this.f56021e = null;
        this.f56022f = null;
        this.f56023g = null;
        this.f56025j = false;
    }

    public final void d() {
        i iVar;
        o oVar = this.f56022f;
        q qVar = this.f56023g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f56022f = null;
        this.f56023g = null;
        this.h = null;
        this.f56024i = false;
        this.f56030o = false;
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.c(false);
        }
        s sVar = this.f56020c;
        if (sVar != null) {
            sVar.a(null, null);
        }
        l2.i iVar2 = this.f56018a;
        if (oVar != null) {
            m mVar = oVar.f56006a;
            if (view != null) {
                oVar.f56008c = oVar.d;
                mVar.e(view);
                mVar.y(view);
                iVar2.f();
                return;
            }
        }
        if (oVar != null && qVar != null) {
            if (oVar.d == 1 && (iVar = oVar.f56009e) != null) {
                oVar.f56008c = 1;
                iVar.f55972j = qVar;
                g0.E2(qVar);
                iVar.f55971i.addView(qVar, 0, ha.c(-1.0f, -1));
                iVar.a();
                iVar.k();
            } else {
                oVar.f56008c = 0;
                SurfaceTexture surfaceTexture = qVar.f56015a;
                qVar.f56015a = null;
                if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                    surfaceTexture = z8.c();
                }
                if (surfaceTexture != null) {
                    oVar.f56006a.C(surfaceTexture);
                }
            }
            iVar2.f();
            return;
        }
        iVar2.f();
    }

    public final boolean e(o oVar, Rect rect) {
        if (this.f56019b != null) {
            if (oVar.e()) {
                i iVar = oVar.f56009e;
                RectF rectF = this.f56027l;
                iVar.g(rectF);
                rectF.round(rect);
            } else {
                oVar.f56006a.v(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.f56019b.getWindow().getDecorView();
                int[] iArr = this.f56028m;
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
        if (Build.VERSION.SDK_INT >= 35 && com.google.android.recaptcha.internal.a.u(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f56022f == null && (oVar = this.f56021e) != null) {
            i(oVar);
        }
    }

    public final void g() {
        int i7;
        if (this.f56019b != null && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 < 31 && this.f56022f == null) {
            j();
            o oVar = this.f56021e;
            if (oVar != null) {
                PictureInPictureParams b10 = b(oVar);
                i(this.f56021e);
                try {
                    if (!this.f56019b.enterPictureInPictureMode(b10)) {
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
        x xVar = this.f56026k;
        if (xVar != null) {
            try {
                synchronized (x.f53344b) {
                    x.f53345c.remove(xVar.f53346a.f53089i);
                }
                xVar.f53346a.r();
            } catch (Exception unused) {
            }
            this.f56026k = null;
        }
    }

    public final void i(o oVar) {
        View view;
        boolean z9;
        i iVar;
        if (this.f56020c != null && this.f56019b != null) {
            StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
            int i7 = oVar.f56008c;
            m mVar = oVar.f56006a;
            sb2.append(i7);
            l2.i.g(sb2.toString());
            Rect rect = new Rect();
            if (!e(oVar, rect)) {
                rect.setEmpty();
            }
            this.f56022f = oVar;
            q qVar = null;
            this.f56021e = null;
            this.f56030o = true;
            oVar.d = oVar.f56008c;
            if (oVar.f56009e == null) {
                view = mVar.x(this.f56019b);
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
                this.f56020c.a(view, rect);
                mVar.S(view);
            } else if (oVar.f56008c == 1 && (iVar = oVar.f56009e) != null) {
                q qVar2 = iVar.f55972j;
                iVar.f55972j = null;
                iVar.d();
                iVar.l();
                if (qVar2 != null) {
                    g0.E2(qVar2);
                }
                this.f56020c.a(qVar2, rect);
                qVar = qVar2;
            } else {
                qVar = new q(this.f56019b);
                this.f56020c.a(qVar, rect);
                mVar.g(qVar);
            }
            this.f56020c.bringToFront();
            this.f56023g = qVar;
            this.h = view;
            oVar.f56008c = 2;
        }
    }

    public final void j() {
        o oVar;
        i iVar;
        LaunchActivity launchActivity = this.f56019b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            o oVar2 = this.f56022f;
            if (oVar2 != null) {
                if (!this.f56030o) {
                    a(oVar2);
                }
                k(this.f56022f);
                return;
            }
            if (jc.b(launchActivity) && !jc.a(this.f56019b)) {
                ArrayList arrayList = (ArrayList) this.f56018a.f17846c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        oVar = (o) arrayList.get(size);
                        int i7 = oVar.f56008c;
                        m mVar = oVar.f56006a;
                        if (i7 == 0 && mVar.D() == null && mVar.E() && mVar.K()) {
                            break;
                        }
                        size--;
                    } else {
                        oVar = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            o oVar3 = (o) arrayList.get(size2);
                            int i10 = oVar3.f56008c;
                            m mVar2 = oVar3.f56006a;
                            if (i10 == 1 && mVar2.K() && ((iVar = oVar3.f56009e) == null ? !(!oVar3.f56010f || oVar3.f56011g) : !(iVar.f55969f || iVar.f55973k != null)) && (oVar == null || mVar2.j() > oVar.f56006a.j())) {
                                oVar = oVar3;
                            }
                        }
                        if (oVar == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                o oVar4 = (o) arrayList.get(size3);
                                int i11 = oVar4.f56008c;
                                m mVar3 = oVar4.f56006a;
                                if (i11 == 0 && mVar3.P() && mVar3.K() && (oVar == null || mVar3.j() > oVar.f56006a.j())) {
                                    oVar = oVar4;
                                }
                            }
                        }
                    }
                }
            } else {
                oVar = null;
            }
            this.f56021e = oVar;
            if (oVar != null) {
                this.f56025j = true;
                a(oVar);
            } else if (this.f56025j) {
                this.f56025j = false;
                this.f56029n = null;
                g0.c3(this.f56019b);
            }
            k(this.f56021e);
        }
    }

    public final void k(o oVar) {
        c1 c1Var;
        if (oVar != null) {
            c1Var = oVar.f56006a.M();
        } else {
            c1Var = null;
        }
        if (c1Var == null) {
            h();
            return;
        }
        x xVar = this.f56026k;
        if (xVar != null && xVar.f53346a.f53100t.f53162a == c1Var) {
            return;
        }
        h();
        try {
            p4.r rVar = new p4.r(this.f56019b, c1Var);
            rVar.f53312c = "utils-pip-media-session";
            this.f56026k = rVar.a();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
