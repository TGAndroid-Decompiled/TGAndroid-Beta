package zh;

import ai.jc;
import ai.x9;
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
import com.google.android.gms.internal.cast.a6;
import ei.i6;
import java.util.HashMap;
import ki.m3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
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
import org.telegram.ui.ut0;
import org.telegram.ui.xk0;
import org.telegram.ui.y9;
import w7.z5;
import yh.p1;
public class m0 extends n2 {
    public d0 E;
    public final h0 F;
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
    public LinearGradient R;
    public s S;
    public int T;
    public int U;
    public int V;
    public float W;
    public boolean X;
    public LinearGradient Y;
    public final Paint Z;
    public long f52047a;
    public final RectF f52048a0;
    public long f52049b;
    public final int[] f52050b0;
    public org.telegram.ui.g f52051c;
    public final int[] f52052c0;
    public b1 d;
    public final int[] f52053d0;
    public p0 e;
    public final Path f52054e0;
    public FrameLayout f52055f;
    public final RectF f52056f0;
    public Paint f52057g0;
    public k0 h;
    public final q10 f52058h0;
    public final RectF f52059i0;
    public boolean f52060j0;
    public Boolean f52061k0;
    public float f52062n;
    public float f52063r;
    public float f52064s;
    public float v;
    public float f52065w;
    public c f52066x;
    public boolean f52067y;

    public m0(Bundle bundle) {
        super(bundle);
        this.F = new h0(this, 0);
        this.H = new Paint();
        this.I = Float.NaN;
        this.J = new int[2];
        this.K = new int[2];
        this.M = new Paint();
        this.N = new Matrix();
        this.O = new Paint(1);
        this.P = new RectF();
        this.Q = new float[2];
        this.Z = new Paint();
        this.f52048a0 = new RectF();
        this.f52050b0 = new int[2];
        this.f52052c0 = new int[2];
        this.f52053d0 = new int[2];
        this.f52054e0 = new Path();
        this.f52056f0 = new RectF();
        this.f52058h0 = new q10(2);
        this.f52059i0 = new RectF();
        this.hasOwnBackground = true;
    }

    public static void U(m0 m0Var) {
        if (m0Var.getParentActivity() == null) {
            return;
        }
        p1 p1Var = new p1(m0Var.getParentActivity(), m0Var.currentAccount, m0Var.getUserConfig().getClientUserId(), null, null);
        if (!p1Var.f50476u0) {
            p1Var.f50476u0 = true;
            jc jcVar = p1Var.f50478w0;
            if (jcVar != null && (jcVar.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) p1Var.f50478w0.getParent();
                int indexOfChild = viewGroup.indexOfChild(p1Var.f50478w0);
                viewGroup.removeView(p1Var.f50478w0);
                jc jcVar2 = new jc(p1Var.getContext(), 250, 2);
                p1Var.f50478w0 = jcVar2;
                viewGroup.addView(jcVar2, indexOfChild, z5.d(-1.0f, -1));
            }
            x90 x90Var = p1Var.f50479x0;
            if (x90Var != null) {
                String string = LocaleController.getString(R.string.Gift2BrowseCollectiblesInfo);
                yh.v0 v0Var = p1Var.f50468l0;
                v0Var.setText(string);
                v0Var.setBreakStrategy(2);
                x90Var.setVisibility(8);
            }
            p1Var.Y.N(false);
        }
        p1Var.show();
    }

