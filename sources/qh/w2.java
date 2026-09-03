package qh;

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
import android.util.LruCache;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qv0;
public final class w2 extends FrameLayout {
    public static int f46242a0;
    public float B;
    public StaticLayout C;
    public float D;
    public float E;
    public final FrameLayout F;
    public final org.telegram.ui.Cells.k2 G;
    public final float H;
    public final boolean I;
    public t2 J;
    public t2 K;
    public String L;
    public final org.telegram.ui.web.s0 M;
    public DispatchQueue N;
    public String O;
    public Object P;
    public n71 Q;
    public boolean R;
    public boolean S;
    public final Path T;
    public final float[] U;
    public final Paint V;
    public Bitmap f46245a;
    public final Paint f46246b;
    public final Paint f46247c;
    public final Paint d;
    public LinearGradient f46248e;
    public final Matrix f46249f;
    public final Matrix h;
    public final Paint f46250n;
    public final TextPaint f46251r;
    public final TextPaint f46252s;
    public final Drawable v;
    public boolean f46253w;
    public StaticLayout f46254x;
    public float f46255y;
    public static final ArrayList W = new ArrayList();
    public static final HashMap f46243b0 = new HashMap();
    public static final v2 f46244c0 = new LruCache(45);

    public w2(Context context, org.telegram.ui.ActionBar.g6 g6Var, float f10, boolean z4) {
        super(context);
        this.f46246b = new Paint(3);
        Paint paint = new Paint(1);
        this.f46247c = paint;
        this.d = new Paint(1);
        this.f46249f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f46250n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f46251r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f46252s = textPaint2;
        this.M = new org.telegram.ui.web.s0(this, 19);
        this.T = new Path();
        this.U = new float[8];
        this.V = new Paint(1);
        this.H = f10;
        this.I = z4;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
        textPaint2.setColor(-1);
        this.v = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        org.telegram.ui.Cells.k2 k2Var = new org.telegram.ui.Cells.k2(this, context, g6Var);
        this.G = k2Var;
        if (!z4) {
            k2Var.setDrawBackgroundAsArc(6);
        } else {
            k2Var.setDrawBackgroundAsArc(7);
        }
        k2Var.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        CheckBoxBase checkBoxBase = k2Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        if (checkBoxBase.f24815u != i10) {
            checkBoxBase.f24815u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.addView(k2Var, k7.c6.e(26, 26, 17));
        addView(frameLayout, k7.c6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        k2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f46243b0;
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

    public final DispatchQueue a() {
        DispatchQueue dispatchQueue = this.N;
        if (dispatchQueue != null) {
            return dispatchQueue;
        }
        ArrayList arrayList = W;
        if (arrayList.size() < 4) {
            DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + arrayList.size());
            this.N = dispatchQueue2;
            arrayList.add(dispatchQueue2);
        } else {
            int i10 = f46242a0 + 1;
            f46242a0 = i10;
            if (i10 >= arrayList.size()) {
                f46242a0 = 0;
            }
            this.N = (DispatchQueue) arrayList.get(f46242a0);
        }
        return this.N;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.O);
            this.O = null;
            this.f46245a = null;
            invalidate();
            return;
        }
        boolean z4 = obj instanceof MediaController.PhotoEntry;
        if (z4) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            str = photoEntry.thumbPath;
            if (str == null) {
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = "" + photoEntry.imageId;
                } else {
                    str = photoEntry.path;
                }
            }
        } else if (obj instanceof r6) {
            str = "d" + ((r6) obj).f45995b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.O)) {
            return;
        }
        String str2 = this.O;
        if (str2 != null) {
            this.f46245a = null;
            d(str2);
            invalidate();
        }
        this.O = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.f46248e = null;
        if (z4) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
            if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f46248e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f46244c0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f46243b0;
                Integer num = (Integer) hashMap.get(str);
                int i10 = 1;
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i10));
            }
        }
        this.f46245a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.Q != null) {
            a().cancelRunnable(this.Q);
            this.Q = null;
        }
        DispatchQueue a2 = a();
        n71 n71Var = new n71(this, obj, str, 13);
        this.Q = n71Var;
        a2.postRunnable(n71Var);
    }

    public final Bitmap c(MediaController.PhotoEntry photoEntry, BitmapFactory.Options options) {
        if (photoEntry == null) {
            return null;
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
            return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
        }
        return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        boolean z4;
        Canvas canvas2;
        int dp;
        int dp2;
        boolean z10 = true;
        if (!this.R && !this.S) {
            z4 = false;
        } else {
            canvas.save();
            Path path = this.T;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.R) {
                f10 = AndroidUtilities.dp(6.0f);
            } else {
                f10 = 0.0f;
            }
            float[] fArr = this.U;
            fArr[1] = f10;
            fArr[0] = f10;
            if (this.S) {
                f11 = AndroidUtilities.dp(6.0f);
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z4 = true;
        }
        float progress = this.G.getProgress() * AndroidUtilities.dp(12.66f);
        if (progress > 0.0f) {
            if (!z4) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.V;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z10 = z4;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f46247c);
        if (this.f46248e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f46245a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f46245a, this.f46249f, this.f46246b);
        }
        StaticLayout staticLayout = this.C;
        Paint paint2 = this.f46250n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.D + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.C.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.E, rectF2.top + AndroidUtilities.dp(1.33f));
            this.C.draw(canvas2);
            canvas2.restore();
        }
        if (this.f46254x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            float dp3 = AndroidUtilities.dp(4.0f);
            float height = ((getHeight() - AndroidUtilities.dp(4.0f)) - this.f46254x.getHeight()) - AndroidUtilities.dp(2.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            if (this.f46253w) {
                dp = AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            rectF3.set(dp3, height, dp4 + dp + this.f46255y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.f46253w) {
                Drawable drawable = this.v;
                drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(6.0f)), (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2)), (int) (rectF3.left + AndroidUtilities.dp(13.0f)), (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f12 = rectF3.left;
            if (this.f46253w) {
                dp2 = AndroidUtilities.dp(16.0f);
            } else {
                dp2 = AndroidUtilities.dp(5.0f);
            }
            canvas2.translate((f12 + dp2) - this.B, rectF3.top + AndroidUtilities.dp(1.0f));
            this.f46254x.draw(canvas2);
            canvas2.restore();
        }
        if (z10) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, r6 r6Var) {
        boolean z4;
        int i11;
        float f10;
        float f11;
        this.P = r6Var;
        String str = null;
        if (i10 > 0) {
            this.C = null;
            g(LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]));
            this.f46253w = false;
            this.L = LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]);
        } else {
            if (r6Var != null && r6Var.f45998c) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                String string = LocaleController.getString("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i11 = getMeasuredWidth();
                } else {
                    i11 = AndroidUtilities.displaySize.x;
                }
                int i12 = i11;
                StaticLayout staticLayout = new StaticLayout(string, this.f46252s, i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.C = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f10 = this.C.getLineWidth(0);
                } else {
                    f10 = 0.0f;
                }
                this.D = f10;
                if (this.C.getLineCount() > 0) {
                    f11 = this.C.getLineLeft(0);
                } else {
                    f11 = 0.0f;
                }
                this.E = f11;
            } else {
                this.C = null;
            }
            if (r6Var != null && r6Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((r6Var.f45993a0 - r6Var.Z) * ((float) r6Var.f46010h0)) / 1000.0f));
            }
            g(str);
            if (r6Var != null && r6Var.K) {
                float f12 = r6Var.f45993a0 - r6Var.Z;
                this.L = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, (f12 * ((float) r6Var.f46010h0)) / 1000.0f));
            } else {
                this.L = LocaleController.getString(R.string.StoryDraft);
            }
        }
        b(r6Var);
    }

    public final void f(int i10, boolean z4, boolean z10) {
        float f10;
        float f11;
        int i11;
        if (this.I) {
            z4 = true;
        }
        FrameLayout frameLayout = this.F;
        org.telegram.ui.Cells.k2 k2Var = this.G;
        if (!z10) {
            if (z4) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = k2Var.animate();
            float f12 = 1.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z4) {
                f12 = 0.7f;
            }
            org.telegram.ui.b.p(scaleX.scaleY(f12).withEndAction(new qv0(11, this, z4)), pr.h, 320L);
        }
        if (i10 >= 0) {
            k2Var.a(true, z10);
            k2Var.setNum(i10);
            return;
        }
        k2Var.a(false, z10);
    }

    public final void g(String str) {
        int i10;
        float f10;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i10 = getMeasuredWidth();
            } else {
                i10 = AndroidUtilities.displaySize.x;
            }
            int i11 = i10;
            StaticLayout staticLayout = new StaticLayout(str, this.f46251r, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f46254x = staticLayout;
            float f11 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f46254x.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f46255y = f10;
            if (this.f46254x.getLineCount() > 0) {
                f11 = this.f46254x.getLineLeft(0);
            }
            this.B = f11;
        } else {
            this.f46254x = null;
        }
        this.f46253w = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f46245a) != null) {
            if (bitmap.getHeight() / this.f46245a.getWidth() > this.H - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f46245a.getWidth(), getMeasuredHeight() / this.f46245a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f46245a.getWidth();
            }
            Matrix matrix = this.f46249f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(e2.c.d(measuredWidth, this.f46245a.getWidth(), getMeasuredWidth(), 2.0f), e2.c.d(measuredWidth, this.f46245a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f46248e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.cancelRunOnUIThread(this.M);
        Object obj = this.P;
        if (obj != null) {
            b(obj);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.runOnUIThread(this.M, 250L);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            org.telegram.ui.Cells.k2 k2Var = this.G;
            if (k2Var != null && k2Var.f29560a.f24811q) {
                z4 = true;
            } else {
                z4 = false;
            }
            accessibilityNodeInfo.setChecked(z4);
        } else {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.K != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.L;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.H), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        t2 t2Var;
        t2 t2Var2;
        if (i10 == 16 && (t2Var2 = this.J) != null) {
            t2Var2.run();
            return true;
        } else if (i10 == 32 && (t2Var = this.K) != null) {
            t2Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i10, bundle);
        }
    }
}
