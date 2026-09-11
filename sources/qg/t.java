package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vl;
import org.telegram.ui.Components.pr;
public final class t extends View {
    public final Paint f44576a;
    public final int[] f44577b;
    public final Paint f44578c;
    public final LongSparseArray d;
    public long f44579e;
    public final Path f44580f;
    public final float[] h;
    public final HashMap f44581n;
    public final x f44582r;

    public t(x xVar, Context context) {
        super(context);
        int d;
        this.f44582r = xVar;
        this.f44576a = new Paint(1);
        this.f44577b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.f44578c = paint;
        this.d = new LongSparseArray();
        this.f44579e = Long.MIN_VALUE;
        this.f44580f = new Path();
        this.h = new float[8];
        this.f44581n = new HashMap();
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i10 = 0; i10 < 12; i10++) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (i11 == 0) {
                    this.f44581n.put(Long.valueOf((i10 << 16) + i11), Integer.valueOf(i0.a.d(i10 / 11.0f, -1, -16777216)));
                } else {
                    if (i11 < 6) {
                        d = i0.a.d(((5 - i11) / 4.0f) * 0.5f, this.f44577b[i10], -16777216);
                    } else {
                        d = i0.a.d(vl.c(9 - i11, 5.0f, 0.5f, 0.5f), this.f44577b[i10], -1);
                    }
                    this.f44581n.put(Long.valueOf((i10 << 16) + i11), Integer.valueOf(d));
                }
            }
        }
    }

    public final void a(int i10) {
        for (Map.Entry entry : this.f44581n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i10) {
                long longValue = ((Long) entry.getKey()).longValue();
                int i11 = (int) (longValue >> 16);
                b(i11, (int) (longValue - (i11 << 16)));
                return;
            }
        }
        this.f44579e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i10, int i11) {
        long j3 = (i10 << 16) + i11;
        this.f44579e = j3;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j3) == null) {
            longSparseArray.put(this.f44579e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int x10 = (int) ((motionEvent.getX() - getPaddingLeft()) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12));
        int y3 = (int) (motionEvent.getY() / (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10));
        Integer num = (Integer) this.f44581n.get(Long.valueOf((x10 << 16) + y3));
        if (num != null) {
            int intValue = num.intValue();
            int i10 = x.f44615s;
            this.f44582r.m(intValue, 3);
            b(x10, y3);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        HashMap hashMap;
        float max;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.f44582r.f44618e;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i11 = 0;
        while (true) {
            hashMap = this.f44581n;
            if (i11 >= 12) {
                break;
            }
            for (int i12 = 0; i12 < 10; i12++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i11 << 16) + i12));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.f44576a;
                    paint.setColor(intValue);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set((i11 * width) + getPaddingLeft(), (i12 * height) + getPaddingTop(), ((i11 + 1) * width) + getPaddingLeft(), ((i12 + 1) * height) + getPaddingTop());
                    canvas.drawRect(rectF2, paint);
                }
            }
            i11++;
        }
        canvas.restore();
        int i13 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.d;
            if (i13 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i13);
                float floatValue = ((Float) longSparseArray.valueAt(i13)).floatValue();
                if (this.f44579e == keyAt) {
                    max = Math.min(1.0f, floatValue + 0.045714285f);
                } else {
                    max = Math.max(0.0f, floatValue - 0.10666667f);
                }
                int i14 = (int) (keyAt >> 16);
                int i15 = (int) (keyAt - (i14 << 16));
                Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
                Paint paint2 = this.f44578c;
                if (num2 != null) {
                    if (AndroidUtilities.computePerceivedBrightness(num2.intValue()) > 0.721f) {
                        i10 = -15658735;
                    } else {
                        i10 = -1;
                    }
                    paint2.setColor(i10);
                }
                paint2.setStrokeWidth(pr.h.getInterpolation(max) * AndroidUtilities.dp(3.0f));
                Path path2 = this.f44580f;
                path2.rewind();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f13 = width;
                float f14 = height;
                HashMap hashMap2 = hashMap;
                rectF3.set((i14 * f13) + getPaddingLeft(), (i15 * f14) + getPaddingTop(), ((i14 + 1) * f13) + getPaddingLeft(), ((i15 + 1) * f14) + getPaddingTop());
                if (i14 == 0 && i15 == 0) {
                    f7 = AndroidUtilities.dp(10.0f);
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = this.h;
                fArr[1] = f7;
                fArr[0] = f7;
                if (i14 == 11 && i15 == 0) {
                    f10 = AndroidUtilities.dp(10.0f);
                } else {
                    f10 = 0.0f;
                }
                fArr[3] = f10;
                fArr[2] = f10;
                if (i14 == 11 && i15 == 9) {
                    f11 = AndroidUtilities.dp(10.0f);
                } else {
                    f11 = 0.0f;
                }
                fArr[5] = f11;
                fArr[4] = f11;
                if (i14 == 0 && i15 == 9) {
                    f12 = AndroidUtilities.dp(10.0f);
                } else {
                    f12 = 0.0f;
                }
                fArr[7] = f12;
                fArr[6] = f12;
                path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                canvas.drawPath(path2, paint2);
                if (max <= 0.0f && this.f44579e != keyAt) {
                    longSparseArray.removeAt(i13);
                    i13--;
                    invalidate();
                } else {
                    if (max < 1.0f) {
                        invalidate();
                    }
                    longSparseArray.setValueAt(i13, Float.valueOf(max));
                }
                i13++;
                width = f13;
                height = f14;
                hashMap = hashMap2;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: qg.t.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
