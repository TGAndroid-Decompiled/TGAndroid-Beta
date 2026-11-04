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
    public final Paint f52986a = new Paint(1);
    public final Paint f52987b;
    public final Paint f52988c;
    public final Paint d;
    public final Path f52989e;
    public final Path f52990f;
    public final Path f52991g;
    public final RectF h;
    public final RectF f52992i;
    public final RectF f52993j;
    public final float[] f52994k;
    public final float[] f52995l;
    public final Matrix f52996m;
    public final HashMap f52997n;
    public final IdentityHashMap f52998o;
    public final float[] f52999p;

    public y() {
        Paint paint = new Paint(1);
        this.f52987b = paint;
        this.f52988c = new Paint(2);
        this.d = new Paint(1);
        this.f52989e = new Path();
        this.f52990f = new Path();
        this.f52991g = new Path();
        this.h = new RectF();
        this.f52992i = new RectF();
        this.f52993j = new RectF();
        this.f52994k = new float[8];
        this.f52995l = new float[8];
        this.f52996m = new Matrix();
        this.f52997n = new HashMap();
        this.f52998o = new IdentityHashMap();
        this.f52999p = new float[9];
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void d(JSONArray jSONArray, float[] fArr, int i3, float... fArr2) {
        float f10;
        for (int i10 = 0; i10 < i3; i10++) {
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
        int i3;
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
                i3 = 6;
            } else if (optInt == 2) {
                i3 = 4;
            } else if (optInt == 4) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            int i12 = i10 + i3;
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

    public static void l(int i3, Paint paint) {
        paint.setShader(null);
        paint.setColor(i3);
    }

    public static int[] m(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        int[] iArr = new int[Math.max(2, length)];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = (int) jSONArray.optLong((i3 * 2) + 1);
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
        for (int i3 = 0; i3 < length; i3++) {
            fArr[i3] = Math.max(0.0f, Math.min(1.0f, (float) jSONArray.optDouble(i3 * 2)));
        }
        return fArr;
    }

    public static float o(JSONArray jSONArray) {
        if (jSONArray.length() >= 8) {
            double optDouble = jSONArray.optDouble(0);
            for (int i3 = 1; i3 < 8; i3++) {
                if (jSONArray.optDouble(i3) != optDouble) {
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
        int i3 = 0;
        while (true) {
            float[] fArr = this.f52994k;
            if (i3 < 8) {
                fArr[i3] = Math.max(((float) optJSONArray.optDouble(i3)) + f10, 0.0f);
                i3++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void b(Canvas canvas, JSONObject jSONObject) {
        if (jSONObject.has("l")) {
            canvas.clipRect(j(jSONObject, "l", this.f52992i));
        }
    }

    public final void c(Canvas canvas, JSONObject jSONObject, Paint paint) {
        float o10;
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            o10 = 0.0f;
        } else {
            o10 = o(optJSONArray);
        }
        int i3 = (o10 > 0.0f ? 1 : (o10 == 0.0f ? 0 : -1));
        RectF rectF = this.h;
        if (i3 == 0) {
            canvas.drawRect(j(jSONObject, "r", rectF), paint);
        } else if (i3 > 0) {
            canvas.drawRoundRect(j(jSONObject, "r", rectF), o10, o10, paint);
        } else {
            Path path = this.f52989e;
            k(jSONObject, "r", path);
            canvas.drawPath(path, paint);
        }
    }

    public final void e(Canvas canvas, JSONArray jSONArray, int i3, x xVar, float f10, boolean z10) {
        int i10;
        e0.e0 e0Var;
        Matrix matrix;
        ArrayList arrayList;
        y yVar;
        Paint paint;
        e0.e0 e0Var2;
        Bitmap image;
        String str;
        Matrix matrix2;
        e0.e0 e0Var3;
        int i11;
        Paint.Cap cap;
        Paint.Join join;
        e0.e0 e0Var4;
        int i12;
        float f11;
        float f12;
        BlurMaskFilter blurMaskFilter;
        int i13;
        boolean z11;
        int i14;
        float[] fArr;
        RectF rectF;
        y yVar2 = this;
        e0.e0 e0Var5 = new e0.e0(canvas);
        ArrayList arrayList2 = (ArrayList) e0Var5.f9227e;
        Matrix matrix3 = (Matrix) e0Var5.d;
        ArrayList arrayList3 = (ArrayList) e0Var5.f9228f;
        int i15 = 0;
        while (i15 < i3) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i15);
            if (optJSONObject == null) {
                e0Var = e0Var5;
                i10 = i15;
                matrix = matrix3;
                arrayList = arrayList3;
            } else {
                Canvas canvas2 = (Canvas) e0Var5.f9226c;
                int optInt = optJSONObject.optInt("k");
                e0.e0 e0Var6 = e0Var5;
                float[] fArr2 = yVar2.f52999p;
                i10 = i15;
                float[] fArr3 = yVar2.f52995l;
                Paint paint2 = yVar2.f52987b;
                Path path = yVar2.f52990f;
                RectF rectF2 = yVar2.f52993j;
                Paint paint3 = yVar2.f52986a;
                RectF rectF3 = yVar2.h;
                switch (optInt) {
                    case 0:
                        e0Var = e0Var6;
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
                        e0Var = e0Var6;
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
                        e0Var = e0Var6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        l((int) optJSONObject.optLong("c"), paint3);
                        canvas2.drawOval(j(optJSONObject, "r", rectF3), paint3);
                        break;
                    case 3:
                        e0Var = e0Var6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        float optDouble = (float) optJSONObject.optDouble("w", 1.0d);
                        float f13 = optDouble / 2.0f;
                        j(optJSONObject, "r", rectF3).inset(f13, f13);
                        paint2.setColor((int) optJSONObject.optLong("c"));
                        paint2.setStrokeWidth(optDouble);
                        paint2.setStrokeCap(Paint.Cap.BUTT);
                        paint2.setStrokeJoin(Paint.Join.MITER);
                        paint2.setPathEffect(null);
                        canvas2.drawOval(rectF3, paint2);
                        break;
                    case 4:
                        e0Var = e0Var6;
                        matrix = matrix3;
                        arrayList = arrayList3;
                        yVar = yVar2;
                        Paint deviceFont = xVar.deviceFont(optJSONObject.optInt("f"));
                        if (deviceFont == null) {
                            paint = null;
                        } else {
                            IdentityHashMap identityHashMap = yVar.f52998o;
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
                            float f14 = 1.0f / f10;
                            canvas2.scale(f14, f14);
                            canvas2.drawText(optJSONObject.optString("t"), ((float) optJSONObject.optDouble("x")) * f10, ((float) optJSONObject.optDouble("y")) * f10, paint);
                            canvas2.restore();
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        e0Var2 = e0Var6;
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
                                str = "l";
                                yVar.k(optJSONObject, optJSONObject.has(str) ? "l" : "r", path);
                                canvas2.clipPath(path);
                            }
                            canvas2.drawBitmap(image, (Rect) null, j(optJSONObject, "r", rectF3), yVar.f52988c);
                            canvas2.restore();
                        }
                        e0Var = e0Var2;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix4 = matrix3;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        JSONArray optJSONArray = optJSONObject.optJSONArray("s");
                        if (optJSONArray == null || optJSONArray.length() < 2) {
                            e0Var2 = e0Var6;
                            matrix = matrix4;
                        } else {
                            int[] m10 = m(optJSONArray);
                            float[] n4 = n(optJSONArray);
                            e0Var2 = e0Var6;
                            matrix = matrix4;
                            d(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                            float f15 = fArr3[0];
                            float f16 = fArr3[1];
                            float f17 = fArr3[2];
                            float f18 = fArr3[3];
                            canvas2.save();
                            yVar.b(canvas2, optJSONObject);
                            yVar.k(optJSONObject, "r", path);
                            canvas2.clipPath(path);
                            paint3.setColor(-16777216);
                            if (optInt == 6 && m10.length > 16) {
                                double d = f17 - f15;
                                double d10 = f18 - f16;
                                float hypot = (float) Math.hypot(d, d10);
                                if (hypot > 0.0f) {
                                    canvas2.translate(f15, f16);
                                    canvas2.rotate((float) Math.toDegrees(Math.atan2(d10, d)));
                                    int length = n4.length - 1;
                                    int i16 = m10[0];
                                    paint3.setShader(null);
                                    paint3.setColor(i16);
                                    canvas2.drawRect(-8000.0f, -8000.0f, n4[0] * hypot, 8000.0f, paint3);
                                    Paint paint4 = paint3;
                                    int i17 = 0;
                                    while (i17 < length) {
                                        float f19 = n4[i17] * hypot;
                                        int i18 = i17 + 1;
                                        float f20 = n4[i18] * hypot;
                                        if (f20 > f19) {
                                            int i19 = m10[i17];
                                            if (i19 == m10[i18]) {
                                                paint4.setShader(null);
                                                paint4.setColor(i19);
                                            } else {
                                                paint4.setColor(-16777216);
                                                paint4.setShader(new LinearGradient(f19, 0.0f, f20, 0.0f, m10[i17], m10[i18], Shader.TileMode.CLAMP));
                                            }
                                            Paint paint5 = paint4;
                                            canvas2.drawRect(f19, -8000.0f, f20, 8000.0f, paint5);
                                            paint4 = paint5;
                                        }
                                        i17 = i18;
                                    }
                                    int i20 = m10[length];
                                    paint4.setShader(null);
                                    paint4.setColor(i20);
                                    Paint paint6 = paint4;
                                    canvas2.drawRect(n4[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint6);
                                    paint6.setShader(null);
                                }
                                canvas2.restore();
                            } else {
                                if (optInt == 6) {
                                    paint3.setShader(new LinearGradient(f15, f16, f17, f18, m10, n4, Shader.TileMode.CLAMP));
                                } else if (optInt == 7) {
                                    float max = Math.max(f17, 0.01f);
                                    float max2 = Math.max(f18, 0.01f);
                                    paint3.setShader(new RadialGradient(f15, f16, max, m10, n4, Shader.TileMode.CLAMP));
                                    canvas2.translate(f15, f16);
                                    canvas2.scale(1.0f, max2 / max);
                                    canvas2.translate(-f15, -f16);
                                } else {
                                    paint3.setShader(new SweepGradient(f15, f16, m10, n4));
                                    canvas2.rotate(f17 - 90.0f, f15, f16);
                                }
                                j(optJSONObject, "r", rectF3);
                                canvas2.drawRect(rectF3.left - 4000.0f, rectF3.top - 4000.0f, rectF3.right + 4000.0f, rectF3.bottom + 4000.0f, paint3);
                                paint3.setShader(null);
                                canvas2.restore();
                            }
                        }
                        e0Var = e0Var2;
                        break;
                    case 9:
                        matrix2 = matrix3;
                        e0Var3 = e0Var6;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        canvas2.save();
                        arrayList2.add(new Matrix(matrix2));
                        e0Var3.f9225b++;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("p");
                        if (optJSONObject2 != null) {
                            i(optJSONObject2, path);
                        } else {
                            yVar.k(optJSONObject, "r", path);
                        }
                        canvas2.clipPath(path);
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 10:
                    case 13:
                        matrix2 = matrix3;
                        e0Var3 = e0Var6;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        if (e0Var3.f9225b > 0) {
                            e0Var3.q();
                        }
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 11:
                        matrix2 = matrix3;
                        e0Var3 = e0Var6;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("p");
                        if (optJSONObject3 != null) {
                            Path path2 = yVar.f52989e;
                            i(optJSONObject3, path2);
                            Shader g7 = yVar.g(optJSONObject3, "g", "ga", "s");
                            if (g7 != null) {
                                paint3.setColor(-16777216);
                                paint3.setShader(g7);
                                canvas2.drawPath(path2, paint3);
                                paint3.setShader(null);
                            } else if (optJSONObject3.has("f") && (((int) optJSONObject3.optLong("f")) >>> 24) != 0) {
                                l((int) optJSONObject3.optLong("f"), paint3);
                                canvas2.drawPath(path2, paint3);
                            }
                            float optDouble2 = (float) optJSONObject3.optDouble("sw");
                            int i21 = (optDouble2 > 0.0f ? 1 : (optDouble2 == 0.0f ? 0 : -1));
                            Shader g10 = i21 > 0 ? yVar.g(optJSONObject3, "sg", "sga", "ss") : null;
                            if (optJSONObject3.has("sc") && (((((int) optJSONObject3.optLong("sc")) >>> 24) != 0 || g10 != null) && i21 > 0)) {
                                paint2.setColor(g10 != null ? -16777216 : (int) optJSONObject3.optLong("sc"));
                                paint2.setShader(g10);
                                paint2.setStrokeWidth(optDouble2);
                                int optInt2 = optJSONObject3.optInt("lc");
                                int optInt3 = optJSONObject3.optInt("lj");
                                if (optInt2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                    i11 = 2;
                                } else {
                                    i11 = 2;
                                    cap = optInt2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                                }
                                paint2.setStrokeCap(cap);
                                if (optInt3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else {
                                    join = optInt3 == i11 ? Paint.Join.BEVEL : Paint.Join.MITER;
                                }
                                paint2.setStrokeJoin(join);
                                paint2.setStrokeMiter((float) optJSONObject3.optDouble("ml", 4.0f));
                                JSONArray optJSONArray2 = optJSONObject3.optJSONArray("d");
                                paint2.setPathEffect(null);
                                if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                                    int length2 = optJSONArray2.length();
                                    int i22 = length2 % 2 == 1 ? length2 * 2 : length2;
                                    float[] fArr4 = new float[i22];
                                    int i23 = 0;
                                    float f21 = 0.0f;
                                    while (i23 < i22) {
                                        int i24 = length2;
                                        float max3 = Math.max(0.0f, (float) optJSONArray2.optDouble(i23 % i24));
                                        fArr4[i23] = max3;
                                        f21 += max3;
                                        i23++;
                                        length2 = i24;
                                        i22 = i22;
                                    }
                                    if (f21 > 0.0f) {
                                        paint2.setPathEffect(new DashPathEffect(fArr4, (float) optJSONObject3.optDouble("do")));
                                    }
                                }
                                canvas2.drawPath(path2, paint2);
                                paint2.setPathEffect(null);
                                paint2.setShader(null);
                            }
                        }
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 12:
                        Matrix matrix5 = matrix3;
                        yVar = yVar2;
                        ArrayList arrayList4 = arrayList2;
                        arrayList = arrayList3;
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
                        Matrix matrix6 = yVar.f52996m;
                        matrix6.setValues(fArr2);
                        if (optDouble3 < 1.0f && !z12) {
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
                        e0Var6.f9225b++;
                        canvas2.concat(matrix6);
                        matrix5.preConcat(matrix6);
                        if (!z12) {
                            matrix = matrix5;
                            e0Var = e0Var6;
                            break;
                        } else {
                            canvas2.clipRect(0, 0, 0, 0);
                            matrix = matrix5;
                            e0Var = e0Var6;
                            break;
                        }
                    case 14:
                        arrayList = arrayList3;
                        d(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                        float f22 = fArr3[0];
                        float f23 = fArr3[1];
                        float max4 = Math.max(fArr3[2], 0.0f);
                        float f24 = fArr3[3];
                        ArrayList arrayList5 = arrayList2;
                        matrix = matrix3;
                        int optLong = (int) optJSONObject.optLong("c");
                        j(optJSONObject, "r", rectF2);
                        if (rectF2.isEmpty() || (optLong >>> 24) == 0 || ((i12 = Build.VERSION.SDK_INT) < 28 && (max4 / 2.0f) * f10 > 0.5f)) {
                            yVar = this;
                            e0Var4 = e0Var6;
                        } else {
                            boolean z13 = optJSONObject.optInt("n") != 0;
                            yVar = this;
                            Paint paint7 = yVar.d;
                            paint7.setColor(optLong);
                            float f25 = (max4 / 2.0f) * f10;
                            if (f25 > 0.5f) {
                                float f26 = ((f25 - 0.5f) / 0.57735f) / f10;
                                f12 = max4;
                                Float valueOf = Float.valueOf(f26);
                                e0Var4 = e0Var6;
                                HashMap hashMap = yVar.f52997n;
                                blurMaskFilter = (BlurMaskFilter) hashMap.get(valueOf);
                                if (blurMaskFilter == null) {
                                    f11 = f22;
                                    if (hashMap.size() >= 32) {
                                        hashMap.clear();
                                    }
                                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(f26, BlurMaskFilter.Blur.NORMAL);
                                    hashMap.put(Float.valueOf(f26), blurMaskFilter2);
                                    blurMaskFilter = blurMaskFilter2;
                                } else {
                                    f11 = f22;
                                }
                            } else {
                                f11 = f22;
                                f12 = max4;
                                e0Var4 = e0Var6;
                                blurMaskFilter = null;
                            }
                            paint7.setMaskFilter(blurMaskFilter);
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("q");
                            float o10 = optJSONArray3 == null ? 0.0f : o(optJSONArray3);
                            if (!z13 && o10 >= 0.0f) {
                                float f27 = o10;
                                rectF3.set((rectF2.left - f24) + f11, (rectF2.top - f24) + f23, rectF2.right + f24 + f11, rectF2.bottom + f24 + f23);
                                float max5 = optJSONArray3 != null ? Math.max(f27 + f24, 0.0f) : 0.0f;
                                canvas2.save();
                                if (i13 != 0) {
                                    yVar.k(optJSONObject, "r", path);
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
                                if (max5 > 0.0f) {
                                    canvas2.drawRoundRect(rectF3, max5, max5, paint7);
                                } else {
                                    canvas2.drawRect(rectF3, paint7);
                                }
                                canvas2.restore();
                                paint7.setMaskFilter(null);
                            } else {
                                Path path3 = yVar.f52991g;
                                path3.rewind();
                                if (z13) {
                                    float abs = Math.abs(f23) + Math.abs(f11) + Math.abs(f24) + (f12 * 1.5f) + 2.0f;
                                    rectF3.set(rectF2.left - abs, rectF2.top - abs, rectF2.right + abs, rectF2.bottom + abs);
                                    path3.addRect(rectF3, Path.Direction.CW);
                                    rectF3.set(rectF2.left + f24, rectF2.top + f24, rectF2.right - f24, rectF2.bottom - f24);
                                    if (!rectF3.isEmpty()) {
                                        yVar.a(path3, optJSONObject, rectF3, -f24);
                                    }
                                    path3.setFillType(Path.FillType.EVEN_ODD);
                                } else {
                                    rectF3.set(rectF2.left - f24, rectF2.top - f24, rectF2.right + f24, rectF2.bottom + f24);
                                    if (!optJSONObject.has("q")) {
                                        f24 = 0.0f;
                                    }
                                    yVar.a(path3, optJSONObject, rectF3, f24);
                                }
                                path3.offset(f11, f23);
                                canvas2.save();
                                yVar.k(optJSONObject, "r", path);
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
                        arrayList2 = arrayList5;
                        e0Var = e0Var4;
                        break;
                    case 15:
                        w wVar = new w();
                        wVar.f52979a = (Canvas) e0Var6.f9226c;
                        wVar.f52980b = e0Var6.f9225b;
                        arrayList3.add(wVar);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("fl");
                        if (optJSONArray4 != null && optJSONArray4.length() != 0) {
                            j(optJSONObject, "r", rectF2);
                            if (!rectF2.isEmpty()) {
                                arrayList = arrayList3;
                                int i25 = 0;
                                float f28 = 0.0f;
                                float f29 = 0.0f;
                                float f30 = 0.0f;
                                float f31 = 0.0f;
                                while (i25 < optJSONArray4.length()) {
                                    JSONArray optJSONArray5 = optJSONArray4.optJSONArray(i25);
                                    if (optJSONArray5 == null) {
                                        i14 = i25;
                                        fArr = fArr2;
                                        rectF = rectF3;
                                    } else {
                                        i14 = i25;
                                        fArr = fArr2;
                                        rectF = rectF3;
                                        float max6 = Math.max(0.0f, (float) optJSONArray5.optDouble(1));
                                        if (optJSONArray5.optInt(0) == 0) {
                                            float f32 = max6 * 3.0f;
                                            f28 += f32;
                                            f29 += f32;
                                            f30 += f32;
                                            f31 += f32;
                                        } else if (optJSONArray5.optInt(0) == 9) {
                                            float optDouble4 = (float) optJSONArray5.optDouble(2);
                                            float optDouble5 = (float) optJSONArray5.optDouble(3);
                                            float f33 = max6 * 1.5f;
                                            float max7 = Math.max(f28, f33 - optDouble4);
                                            float max8 = Math.max(f30, optDouble4 + f33);
                                            float max9 = Math.max(f29, f33 - optDouble5);
                                            f30 = max8;
                                            f31 = Math.max(f31, f33 + optDouble5);
                                            f28 = max7;
                                            f29 = max9;
                                        }
                                    }
                                    i25 = i14 + 1;
                                    fArr2 = fArr;
                                    rectF3 = rectF;
                                }
                                float[] fArr5 = fArr2;
                                RectF rectF4 = rectF3;
                                rectF2.set(rectF2.left - f28, rectF2.top - f29, rectF2.right + f30, rectF2.bottom + f31);
                                if (Build.VERSION.SDK_INT >= 31 && ((Canvas) e0Var6.f9226c).isHardwareAccelerated()) {
                                    Canvas b10 = v.b(wVar, rectF2, optJSONArray4, f10);
                                    if (b10 != null) {
                                        e0Var6.f9226c = b10;
                                        e0Var6.f9225b = 0;
                                        z11 = false;
                                        matrix = matrix3;
                                        e0Var = e0Var6;
                                        yVar = this;
                                    }
                                    z11 = false;
                                    matrix = matrix3;
                                    e0Var = e0Var6;
                                    yVar = this;
                                } else {
                                    matrix3.getValues(fArr5);
                                    if (fArr5[1] == 0.0f && fArr5[3] == 0.0f) {
                                        Matrix matrix7 = wVar.f52984g;
                                        matrix7.set(matrix3);
                                        matrix7.postScale(f10, f10);
                                        matrix7.mapRect(rectF4, rectF2);
                                        int floor = (int) Math.floor(rectF4.left);
                                        int floor2 = (int) Math.floor(rectF4.top);
                                        int ceil = ((int) Math.ceil(rectF4.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF4.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0) {
                                            if (ceil2 * ceil <= 16777216) {
                                                wVar.f52983f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                                wVar.d = floor;
                                                wVar.f52982e = floor2;
                                                wVar.h = Math.abs(fArr5[0]) * f10;
                                                wVar.f52985i = optJSONArray4;
                                                Canvas canvas3 = new Canvas(wVar.f52983f);
                                                canvas3.translate(-floor, -floor2);
                                                canvas3.concat(matrix7);
                                                e0Var6.f9226c = canvas3;
                                                z11 = false;
                                                e0Var6.f9225b = 0;
                                                matrix = matrix3;
                                                e0Var = e0Var6;
                                                yVar = this;
                                            }
                                        }
                                    }
                                    z11 = false;
                                    matrix = matrix3;
                                    e0Var = e0Var6;
                                    yVar = this;
                                }
                                break;
                            }
                        }
                        arrayList = arrayList3;
                        z11 = false;
                        matrix = matrix3;
                        e0Var = e0Var6;
                        yVar = this;
                        break;
                    case 16:
                        if (!arrayList3.isEmpty()) {
                            yVar2.h(e0Var6, f10);
                        }
                        matrix = matrix3;
                        arrayList = arrayList3;
                        e0Var = e0Var6;
                        break;
                    case 17:
                        if (z10 && Build.VERSION.SDK_INT >= 31 && canvas2.isHardwareAccelerated()) {
                            v.a(yVar2, e0Var6, jSONArray, i10, optJSONObject, xVar, f10);
                            matrix = matrix3;
                            arrayList = arrayList3;
                            yVar = yVar2;
                            e0Var = e0Var6;
                            break;
                        }
                        break;
                    default:
                        matrix = matrix3;
                        e0Var = e0Var6;
                        yVar = yVar2;
                        arrayList = arrayList3;
                        break;
                }
                i15 = i10 + 1;
                e0Var5 = e0Var;
                yVar2 = yVar;
                arrayList3 = arrayList;
                matrix3 = matrix;
            }
            yVar = yVar2;
            i15 = i10 + 1;
            e0Var5 = e0Var;
            yVar2 = yVar;
            arrayList3 = arrayList;
            matrix3 = matrix;
        }
        y yVar3 = yVar2;
        e0.e0 e0Var7 = e0Var5;
        ArrayList arrayList6 = arrayList3;
        while (!arrayList6.isEmpty()) {
            yVar3.h(e0Var7, f10);
        }
        while (e0Var7.f9225b > 0) {
            e0Var7.q();
        }
    }

    public final void f(Canvas canvas, JSONArray jSONArray, x xVar, float f10) {
        int i3;
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
            int i10 = 0;
            while (true) {
                if (i10 < jSONArray.length()) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null && optJSONObject.optInt("k") == 17) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        if (z10) {
            i3 = canvas.saveLayer(null, null);
        } else {
            i3 = -1;
        }
        e(canvas, jSONArray, jSONArray.length(), xVar, f10, true);
        if (z10) {
            canvas.restoreToCount(i3);
        }
    }

    public final Shader g(JSONObject jSONObject, String str, String str2, String str3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str3);
        if (jSONObject.has(str) && optJSONArray != null && optJSONArray.length() >= 4) {
            int[] m10 = m(optJSONArray);
            float[] n4 = n(optJSONArray);
            float[] fArr = this.f52995l;
            d(jSONObject.optJSONArray(str2), fArr, 7, new float[0]);
            if (jSONObject.optInt(str) == 1) {
                return new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], m10, n4, Shader.TileMode.CLAMP);
            }
            return new RadialGradient(fArr[0], fArr[1], Math.max(fArr[4], 0.01f), m10, n4, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final void h(e0.e0 e0Var, float f10) {
        Object obj;
        int i3;
        w wVar = (w) f1.o(1, (ArrayList) e0Var.f9228f);
        while (true) {
            int i10 = e0Var.f9225b;
            obj = wVar.f52981c;
            if (obj == null && wVar.f52983f == null) {
                i3 = wVar.f52980b;
            } else {
                i3 = 0;
            }
            if (i10 <= i3) {
                break;
            }
            e0Var.q();
        }
        if (obj != null) {
            v.d(wVar, f10);
            e0Var.f9226c = wVar.f52979a;
        } else {
            Bitmap bitmap = wVar.f52983f;
            if (bitmap != null) {
                WidgetSandboxNative.filterPixels(bitmap, wVar.f52985i.toString().getBytes(StandardCharsets.UTF_8), wVar.h);
                e0Var.f9226c = wVar.f52979a;
                Matrix matrix = new Matrix();
                if (wVar.f52984g.invert(matrix)) {
                    ((Canvas) e0Var.f9226c).save();
                    ((Canvas) e0Var.f9226c).concat(matrix);
                    ((Canvas) e0Var.f9226c).drawBitmap(wVar.f52983f, wVar.d, wVar.f52982e, this.f52988c);
                    ((Canvas) e0Var.f9226c).restore();
                }
            }
        }
        e0Var.f9225b = wVar.f52980b;
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
        int i3 = 0;
        while (true) {
            float[] fArr = this.f52994k;
            if (i3 < 8) {
                fArr[i3] = (float) optJSONArray.optDouble(i3);
                i3++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }
}
