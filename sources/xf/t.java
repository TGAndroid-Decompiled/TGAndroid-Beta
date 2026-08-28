package xf;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
public final class t extends View {
    public final Paint f49368a;
    public final int[] f49369b;
    public final Paint f49370c;
    public final LongSparseArray d;
    public long f49371e;
    public final Path f49372f;
    public final float[] h;
    public final HashMap f49373n;
    public final x f49374r;

    public t(x xVar, Context context) {
        super(context);
        int d;
        this.f49374r = xVar;
        this.f49368a = new Paint(1);
        this.f49369b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.f49370c = paint;
        this.d = new LongSparseArray();
        this.f49371e = Long.MIN_VALUE;
        this.f49372f = new Path();
        this.h = new float[8];
        this.f49373n = new HashMap();
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i9 = 0; i9 < 12; i9++) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (i10 == 0) {
                    this.f49373n.put(Long.valueOf((i9 << 16) + i10), Integer.valueOf(i0.a.d(i9 / 11.0f, -1, -16777216)));
                } else {
                    if (i10 < 6) {
                        d = i0.a.d(((5 - i10) / 4.0f) * 0.5f, this.f49369b[i9], -16777216);
                    } else {
                        d = i0.a.d(ll.c(9 - i10, 5.0f, 0.5f, 0.5f), this.f49369b[i9], -1);
                    }
                    this.f49373n.put(Long.valueOf((i9 << 16) + i10), Integer.valueOf(d));
                }
            }
        }
    }

    public final void a(int i9) {
        for (Map.Entry entry : this.f49373n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i9) {
                long longValue = ((Long) entry.getKey()).longValue();
                int i10 = (int) (longValue >> 16);
                b(i10, (int) (longValue - (i10 << 16)));
                return;
            }
        }
        this.f49371e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i9, int i10) {
        long j10 = (i9 << 16) + i10;
        this.f49371e = j10;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j10) == null) {
            longSparseArray.put(this.f49371e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int x10 = (int) ((motionEvent.getX() - getPaddingLeft()) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12));
        int y10 = (int) (motionEvent.getY() / (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10));
        Integer num = (Integer) this.f49373n.get(Long.valueOf((x10 << 16) + y10));
        if (num != null) {
            int intValue = num.intValue();
            int i9 = x.f49407s;
            this.f49374r.m(intValue, 3);
            b(x10, y10);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        HashMap hashMap;
        float max;
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.f49374r.f49410e;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i10 = 0;
        while (true) {
            hashMap = this.f49373n;
            if (i10 >= 12) {
                break;
            }
            for (int i11 = 0; i11 < 10; i11++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i10 << 16) + i11));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.f49368a;
                    paint.setColor(intValue);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set((i10 * width) + getPaddingLeft(), (i11 * height) + getPaddingTop(), ((i10 + 1) * width) + getPaddingLeft(), ((i11 + 1) * height) + getPaddingTop());
                    canvas.drawRect(rectF2, paint);
                }
            }
            i10++;
        }
        canvas.restore();
        int i12 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.d;
            if (i12 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i12);
                float floatValue = ((Float) longSparseArray.valueAt(i12)).floatValue();
                if (this.f49371e == keyAt) {
                    max = Math.min(1.0f, floatValue + 0.045714285f);
                } else {
                    max = Math.max(0.0f, floatValue - 0.10666667f);
                }
                int i13 = (int) (keyAt >> 16);
                int i14 = (int) (keyAt - (i13 << 16));
                Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
                Paint paint2 = this.f49370c;
                if (num2 != null) {
                    if (AndroidUtilities.computePerceivedBrightness(num2.intValue()) > 0.721f) {
                        i9 = -15658735;
                    } else {
                        i9 = -1;
                    }
                    paint2.setColor(i9);
                }
                paint2.setStrokeWidth(gr.h.getInterpolation(max) * AndroidUtilities.dp(3.0f));
                Path path2 = this.f49372f;
                path2.rewind();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f14 = width;
                float f15 = height;
                HashMap hashMap2 = hashMap;
                rectF3.set((i13 * f14) + getPaddingLeft(), (i14 * f15) + getPaddingTop(), ((i13 + 1) * f14) + getPaddingLeft(), ((i14 + 1) * f15) + getPaddingTop());
                if (i13 == 0 && i14 == 0) {
                    f10 = AndroidUtilities.dp(10.0f);
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = this.h;
                fArr[1] = f10;
                fArr[0] = f10;
                if (i13 == 11 && i14 == 0) {
                    f11 = AndroidUtilities.dp(10.0f);
                } else {
                    f11 = 0.0f;
                }
                fArr[3] = f11;
                fArr[2] = f11;
                if (i13 == 11 && i14 == 9) {
                    f12 = AndroidUtilities.dp(10.0f);
                } else {
                    f12 = 0.0f;
                }
                fArr[5] = f12;
                fArr[4] = f12;
                if (i13 == 0 && i14 == 9) {
                    f13 = AndroidUtilities.dp(10.0f);
                } else {
                    f13 = 0.0f;
                }
                fArr[7] = f13;
                fArr[6] = f13;
                path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                canvas.drawPath(path2, paint2);
                if (max <= 0.0f && this.f49371e != keyAt) {
                    longSparseArray.removeAt(i12);
                    i12--;
                    invalidate();
                } else {
                    if (max < 1.0f) {
                        invalidate();
                    }
                    longSparseArray.setValueAt(i12, Float.valueOf(max));
                }
                i12++;
                width = f14;
                height = f15;
                hashMap = hashMap2;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: xf.t.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
