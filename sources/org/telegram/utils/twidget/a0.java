package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
public final class a0 {
    public final Paint f44301a = new Paint(1);
    public final Paint f44302b;
    public final Paint f44303c;
    public final Paint d;
    public final Path e;
    public final Path f44304f;
    public final Path f44305g;
    public final RectF h;
    public final RectF f44306i;
    public final RectF f44307j;
    public final float[] f44308k;
    public final float[] f44309l;
    public final Matrix f44310m;
    public final HashMap f44311n;
    public final IdentityHashMap f44312o;
    public final float[] f44313p;

    public a0() {
        Paint paint = new Paint(1);
        this.f44302b = paint;
        this.f44303c = new Paint(2);
        this.d = new Paint(1);
        this.e = new Path();
        this.f44304f = new Path();
        this.f44305g = new Path();
        this.h = new RectF();
        this.f44306i = new RectF();
        this.f44307j = new RectF();
        this.f44308k = new float[8];
        this.f44309l = new float[8];
        this.f44310m = new Matrix();
        this.f44311n = new HashMap();
        this.f44312o = new IdentityHashMap();
        this.f44313p = new float[9];
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void d(JSONArray jSONArray, float[] fArr, int i10, float... fArr2) {
        float f7;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < fArr2.length) {
                f7 = fArr2[i11];
            } else {
                f7 = 0.0f;
            }
            if (jSONArray != null && i11 < jSONArray.length()) {
                f7 = (float) jSONArray.optDouble(i11, f7);
            }
            fArr[i11] = f7;
        }
    }

    public static void e(Paint paint, JSONObject jSONObject, float f7, float f10) {
        Paint.Cap cap;
        Paint.Join join;
        int i10;
        paint.setStrokeWidth(f7);
        int optInt = jSONObject.optInt("lc");
        int optInt2 = jSONObject.optInt("lj");
        if (optInt == 1) {
            cap = Paint.Cap.ROUND;
        } else if (optInt == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        if (optInt2 == 1) {
            join = Paint.Join.ROUND;
        } else if (optInt2 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        paint.setStrokeMiter((float) jSONObject.optDouble("ml", f10));
        JSONArray optJSONArray = jSONObject.optJSONArray("d");
        paint.setPathEffect(null);
        if (optJSONArray != null && optJSONArray.length() != 0) {
            int length = optJSONArray.length();
            if (length % 2 == 1) {
                i10 = length * 2;
            } else {
                i10 = length;
            }
            float[] fArr = new float[i10];
            float f11 = 0.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                float max = Math.max(0.0f, (float) optJSONArray.optDouble(i11 % length));
                fArr[i11] = max;
                f11 += max;
            }
            if (f11 > 0.0f) {
                paint.setPathEffect(new DashPathEffect(fArr, (float) jSONObject.optDouble("do")));
            }
        }
    }

    public static void j(JSONObject jSONObject, Path path) {
        int length;
        Path.FillType fillType;
        int i10;
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("o");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("v");
        if (optJSONArray == null) {
            return;
        }
        if (optJSONArray2 == null) {
            length = 0;
        } else {
            length = optJSONArray2.length();
        }
        int i11 = 0;
        int i12 = 0;
        while (i12 < optJSONArray.length()) {
            int optInt = optJSONArray.optInt(i12);
            if (optInt == 3) {
                i10 = 6;
            } else if (optInt == 2) {
                i10 = 4;
            } else if (optInt == 4) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            int i13 = i11 + i10;
            if (i13 > length) {
                break;
            }
            if (optInt != 0) {
                if (optInt != 1) {
                    if (optInt != 2) {
                        if (optInt != 3) {
                            if (optInt == 4) {
                                path.close();
                            }
                        } else {
                            path.cubicTo((float) optJSONArray2.optDouble(i11), (float) optJSONArray2.optDouble(i11 + 1), (float) optJSONArray2.optDouble(i11 + 2), (float) optJSONArray2.optDouble(i11 + 3), (float) optJSONArray2.optDouble(i11 + 4), (float) optJSONArray2.optDouble(i11 + 5));
                        }
                    } else {
                        path.quadTo((float) optJSONArray2.optDouble(i11), (float) optJSONArray2.optDouble(i11 + 1), (float) optJSONArray2.optDouble(i11 + 2), (float) optJSONArray2.optDouble(i11 + 3));
                    }
                } else {
                    path.lineTo((float) optJSONArray2.optDouble(i11), (float) optJSONArray2.optDouble(i11 + 1));
                }
            } else {
                path.moveTo((float) optJSONArray2.optDouble(i11), (float) optJSONArray2.optDouble(i11 + 1));
            }
            i12++;
            i11 = i13;
        }
        if (jSONObject.optInt("e") != 0) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    public static RectF k(JSONObject jSONObject, String str, RectF rectF) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            rectF.setEmpty();
            return rectF;
        }
        float optDouble = (float) optJSONArray.optDouble(0);
        float optDouble2 = (float) optJSONArray.optDouble(1);
        rectF.set(optDouble, optDouble2, ((float) optJSONArray.optDouble(2)) + optDouble, ((float) optJSONArray.optDouble(3)) + optDouble2);
        return rectF;
    }

    public static void m(int i10, Paint paint) {
        paint.setShader(null);
        paint.setColor(i10);
    }

    public static int[] n(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        int[] iArr = new int[Math.max(2, length)];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = (int) jSONArray.optLong((i10 * 2) + 1);
        }
        if (length == 1) {
            iArr[1] = iArr[0];
        }
        return iArr;
    }

    public static float[] o(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        if (length == 1) {
            return new float[]{0.0f, 1.0f};
        }
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = Math.max(0.0f, Math.min(1.0f, (float) jSONArray.optDouble(i10 * 2)));
        }
        return fArr;
    }

    public static float p(JSONArray jSONArray) {
        if (jSONArray.length() >= 8) {
            double optDouble = jSONArray.optDouble(0);
            for (int i10 = 1; i10 < 8; i10++) {
                if (jSONArray.optDouble(i10) != optDouble) {
                    return -1.0f;
                }
            }
            return (float) optDouble;
        }
        return -1.0f;
    }

    public final void a(Path path, JSONObject jSONObject, RectF rectF, float f7) {
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.f44308k;
            if (i10 < 8) {
                fArr[i10] = Math.max(((float) optJSONArray.optDouble(i10)) + f7, 0.0f);
                i10++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void b(Canvas canvas, JSONObject jSONObject) {
        if (jSONObject.has("l")) {
            canvas.clipRect(k(jSONObject, "l", this.f44306i));
        }
    }

    public final void c(Canvas canvas, JSONObject jSONObject, Paint paint) {
        float p5;
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            p5 = 0.0f;
        } else {
            p5 = p(optJSONArray);
        }
        int i10 = (p5 > 0.0f ? 1 : (p5 == 0.0f ? 0 : -1));
        RectF rectF = this.h;
        if (i10 == 0) {
            canvas.drawRect(k(jSONObject, "r", rectF), paint);
        } else if (i10 > 0) {
            canvas.drawRoundRect(k(jSONObject, "r", rectF), p5, p5, paint);
        } else {
            Path path = this.e;
            l(jSONObject, "r", path);
            canvas.drawPath(path, paint);
        }
    }

    public final void f(Canvas canvas, JSONArray jSONArray, int i10, z zVar, float f7, boolean z10) {
        int i11;
        ArrayList arrayList;
        cc.f fVar;
        Matrix matrix;
        ArrayList arrayList2;
        a0 a0Var;
        Paint paint;
        cc.f fVar2;
        Bitmap image;
        String str;
        Matrix matrix2;
        cc.f fVar3;
        cc.f fVar4;
        int i12;
        float f10;
        float f11;
        BlurMaskFilter blurMaskFilter;
        int i13;
        boolean z11;
        int i14;
        float[] fArr;
        RectF rectF;
        a0 a0Var2 = this;
        cc.f fVar5 = new cc.f(canvas);
        ArrayList arrayList3 = (ArrayList) fVar5.e;
        Matrix matrix3 = (Matrix) fVar5.d;
        ArrayList arrayList4 = (ArrayList) fVar5.f4118f;
        int i15 = 0;
        while (i15 < i10) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i15);
            if (optJSONObject == null) {
                fVar = fVar5;
                i11 = i15;
                arrayList = arrayList3;
                matrix = matrix3;
                arrayList2 = arrayList4;
            } else {
                Canvas canvas2 = (Canvas) fVar5.f4117c;
                int optInt = optJSONObject.optInt("k");
                cc.f fVar6 = fVar5;
                float[] fArr2 = a0Var2.f44313p;
                i11 = i15;
                float[] fArr3 = a0Var2.f44309l;
                Paint paint2 = a0Var2.f44302b;
                Path path = a0Var2.f44304f;
                RectF rectF2 = a0Var2.f44307j;
                Paint paint3 = a0Var2.f44301a;
                RectF rectF3 = a0Var2.h;
                switch (optInt) {
                    case 0:
                        arrayList = arrayList3;
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        boolean has = optJSONObject.has("l");
                        if (has) {
                            canvas2.save();
                            a0Var.b(canvas2, optJSONObject);
                        }
                        m((int) optJSONObject.optLong("c"), paint3);
                        a0Var.c(canvas2, optJSONObject, paint3);
                        if (!has) {
                            break;
                        } else {
                            canvas2.restore();
                            break;
                        }
                    case 1:
                        arrayList = arrayList3;
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        paint2.setColor((int) optJSONObject.optLong("c"));
                        paint2.setStrokeWidth((float) optJSONObject.optDouble("w", 1.0d));
                        paint2.setStrokeCap(Paint.Cap.BUTT);
                        paint2.setStrokeJoin(Paint.Join.MITER);
                        paint2.setPathEffect(null);
                        a0Var.c(canvas2, optJSONObject, paint2);
                        break;
                    case 2:
                        arrayList = arrayList3;
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        m((int) optJSONObject.optLong("c"), paint3);
                        canvas2.drawOval(k(optJSONObject, "r", rectF3), paint3);
                        break;
                    case 3:
                        arrayList = arrayList3;
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        float optDouble = (float) optJSONObject.optDouble("w", 1.0d);
                        float f12 = optDouble / 2.0f;
                        k(optJSONObject, "r", rectF3).inset(f12, f12);
                        paint2.setColor((int) optJSONObject.optLong("c"));
                        paint2.setStrokeWidth(optDouble);
                        paint2.setStrokeCap(Paint.Cap.BUTT);
                        paint2.setStrokeJoin(Paint.Join.MITER);
                        paint2.setPathEffect(null);
                        canvas2.drawOval(rectF3, paint2);
                        break;
                    case 4:
                        fVar = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        Paint deviceFont = zVar.deviceFont(optJSONObject.optInt("f"));
                        if (deviceFont == null) {
                            paint = null;
                        } else {
                            IdentityHashMap identityHashMap = a0Var.f44312o;
                            paint = (Paint) identityHashMap.get(deviceFont);
                            if (paint == null) {
                                if (identityHashMap.size() >= 64) {
                                    identityHashMap.clear();
                                }
                                paint = new Paint(deviceFont);
                                identityHashMap.put(deviceFont, paint);
                            }
                        }
                        if (paint != null) {
                            paint.setColor((int) optJSONObject.optLong("c"));
                            paint.setShader(null);
                            canvas2.save();
                            float f13 = 1.0f / f7;
                            canvas2.scale(f13, f13);
                            canvas2.drawText(optJSONObject.optString("t"), ((float) optJSONObject.optDouble("x")) * f7, ((float) optJSONObject.optDouble("y")) * f7, paint);
                            canvas2.restore();
                        }
                        arrayList = arrayList3;
                        break;
                    case 5:
                        fVar2 = fVar6;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        a0Var = a0Var2;
                        if (optJSONObject.has("cv")) {
                            image = zVar.canvas(optJSONObject.optInt("cv"));
                        } else {
                            image = zVar.image(optJSONObject.optInt("i"));
                        }
                        if (image != null) {
                            canvas2.save();
                            a0Var.b(canvas2, optJSONObject);
                            if (optJSONObject.has("q")) {
                                str = "l";
                                a0Var.l(optJSONObject, optJSONObject.has(str) ? "l" : "r", path);
                                canvas2.clipPath(path);
                            }
                            canvas2.drawBitmap(image, (Rect) null, k(optJSONObject, "r", rectF3), a0Var.f44303c);
                            canvas2.restore();
                        }
                        arrayList = arrayList3;
                        fVar = fVar2;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix4 = matrix3;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        JSONArray optJSONArray = optJSONObject.optJSONArray("s");
                        if (optJSONArray == null || optJSONArray.length() < 2) {
                            fVar2 = fVar6;
                            matrix = matrix4;
                        } else {
                            int[] n10 = n(optJSONArray);
                            float[] o10 = o(optJSONArray);
                            fVar2 = fVar6;
                            matrix = matrix4;
                            d(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                            float f14 = fArr3[0];
                            float f15 = fArr3[1];
                            float f16 = fArr3[2];
                            float f17 = fArr3[3];
                            canvas2.save();
                            a0Var.b(canvas2, optJSONObject);
                            a0Var.l(optJSONObject, "r", path);
                            canvas2.clipPath(path);
                            paint3.setColor(-16777216);
                            if (optInt == 6 && n10.length > 16) {
                                double d = f16 - f14;
                                double d10 = f17 - f15;
                                float hypot = (float) Math.hypot(d, d10);
                                if (hypot > 0.0f) {
                                    canvas2.translate(f14, f15);
                                    canvas2.rotate((float) Math.toDegrees(Math.atan2(d10, d)));
                                    int length = o10.length - 1;
                                    int i16 = n10[0];
                                    paint3.setShader(null);
                                    paint3.setColor(i16);
                                    canvas2.drawRect(-8000.0f, -8000.0f, o10[0] * hypot, 8000.0f, paint3);
                                    Paint paint4 = paint3;
                                    int i17 = 0;
                                    while (i17 < length) {
                                        float f18 = o10[i17] * hypot;
                                        int i18 = i17 + 1;
                                        float f19 = o10[i18] * hypot;
                                        if (f19 > f18) {
                                            int i19 = n10[i17];
                                            if (i19 == n10[i18]) {
                                                paint4.setShader(null);
                                                paint4.setColor(i19);
                                            } else {
                                                paint4.setColor(-16777216);
                                                paint4.setShader(new LinearGradient(f18, 0.0f, f19, 0.0f, n10[i17], n10[i18], Shader.TileMode.CLAMP));
                                            }
                                            Paint paint5 = paint4;
                                            canvas2.drawRect(f18, -8000.0f, f19, 8000.0f, paint5);
                                            paint4 = paint5;
                                        }
                                        i17 = i18;
                                    }
                                    int i20 = n10[length];
                                    paint4.setShader(null);
                                    paint4.setColor(i20);
                                    Paint paint6 = paint4;
                                    canvas2.drawRect(o10[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint6);
                                    paint6.setShader(null);
                                }
                                canvas2.restore();
                            } else {
                                if (optInt == 6) {
                                    paint3.setShader(new LinearGradient(f14, f15, f16, f17, n10, o10, Shader.TileMode.CLAMP));
                                } else if (optInt == 7) {
                                    float max = Math.max(f16, 0.01f);
                                    float max2 = Math.max(f17, 0.01f);
                                    paint3.setShader(new RadialGradient(f14, f15, max, n10, o10, Shader.TileMode.CLAMP));
                                    canvas2.translate(f14, f15);
                                    canvas2.scale(1.0f, max2 / max);
                                    canvas2.translate(-f14, -f15);
                                } else {
                                    paint3.setShader(new SweepGradient(f14, f15, n10, o10));
                                    canvas2.rotate(f16 - 90.0f, f14, f15);
                                }
                                k(optJSONObject, "r", rectF3);
                                canvas2.drawRect(rectF3.left - 4000.0f, rectF3.top - 4000.0f, rectF3.right + 4000.0f, rectF3.bottom + 4000.0f, paint3);
                                paint3.setShader(null);
                                canvas2.restore();
                            }
                        }
                        arrayList = arrayList3;
                        fVar = fVar2;
                        break;
                    case 9:
                        matrix2 = matrix3;
                        fVar3 = fVar6;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        canvas2.save();
                        arrayList3.add(new Matrix(matrix2));
                        fVar3.f4116b++;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("p");
                        if (optJSONObject2 != null) {
                            j(optJSONObject2, path);
                        } else {
                            a0Var.l(optJSONObject, "r", path);
                        }
                        canvas2.clipPath(path);
                        fVar = fVar3;
                        matrix = matrix2;
                        arrayList = arrayList3;
                        break;
                    case 10:
                    case 13:
                        matrix2 = matrix3;
                        fVar3 = fVar6;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        if (fVar3.f4116b > 0) {
                            fVar3.b();
                        }
                        fVar = fVar3;
                        matrix = matrix2;
                        arrayList = arrayList3;
                        break;
                    case 11:
                        matrix2 = matrix3;
                        fVar3 = fVar6;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("p");
                        if (optJSONObject3 != null) {
                            Path path2 = a0Var.e;
                            j(optJSONObject3, path2);
                            Shader h = a0Var.h(optJSONObject3, "g", "ga", "s");
                            if (h != null) {
                                paint3.setColor(-16777216);
                                paint3.setShader(h);
                                canvas2.drawPath(path2, paint3);
                                paint3.setShader(null);
                            } else if (optJSONObject3.has("f") && (((int) optJSONObject3.optLong("f")) >>> 24) != 0) {
                                m((int) optJSONObject3.optLong("f"), paint3);
                                canvas2.drawPath(path2, paint3);
                            }
                            float optDouble2 = (float) optJSONObject3.optDouble("sw");
                            int i21 = (optDouble2 > 0.0f ? 1 : (optDouble2 == 0.0f ? 0 : -1));
                            Shader h10 = i21 > 0 ? a0Var.h(optJSONObject3, "sg", "sga", "ss") : null;
                            if (optJSONObject3.has("sc") && (((((int) optJSONObject3.optLong("sc")) >>> 24) != 0 || h10 != null) && i21 > 0)) {
                                paint2.setColor(h10 != null ? -16777216 : (int) optJSONObject3.optLong("sc"));
                                paint2.setShader(h10);
                                e(paint2, optJSONObject3, optDouble2, 4.0f);
                                canvas2.drawPath(path2, paint2);
                                paint2.setPathEffect(null);
                                paint2.setShader(null);
                            }
                        }
                        fVar = fVar3;
                        matrix = matrix2;
                        arrayList = arrayList3;
                        break;
                    case 12:
                        Matrix matrix5 = matrix3;
                        a0Var = a0Var2;
                        ArrayList arrayList5 = arrayList3;
                        arrayList2 = arrayList4;
                        float optDouble3 = (float) optJSONObject.optDouble("o", 1.0d);
                        boolean z12 = optJSONObject.optInt("h") != 0;
                        d(optJSONObject.optJSONArray("m"), fArr3, 6, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
                        fArr2[0] = fArr3[0];
                        fArr2[1] = fArr3[2];
                        fArr2[2] = fArr3[4];
                        fArr2[3] = fArr3[1];
                        fArr2[4] = fArr3[3];
                        fArr2[5] = fArr3[5];
                        fArr2[6] = 0.0f;
                        fArr2[7] = 0.0f;
                        fArr2[8] = 1.0f;
                        Matrix matrix6 = a0Var.f44310m;
                        matrix6.setValues(fArr2);
                        if (optDouble3 < 1.0f && !z12) {
                            int round = Math.round(Math.max(0.0f, Math.min(1.0f, optDouble3)) * 255.0f);
                            k(optJSONObject, "r", rectF2);
                            if (!rectF2.isEmpty()) {
                                matrix6.mapRect(rectF3, rectF2);
                                rectF3.inset(-1.0f, -1.0f);
                                canvas2.saveLayerAlpha(rectF3, round);
                            } else {
                                canvas2.saveLayerAlpha(null, round);
                            }
                        } else {
                            canvas2.save();
                        }
                        arrayList5.add(new Matrix(matrix5));
                        fVar6.f4116b++;
                        canvas2.concat(matrix6);
                        matrix5.preConcat(matrix6);
                        if (!z12) {
                            matrix = matrix5;
                            arrayList = arrayList5;
                            fVar = fVar6;
                            break;
                        } else {
                            canvas2.clipRect(0, 0, 0, 0);
                            matrix = matrix5;
                            arrayList = arrayList5;
                            fVar = fVar6;
                            break;
                        }
                    case 14:
                        arrayList2 = arrayList4;
                        d(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                        float f20 = fArr3[0];
                        float f21 = fArr3[1];
                        float max3 = Math.max(fArr3[2], 0.0f);
                        float f22 = fArr3[3];
                        arrayList = arrayList3;
                        matrix = matrix3;
                        int optLong = (int) optJSONObject.optLong("c");
                        k(optJSONObject, "r", rectF2);
                        if (rectF2.isEmpty() || (optLong >>> 24) == 0 || ((i12 = Build.VERSION.SDK_INT) < 28 && (max3 / 2.0f) * f7 > 0.5f)) {
                            a0Var = this;
                            fVar4 = fVar6;
                        } else {
                            boolean z13 = optJSONObject.optInt("n") != 0;
                            a0Var = this;
                            Paint paint7 = a0Var.d;
                            paint7.setColor(optLong);
                            float f23 = (max3 / 2.0f) * f7;
                            if (f23 > 0.5f) {
                                float f24 = ((f23 - 0.5f) / 0.57735f) / f7;
                                f11 = max3;
                                Float valueOf = Float.valueOf(f24);
                                fVar4 = fVar6;
                                HashMap hashMap = a0Var.f44311n;
                                blurMaskFilter = (BlurMaskFilter) hashMap.get(valueOf);
                                if (blurMaskFilter == null) {
                                    f10 = f20;
                                    if (hashMap.size() >= 32) {
                                        hashMap.clear();
                                    }
                                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(f24, BlurMaskFilter.Blur.NORMAL);
                                    hashMap.put(Float.valueOf(f24), blurMaskFilter2);
                                    blurMaskFilter = blurMaskFilter2;
                                } else {
                                    f10 = f20;
                                }
                            } else {
                                f10 = f20;
                                f11 = max3;
                                fVar4 = fVar6;
                                blurMaskFilter = null;
                            }
                            paint7.setMaskFilter(blurMaskFilter);
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("q");
                            float p5 = optJSONArray2 == null ? 0.0f : p(optJSONArray2);
                            if (!z13 && p5 >= 0.0f) {
                                float f25 = p5;
                                rectF3.set((rectF2.left - f22) + f10, (rectF2.top - f22) + f21, rectF2.right + f22 + f10, rectF2.bottom + f22 + f21);
                                float max4 = optJSONArray2 != null ? Math.max(f25 + f22, 0.0f) : 0.0f;
                                canvas2.save();
                                if (i13 != 0) {
                                    a0Var.l(optJSONObject, "r", path);
                                    if (i12 >= 26) {
                                        canvas2.clipOutPath(path);
                                    } else {
                                        canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                    }
                                } else if (i12 >= 26) {
                                    canvas2.clipOutRect(rectF2);
                                } else {
                                    canvas2.clipRect(rectF2, Region.Op.DIFFERENCE);
                                }
                                if (max4 > 0.0f) {
                                    canvas2.drawRoundRect(rectF3, max4, max4, paint7);
                                } else {
                                    canvas2.drawRect(rectF3, paint7);
                                }
                                canvas2.restore();
                                paint7.setMaskFilter(null);
                            } else {
                                Path path3 = a0Var.f44305g;
                                path3.rewind();
                                if (z13) {
                                    float abs = Math.abs(f21) + Math.abs(f10) + Math.abs(f22) + (f11 * 1.5f) + 2.0f;
                                    rectF3.set(rectF2.left - abs, rectF2.top - abs, rectF2.right + abs, rectF2.bottom + abs);
                                    path3.addRect(rectF3, Path.Direction.CW);
                                    rectF3.set(rectF2.left + f22, rectF2.top + f22, rectF2.right - f22, rectF2.bottom - f22);
                                    if (!rectF3.isEmpty()) {
                                        a0Var.a(path3, optJSONObject, rectF3, -f22);
                                    }
                                    path3.setFillType(Path.FillType.EVEN_ODD);
                                } else {
                                    rectF3.set(rectF2.left - f22, rectF2.top - f22, rectF2.right + f22, rectF2.bottom + f22);
                                    if (!optJSONObject.has("q")) {
                                        f22 = 0.0f;
                                    }
                                    a0Var.a(path3, optJSONObject, rectF3, f22);
                                }
                                path3.offset(f10, f21);
                                canvas2.save();
                                a0Var.l(optJSONObject, "r", path);
                                if (z13) {
                                    canvas2.clipPath(path);
                                } else if (i12 >= 26) {
                                    canvas2.clipOutPath(path);
                                } else {
                                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                }
                                canvas2.drawPath(path3, paint7);
                                canvas2.restore();
                                paint7.setMaskFilter(null);
                            }
                        }
                        fVar = fVar4;
                        break;
                    case 15:
                        y yVar = new y();
                        yVar.f44473a = (Canvas) fVar6.f4117c;
                        yVar.f44474b = fVar6.f4116b;
                        arrayList4.add(yVar);
                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("fl");
                        if (optJSONArray3 != null && optJSONArray3.length() != 0) {
                            k(optJSONObject, "r", rectF2);
                            if (!rectF2.isEmpty()) {
                                arrayList2 = arrayList4;
                                int i22 = 0;
                                float f26 = 0.0f;
                                float f27 = 0.0f;
                                float f28 = 0.0f;
                                float f29 = 0.0f;
                                while (i22 < optJSONArray3.length()) {
                                    JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i22);
                                    if (optJSONArray4 == null) {
                                        i14 = i22;
                                        fArr = fArr2;
                                        rectF = rectF3;
                                    } else {
                                        i14 = i22;
                                        fArr = fArr2;
                                        rectF = rectF3;
                                        float max5 = Math.max(0.0f, (float) optJSONArray4.optDouble(1));
                                        if (optJSONArray4.optInt(0) == 0) {
                                            float f30 = max5 * 3.0f;
                                            f26 += f30;
                                            f27 += f30;
                                            f28 += f30;
                                            f29 += f30;
                                        } else if (optJSONArray4.optInt(0) == 9) {
                                            float optDouble4 = (float) optJSONArray4.optDouble(2);
                                            float optDouble5 = (float) optJSONArray4.optDouble(3);
                                            float f31 = max5 * 1.5f;
                                            float max6 = Math.max(f26, f31 - optDouble4);
                                            float max7 = Math.max(f28, optDouble4 + f31);
                                            float max8 = Math.max(f27, f31 - optDouble5);
                                            f28 = max7;
                                            f29 = Math.max(f29, f31 + optDouble5);
                                            f26 = max6;
                                            f27 = max8;
                                        }
                                    }
                                    i22 = i14 + 1;
                                    fArr2 = fArr;
                                    rectF3 = rectF;
                                }
                                float[] fArr4 = fArr2;
                                RectF rectF4 = rectF3;
                                rectF2.set(rectF2.left - f26, rectF2.top - f27, rectF2.right + f28, rectF2.bottom + f29);
                                if (Build.VERSION.SDK_INT >= 31 && ((Canvas) fVar6.f4117c).isHardwareAccelerated()) {
                                    Canvas b10 = x.b(yVar, rectF2, optJSONArray3, f7);
                                    if (b10 != null) {
                                        fVar6.f4117c = b10;
                                        fVar6.f4116b = 0;
                                        z11 = false;
                                        arrayList = arrayList3;
                                        matrix = matrix3;
                                        fVar = fVar6;
                                        a0Var = this;
                                    }
                                    z11 = false;
                                    arrayList = arrayList3;
                                    matrix = matrix3;
                                    fVar = fVar6;
                                    a0Var = this;
                                } else {
                                    matrix3.getValues(fArr4);
                                    if (fArr4[1] == 0.0f && fArr4[3] == 0.0f) {
                                        Matrix matrix7 = yVar.f44477g;
                                        matrix7.set(matrix3);
                                        matrix7.postScale(f7, f7);
                                        matrix7.mapRect(rectF4, rectF2);
                                        int floor = (int) Math.floor(rectF4.left);
                                        int floor2 = (int) Math.floor(rectF4.top);
                                        int ceil = ((int) Math.ceil(rectF4.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF4.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0) {
                                            if (ceil2 * ceil <= 16777216) {
                                                yVar.f44476f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                                yVar.d = floor;
                                                yVar.e = floor2;
                                                yVar.h = Math.abs(fArr4[0]) * f7;
                                                yVar.f44478i = optJSONArray3;
                                                Canvas canvas3 = new Canvas(yVar.f44476f);
                                                canvas3.translate(-floor, -floor2);
                                                canvas3.concat(matrix7);
                                                fVar6.f4117c = canvas3;
                                                z11 = false;
                                                fVar6.f4116b = 0;
                                                arrayList = arrayList3;
                                                matrix = matrix3;
                                                fVar = fVar6;
                                                a0Var = this;
                                            }
                                        }
                                    }
                                    z11 = false;
                                    arrayList = arrayList3;
                                    matrix = matrix3;
                                    fVar = fVar6;
                                    a0Var = this;
                                }
                                break;
                            }
                        }
                        arrayList2 = arrayList4;
                        z11 = false;
                        arrayList = arrayList3;
                        matrix = matrix3;
                        fVar = fVar6;
                        a0Var = this;
                        break;
                    case 16:
                        if (!arrayList4.isEmpty()) {
                            a0Var2.i(fVar6, f7);
                        }
                        arrayList = arrayList3;
                        matrix = matrix3;
                        arrayList2 = arrayList4;
                        fVar = fVar6;
                        break;
                    case 17:
                        if (z10 && Build.VERSION.SDK_INT >= 31 && canvas2.isHardwareAccelerated()) {
                            x.a(a0Var2, fVar6, jSONArray, i11, optJSONObject, zVar, f7);
                            fVar = fVar6;
                            arrayList = arrayList3;
                            matrix = matrix3;
                            arrayList2 = arrayList4;
                            a0Var = a0Var2;
                            break;
                        }
                        break;
                    default:
                        arrayList = arrayList3;
                        matrix = matrix3;
                        fVar = fVar6;
                        a0Var = a0Var2;
                        arrayList2 = arrayList4;
                        break;
                }
                i15 = i11 + 1;
                a0Var2 = a0Var;
                fVar5 = fVar;
                arrayList4 = arrayList2;
                arrayList3 = arrayList;
                matrix3 = matrix;
            }
            a0Var = a0Var2;
            i15 = i11 + 1;
            a0Var2 = a0Var;
            fVar5 = fVar;
            arrayList4 = arrayList2;
            arrayList3 = arrayList;
            matrix3 = matrix;
        }
        a0 a0Var3 = a0Var2;
        cc.f fVar7 = fVar5;
        ArrayList arrayList6 = arrayList4;
        while (!arrayList6.isEmpty()) {
            a0Var3.i(fVar7, f7);
        }
        while (fVar7.f4116b > 0) {
            fVar7.b();
        }
    }

    public final void g(Canvas canvas, JSONArray jSONArray, z zVar, float f7) {
        int i10;
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
            int i11 = 0;
            while (true) {
                if (i11 < jSONArray.length()) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                    if (optJSONObject != null && optJSONObject.optInt("k") == 17) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
        }
        if (z10) {
            i10 = canvas.saveLayer(null, null);
        } else {
            i10 = -1;
        }
        f(canvas, jSONArray, jSONArray.length(), zVar, f7, true);
        if (z10) {
            canvas.restoreToCount(i10);
        }
    }

    public final Shader h(JSONObject jSONObject, String str, String str2, String str3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str3);
        if (jSONObject.has(str) && optJSONArray != null && optJSONArray.length() >= 4) {
            int[] n10 = n(optJSONArray);
            float[] o10 = o(optJSONArray);
            float[] fArr = this.f44309l;
            d(jSONObject.optJSONArray(str2), fArr, 7, new float[0]);
            if (jSONObject.optInt(str) == 1) {
                return new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], n10, o10, Shader.TileMode.CLAMP);
            }
            return new RadialGradient(fArr[0], fArr[1], Math.max(fArr[4], 0.01f), n10, o10, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final void i(cc.f fVar, float f7) {
        Object obj;
        int i10;
        y yVar = (y) i0.a.v(1, (ArrayList) fVar.f4118f);
        while (true) {
            int i11 = fVar.f4116b;
            obj = yVar.f44475c;
            if (obj == null && yVar.f44476f == null) {
                i10 = yVar.f44474b;
            } else {
                i10 = 0;
            }
            if (i11 <= i10) {
                break;
            }
            fVar.b();
        }
        if (obj != null) {
            x.d(yVar, f7);
            fVar.f4117c = yVar.f44473a;
        } else {
            Bitmap bitmap = yVar.f44476f;
            if (bitmap != null) {
                WidgetSandboxNative.filterPixels(bitmap, yVar.f44478i.toString().getBytes(StandardCharsets.UTF_8), yVar.h);
                fVar.f4117c = yVar.f44473a;
                Matrix matrix = new Matrix();
                if (yVar.f44477g.invert(matrix)) {
                    ((Canvas) fVar.f4117c).save();
                    ((Canvas) fVar.f4117c).concat(matrix);
                    ((Canvas) fVar.f4117c).drawBitmap(yVar.f44476f, yVar.d, yVar.e, this.f44303c);
                    ((Canvas) fVar.f4117c).restore();
                }
            }
        }
        fVar.f4116b = yVar.f44474b;
    }

    public final void l(JSONObject jSONObject, String str, Path path) {
        RectF rectF = this.h;
        k(jSONObject, str, rectF);
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.f44308k;
            if (i10 < 8) {
                fArr[i10] = (float) optJSONArray.optDouble(i10);
                i10++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }
}
