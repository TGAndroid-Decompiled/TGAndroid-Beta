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
import bg.p0;
import bg.r0;
import bg.t0;
import c8.ja;
import fi.w2;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.LaunchActivity;
import ug.t1;
public final class n {
    public final l f59422a;
    public final l2.i f59423b;
    public int f59424c = 0;
    public int d = 0;
    public h f59425e;
    public boolean f59426f;
    public boolean f59427g;

    public n(l2.i iVar, l lVar) {
        this.f59423b = iVar;
        this.f59422a = lVar;
    }

    public final void a(z10 z10Var) {
        h hVar;
        if (this.f59424c == 1 && (hVar = this.f59425e) != null) {
            this.f59425e = null;
            this.f59424c = 0;
            hVar.K = true;
            hVar.d();
            g0.i3(new t1(14, hVar, z10Var), 100L);
            this.f59423b.f();
        }
    }

    public final void b() {
        boolean z10;
        int i7 = this.f59424c;
        if (i7 == 3) {
            return;
        }
        this.f59424c = 3;
        h hVar = this.f59425e;
        l2.i iVar = this.f59423b;
        l lVar = this.f59422a;
        if (hVar != null) {
            this.f59425e = null;
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Objects.requireNonNull(lVar);
            vg.o oVar = new vg.o(lVar, 10);
            if (!hVar.K) {
                hVar.K = true;
                hVar.d();
                r1.g gVar = hVar.D;
                if (gVar != null) {
                    gVar.d();
                    hVar.E.d();
                }
                if (z10 && hVar.f59386g) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(er.f34420f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 0.1f));
                    animatorSet.addListener(new y50(23, hVar, oVar));
                    animatorSet.start();
                } else {
                    hVar.f(oVar);
                }
            }
            iVar.i(this, i7);
            return;
        }
        lVar.V();
        iVar.i(this, i7);
    }

    public final void c() {
        h hVar = this.f59425e;
        if (hVar != null) {
            hVar.k();
        }
        this.f59423b.f();
    }

    public final boolean d() {
        if (this.f59424c != 3) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f59425e != null) {
            int i7 = this.f59424c;
            if (i7 == 1 || (i7 == 2 && this.d == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        int i7 = this.f59424c;
        if (i7 == 3) {
            return;
        }
        if (i7 != 0) {
            b();
            return;
        }
        this.f59424c = 3;
        this.f59423b.i(this, 0);
    }

    public final o g(Activity activity, Bitmap bitmap, boolean z10) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        if (this.f59424c == 0) {
            l2.i iVar = this.f59423b;
            ArrayList arrayList = (ArrayList) iVar.f19042c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                n nVar = (n) arrayList.get(size);
                if (nVar != this && nVar.e()) {
                    nVar.b();
                }
            }
            final h hVar = new h(this, activity);
            this.f59425e = hVar;
            RectF rectF = new RectF();
            l lVar = hVar.f59382b;
            h.j(rectF, lVar.L(), lVar.b0());
            hVar.f59403z = ((SharedPreferences) u7.i.b().f57880a).getFloat("scale_factor", 1.0f);
            Point point = g0.f23609q;
            hVar.A = (Math.min(point.x, point.y) - (h.m() * 2.0f)) / hVar.h();
            hVar.f59401x = (int) rectF.width();
            hVar.f59402y = (int) rectF.height();
            hVar.B = rectF.left;
            hVar.C = rectF.top - g0.f23603m;
            int L = lVar.L();
            int b02 = lVar.b0();
            if (L > 0 && b02 > 0) {
                f10 = b02 / L;
            } else {
                f10 = 0.5625f;
            }
            if (f10 < 1.0f) {
                f11 = 0.6f;
            } else {
                f11 = 0.45f;
            }
            m51 m51Var = hVar.F;
            m51Var.f37076q = f11;
            m51Var.a();
            r1.g gVar = new r1.g(hVar, h.Q);
            r1.h hVar2 = new r1.h();
            hVar2.a(0.75f);
            hVar2.b(650.0f);
            gVar.f55748m = hVar2;
            gVar.a(new c(hVar, 0));
            hVar.D = gVar;
            r1.g gVar2 = new r1.g(hVar, h.R);
            r1.h hVar3 = new r1.h();
            hVar3.a(0.75f);
            hVar3.b(650.0f);
            gVar2.f55748m = hVar3;
            gVar2.a(new c(hVar, 1));
            hVar.E = gVar2;
            Activity activity2 = hVar.f59383c;
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new og.b(hVar, 1));
            hVar.f59394p = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            hVar.f59394p.setStylusScaleEnabled(false);
            hVar.f59395q = new ff(activity2, new g(hVar, scaledTouchSlop));
            hVar.f59387i = new d(hVar, activity2, 1);
            org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, hVar);
            hVar.h = eVar;
            eVar.addView(hVar.f59387i, ja.c(-1.0f, -1));
            d dVar = hVar.f59387i;
            p0 p0Var = t0.f3332a;
            dVar.setOutlineProvider(new r0(0, g0.L(10.0f)));
            hVar.f59387i.setClipToOutline(true);
            q6.h(j6.Xg, hVar.f59387i, null);
            ImageView imageView = new ImageView(activity2);
            hVar.f59390l = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            hVar.f59390l.setVisibility(8);
            hVar.f59387i.addView(hVar.f59390l, ja.c(-1.0f, -1));
            m51Var.f37073n = new cf(hVar);
            hVar.f59391m = new d(hVar, activity2, 0);
            d dVar2 = hVar.f59391m;
            Objects.requireNonNull(dVar2);
            hVar.G = new um0(new vg.o(dVar2, 7), true);
            hVar.f59391m.setWillNotDraw(false);
            hVar.f59391m.setAlpha(0.0f);
            View view = new View(activity2);
            view.setBackgroundColor(1275068416);
            hVar.f59391m.addView(view, ja.c(-1.0f, -1));
            int L2 = g0.L(8.0f);
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(2131232548);
            int i12 = j6.Yg;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            q6.s(imageView2, i12, null, mode);
            int i13 = j6.f28941i6;
            y h02 = j6.h0(j6.x0(null, i13, false), 1, -1);
            m6 M = q6.M(i13);
            imageView2.setBackground(h02);
            q6.j(imageView2, h02, null, M, null);
            imageView2.setPadding(L2, L2, L2, L2);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f59381a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59381a;
                            if (nVar2.f59424c == 1) {
                                l2.i iVar2 = nVar2.f59423b;
                                vg.o oVar = new vg.o(nVar2, 11);
                                if (iVar2.f19041b && (launchActivity = (LaunchActivity) iVar2.f19044f) != null && !g0.H1(launchActivity)) {
                                    oVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(oVar);
                                if (((LaunchActivity) iVar2.f19044f) != null && !iVar2.f19040a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.f26600b, ((LaunchActivity) iVar2.f19044f).getClass());
                                        intent.addFlags(268435456);
                                        org.telegram.messenger.t0.f26600b.startActivity(intent);
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
                            l lVar2 = hVar4.f59382b;
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
                            hVar4.f59381a.f59423b.f();
                            return;
                    }
                }
            });
            hVar.f59391m.addView(imageView2, ja.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView3 = new ImageView(activity2);
            imageView3.setImageResource(2131232549);
            q6.s(imageView3, i12, null, mode);
            y h03 = j6.h0(j6.x0(null, i13, false), 1, -1);
            m6 M2 = q6.M(i13);
            imageView3.setBackground(h03);
            q6.j(imageView3, h03, null, M2, null);
            imageView3.setPadding(L2, L2, L2, L2);
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f59381a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59381a;
                            if (nVar2.f59424c == 1) {
                                l2.i iVar2 = nVar2.f59423b;
                                vg.o oVar = new vg.o(nVar2, 11);
                                if (iVar2.f19041b && (launchActivity = (LaunchActivity) iVar2.f19044f) != null && !g0.H1(launchActivity)) {
                                    oVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(oVar);
                                if (((LaunchActivity) iVar2.f19044f) != null && !iVar2.f19040a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.f26600b, ((LaunchActivity) iVar2.f19044f).getClass());
                                        intent.addFlags(268435456);
                                        org.telegram.messenger.t0.f26600b.startActivity(intent);
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
                            l lVar2 = hVar4.f59382b;
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
                            hVar4.f59381a.f59423b.f();
                            return;
                    }
                }
            });
            hVar.f59391m.addView(imageView3, ja.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
            ImageView imageView4 = new ImageView(activity2);
            hVar.f59392n = imageView4;
            q6.s(imageView4, i12, null, mode);
            q6.Q(hVar.f59392n, j6.h0(j6.x0(null, i13, false), 1, -1), null, q6.M(i13), null);
            hVar.f59392n.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    switch (r2) {
                        case 0:
                            hVar.f59381a.b();
                            return;
                        case 1:
                            n nVar2 = hVar.f59381a;
                            if (nVar2.f59424c == 1) {
                                l2.i iVar2 = nVar2.f59423b;
                                vg.o oVar = new vg.o(nVar2, 11);
                                if (iVar2.f19041b && (launchActivity = (LaunchActivity) iVar2.f19044f) != null && !g0.H1(launchActivity)) {
                                    oVar.run();
                                    return;
                                }
                                ((ArrayList) iVar2.d).add(oVar);
                                if (((LaunchActivity) iVar2.f19044f) != null && !iVar2.f19040a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.f26600b, ((LaunchActivity) iVar2.f19044f).getClass());
                                        intent.addFlags(268435456);
                                        org.telegram.messenger.t0.f26600b.startActivity(intent);
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
                            l lVar2 = hVar4.f59382b;
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
                            hVar4.f59381a.f59423b.f();
                            return;
                    }
                }
            });
            ImageView imageView5 = hVar.f59392n;
            if (lVar.t0()) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView5.setVisibility(i7);
            hVar.f59391m.addView(hVar.f59392n, ja.e(38, 38, 17));
            w2 w2Var = new w2(hVar, activity2);
            hVar.f59393o = w2Var;
            if (lVar.t0()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            w2Var.setVisibility(i10);
            hVar.f59391m.addView(hVar.f59393o, ja.c(-1.0f, -1));
            hVar.f59387i.addView(hVar.f59391m, ja.c(-1.0f, -1));
            View D = lVar.D();
            hVar.f59389k = D;
            if (D != null) {
                g0.E2(D);
                hVar.f59387i.addView(hVar.f59389k, 0, ja.c(-1.0f, -1));
            } else {
                o oVar = new o(activity2);
                hVar.f59388j = oVar;
                hVar.f59387i.addView(oVar, 0, ja.c(-1.0f, -1));
            }
            if (bitmap != null && hVar.f59388j != null) {
                hVar.f59390l.setImageBitmap(bitmap);
                hVar.f59390l.setVisibility(0);
                hVar.f59388j.setFirstFrameCallback(new b(hVar, 2));
            }
            hVar.a();
            if (z10) {
                hVar.h.setAlpha(0.0f);
                hVar.h.setScaleX(0.1f);
                hVar.h.setScaleY(0.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(er.f34420f);
                i11 = 1;
                animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(hVar.h, View.SCALE_Y, 1.0f));
                animatorSet.start();
            } else {
                i11 = 1;
            }
            hVar.k();
            o oVar2 = hVar.f59388j;
            this.f59424c = i11;
            iVar.f();
            return oVar2;
        }
        throw new IllegalStateException("startFloating in state " + this.f59424c);
    }
}
