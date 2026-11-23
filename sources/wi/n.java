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
import c8.ma;
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
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qf;
import org.telegram.ui.LaunchActivity;
import v4.f0;
public final class n {
    public final l f60032a;
    public final l2.i f60033b;
    public int f60034c = 0;
    public int d = 0;
    public h f60035e;
    public boolean f60036f;
    public boolean f60037g;

    public n(l2.i iVar, l lVar) {
        this.f60033b = iVar;
        this.f60032a = lVar;
    }

    public final void a(y10 y10Var) {
        h hVar;
        if (this.f60034c == 1 && (hVar = this.f60035e) != null) {
            this.f60035e = null;
            this.f60034c = 0;
            hVar.K = true;
            hVar.d();
            g0.h3(new wg.q(8, hVar, y10Var), 100L);
            this.f60033b.f();
        }
    }

    public final void b() {
        boolean z10;
        int i7 = this.f60034c;
        if (i7 == 3) {
            return;
        }
        this.f60034c = 3;
        h hVar = this.f60035e;
        l2.i iVar = this.f60033b;
        l lVar = this.f60032a;
        if (hVar != null) {
            this.f60035e = null;
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Objects.requireNonNull(lVar);
            v4.p pVar = new v4.p(lVar, 12);
            if (!hVar.K) {
                hVar.K = true;
                hVar.d();
                r1.g gVar = hVar.D;
                if (gVar != null) {
                    gVar.d();
                    hVar.E.d();
                }
                if (z10 && hVar.f59996g) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(nr.f37961f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 0.1f));
                    animatorSet.addListener(new h10(24, hVar, pVar));
                    animatorSet.start();
                } else {
                    hVar.f(pVar);
                }
            }
            iVar.i(this, i7);
            return;
        }
        lVar.U();
        iVar.i(this, i7);
    }

    public final void c() {
        h hVar = this.f60035e;
        if (hVar != null) {
            hVar.k();
        }
        this.f60033b.f();
    }

    public final boolean d() {
        if (this.f60034c != 3) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f60035e != null) {
            int i7 = this.f60034c;
            if (i7 == 1 || (i7 == 2 && this.d == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        int i7 = this.f60034c;
        if (i7 == 3) {
            return;
        }
        if (i7 != 0) {
            b();
            return;
        }
        this.f60034c = 3;
        this.f60033b.i(this, 0);
    }

    public final o g(Activity activity, Bitmap bitmap, boolean z10) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        if (this.f60034c == 0) {
            l2.i iVar = this.f60033b;
            ArrayList arrayList = (ArrayList) iVar.f19437c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                n nVar = (n) arrayList.get(size);
                if (nVar != this && nVar.e()) {
                    nVar.b();
                }
            }
            final h hVar = new h(this, activity);
            this.f60035e = hVar;
            RectF rectF = new RectF();
            l lVar = hVar.f59992b;
            h.j(rectF, lVar.J(), lVar.a0());
            hVar.f60013z = ((SharedPreferences) jn.m().f36567b).getFloat("scale_factor", 1.0f);
            Point point = g0.f24046q;
            hVar.A = (Math.min(point.x, point.y) - (h.m() * 2.0f)) / hVar.h();
            hVar.f60011x = (int) rectF.width();
            hVar.f60012y = (int) rectF.height();
            hVar.B = rectF.left;
            hVar.C = rectF.top - g0.f24040m;
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
            a61Var.f33361q = f11;
            a61Var.a();
            r1.g gVar = new r1.g(hVar, h.Q);
            r1.h hVar2 = new r1.h();
            hVar2.a(0.75f);
            hVar2.b(650.0f);
            gVar.f56368m = hVar2;
            gVar.a(new c(hVar, 0));
            hVar.D = gVar;
            r1.g gVar2 = new r1.g(hVar, h.R);
            r1.h hVar3 = new r1.h();
            hVar3.a(0.75f);
            hVar3.b(650.0f);
            gVar2.f56368m = hVar3;
            gVar2.a(new c(hVar, 1));
            hVar.E = gVar2;
            Activity activity2 = hVar.f59993c;
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new og.b(hVar, 1));
            hVar.f60004p = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            hVar.f60004p.setStylusScaleEnabled(false);
            hVar.f60005q = new qf(activity2, new g(hVar, scaledTouchSlop));
            hVar.f59997i = new d(hVar, activity2, 1);
            org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, hVar);
            hVar.h = eVar;
            eVar.addView(hVar.f59997i, ma.c(-1.0f, -1));
            d dVar = hVar.f59997i;
            q0 q0Var = u0.f3362a;
            dVar.setOutlineProvider(new s0(0, g0.L(10.0f)));
            hVar.f59997i.setClipToOutline(true);
            t6.h(m6.Xg, hVar.f59997i, null);
            ImageView imageView = new ImageView(activity2);
            hVar.f60000l = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            hVar.f60000l.setVisibility(8);
            hVar.f59997i.addView(hVar.f60000l, ma.c(-1.0f, -1));
            a61Var.f33358n = new f0(hVar);
            hVar.f60001m = new d(hVar, activity2, 0);
            d dVar2 = hVar.f60001m;
            Objects.requireNonNull(dVar2);
            hVar.G = new fn0(new v4.p(dVar2, 9), true);
            hVar.f60001m.setWillNotDraw(false);
            hVar.f60001m.setAlpha(0.0f);
            View view = new View(activity2);
            view.setBackgroundColor(1275068416);
            hVar.f60001m.addView(view, ma.c(-1.0f, -1));
            int L = g0.L(8.0f);
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(2131232549);
            int i12 = m6.Yg;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            t6.s(imageView2, i12, null, mode);
            int i13 = m6.f29473i6;
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
                            hVar.f59991a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59991a;
                            if (nVar2.f60034c == 1) {
                                l2.i iVar2 = nVar2.f60033b;
                                v4.p pVar = new v4.p(nVar2, 13);
                                if (iVar2.f19436b && (launchActivity = (LaunchActivity) iVar2.f19439f) != null && !g0.H1(launchActivity)) {
                                    pVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f19439f) != null && !iVar2.f19435a) {
                                    try {
                                        Intent intent = new Intent(t0.f26931b, ((LaunchActivity) iVar2.f19439f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26931b.startActivity(intent);
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
                            l lVar2 = hVar4.f59992b;
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
                            hVar4.f59991a.f60033b.f();
                            return;
                    }
                }
            });
            hVar.f60001m.addView(imageView2, ma.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
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
                            hVar.f59991a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59991a;
                            if (nVar2.f60034c == 1) {
                                l2.i iVar2 = nVar2.f60033b;
                                v4.p pVar = new v4.p(nVar2, 13);
                                if (iVar2.f19436b && (launchActivity = (LaunchActivity) iVar2.f19439f) != null && !g0.H1(launchActivity)) {
                                    pVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f19439f) != null && !iVar2.f19435a) {
                                    try {
                                        Intent intent = new Intent(t0.f26931b, ((LaunchActivity) iVar2.f19439f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26931b.startActivity(intent);
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
                            l lVar2 = hVar4.f59992b;
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
                            hVar4.f59991a.f60033b.f();
                            return;
                    }
                }
            });
            hVar.f60001m.addView(imageView3, ma.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
            ImageView imageView4 = new ImageView(activity2);
            hVar.f60002n = imageView4;
            t6.s(imageView4, i12, null, mode);
            t6.Q(hVar.f60002n, m6.h0(m6.x0(null, i13, false), 1, -1), null, t6.M(i13), null);
            hVar.f60002n.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f59991a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59991a;
                            if (nVar2.f60034c == 1) {
                                l2.i iVar2 = nVar2.f60033b;
                                v4.p pVar = new v4.p(nVar2, 13);
                                if (iVar2.f19436b && (launchActivity = (LaunchActivity) iVar2.f19439f) != null && !g0.H1(launchActivity)) {
                                    pVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f19439f) != null && !iVar2.f19435a) {
                                    try {
                                        Intent intent = new Intent(t0.f26931b, ((LaunchActivity) iVar2.f19439f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26931b.startActivity(intent);
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
                            l lVar2 = hVar4.f59992b;
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
                            hVar4.f59991a.f60033b.f();
                            return;
                    }
                }
            });
            ImageView imageView5 = hVar.f60002n;
            if (lVar.o0()) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView5.setVisibility(i7);
            hVar.f60001m.addView(hVar.f60002n, ma.e(38, 38, 17));
            u2 u2Var = new u2(hVar, activity2);
            hVar.f60003o = u2Var;
            if (lVar.o0()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u2Var.setVisibility(i10);
            hVar.f60001m.addView(hVar.f60003o, ma.c(-1.0f, -1));
            hVar.f59997i.addView(hVar.f60001m, ma.c(-1.0f, -1));
            View E = lVar.E();
            hVar.f59999k = E;
            if (E != null) {
                g0.E2(E);
                hVar.f59997i.addView(hVar.f59999k, 0, ma.c(-1.0f, -1));
            } else {
                o oVar = new o(activity2);
                hVar.f59998j = oVar;
                hVar.f59997i.addView(oVar, 0, ma.c(-1.0f, -1));
            }
            if (bitmap != null && hVar.f59998j != null) {
                hVar.f60000l.setImageBitmap(bitmap);
                hVar.f60000l.setVisibility(0);
                hVar.f59998j.setFirstFrameCallback(new b(hVar, 2));
            }
            hVar.a();
            if (z10) {
                hVar.h.setAlpha(0.0f);
                hVar.h.setScaleX(0.1f);
                hVar.h.setScaleY(0.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(nr.f37961f);
                i11 = 1;
                animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 1.0f));
                animatorSet.start();
            } else {
                i11 = 1;
            }
            hVar.k();
            o oVar2 = hVar.f59998j;
            this.f60034c = i11;
            iVar.f();
            return oVar2;
        }
        throw new IllegalStateException("startFloating in state " + this.f60034c);
    }
}
