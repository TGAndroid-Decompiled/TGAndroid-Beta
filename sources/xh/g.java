package xh;

import a8.ee;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.style.ForegroundColorSpan;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m4.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.fc1;
public final class g extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] f51860a;
    public final float[] f51861b;
    public final Stack f51862c;
    public int d;
    public final float[] e;
    public final int[] f51863f;
    public RectF f51864g;
    public final ArrayList h;
    public View f51865i;
    public long f51866j;
    public float f51867k;
    public float f51868l;
    public float f51869m;
    public float f51870n;
    public boolean f51871o;
    public boolean f51872p;
    public Runnable f51873q;
    public ValueAnimator f51874r;
    public int f51875s;
    public TimeInterpolator f51876t;
    public boolean f51877u;
    public PorterDuffColorFilter v;
    public int f51878w;
    public int f51879x;
    public boolean f51880y;
    public final RectF f51881z;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            i10 = 100;
        } else {
            i10 = 150;
        }
        A = i10;
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            i11 = 10;
        } else {
            i11 = 30;
        }
        B = i11;
        float[] fArr = {0.3f, 0.6f, 1.0f};
        C = fArr;
        D = (float[][]) Array.newInstance(Float.TYPE, fArr.length, i10 * 5);
        E = new Path();
    }

    public g() {
        float[] fArr = C;
        this.f51860a = new Paint[fArr.length];
        this.f51861b = new float[fArr.length];
        this.f51862c = new Stack();
        this.e = new float[14];
        this.f51863f = new int[fArr.length];
        this.h = new ArrayList();
        this.f51870n = -1.0f;
        this.f51875s = 255;
        this.f51876t = new fd(1);
        this.f51881z = new RectF();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            this.f51860a[i10] = new Paint();
            if (i10 == 0) {
                this.f51860a[i10].setStrokeWidth(AndroidUtilities.dp(1.4f));
                this.f51860a[i10].setStyle(Paint.Style.STROKE);
                this.f51860a[i10].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.f51860a[i10].setStrokeWidth(AndroidUtilities.dp(1.2f));
                this.f51860a[i10].setStyle(Paint.Style.STROKE);
                this.f51860a[i10].setStrokeCap(Paint.Cap.ROUND);
            }
            this.f51861b[i10] = this.f51860a[i10].getStrokeWidth() * 0.5f;
        }
        SharedConfig.getDevicePerformanceClass();
        h(0);
    }

    public static void a(View view, Layout layout, int i10, int i11, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i12;
        int i13;
        if (layout != null) {
            Object[] objArr = (z11[]) spanned.getSpans(0, layout.getText().length(), z11.class);
            for (int i14 = 0; i14 < Math.min(100, objArr.length); i14++) {
                if (objArr[i14].c()) {
                    int spanStart = spanned.getSpanStart(objArr[i14]);
                    int spanEnd = spanned.getSpanEnd(objArr[i14]);
                    if (i10 == -1 && i11 == -1) {
                        int lineForOffset = layout.getLineForOffset(spanEnd);
                        int i15 = Integer.MAX_VALUE;
                        int i16 = Integer.MIN_VALUE;
                        for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                            i15 = Math.min(i15, (int) layout.getLineLeft(lineForOffset2));
                            i16 = Math.max(i16, (int) layout.getLineRight(lineForOffset2));
                        }
                        i12 = i15;
                        i13 = i16;
                    } else {
                        i12 = i10;
                        i13 = i11;
                    }
                    layout.getSelectionPath(spanStart, spanEnd, new a(view, layout, stack, list, i12, i13, arrayList));
                }
            }
            if ((view instanceof TextView) && stack != null) {
                stack.clear();
            }
        }
    }

    public static void b(View view, Layout layout, int i10, int i11, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, i10, i11, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void c(View view, Layout layout, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, -1, -1, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void d(Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Rect bounds = ((g) arrayList.get(i10)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (canvas instanceof tw0) {
            int alpha = layout.getPaint().getAlpha();
            layout.getPaint().setAlpha((int) (alpha * 0.4f));
            if (G == null) {
                G = new WeakHashMap();
            }
            ArrayList arrayList = (ArrayList) G.get(layout);
            if (arrayList == null) {
                arrayList = new ArrayList();
                int lineCount = layout.getLineCount();
                for (int i10 = 0; i10 < lineCount; i10++) {
                    arrayList.add(new RectF(layout.getLineLeft(i10), layout.getLineTop(i10), layout.getLineRight(i10), layout.getLineBottom(i10)));
                }
                G.put(layout, arrayList);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.drawRect((RectF) arrayList.get(i11), layout.getPaint());
            }
            layout.getPaint().setAlpha(alpha);
            return;
        }
        layout.draw(canvas);
    }

    public static void g(View view, boolean z10, int i10, int i11, AtomicReference atomicReference, int i12, Layout layout, List list, Canvas canvas, boolean z11) {
        StaticLayout staticLayout;
        AtomicReference atomicReference2;
        z11[] z11VarArr;
        int i13;
        if (list != null && !list.isEmpty()) {
            StaticLayout staticLayout2 = (Layout) atomicReference.get();
            int i14 = 0;
            if (staticLayout2 == null || !layout.getText().toString().equals(staticLayout2.getText().toString()) || layout.getWidth() != staticLayout2.getWidth() || layout.getHeight() != staticLayout2.getHeight()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
                if (layout.getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) layout.getText();
                    z11[] z11VarArr2 = (z11[]) spanned.getSpans(0, spanned.length(), z11.class);
                    int i15 = 0;
                    while (i15 < Math.min(100, z11VarArr2.length)) {
                        z11 z11Var = z11VarArr2[i15];
                        if (z11Var.c()) {
                            int spanStart = spanned.getSpanStart(z11Var);
                            int spanEnd = spanned.getSpanEnd(z11Var);
                            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(spanStart, spanEnd, Emoji.EmojiSpan.class);
                            int length = emojiSpanArr.length;
                            while (i14 < length) {
                                z11[] z11VarArr3 = z11VarArr2;
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i14];
                                spannableStringBuilder.setSpan(new b(emojiSpan), spanned.getSpanStart(emojiSpan), spanned.getSpanEnd(emojiSpan), spanned.getSpanFlags(z11Var));
                                spannableStringBuilder.removeSpan(emojiSpan);
                                i14++;
                                z11VarArr2 = z11VarArr3;
                                i15 = i15;
                                length = length;
                                emojiSpanArr = emojiSpanArr;
                            }
                            z11VarArr = z11VarArr2;
                            i13 = i15;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(z11Var));
                            spannableStringBuilder.removeSpan(z11Var);
                        } else {
                            z11VarArr = z11VarArr2;
                            i13 = i15;
                        }
                        i15 = i13 + 1;
                        z11VarArr2 = z11VarArr;
                        i14 = 0;
                    }
                }
                if (i12 == 1) {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(1.66f), false);
                } else if (Build.VERSION.SDK_INT >= 24) {
                    staticLayout2 = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), layout.getPaint(), layout.getWidth()).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).build();
                    atomicReference2 = atomicReference;
                    atomicReference2.set(staticLayout2);
                } else {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
                }
                atomicReference2 = atomicReference;
                staticLayout2 = staticLayout;
                atomicReference2.set(staticLayout2);
            }
            if (!list.isEmpty()) {
                canvas.save();
                canvas.translate(0.0f, i11);
                staticLayout2.draw(canvas);
                canvas.restore();
            } else {
                f(canvas, layout);
            }
            if (list.isEmpty()) {
                return;
            }
            Path path = E;
            path.rewind();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Rect bounds = ((g) it.next()).getBounds();
                path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            }
            int i16 = 0;
            if (!list.isEmpty() && ((g) list.get(0)).f51870n != -1.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                if (!list.isEmpty()) {
                    ((g) list.get(0)).e(path);
                }
                canvas.clipPath(path);
                canvas.translate(0.0f, -view.getPaddingTop());
                f(canvas, layout);
                canvas.restore();
                i16 = 0;
            }
            boolean z12 = ((g) list.get(i16)).f51870n != -1.0f;
            if (z12) {
                int measuredWidth = view.getMeasuredWidth();
                if (z11 && (view.getParent() instanceof View)) {
                    measuredWidth = ((View) view.getParent()).getMeasuredWidth();
                }
                canvas.saveLayer(0.0f, 0.0f, measuredWidth, view.getMeasuredHeight(), null, 31);
            } else {
                canvas.save();
            }
            canvas.translate(0.0f, -view.getPaddingTop());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                gVar.f51877u = z10;
                if (gVar.f51865i != view) {
                    gVar.f51865i = view;
                }
                boolean z13 = gVar.f51872p;
                gVar.f51872p = false;
                if (z13) {
                    gVar.h(i0.a.f(Math.max(0.0f, gVar.f51870n), i10, (i12 == 1 ? layout.getPaint() : y6.f23556o2).getColor()));
                } else {
                    gVar.h(i10);
                }
                gVar.draw(canvas);
            }
            if (z12) {
                path.rewind();
                ((g) list.get(0)).e(path);
                if (F == null) {
                    Paint paint = new Paint(1);
                    F = paint;
                    paint.setColor(-16777216);
                    F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                canvas.drawPath(path, F);
            }
            canvas.restore();
            return;
        }
        f(canvas, layout);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            if (i.f51885q == null) {
                i.f51885q = new i();
            }
            i iVar = i.f51885q;
            int i11 = iVar.f51893k;
            w1[] w1VarArr = iVar.f51888c;
            if (w1VarArr[0] == null) {
                w1VarArr[0] = new w1(i11);
                iVar.f51890g = new Paint();
                iVar.f51891i = new ArrayList(100);
                float f7 = i11;
                int i12 = (int) (f7 / 10.0f);
                int dp = (int) ((f7 / AndroidUtilities.dp(200.0f)) * 60.0f);
                int i13 = 0;
                while (true) {
                    if (i13 >= 10) {
                        break;
                    }
                    int i14 = 0;
                    for (int i15 = 10; i14 < i15; i15 = 10) {
                        g gVar = new g();
                        gVar.f51879x = i11;
                        int i16 = i12 * i13;
                        int i17 = i12 * i14;
                        gVar.setBounds(i16, i17 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f) + i16 + i12, AndroidUtilities.dp(5.0f) + i17 + i12);
                        int min = Math.min(A * 5, dp);
                        gVar.d = min;
                        while (true) {
                            Stack stack = gVar.f51862c;
                            if (gVar.h.size() + stack.size() < min) {
                                stack.push(new Object());
                            }
                        }
                        gVar.h(-1);
                        iVar.f51891i.add(gVar);
                        i14++;
                    }
                    i13++;
                }
                i10 = 128;
                iVar.a(new Canvas((Bitmap) w1VarArr[0].f18293b), new Rect(0, 0, i11, i11));
                iVar.f51890g.setShader((BitmapShader) w1VarArr[0].f18294c);
                iVar.h = System.currentTimeMillis();
            } else {
                i10 = 128;
                if (iVar.f51898p && !LiteMode.isEnabled(128)) {
                    iVar.d = 0;
                    iVar.a(new Canvas((Bitmap) w1VarArr[0].f18293b), new Rect(0, 0, i11, i11));
                    iVar.f51890g.setShader((BitmapShader) w1VarArr[0].f18294c);
                    iVar.h = System.currentTimeMillis();
                    iVar.f51898p = false;
                }
            }
            Paint paint = iVar.f51890g;
            paint.setColorFilter(this.v);
            canvas.drawRect(bounds, paint);
            if (LiteMode.isEnabled(i10)) {
                ag.n d = ag.n.d();
                d.getClass();
                ag.n.c();
                d.f1348c.add(this);
                if (i.f51885q == null) {
                    i.f51885q = new i();
                }
                i iVar2 = i.f51885q;
                iVar2.getClass();
                int i18 = bounds.left;
                int i19 = iVar2.f51893k;
                int i20 = ((i18 % i19) + i19) % i19;
                int i21 = ((bounds.top % i19) + i19) % i19;
                int min2 = Math.min(bounds.width(), i19) + i20;
                int min3 = Math.min(bounds.height(), i19) + i21;
                Rect rect = iVar2.f51895m;
                rect.union(i20, i21, Math.min(min2, i19), Math.min(min3, i19));
                if (min2 > i19) {
                    rect.union(0, i21, min2 - i19, Math.min(min3, i19));
                }
                if (min3 > i19) {
                    rect.union(i20, 0, Math.min(min2, i19), min3 - i19);
                }
                if (min2 > i19 && min3 > i19) {
                    rect.union(0, 0, min2 - i19, min3 - i19);
                }
                if (!iVar2.f51894l && !rect.isEmpty()) {
                    iVar2.f51894l = true;
                    Choreographer.getInstance().postFrameCallback(iVar2.f51896n);
                }
            }
        }
    }

    public final void e(Path path) {
        path.addCircle(this.f51867k, this.f51868l, ee.a(this.f51870n, 0.0f, 1.0f) * this.f51869m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i10) {
        if (this.f51878w != i10) {
            int i11 = 0;
            while (true) {
                float[] fArr = C;
                if (i11 < fArr.length) {
                    this.f51860a[i11].setColor(i0.a.o(i10, (int) (this.f51875s * fArr[i11])));
                    i11++;
                } else {
                    this.v = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    this.f51878w = i10;
                    return;
                }
            }
        }
    }

    public final void i(float f7, float f10, float f11) {
        if (this.f51864g == null) {
            this.f51864g = new RectF();
        }
        RectF rectF = this.f51864g;
        if (rectF.left == 0.0f && rectF.right == f10 && rectF.top == f7 && rectF.bottom == f11) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f7;
        rectF.right = f10;
        rectF.bottom = f11;
        invalidateSelf();
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.f51865i;
        if (view != null) {
            if (view.getParent() != null && this.f51877u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof z) {
                ((z) view).k();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f7, float f10, float f11, boolean z10) {
        float f12;
        int alpha;
        this.f51867k = f7;
        this.f51868l = f10;
        this.f51869m = f11;
        float f13 = 0.0f;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        this.f51870n = f12;
        this.f51871o = z10;
        ValueAnimator valueAnimator = this.f51874r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f51871o) {
            alpha = 255;
        } else {
            alpha = this.f51860a[C.length - 1].getAlpha();
        }
        float f14 = this.f51870n;
        if (!z10) {
            f13 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f14, f13).setDuration(ee.a(this.f51869m * 0.3f, 250.0f, 550.0f));
        this.f51874r = duration;
        duration.setInterpolator(this.f51876t);
        this.f51874r.addUpdateListener(new u2(this, alpha, 6));
        this.f51874r.addListener(new fc1(this, 24));
        this.f51874r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f51881z;
        rectF.set(rect);
        rectF.inset(0.0f, AndroidUtilities.dp(2.5f));
    }

    @Override
    public final void setAlpha(int i10) {
        this.f51875s = i10;
        int i11 = 0;
        while (true) {
            float[] fArr = C;
            if (i11 < fArr.length) {
                this.f51860a[i11].setAlpha((int) (fArr[i11] * i10));
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!getBounds().contains((int) cVar.f51832a, (int) cVar.f51833b)) {
                it.remove();
            }
            Stack stack = this.f51862c;
            if (stack.size() < this.d) {
                stack.push(cVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.f51860a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
