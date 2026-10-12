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
    public static final Paint f43548x;
    public static final LinearGradient f43549y;
    public final Choreographer f43550a = Choreographer.getInstance();
    public List f43551b = new ArrayList();
    public final ArrayList f43552c = new ArrayList();
    public int d = 0;
    public int f43553e = 0;
    public float f43554f = 0.0f;
    public boolean h = false;
    public boolean f43555n = true;
    public long f43556r = 0;
    public float f43557s = AndroidUtilities.dp(40.0f);
    public View v;
    public ai.b8 f43558w;

    static {
        Paint paint = new Paint(1);
        f43548x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        f43549y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f7, vj0 vj0Var) {
        vj0 juVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i10 >= 0 && i10 < lineCount) {
                if (vj0Var != null) {
                    juVar = vj0Var;
                } else {
                    juVar = new ju(layout, 23);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i10);
                int lineBottom = layout.getLineBottom(i10);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    juVar.a(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i10);
                float lineRight = layout.getLineRight(i10);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i10);
                    float f10 = max - min;
                    float a2 = w7.n.a(f7, 0.0f, f10);
                    float f11 = a2 / f10;
                    if (a2 > 0.0f) {
                        if (a2 >= f10) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            juVar.a(canvas);
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
                        juVar.a(canvas);
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
                        f43549y.setLocalMatrix(matrix);
                        canvas.drawRect(min, f12, max, f13, f43548x);
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
        int size = this.f43551b.size();
        View view = null;
        for (int i10 = 0; i10 < size; i10++) {
            uj0 uj0Var = (uj0) this.f43551b.get(i10);
            if (!this.f43555n && i10 > this.d) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ArrayList arrayList = this.f43552c;
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
            ArrayList arrayList = this.f43552c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(uj0 uj0Var) {
        int size = this.f43551b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f43551b.get(i10) == uj0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j3) {
        if (this.h) {
            long j10 = this.f43556r;
            float f7 = 0.0f;
            if (j10 != 0) {
                float f10 = ((float) (j3 - j10)) * 1.0E-9f;
                if (!this.f43551b.isEmpty() && f10 > 0.0f) {
                    float f11 = this.f43557s * f10;
                    while (true) {
                        if (f11 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f43551b.size()) {
                            this.f43555n = true;
                            break;
                        } else {
                            Layout layout = ((uj0) this.f43551b.get(this.d)).getLayout();
                            if (layout != null && layout.getLineCount() != 0) {
                                if (this.f43553e >= layout.getLineCount()) {
                                    int lineCount = layout.getLineCount() - 1;
                                    this.f43553e = lineCount;
                                    this.f43554f = i(layout, lineCount);
                                }
                                float i10 = i(layout, this.f43553e);
                                if (i10 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    float f12 = this.f43554f;
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
                                        this.f43554f = f14;
                                        f11 -= f13;
                                        if (i10 - f14 <= 0.001f && !k(layout)) {
                                            f11 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.f43553e = 0;
                                this.f43554f = 0.0f;
                            }
                        }
                    }
                    this.f43555n = f();
                } else {
                    this.f43555n = this.f43551b.isEmpty();
                }
                f7 = f10;
            }
            this.f43556r = j3;
            a(f7);
            e();
            if (this.f43555n) {
                this.h = false;
                ArrayList arrayList = this.f43552c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.set(i11, Float.valueOf(1.0f));
                }
                int size2 = this.f43551b.size();
                View view = null;
                for (int i12 = 0; i12 < size2; i12++) {
                    View parentView = ((uj0) this.f43551b.get(i12)).getParentView();
                    if (parentView != null && parentView != view) {
                        if (parentView.getAlpha() != 1.0f) {
                            parentView.setAlpha(1.0f);
                        }
                        view = parentView;
                    }
                }
                ai.b8 b8Var = this.f43558w;
                if (b8Var != null) {
                    b8Var.run();
                    this.f43558w = null;
                    return;
                }
                return;
            }
            this.f43550a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        uj0 uj0Var;
        int i10 = this.d;
        if (i10 >= 0 && i10 < this.f43551b.size() && (uj0Var = (uj0) this.f43551b.get(this.d)) != null) {
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
        if (!this.f43551b.isEmpty()) {
            int size = this.f43551b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((uj0) this.f43551b.get(size)).getLayout();
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
                        if (this.f43553e < lineCount || this.f43554f < i11 - 0.001f) {
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
        if (d(uj0Var) == this.d && (layout = uj0Var.getLayout()) != null && this.f43553e < layout.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(uj0 uj0Var) {
        int d = d(uj0Var);
        if (d >= 0 && !this.f43551b.isEmpty()) {
            int i10 = this.d;
            if (d < i10 || d <= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean k(Layout layout) {
        int i10 = this.f43553e + 1;
        this.f43553e = i10;
        this.f43554f = 0.0f;
        if (i10 >= layout.getLineCount()) {
            int i11 = this.d + 1;
            this.d = i11;
            this.f43553e = 0;
            this.f43554f = 0.0f;
            if (i11 >= this.f43551b.size()) {
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
        if (!this.f43551b.isEmpty() && this.d >= this.f43551b.size()) {
            int size = this.f43551b.size() - 1;
            this.d = size;
            Layout layout = ((uj0) this.f43551b.get(size)).getLayout();
            if (layout == null) {
                lineCount = 0;
            } else {
                lineCount = layout.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.f43553e = max;
            if (layout == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = layout.getLineWidth(max);
            }
            this.f43554f = lineWidth;
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.f43551b = list;
        if (list.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 0.0f;
            for (int i11 = this.d; i11 < this.f43551b.size(); i11++) {
                Layout layout2 = ((uj0) this.f43551b.get(i11)).getLayout();
                if (layout2 != null) {
                    if (i11 == this.d) {
                        i10 = Math.min(Math.max(this.f43553e, 0), Math.max(0, layout2.getLineCount() - 1));
                    } else {
                        i10 = 0;
                    }
                    for (int i12 = i10; i12 < layout2.getLineCount(); i12++) {
                        float i13 = i(layout2, i12);
                        if (i13 > 0.001f) {
                            if (i11 == this.d && i12 == i10) {
                                i13 -= this.f43554f;
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
            this.f43557s = dp;
        } else {
            this.f43557s = Math.max(dp, f7 / 1.05f);
        }
        this.f43555n = f();
        while (true) {
            arrayList = this.f43552c;
            if (arrayList.size() <= this.f43551b.size()) {
                break;
            }
            a1.g.y(1, arrayList);
        }
        for (int size2 = arrayList.size(); size2 < this.f43551b.size(); size2++) {
            if (!this.f43555n && size2 > this.d) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            arrayList.add(Float.valueOf(f10));
        }
        if (!this.f43555n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.f43555n = true;
            }
            this.f43556r = 0L;
            this.f43550a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void m(ai.b8 b8Var) {
        this.f43558w = b8Var;
    }
}