    public static void W(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                W(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void Y(n2 n2Var) {
        y9.e0(n2Var.getParentActivity(), false, 1, new i0(n2Var.getCurrentAccount(), n2Var));
    }

    public static LinearGradient d0(boolean z10) {
        int[] iArr = new int[9];
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = i10 / 8.0f;
            float B = a6.B(f7, 2.0f, 3.0f, f7 * f7);
            if (!z10) {
                B = 1.0f - B;
            }
            iArr[i10] = ((int) ((B * 255.0f) + 0.5f)) << 24;
            fArr[i10] = f7;
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void V() {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            AndroidUtilities.setLightNavigationBar(parentActivity, false);
            AndroidUtilities.setLightStatusBar(window, false);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.f52061k0 == null) {
                    this.f52061k0 = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public final void X() {
        b1 b1Var;
        if (this.h != null && (b1Var = this.d) != null && b1Var.getWidth() != 0) {
            int max = Math.max(1, (int) (this.d.T0() - ((int) this.d.D0())));
            this.d.getClass();
            int width = (int) (this.f52055f.getWidth() - (this.d.getWidth() - AndroidUtilities.dp(10.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
            if (layoutParams.height != max || layoutParams.leftMargin != r2 || layoutParams.rightMargin != width) {
                layoutParams.height = max;
                layoutParams.leftMargin = r2;
                layoutParams.rightMargin = width;
                this.h.setLayoutParams(layoutParams);
            }
        }
    }

    public final void Z() {
        if (this.E == null && this.d != null && this.f52055f != null && getParentActivity() != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            rectF.set(this.d.T6);
            rectF2.set(this.d.Q6);
            if (rectF.isEmpty()) {
                rectF.set((this.f52055f.getWidth() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f52055f.getHeight() / 2.0f) - AndroidUtilities.dp(20.0f), (this.f52055f.getWidth() / 2.0f) + AndroidUtilities.dp(20.0f), (this.f52055f.getHeight() / 2.0f) + AndroidUtilities.dp(20.0f));
            }
            this.d.setScanHidden(true);
            d0 d0Var = new d0(getParentActivity(), rectF, rectF2, new le.b(this, 29));
            this.E = d0Var;
            d0Var.L = LocaleController.getString(R.string.QrScanQr);
            Typeface bold = AndroidUtilities.bold();
            TextPaint textPaint = d0Var.M;
            textPaint.setTypeface(bold);
            textPaint.setColor(-1);
            d0Var.invalidate();
            this.f52055f.addView(this.E, z5.d(-1.0f, -1));
        }
    }

    public final void a0(float f7, float f10, boolean z10) {
        int i10;
        int i11;
        if (!z10) {
            k0 k0Var = this.h;
            if (k0Var != null && k0Var.getVisibility() == 0) {
                this.h.setVisibility(4);
            }
            c cVar = this.f52066x;
            if (cVar != null && cVar.getVisibility() == 0) {
                this.f52066x.setVisibility(4);
                return;
            }
            return;
        }
        if (this.h == null) {
            if (getParentActivity() != null) {
                k0 k0Var2 = new k0(this, getParentActivity(), this.currentAccount, new j0(this));
                this.h = k0Var2;
                k0Var2.setOutlineProvider(new l0(this, 0));
                this.h.setClipToOutline(true);
                c cVar2 = new c(getParentActivity(), new uc.b(this));
                this.f52066x = cVar2;
                cVar2.f51925b = this.h;
                this.d.setOnPicksChanged(new h0(this, 1));
                this.f52066x.setOutlineProvider(this.h.getOutlineProvider());
                this.f52066x.setClipToOutline(true);
                this.f52055f.addView(this.h, z5.e(-1, -1, 48));
                X();
                this.f52055f.post(new h0(this, 2));
            } else {
                return;
            }
        }
        X();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = layoutParams.leftMargin;
        int i14 = layoutParams.rightMargin;
        if (this.f52066x.getParent() == null) {
            this.f52055f.addView(this.f52066x, z5.e(-1, -1, 48));
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f52066x.getLayoutParams();
        if (layoutParams2.height != i12 || layoutParams2.leftMargin != i13 || layoutParams2.rightMargin != i14) {
            layoutParams2.height = i12;
            layoutParams2.leftMargin = i13;
            layoutParams2.rightMargin = i14;
            this.f52066x.setLayoutParams(layoutParams2);
        }
        this.f52066x.setTranslationY(f7);
        this.f52066x.setAlpha(f10);
        this.f52066x.invalidateOutline();
        this.f52066x.invalidate();
        if (this.f52066x.getVisibility() != 0) {
            this.f52066x.setVisibility(0);
        }
        int p02 = this.d.p0();
        z0 z0Var = this.d.f51801n;
        if (z0Var != null) {
            i10 = z0Var.f52180i;
        } else {
            i10 = 872415231;
        }
        int i15 = p02 ^ i10;
        if (this.h.getTranslationY() != f7 || i15 != this.G) {
            this.h.setTranslationY(f7);
            this.G = i15;
            this.h.getTabs().invalidate();
        }
        this.h.invalidateOutline();
        this.h.setAlpha(f10);
        k0 k0Var3 = this.h;
        b1 b1Var = this.d;
        z0 z0Var2 = b1Var.f51801n;
        if (z0Var2 != null) {
            i11 = z0Var2.f52176b;
        } else {
            i11 = -16777216;
        }
        if (i11 != b1Var.f51688b2) {
            b1Var.f51688b2 = i11;
            b1Var.f51699c2 = (i0.b.f(0.13f, -1, b1.z0(0.75f, 1.3f, 0.16f, i11)) & 16777215) | (-1728053248);
        }
        k0Var3.setHeaderColor(b1Var.f51699c2);
        if (this.h.getVisibility() != 0) {
            k0 k0Var4 = this.h;
            if (k0Var4.J) {
                k0Var4.J = false;
                k0Var4.e();
            }
            this.h.setVisibility(0);
        }
        if (!this.f52060j0) {
            e0();
        }
    }

    public final void b0() {
        b1 b1Var;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && (b1Var = this.d) != null && b1Var.getCurrentLink() != null) {
            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.f52067y = true;
                parentActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            Bitmap M0 = this.d.M0();
            if (M0 != null) {
                Utilities.globalQueue.postRunnable(new uf.c(27, this, M0));
            }
        }
    }

    public final void c0(String str) {
        b1 b1Var;
        Uri uri;
        if (getParentActivity() != null && (b1Var = this.d) != null && b1Var.getCurrentLink() != null) {
            Bitmap M0 = this.d.M0();
            if (M0 != null) {
                uri = AndroidUtilities.getBitmapShareUri(M0, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
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
    public final boolean canBeginSlide() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: zh.m0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        k0 k0Var;
        if (this.f52060j0 || (k0Var = this.h) == null) {
            return;
        }
        w tabs = k0Var.getTabs();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(872415231);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(20.0f));
        float[] fArr = e1.f51979a[0];
        int ceil = (int) Math.ceil(AndroidUtilities.dpf2(Math.max(0.0f, -fArr[8]) + fArr[4]));
        int i10 = ceil - 3;
        this.T = Math.max(0, i10);
        this.U = Math.max(0, i10);
        this.V = Math.max(0, ceil - 4);
        tabs.f52117a = new org.telegram.ui.web.c0(25, this, tabs);
        tabs.f52118b = new e0(this);
        int paddingLeft = tabs.getPaddingLeft();
        int paddingTop = tabs.getPaddingTop();
        int paddingRight = tabs.getPaddingRight();
        int paddingBottom = tabs.getPaddingBottom();
        int i11 = this.T;
        tabs.setBackground(new InsetDrawable((Drawable) gradientDrawable, i11, this.U, i11, this.V));
        tabs.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        tabs.setOutlineProvider(new l0(this, 1));
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
        s grid = this.h.getGrid();
        this.f52060j0 = true;
        grid.W2 = new f0(this, grid, tabs);
        grid.V2 = new g0(this, grid);
        c cVar = this.f52066x;
        if (cVar.T != grid) {
            cVar.T = grid;
            grid.setVerticalScrollBarEnabled(false);
            grid.j(new kv(cVar, 25));
        }
        int dp3 = AndroidUtilities.dp(44.0f);
        this.S = grid;
        grid.setPadding(grid.getPaddingLeft(), dp3, AndroidUtilities.dp(5.0f) + grid.getPaddingRight(), grid.getPaddingBottom());
        f0();
        grid.setClipToPadding(false);
        grid.j(new m3(10, this, tabs));
        tabs.bringToFront();
    }

    public final void f0() {
        b1 b1Var;
        float f7;
        s sVar = this.S;
        if (sVar != null && (b1Var = this.d) != null) {
            if (b1Var.I.isEmpty()) {
                f7 = 12.0f;
            } else {
                f7 = 73.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (sVar.getPaddingBottom() != dp) {
                sVar.setPadding(sVar.getPaddingLeft(), sVar.getPaddingTop(), sVar.getPaddingRight(), dp);
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return -16777216;
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
        d0 d0Var = this.E;
        if (d0Var != null) {
            if (z10) {
                d0Var.d();
            }
            return false;
        }
        b1 b1Var = this.d;
        if (b1Var != null) {
            float f7 = b1Var.f51777k1;
            if (f7 > 0.5f || b1Var.f51728f1 > 0.5f) {
                if (z10) {
                    if (f7 > 0.5f) {
                        b1Var.l1 = 0.0f;
                    } else if (b1Var.f51728f1 > 0.5f) {
                        b1Var.f51737g1 = 0.0f;
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
        b1 b1Var = this.d;
        if (b1Var == null) {
            return null;
        }
        b1Var.setRevealOpening(z10);
        b1 b1Var2 = this.d;
        float f11 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b1Var2.setReveal(f7);
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
        AndroidUtilities.runOnUIThread(new ut0(animatorSet, 4));
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
        this.f52047a = j10;
        Bundle bundle2 = this.arguments;
        if (bundle2 != null) {
            j11 = bundle2.getLong("chat_id");
        } else {
            j11 = 0;
        }
        this.f52049b = j11;
        if (this.f52047a == 0 && j11 == 0) {
            this.f52047a = getUserConfig().getClientUserId();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.g gVar = this.f52051c;
        if (gVar != null) {
            xk0 xk0Var = (xk0) gVar.f37062b;
            if (xk0Var.f43159b.remove(gVar)) {
                xk0Var.a();
            }
            this.f52051c = null;
        }
        FrameLayout frameLayout = this.f52055f;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.F);
        }
        d0 d0Var = this.E;
        if (d0Var != null) {
            d0Var.e();
            this.E = null;
        }
        p0 p0Var = this.e;
        if (p0Var != null) {
            p0Var.g();
            this.e = null;
        }
        b1 b1Var = this.d;
        if (b1Var != null) {
            HashMap hashMap = b1Var.f51872u7;
            HashMap hashMap2 = b1Var.f51863t7;
            b1Var.Z1.C(false);
            Bitmap bitmap = b1Var.R2;
            if (bitmap != null) {
                bitmap.recycle();
                b1Var.R2 = null;
            }
            uj0 uj0Var = b1Var.K8;
            if (uj0Var != null) {
                uj0Var.C(false);
                b1Var.K8 = null;
            }
            uj0 uj0Var2 = b1Var.V7;
            if (uj0Var2 != null) {
                uj0Var2.C(false);
                b1Var.V7 = null;
            }
            r5 r5Var = b1Var.U7;
            if (r5Var != null) {
                r5Var.o(b1Var);
                b1Var.U7 = null;
                b1Var.W7 = 0L;
            }
            b1Var.I0(b1Var.F);
            b1Var.I0(b1Var.G);
            b1Var.removeCallbacks(b1Var.Z8);
            x9 x9Var = b1Var.f51758i2;
            if (x9Var != null) {
                x9Var.f();
            }
            VelocityTracker velocityTracker = b1Var.f51776k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                b1Var.f51776k0 = null;
            }
            VelocityTracker velocityTracker2 = b1Var.W8;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                b1Var.W8 = null;
            }
            for (r5 r5Var2 : hashMap2.values()) {
                r5Var2.o(b1Var);
            }
            for (Drawable drawable : b1Var.J.values()) {
                if (drawable instanceof r5) {
                    ((r5) drawable).o(b1Var);
                }
            }
            hashMap2.clear();
            for (a1 a1Var : hashMap.values()) {
                p5 p5Var = a1Var.f51659a;
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
        d0 d0Var = this.E;
        if (d0Var != null) {
            d0Var.e();
            d0 d0Var2 = this.E;
            FrameLayout frameLayout = this.f52055f;
            if (frameLayout != null) {
                frameLayout.removeView(d0Var2);
            }
            if (this.E == d0Var2) {
                this.E = null;
            }
            b1 b1Var = this.d;
            if (b1Var != null) {
                b1Var.setScanHidden(false);
            }
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && Build.VERSION.SDK_INT >= 29 && this.f52061k0 != null) {
            parentActivity.getWindow().setNavigationBarContrastEnforced(this.f52061k0.booleanValue());
            this.f52061k0 = null;
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
            if (this.f52067y && z10) {
                this.f52067y = false;
                b0();
            }
            this.f52067y = false;
        } else if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                Z();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20601a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new e0(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, h6.x0(null, h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        V();
        if (getParentActivity() != null) {
            AndroidUtilities.setLightNavigationBar(getParentActivity(), false);
        }
    }
}
