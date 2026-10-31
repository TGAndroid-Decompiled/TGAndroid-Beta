package th;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.x41;
import org.telegram.ui.ay;
import org.telegram.ui.ex0;
import org.telegram.ui.ko;
import org.telegram.ui.uw;
import vh.j8;
import vh.o8;
public abstract class m extends FrameLayout implements us, fe.e {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public final ArrayList D;
    public ValueAnimator D0;
    public final i E;
    public float E0;
    public final i F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final jc I;
    public float I0;
    public vh.p2 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final ac.a L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final s4.j R;
    public final s4.a0 S;
    public final org.telegram.ui.Components.f6 T;
    public final org.telegram.ui.ActionBar.j U;
    public final ImageView V;
    public final ImageView W;
    public final fe.b f49195a;
    public final org.telegram.ui.Components.d5 f49196a0;
    public final int f49197b;
    public final ArrayList f49198b0;
    public final Drawable f49199c;
    public float f49200c0;
    public final h d;
    public float f49201d0;
    public int e;
    public final ay f49202e0;
    public final int f49203f;
    public CharSequence f49204f0;
    public boolean f49205g0;
    public final g h;
    public int f49206h0;
    public SpannableStringBuilder f49207i0;
    public ValueAnimator f49208j0;
    public k f49209k0;
    public boolean f49210l0;
    public boolean m0;
    public fi0 f49211n;
    public float f49212n0;
    public int f49213o0;
    public l f49214p0;
    public org.telegram.ui.ActionBar.l f49215q0;
    public final g f49216r;
    public org.telegram.ui.web.x0 f49217r0;
    public final e5 f49218s;
    public float f49219s0;
    public final float f49220t0;
    public final float f49221u0;
    public final float f49222v0;
    public final ArrayList f49223w;
    public final ex0 f49224w0;
    public final ArrayList f49225x;
    public LinearGradient f49226x0;
    public final ArrayList f49227y;
    public Matrix f49228y0;
    public Paint f49229z0;

