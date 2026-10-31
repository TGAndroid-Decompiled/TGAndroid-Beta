package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.Base64;
import org.json.JSONArray;
import org.json.JSONObject;
public final class d {
    public static final PorterDuff.Mode[] f44320r = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
    public final Paint f44321a = new Paint(3);
    public final Paint f44322b = new Paint();
    public final Paint f44323c;
    public final Path d;
    public final Path e;
    public final Matrix f44324f;
    public final Matrix f44325g;
    public final float[] h;
    public final float[] f44326i;
    public final RectF f44327j;
    public final Rect f44328k;
    public final int f44329l;
    public Bitmap f44330m;
    public Bitmap f44331n;
    public Canvas f44332o;
    public int f44333p;
    public int f44334q;

    public d(int i10) {
        Paint paint = new Paint();
        this.f44323c = paint;
        this.d = new Path();
        this.e = new Path();
        this.f44324f = new Matrix();
        this.f44325g = new Matrix();
        this.h = new float[9];
        this.f44326i = new float[8];
        this.f44327j = new RectF();
        this.f44328k = new Rect();
        this.f44334q = -1;
        this.f44329l = i10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void b(int r3, android.graphics.Paint r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.d.b(int, android.graphics.Paint):void");
    }

    public final void a(Paint paint, JSONObject jSONObject) {
        int length;
        int optInt = jSONObject.optInt("pk");
        JSONArray optJSONArray = jSONObject.optJSONArray("s");
        if (optJSONArray == null) {
            length = 0;
        } else {
            length = optJSONArray.length() / 2;
        }
        if (optInt != 0 && length != 0) {
            int[] n10 = a0.n(optJSONArray);
            float[] o10 = a0.o(optJSONArray);
            float[] fArr = this.f44326i;
            a0.d(jSONObject.optJSONArray("pa"), fArr, 6, new float[0]);
            paint.setColor(-16777216);
            if (optInt == 1) {
                paint.setShader(new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], n10, o10, Shader.TileMode.CLAMP));
                return;
            } else if (optInt == 2) {
                float f7 = fArr[2];
                float max = Math.max(fArr[5], 0.01f);
                if (f7 > 0.0f && f7 < max) {
                    float[] fArr2 = new float[o10.length];
                    for (int i10 = 0; i10 < o10.length; i10++) {
                        float f10 = f7 / max;
                        fArr2[i10] = c3.i0.z(1.0f, f10, o10[i10], f10);
                    }
                    o10 = fArr2;
                }
                paint.setShader(new RadialGradient(fArr[3], fArr[4], max, n10, o10, Shader.TileMode.CLAMP));
                return;
            } else {
                SweepGradient sweepGradient = new SweepGradient(fArr[1], fArr[2], n10, o10);
                Matrix matrix = new Matrix();
                matrix.setRotate((float) Math.toDegrees(fArr[0]), fArr[1], fArr[2]);
                sweepGradient.setLocalMatrix(matrix);
                paint.setShader(sweepGradient);
                return;
            }
        }
        paint.setShader(null);
        paint.setColor((int) jSONObject.optLong("c"));
    }

    public final void c(android.graphics.Canvas r23, org.json.JSONObject r24, org.telegram.utils.twidget.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.d.c(android.graphics.Canvas, org.json.JSONObject, org.telegram.utils.twidget.c):void");
    }

    public final void d(JSONObject jSONObject, c cVar) {
        int[] iArr;
        int optInt = jSONObject.optInt("k");
        if (optInt == 0) {
            this.f44330m.eraseColor(0);
        } else if (optInt == 6) {
            int optInt2 = jSONObject.optInt("w");
            int optInt3 = jSONObject.optInt("h");
            try {
                byte[] decode = Base64.decode(jSONObject.optString("px"), 0);
                if (optInt2 > 0 && optInt3 > 0 && decode.length == optInt2 * optInt3 * 4) {
                    int optDouble = (int) jSONObject.optDouble("x");
                    int optDouble2 = (int) jSONObject.optDouble("y");
                    int max = Math.max(0, optDouble);
                    int max2 = Math.max(0, optDouble2);
                    int min = Math.min(this.f44330m.getWidth(), optDouble + optInt2);
                    int min2 = Math.min(this.f44330m.getHeight(), optInt3 + optDouble2);
                    if (min > max && min2 > max2) {
                        int i10 = min - max;
                        int i11 = min2 - max2;
                        int[] iArr2 = new int[i10 * i11];
                        for (int i12 = max2; i12 < min2; i12++) {
                            int i13 = max;
                            while (i13 < min) {
                                int i14 = ((i13 - optDouble) + ((i12 - optDouble2) * optInt2)) * 4;
                                iArr2[(i13 - max) + ((i12 - max2) * i10)] = Color.argb(decode[i14 + 3] & 255, decode[i14] & 255, decode[i14 + 1] & 255, decode[i14 + 2] & 255);
                                i13++;
                                optDouble2 = optDouble2;
                                optInt2 = optInt2;
                            }
                        }
                        this.f44330m.setPixels(iArr2, 0, i10, max, max2, i10, i11);
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            this.f44332o.save();
            JSONArray optJSONArray = jSONObject.optJSONArray("cl");
            if (optJSONArray != null) {
                for (int i15 = 0; i15 < optJSONArray.length(); i15++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i15);
                    if (optJSONObject != null) {
                        Canvas canvas = this.f44332o;
                        Path path = this.e;
                        a0.j(optJSONObject, path);
                        canvas.clipPath(path);
                    }
                }
            }
            if (optInt == 3) {
                Canvas canvas2 = this.f44332o;
                Path path2 = this.d;
                a0.j(jSONObject, path2);
                canvas2.drawPath(path2, this.f44323c);
                this.f44332o.restore();
                return;
            }
            float max3 = Math.max(0.0f, Math.min(1.0f, (float) jSONObject.optDouble("a", 1.0d)));
            int optInt4 = jSONObject.optInt("cm");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("sh");
            Paint paint = this.f44322b;
            if (optJSONArray2 != null && jSONObject.has("shc")) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f44330m.getWidth(), this.f44330m.getHeight(), Bitmap.Config.ARGB_8888);
                c(new Canvas(createBitmap), jSONObject, cVar);
                Paint paint2 = new Paint(1);
                float optDouble3 = ((float) optJSONArray2.optDouble(2)) / 2.0f;
                if (optDouble3 > 0.5f) {
                    paint2.setMaskFilter(new BlurMaskFilter((optDouble3 - 0.5f) / 0.57735f, BlurMaskFilter.Blur.NORMAL));
                }
                Bitmap extractAlpha = createBitmap.extractAlpha(paint2, new int[2]);
                paint.reset();
                paint.setAlpha(Math.round(max3 * 255.0f));
                b(optInt4, paint);
                this.f44332o.saveLayer(null, paint);
                Paint paint3 = new Paint(1);
                paint3.setColor((int) jSONObject.optLong("shc"));
                this.f44332o.drawBitmap(extractAlpha, iArr[0] + ((float) optJSONArray2.optDouble(0)), iArr[1] + ((float) optJSONArray2.optDouble(1)), paint3);
                this.f44332o.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                this.f44332o.restore();
                extractAlpha.recycle();
                createBitmap.recycle();
            } else if (max3 >= 1.0f && optInt4 == 0) {
                c(this.f44332o, jSONObject, cVar);
            } else {
                paint.reset();
                paint.setAlpha(Math.round(max3 * 255.0f));
                b(optInt4, paint);
                this.f44332o.saveLayer(null, paint);
                c(this.f44332o, jSONObject, cVar);
                this.f44332o.restore();
            }
            this.f44332o.restore();
        }
    }
}
