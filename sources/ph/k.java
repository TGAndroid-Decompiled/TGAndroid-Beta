package ph;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.zh;
import org.telegram.ui.Components.zt;
import org.telegram.ui.gs0;
public abstract class k extends FrameLayout {
    public k01 A0;
    public final LinearGradient B;
    public k01 B0;
    public final Matrix C;
    public Path C0;
    public Bitmap D;
    public Paint D0;
    public final TextPaint E;
    public Path E0;
    public final Paint F;
    public float[] F0;
    public final FrameLayout G;
    public final Path G0;
    public final qv0 H;
    public boolean H0;
    public final i3 I;
    public int I0;
    public zh J;
    public final org.telegram.ui.Components.z5 J0;
    public int K;
    public Paint K0;
    public final org.telegram.ui.Components.ba L;
    public RadialGradient L0;
    public final org.telegram.ui.Components.fa M;
    public Paint M0;
    public final org.telegram.ui.Components.fa N;
    public RadialGradient N0;
    public final org.telegram.ui.Components.fa O;
    public Matrix O0;
    public final org.telegram.ui.Components.fa P;
    public org.telegram.ui.Components.fa Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public final e W;
    public org.telegram.ui.ActionBar.f6 f41801a;
    public Utilities.CallbackVoidReturn f41802a0;
    public final FrameLayout f41803b;
    public boolean f41804b0;
    public final ng.i f41805c;
    public final rc f41806c0;
    public final ng.i d;
    public ObjectAnimator f41807d0;
    public final Paint e;
    public ng.a f41808e0;
    public final f f41809f;
    public pg.b f41810f0;
    public Utilities.Callback f41811g0;
    public final Drawable h;
    public Utilities.Callback f41812h0;
    public ObjectAnimator f41813i0;
    public boolean f41814j0;
    public final e f41815k0;
    public float f41816l0;
    public boolean m0;
    public final nq f41817n;
    public ValueAnimator f41818n0;
    public Bitmap f41819o0;
    public BitmapShader f41820p0;
    public Matrix f41821q0;
    public final h f41822r;
    public Paint f41823r0;
    public final FrameLayout f41824s;
    public final org.telegram.ui.Components.z5 f41825s0;
    public int f41826t0;
    public float f41827u0;
    public final org.telegram.ui.Components.k6 v;
    public boolean f41828v0;
    public int f41829w;
    public final RectF f41830w0;
    public long f41831x;
    public final RectF f41832x0;
    public final Paint f41833y;
    public final RectF f41834y0;
    public boolean f41835z0;

