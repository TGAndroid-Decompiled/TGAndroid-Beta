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
public final class rj0 implements Choreographer.FrameCallback {
    public static final Matrix E = new Matrix();
    public static final Paint f40121x;
    public static final LinearGradient f40122y;
    public final Choreographer f40123a = Choreographer.getInstance();
    public List f40124b = new ArrayList();
    public final ArrayList f40125c = new ArrayList();
    public int d = 0;
    public int f40126e = 0;
    public float f40127f = 0.0f;
    public boolean h = false;
    public boolean f40128n = true;
    public long f40129r = 0;
    public float f40130s = AndroidUtilities.dp(40.0f);
    public View v;
    public ai.a8 f40131w;

    static {
        Paint paint = new Paint(1);
        f40121x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        f40122y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f7, qj0 qj0Var) {
        qj0 buVar;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i10 >= 0 && i10 < lineCount) {
                if (qj0Var != null) {
                    buVar = qj0Var;
                } else {
                    buVar = new bu(layout, 25);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i10);
                int lineBottom = layout.getLineBottom(i10);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    buVar.b(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i10);
                float lineRight = layout.getLineRight(i10);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i10);
                    float f10 = max - min;
                    float a2 = w7.q.a(f7, 0.0f, f10);
                    float f11 = a2 / f10;
                    if (a2 > 0.0f) {
                        if (a2 >= f10) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            buVar.b(canvas);
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
                        buVar.b(canvas);
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
                        f40122y.setLocalMatrix(matrix);
                        canvas.drawRect(min, f12, max, f13, f40121x);
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
        int size = this.f40124b.size();
        View view = null;
        for (int i10 = 0; i10 < size; i10++) {
            pj0 pj0Var = (pj0) this.f40124b.get(i10);
            if (!this.f40128n && i10 > this.d) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ArrayList arrayList = this.f40125c;
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
            View parentView = pj0Var.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != f10) {
                    parentView.setAlpha(f10);
                }
                view = parentView;
            }
        }
    }

    public final float c(pj0 pj0Var) {
        int d = d(pj0Var);
        if (d >= 0) {
            ArrayList arrayList = this.f40125c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(pj0 pj0Var) {
        int size = this.f40124b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f40124b.get(i10) == pj0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j3) {
        if (this.h) {
            long j10 = this.f40129r;
            float f7 = 0.0f;
            if (j10 != 0) {
                float f10 = ((float) (j3 - j10)) * 1.0E-9f;
                if (!this.f40124b.isEmpty() && f10 > 0.0f) {
                    float f11 = this.f40130s * f10;
                    while (true) {
                        if (f11 <= 0.0f) {
                            break;
                        } else if (this.d >= this.f40124b.size()) {
                            this.f40128n = true;
                            break;
                        } else {
                            Layout layout = ((pj0) this.f40124b.get(this.d)).getLayout();
                            if (layout != null && layout.getLineCount() != 0) {
                                if (this.f40126e >= layout.getLineCount()) {
                                    int lineCount = layout.getLineCount() - 1;
                                    this.f40126e = lineCount;
                                    this.f40127f = i(layout, lineCount);
                                }
                                float i10 = i(layout, this.f40126e);
                                if (i10 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    float f12 = this.f40127f;
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
                                        this.f40127f = f14;
                                        f11 -= f13;
                                        if (i10 - f14 <= 0.001f && !k(layout)) {
                                            f11 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.f40126e = 0;
                                this.f40127f = 0.0f;
                            }
                        }
                    }
                    this.f40128n = f();
                } else {
                    this.f40128n = this.f40124b.isEmpty();
                }
                f7 = f10;
            }
            this.f40129r = j3;
            a(f7);
            e();
            if (this.f40128n) {
                this.h = false;
                ArrayList arrayList = this.f40125c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.set(i11, Float.valueOf(1.0f));
                }
                int size2 = this.f40124b.size();
                View view = null;
                for (int i12 = 0; i12 < size2; i12++) {
                    View parentView = ((pj0) this.f40124b.get(i12)).getParentView();
                    if (parentView != null && parentView != view) {
                        if (parentView.getAlpha() != 1.0f) {
                            parentView.setAlpha(1.0f);
                        }
                        view = parentView;
                    }
                }
                ai.a8 a8Var = this.f40131w;
                if (a8Var != null) {
                    a8Var.run();
                    this.f40131w = null;
                    return;
                }
                return;
            }
            this.f40123a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        pj0 pj0Var;
        int i10 = this.d;
        if (i10 >= 0 && i10 < this.f40124b.size() && (pj0Var = (pj0) this.f40124b.get(this.d)) != null) {
            view = pj0Var.getParentView();
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
        if (!this.f40124b.isEmpty()) {
            int size = this.f40124b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((pj0) this.f40124b.get(size)).getLayout();
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
                        if (this.f40126e < lineCount || this.f40127f < i11 - 0.001f) {
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

    public final boolean g(pj0 pj0Var) {
        Layout layout;
        if (d(pj0Var) == this.d && (layout = pj0Var.getLayout()) != null && this.f40126e < layout.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(pj0 pj0Var) {
        int d = d(pj0Var);
        if (d >= 0 && !this.f40124b.isEmpty()) {
            int i10 = this.d;
            if (d < i10 || d <= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean k(Layout layout) {
        int i10 = this.f40126e + 1;
        this.f40126e = i10;
        this.f40127f = 0.0f;
        if (i10 >= layout.getLineCount()) {
            int i11 = this.d + 1;
            this.d = i11;
            this.f40126e = 0;
            this.f40127f = 0.0f;
            if (i11 >= this.f40124b.size()) {
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
        if (!this.f40124b.isEmpty() && this.d >= this.f40124b.size()) {
            int size = this.f40124b.size() - 1;
            this.d = size;
            Layout layout = ((pj0) this.f40124b.get(size)).getLayout();
            if (layout == null) {
                lineCount = 0;
            } else {
                lineCount = layout.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.f40126e = max;
            if (layout == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = layout.getLineWidth(max);
            }
            this.f40127f = lineWidth;
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.f40124b = list;
        if (list.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 0.0f;
            for (int i11 = this.d; i11 < this.f40124b.size(); i11++) {
                Layout layout2 = ((pj0) this.f40124b.get(i11)).getLayout();
                if (layout2 != null) {
                    if (i11 == this.d) {
                        i10 = Math.min(Math.max(this.f40126e, 0), Math.max(0, layout2.getLineCount() - 1));
                    } else {
                        i10 = 0;
                    }
                    for (int i12 = i10; i12 < layout2.getLineCount(); i12++) {
                        float i13 = i(layout2, i12);
                        if (i13 > 0.001f) {
                            if (i11 == this.d && i12 == i10) {
                                i13 -= this.f40127f;
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
            this.f40130s = dp;
        } else {
            this.f40130s = Math.max(dp, f7 / 1.05f);
        }
        this.f40128n = f();
        while (true) {
            arrayList = this.f40125c;
            if (arrayList.size() <= this.f40124b.size()) {
                break;
            }
            a4.a.y(1, arrayList);
        }
        for (int size2 = arrayList.size(); size2 < this.f40124b.size(); size2++) {
            if (!this.f40128n && size2 > this.d) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            arrayList.add(Float.valueOf(f10));
        }
        if (!this.f40128n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.f40128n = true;
            }
            this.f40129r = 0L;
            this.f40123a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void m(ai.a8 a8Var) {
        this.f40131w = a8Var;
    }
}
