package qf;

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
    public sf.g O1;
    public float P1;
    public int Q1;
    public int R1;
    public int S1;

    @Override
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        rf.b bVar = this.f46202d0;
        if (bVar != null && ((rf.e) bVar).f47161b != null) {
            j jVar = this.f46200c0;
            N(jVar.f46249k, jVar.f46250l, z11);
        }
    }

    @Override
    public final void C(int i9, int i10) {
        ArrayList arrayList;
        double d;
        double d9;
        RectF rectF = this.J1;
        if (this.f46202d0 != null && !this.H1) {
            RectF rectF2 = this.D0;
            float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + AndroidUtilities.dp(16.0f)) - i10, rectF2.centerX() - i9)) - 90.0d);
            float f10 = 0.0f;
            if (degrees < 0.0f) {
                degrees = (float) (degrees + 360.0d);
            }
            float f11 = degrees / 360.0f;
            int i11 = 0;
            int i12 = 0;
            float f12 = 0.0f;
            while (true) {
                arrayList = this.d;
                if (i12 < arrayList.size()) {
                    if (((o) arrayList.get(i12)).f47557n || ((o) arrayList.get(i12)).f47558o != 0.0f) {
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
                } else {
                    i12 = -1;
                    f12 = 0.0f;
                    break;
                }
            }
            if (this.I1 != i12 && i12 >= 0) {
                this.I1 = i12;
                invalidate();
                this.O1.setVisibility(0);
                sf.f fVar = (sf.f) arrayList.get(i12);
                sf.g gVar = this.O1;
                String str = fVar.f47546a.d;
                int i13 = fVar.f47556m;
                gVar.I.setText(str);
                TextView textView = gVar.J;
                textView.setText(Integer.toString((int) this.E1[this.I1]));
                textView.setTextColor(i13);
                this.O1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                double width = rectF.width() / 2.0f;
                int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f10 * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f12 * 360.0f) - 90.0f)) * width));
                if (min >= 0) {
                    i11 = min;
                }
                if (this.O1.getMeasuredWidth() + i11 > getMeasuredWidth() - AndroidUtilities.dp(16.0f)) {
                    i11 -= (this.O1.getMeasuredWidth() + i11) - (getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                }
                int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(d9)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(d)) * width) + rectF.centerY()))) - AndroidUtilities.dp(50.0f);
                this.O1.setTranslationX(i11);
                this.O1.setTranslationY(min2);
                AndroidUtilities.vibrateCursor(this);
            }
            x((this.C0 * this.f46200c0.f46249k) - g.f46175g1);
        }
    }

    @Override
    public final boolean D(rf.b bVar) {
        rf.e eVar = (rf.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.E1 = new float[eVar.d.size()];
            this.F1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override
    public final void J(rf.b bVar, long j10) {
        float length;
        int length2 = bVar.f47160a.length;
        long j11 = j10 - (j10 % 86400000);
        int i9 = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            if (j11 >= bVar.f47160a[i10]) {
                i9 = i10;
            }
        }
        if (bVar.f47161b.length < 2) {
            length = 0.5f;
        } else {
            length = 1.0f / bVar.f47160a.length;
        }
        j jVar = this.f46200c0;
        if (i9 == 0) {
            jVar.f46249k = 0.0f;
            jVar.f46250l = length;
        } else if (i9 >= bVar.f47160a.length - 1) {
            jVar.f46249k = 1.0f - length;
            jVar.f46250l = 1.0f;
        } else {
            float f10 = i9 * length;
            jVar.f46249k = f10;
            float f11 = f10 + length;
            jVar.f46250l = f11;
            if (f11 > 1.0f) {
                jVar.f46250l = 1.0f;
            }
            A(true, true, false);
        }
    }

    @Override
    public final sf.i L(rf.a aVar) {
        return new sf.i(aVar);
    }

    public final void N(float f10, float f11, boolean z10) {
        float f12;
        if (this.E1 != null) {
            int length = ((rf.e) this.f46202d0).f47161b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i9 = 0;
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < length; i12++) {
                float f13 = ((rf.e) this.f46202d0).f47161b[i12];
                if (f13 >= f10 && i11 == -1) {
                    i11 = i12;
                }
                if (f13 <= f11) {
                    i10 = i12;
                }
            }
            if (i10 < i11) {
                i11 = i10;
            }
            if (z10 || this.S1 != i10 || this.R1 != i11) {
                this.S1 = i10;
                this.R1 = i11;
                this.H1 = true;
                this.G1 = 0.0f;
                for (int i13 = 0; i13 < size; i13++) {
                    this.E1[i13] = 0.0f;
                }
                while (i11 <= i10) {
                    for (int i14 = 0; i14 < size; i14++) {
                        float[] fArr = this.E1;
                        fArr[i14] = fArr[i14] + ((float) ((rf.a) ((rf.e) this.f46202d0).d.get(i14)).f47153a[i11]);
                        this.G1 += (float) ((rf.a) ((rf.e) this.f46202d0).d.get(i14)).f47153a[i11];
                        if (this.H1 && ((o) arrayList.get(i14)).f47557n && ((rf.a) ((rf.e) this.f46202d0).d.get(i14)).f47153a[i11] > 0) {
                            this.H1 = false;
                        }
                    }
                    i11++;
                }
                if (!z10) {
                    while (i9 < size) {
                        o oVar = (o) arrayList.get(i9);
                        ValueAnimator valueAnimator = oVar.f46255s;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f14 = this.G1;
                        if (f14 == 0.0f) {
                            f12 = 0.0f;
                        } else {
                            f12 = this.E1[i9] / f14;
                        }
                        ValueAnimator e10 = g.e(oVar.f46254r, f12, new f2.g(25, this, oVar));
                        oVar.f46255s = e10;
                        e10.start();
                        i9++;
                    }
                    return;
                }
                while (i9 < size) {
                    if (this.G1 == 0.0f) {
                        ((o) arrayList.get(i9)).f46254r = 0.0f;
                    } else {
                        ((o) arrayList.get(i9)).f46254r = this.E1[i9] / this.G1;
                    }
                    i9++;
                }
            }
        }
    }

    @Override
    public final void a(float f10, float f11, boolean z10) {
        if (this.f46202d0 == null) {
            return;
        }
        if (z10) {
            N(f10, f11, false);
            return;
        }
        H();
        invalidate();
    }

    @Override
    public final sf.e g() {
        ?? eVar = new sf.e(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(eVar.getContext());
        eVar.I = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = AndroidUtilities.dp(96.0f);
        TextView textView2 = new TextView(eVar.getContext());
        eVar.J = textView2;
        linearLayout.addView(textView2);
        eVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        eVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        eVar.f47539f.setVisibility(8);
        eVar.B = false;
        this.O1 = eVar;
        return eVar;
    }

    @Override
    public final sf.f h(rf.a aVar) {
        return new sf.i(aVar);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: qf.n.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i9;
        n nVar = this;
        rf.b bVar = nVar.f46202d0;
        if (bVar != null) {
            int length = ((rf.e) bVar).f47161b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((sf.f) arrayList.get(i10)).f47553j = 0;
            }
            float length2 = (1.0f / ((rf.e) nVar.f46202d0).f47161b.length) * nVar.f46233y0;
            int i11 = 0;
            while (i11 < length) {
                float f13 = ((rf.e) nVar.f46202d0).f47161b[i11];
                float z10 = e2.c.z(nVar.f46233y0, length2, f13, length2 / 2.0f);
                int i12 = 1;
                int i13 = 0;
                float f14 = 0.0f;
                int i14 = 0;
                boolean z11 = true;
                while (i13 < size) {
                    sf.f fVar = (sf.f) arrayList.get(i13);
                    boolean z12 = fVar.f47557n;
                    if (!z12 && fVar.f47558o == 0.0f) {
                        i9 = i11;
                    } else {
                        i9 = i11;
                        float f15 = ((float) fVar.f47546a.f47153a[i9]) * fVar.f47558o;
                        f14 += f15;
                        if (f15 > 0.0f) {
                            i14++;
                            if (z12) {
                                z11 = false;
                            }
                        }
                    }
                    i13++;
                    i11 = i9;
                }
                int i15 = i11;
                int i16 = 0;
                float f16 = 0.0f;
                while (i16 < size) {
                    sf.f fVar2 = (sf.f) arrayList.get(i16);
                    if (fVar2.f47557n || fVar2.f47558o != 0.0f) {
                        long[] jArr = fVar2.f47546a.f47153a;
                        if (i14 == i12) {
                            if (jArr[i15] != 0) {
                                f12 = fVar2.f47558o;
                                int i17 = nVar.f46231x0;
                                float f17 = f12 * i17;
                                float[] fArr = fVar2.f47554k;
                                int i18 = fVar2.f47553j;
                                int i19 = i18 + 1;
                                fVar2.f47553j = i19;
                                fArr[i18] = z10;
                                int i20 = i18 + 2;
                                fVar2.f47553j = i20;
                                fArr[i19] = (i17 - f17) - f16;
                                int i21 = i18 + 3;
                                fVar2.f47553j = i21;
                                fArr[i20] = z10;
                                fVar2.f47553j = i18 + 4;
                                fArr[i21] = i17 - f16;
                                f16 += f17;
                            }
                            f12 = 0.0f;
                            int i172 = nVar.f46231x0;
                            float f172 = f12 * i172;
                            float[] fArr2 = fVar2.f47554k;
                            int i182 = fVar2.f47553j;
                            int i192 = i182 + 1;
                            fVar2.f47553j = i192;
                            fArr2[i182] = z10;
                            int i202 = i182 + 2;
                            fVar2.f47553j = i202;
                            fArr2[i192] = (i172 - f172) - f16;
                            int i212 = i182 + 3;
                            fVar2.f47553j = i212;
                            fArr2[i202] = z10;
                            fVar2.f47553j = i182 + 4;
                            fArr2[i212] = i172 - f16;
                            f16 += f172;
                        } else {
                            if (f14 != 0.0f) {
                                if (z11) {
                                    f11 = fVar2.f47558o;
                                    f10 = (((float) jArr[i15]) / f14) * f11;
                                } else {
                                    f10 = ((float) jArr[i15]) / f14;
                                    f11 = fVar2.f47558o;
                                }
                                f12 = f10 * f11;
                                int i1722 = nVar.f46231x0;
                                float f1722 = f12 * i1722;
                                float[] fArr22 = fVar2.f47554k;
                                int i1822 = fVar2.f47553j;
                                int i1922 = i1822 + 1;
                                fVar2.f47553j = i1922;
                                fArr22[i1822] = z10;
                                int i2022 = i1822 + 2;
                                fVar2.f47553j = i2022;
                                fArr22[i1922] = (i1722 - f1722) - f16;
                                int i2122 = i1822 + 3;
                                fVar2.f47553j = i2122;
                                fArr22[i2022] = z10;
                                fVar2.f47553j = i1822 + 4;
                                fArr22[i2122] = i1722 - f16;
                                f16 += f1722;
                            }
                            f12 = 0.0f;
                            int i17222 = nVar.f46231x0;
                            float f17222 = f12 * i17222;
                            float[] fArr222 = fVar2.f47554k;
                            int i18222 = fVar2.f47553j;
                            int i19222 = i18222 + 1;
                            fVar2.f47553j = i19222;
                            fArr222[i18222] = z10;
                            int i20222 = i18222 + 2;
                            fVar2.f47553j = i20222;
                            fArr222[i19222] = (i17222 - f17222) - f16;
                            int i21222 = i18222 + 3;
                            fVar2.f47553j = i21222;
                            fArr222[i20222] = z10;
                            fVar2.f47553j = i18222 + 4;
                            fArr222[i21222] = i17222 - f16;
                            f16 += f17222;
                        }
                    }
                    i16++;
                    i12 = 1;
                    nVar = this;
                }
                i11 = i15 + 1;
                nVar = this;
            }
            for (int i22 = 0; i22 < size; i22++) {
                sf.f fVar3 = (sf.f) arrayList.get(i22);
                Paint paint = fVar3.f47548c;
                Paint paint2 = fVar3.f47548c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.f47554k, 0, fVar3.f47553j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46202d0 != null) {
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i9 >= arrayList.size()) {
                    break;
                }
                if (i9 == this.I1) {
                    if (((o) arrayList.get(i9)).f46253q < 1.0f) {
                        ((o) arrayList.get(i9)).f46253q += 0.1f;
                        if (((o) arrayList.get(i9)).f46253q > 1.0f) {
                            ((o) arrayList.get(i9)).f46253q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i9)).f46253q > 0.0f) {
                    ((o) arrayList.get(i9)).f46253q -= 0.1f;
                    if (((o) arrayList.get(i9)).f46253q < 0.0f) {
                        ((o) arrayList.get(i9)).f46253q = 0.0f;
                    }
                    invalidate();
                }
                i9++;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float width;
        super.onMeasure(i9, i10);
        if (getMeasuredWidth() != this.Q1) {
            this.Q1 = getMeasuredWidth();
            RectF rectF = this.D0;
            if (rectF.width() > rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            int i11 = (int) (width * 0.45f);
            this.L1 = i11 / 13;
            this.M1 = i11 / 7;
        }
    }

    @Override
    public final void q(sf.j jVar) {
        k(null);
        float f10 = 0.0f;
        int i9 = 0;
        while (true) {
            float[] fArr = this.F1;
            if (i9 < fArr.length) {
                f10 += fArr[i9];
                jVar.f47571k[i9] = (360.0f * f10) - 180.0f;
                i9++;
            } else {
                return;
            }
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
    public final void l(Canvas canvas, sf.d dVar) {
    }

    @Override
    public final void p(Canvas canvas, sf.d dVar) {
    }
}
