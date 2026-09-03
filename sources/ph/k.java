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
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.z10;
import org.telegram.ui.Components.zh;
import org.telegram.ui.ns0;
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
    public org.telegram.ui.ActionBar.f6 f41834a;
    public Utilities.CallbackVoidReturn f41835a0;
    public final FrameLayout f41836b;
    public boolean f41837b0;
    public final ng.i f41838c;
    public final rc f41839c0;
    public final ng.i d;
    public ObjectAnimator f41840d0;
    public final Paint e;
    public ng.a f41841e0;
    public final f f41842f;
    public pg.b f41843f0;
    public Utilities.Callback f41844g0;
    public final Drawable h;
    public Utilities.Callback f41845h0;
    public ObjectAnimator f41846i0;
    public boolean f41847j0;
    public final e f41848k0;
    public float f41849l0;
    public boolean m0;
    public final mq f41850n;
    public ValueAnimator f41851n0;
    public Bitmap f41852o0;
    public BitmapShader f41853p0;
    public Matrix f41854q0;
    public final h f41855r;
    public Paint f41856r0;
    public final FrameLayout f41857s;
    public final org.telegram.ui.Components.z5 f41858s0;
    public int f41859t0;
    public float f41860u0;
    public final org.telegram.ui.Components.k6 v;
    public boolean f41861v0;
    public int f41862w;
    public final RectF f41863w0;
    public long f41864x;
    public final RectF f41865x0;
    public final Paint f41866y;
    public final RectF f41867y0;
    public boolean f41868z0;

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
        this.f41838c = iVar;
        ng.i iVar2 = new ng.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f41866y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.B = linearGradient;
        this.C = new Matrix();
        this.E = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.F = paint3;
        this.K = -4;
        this.R = UserConfig.selectedAccount;
        this.W = new e(this, 0);
        this.f41839c0 = new rc(this, 1.0f, 3.0f);
        this.f41848k0 = new e(this, 1);
        mr mrVar = mr.h;
        this.f41858s0 = new org.telegram.ui.Components.z5(this, 0L, 300L, mrVar);
        this.f41861v0 = false;
        this.f41863w0 = new RectF();
        this.f41865x0 = new RectF();
        this.f41867y0 = new RectF();
        this.G0 = new Path();
        this.J0 = new org.telegram.ui.Components.z5(this, 500L, mrVar);
        this.f41834a = f6Var;
        this.G = frameLayout;
        this.H = qv0Var;
        this.f41836b = frameLayout2;
        this.L = baVar;
        this.O = new org.telegram.ui.Components.fa(baVar, this, 0, !g());
        this.P = new org.telegram.ui.Components.fa(baVar, this, 8, false);
        this.N = new org.telegram.ui.Components.fa(baVar, this, 9, false);
        iVar.f15009j = true;
        int i16 = org.telegram.ui.ActionBar.j6.f19881d6;
        iVar.a(new z10(f6Var, i16, 0.0f, 1));
        iVar.f15007g.setColor(0);
        iVar.invalidateSelf();
        iVar2.f15009j = true;
        iVar2.a(new z10(f6Var, i16, 0.0f, 2));
        iVar2.f15007g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.I = new i3(frameLayout, false, new org.telegram.ui.web.a1(this, 3));
        f fVar = new f(this, context, qv0Var, getEditTextStyle(), new nh.b(), f6Var, baVar);
        this.f41842f = fVar;
        fVar.P = true;
        fVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.g3());
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
        boolean z4 = this instanceof ns0;
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
        this.f41855r = hVar;
        k7.d6.b(hVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.SRC_IN));
        mq mqVar = new mq(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20279zf, f6Var)), mutate, 0, AndroidUtilities.dp(1.0f));
        this.f41850n = mqVar;
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(36.0f);
        mqVar.h = dp;
        mqVar.f27113n = dp2;
        hVar.setImageDrawable(mqVar);
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
        k6Var.b(0.4f, 320L, mrVar);
        k6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41857s = frameLayout3;
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
        this.f41842f.clearFocus();
    }

    public abstract void d(boolean z4);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: ph.k.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f41837b0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.f41867y0.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) {
                int action = motionEvent.getAction();
                rc rcVar = this.f41839c0;
                if (action == 0 && !this.m0) {
                    if ((this instanceof p) && ((p) this).L1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        f fVar = this.f41842f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && fVar != childAt) {
                                float x10 = childAt.getX();
                                float y10 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y11 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f41863w0;
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
                            xt xtVar = fVar.f24030a;
                            xtVar.requestFocus();
                            AndroidUtilities.showKeyboard(xtVar);
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
        RectF rectF = this.f41865x0;
        f fVar = this.f41842f;
        if (view == fVar) {
            if (this instanceof ns0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f41849l0) * Math.max(0, (fVar.getHeight() - AndroidUtilities.dp(82.0f)) - fVar.getScrollY());
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
            Paint paint = this.f41866y;
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
        return this.f41865x0;
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
        return this.f41862w;
    }

    public int getEditTextHeight() {
        return (int) this.f41858s0.f31253c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f41842f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.J0.f31253c;
    }

    public int getSelectionLength() {
        f fVar = this.f41842f;
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
        return this.f41842f.getText();
    }

    public abstract void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        f fVar = this.f41842f;
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
        Bitmap bitmap = this.f41852o0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f41853p0 = null;
        this.f41856r0 = null;
        Bitmap bitmap2 = this.D;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.D = null;
        }
    }

    public final boolean p() {
        f fVar = this.f41842f;
        boolean z4 = fVar.f24038x;
        i3 i3Var = this.I;
        if (z4 && fVar.getEmojiView() != null) {
            if (i3Var.c()) {
                fVar.getEmojiView().B();
                return true;
            }
            yt ytVar = fVar.d;
            if (ytVar != null) {
                ytVar.B();
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
        this.f41841e0 = aVar;
    }

    public void setDialogId(long j10) {
        this.f41864x = j10;
        zh zhVar = this.J;
        if (zhVar != null) {
            zhVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f41844g0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f41845h0 = callback;
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
        this.f41839c0.c(z10);
    }

    public void setText(CharSequence charSequence) {
        this.S = true;
        this.f41842f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.f41835a0 = callbackVoidReturn;
    }

    public abstract void u(float f10);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.f41868z0 = false;
            invalidate();
            return;
        }
        this.f41868z0 = true;
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
        this.J.getAdapter().f44901c = false;
        this.J.getAdapter().d = false;
        this.J.getAdapter().e = false;
        this.J.getAdapter().f44910j0 = this instanceof p;
    }

    public void x(int i10) {
        int bottomPadding;
        qv0 qv0Var = this.H;
        if (qv0Var != null) {
            qv0Var.S();
        }
        f fVar = this.f41842f;
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
        if (!(this instanceof ns0)) {
            ObjectAnimator objectAnimator = this.f41846i0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f41846i0.cancel();
                this.f41846i0 = null;
            }
            this.f41846i0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > AndroidUtilities.dp(20.0f)) {
                this.f41846i0.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
                this.f41846i0.setDuration(250L);
            } else {
                this.f41846i0.setInterpolator(mr.h);
                this.f41846i0.setDuration(640L);
            }
            this.f41846i0.start();
        }
        if (max > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        }
        this.f41847j0 = z4;
        e eVar = this.f41848k0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (max < AndroidUtilities.dp(20.0f)) {
            fVar.getEditText().clearFocus();
            fVar.k(true);
        }
    }

    public void y() {
        if (this.J != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f41858s0.f31253c;
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
