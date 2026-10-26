package y4;

import a8.ng;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
public final class l {
    public static final Matrix f52014p = new Matrix();
    public final Path f52015a;
    public final Path f52016b;
    public final Matrix f52017c;
    public Paint d;
    public Paint e;
    public PathMeasure f52018f;
    public final i f52019g;
    public float h;
    public float f52020i;
    public float f52021j;
    public float f52022k;
    public int f52023l;
    public String f52024m;
    public Boolean f52025n;
    public final a0.f f52026o;

    public l() {
        this.f52017c = new Matrix();
        this.h = 0.0f;
        this.f52020i = 0.0f;
        this.f52021j = 0.0f;
        this.f52022k = 0.0f;
        this.f52023l = 255;
        this.f52024m = null;
        this.f52025n = null;
        this.f52026o = new a0.l(0);
        this.f52019g = new i();
        this.f52015a = new Path();
        this.f52016b = new Path();
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = iVar.f52003a;
        ArrayList arrayList = iVar.f52004b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f52003a;
        matrix3.preConcat(iVar.f52009j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            j jVar = (j) arrayList.get(i14);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i10, i11);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f12 = i10 / this.f52021j;
                float f13 = i11 / this.f52022k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f52017c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z10 = c10;
                i12 = i14;
                float f14 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c10], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f7 = Math.abs(f14) / max;
                } else {
                    f7 = 0.0f;
                }
                if (f7 != 0.0f) {
                    Path path = this.f52015a;
                    path.reset();
                    i0.d[] dVarArr = kVar.f52011a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f52016b;
                    path2.reset();
                    if (kVar instanceof g) {
                        if (kVar.f52013c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f15 = hVar.f51997i;
                        if (f15 != 0.0f || hVar.f51998j != 1.0f) {
                            float f16 = hVar.f51999k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (hVar.f51998j + f16) % 1.0f;
                            if (this.f52018f == null) {
                                this.f52018f = new PathMeasure();
                            }
                            this.f52018f.setPath(path, z10);
                            float length = this.f52018f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f52018f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f52018f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f52018f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        ng ngVar = hVar.f51995f;
                        if (((Shader) ngVar.f640c) != null || ngVar.f639b != 0) {
                            if (this.e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) ngVar.f640c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(hVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = ngVar.f639b;
                                float f21 = hVar.h;
                                PorterDuff.Mode mode = o.v;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (hVar.f52013c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f11 = 255.0f;
                            i13 = 16777215;
                        }
                        ng ngVar2 = hVar.d;
                        if (((Shader) ngVar2.f640c) != null || ngVar2.f639b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = hVar.f52001m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.f52000l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.f52002n);
                            Shader shader2 = (Shader) ngVar2.f640c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.f51996g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = ngVar2.f639b;
                                float f22 = hVar.f51996g;
                                PorterDuff.Mode mode2 = o.v;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(hVar.e * min * f7);
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
        return this.f52023l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f52023l = i10;
    }

    public l(l lVar) {
        this.f52017c = new Matrix();
        this.h = 0.0f;
        this.f52020i = 0.0f;
        this.f52021j = 0.0f;
        this.f52022k = 0.0f;
        this.f52023l = 255;
        this.f52024m = null;
        this.f52025n = null;
        ?? lVar2 = new a0.l(0);
        this.f52026o = lVar2;
        this.f52019g = new i(lVar.f52019g, lVar2);
        this.f52015a = new Path(lVar.f52015a);
        this.f52016b = new Path(lVar.f52016b);
        this.h = lVar.h;
        this.f52020i = lVar.f52020i;
        this.f52021j = lVar.f52021j;
        this.f52022k = lVar.f52022k;
        this.f52023l = lVar.f52023l;
        this.f52024m = lVar.f52024m;
        String str = lVar.f52024m;
        if (str != null) {
            lVar2.put(str, this);
        }
        this.f52025n = lVar.f52025n;
    }
}
