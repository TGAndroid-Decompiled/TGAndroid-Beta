package wf;

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
    public float[] F1;
    public float[] G1;
    public float H1;
    public boolean I1;
    public int J1;
    public RectF K1;
    public TextPaint L1;
    public float M1;
    public float N1;
    public String[] O1;
    public yf.g P1;
    public float Q1;
    public int R1;
    public int S1;
    public int T1;

    @Override
    public final void A(boolean z4, boolean z10, boolean z11) {
        super.A(z4, z10, z11);
        xf.b bVar = this.f49590e0;
        if (bVar != null && ((xf.e) bVar).f50584b != null) {
            j jVar = this.f49587d0;
            N(jVar.f49635k, jVar.f49636l, z10);
        }
    }

    @Override
    public final void C(int i10, int i11) {
        ArrayList arrayList;
        double d;
        double d10;
        RectF rectF = this.K1;
        if (this.f49590e0 != null && !this.I1) {
            RectF rectF2 = this.E0;
            float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + AndroidUtilities.dp(16.0f)) - i11, rectF2.centerX() - i10)) - 90.0d);
            float f10 = 0.0f;
            if (degrees < 0.0f) {
                degrees = (float) (degrees + 360.0d);
            }
            float f11 = degrees / 360.0f;
            int i12 = 0;
            int i13 = 0;
            float f12 = 0.0f;
            while (true) {
                arrayList = this.d;
                if (i13 < arrayList.size()) {
                    if (((o) arrayList.get(i13)).f50969n || ((o) arrayList.get(i13)).f50970o != 0.0f) {
                        if (f11 > f12) {
                            float f13 = this.G1[i13] + f12;
                            if (f11 < f13) {
                                f10 = f13;
                                break;
                            }
                        }
                        f12 += this.G1[i13];
                    }
                    i13++;
                } else {
                    i13 = -1;
                    f12 = 0.0f;
                    break;
                }
            }
            if (this.J1 != i13 && i13 >= 0) {
                this.J1 = i13;
                invalidate();
                this.P1.setVisibility(0);
                yf.f fVar = (yf.f) arrayList.get(i13);
                yf.g gVar = this.P1;
                String str = fVar.f50958a.d;
                int i14 = fVar.f50968m;
                gVar.J.setText(str);
                TextView textView = gVar.K;
                textView.setText(Integer.toString((int) this.F1[this.J1]));
                textView.setTextColor(i14);
                this.P1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                double width = rectF.width() / 2.0f;
                int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f10 * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f12 * 360.0f) - 90.0f)) * width));
                if (min >= 0) {
                    i12 = min;
                }
                if (this.P1.getMeasuredWidth() + i12 > getMeasuredWidth() - AndroidUtilities.dp(16.0f)) {
                    i12 -= (this.P1.getMeasuredWidth() + i12) - (getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                }
                int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(d10)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(d)) * width) + rectF.centerY()))) - AndroidUtilities.dp(50.0f);
                this.P1.setTranslationX(i12);
                this.P1.setTranslationY(min2);
                AndroidUtilities.vibrateCursor(this);
            }
            x((this.D0 * this.f49587d0.f49635k) - g.f49560h1);
        }
    }

    @Override
    public final boolean D(xf.b bVar) {
        xf.e eVar = (xf.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.F1 = new float[eVar.d.size()];
            this.G1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override
    public final void J(xf.b bVar, long j10) {
        float length;
        int length2 = bVar.f50583a.length;
        long j11 = j10 - (j10 % 86400000);
        int i10 = 0;
        for (int i11 = 0; i11 < length2; i11++) {
            if (j11 >= bVar.f50583a[i11]) {
                i10 = i11;
            }
        }
        if (bVar.f50584b.length < 2) {
            length = 0.5f;
        } else {
            length = 1.0f / bVar.f50583a.length;
        }
        j jVar = this.f49587d0;
        if (i10 == 0) {
            jVar.f49635k = 0.0f;
            jVar.f49636l = length;
        } else if (i10 >= bVar.f50583a.length - 1) {
            jVar.f49635k = 1.0f - length;
            jVar.f49636l = 1.0f;
        } else {
            float f10 = i10 * length;
            jVar.f49635k = f10;
            float f11 = f10 + length;
            jVar.f49636l = f11;
            if (f11 > 1.0f) {
                jVar.f49636l = 1.0f;
            }
            A(true, true, false);
        }
    }

    @Override
    public final yf.i L(xf.a aVar) {
        return new yf.i(aVar);
    }

    public final void N(float f10, float f11, boolean z4) {
        float f12;
        if (this.F1 != null) {
            int length = ((xf.e) this.f49590e0).f50584b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < length; i13++) {
                float f13 = ((xf.e) this.f49590e0).f50584b[i13];
                if (f13 >= f10 && i12 == -1) {
                    i12 = i13;
                }
                if (f13 <= f11) {
                    i11 = i13;
                }
            }
            if (i11 < i12) {
                i12 = i11;
            }
            if (z4 || this.T1 != i11 || this.S1 != i12) {
                this.T1 = i11;
                this.S1 = i12;
                this.I1 = true;
                this.H1 = 0.0f;
                for (int i14 = 0; i14 < size; i14++) {
                    this.F1[i14] = 0.0f;
                }
                while (i12 <= i11) {
                    for (int i15 = 0; i15 < size; i15++) {
                        float[] fArr = this.F1;
                        fArr[i15] = fArr[i15] + ((float) ((xf.a) ((xf.e) this.f49590e0).d.get(i15)).f50576a[i12]);
                        this.H1 += (float) ((xf.a) ((xf.e) this.f49590e0).d.get(i15)).f50576a[i12];
                        if (this.I1 && ((o) arrayList.get(i15)).f50969n && ((xf.a) ((xf.e) this.f49590e0).d.get(i15)).f50576a[i12] > 0) {
                            this.I1 = false;
                        }
                    }
                    i12++;
                }
                if (!z4) {
                    while (i10 < size) {
                        o oVar = (o) arrayList.get(i10);
                        ValueAnimator valueAnimator = oVar.f49641s;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f14 = this.H1;
                        if (f14 == 0.0f) {
                            f12 = 0.0f;
                        } else {
                            f12 = this.F1[i10] / f14;
                        }
                        ValueAnimator e6 = g.e(oVar.f49640r, f12, new bg.a(28, this, oVar));
                        oVar.f49641s = e6;
                        e6.start();
                        i10++;
                    }
                    return;
                }
                while (i10 < size) {
                    if (this.H1 == 0.0f) {
                        ((o) arrayList.get(i10)).f49640r = 0.0f;
                    } else {
                        ((o) arrayList.get(i10)).f49640r = this.F1[i10] / this.H1;
                    }
                    i10++;
                }
            }
        }
    }

    @Override
    public final void a(float f10, float f11, boolean z4) {
        if (this.f49590e0 == null) {
            return;
        }
        if (z4) {
            N(f10, f11, false);
            return;
        }
        H();
        invalidate();
    }

    @Override
    public final yf.e g() {
        ?? eVar = new yf.e(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(eVar.getContext());
        eVar.J = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = AndroidUtilities.dp(96.0f);
        TextView textView2 = new TextView(eVar.getContext());
        eVar.K = textView2;
        linearLayout.addView(textView2);
        eVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        eVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        eVar.f50951f.setVisibility(8);
        eVar.C = false;
        this.P1 = eVar;
        return eVar;
    }

    @Override
    public final yf.f h(xf.a aVar) {
        return new yf.i(aVar);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: wf.n.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i10;
        n nVar = this;
        xf.b bVar = nVar.f49590e0;
        if (bVar != null) {
            int length = ((xf.e) bVar).f50584b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((yf.f) arrayList.get(i11)).f50965j = 0;
            }
            float length2 = (1.0f / ((xf.e) nVar.f49590e0).f50584b.length) * nVar.f49620z0;
            int i12 = 0;
            while (i12 < length) {
                float f13 = ((xf.e) nVar.f49590e0).f50584b[i12];
                float w10 = e2.c.w(nVar.f49620z0, length2, f13, length2 / 2.0f);
                int i13 = 1;
                int i14 = 0;
                float f14 = 0.0f;
                int i15 = 0;
                boolean z4 = true;
                while (i14 < size) {
                    yf.f fVar = (yf.f) arrayList.get(i14);
                    boolean z10 = fVar.f50969n;
                    if (!z10 && fVar.f50970o == 0.0f) {
                        i10 = i12;
                    } else {
                        i10 = i12;
                        float f15 = ((float) fVar.f50958a.f50576a[i10]) * fVar.f50970o;
                        f14 += f15;
                        if (f15 > 0.0f) {
                            i15++;
                            if (z10) {
                                z4 = false;
                            }
                        }
                    }
                    i14++;
                    i12 = i10;
                }
                int i16 = i12;
                int i17 = 0;
                float f16 = 0.0f;
                while (i17 < size) {
                    yf.f fVar2 = (yf.f) arrayList.get(i17);
                    if (fVar2.f50969n || fVar2.f50970o != 0.0f) {
                        long[] jArr = fVar2.f50958a.f50576a;
                        if (i15 == i13) {
                            if (jArr[i16] != 0) {
                                f12 = fVar2.f50970o;
                                int i18 = nVar.f49619y0;
                                float f17 = f12 * i18;
                                float[] fArr = fVar2.f50966k;
                                int i19 = fVar2.f50965j;
                                int i20 = i19 + 1;
                                fVar2.f50965j = i20;
                                fArr[i19] = w10;
                                int i21 = i19 + 2;
                                fVar2.f50965j = i21;
                                fArr[i20] = (i18 - f17) - f16;
                                int i22 = i19 + 3;
                                fVar2.f50965j = i22;
                                fArr[i21] = w10;
                                fVar2.f50965j = i19 + 4;
                                fArr[i22] = i18 - f16;
                                f16 += f17;
                            }
                            f12 = 0.0f;
                            int i182 = nVar.f49619y0;
                            float f172 = f12 * i182;
                            float[] fArr2 = fVar2.f50966k;
                            int i192 = fVar2.f50965j;
                            int i202 = i192 + 1;
                            fVar2.f50965j = i202;
                            fArr2[i192] = w10;
                            int i212 = i192 + 2;
                            fVar2.f50965j = i212;
                            fArr2[i202] = (i182 - f172) - f16;
                            int i222 = i192 + 3;
                            fVar2.f50965j = i222;
                            fArr2[i212] = w10;
                            fVar2.f50965j = i192 + 4;
                            fArr2[i222] = i182 - f16;
                            f16 += f172;
                        } else {
                            if (f14 != 0.0f) {
                                if (z4) {
                                    f11 = fVar2.f50970o;
                                    f10 = (((float) jArr[i16]) / f14) * f11;
                                } else {
                                    f10 = ((float) jArr[i16]) / f14;
                                    f11 = fVar2.f50970o;
                                }
                                f12 = f10 * f11;
                                int i1822 = nVar.f49619y0;
                                float f1722 = f12 * i1822;
                                float[] fArr22 = fVar2.f50966k;
                                int i1922 = fVar2.f50965j;
                                int i2022 = i1922 + 1;
                                fVar2.f50965j = i2022;
                                fArr22[i1922] = w10;
                                int i2122 = i1922 + 2;
                                fVar2.f50965j = i2122;
                                fArr22[i2022] = (i1822 - f1722) - f16;
                                int i2222 = i1922 + 3;
                                fVar2.f50965j = i2222;
                                fArr22[i2122] = w10;
                                fVar2.f50965j = i1922 + 4;
                                fArr22[i2222] = i1822 - f16;
                                f16 += f1722;
                            }
                            f12 = 0.0f;
                            int i18222 = nVar.f49619y0;
                            float f17222 = f12 * i18222;
                            float[] fArr222 = fVar2.f50966k;
                            int i19222 = fVar2.f50965j;
                            int i20222 = i19222 + 1;
                            fVar2.f50965j = i20222;
                            fArr222[i19222] = w10;
                            int i21222 = i19222 + 2;
                            fVar2.f50965j = i21222;
                            fArr222[i20222] = (i18222 - f17222) - f16;
                            int i22222 = i19222 + 3;
                            fVar2.f50965j = i22222;
                            fArr222[i21222] = w10;
                            fVar2.f50965j = i19222 + 4;
                            fArr222[i22222] = i18222 - f16;
                            f16 += f17222;
                        }
                    }
                    i17++;
                    i13 = 1;
                    nVar = this;
                }
                i12 = i16 + 1;
                nVar = this;
            }
            for (int i23 = 0; i23 < size; i23++) {
                yf.f fVar3 = (yf.f) arrayList.get(i23);
                Paint paint = fVar3.f50960c;
                Paint paint2 = fVar3.f50960c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.f50966k, 0, fVar3.f50965j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49590e0 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (i10 == this.J1) {
                    if (((o) arrayList.get(i10)).f49639q < 1.0f) {
                        ((o) arrayList.get(i10)).f49639q += 0.1f;
                        if (((o) arrayList.get(i10)).f49639q > 1.0f) {
                            ((o) arrayList.get(i10)).f49639q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i10)).f49639q > 0.0f) {
                    ((o) arrayList.get(i10)).f49639q -= 0.1f;
                    if (((o) arrayList.get(i10)).f49639q < 0.0f) {
                        ((o) arrayList.get(i10)).f49639q = 0.0f;
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
        float width;
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != this.R1) {
            this.R1 = getMeasuredWidth();
            RectF rectF = this.E0;
            if (rectF.width() > rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            int i12 = (int) (width * 0.45f);
            this.M1 = i12 / 13;
            this.N1 = i12 / 7;
        }
    }

    @Override
    public final void q(yf.j jVar) {
        k(null);
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            float[] fArr = this.G1;
            if (i10 < fArr.length) {
                f10 += fArr[i10];
                jVar.f50983k[i10] = (360.0f * f10) - 180.0f;
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void y() {
        this.J1 = -1;
        this.P1.setVisibility(8);
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
    public final void l(Canvas canvas, yf.d dVar) {
    }

    @Override
    public final void p(Canvas canvas, yf.d dVar) {
    }
}
