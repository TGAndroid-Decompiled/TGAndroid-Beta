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
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import v4.f0;
import wg.r;
public final class n {
    public final l f59986a;
    public final l2.i f59987b;
    public int f59988c = 0;
    public int d = 0;
    public h f59989e;
    public boolean f59990f;
    public boolean f59991g;

    public n(l2.i iVar, l lVar) {
        this.f59987b = iVar;
        this.f59986a = lVar;
    }

    public final void a(x10 x10Var) {
        h hVar;
        if (this.f59988c == 1 && (hVar = this.f59989e) != null) {
            this.f59989e = null;
            this.f59988c = 0;
            hVar.K = true;
            hVar.d();
            g0.h3(new r(6, hVar, x10Var), 100L);
            this.f59987b.f();
        }
    }

    public final void b() {
        boolean z10;
        int i7 = this.f59988c;
        if (i7 == 3) {
            return;
        }
        this.f59988c = 3;
        h hVar = this.f59989e;
        l2.i iVar = this.f59987b;
        l lVar = this.f59986a;
        if (hVar != null) {
            this.f59989e = null;
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
                if (z10 && hVar.f59950g) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(lr.f37208f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 0.1f));
                    animatorSet.addListener(new h60(23, hVar, pVar));
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
        h hVar = this.f59989e;
        if (hVar != null) {
            hVar.k();
        }
        this.f59987b.f();
    }

