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
import org.telegram.ui.Cells.f1;
public final class y {
    public final Paint f52895a = new Paint(1);
    public final Paint f52896b;
    public final Paint f52897c;
    public final Paint d;
    public final Path f52898e;
    public final Path f52899f;
    public final Path f52900g;
    public final RectF h;
    public final RectF f52901i;
    public final RectF f52902j;
    public final float[] f52903k;
    public final float[] f52904l;
    public final Matrix f52905m;
    public final HashMap f52906n;
    public final IdentityHashMap f52907o;
    public final float[] f52908p;

    public y() {
        Paint paint = new Paint(1);
        this.f52896b = paint;
        this.f52897c = new Paint(2);
        this.d = new Paint(1);
        this.f52898e = new Path();
        this.f52899f = new Path();
        this.f52900g = new Path();
        this.h = new RectF();
        this.f52901i = new RectF();
        this.f52902j = new RectF();
        this.f52903k = new float[8];
        this.f52904l = new float[8];
        this.f52905m = new Matrix();
        this.f52906n = new HashMap();
        this.f52907o = new IdentityHashMap();
        this.f52908p = new float[9];
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void d(JSONArray jSONArray, float[] fArr, int i7, float... fArr2) {
        float f10;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 < fArr2.length) {
                f10 = fArr2[i10];
            } else {
                f10 = 0.0f;
            }
            if (jSONArray != null && i10 < jSONArray.length()) {
                f10 = (float) jSONArray.optDouble(i10, f10);
            }
            fArr[i10] = f10;
        }
    }

    public static void i(JSONObject jSONObject, Path path) {
        int length;
        Path.FillType fillType;
        int i7;
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
        int i10 = 0;
        int i11 = 0;
        while (i11 < optJSONArray.length()) {
            int optInt = optJSONArray.optInt(i11);
            if (optInt == 3) {
                i7 = 6;
            } else if (optInt == 2) {
                i7 = 4;
            } else if (optInt == 4) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            int i12 = i10 + i7;
            if (i12 > length) {
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
                            path.cubicTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1), (float) optJSONArray2.optDouble(i10 + 2), (float) optJSONArray2.optDouble(i10 + 3), (float) optJSONArray2.optDouble(i10 + 4), (float) optJSONArray2.optDouble(i10 + 5));
                        }
                    } else {
                        path.quadTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1), (float) optJSONArray2.optDouble(i10 + 2), (float) optJSONArray2.optDouble(i10 + 3));
                    }
                } else {
                    path.lineTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1));
                }
            } else {
                path.moveTo((float) optJSONArray2.optDouble(i10), (float) optJSONArray2.optDouble(i10 + 1));
            }
            i11++;
            i10 = i12;
        }
        if (jSONObject.optInt("e") != 0) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    public static RectF j(JSONObject jSONObject, String str, RectF rectF) {
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

    public static void l(int i7, Paint paint) {
        paint.setShader(null);
        paint.setColor(i7);
    }

    public static int[] m(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        int[] iArr = new int[Math.max(2, length)];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = (int) jSONArray.optLong((i7 * 2) + 1);
        }
        if (length == 1) {
            iArr[1] = iArr[0];
        }
        return iArr;
    }

    public static float[] n(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        if (length == 1) {
            return new float[]{0.0f, 1.0f};
        }
        float[] fArr = new float[length];
        for (int i7 = 0; i7 < length; i7++) {
            fArr[i7] = Math.max(0.0f, Math.min(1.0f, (float) jSONArray.optDouble(i7 * 2)));
        }
        return fArr;
    }

    public static float o(JSONArray jSONArray) {
        if (jSONArray.length() >= 8) {
            double optDouble = jSONArray.optDouble(0);
            for (int i7 = 1; i7 < 8; i7++) {
                if (jSONArray.optDouble(i7) != optDouble) {
                    return -1.0f;
                }
            }
            return (float) optDouble;
        }
        return -1.0f;
    }

    public final void a(Path path, JSONObject jSONObject, RectF rectF, float f10) {
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i7 = 0;
        while (true) {
            float[] fArr = this.f52903k;
            if (i7 < 8) {
                fArr[i7] = Math.max(((float) optJSONArray.optDouble(i7)) + f10, 0.0f);
                i7++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void b(Canvas canvas, JSONObject jSONObject) {
        if (jSONObject.has("l")) {
            canvas.clipRect(j(jSONObject, "l", this.f52901i));
        }
    }

    public final void c(Canvas canvas, JSONObject jSONObject, Paint paint) {
        float o4;
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            o4 = 0.0f;
        } else {
            o4 = o(optJSONArray);
        }
        int i7 = (o4 > 0.0f ? 1 : (o4 == 0.0f ? 0 : -1));
        RectF rectF = this.h;
        if (i7 == 0) {
            canvas.drawRect(j(jSONObject, "r", rectF), paint);
        } else if (i7 > 0) {
            canvas.drawRoundRect(j(jSONObject, "r", rectF), o4, o4, paint);
        } else {
            Path path = this.f52898e;
            k(jSONObject, "r", path);
            canvas.drawPath(path, paint);
        }
    }

    public final void e(Canvas canvas, JSONArray jSONArray, int i7, x xVar, float f10, boolean z9) {
        int i10;
        a4.k kVar;
        Matrix matrix;
        ArrayList arrayList;
        y yVar;
        Paint paint;
        a4.k kVar2;
        Bitmap image;
        Matrix matrix2;
        a4.k kVar3;
        Shader shader;
        int optLong;
        int i11;
        Paint.Cap cap;
        Paint.Join join;
        int i12;
        boolean z10;
        a4.k kVar4;
        int i13;
        boolean z11;
        float f11;
        float f12;
        BlurMaskFilter blurMaskFilter;
        float o4;
        int i14;
        float f13;
        boolean z12;
        int i15;
        float[] fArr;
        RectF rectF;
        y yVar2 = this;
        a4.k kVar5 = new a4.k(canvas);
        ArrayList arrayList2 = (ArrayList) kVar5.f193e;
        Matrix matrix3 = (Matrix) kVar5.d;
        ArrayList arrayList3 = (ArrayList) kVar5.f194f;
        int i16 = 0;
        while (i16 < i7) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i16);
            if (optJSONObject == null) {
                kVar = kVar5;
                i10 = i16;
                matrix = matrix3;
                arrayList = arrayList3;
            } else {
                Canvas canvas2 = (Canvas) kVar5.f192c;
                int optInt = optJSONObject.optInt("k");
                a4.k kVar6 = kVar5;
                float[] fArr2 = yVar2.f52908p;
                i10 = i16;
                float[] fArr3 = yVar2.f52904l;
                Paint paint2 = yVar2.f52896b;
                Path path = yVar2.f52899f;
                RectF rectF2 = yVar2.f52902j;
                Paint paint3 = yVar2.f52895a;
                RectF rectF3 = yVar2.h;
                switch (optInt) {
                    case 0:
                        kVar = kVar6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        boolean has = optJSONObject.has("l");
                        if (has) {
                            canvas2.save();
                            yVar.b(canvas2, optJSONObject);
                        }
                        l((int) optJSONObject.optLong("c"), paint3);
                        yVar.c(canvas2, optJSONObject, paint3);
                        if (!has) {
                            break;
                        } else {
                            canvas2.restore();
                            break;
                        }
                    case 1:
                        kVar = kVar6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        paint2.setColor((int) optJSONObject.optLong("c"));
                        paint2.setStrokeWidth((float) optJSONObject.optDouble("w", 1.0d));
                        paint2.setStrokeCap(Paint.Cap.BUTT);
                        paint2.setStrokeJoin(Paint.Join.MITER);
                        paint2.setPathEffect(null);
                        yVar.c(canvas2, optJSONObject, paint2);
                        break;
                    case 2:
                        kVar = kVar6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        l((int) optJSONObject.optLong("c"), paint3);
                        canvas2.drawOval(j(optJSONObject, "r", rectF3), paint3);
                        break;
                    case 3:
                        kVar = kVar6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        float optDouble = (float) optJSONObject.optDouble("w", 1.0d);
                        float f14 = optDouble / 2.0f;
                        j(optJSONObject, "r", rectF3).inset(f14, f14);
                        paint2.setColor((int) optJSONObject.optLong("c"));
                        paint2.setStrokeWidth(optDouble);
                        paint2.setStrokeCap(Paint.Cap.BUTT);
                        paint2.setStrokeJoin(Paint.Join.MITER);
                        paint2.setPathEffect(null);
                        canvas2.drawOval(rectF3, paint2);
                        break;
                    case 4:
                        kVar = kVar6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        Paint deviceFont = xVar.deviceFont(optJSONObject.optInt("f"));
                        if (deviceFont == null) {
                            paint = null;
                        } else {
                            IdentityHashMap identityHashMap = yVar.f52907o;
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
                            float f15 = 1.0f / f10;
                            canvas2.scale(f15, f15);
                            canvas2.drawText(optJSONObject.optString("t"), ((float) optJSONObject.optDouble("x")) * f10, ((float) optJSONObject.optDouble("y")) * f10, paint);
                            canvas2.restore();
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        kVar2 = kVar6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        if (optJSONObject.has("cv")) {
                            image = xVar.canvas(optJSONObject.optInt("cv"));
                        } else {
                            image = xVar.image(optJSONObject.optInt("i"));
                        }
                        if (image != null) {
                            canvas2.save();
                            yVar.b(canvas2, optJSONObject);
                            if (optJSONObject.has("q")) {
                                String str = "l";
                                if (!optJSONObject.has(str)) {
                                    str = "r";
                                }
                                yVar.k(optJSONObject, str, path);
                                canvas2.clipPath(path);
                            }
                            canvas2.drawBitmap(image, (Rect) null, j(optJSONObject, "r", rectF3), yVar.f52897c);
                            canvas2.restore();
                        }
                        kVar = kVar2;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix4 = matrix3;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        JSONArray optJSONArray = optJSONObject.optJSONArray("s");
                        if (optJSONArray == null || optJSONArray.length() < 2) {
                            kVar2 = kVar6;
                            matrix = matrix4;
                        } else {
                            int[] m10 = m(optJSONArray);
                            float[] n10 = n(optJSONArray);
                            kVar2 = kVar6;
                            matrix = matrix4;
                            d(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                            float f16 = fArr3[0];
                            float f17 = fArr3[1];
                            float f18 = fArr3[2];
                            float f19 = fArr3[3];
                            canvas2.save();
                            yVar.b(canvas2, optJSONObject);
                            yVar.k(optJSONObject, "r", path);
                            canvas2.clipPath(path);
                            paint3.setColor(-16777216);
                            if (optInt == 6 && m10.length > 16) {
                                double d = f18 - f16;
                                double d2 = f19 - f17;
                                float hypot = (float) Math.hypot(d, d2);
                                if (hypot > 0.0f) {
                                    canvas2.translate(f16, f17);
                                    canvas2.rotate((float) Math.toDegrees(Math.atan2(d2, d)));
                                    int length = n10.length - 1;
                                    int i17 = m10[0];
                                    paint3.setShader(null);
                                    paint3.setColor(i17);
                                    canvas2.drawRect(-8000.0f, -8000.0f, n10[0] * hypot, 8000.0f, paint3);
                                    Paint paint4 = paint3;
                                    int i18 = 0;
                                    while (i18 < length) {
                                        float f20 = n10[i18] * hypot;
                                        int i19 = i18 + 1;
                                        float f21 = n10[i19] * hypot;
                                        if (f21 > f20) {
                                            int i20 = m10[i18];
                                            if (i20 == m10[i19]) {
                                                paint4.setShader(null);
                                                paint4.setColor(i20);
                                            } else {
                                                paint4.setColor(-16777216);
                                                paint4.setShader(new LinearGradient(f20, 0.0f, f21, 0.0f, m10[i18], m10[i19], Shader.TileMode.CLAMP));
                                            }
                                            Paint paint5 = paint4;
                                            canvas2.drawRect(f20, -8000.0f, f21, 8000.0f, paint5);
                                            paint4 = paint5;
                                        }
                                        i18 = i19;
                                    }
                                    int i21 = m10[length];
                                    paint4.setShader(null);
                                    paint4.setColor(i21);
                                    Paint paint6 = paint4;
                                    canvas2.drawRect(n10[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint6);
                                    paint6.setShader(null);
                                }
                                canvas2.restore();
                            } else {
                                if (optInt == 6) {
                                    paint3.setShader(new LinearGradient(f16, f17, f18, f19, m10, n10, Shader.TileMode.CLAMP));
                                } else if (optInt == 7) {
                                    float max = Math.max(f18, 0.01f);
                                    float max2 = Math.max(f19, 0.01f);
                                    paint3.setShader(new RadialGradient(f16, f17, max, m10, n10, Shader.TileMode.CLAMP));
                                    canvas2.translate(f16, f17);
                                    canvas2.scale(1.0f, max2 / max);
                                    canvas2.translate(-f16, -f17);
                                } else {
                                    paint3.setShader(new SweepGradient(f16, f17, m10, n10));
                                    canvas2.rotate(f18 - 90.0f, f16, f17);
                                }
                                j(optJSONObject, "r", rectF3);
                                canvas2.drawRect(rectF3.left - 4000.0f, rectF3.top - 4000.0f, rectF3.right + 4000.0f, rectF3.bottom + 4000.0f, paint3);
                                paint3.setShader(null);
                                canvas2.restore();
                            }
                        }
                        kVar = kVar2;
                        break;
                    case 9:
                        matrix2 = matrix3;
                        kVar3 = kVar6;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        canvas2.save();
                        arrayList2.add(new Matrix(matrix2));
                        kVar3.f191b++;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("p");
                        if (optJSONObject2 != null) {
                            i(optJSONObject2, path);
                        } else {
                            yVar.k(optJSONObject, "r", path);
                        }
                        canvas2.clipPath(path);
                        matrix = matrix2;
                        kVar = kVar3;
                        break;
                    case 10:
                    case 13:
                        matrix2 = matrix3;
                        kVar3 = kVar6;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        if (kVar3.f191b > 0) {
                            kVar3.q();
                        }
                        matrix = matrix2;
                        kVar = kVar3;
                        break;
                    case 11:
                        matrix2 = matrix3;
                        kVar3 = kVar6;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("p");
                        if (optJSONObject3 != null) {
                            Path path2 = yVar.f52898e;
                            i(optJSONObject3, path2);
                            Shader g10 = yVar.g(optJSONObject3, "g", "ga", "s");
                            if (g10 != null) {
                                paint3.setColor(-16777216);
                                paint3.setShader(g10);
                                canvas2.drawPath(path2, paint3);
                                paint3.setShader(null);
                            } else if (optJSONObject3.has("f") && (((int) optJSONObject3.optLong("f")) >>> 24) != 0) {
                                l((int) optJSONObject3.optLong("f"), paint3);
                                canvas2.drawPath(path2, paint3);
                            }
                            float optDouble2 = (float) optJSONObject3.optDouble("sw");
                            int i22 = (optDouble2 > 0.0f ? 1 : (optDouble2 == 0.0f ? 0 : -1));
                            if (i22 > 0) {
                                shader = yVar.g(optJSONObject3, "sg", "sga", "ss");
                            } else {
                                shader = null;
                            }
                            if (optJSONObject3.has("sc") && (((((int) optJSONObject3.optLong("sc")) >>> 24) != 0 || shader != null) && i22 > 0)) {
                                if (shader != null) {
                                    optLong = -16777216;
                                } else {
                                    optLong = (int) optJSONObject3.optLong("sc");
                                }
                                paint2.setColor(optLong);
                                paint2.setShader(shader);
                                paint2.setStrokeWidth(optDouble2);
                                int optInt2 = optJSONObject3.optInt("lc");
                                int optInt3 = optJSONObject3.optInt("lj");
                                if (optInt2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                    i11 = 2;
                                } else {
                                    i11 = 2;
                                    if (optInt2 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.BUTT;
                                    }
                                }
                                paint2.setStrokeCap(cap);
                                if (optInt3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (optInt3 == i11) {
                                    join = Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.MITER;
                                }
                                paint2.setStrokeJoin(join);
                                paint2.setStrokeMiter((float) optJSONObject3.optDouble("ml", 4.0f));
                                JSONArray optJSONArray2 = optJSONObject3.optJSONArray("d");
                                paint2.setPathEffect(null);
                                if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                                    int length2 = optJSONArray2.length();
                                    if (length2 % 2 == 1) {
                                        i12 = length2 * 2;
                                    } else {
                                        i12 = length2;
                                    }
                                    float[] fArr4 = new float[i12];
                                    int i23 = 0;
                                    float f22 = 0.0f;
                                    while (i23 < i12) {
                                        int i24 = length2;
                                        float max3 = Math.max(0.0f, (float) optJSONArray2.optDouble(i23 % i24));
                                        fArr4[i23] = max3;
                                        f22 += max3;
                                        i23++;
                                        length2 = i24;
                                        i12 = i12;
                                    }
                                    if (f22 > 0.0f) {
                                        paint2.setPathEffect(new DashPathEffect(fArr4, (float) optJSONObject3.optDouble("do")));
                                    }
                                }
                                canvas2.drawPath(path2, paint2);
                                paint2.setPathEffect(null);
                                paint2.setShader(null);
                            }
                        }
                        matrix = matrix2;
                        kVar = kVar3;
                        break;
                    case 12:
                        Matrix matrix5 = matrix3;
                        yVar = yVar2;
                        ArrayList arrayList4 = arrayList2;
                        arrayList = arrayList3;
                        float optDouble3 = (float) optJSONObject.optDouble("o", 1.0d);
                        if (optJSONObject.optInt("h") != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
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
                        Matrix matrix6 = yVar.f52905m;
                        matrix6.setValues(fArr2);
                        if (optDouble3 < 1.0f && !z10) {
                            int round = Math.round(Math.max(0.0f, Math.min(1.0f, optDouble3)) * 255.0f);
                            j(optJSONObject, "r", rectF2);
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
                        arrayList2 = arrayList4;
                        arrayList2.add(new Matrix(matrix5));
                        kVar6.f191b++;
                        canvas2.concat(matrix6);
                        matrix5.preConcat(matrix6);
                        if (z10) {
                            canvas2.clipRect(0, 0, 0, 0);
                            matrix = matrix5;
                            kVar = kVar6;
                            break;
                        } else {
                            matrix = matrix5;
                            kVar = kVar6;
                            break;
                        }
                    case 14:
                        arrayList = arrayList3;
                        d(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                        float f23 = fArr3[0];
                        float f24 = fArr3[1];
                        float max4 = Math.max(fArr3[2], 0.0f);
                        float f25 = fArr3[3];
                        ArrayList arrayList5 = arrayList2;
                        matrix = matrix3;
                        int optLong2 = (int) optJSONObject.optLong("c");
                        j(optJSONObject, "r", rectF2);
                        if (rectF2.isEmpty() || (optLong2 >>> 24) == 0 || ((i13 = Build.VERSION.SDK_INT) < 28 && (max4 / 2.0f) * f10 > 0.5f)) {
                            yVar = this;
                            kVar4 = kVar6;
                        } else {
                            if (optJSONObject.optInt("n") != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            yVar = this;
                            Paint paint7 = yVar.d;
                            paint7.setColor(optLong2);
                            float f26 = (max4 / 2.0f) * f10;
                            if (f26 > 0.5f) {
                                float f27 = ((f26 - 0.5f) / 0.57735f) / f10;
                                f12 = max4;
                                Float valueOf = Float.valueOf(f27);
                                kVar4 = kVar6;
                                HashMap hashMap = yVar.f52906n;
                                blurMaskFilter = (BlurMaskFilter) hashMap.get(valueOf);
                                if (blurMaskFilter == null) {
                                    f11 = f23;
                                    if (hashMap.size() >= 32) {
                                        hashMap.clear();
                                    }
                                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(f27, BlurMaskFilter.Blur.NORMAL);
                                    hashMap.put(Float.valueOf(f27), blurMaskFilter2);
                                    blurMaskFilter = blurMaskFilter2;
                                } else {
                                    f11 = f23;
                                }
                            } else {
                                f11 = f23;
                                f12 = max4;
                                kVar4 = kVar6;
                                blurMaskFilter = null;
                            }
                            paint7.setMaskFilter(blurMaskFilter);
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("q");
                            if (optJSONArray3 == null) {
                                o4 = 0.0f;
                            } else {
                                o4 = o(optJSONArray3);
                            }
                            if (!z11 && o4 >= 0.0f) {
                                float f28 = o4;
                                rectF3.set((rectF2.left - f25) + f11, (rectF2.top - f25) + f24, rectF2.right + f25 + f11, rectF2.bottom + f25 + f24);
                                if (optJSONArray3 != null) {
                                    f13 = Math.max(f28 + f25, 0.0f);
                                } else {
                                    f13 = 0.0f;
                                }
                                canvas2.save();
                                if (i14 == 0) {
                                    if (i13 >= 26) {
                                        canvas2.clipOutRect(rectF2);
                                    } else {
                                        canvas2.clipRect(rectF2, Region.Op.DIFFERENCE);
                                    }
                                } else {
                                    yVar.k(optJSONObject, "r", path);
                                    if (i13 >= 26) {
                                        canvas2.clipOutPath(path);
                                    } else {
                                        canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                    }
                                }
                                if (f13 > 0.0f) {
                                    canvas2.drawRoundRect(rectF3, f13, f13, paint7);
                                } else {
                                    canvas2.drawRect(rectF3, paint7);
                                }
                                canvas2.restore();
                                paint7.setMaskFilter(null);
                            } else {
                                Path path3 = yVar.f52900g;
                                path3.rewind();
                                if (z11) {
                                    float abs = Math.abs(f24) + Math.abs(f11) + Math.abs(f25) + (f12 * 1.5f) + 2.0f;
                                    rectF3.set(rectF2.left - abs, rectF2.top - abs, rectF2.right + abs, rectF2.bottom + abs);
                                    path3.addRect(rectF3, Path.Direction.CW);
                                    rectF3.set(rectF2.left + f25, rectF2.top + f25, rectF2.right - f25, rectF2.bottom - f25);
                                    if (!rectF3.isEmpty()) {
                                        yVar.a(path3, optJSONObject, rectF3, -f25);
                                    }
                                    path3.setFillType(Path.FillType.EVEN_ODD);
                                } else {
                                    rectF3.set(rectF2.left - f25, rectF2.top - f25, rectF2.right + f25, rectF2.bottom + f25);
                                    if (!optJSONObject.has("q")) {
                                        f25 = 0.0f;
                                    }
                                    yVar.a(path3, optJSONObject, rectF3, f25);
                                }
                                path3.offset(f11, f24);
                                canvas2.save();
                                yVar.k(optJSONObject, "r", path);
                                if (z11) {
                                    canvas2.clipPath(path);
                                } else if (i13 >= 26) {
                                    canvas2.clipOutPath(path);
                                } else {
                                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                                }
                                canvas2.drawPath(path3, paint7);
                                canvas2.restore();
                                paint7.setMaskFilter(null);
                            }
                        }
                        arrayList2 = arrayList5;
                        kVar = kVar4;
                        break;
                    case 15:
                        w wVar = new w();
                        wVar.f52888a = (Canvas) kVar6.f192c;
                        wVar.f52889b = kVar6.f191b;
                        arrayList3.add(wVar);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("fl");
                        if (optJSONArray4 != null && optJSONArray4.length() != 0) {
                            j(optJSONObject, "r", rectF2);
                            if (!rectF2.isEmpty()) {
                                arrayList = arrayList3;
                                int i25 = 0;
                                float f29 = 0.0f;
                                float f30 = 0.0f;
                                float f31 = 0.0f;
                                float f32 = 0.0f;
                                while (i25 < optJSONArray4.length()) {
                                    JSONArray optJSONArray5 = optJSONArray4.optJSONArray(i25);
                                    if (optJSONArray5 == null) {
                                        i15 = i25;
                                        fArr = fArr2;
                                        rectF = rectF3;
                                    } else {
                                        i15 = i25;
                                        fArr = fArr2;
                                        rectF = rectF3;
                                        float max5 = Math.max(0.0f, (float) optJSONArray5.optDouble(1));
                                        if (optJSONArray5.optInt(0) == 0) {
                                            float f33 = max5 * 3.0f;
                                            f29 += f33;
                                            f30 += f33;
                                            f31 += f33;
                                            f32 += f33;
                                        } else if (optJSONArray5.optInt(0) == 9) {
                                            float optDouble4 = (float) optJSONArray5.optDouble(2);
                                            float optDouble5 = (float) optJSONArray5.optDouble(3);
                                            float f34 = max5 * 1.5f;
                                            float max6 = Math.max(f29, f34 - optDouble4);
                                            float max7 = Math.max(f31, optDouble4 + f34);
                                            float max8 = Math.max(f30, f34 - optDouble5);
                                            f31 = max7;
                                            f32 = Math.max(f32, f34 + optDouble5);
                                            f29 = max6;
                                            f30 = max8;
                                        }
                                    }
                                    i25 = i15 + 1;
                                    fArr2 = fArr;
                                    rectF3 = rectF;
                                }
                                float[] fArr5 = fArr2;
                                RectF rectF4 = rectF3;
                                rectF2.set(rectF2.left - f29, rectF2.top - f30, rectF2.right + f31, rectF2.bottom + f32);
                                if (Build.VERSION.SDK_INT >= 31 && ((Canvas) kVar6.f192c).isHardwareAccelerated()) {
                                    Canvas b10 = v.b(wVar, rectF2, optJSONArray4, f10);
                                    if (b10 != null) {
                                        kVar6.f192c = b10;
                                        kVar6.f191b = 0;
                                        z12 = false;
                                        matrix = matrix3;
                                        kVar = kVar6;
                                        yVar = this;
                                    }
                                    z12 = false;
                                    matrix = matrix3;
                                    kVar = kVar6;
                                    yVar = this;
                                } else {
                                    matrix3.getValues(fArr5);
                                    if (fArr5[1] == 0.0f && fArr5[3] == 0.0f) {
                                        Matrix matrix7 = wVar.f52893g;
                                        matrix7.set(matrix3);
                                        matrix7.postScale(f10, f10);
                                        matrix7.mapRect(rectF4, rectF2);
                                        int floor = (int) Math.floor(rectF4.left);
                                        int floor2 = (int) Math.floor(rectF4.top);
                                        int ceil = ((int) Math.ceil(rectF4.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF4.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0) {
                                            if (ceil2 * ceil <= 16777216) {
                                                wVar.f52892f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                                wVar.d = floor;
                                                wVar.f52891e = floor2;
                                                wVar.h = Math.abs(fArr5[0]) * f10;
                                                wVar.f52894i = optJSONArray4;
                                                Canvas canvas3 = new Canvas(wVar.f52892f);
                                                canvas3.translate(-floor, -floor2);
                                                canvas3.concat(matrix7);
                                                kVar6.f192c = canvas3;
                                                z12 = false;
                                                kVar6.f191b = 0;
                                                matrix = matrix3;
                                                kVar = kVar6;
                                                yVar = this;
                                            }
                                        }
                                    }
                                    z12 = false;
                                    matrix = matrix3;
                                    kVar = kVar6;
                                    yVar = this;
                                }
                                break;
                            }
                        }
                        arrayList = arrayList3;
                        z12 = false;
                        matrix = matrix3;
                        kVar = kVar6;
                        yVar = this;
                        break;
                    case 16:
                        if (!arrayList3.isEmpty()) {
                            yVar2.h(kVar6, f10);
                        }
                        matrix = matrix3;
                        arrayList = arrayList3;
                        kVar = kVar6;
                        break;
                    case 17:
                        if (z9 && Build.VERSION.SDK_INT >= 31 && canvas2.isHardwareAccelerated()) {
                            v.a(yVar2, kVar6, jSONArray, i10, optJSONObject, xVar, f10);
                            matrix = matrix3;
                            arrayList = arrayList3;
                            yVar = yVar2;
                            kVar = kVar6;
                            break;
                        }
                        break;
                    default:
                        matrix = matrix3;
                        kVar = kVar6;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        break;
                }
                i16 = i10 + 1;
                kVar5 = kVar;
                yVar2 = yVar;
                arrayList3 = arrayList;
                matrix3 = matrix;
            }
            yVar = yVar2;
            i16 = i10 + 1;
            kVar5 = kVar;
            yVar2 = yVar;
            arrayList3 = arrayList;
            matrix3 = matrix;
        }
        y yVar3 = yVar2;
        a4.k kVar7 = kVar5;
        ArrayList arrayList6 = arrayList3;
        while (!arrayList6.isEmpty()) {
            yVar3.h(kVar7, f10);
        }
        while (kVar7.f191b > 0) {
            kVar7.q();
        }
    }

    public final void f(Canvas canvas, JSONArray jSONArray, x xVar, float f10) {
        int i7;
        boolean z9 = false;
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
            int i10 = 0;
            while (true) {
                if (i10 < jSONArray.length()) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null && optJSONObject.optInt("k") == 17) {
                        z9 = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        if (z9) {
            i7 = canvas.saveLayer(null, null);
        } else {
            i7 = -1;
        }
        e(canvas, jSONArray, jSONArray.length(), xVar, f10, true);
        if (z9) {
            canvas.restoreToCount(i7);
        }
    }

    public final Shader g(JSONObject jSONObject, String str, String str2, String str3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str3);
        if (jSONObject.has(str) && optJSONArray != null && optJSONArray.length() >= 4) {
            int[] m10 = m(optJSONArray);
            float[] n10 = n(optJSONArray);
            float[] fArr = this.f52904l;
            d(jSONObject.optJSONArray(str2), fArr, 7, new float[0]);
            if (jSONObject.optInt(str) == 1) {
                return new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], m10, n10, Shader.TileMode.CLAMP);
            }
            return new RadialGradient(fArr[0], fArr[1], Math.max(fArr[4], 0.01f), m10, n10, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final void h(a4.k kVar, float f10) {
        Object obj;
        int i7;
        w wVar = (w) f1.k(1, (ArrayList) kVar.f194f);
        while (true) {
            int i10 = kVar.f191b;
            obj = wVar.f52890c;
            if (obj == null && wVar.f52892f == null) {
                i7 = wVar.f52889b;
            } else {
                i7 = 0;
            }
            if (i10 <= i7) {
                break;
            }
            kVar.q();
        }
        if (obj != null) {
            v.d(wVar, f10);
            kVar.f192c = wVar.f52888a;
        } else {
            Bitmap bitmap = wVar.f52892f;
            if (bitmap != null) {
                WidgetSandboxNative.filterPixels(bitmap, wVar.f52894i.toString().getBytes(StandardCharsets.UTF_8), wVar.h);
                kVar.f192c = wVar.f52888a;
                Matrix matrix = new Matrix();
                if (wVar.f52893g.invert(matrix)) {
                    ((Canvas) kVar.f192c).save();
                    ((Canvas) kVar.f192c).concat(matrix);
                    ((Canvas) kVar.f192c).drawBitmap(wVar.f52892f, wVar.d, wVar.f52891e, this.f52897c);
                    ((Canvas) kVar.f192c).restore();
                }
            }
        }
        kVar.f191b = wVar.f52889b;
    }

    public final void k(JSONObject jSONObject, String str, Path path) {
        RectF rectF = this.h;
        j(jSONObject, str, rectF);
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i7 = 0;
        while (true) {
            float[] fArr = this.f52903k;
            if (i7 < 8) {
                fArr[i7] = (float) optJSONArray.optDouble(i7);
                i7++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }
}
