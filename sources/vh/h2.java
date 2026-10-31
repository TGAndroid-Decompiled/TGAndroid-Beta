package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.gr;
import org.telegram.ui.yv0;
public final class h2 extends FrameLayout {
    public static int f51227d0;
    public float D;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final FrameLayout I;
    public final org.telegram.ui.Cells.n2 J;
    public final float K;
    public final boolean L;
    public f2 M;
    public f2 N;
    public String O;
    public final d0 P;
    public org.telegram.messenger.s5 Q;
    public String R;
    public Object S;
    public rh.l5 T;
    public boolean U;
    public boolean V;
    public final Path W;
    public Bitmap f51230a;
    public final float[] f51231a0;
    public final Paint f51232b;
    public final Paint f51233b0;
    public final Paint f51234c;
    public final Paint d;
    public LinearGradient e;
    public final Matrix f51235f;
    public final Matrix h;
    public final Paint f51236n;
    public final TextPaint f51237r;
    public final TextPaint f51238s;
    public final Drawable f51239w;
    public boolean f51240x;
    public StaticLayout f51241y;
    public static final ArrayList f51226c0 = new ArrayList();
    public static final HashMap f51228e0 = new HashMap();
    public static final vg.h f51229f0 = new vg.h(45, 1);

    public h2(Context context, org.telegram.ui.ActionBar.p6 p6Var, float f7, boolean z10) {
        super(context);
        this.f51232b = new Paint(3);
        Paint paint = new Paint(1);
        this.f51234c = paint;
        this.d = new Paint(1);
        this.f51235f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f51236n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f51237r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f51238s = textPaint2;
        this.P = new d0(this, 8);
        this.W = new Path();
        this.f51231a0 = new float[8];
        this.f51233b0 = new Paint(1);
        this.K = f7;
        this.L = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.i0.L(11.33f));
        textPaint2.setColor(-1);
        this.f51239w = context.getResources().getDrawable(2131232546).mutate();
        org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2(this, context, p6Var);
        this.J = n2Var;
        if (!z10) {
            n2Var.setDrawBackgroundAsArc(6);
        } else {
            n2Var.setDrawBackgroundAsArc(7);
        }
        n2Var.b(org.telegram.ui.ActionBar.t6.W9, org.telegram.ui.ActionBar.t6.X9, org.telegram.ui.ActionBar.t6.V9);
        CheckBoxBase checkBoxBase = n2Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        if (checkBoxBase.f23923u != i10) {
            checkBoxBase.f23923u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.addView(n2Var, w7.b6.e(26, 26, 17));
        addView(frameLayout, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        n2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f51228e0;
            Integer num = (Integer) hashMap.get(str);
            if (num != null) {
                int intValue = num.intValue() - 1;
                Integer valueOf = Integer.valueOf(intValue);
                if (intValue <= 0) {
                    hashMap.remove(str);
                } else {
                    hashMap.put(str, valueOf);
                }
            }
        }
    }

