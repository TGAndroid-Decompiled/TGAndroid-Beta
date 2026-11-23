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
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.LaunchActivity;
import ug.u1;
public final class n {
    public final l f60115a;
    public final l2.j f60116b;
    public int f60117c = 0;
    public int d = 0;
    public h f60118e;
    public boolean f60119f;
    public boolean f60120g;

    public n(l2.j jVar, l lVar) {
        this.f60116b = jVar;
        this.f60115a = lVar;
    }

    public final void a(w10 w10Var) {
        h hVar;
        if (this.f60117c == 1 && (hVar = this.f60118e) != null) {
            this.f60118e = null;
            this.f60117c = 0;
            hVar.K = true;
            hVar.d();
            g0.h3(new v9.b(12, hVar, w10Var), 100L);
            this.f60116b.f();
        }
    }

    public final void b() {
        boolean z10;
        int i7 = this.f60117c;
        if (i7 == 3) {
            return;
        }
        this.f60117c = 3;
        h hVar = this.f60118e;
        l2.j jVar = this.f60116b;
        l lVar = this.f60115a;
        if (hVar != null) {
            this.f60118e = null;
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Objects.requireNonNull(lVar);
            u1 u1Var = new u1(lVar, 13);
            if (!hVar.K) {
                hVar.K = true;
                hVar.d();
                r1.g gVar = hVar.D;
                if (gVar != null) {
                    gVar.d();
                    hVar.E.d();
                }
                if (z10 && hVar.f60079g) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(kr.f36858f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 0.1f));
                    animatorSet.addListener(new f10(24, hVar, u1Var));
                    animatorSet.start();
                } else {
                    hVar.f(u1Var);
                }
            }
            jVar.i(this, i7);
            return;
        }
        lVar.v1();
        jVar.i(this, i7);
    }

    public final void c() {
        h hVar = this.f60118e;
        if (hVar != null) {
            hVar.k();
        }
        this.f60116b.f();
    }

    public final boolean d() {
        if (this.f60117c != 3) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f60118e != null) {
            int i7 = this.f60117c;
            if (i7 == 1 || (i7 == 2 && this.d == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        int i7 = this.f60117c;
        if (i7 == 3) {
            return;
        }
        if (i7 != 0) {
            b();
            return;
        }
        this.f60117c = 3;
        this.f60116b.i(this, 0);
    }

    public final o g(Activity activity, Bitmap bitmap, boolean z10) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        if (this.f60117c == 0) {
            l2.j jVar = this.f60116b;
            ArrayList arrayList = (ArrayList) jVar.f19507c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                n nVar = (n) arrayList.get(size);
                if (nVar != this && nVar.e()) {
                    nVar.b();
                }
            }
            final h hVar = new h(this, activity);
            this.f60118e = hVar;
            RectF rectF = new RectF();
            l lVar = hVar.f60075b;
            h.j(rectF, lVar.b1(), lVar.V1());
            hVar.f60096z = ((SharedPreferences) aa.F2().f30491b).getFloat("scale_factor", 1.0f);
            Point point = g0.f24226q;
            hVar.A = (Math.min(point.x, point.y) - (h.m() * 2.0f)) / hVar.h();
            hVar.f60094x = (int) rectF.width();
            hVar.f60095y = (int) rectF.height();
            hVar.B = rectF.left;
            hVar.C = rectF.top - g0.f24220m;
            int b12 = lVar.b1();
            int V1 = lVar.V1();
            if (b12 > 0 && V1 > 0) {
                f10 = V1 / b12;
            } else {
                f10 = 0.5625f;
            }
            if (f10 < 1.0f) {
                f11 = 0.6f;
            } else {
                f11 = 0.45f;
            }
            z51 z51Var = hVar.F;
            z51Var.f42719q = f11;
            z51Var.a();
            r1.g gVar = new r1.g(hVar, h.Q);
            r1.h hVar2 = new r1.h();
            hVar2.a(0.75f);
            hVar2.b(650.0f);
            gVar.f56446m = hVar2;
            gVar.a(new c(hVar, 0));
            hVar.D = gVar;
            r1.g gVar2 = new r1.g(hVar, h.R);
            r1.h hVar3 = new r1.h();
            hVar3.a(0.75f);
            hVar3.b(650.0f);
            gVar2.f56446m = hVar3;
            gVar2.a(new c(hVar, 1));
            hVar.E = gVar2;
            Activity activity2 = hVar.f60076c;
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new og.b(hVar, 1));
            hVar.f60087p = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            hVar.f60087p.setStylusScaleEnabled(false);
            hVar.f60088q = new aa(activity2, new g(hVar, scaledTouchSlop));
            hVar.f60080i = new d(hVar, activity2, 1);
            org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, hVar);
            hVar.h = eVar;
            eVar.addView(hVar.f60080i, na.c(-1.0f, -1));
            d dVar = hVar.f60080i;
            q0 q0Var = u0.f3313a;
            dVar.setOutlineProvider(new s0(0, g0.L(10.0f)));
            hVar.f60080i.setClipToOutline(true);
            u6.h(n6.Xg, hVar.f60080i, null);
            ImageView imageView = new ImageView(activity2);
            hVar.f60083l = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            hVar.f60083l.setVisibility(8);
            hVar.f60080i.addView(hVar.f60083l, na.c(-1.0f, -1));
            z51Var.f42716n = new nd0(hVar, 25);
            hVar.f60084m = new d(hVar, activity2, 0);
            d dVar2 = hVar.f60084m;
            Objects.requireNonNull(dVar2);
            hVar.G = new en0(new u1(dVar2, 10), true);
            hVar.f60084m.setWillNotDraw(false);
            hVar.f60084m.setAlpha(0.0f);
            View view = new View(activity2);
            view.setBackgroundColor(1275068416);
            hVar.f60084m.addView(view, na.c(-1.0f, -1));
            int L = g0.L(8.0f);
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(2131232552);
            int i12 = n6.Yg;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            u6.s(imageView2, i12, null, mode);
            int i13 = n6.f29543i6;
            y h02 = n6.h0(n6.x0(null, i13, false), 1, -1);
            q6 M = u6.M(i13);
            imageView2.setBackground(h02);
            u6.j(imageView2, h02, null, M, null);
            imageView2.setPadding(L, L, L, L);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f60074a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f60074a;
                            if (nVar2.f60117c == 1) {
                                l2.j jVar2 = nVar2.f60116b;
                                u1 u1Var = new u1(nVar2, 14);
                                if (jVar2.f19506b && (launchActivity = (LaunchActivity) jVar2.f19509f) != null && !g0.H1(launchActivity)) {
                                    u1Var.run();
                                    return;
                                }
                                ((ArrayList) jVar2.d).add(u1Var);
                                if (((LaunchActivity) jVar2.f19509f) != null && !jVar2.f19505a) {
                                    try {
                                        Intent intent = new Intent(t0.f27013b, ((LaunchActivity) jVar2.f19509f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f27013b.startActivity(intent);
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
                            l lVar2 = hVar4.f60075b;
                            if (lVar2.j()) {
                                lVar2.b();
                            } else {
                                if (hVar4.H) {
                                    lVar2.c(0L);
                                    hVar4.H = false;
                                }
                                lVar2.f();
                            }
                            hVar4.k();
                            hVar4.f60074a.f60116b.f();
                            return;
                    }
                }
            });
            hVar.f60084m.addView(imageView2, na.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView3 = new ImageView(activity2);
            imageView3.setImageResource(2131232553);
            u6.s(imageView3, i12, null, mode);
            y h03 = n6.h0(n6.x0(null, i13, false), 1, -1);
            q6 M2 = u6.M(i13);
            imageView3.setBackground(h03);
            u6.j(imageView3, h03, null, M2, null);
            imageView3.setPadding(L, L, L, L);
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f60074a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f60074a;
                            if (nVar2.f60117c == 1) {
                                l2.j jVar2 = nVar2.f60116b;
                                u1 u1Var = new u1(nVar2, 14);
                                if (jVar2.f19506b && (launchActivity = (LaunchActivity) jVar2.f19509f) != null && !g0.H1(launchActivity)) {
                                    u1Var.run();
                                    return;
                                }
                                ((ArrayList) jVar2.d).add(u1Var);
                                if (((LaunchActivity) jVar2.f19509f) != null && !jVar2.f19505a) {
                                    try {
                                        Intent intent = new Intent(t0.f27013b, ((LaunchActivity) jVar2.f19509f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f27013b.startActivity(intent);
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
                            l lVar2 = hVar4.f60075b;
                            if (lVar2.j()) {
                                lVar2.b();
                            } else {
                                if (hVar4.H) {
                                    lVar2.c(0L);
                                    hVar4.H = false;
                                }
                                lVar2.f();
                            }
                            hVar4.k();
                            hVar4.f60074a.f60116b.f();
                            return;
                    }
                }
            });
            hVar.f60084m.addView(imageView3, na.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
            ImageView imageView4 = new ImageView(activity2);
            hVar.f60085n = imageView4;
            u6.s(imageView4, i12, null, mode);
            u6.Q(hVar.f60085n, n6.h0(n6.x0(null, i13, false), 1, -1), null, u6.M(i13), null);
            hVar.f60085n.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f60074a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f60074a;
                            if (nVar2.f60117c == 1) {
                                l2.j jVar2 = nVar2.f60116b;
                                u1 u1Var = new u1(nVar2, 14);
                                if (jVar2.f19506b && (launchActivity = (LaunchActivity) jVar2.f19509f) != null && !g0.H1(launchActivity)) {
                                    u1Var.run();
                                    return;
                                }
                                ((ArrayList) jVar2.d).add(u1Var);
                                if (((LaunchActivity) jVar2.f19509f) != null && !jVar2.f19505a) {
                                    try {
                                        Intent intent = new Intent(t0.f27013b, ((LaunchActivity) jVar2.f19509f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f27013b.startActivity(intent);
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
                            l lVar2 = hVar4.f60075b;
                            if (lVar2.j()) {
                                lVar2.b();
                            } else {
                                if (hVar4.H) {
                                    lVar2.c(0L);
                                    hVar4.H = false;
                                }
                                lVar2.f();
                            }
                            hVar4.k();
                            hVar4.f60074a.f60116b.f();
                            return;
                    }
                }
            });
            ImageView imageView5 = hVar.f60085n;
            if (lVar.C2()) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView5.setVisibility(i7);
            hVar.f60084m.addView(hVar.f60085n, na.e(38, 38, 17));
            u2 u2Var = new u2(hVar, activity2);
            hVar.f60086o = u2Var;
            if (lVar.C2()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u2Var.setVisibility(i10);
            hVar.f60084m.addView(hVar.f60086o, na.c(-1.0f, -1));
            hVar.f60080i.addView(hVar.f60084m, na.c(-1.0f, -1));
            View K0 = lVar.K0();
            hVar.f60082k = K0;
            if (K0 != null) {
                g0.E2(K0);
                hVar.f60080i.addView(hVar.f60082k, 0, na.c(-1.0f, -1));
            } else {
                o oVar = new o(activity2);
                hVar.f60081j = oVar;
                hVar.f60080i.addView(oVar, 0, na.c(-1.0f, -1));
            }
            if (bitmap != null && hVar.f60081j != null) {
                hVar.f60083l.setImageBitmap(bitmap);
                hVar.f60083l.setVisibility(0);
                hVar.f60081j.setFirstFrameCallback(new b(hVar, 2));
            }
            hVar.a();
            if (z10) {
                hVar.h.setAlpha(0.0f);
                hVar.h.setScaleX(0.1f);
                hVar.h.setScaleY(0.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(kr.f36858f);
                i11 = 1;
                animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 1.0f));
                animatorSet.start();
            } else {
                i11 = 1;
            }
            hVar.k();
            o oVar2 = hVar.f60081j;
            this.f60117c = i11;
            jVar.f();
            return oVar2;
        }
        throw new IllegalStateException("startFloating in state " + this.f60117c);
    }
}
