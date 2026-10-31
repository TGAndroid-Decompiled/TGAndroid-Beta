package qh;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import bi.t3;
import kg.t1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.k9;
import org.telegram.messenger.tz;
import org.telegram.messenger.v2;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.kj0;
import org.telegram.ui.u9;
import org.telegram.ui.web.v1;
import ph.l1;
import rh.o7;
import w7.b6;
public class i0 extends k2 {
    public boolean D;
    public boolean E;
    public y F;
    public boolean G;
    public final d0 H;
    public int I;
    public final Paint J;
    public float K;
    public final int[] L;
    public final int[] M;
    public LinearGradient N;
    public final Paint O;
    public final Matrix P;
    public final Paint Q;
    public final RectF R;
    public final float[] S;
    public final int[] T;
    public final int[] U;
    public LinearGradient V;
    public int W;
    public int X;
    public int Y;
    public m Z;
    public long f45642a;
    public int f45643a0;
    public long f45644b;
    public int f45645b0;
    public org.telegram.ui.e f45646c;
    public int f45647c0;
    public x0 d;
    public float f45648d0;
    public m0 e;
    public boolean f45649e0;
    public FrameLayout f45650f;
    public LinearGradient f45651f0;
    public final Paint f45652g0;
    public g0 h;
    public final RectF f45653h0;
    public final int[] f45654i0;
    public final int[] f45655j0;
    public final int[] f45656k0;
    public final Path f45657l0;
    public final RectF m0;
    public float f45658n;
    public Paint f45659n0;
    public final k9 f45660o0;
    public final RectF f45661p0;
    public boolean f45662q0;
    public float f45663r;
    public Boolean f45664r0;
    public float f45665s;
    public float f45666w;
    public float f45667x;
    public c f45668y;

