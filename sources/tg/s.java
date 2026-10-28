package tg;

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
import fi.v3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.x5;
public final class s extends View {
    public final Path f49068a;
    public final CornerPathEffect f49069b;
    public final TextPaint f49070c;
    public StaticLayout d;
    public float e;
    public SpannableStringBuilder f49071f;
    public final ArrayList h;
    public StaticLayout f49072n;
    public boolean f49073r;
    public float f49074s;
    public boolean v;
    public final Paint f49075w;
    public final Paint f49076x;
    public final LimitPreviewView f49077y;

    public s(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.f49077y = limitPreviewView;
        this.f49068a = new Path();
        this.f49069b = new CornerPathEffect(AndroidUtilities.dp(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f49070c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f49075w = paint;
        Paint paint2 = new Paint();
        this.f49076x = paint2;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(s sVar) {
        ArrayList arrayList = sVar.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((r) arrayList.get(i10)).f49055f != null) {
                return;
            }
        }
        arrayList.clear();
        sVar.f49073r = false;
        sVar.invalidate();
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        float measuredWidth = getMeasuredWidth() * this.f49074s;
        float clamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float f7 = 10.0f;
        float clamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
        if (this.f49074s >= 0.7f) {
            f7 = 24.0f;
        }
        float clamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(f7), getMeasuredWidth(), 0.0f);
        float clamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.f49068a;
        path.rewind();
        float f10 = measuredHeight;
        float f11 = f10 - (f10 / 2.0f);
        path.moveTo(clamp3, f11 - AndroidUtilities.dp(2.0f));
        path.lineTo(clamp3, f10);
        path.lineTo(clamp4, f10);
        path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
        if (this.f49074s < 0.7f) {
            path.lineTo(clamp, f10);
        }
        path.lineTo(clamp2, f10);
        path.lineTo(clamp2, f11 - AndroidUtilities.dp(2.0f));
        path.close();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        LimitPreviewView limitPreviewView = this.f49077y;
        Paint paint = limitPreviewView.K;
        if (limitPreviewView.J) {
            measuredHeight = getMeasuredHeight();
            b1.d().f(LimitPreviewView.e(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
            float f7 = measuredHeight / 2.0f;
            b1 d = b1.d();
            if (d.f48860c == null) {
                d.f48860c = new Paint(1);
            }
            d.f48860c.setColor(y6.x0(null, y6.Oh, false));
            canvas.drawRoundRect(rectF, f7, f7, d.f48860c);
        } else {
            if (this.v) {
                this.v = false;
                b();
            }
            b1.d().f(LimitPreviewView.e(limitPreviewView) - getX(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f10 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f10);
            float f11 = f10 / 2.0f;
            boolean z10 = limitPreviewView.R;
            TextPaint textPaint = this.f49070c;
            if (z10) {
                e = paint;
            } else if (limitPreviewView.f26226e0 != null) {
                e = textPaint;
            } else {
                e = b1.d().e();
            }
            canvas.drawRoundRect(rectF2, f11, f11, e);
            Paint e10 = b1.d().e();
            CornerPathEffect cornerPathEffect = this.f49069b;
            e10.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f26226e0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.R) {
                if (limitPreviewView.f26226e0 != null) {
                    paint = textPaint;
                } else {
                    paint = b1.d().e();
                }
            }
            canvas.drawPath(this.f49068a, paint);
            b1.d().e().setPathEffect(null);
            if (limitPreviewView.f26226e0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.f26225d0) {
                invalidate();
            }
        }
        int i10 = measuredHeight;
        if (limitPreviewView.f26226e0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f49075w, 31);
        }
        float measuredWidth = (getMeasuredWidth() - this.e) / 2.0f;
        float height = (i10 - this.d.getHeight()) / 2.0f;
        if (!this.f49073r) {
            if (this.d != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.d.draw(canvas);
                canvas.restore();
            }
        } else {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
            if (this.f49072n != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.f49072n.draw(canvas);
                canvas.restore();
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i11 >= arrayList.size()) {
                    break;
                }
                r rVar = (r) arrayList.get(i11);
                canvas.save();
                boolean z11 = rVar.f49052a;
                ArrayList arrayList2 = rVar.f49053b;
                if (z11) {
                    canvas.translate(rVar.e + measuredWidth, ((i10 * rVar.f49054c) + height) - ((1 - arrayList2.size()) * i10));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else if (rVar.d) {
                    canvas.translate(rVar.e + measuredWidth, (height - ((i10 * 10) * rVar.f49054c)) + ((10 - arrayList2.size()) * i10));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, i10);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                } else {
                    canvas.translate(rVar.e + measuredWidth, (((i10 * 10) * rVar.f49054c) + height) - ((10 - arrayList2.size()) * i10));
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        canvas.translate(0.0f, -i10);
                        ((StaticLayout) arrayList2.get(i14)).draw(canvas);
                    }
                }
                canvas.restore();
                i11++;
            }
            canvas.restore();
        }
        if (limitPreviewView.f26226e0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f49076x, 31);
            canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((x5) ((org.telegram.ui.y0) limitPreviewView.f26226e0).f45809b).r0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder = this.f49071f;
        TextPaint textPaint = this.f49070c;
        this.e = v3.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f49071f, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = 0.0f;
        for (int i12 = 0; i12 < this.d.getLineCount(); i12++) {
            this.e = Math.max(this.e, this.d.getLineWidth(i12));
        }
        setMeasuredDimension((int) (this.e + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
        b();
    }

    @Override
    public final void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
            invalidate();
        }
    }
}
