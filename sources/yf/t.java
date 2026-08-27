package yf;

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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;

public final class t extends View {

    public final Paint f50079a;

    public final int[] f50080b;

    public final Paint f50081c;
    public final LongSparseArray d;

    public long f50082e;

    public final Path f50083f;
    public final float[] h;

    public final HashMap f50084n;

    public final x f50085r;

    public t(x xVar, Context context) {
        super(context);
        this.f50085r = xVar;
        this.f50079a = new Paint(1);
        this.f50080b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.f50081c = paint;
        this.d = new LongSparseArray();
        this.f50082e = Long.MIN_VALUE;
        this.f50083f = new Path();
        this.h = new float[8];
        this.f50084n = new HashMap();
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i10 = 0; i10 < 12; i10++) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (i11 == 0) {
                    this.f50084n.put(Long.valueOf(((long) (i10 << 16)) + ((long) i11)), Integer.valueOf(i0.b.d(i10 / 11.0f, -1, -16777216)));
                } else {
                    this.f50084n.put(Long.valueOf(((long) (i10 << 16)) + ((long) i11)), Integer.valueOf(i11 < 6 ? i0.b.d(((5 - i11) / 4.0f) * 0.5f, this.f50080b[i10], -16777216) : i0.b.d(rl.c(9 - i11, 5.0f, 0.5f, 0.5f), this.f50080b[i10], -1)));
                }
            }
        }
    }

    public final void a(int i10) {
        for (Map.Entry entry : this.f50084n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i10) {
                long jLongValue = ((Long) entry.getKey()).longValue();
                int i11 = (int) (jLongValue >> 16);
                b(i11, (int) (jLongValue - ((long) (i11 << 16))));
                return;
            }
        }
        this.f50082e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i10, int i11) {
        long j10 = (((long) i10) << 16) + ((long) i11);
        this.f50082e = j10;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j10) == null) {
            longSparseArray.put(this.f50082e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12;
        int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10;
        int x8 = (int) ((motionEvent.getX() - getPaddingLeft()) / width);
        int y10 = (int) (motionEvent.getY() / height);
        Integer num = (Integer) this.f50084n.get(Long.valueOf((((long) x8) << 16) + ((long) y10)));
        if (num != null) {
            int iIntValue = num.intValue();
            int i10 = x.f50111s;
            this.f50085r.m(iIntValue, 3);
            b(x8, y10);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        HashMap map;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.f50085r.f50114e;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i10 = 0;
        while (true) {
            map = this.f50084n;
            if (i10 >= 12) {
                break;
            }
            for (int i11 = 0; i11 < 10; i11++) {
                Integer num = (Integer) map.get(Long.valueOf(((long) (i10 << 16)) + ((long) i11)));
                if (num != null) {
                    int iIntValue = num.intValue();
                    Paint paint = this.f50079a;
                    paint.setColor(iIntValue);
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
            if (i12 >= longSparseArray.size()) {
                return;
            }
            long jKeyAt = longSparseArray.keyAt(i12);
            float fFloatValue = ((Float) longSparseArray.valueAt(i12)).floatValue();
            float fMin = this.f50082e == jKeyAt ? Math.min(1.0f, fFloatValue + 0.045714285f) : Math.max(0.0f, fFloatValue - 0.10666667f);
            int i13 = (int) (jKeyAt >> 16);
            int i14 = (int) (jKeyAt - ((long) (i13 << 16)));
            Integer num2 = (Integer) map.get(Long.valueOf(jKeyAt));
            Paint paint2 = this.f50081c;
            if (num2 != null) {
                paint2.setColor(AndroidUtilities.computePerceivedBrightness(num2.intValue()) > 0.721f ? -15658735 : -1);
            }
            paint2.setStrokeWidth(er.h.getInterpolation(fMin) * AndroidUtilities.dp(3.0f));
            Path path2 = this.f50083f;
            path2.rewind();
            RectF rectF3 = AndroidUtilities.rectTmp;
            float f10 = width;
            float f11 = height;
            HashMap map2 = map;
            rectF3.set((i13 * f10) + getPaddingLeft(), (i14 * f11) + getPaddingTop(), ((i13 + 1) * f10) + getPaddingLeft(), ((i14 + 1) * f11) + getPaddingTop());
            float fDp = (i13 == 0 && i14 == 0) ? AndroidUtilities.dp(10.0f) : 0.0f;
            float[] fArr = this.h;
            fArr[1] = fDp;
            fArr[0] = fDp;
            float fDp2 = (i13 == 11 && i14 == 0) ? AndroidUtilities.dp(10.0f) : 0.0f;
            fArr[3] = fDp2;
            fArr[2] = fDp2;
            float fDp3 = (i13 == 11 && i14 == 9) ? AndroidUtilities.dp(10.0f) : 0.0f;
            fArr[5] = fDp3;
            fArr[4] = fDp3;
            float fDp4 = (i13 == 0 && i14 == 9) ? AndroidUtilities.dp(10.0f) : 0.0f;
            fArr[7] = fDp4;
            fArr[6] = fDp4;
            path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
            canvas.drawPath(path2, paint2);
            if (fMin > 0.0f || this.f50082e == jKeyAt) {
                if (fMin < 1.0f) {
                    invalidate();
                }
                longSparseArray.setValueAt(i12, Float.valueOf(fMin));
            } else {
                longSparseArray.removeAt(i12);
                i12--;
                invalidate();
            }
            i12++;
            width = f10;
            height = f11;
            map = map2;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c(motionEvent);
            } else if (actionMasked == 2) {
                c(motionEvent);
            } else if (actionMasked == 3) {
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            c(motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }
}
