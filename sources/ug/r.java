package ug;

import android.animation.ValueAnimator;
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
import hi.l3;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.uy;
import org.telegram.ui.t5;
public final class r extends View {
    public final LimitPreviewView E;
    public final Path f58854a;
    public final CornerPathEffect f58855b;
    public final TextPaint f58856c;
    public StaticLayout d;
    public float f58857e;
    public SpannableStringBuilder f58858f;
    public final ArrayList h;
    public StaticLayout f58859n;
    public boolean f58860r;
    public float f58861s;
    public boolean f58862w;
    public final Paint f58863x;
    public final Paint f58864y;

    public r(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.E = limitPreviewView;
        this.f58854a = new Path();
        this.f58855b = new CornerPathEffect(org.telegram.messenger.g0.L(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.f58856c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.f58863x = paint;
        Paint paint2 = new Paint();
        this.f58864y = paint2;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(r rVar) {
        ArrayList arrayList = rVar.h;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((q) arrayList.get(i7)).f58843f != null) {
                return;
            }
        }
        arrayList.clear();
        rVar.f58860r = false;
        rVar.invalidate();
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        TextPaint textPaint;
        char c10;
        if (!z10) {
            this.f58858f = spannableStringBuilder;
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = this.f58858f;
        this.f58858f = spannableStringBuilder;
        if (this.d != null) {
            ArrayList arrayList = this.h;
            arrayList.clear();
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f58858f);
            int length = this.f58858f.length() - 1;
            int i7 = 0;
            while (true) {
                textPaint = this.f58856c;
                if (length < 0) {
                    break;
                }
                if (length < spannableStringBuilder2.length()) {
                    c10 = spannableStringBuilder2.charAt(length);
                } else {
                    c10 = ' ';
                }
                if (c10 != this.f58858f.charAt(length) && Character.isDigit(this.f58858f.charAt(length))) {
                    q qVar = new q();
                    arrayList.add(qVar);
                    qVar.f58842e = this.d.getSecondaryHorizontal(length);
                    qVar.f58839a = true;
                    if (i7 >= 1) {
                        i7 = 0;
                    }
                    i7++;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout = new StaticLayout("" + c10, textPaint, (int) this.f58857e, alignment, 1.0f, 0.0f, false);
                    ArrayList arrayList2 = qVar.f58840b;
                    arrayList2.add(staticLayout);
                    arrayList2.add(new StaticLayout("" + this.f58858f.charAt(length), textPaint, (int) this.f58857e, alignment, 1.0f, 0.0f, false));
                    spannableStringBuilder3.setSpan(new uy(false), length, length + 1, 0);
                }
                length--;
            }
            this.f58859n = new StaticLayout(spannableStringBuilder3, textPaint, org.telegram.messenger.g0.L(12.0f) + ((int) this.f58857e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                this.f58860r = true;
                q qVar2 = (q) arrayList.get(i10);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qVar2.f58843f = ofFloat;
                ofFloat.addUpdateListener(new o(this, qVar2, 0));
                qVar2.f58843f.addListener(new p(this, qVar2, 1));
                qVar2.f58843f.setInterpolator(nr.f37918g);
                qVar2.f58843f.setDuration(250L);
                qVar2.f58843f.setStartDelay(((arrayList.size() - 1) - i10) * 60);
                qVar2.f58843f.start();
            }
        }
    }

    public final void c() {
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        float measuredWidth = getMeasuredWidth() * this.f58861s;
        float i7 = Utilities.i(org.telegram.messenger.g0.L(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float f10 = 10.0f;
        float i10 = Utilities.i(org.telegram.messenger.g0.L(10.0f) + measuredWidth, getMeasuredWidth(), org.telegram.messenger.g0.L(24.0f));
        if (this.f58861s >= 0.7f) {
            f10 = 24.0f;
        }
        float i11 = Utilities.i(measuredWidth - org.telegram.messenger.g0.L(f10), getMeasuredWidth(), 0.0f);
        float i12 = Utilities.i(measuredWidth - org.telegram.messenger.g0.L(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.f58854a;
        path.rewind();
        float f11 = measuredHeight;
        float f12 = f11 - (f11 / 2.0f);
        path.moveTo(i11, f12 - org.telegram.messenger.g0.L(2.0f));
        path.lineTo(i11, f11);
        path.lineTo(i12, f11);
        path.lineTo(measuredWidth, org.telegram.messenger.g0.L(8.0f) + measuredHeight);
        if (this.f58861s < 0.7f) {
            path.lineTo(i7, f11);
        }
        path.lineTo(i10, f11);
        path.lineTo(i10, f12 - org.telegram.messenger.g0.L(2.0f));
        path.close();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float globalXOffset;
        Paint e10;
        float globalXOffset2;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        LimitPreviewView limitPreviewView = this.E;
        Paint paint = limitPreviewView.L;
        if (limitPreviewView.K) {
            measuredHeight = getMeasuredHeight();
            ia.e d = ia.e.d();
            int measuredWidth = limitPreviewView.getMeasuredWidth();
            int measuredHeight2 = limitPreviewView.getMeasuredHeight();
            globalXOffset2 = limitPreviewView.getGlobalXOffset();
            d.f(globalXOffset2 - getX(), -getTop(), measuredWidth, measuredHeight2);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), measuredHeight - org.telegram.messenger.g0.L(3.0f));
            float f10 = measuredHeight / 2.0f;
            ia.e d2 = ia.e.d();
            if (((Paint) d2.d) == null) {
                d2.d = new Paint(1);
            }
            ((Paint) d2.d).setColor(m6.x0(null, m6.Fi, false));
            canvas.drawRoundRect(rectF, f10, f10, (Paint) d2.d);
        } else {
            if (this.f58862w) {
                this.f58862w = false;
                c();
            }
            ia.e d10 = ia.e.d();
            int measuredWidth2 = limitPreviewView.getMeasuredWidth();
            int measuredHeight3 = limitPreviewView.getMeasuredHeight();
            globalXOffset = limitPreviewView.getGlobalXOffset();
            d10.f(globalXOffset - getX(), -getTop(), measuredWidth2, measuredHeight3);
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f11 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f11);
            float f12 = f11 / 2.0f;
            boolean z10 = limitPreviewView.S;
            TextPaint textPaint = this.f58856c;
            if (z10) {
                e10 = paint;
            } else if (limitPreviewView.f33036f0 != null) {
                e10 = textPaint;
            } else {
                e10 = ia.e.d().e();
            }
            canvas.drawRoundRect(rectF2, f12, f12, e10);
            Paint e11 = ia.e.d().e();
            CornerPathEffect cornerPathEffect = this.f58855b;
            e11.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f33036f0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.S) {
                if (limitPreviewView.f33036f0 != null) {
                    paint = textPaint;
                } else {
                    paint = ia.e.d().e();
                }
            }
            canvas.drawPath(this.f58854a, paint);
            ia.e.d().e().setPathEffect(null);
            if (limitPreviewView.f33036f0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.f33034e0) {
                invalidate();
            }
        }
        int i7 = measuredHeight;
        if (limitPreviewView.f33036f0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f58863x, 31);
        }
        float measuredWidth3 = (getMeasuredWidth() - this.f58857e) / 2.0f;
        float height = (i7 - this.d.getHeight()) / 2.0f;
        if (!this.f58860r) {
            if (this.d != null) {
                canvas.save();
                canvas.translate(measuredWidth3, height);
                this.d.draw(canvas);
                canvas.restore();
            }
        } else {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
            if (this.f58859n != null) {
                canvas.save();
                canvas.translate(measuredWidth3, height);
                this.f58859n.draw(canvas);
                canvas.restore();
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 >= arrayList.size()) {
                    break;
                }
                q qVar = (q) arrayList.get(i10);
                canvas.save();
                boolean z11 = qVar.f58839a;
                ArrayList arrayList2 = qVar.f58840b;
                if (z11) {
                    canvas.translate(qVar.f58842e + measuredWidth3, ((i7 * qVar.f58841c) + height) - ((1 - arrayList2.size()) * i7));
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        canvas.translate(0.0f, -i7);
                        ((StaticLayout) arrayList2.get(i11)).draw(canvas);
                    }
                } else if (qVar.d) {
                    canvas.translate(qVar.f58842e + measuredWidth3, (height - ((i7 * 10) * qVar.f58841c)) + ((10 - arrayList2.size()) * i7));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, i7);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else {
                    canvas.translate(qVar.f58842e + measuredWidth3, (((i7 * 10) * qVar.f58841c) + height) - ((10 - arrayList2.size()) * i7));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, -i7);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                }
                canvas.restore();
                i10++;
            }
            canvas.restore();
        }
        if (limitPreviewView.f33036f0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f58864y, 31);
            canvas.drawRect(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), ((t5) ((org.telegram.ui.w0) limitPreviewView.f33036f0).f52897b).v0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        SpannableStringBuilder spannableStringBuilder = this.f58858f;
        TextPaint textPaint = this.f58856c;
        this.f58857e = l3.h(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f58858f, textPaint, org.telegram.messenger.g0.L(12.0f) + ((int) this.f58857e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f58857e = 0.0f;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.f58857e = Math.max(this.f58857e, this.d.getLineWidth(i11));
        }
        setMeasuredDimension((int) (this.f58857e + getPaddingRight() + getPaddingLeft()), org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(44.0f));
        c();
    }

    @Override
    public final void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
            invalidate();
        }
    }
}
