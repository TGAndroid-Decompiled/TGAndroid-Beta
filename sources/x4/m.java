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
    public static final Matrix f49346p = new Matrix();
    public final Path f49347a;
    public final Path f49348b;
    public final Matrix f49349c;
    public Paint d;
    public Paint f49350e;
    public PathMeasure f49351f;
    public final j f49352g;
    public float h;
    public float f49353i;
    public float f49354j;
    public float f49355k;
    public int f49356l;
    public String f49357m;
    public Boolean f49358n;
    public final a0.f f49359o;

    public m() {
        this.f49349c = new Matrix();
        this.h = 0.0f;
        this.f49353i = 0.0f;
        this.f49354j = 0.0f;
        this.f49355k = 0.0f;
        this.f49356l = 255;
        this.f49357m = null;
        this.f49358n = null;
        this.f49359o = new a0.m(0);
        this.f49352g = new j();
        this.f49347a = new Path();
        this.f49348b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f49334a;
        ArrayList arrayList = jVar.f49335b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f49334a;
        matrix3.preConcat(jVar.f49341j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.f49354j;
                float f13 = i11 / this.f49355k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f49349c;
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
                    Path path = this.f49347a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f49343a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f49348b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f49345c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f49328i;
                        if (f15 != 0.0f || iVar.f49329j != 1.0f) {
                            float f16 = iVar.f49330k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f49329j + f16) % 1.0f;
                            if (this.f49351f == null) {
                                this.f49351f = new PathMeasure();
                            }
                            this.f49351f.setPath(path, false);
                            float length = this.f49351f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f49351f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f49351f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f49351f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = iVar.f49326f;
                        if (((Shader) aVar.f300c) != null || aVar.f299b != 0) {
                            if (this.f49350e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f49350e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f49350e;
                            Shader shader = (Shader) aVar.f300c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = aVar.f299b;
                                float f21 = iVar.h;
                                PorterDuff.Mode mode = p.f49371s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f49345c == 0) {
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
                        if (((Shader) aVar2.f300c) != null || aVar2.f299b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f49332m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f49331l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f49333n);
                            Shader shader2 = (Shader) aVar2.f300c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f49327g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f299b;
                                float f22 = iVar.f49327g;
                                PorterDuff.Mode mode2 = p.f49371s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f49325e * min * f7);
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
        return this.f49356l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f49356l = i10;
    }

    public m(m mVar) {
        this.f49349c = new Matrix();
        this.h = 0.0f;
        this.f49353i = 0.0f;
        this.f49354j = 0.0f;
        this.f49355k = 0.0f;
        this.f49356l = 255;
        this.f49357m = null;
        this.f49358n = null;
        ?? mVar2 = new a0.m(0);
        this.f49359o = mVar2;
        this.f49352g = new j(mVar.f49352g, mVar2);
        this.f49347a = new Path(mVar.f49347a);
        this.f49348b = new Path(mVar.f49348b);
        this.h = mVar.h;
        this.f49353i = mVar.f49353i;
        this.f49354j = mVar.f49354j;
        this.f49355k = mVar.f49355k;
        this.f49356l = mVar.f49356l;
        this.f49357m = mVar.f49357m;
        String str = mVar.f49357m;
        if (str != null) {
            mVar2.put(str, this);
        }
        this.f49358n = mVar.f49358n;
    }
}
