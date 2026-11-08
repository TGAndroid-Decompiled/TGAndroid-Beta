package ti;

import ab.d0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
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
import c8.ha;
import di.b3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.w;
import sg.t0;
public final class o {
    public final m f56123a;
    public final l2.i f56124b;
    public int f56125c = 0;
    public int d = 0;
    public i f56126e;
    public boolean f56127f;
    public boolean f56128g;

    public o(l2.i iVar, m mVar) {
        this.f56124b = iVar;
        this.f56123a = mVar;
    }

    public final void a(c20 c20Var) {
        i iVar;
        if (this.f56125c == 1 && (iVar = this.f56126e) != null) {
            this.f56126e = null;
            this.f56125c = 0;
            iVar.K = true;
            iVar.d();
            g0.i3(new w(24, iVar, c20Var), 100L);
            this.f56124b.f();
        }
    }

    public final void b() {
        boolean z9;
        int i7 = this.f56125c;
        if (i7 == 3) {
            return;
        }
        this.f56125c = 3;
        i iVar = this.f56126e;
        l2.i iVar2 = this.f56124b;
        m mVar = this.f56123a;
        if (iVar != null) {
            this.f56126e = null;
            if (i7 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            Objects.requireNonNull(mVar);
            t0 t0Var = new t0(mVar, 12);
            if (!iVar.K) {
                iVar.K = true;
                iVar.d();
                r1.g gVar = iVar.D;
                if (gVar != null) {
                    gVar.d();
                    iVar.E.d();
                }
                if (z9 && iVar.f56087g) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(xq.f40366f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(iVar.h, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(iVar.h, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(iVar.h, View.SCALE_Y, 0.1f));
                    animatorSet.addListener(new v50(21, iVar, t0Var));
                    animatorSet.start();
                } else {
                    iVar.f(t0Var);
                }
            }
            iVar2.i(this, i7);
            return;
        }
        mVar.Q();
        iVar2.i(this, i7);
    }

    public final void c() {
        i iVar = this.f56126e;
        if (iVar != null) {
            iVar.k();
        }
        this.f56124b.f();
    }

    public final boolean d() {
        if (this.f56125c != 3) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f56126e != null) {
            int i7 = this.f56125c;
            if (i7 == 1 || (i7 == 2 && this.d == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        int i7 = this.f56125c;
        if (i7 == 3) {
            return;
        }
        if (i7 != 0) {
            b();
            return;
        }
        this.f56125c = 3;
        this.f56124b.i(this, 0);
    }

    public final p g(Activity activity, Bitmap bitmap, boolean z9) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        if (this.f56125c == 0) {
            l2.i iVar = this.f56124b;
            ArrayList arrayList = (ArrayList) iVar.f17849c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                o oVar = (o) arrayList.get(size);
                if (oVar != this && oVar.e()) {
                    oVar.b();
                }
            }
            final i iVar2 = new i(this, activity);
            this.f56126e = iVar2;
            RectF rectF = new RectF();
            m mVar = iVar2.f56083b;
            i.j(rectF, mVar.I(), mVar.U());
            iVar2.f56104z = d0.b().f918a.getFloat("scale_factor", 1.0f);
            Point point = g0.f22563q;
            iVar2.A = (Math.min(point.x, point.y) - (i.m() * 2.0f)) / iVar2.h();
            iVar2.f56102x = (int) rectF.width();
            iVar2.f56103y = (int) rectF.height();
            iVar2.B = rectF.left;
            iVar2.C = rectF.top - g0.f22557m;
            int I = mVar.I();
            int U = mVar.U();
            if (I > 0 && U > 0) {
                f10 = U / I;
            } else {
                f10 = 0.5625f;
            }
            if (f10 < 1.0f) {
                f11 = 0.6f;
            } else {
                f11 = 0.45f;
            }
            j51 j51Var = iVar2.F;
            j51Var.f34916q = f11;
            j51Var.a();
            r1.g gVar = new r1.g(iVar2, i.Q);
            r1.h hVar = new r1.h();
            hVar.a(0.75f);
            hVar.b(650.0f);
            gVar.f54268m = hVar;
            gVar.a(new c(iVar2, 0));
            iVar2.D = gVar;
            r1.g gVar2 = new r1.g(iVar2, i.R);
            r1.h hVar2 = new r1.h();
            hVar2.a(0.75f);
            hVar2.b(650.0f);
            gVar2.f54268m = hVar2;
            gVar2.a(new c(iVar2, 1));
            iVar2.E = gVar2;
            Activity activity2 = iVar2.f56084c;
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new og.b(iVar2, 1));
            iVar2.f56095p = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            iVar2.f56095p.setStylusScaleEnabled(false);
            iVar2.f56096q = new rt(activity2, new h(iVar2, scaledTouchSlop));
            iVar2.f56088i = new e(iVar2, activity2, 1);
            org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, iVar2);
            iVar2.h = eVar;
            eVar.addView(iVar2.f56088i, ha.c(-1.0f, -1));
            e eVar2 = iVar2.f56088i;
            q0 q0Var = u0.f3380a;
            eVar2.setOutlineProvider(new s0(0, g0.L(10.0f)));
            iVar2.f56088i.setClipToOutline(true);
            r6.i(k6.Ug, iVar2.f56088i, null);
            ImageView imageView = new ImageView(activity2);
            iVar2.f56091l = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            iVar2.f56091l.setVisibility(8);
            iVar2.f56088i.addView(iVar2.f56091l, ha.c(-1.0f, -1));
            j51Var.f34913n = new vy(iVar2, 21);
            iVar2.f56092m = new e(iVar2, activity2, 0);
            e eVar3 = iVar2.f56092m;
            Objects.requireNonNull(eVar3);
            iVar2.G = new qm0(new t0(eVar3, 9), true);
            iVar2.f56092m.setWillNotDraw(false);
            iVar2.f56092m.setAlpha(0.0f);
            View view = new View(activity2);
            view.setBackgroundColor(1275068416);
            iVar2.f56092m.addView(view, ha.c(-1.0f, -1));
            int L = g0.L(8.0f);
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(2131232547);
            int i12 = k6.Vg;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            r6.t(imageView2, i12, null, mode);
            int i13 = k6.f27944i6;
            y h02 = k6.h0(k6.x0(null, i13, false), 1, -1);
            n6 N = r6.N(i13);
            imageView2.setBackground(h02);
            r6.k(imageView2, h02, null, N, null);
            imageView2.setPadding(L, L, L, L);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            iVar2.f56082a.b();
                            return;
                        case 1:
                            o oVar2 = iVar2.f56082a;
                            if (oVar2.f56125c == 1) {
                                l2.i iVar3 = oVar2.f56124b;
                                t0 t0Var = new t0(oVar2, 13);
                                if (iVar3.f17848b && (launchActivity = (LaunchActivity) iVar3.f17851f) != null && !g0.H1(launchActivity)) {
                                    t0Var.run();
                                    return;
                                }
                                ((ArrayList) iVar3.d).add(t0Var);
                                if (((LaunchActivity) iVar3.f17851f) != null && !iVar3.f17847a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.f25566b, ((LaunchActivity) iVar3.f17851f).getClass());
                                        intent.addFlags(268435456);
                                        org.telegram.messenger.t0.f25566b.startActivity(intent);
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
                            i iVar4 = iVar2;
                            m mVar2 = iVar4.f56083b;
                            if (mVar2.h()) {
                                mVar2.b();
                            } else {
                                if (iVar4.H) {
                                    mVar2.c(0L);
                                    iVar4.H = false;
                                }
                                mVar2.f();
                            }
                            iVar4.k();
                            iVar4.f56082a.f56124b.f();
                            return;
                    }
                }
            });
            iVar2.f56092m.addView(imageView2, ha.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView3 = new ImageView(activity2);
            imageView3.setImageResource(2131232548);
            r6.t(imageView3, i12, null, mode);
            y h03 = k6.h0(k6.x0(null, i13, false), 1, -1);
            n6 N2 = r6.N(i13);
            imageView3.setBackground(h03);
            r6.k(imageView3, h03, null, N2, null);
            imageView3.setPadding(L, L, L, L);
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            iVar2.f56082a.b();
                            return;
                        case 1:
                            o oVar2 = iVar2.f56082a;
                            if (oVar2.f56125c == 1) {
                                l2.i iVar3 = oVar2.f56124b;
                                t0 t0Var = new t0(oVar2, 13);
                                if (iVar3.f17848b && (launchActivity = (LaunchActivity) iVar3.f17851f) != null && !g0.H1(launchActivity)) {
                                    t0Var.run();
                                    return;
                                }
                                ((ArrayList) iVar3.d).add(t0Var);
                                if (((LaunchActivity) iVar3.f17851f) != null && !iVar3.f17847a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.f25566b, ((LaunchActivity) iVar3.f17851f).getClass());
                                        intent.addFlags(268435456);
                                        org.telegram.messenger.t0.f25566b.startActivity(intent);
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
                            i iVar4 = iVar2;
                            m mVar2 = iVar4.f56083b;
                            if (mVar2.h()) {
                                mVar2.b();
                            } else {
                                if (iVar4.H) {
                                    mVar2.c(0L);
                                    iVar4.H = false;
                                }
                                mVar2.f();
                            }
                            iVar4.k();
                            iVar4.f56082a.f56124b.f();
                            return;
                    }
                }
            });
            iVar2.f56092m.addView(imageView3, ha.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
            ImageView imageView4 = new ImageView(activity2);
            iVar2.f56093n = imageView4;
            r6.t(imageView4, i12, null, mode);
            r6.R(iVar2.f56093n, k6.h0(k6.x0(null, i13, false), 1, -1), null, r6.N(i13), null);
            iVar2.f56093n.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            iVar2.f56082a.b();
                            return;
                        case 1:
                            o oVar2 = iVar2.f56082a;
                            if (oVar2.f56125c == 1) {
                                l2.i iVar3 = oVar2.f56124b;
                                t0 t0Var = new t0(oVar2, 13);
                                if (iVar3.f17848b && (launchActivity = (LaunchActivity) iVar3.f17851f) != null && !g0.H1(launchActivity)) {
                                    t0Var.run();
                                    return;
                                }
                                ((ArrayList) iVar3.d).add(t0Var);
                                if (((LaunchActivity) iVar3.f17851f) != null && !iVar3.f17847a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.f25566b, ((LaunchActivity) iVar3.f17851f).getClass());
                                        intent.addFlags(268435456);
                                        org.telegram.messenger.t0.f25566b.startActivity(intent);
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
                            i iVar4 = iVar2;
                            m mVar2 = iVar4.f56083b;
                            if (mVar2.h()) {
                                mVar2.b();
                            } else {
                                if (iVar4.H) {
                                    mVar2.c(0L);
                                    iVar4.H = false;
                                }
                                mVar2.f();
                            }
                            iVar4.k();
                            iVar4.f56082a.f56124b.f();
                            return;
                    }
                }
            });
            ImageView imageView5 = iVar2.f56093n;
            if (mVar.e0()) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView5.setVisibility(i7);
            iVar2.f56092m.addView(iVar2.f56093n, ha.e(38, 38, 17));
            b3 b3Var = new b3(iVar2, activity2);
            iVar2.f56094o = b3Var;
            if (mVar.e0()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b3Var.setVisibility(i10);
            iVar2.f56092m.addView(iVar2.f56094o, ha.c(-1.0f, -1));
            iVar2.f56088i.addView(iVar2.f56092m, ha.c(-1.0f, -1));
            View D = mVar.D();
            iVar2.f56090k = D;
            if (D != null) {
                g0.E2(D);
                iVar2.f56088i.addView(iVar2.f56090k, 0, ha.c(-1.0f, -1));
            } else {
                p pVar = new p(activity2);
                iVar2.f56089j = pVar;
                iVar2.f56088i.addView(pVar, 0, ha.c(-1.0f, -1));
            }
            if (bitmap != null && iVar2.f56089j != null) {
                iVar2.f56091l.setImageBitmap(bitmap);
                iVar2.f56091l.setVisibility(0);
                iVar2.f56089j.setFirstFrameCallback(new b(iVar2, 2));
            }
            iVar2.a();
            if (z9) {
                iVar2.h.setAlpha(0.0f);
                iVar2.h.setScaleX(0.1f);
                iVar2.h.setScaleY(0.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(xq.f40366f);
                i11 = 1;
                animatorSet.playTogether(ObjectAnimator.ofFloat(iVar2.h, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(iVar2.h, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(iVar2.h, View.SCALE_Y, 1.0f));
                animatorSet.start();
            } else {
                i11 = 1;
            }
            iVar2.k();
            p pVar2 = iVar2.f56089j;
            this.f56125c = i11;
            iVar.f();
            return pVar2;
        }
        throw new IllegalStateException("startFloating in state " + this.f56125c);
    }
}
