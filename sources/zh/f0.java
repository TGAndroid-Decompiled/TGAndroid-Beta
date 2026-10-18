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
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.internal.play_billing.k3;
import ei.i6;
import java.util.HashMap;
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
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.xk0;
import org.telegram.ui.y9;
import w7.z5;
import yh.p1;
public class f0 extends n2 {
    public w E;
    public final a0 F;
    public int G;
    public final Paint H;
    public float I;
    public final int[] J;
    public final int[] K;
    public LinearGradient L;
    public final Paint M;
    public final Matrix N;
    public final Paint O;
    public final RectF P;
    public final float[] Q;
    public final int[] R;
    public final int[] S;
    public LinearGradient T;
    public int U;
    public int V;
    public int W;
    public m X;
    public int Y;
    public int Z;
    public long f51748a;
    public int f51749a0;
    public long f51750b;
    public float f51751b0;
    public org.telegram.ui.g f51752c;
    public boolean f51753c0;
    public t0 d;
    public LinearGradient f51754d0;
    public i0 e;
    public final Paint f51755e0;
    public FrameLayout f51756f;
    public final RectF f51757f0;
    public final int[] f51758g0;
    public d0 h;
    public final int[] f51759h0;
    public final int[] f51760i0;
    public final Path f51761j0;
    public final RectF f51762k0;
    public Paint f51763l0;
    public final q10 m0;
    public float f51764n;
    public final RectF f51765n0;
    public boolean f51766o0;
    public Boolean f51767p0;
    public float f51768r;
    public float f51769s;
    public float v;
    public float f51770w;
    public c f51771x;
    public boolean f51772y;