    public m(Context context, ay ayVar, int i10, int i11) {
        super(context);
        float f7;
        this.f49195a = new fe.b(1, this, gr.h, 380L, false);
        this.f49223w = new ArrayList();
        this.f49225x = new ArrayList();
        this.f49227y = new ArrayList();
        this.D = new ArrayList();
        uw uwVar = (uw) this;
        i iVar = new i(uwVar, false);
        this.E = iVar;
        i iVar2 = new i(uwVar, true);
        this.F = iVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        jc jcVar = new jc(this);
        this.I = jcVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f49198b0 = new ArrayList();
        this.f49200c0 = -1.0f;
        this.f49210l0 = true;
        this.f49220t0 = 1.0f;
        this.f49221u0 = 0.95f;
        this.f49222v0 = 0.9f;
        this.f49224w0 = new ex0(18);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        ac.a aVar = new ac.a(this);
        this.L0 = aVar;
        this.f49197b = i11;
        this.f49203f = i10;
        this.f49202e0 = ayVar;
        this.f49219s0 = org.telegram.messenger.i0.L(68.0f);
        this.f49218s = vp.r1(i10).O1();
        g gVar = new g(uwVar, context, 0);
        this.h = gVar;
        gVar.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        gVar.setClipToPadding(false);
        gVar.setClipChildren(false);
        jcVar.h = new sg.v(uwVar, 2);
        r5.a aVar2 = new r5.a(uwVar, 7);
        jcVar.f27311l = true;
        jcVar.f27309j = aVar2;
        gVar.j(new bu0(uwVar, 22));
        s4.j jVar = new s4.j();
        this.R = jVar;
        jVar.C = false;
        jVar.n(150L);
        jVar.f47927m = false;
        gVar.setItemAnimator(jVar);
        s4.a0 a0Var = new s4.a0(0, false);
        this.S = a0Var;
        gVar.setLayoutManager(a0Var);
        gVar.setOnItemClickListener(new ag.y0(uwVar, 16));
        gVar.setOnItemLongClickListener(new rh.d0(uwVar, 10));
        gVar.setAdapter(iVar);
        addView(gVar, w7.b6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getContext(), true, true, false);
        this.T = f6Var;
        f6Var.setGravity(3);
        f6Var.setTextColor(getTextLogoColor());
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        if (!org.telegram.messenger.i0.Q1() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        f6Var.setTextSize(org.telegram.messenger.i0.L(f7));
        f6Var.setImportantForAccessibility(1);
        f6Var.setFocusableInTouchMode(true);
        addView(f6Var, w7.b6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(cd.L0(2131689472, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232772);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.b6.c(22.0f, 90));
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(26.0f), null);
        this.f49196a0 = d5Var;
        d5Var.f25298a = true;
        d5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(d5Var);
        addView(imageView2, w7.b6.c(40.0f, 40));
        org.telegram.ui.ActionBar.j jVar2 = new org.telegram.ui.ActionBar.j(uwVar, context, aVar);
        this.U = jVar2;
        addView(jVar2, w7.b6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.f49199c = getContext().getDrawable(2131232226);
        g gVar2 = new g(uwVar, getContext(), 1);
        this.f49216r = gVar2;
        getContext();
        gVar2.setLayoutManager(new s4.a0(0, false));
        gVar2.i(new dh.g(13));
        ?? jVar3 = new s4.j();
        this.d = jVar3;
        jVar3.C = false;
        jVar3.f47927m = false;
        gVar2.setItemAnimator(jVar3);
        gVar2.setAdapter(iVar2);
        gVar2.setClipChildren(false);
        addView(gVar2, w7.b6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public static int a(uw uwVar) {
        return uwVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f49197b == 0) {
            return f(org.telegram.ui.ActionBar.t6.A8);
        }
        return f(org.telegram.ui.ActionBar.t6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.t6.Ul);
    }

    public final void b() {
        int i10;
        this.N = 1.0f - org.telegram.messenger.i0.T1(1.0f - this.f49200c0, 1.0f, 1.0f - this.f49201d0);
        d();
        float f7 = this.N;
        if (f7 == 1.0f) {
            i10 = 2;
        } else if (f7 != 0.0f) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.O != i10) {
            this.O = i10;
            if (i10 != 1 && this.K) {
                org.telegram.messenger.i0.g3(new d(this, 0));
            }
            int i11 = this.O;
            g gVar = this.f49216r;
            g gVar2 = this.h;
            if (i11 == 0) {
                org.telegram.messenger.i0.d0(gVar2, new ag.z0(26));
                gVar.setVisibility(4);
                gVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f49203f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f49227y;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((j) arrayList2.get(i13)).f49078c != d20.i(i12).e() || m()) {
                            arrayList.add(Long.valueOf(((j) arrayList2.get(i13)).f49078c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    gVar.setVisibility(4);
                    gVar2.setVisibility(0);
                } else if (i11 == 2) {
                    gVar.setVisibility(0);
                    gVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    org.telegram.utils.twidget.v vVar = vp.r1(i12).O1().K;
                    org.telegram.messenger.i0.r(vVar);
                    vVar.run();
                    org.telegram.ui.web.x0 x0Var = this.f49217r0;
                    if (x0Var != null) {
                        x0Var.a();
                        this.f49217r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        s4.a0 a0Var = this.S;
        int N02 = a0Var.N0() + 10;
        ArrayList arrayList = this.f49227y;
        int size = arrayList.size();
        e5 e5Var = this.f49218s;
        boolean z10 = false;
        if (N02 > size || ((N0 = a0Var.N0() + 9) < arrayList.size() && e5Var.E(0, ((j) arrayList.get(N0)).f49078c) == 0)) {
            if (this.f49197b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!e5Var.f48925z) {
                    return;
                }
            } else if (!e5Var.f48916p) {
                return;
            }
            e5Var.T(z10);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = w7.u.a(Math.min(this.N, this.f49201d0), 0.0f, 1.0f);
        float f7 = this.f49195a.e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        int i13 = 8;
        org.telegram.ui.Components.f6 f6Var = this.T;
        if (f6Var != null) {
            f6Var.setAlpha(f11);
            if (f11 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            f6Var.setVisibility(i12);
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setAlpha(f12);
            if (f12 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
        }
        org.telegram.ui.ActionBar.j jVar = this.U;
        if (jVar != null) {
            jVar.setAlpha(a2);
            if (a2 > 0.0f) {
                i13 = 0;
            }
            jVar.setVisibility(i13);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        if (i10 == zs.f19709v5 && this.f49210l0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p(z10, false);
            org.telegram.messenger.i0.g3(new d(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: th.m.dispatchDraw(android.graphics.Canvas):void");
    }

    public final l e(long j10) {
        g gVar;
        if (this.O == 2) {
            gVar = this.f49216r;
        } else {
            gVar = this.h;
        }
        for (int i10 = 0; i10 < gVar.getChildCount(); i10++) {
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof l) {
                l lVar = (l) childAt;
                if (lVar.E == j10) {
                    return lVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        ay ayVar = this.f49202e0;
        if (ayVar != null && ayVar.getResourceProvider() != null) {
            return ayVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final boolean g() {
        int i10 = this.O;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.N;
    }

    public float getOverScrollCoef() {
        return this.f49220t0;
    }

    public vh.p2 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (!this.f49218s.J()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(d20.i(this.f49203f).f15165n));
        this.f49202e0.getOrCreateStoryViewer().T(getContext(), null, arrayList, 0, null, null, n5.a(this.f49216r), false);
    }

    public final void i(l lVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && lVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = lVar.F;
            e5 e5Var = this.f49218s;
            if (z11 && !e5Var.J()) {
                if (!vp.r1(this.f49203f).T4()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (e5Var.K(lVar.E) || e5Var.M(lVar.E)) {
                TL_stories.PeerStories y3 = e5Var.y(lVar.E);
                long j10 = lVar.E;
                org.telegram.ui.web.x0 x0Var = this.f49217r0;
                if (x0Var != null) {
                    x0Var.a();
                    this.f49217r0 = null;
                }
                a3.i0 i0Var = new a3.i0(this, lVar, j10, 27);
                if (z10) {
                    i0Var.run();
                    return;
                }
                org.telegram.ui.web.x0 n10 = w5.n(y3, i0Var);
                lVar.e = n10;
                this.f49217r0 = n10;
                if (n10 != null) {
                    e5Var.h0(lVar.E, true);
                }
            }
        }
    }

    public final void j(long j10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        l lVar;
        j4.w o10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        ay ayVar = this.f49202e0;
        int i11 = this.f49203f;
        if (i10 == 0 && (o10 = vp.r1(i11).O1().o()) != null && o10.a(i11, 1)) {
            ayVar.showDialog(new kg.q0(o10.b(), this.f49203f, getContext(), this.f49202e0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            g gVar = this.h;
            p6Var = null;
            if (i12 < gVar.getChildCount()) {
                lVar = (l) gVar.getChildAt(i12);
                if (i10 == 0) {
                    if (lVar.F) {
                        break;
                    }
                    i12++;
                } else if (lVar.E == j10) {
                    break;
                } else {
                    i12++;
                }
            } else {
                lVar = null;
                break;
            }
        }
        if (lVar == null) {
            return;
        }
        if (i10 != 0) {
            if (ayVar != null) {
                p6Var = ayVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getContext(), p6Var2);
            x1Var.r(500L);
            vp.r1(i11).O1().k(j10, new ko(this, x1Var, j10, lVar, 5), true, p6Var2);
            return;
        }
        o8.D(ayVar.getParentActivity(), i11).Q(j8.c(lVar));
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49227y;
            if (i10 < arrayList.size()) {
                if (((j) arrayList.get(i10)).f49078c == j10) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            s4.a0 a0Var = this.S;
            if (i10 < a0Var.I0()) {
                a0Var.h1(i10, 0);
                return true;
            } else if (i10 > a0Var.M0()) {
                a0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z10, float f7) {
        boolean z11;
        float f10;
        float f11;
        if (this.f49200c0 != f7) {
            this.f49200c0 = f7;
            b();
            if (f7 > this.B0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != this.A0) {
                this.A0 = z11;
                AnimatorSet animatorSet = this.K0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.K0.cancel();
                    this.K0 = null;
                }
                float f12 = 1.0f;
                if (z10) {
                    float f13 = this.f49201d0;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f10);
                    this.C0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final m f48811b;

                        {
                            this.f48811b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    m mVar = this.f48811b;
                                    mVar.getClass();
                                    mVar.f49201d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    mVar.b();
                                    return;
                                case 1:
                                    m mVar2 = this.f48811b;
                                    mVar2.getClass();
                                    mVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    m mVar3 = this.f48811b;
                                    mVar3.getClass();
                                    mVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    m mVar4 = this.f48811b;
                                    mVar4.getClass();
                                    mVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    mVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setInterpolator(gr.h);
                    float f14 = this.f49200c0;
                    if (z11) {
                        f11 = f14;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f11);
                    this.F0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final m f48811b;

                        {
                            this.f48811b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    m mVar = this.f48811b;
                                    mVar.getClass();
                                    mVar.f49201d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    mVar.b();
                                    return;
                                case 1:
                                    m mVar2 = this.f48811b;
                                    mVar2.getClass();
                                    mVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    m mVar3 = this.f48811b;
                                    mVar3.getClass();
                                    mVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    m mVar4 = this.f48811b;
                                    mVar4.getClass();
                                    mVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    mVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.F0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.K0 = animatorSet2;
                    animatorSet2.addListener(new sg.y(1, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.C0);
                    arrayList.add(this.F0);
                    if (this.A0) {
                        this.K0.setDuration(1000L);
                        float f15 = this.f49201d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f15, f12);
                        this.D0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final m f48811b;

                            {
                                this.f48811b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        m mVar = this.f48811b;
                                        mVar.getClass();
                                        mVar.f49201d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mVar.b();
                                        return;
                                    case 1:
                                        m mVar2 = this.f48811b;
                                        mVar2.getClass();
                                        mVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        m mVar3 = this.f48811b;
                                        mVar3.getClass();
                                        mVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        m mVar4 = this.f48811b;
                                        mVar4.getClass();
                                        mVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f49221u0);
                        this.J0 = overshootInterpolator;
                        this.D0.setInterpolator(overshootInterpolator);
                        this.D0.setDuration(750L);
                        arrayList.add(this.D0);
                    } else {
                        float f16 = this.f49201d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        this.H0 = ValueAnimator.ofFloat(f16, f12);
                        this.H0.setInterpolator(new OvershootInterpolator(this.f49222v0));
                        this.H0.setDuration(350L);
                        this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final m f48811b;

                            {
                                this.f48811b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        m mVar = this.f48811b;
                                        mVar.getClass();
                                        mVar.f49201d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mVar.b();
                                        return;
                                    case 1:
                                        m mVar2 = this.f48811b;
                                        mVar2.getClass();
                                        mVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        m mVar3 = this.f48811b;
                                        mVar3.getClass();
                                        mVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        m mVar4 = this.f48811b;
                                        mVar4.getClass();
                                        mVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        arrayList.add(this.H0);
                    }
                    this.K0.playTogether(arrayList);
                    this.K0.start();
                    return;
                }
                if (!z11) {
                    f12 = 0.0f;
                }
                this.f49201d0 = f12;
                b();
                org.telegram.messenger.i0.d0(this.h, new ag.z0(27));
            }
        }
    }

    public final boolean m() {
        long j10 = d20.i(this.f49203f).f15165n;
        e5 e5Var = this.f49218s;
        if (!e5Var.L(j10)) {
            if (!e5Var.J() || e5Var.f48908g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.J == null) {
            vh.p2 p2Var = new vh.p2(getContext(), 1);
            p2Var.h(f(org.telegram.ui.ActionBar.t6.tj));
            p2Var.p(true);
            p2Var.K = Layout.Alignment.ALIGN_CENTER;
            p2Var.l(0.0f, 29.0f);
            this.J = p2Var;
            SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(cd.M0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.t6.uj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) R2.getSpans(0, R2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                R2.setSpan(new x41(org.telegram.messenger.i0.o()), R2.getSpanStart(clickableSpanArr[0]), R2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            vh.p2 p2Var2 = this.J;
            p2Var2.h = vh.p2.a(R2, p2Var2.getTextPaint());
            this.J.s(R2);
            this.J.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.b6.e(-1, 150, 51));
            }
        }
        vh.p2 p2Var3 = this.J;
        if (p2Var3 != null) {
            if (p2Var3.V) {
                org.telegram.messenger.t2.APP_ERROR.a();
            }
            this.J.u();
        }
    }

    public final void o() {
        u10 u10Var = w5.f49574b;
        if (u10Var != null) {
            u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.al, false), 0, 0);
        }
        u10 u10Var2 = w5.f49575c;
        if (u10Var2 != null) {
            u10Var2.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bl, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.cl, false), 0, 0);
        }
        u10[] u10VarArr = w5.f49573a;
        u10 u10Var3 = u10VarArr[0];
        if (u10Var3 != null) {
            u10Var3.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yk, false), 0, 0);
        }
        u10 u10Var4 = u10VarArr[1];
        if (u10Var4 != null) {
            u10Var4.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false), 0, 0);
        }
        if (w5.d != null) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.lk, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21170q7, false);
            w5.d.d(i0.b.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        org.telegram.ui.ActionBar.j jVar = this.U;
        if (jVar != null) {
            jVar.d();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.i0.d0(this.h, new rv0(textColor, 1));
        org.telegram.messenger.i0.d0(this.f49216r, new ag.z0(28));
        try {
            org.telegram.ui.Components.d5 d5Var = this.f49196a0;
            if (d5Var != null) {
                d5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.t6.ni)));
            }
            ImageView imageView = this.W;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        zs.f(this.f49203f).c(this, zs.f19709v5);
        ac.a aVar = this.L0;
        aVar.f362a = true;
        AnimatorSet animatorSet = (AnimatorSet) aVar.f364c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f49196a0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f49203f).n(this, zs.f19709v5);
        ac.a aVar = this.L0;
        aVar.f362a = false;
        ((AnimatorSet) aVar.f364c).cancel();
        org.telegram.ui.web.x0 x0Var = this.f49217r0;
        if (x0Var != null) {
            x0Var.a();
            this.f49217r0 = null;
        }
        this.f49196a0.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (!org.telegram.messenger.i0.Q1() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        this.T.setTextSize(org.telegram.messenger.i0.L(f7));
        this.M = org.telegram.messenger.i0.L(70.0f);
        org.telegram.messenger.i0.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O == 2) {
            int size = this.D.size();
            int L = org.telegram.messenger.i0.L((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            g gVar = this.f49216r;
            int x10 = (int) (gVar.getX() + L);
            int y3 = (int) (gVar.getY() + gVar.getHeight());
            jc jcVar = this.I;
            jcVar.getClass();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((int) gVar.getX(), (int) gVar.getY(), x10, y3);
            jcVar.f27308i = false;
            jcVar.f27305c = 0;
            jcVar.a(rectF);
            if (jcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
        boolean z12;
        ArrayList arrayList2;
        String G;
        boolean z13;
        boolean z14;
        boolean z15;
        String L0;
        if ((this.O == 1 || this.f49212n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList3 = this.f49223w;
        arrayList3.clear();
        ArrayList arrayList4 = this.f49227y;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f49225x;
        arrayList5.clear();
        ArrayList arrayList6 = this.D;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f49197b;
        int i11 = this.f49203f;
        if (i10 != 1) {
            arrayList4.add(new j(d20.i(i11).e()));
        }
        e5 e5Var = this.f49218s;
        if (i10 == 1) {
            arrayList = e5Var.h;
        } else {
            arrayList = e5Var.f48908g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long o10 = org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (o10 != d20.i(i11).e()) {
                arrayList4.add(new j(o10));
            }
        }
        int size = arrayList4.size();
        if (!e5Var.J()) {
            size--;
        }
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(e5Var.D(z12), size));
        this.f49204f0 = null;
        boolean I = e5Var.I();
        org.telegram.ui.Components.f6 f6Var = this.T;
        if (I) {
            arrayList2 = arrayList4;
            if (e5Var.M(d20.i(i11).e())) {
                String L02 = cd.L0(2131743826, null);
                if (L02.indexOf("…") > 0) {
                    if (this.f49207i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L02);
                        u7 u7Var = new u7();
                        valueOf.setSpan(u7Var, valueOf.length() - 1, valueOf.length(), 0);
                        u7Var.f49530a = f6Var;
                        u7Var.f49534n = true;
                        this.f49207i0 = valueOf;
                    }
                    this.f49204f0 = this.f49207i0;
                } else {
                    this.f49204f0 = L02;
                }
            } else {
                if (this.f49219s0 < org.telegram.messenger.i0.L(50.0f)) {
                    L0 = null;
                } else {
                    L0 = cd.L0(2131748316, null);
                }
                this.f49204f0 = L0;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f49219s0 < org.telegram.messenger.i0.L(50.0f)) {
                G = null;
            } else {
                G = cd.G(max, "Stories", new Object[0]);
            }
            this.f49204f0 = G;
        }
        if (!this.f49205g0) {
            CharSequence charSequence = this.f49204f0;
            if (z10 && !cd.X) {
                z15 = true;
            } else {
                z15 = false;
            }
            z13 = true;
            f6Var.c(charSequence, z15, true);
        } else {
            z13 = true;
        }
        if (TextUtils.isEmpty(this.f49204f0) && !this.f49205g0) {
            z14 = false;
        } else {
            z14 = z13;
        }
        this.f49195a.a(z14, z10);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((j) arrayList2.get(i13)).f49078c != d20.i(i11).f15165n || m()) {
                arrayList6.add((j) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        g gVar = this.h;
        g gVar2 = this.f49216r;
        if (z10) {
            if (this.O == 2) {
                gVar2.setItemAnimator(this.d);
                gVar.setItemAnimator(null);
            } else {
                gVar.setItemAnimator(this.R);
                gVar2.setItemAnimator(null);
            }
        } else {
            gVar.setItemAnimator(null);
            gVar2.setItemAnimator(null);
        }
        this.E.E(arrayList3, arrayList2);
        this.F.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.f49215q0 = lVar;
    }

    public void setClipTop(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.L != i10) {
            this.L = i10;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f7) {
        this.f49219s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.f49212n0 = f7 / org.telegram.messenger.i0.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(true, f7);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        vh.p2 p2Var = this.J;
        if (p2Var != null) {
            p2Var.setTranslationY(f7);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 1) {
            d();
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
