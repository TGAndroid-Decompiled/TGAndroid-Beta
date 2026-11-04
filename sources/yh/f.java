package yh;

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
import b8.be;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.az;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.lc;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.yo;
import org.telegram.ui.i81;
public final class f extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] f59507a;
    public final float[] f59508b;
    public final Stack f59509c;
    public int d;
    public final float[] f59510e;
    public final int[] f59511f;
    public RectF f59512g;
    public final ArrayList h;
    public View f59513i;
    public long f59514j;
    public float f59515k;
    public float f59516l;
    public float f59517m;
    public float f59518n;
    public boolean f59519o;
    public boolean f59520p;
    public Runnable f59521q;
    public ValueAnimator f59522r;
    public int f59523s;
    public TimeInterpolator f59524t;
    public boolean f59525u;
    public PorterDuffColorFilter v;
    public int f59526w;
    public int f59527x;
    public boolean f59528y;
    public final RectF f59529z;

    static {
        int i3;
        int i10;
        if (az.o() != 2) {
            i3 = 100;
        } else {
            i3 = 150;
        }
        A = i3;
        if (az.o() != 2) {
            i10 = 10;
        } else {
            i10 = 30;
        }
        B = i10;
        float[] fArr = {0.3f, 0.6f, 1.0f};
        C = fArr;
        D = (float[][]) Array.newInstance(Float.TYPE, fArr.length, i3 * 5);
        E = new Path();
    }

    public f() {
        float[] fArr = C;
        this.f59507a = new Paint[fArr.length];
        this.f59508b = new float[fArr.length];
        this.f59509c = new Stack();
        this.f59510e = new float[14];
        this.f59511f = new int[fArr.length];
        this.h = new ArrayList();
        this.f59518n = -1.0f;
        this.f59523s = 255;
        this.f59524t = new oc(1);
        this.f59529z = new RectF();
        for (int i3 = 0; i3 < fArr.length; i3++) {
            this.f59507a[i3] = new Paint();
            if (i3 == 0) {
                this.f59507a[i3].setStrokeWidth(g0.L(1.4f));
                this.f59507a[i3].setStyle(Paint.Style.STROKE);
                this.f59507a[i3].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.f59507a[i3].setStrokeWidth(g0.L(1.2f));
                this.f59507a[i3].setStyle(Paint.Style.STROKE);
                this.f59507a[i3].setStrokeCap(Paint.Cap.ROUND);
            }
            this.f59508b[i3] = this.f59507a[i3].getStrokeWidth() * 0.5f;
        }
        az.o();
        h(0);
    }

    public static void a(View view, Layout layout, int i3, int i10, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i11;
        int i12;
        if (layout != null) {
            Object[] objArr = (uy0[]) spanned.getSpans(0, layout.getText().length(), uy0.class);
            for (int i13 = 0; i13 < Math.min(100, objArr.length); i13++) {
                if (objArr[i13].c()) {
                    int spanStart = spanned.getSpanStart(objArr[i13]);
                    int spanEnd = spanned.getSpanEnd(objArr[i13]);
                    if (i3 == -1 && i10 == -1) {
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
                        i11 = i3;
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

    public static void b(View view, Layout layout, int i3, int i10, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, i3, i10, (Spanned) layout.getText(), stack, list, null);
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
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Rect bounds = ((f) arrayList.get(i3)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (canvas instanceof ot0) {
            int alpha = layout.getPaint().getAlpha();
            layout.getPaint().setAlpha((int) (alpha * 0.4f));
            if (G == null) {
                G = new WeakHashMap();
            }
            ArrayList arrayList = (ArrayList) G.get(layout);
            if (arrayList == null) {
                arrayList = new ArrayList();
                int lineCount = layout.getLineCount();
                for (int i3 = 0; i3 < lineCount; i3++) {
                    arrayList.add(new RectF(layout.getLineLeft(i3), layout.getLineTop(i3), layout.getLineRight(i3), layout.getLineBottom(i3)));
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

    public static void g(View view, boolean z10, int i3, int i10, AtomicReference atomicReference, int i11, Layout layout, List list, Canvas canvas, boolean z11) {
        StaticLayout staticLayout;
        AtomicReference atomicReference2;
        uy0[] uy0VarArr;
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
                    uy0[] uy0VarArr2 = (uy0[]) spanned.getSpans(0, spanned.length(), uy0.class);
                    int i14 = 0;
                    while (i14 < Math.min(100, uy0VarArr2.length)) {
                        uy0 uy0Var = uy0VarArr2[i14];
                        if (uy0Var.c()) {
                            int spanStart = spanned.getSpanStart(uy0Var);
                            int spanEnd = spanned.getSpanEnd(uy0Var);
                            f6[] f6VarArr = (f6[]) spanned.getSpans(spanStart, spanEnd, f6.class);
                            int length = f6VarArr.length;
                            while (i13 < length) {
                                uy0[] uy0VarArr3 = uy0VarArr2;
                                f6 f6Var = f6VarArr[i13];
                                spannableStringBuilder.setSpan(new yo(f6Var, 4), spanned.getSpanStart(f6Var), spanned.getSpanEnd(f6Var), spanned.getSpanFlags(uy0Var));
                                spannableStringBuilder.removeSpan(f6Var);
                                i13++;
                                uy0VarArr2 = uy0VarArr3;
                                i14 = i14;
                                length = length;
                                f6VarArr = f6VarArr;
                            }
                            uy0VarArr = uy0VarArr2;
                            i12 = i14;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(uy0Var));
                            spannableStringBuilder.removeSpan(uy0Var);
                        } else {
                            uy0VarArr = uy0VarArr2;
                            i12 = i14;
                        }
                        i14 = i12 + 1;
                        uy0VarArr2 = uy0VarArr;
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
                if (!list.isEmpty() && ((f) list.get(0)).f59518n != -1.0f) {
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
                if (((f) list.get(i15)).f59518n != -1.0f) {
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
                    fVar.f59525u = z10;
                    if (fVar.f59513i != view) {
                        fVar.f59513i = view;
                    }
                    boolean z13 = fVar.f59520p;
                    fVar.f59520p = false;
                    if (z13) {
                        if (i11 == 1) {
                            textPaint = layout.getPaint();
                        } else {
                            textPaint = k6.f28077o2;
                        }
                        fVar.h(i0.a.f(Math.max(0.0f, fVar.f59518n), i3, textPaint.getColor()));
                    } else {
                        fVar.h(i3);
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
        int i3;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            if (h.f59533q == null) {
                h.f59533q = new h();
            }
            h hVar = h.f59533q;
            int i10 = hVar.f59542k;
            w9.b[] bVarArr = hVar.f59536c;
            if (bVarArr[0] == null) {
                bVarArr[0] = new w9.b(i10);
                hVar.f59539g = new Paint();
                hVar.f59540i = new ArrayList(100);
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
                        fVar.f59527x = i10;
                        int i15 = i11 * i12;
                        int i16 = i11 * i13;
                        fVar.setBounds(i15, i16 - g0.L(5.0f), g0.L(3.0f) + i15 + i11, g0.L(5.0f) + i16 + i11);
                        int min = Math.min(A * 5, L);
                        fVar.d = min;
                        while (true) {
                            Stack stack = fVar.f59509c;
                            if (fVar.h.size() + stack.size() < min) {
                                stack.push(new Object());
                            }
                        }
                        fVar.h(-1);
                        hVar.f59540i.add(fVar);
                        i13++;
                    }
                    i12++;
                }
                i3 = 128;
                hVar.a(new Canvas((Bitmap) bVarArr[0].f57424b), new Rect(0, 0, i10, i10));
                hVar.f59539g.setShader((BitmapShader) bVarArr[0].f57425c);
                hVar.h = System.currentTimeMillis();
            } else {
                i3 = 128;
                if (hVar.f59547p && !lc.e(128)) {
                    hVar.d = 0;
                    hVar.a(new Canvas((Bitmap) bVarArr[0].f57424b), new Rect(0, 0, i10, i10));
                    hVar.f59539g.setShader((BitmapShader) bVarArr[0].f57425c);
                    hVar.h = System.currentTimeMillis();
                    hVar.f59547p = false;
                }
            }
            Paint paint = hVar.f59539g;
            paint.setColorFilter(this.v);
            canvas.drawRect(bounds, paint);
            if (lc.e(i3)) {
                cg.j d = cg.j.d();
                d.getClass();
                cg.j.c();
                d.f4702c.add(this);
                if (h.f59533q == null) {
                    h.f59533q = new h();
                }
                h hVar2 = h.f59533q;
                hVar2.getClass();
                int i17 = bounds.left;
                int i18 = hVar2.f59542k;
                int i19 = ((i17 % i18) + i18) % i18;
                int i20 = ((bounds.top % i18) + i18) % i18;
                int min2 = Math.min(bounds.width(), i18) + i19;
                int min3 = Math.min(bounds.height(), i18) + i20;
                Rect rect = hVar2.f59544m;
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
                if (!hVar2.f59543l && !rect.isEmpty()) {
                    hVar2.f59543l = true;
                    Choreographer.getInstance().postFrameCallback(hVar2.f59545n);
                }
            }
        }
    }

    public final void e(Path path) {
        path.addCircle(this.f59515k, this.f59516l, be.a(this.f59518n, 0.0f, 1.0f) * this.f59517m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i3) {
        if (this.f59526w != i3) {
            int i10 = 0;
            while (true) {
                float[] fArr = C;
                if (i10 < fArr.length) {
                    this.f59507a[i10].setColor(i0.a.o(i3, (int) (this.f59523s * fArr[i10])));
                    i10++;
                } else {
                    this.v = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
                    this.f59526w = i3;
                    return;
                }
            }
        }
    }

    public final void i(float f10, float f11, float f12) {
        if (this.f59512g == null) {
            this.f59512g = new RectF();
        }
        RectF rectF = this.f59512g;
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
        View view = this.f59513i;
        if (view != null) {
            if (view.getParent() != null && this.f59525u) {
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
        this.f59515k = f10;
        this.f59516l = f11;
        this.f59517m = f12;
        float f14 = 0.0f;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        this.f59518n = f13;
        this.f59519o = z10;
        ValueAnimator valueAnimator = this.f59522r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f59519o) {
            alpha = 255;
        } else {
            alpha = this.f59507a[C.length - 1].getAlpha();
        }
        float f15 = this.f59518n;
        if (!z10) {
            f14 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f15, f14).setDuration(be.a(this.f59517m * 0.3f, 250.0f, 550.0f));
        this.f59522r = duration;
        duration.setInterpolator(this.f59524t);
        this.f59522r.addUpdateListener(new g2(this, alpha, 6));
        this.f59522r.addListener(new i81(this, 24));
        this.f59522r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f59529z;
        rectF.set(rect);
        rectF.inset(0.0f, g0.L(2.5f));
    }

    @Override
    public final void setAlpha(int i3) {
        this.f59523s = i3;
        int i10 = 0;
        while (true) {
            float[] fArr = C;
            if (i10 < fArr.length) {
                this.f59507a[i10].setAlpha((int) (fArr[i10] * i3));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!getBounds().contains((int) bVar.f59476a, (int) bVar.f59477b)) {
                it.remove();
            }
            Stack stack = this.f59509c;
            if (stack.size() < this.d) {
                stack.push(bVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.f59507a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
