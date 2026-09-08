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
    public static final Matrix f48885p = new Matrix();
    public final Path f48886a;
    public final Path f48887b;
    public final Matrix f48888c;
    public Paint d;
    public Paint f48889e;
    public PathMeasure f48890f;
    public final j f48891g;
    public float h;
    public float f48892i;
    public float f48893j;
    public float f48894k;
    public int f48895l;
    public String f48896m;
    public Boolean f48897n;
    public final a0.f f48898o;

    public m() {
        this.f48888c = new Matrix();
        this.h = 0.0f;
        this.f48892i = 0.0f;
        this.f48893j = 0.0f;
        this.f48894k = 0.0f;
        this.f48895l = 255;
        this.f48896m = null;
        this.f48897n = null;
        this.f48898o = new a0.l(0);
        this.f48891g = new j();
        this.f48886a = new Path();
        this.f48887b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f48873a;
        ArrayList arrayList = jVar.f48874b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f48873a;
        matrix3.preConcat(jVar.f48880j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.f48893j;
                float f13 = i11 / this.f48894k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f48888c;
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
                    Path path = this.f48886a;
                    path.reset();
                    i0.e[] eVarArr = lVar.f48882a;
                    if (eVarArr != null) {
                        i0.e.b(eVarArr, path);
                    }
                    Path path2 = this.f48887b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f48884c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f48867i;
                        if (f15 != 0.0f || iVar.f48868j != 1.0f) {
                            float f16 = iVar.f48869k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f48868j + f16) % 1.0f;
                            if (this.f48890f == null) {
                                this.f48890f = new PathMeasure();
                            }
                            this.f48890f.setPath(path, false);
                            float length = this.f48890f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f48890f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f48890f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f48890f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = iVar.f48865f;
                        if (((Shader) aVar.f298c) != null || aVar.f297b != 0) {
                            if (this.f48889e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f48889e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f48889e;
                            Shader shader = (Shader) aVar.f298c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = aVar.f297b;
                                float f21 = iVar.h;
                                PorterDuff.Mode mode = p.f48910s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f48884c == 0) {
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
                        if (((Shader) aVar2.f298c) != null || aVar2.f297b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f48871m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f48870l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f48872n);
                            Shader shader2 = (Shader) aVar2.f298c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f48866g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f297b;
                                float f22 = iVar.f48866g;
                                PorterDuff.Mode mode2 = p.f48910s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f48864e * min * f7);
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
        return this.f48895l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f48895l = i10;
    }

    public m(m mVar) {
        this.f48888c = new Matrix();
        this.h = 0.0f;
        this.f48892i = 0.0f;
        this.f48893j = 0.0f;
        this.f48894k = 0.0f;
        this.f48895l = 255;
        this.f48896m = null;
        this.f48897n = null;
        ?? lVar = new a0.l(0);
        this.f48898o = lVar;
        this.f48891g = new j(mVar.f48891g, lVar);
        this.f48886a = new Path(mVar.f48886a);
        this.f48887b = new Path(mVar.f48887b);
        this.h = mVar.h;
        this.f48892i = mVar.f48892i;
        this.f48893j = mVar.f48893j;
        this.f48894k = mVar.f48894k;
        this.f48895l = mVar.f48895l;
        this.f48896m = mVar.f48896m;
        String str = mVar.f48896m;
        if (str != null) {
            lVar.put(str, this);
        }
        this.f48897n = mVar.f48897n;
    }
}
