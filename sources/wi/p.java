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
import bg.u0;
import c8.ja;
import c8.kd;
import com.google.android.gms.internal.vision.e2;
import e2.c1;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.LaunchActivity;
import p4.r;
import p4.x;
public final class p {
    public final l2.i f59431a;
    public LaunchActivity f59432b;
    public q f59433c;
    public u0 d;
    public n f59434e;
    public n f59435f;
    public o f59436g;
    public View h;
    public boolean f59437i;
    public boolean f59438j;
    public x f59439k;
    public final RectF f59440l;
    public final int[] f59441m;
    public String f59442n;
    public boolean f59443o;
    public final Rect f59444p;
    public boolean f59445q;
    public String f59446r;
    public final StringBuilder f59447s;
    public final ArrayList f59448t;
    public boolean f59449u;
    public final androidx.mediarouter.app.f v;

    public p(l2.i iVar) {
        new Rect();
        this.f59440l = new RectF();
        this.f59441m = new int[2];
        this.f59444p = new Rect();
        this.f59447s = new StringBuilder();
        this.f59448t = new ArrayList();
        this.v = new androidx.mediarouter.app.f(this, 13);
        this.f59431a = iVar;
    }

    public final void a(n nVar) {
        PictureInPictureParams b10 = b(nVar);
        String str = this.f59446r;
        if (str != null && str.equals(this.f59442n)) {
            return;
        }
        this.f59442n = this.f59446r;
        g0.v3(this.f59432b, b10);
    }

    public final PictureInPictureParams b(n nVar) {
        Rational rational;
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        StringBuilder sb2 = this.f59447s;
        boolean z10 = false;
        sb2.setLength(0);
        int L = nVar.f59422a.L();
        l lVar = nVar.f59422a;
        int b02 = lVar.b0();
        if (L > 0 && b02 > 0) {
            float f10 = L / b02;
            if (f10 < 0.45f) {
                rational = new Rational(45, 100);
            } else if (f10 > 2.35f) {
                rational = new Rational(235, 100);
            } else {
                rational = new Rational(L, b02);
            }
            builder.setAspectRatio(rational);
            sb2.append(rational);
        }
        int i7 = nVar.f59424c;
        Rect rect = this.f59444p;
        if (i7 != 2) {
            this.f59445q = e(nVar, rect);
        }
        if (this.f59445q) {
            builder.setSourceRectHint(rect);
            sb2.append('|');
            sb2.append(rect.toShortString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f59448t;
        arrayList2.clear();
        lVar.j0(this.f59432b.getMaxNumPictureInPictureActions(), arrayList2);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            k kVar = (k) arrayList2.get(i10);
            Intent intent = new Intent("org.telegram.utils.pip.ACTION");
            intent.setPackage(this.f59432b.getPackageName());
            intent.putExtra("action_id", kVar.f59417a);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f59432b, kVar.f59417a, intent, 201326592);
            Icon createWithResource = Icon.createWithResource(this.f59432b, kVar.f59418b);
            CharSequence charSequence = kVar.f59419c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, charSequence, charSequence, broadcast);
            remoteAction.setEnabled(kVar.d);
            arrayList.add(remoteAction);
        }
        arrayList2.clear();
        if (!arrayList.isEmpty() && !this.f59449u) {
            this.f59449u = true;
            IntentFilter intentFilter = new IntentFilter("org.telegram.utils.pip.ACTION");
            int i11 = Build.VERSION.SDK_INT;
            androidx.mediarouter.app.f fVar = this.v;
            if (i11 >= 33) {
                this.f59432b.registerReceiver(fVar, intentFilter, 4);
            } else {
                this.f59432b.registerReceiver(fVar, intentFilter);
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
            if (i13 >= 31 && nVar.f59424c != 2) {
                z10 = true;
            }
            builder.setAutoEnterEnabled(z10);
            sb2.append('|');
            sb2.append(z10);
        }
        this.f59446r = sb2.toString();
        return builder.build();
    }

