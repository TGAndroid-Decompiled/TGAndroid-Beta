package th;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
public final class t6 extends View {
    public int f49501a;
    public int f49502b;
    public final Matrix f49503c;
    public final Paint[] d;
    public final org.telegram.ui.Components.t5 e;
    public boolean f49504f;
    public int h;
    public final Drawable[] f49505n;
    public final float[] f49506r;
    public boolean f49507s;
    public final Paint f49508w;
    public final Path f49509x;
    public final dc f49510y;

    public t6(Context context) {
        super(context);
        this.f49503c = new Matrix();
        this.d = r0;
        this.e = new org.telegram.ui.Components.t5(this, 0L, 260L, gr.h);
        this.f49505n = new Drawable[2];
        this.f49506r = new float[2];
        Paint paint = new Paint(1);
        this.f49508w = paint;
        this.f49509x = new Path();
        this.f49510y = new dc(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z10, TL_stories.StoryItem storyItem, boolean z11) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.f49507s = z10;
        this.f49504f = true;
        int i10 = 0;
        if (storyItem == null) {
            this.f49504f = false;
        } else {
            boolean z12 = storyItem.close_friends;
            org.telegram.ui.Components.t5 t5Var = this.e;
            if (z12) {
                c(15.0f, 2131232385);
                d(-7808710, -13781445);
                t5Var.f(z11, true);
            } else if (storyItem.contacts) {
                c(17.33f, 2131232161);
                d(-3905294, -6923014);
                t5Var.f(z11, true);
            } else if (!storyItem.selected_contacts && (!z10 || ((arrayList = storyItem.privacy) != null && !arrayList.isEmpty()))) {
                if (z10) {
                    c(17.33f, 2131232158);
                    d(-15292942, -15630089);
                    t5Var.f(z11, true);
                } else {
                    this.f49504f = false;
                }
            } else {
                c(17.33f, 2131232159);
                d(-18621, -618956);
                t5Var.f(z11, true);
            }
        }
        if (!this.f49504f) {
            i10 = 8;
        }
        setVisibility(i10);
        invalidate();
    }

    public final void b(boolean z10, d5 d5Var, boolean z11) {
        vh.u6 u6Var;
        this.f49507s = z10;
        this.f49504f = true;
        int i10 = 0;
        if (d5Var != null && (u6Var = d5Var.f48892c.E0) != null) {
            int i11 = u6Var.f52024a;
            org.telegram.ui.Components.t5 t5Var = this.e;
            if (i11 == 1) {
                c(15.0f, 2131232385);
                d(-7808710, -13781445);
                t5Var.f(z11, !z11);
            } else if (i11 == 2) {
                c(17.33f, 2131232161);
                d(-3905294, -6923014);
                t5Var.f(z11, !z11);
            } else if (i11 == 3) {
                c(17.33f, 2131232159);
                d(-18621, -618956);
                t5Var.f(z11, !z11);
            } else if (z10) {
                c(17.33f, 2131232158);
                d(-15292942, -15630089);
                t5Var.f(z11, !z11);
            } else {
                this.f49504f = false;
            }
        } else {
            this.f49504f = false;
        }
        if (!this.f49504f) {
            i10 = 8;
        }
        setVisibility(i10);
        invalidate();
    }

    public final void c(float f7, int i10) {
        if (i10 == 2131232385) {
            setContentDescription(dd.L0(2131744558, null));
        } else if (i10 == 2131232161) {
            setContentDescription(dd.L0(2131744556, null));
        } else if (i10 == 2131232159) {
            setContentDescription(dd.L0(2131744546, null));
        } else if (i10 == 2131232158) {
            setContentDescription(dd.L0(2131744554, null));
        }
        Drawable[] drawableArr = this.f49505n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.f49506r;
        fArr[1] = fArr[0];
        if (drawable != null && i10 == this.h) {
            return;
        }
        Resources resources = getContext().getResources();
        this.h = i10;
        drawableArr[0] = resources.getDrawable(i10).mutate();
        drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        fArr[0] = org.telegram.messenger.i0.N(f7);
        invalidate();
    }

    public final void d(int i10, int i11) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.f49501a == i10 && this.f49502b == i11) {
            return;
        }
        this.f49501a = i10;
        this.f49502b = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(23.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.f49503c;
        matrix.reset();
        matrix.postTranslate(0.0f, org.telegram.messenger.i0.L(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        int L;
        float width = (getWidth() / 2.0f) + getX();
        if (this.f49507s) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(14.0f);
        }
        return width + L;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float N;
        float N2;
        float f7;
        char c10;
        float f10;
        float centerX;
        float centerX2;
        if (!this.f49504f) {
            return;
        }
        if (this.f49507s) {
            N = 0.0f;
        } else {
            N = org.telegram.messenger.i0.N(7.0f);
        }
        if (this.f49507s) {
            N2 = org.telegram.messenger.i0.N(43.0f);
        } else {
            N2 = org.telegram.messenger.i0.N(23.66f);
        }
        float N3 = org.telegram.messenger.i0.N(23.66f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(c3.i0.B(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, org.telegram.messenger.m5.a(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
        float a2 = this.f49510y.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float e = this.e.e(false, 0.0f);
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        Paint[] paintArr = this.d;
        if (i10 > 0) {
            paintArr[1].setAlpha(255);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paintArr[1]);
        }
        if (e < 1.0f) {
            paintArr[0].setAlpha((int) ((1.0f - e) * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paintArr[0]);
        }
        float abs = Math.abs(e - 0.5f) + 0.5f;
        Drawable[] drawableArr = this.f49505n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.f49506r;
        if (drawable != null && e > 0.5f) {
            if (this.f49507s) {
                centerX2 = org.telegram.messenger.i0.N(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f11 = (fArr[1] / 2.0f) * abs;
            f7 = 0.5f;
            c10 = 0;
            f10 = 12.0f;
            drawableArr[1].setBounds((int) a30.v(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f11), (int) (f11 + centerX2), (int) a1.g.c(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            f7 = 0.5f;
            c10 = 0;
            f10 = 12.0f;
        }
        if (drawableArr[c10] != null && e <= f7) {
            if (this.f49507s) {
                centerX = org.telegram.messenger.i0.N(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f12 = (fArr[c10] / 2.0f) * abs;
            drawableArr[c10].setBounds((int) a30.v(fArr[c10], 2.0f, abs, centerX), (int) (centerY2 - f12), (int) (f12 + centerX), (int) a1.g.c(fArr[c10], 2.0f, abs, rectF.centerY()));
            drawableArr[c10].draw(canvas);
        }
        if (this.f49507s) {
            Path path = this.f49509x;
            path.rewind();
            path.moveTo(rectF.right - org.telegram.messenger.i0.N(15.66f), rectF.centerY() - org.telegram.messenger.i0.N(1.33f));
            path.lineTo(rectF.right - org.telegram.messenger.i0.N(f10), org.telegram.messenger.i0.N(2.33f) + rectF.centerY());
            path.lineTo(rectF.right - org.telegram.messenger.i0.N(8.16f), rectF.centerY() - org.telegram.messenger.i0.N(1.33f));
            float N4 = org.telegram.messenger.i0.N(1.33f);
            Paint paint = this.f49508w;
            paint.setStrokeWidth(N4);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824));
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f49510y.c(z10);
    }
}