    public final boolean d() {
        if (this.f59988c != 3) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f59989e != null) {
            int i7 = this.f59988c;
            if (i7 == 1 || (i7 == 2 && this.d == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        int i7 = this.f59988c;
        if (i7 == 3) {
            return;
        }
        if (i7 != 0) {
            b();
            return;
        }
        this.f59988c = 3;
        this.f59987b.i(this, 0);
    }

    public final o g(Activity activity, Bitmap bitmap, boolean z10) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        if (this.f59988c == 0) {
            l2.i iVar = this.f59987b;
            ArrayList arrayList = (ArrayList) iVar.f19409c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                n nVar = (n) arrayList.get(size);
                if (nVar != this && nVar.e()) {
                    nVar.b();
                }
            }
            final h hVar = new h(this, activity);
            this.f59989e = hVar;
            RectF rectF = new RectF();
            l lVar = hVar.f59946b;
            h.j(rectF, lVar.J(), lVar.a0());
            hVar.f59967z = ((SharedPreferences) hn.m().f35933b).getFloat("scale_factor", 1.0f);
            Point point = g0.f24121q;
            hVar.A = (Math.min(point.x, point.y) - (h.m() * 2.0f)) / hVar.h();
            hVar.f59965x = (int) rectF.width();
            hVar.f59966y = (int) rectF.height();
            hVar.B = rectF.left;
            hVar.C = rectF.top - g0.f24115m;
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
            x51 x51Var = hVar.F;
            x51Var.f41922q = f11;
            x51Var.a();
            r1.g gVar = new r1.g(hVar, h.Q);
            r1.h hVar2 = new r1.h();
            hVar2.a(0.75f);
            hVar2.b(650.0f);
            gVar.f56323m = hVar2;
            gVar.a(new c(hVar, 0));
            hVar.D = gVar;
            r1.g gVar2 = new r1.g(hVar, h.R);
            r1.h hVar3 = new r1.h();
            hVar3.a(0.75f);
            hVar3.b(650.0f);
            gVar2.f56323m = hVar3;
            gVar2.a(new c(hVar, 1));
            hVar.E = gVar2;
            Activity activity2 = hVar.f59947c;
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new og.b(hVar, 1));
            hVar.f59958p = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            hVar.f59958p.setStylusScaleEnabled(false);
            hVar.f59959q = new of(activity2, new g(hVar, scaledTouchSlop));
            hVar.f59951i = new d(hVar, activity2, 1);
            org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, hVar);
            hVar.h = eVar;
            eVar.addView(hVar.f59951i, ma.c(-1.0f, -1));
            d dVar = hVar.f59951i;
            q0 q0Var = u0.f3342a;
            dVar.setOutlineProvider(new s0(0, g0.L(10.0f)));
            hVar.f59951i.setClipToOutline(true);
            u6.h(n6.Xg, hVar.f59951i, null);
            ImageView imageView = new ImageView(activity2);
            hVar.f59954l = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            hVar.f59954l.setVisibility(8);
            hVar.f59951i.addView(hVar.f59954l, ma.c(-1.0f, -1));
            x51Var.f41919n = new f0(hVar);
            hVar.f59955m = new d(hVar, activity2, 0);
            d dVar2 = hVar.f59955m;
            Objects.requireNonNull(dVar2);
            hVar.G = new cn0(new v4.p(dVar2, 9), true);
            hVar.f59955m.setWillNotDraw(false);
            hVar.f59955m.setAlpha(0.0f);
            View view = new View(activity2);
            view.setBackgroundColor(1275068416);
            hVar.f59955m.addView(view, ma.c(-1.0f, -1));
            int L = g0.L(8.0f);
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(2131232549);
            int i12 = n6.Yg;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            u6.s(imageView2, i12, null, mode);
            int i13 = n6.f29488i6;
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
                            hVar.f59945a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59945a;
                            if (nVar2.f59988c == 1) {
                                l2.i iVar2 = nVar2.f59987b;
                                v4.p pVar = new v4.p(nVar2, 13);
                                if (iVar2.f19408b && (launchActivity = (LaunchActivity) iVar2.f19411f) != null && !g0.H1(launchActivity)) {
                                    pVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f19411f) != null && !iVar2.f19407a) {
                                    try {
                                        Intent intent = new Intent(t0.f26915b, ((LaunchActivity) iVar2.f19411f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26915b.startActivity(intent);
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
                            l lVar2 = hVar4.f59946b;
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
                            hVar4.f59945a.f59987b.f();
                            return;
                    }
                }
            });
            hVar.f59955m.addView(imageView2, ma.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView3 = new ImageView(activity2);
            imageView3.setImageResource(2131232550);
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
                            hVar.f59945a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59945a;
                            if (nVar2.f59988c == 1) {
                                l2.i iVar2 = nVar2.f59987b;
                                v4.p pVar = new v4.p(nVar2, 13);
                                if (iVar2.f19408b && (launchActivity = (LaunchActivity) iVar2.f19411f) != null && !g0.H1(launchActivity)) {
                                    pVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f19411f) != null && !iVar2.f19407a) {
                                    try {
                                        Intent intent = new Intent(t0.f26915b, ((LaunchActivity) iVar2.f19411f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26915b.startActivity(intent);
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
                            l lVar2 = hVar4.f59946b;
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
                            hVar4.f59945a.f59987b.f();
                            return;
                    }
                }
            });
            hVar.f59955m.addView(imageView3, ma.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
            ImageView imageView4 = new ImageView(activity2);
            hVar.f59956n = imageView4;
            u6.s(imageView4, i12, null, mode);
            u6.Q(hVar.f59956n, n6.h0(n6.x0(null, i13, false), 1, -1), null, u6.M(i13), null);
            hVar.f59956n.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f59945a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59945a;
                            if (nVar2.f59988c == 1) {
                                l2.i iVar2 = nVar2.f59987b;
                                v4.p pVar = new v4.p(nVar2, 13);
                                if (iVar2.f19408b && (launchActivity = (LaunchActivity) iVar2.f19411f) != null && !g0.H1(launchActivity)) {
                                    pVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f19411f) != null && !iVar2.f19407a) {
                                    try {
                                        Intent intent = new Intent(t0.f26915b, ((LaunchActivity) iVar2.f19411f).getClass());
                                        intent.addFlags(268435456);
                                        t0.f26915b.startActivity(intent);
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
                            l lVar2 = hVar4.f59946b;
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
                            hVar4.f59945a.f59987b.f();
                            return;
                    }
                }
            });
            ImageView imageView5 = hVar.f59956n;
            if (lVar.o0()) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView5.setVisibility(i7);
            hVar.f59955m.addView(hVar.f59956n, ma.e(38, 38, 17));
            u2 u2Var = new u2(hVar, activity2);
            hVar.f59957o = u2Var;
            if (lVar.o0()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u2Var.setVisibility(i10);
            hVar.f59955m.addView(hVar.f59957o, ma.c(-1.0f, -1));
            hVar.f59951i.addView(hVar.f59955m, ma.c(-1.0f, -1));
            View E = lVar.E();
            hVar.f59953k = E;
            if (E != null) {
                g0.E2(E);
                hVar.f59951i.addView(hVar.f59953k, 0, ma.c(-1.0f, -1));
            } else {
                o oVar = new o(activity2);
                hVar.f59952j = oVar;
                hVar.f59951i.addView(oVar, 0, ma.c(-1.0f, -1));
            }
            if (bitmap != null && hVar.f59952j != null) {
                hVar.f59954l.setImageBitmap(bitmap);
                hVar.f59954l.setVisibility(0);
                hVar.f59952j.setFirstFrameCallback(new b(hVar, 2));
            }
            hVar.a();
            if (z10) {
                hVar.h.setAlpha(0.0f);
                hVar.h.setScaleX(0.1f);
                hVar.h.setScaleY(0.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(lr.f37208f);
                i11 = 1;
                animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 1.0f));
                animatorSet.start();
            } else {
                i11 = 1;
            }
            hVar.k();
            o oVar2 = hVar.f59952j;
            this.f59988c = i11;
            iVar.f();
            return oVar2;
        }
        throw new IllegalStateException("startFloating in state " + this.f59988c);
    }
}
