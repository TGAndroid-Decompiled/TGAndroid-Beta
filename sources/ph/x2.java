package ph;

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
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mr;
public final class x2 extends FrameLayout {
    public static int f42575a0;
    public float B;
    public StaticLayout C;
    public float D;
    public float E;
    public final FrameLayout F;
    public final org.telegram.ui.Cells.j2 G;
    public final float H;
    public final boolean I;
    public u2 J;
    public u2 K;
    public String L;
    public final org.telegram.ui.web.q0 M;
    public DispatchQueue N;
    public String O;
    public Object P;
    public m71 Q;
    public boolean R;
    public boolean S;
    public final Path T;
    public final float[] U;
    public final Paint V;
    public Bitmap f42578a;
    public final Paint f42579b;
    public final Paint f42580c;
    public final Paint d;
    public LinearGradient e;
    public final Matrix f42581f;
    public final Matrix h;
    public final Paint f42582n;
    public final TextPaint f42583r;
    public final TextPaint f42584s;
    public final Drawable v;
    public boolean f42585w;
    public StaticLayout f42586x;
    public float f42587y;
    public static final ArrayList W = new ArrayList();
    public static final HashMap f42576b0 = new HashMap();
    public static final w2 f42577c0 = new LruCache(45);

    public x2(Context context, org.telegram.ui.ActionBar.f6 f6Var, float f10, boolean z4) {
        super(context);
        this.f42579b = new Paint(3);
        Paint paint = new Paint(1);
        this.f42580c = paint;
        this.d = new Paint(1);
        this.f42581f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f42582n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f42583r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f42584s = textPaint2;
        this.M = new org.telegram.ui.web.q0(this, 18);
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
        org.telegram.ui.Cells.j2 j2Var = new org.telegram.ui.Cells.j2(this, context, f6Var);
        this.G = j2Var;
        if (!z4) {
            j2Var.setDrawBackgroundAsArc(6);
        } else {
            j2Var.setDrawBackgroundAsArc(7);
        }
        j2Var.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        CheckBoxBase checkBoxBase = j2Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        if (checkBoxBase.f22942u != i10) {
            checkBoxBase.f22942u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.addView(j2Var, k7.b6.e(26, 26, 17));
        addView(frameLayout, k7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        j2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f42576b0;
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
            int i10 = f42575a0 + 1;
            f42575a0 = i10;
            if (i10 >= arrayList.size()) {
                f42575a0 = 0;
            }
            this.N = (DispatchQueue) arrayList.get(f42575a0);
        }
        return this.N;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.O);
            this.O = null;
            this.f42578a = null;
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
        } else if (obj instanceof t6) {
            str = "d" + ((t6) obj).f42402b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.O)) {
            return;
        }
        String str2 = this.O;
        if (str2 != null) {
            this.f42578a = null;
            d(str2);
            invalidate();
        }
        this.O = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z4) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
            if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f42577c0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f42576b0;
                Integer num = (Integer) hashMap.get(str);
                int i10 = 1;
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i10));
            }
        }
        this.f42578a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.Q != null) {
            a().cancelRunnable(this.Q);
            this.Q = null;
        }
        DispatchQueue a2 = a();
        m71 m71Var = new m71(this, obj, str, 12);
        this.Q = m71Var;
        a2.postRunnable(m71Var);
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
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f42580c);
        if (this.e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f42578a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f42578a, this.f42581f, this.f42579b);
        }
        StaticLayout staticLayout = this.C;
        Paint paint2 = this.f42582n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.D + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.C.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.E, rectF2.top + AndroidUtilities.dp(1.33f));
            this.C.draw(canvas2);
            canvas2.restore();
        }
        if (this.f42586x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            float dp3 = AndroidUtilities.dp(4.0f);
            float height = ((getHeight() - AndroidUtilities.dp(4.0f)) - this.f42586x.getHeight()) - AndroidUtilities.dp(2.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            if (this.f42585w) {
                dp = AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            rectF3.set(dp3, height, dp4 + dp + this.f42587y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.f42585w) {
                Drawable drawable = this.v;
                drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(6.0f)), (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2)), (int) (rectF3.left + AndroidUtilities.dp(13.0f)), (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f12 = rectF3.left;
            if (this.f42585w) {
                dp2 = AndroidUtilities.dp(16.0f);
            } else {
                dp2 = AndroidUtilities.dp(5.0f);
            }
            canvas2.translate((f12 + dp2) - this.B, rectF3.top + AndroidUtilities.dp(1.0f));
            this.f42586x.draw(canvas2);
            canvas2.restore();
        }
        if (z10) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, t6 t6Var) {
        boolean z4;
        int i11;
        float f10;
        float f11;
        this.P = t6Var;
        String str = null;
        if (i10 > 0) {
            this.C = null;
            g(LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]));
            this.f42585w = false;
            this.L = LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]);
        } else {
            if (t6Var != null && t6Var.f42405c) {
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
                StaticLayout staticLayout = new StaticLayout(string, this.f42584s, i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            if (t6Var != null && t6Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((t6Var.f42400a0 - t6Var.Z) * ((float) t6Var.f42416h0)) / 1000.0f));
            }
            g(str);
            if (t6Var != null && t6Var.K) {
                float f12 = t6Var.f42400a0 - t6Var.Z;
                this.L = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, (f12 * ((float) t6Var.f42416h0)) / 1000.0f));
            } else {
                this.L = LocaleController.getString(R.string.StoryDraft);
            }
        }
        b(t6Var);
    }

    public final void f(int i10, boolean z4, boolean z10) {
        float f10;
        float f11;
        int i11;
        if (this.I) {
            z4 = true;
        }
        FrameLayout frameLayout = this.F;
        org.telegram.ui.Cells.j2 j2Var = this.G;
        if (!z10) {
            if (z4) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = j2Var.animate();
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
            org.telegram.ui.b.p(scaleX.scaleY(f12).withEndAction(new kv0(11, this, z4)), mr.h, 320L);
        }
        if (i10 >= 0) {
            j2Var.a(true, z10);
            j2Var.setNum(i10);
            return;
        }
        j2Var.a(false, z10);
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
            StaticLayout staticLayout = new StaticLayout(str, this.f42583r, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f42586x = staticLayout;
            float f11 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f42586x.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f42587y = f10;
            if (this.f42586x.getLineCount() > 0) {
                f11 = this.f42586x.getLineLeft(0);
            }
            this.B = f11;
        } else {
            this.f42586x = null;
        }
        this.f42585w = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f42578a) != null) {
            if (bitmap.getHeight() / this.f42578a.getWidth() > this.H - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f42578a.getWidth(), getMeasuredHeight() / this.f42578a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f42578a.getWidth();
            }
            Matrix matrix = this.f42581f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(e2.c.d(measuredWidth, this.f42578a.getWidth(), getMeasuredWidth(), 2.0f), e2.c.d(measuredWidth, this.f42578a.getHeight(), getMeasuredHeight(), 2.0f));
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
            org.telegram.ui.Cells.j2 j2Var = this.G;
            if (j2Var != null && j2Var.f26377a.f22938q) {
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
        u2 u2Var;
        u2 u2Var2;
        if (i10 == 16 && (u2Var2 = this.J) != null) {
            u2Var2.run();
            return true;
        } else if (i10 == 32 && (u2Var = this.K) != null) {
            u2Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i10, bundle);
        }
    }
}
