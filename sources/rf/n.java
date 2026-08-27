package rf;

import ag.t2;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class n extends q {
    public float[] E1;
    public float[] F1;
    public float G1;
    public boolean H1;
    public int I1;
    public RectF J1;
    public TextPaint K1;
    public float L1;
    public float M1;
    public String[] N1;
    public tf.g O1;
    public float P1;
    public int Q1;
    public int R1;
    public int S1;

    @Override
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        sf.b bVar = this.f46961d0;
        if (bVar == null || ((sf.e) bVar).f47882b == null) {
            return;
        }
        j jVar = this.f46959c0;
        N(jVar.f47008k, jVar.f47009l, z11);
    }

    @Override
    public final void C(int i10, int i11) {
        ArrayList arrayList;
        RectF rectF = this.J1;
        if (this.f46961d0 == null || this.H1) {
            return;
        }
        RectF rectF2 = this.D0;
        float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + AndroidUtilities.dp(16.0f)) - i11, rectF2.centerX() - i10)) - 90.0d);
        float f10 = 0.0f;
        if (degrees < 0.0f) {
            degrees = (float) (((double) degrees) + 360.0d);
        }
        float f11 = degrees / 360.0f;
        int i12 = 0;
        float f12 = 0.0f;
        while (true) {
            arrayList = this.d;
            if (i12 >= arrayList.size()) {
                i12 = -1;
                f12 = 0.0f;
                break;
            }
            if (((o) arrayList.get(i12)).f48206n || ((o) arrayList.get(i12)).f48207o != 0.0f) {
                if (f11 > f12) {
                    float f13 = this.F1[i12] + f12;
                    if (f11 < f13) {
                        f10 = f13;
                        break;
                    }
                }
                f12 += this.F1[i12];
            }
            i12++;
        }
        if (this.I1 != i12 && i12 >= 0) {
            this.I1 = i12;
            invalidate();
            this.O1.setVisibility(0);
            tf.f fVar = (tf.f) arrayList.get(i12);
            tf.g gVar = this.O1;
            String str = fVar.f48195a.d;
            int i13 = (int) this.E1[this.I1];
            int i14 = fVar.f48205m;
            gVar.I.setText(str);
            TextView textView = gVar.J;
            textView.setText(Integer.toString(i13));
            textView.setTextColor(i14);
            this.O1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            double dWidth = rectF.width() / 2.0f;
            double d = (f10 * 360.0f) - 90.0f;
            double d10 = (f12 * 360.0f) - 90.0f;
            int iMin = (int) Math.min(((double) rectF.centerX()) + (Math.cos(Math.toRadians(d)) * dWidth), ((double) rectF.centerX()) + (Math.cos(Math.toRadians(d10)) * dWidth));
            int measuredWidth = iMin >= 0 ? iMin : 0;
            if (this.O1.getMeasuredWidth() + measuredWidth > getMeasuredWidth() - AndroidUtilities.dp(16.0f)) {
                measuredWidth -= (this.O1.getMeasuredWidth() + measuredWidth) - (getMeasuredWidth() - AndroidUtilities.dp(16.0f));
            }
            int iMin2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(d10)) * dWidth) + ((double) rectF.centerY()), (Math.sin(Math.toRadians(d)) * dWidth) + ((double) rectF.centerY())))) - AndroidUtilities.dp(50.0f);
            this.O1.setTranslationX(measuredWidth);
            this.O1.setTranslationY(iMin2);
            AndroidUtilities.vibrateCursor(this);
        }
        x((this.C0 * this.f46959c0.f47008k) - g.f46934g1);
    }

    @Override
    public final boolean D(sf.b bVar) {
        sf.e eVar = (sf.e) bVar;
        boolean zD = super.D(eVar);
        if (eVar != null) {
            this.E1 = new float[eVar.d.size()];
            this.F1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return zD;
    }

    @Override
    public final void J(sf.b bVar, long j10) {
        int length = bVar.f47881a.length;
        long j11 = j10 - (j10 % 86400000);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (j11 >= bVar.f47881a[i11]) {
                i10 = i11;
            }
        }
        float length2 = bVar.f47882b.length < 2 ? 0.5f : 1.0f / bVar.f47881a.length;
        j jVar = this.f46959c0;
        if (i10 == 0) {
            jVar.f47008k = 0.0f;
            jVar.f47009l = length2;
            return;
        }
        if (i10 >= bVar.f47881a.length - 1) {
            jVar.f47008k = 1.0f - length2;
            jVar.f47009l = 1.0f;
            return;
        }
        float f10 = i10 * length2;
        jVar.f47008k = f10;
        float f11 = f10 + length2;
        jVar.f47009l = f11;
        if (f11 > 1.0f) {
            jVar.f47009l = 1.0f;
        }
        A(true, true, false);
    }

    @Override
    public final tf.i h(sf.a aVar) {
        return new o(aVar);
    }

    public final void N(float f10, float f11, boolean z10) {
        if (this.E1 == null) {
            return;
        }
        int length = ((sf.e) this.f46961d0).f47882b.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            float f12 = ((sf.e) this.f46961d0).f47882b[i13];
            if (f12 >= f10 && i12 == -1) {
                i12 = i13;
            }
            if (f12 <= f11) {
                i11 = i13;
            }
        }
        if (i11 < i12) {
            i12 = i11;
        }
        if (!z10 && this.S1 == i11 && this.R1 == i12) {
            return;
        }
        this.S1 = i11;
        this.R1 = i12;
        this.H1 = true;
        this.G1 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            this.E1[i14] = 0.0f;
        }
        while (i12 <= i11) {
            for (int i15 = 0; i15 < size; i15++) {
                float[] fArr = this.E1;
                fArr[i15] = fArr[i15] + ((sf.a) ((sf.e) this.f46961d0).d.get(i15)).f47874a[i12];
                this.G1 += ((sf.a) ((sf.e) this.f46961d0).d.get(i15)).f47874a[i12];
                if (this.H1 && ((o) arrayList.get(i15)).f48206n && ((sf.a) ((sf.e) this.f46961d0).d.get(i15)).f47874a[i12] > 0) {
                    this.H1 = false;
                }
            }
            i12++;
        }
        if (z10) {
            while (i10 < size) {
                if (this.G1 == 0.0f) {
                    ((o) arrayList.get(i10)).f47013r = 0.0f;
                } else {
                    ((o) arrayList.get(i10)).f47013r = this.E1[i10] / this.G1;
                }
                i10++;
            }
            return;
        }
        while (i10 < size) {
            o oVar = (o) arrayList.get(i10);
            ValueAnimator valueAnimator = oVar.f47014s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f13 = this.G1;
            ValueAnimator valueAnimatorE = g.e(oVar.f47013r, f13 == 0.0f ? 0.0f : this.E1[i10] / f13, new t2(26, this, oVar));
            oVar.f47014s = valueAnimatorE;
            valueAnimatorE.start();
            i10++;
        }
    }

    @Override
    public final void a(float f10, float f11, boolean z10) {
        if (this.f46961d0 == null) {
            return;
        }
        if (z10) {
            N(f10, f11, false);
        } else {
            H();
            invalidate();
        }
    }

    @Override
    public final tf.e g() {
        tf.g gVar = new tf.g(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(gVar.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(gVar.getContext());
        gVar.I = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = AndroidUtilities.dp(96.0f);
        TextView textView2 = new TextView(gVar.getContext());
        gVar.J = textView2;
        linearLayout.addView(textView2);
        gVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        gVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        gVar.f48188f.setVisibility(8);
        gVar.B = false;
        this.O1 = gVar;
        return gVar;
    }

    @Override
    public final tf.f h(sf.a aVar) {
        return new o(aVar);
    }

    @Override
    public final void k(Canvas canvas) {
        int i10;
        u1.a aVar;
        float f10;
        float f11;
        TextPaint textPaint;
        float f12;
        int i11;
        float f13;
        TextPaint textPaint2 = this.K1;
        RectF rectF = this.J1;
        if (this.f46961d0 == null) {
            return;
        }
        if (canvas != null) {
            canvas.save();
        }
        if (this.f46985u0 == 1) {
            float f14 = this.f46986v0.f48216f;
            i10 = (int) (f14 * f14 * 255.0f);
        } else {
            i10 = 255;
        }
        if (this.H1) {
            float f15 = this.P1;
            if (f15 != 0.0f) {
                float f16 = f15 - 0.12f;
                this.P1 = f16;
                if (f16 < 0.0f) {
                    this.P1 = 0.0f;
                }
                invalidate();
            }
        } else {
            float f17 = this.P1;
            if (f17 != 1.0f) {
                float f18 = f17 + 0.12f;
                this.P1 = f18;
                if (f18 > 1.0f) {
                    this.P1 = 1.0f;
                }
                invalidate();
            }
        }
        float f19 = this.P1;
        int i12 = (int) (i10 * f19);
        float f20 = (f19 * 0.6f) + 0.4f;
        RectF rectF2 = this.D0;
        if (canvas != null) {
            canvas.scale(f20, f20, rectF2.centerX(), rectF2.centerY());
        }
        float fHeight = (int) ((rectF2.width() > rectF2.height() ? rectF2.height() : rectF2.width()) * 0.45f);
        rectF.set(rectF2.centerX() - fHeight, (rectF2.centerY() + AndroidUtilities.dp(16.0f)) - fHeight, rectF2.centerX() + fHeight, rectF2.centerY() + AndroidUtilities.dp(16.0f) + fHeight);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        float f21 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            f21 = (((o) arrayList.get(i13)).f47013r * ((o) arrayList.get(i13)).f48207o) + f21;
        }
        if (f21 == 0.0f) {
            if (canvas != null) {
                canvas.restore();
                return;
            }
            return;
        }
        int i14 = 0;
        float f22 = -90.0f;
        while (true) {
            aVar = g.f46951y1;
            f10 = 2.0f;
            if (i14 >= size) {
                break;
            }
            if (((o) arrayList.get(i14)).f48207o > 0.0f || ((o) arrayList.get(i14)).f48206n) {
                ((o) arrayList.get(i14)).f48197c.setAlpha(i12);
                float f23 = (((o) arrayList.get(i14)).f47013r / f21) * ((o) arrayList.get(i14)).f48207o;
                this.F1[i14] = f23;
                if (f23 == 0.0f) {
                    i11 = i14;
                } else {
                    if (canvas != null) {
                        canvas.save();
                    }
                    double dC = s3.c.c(f23, 2.0f, 360.0f, f22);
                    if (((o) arrayList.get(i14)).f47012q > 0.0f) {
                        float interpolation = aVar.getInterpolation(((o) arrayList.get(i14)).f47012q);
                        if (canvas != null) {
                            double d = interpolation;
                            canvas.translate((float) (Math.cos(Math.toRadians(dC)) * ((double) AndroidUtilities.dp(8.0f)) * d), (float) (Math.sin(Math.toRadians(dC)) * ((double) AndroidUtilities.dp(8.0f)) * d));
                        }
                    }
                    ((o) arrayList.get(i14)).f48197c.setStyle(Paint.Style.FILL_AND_STROKE);
                    ((o) arrayList.get(i14)).f48197c.setStrokeWidth(1.0f);
                    ((o) arrayList.get(i14)).f48197c.setAntiAlias(!g.f46949w1);
                    if (canvas == null || this.f46985u0 == 1) {
                        i11 = i14;
                        f13 = f22;
                    } else {
                        Paint paint = ((o) arrayList.get(i14)).f48197c;
                        i11 = i14;
                        f13 = f22;
                        canvas.drawArc(rectF, f13, f23 * 360.0f, true, paint);
                        ((o) arrayList.get(i11)).f48197c.setStyle(Paint.Style.STROKE);
                        canvas.restore();
                    }
                    ((o) arrayList.get(i11)).f48197c.setAlpha(255);
                    f22 = (f23 * 360.0f) + f13;
                }
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
            i12 = i12;
        }
        int i15 = i12;
        if (canvas != null) {
            float f24 = -90.0f;
            int i16 = 0;
            while (i16 < size) {
                if (((o) arrayList.get(i16)).f48207o > 0.0f || ((o) arrayList.get(i16)).f48206n) {
                    float f25 = (((o) arrayList.get(i16)).f47013r * ((o) arrayList.get(i16)).f48207o) / f21;
                    canvas.save();
                    double dC2 = s3.c.c(f25, f10, 360.0f, f24);
                    if (((o) arrayList.get(i16)).f47012q > 0.0f) {
                        f11 = 2.0f;
                        double interpolation2 = aVar.getInterpolation(((o) arrayList.get(i16)).f47012q);
                        canvas.translate((float) (Math.cos(Math.toRadians(dC2)) * ((double) AndroidUtilities.dp(8.0f)) * interpolation2), (float) (Math.sin(Math.toRadians(dC2)) * ((double) AndroidUtilities.dp(8.0f)) * interpolation2));
                    } else {
                        f11 = 2.0f;
                    }
                    int i17 = (int) (100.0f * f25);
                    if (f25 < 0.02f || i17 <= 0 || i17 > 100) {
                        textPaint = textPaint2;
                    } else {
                        float fSqrt = (float) (Math.sqrt(1.0f - f25) * ((double) (rectF.width() * 0.42f)));
                        textPaint = textPaint2;
                        textPaint.setTextSize((this.M1 * f25) + this.L1);
                        textPaint.setAlpha((int) (i15 * ((o) arrayList.get(i16)).f48207o));
                        double d10 = fSqrt;
                        canvas.drawText(this.N1[i17], (float) ((Math.cos(Math.toRadians(dC2)) * d10) + ((double) rectF.centerX())), ((float) ((Math.sin(Math.toRadians(dC2)) * d10) + ((double) rectF.centerY()))) - ((textPaint.ascent() + textPaint.descent()) / f11), textPaint);
                    }
                    canvas.restore();
                    ((o) arrayList.get(i16)).f48197c.setAlpha(255);
                    f12 = (f25 * 360.0f) + f24;
                } else {
                    rectF = rectF;
                    f12 = f24;
                    textPaint = textPaint2;
                }
                i16++;
                f24 = f12;
                textPaint2 = textPaint;
                rectF = rectF;
                f10 = 2.0f;
            }
            canvas.restore();
        }
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i10;
        n nVar = this;
        sf.b bVar = nVar.f46961d0;
        if (bVar != null) {
            int length = ((sf.e) bVar).f47882b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((tf.f) arrayList.get(i11)).f48202j = 0;
            }
            float length2 = (1.0f / ((sf.e) nVar.f46961d0).f47882b.length) * nVar.f46992y0;
            int i12 = 0;
            while (i12 < length) {
                float fZ = com.google.android.recaptcha.internal.a.z(nVar.f46992y0, length2, ((sf.e) nVar.f46961d0).f47882b[i12], length2 / 2.0f);
                int i13 = 1;
                int i14 = 0;
                float f13 = 0.0f;
                int i15 = 0;
                boolean z10 = true;
                while (i14 < size) {
                    tf.f fVar = (tf.f) arrayList.get(i14);
                    boolean z11 = fVar.f48206n;
                    if (z11 || fVar.f48207o != 0.0f) {
                        i10 = i12;
                        float f14 = fVar.f48195a.f47874a[i10] * fVar.f48207o;
                        f13 += f14;
                        if (f14 > 0.0f) {
                            i15++;
                            if (z11) {
                                z10 = false;
                            }
                        }
                    } else {
                        i10 = i12;
                    }
                    i14++;
                    i12 = i10;
                }
                int i16 = i12;
                int i17 = 0;
                float f15 = 0.0f;
                while (i17 < size) {
                    tf.f fVar2 = (tf.f) arrayList.get(i17);
                    if (fVar2.f48206n || fVar2.f48207o != 0.0f) {
                        long[] jArr = fVar2.f48195a.f47874a;
                        if (i15 == i13) {
                            if (jArr[i16] == 0) {
                                f12 = 0.0f;
                            } else {
                                f12 = fVar2.f48207o;
                            }
                        } else if (f13 == 0.0f) {
                            f12 = 0.0f;
                        } else {
                            if (z10) {
                                float f16 = jArr[i16] / f13;
                                f11 = fVar2.f48207o;
                                f10 = f16 * f11;
                            } else {
                                f10 = jArr[i16] / f13;
                                f11 = fVar2.f48207o;
                            }
                            f12 = f10 * f11;
                        }
                        int i18 = nVar.f46990x0;
                        float f17 = f12 * i18;
                        float[] fArr = fVar2.f48203k;
                        int i19 = fVar2.f48202j;
                        int i20 = i19 + 1;
                        fVar2.f48202j = i20;
                        fArr[i19] = fZ;
                        int i21 = i19 + 2;
                        fVar2.f48202j = i21;
                        fArr[i20] = (i18 - f17) - f15;
                        int i22 = i19 + 3;
                        fVar2.f48202j = i22;
                        fArr[i21] = fZ;
                        fVar2.f48202j = i19 + 4;
                        fArr[i22] = i18 - f15;
                        f15 += f17;
                    }
                    i17++;
                    i13 = 1;
                    nVar = this;
                }
                i12 = i16 + 1;
                nVar = this;
            }
            for (int i23 = 0; i23 < size; i23++) {
                tf.f fVar3 = (tf.f) arrayList.get(i23);
                Paint paint = fVar3.f48197c;
                Paint paint2 = fVar3.f48197c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.f48203k, 0, fVar3.f48202j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46961d0 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (i10 == this.I1) {
                    if (((o) arrayList.get(i10)).f47012q < 1.0f) {
                        ((o) arrayList.get(i10)).f47012q += 0.1f;
                        if (((o) arrayList.get(i10)).f47012q > 1.0f) {
                            ((o) arrayList.get(i10)).f47012q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i10)).f47012q > 0.0f) {
                    ((o) arrayList.get(i10)).f47012q -= 0.1f;
                    if (((o) arrayList.get(i10)).f47012q < 0.0f) {
                        ((o) arrayList.get(i10)).f47012q = 0.0f;
                    }
                    invalidate();
                }
                i10++;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != this.Q1) {
            this.Q1 = getMeasuredWidth();
            RectF rectF = this.D0;
            int iHeight = (int) ((rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f);
            this.L1 = iHeight / 13;
            this.M1 = iHeight / 7;
        }
    }

    @Override
    public final void q(tf.j jVar) {
        k(null);
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            float[] fArr = this.F1;
            if (i10 >= fArr.length) {
                return;
            }
            f10 += fArr[i10];
            jVar.f48220k[i10] = (360.0f * f10) - 180.0f;
            i10++;
        }
    }

    @Override
    public final void y() {
        this.I1 = -1;
        this.O1.setVisibility(8);
        invalidate();
    }

    @Override
    public final void i(Canvas canvas) {
    }

    @Override
    public final void j(Canvas canvas) {
    }

    @Override
    public final void o(Canvas canvas) {
    }

    @Override
    public final void l(Canvas canvas, tf.d dVar) {
    }

    @Override
    public final void p(Canvas canvas, tf.d dVar) {
    }
}
