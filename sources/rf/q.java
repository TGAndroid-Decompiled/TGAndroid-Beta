package rf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

public class q extends g {
    public final float[] A1;
    public final Path B1;
    public boolean[] C1;
    public float[] D1;

    public final Matrix f47016z1;

    public q(Context context) {
        super(context, null);
        this.f47016z1 = new Matrix();
        this.A1 = new float[2];
        this.B1 = new Path();
        this.f46983s0 = true;
        this.f46984t0 = true;
        this.f46963e = false;
    }

    @Override
    public tf.i h(sf.a aVar) {
        return new tf.i(aVar);
    }

    public final int M(float f10, float f11) {
        RectF rectF = this.D0;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        if (f10 >= fCenterX && f11 <= fCenterY) {
            return 0;
        }
        if (f10 < fCenterX || f11 < fCenterY) {
            return (f10 >= fCenterX || f11 < fCenterY) ? 3 : 2;
        }
        return 1;
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f10;
        float f11;
        int i10;
        float f12;
        int i11;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        tf.j jVar;
        float f22;
        float f23;
        char c10;
        float measuredWidth;
        float measuredHeight;
        float f24;
        double degrees;
        float f25;
        float f26;
        int iM;
        int iM2;
        float measuredHeight2;
        boolean z10;
        float f27;
        float f28;
        float f29;
        float f30;
        if (this.f46961d0 != null) {
            float f31 = this.B0;
            j jVar2 = this.f46959c0;
            float f32 = jVar2.f47009l;
            float f33 = jVar2.f47008k;
            float f34 = f31 / (f32 - f33);
            float f35 = g.f46934g1;
            float f36 = (f33 * f34) - f35;
            RectF rectF = this.D0;
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY() + AndroidUtilities.dp(16.0f);
            int i12 = 0;
            while (true) {
                arrayList = this.d;
                if (i12 >= arrayList.size()) {
                    break;
                }
                ((tf.i) arrayList.get(i12)).f48199f.reset();
                ((tf.i) arrayList.get(i12)).f48200g.reset();
                i12++;
            }
            canvas.save();
            boolean[] zArr = this.C1;
            if (zArr == null || zArr.length < ((sf.e) this.f46961d0).d.size()) {
                this.C1 = new boolean[((sf.e) this.f46961d0).d.size()];
                this.D1 = new float[((sf.e) this.f46961d0).d.size()];
            }
            int i13 = this.f46985u0;
            if (i13 == 2) {
                f12 = this.f46986v0.f48216f / 0.6f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                Path path = this.B1;
                path.reset();
                float fWidth = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float fHeight = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f11 = 0.0f;
                float fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.f46986v0.f48216f, (fWidth - fHeight) / 2.0f, fHeight);
                RectF rectF2 = new RectF();
                f10 = 1.0f;
                rectF2.set(fCenterX - fZ, fCenterY - fZ, fCenterX + fZ, fCenterY + fZ);
                path.addRoundRect(rectF2, fZ, fZ, Path.Direction.CW);
                canvas.clipPath(path);
                i10 = 255;
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
                i10 = i13 == 3 ? (int) (this.f46986v0.f48216f * 255.0f) : 255;
                f12 = 0.0f;
            }
            float[] fArr = ((sf.e) this.f46961d0).f47882b;
            int i14 = ((int) (f35 / (fArr.length < 2 ? 1.0f : fArr[1] * f34))) + 1;
            int iMax = Math.max(0, (this.B - i14) - 1);
            int iMin = Math.min(((sf.e) this.f46961d0).f47882b.length - 1, this.C + i14 + 1);
            int i15 = iMax;
            float f37 = 0.0f;
            boolean z11 = false;
            float f38 = 0.0f;
            while (true) {
                i11 = g.f46937j1;
                if (i15 > iMin) {
                    break;
                }
                float f39 = f34;
                float f40 = f36;
                float f41 = f12;
                boolean z12 = z11;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                float f42 = 0.0f;
                while (i18 < arrayList.size()) {
                    tf.f fVar = (tf.f) arrayList.get(i18);
                    int i19 = i18;
                    if (fVar.f48206n || fVar.f48207o != f11) {
                        long j10 = fVar.f48195a.f47874a[i15];
                        if (j10 > 0) {
                            f42 = (j10 * fVar.f48207o) + f42;
                            i16++;
                        }
                        i17 = i19;
                    }
                    i18 = i19 + 1;
                    i10 = i10;
                }
                int i20 = i10;
                float f43 = 0.0f;
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    tf.f fVar2 = (tf.f) arrayList.get(i21);
                    float f44 = f37;
                    boolean z13 = fVar2.f48206n;
                    Path path2 = fVar2.f48199f;
                    if (z13) {
                        f13 = f43;
                    } else {
                        f13 = f43;
                        if (fVar2.f48207o == f11) {
                            iMin = iMin;
                            arrayList = arrayList;
                            i11 = i11;
                            f43 = f13;
                            i17 = i17;
                        }
                        f37 = f44;
                        i21++;
                        iMin = iMin;
                        i17 = i17;
                        iMax = iMax;
                        i16 = i16;
                        i11 = i11;
                        arrayList = arrayList;
                        f11 = 0.0f;
                    }
                    long[] jArr = fVar2.f48195a.f47874a;
                    if (i16 == 1) {
                        if (jArr[i15] == 0) {
                            f14 = 0.0f;
                        } else {
                            f14 = fVar2.f48207o;
                        }
                    } else if (f42 == f11) {
                        f14 = 0.0f;
                    } else {
                        f14 = (jArr[i15] * fVar2.f48207o) / f42;
                    }
                    float[] fArr2 = ((sf.e) this.f46961d0).f47882b;
                    float f45 = (fArr2[i15] * f39) - f40;
                    float measuredWidth2 = i15 == iMin ? getMeasuredWidth() : (fArr2[i15 + 1] * f39) - f40;
                    if (f14 == f11 && i21 == i17) {
                        z12 = true;
                    }
                    float measuredHeight3 = ((getMeasuredHeight() - this.f46982s) - i11) * f14;
                    float measuredHeight4 = ((getMeasuredHeight() - this.f46982s) - measuredHeight3) - f13;
                    this.D1[i21] = measuredHeight4;
                    float measuredHeight5 = getMeasuredHeight() - this.f46982s;
                    if (i15 == iMin) {
                        f15 = measuredHeight5;
                        f44 = f45;
                    } else {
                        f15 = measuredHeight5;
                        if (i15 == iMax) {
                            f38 = f45;
                        }
                    }
                    int i22 = this.f46985u0;
                    float f46 = measuredWidth2;
                    float[] fArr3 = this.A1;
                    Matrix matrix = this.f47016z1;
                    if (i22 != 2 || i21 == i17) {
                        arrayList = arrayList;
                        f16 = measuredHeight4;
                        f17 = f15;
                        f18 = f45;
                        f19 = 0.0f;
                    } else {
                        if (f45 < fCenterX) {
                            tf.j jVar3 = this.f46986v0;
                            f30 = jVar3.f48217g[i21];
                            f29 = jVar3.h[i21];
                        } else {
                            tf.j jVar4 = this.f46986v0;
                            float f47 = jVar4.f48218i[i21];
                            f29 = jVar4.f48219j[i21];
                            f30 = f47;
                        }
                        float f48 = fCenterX - f30;
                        float f49 = fCenterY - f29;
                        float f50 = (((f45 - f30) * f49) / f48) + f29;
                        float f51 = f10 - f41;
                        float f52 = measuredHeight4 * f51;
                        float f53 = f50 * f41;
                        float f54 = f52 + f53;
                        float f55 = (f15 * f51) + f53;
                        float f56 = f49 / f48;
                        float degrees2 = ((float) (f56 > f11 ? Math.toDegrees(-Math.atan(f56)) : Math.toDegrees(Math.atan(Math.abs(f56))))) - 90.0f;
                        if (f45 >= fCenterX) {
                            fArr3[0] = f45;
                            fArr3[1] = f54;
                            matrix.reset();
                            matrix.postRotate(this.f46986v0.f48216f * degrees2, fCenterX, fCenterY);
                            matrix.mapPoints(fArr3);
                            float f57 = fArr3[0];
                            f16 = fArr3[1];
                            if (f57 < fCenterX) {
                                f57 = fCenterX;
                            }
                            fArr3[0] = f45;
                            fArr3[1] = f55;
                            matrix.reset();
                            f19 = degrees2;
                            matrix.postRotate(this.f46986v0.f48216f * f19, fCenterX, fCenterY);
                            matrix.mapPoints(fArr3);
                            f17 = fArr3[1];
                            f20 = f38;
                            f21 = f57;
                            f18 = f45 < fCenterX ? fCenterX : f45;
                        } else {
                            f19 = degrees2;
                            if (f46 >= fCenterX) {
                                f18 = (f45 * f51) + (fCenterX * f41);
                                f17 = (fCenterY * f41) + (f54 * f51);
                                f16 = f17;
                            } else {
                                fArr3[0] = f45;
                                fArr3[1] = f54;
                                matrix.reset();
                                tf.j jVar5 = this.f46986v0;
                                float f58 = jVar5.f48216f;
                                matrix.postRotate((f58 * jVar5.f48220k[i21]) + (f58 * f19), fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                float f59 = fArr3[0];
                                f16 = fArr3[1];
                                if (f46 >= fCenterX) {
                                    float f60 = this.f46986v0.f48216f;
                                    fArr3[0] = (f60 * fCenterX) + ((f10 - f60) * f45);
                                } else {
                                    fArr3[0] = f45;
                                }
                                fArr3[1] = f55;
                                matrix.reset();
                                tf.j jVar6 = this.f46986v0;
                                float f61 = jVar6.f48216f;
                                matrix.postRotate((f61 * jVar6.f48220k[i21]) + (f61 * f19), fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                f18 = fArr3[0];
                                f17 = fArr3[1];
                                f20 = f38;
                                f21 = f59;
                            }
                        }
                        if (i15 == iMax) {
                            measuredHeight2 = getMeasuredHeight();
                            if (this.f46985u0 == 2 || i21 == i17) {
                                z10 = false;
                                f27 = measuredHeight2;
                                f28 = 0.0f;
                            } else {
                                fArr3[0] = f11 - fCenterX;
                                fArr3[1] = measuredHeight2;
                                matrix.reset();
                                tf.j jVar7 = this.f46986v0;
                                float f62 = jVar7.f48216f;
                                matrix.postRotate((f62 * jVar7.f48220k[i21]) + (f19 * f62), fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                z10 = false;
                                f28 = fArr3[0];
                                f27 = fArr3[1];
                            }
                            path2.moveTo(f28, f27);
                            this.C1[i21] = z10;
                        }
                        jVar = this.f46986v0;
                        if (jVar == null) {
                            f22 = 0.0f;
                        } else {
                            f22 = jVar.f48216f;
                        }
                        if (f14 == f11 || i15 <= 0 || jArr[i15 - 1] != 0 || i15 >= iMin || jArr[i15 + 1] != 0) {
                            f23 = f22;
                        } else {
                            f23 = f22;
                            if (this.f46985u0 != 2) {
                                if (!this.C1[i21]) {
                                    if (i21 == i17) {
                                        path2.lineTo(f18, (f10 - f23) * f17);
                                    } else {
                                        path2.lineTo(f18, f17);
                                    }
                                }
                                this.C1[i21] = true;
                                c10 = 0;
                            }
                            if (i15 == iMin) {
                                measuredWidth = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight();
                                if (this.f46985u0 == 2 || i21 == i17) {
                                    path2.lineTo(measuredWidth, measuredHeight);
                                } else {
                                    fArr3[c10] = measuredWidth + fCenterX;
                                    fArr3[1] = measuredHeight;
                                    matrix.reset();
                                    tf.j jVar8 = this.f46986v0;
                                    matrix.postRotate(jVar8.f48216f * jVar8.f48220k[i21], fCenterX, fCenterY);
                                    matrix.mapPoints(fArr3);
                                    float f63 = fArr3[c10];
                                    float f64 = fArr3[1];
                                }
                                if (this.f46985u0 != 2) {
                                    i17 = i17;
                                    iMin = iMin;
                                } else if (i21 != i17) {
                                    tf.j jVar9 = this.f46986v0;
                                    f24 = (fCenterY - jVar9.h[i21]) / (fCenterX - jVar9.f48217g[i21]);
                                    if (f24 > f11) {
                                        degrees = Math.toDegrees(-Math.atan(f24));
                                    } else {
                                        degrees = Math.toDegrees(Math.atan(Math.abs(f24)));
                                    }
                                    tf.j jVar10 = this.f46986v0;
                                    float f65 = jVar10.f48217g[i21];
                                    float f66 = jVar10.h[i21];
                                    fArr3[0] = f65;
                                    fArr3[1] = f66;
                                    matrix.reset();
                                    tf.j jVar11 = this.f46986v0;
                                    float f67 = jVar11.f48216f;
                                    matrix.postRotate((f67 * jVar11.f48220k[i21]) + ((((float) degrees) - 90.0f) * f67), fCenterX, fCenterY);
                                    matrix.mapPoints(fArr3);
                                    f25 = fArr3[0];
                                    f26 = fArr3[1];
                                    if (Math.abs(f21 - f25) < 0.001d || ((f26 >= fCenterY || f16 >= fCenterY) && (f26 <= fCenterY || f16 <= fCenterY))) {
                                        iM = M(f21, f16);
                                        iM2 = M(f25, f26);
                                    } else {
                                        iM2 = this.f46986v0.f48220k[i21] == -180.0f ? 0 : 3;
                                        iM = 0;
                                    }
                                    while (iM <= iM2) {
                                        if (iM == 0) {
                                            path2.lineTo(getMeasuredWidth(), 0.0f);
                                        } else {
                                            if (iM == 1) {
                                                path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                            } else if (iM == 2) {
                                                path2.lineTo(0.0f, getMeasuredHeight());
                                            } else {
                                                path2.lineTo(0.0f, 0.0f);
                                            }
                                            iM++;
                                        }
                                        iM++;
                                    }
                                } else {
                                    i17 = i17;
                                    iMin = iMin;
                                }
                            } else {
                                i17 = i17;
                                iMin = iMin;
                            }
                            f43 = f13 + measuredHeight3;
                            f38 = f20;
                            f37 = f44;
                            i21++;
                            iMin = iMin;
                            i17 = i17;
                            iMax = iMax;
                            i16 = i16;
                            i11 = i11;
                            arrayList = arrayList;
                            f11 = 0.0f;
                        }
                        if (this.C1[i21]) {
                            if (i21 == i17) {
                                path2.lineTo(f18, (f10 - f23) * f17);
                            } else {
                                path2.lineTo(f18, f17);
                            }
                        }
                        if (i21 == i17) {
                            path2.lineTo(f21, (f10 - f23) * f16);
                        } else {
                            path2.lineTo(f21, f16);
                        }
                        c10 = 0;
                        this.C1[i21] = false;
                        if (i15 == iMin) {
                            measuredWidth = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight();
                            if (this.f46985u0 == 2) {
                                path2.lineTo(measuredWidth, measuredHeight);
                            } else {
                                path2.lineTo(measuredWidth, measuredHeight);
                            }
                            if (this.f46985u0 != 2) {
                                i17 = i17;
                                iMin = iMin;
                            } else if (i21 != i17) {
                                tf.j jVar12 = this.f46986v0;
                                f24 = (fCenterY - jVar12.h[i21]) / (fCenterX - jVar12.f48217g[i21]);
                                if (f24 > f11) {
                                    degrees = Math.toDegrees(-Math.atan(f24));
                                } else {
                                    degrees = Math.toDegrees(Math.atan(Math.abs(f24)));
                                }
                                tf.j jVar13 = this.f46986v0;
                                float f68 = jVar13.f48217g[i21];
                                float f69 = jVar13.h[i21];
                                fArr3[0] = f68;
                                fArr3[1] = f69;
                                matrix.reset();
                                tf.j jVar14 = this.f46986v0;
                                float f610 = jVar14.f48216f;
                                matrix.postRotate((f610 * jVar14.f48220k[i21]) + ((((float) degrees) - 90.0f) * f610), fCenterX, fCenterY);
                                matrix.mapPoints(fArr3);
                                f25 = fArr3[0];
                                f26 = fArr3[1];
                                if (Math.abs(f21 - f25) < 0.001d) {
                                    iM = M(f21, f16);
                                    iM2 = M(f25, f26);
                                } else {
                                    iM = M(f21, f16);
                                    iM2 = M(f25, f26);
                                }
                                while (iM <= iM2) {
                                    if (iM == 0) {
                                        path2.lineTo(getMeasuredWidth(), 0.0f);
                                    } else {
                                        if (iM == 1) {
                                            path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                        } else if (iM == 2) {
                                            path2.lineTo(0.0f, getMeasuredHeight());
                                        } else {
                                            path2.lineTo(0.0f, 0.0f);
                                        }
                                        iM++;
                                    }
                                    iM++;
                                }
                            } else {
                                i17 = i17;
                                iMin = iMin;
                            }
                        } else {
                            i17 = i17;
                            iMin = iMin;
                        }
                        f43 = f13 + measuredHeight3;
                        f38 = f20;
                        f37 = f44;
                        i21++;
                        iMin = iMin;
                        i17 = i17;
                        iMax = iMax;
                        i16 = i16;
                        i11 = i11;
                        arrayList = arrayList;
                        f11 = 0.0f;
                    }
                    f20 = f38;
                    f21 = f18;
                    if (i15 == iMax) {
                        measuredHeight2 = getMeasuredHeight();
                        if (this.f46985u0 == 2) {
                            z10 = false;
                            f27 = measuredHeight2;
                            f28 = 0.0f;
                        } else {
                            z10 = false;
                            f27 = measuredHeight2;
                            f28 = 0.0f;
                        }
                        path2.moveTo(f28, f27);
                        this.C1[i21] = z10;
                    }
                    jVar = this.f46986v0;
                    if (jVar == null) {
                        f22 = 0.0f;
                    } else {
                        f22 = jVar.f48216f;
                    }
                    if (f14 == f11) {
                        f23 = f22;
                        if (this.C1[i21]) {
                            if (i21 == i17) {
                                path2.lineTo(f18, (f10 - f23) * f17);
                            } else {
                                path2.lineTo(f18, f17);
                            }
                        }
                        if (i21 == i17) {
                            path2.lineTo(f21, (f10 - f23) * f16);
                        } else {
                            path2.lineTo(f21, f16);
                        }
                        c10 = 0;
                        this.C1[i21] = false;
                    } else {
                        f23 = f22;
                        if (this.C1[i21]) {
                            if (i21 == i17) {
                                path2.lineTo(f18, (f10 - f23) * f17);
                            } else {
                                path2.lineTo(f18, f17);
                            }
                        }
                        if (i21 == i17) {
                            path2.lineTo(f21, (f10 - f23) * f16);
                        } else {
                            path2.lineTo(f21, f16);
                        }
                        c10 = 0;
                        this.C1[i21] = false;
                    }
                    if (i15 == iMin) {
                        measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        if (this.f46985u0 == 2) {
                            path2.lineTo(measuredWidth, measuredHeight);
                        } else {
                            path2.lineTo(measuredWidth, measuredHeight);
                        }
                        if (this.f46985u0 != 2) {
                            i17 = i17;
                            iMin = iMin;
                        } else if (i21 != i17) {
                            tf.j jVar15 = this.f46986v0;
                            f24 = (fCenterY - jVar15.h[i21]) / (fCenterX - jVar15.f48217g[i21]);
                            if (f24 > f11) {
                                degrees = Math.toDegrees(-Math.atan(f24));
                            } else {
                                degrees = Math.toDegrees(Math.atan(Math.abs(f24)));
                            }
                            tf.j jVar16 = this.f46986v0;
                            float f611 = jVar16.f48217g[i21];
                            float f612 = jVar16.h[i21];
                            fArr3[0] = f611;
                            fArr3[1] = f612;
                            matrix.reset();
                            tf.j jVar17 = this.f46986v0;
                            float f613 = jVar17.f48216f;
                            matrix.postRotate((f613 * jVar17.f48220k[i21]) + ((((float) degrees) - 90.0f) * f613), fCenterX, fCenterY);
                            matrix.mapPoints(fArr3);
                            f25 = fArr3[0];
                            f26 = fArr3[1];
                            if (Math.abs(f21 - f25) < 0.001d) {
                                iM = M(f21, f16);
                                iM2 = M(f25, f26);
                            } else {
                                iM = M(f21, f16);
                                iM2 = M(f25, f26);
                            }
                            while (iM <= iM2) {
                                if (iM == 0) {
                                    path2.lineTo(getMeasuredWidth(), 0.0f);
                                } else {
                                    if (iM == 1) {
                                        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                    } else if (iM == 2) {
                                        path2.lineTo(0.0f, getMeasuredHeight());
                                    } else {
                                        path2.lineTo(0.0f, 0.0f);
                                    }
                                    iM++;
                                }
                                iM++;
                            }
                        } else {
                            i17 = i17;
                            iMin = iMin;
                        }
                    } else {
                        i17 = i17;
                        iMin = iMin;
                    }
                    f43 = f13 + measuredHeight3;
                    f38 = f20;
                    f37 = f44;
                    i21++;
                    iMin = iMin;
                    i17 = i17;
                    iMax = iMax;
                    i16 = i16;
                    i11 = i11;
                    arrayList = arrayList;
                    f11 = 0.0f;
                }
                i15++;
                iMin = iMin;
                f34 = f39;
                f36 = f40;
                f12 = f41;
                z11 = z12;
                i10 = i20;
                f11 = 0.0f;
            }
            int i23 = i10;
            ArrayList arrayList2 = arrayList;
            boolean z14 = z11;
            canvas.save();
            canvas.clipRect(f38, i11, f37, getMeasuredHeight() - this.f46982s);
            if (z14) {
                canvas.drawColor(g6.w0(null, g6.rj, false));
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                tf.f fVar3 = (tf.f) arrayList2.get(size);
                Paint paint = fVar3.f48197c;
                paint.setAlpha(i23);
                canvas.drawPath(fVar3.f48199f, paint);
                paint.setAlpha(255);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void n(Canvas canvas) {
        float f10;
        if (this.f46961d0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((tf.i) arrayList.get(i10)).f48200g.reset();
            }
            sf.b bVar = this.f46961d0;
            int i11 = ((sf.e) bVar).f47895n;
            boolean[] zArr = this.C1;
            if (zArr == null || zArr.length < ((sf.e) bVar).d.size()) {
                this.C1 = new boolean[((sf.e) this.f46961d0).d.size()];
            }
            boolean z10 = false;
            for (int i12 = 0; i12 < i11; i12++) {
                float f11 = 0.0f;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    tf.f fVar = (tf.f) arrayList.get(i15);
                    if (fVar.f48206n || fVar.f48207o != 0.0f) {
                        sf.b bVar2 = this.f46961d0;
                        if (((sf.e) bVar2).f47894m[i15][i12] > 0) {
                            f11 += ((sf.e) bVar2).f47894m[i15][i12] * fVar.f48207o;
                            i13++;
                        }
                        i14 = i15;
                    }
                }
                int i16 = i11 - 1;
                float f12 = (i12 / i16) * this.f46992y0;
                int i17 = 0;
                float f13 = 0.0f;
                while (i17 < arrayList.size()) {
                    tf.f fVar2 = (tf.f) arrayList.get(i17);
                    boolean z11 = fVar2.f48206n;
                    Path path = fVar2.f48200g;
                    if (z11 || fVar2.f48207o != 0.0f) {
                        if (i13 == 1) {
                            if (((sf.e) this.f46961d0).f47894m[i17][i12] == 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = fVar2.f48207o;
                            }
                        } else if (f11 == 0.0f) {
                            f10 = 0.0f;
                        } else {
                            f10 = (((sf.e) this.f46961d0).f47894m[i17][i12] * fVar2.f48207o) / f11;
                        }
                        boolean z12 = (f10 == 0.0f && i17 == i14) ? true : z10;
                        int i18 = this.f46990x0;
                        float f14 = f10 * i18;
                        float f15 = (i18 - f14) - f13;
                        if (i12 == 0) {
                            path.moveTo(0.0f, i18);
                            this.C1[i17] = false;
                        }
                        sf.b bVar3 = this.f46961d0;
                        if (((sf.e) bVar3).f47894m[i17][i12] == 0 && i12 > 0 && ((sf.e) bVar3).f47894m[i17][i12 - 1] == 0 && i12 < i16 && ((sf.e) bVar3).f47894m[i17][i12 + 1] == 0) {
                            if (!this.C1[i17]) {
                                path.lineTo(f12, i18);
                            }
                            this.C1[i17] = true;
                        } else {
                            if (this.C1[i17]) {
                                path.lineTo(f12, i18);
                            }
                            path.lineTo(f12, f15);
                            this.C1[i17] = false;
                        }
                        if (i12 == i16) {
                            path.lineTo(this.f46992y0, i18);
                        }
                        f13 += f14;
                        z10 = z12;
                    } else {
                        i11 = i11;
                    }
                    i17++;
                    i11 = i11;
                }
            }
            if (z10) {
                canvas.drawColor(g6.w0(null, g6.rj, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                tf.f fVar3 = (tf.f) arrayList.get(size2);
                canvas.drawPath(fVar3.f48200g, fVar3.f48197c);
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f46955b;
        this.f46971i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f46972j0 = i10;
            int i11 = this.f46972j0;
            if (i11 >= this.f46971i0) {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            l(canvas, (tf.d) arrayList.get(i11));
            p(canvas, (tf.d) arrayList.get(this.f46972j0));
            i10 = this.f46972j0 + 1;
        }
    }

    @Override
    public void q(tf.j jVar) {
        ArrayList arrayList;
        float f10;
        sf.b bVar = this.f46961d0;
        if (bVar == null) {
            return;
        }
        float f11 = this.B0;
        j jVar2 = this.f46959c0;
        float f12 = jVar2.f47009l;
        float f13 = jVar2.f47008k;
        float f14 = f11 / (f12 - f13);
        float f15 = g.f46934g1;
        float f16 = (f13 * f14) - f15;
        int i10 = 2;
        int i11 = 1;
        int i12 = ((int) (f15 / (((sf.e) bVar).f47882b.length < 2 ? 1.0f : ((sf.e) bVar).f47882b[1] * f14))) + 1;
        int iMax = Math.max(0, (this.B - i12) - 1);
        int iMin = Math.min(((sf.e) this.f46961d0).f47882b.length - 1, this.C + i12 + 1);
        this.f46986v0.f48217g = new float[((sf.e) this.f46961d0).d.size()];
        this.f46986v0.h = new float[((sf.e) this.f46961d0).d.size()];
        this.f46986v0.f48218i = new float[((sf.e) this.f46961d0).d.size()];
        this.f46986v0.f48219j = new float[((sf.e) this.f46961d0).d.size()];
        this.f46986v0.f48220k = new float[((sf.e) this.f46961d0).d.size()];
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i13 == i11 ? iMin : iMax;
            int i15 = 0;
            float f17 = 0.0f;
            int i16 = 0;
            while (true) {
                arrayList = this.d;
                if (i15 >= arrayList.size()) {
                    break;
                }
                tf.f fVar = (tf.f) arrayList.get(i15);
                if (fVar.f48206n || fVar.f48207o != 0.0f) {
                    long j10 = fVar.f48195a.f47874a[i14];
                    if (j10 > 0) {
                        f17 += j10 * fVar.f48207o;
                        i16++;
                    }
                }
                i15++;
            }
            int i17 = 0;
            int i18 = 0;
            while (i17 < arrayList.size()) {
                tf.f fVar2 = (tf.f) arrayList.get(i17);
                if (fVar2.f48206n || fVar2.f48207o != 0.0f) {
                    long[] jArr = fVar2.f48195a.f47874a;
                    if (i16 == i11) {
                        if (jArr[i14] == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = fVar2.f48207o;
                        }
                    } else if (f17 == 0.0f) {
                        f10 = 0.0f;
                    } else {
                        f10 = (jArr[i14] * fVar2.f48207o) / f17;
                    }
                    float f18 = (((sf.e) this.f46961d0).f47882b[i14] * f14) - f16;
                    float measuredHeight = f10 * ((getMeasuredHeight() - this.f46982s) - g.f46937j1);
                    float f19 = i18;
                    float measuredHeight2 = ((getMeasuredHeight() - this.f46982s) - measuredHeight) - f19;
                    i18 = (int) (f19 + measuredHeight);
                    if (i13 == 0) {
                        tf.j jVar3 = this.f46986v0;
                        jVar3.f48217g[i17] = f18;
                        jVar3.h[i17] = measuredHeight2;
                    } else {
                        tf.j jVar4 = this.f46986v0;
                        jVar4.f48218i[i17] = f18;
                        jVar4.f48219j[i17] = measuredHeight2;
                    }
                } else {
                    i13 = i13;
                }
                i17++;
                i13 = i13;
                i11 = 1;
            }
            i13++;
            i10 = 2;
            i11 = 1;
        }
    }

    @Override
    public final long r(int i10, int i11) {
        return 100L;
    }
}
