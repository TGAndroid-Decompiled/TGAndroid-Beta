package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.Layout;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
public final class yg0 implements Choreographer.FrameCallback {
    public static final LinearGradient E;
    public static final Matrix F = new Matrix();
    public static final Paint f54150y;
    public final Choreographer f54151a = Choreographer.getInstance();
    public List f54152b = new ArrayList();
    public final ArrayList f54153c = new ArrayList();
    public int d = 0;
    public int f54154e = 0;
    public float f54155f = 0.0f;
    public boolean h = false;
    public boolean f54156n = true;
    public long f54157r = 0;
    public float f54158s = org.telegram.messenger.g0.L(40.0f);
    public View f54159w;
    public di.b9 f54160x;

    static {
        Paint paint = new Paint(1);
        f54150y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        E = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i7, float f10, xg0 xg0Var) {
        xg0 zrVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i7 >= 0 && i7 < lineCount) {
                if (xg0Var != null) {
                    zrVar = xg0Var;
                } else {
                    zrVar = new zr(layout, 24);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i7);
                int lineBottom = layout.getLineBottom(i7);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    zrVar.a(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i7);
                float lineRight = layout.getLineRight(i7);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i7);
                    float f11 = max - min;
                    float a10 = c8.l9.a(f10, 0.0f, f11);
                    float f12 = a10 / f11;
                    if (a10 > 0.0f) {
                        if (a10 >= f11) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            zrVar.a(canvas);
                            canvas.restore();
                            return;
                        }
                        float T1 = org.telegram.messenger.g0.T1(-org.telegram.messenger.g0.L(50.0f), f11, f12);
                        org.telegram.messenger.g0.L(50.0f);
                        float f13 = lineTop;
                        float f14 = lineBottom;
                        int saveLayer = canvas.saveLayer(min, f13, max, f14, null);
                        canvas.save();
                        canvas.clipRect(min, f13, max, f14);
                        zrVar.a(canvas);
                        canvas.restore();
                        Matrix matrix = F;
                        matrix.reset();
                        if (paragraphDirection >= 0) {
                            matrix.setScale(org.telegram.messenger.g0.L(50.0f), 1.0f);
                            matrix.postTranslate(T1, 0.0f);
                        } else {
                            matrix.setScale(-org.telegram.messenger.g0.L(50.0f), 1.0f);
                            matrix.postTranslate(f11 - T1, 0.0f);
                        }
                        E.setLocalMatrix(matrix);
                        canvas.drawRect(min, f13, max, f14, f54150y);
                        canvas.restoreToCount(saveLayer);
                    }
                }
            }
        }
    }

    public static float h(Layout layout, int i7) {
        float lineRight = layout.getLineRight(i7) - layout.getLineLeft(i7);
        if (lineRight >= 0.0f) {
            return lineRight;
        }
        return -lineRight;
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int size = this.f54152b.size();
        View view = null;
        for (int i7 = 0; i7 < size; i7++) {
            wg0 wg0Var = (wg0) this.f54152b.get(i7);
            if (!this.f54156n && i7 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            ArrayList arrayList = this.f54153c;
            if (i7 < arrayList.size()) {
                f12 = ((Float) arrayList.get(i7)).floatValue();
            } else {
                f12 = f11;
            }
            if (f12 == f11) {
                f11 = f12;
            } else if (f10 > 0.0f) {
                float f13 = f10 / 0.2f;
                if (f11 > f12) {
                    f11 = Math.min(f11, f13 + f12);
                } else {
                    f11 = Math.max(f11, f12 - f13);
                }
            }
            if (i7 < arrayList.size() && f11 != f12) {
                arrayList.set(i7, Float.valueOf(f11));
            }
            View e10 = wg0Var.e();
            if (e10 != null && e10 != view) {
                if (e10.getAlpha() != f11) {
                    e10.setAlpha(f11);
                }
                view = e10;
            }
        }
    }

    public final float c(wg0 wg0Var) {
        int d = d(wg0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f54153c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(wg0 wg0Var) {
        int size = this.f54152b.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f54152b.get(i7) == wg0Var) {
                return i7;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j3) {
        if (this.h) {
            long j10 = this.f54157r;
            float f10 = 0.0f;
            if (j10 != 0) {
                float f11 = ((float) (j3 - j10)) * 1.0E-9f;
                if (!this.f54152b.isEmpty() && f11 > 0.0f) {
                    float f12 = this.f54158s * f11;
                    while (true) {
                        if (f12 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f54152b.size()) {
                            this.f54156n = true;
                            break;
                        } else {
                            Layout a10 = ((wg0) this.f54152b.get(this.d)).a();
                            if (a10 != null && a10.getLineCount() != 0) {
                                if (this.f54154e >= a10.getLineCount()) {
                                    int lineCount = a10.getLineCount() - 1;
                                    this.f54154e = lineCount;
                                    this.f54155f = h(a10, lineCount);
                                }
                                float h = h(a10, this.f54154e);
                                if (h <= 0.001f) {
                                    if (j(a10)) {
                                        break;
                                    }
                                } else {
                                    float f13 = this.f54155f;
                                    float f14 = h - f13;
                                    if (f14 <= 0.001f) {
                                        if (j(a10)) {
                                            break;
                                        }
                                    } else {
                                        if (f12 < f14) {
                                            f14 = f12;
                                        }
                                        float f15 = f13 + f14;
                                        this.f54155f = f15;
                                        f12 -= f14;
                                        if (h - f15 <= 0.001f && !j(a10)) {
                                            f12 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.f54154e = 0;
                                this.f54155f = 0.0f;
                            }
                        }
                    }
                    this.f54156n = f();
                } else {
                    this.f54156n = this.f54152b.isEmpty();
                }
                f10 = f11;
            }
            this.f54157r = j3;
            a(f10);
            e();
            if (this.f54156n) {
                this.h = false;
                ArrayList arrayList = this.f54153c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.set(i7, Float.valueOf(1.0f));
                }
                int size2 = this.f54152b.size();
                View view = null;
                for (int i10 = 0; i10 < size2; i10++) {
                    View e10 = ((wg0) this.f54152b.get(i10)).e();
                    if (e10 != null && e10 != view) {
                        if (e10.getAlpha() != 1.0f) {
                            e10.setAlpha(1.0f);
                        }
                        view = e10;
                    }
                }
                di.b9 b9Var = this.f54160x;
                if (b9Var != null) {
                    b9Var.run();
                    this.f54160x = null;
                    return;
                }
                return;
            }
            this.f54151a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        wg0 wg0Var;
        int i7 = this.d;
        if (i7 >= 0 && i7 < this.f54152b.size() && (wg0Var = (wg0) this.f54152b.get(this.d)) != null) {
            view = wg0Var.e();
        } else {
            view = null;
        }
        if (view != null) {
            view.invalidate();
            View view2 = this.f54159w;
            if (view2 != null && view2 != view) {
                view2.invalidate();
            }
            this.f54159w = view;
        }
    }

    public final boolean f() {
        if (!this.f54152b.isEmpty()) {
            int size = this.f54152b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((wg0) this.f54152b.get(size)).a();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i7 = this.d;
                if (i7 >= size) {
                    if (i7 <= size) {
                        int lineCount = layout.getLineCount() - 1;
                        float h = h(layout, lineCount);
                        if (this.f54154e < lineCount || this.f54155f < h - 0.001f) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean g(wg0 wg0Var) {
        Layout a10;
        if (d(wg0Var) == this.d && (a10 = wg0Var.a()) != null && this.f54154e < a10.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean i(wg0 wg0Var) {
        int d = d(wg0Var);
        if (d >= 0 && !this.f54152b.isEmpty()) {
            int i7 = this.d;
            if (d < i7 || d <= i7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j(Layout layout) {
        int i7 = this.f54154e + 1;
        this.f54154e = i7;
        this.f54155f = 0.0f;
        if (i7 >= layout.getLineCount()) {
            int i10 = this.d + 1;
            this.d = i10;
            this.f54154e = 0;
            this.f54155f = 0.0f;
            if (i10 >= this.f54152b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f10;
        int i7;
        ArrayList arrayList2;
        boolean z10;
        float f11;
        int lineCount;
        float lineWidth;
        if (!this.f54152b.isEmpty() && this.d >= this.f54152b.size()) {
            int size = this.f54152b.size() - 1;
            this.d = size;
            Layout a10 = ((wg0) this.f54152b.get(size)).a();
            if (a10 == null) {
                lineCount = 0;
            } else {
                lineCount = a10.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.f54154e = max;
            if (a10 == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = a10.getLineWidth(max);
            }
            this.f54155f = lineWidth;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f54152b = arrayList;
        if (arrayList.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (int i10 = this.d; i10 < this.f54152b.size(); i10++) {
                Layout a11 = ((wg0) this.f54152b.get(i10)).a();
                if (a11 != null) {
                    if (i10 == this.d) {
                        i7 = Math.min(Math.max(this.f54154e, 0), Math.max(0, a11.getLineCount() - 1));
                    } else {
                        i7 = 0;
                    }
                    for (int i11 = i7; i11 < a11.getLineCount(); i11++) {
                        float h = h(a11, i11);
                        if (h > 0.001f) {
                            if (i10 == this.d && i11 == i7) {
                                h -= this.f54155f;
                                if (h <= 0.001f) {
                                }
                            }
                            f10 += h;
                        }
                    }
                }
            }
        }
        float L = org.telegram.messenger.g0.L(40.0f);
        if (f10 <= 0.001f) {
            this.f54158s = L;
        } else {
            this.f54158s = Math.max(L, f10 / 1.05f);
        }
        this.f54156n = f();
        while (true) {
            arrayList2 = this.f54153c;
            if (arrayList2.size() <= this.f54152b.size()) {
                break;
            }
            a8.p0.z(1, arrayList2);
        }
        for (int size2 = arrayList2.size(); size2 < this.f54152b.size(); size2++) {
            if (!this.f54156n && size2 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList2.add(Float.valueOf(f11));
        }
        if (!this.f54156n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.f54156n = true;
            }
            this.f54157r = 0L;
            this.f54151a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void l(di.b9 b9Var) {
        this.f54160x = b9Var;
    }
}