    public k(Context context, FrameLayout frameLayout, qv0 qv0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ng.i iVar = new ng.i();
        this.f41805c = iVar;
        ng.i iVar2 = new ng.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f41833y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.B = linearGradient;
        this.C = new Matrix();
        this.E = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.F = paint3;
        this.K = -4;
        this.R = UserConfig.selectedAccount;
        this.W = new e(this, 0);
        this.f41806c0 = new rc(this, 1.0f, 3.0f);
        this.f41815k0 = new e(this, 1);
        nr nrVar = nr.h;
        this.f41825s0 = new org.telegram.ui.Components.z5(this, 0L, 300L, nrVar);
        this.f41828v0 = false;
        this.f41830w0 = new RectF();
        this.f41832x0 = new RectF();
        this.f41834y0 = new RectF();
        this.G0 = new Path();
        this.J0 = new org.telegram.ui.Components.z5(this, 500L, nrVar);
        this.f41801a = f6Var;
        this.G = frameLayout;
        this.H = qv0Var;
        this.f41803b = frameLayout2;
        this.L = baVar;
        this.O = new org.telegram.ui.Components.fa(baVar, this, 0, !g());
        this.P = new org.telegram.ui.Components.fa(baVar, this, 8, false);
        this.N = new org.telegram.ui.Components.fa(baVar, this, 9, false);
        iVar.f15029j = true;
        int i16 = org.telegram.ui.ActionBar.j6.f19906d6;
        iVar.a(new y10(f6Var, i16, 0.0f, 1));
        iVar.f15027g.setColor(0);
        iVar.invalidateSelf();
        iVar2.f15029j = true;
        iVar2.a(new y10(f6Var, i16, 0.0f, 2));
        iVar2.f15027g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.I = new i3(frameLayout, false, new org.telegram.ui.web.y0(this, 3));
        f fVar = new f(this, context, qv0Var, getEditTextStyle(), new nh.b(), f6Var, baVar);
        this.f41809f = fVar;
        fVar.P = true;
        fVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        fVar.setFocusable(true);
        fVar.setFocusableInTouchMode(true);
        fVar.getEditText().hintLayoutYFix = true;
        fVar.getEditText().drawHint = new dg.r1(this, 26);
        fVar.getEditText().setSupportRtlHint(true);
        this.M = new org.telegram.ui.Components.fa(baVar, fVar.getEditText(), g() ? 1 : 2, false);
        fVar.getEditText().setHintColor(-1);
        fVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        fVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z4 = this instanceof gs0;
        if (z4) {
            fVar.getEditText().setGravity(48);
        }
        fVar.getEmojiButton().setAlpha(0.0f);
        View emojiButton = fVar.getEmojiButton();
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        emojiButton.setTranslationY(AndroidUtilities.dp(f10));
        fVar.setTranslationY(AndroidUtilities.dp(z4 ? 1.0f : -1.0f));
        fVar.getEditText().addTextChangedListener(new g(this));
        fVar.getEditText().setLinkTextColor(-1);
        if (z4) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        addView(fVar, k7.b6.d(-1, -2.0f, i10 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        h hVar = new h(context);
        this.f41822r = hVar;
        k7.d6.b(hVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.SRC_IN));
        nq nqVar = new nq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20304zf, f6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f41817n = nqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        nqVar.h = dp;
        nqVar.f27339n = dp2;
        hVar.setImageDrawable(nqVar);
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.Done));
        hVar.setAlpha(0.0f);
        hVar.setVisibility(8);
        hVar.setOnClickListener(new oh.n(this, 6));
        if (z4) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(hVar, k7.b6.d(44, 44.0f, i11 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.v = k6Var;
        k6Var.setGravity(17);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTextColor(-1);
        k6Var.b(0.4f, 320L, nrVar);
        k6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41824s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        if (z4) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        frameLayout3.addView(k6Var, k7.b6.e(52, 16, i12 | 5));
        if (z4) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        int i17 = i13 | 5;
        if (z4) {
            i14 = 50;
        } else {
            i14 = 0;
        }
        float f11 = i14;
        if (z4) {
            i15 = 0;
        } else {
            i15 = 50;
        }
        addView(frameLayout3, k7.b6.d(52, 16.0f, i17, 0.0f, f11, 0.0f, i15));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return AndroidUtilities.navigationBarHeight;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z4);

    @Override
    public final void clearFocus() {
        this.f41809f.clearFocus();
    }

    public abstract void d(boolean z4);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: ph.k.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f41804b0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.f41834y0.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) {
                int action = motionEvent.getAction();
                rc rcVar = this.f41806c0;
                if (action == 0 && !this.m0) {
                    if ((this instanceof p) && ((p) this).L1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        f fVar = this.f41809f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && fVar != childAt) {
                                float x10 = childAt.getX();
                                float y10 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y11 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f41830w0;
                                rectF.set(x10, y10, x11, y11);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i10++;
                        } else {
                            this.I.b(false);
                            fVar.getEditText().setForceCursorEnd(true);
                            fVar.getEditText().requestFocus();
                            yt ytVar = fVar.f24367a;
                            ytVar.requestFocus();
                            AndroidUtilities.showKeyboard(ytVar);
                            fVar.getEditText().setScrollY(0);
                            rcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        rcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float max;
        RectF rectF = this.f41832x0;
        f fVar = this.f41809f;
        if (view == fVar) {
            if (this instanceof gs0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f41816l0) * Math.max(0, (fVar.getHeight() - AndroidUtilities.dp(82.0f)) - fVar.getScrollY());
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            canvas.save();
            Matrix matrix = this.C;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top - 1.0f);
            LinearGradient linearGradient = this.B;
            linearGradient.setLocalMatrix(matrix);
            float f10 = rectF.left;
            float f11 = rectF.top;
            Paint paint = this.f41833y;
            canvas.drawRect(f10, f11, rectF.right, AndroidUtilities.dp(10.0f) + f11, paint);
            matrix.reset();
            matrix.postRotate(180.0f);
            matrix.postTranslate(0.0f, rectF.bottom);
            linearGradient.setLocalMatrix(matrix);
            canvas.drawRect(rectF.left, rectF.bottom - AndroidUtilities.dp(10.0f), rectF.right, rectF.bottom, paint);
            canvas.restore();
            canvas.restore();
            return drawChild;
        } else if (f(view)) {
            canvas.save();
            canvas.clipRect(rectF);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j10);
        }
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public abstract boolean g();

    public RectF getBounds() {
        return this.f41832x0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        if (UserConfig.getInstance(this.R).isPremium()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f41829w;
    }

    public int getEditTextHeight() {
        return (int) this.f41825s0.f31241c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f41809f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.J0.f31241c;
    }

    public int getSelectionLength() {
        f fVar = this.f41809f;
        if (fVar != null && fVar.getEditText() != null) {
            try {
                return fVar.getEditText().getSelectionEnd() - fVar.getEditText().getSelectionStart();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f41809f.getText();
    }

    public abstract void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        f fVar = this.f41809f;
        fVar.getEditText().invalidate();
        fVar.getEmojiButton().invalidate();
        zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.invalidate();
        }
        if (fVar.getEmojiView() != null && g()) {
            fVar.getEmojiView().invalidate();
        }
    }

    public final boolean o() {
        if (getCodePointCount() > getCaptionLimit()) {
            return true;
        }
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            Bitmap bitmap = this.D;
            if (bitmap != null) {
                bitmap.recycle();
                this.D = null;
            }
            TextPaint textPaint = this.E;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.D = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(string)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.D).drawText(string, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f41819o0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f41820p0 = null;
        this.f41823r0 = null;
        Bitmap bitmap2 = this.D;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.D = null;
        }
    }

    public final boolean p() {
        f fVar = this.f41809f;
        boolean z4 = fVar.f24375x;
        i3 i3Var = this.I;
        if (z4 && fVar.getEmojiView() != null) {
            if (i3Var.c()) {
                fVar.getEmojiView().B();
                return true;
            }
            zt ztVar = fVar.d;
            if (ztVar != null) {
                ztVar.B();
                fVar.d.t(false);
            }
            return true;
        } else if (fVar.e) {
            fVar.k(true);
            return true;
        } else if ((!fVar.v && !i3Var.c()) || i3Var.d) {
            return false;
        } else {
            fVar.d();
            fVar.k(true);
            return true;
        }
    }

    public void setAccount(int i10) {
        this.R = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(ng.a aVar) {
        this.f41808e0 = aVar;
    }

    public void setDialogId(long j10) {
        this.f41831x = j10;
        zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f41811g0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f41812h0 = callback;
    }

    @Override
    public void setPressed(boolean z4) {
        boolean z10;
        super.setPressed(z4);
        if (z4 && !this.m0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41806c0.c(z10);
    }

    public void setText(CharSequence charSequence) {
        this.S = true;
        this.f41809f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.f41802a0 = callbackVoidReturn;
    }

    public abstract void u(float f10);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.f41835z0 = false;
            invalidate();
            return;
        }
        this.f41835z0 = true;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        this.A0 = new k01(spannableStringBuilder, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.B0 = new k01(charSequence, 14.0f, null);
    }

    public void w() {
        this.J.getAdapter().f44839c = false;
        this.J.getAdapter().d = false;
        this.J.getAdapter().e = false;
        this.J.getAdapter().f44848j0 = this instanceof p;
    }

    public void x(int i10) {
        int bottomPadding;
        qv0 qv0Var = this.H;
        if (qv0Var != null) {
            qv0Var.S();
        }
        f fVar = this.f41809f;
        boolean z4 = false;
        if (fVar.e) {
            i10 = Math.max(0, fVar.getEmojiPadding() + a());
        } else if (fVar.K) {
            i10 = Math.max(0, fVar.getKeyboardHeight() + a());
        }
        if (qv0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = qv0Var.getBottomPadding();
        }
        int max = Math.max(0, i10 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof gs0)) {
            ObjectAnimator objectAnimator = this.f41813i0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f41813i0.cancel();
                this.f41813i0 = null;
            }
            this.f41813i0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f41813i0.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                this.f41813i0.setDuration(250L);
            } else {
                this.f41813i0.setInterpolator(nr.h);
                this.f41813i0.setDuration(640L);
            }
            this.f41813i0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        }
        this.f41814j0 = z4;
        e eVar = this.f41815k0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            fVar.getEditText().clearFocus();
            fVar.k(true);
        }
    }

    public void y() {
        if (this.J != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f41825s0.f31241c;
            if (this.J.getY() != translationY) {
                this.J.setTranslationY(translationY);
                this.J.invalidate();
            }
        }
    }

    public void n() {
    }

    public void t() {
    }

    public void q(boolean z4) {
    }

    public void r(int i10) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}
