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
    public static final Matrix f49353p = new Matrix();
    public final Path f49354a;
    public final Path f49355b;
    public final Matrix f49356c;
    public Paint d;
    public Paint f49357e;
    public PathMeasure f49358f;
    public final j f49359g;
    public float h;
    public float f49360i;
    public float f49361j;
    public float f49362k;
    public int f49363l;
    public String f49364m;
    public Boolean f49365n;
    public final a0.f f49366o;

    public m() {
        this.f49356c = new Matrix();
        this.h = 0.0f;
        this.f49360i = 0.0f;
        this.f49361j = 0.0f;
        this.f49362k = 0.0f;
        this.f49363l = 255;
        this.f49364m = null;
        this.f49365n = null;
        this.f49366o = new a0.m(0);
        this.f49359g = new j();
        this.f49354a = new Path();
        this.f49355b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f49341a;
        ArrayList arrayList = jVar.f49342b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f49341a;
        matrix3.preConcat(jVar.f49348j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.f49361j;
                float f13 = i11 / this.f49362k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f49356c;
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
                    Path path = this.f49354a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f49350a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f49355b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f49352c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f49335i;
                        if (f15 != 0.0f || iVar.f49336j != 1.0f) {
                            float f16 = iVar.f49337k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f49336j + f16) % 1.0f;
                            if (this.f49358f == null) {
                                this.f49358f = new PathMeasure();
                            }
                            this.f49358f.setPath(path, false);
                            float length = this.f49358f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f49358f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f49358f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f49358f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = iVar.f49333f;
                        if (((Shader) aVar.f300c) != null || aVar.f299b != 0) {
                            if (this.f49357e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f49357e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f49357e;
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
                                PorterDuff.Mode mode = p.f49378s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f49352c == 0) {
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
                            Paint.Join join = iVar.f49339m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f49338l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f49340n);
                            Shader shader2 = (Shader) aVar2.f300c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f49334g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f299b;
                                float f22 = iVar.f49334g;
                                PorterDuff.Mode mode2 = p.f49378s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f49332e * min * f7);
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
        return this.f49363l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f49363l = i10;
    }

    public m(m mVar) {
        this.f49356c = new Matrix();
        this.h = 0.0f;
        this.f49360i = 0.0f;
        this.f49361j = 0.0f;
        this.f49362k = 0.0f;
        this.f49363l = 255;
        this.f49364m = null;
        this.f49365n = null;
        ?? mVar2 = new a0.m(0);
        this.f49366o = mVar2;
        this.f49359g = new j(mVar.f49359g, mVar2);
        this.f49354a = new Path(mVar.f49354a);
        this.f49355b = new Path(mVar.f49355b);
        this.h = mVar.h;
        this.f49360i = mVar.f49360i;
        this.f49361j = mVar.f49361j;
        this.f49362k = mVar.f49362k;
        this.f49363l = mVar.f49363l;
        this.f49364m = mVar.f49364m;
        String str = mVar.f49364m;
        if (str != null) {
            mVar2.put(str, this);
        }
        this.f49365n = mVar.f49365n;
    }
}