    public final void c() {
        LaunchActivity launchActivity;
        h();
        if (this.f59449u && (launchActivity = this.f59432b) != null) {
            this.f59449u = false;
            try {
                launchActivity.unregisterReceiver(this.v);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        q qVar = this.f59433c;
        if (qVar != null) {
            g0.E2(qVar);
            this.f59433c = null;
        }
        u0 u0Var = this.d;
        if (u0Var != null) {
            u0Var.b();
            this.d = null;
        }
        this.f59432b = null;
        this.f59434e = null;
        this.f59435f = null;
        this.f59436g = null;
        this.f59438j = false;
    }

    public final void d() {
        h hVar;
        n nVar = this.f59435f;
        o oVar = this.f59436g;
        View view = this.h;
        l2.i.g("system: exit to app");
        this.f59435f = null;
        this.f59436g = null;
        this.h = null;
        this.f59437i = false;
        this.f59443o = false;
        u0 u0Var = this.d;
        if (u0Var != null) {
            u0Var.c(false);
        }
        q qVar = this.f59433c;
        if (qVar != null) {
            qVar.a(null, null);
        }
        l2.i iVar = this.f59431a;
        if (nVar != null) {
            l lVar = nVar.f59422a;
            if (view != null) {
                nVar.f59424c = nVar.d;
                lVar.a(view);
                lVar.x(view);
                iVar.f();
                return;
            }
        }
        if (nVar != null && oVar != null) {
            if (nVar.d == 1 && (hVar = nVar.f59425e) != null) {
                nVar.f59424c = 1;
                hVar.f59388j = oVar;
                g0.E2(oVar);
                hVar.f59387i.addView(oVar, 0, ja.c(-1.0f, -1));
                hVar.a();
                hVar.k();
            } else {
                nVar.f59424c = 0;
                SurfaceTexture surfaceTexture = oVar.f59428a;
                oVar.f59428a = null;
                if (surfaceTexture == null && Build.VERSION.SDK_INT >= 26) {
                    surfaceTexture = f9.b.d();
                }
                if (surfaceTexture != null) {
                    nVar.f59422a.C(surfaceTexture);
                }
            }
            iVar.f();
            return;
        }
        iVar.f();
    }

    public final boolean e(n nVar, Rect rect) {
        if (this.f59432b != null) {
            if (nVar.e()) {
                h hVar = nVar.f59425e;
                RectF rectF = this.f59440l;
                hVar.g(rectF);
                rectF.round(rect);
            } else {
                nVar.f59422a.u(rect);
            }
            if (!rect.isEmpty()) {
                View decorView = this.f59432b.getWindow().getDecorView();
                int[] iArr = this.f59441m;
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
        if (Build.VERSION.SDK_INT >= 35 && e2.s(obj) && ((PictureInPictureUiState) obj).isTransitioningToPip() && this.f59435f == null && (nVar = this.f59434e) != null) {
            i(nVar);
        }
    }

    public final void g() {
        int i7;
        if (this.f59432b != null && (i7 = Build.VERSION.SDK_INT) >= 26 && i7 < 31 && this.f59435f == null) {
            j();
            n nVar = this.f59434e;
            if (nVar != null) {
                PictureInPictureParams b10 = b(nVar);
                i(this.f59434e);
                try {
                    if (!this.f59432b.enterPictureInPictureMode(b10)) {
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
        x xVar = this.f59439k;
        if (xVar != null) {
            try {
                synchronized (x.f54879b) {
                    x.f54880c.remove(xVar.f54881a.f54624i);
                }
                xVar.f54881a.r();
            } catch (Exception unused) {
            }
            this.f59439k = null;
        }
    }

    public final void i(n nVar) {
        View view;
        boolean z10;
        h hVar;
        if (this.f59433c != null && this.f59432b != null) {
            StringBuilder sb2 = new StringBuilder("system: start enter, from state ");
            int i7 = nVar.f59424c;
            l lVar = nVar.f59422a;
            sb2.append(i7);
            l2.i.g(sb2.toString());
            Rect rect = new Rect();
            if (!e(nVar, rect)) {
                rect.setEmpty();
            }
            this.f59435f = nVar;
            o oVar = null;
            this.f59434e = null;
            this.f59443o = true;
            nVar.d = nVar.f59424c;
            if (nVar.f59425e == null) {
                view = lVar.w(this.f59432b);
            } else {
                view = null;
            }
            if (view != null && rect.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0 u0Var = this.d;
            if (u0Var != null && !z10) {
                u0Var.c(true);
            }
            if (view != null) {
                if (z10) {
                    view.setVisibility(4);
                }
                this.f59433c.a(view, rect);
                lVar.Y(view);
            } else if (nVar.f59424c == 1 && (hVar = nVar.f59425e) != null) {
                o oVar2 = hVar.f59388j;
                hVar.f59388j = null;
                hVar.d();
                hVar.l();
                if (oVar2 != null) {
                    g0.E2(oVar2);
                }
                this.f59433c.a(oVar2, rect);
                oVar = oVar2;
            } else {
                oVar = new o(this.f59432b);
                this.f59433c.a(oVar, rect);
                lVar.j(oVar);
            }
            this.f59433c.bringToFront();
            this.f59436g = oVar;
            this.h = view;
            nVar.f59424c = 2;
            k(nVar);
        }
    }

    public final void j() {
        n nVar;
        h hVar;
        LaunchActivity launchActivity = this.f59432b;
        if (launchActivity != null && Build.VERSION.SDK_INT >= 26) {
            n nVar2 = this.f59435f;
            if (nVar2 != null) {
                if (!this.f59443o) {
                    a(nVar2);
                }
                k(this.f59435f);
                return;
            }
            if (kd.b(launchActivity) && !kd.a(this.f59432b)) {
                ArrayList arrayList = (ArrayList) this.f59431a.f19042c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        nVar = (n) arrayList.get(size);
                        int i7 = nVar.f59424c;
                        l lVar = nVar.f59422a;
                        if (i7 == 0 && lVar.D() == null && lVar.F() && lVar.N()) {
                            break;
                        }
                        size--;
                    } else {
                        nVar = null;
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            n nVar3 = (n) arrayList.get(size2);
                            int i10 = nVar3.f59424c;
                            l lVar2 = nVar3.f59422a;
                            if (i10 == 1 && lVar2.N() && ((hVar = nVar3.f59425e) == null ? !(!nVar3.f59426f || nVar3.f59427g) : !(hVar.f59385f || hVar.f59389k != null)) && (nVar == null || lVar2.d() > nVar.f59422a.d())) {
                                nVar = nVar3;
                            }
                        }
                        if (nVar == null) {
                            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                                n nVar4 = (n) arrayList.get(size3);
                                int i11 = nVar4.f59424c;
                                l lVar3 = nVar4.f59422a;
                                if (i11 == 0 && lVar3.T() && lVar3.N() && (nVar == null || lVar3.d() > nVar.f59422a.d())) {
                                    nVar = nVar4;
                                }
                            }
                        }
                    }
                }
            } else {
                nVar = null;
            }
            this.f59434e = nVar;
            if (nVar != null) {
                this.f59438j = true;
                a(nVar);
            } else if (this.f59438j) {
                this.f59438j = false;
                this.f59442n = null;
                g0.c3(this.f59432b);
            }
            h();
        }
    }

    public final void k(n nVar) {
        c1 c1Var;
        if (nVar != null) {
            c1Var = nVar.f59422a.R();
        } else {
            c1Var = null;
        }
        if (c1Var == null) {
            h();
            return;
        }
        x xVar = this.f59439k;
        if (xVar != null && xVar.f54881a.f54635t.f54697a == c1Var) {
            return;
        }
        h();
        try {
            r rVar = new r(this.f59432b, c1Var);
            rVar.f54845c = "utils-pip-media-session";
            this.f59439k = rVar.a();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
