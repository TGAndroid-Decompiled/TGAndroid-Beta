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
public final class tg0 implements Choreographer.FrameCallback {
    public static final LinearGradient D;
    public static final Matrix E = new Matrix();
    public static final Paint f50052y;
    public final Choreographer f50053a = Choreographer.getInstance();
    public List f50054b = new ArrayList();
    public final ArrayList f50055c = new ArrayList();
    public int d = 0;
    public int f50056e = 0;
    public float f50057f = 0.0f;
    public boolean h = false;
    public boolean f50058n = true;
    public long f50059r = 0;
    public float f50060s = org.telegram.messenger.g0.L(40.0f);
    public View f50061w;
    public bi.ia f50062x;

    static {
        Paint paint = new Paint(1);
        f50052y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        D = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i7, float f10, sg0 sg0Var) {
        sg0 wrVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i7 >= 0 && i7 < lineCount) {
                if (sg0Var != null) {
                    wrVar = sg0Var;
                } else {
                    wrVar = new wr(layout, 24);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i7);
                int lineBottom = layout.getLineBottom(i7);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    wrVar.d(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i7);
                float lineRight = layout.getLineRight(i7);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i7);
                    float f11 = max - min;
                    float a10 = c8.j9.a(f10, 0.0f, f11);
                    float f12 = a10 / f11;
                    if (a10 > 0.0f) {
                        if (a10 >= f11) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            wrVar.d(canvas);
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
                        wrVar.d(canvas);
                        canvas.restore();
                        Matrix matrix = E;
                        matrix.reset();
                        if (paragraphDirection >= 0) {
                            matrix.setScale(org.telegram.messenger.g0.L(50.0f), 1.0f);
                            matrix.postTranslate(T1, 0.0f);
                        } else {
                            matrix.setScale(-org.telegram.messenger.g0.L(50.0f), 1.0f);
                            matrix.postTranslate(f11 - T1, 0.0f);
                        }
                        D.setLocalMatrix(matrix);
                        canvas.drawRect(min, f13, max, f14, f50052y);
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
        int size = this.f50054b.size();
        View view = null;
        for (int i7 = 0; i7 < size; i7++) {
            rg0 rg0Var = (rg0) this.f50054b.get(i7);
            if (!this.f50058n && i7 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            ArrayList arrayList = this.f50055c;
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
            View e10 = rg0Var.e();
            if (e10 != null && e10 != view) {
                if (e10.getAlpha() != f11) {
                    e10.setAlpha(f11);
                }
                view = e10;
            }
        }
    }

    public final float c(rg0 rg0Var) {
        int d = d(rg0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f50055c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(rg0 rg0Var) {
        int size = this.f50054b.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f50054b.get(i7) == rg0Var) {
                return i7;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j3) {
        if (this.h) {
            long j10 = this.f50059r;
            float f10 = 0.0f;
            if (j10 != 0) {
                float f11 = ((float) (j3 - j10)) * 1.0E-9f;
                if (!this.f50054b.isEmpty() && f11 > 0.0f) {
                    float f12 = this.f50060s * f11;
                    while (true) {
                        if (f12 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f50054b.size()) {
                            this.f50058n = true;
                            break;
                        } else {
                            Layout a10 = ((rg0) this.f50054b.get(this.d)).a();
                            if (a10 != null && a10.getLineCount() != 0) {
                                if (this.f50056e >= a10.getLineCount()) {
                                    int lineCount = a10.getLineCount() - 1;
                                    this.f50056e = lineCount;
                                    this.f50057f = h(a10, lineCount);
                                }
                                float h = h(a10, this.f50056e);
                                if (h <= 0.001f) {
                                    if (j(a10)) {
                                        break;
                                    }
                                } else {
                                    float f13 = this.f50057f;
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
                                        this.f50057f = f15;
                                        f12 -= f14;
                                        if (h - f15 <= 0.001f && !j(a10)) {
                                            f12 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.f50056e = 0;
                                this.f50057f = 0.0f;
                            }
                        }
                    }
                    this.f50058n = f();
                } else {
                    this.f50058n = this.f50054b.isEmpty();
                }
                f10 = f11;
            }
            this.f50059r = j3;
            a(f10);
            e();
            if (this.f50058n) {
                this.h = false;
                ArrayList arrayList = this.f50055c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.set(i7, Float.valueOf(1.0f));
                }
                int size2 = this.f50054b.size();
                View view = null;
                for (int i10 = 0; i10 < size2; i10++) {
                    View e10 = ((rg0) this.f50054b.get(i10)).e();
                    if (e10 != null && e10 != view) {
                        if (e10.getAlpha() != 1.0f) {
                            e10.setAlpha(1.0f);
                        }
                        view = e10;
                    }
                }
                bi.ia iaVar = this.f50062x;
                if (iaVar != null) {
                    iaVar.run();
                    this.f50062x = null;
                    return;
                }
                return;
            }
            this.f50053a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        rg0 rg0Var;
        int i7 = this.d;
        if (i7 >= 0 && i7 < this.f50054b.size() && (rg0Var = (rg0) this.f50054b.get(this.d)) != null) {
            view = rg0Var.e();
        } else {
            view = null;
        }
        if (view != null) {
            view.invalidate();
            View view2 = this.f50061w;
            if (view2 != null && view2 != view) {
                view2.invalidate();
            }
            this.f50061w = view;
        }
    }

    public final boolean f() {
        if (!this.f50054b.isEmpty()) {
            int size = this.f50054b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((rg0) this.f50054b.get(size)).a();
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
                        if (this.f50056e < lineCount || this.f50057f < h - 0.001f) {
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

    public final boolean g(rg0 rg0Var) {
        Layout a10;
        if (d(rg0Var) == this.d && (a10 = rg0Var.a()) != null && this.f50056e < a10.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean i(rg0 rg0Var) {
        int d = d(rg0Var);
        if (d >= 0 && !this.f50054b.isEmpty()) {
            int i7 = this.d;
            if (d < i7 || d <= i7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j(Layout layout) {
        int i7 = this.f50056e + 1;
        this.f50056e = i7;
        this.f50057f = 0.0f;
        if (i7 >= layout.getLineCount()) {
            int i10 = this.d + 1;
            this.d = i10;
            this.f50056e = 0;
            this.f50057f = 0.0f;
            if (i10 >= this.f50054b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f10;
        int i7;
        ArrayList arrayList2;
        boolean z9;
        float f11;
        int lineCount;
        float lineWidth;
        if (!this.f50054b.isEmpty() && this.d >= this.f50054b.size()) {
            int size = this.f50054b.size() - 1;
            this.d = size;
            Layout a10 = ((rg0) this.f50054b.get(size)).a();
            if (a10 == null) {
                lineCount = 0;
            } else {
                lineCount = a10.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.f50056e = max;
            if (a10 == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = a10.getLineWidth(max);
            }
            this.f50057f = lineWidth;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f50054b = arrayList;
        if (arrayList.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (int i10 = this.d; i10 < this.f50054b.size(); i10++) {
                Layout a11 = ((rg0) this.f50054b.get(i10)).a();
                if (a11 != null) {
                    if (i10 == this.d) {
                        i7 = Math.min(Math.max(this.f50056e, 0), Math.max(0, a11.getLineCount() - 1));
                    } else {
                        i7 = 0;
                    }
                    for (int i11 = i7; i11 < a11.getLineCount(); i11++) {
                        float h = h(a11, i11);
                        if (h > 0.001f) {
                            if (i10 == this.d && i11 == i7) {
                                h -= this.f50057f;
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
            this.f50060s = L;
        } else {
            this.f50060s = Math.max(L, f10 / 1.05f);
        }
        this.f50058n = f();
        while (true) {
            arrayList2 = this.f50055c;
            if (arrayList2.size() <= this.f50054b.size()) {
                break;
            }
            a8.p0.z(1, arrayList2);
        }
        for (int size2 = arrayList2.size(); size2 < this.f50054b.size(); size2++) {
            if (!this.f50058n && size2 > this.d) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList2.add(Float.valueOf(f11));
        }
        if (!this.f50058n && !(z9 = this.h) && !z9) {
            this.h = true;
            if (f()) {
                this.f50058n = true;
            }
            this.f50059r = 0L;
            this.f50053a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void l(bi.ia iaVar) {
        this.f50062x = iaVar;
    }
}
