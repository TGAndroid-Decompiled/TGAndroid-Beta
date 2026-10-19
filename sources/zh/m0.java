package zh;

import ai.kc;
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
import com.google.android.gms.internal.play_billing.k3;
import ei.i6;
import ki.m3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.x90;
import org.telegram.ui.vk0;
import org.telegram.ui.w9;
import w7.z5;
import yh.o1;
public class m0 extends n2 {
    public boolean E;
    public b0 F;
    public boolean G;
    public final g0 H;
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
    public long f52024a;
    public int f52025a0;
    public long f52026b;
    public int f52027b0;
    public org.telegram.ui.g f52028c;
    public int f52029c0;
    public c1 d;
    public float f52030d0;
    public q0 e;
    public boolean f52031e0;
    public FrameLayout f52032f;
    public LinearGradient f52033f0;
    public final Paint f52034g0;
    public j0 h;
    public final RectF f52035h0;
    public final int[] f52036i0;
    public final int[] f52037j0;
    public final int[] f52038k0;
    public final Path f52039l0;
    public final RectF m0;
    public float f52040n;
    public Paint f52041n0;
    public final q10 f52042o0;
    public final RectF f52043p0;
    public boolean f52044q0;
    public float f52045r;
    public Boolean f52046r0;
    public float f52047s;
    public float v;
    public float f52048w;
    public c f52049x;
    public boolean f52050y;

