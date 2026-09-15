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
    public static final Matrix f45297p = new Matrix();
    public final Path f45298a;
    public final Path f45299b;
    public final Matrix f45300c;
    public Paint d;
    public Paint e;
    public PathMeasure f45301f;
    public final j f45302g;
    public float h;
    public float f45303i;
    public float f45304j;
    public float f45305k;
    public int f45306l;
    public String f45307m;
    public Boolean f45308n;
    public final a0.f f45309o;

    public m() {
        this.f45300c = new Matrix();
        this.h = 0.0f;
        this.f45303i = 0.0f;
        this.f45304j = 0.0f;
        this.f45305k = 0.0f;
        this.f45306l = 255;
        this.f45307m = null;
        this.f45308n = null;
        this.f45309o = new a0.l(0);
        this.f45302g = new j();
        this.f45298a = new Path();
        this.f45299b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f45286a;
        ArrayList arrayList = jVar.f45287b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f45286a;
        matrix3.preConcat(jVar.f45292j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.f45304j;
                float f13 = i11 / this.f45305k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f45300c;
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
                    Path path = this.f45298a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f45294a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f45299b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f45296c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f45280i;
                        if (f15 != 0.0f || iVar.f45281j != 1.0f) {
                            float f16 = iVar.f45282k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f45281j + f16) % 1.0f;
                            if (this.f45301f == null) {
                                this.f45301f = new PathMeasure();
                            }
                            this.f45301f.setPath(path, false);
                            float length = this.f45301f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f45301f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f45301f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f45301f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = iVar.f45278f;
                        if (((Shader) aVar.f276c) != null || aVar.f275b != 0) {
                            if (this.e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) aVar.f276c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = aVar.f275b;
                                float f21 = iVar.h;
                                PorterDuff.Mode mode = p.f45320s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f45296c == 0) {
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
                        if (((Shader) aVar2.f276c) != null || aVar2.f275b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f45284m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f45283l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f45285n);
                            Shader shader2 = (Shader) aVar2.f276c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f45279g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f275b;
                                float f22 = iVar.f45279g;
                                PorterDuff.Mode mode2 = p.f45320s;
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
        return this.f45306l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f45306l = i10;
    }

    public m(m mVar) {
        this.f45300c = new Matrix();
        this.h = 0.0f;
        this.f45303i = 0.0f;
        this.f45304j = 0.0f;
        this.f45305k = 0.0f;
        this.f45306l = 255;
        this.f45307m = null;
        this.f45308n = null;
        ?? lVar = new a0.l(0);
        this.f45309o = lVar;
        this.f45302g = new j(mVar.f45302g, lVar);
        this.f45298a = new Path(mVar.f45298a);
        this.f45299b = new Path(mVar.f45299b);
        this.h = mVar.h;
        this.f45303i = mVar.f45303i;
        this.f45304j = mVar.f45304j;
        this.f45305k = mVar.f45305k;
        this.f45306l = mVar.f45306l;
        this.f45307m = mVar.f45307m;
        String str = mVar.f45307m;
        if (str != null) {
            lVar.put(str, this);
        }
        this.f45308n = mVar.f45308n;
    }
}
