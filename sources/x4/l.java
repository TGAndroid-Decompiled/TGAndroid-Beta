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
    public static final Matrix f49706p = new Matrix();
    public final Path f49707a;
    public final Path f49708b;
    public final Matrix f49709c;
    public Paint d;
    public Paint e;
    public PathMeasure f49710f;
    public final i f49711g;
    public float h;
    public float f49712i;
    public float f49713j;
    public float f49714k;
    public int f49715l;
    public String f49716m;
    public Boolean f49717n;
    public final a0.f f49718o;

    public l() {
        this.f49709c = new Matrix();
        this.h = 0.0f;
        this.f49712i = 0.0f;
        this.f49713j = 0.0f;
        this.f49714k = 0.0f;
        this.f49715l = 255;
        this.f49716m = null;
        this.f49717n = null;
        this.f49718o = new a0.l(0);
        this.f49711g = new i();
        this.f49707a = new Path();
        this.f49708b = new Path();
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = iVar.f49695a;
        ArrayList arrayList = iVar.f49696b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f49695a;
        matrix3.preConcat(iVar.f49701j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            j jVar = (j) arrayList.get(i14);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i10, i11);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f12 = i10 / this.f49713j;
                float f13 = i11 / this.f49714k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f49709c;
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
                    Path path = this.f49707a;
                    path.reset();
                    i0.d[] dVarArr = kVar.f49703a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f49708b;
                    path2.reset();
                    if (kVar instanceof g) {
                        if (kVar.f49705c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f15 = hVar.f49689i;
                        if (f15 != 0.0f || hVar.f49690j != 1.0f) {
                            float f16 = hVar.f49691k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (hVar.f49690j + f16) % 1.0f;
                            if (this.f49710f == null) {
                                this.f49710f = new PathMeasure();
                            }
                            this.f49710f.setPath(path, z10);
                            float length = this.f49710f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f49710f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f49710f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f49710f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = hVar.f49687f;
                        if (((Shader) aVar.f282c) != null || aVar.f281b != 0) {
                            if (this.e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) aVar.f282c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(hVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = aVar.f281b;
                                float f21 = hVar.h;
                                PorterDuff.Mode mode = o.v;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (hVar.f49705c == 0) {
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
                        if (((Shader) aVar2.f282c) != null || aVar2.f281b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = hVar.f49693m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.f49692l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.f49694n);
                            Shader shader2 = (Shader) aVar2.f282c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.f49688g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f281b;
                                float f22 = hVar.f49688g;
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
        return this.f49715l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f49715l = i10;
    }

    public l(l lVar) {
        this.f49709c = new Matrix();
        this.h = 0.0f;
        this.f49712i = 0.0f;
        this.f49713j = 0.0f;
        this.f49714k = 0.0f;
        this.f49715l = 255;
        this.f49716m = null;
        this.f49717n = null;
        ?? lVar2 = new a0.l(0);
        this.f49718o = lVar2;
        this.f49711g = new i(lVar.f49711g, lVar2);
        this.f49707a = new Path(lVar.f49707a);
        this.f49708b = new Path(lVar.f49708b);
        this.h = lVar.h;
        this.f49712i = lVar.f49712i;
        this.f49713j = lVar.f49713j;
        this.f49714k = lVar.f49714k;
        this.f49715l = lVar.f49715l;
        this.f49716m = lVar.f49716m;
        String str = lVar.f49716m;
        if (str != null) {
            lVar2.put(str, this);
        }
        this.f49717n = lVar.f49717n;
    }
}
