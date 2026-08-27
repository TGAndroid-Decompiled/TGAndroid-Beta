package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;

public final class w1 extends View {
    public yf.b1 A;
    public float B;
    public float C;
    public yf.p1 D;
    public Runnable E;
    public boolean F;
    public v1 G;

    public final Paint f50746a;

    public final Paint f50747b;

    public final Path f50748c;
    public final m5.o d;

    public final RectF f50749e;

    public boolean f50750f;
    public boolean h;

    public float f50751n;

    public float f50752r;

    public long f50753s;
    public boolean v;

    public final y5 f50754w;

    public final y5 f50755x;

    public final y5 f50756y;

    public w1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f50746a = paint;
        Paint paint2 = new Paint(1);
        this.f50747b = paint2;
        this.f50748c = new Path();
        this.f50749e = new RectF();
        this.v = true;
        this.f50754w = new y5(this);
        this.f50755x = new y5(this);
        this.f50756y = new y5(this);
        this.D = new yf.p1(1.0f, 0.016773745f, -1);
        this.F = true;
        this.d = new m5.o(context, new u1(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void a(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f10 - f12) - AndroidUtilities.dp(6.0f), (f11 - f12) - AndroidUtilities.dp(6.0f), f10 + f12 + AndroidUtilities.dp(6.0f), f11 + f12 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.f50752r * 255.0f), 31);
        }
        canvas.drawCircle(f10, f11, f12, this.f50747b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f10, float f11) {
        this.B = f10;
        this.C = f11;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        super.onDraw(canvas);
        long jMin = Math.min(16L, System.currentTimeMillis() - this.f50753s);
        this.f50753s = System.currentTimeMillis();
        v1 v1Var = this.G;
        float fD = this.f50754w.d(v1Var != null ? v1Var.get() : this.D.f50036c, false);
        float fD2 = this.f50755x.d(this.B, false);
        float fD3 = this.f50756y.d(this.C, false);
        boolean z10 = this.h;
        if (z10) {
            float f12 = this.f50751n;
            if (f12 != 1.0f) {
                this.f50751n = Math.min(1.0f, (jMin / 200.0f) + f12);
                invalidate();
            } else if (!z10) {
                f10 = this.f50751n;
                if (f10 != 0.0f) {
                    this.f50751n = Math.max(0.0f, f10 - (jMin / 200.0f));
                    invalidate();
                }
            }
        } else if (!z10) {
            f10 = this.f50751n;
            if (f10 != 0.0f) {
                this.f50751n = Math.max(0.0f, f10 - (jMin / 200.0f));
                invalidate();
            }
        }
        boolean z11 = this.f50750f;
        if (z11) {
            float f13 = this.f50752r;
            if (f13 != 1.0f) {
                this.f50752r = Math.min(1.0f, (jMin / 200.0f) + f13);
                invalidate();
            } else if (!z11) {
                f11 = this.f50752r;
                if (f11 != 0.0f) {
                    this.f50752r = Math.max(0.0f, f11 - (jMin / 200.0f));
                    invalidate();
                }
            }
        } else if (!z11) {
            f11 = this.f50752r;
            if (f11 != 0.0f) {
                this.f50752r = Math.max(0.0f, f11 - (jMin / 200.0f));
                invalidate();
            }
        }
        RectF rectF = this.f50749e;
        float fHeight = rectF.height();
        int iDp = AndroidUtilities.dp(16.0f);
        int iDp2 = AndroidUtilities.dp(3.0f);
        int iDp3 = AndroidUtilities.dp(3.0f);
        Path path = this.f50748c;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        int i10 = -iDp3;
        int i11 = -iDp;
        rectF2.set(AndroidUtilities.lerp(i10, i11, this.f50752r), 0.0f, AndroidUtilities.lerp(iDp3, iDp, this.f50752r), AndroidUtilities.lerp(iDp3, iDp, this.f50752r) * 2);
        path.arcTo(rectF2, -90.0f, 90.0f);
        path.lineTo(AndroidUtilities.lerp(iDp3, iDp2, this.f50752r), fHeight);
        rectF2.set(AndroidUtilities.lerp(i10, -iDp2, this.f50752r), fHeight - (iDp2 * 2), AndroidUtilities.lerp(iDp3, iDp2, this.f50752r), fHeight);
        path.arcTo(rectF2, 0.0f, 180.0f);
        float f14 = iDp;
        path.lineTo(AndroidUtilities.lerp(i10, i11, this.f50752r), f14);
        rectF2.set(AndroidUtilities.lerp(i10, i11, this.f50752r), 0.0f, AndroidUtilities.lerp(iDp3, iDp, this.f50752r), iDp * 2);
        path.arcTo(rectF2, -180.0f, 90.0f);
        path.close();
        if (this.f50751n != 0.0f) {
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.f50751n) * 255.0f), 31);
        }
        canvas.save();
        float fDp = AndroidUtilities.dp(32.0f);
        er erVar = er.f28122f;
        canvas.translate(erVar.getInterpolation(this.f50752r) * fDp, rectF.top);
        canvas.drawPath(path, this.f50746a);
        canvas.restore();
        float f15 = (fD - fD2) / (fD3 - fD2);
        float f16 = iDp2 * 1.5f;
        a(erVar.getInterpolation(this.f50752r) * AndroidUtilities.dp(32.0f), h7.n.a(com.google.android.recaptcha.internal.a.z(1.0f, f15, rectF.height(), rectF.top), rectF.top + f14, rectF.bottom - Math.min(f16, f14)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f16, f14), f14, f15), this.f50752r), canvas, false);
        if (this.F && this.f50752r != 0.0f && this.v && this.A != null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            yf.b1 b1Var = this.A;
            float f17 = b1Var.f49880c.f50016g.f32893a;
            a(width, height, b1Var.getCurrentBrush().h() * com.google.android.recaptcha.internal.a.x(f17, 0.043945312f, fD, 0.00390625f * f17) * this.A.getCurrentBrush().g(), canvas, true);
        }
        if (this.f50751n != 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.f50749e.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = ((GestureDetector) this.d.f17823b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return zOnTouchEvent;
        }
        this.f50750f = false;
        invalidate();
        return zOnTouchEvent;
    }

    public void setBrushWeight(float f10) {
        this.D.f50036c = f10;
        invalidate();
    }

    public void setColorSwatch(yf.p1 p1Var) {
        this.D = p1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.E = runnable;
    }

    public void setRenderView(yf.b1 b1Var) {
        this.A = b1Var;
    }

    public void setShowPreview(boolean z10) {
        this.v = z10;
        invalidate();
    }

    public void setValueOverride(v1 v1Var) {
        this.G = v1Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