    public m0(Bundle bundle) {
        super(bundle);
        this.H = new g0(this, 0);
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
        this.f52034g0 = new Paint();
        this.f52035h0 = new RectF();
        this.f52036i0 = new int[2];
        this.f52037j0 = new int[2];
        this.f52038k0 = new int[2];
        this.f52039l0 = new Path();
        this.m0 = new RectF();
        this.f52042o0 = new q10(2);
        this.f52043p0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void U(m0 m0Var, AnimatorSet animatorSet) {
        m0Var.g0();
        boolean z10 = !m0Var.f52050y;
        int i10 = m0Var.currentAccount;
        m0Var.Y = i10;
        m0Var.W = NotificationCenter.getInstance(i10).setAnimationInProgress(-1, null, z10);
        m0Var.X = NotificationCenter.getGlobalInstance().setAnimationInProgress(-1, null, z10);
        animatorSet.start();
    }

    public static void V(m0 m0Var) {
        if (m0Var.getParentActivity() == null) {
            return;
        }
        o1 o1Var = new o1(m0Var.getParentActivity(), m0Var.currentAccount, m0Var.getUserConfig().getClientUserId(), null, null);
        if (!o1Var.f50440u0) {
            o1Var.f50440u0 = true;
            kc kcVar = o1Var.f50442w0;
            if (kcVar != null && (kcVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) o1Var.f50442w0.getParent();
                int indexOfChild = viewGroup.indexOfChild(o1Var.f50442w0);
                viewGroup.removeView(o1Var.f50442w0);
                kc kcVar2 = new kc(o1Var.getContext(), 250, 2);
                o1Var.f50442w0 = kcVar2;
                viewGroup.addView(kcVar2, indexOfChild, z5.c(-1.0f, -1));
            }
            x90 x90Var = o1Var.f50443x0;
            if (x90Var != null) {
                String string = LocaleController.getString(R.string.Gift2BrowseCollectiblesInfo);
                yh.u0 u0Var = o1Var.f50432l0;
                u0Var.setText(string);
                u0Var.setBreakStrategy(2);
                x90Var.setVisibility(8);
            }
            o1Var.Y.N(false);
        }
        o1Var.show();
    }

    public static void X(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                X(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void Z(n2 n2Var) {
        w9.e0(n2Var.getParentActivity(), 1, new h0(n2Var.getCurrentAccount(), n2Var));
    }

    public static LinearGradient e0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = i10 / 8.0f;
            float B = k3.B(f7, 2.0f, 3.0f, f7 * f7);
            if (!z10) {
                B = 1.0f - B;
            }
            iArr[i10] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i10] = f7;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void W() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            AndroidUtilities.setLightNavigationBar(parentActivity, false);
            AndroidUtilities.setLightStatusBar(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.f52046r0 == null) {
                    this.f52046r0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void Y() {
        c1 c1Var;
        if (this.h != null && (c1Var = this.d) != null && c1Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f52032f.getWidth() - (this.d.getWidth() - AndroidUtilities.dp(10.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
            if (layoutParams.height != max || layoutParams.leftMargin != r2 || layoutParams.rightMargin != width) {
                layoutParams.height = max;
                layoutParams.leftMargin = r2;
                layoutParams.rightMargin = width;
                this.h.setLayoutParams(layoutParams);
            }
        }
    }

    public final void a0() {
        if (this.F == null && this.d != null && this.f52032f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.f51805k7);
            rectF2.set(this.d.f51775h7);
            if (rectF.isEmpty()) {
                rectF.set((this.f52032f.getWidth() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f52032f.getHeight() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f52032f.getWidth() / 2.0f) + AndroidUtilities.dp(20.0f), (this.f52032f.getHeight() / 2.0f) + AndroidUtilities.dp(20.0f));
            }
            this.d.setScanHidden(true);
            b0 b0Var = new b0(getParentActivity(), rectF, rectF2, new te.b(this, 8));
            this.F = b0Var;
            b0Var.setButtonLabel(LocaleController.getString(R.string.QrScanQr));
            b0 b0Var2 = this.F;
            b0Var2.setOnGallery(new uf.c(27, this, b0Var2));
            this.f52032f.addView(this.F, z5.c(-1.0f, -1));
        }
    }

    public final void b0(float f7, float f10, boolean z10) {
        int i10;
        int i11;
        if (!z10) {
            j0 j0Var = this.h;
            if (j0Var != null && j0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.f52049x;
            if (cVar != null && cVar.getVisibility() == 0) {
                this.f52049x.setVisibility(4);
                return;
            }
            return;
        }
        if (this.h == null) {
            if (getParentActivity() != null) {
                j0 j0Var2 = new j0(this, getParentActivity(), this.currentAccount, new i0(this));
                this.h = j0Var2;
                j0Var2.setOutlineProvider(new k0(this, 0));
                this.h.setClipToOutline(true);
                c cVar2 = new c(getParentActivity(), new l0(this));
                this.f52049x = cVar2;
                cVar2.f51683b = this.h;
                this.d.setOnPicksChanged(new g0(this, 1));
                this.f52049x.setOutlineProvider(this.h.getOutlineProvider());
                this.f52049x.setClipToOutline(true);
                this.f52032f.addView(this.h, z5.e(-1, -1, 48));
                Y();
                this.f52032f.post(new g0(this, 2));
            } else {
                return;
            }
        }
        Y();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = layoutParams.leftMargin;
        int i14 = layoutParams.rightMargin;
        if (this.f52049x.getParent() == null) {
            this.f52032f.addView(this.f52049x, z5.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f52049x.getLayoutParams();
        if (layoutParams2.height != i12 || layoutParams2.leftMargin != i13 || layoutParams2.rightMargin != i14) {
            layoutParams2.height = i12;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i14;
            this.f52049x.setLayoutParams(layoutParams2);
        }
        this.f52049x.setTranslationY(f7);
        this.f52049x.setAlpha(f10);
        this.f52049x.invalidateOutline();
        this.f52049x.invalidate();
        if (this.f52049x.getVisibility() != 0) {
            this.f52049x.setVisibility(0);
        }
        int t02 = this.d.t0();
        a1 a1Var = this.d.f51825n;
        if (a1Var != null) {
            i10 = a1Var.h;
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
        j0 j0Var3 = this.h;
        c1 c1Var = this.d;
        a1 a1Var2 = c1Var.f51825n;
        if (a1Var2 != null) {
            i11 = a1Var2.f51634b;
        } else {
            i11 = -16777216;
        }
        if (i11 != c1Var.a2) {
            c1Var.a2 = i11;
            c1Var.f51710b2 = (i0.a.f(0.13f, -1, c1.D0(0.75f, 1.3f, 0.16f, i11)) & 16777215) | (-1728053248);
        }
        j0Var3.setHeaderColor(c1Var.f51710b2);
        if (this.h.getVisibility() != 0) {
            j0 j0Var4 = this.h;
            if (j0Var4.J) {
                j0Var4.J = false;
                j0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f52044q0) {
            f0();
        }
    }

    public final void c0() {
        c1 c1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (c1Var = this.d) != null && c1Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.E = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.globalQueue.postRunnable(new uf.c(26, this, T0));
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return false;
    }

    @Override
    public final void clearViews() {
        FrameLayout frameLayout = this.f52032f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        b0 b0Var = this.F;
        if (b0Var != null) {
            b0Var.g();
            this.F = null;
        }
        q0 q0Var = this.e;
        if (q0Var != null) {
            q0Var.k();
            this.e = null;
        }
        super.clearViews();
        c1 c1Var = this.d;
        if (c1Var != null) {
            c1Var.O0();
            this.d = null;
        }
        this.f52032f = null;
        this.h = null;
        this.f52049x = null;
        this.Z = null;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: zh.m0.createView(android.content.Context):android.view.View");
    }

    public final void d0(String str) {
        c1 c1Var;
        Uri uri;
        if (getParentActivity() != null && (c1Var = this.d) != null && c1Var.getCurrentLink() != null) {
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                uri = AndroidUtilities.getBitmapShareUri(T0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
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
                getParentActivity().startActivity(Intent.createChooser(intent, LocaleController.getString(R.string.InviteByQRCode)));
            } catch (ActivityNotFoundException e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
        j0 j0Var;
        if (this.f52044q0 || (j0Var = this.h) == null) {
            return;
        }
        q tabs = j0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(20.0f));
        float[] fArr = d1.f51963a[0];
        int ceil = (int) Math.ceil(AndroidUtilities.dpf2(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.f52025a0 = Math.max(0, i10);
        this.f52027b0 = Math.max(0, i10);
        this.f52029c0 = Math.max(0, ceil - 4);
        tabs.f52069a = new org.telegram.ui.web.m(27, this, tabs);
        tabs.f52070b = new c0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.f52025a0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.f52027b0, i11, this.f52029c0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new k0(this, 1));
        tabs.setClipToOutline(true);
        if (tabs.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabs.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            if (marginLayoutParams.leftMargin != dp || marginLayoutParams.rightMargin != dp || marginLayoutParams.topMargin != dp2) {
                marginLayoutParams.leftMargin = dp;
                marginLayoutParams.rightMargin = dp;
                marginLayoutParams.topMargin = dp2;
                tabs.setLayoutParams(marginLayoutParams);
            }
        }
        m grid = this.h.getGrid();
        this.f52044q0 = true;
        grid.W2 = new d0(this, grid, tabs);
        grid.V2 = new e0(this, grid);
        c cVar = this.f52049x;
        if (cVar.T != grid) {
            cVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new kv(cVar, 25));
        }
        int dp3 = AndroidUtilities.dp(44.0f);
        this.Z = grid;
        grid.setPadding(grid.getPaddingLeft(), dp3, AndroidUtilities.dp(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        h0();
        grid.setClipToPadding(false);
        grid.j(new m3(10, this, tabs));
        tabs.bringToFront();
    }

    public final void g0() {
        if (this.W >= 0) {
            NotificationCenter.getInstance(this.Y).onAnimationFinish(this.W);
        }
        if (this.X >= 0) {
            NotificationCenter.getGlobalInstance().onAnimationFinish(this.X);
        }
        this.X = -1;
        this.W = -1;
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        c1 c1Var;
        float f7;
        m mVar = this.Z;
        if (mVar != null && (c1Var = this.d) != null) {
            if (c1Var.I.isEmpty()) {
                f7 = 12.0f;
            } else {
                f7 = 73.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (mVar.getPaddingBottom() != dp) {
                mVar.setPadding(mVar.getPaddingLeft(), mVar.getPaddingTop(), mVar.getPaddingRight(), dp);
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

    @Override
    public final boolean onBackPressed(boolean z10) {
        b0 b0Var = this.F;
        if (b0Var != null) {
            if (z10) {
                b0Var.e();
            }
            return false;
        }
        c1 c1Var = this.d;
        if (c1Var != null) {
            float f7 = c1Var.f51799k1;
            if (f7 > 0.5f || c1Var.f51750f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        c1Var.l1 = 0.0f;
                    } else if (c1Var.f51750f1 > 0.5f) {
                        c1Var.f51759g1 = 0.0f;
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
        if (this.d != null && !AndroidUtilities.isTablet()) {
            this.d.setRevealOpening(z10);
            c1 c1Var = this.d;
            float f11 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            c1Var.setReveal(f7);
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            ofFloat.addUpdateListener(new i6(this, 29));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat);
            if (z10) {
                j10 = 860;
            } else {
                j10 = 200;
            }
            animatorSet.setDuration(j10);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new ah.q0(this, z10, runnable, 15));
            AndroidUtilities.runOnUIThread(new uf.c(25, this, animatorSet));
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
        this.f52024a = j10;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j11 = bundle2.getLong("chat_id");
        } else {
            j11 = 0;
        }
        this.f52026b = j11;
        Bundle bundle3 = this.arguments;
        if (bundle3 != null && bundle3.getBoolean("immediate") && SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52050y = z10;
        if (this.f52024a == 0 && this.f52026b == 0) {
            this.f52024a = getUserConfig().getClientUserId();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        g0();
        org.telegram.ui.g gVar = this.f52028c;
        if (gVar != null) {
            vk0 vk0Var = (vk0) gVar.f37149b;
            if (vk0Var.f42270b.remove(gVar)) {
                vk0Var.a();
            }
            this.f52028c = null;
        }
        FrameLayout frameLayout = this.f52032f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        b0 b0Var = this.F;
        if (b0Var != null) {
            b0Var.g();
            this.F = null;
        }
        q0 q0Var = this.e;
        if (q0Var != null) {
            q0Var.k();
            this.e = null;
        }
        c1 c1Var = this.d;
        if (c1Var != null) {
            c1Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        b0 b0Var = this.F;
        if (b0Var != null) {
            b0Var.g();
            b0 b0Var2 = this.F;
            FrameLayout frameLayout = this.f52032f;
            if (frameLayout != null) {
                frameLayout.removeView(b0Var2);
            }
            if (this.F == b0Var2) {
                this.F = null;
            }
            c1 c1Var = this.d;
            if (c1Var != null) {
                c1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f52046r0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f52046r0.booleanValue());
            this.f52046r0 = null;
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
                c0();
            }
            this.E = false;
        } else if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                a0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20604a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c0(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, h6.x0(null, h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        W();
        if (getParentActivity() != null) {
            AndroidUtilities.setLightNavigationBar(getParentActivity(), false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        c1 c1Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.G = true;
        }
        if (z10 && (c1Var = this.d) != null) {
            c1Var.setReveal(1.0f);
        }
        if (z10 && !z11 && this.f52032f != null) {
            float f7 = f.S;
            long j10 = 0;
            if (Build.VERSION.SDK_INT >= 29 && SharedConfig.getDevicePerformanceClass() == 2) {
                j10 = Math.max(0L, Math.round(d1.f51964b[51]) - 860);
            }
            FrameLayout frameLayout = this.f52032f;
            g0 g0Var = this.H;
            frameLayout.removeCallbacks(g0Var);
            this.f52032f.postDelayed(g0Var, j10 + 680);
        }
    }
}
