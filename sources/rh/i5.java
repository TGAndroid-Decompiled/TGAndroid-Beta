package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;

public final class i5 extends ViewGroup {
    public final RectF A;
    public final Path B;
    public final y5 C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;

    public x5 f47198a;

    public final c6 f47199b;

    public int[] f47200c;
    public int[] d;

    public int[] f47201e;

    public int[] f47202f;
    public h5 h;

    public final Paint f47203n;

    public final Paint f47204r;

    public final Paint f47205s;
    public final Paint v;

    public final Paint f47206w;

    public final Paint f47207x;

    public final RectF f47208y;

    public i5(Context context, c6 c6Var) {
        super(context);
        this.f47200c = new int[0];
        this.d = new int[0];
        this.f47201e = new int[0];
        this.f47202f = new int[0];
        Paint paint = new Paint(1);
        this.f47203n = paint;
        this.f47204r = new Paint(1);
        this.f47205s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f47206w = new Paint(1);
        this.f47207x = new Paint(1);
        this.f47208y = new RectF();
        this.A = new RectF();
        this.B = new Path();
        this.f47199b = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.C = new y5(this, 0L, 220L, er.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        TL_iv.pageTableCell pagetablecell;
        x5 x5Var = this.f47198a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (x5Var != null && x5Var.f47589b != 0 && x5Var.f47590c != 0) {
            View viewFindFocus = findFocus();
            ViewParent parent = viewFindFocus == null ? null : viewFindFocus.getParent();
            while (true) {
                if (parent == null || parent == this) {
                    pagetablecell = null;
                    break;
                }
                if (parent instanceof j5) {
                    pagetablecell = ((j5) parent).f47227b;
                    break;
                }
                parent = parent.getParent();
            }
            if (pagetablecell != null) {
                return pagetablecell;
            }
            if (this.h == null) {
                return null;
            }
            ArrayList arrayList = this.f47198a.f47593g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((lh.p) this.h).f16499b).contains(pagetablecell3)) {
                    int iB = this.f47198a.b(pagetablecell3);
                    int iA = this.f47198a.a(pagetablecell3);
                    if (iB < i10 || (iB == i10 && iA < i11)) {
                        pagetablecell2 = pagetablecell3;
                        i10 = iB;
                        i11 = iA;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i10 = g6.f23293qh;
        c6 c6Var = this.f47199b;
        this.f47203n.setColor(g6.v0(i10, c6Var));
        int iV0 = g6.v0(g6.M6, c6Var);
        int iRed = Color.red(iV0);
        int iGreen = Color.green(iV0);
        int iBlue = Color.blue(iV0);
        this.f47204r.setColor(g6.v0(g6.f23276ph, c6Var));
        this.f47205s.setColor(Color.argb(20, iRed, iGreen, iBlue));
        this.D = 255;
        int i11 = g6.Oh;
        this.v.setColor(g6.v0(i11, c6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f47206w;
        paint.setStyle(style);
        this.K = g6.v0(g6.E6, c6Var);
        this.L = g6.v0(g6.Sh, c6Var);
        paint.setColor(this.K);
        Paint paint2 = this.f47207x;
        paint2.setStyle(style);
        paint2.setColor(g6.v0(i11, c6Var));
        invalidate();
    }

    public final boolean c(int i10, int i11) {
        if (i10 < 0 || i11 < i10) {
            return false;
        }
        while (i10 <= i11) {
            if (!n(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final boolean d(int i10, int i11) {
        if (i10 < 0 || i11 < i10) {
            return false;
        }
        while (i10 <= i11) {
            if (!o(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        int iB;
        int iMin;
        int i10;
        int i11;
        int iMin2;
        float f11;
        x5 x5Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TL_iv.pageBlockTable pageblocktable;
        int i17;
        int i18;
        Canvas canvas3 = canvas;
        this.F = false;
        this.E = false;
        TL_iv.pageTableCell pagetablecellA = a();
        if (pagetablecellA != null) {
            int iB2 = this.f47198a.b(pagetablecellA);
            int iA = this.f47198a.a(pagetablecellA);
            if (iB2 >= 0 && iA >= 0) {
                int i19 = pagetablecellA.rowspan;
                if (i19 == 0) {
                    i19 = 1;
                }
                int i20 = pagetablecellA.colspan;
                if (i20 == 0) {
                    i20 = 1;
                }
                if (o(iB2)) {
                    this.E = true;
                    int[] iArr = this.f47202f;
                    this.G = iArr[iB2];
                    this.H = iArr[Math.min(iB2 + i19, this.f47198a.f47589b)];
                }
                if (n(iA)) {
                    this.F = true;
                    int[] iArr2 = this.f47201e;
                    this.I = iArr2[iA];
                    this.J = iArr2[Math.min(iA + i20, this.f47198a.f47590c)];
                }
            }
        }
        x5 x5Var2 = this.f47198a;
        RectF rectF = this.f47208y;
        if (x5Var2 != null && x5Var2.f47589b != 0 && x5Var2.f47590c != 0) {
            TL_iv.pageBlockTable pageblocktable2 = x5Var2.f47588a;
            boolean z10 = pageblocktable2 != null && pageblocktable2.striped;
            canvas3.save();
            int[] iArr3 = this.f47201e;
            float f12 = iArr3[0];
            int[] iArr4 = this.f47202f;
            float f13 = iArr4[0];
            x5 x5Var3 = this.f47198a;
            rectF.set(f12, f13, iArr3[x5Var3.f47590c], iArr4[x5Var3.f47589b]);
            Path path = this.B;
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dpf2(10.0f), AndroidUtilities.dpf2(10.0f), Path.Direction.CW);
            canvas3.clipPath(path);
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt = getChildAt(i21);
                if (childAt instanceof j5) {
                    j5 j5Var = (j5) childAt;
                    int iB3 = this.f47198a.b(j5Var.f47227b);
                    int iA2 = this.f47198a.a(j5Var.f47227b);
                    if (iB3 >= 0 && iA2 >= 0) {
                        int iN = x5.n(j5Var.f47227b);
                        int iO = x5.o(j5Var.f47227b);
                        int[] iArr5 = this.f47201e;
                        int i22 = iArr5[iA2];
                        int i23 = this.f47202f[iB3];
                        int i24 = iArr5[Math.min(iA2 + iN, this.f47198a.f47590c)];
                        int i25 = this.f47202f[Math.min(iO + iB3, this.f47198a.f47589b)];
                        if (j5Var.f47227b.header) {
                            canvas3.drawRect(i22, i23, i24, i25, this.f47204r);
                        } else if (z10 && iB3 % 2 == 0) {
                            canvas3 = canvas;
                            canvas3.drawRect(i22, i23, i24, i25, this.f47205s);
                        }
                        canvas3 = canvas;
                    }
                }
            }
            canvas3.restore();
        }
        super.dispatchDraw(canvas);
        if (l()) {
            int iK = k();
            int iR = r();
            int iJ = j();
            int iQ = q();
            if (d(iK, iR)) {
                int[] iArr6 = this.f47202f;
                h(canvas3, iArr6[iK], iArr6[iR + 1]);
            }
            if (c(iJ, iQ)) {
                int[] iArr7 = this.f47201e;
                g(canvas3, iArr7[iJ], iArr7[iQ + 1]);
            }
        } else {
            if (this.E) {
                h(canvas3, this.G, this.H);
            }
            if (this.F) {
                g(canvas3, this.I, this.J);
            }
        }
        x5 x5Var4 = this.f47198a;
        if (x5Var4 != null && (pageblocktable = x5Var4.f47588a) != null && pageblocktable.bordered) {
            Paint paint = this.f47203n;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float fDpf2 = AndroidUtilities.dpf2(10.0f);
            int[] iArr8 = this.f47201e;
            float f14 = iArr8[0] + strokeWidth;
            int[] iArr9 = this.f47202f;
            float f15 = iArr9[0] + strokeWidth;
            x5 x5Var5 = this.f47198a;
            rectF.set(f14, f15, iArr8[x5Var5.f47590c] - strokeWidth, iArr9[x5Var5.f47589b] - strokeWidth);
            canvas3.drawRoundRect(rectF, fDpf2, fDpf2, paint);
            int i26 = 1;
            while (i26 < this.f47198a.f47590c) {
                int i27 = this.f47201e[i26];
                int i28 = -1;
                int i29 = 0;
                while (true) {
                    x5 x5Var6 = this.f47198a;
                    i18 = x5Var6.f47589b;
                    if (i29 >= i18) {
                        break;
                    }
                    TL_iv.pageTableCell[] pagetablecellArr = x5Var6.d[i29];
                    if (pagetablecellArr[i26 - 1] != pagetablecellArr[i26]) {
                        if (i28 < 0) {
                            i28 = this.f47202f[i29];
                        }
                    } else if (i28 >= 0) {
                        float f16 = i27;
                        canvas3.drawLine(f16, i28, f16, this.f47202f[i29], paint);
                        i28 = -1;
                    }
                    i29++;
                    canvas3 = canvas;
                }
                if (i28 >= 0) {
                    float f17 = i27;
                    canvas.drawLine(f17, i28, f17, this.f47202f[i18], paint);
                }
                i26++;
                canvas3 = canvas;
            }
            for (int i30 = 1; i30 < this.f47198a.f47589b; i30++) {
                int i31 = this.f47202f[i30];
                int i32 = -1;
                int i33 = 0;
                while (true) {
                    x5 x5Var7 = this.f47198a;
                    i17 = x5Var7.f47590c;
                    if (i33 >= i17) {
                        break;
                    }
                    TL_iv.pageTableCell[][] pagetablecellArr2 = x5Var7.d;
                    if (pagetablecellArr2[i30 - 1][i33] != pagetablecellArr2[i30][i33]) {
                        if (i32 < 0) {
                            i32 = this.f47201e[i33];
                        }
                    } else if (i32 >= 0) {
                        float f18 = i31;
                        canvas.drawLine(i32, f18, this.f47201e[i33], f18, paint);
                        i32 = -1;
                    }
                    i33++;
                }
                if (i32 >= 0) {
                    float f19 = i32;
                    float f20 = i31;
                    canvas.drawLine(f19, f20, this.f47201e[i17], f20, paint);
                }
            }
        }
        if (this.f47198a != null) {
            float fD = this.C.d(l() ? 1.0f : 0.0f, false);
            if (fD <= 0.001f) {
                canvas2 = canvas;
            } else {
                int i34 = (int) (this.D * fD);
                Paint paint2 = this.v;
                paint2.setAlpha(i34);
                paint2.setStrokeWidth(Math.max(0.4f, fD) * AndroidUtilities.dpf2(2.0f));
                int i35 = 0;
                while (true) {
                    int i36 = this.f47198a.f47589b;
                    if (i35 > i36) {
                        break;
                    }
                    int i37 = i35 < i36 ? this.f47202f[i35] : this.f47202f[i36];
                    int i38 = -1;
                    int i39 = 0;
                    while (true) {
                        i15 = this.f47198a.f47590c;
                        if (i39 >= i15) {
                            break;
                        }
                        if (p(i35 - 1, i39) != p(i35, i39)) {
                            if (i38 < 0) {
                                i38 = this.f47201e[i39];
                            }
                        } else if (i38 >= 0) {
                            int i40 = this.f47201e[i39];
                            if (i40 > i38) {
                                float f21 = f(i38, i37) + i38;
                                float f22 = i40 - f(i40, i37);
                                if (f22 > f21) {
                                    float f23 = i37;
                                    canvas.drawLine(f21, f23, f22, f23, paint2);
                                }
                            }
                            i38 = -1;
                        }
                        i39++;
                    }
                    if (i38 >= 0 && (i16 = this.f47201e[i15]) > i38) {
                        float f24 = f(i38, i37) + i38;
                        float f25 = i16 - f(i16, i37);
                        if (f25 > f24) {
                            float f26 = i37;
                            canvas.drawLine(f24, f26, f25, f26, paint2);
                        }
                    }
                    i35++;
                }
                int i41 = 0;
                while (true) {
                    x5Var = this.f47198a;
                    i12 = x5Var.f47590c;
                    if (i41 > i12) {
                        break;
                    }
                    int[] iArr10 = this.f47201e;
                    int i42 = i41 < i12 ? iArr10[i41] : iArr10[i12];
                    int i43 = -1;
                    int i44 = 0;
                    while (true) {
                        i13 = this.f47198a.f47589b;
                        if (i44 >= i13) {
                            break;
                        }
                        if (p(i44, i41 - 1) != p(i44, i41)) {
                            if (i43 < 0) {
                                i43 = this.f47202f[i44];
                            }
                        } else if (i43 >= 0) {
                            int i45 = this.f47202f[i44];
                            if (i45 > i43) {
                                float f27 = i43 + f(i42, i43);
                                float f28 = i45 - f(i42, i45);
                                if (f28 > f27) {
                                    float f29 = i42;
                                    canvas.drawLine(f29, f27, f29, f28, paint2);
                                }
                            }
                            i43 = -1;
                        }
                        i44++;
                    }
                    if (i43 >= 0 && (i14 = this.f47202f[i13]) > i43) {
                        float f30 = i43 + f(i42, i43);
                        float f31 = i14 - f(i42, i14);
                        if (f31 > f30) {
                            float f32 = i42;
                            canvas.drawLine(f32, f30, f32, f31, paint2);
                        }
                    }
                    i41++;
                }
                canvas2 = canvas;
                int i46 = x5Var.f47589b;
                i(canvas2, this.f47201e[0], this.f47202f[0], 180.0f);
                i(canvas2, this.f47201e[i12], this.f47202f[0], 270.0f);
                i(canvas2, this.f47201e[0], this.f47202f[i46], 90.0f);
                i(canvas2, this.f47201e[i12], this.f47202f[i46], 0.0f);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.f47198a == null) {
            return;
        }
        float fDpf3 = AndroidUtilities.dpf2(3.0f) / 2.0f;
        float fDp = AndroidUtilities.dp(8.0f);
        float fDp2 = (this.f47201e[0] - AndroidUtilities.dp(6.0f)) - fDpf3;
        float fDp3 = AndroidUtilities.dp(6.0f) + this.f47202f[this.f47198a.f47589b] + fDpf3;
        boolean zL = l();
        Paint paint3 = this.f47206w;
        if (!zL) {
            TL_iv.pageTableCell pagetablecellA2 = a();
            if (pagetablecellA2 == null) {
                return;
            }
            int iB4 = this.f47198a.b(pagetablecellA2);
            int iA3 = this.f47198a.a(pagetablecellA2);
            if (iB4 < 0 || iA3 < 0) {
                return;
            }
            int i47 = pagetablecellA2.rowspan;
            if (i47 == 0) {
                i47 = 1;
            }
            int i48 = pagetablecellA2.colspan;
            if (i48 == 0) {
                i48 = 1;
            }
            int[] iArr11 = this.f47202f;
            float f33 = (iArr11[iB4] + iArr11[Math.min(iB4 + i47, this.f47198a.f47589b)]) / 2.0f;
            paint3.setColor(this.E ? this.L : this.K);
            for (int i49 = -1; i49 <= 1; i49++) {
                canvas2.drawCircle(fDp2, (i49 * fDp) + f33, fDpf3, paint3);
            }
            int[] iArr12 = this.f47201e;
            float f34 = (iArr12[iA3] + iArr12[Math.min(iA3 + i48, this.f47198a.f47590c)]) / 2.0f;
            paint3.setColor(this.F ? this.L : this.K);
            for (int i50 = -1; i50 <= 1; i50++) {
                canvas2.drawCircle((i50 * fDp) + f34, fDp3, fDpf3, paint3);
            }
            return;
        }
        int iK2 = k();
        int iR2 = r();
        int iJ2 = j();
        int iQ2 = q();
        if (iK2 < 0 || iJ2 < 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecellA3 = a();
        boolean zV = v();
        if (pagetablecellA3 == null) {
            iB = iK2;
            f10 = 2.0f;
        } else {
            f10 = 2.0f;
            iB = this.f47198a.b(pagetablecellA3);
        }
        if (pagetablecellA3 == null) {
            iMin = iB + 1;
        } else {
            int i51 = pagetablecellA3.rowspan;
            if (i51 == 0) {
                i51 = 1;
            }
            iMin = Math.min(i51 + iB, this.f47198a.f47589b);
        }
        if (zV) {
            int[] iArr13 = this.f47202f;
            i10 = iArr13[iK2];
            i11 = iArr13[iR2 + 1];
        } else {
            int[] iArr14 = this.f47202f;
            i10 = iArr14[iB];
            i11 = iArr14[iMin];
        }
        float f35 = (i10 + i11) / f10;
        paint3.setColor((zV && d(iK2, iR2)) ? this.L : this.K);
        for (int i52 = -1; i52 <= 1; i52++) {
            canvas2.drawCircle(fDp2, (i52 * fDp) + f35, fDpf3, paint3);
        }
        boolean zU = u();
        int iA4 = pagetablecellA3 == null ? iJ2 : this.f47198a.a(pagetablecellA3);
        if (pagetablecellA3 == null) {
            iMin2 = iA4 + 1;
        } else {
            int i53 = pagetablecellA3.colspan;
            if (i53 == 0) {
                i53 = 1;
            }
            iMin2 = Math.min(i53 + iA4, this.f47198a.f47590c);
        }
        if (zU) {
            int[] iArr15 = this.f47201e;
            f11 = iArr15[iJ2] + iArr15[iQ2 + 1];
        } else {
            int[] iArr16 = this.f47201e;
            f11 = iArr16[iA4] + iArr16[iMin2];
        }
        float f36 = f11 / f10;
        paint3.setColor((zU && c(iJ2, iQ2)) ? this.L : this.K);
        for (int i54 = -1; i54 <= 1; i54++) {
            canvas2.drawCircle((i54 * fDp) + f36, fDp3, fDpf3, paint3);
        }
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f47198a.f47590c) {
            for (int i11 = 0; i11 < this.f47198a.f47589b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        x5 x5Var = this.f47198a;
        int i13 = x5Var.f47590c;
        int i14 = x5Var.f47589b;
        int[] iArr = this.f47201e;
        int i15 = 0;
        if (i10 != iArr[0]) {
            i12 = i10 == iArr[i13] ? i13 - 1 : 0;
            return 0.0f;
        }
        int[] iArr2 = this.f47202f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
                if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
                    return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f47200c[i12], this.d[i15]) / 2.0f);
                }
            }
        } else if (i12 >= 0) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f47200c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float fDpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float fDpf3 = AndroidUtilities.dpf2(1.0f) + i11;
        float f10 = this.f47202f[this.f47198a.f47589b];
        float fDp = AndroidUtilities.dp(16.0f) + f10;
        float fMin = Math.min(AndroidUtilities.dpf2(10.0f), (fDpf3 - fDpf2) / 2.0f);
        float f11 = f(i10, this.f47202f[this.f47198a.f47589b]);
        float f12 = f(i11, this.f47202f[this.f47198a.f47589b]);
        Path path = this.B;
        path.rewind();
        path.moveTo(fDpf2, f10 - f11);
        path.lineTo(fDpf2, fDp - fMin);
        float f13 = fMin * 2.0f;
        float f14 = fDp - f13;
        RectF rectF = this.A;
        rectF.set(fDpf2, f14, fDpf2 + f13, fDp);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(fDpf3 - fMin, fDp);
        rectF.set(fDpf3 - f13, f14, fDpf3, fDp);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(fDpf3, f10 - f12);
        if (f12 > 0.0f) {
            float f15 = f12 * 2.0f;
            rectF.set(fDpf3 - f15, f10 - f15, fDpf3, f10);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(fDpf3, f10);
        }
        path.lineTo(fDpf2 + f11, f10);
        if (f11 > 0.0f) {
            float f16 = f11 * 2.0f;
            rectF.set(fDpf2, f10 - f16, f16 + fDpf2, f10);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(fDpf2, f10);
        }
        path.close();
        canvas.drawPath(path, this.f47207x);
    }

    public x5 getModel() {
        return this.f47198a;
    }

    public final void h(Canvas canvas, int i10, int i11) {
        float fDpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float fDpf3 = AndroidUtilities.dpf2(1.0f) + i11;
        float fDp = this.f47201e[0] - AndroidUtilities.dp(16.0f);
        float fMin = Math.min(AndroidUtilities.dpf2(10.0f), (fDpf3 - fDpf2) / 2.0f);
        float f10 = f(this.f47201e[0], i10);
        float f11 = f(this.f47201e[0], i11);
        Path path = this.B;
        path.rewind();
        path.moveTo(this.f47201e[0] + f10, fDpf2);
        path.lineTo(fDp + fMin, fDpf2);
        float f12 = fMin * 2.0f;
        float f13 = fDp + f12;
        RectF rectF = this.A;
        rectF.set(fDp, fDpf2, f13, fDpf2 + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(fDp, fDpf3 - fMin);
        rectF.set(fDp, fDpf3 - f12, f13, fDpf3);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.f47201e[0] + f11, fDpf3);
        if (f11 > 0.0f) {
            int i12 = this.f47201e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i12, fDpf3 - f14, i12 + f14, fDpf3);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.f47201e[0], fDpf3);
        }
        path.lineTo(this.f47201e[0], fDpf2 + f10);
        if (f10 > 0.0f) {
            int i13 = this.f47201e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i13, fDpf2, i13 + f15, f15 + fDpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.f47201e[0], fDpf2);
        }
        path.close();
        canvas.drawPath(path, this.f47207x);
    }

    public final void i(Canvas canvas, int i10, int i11, float f10) {
        float f11 = f(i10, i11);
        if (f11 <= 0.0f) {
            return;
        }
        float f12 = i10 == this.f47201e[0] ? i10 + f11 : i10 - f11;
        float f13 = i11 == this.f47202f[0] ? i11 + f11 : i11 - f11;
        RectF rectF = this.A;
        rectF.set(f12 - f11, f13 - f11, f12 + f11, f13 + f11);
        canvas.drawArc(rectF, f10, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f47198a.f47590c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f47198a.f47589b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        x5 x5Var = this.f47198a;
        if (x5Var != null && this.h != null) {
            ArrayList arrayList = x5Var.f47593g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((lh.p) this.h).f16499b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final j5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof j5) {
                j5 j5Var = (j5) childAt;
                if (j5Var.f47227b == pagetablecell) {
                    return j5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f47198a.f47590c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f47198a.f47589b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f47198a.f47589b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f47198a.f47590c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f47198a == null) {
            return;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof j5) {
                j5 j5Var = (j5) childAt;
                int iB = this.f47198a.b(j5Var.f47227b);
                int iA = this.f47198a.a(j5Var.f47227b);
                if (iB >= 0 && iA >= 0) {
                    int i15 = this.f47201e[iA];
                    int i16 = this.f47202f[iB];
                    j5Var.layout(i15, i16, j5Var.getMeasuredWidth() + i15, j5Var.getMeasuredHeight() + i16);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iA;
        int iDp = AndroidUtilities.dp(20.0f);
        int iDp2 = AndroidUtilities.dp(4.0f);
        int iDp3 = AndroidUtilities.dp(4.0f);
        int iDp4 = AndroidUtilities.dp(10.0f);
        x5 x5Var = this.f47198a;
        if (x5Var == null || x5Var.f47589b == 0 || x5Var.f47590c == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), iDp2 + iDp4);
            this.f47200c = new int[0];
            this.d = new int[0];
            this.f47201e = new int[0];
            this.f47202f = new int[0];
            return;
        }
        int size = (View.MeasureSpec.getSize(i10) - iDp) - iDp3;
        x5 x5Var2 = this.f47198a;
        int i15 = x5Var2.f47589b;
        int i16 = x5Var2.f47590c;
        this.f47200c = new int[i16];
        this.d = new int[i15];
        int iDp5 = AndroidUtilities.dp(x5Var2.f47588a.compact ? 20.0f : 50.0f);
        int i17 = this.f47198a.f47588a.compact ? 5 : 12;
        int iD = i16 == 2 ? i0.a.d(i17 * 4, size / 2, 0) : Math.max(0, Math.round(size / 1.5f));
        float f10 = i17 * 2;
        int iB = org.telegram.messenger.y1.b(f10, iD, iDp5);
        for (int i18 = 0; i18 < i16; i18++) {
            this.f47200c[i18] = iDp5;
        }
        int i19 = 0;
        while (true) {
            i12 = 1;
            if (i19 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i19);
            if (childAt instanceof j5) {
                j5 j5Var = (j5) childAt;
                d1 d1Var = j5Var.f47226a;
                if (x5.n(j5Var.f47227b) == 1 && (iA = this.f47198a.a(j5Var.f47227b)) >= 0 && iA < i16) {
                    int iDp6 = AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(d1Var.getText(), d1Var.getPaint()));
                    int[] iArr = this.f47200c;
                    iArr[iA] = Math.max(iArr[iA], Math.min(iB, iDp6));
                }
            }
            i19++;
        }
        int i20 = 0;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof j5) {
                j5 j5Var2 = (j5) childAt2;
                d1 d1Var2 = j5Var2.f47226a;
                int iN = x5.n(j5Var2.f47227b);
                if (iN > i12) {
                    int iA2 = this.f47198a.a(j5Var2.f47227b);
                    int iMin = Math.min(i16, iN + iA2);
                    if (iA2 >= 0 && iA2 < iMin) {
                        int i21 = 0;
                        for (int i22 = iA2; i22 < iMin; i22++) {
                            i21 += this.f47200c[i22];
                        }
                        int iMin2 = Math.min((iMin - iA2) * iB, AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(d1Var2.getText(), d1Var2.getPaint()))) - i21;
                        while (iA2 < iMin && iMin2 > 0) {
                            int i23 = iMin - iA2;
                            int i24 = ((iMin2 + i23) - 1) / i23;
                            int[] iArr2 = this.f47200c;
                            iArr2[iA2] = iArr2[iA2] + i24;
                            iMin2 -= i24;
                            iA2++;
                        }
                    }
                }
            }
            i20++;
            i12 = 1;
        }
        int i25 = 0;
        for (int i26 : this.f47200c) {
            i25 += i26;
        }
        if (i25 < size && i16 > 0) {
            int i27 = size - i25;
            int i28 = 0;
            while (i28 < i16) {
                int iRound = i28 == i16 + (-1) ? i27 : Math.round((this.f47200c[i28] * i27) / i25);
                int[] iArr3 = this.f47200c;
                int i29 = iArr3[i28] + iRound;
                iArr3[i28] = i29;
                i27 -= iRound;
                i25 -= i29 - iRound;
                i28++;
            }
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i30 = 0;
        while (i30 < getChildCount()) {
            View childAt3 = getChildAt(i30);
            if (childAt3 instanceof j5) {
                j5 j5Var3 = (j5) childAt3;
                int iB2 = this.f47198a.b(j5Var3.f47227b);
                int iA3 = this.f47198a.a(j5Var3.f47227b);
                int iN2 = x5.n(j5Var3.f47227b);
                i14 = i30;
                int i31 = 0;
                for (int i32 = iA3; i32 < iA3 + iN2 && i32 < i16; i32++) {
                    i31 += this.f47200c[i32];
                }
                j5Var3.measure(View.MeasureSpec.makeMeasureSpec(i31, 1073741824), iMakeMeasureSpec);
                if (x5.o(j5Var3.f47227b) == 1) {
                    int measuredHeight = j5Var3.getMeasuredHeight();
                    int[] iArr4 = this.d;
                    if (measuredHeight > iArr4[iB2]) {
                        iArr4[iB2] = j5Var3.getMeasuredHeight();
                    }
                }
            } else {
                i14 = i30;
            }
            i30 = i14 + 1;
        }
        for (int i33 = 0; i33 < getChildCount(); i33++) {
            View childAt4 = getChildAt(i33);
            if (childAt4 instanceof j5) {
                j5 j5Var4 = (j5) childAt4;
                int iB3 = this.f47198a.b(j5Var4.f47227b);
                int iO = x5.o(j5Var4.f47227b);
                if (iO > 1) {
                    int i34 = iB3;
                    int i35 = 0;
                    while (true) {
                        i13 = iB3 + iO;
                        if (i34 >= i13 || i34 >= i15) {
                            break;
                        }
                        i35 += this.d[i34];
                        i34++;
                    }
                    int measuredHeight2 = j5Var4.getMeasuredHeight();
                    if (measuredHeight2 > i35) {
                        int i36 = measuredHeight2 - i35;
                        int iMax = i36 / Math.max(iO, 1);
                        int iMax2 = i36 % Math.max(iO, 1);
                        while (iB3 < i13 && iB3 < i15) {
                            int[] iArr5 = this.d;
                            iArr5[iB3] = iMax + (iMax2 > 0 ? 1 : 0) + iArr5[iB3];
                            if (iMax2 > 0) {
                                iMax2--;
                            }
                            iB3++;
                        }
                    }
                }
            }
        }
        for (int i37 = 0; i37 < getChildCount(); i37++) {
            View childAt5 = getChildAt(i37);
            if (childAt5 instanceof j5) {
                j5 j5Var5 = (j5) childAt5;
                int iB4 = this.f47198a.b(j5Var5.f47227b);
                int iA4 = this.f47198a.a(j5Var5.f47227b);
                int iN3 = x5.n(j5Var5.f47227b);
                int iO2 = x5.o(j5Var5.f47227b);
                int i38 = 0;
                for (int i39 = iA4; i39 < iA4 + iN3 && i39 < i16; i39++) {
                    i38 += this.f47200c[i39];
                }
                int i40 = 0;
                for (int i41 = iB4; i41 < iB4 + iO2 && i41 < i15; i41++) {
                    i40 += this.d[i41];
                }
                j5Var5.measure(View.MeasureSpec.makeMeasureSpec(i38, 1073741824), View.MeasureSpec.makeMeasureSpec(i40, 1073741824));
            }
        }
        int[] iArr6 = new int[i16 + 1];
        this.f47201e = iArr6;
        iArr6[0] = iDp;
        int i42 = 0;
        while (i42 < i16) {
            int[] iArr7 = this.f47201e;
            int i43 = i42 + 1;
            iArr7[i43] = iArr7[i42] + this.f47200c[i42];
            i42 = i43;
        }
        int[] iArr8 = new int[i15 + 1];
        this.f47202f = iArr8;
        iArr8[0] = iDp2;
        int i44 = 0;
        while (i44 < i15) {
            int[] iArr9 = this.f47202f;
            int i45 = i44 + 1;
            iArr9[i45] = iArr9[i44] + this.d[i44];
            i44 = i45;
        }
        setMeasuredDimension(Math.max(this.f47201e[i16] + iDp3, size + iDp + iDp3), this.f47202f[i15] + iDp4);
    }

    public final boolean p(int i10, int i11) {
        h5 h5Var;
        x5 x5Var = this.f47198a;
        if (x5Var == null || (h5Var = this.h) == null || i10 < 0 || i10 >= x5Var.f47589b || i11 < 0 || i11 >= x5Var.f47590c) {
            return false;
        }
        return ((LinkedHashSet) ((lh.p) h5Var).f16499b).contains(x5Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f47198a.f47590c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f47198a.f47589b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof j5) {
                removeViewAt(childCount);
            }
        }
        x5 x5Var = this.f47198a;
        if (x5Var == null) {
            return;
        }
        int size = x5Var.f47593g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.f47198a.f47593g.get(i10);
            j5 j5Var = new j5(getContext(), this.f47199b);
            j5Var.setCompact(this.f47198a.f47588a.compact);
            j5Var.b(pagetablecell);
            addView(j5Var);
        }
    }

    public void setModel(x5 x5Var) {
        this.f47198a = x5Var;
        s();
    }

    public void setSelectionProvider(h5 h5Var) {
        this.h = h5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f47198a.f47589b) {
            for (int i11 = 0; i11 < this.f47198a.f47590c; i11++) {
                if (p(i10, i11)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        if (l()) {
            return !d(k(), r()) || c(j(), q());
        }
        return false;
    }

    public final boolean v() {
        if (l()) {
            return !c(j(), q()) || d(k(), r());
        }
        return false;
    }
}