    public final org.telegram.messenger.s5 a() {
        org.telegram.messenger.s5 s5Var = this.Q;
        if (s5Var != null) {
            return s5Var;
        }
        ArrayList arrayList = f51226c0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.s5 s5Var2 = new org.telegram.messenger.s5("gallery_load_" + arrayList.size(), true);
            this.Q = s5Var2;
            arrayList.add(s5Var2);
        } else {
            int i10 = f51227d0 + 1;
            f51227d0 = i10;
            if (i10 >= arrayList.size()) {
                f51227d0 = 0;
            }
            this.Q = (org.telegram.messenger.s5) arrayList.get(f51227d0);
        }
        return this.Q;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.R);
            this.R = null;
            this.f51230a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof ef;
        if (z10) {
            ef efVar = (ef) obj;
            str = efVar.f19508c;
            if (str == null) {
                if (efVar.f19507b && !efVar.d()) {
                    str = "" + efVar.C;
                } else {
                    str = efVar.I;
                }
            }
        } else if (obj instanceof n5) {
            str = "d" + ((n5) obj).f51517b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.R)) {
            return;
        }
        String str2 = this.R;
        if (str2 != null) {
            this.f51230a = null;
            d(str2);
            invalidate();
        }
        this.R = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z10) {
            ef efVar2 = (ef) obj;
            if (efVar2.T != 0 && efVar2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{efVar2.T, efVar2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f51229f0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f51228e0;
                Integer num = (Integer) hashMap.get(str);
                int i10 = 1;
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i10));
            }
        }
        this.f51230a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.T != null) {
            a().cancelRunnable(this.T);
            this.T = null;
        }
        org.telegram.messenger.s5 a2 = a();
        rh.l5 l5Var = new rh.l5(this, obj, str, 12);
        this.T = l5Var;
        a2.postRunnable(l5Var);
    }

    public final Bitmap c(ef efVar, BitmapFactory.Options options) {
        if (efVar == null) {
            return null;
        }
        int i10 = efVar.C;
        String str = efVar.f19508c;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (efVar.f19507b && !efVar.d()) {
            return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i10, 1, options);
        }
        return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i10, 1, options);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        Canvas canvas2;
        int L;
        int L2;
        boolean z11 = true;
        if (!this.U && !this.V) {
            z10 = false;
        } else {
            canvas.save();
            Path path = this.W;
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.U) {
                f7 = org.telegram.messenger.i0.L(6.0f);
            } else {
                f7 = 0.0f;
            }
            float[] fArr = this.f51231a0;
            fArr[1] = f7;
            fArr[0] = f7;
            if (this.V) {
                f10 = org.telegram.messenger.i0.L(6.0f);
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        }
        float progress = this.J.getProgress() * org.telegram.messenger.i0.L(12.66f);
        if (progress > 0.0f) {
            if (!z10) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.f51233b0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f51234c);
        if (this.e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f51230a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f51230a, this.f51235f, this.f51232b);
        }
        StaticLayout staticLayout = this.F;
        Paint paint2 = this.f51236n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(10.0f) + this.G + org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f) + this.F.getHeight() + org.telegram.messenger.i0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.i0.L(6.0f)) - this.H, rectF2.top + org.telegram.messenger.i0.L(1.33f));
            this.F.draw(canvas2);
            canvas2.restore();
        }
        if (this.f51241y != null) {
            RectF rectF3 = org.telegram.messenger.i0.P;
            float L3 = org.telegram.messenger.i0.L(4.0f);
            float height = ((getHeight() - org.telegram.messenger.i0.L(4.0f)) - this.f51241y.getHeight()) - org.telegram.messenger.i0.L(2.0f);
            int L4 = org.telegram.messenger.i0.L(4.0f);
            if (this.f51240x) {
                L = org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(4.0f);
            }
            rectF3.set(L3, height, L4 + L + this.D + org.telegram.messenger.i0.L(5.0f), getHeight() - org.telegram.messenger.i0.L(4.0f));
            canvas2.drawRoundRect(rectF3, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint2);
            if (this.f51240x) {
                Drawable drawable = this.f51239w;
                drawable.setBounds((int) (rectF3.left + org.telegram.messenger.i0.L(6.0f)), (int) (rectF3.centerY() - (org.telegram.messenger.i0.L(8.0f) / 2)), (int) (rectF3.left + org.telegram.messenger.i0.L(13.0f)), (int) (rectF3.centerY() + (org.telegram.messenger.i0.L(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f11 = rectF3.left;
            if (this.f51240x) {
                L2 = org.telegram.messenger.i0.L(16.0f);
            } else {
                L2 = org.telegram.messenger.i0.L(5.0f);
            }
            canvas2.translate((f11 + L2) - this.E, rectF3.top + org.telegram.messenger.i0.L(1.0f));
            this.f51241y.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, n5 n5Var) {
        boolean z10;
        String str;
        int i11;
        float f7;
        float f10;
        this.S = n5Var;
        if (i10 > 0) {
            this.F = null;
            g(cd.G(i10, "StoryDrafts", new Object[0]));
            this.f51240x = false;
            this.O = cd.G(i10, "StoryDrafts", new Object[0]);
        } else {
            if (n5Var != null && n5Var.f51520c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String M0 = cd.M0("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i11 = getMeasuredWidth();
                } else {
                    i11 = org.telegram.messenger.i0.f16026q.x;
                }
                StaticLayout staticLayout = new StaticLayout(M0, this.f51238s, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.F = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f7 = this.F.getLineWidth(0);
                } else {
                    f7 = 0.0f;
                }
                this.G = f7;
                if (this.F.getLineCount() > 0) {
                    f10 = this.F.getLineLeft(0);
                } else {
                    f10 = 0.0f;
                }
                this.H = f10;
            } else {
                this.F = null;
            }
            if (n5Var != null && n5Var.K) {
                str = org.telegram.messenger.i0.g0((int) Math.max(0.0f, ((n5Var.f51515a0 - n5Var.Z) * ((float) n5Var.f51531h0)) / 1000.0f), false, false);
            } else {
                str = null;
            }
            g(str);
            if (n5Var != null && n5Var.K) {
                float f11 = n5Var.f51515a0 - n5Var.Z;
                this.O = cd.L0(2131744700, null) + ", " + cd.z((int) Math.max(0.0f, (f11 * ((float) n5Var.f51531h0)) / 1000.0f));
            } else {
                this.O = cd.L0(2131744700, null);
            }
        }
        b(n5Var);
    }

    public final void f(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        int i11;
        if (this.L) {
            z10 = true;
        }
        FrameLayout frameLayout = this.I;
        org.telegram.ui.Cells.n2 n2Var = this.J;
        if (!z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = n2Var.animate();
            float f11 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z10) {
                f11 = 0.7f;
            }
            z20.m(scaleX.scaleY(f11).withEndAction(new yv0(10, this, z10)), gr.h, 320L);
        }
        if (i10 >= 0) {
            n2Var.a(true, z11);
            n2Var.setNum(i10);
            return;
        }
        n2Var.a(false, z11);
    }

    public final void g(String str) {
        int i10;
        float f7;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i10 = getMeasuredWidth();
            } else {
                i10 = org.telegram.messenger.i0.f16026q.x;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f51237r, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f51241y = staticLayout;
            float f10 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f51241y.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.D = f7;
            if (this.f51241y.getLineCount() > 0) {
                f10 = this.f51241y.getLineLeft(0);
            }
            this.E = f10;
        } else {
            this.f51241y = null;
        }
        this.f51240x = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f51230a) != null) {
            if (bitmap.getHeight() / this.f51230a.getWidth() > this.K - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f51230a.getWidth(), getMeasuredHeight() / this.f51230a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f51230a.getWidth();
            }
            Matrix matrix = this.f51235f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(c3.i0.g(measuredWidth, this.f51230a.getWidth(), getMeasuredWidth(), 2.0f), c3.i0.g(measuredWidth, this.f51230a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.r(this.P);
        Object obj = this.S;
        if (obj != null) {
            b(obj);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.h3(this.P, 250L);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.I;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            org.telegram.ui.Cells.n2 n2Var = this.J;
            if (n2Var != null && n2Var.f25836a.f23919q) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityNodeInfo.setChecked(z10);
        } else {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.N != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.O;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.K), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        f2 f2Var;
        f2 f2Var2;
        if (i10 == 16 && (f2Var2 = this.M) != null) {
            f2Var2.run();
            return true;
        } else if (i10 == 32 && (f2Var = this.N) != null) {
            f2Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i10, bundle);
        }
    }
}
