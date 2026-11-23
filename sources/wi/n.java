package wi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import bg.q0;
import bg.s0;
import bg.u0;
import c8.na;
import fi.u2;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pf;
import org.telegram.ui.LaunchActivity;
import v4.e0;
import wg.r;
public final class n {
    public final l f59997a;
    public final l2.i f59998b;
    public int f59999c = 0;
    public int d = 0;
    public h f60000e;
    public boolean f60001f;
    public boolean f60002g;

    public n(l2.i iVar, l lVar) {
        this.f59998b = iVar;
        this.f59997a = lVar;
    }

    public final void a(y10 y10Var) {
        h hVar;
        if (this.f59999c == 1 && (hVar = this.f60000e) != null) {
            this.f60000e = null;
            this.f59999c = 0;
            hVar.K = true;
            hVar.d();
            g0.h3(new r(6, hVar, y10Var), 100L);
            this.f59998b.f();
        }
    }

    public final void b() {
        boolean z10;
        int i7 = this.f59999c;
        if (i7 == 3) {
            return;
        }
        this.f59999c = 3;
        h hVar = this.f60000e;
        l2.i iVar = this.f59998b;
        l lVar = this.f59997a;
        if (hVar != null) {
            this.f60000e = null;
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Objects.requireNonNull(lVar);
            vg.d dVar = new vg.d(lVar, 11);
            if (!hVar.K) {
                hVar.K = true;
                hVar.d();
                r1.g gVar = hVar.D;
                if (gVar != null) {
                    gVar.d();
                    hVar.E.d();
                }
                if (z10 && hVar.f59961g) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(nr.f37917f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 0.1f));
                    animatorSet.addListener(new h10(24, hVar, dVar));
                    animatorSet.start();
                } else {
                    hVar.f(dVar);
                }
            }
            iVar.i(this, i7);
            return;
        }
        lVar.U();
        iVar.i(this, i7);
    }

    public final void c() {
        h hVar = this.f60000e;
        if (hVar != null) {
            hVar.k();
        }
        this.f59998b.f();
    }

    public final boolean d() {
        if (this.f59999c != 3) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f60000e != null) {
            int i7 = this.f59999c;
            if (i7 == 1 || (i7 == 2 && this.d == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        int i7 = this.f59999c;
        if (i7 == 3) {
            return;
        }
        if (i7 != 0) {
            b();
            return;
        }
        this.f59999c = 3;
        this.f59998b.i(this, 0);
    }

    public final o g(Activity activity, Bitmap bitmap, boolean z10) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        if (this.f59999c == 0) {
            l2.i iVar = this.f59998b;
            ArrayList arrayList = (ArrayList) iVar.f19403c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                n nVar = (n) arrayList.get(size);
                if (nVar != this && nVar.e()) {
                    nVar.b();
                }
            }
            final h hVar = new h(this, activity);
            this.f60000e = hVar;
            RectF rectF = new RectF();
            l lVar = hVar.f59957b;
            h.j(rectF, lVar.J(), lVar.a0());
            hVar.f59978z = ((SharedPreferences) jn.m().f36522b).getFloat("scale_factor", 1.0f);
            Point point = g0.f24010q;
            hVar.A = (Math.min(point.x, point.y) - (h.m() * 2.0f)) / hVar.h();
            hVar.f59976x = (int) rectF.width();
            hVar.f59977y = (int) rectF.height();
            hVar.B = rectF.left;
            hVar.C = rectF.top - g0.f24004m;
            int J = lVar.J();
            int a02 = lVar.a0();
            if (J > 0 && a02 > 0) {
                f10 = a02 / J;
            } else {
                f10 = 0.5625f;
            }
            if (f10 < 1.0f) {
                f11 = 0.6f;
            } else {
                f11 = 0.45f;
            }
            a61 a61Var = hVar.F;
            a61Var.f33327q = f11;
            a61Var.a();
            r1.g gVar = new r1.g(hVar, h.Q);
            r1.h hVar2 = new r1.h();
            hVar2.a(0.75f);
            hVar2.b(650.0f);
            gVar.f56333m = hVar2;
            gVar.a(new c(hVar, 0));
            hVar.D = gVar;
            r1.g gVar2 = new r1.g(hVar, h.R);
            r1.h hVar3 = new r1.h();
            hVar3.a(0.75f);
            hVar3.b(650.0f);
            gVar2.f56333m = hVar3;
            gVar2.a(new c(hVar, 1));
            hVar.E = gVar2;
            Activity activity2 = hVar.f59958c;
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new og.b(hVar, 1));
            hVar.f59969p = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            hVar.f59969p.setStylusScaleEnabled(false);
            hVar.f59970q = new pf(activity2, new g(hVar, scaledTouchSlop));
            hVar.f59962i = new d(hVar, activity2, 1);
            org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, hVar);
            hVar.h = eVar;
            eVar.addView(hVar.f59962i, na.c(-1.0f, -1));
            d dVar = hVar.f59962i;
            q0 q0Var = u0.f3313a;
            dVar.setOutlineProvider(new s0(0, g0.L(10.0f)));
            hVar.f59962i.setClipToOutline(true);
            t6.h(m6.Xg, hVar.f59962i, null);
            ImageView imageView = new ImageView(activity2);
            hVar.f59965l = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            hVar.f59965l.setVisibility(8);
            hVar.f59962i.addView(hVar.f59965l, na.c(-1.0f, -1));
            a61Var.f33324n = new e0(hVar);
            hVar.f59966m = new d(hVar, activity2, 0);
            d dVar2 = hVar.f59966m;
            Objects.requireNonNull(dVar2);
            hVar.G = new en0(new vg.d(dVar2, 8), true);
            hVar.f59966m.setWillNotDraw(false);
            hVar.f59966m.setAlpha(0.0f);
            View view = new View(activity2);
            view.setBackgroundColor(1275068416);
            hVar.f59966m.addView(view, na.c(-1.0f, -1));
            int L = g0.L(8.0f);
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(2131232549);
            int i12 = m6.Yg;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            t6.s(imageView2, i12, null, mode);
            int i13 = m6.f29439i6;
            y h02 = m6.h0(m6.x0(null, i13, false), 1, -1);
            p6 M = t6.M(i13);
            imageView2.setBackground(h02);
            t6.j(imageView2, h02, null, M, null);
            imageView2.setPadding(L, L, L, L);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f59956a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59956a;
                            if (nVar2.f59999c == 1) {
                                l2.i iVar2 = nVar2.f59998b;
                                vg.d dVar3 = new vg.d(nVar2, 12);
                                if (iVar2.f19402b && (launchActivity = (LaunchActivity) iVar2.f19405f) != null && !g0.H1(launchActivity)) {
                                    dVar3.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(dVar3);
                                if (((LaunchActivity) iVar2.f19405f) != null && !iVar2.f19401a) {
                                    try {
                                        Intent intent = new Intent(t0.f26895b, ((LaunchActivity) iVar2.f19405f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26895b.startActivity(intent);
                                        return;
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        default:
                            h hVar4 = hVar;
                            l lVar2 = hVar4.f59957b;
                            if (lVar2.h()) {
                                lVar2.b();
                            } else {
                                if (hVar4.H) {
                                    lVar2.c(0L);
                                    hVar4.H = false;
                                }
                                lVar2.f();
                            }
                            hVar4.k();
                            hVar4.f59956a.f59998b.f();
                            return;
                    }
                }
            });
            hVar.f59966m.addView(imageView2, na.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView3 = new ImageView(activity2);
            imageView3.setImageResource(2131232550);
            t6.s(imageView3, i12, null, mode);
            y h03 = m6.h0(m6.x0(null, i13, false), 1, -1);
            p6 M2 = t6.M(i13);
            imageView3.setBackground(h03);
            t6.j(imageView3, h03, null, M2, null);
            imageView3.setPadding(L, L, L, L);
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f59956a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59956a;
                            if (nVar2.f59999c == 1) {
                                l2.i iVar2 = nVar2.f59998b;
                                vg.d dVar3 = new vg.d(nVar2, 12);
                                if (iVar2.f19402b && (launchActivity = (LaunchActivity) iVar2.f19405f) != null && !g0.H1(launchActivity)) {
                                    dVar3.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(dVar3);
                                if (((LaunchActivity) iVar2.f19405f) != null && !iVar2.f19401a) {
                                    try {
                                        Intent intent = new Intent(t0.f26895b, ((LaunchActivity) iVar2.f19405f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26895b.startActivity(intent);
                                        return;
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        default:
                            h hVar4 = hVar;
                            l lVar2 = hVar4.f59957b;
                            if (lVar2.h()) {
                                lVar2.b();
                            } else {
                                if (hVar4.H) {
                                    lVar2.c(0L);
                                    hVar4.H = false;
                                }
                                lVar2.f();
                            }
                            hVar4.k();
                            hVar4.f59956a.f59998b.f();
                            return;
                    }
                }
            });
            hVar.f59966m.addView(imageView3, na.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
            ImageView imageView4 = new ImageView(activity2);
            hVar.f59967n = imageView4;
            t6.s(imageView4, i12, null, mode);
            t6.Q(hVar.f59967n, m6.h0(m6.x0(null, i13, false), 1, -1), null, t6.M(i13), null);
            hVar.f59967n.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f59956a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59956a;
                            if (nVar2.f59999c == 1) {
                                l2.i iVar2 = nVar2.f59998b;
                                vg.d dVar3 = new vg.d(nVar2, 12);
                                if (iVar2.f19402b && (launchActivity = (LaunchActivity) iVar2.f19405f) != null && !g0.H1(launchActivity)) {
                                    dVar3.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(dVar3);
                                if (((LaunchActivity) iVar2.f19405f) != null && !iVar2.f19401a) {
                                    try {
                                        Intent intent = new Intent(t0.f26895b, ((LaunchActivity) iVar2.f19405f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26895b.startActivity(intent);
                                        return;
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        default:
                            h hVar4 = hVar;
                            l lVar2 = hVar4.f59957b;
                            if (lVar2.h()) {
                                lVar2.b();
                            } else {
                                if (hVar4.H) {
                                    lVar2.c(0L);
                                    hVar4.H = false;
                                }
                                lVar2.f();
                            }
                            hVar4.k();
                            hVar4.f59956a.f59998b.f();
                            return;
                    }
                }
            });
            ImageView imageView5 = hVar.f59967n;
            if (lVar.o0()) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView5.setVisibility(i7);
            hVar.f59966m.addView(hVar.f59967n, na.e(38, 38, 17));
            u2 u2Var = new u2(hVar, activity2);
            hVar.f59968o = u2Var;
            if (lVar.o0()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u2Var.setVisibility(i10);
            hVar.f59966m.addView(hVar.f59968o, na.c(-1.0f, -1));
            hVar.f59962i.addView(hVar.f59966m, na.c(-1.0f, -1));
            View E = lVar.E();
            hVar.f59964k = E;
            if (E != null) {
                g0.E2(E);
                hVar.f59962i.addView(hVar.f59964k, 0, na.c(-1.0f, -1));
            } else {
                o oVar = new o(activity2);
                hVar.f59963j = oVar;
                hVar.f59962i.addView(oVar, 0, na.c(-1.0f, -1));
            }
            if (bitmap != null && hVar.f59963j != null) {
                hVar.f59965l.setImageBitmap(bitmap);
                hVar.f59965l.setVisibility(0);
                hVar.f59963j.setFirstFrameCallback(new b(hVar, 2));
            }
            hVar.a();
            if (z10) {
                hVar.h.setAlpha(0.0f);
                hVar.h.setScaleX(0.1f);
                hVar.h.setScaleY(0.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(nr.f37917f);
                i11 = 1;
                animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 1.0f));
                animatorSet.start();
            } else {
                i11 = 1;
            }
            hVar.k();
            o oVar2 = hVar.f59963j;
            this.f59999c = i11;
            iVar.f();
            return oVar2;
        }
        throw new IllegalStateException("startFloating in state " + this.f59999c);
    }
}
