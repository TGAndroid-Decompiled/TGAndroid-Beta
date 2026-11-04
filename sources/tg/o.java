package tg;

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
import org.telegram.ui.Components.xq;
public final class o extends View {
    public final Paint f55269a;
    public final int[] f55270b;
    public final Paint f55271c;
    public final LongSparseArray d;
    public long f55272e;
    public final Path f55273f;
    public final float[] h;
    public final HashMap f55274n;
    public final q f55275r;

    public o(q qVar, Context context) {
        super(context);
        int f10;
        this.f55275r = qVar;
        this.f55269a = new Paint(1);
        this.f55270b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.f55271c = paint;
        this.d = new LongSparseArray();
        this.f55272e = Long.MIN_VALUE;
        this.f55273f = new Path();
        this.h = new float[8];
        this.f55274n = new HashMap();
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i3 = 0; i3 < 12; i3++) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (i10 == 0) {
                    this.f55274n.put(Long.valueOf((i3 << 16) + i10), Integer.valueOf(i0.a.f(i3 / 11.0f, -1, -16777216)));
                } else {
                    if (i10 < 6) {
                        f10 = i0.a.f(((5 - i10) / 4.0f) * 0.5f, this.f55270b[i3], -16777216);
                    } else {
                        f10 = i0.a.f(org.telegram.messenger.camera.q.v(9 - i10, 5.0f, 0.5f, 0.5f), this.f55270b[i3], -1);
                    }
                    this.f55274n.put(Long.valueOf((i3 << 16) + i10), Integer.valueOf(f10));
                }
            }
        }
    }

    public final void a(int i3) {
        for (Map.Entry entry : this.f55274n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i3) {
                long longValue = ((Long) entry.getKey()).longValue();
                int i10 = (int) (longValue >> 16);
                b(i10, (int) (longValue - (i10 << 16)));
                return;
            }
        }
        this.f55272e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i3, int i10) {
        long j10 = (i3 << 16) + i10;
        this.f55272e = j10;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j10) == null) {
            longSparseArray.put(this.f55272e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int x10 = (int) ((motionEvent.getX() - getPaddingLeft()) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12));
        int y9 = (int) (motionEvent.getY() / (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10));
        Integer num = (Integer) this.f55274n.get(Long.valueOf((x10 << 16) + y9));
        if (num != null) {
            int intValue = num.intValue();
            int i3 = q.f55285r1;
            this.f55275r.I0(intValue, 3);
            b(x10, y9);
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
        int i3;
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.f55275r.m1;
        path.rewind();
        float f14 = 10.0f;
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i10 = 0;
        while (true) {
            hashMap = this.f55274n;
            if (i10 >= 12) {
                break;
            }
            for (int i11 = 0; i11 < 10; i11++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i10 << 16) + i11));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.f55269a;
                    paint.setColor(intValue);
                    RectF rectF2 = org.telegram.messenger.g0.P;
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
                if (this.f55272e == keyAt) {
                    max = Math.min(1.0f, floatValue + 0.045714285f);
                } else {
                    max = Math.max(0.0f, floatValue - 0.10666667f);
                }
                float f15 = f14;
                int i13 = (int) (keyAt >> 16);
                int i14 = (int) (keyAt - (i13 << 16));
                Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
                Paint paint2 = this.f55271c;
                if (num2 != null) {
                    if (org.telegram.messenger.g0.B(num2.intValue()) > 0.721f) {
                        i3 = -15658735;
                    } else {
                        i3 = -1;
                    }
                    paint2.setColor(i3);
                }
                paint2.setStrokeWidth(xq.h.getInterpolation(max) * org.telegram.messenger.g0.L(3.0f));
                Path path2 = this.f55273f;
                path2.rewind();
                RectF rectF3 = org.telegram.messenger.g0.P;
                float f16 = width;
                float f17 = height;
                HashMap hashMap2 = hashMap;
                rectF3.set((i13 * f16) + getPaddingLeft(), (i14 * f17) + getPaddingTop(), ((i13 + 1) * f16) + getPaddingLeft(), ((i14 + 1) * f17) + getPaddingTop());
                if (i13 == 0 && i14 == 0) {
                    f10 = org.telegram.messenger.g0.L(f15);
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = this.h;
                fArr[1] = f10;
                fArr[0] = f10;
                if (i13 == 11 && i14 == 0) {
                    f11 = org.telegram.messenger.g0.L(f15);
                } else {
                    f11 = 0.0f;
                }
                fArr[3] = f11;
                fArr[2] = f11;
                if (i13 == 11 && i14 == 9) {
                    f12 = org.telegram.messenger.g0.L(f15);
                } else {
                    f12 = 0.0f;
                }
                fArr[5] = f12;
                fArr[4] = f12;
                if (i13 == 0 && i14 == 9) {
                    f13 = org.telegram.messenger.g0.L(f15);
                } else {
                    f13 = 0.0f;
                }
                fArr[7] = f13;
                fArr[6] = f13;
                path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                canvas.drawPath(path2, paint2);
                if (max <= 0.0f && this.f55272e != keyAt) {
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
                f14 = f15;
                width = f16;
                height = f17;
                hashMap = hashMap2;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: tg.o.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
