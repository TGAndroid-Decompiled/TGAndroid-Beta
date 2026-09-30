package x4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
public final class m {
    public static final Matrix f45683p = new Matrix();
    public final Path f45684a;
    public final Path f45685b;
    public final Matrix f45686c;
    public Paint d;
    public Paint e;
    public PathMeasure f45687f;
    public final j f45688g;
    public float h;
    public float f45689i;
    public float f45690j;
    public float f45691k;
    public int f45692l;
    public String f45693m;
    public Boolean f45694n;
    public final a0.f f45695o;

    public m() {
        this.f45686c = new Matrix();
        this.h = 0.0f;
        this.f45689i = 0.0f;
        this.f45690j = 0.0f;
        this.f45691k = 0.0f;
        this.f45692l = 255;
        this.f45693m = null;
        this.f45694n = null;
        this.f45695o = new a0.m(0);
        this.f45688g = new j();
        this.f45684a = new Path();
        this.f45685b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f45672a;
        ArrayList arrayList = jVar.f45673b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f45672a;
        matrix3.preConcat(jVar.f45678j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.f45690j;
                float f13 = i11 / this.f45691k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f45686c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                i12 = i14;
                float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c10], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f7 = Math.abs(f14) / max;
                } else {
                    f7 = 0.0f;
                }
                if (f7 != 0.0f) {
                    Path path = this.f45684a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f45680a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f45685b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f45682c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f45666i;
                        if (f15 != 0.0f || iVar.f45667j != 1.0f) {
                            float f16 = iVar.f45668k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f45667j + f16) % 1.0f;
                            if (this.f45687f == null) {
                                this.f45687f = new PathMeasure();
                            }
                            this.f45687f.setPath(path, false);
                            float length = this.f45687f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f45687f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f45687f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f45687f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = iVar.f45664f;
                        if (((Shader) aVar.f278c) != null || aVar.f277b != 0) {
                            if (this.e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) aVar.f278c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = aVar.f277b;
                                float f21 = iVar.h;
                                PorterDuff.Mode mode = p.f45706s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f45682c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            i13 = 16777215;
                            f11 = 255.0f;
                        }
                        a5.a aVar2 = iVar.d;
                        if (((Shader) aVar2.f278c) != null || aVar2.f277b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f45670m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f45669l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f45671n);
                            Shader shader2 = (Shader) aVar2.f278c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f45665g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f277b;
                                float f22 = iVar.f45665g;
                                PorterDuff.Mode mode2 = p.f45706s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.e * min * f7);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i14 = i12 + 1;
                c10 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f45692l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f45692l = i10;
    }

    public m(m mVar) {
        this.f45686c = new Matrix();
        this.h = 0.0f;
        this.f45689i = 0.0f;
        this.f45690j = 0.0f;
        this.f45691k = 0.0f;
        this.f45692l = 255;
        this.f45693m = null;
        this.f45694n = null;
        ?? mVar2 = new a0.m(0);
        this.f45695o = mVar2;
        this.f45688g = new j(mVar.f45688g, mVar2);
        this.f45684a = new Path(mVar.f45684a);
        this.f45685b = new Path(mVar.f45685b);
        this.h = mVar.h;
        this.f45689i = mVar.f45689i;
        this.f45690j = mVar.f45690j;
        this.f45691k = mVar.f45691k;
        this.f45692l = mVar.f45692l;
        this.f45693m = mVar.f45693m;
        String str = mVar.f45693m;
        if (str != null) {
            mVar2.put(str, this);
        }
        this.f45694n = mVar.f45694n;
    }
}
