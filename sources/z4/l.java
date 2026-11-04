package z4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import b8.kg;
import java.util.ArrayList;
public final class l {
    public static final Matrix f59733p = new Matrix();
    public final Path f59734a;
    public final Path f59735b;
    public final Matrix f59736c;
    public Paint d;
    public Paint f59737e;
    public PathMeasure f59738f;
    public final i f59739g;
    public float h;
    public float f59740i;
    public float f59741j;
    public float f59742k;
    public int f59743l;
    public String f59744m;
    public Boolean f59745n;
    public final a0.f f59746o;

    public l() {
        this.f59736c = new Matrix();
        this.h = 0.0f;
        this.f59740i = 0.0f;
        this.f59741j = 0.0f;
        this.f59742k = 0.0f;
        this.f59743l = 255;
        this.f59744m = null;
        this.f59745n = null;
        this.f59746o = new a0.l(0);
        this.f59739g = new i();
        this.f59734a = new Path();
        this.f59735b = new Path();
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i3, int i10) {
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = iVar.f59721a;
        ArrayList arrayList = iVar.f59722b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f59721a;
        matrix3.preConcat(iVar.f59728j);
        canvas.save();
        char c2 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            j jVar = (j) arrayList.get(i13);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i3, i10);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f13 = i3 / this.f59741j;
                float f14 = i10 / this.f59742k;
                float min = Math.min(f13, f14);
                Matrix matrix4 = this.f59736c;
                matrix4.set(matrix3);
                matrix4.postScale(f13, f14);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z10 = c2;
                i11 = i13;
                float f15 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c2], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f10 = Math.abs(f15) / max;
                } else {
                    f10 = 0.0f;
                }
                if (f10 != 0.0f) {
                    Path path = this.f59734a;
                    path.reset();
                    i0.d[] dVarArr = kVar.f59730a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f59735b;
                    path2.reset();
                    if (kVar instanceof g) {
                        if (kVar.f59732c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f16 = hVar.f59715i;
                        if (f16 != 0.0f || hVar.f59716j != 1.0f) {
                            float f17 = hVar.f59717k;
                            float f18 = (f16 + f17) % 1.0f;
                            float f19 = (hVar.f59716j + f17) % 1.0f;
                            if (this.f59738f == null) {
                                this.f59738f = new PathMeasure();
                            }
                            this.f59738f.setPath(path, z10);
                            float length = this.f59738f.getLength();
                            float f20 = f18 * length;
                            float f21 = f19 * length;
                            path.reset();
                            if (f20 > f21) {
                                this.f59738f.getSegment(f20, length, path, true);
                                f11 = 0.0f;
                                this.f59738f.getSegment(0.0f, f21, path, true);
                            } else {
                                f11 = 0.0f;
                                this.f59738f.getSegment(f20, f21, path, true);
                            }
                            path.rLineTo(f11, f11);
                        }
                        path2.addPath(path, matrix4);
                        kg kgVar = hVar.f59713f;
                        if (((Shader) kgVar.f2723c) != null || kgVar.f2722b != 0) {
                            if (this.f59737e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.f59737e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.f59737e;
                            Shader shader = (Shader) kgVar.f2723c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(hVar.h * 255.0f));
                                f12 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i14 = kgVar.f2722b;
                                float f22 = hVar.h;
                                PorterDuff.Mode mode = o.f59758w;
                                f12 = 255.0f;
                                paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f22)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (hVar.f59732c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f12 = 255.0f;
                            i12 = 16777215;
                        }
                        kg kgVar2 = hVar.d;
                        if (((Shader) kgVar2.f2723c) != null || kgVar2.f2722b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = hVar.f59719m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.f59718l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.f59720n);
                            Shader shader2 = (Shader) kgVar2.f2723c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.f59714g * f12));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i15 = kgVar2.f2722b;
                                float f23 = hVar.f59714g;
                                PorterDuff.Mode mode2 = o.f59758w;
                                paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f23)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(hVar.f59712e * min * f10);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i13 = i11 + 1;
                c2 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c2 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f59743l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i3) {
        this.f59743l = i3;
    }

    public l(l lVar) {
        this.f59736c = new Matrix();
        this.h = 0.0f;
        this.f59740i = 0.0f;
        this.f59741j = 0.0f;
        this.f59742k = 0.0f;
        this.f59743l = 255;
        this.f59744m = null;
        this.f59745n = null;
        ?? lVar2 = new a0.l(0);
        this.f59746o = lVar2;
        this.f59739g = new i(lVar.f59739g, lVar2);
        this.f59734a = new Path(lVar.f59734a);
        this.f59735b = new Path(lVar.f59735b);
        this.h = lVar.h;
        this.f59740i = lVar.f59740i;
        this.f59741j = lVar.f59741j;
        this.f59742k = lVar.f59742k;
        this.f59743l = lVar.f59743l;
        this.f59744m = lVar.f59744m;
        String str = lVar.f59744m;
        if (str != null) {
            lVar2.put(str, this);
        }
        this.f59745n = lVar.f59745n;
    }
}
