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
public final class zh0 implements Choreographer.FrameCallback {
    public static final LinearGradient D;
    public static final Matrix E = new Matrix();
    public static final Paint f44151y;
    public final Choreographer f44152a = Choreographer.getInstance();
    public List f44153b = new ArrayList();
    public final ArrayList f44154c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public float f44155f = 0.0f;
    public boolean h = false;
    public boolean f44156n = true;
    public long f44157r = 0;
    public float f44158s = org.telegram.messenger.i0.L(40.0f);
    public View f44159w;
    public org.telegram.messenger.dd f44160x;

    static {
        Paint paint = new Paint(1);
        f44151y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        D = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f7, yh0 yh0Var) {
        yh0 ttVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i10 >= 0 && i10 < lineCount) {
                if (yh0Var != null) {
                    ttVar = yh0Var;
                } else {
                    ttVar = new tt(layout, 24);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i10);
                int lineBottom = layout.getLineBottom(i10);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    ttVar.d(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i10);
                float lineRight = layout.getLineRight(i10);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i10);
                    float f10 = max - min;
                    float a2 = w7.u.a(f7, 0.0f, f10);
                    float f11 = a2 / f10;
                    if (a2 > 0.0f) {
                        if (a2 >= f10) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            ttVar.d(canvas);
                            canvas.restore();
                            return;
                        }
                        float T1 = org.telegram.messenger.i0.T1(-org.telegram.messenger.i0.L(50.0f), f10, f11);
                        org.telegram.messenger.i0.L(50.0f);
                        float f12 = lineTop;
                        float f13 = lineBottom;
                        int saveLayer = canvas.saveLayer(min, f12, max, f13, null);
                        canvas.save();
                        canvas.clipRect(min, f12, max, f13);
                        ttVar.d(canvas);
                        canvas.restore();
                        Matrix matrix = E;
                        matrix.reset();
                        if (paragraphDirection >= 0) {
                            matrix.setScale(org.telegram.messenger.i0.L(50.0f), 1.0f);
                            matrix.postTranslate(T1, 0.0f);
                        } else {
                            matrix.setScale(-org.telegram.messenger.i0.L(50.0f), 1.0f);
                            matrix.postTranslate(f10 - T1, 0.0f);
                        }
                        D.setLocalMatrix(matrix);
                        canvas.drawRect(min, f12, max, f13, f44151y);
                        canvas.restoreToCount(saveLayer);
                    }
                }
            }
        }
    }

    public static float h(Layout layout, int i10) {
        float lineRight = layout.getLineRight(i10) - layout.getLineLeft(i10);
        if (lineRight >= 0.0f) {
            return lineRight;
        }
        return -lineRight;
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int size = this.f44153b.size();
        View view = null;
        for (int i10 = 0; i10 < size; i10++) {
            xh0 xh0Var = (xh0) this.f44153b.get(i10);
            if (!this.f44156n && i10 > this.d) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ArrayList arrayList = this.f44154c;
            if (i10 < arrayList.size()) {
                f11 = ((Float) arrayList.get(i10)).floatValue();
            } else {
                f11 = f10;
            }
            if (f11 == f10) {
                f10 = f11;
            } else if (f7 > 0.0f) {
                float f12 = f7 / 0.2f;
                if (f10 > f11) {
                    f10 = Math.min(f10, f12 + f11);
                } else {
                    f10 = Math.max(f10, f11 - f12);
                }
            }
            if (i10 < arrayList.size() && f10 != f11) {
                arrayList.set(i10, Float.valueOf(f10));
            }
            View e = xh0Var.e();
            if (e != null && e != view) {
                if (e.getAlpha() != f10) {
                    e.setAlpha(f10);
                }
                view = e;
            }
        }
    }

    public final float c(xh0 xh0Var) {
        int d = d(xh0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f44154c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(xh0 xh0Var) {
        int size = this.f44153b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f44153b.get(i10) == xh0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j10) {
        if (this.h) {
            long j11 = this.f44157r;
            float f7 = 0.0f;
            if (j11 != 0) {
                float f10 = ((float) (j10 - j11)) * 1.0E-9f;
                if (!this.f44153b.isEmpty() && f10 > 0.0f) {
                    float f11 = this.f44158s * f10;
                    while (true) {
                        if (f11 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f44153b.size()) {
                            this.f44156n = true;
                            break;
                        } else {
                            Layout a2 = ((xh0) this.f44153b.get(this.d)).a();
                            if (a2 != null && a2.getLineCount() != 0) {
                                if (this.e >= a2.getLineCount()) {
                                    int lineCount = a2.getLineCount() - 1;
                                    this.e = lineCount;
                                    this.f44155f = h(a2, lineCount);
                                }
                                float h = h(a2, this.e);
                                if (h <= 0.001f) {
                                    if (j(a2)) {
                                        break;
                                    }
                                } else {
                                    float f12 = this.f44155f;
                                    float f13 = h - f12;
                                    if (f13 <= 0.001f) {
                                        if (j(a2)) {
                                            break;
                                        }
                                    } else {
                                        if (f11 < f13) {
                                            f13 = f11;
                                        }
                                        float f14 = f12 + f13;
                                        this.f44155f = f14;
                                        f11 -= f13;
                                        if (h - f14 <= 0.001f && !j(a2)) {
                                            f11 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.e = 0;
                                this.f44155f = 0.0f;
                            }
                        }
                    }
                    this.f44156n = f();
                } else {
                    this.f44156n = this.f44153b.isEmpty();
                }
                f7 = f10;
            }
            this.f44157r = j10;
            a(f7);
            e();
            if (this.f44156n) {
                this.h = false;
                ArrayList arrayList = this.f44154c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.set(i10, Float.valueOf(1.0f));
                }
                int size2 = this.f44153b.size();
                View view = null;
                for (int i11 = 0; i11 < size2; i11++) {
                    View e = ((xh0) this.f44153b.get(i11)).e();
                    if (e != null && e != view) {
                        if (e.getAlpha() != 1.0f) {
                            e.setAlpha(1.0f);
                        }
                        view = e;
                    }
                }
                org.telegram.messenger.dd ddVar = this.f44160x;
                if (ddVar != null) {
                    ddVar.run();
                    this.f44160x = null;
                    return;
                }
                return;
            }
            this.f44152a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        xh0 xh0Var;
        int i10 = this.d;
        if (i10 >= 0 && i10 < this.f44153b.size() && (xh0Var = (xh0) this.f44153b.get(this.d)) != null) {
            view = xh0Var.e();
        } else {
            view = null;
        }
        if (view != null) {
            view.invalidate();
            View view2 = this.f44159w;
            if (view2 != null && view2 != view) {
                view2.invalidate();
            }
            this.f44159w = view;
        }
    }

    public final boolean f() {
        if (!this.f44153b.isEmpty()) {
            int size = this.f44153b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((xh0) this.f44153b.get(size)).a();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i10 = this.d;
                if (i10 >= size) {
                    if (i10 <= size) {
                        int lineCount = layout.getLineCount() - 1;
                        float h = h(layout, lineCount);
                        if (this.e < lineCount || this.f44155f < h - 0.001f) {
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

    public final boolean g(xh0 xh0Var) {
        Layout a2;
        if (d(xh0Var) == this.d && (a2 = xh0Var.a()) != null && this.e < a2.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean i(xh0 xh0Var) {
        int d = d(xh0Var);
        if (d >= 0 && !this.f44153b.isEmpty()) {
            int i10 = this.d;
            if (d < i10 || d <= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j(Layout layout) {
        int i10 = this.e + 1;
        this.e = i10;
        this.f44155f = 0.0f;
        if (i10 >= layout.getLineCount()) {
            int i11 = this.d + 1;
            this.d = i11;
            this.e = 0;
            this.f44155f = 0.0f;
            if (i11 >= this.f44153b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f7;
        int i10;
        ArrayList arrayList2;
        boolean z10;
        float f10;
        int lineCount;
        float lineWidth;
        if (!this.f44153b.isEmpty() && this.d >= this.f44153b.size()) {
            int size = this.f44153b.size() - 1;
            this.d = size;
            Layout a2 = ((xh0) this.f44153b.get(size)).a();
            if (a2 == null) {
                lineCount = 0;
            } else {
                lineCount = a2.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.e = max;
            if (a2 == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = a2.getLineWidth(max);
            }
            this.f44155f = lineWidth;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f44153b = arrayList;
        if (arrayList.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 0.0f;
            for (int i11 = this.d; i11 < this.f44153b.size(); i11++) {
                Layout a10 = ((xh0) this.f44153b.get(i11)).a();
                if (a10 != null) {
                    if (i11 == this.d) {
                        i10 = Math.min(Math.max(this.e, 0), Math.max(0, a10.getLineCount() - 1));
                    } else {
                        i10 = 0;
                    }
                    for (int i12 = i10; i12 < a10.getLineCount(); i12++) {
                        float h = h(a10, i12);
                        if (h > 0.001f) {
                            if (i11 == this.d && i12 == i10) {
                                h -= this.f44155f;
                                if (h <= 0.001f) {
                                }
                            }
                            f7 += h;
                        }
                    }
                }
            }
        }
        float L = org.telegram.messenger.i0.L(40.0f);
        if (f7 <= 0.001f) {
            this.f44158s = L;
        } else {
            this.f44158s = Math.max(L, f7 / 1.05f);
        }
        this.f44156n = f();
        while (true) {
            arrayList2 = this.f44154c;
            if (arrayList2.size() <= this.f44153b.size()) {
                break;
            }
            a1.g.x(1, arrayList2);
        }
        for (int size2 = arrayList2.size(); size2 < this.f44153b.size(); size2++) {
            if (!this.f44156n && size2 > this.d) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            arrayList2.add(Float.valueOf(f10));
        }
        if (!this.f44156n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.f44156n = true;
            }
            this.f44157r = 0L;
            this.f44152a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void l(org.telegram.messenger.dd ddVar) {
        this.f44160x = ddVar;
    }
}
