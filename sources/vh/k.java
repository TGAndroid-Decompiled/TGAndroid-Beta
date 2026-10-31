package vh;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.s20;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.kq0;
public abstract class k extends FrameLayout {
    public final RectF A0;
    public boolean B0;
    public qz0 C0;
    public final Paint D;
    public qz0 D0;
    public final LinearGradient E;
    public Path E0;
    public final Matrix F;
    public Paint F0;
    public Bitmap G;
    public Path G0;
    public final TextPaint H;
    public float[] H0;
    public final Paint I;
    public final Path I0;
    public final FrameLayout J;
    public boolean J0;
    public final uu0 K;
    public int K0;
    public final r2 L;
    public final org.telegram.ui.Components.t5 L0;
    public oh M;
    public Paint M0;
    public int N;
    public RadialGradient N0;
    public final s9 O;
    public Paint O0;
    public final w9 P;
    public RadialGradient P0;
    public final w9 Q;
    public Matrix Q0;
    public final w9 R;
    public final w9 S;
    public w9 T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.p6 f51332a;
    public int f51333a0;
    public final FrameLayout f51334b;
    public int f51335b0;
    public final tg.i f51336c;
    public final e f51337c0;
    public final tg.i d;
    public boolean f51338d0;
    public final Paint e;
    public final dc f51339e0;
    public final f f51340f;
    public ObjectAnimator f51341f0;
    public tg.b f51342g0;
    public final Drawable h;
    public vg.f f51343h0;
    public q20 f51344i0;
    public q20 f51345j0;
    public ObjectAnimator f51346k0;
    public boolean f51347l0;
    public final e m0;
    public final eq f51348n;
    public float f51349n0;
    public boolean f51350o0;
    public ValueAnimator f51351p0;
    public Bitmap f51352q0;
    public final h f51353r;
    public BitmapShader f51354r0;
    public final FrameLayout f51355s;
    public Matrix f51356s0;
    public Paint f51357t0;
    public final org.telegram.ui.Components.t5 f51358u0;
    public int f51359v0;
    public final org.telegram.ui.Components.f6 f51360w;
    public float f51361w0;
    public int f51362x;
    public boolean f51363x0;
    public long f51364y;
    public final RectF f51365y0;
    public final RectF f51366z0;

