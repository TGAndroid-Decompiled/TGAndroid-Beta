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
import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Choreographer.FrameCallback {
    public static final Matrix E = new Matrix();
    public static final Paint f42440x;
    public static final LinearGradient f42441y;
    public final Choreographer f42442a = Choreographer.getInstance();
    public List f42443b = new ArrayList();
    public final ArrayList f42444c = new ArrayList();
    public int d = 0;
    public int f42445e = 0;
    public float f42446f = 0.0f;
    public boolean h = false;
    public boolean f42447n = true;
    public long f42448r = 0;
    public float f42449s = AndroidUtilities.dp(40.0f);
    public View v;
    public bi.h7 f42450w;

    static {
        Paint paint = new Paint(1);
        f42440x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        f42441y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f7, vj0 vj0Var) {
        vj0 iuVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i10 >= 0 && i10 < lineCount) {
                if (vj0Var != null) {
                    iuVar = vj0Var;
                } else {
                    iuVar = new iu(layout, 24);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i10);
                int lineBottom = layout.getLineBottom(i10);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    iuVar.b(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i10);
                float lineRight = layout.getLineRight(i10);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i10);
                    float f10 = max - min;
                    float a2 = w7.p.a(f7, 0.0f, f10);
                    float f11 = a2 / f10;
                    if (a2 > 0.0f) {
                        if (a2 >= f10) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            iuVar.b(canvas);
                            canvas.restore();
                            return;
                        }
                        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(50.0f), f10, f11);
                        AndroidUtilities.dp(50.0f);
                        float f12 = lineTop;
                        float f13 = lineBottom;
                        int saveLayer = canvas.saveLayer(min, f12, max, f13, null);
                        canvas.save();
                        canvas.clipRect(min, f12, max, f13);
                        iuVar.b(canvas);
                        canvas.restore();
                        Matrix matrix = E;
                        matrix.reset();
                        if (paragraphDirection >= 0) {
                            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
                            matrix.postTranslate(lerp, 0.0f);
                        } else {
                            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
                            matrix.postTranslate(f10 - lerp, 0.0f);
                        }
                        f42441y.setLocalMatrix(matrix);
                        canvas.drawRect(min, f12, max, f13, f42440x);
                        canvas.restoreToCount(saveLayer);
                    }
                }
            }
        }
    }

    public static float i(Layout layout, int i10) {
        float lineRight = layout.getLineRight(i10) - layout.getLineLeft(i10);
        if (lineRight >= 0.0f) {
            return lineRight;
        }
        return -lineRight;
    }

    public final void a(float f7) {
        float f10;
        float f11;
        int size = this.f42443b.size();
        View view = null;
        for (int i10 = 0; i10 < size; i10++) {
            uj0 uj0Var = (uj0) this.f42443b.get(i10);
            if (!this.f42447n && i10 > this.d) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ArrayList arrayList = this.f42444c;
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
            View parentView = uj0Var.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != f10) {
                    parentView.setAlpha(f10);
                }
                view = parentView;
            }
        }
    }

    public final float c(uj0 uj0Var) {
        int d = d(uj0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f42444c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(uj0 uj0Var) {
        int size = this.f42443b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f42443b.get(i10) == uj0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j3) {
        if (this.h) {
            long j10 = this.f42448r;
            float f7 = 0.0f;
            if (j10 != 0) {
                float f10 = ((float) (j3 - j10)) * 1.0E-9f;
                if (!this.f42443b.isEmpty() && f10 > 0.0f) {
                    float f11 = this.f42449s * f10;
                    while (true) {
                        if (f11 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f42443b.size()) {
                            this.f42447n = true;
                            break;
                        } else {
                            Layout layout = ((uj0) this.f42443b.get(this.d)).getLayout();
                            if (layout != null && layout.getLineCount() != 0) {
                                if (this.f42445e >= layout.getLineCount()) {
                                    int lineCount = layout.getLineCount() - 1;
                                    this.f42445e = lineCount;
                                    this.f42446f = i(layout, lineCount);
                                }
                                float i10 = i(layout, this.f42445e);
                                if (i10 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    float f12 = this.f42446f;
                                    float f13 = i10 - f12;
                                    if (f13 <= 0.001f) {
                                        if (k(layout)) {
                                            break;
                                        }
                                    } else {
                                        if (f11 < f13) {
                                            f13 = f11;
                                        }
                                        float f14 = f12 + f13;
                                        this.f42446f = f14;
                                        f11 -= f13;
                                        if (i10 - f14 <= 0.001f && !k(layout)) {
                                            f11 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.f42445e = 0;
                                this.f42446f = 0.0f;
                            }
                        }
                    }
                    this.f42447n = f();
                } else {
                    this.f42447n = this.f42443b.isEmpty();
                }
                f7 = f10;
            }
            this.f42448r = j3;
            a(f7);
            e();
            if (this.f42447n) {
                this.h = false;
                ArrayList arrayList = this.f42444c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.set(i11, Float.valueOf(1.0f));
                }
                int size2 = this.f42443b.size();
                View view = null;
                for (int i12 = 0; i12 < size2; i12++) {
                    View parentView = ((uj0) this.f42443b.get(i12)).getParentView();
                    if (parentView != null && parentView != view) {
                        if (parentView.getAlpha() != 1.0f) {
                            parentView.setAlpha(1.0f);
                        }
                        view = parentView;
                    }
                }
                bi.h7 h7Var = this.f42450w;
                if (h7Var != null) {
                    h7Var.run();
                    this.f42450w = null;
                    return;
                }
                return;
            }
            this.f42442a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        uj0 uj0Var;
        int i10 = this.d;
        if (i10 >= 0 && i10 < this.f42443b.size() && (uj0Var = (uj0) this.f42443b.get(this.d)) != null) {
            view = uj0Var.getParentView();
        } else {
            view = null;
        }
        if (view != null) {
            view.invalidate();
            View view2 = this.v;
            if (view2 != null && view2 != view) {
                view2.invalidate();
            }
            this.v = view;
        }
    }

    public final boolean f() {
        if (!this.f42443b.isEmpty()) {
            int size = this.f42443b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((uj0) this.f42443b.get(size)).getLayout();
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
                        float i11 = i(layout, lineCount);
                        if (this.f42445e < lineCount || this.f42446f < i11 - 0.001f) {
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

    public final boolean g(uj0 uj0Var) {
        Layout layout;
        if (d(uj0Var) == this.d && (layout = uj0Var.getLayout()) != null && this.f42445e < layout.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(uj0 uj0Var) {
        int d = d(uj0Var);
        if (d >= 0 && !this.f42443b.isEmpty()) {
            int i10 = this.d;
            if (d < i10 || d <= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean k(Layout layout) {
        int i10 = this.f42445e + 1;
        this.f42445e = i10;
        this.f42446f = 0.0f;
        if (i10 >= layout.getLineCount()) {
            int i11 = this.d + 1;
            this.d = i11;
            this.f42445e = 0;
            this.f42446f = 0.0f;
            if (i11 >= this.f42443b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void l(List list) {
        float f7;
        int i10;
        ArrayList arrayList;
        boolean z10;
        float f10;
        int lineCount;
        float lineWidth;
        if (!this.f42443b.isEmpty() && this.d >= this.f42443b.size()) {
            int size = this.f42443b.size() - 1;
            this.d = size;
            Layout layout = ((uj0) this.f42443b.get(size)).getLayout();
            if (layout == null) {
                lineCount = 0;
            } else {
                lineCount = layout.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.f42445e = max;
            if (layout == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = layout.getLineWidth(max);
            }
            this.f42446f = lineWidth;
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.f42443b = list;
        if (list.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 0.0f;
            for (int i11 = this.d; i11 < this.f42443b.size(); i11++) {
                Layout layout2 = ((uj0) this.f42443b.get(i11)).getLayout();
                if (layout2 != null) {
                    if (i11 == this.d) {
                        i10 = Math.min(Math.max(this.f42445e, 0), Math.max(0, layout2.getLineCount() - 1));
                    } else {
                        i10 = 0;
                    }
                    for (int i12 = i10; i12 < layout2.getLineCount(); i12++) {
                        float i13 = i(layout2, i12);
                        if (i13 > 0.001f) {
                            if (i11 == this.d && i12 == i10) {
                                i13 -= this.f42446f;
                                if (i13 <= 0.001f) {
                                }
                            }
                            f7 += i13;
                        }
                    }
                }
            }
        }
        float dp = AndroidUtilities.dp(40.0f);
        if (f7 <= 0.001f) {
            this.f42449s = dp;
        } else {
            this.f42449s = Math.max(dp, f7 / 1.05f);
        }
        this.f42447n = f();
        while (true) {
            arrayList = this.f42444c;
            if (arrayList.size() <= this.f42443b.size()) {
                break;
            }
            a4.a.x(1, arrayList);
        }
        for (int size2 = arrayList.size(); size2 < this.f42443b.size(); size2++) {
            if (!this.f42447n && size2 > this.d) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            arrayList.add(Float.valueOf(f10));
        }
        if (!this.f42447n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.f42447n = true;
            }
            this.f42448r = 0L;
            this.f42442a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void m(bi.h7 h7Var) {
        this.f42450w = h7Var;
    }
}
