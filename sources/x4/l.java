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
    public static final Matrix f50718p = new Matrix();
    public final Path f50719a;
    public final Path f50720b;
    public final Matrix f50721c;
    public Paint d;
    public Paint f50722e;
    public PathMeasure f50723f;
    public final i f50724g;
    public float h;
    public float f50725i;
    public float f50726j;
    public float f50727k;
    public int f50728l;
    public String f50729m;
    public Boolean f50730n;
    public final a0.f f50731o;

    public l() {
        this.f50721c = new Matrix();
        this.h = 0.0f;
        this.f50725i = 0.0f;
        this.f50726j = 0.0f;
        this.f50727k = 0.0f;
        this.f50728l = 255;
        this.f50729m = null;
        this.f50730n = null;
        this.f50731o = new a0.m(0);
        this.f50724g = new i();
        this.f50719a = new Path();
        this.f50720b = new Path();
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = iVar.f50706a;
        ArrayList arrayList = iVar.f50707b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f50706a;
        matrix3.preConcat(iVar.f50713j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            j jVar = (j) arrayList.get(i14);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i10, i11);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f12 = i10 / this.f50726j;
                float f13 = i11 / this.f50727k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f50721c;
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
                    Path path = this.f50719a;
                    path.reset();
                    i0.d[] dVarArr = kVar.f50715a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f50720b;
                    path2.reset();
                    if (kVar instanceof g) {
                        if (kVar.f50717c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f15 = hVar.f50700i;
                        if (f15 != 0.0f || hVar.f50701j != 1.0f) {
                            float f16 = hVar.f50702k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (hVar.f50701j + f16) % 1.0f;
                            if (this.f50723f == null) {
                                this.f50723f = new PathMeasure();
                            }
                            this.f50723f.setPath(path, z10);
                            float length = this.f50723f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f50723f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f50723f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f50723f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = hVar.f50698f;
                        if (((Shader) aVar.f300c) != null || aVar.f299b != 0) {
                            if (this.f50722e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f50722e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f50722e;
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
                            if (hVar.f50717c == 0) {
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
                            Paint.Join join = hVar.f50704m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.f50703l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.f50705n);
                            Shader shader2 = (Shader) aVar2.f300c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.f50699g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f299b;
                                float f22 = hVar.f50699g;
                                PorterDuff.Mode mode2 = o.v;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(hVar.f50697e * min * f7);
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
        return this.f50728l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f50728l = i10;
    }

    public l(l lVar) {
        this.f50721c = new Matrix();
        this.h = 0.0f;
        this.f50725i = 0.0f;
        this.f50726j = 0.0f;
        this.f50727k = 0.0f;
        this.f50728l = 255;
        this.f50729m = null;
        this.f50730n = null;
        ?? mVar = new a0.m(0);
        this.f50731o = mVar;
        this.f50724g = new i(lVar.f50724g, mVar);
        this.f50719a = new Path(lVar.f50719a);
        this.f50720b = new Path(lVar.f50720b);
        this.h = lVar.h;
        this.f50725i = lVar.f50725i;
        this.f50726j = lVar.f50726j;
        this.f50727k = lVar.f50727k;
        this.f50728l = lVar.f50728l;
        this.f50729m = lVar.f50729m;
        String str = lVar.f50729m;
        if (str != null) {
            mVar.put(str, this);
        }
        this.f50730n = lVar.f50730n;
    }
}
