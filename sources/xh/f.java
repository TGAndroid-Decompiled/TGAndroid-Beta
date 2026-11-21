package xh;

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
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import c8.l9;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.uc;
import org.telegram.ui.k71;
import tg.y;
public final class f extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] f60588a;
    public final float[] f60589b;
    public final Stack f60590c;
    public int d;
    public final float[] f60591e;
    public final int[] f60592f;
    public RectF f60593g;
    public final ArrayList h;
    public View f60594i;
    public long f60595j;
    public float f60596k;
    public float f60597l;
    public float f60598m;
    public float f60599n;
    public boolean f60600o;
    public boolean f60601p;
    public Runnable f60602q;
    public ValueAnimator f60603r;
    public int f60604s;
    public TimeInterpolator f60605t;
    public boolean f60606u;
    public PorterDuffColorFilter v;
    public int f60607w;
    public int f60608x;
    public boolean f60609y;
    public final RectF f60610z;

    static {
        int i7;
        int i10;
        if (bz.o() != 2) {
            i7 = 100;
        } else {
            i7 = 150;
        }
        A = i7;
        if (bz.o() != 2) {
            i10 = 10;
        } else {
            i10 = 30;
        }
        B = i10;
        float[] fArr = {0.3f, 0.6f, 1.0f};
        C = fArr;
        D = (float[][]) Array.newInstance(Float.TYPE, fArr.length, i7 * 5);
        E = new Path();
    }

    public f() {
        float[] fArr = C;
        this.f60588a = new Paint[fArr.length];
        this.f60589b = new float[fArr.length];
        this.f60590c = new Stack();
        this.f60591e = new float[14];
        this.f60592f = new int[fArr.length];
        this.h = new ArrayList();
        this.f60599n = -1.0f;
        this.f60604s = 255;
        this.f60605t = new uc(1);
        this.f60610z = new RectF();
        for (int i7 = 0; i7 < fArr.length; i7++) {
            this.f60588a[i7] = new Paint();
            if (i7 == 0) {
                this.f60588a[i7].setStrokeWidth(g0.L(1.4f));
                this.f60588a[i7].setStyle(Paint.Style.STROKE);
                this.f60588a[i7].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.f60588a[i7].setStrokeWidth(g0.L(1.2f));
                this.f60588a[i7].setStyle(Paint.Style.STROKE);
                this.f60588a[i7].setStrokeCap(Paint.Cap.ROUND);
            }
            this.f60589b[i7] = this.f60588a[i7].getStrokeWidth() * 0.5f;
        }
        bz.o();
        h(0);
    }

    public static void a(View view, Layout layout, int i7, int i10, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i11;
        int i12;
        if (layout != null) {
            Object[] objArr = (gz0[]) spanned.getSpans(0, layout.getText().length(), gz0.class);
            for (int i13 = 0; i13 < Math.min(100, objArr.length); i13++) {
                if (objArr[i13].c()) {
                    int spanStart = spanned.getSpanStart(objArr[i13]);
                    int spanEnd = spanned.getSpanEnd(objArr[i13]);
                    if (i7 == -1 && i10 == -1) {
                        int lineForOffset = layout.getLineForOffset(spanEnd);
                        int i14 = Integer.MAX_VALUE;
                        int i15 = Integer.MIN_VALUE;
                        for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                            i14 = Math.min(i14, (int) layout.getLineLeft(lineForOffset2));
                            i15 = Math.max(i15, (int) layout.getLineRight(lineForOffset2));
                        }
                        i11 = i14;
                        i12 = i15;
                    } else {
                        i11 = i7;
                        i12 = i10;
                    }
                    layout.getSelectionPath(spanStart, spanEnd, new a(view, layout, stack, list, i11, i12, arrayList));
                }
            }
            if ((view instanceof TextView) && stack != null) {
                stack.clear();
            }
        }
    }

    public static void b(View view, Layout layout, int i7, int i10, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, i7, i10, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void c(View view, Layout layout, Stack stack, ArrayList arrayList) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, -1, -1, (Spanned) layout.getText(), stack, arrayList, null);
        }
    }

    public static void d(Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Rect bounds = ((f) arrayList.get(i7)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (canvas instanceof bu0) {
            int alpha = layout.getPaint().getAlpha();
            layout.getPaint().setAlpha((int) (alpha * 0.4f));
            if (G == null) {
                G = new WeakHashMap();
            }
            ArrayList arrayList = (ArrayList) G.get(layout);
            if (arrayList == null) {
                arrayList = new ArrayList();
                int lineCount = layout.getLineCount();
                for (int i7 = 0; i7 < lineCount; i7++) {
                    arrayList.add(new RectF(layout.getLineLeft(i7), layout.getLineTop(i7), layout.getLineRight(i7), layout.getLineBottom(i7)));
                }
                G.put(layout, arrayList);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                canvas.drawRect((RectF) arrayList.get(i10), layout.getPaint());
            }
            layout.getPaint().setAlpha(alpha);
            return;
        }
        layout.draw(canvas);
    }

    public static void g(View view, boolean z10, int i7, int i10, AtomicReference atomicReference, int i11, Layout layout, List list, Canvas canvas, boolean z11) {
        StaticLayout staticLayout;
        AtomicReference atomicReference2;
        gz0[] gz0VarArr;
        int i12;
        boolean z12;
        TextPaint textPaint;
        if (list != null && !list.isEmpty()) {
            StaticLayout staticLayout2 = (Layout) atomicReference.get();
            int i13 = 0;
            if (staticLayout2 == null || !layout.getText().toString().equals(staticLayout2.getText().toString()) || layout.getWidth() != staticLayout2.getWidth() || layout.getHeight() != staticLayout2.getHeight()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
                if (layout.getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) layout.getText();
                    gz0[] gz0VarArr2 = (gz0[]) spanned.getSpans(0, spanned.length(), gz0.class);
                    int i14 = 0;
                    while (i14 < Math.min(100, gz0VarArr2.length)) {
                        gz0 gz0Var = gz0VarArr2[i14];
                        if (gz0Var.c()) {
                            int spanStart = spanned.getSpanStart(gz0Var);
                            int spanEnd = spanned.getSpanEnd(gz0Var);
                            g6[] g6VarArr = (g6[]) spanned.getSpans(spanStart, spanEnd, g6.class);
                            int length = g6VarArr.length;
                            while (i13 < length) {
                                gz0[] gz0VarArr3 = gz0VarArr2;
                                g6 g6Var = g6VarArr[i13];
                                spannableStringBuilder.setSpan(new qp(g6Var, 4), spanned.getSpanStart(g6Var), spanned.getSpanEnd(g6Var), spanned.getSpanFlags(gz0Var));
                                spannableStringBuilder.removeSpan(g6Var);
                                i13++;
                                gz0VarArr2 = gz0VarArr3;
                                i14 = i14;
                                length = length;
                                g6VarArr = g6VarArr;
                            }
                            gz0VarArr = gz0VarArr2;
                            i12 = i14;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(gz0Var));
                            spannableStringBuilder.removeSpan(gz0Var);
                        } else {
                            gz0VarArr = gz0VarArr2;
                            i12 = i14;
                        }
                        i14 = i12 + 1;
                        gz0VarArr2 = gz0VarArr;
                        i13 = 0;
                    }
                }
                if (i11 == 1) {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, g0.L(1.66f), false);
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
                canvas.translate(0.0f, i10);
                staticLayout2.draw(canvas);
                canvas.restore();
            } else {
                f(canvas, layout);
            }
            if (!list.isEmpty()) {
                Path path = E;
                path.rewind();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Rect bounds = ((f) it.next()).getBounds();
                    path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                }
                int i15 = 0;
                if (!list.isEmpty() && ((f) list.get(0)).f60599n != -1.0f) {
                    canvas.save();
                    canvas.clipPath(path);
                    path.rewind();
                    if (!list.isEmpty()) {
                        ((f) list.get(0)).e(path);
                    }
                    canvas.clipPath(path);
                    canvas.translate(0.0f, -view.getPaddingTop());
                    f(canvas, layout);
                    canvas.restore();
                    i15 = 0;
                }
                if (((f) list.get(i15)).f60599n != -1.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
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
                    f fVar = (f) it2.next();
                    fVar.f60606u = z10;
                    if (fVar.f60594i != view) {
                        fVar.f60594i = view;
                    }
                    boolean z13 = fVar.f60601p;
                    fVar.f60601p = false;
                    if (z13) {
                        if (i11 == 1) {
                            textPaint = layout.getPaint();
                        } else {
                            textPaint = m6.f29575o2;
                        }
                        fVar.h(i0.a.f(Math.max(0.0f, fVar.f60599n), i7, textPaint.getColor()));
                    } else {
                        fVar.h(i7);
                    }
                    fVar.draw(canvas);
                }
                if (z12) {
                    path.rewind();
                    ((f) list.get(0)).e(path);
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
            return;
        }
        f(canvas, layout);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            if (h.f60614q == null) {
                h.f60614q = new h();
            }
            h hVar = h.f60614q;
            int i10 = hVar.f60623k;
            y[] yVarArr = hVar.f60617c;
            if (yVarArr[0] == null) {
                yVarArr[0] = new y(i10);
                hVar.f60620g = new Paint();
                hVar.f60621i = new ArrayList(100);
                float f10 = i10;
                int i11 = (int) (f10 / 10.0f);
                int L = (int) ((f10 / g0.L(200.0f)) * 60.0f);
                int i12 = 0;
                while (true) {
                    if (i12 >= 10) {
                        break;
                    }
                    int i13 = 0;
                    for (int i14 = 10; i13 < i14; i14 = 10) {
                        f fVar = new f();
                        fVar.f60608x = i10;
                        int i15 = i11 * i12;
                        int i16 = i11 * i13;
                        fVar.setBounds(i15, i16 - g0.L(5.0f), g0.L(3.0f) + i15 + i11, g0.L(5.0f) + i16 + i11);
                        int min = Math.min(A * 5, L);
                        fVar.d = min;
                        while (true) {
                            Stack stack = fVar.f60590c;
                            if (fVar.h.size() + stack.size() < min) {
                                stack.push(new Object());
                            }
                        }
                        fVar.h(-1);
                        hVar.f60621i.add(fVar);
                        i13++;
                    }
                    i12++;
                }
                i7 = 128;
                hVar.a(new Canvas((Bitmap) yVarArr[0].f58220b), new Rect(0, 0, i10, i10));
                hVar.f60620g.setShader((BitmapShader) yVarArr[0].f58221c);
                hVar.h = System.currentTimeMillis();
            } else {
                i7 = 128;
                if (hVar.f60628p && !pc.e(128)) {
                    hVar.d = 0;
                    hVar.a(new Canvas((Bitmap) yVarArr[0].f58220b), new Rect(0, 0, i10, i10));
                    hVar.f60620g.setShader((BitmapShader) yVarArr[0].f58221c);
                    hVar.h = System.currentTimeMillis();
                    hVar.f60628p = false;
                }
            }
            Paint paint = hVar.f60620g;
            paint.setColorFilter(this.v);
            canvas.drawRect(bounds, paint);
            if (pc.e(i7)) {
                bg.k d = bg.k.d();
                d.getClass();
                bg.k.c();
                d.f3301c.add(this);
                if (h.f60614q == null) {
                    h.f60614q = new h();
                }
                h hVar2 = h.f60614q;
                hVar2.getClass();
                int i17 = bounds.left;
                int i18 = hVar2.f60623k;
                int i19 = ((i17 % i18) + i18) % i18;
                int i20 = ((bounds.top % i18) + i18) % i18;
                int min2 = Math.min(bounds.width(), i18) + i19;
                int min3 = Math.min(bounds.height(), i18) + i20;
                Rect rect = hVar2.f60625m;
                rect.union(i19, i20, Math.min(min2, i18), Math.min(min3, i18));
                if (min2 > i18) {
                    rect.union(0, i20, min2 - i18, Math.min(min3, i18));
                }
                if (min3 > i18) {
                    rect.union(i19, 0, Math.min(min2, i18), min3 - i18);
                }
                if (min2 > i18 && min3 > i18) {
                    rect.union(0, 0, min2 - i18, min3 - i18);
                }
                if (!hVar2.f60624l && !rect.isEmpty()) {
                    hVar2.f60624l = true;
                    Choreographer.getInstance().postFrameCallback(hVar2.f60626n);
                }
            }
        }
    }

    public final void e(Path path) {
        path.addCircle(this.f60596k, this.f60597l, l9.a(this.f60599n, 0.0f, 1.0f) * this.f60598m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i7) {
        if (this.f60607w != i7) {
            int i10 = 0;
            while (true) {
                float[] fArr = C;
                if (i10 < fArr.length) {
                    this.f60588a[i10].setColor(i0.a.o(i7, (int) (this.f60604s * fArr[i10])));
                    i10++;
                } else {
                    this.v = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
                    this.f60607w = i7;
                    return;
                }
            }
        }
    }

    public final void i(float f10, float f11, float f12) {
        if (this.f60593g == null) {
            this.f60593g = new RectF();
        }
        RectF rectF = this.f60593g;
        if (rectF.left == 0.0f && rectF.right == f11 && rectF.top == f10 && rectF.bottom == f12) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f10;
        rectF.right = f11;
        rectF.bottom = f12;
        invalidateSelf();
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.f60594i;
        if (view != null) {
            if (view.getParent() != null && this.f60606u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof z) {
                ((z) view).p();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f10, float f11, float f12, boolean z10) {
        float f13;
        int alpha;
        this.f60596k = f10;
        this.f60597l = f11;
        this.f60598m = f12;
        float f14 = 0.0f;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        this.f60599n = f13;
        this.f60600o = z10;
        ValueAnimator valueAnimator = this.f60603r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f60600o) {
            alpha = 255;
        } else {
            alpha = this.f60588a[C.length - 1].getAlpha();
        }
        float f15 = this.f60599n;
        if (!z10) {
            f14 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f15, f14).setDuration(l9.a(this.f60598m * 0.3f, 250.0f, 550.0f));
        this.f60603r = duration;
        duration.setInterpolator(this.f60605t);
        this.f60603r.addUpdateListener(new j2(this, alpha, 6));
        this.f60603r.addListener(new k71(this, 26));
        this.f60603r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f60610z;
        rectF.set(rect);
        rectF.inset(0.0f, g0.L(2.5f));
    }

    @Override
    public final void setAlpha(int i7) {
        this.f60604s = i7;
        int i10 = 0;
        while (true) {
            float[] fArr = C;
            if (i10 < fArr.length) {
                this.f60588a[i10].setAlpha((int) (fArr[i10] * i7));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!getBounds().contains((int) bVar.f60557a, (int) bVar.f60558b)) {
                it.remove();
            }
            Stack stack = this.f60590c;
            if (stack.size() < this.d) {
                stack.push(bVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.f60588a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
