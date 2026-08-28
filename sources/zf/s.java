package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.u5;
public final class s extends View {
    public final Path f50681a;
    public final CornerPathEffect f50682b;
    public final TextPaint f50683c;
    public StaticLayout d;
    public float f50684e;
    public SpannableStringBuilder f50685f;
    public final ArrayList h;
    public StaticLayout f50686n;
    public boolean f50687r;
    public float f50688s;
    public boolean v;
    public final Paint f50689w;
    public final Paint f50690x;
    public final LimitPreviewView f50691y;

    public s(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.f50691y = limitPreviewView;
        this.f50681a = new Path();
        this.f50682b = new CornerPathEffect(AndroidUtilities.dp(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f50683c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f50689w = paint;
        Paint paint2 = new Paint();
        this.f50690x = paint2;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(s sVar) {
        ArrayList arrayList = sVar.h;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((r) arrayList.get(i9)).f50678f != null) {
                return;
            }
        }
        arrayList.clear();
        sVar.f50687r = false;
        sVar.invalidate();
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        float measuredWidth = getMeasuredWidth() * this.f50688s;
        float clamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float f10 = 10.0f;
        float clamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
        if (this.f50688s >= 0.7f) {
            f10 = 24.0f;
        }
        float clamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(f10), getMeasuredWidth(), 0.0f);
        float clamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.f50681a;
        path.rewind();
        float f11 = measuredHeight;
        float f12 = f11 - (f11 / 2.0f);
        path.moveTo(clamp3, f12 - AndroidUtilities.dp(2.0f));
        path.lineTo(clamp3, f11);
        path.lineTo(clamp4, f11);
        path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
        if (this.f50688s < 0.7f) {
            path.lineTo(clamp, f11);
        }
        path.lineTo(clamp2, f11);
        path.lineTo(clamp2, f12 - AndroidUtilities.dp(2.0f));
        path.close();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint e10;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        LimitPreviewView limitPreviewView = this.f50691y;
        Paint paint = limitPreviewView.G;
        if (limitPreviewView.F) {
            measuredHeight = getMeasuredHeight();
            a1.d().f(LimitPreviewView.c(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
            float f10 = measuredHeight / 2.0f;
            a1 d = a1.d();
            if (d.f50458c == null) {
                d.f50458c = new Paint(1);
            }
            d.f50458c.setColor(f6.w0(null, f6.Oh, false));
            canvas.drawRoundRect(rectF, f10, f10, d.f50458c);
        } else {
            if (this.v) {
                this.v = false;
                b();
            }
            a1.d().f(LimitPreviewView.c(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f11 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f11);
            float f12 = f11 / 2.0f;
            boolean z10 = limitPreviewView.N;
            TextPaint textPaint = this.f50683c;
            if (z10) {
                e10 = paint;
            } else if (limitPreviewView.f26448a0 != null) {
                e10 = textPaint;
            } else {
                e10 = a1.d().e();
            }
            canvas.drawRoundRect(rectF2, f12, f12, e10);
            Paint e11 = a1.d().e();
            CornerPathEffect cornerPathEffect = this.f50682b;
            e11.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f26448a0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.N) {
                if (limitPreviewView.f26448a0 != null) {
                    paint = textPaint;
                } else {
                    paint = a1.d().e();
                }
            }
            canvas.drawPath(this.f50681a, paint);
            a1.d().e().setPathEffect(null);
            if (limitPreviewView.f26448a0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.W) {
                invalidate();
            }
        }
        int i9 = measuredHeight;
        if (limitPreviewView.f26448a0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f50689w, 31);
        }
        float measuredWidth = (getMeasuredWidth() - this.f50684e) / 2.0f;
        float height = (i9 - this.d.getHeight()) / 2.0f;
        if (!this.f50687r) {
            if (this.d != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.d.draw(canvas);
                canvas.restore();
            }
        } else {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
            if (this.f50686n != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.f50686n.draw(canvas);
                canvas.restore();
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 >= arrayList.size()) {
                    break;
                }
                r rVar = (r) arrayList.get(i10);
                canvas.save();
                boolean z11 = rVar.f50674a;
                ArrayList arrayList2 = rVar.f50675b;
                if (z11) {
                    canvas.translate(rVar.f50677e + measuredWidth, ((i9 * rVar.f50676c) + height) - ((1 - arrayList2.size()) * i9));
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        canvas.translate(0.0f, -i9);
                        ((StaticLayout) arrayList2.get(i11)).draw(canvas);
                    }
                } else if (rVar.d) {
                    canvas.translate(rVar.f50677e + measuredWidth, (height - ((i9 * 10) * rVar.f50676c)) + ((10 - arrayList2.size()) * i9));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, i9);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else {
                    canvas.translate(rVar.f50677e + measuredWidth, (((i9 * 10) * rVar.f50676c) + height) - ((10 - arrayList2.size()) * i9));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, -i9);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                }
                canvas.restore();
                i10++;
            }
            canvas.restore();
        }
        if (limitPreviewView.f26448a0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f50690x, 31);
            canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((u5) ((org.telegram.ui.b1) limitPreviewView.f26448a0).f36593b).s0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        SpannableStringBuilder spannableStringBuilder = this.f50685f;
        TextPaint textPaint = this.f50683c;
        this.f50684e = x3.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f50685f, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.f50684e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f50684e = 0.0f;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.f50684e = Math.max(this.f50684e, this.d.getLineWidth(i11));
        }
        setMeasuredDimension((int) (this.f50684e + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
        b();
    }

    @Override
    public final void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
            invalidate();
        }
    }
}