    public i0(Bundle bundle) {
        super(bundle);
        this.H = new d0(this, 0);
        this.J = new Paint();
        this.K = Float.NaN;
        this.L = new int[2];
        this.M = new int[2];
        this.O = new Paint();
        this.P = new Matrix();
        this.Q = new Paint(1);
        this.R = new RectF();
        this.S = new float[2];
        this.T = new int[2];
        this.U = new int[2];
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.f45652g0 = new Paint();
        this.f45653h0 = new RectF();
        this.f45654i0 = new int[2];
        this.f45655j0 = new int[2];
        this.f45656k0 = new int[2];
        this.f45657l0 = new Path();
        this.m0 = new RectF();
        this.f45660o0 = new k9(3);
        this.f45661p0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void Y(i0 i0Var, AnimatorSet animatorSet) {
        i0Var.k0();
        boolean z10 = !i0Var.D;
        int i10 = i0Var.currentAccount;
        i0Var.Y = i10;
        i0Var.W = zs.f(i10).q(null, -1, z10);
        i0Var.X = zs.e().q(null, -1, z10);
        animatorSet.start();
    }

    public static void Z(i0 i0Var) {
        if (i0Var.getParentActivity() == null) {
            return;
        }
        l1 l1Var = new l1(i0Var.getParentActivity(), i0Var.currentAccount, i0Var.getUserConfig().e(), null, null);
        if (!l1Var.f45204l2) {
            l1Var.f45204l2 = true;
            o7 o7Var = l1Var.f45206n2;
            if (o7Var != null && (o7Var.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) l1Var.f45206n2.getParent();
                int indexOfChild = viewGroup.indexOfChild(l1Var.f45206n2);
                viewGroup.removeView(l1Var.f45206n2);
                o7 o7Var2 = new o7(l1Var.getContext(), 250, 2, 0);
                l1Var.f45206n2 = o7Var2;
                viewGroup.addView(o7Var2, indexOfChild, b6.c(-1.0f, -1));
            }
            p80 p80Var = l1Var.f45207o2;
            if (p80Var != null) {
                String L0 = cd.L0(2131750297, null);
                t1 t1Var = l1Var.f45195c2;
                t1Var.setText(L0);
                t1Var.setBreakStrategy(2);
                p80Var.setVisibility(8);
            }
            l1Var.Q1.O(false);
        }
        l1Var.show();
    }

    public static void b0(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                b0(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void d0(k2 k2Var) {
        u9.i0(k2Var.getParentActivity(), 1, new c5.x(k2Var.getCurrentAccount(), k2Var, 15));
    }

    public static LinearGradient i0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = i10 / 8.0f;
            float D = c3.i0.D(f7, 2.0f, 3.0f, f7 * f7);
            if (!z10) {
                D = 1.0f - D;
            }
            iArr[i10] = ((int) ((D * 255.0f) + 0.5f)) << 24;
            fArr[i10] = f7;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void a0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            org.telegram.messenger.i0.l3(parentActivity, false);
            org.telegram.messenger.i0.r3(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.f45664r0 == null) {
                    this.f45664r0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void c0() {
        x0 x0Var;
        if (this.h != null && (x0Var = this.d) != null && x0Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f45650f.getWidth() - (this.d.getWidth() - org.telegram.messenger.i0.L(10.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
            if (layoutParams.height != max || layoutParams.leftMargin != r2 || layoutParams.rightMargin != width) {
                layoutParams.height = max;
                layoutParams.leftMargin = r2;
                layoutParams.rightMargin = width;
                this.h.setLayoutParams(layoutParams);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return false;
    }

    @Override
    public final void clearViews() {
        FrameLayout frameLayout = this.f45650f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        y yVar = this.F;
        if (yVar != null) {
            yVar.g();
            this.F = null;
        }
        m0 m0Var = this.e;
        if (m0Var != null) {
            m0Var.l();
            this.e = null;
        }
        super.clearViews();
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.O0();
            this.d = null;
        }
        this.f45650f = null;
        this.h = null;
        this.f45668y = null;
        this.Z = null;
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r34) {
        throw new UnsupportedOperationException("Method not decompiled: qh.i0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        if (this.F == null && this.d != null && this.f45650f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.f45895j7);
            rectF2.set(this.d.f45865g7);
            if (rectF.isEmpty()) {
                rectF.set((this.f45650f.getWidth() / 2.0f) - org.telegram.messenger.i0.L(20.0f), (this.f45650f.getHeight() / 2.0f) - org.telegram.messenger.i0.L(20.0f), (this.f45650f.getWidth() / 2.0f) + org.telegram.messenger.i0.L(20.0f), (this.f45650f.getHeight() / 2.0f) + org.telegram.messenger.i0.L(20.0f));
            }
            this.d.setScanHidden(true);
            y yVar = new y(getParentActivity(), rectF, rectF2, new n2.u(this, 18));
            this.F = yVar;
            yVar.setButtonLabel(cd.L0(2131746485, null));
            y yVar2 = this.F;
            yVar2.setOnGallery(new v1(19, this, yVar2));
            this.f45650f.addView(this.F, b6.c(-1.0f, -1));
        }
    }

    public final void f0(float f7, float f10, boolean z10) {
        int i10;
        int i11;
        if (!z10) {
            g0 g0Var = this.h;
            if (g0Var != null && g0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.f45668y;
            if (cVar != null && cVar.getVisibility() == 0) {
                this.f45668y.setVisibility(4);
                return;
            }
            return;
        }
        if (this.h == null) {
            if (getParentActivity() != null) {
                g0 g0Var2 = new g0(this, getParentActivity(), this.currentAccount, new f0(this));
                this.h = g0Var2;
                g0Var2.setOutlineProvider(new h0(this, 0));
                this.h.setClipToOutline(true);
                c cVar2 = new c(getParentActivity(), new k2.m0(this));
                this.f45668y = cVar2;
                cVar2.f45576b = this.h;
                this.d.setOnPicksChanged(new d0(this, 1));
                this.f45668y.setOutlineProvider(this.h.getOutlineProvider());
                this.f45668y.setClipToOutline(true);
                this.f45650f.addView(this.h, b6.e(-1, -1, 48));
                c0();
                this.f45650f.post(new d0(this, 2));
            } else {
                return;
            }
        }
        c0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = layoutParams.leftMargin;
        int i14 = layoutParams.rightMargin;
        if (this.f45668y.getParent() == null) {
            this.f45650f.addView(this.f45668y, b6.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f45668y.getLayoutParams();
        if (layoutParams2.height != i12 || layoutParams2.leftMargin != i13 || layoutParams2.rightMargin != i14) {
            layoutParams2.height = i12;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i14;
            this.f45668y.setLayoutParams(layoutParams2);
        }
        this.f45668y.setTranslationY(f7);
        this.f45668y.setAlpha(f10);
        this.f45668y.invalidateOutline();
        this.f45668y.invalidate();
        if (this.f45668y.getVisibility() != 0) {
            this.f45668y.setVisibility(0);
        }
        int t02 = this.d.t0();
        v0 v0Var = this.d.f45925n;
        if (v0Var != null) {
            i10 = v0Var.h;
        } else {
            i10 = 872415231;
        }
        int i15 = t02 ^ i10;
        if (this.h.getTranslationY() != f7 || i15 != this.I) {
            this.h.setTranslationY(f7);
            this.I = i15;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f10);
        g0 g0Var3 = this.h;
        x0 x0Var = this.d;
        v0 v0Var2 = x0Var.f45925n;
        if (v0Var2 != null) {
            i11 = v0Var2.f45787b;
        } else {
            i11 = -16777216;
        }
        if (i11 != x0Var.a2) {
            x0Var.a2 = i11;
            x0Var.f45810b2 = (i0.b.f(0.13f, -1, x0.D0(0.75f, 1.3f, 0.16f, i11)) & 16777215) | (-1728053248);
        }
        g0Var3.setHeaderColor(x0Var.f45810b2);
        if (this.h.getVisibility() != 0) {
            g0 g0Var4 = this.h;
            if (g0Var4.J) {
                g0Var4.J = false;
                g0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f45662q0) {
            j0();
        }
    }

    public final void g0() {
        x0 x0Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (x0Var = this.d) != null && x0Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || v2.f18449b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.E = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.e.c(new v1(18, this, T0));
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0(String str) {
        x0 x0Var;
        Uri uri;
        if (getParentActivity() != null && (x0Var = this.d) != null && x0Var.getCurrentLink() != null) {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                uri = org.telegram.messenger.i0.C0(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
            } else {
                uri = null;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (uri != null) {
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.addFlags(1);
            } else if (!TextUtils.isEmpty(str)) {
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str);
            } else {
                return;
            }
            try {
                getParentActivity().startActivity(Intent.createChooser(intent, cd.L0(2131749180, null)));
            } catch (ActivityNotFoundException e) {
                f8.g(e, true);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        g0 g0Var;
        if (this.f45662q0 || (g0Var = this.h) == null) {
            return;
        }
        q tabs = g0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(20.0f));
        float[] fArr = y0.f46091a[0];
        int ceil = (int) Math.ceil(org.telegram.messenger.i0.N(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.f45643a0 = Math.max(0, i10);
        this.f45645b0 = Math.max(0, i10);
        this.f45647c0 = Math.max(0, ceil - 4);
        tabs.f45713a = new org.telegram.ui.web.k0(8, this, tabs);
        tabs.f45714b = new z(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.f45643a0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.f45645b0, i11, this.f45647c0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new h0(this, 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int L = org.telegram.messenger.i0.L(10.0f);
            int L2 = org.telegram.messenger.i0.L(2.0f);
            if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L || marginLayoutParams.topMargin != L2) {
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.topMargin = L2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        m grid = this.h.getGrid();
        this.f45662q0 = true;
        grid.f45686f3 = new a0(this, grid, tabs);
        grid.f45685e3 = new b0(this, grid);
        c cVar = this.f45668y;
        if (cVar.T != grid) {
            cVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new bu0(cVar, 14));
        }
        int L3 = org.telegram.messenger.i0.L(44.0f);
        this.Z = grid;
        grid.setPadding(grid.getPaddingLeft(), L3, org.telegram.messenger.i0.L(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        l0();
        grid.setClipToPadding(false);
        grid.j(new t3(11, this, tabs));
        tabs.bringToFront();
    }

    public final void k0() {
        if (this.W >= 0) {
            zs.f(this.Y).j(this.W);
        }
        if (this.X >= 0) {
            zs.e().j(this.X);
        }
        this.X = -1;
        this.W = -1;
    }

    public final void l0() {
        x0 x0Var;
        float f7;
        m mVar = this.Z;
        if (mVar != null && (x0Var = this.d) != null) {
            if (x0Var.I.isEmpty()) {
                f7 = 12.0f;
            } else {
                f7 = 73.0f;
            }
            int L = org.telegram.messenger.i0.L(f7);
            if (mVar.getPaddingBottom() != L) {
                mVar.setPadding(mVar.getPaddingLeft(), mVar.getPaddingTop(), mVar.getPaddingRight(), L);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        y yVar = this.F;
        if (yVar != null) {
            if (z10) {
                yVar.e();
            }
            return false;
        }
        x0 x0Var = this.d;
        if (x0Var != null) {
            float f7 = x0Var.f45899k1;
            if (f7 > 0.5f || x0Var.f45850f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        x0Var.l1 = 0.0f;
                    } else if (x0Var.f45850f1 > 0.5f) {
                        x0Var.f45859g1 = 0.0f;
                    }
                }
                return false;
            }
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        float f7;
        float f10;
        long j10;
        if (this.d != null && !org.telegram.messenger.i0.Q1()) {
            this.d.setRevealOpening(z10);
            x0 x0Var = this.d;
            float f11 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            x0Var.setReveal(f7);
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            ofFloat.addUpdateListener(new e0(this, 0));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            if (z10) {
                j10 = 860;
            } else {
                j10 = 200;
            }
            animatorSet.setDuration(j10);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new androidx.fragment.app.g(this, z10, runnable, 13));
            org.telegram.messenger.i0.g3(new v1(17, this, animatorSet));
            return animatorSet;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        long j10;
        long j11;
        boolean z10;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            j10 = bundle.getLong("user_id");
        } else {
            j10 = 0;
        }
        this.f45642a = j10;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j11 = bundle2.getLong("chat_id");
        } else {
            j11 = 0;
        }
        this.f45644b = j11;
        Bundle bundle3 = this.arguments;
        if (bundle3 != null && bundle3.getBoolean("immediate") && tz.o() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        if (this.f45642a == 0 && this.f45644b == 0) {
            this.f45642a = getUserConfig().e();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0();
        org.telegram.ui.e eVar = this.f45646c;
        if (eVar != null) {
            kj0 kj0Var = (kj0) eVar.f36877b;
            if (kj0Var.f38879b.remove(eVar)) {
                kj0Var.a();
            }
            this.f45646c = null;
        }
        FrameLayout frameLayout = this.f45650f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        y yVar = this.F;
        if (yVar != null) {
            yVar.g();
            this.F = null;
        }
        m0 m0Var = this.e;
        if (m0Var != null) {
            m0Var.l();
            this.e = null;
        }
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        y yVar = this.F;
        if (yVar != null) {
            yVar.g();
            y yVar2 = this.F;
            FrameLayout frameLayout = this.f45650f;
            if (frameLayout != null) {
                frameLayout.removeView(yVar2);
            }
            if (this.F == yVar2) {
                this.F = null;
            }
            x0 x0Var = this.d;
            if (x0Var != null) {
                x0Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f45664r0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f45664r0.booleanValue());
            this.f45664r0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        if (i10 == 4) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.E && z10) {
                this.E = false;
                g0();
            }
            this.E = false;
        } else if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                e0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(cd.L0(2131746518, null));
            alertDialog$Builder.k(cd.L0(2131747316, null), new z(this));
            alertDialog$Builder.h(cd.L0(2131751772, null), null);
            int i11 = t6.L5;
            alertDialog$Builder.m(2131624114, 72, t6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        a0();
        if (getParentActivity() != null) {
            org.telegram.messenger.i0.l3(getParentActivity(), false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        x0 x0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.G = true;
        }
        if (z10 && (x0Var = this.d) != null) {
            x0Var.setReveal(1.0f);
        }
        if (z10 && !z11 && this.f45650f != null) {
            float f7 = g.S;
            long j10 = 0;
            if (Build.VERSION.SDK_INT >= 29 && tz.o() == 2) {
                j10 = Math.max(0L, Math.round(y0.f46092b[51]) - 860);
            }
            FrameLayout frameLayout = this.f45650f;
            d0 d0Var = this.H;
            frameLayout.removeCallbacks(d0Var);
            this.f45650f.postDelayed(d0Var, j10 + 680);
        }
    }
}