    public k(Context context, FrameLayout frameLayout, uu0 uu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var) {
        super(context);
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        tg.i iVar = new tg.i();
        this.f51336c = iVar;
        tg.i iVar2 = new tg.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.D = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.H = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.I = paint3;
        this.N = -4;
        this.U = d20.f15147s0;
        this.f51337c0 = new e(this, 0);
        this.f51339e0 = new dc(this, 1.0f, 3.0f);
        this.m0 = new e(this, 1);
        gr grVar = gr.h;
        this.f51358u0 = new org.telegram.ui.Components.t5(this, 0L, 300L, grVar);
        this.f51363x0 = false;
        this.f51365y0 = new RectF();
        this.f51366z0 = new RectF();
        this.A0 = new RectF();
        this.I0 = new Path();
        this.L0 = new org.telegram.ui.Components.t5(this, 500L, grVar);
        this.f51332a = p6Var;
        this.J = frameLayout;
        this.K = uu0Var;
        this.f51334b = frameLayout2;
        this.O = s9Var;
        this.R = new w9(s9Var, this, 0, !g());
        this.S = new w9(s9Var, this, 8, false);
        this.Q = new w9(s9Var, this, 9, false);
        iVar.f48758l = true;
        int i16 = org.telegram.ui.ActionBar.t6.f20929d6;
        iVar.f48750a = new e10(p6Var, i16, 0.0f, 1);
        iVar.a();
        iVar.f48754g.setColor(0);
        iVar.invalidateSelf();
        iVar2.f48758l = true;
        iVar2.f48750a = new e10(p6Var, i16, 0.0f, 2);
        iVar2.a();
        iVar2.f48754g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.L = new r2(frameLayout, false, new ph.h1(this, 19));
        f fVar = new f(this, context, uu0Var, getEditTextStyle(), new th.b(), p6Var, s9Var);
        this.f51340f = fVar;
        fVar.S = true;
        fVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.l3());
        fVar.setFocusable(true);
        fVar.setFocusableInTouchMode(true);
        fVar.getEditText().f24012q0 = true;
        fVar.getEditText().f24016s0 = new qh.d(this, 15);
        fVar.getEditText().setSupportRtlHint(true);
        this.P = new w9(s9Var, fVar.getEditText(), g() ? 1 : 2, false);
        fVar.getEditText().setHintColor(-1);
        fVar.getEditText().r(cd.L0(2131754454, null), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        fVar.getEditText().setTranslationX(org.telegram.messenger.i0.L(-26.0f));
        boolean z10 = this instanceof kq0;
        if (z10) {
            fVar.getEditText().setGravity(48);
        }
        fVar.getEmojiButton().setAlpha(0.0f);
        View emojiButton = fVar.getEmojiButton();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        emojiButton.setTranslationY(org.telegram.messenger.i0.L(f7));
        fVar.setTranslationY(org.telegram.messenger.i0.L(z10 ? 1.0f : -1.0f));
        fVar.getEditText().addTextChangedListener(new g(this));
        fVar.getEditText().setLinkTextColor(-1);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        addView(fVar, w7.b6.d(-1, -2.0f, i10 | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        h hVar = new h(context);
        this.f51353r = hVar;
        w7.e6.b(hVar, 0.05f, 1.25f);
        Drawable mutate = context.getResources().getDrawable(2131231502).mutate();
        this.h = mutate;
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.U5, null, PorterDuff.Mode.SRC_IN);
        eq eqVar = new eq(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(18.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21125ng, p6Var)), mutate, 0, org.telegram.messenger.i0.L(1.0f));
        this.f51348n = eqVar;
        int L = org.telegram.messenger.i0.L(36.0f);
        int L2 = org.telegram.messenger.i0.L(36.0f);
        eqVar.h = L;
        eqVar.f25843n = L2;
        hVar.setImageDrawable(eqVar);
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(cd.L0(2131751355, null));
        hVar.setAlpha(0.0f);
        hVar.setVisibility(8);
        hVar.setOnClickListener(new rh.s(this, 17));
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(hVar, w7.b6.d(44, 44.0f, i11 | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
        this.f51360w = f6Var;
        f6Var.setGravity(17);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setTextColor(-1);
        f6Var.b(0.4f, 320L, grVar);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f51355s = frameLayout3;
        frameLayout3.setTranslationX(org.telegram.messenger.i0.L(2.0f));
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        frameLayout3.addView(f6Var, w7.b6.e(52, 16, i12 | 5));
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        int i17 = i13 | 5;
        if (z10) {
            i14 = 50;
        } else {
            i14 = 0;
        }
        float f10 = i14;
        if (z10) {
            i15 = 0;
        } else {
            i15 = 50;
        }
        addView(frameLayout3, w7.b6.d(52, 16.0f, i17, 0.0f, f10, 0.0f, i15));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return org.telegram.messenger.i0.f16021n;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override
    public final void clearFocus() {
        this.f51340f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: vh.k.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f51338d0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.A0.contains(motionEvent.getX(), motionEvent.getY()) || this.f51350o0) {
                int action = motionEvent.getAction();
                dc dcVar = this.f51339e0;
                if (action == 0 && !this.f51350o0) {
                    if ((this instanceof p) && ((p) this).N1) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int i10 = 0;
                    while (true) {
                        int childCount = getChildCount();
                        f fVar = this.f51340f;
                        if (i10 < childCount) {
                            View childAt = getChildAt(i10);
                            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && fVar != childAt) {
                                float x10 = childAt.getX();
                                float y3 = childAt.getY();
                                float x11 = childAt.getX() + childAt.getWidth();
                                float y10 = childAt.getY() + childAt.getHeight();
                                RectF rectF = this.f51365y0;
                                rectF.set(x10, y3, x11, y10);
                                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            i10++;
                        } else {
                            this.L.b(false);
                            fVar.getEditText().setForceCursorEnd(true);
                            fVar.getEditText().requestFocus();
                            rt rtVar = fVar.f32239a;
                            rtVar.requestFocus();
                            org.telegram.messenger.i0.J3(rtVar);
                            fVar.getEditText().setScrollY(0);
                            dcVar.c(true);
                            return true;
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        dcVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar;
        float max;
        RectF rectF = this.f51366z0;
        if (view == this.f51340f) {
            if (this instanceof kq0) {
                max = 0.0f;
            } else {
                max = (1.0f - this.f51349n0) * Math.max(0, (fVar.getHeight() - org.telegram.messenger.i0.L(82.0f)) - fVar.getScrollY());
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            canvas.save();
            Matrix matrix = this.F;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top - 1.0f);
            LinearGradient linearGradient = this.E;
            linearGradient.setLocalMatrix(matrix);
            float f7 = rectF.left;
            float f10 = rectF.top;
            Paint paint = this.D;
            canvas.drawRect(f7, f10, rectF.right, org.telegram.messenger.i0.L(10.0f) + f10, paint);
            matrix.reset();
            matrix.postRotate(180.0f);
            matrix.postTranslate(0.0f, rectF.bottom);
            linearGradient.setLocalMatrix(matrix);
            canvas.drawRect(rectF.left, rectF.bottom - org.telegram.messenger.i0.L(10.0f), rectF.right, rectF.bottom, paint);
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
        return this.f51366z0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        if (d20.i(this.U).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f51362x;
    }

    public int getEditTextHeight() {
        return (int) this.f51358u0.f30445c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(org.telegram.messenger.i0.L(82.0f), this.f51340f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.L0.f30445c;
    }

    public int getSelectionLength() {
        f fVar = this.f51340f;
        if (fVar != null && fVar.getEditText() != null) {
            try {
                return fVar.getEditText().getSelectionEnd() - fVar.getEditText().getSelectionStart();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f51340f.getText();
    }

    public abstract void h(w9 w9Var, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f7, float f10);

    public final void m() {
        invalidate();
        f fVar = this.f51340f;
        fVar.getEditText().invalidate();
        fVar.getEmojiButton().invalidate();
        oh ohVar = this.M;
        if (ohVar != null) {
            ohVar.invalidate();
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
            Bitmap bitmap = this.G;
            if (bitmap != null) {
                bitmap.recycle();
                this.G = null;
            }
            TextPaint textPaint = this.H;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            String L0 = cd.L0(2131754454, null);
            this.G = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(L0)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.G).drawText(L0, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f51352q0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f51354r0 = null;
        this.f51357t0 = null;
        Bitmap bitmap2 = this.G;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.G = null;
        }
    }

    public final boolean p() {
        f fVar = this.f51340f;
        boolean z10 = fVar.f32248y;
        r2 r2Var = this.L;
        if (z10 && fVar.getEmojiView() != null) {
            if (r2Var.c()) {
                fVar.getEmojiView().B();
                return true;
            }
            st stVar = fVar.d;
            if (stVar != null) {
                stVar.B();
                fVar.d.t(false);
            }
            return true;
        } else if (fVar.e) {
            fVar.k(true);
            return true;
        } else if ((!fVar.f32246w && !r2Var.c()) || r2Var.d) {
            return false;
        } else {
            fVar.d();
            fVar.k(true);
            return true;
        }
    }

    public void setAccount(int i10) {
        this.U = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(tg.b bVar) {
        this.f51342g0 = bVar;
    }

    public void setDialogId(long j10) {
        this.f51364y = j10;
        oh ohVar = this.M;
        if (ohVar != null) {
            ohVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(q20 q20Var) {
        this.f51344i0 = q20Var;
    }

    public void setOnKeyboardOpen(q20 q20Var) {
        this.f51345j0 = q20Var;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        if (z10 && !this.f51350o0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f51339e0.c(z11);
    }

    public void setText(CharSequence charSequence) {
        this.V = true;
        this.f51340f.setText(charSequence);
    }

    public abstract void u(float f7);

    public final void v(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.B0 = false;
            invalidate();
            return;
        }
        this.B0 = true;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = "";
        }
        this.C0 = new qz0(spannableStringBuilder, 14.0f, org.telegram.messenger.i0.o());
        if (charSequence == null) {
            charSequence = "";
        }
        this.D0 = new qz0(charSequence, 14.0f, null);
    }

    public void w() {
        this.M.getAdapter().f55647c = false;
        this.M.getAdapter().d = false;
        this.M.getAdapter().e = false;
        this.M.getAdapter().m0 = this instanceof p;
    }

    public void x(int i10) {
        int bottomPadding;
        uu0 uu0Var = this.K;
        if (uu0Var != null) {
            uu0Var.R();
        }
        f fVar = this.f51340f;
        boolean z10 = false;
        if (fVar.e) {
            i10 = Math.max(0, fVar.getEmojiPadding() + a());
        } else if (fVar.N) {
            i10 = Math.max(0, fVar.getKeyboardHeight() + a());
        }
        if (uu0Var == null) {
            bottomPadding = 0;
        } else {
            bottomPadding = uu0Var.getBottomPadding();
        }
        int max = Math.max(0, i10 - bottomPadding);
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof kq0)) {
            ObjectAnimator objectAnimator = this.f51346k0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f51346k0.cancel();
                this.f51346k0 = null;
            }
            this.f51346k0 = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
            if (max > org.telegram.messenger.i0.L(20.0f)) {
                this.f51346k0.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
                this.f51346k0.setDuration(250L);
            } else {
                this.f51346k0.setInterpolator(gr.h);
                this.f51346k0.setDuration(640L);
            }
            this.f51346k0.start();
        }
        if (max > org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        }
        this.f51347l0 = z10;
        e eVar = this.m0;
        org.telegram.messenger.i0.r(eVar);
        org.telegram.messenger.i0.g3(eVar);
        if (max < org.telegram.messenger.i0.L(20.0f)) {
            fVar.getEditText().clearFocus();
            fVar.k(true);
        }
    }

    public void y() {
        if (this.M != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f51358u0.f30445c;
            if (this.M.getY() != translationY) {
                this.M.setTranslationY(translationY);
                this.M.invalidate();
            }
        }
    }

    public void q(boolean z10) {
    }

    public void r(int i10) {
    }

    public void setUiBlurBitmap(s20 s20Var) {
    }

    public void n() {
    }

    public void t() {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f7) {
    }
}
