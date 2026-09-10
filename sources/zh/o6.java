package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.wr;
public final class o6 extends View implements ba {
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final p6 J;
    public final PorterDuffColorFilter f48751a;
    public boolean f48752b;
    public final TextPaint f48753c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f48754f;
    public float h;
    public float f48755n;
    public final n6[] f48756r;
    public int f48757s;
    public StaticLayout v;
    public float f48758w;
    public boolean f48759x;
    public final boolean f48760y;

    public o6(p6 p6Var, Context context) {
        super(context);
        this.J = p6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f48753c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f48754f = paint2;
        this.f48756r = r7;
        this.f48757s = 0;
        new Path();
        this.f48760y = true;
        this.H = false;
        n6[] n6VarArr = {new n6(this), null};
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f48751a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(o6 o6Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (LocaleController.isRTL) {
                alignment = uw0.a();
            } else {
                Layout.Alignment[] alignmentArr = uw0.f27756a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void b(CharSequence charSequence, j6 j6Var, j6 j6Var2, boolean z10, boolean z11) {
        if (charSequence == null) {
            charSequence = "";
        }
        n6[] n6VarArr = this.f48756r;
        if (MediaDataController.stringsEqual(n6VarArr[0].f48722n, charSequence)) {
            n6 n6Var = n6VarArr[0];
            if (n6Var.f48723o == j6Var && n6Var.f48724p == j6Var2) {
                n6Var.f48725q = z10;
                invalidate();
                return;
            }
        }
        this.f48759x = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (n6VarArr[1] == null) {
                n6VarArr[1] = new n6(this);
            }
            n6 n6Var2 = n6VarArr[1];
            n6 n6Var3 = n6VarArr[0];
            n6Var2.g(n6Var3.f48722n, n6Var3.f48723o, n6Var3.f48724p);
            n6 n6Var4 = n6VarArr[1];
            n6 n6Var5 = n6VarArr[0];
            n6Var4.f48725q = n6Var5.f48725q;
            n6Var4.f48726r.d(n6Var5.f48726r.f22295c, true);
            n6VarArr[0].g(charSequence, j6Var, j6Var2);
            n6 n6Var6 = n6VarArr[0];
            n6Var6.f48725q = z10;
            n6Var6.f48726r.d(0.0f, true);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new qg.o(this, 27));
            this.I.addListener(new yg.b(this, 13));
            this.I.setDuration(180L);
            this.I.setInterpolator(wr.f28820g);
            this.I.start();
            return;
        }
        n6VarArr[0].g(charSequence, j6Var, j6Var2);
        n6VarArr[0].f48725q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: zh.o6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        n6[] n6VarArr = this.f48756r;
        int i11 = 0;
        int i12 = n6VarArr[0].f48720l;
        n6 n6Var = n6VarArr[1];
        if (n6Var != null) {
            i11 = n6Var.f48720l;
        }
        return AndroidUtilities.lerp(i12, i11, this.G) + i10;
    }

    public Paint getPaint() {
        return this.f48753c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f48756r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.f48756r[0].f48722n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        n6 n6Var = this.f48756r[0];
        o6 o6Var = n6Var.v;
        org.telegram.ui.Components.y5.release(o6Var, n6Var.d);
        org.telegram.ui.Components.y5.release(o6Var, n6Var.f48715f);
        if (n6Var.h == null) {
            return;
        }
        while (true) {
            k6[] k6VarArr = n6Var.h;
            if (i10 < k6VarArr.length) {
                k6 k6Var = k6VarArr[i10];
                if (k6Var != null) {
                    org.telegram.ui.Components.y5.release(o6Var, k6Var.f48592a);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.v != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        n6[] n6VarArr = this.f48756r;
        n6VarArr[0].b(canvas2, 1.0f - this.G);
        n6 n6Var = n6VarArr[1];
        if (n6Var != null) {
            n6Var.b(canvas2, this.G);
        }
        if (this.v != null) {
            float scrollY = this.h + this.J.getScrollY();
            int clamp = (int) ((1.0f - Utilities.clamp(this.f48758w / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f48754f;
            paint.setAlpha(clamp);
            Paint paint2 = this.e;
            paint2.setAlpha(clamp);
            this.d.setAlpha(clamp);
            canvas2.save();
            canvas2.translate(this.f48755n - AndroidUtilities.dp(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.v.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f48755n - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.v.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f48755n, scrollY);
            this.v.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(8.0f);
        int i13 = this.f48757s;
        n6[] n6VarArr = this.f48756r;
        int i14 = 0;
        if (i13 != i12) {
            this.f48757s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            n6VarArr[0].e(max);
            n6 n6Var = n6VarArr[1];
            if (n6Var != null) {
                n6Var.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = n6VarArr[0].f48720l;
        n6 n6Var2 = n6VarArr[1];
        if (n6Var2 != null) {
            i14 = n6Var2.f48720l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(i16, i14, this.G) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: zh.o6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        if (z10 != isPressed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.J.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        n6 n6Var;
        j6 j6Var;
        j6 j6Var2;
        j6 j6Var3;
        j6 j6Var4;
        n6[] n6VarArr = this.f48756r;
        n6 n6Var2 = n6VarArr[0];
        if ((n6Var2 != null && (n6Var2.f48727s == drawable || (((j6Var3 = n6Var2.f48723o) != null && j6Var3.f48549j == drawable) || ((j6Var4 = n6Var2.f48724p) != null && j6Var4.f48549j == drawable)))) || ((n6Var = n6VarArr[1]) != null && (n6Var.f48727s == drawable || (((j6Var = n6Var.f48723o) != null && j6Var.f48549j == drawable) || ((j6Var2 = n6Var.f48724p) != null && j6Var2.f48549j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
