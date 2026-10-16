package wh;

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
import m2.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.fi1;
import w7.r;
public final class g extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] f47659a;
    public final float[] f47660b;
    public final Stack f47661c;
    public int d;
    public final float[] e;
    public final int[] f47662f;
    public RectF f47663g;
    public final ArrayList h;
    public View f47664i;
    public long f47665j;
    public float f47666k;
    public float f47667l;
    public float f47668m;
    public float f47669n;
    public boolean f47670o;
    public boolean f47671p;
    public Runnable f47672q;
    public ValueAnimator f47673r;
    public int f47674s;
    public TimeInterpolator f47675t;
    public boolean f47676u;
    public PorterDuffColorFilter v;
    public int f47677w;
    public int f47678x;
    public boolean f47679y;
    public final RectF f47680z;

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
        this.f47659a = new Paint[fArr.length];
        this.f47660b = new float[fArr.length];
        this.f47661c = new Stack();
        this.e = new float[14];
        this.f47662f = new int[fArr.length];
        this.h = new ArrayList();
        this.f47669n = -1.0f;
        this.f47674s = 255;
        this.f47675t = new id(1);
        this.f47680z = new RectF();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            this.f47659a[i10] = new Paint();
            if (i10 == 0) {
                this.f47659a[i10].setStrokeWidth(AndroidUtilities.dp(1.4f));
                this.f47659a[i10].setStyle(Paint.Style.STROKE);
                this.f47659a[i10].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.f47659a[i10].setStrokeWidth(AndroidUtilities.dp(1.2f));
                this.f47659a[i10].setStyle(Paint.Style.STROKE);
                this.f47659a[i10].setStrokeCap(Paint.Cap.ROUND);
            }
            this.f47660b[i10] = this.f47659a[i10].getStrokeWidth() * 0.5f;
        }
        SharedConfig.getDevicePerformanceClass();
        h(0);
    }

    public static void a(View view, Layout layout, int i10, int i11, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i12;
        int i13;
        if (layout != null) {
            Object[] objArr = (r11[]) spanned.getSpans(0, layout.getText().length(), r11.class);
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
        if (canvas instanceof mw0) {
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
        r11[] r11VarArr;
        int i13;
        if (list != null && !list.isEmpty()) {
            StaticLayout staticLayout2 = (Layout) atomicReference.get();
            int i14 = 0;
            if (staticLayout2 == null || !layout.getText().toString().equals(staticLayout2.getText().toString()) || layout.getWidth() != staticLayout2.getWidth() || layout.getHeight() != staticLayout2.getHeight()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
                if (layout.getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) layout.getText();
                    r11[] r11VarArr2 = (r11[]) spanned.getSpans(0, spanned.length(), r11.class);
                    int i15 = 0;
                    while (i15 < Math.min(100, r11VarArr2.length)) {
                        r11 r11Var = r11VarArr2[i15];
                        if (r11Var.c()) {
                            int spanStart = spanned.getSpanStart(r11Var);
                            int spanEnd = spanned.getSpanEnd(r11Var);
                            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(spanStart, spanEnd, Emoji.EmojiSpan.class);
                            int length = emojiSpanArr.length;
                            while (i14 < length) {
                                r11[] r11VarArr3 = r11VarArr2;
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i14];
                                spannableStringBuilder.setSpan(new b(emojiSpan), spanned.getSpanStart(emojiSpan), spanned.getSpanEnd(emojiSpan), spanned.getSpanFlags(r11Var));
                                spannableStringBuilder.removeSpan(emojiSpan);
                                i14++;
                                r11VarArr2 = r11VarArr3;
                                i15 = i15;
                                length = length;
                                emojiSpanArr = emojiSpanArr;
                            }
                            r11VarArr = r11VarArr2;
                            i13 = i15;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(r11Var));
                            spannableStringBuilder.removeSpan(r11Var);
                        } else {
                            r11VarArr = r11VarArr2;
                            i13 = i15;
                        }
                        i15 = i13 + 1;
                        r11VarArr2 = r11VarArr;
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
            if (!list.isEmpty() && ((g) list.get(0)).f47669n != -1.0f) {
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
            boolean z12 = ((g) list.get(i16)).f47669n != -1.0f;
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
                gVar.f47676u = z10;
                if (gVar.f47664i != view) {
                    gVar.f47664i = view;
                }
                boolean z13 = gVar.f47671p;
                gVar.f47671p = false;
                if (z13) {
                    gVar.h(i0.a.d(Math.max(0.0f, gVar.f47669n), i10, (i12 == 1 ? layout.getPaint() : g6.f19800o2).getColor()));
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
            if (i.f47684q == null) {
                i.f47684q = new i();
            }
            i iVar = i.f47684q;
            int i11 = iVar.f47692k;
            t[] tVarArr = iVar.f47687c;
            if (tVarArr[0] == null) {
                tVarArr[0] = new t(i11);
                iVar.f47689g = new Paint();
                iVar.f47690i = new ArrayList(100);
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
                        gVar.f47678x = i11;
                        int i16 = i12 * i13;
                        int i17 = i12 * i14;
                        gVar.setBounds(i16, i17 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f) + i16 + i12, AndroidUtilities.dp(5.0f) + i17 + i12);
                        int min = Math.min(A * 5, dp);
                        gVar.d = min;
                        while (true) {
                            Stack stack = gVar.f47661c;
                            if (gVar.h.size() + stack.size() < min) {
                                stack.push(new Object());
                            }
                        }
                        gVar.h(-1);
                        iVar.f47690i.add(gVar);
                        i14++;
                    }
                    i13++;
                }
                i10 = 128;
                iVar.a(new Canvas((Bitmap) tVarArr[0].f15110b), new Rect(0, 0, i11, i11));
                iVar.f47689g.setShader((BitmapShader) tVarArr[0].f15111c);
                iVar.h = System.currentTimeMillis();
            } else {
                i10 = 128;
                if (iVar.f47697p && !LiteMode.isEnabled(128)) {
                    iVar.d = 0;
                    iVar.a(new Canvas((Bitmap) tVarArr[0].f15110b), new Rect(0, 0, i11, i11));
                    iVar.f47689g.setShader((BitmapShader) tVarArr[0].f15111c);
                    iVar.h = System.currentTimeMillis();
                    iVar.f47697p = false;
                }
            }
            Paint paint = iVar.f47689g;
            paint.setColorFilter(this.v);
            canvas.drawRect(bounds, paint);
            if (LiteMode.isEnabled(i10)) {
                zf.i d = zf.i.d();
                d.getClass();
                zf.i.c();
                d.d.add(this);
                if (i.f47684q == null) {
                    i.f47684q = new i();
                }
                i iVar2 = i.f47684q;
                iVar2.getClass();
                int i18 = bounds.left;
                int i19 = iVar2.f47692k;
                int i20 = ((i18 % i19) + i19) % i19;
                int i21 = ((bounds.top % i19) + i19) % i19;
                int min2 = Math.min(bounds.width(), i19) + i20;
                int min3 = Math.min(bounds.height(), i19) + i21;
                Rect rect = iVar2.f47694m;
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
                if (!iVar2.f47693l && !rect.isEmpty()) {
                    iVar2.f47693l = true;
                    Choreographer.getInstance().postFrameCallback(iVar2.f47695n);
                }
            }
        }
    }

    public final void e(Path path) {
        path.addCircle(this.f47666k, this.f47667l, r.a(this.f47669n, 0.0f, 1.0f) * this.f47668m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i10) {
        if (this.f47677w != i10) {
            int i11 = 0;
            while (true) {
                float[] fArr = C;
                if (i11 < fArr.length) {
                    this.f47659a[i11].setColor(i0.a.k(i10, (int) (this.f47674s * fArr[i11])));
                    i11++;
                } else {
                    this.v = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    this.f47677w = i10;
                    return;
                }
            }
        }
    }

    public final void i(float f7, float f10, float f11) {
        if (this.f47663g == null) {
            this.f47663g = new RectF();
        }
        RectF rectF = this.f47663g;
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
        View view = this.f47664i;
        if (view != null) {
            if (view.getParent() != null && this.f47676u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof a0) {
                ((a0) view).l();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f7, float f10, float f11, boolean z10) {
        float f12;
        int alpha;
        this.f47666k = f7;
        this.f47667l = f10;
        this.f47668m = f11;
        float f13 = 0.0f;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        this.f47669n = f12;
        this.f47670o = z10;
        ValueAnimator valueAnimator = this.f47673r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f47670o) {
            alpha = 255;
        } else {
            alpha = this.f47659a[C.length - 1].getAlpha();
        }
        float f14 = this.f47669n;
        if (!z10) {
            f13 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f14, f13).setDuration(r.a(this.f47668m * 0.3f, 250.0f, 550.0f));
        this.f47673r = duration;
        duration.setInterpolator(this.f47675t);
        this.f47673r.addUpdateListener(new p2(this, alpha, 7));
        this.f47673r.addListener(new fi1(this, 19));
        this.f47673r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f47680z;
        rectF.set(rect);
        rectF.inset(0.0f, AndroidUtilities.dp(2.5f));
    }

    @Override
    public final void setAlpha(int i10) {
        this.f47674s = i10;
        int i11 = 0;
        while (true) {
            float[] fArr = C;
            if (i11 < fArr.length) {
                this.f47659a[i11].setAlpha((int) (fArr[i11] * i10));
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
            if (!getBounds().contains((int) cVar.f47631a, (int) cVar.f47632b)) {
                it.remove();
            }
            Stack stack = this.f47661c;
            if (stack.size() < this.d) {
                stack.push(cVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.f47659a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
