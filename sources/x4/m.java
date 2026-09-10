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
    public static final Matrix f44637p = new Matrix();
    public final Path f44638a;
    public final Path f44639b;
    public final Matrix f44640c;
    public Paint d;
    public Paint e;
    public PathMeasure f44641f;
    public final j f44642g;
    public float h;
    public float f44643i;
    public float f44644j;
    public float f44645k;
    public int f44646l;
    public String f44647m;
    public Boolean f44648n;
    public final a0.f f44649o;

    public m() {
        this.f44640c = new Matrix();
        this.h = 0.0f;
        this.f44643i = 0.0f;
        this.f44644j = 0.0f;
        this.f44645k = 0.0f;
        this.f44646l = 255;
        this.f44647m = null;
        this.f44648n = null;
        this.f44649o = new a0.l(0);
        this.f44642g = new j();
        this.f44638a = new Path();
        this.f44639b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f44626a;
        ArrayList arrayList = jVar.f44627b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f44626a;
        matrix3.preConcat(jVar.f44632j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.f44644j;
                float f13 = i11 / this.f44645k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f44640c;
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
                    Path path = this.f44638a;
                    path.reset();
                    i0.e[] eVarArr = lVar.f44634a;
                    if (eVarArr != null) {
                        i0.e.b(eVarArr, path);
                    }
                    Path path2 = this.f44639b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f44636c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f44620i;
                        if (f15 != 0.0f || iVar.f44621j != 1.0f) {
                            float f16 = iVar.f44622k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f44621j + f16) % 1.0f;
                            if (this.f44641f == null) {
                                this.f44641f = new PathMeasure();
                            }
                            this.f44641f.setPath(path, false);
                            float length = this.f44641f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f44641f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f44641f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f44641f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = iVar.f44618f;
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
                                PorterDuff.Mode mode = p.f44660s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f44636c == 0) {
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
                            Paint.Join join = iVar.f44624m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f44623l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f44625n);
                            Shader shader2 = (Shader) aVar2.f276c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f44619g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f275b;
                                float f22 = iVar.f44619g;
                                PorterDuff.Mode mode2 = p.f44660s;
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
        return this.f44646l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f44646l = i10;
    }

    public m(m mVar) {
        this.f44640c = new Matrix();
        this.h = 0.0f;
        this.f44643i = 0.0f;
        this.f44644j = 0.0f;
        this.f44645k = 0.0f;
        this.f44646l = 255;
        this.f44647m = null;
        this.f44648n = null;
        ?? lVar = new a0.l(0);
        this.f44649o = lVar;
        this.f44642g = new j(mVar.f44642g, lVar);
        this.f44638a = new Path(mVar.f44638a);
        this.f44639b = new Path(mVar.f44639b);
        this.h = mVar.h;
        this.f44643i = mVar.f44643i;
        this.f44644j = mVar.f44644j;
        this.f44645k = mVar.f44645k;
        this.f44646l = mVar.f44646l;
        this.f44647m = mVar.f44647m;
        String str = mVar.f44647m;
        if (str != null) {
            lVar.put(str, this);
        }
        this.f44648n = mVar.f44648n;
    }
}
