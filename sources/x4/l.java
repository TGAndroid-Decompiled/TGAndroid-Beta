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
    public static final Matrix f49264p = new Matrix();
    public final Path f49265a;
    public final Path f49266b;
    public final Matrix f49267c;
    public Paint d;
    public Paint e;
    public PathMeasure f49268f;
    public final i f49269g;
    public float h;
    public float f49270i;
    public float f49271j;
    public float f49272k;
    public int f49273l;
    public String f49274m;
    public Boolean f49275n;
    public final a0.f f49276o;

    public l() {
        this.f49267c = new Matrix();
        this.h = 0.0f;
        this.f49270i = 0.0f;
        this.f49271j = 0.0f;
        this.f49272k = 0.0f;
        this.f49273l = 255;
        this.f49274m = null;
        this.f49275n = null;
        this.f49276o = new a0.l(0);
        this.f49269g = new i();
        this.f49265a = new Path();
        this.f49266b = new Path();
    }

    public final void a(i iVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = iVar.f49253a;
        ArrayList arrayList = iVar.f49254b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f49253a;
        matrix3.preConcat(iVar.f49259j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            j jVar = (j) arrayList.get(i14);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i10, i11);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f12 = i10 / this.f49271j;
                float f13 = i11 / this.f49272k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f49267c;
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
                    Path path = this.f49265a;
                    path.reset();
                    i0.d[] dVarArr = kVar.f49261a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f49266b;
                    path2.reset();
                    if (kVar instanceof g) {
                        if (kVar.f49263c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f15 = hVar.f49247i;
                        if (f15 != 0.0f || hVar.f49248j != 1.0f) {
                            float f16 = hVar.f49249k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (hVar.f49248j + f16) % 1.0f;
                            if (this.f49268f == null) {
                                this.f49268f = new PathMeasure();
                            }
                            this.f49268f.setPath(path, z10);
                            float length = this.f49268f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f49268f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f49268f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f49268f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        a5.a aVar = hVar.f49245f;
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
                            if (hVar.f49263c == 0) {
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
                            Paint.Join join = hVar.f49251m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.f49250l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.f49252n);
                            Shader shader2 = (Shader) aVar2.f282c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.f49246g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = aVar2.f281b;
                                float f22 = hVar.f49246g;
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
        return this.f49273l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f49273l = i10;
    }

    public l(l lVar) {
        this.f49267c = new Matrix();
        this.h = 0.0f;
        this.f49270i = 0.0f;
        this.f49271j = 0.0f;
        this.f49272k = 0.0f;
        this.f49273l = 255;
        this.f49274m = null;
        this.f49275n = null;
        ?? lVar2 = new a0.l(0);
        this.f49276o = lVar2;
        this.f49269g = new i(lVar.f49269g, lVar2);
        this.f49265a = new Path(lVar.f49265a);
        this.f49266b = new Path(lVar.f49266b);
        this.h = lVar.h;
        this.f49270i = lVar.f49270i;
        this.f49271j = lVar.f49271j;
        this.f49272k = lVar.f49272k;
        this.f49273l = lVar.f49273l;
        this.f49274m = lVar.f49274m;
        String str = lVar.f49274m;
        if (str != null) {
            lVar2.put(str, this);
        }
        this.f49275n = lVar.f49275n;
    }
}
