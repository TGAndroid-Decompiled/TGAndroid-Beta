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
    public static final Matrix f49337p = new Matrix();
    public final Path f49338a;
    public final Path f49339b;
    public final Matrix f49340c;
    public Paint d;
    public Paint f49341e;
    public PathMeasure f49342f;
    public final j f49343g;
    public float h;
    public float f49344i;
    public float f49345j;
    public float f49346k;
    public int f49347l;
    public String f49348m;
    public Boolean f49349n;
    public final a0.f f49350o;

    public m() {
        this.f49340c = new Matrix();
        this.h = 0.0f;
        this.f49344i = 0.0f;
        this.f49345j = 0.0f;
        this.f49346k = 0.0f;
        this.f49347l = 255;
        this.f49348m = null;
        this.f49349n = null;
        this.f49350o = new a0.m(0);
        this.f49343g = new j();
        this.f49338a = new Path();
        this.f49339b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f49325a;
        ArrayList arrayList = jVar.f49326b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f49325a;
        matrix3.preConcat(jVar.f49332j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.f49345j;
                float f13 = i11 / this.f49346k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f49340c;
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
                    Path path = this.f49338a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f49334a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f49339b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f49336c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f49319i;
                        if (f15 != 0.0f || iVar.f49320j != 1.0f) {
                            float f16 = iVar.f49321k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f49320j + f16) % 1.0f;
                            if (this.f49342f == null) {
                                this.f49342f = new PathMeasure();
                            }
                            this.f49342f.setPath(path, false);
                            float length = this.f49342f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f49342f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f49342f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f49342f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = iVar.f49317f;
                        if (((Shader) aVar.f300c) != null || aVar.f299b != 0) {
                            if (this.f49341e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f49341e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f49341e;
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
                                PorterDuff.Mode mode = p.f49362s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f49336c == 0) {
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
                            Paint.Join join = iVar.f49323m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f49322l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f49324n);
                            Shader shader2 = (Shader) aVar2.f300c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f49318g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f299b;
                                float f22 = iVar.f49318g;
                                PorterDuff.Mode mode2 = p.f49362s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f49316e * min * f7);
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
        return this.f49347l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f49347l = i10;
    }

    public m(m mVar) {
        this.f49340c = new Matrix();
        this.h = 0.0f;
        this.f49344i = 0.0f;
        this.f49345j = 0.0f;
        this.f49346k = 0.0f;
        this.f49347l = 255;
        this.f49348m = null;
        this.f49349n = null;
        ?? mVar2 = new a0.m(0);
        this.f49350o = mVar2;
        this.f49343g = new j(mVar.f49343g, mVar2);
        this.f49338a = new Path(mVar.f49338a);
        this.f49339b = new Path(mVar.f49339b);
        this.h = mVar.h;
        this.f49344i = mVar.f49344i;
        this.f49345j = mVar.f49345j;
        this.f49346k = mVar.f49346k;
        this.f49347l = mVar.f49347l;
        this.f49348m = mVar.f49348m;
        String str = mVar.f49348m;
        if (str != null) {
            mVar2.put(str, this);
        }
        this.f49349n = mVar.f49349n;
    }
}
