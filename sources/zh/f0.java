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
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
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
import org.telegram.ui.xk0;
import org.telegram.ui.y9;
import w7.z5;
import yh.o1;
public class f0 extends n2 {
    public boolean E;
    public w F;
    public boolean G;
    public final a0 H;
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
    public long f51701a;
    public int f51702a0;
    public long f51703b;
    public int f51704b0;
    public org.telegram.ui.g f51705c;
    public int f51706c0;
    public u0 d;
    public float f51707d0;
    public i0 e;
    public boolean f51708e0;
    public FrameLayout f51709f;
    public LinearGradient f51710f0;
    public final Paint f51711g0;
    public d0 h;
    public final RectF f51712h0;
    public final int[] f51713i0;
    public final int[] f51714j0;
    public final int[] f51715k0;
    public final Path f51716l0;
    public final RectF m0;
    public float f51717n;
    public Paint f51718n0;
    public final q10 f51719o0;
    public final RectF f51720p0;
    public boolean f51721q0;
    public float f51722r;
    public Boolean f51723r0;
    public float f51724s;
    public float v;
    public float f51725w;
    public c f51726x;
    public boolean f51727y;

    public f0(Bundle bundle) {
        super(bundle);
        this.H = new a0(this, 0);
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
        this.f51711g0 = new Paint();
        this.f51712h0 = new RectF();
        this.f51713i0 = new int[2];
        this.f51714j0 = new int[2];
        this.f51715k0 = new int[2];
        this.f51716l0 = new Path();
        this.m0 = new RectF();
        this.f51719o0 = new q10(2);
        this.f51720p0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void U(f0 f0Var, AnimatorSet animatorSet) {
        f0Var.g0();
        boolean z10 = !f0Var.f51727y;
        int i10 = f0Var.currentAccount;
        f0Var.Y = i10;
        f0Var.W = NotificationCenter.getInstance(i10).setAnimationInProgress(-1, null, z10);
        f0Var.X = NotificationCenter.getGlobalInstance().setAnimationInProgress(-1, null, z10);
        animatorSet.start();
    }

    public static void V(f0 f0Var) {
        if (f0Var.getParentActivity() == null) {
            return;
        }
        o1 o1Var = new o1(f0Var.getParentActivity(), f0Var.currentAccount, f0Var.getUserConfig().getClientUserId(), null, null);
        if (!o1Var.f50441u0) {
            o1Var.f50441u0 = true;
            kc kcVar = o1Var.f50443w0;
            if (kcVar != null && (kcVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) o1Var.f50443w0.getParent();
                int indexOfChild = viewGroup.indexOfChild(o1Var.f50443w0);
                viewGroup.removeView(o1Var.f50443w0);
                kc kcVar2 = new kc(o1Var.getContext(), 250, 2);
                o1Var.f50443w0 = kcVar2;
                viewGroup.addView(kcVar2, indexOfChild, z5.c(-1.0f, -1));
            }
            x90 x90Var = o1Var.f50444x0;
            if (x90Var != null) {
                String string = LocaleController.getString(R.string.Gift2BrowseCollectiblesInfo);
                yh.u0 u0Var = o1Var.f50433l0;
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
        y9.e0(n2Var.getParentActivity(), false, 1, new b0(n2Var.getCurrentAccount(), n2Var));
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
                if (this.f51723r0 == null) {
                    this.f51723r0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void Y() {
        u0 u0Var;
        if (this.h != null && (u0Var = this.d) != null && u0Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.a1() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f51709f.getWidth() - (this.d.getWidth() - AndroidUtilities.dp(10.0f)));
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
        if (this.F == null && this.d != null && this.f51709f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.f51960k7);
            rectF2.set(this.d.f51930h7);
            if (rectF.isEmpty()) {
                rectF.set((this.f51709f.getWidth() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f51709f.getHeight() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f51709f.getWidth() / 2.0f) + AndroidUtilities.dp(20.0f), (this.f51709f.getHeight() / 2.0f) + AndroidUtilities.dp(20.0f));
            }
            this.d.setScanHidden(true);
            w wVar = new w(getParentActivity(), rectF, rectF2, new le.b(this, 29));
            this.F = wVar;
            wVar.J = LocaleController.getString(R.string.QrScanQr);
            Typeface bold = AndroidUtilities.bold();
            TextPaint textPaint = wVar.K;
            textPaint.setTypeface(bold);
            textPaint.setColor(-1);
            wVar.invalidate();
            this.f51709f.addView(this.F, z5.c(-1.0f, -1));
        }
    }

    public final void b0(float f7, float f10, boolean z10) {
        int i10;
        int i11;
        if (!z10) {
            d0 d0Var = this.h;
            if (d0Var != null && d0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.f51726x;
            if (cVar != null && cVar.getVisibility() == 0) {
                this.f51726x.setVisibility(4);
                return;
            }
            return;
        }
        if (this.h == null) {
            if (getParentActivity() != null) {
                d0 d0Var2 = new d0(this, getParentActivity(), this.currentAccount, new c0(this));
                this.h = d0Var2;
                d0Var2.setOutlineProvider(new e0(this, 0));
                this.h.setClipToOutline(true);
                c cVar2 = new c(getParentActivity(), new uc.b(this));
                this.f51726x = cVar2;
                cVar2.f51644b = this.h;
                this.d.setOnPicksChanged(new a0(this, 1));
                this.f51726x.setOutlineProvider(this.h.getOutlineProvider());
                this.f51726x.setClipToOutline(true);
                this.f51709f.addView(this.h, z5.e(-1, -1, 48));
                Y();
                this.f51709f.post(new a0(this, 2));
            } else {
                return;
            }
        }
        Y();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = layoutParams.leftMargin;
        int i14 = layoutParams.rightMargin;
        if (this.f51726x.getParent() == null) {
            this.f51709f.addView(this.f51726x, z5.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f51726x.getLayoutParams();
        if (layoutParams2.height != i12 || layoutParams2.leftMargin != i13 || layoutParams2.rightMargin != i14) {
            layoutParams2.height = i12;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i14;
            this.f51726x.setLayoutParams(layoutParams2);
        }
        this.f51726x.setTranslationY(f7);
        this.f51726x.setAlpha(f10);
        this.f51726x.invalidateOutline();
        this.f51726x.invalidate();
        if (this.f51726x.getVisibility() != 0) {
            this.f51726x.setVisibility(0);
        }
        int t02 = this.d.t0();
        s0 s0Var = this.d.f51980n;
        if (s0Var != null) {
            i10 = s0Var.h;
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
        d0 d0Var3 = this.h;
        u0 u0Var = this.d;
        s0 s0Var2 = u0Var.f51980n;
        if (s0Var2 != null) {
            i11 = s0Var2.f51832b;
        } else {
            i11 = -16777216;
        }
        if (i11 != u0Var.a2) {
            u0Var.a2 = i11;
            u0Var.f51865b2 = (i0.a.f(0.13f, -1, u0.D0(0.75f, 1.3f, 0.16f, i11)) & 16777215) | (-1728053248);
        }
        d0Var3.setHeaderColor(u0Var.f51865b2);
        if (this.h.getVisibility() != 0) {
            d0 d0Var4 = this.h;
            if (d0Var4.J) {
                d0Var4.J = false;
                d0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f51721q0) {
            f0();
        }
    }

    public final void c0() {
        u0 u0Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (u0Var = this.d) != null && u0Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.E = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap T0 = this.d.T0();
            if (T0 != null) {
                Utilities.globalQueue.postRunnable(new u2.q0(27, this, T0));
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return false;
    }

    @Override
    public final void clearViews() {
        FrameLayout frameLayout = this.f51709f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        w wVar = this.F;
        if (wVar != null) {
            wVar.f();
            this.F = null;
        }
        i0 i0Var = this.e;
        if (i0Var != null) {
            i0Var.g();
            this.e = null;
        }
        super.clearViews();
        u0 u0Var = this.d;
        if (u0Var != null) {
            u0Var.O0();
            this.d = null;
        }
        this.f51709f = null;
        this.h = null;
        this.f51726x = null;
        this.Z = null;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: zh.f0.createView(android.content.Context):android.view.View");
    }

    public final void d0(String str) {
        u0 u0Var;
        Uri uri;
        if (getParentActivity() != null && (u0Var = this.d) != null && u0Var.getCurrentLink() != null) {
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
        d0 d0Var;
        if (this.f51721q0 || (d0Var = this.h) == null) {
            return;
        }
        q tabs = d0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(20.0f));
        float[] fArr = w0.f52146a[0];
        int ceil = (int) Math.ceil(AndroidUtilities.dpf2(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.f51702a0 = Math.max(0, i10);
        this.f51704b0 = Math.max(0, i10);
        this.f51706c0 = Math.max(0, ceil - 4);
        tabs.f51781a = new org.telegram.ui.web.n(27, this, tabs);
        tabs.f51782b = new x(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.f51702a0;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.f51704b0, i11, this.f51706c0));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new e0(this, 1));
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
        this.f51721q0 = true;
        grid.W2 = new y(this, grid, tabs);
        grid.V2 = new z(this, grid);
        c cVar = this.f51726x;
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
        u0 u0Var;
        float f7;
        m mVar = this.Z;
        if (mVar != null && (u0Var = this.d) != null) {
            if (u0Var.I.isEmpty()) {
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
        w wVar = this.F;
        if (wVar != null) {
            if (z10) {
                wVar.e();
            }
            return false;
        }
        u0 u0Var = this.d;
        if (u0Var != null) {
            float f7 = u0Var.f51954k1;
            if (f7 > 0.5f || u0Var.f51905f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        u0Var.l1 = 0.0f;
                    } else if (u0Var.f51905f1 > 0.5f) {
                        u0Var.f51914g1 = 0.0f;
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
        u0 u0Var = this.d;
        if (u0Var == null) {
            return null;
        }
        u0Var.setRevealOpening(z10);
        u0 u0Var2 = this.d;
        float f11 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        u0Var2.setReveal(f7);
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
        AndroidUtilities.runOnUIThread(new u2.q0(26, this, animatorSet));
        return animatorSet;
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
        this.f51701a = j10;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j11 = bundle2.getLong("chat_id");
        } else {
            j11 = 0;
        }
        this.f51703b = j11;
        Bundle bundle3 = this.arguments;
        if (bundle3 != null && bundle3.getBoolean("immediate") && SharedConfig.getDevicePerformanceClass() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51727y = z10;
        if (this.f51701a == 0 && this.f51703b == 0) {
            this.f51701a = getUserConfig().getClientUserId();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        g0();
        org.telegram.ui.g gVar = this.f51705c;
        if (gVar != null) {
            xk0 xk0Var = (xk0) gVar.f36997b;
            if (xk0Var.f43141b.remove(gVar)) {
                xk0Var.a();
            }
            this.f51705c = null;
        }
        FrameLayout frameLayout = this.f51709f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.H);
        }
        w wVar = this.F;
        if (wVar != null) {
            wVar.f();
            this.F = null;
        }
        i0 i0Var = this.e;
        if (i0Var != null) {
            i0Var.g();
            this.e = null;
        }
        u0 u0Var = this.d;
        if (u0Var != null) {
            u0Var.O0();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        w wVar = this.F;
        if (wVar != null) {
            wVar.f();
            w wVar2 = this.F;
            FrameLayout frameLayout = this.f51709f;
            if (frameLayout != null) {
                frameLayout.removeView(wVar2);
            }
            if (this.F == wVar2) {
                this.F = null;
            }
            u0 u0Var = this.d;
            if (u0Var != null) {
                u0Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f51723r0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f51723r0.booleanValue());
            this.f51723r0 = null;
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
            alertDialog$Builder.f20601a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new x(this));
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
        u0 u0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.G = true;
        }
        if (z10 && (u0Var = this.d) != null) {
            u0Var.setReveal(1.0f);
        }
        if (z10 && !z11 && this.f51709f != null) {
            float f7 = f.S;
            long j10 = 0;
            if (Build.VERSION.SDK_INT >= 29 && SharedConfig.getDevicePerformanceClass() == 2) {
                j10 = Math.max(0L, Math.round(w0.f52147b[51]) - 860);
            }
            FrameLayout frameLayout = this.f51709f;
            a0 a0Var = this.H;
            frameLayout.removeCallbacks(a0Var);
            this.f51709f.postDelayed(a0Var, j10 + 680);
        }
    }
}
