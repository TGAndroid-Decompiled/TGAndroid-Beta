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
public final class l {
    public static final Matrix f50752p = new Matrix();
    public final Path f50753a;
    public final Path f50754b;
    public final Matrix f50755c;
    public Paint d;
    public Paint f50756e;
    public PathMeasure f50757f;
    public final i f50758g;
    public float h;
    public float f50759i;
    public float f50760j;
    public float f50761k;
    public int f50762l;
    public String f50763m;
    public Boolean f50764n;
    public final a0.f f50765o;

    public l() {
        this.f50755c = new Matrix();
        this.h = 0.0f;
        this.f50759i = 0.0f;
        this.f50760j = 0.0f;
        this.f50761k = 0.0f;
        this.f50762l = 255;
        this.f50763m = null;
        this.f50764n = null;
        this.f50765o = new a0.m(0);
        this.f50758g = new i();
        this.f50753a = new Path();
        this.f50754b = new Path();
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = iVar.f50740a;
        ArrayList arrayList = iVar.f50741b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f50740a;
        matrix3.preConcat(iVar.f50747j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            j jVar = (j) arrayList.get(i14);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i10, i11);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f12 = i10 / this.f50760j;
                float f13 = i11 / this.f50761k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f50755c;
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
                    Path path = this.f50753a;
                    path.reset();
                    i0.d[] dVarArr = kVar.f50749a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f50754b;
                    path2.reset();
                    if (kVar instanceof g) {
                        if (kVar.f50751c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f15 = hVar.f50734i;
                        if (f15 != 0.0f || hVar.f50735j != 1.0f) {
                            float f16 = hVar.f50736k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (hVar.f50735j + f16) % 1.0f;
                            if (this.f50757f == null) {
                                this.f50757f = new PathMeasure();
                            }
                            this.f50757f.setPath(path, z10);
                            float length = this.f50757f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f50757f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f50757f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f50757f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = hVar.f50732f;
                        if (((Shader) aVar.f300c) != null || aVar.f299b != 0) {
                            if (this.f50756e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f50756e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f50756e;
                            Shader shader = (Shader) aVar.f300c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(hVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = aVar.f299b;
                                float f21 = hVar.h;
                                PorterDuff.Mode mode = o.v;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (hVar.f50751c == 0) {
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
                        a5.a aVar2 = hVar.d;
                        if (((Shader) aVar2.f300c) != null || aVar2.f299b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = hVar.f50738m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.f50737l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.f50739n);
                            Shader shader2 = (Shader) aVar2.f300c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.f50733g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f299b;
                                float f22 = hVar.f50733g;
                                PorterDuff.Mode mode2 = o.v;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(hVar.f50731e * min * f7);
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
        return this.f50762l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f50762l = i10;
    }

    public l(l lVar) {
        this.f50755c = new Matrix();
        this.h = 0.0f;
        this.f50759i = 0.0f;
        this.f50760j = 0.0f;
        this.f50761k = 0.0f;
        this.f50762l = 255;
        this.f50763m = null;
        this.f50764n = null;
        ?? mVar = new a0.m(0);
        this.f50765o = mVar;
        this.f50758g = new i(lVar.f50758g, mVar);
        this.f50753a = new Path(lVar.f50753a);
        this.f50754b = new Path(lVar.f50754b);
        this.h = lVar.h;
        this.f50759i = lVar.f50759i;
        this.f50760j = lVar.f50760j;
        this.f50761k = lVar.f50761k;
        this.f50762l = lVar.f50762l;
        this.f50763m = lVar.f50763m;
        String str = lVar.f50763m;
        if (str != null) {
            mVar.put(str, this);
        }
        this.f50764n = lVar.f50764n;
    }
}
