package zh;

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
import androidx.recyclerview.widget.RecyclerView;
import bi.ce;
import bi.vd;
import bi.xd;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x20;
import org.telegram.ui.iw0;
import org.telegram.ui.nx;
import org.telegram.ui.to;
import org.telegram.ui.wy;
public abstract class l extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public final i E;
    public float E0;
    public final i F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final ed I;
    public float I0;
    public bi.x4 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final com.google.firebase.messaging.m L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final s4.j R;
    public final s4.c0 S;
    public final org.telegram.ui.Components.o6 T;
    public final org.telegram.ui.ActionBar.j U;
    public final ImageView V;
    public final ImageView W;
    public final le.b f48596a;
    public final org.telegram.ui.Components.n5 f48597a0;
    public final int f48598b;
    public final ArrayList f48599b0;
    public final Drawable f48600c;
    public float f48601c0;
    public final h d;
    public float f48602d0;
    public int e;
    public final wy f48603e0;
    public final int f48604f;
    public CharSequence f48605f0;
    public boolean f48606g0;
    public final g h;
    public int f48607h0;
    public SpannableStringBuilder f48608i0;
    public ValueAnimator f48609j0;
    public vd f48610k0;
    public boolean f48611l0;
    public boolean m0;
    public lj0 f48612n;
    public float f48613n0;
    public int f48614o0;
    public k f48615p0;
    public org.telegram.ui.ActionBar.l f48616q0;
    public final g f48617r;
    public org.telegram.ui.web.a1 f48618r0;
    public final i5 f48619s;
    public float f48620s0;
    public final float f48621t0;
    public final float f48622u0;
    public final ArrayList v;
    public final float f48623v0;
    public final ArrayList f48624w;
    public final sg.p f48625w0;
    public final ArrayList f48626x;
    public LinearGradient f48627x0;
    public final ArrayList f48628y;
    public Matrix f48629y0;
    public Paint f48630z0;

    public l(Context context, wy wyVar, int i10, int i11) {
        super(context);
        float f7;
        this.f48596a = new le.b(1, this, wr.h, 380L, false);
        this.v = new ArrayList();
        this.f48624w = new ArrayList();
        this.f48626x = new ArrayList();
        this.f48628y = new ArrayList();
        nx nxVar = (nx) this;
        i iVar = new i(nxVar, false);
        this.E = iVar;
        i iVar2 = new i(nxVar, true);
        this.F = iVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        ed edVar = new ed(this);
        this.I = edVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f48599b0 = new ArrayList();
        this.f48601c0 = -1.0f;
        this.f48611l0 = true;
        this.f48621t0 = 1.0f;
        this.f48622u0 = 0.95f;
        this.f48623v0 = 0.9f;
        this.f48625w0 = new sg.p(20);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(this);
        this.L0 = mVar;
        this.f48598b = i11;
        this.f48604f = i10;
        this.f48603e0 = wyVar;
        this.f48620s0 = AndroidUtilities.dp(68.0f);
        this.f48619s = MessagesController.getInstance(i10).getStoriesController();
        g gVar = new g(nxVar, context, 0);
        this.h = gVar;
        gVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        gVar.setClipToPadding(false);
        gVar.setClipChildren(false);
        edVar.h = new xh.x(nxVar, 18);
        org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(nxVar, 15);
        edVar.f22680l = true;
        edVar.f22678j = d1Var;
        gVar.j(new al0(nxVar, 20));
        s4.j jVar = new s4.j();
        this.R = jVar;
        jVar.C = false;
        jVar.n(150L);
        jVar.f41645m = false;
        gVar.setItemAnimator(jVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.S = c0Var;
        gVar.setLayoutManager(c0Var);
        gVar.setOnItemClickListener(new ai.g(nxVar, 24));
        gVar.setOnItemLongClickListener(new th.e(nxVar, 19));
        gVar.setAdapter(iVar);
        addView(gVar, w7.a6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), true, true, false);
        this.T = o6Var;
        o6Var.setGravity(3);
        o6Var.setTextColor(getTextLogoColor());
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        o6Var.setTextSize(AndroidUtilities.dp(f7));
        o6Var.setImportantForAccessibility(1);
        o6Var.setFocusableInTouchMode(true);
        addView(o6Var, w7.a6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.a6.c(22.0f, 90));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(26.0f), null);
        this.f48597a0 = n5Var;
        n5Var.f25409a = true;
        n5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(n5Var);
        addView(imageView2, w7.a6.c(40.0f, 40));
        org.telegram.ui.ActionBar.j jVar2 = new org.telegram.ui.ActionBar.j(nxVar, context, mVar);
        this.U = jVar2;
        addView(jVar2, w7.a6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f48600c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        g gVar2 = new g(nxVar, getContext(), 1);
        this.f48617r = gVar2;
        getContext();
        gVar2.setLayoutManager(new s4.c0(0, false));
        gVar2.i(new fg.j0(10));
        ?? jVar3 = new s4.j();
        this.d = jVar3;
        jVar3.C = false;
        jVar3.f41645m = false;
        gVar2.setItemAnimator(jVar3);
        gVar2.setAdapter(iVar2);
        gVar2.setClipChildren(false);
        addView(gVar2, w7.a6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public int getTextColor() {
        if (this.f48598b == 0) {
            return f(org.telegram.ui.ActionBar.j6.A8);
        }
        return f(org.telegram.ui.ActionBar.j6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.j6.gl);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        int i10;
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.f48601c0, 1.0f, 1.0f - this.f48602d0);
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
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.O;
            g gVar = this.f48617r;
            g gVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) gVar2, (e2.h) new y2.h(1));
                gVar.setVisibility(4);
                gVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f48604f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f48626x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((j) arrayList2.get(i13)).f48525c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((j) arrayList2.get(i13)).f48525c));
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
                    pg.f2 f2Var = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(f2Var);
                    f2Var.run();
                    org.telegram.ui.web.a1 a1Var = this.f48618r0;
                    if (a1Var != null) {
                        a1Var.a();
                        this.f48618r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        s4.c0 c0Var = this.S;
        int N02 = c0Var.N0() + 10;
        ArrayList arrayList = this.f48626x;
        int size = arrayList.size();
        i5 i5Var = this.f48619s;
        boolean z10 = false;
        if (N02 > size || ((N0 = c0Var.N0() + 9) < arrayList.size() && i5Var.D(0, ((j) arrayList.get(N0)).f48525c) == 0)) {
            if (this.f48598b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!i5Var.f48520z) {
                    return;
                }
            } else if (!i5Var.f48511p) {
                return;
            }
            i5Var.Q(z10);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = w7.q.a(Math.min(this.N, this.f48602d0), 0.0f, 1.0f);
        float f7 = this.f48596a.e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        int i13 = 8;
        org.telegram.ui.Components.o6 o6Var = this.T;
        if (o6Var != null) {
            o6Var.setAlpha(f11);
            if (f11 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            o6Var.setVisibility(i12);
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
        if (i10 == NotificationCenter.storiesUpdated && this.f48611l0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p(z10, false);
            AndroidUtilities.runOnUIThread(new d(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: zh.l.dispatchDraw(android.graphics.Canvas):void");
    }

    public final k e(long j3) {
        g gVar;
        if (this.O == 2) {
            gVar = this.f48617r;
        } else {
            gVar = this.h;
        }
        for (int i10 = 0; i10 < gVar.getChildCount(); i10++) {
            View childAt = gVar.getChildAt(i10);
            if (childAt instanceof k) {
                k kVar = (k) childAt;
                if (kVar.E == j3) {
                    return kVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        wy wyVar = this.f48603e0;
        if (wyVar != null && wyVar.getResourceProvider() != null) {
            return wyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
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
        return this.f48621t0;
    }

    public bi.x4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (!this.f48619s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f48604f).clientUserId));
        this.f48603e0.getOrCreateStoryViewer().F(getContext(), null, arrayList, 0, null, null, s5.a(this.f48617r), false);
    }

    public final void i(k kVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && kVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = kVar.F;
            i5 i5Var = this.f48619s;
            if (z11 && !i5Var.H()) {
                if (!MessagesController.getInstance(this.f48604f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (i5Var.I(kVar.E) || i5Var.K(kVar.E)) {
                TL_stories.PeerStories y3 = i5Var.y(kVar.E);
                long j3 = kVar.E;
                org.telegram.ui.web.a1 a1Var = this.f48618r0;
                if (a1Var != null) {
                    a1Var.a();
                    this.f48618r0 = null;
                }
                a3.h0 h0Var = new a3.h0(this, kVar, j3, 28);
                if (z10) {
                    h0Var.run();
                    return;
                }
                org.telegram.ui.web.a1 n10 = a6.n(y3, h0Var);
                kVar.e = n10;
                this.f48618r0 = n10;
                if (n10 != null) {
                    i5Var.e0(kVar.E, true);
                }
            }
        }
    }

    public final void j(long j3) {
        org.telegram.ui.ActionBar.f6 f6Var;
        k kVar;
        j4.w o9;
        wy wyVar = this.f48603e0;
        int i10 = this.f48604f;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            wyVar.showDialog(new qg.k0(o9.b(), this.f48604f, getContext(), this.f48603e0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            g gVar = this.h;
            f6Var = null;
            if (i12 < gVar.getChildCount()) {
                kVar = (k) gVar.getChildAt(i12);
                if (i11 == 0) {
                    if (kVar.F) {
                        break;
                    }
                    i12++;
                } else if (kVar.E == j3) {
                    break;
                } else {
                    i12++;
                }
            } else {
                kVar = null;
                break;
            }
        }
        if (kVar == null) {
            return;
        }
        if (i11 != 0) {
            if (wyVar != null) {
                f6Var = wyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, f6Var2);
            d2Var.q(500L);
            MessagesController.getInstance(i10).getStoriesController().k(j3, new to(this, d2Var, j3, kVar, 2), true, f6Var2);
            return;
        }
        ce.E(wyVar.getParentActivity(), i10).R(xd.c(kVar));
    }

    public final boolean k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48626x;
            if (i10 < arrayList.size()) {
                if (((j) arrayList.get(i10)).f48525c == j3) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            s4.c0 c0Var = this.S;
            if (i10 < c0Var.I0()) {
                c0Var.h1(i10, 0);
                return true;
            } else if (i10 > c0Var.M0()) {
                c0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f7, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (this.f48601c0 != f7) {
            this.f48601c0 = f7;
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
                    float f13 = this.f48602d0;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f10);
                    this.C0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final l f48314b;

                        {
                            this.f48314b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    l lVar = this.f48314b;
                                    lVar.getClass();
                                    lVar.f48602d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    lVar.b();
                                    return;
                                case 1:
                                    l lVar2 = this.f48314b;
                                    lVar2.getClass();
                                    lVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    l lVar3 = this.f48314b;
                                    lVar3.getClass();
                                    lVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    l lVar4 = this.f48314b;
                                    lVar4.getClass();
                                    lVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    lVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setInterpolator(wr.h);
                    float f14 = this.f48601c0;
                    if (z11) {
                        f11 = f14;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f11);
                    this.F0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final l f48314b;

                        {
                            this.f48314b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    l lVar = this.f48314b;
                                    lVar.getClass();
                                    lVar.f48602d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    lVar.b();
                                    return;
                                case 1:
                                    l lVar2 = this.f48314b;
                                    lVar2.getClass();
                                    lVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    l lVar3 = this.f48314b;
                                    lVar3.getClass();
                                    lVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    l lVar4 = this.f48314b;
                                    lVar4.getClass();
                                    lVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    lVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.F0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.K0 = animatorSet2;
                    animatorSet2.addListener(new iw0(14, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.C0);
                    arrayList.add(this.F0);
                    if (this.A0) {
                        this.K0.setDuration(1000L);
                        float f15 = this.f48602d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f15, f12);
                        this.D0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final l f48314b;

                            {
                                this.f48314b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        l lVar = this.f48314b;
                                        lVar.getClass();
                                        lVar.f48602d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        lVar.b();
                                        return;
                                    case 1:
                                        l lVar2 = this.f48314b;
                                        lVar2.getClass();
                                        lVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        l lVar3 = this.f48314b;
                                        lVar3.getClass();
                                        lVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        l lVar4 = this.f48314b;
                                        lVar4.getClass();
                                        lVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        lVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f48622u0);
                        this.J0 = overshootInterpolator;
                        this.D0.setInterpolator(overshootInterpolator);
                        this.D0.setDuration(750L);
                        arrayList.add(this.D0);
                    } else {
                        float f16 = this.f48602d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        this.H0 = ValueAnimator.ofFloat(f16, f12);
                        this.H0.setInterpolator(new OvershootInterpolator(this.f48623v0));
                        this.H0.setDuration(350L);
                        this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final l f48314b;

                            {
                                this.f48314b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        l lVar = this.f48314b;
                                        lVar.getClass();
                                        lVar.f48602d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        lVar.b();
                                        return;
                                    case 1:
                                        l lVar2 = this.f48314b;
                                        lVar2.getClass();
                                        lVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        l lVar3 = this.f48314b;
                                        lVar3.getClass();
                                        lVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        l lVar4 = this.f48314b;
                                        lVar4.getClass();
                                        lVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        lVar4.invalidate();
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
                this.f48602d0 = f12;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new y2.h(2));
            }
        }
    }

    public final boolean m() {
        long j3 = UserConfig.getInstance(this.f48604f).clientUserId;
        i5 i5Var = this.f48619s;
        if (!i5Var.J(j3)) {
            if (!i5Var.H() || i5Var.f48503g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.J == null) {
            bi.x4 x4Var = new bi.x4(getContext(), 1);
            x4Var.h(f(org.telegram.ui.ActionBar.j6.Fi));
            x4Var.p(true);
            x4Var.K = Layout.Alignment.ALIGN_CENTER;
            x4Var.l(0.0f, 29.0f);
            this.J = x4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new s51(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            bi.x4 x4Var2 = this.J;
            x4Var2.h = bi.x4.a(replaceSingleTag, x4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.a6.e(-1, 150, 51));
            }
        }
        bi.x4 x4Var3 = this.J;
        if (x4Var3 != null) {
            if (x4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        x20 x20Var = a6.f48258b;
        if (x20Var != null) {
            x20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
        }
        x20 x20Var2 = a6.f48259c;
        if (x20Var2 != null) {
            x20Var2.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
        }
        x20[] x20VarArr = a6.f48257a;
        x20 x20Var3 = x20VarArr[0];
        if (x20Var3 != null) {
            x20Var3.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
        }
        x20 x20Var4 = x20VarArr[1];
        if (x20Var4 != null) {
            x20Var4.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
        }
        if (a6.d != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xj, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false);
            a6.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        org.telegram.ui.ActionBar.j jVar = this.U;
        if (jVar != null) {
            jVar.c();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new m4.s0(textColor, 4));
        AndroidUtilities.forEachViews((RecyclerView) this.f48617r, (e2.h) new y2.h(3));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f48604f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.f6100a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.f6102c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f48597a0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f48604f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.f6100a = false;
        ((AnimatorSet) mVar.f6102c).cancel();
        org.telegram.ui.web.a1 a1Var = this.f48618r0;
        if (a1Var != null) {
            a1Var.a();
            this.f48618r0 = null;
        }
        this.f48597a0.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        this.T.setTextSize(AndroidUtilities.dp(f7));
        this.M = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O == 2) {
            int size = this.f48628y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            g gVar = this.f48617r;
            int x10 = (int) (gVar.getX() + dp);
            int y3 = (int) (gVar.getY() + gVar.getHeight());
            ed edVar = this.I;
            edVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) gVar.getX(), (int) gVar.getY(), x10, y3);
            edVar.f22677i = false;
            edVar.f22674c = 0;
            edVar.a(rectF);
            if (edVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
        boolean z12;
        ArrayList arrayList2;
        String formatPluralString;
        boolean z13;
        boolean z14;
        String string;
        if ((this.O == 1 || this.f48613n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f48626x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f48624w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f48628y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f48598b;
        int i11 = this.f48604f;
        if (i10 != 1) {
            arrayList4.add(new j(UserConfig.getInstance(i11).getClientUserId()));
        }
        i5 i5Var = this.f48619s;
        if (i10 == 1) {
            arrayList = i5Var.h;
        } else {
            arrayList = i5Var.f48503g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new j(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!i5Var.H()) {
            size--;
        }
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(i5Var.C(z12), size));
        this.f48605f0 = null;
        boolean G = i5Var.G();
        org.telegram.ui.Components.o6 o6Var = this.T;
        if (G) {
            arrayList2 = arrayList4;
            if (i5Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f48608i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        a8 a8Var = new a8();
                        valueOf.setSpan(a8Var, valueOf.length() - 1, valueOf.length(), 0);
                        a8Var.f48281a = o6Var;
                        a8Var.f48285n = true;
                        this.f48608i0 = valueOf;
                    }
                    this.f48605f0 = this.f48608i0;
                } else {
                    this.f48605f0 = string2;
                }
            } else {
                if (this.f48620s0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f48605f0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f48620s0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f48605f0 = formatPluralString;
        }
        if (!this.f48606g0) {
            CharSequence charSequence = this.f48605f0;
            if (z10 && !LocaleController.isRTL) {
                z14 = true;
            } else {
                z14 = false;
            }
            o6Var.c(charSequence, z14, true);
        }
        if (TextUtils.isEmpty(this.f48605f0) && !this.f48606g0) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f48596a.a(z13, z10);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((j) arrayList2.get(i13)).f48525c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((j) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        g gVar = this.h;
        g gVar2 = this.f48617r;
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
        this.f48616q0 = lVar;
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
        this.f48620s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.f48613n0 = f7 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(f7, true);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        bi.x4 x4Var = this.J;
        if (x4Var != null) {
            x4Var.setTranslationY(f7);
        }
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