    public f0(Bundle bundle) {
        super(bundle);
        this.F = new a0(this, 0);
        this.H = new Paint();
        this.I = Float.NaN;
        this.J = new int[2];
        this.K = new int[2];
        this.M = new Paint();
        this.N = new Matrix();
        this.O = new Paint(1);
        this.P = new RectF();
        this.Q = new float[2];
        this.R = new int[2];
        this.S = new int[2];
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f51755e0 = new Paint();
        this.f51757f0 = new RectF();
        this.f51758g0 = new int[2];
        this.f51759h0 = new int[2];
        this.f51760i0 = new int[2];
        this.f51761j0 = new Path();
        this.f51762k0 = new RectF();
        this.m0 = new q10(2);
        this.f51765n0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void U(f0 f0Var, AnimatorSet animatorSet) {
        boolean z10;
        f0Var.g0();
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = f0Var.currentAccount;
        f0Var.W = i10;
        f0Var.U = NotificationCenter.getInstance(i10).setAnimationInProgress(-1, null, z10);
        f0Var.V = NotificationCenter.getGlobalInstance().setAnimationInProgress(-1, null, z10);
        animatorSet.start();
    }

    public static void V(f0 f0Var) {
        if (f0Var.getParentActivity() == null) {
            return;
        }
        p1 p1Var = new p1(f0Var.getParentActivity(), f0Var.currentAccount, f0Var.getUserConfig().getClientUserId(), null, null);
        if (!p1Var.f50501u0) {
            p1Var.f50501u0 = true;
            kc kcVar = p1Var.f50503w0;
            if (kcVar != null && (kcVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) p1Var.f50503w0.getParent();
                int indexOfChild = viewGroup.indexOfChild(p1Var.f50503w0);
                viewGroup.removeView(p1Var.f50503w0);
                kc kcVar2 = new kc(p1Var.getContext(), 250, 2);
                p1Var.f50503w0 = kcVar2;
                viewGroup.addView(kcVar2, indexOfChild, z5.d(-1.0f, -1));
            }
            x90 x90Var = p1Var.f50504x0;
            if (x90Var != null) {
                String string = LocaleController.getString(R.string.Gift2BrowseCollectiblesInfo);
                yh.v0 v0Var = p1Var.f50493l0;
                v0Var.setText(string);
                v0Var.setBreakStrategy(2);
                x90Var.setVisibility(8);
            }
            p1Var.Y.N(false);
        }
        p1Var.show();
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
                if (this.f51767p0 == null) {
                    this.f51767p0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void Y() {
        t0 t0Var;
        if (this.h != null && (t0Var = this.d) != null && t0Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.Z0() - ((int) this.d.H0())));
            this.d.getClass();
            int width = (int) (this.f51756f.getWidth() - (this.d.getWidth() - AndroidUtilities.dp(10.0f)));
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
        if (this.E == null && this.d != null && this.f51756f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.f52001k7);
            rectF2.set(this.d.f51971h7);
            if (rectF.isEmpty()) {
                rectF.set((this.f51756f.getWidth() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f51756f.getHeight() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f51756f.getWidth() / 2.0f) + AndroidUtilities.dp(20.0f), (this.f51756f.getHeight() / 2.0f) + AndroidUtilities.dp(20.0f));
            }
            this.d.setScanHidden(true);
            w wVar = new w(getParentActivity(), rectF, rectF2, new le.b(this, 29));
            this.E = wVar;
            wVar.J = LocaleController.getString(R.string.QrScanQr);
            Typeface bold = AndroidUtilities.bold();
            TextPaint textPaint = wVar.K;
            textPaint.setTypeface(bold);
            textPaint.setColor(-1);
            wVar.invalidate();
            this.f51756f.addView(this.E, z5.d(-1.0f, -1));
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
            c cVar = this.f51771x;
            if (cVar != null && cVar.getVisibility() == 0) {
                this.f51771x.setVisibility(4);
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
                this.f51771x = cVar2;
                cVar2.f51691b = this.h;
                this.d.setOnPicksChanged(new a0(this, 1));
                this.f51771x.setOutlineProvider(this.h.getOutlineProvider());
                this.f51771x.setClipToOutline(true);
                this.f51756f.addView(this.h, z5.e(-1, -1, 48));
                Y();
                this.f51756f.post(new a0(this, 2));
            } else {
                return;
            }
        }
        Y();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = layoutParams.leftMargin;
        int i14 = layoutParams.rightMargin;
        if (this.f51771x.getParent() == null) {
            this.f51756f.addView(this.f51771x, z5.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f51771x.getLayoutParams();
        if (layoutParams2.height != i12 || layoutParams2.leftMargin != i13 || layoutParams2.rightMargin != i14) {
            layoutParams2.height = i12;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i14;
            this.f51771x.setLayoutParams(layoutParams2);
        }
        this.f51771x.setTranslationY(f7);
        this.f51771x.setAlpha(f10);
        this.f51771x.invalidateOutline();
        this.f51771x.invalidate();
        if (this.f51771x.getVisibility() != 0) {
            this.f51771x.setVisibility(0);
        }
        int t02 = this.d.t0();
        r0 r0Var = this.d.f52021n;
        if (r0Var != null) {
            i10 = r0Var.h;
        } else {
            i10 = 872415231;
        }
        int i15 = t02 ^ i10;
        if (this.h.getTranslationY() != f7 || i15 != this.G) {
            this.h.setTranslationY(f7);
            this.G = i15;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f10);
        d0 d0Var3 = this.h;
        t0 t0Var = this.d;
        r0 r0Var2 = t0Var.f52021n;
        if (r0Var2 != null) {
            i11 = r0Var2.f51869b;
        } else {
            i11 = -16777216;
        }
        if (i11 != t0Var.Z1) {
            t0Var.Z1 = i11;
            t0Var.a2 = (i0.a.f(0.13f, -1, t0.D0(0.75f, 1.3f, 0.16f, i11)) & 16777215) | (-1728053248);
        }
        d0Var3.setHeaderColor(t0Var.a2);
        if (this.h.getVisibility() != 0) {
            d0 d0Var4 = this.h;
            if (d0Var4.J) {
                d0Var4.J = false;
                d0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f51766o0) {
            f0();
        }
    }

    public final void c0() {
        t0 t0Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (t0Var = this.d) != null && t0Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.f51772y = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap S0 = this.d.S0();
            if (S0 != null) {
                Utilities.globalQueue.postRunnable(new uf.c(26, this, S0));
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return false;
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
        t0 t0Var;
        Uri uri;
        if (getParentActivity() != null && (t0Var = this.d) != null && t0Var.getCurrentLink() != null) {
            Bitmap S0 = this.d.S0();
            if (S0 != null) {
                uri = AndroidUtilities.getBitmapShareUri(S0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
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
        if (this.f51766o0 || (d0Var = this.h) == null) {
            return;
        }
        q tabs = d0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(20.0f));
        float[] fArr = v0.f52157a[0];
        int ceil = (int) Math.ceil(AndroidUtilities.dpf2(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.Y = Math.max(0, i10);
        this.Z = Math.max(0, i10);
        this.f51749a0 = Math.max(0, ceil - 4);
        tabs.f51832a = new org.telegram.ui.web.m(27, this, tabs);
        tabs.f51833b = new x(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.Y;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.Z, i11, this.f51749a0));
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
        this.f51766o0 = true;
        grid.W2 = new y(this, grid, tabs);
        grid.V2 = new z(this, grid);
        c cVar = this.f51771x;
        if (cVar.T != grid) {
            cVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new kv(cVar, 25));
        }
        int dp3 = AndroidUtilities.dp(44.0f);
        this.X = grid;
        grid.setPadding(grid.getPaddingLeft(), dp3, AndroidUtilities.dp(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        h0();
        grid.setClipToPadding(false);
        grid.j(new m3(10, this, tabs));
        tabs.bringToFront();
    }

    public final void g0() {
        if (this.U >= 0) {
            NotificationCenter.getInstance(this.W).onAnimationFinish(this.U);
        }
        if (this.V >= 0) {
            NotificationCenter.getGlobalInstance().onAnimationFinish(this.V);
        }
        this.V = -1;
        this.U = -1;
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
    }

    public final void h0() {
        t0 t0Var;
        float f7;
        m mVar = this.X;
        if (mVar != null && (t0Var = this.d) != null) {
            if (t0Var.I.isEmpty()) {
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
        w wVar = this.E;
        if (wVar != null) {
            if (z10) {
                wVar.e();
            }
            return false;
        }
        t0 t0Var = this.d;
        if (t0Var != null) {
            float f7 = t0Var.f51995k1;
            if (f7 > 0.5f || t0Var.f51946f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        t0Var.l1 = 0.0f;
                    } else if (t0Var.f51946f1 > 0.5f) {
                        t0Var.f51955g1 = 0.0f;
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
        t0 t0Var = this.d;
        if (t0Var == null) {
            return null;
        }
        t0Var.setRevealOpening(z10);
        t0 t0Var2 = this.d;
        float f11 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        t0Var2.setReveal(f7);
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

    @Override
    public final boolean onFragmentCreate() {
        long j10;
        long j11;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            j10 = bundle.getLong("user_id");
        } else {
            j10 = 0;
        }
        this.f51748a = j10;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j11 = bundle2.getLong("chat_id");
        } else {
            j11 = 0;
        }
        this.f51750b = j11;
        if (this.f51748a == 0 && j11 == 0) {
            this.f51748a = getUserConfig().getClientUserId();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        g0();
        org.telegram.ui.g gVar = this.f51752c;
        if (gVar != null) {
            xk0 xk0Var = (xk0) gVar.f37032b;
            if (xk0Var.f43179b.remove(gVar)) {
                xk0Var.a();
            }
            this.f51752c = null;
        }
        FrameLayout frameLayout = this.f51756f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.F);
        }
        w wVar = this.E;
        if (wVar != null) {
            wVar.f();
            this.E = null;
        }
        i0 i0Var = this.e;
        if (i0Var != null) {
            i0Var.g();
            this.e = null;
        }
        t0 t0Var = this.d;
        if (t0Var != null) {
            HashMap hashMap = t0Var.L7;
            HashMap hashMap2 = t0Var.K7;
            t0Var.X1.C(false);
            Bitmap bitmap = t0Var.Q2;
            if (bitmap != null) {
                bitmap.recycle();
                t0Var.Q2 = null;
            }
            uj0 uj0Var = t0Var.f51913b9;
            if (uj0Var != null) {
                uj0Var.C(false);
                t0Var.f51913b9 = null;
            }
            uj0 uj0Var2 = t0Var.f52019m8;
            if (uj0Var2 != null) {
                uj0Var2.C(false);
                t0Var.f52019m8 = null;
            }
            r5 r5Var = t0Var.f52010l8;
            if (r5Var != null) {
                r5Var.o(t0Var);
                t0Var.f52010l8 = null;
                t0Var.f52030n8 = 0L;
            }
            t0Var.O0(t0Var.F);
            t0Var.O0(t0Var.G);
            t0Var.removeCallbacks(t0Var.f52058q9);
            ai.y9 y9Var = t0Var.f51966h2;
            if (y9Var != null) {
                y9Var.f();
            }
            VelocityTracker velocityTracker = t0Var.f51994k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                t0Var.f51994k0 = null;
            }
            VelocityTracker velocityTracker2 = t0Var.f52031n9;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                t0Var.f52031n9 = null;
            }
            for (r5 r5Var2 : hashMap2.values()) {
                r5Var2.o(t0Var);
            }
            for (Drawable drawable : t0Var.J.values()) {
                if (drawable instanceof r5) {
                    ((r5) drawable).o(t0Var);
                }
            }
            hashMap2.clear();
            for (s0 s0Var : hashMap.values()) {
                p5 p5Var = s0Var.f51877a;
                if (p5Var != null) {
                    p5Var.b();
                }
            }
            hashMap.clear();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        w wVar = this.E;
        if (wVar != null) {
            wVar.f();
            w wVar2 = this.E;
            FrameLayout frameLayout = this.f51756f;
            if (frameLayout != null) {
                frameLayout.removeView(wVar2);
            }
            if (this.E == wVar2) {
                this.E = null;
            }
            t0 t0Var = this.d;
            if (t0Var != null) {
                t0Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f51767p0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f51767p0.booleanValue());
            this.f51767p0 = null;
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
            if (this.f51772y && z10) {
                this.f51772y = false;
                c0();
            }
            this.f51772y = false;
        } else if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                a0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20608a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
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
        t0 t0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (t0Var = this.d) != null) {
            t0Var.setReveal(1.0f);
        }
    }
}
