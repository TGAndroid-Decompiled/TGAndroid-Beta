package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import m2.p0;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.y00;
public class l extends TextView implements q9 {
    public static Field S;
    public static Class T;
    public static Method U;
    public final e6 E;
    public CharacterStyle F;
    public r70 G;
    public r70 H;
    public t70 I;
    public PorterDuffColorFilter J;
    public final boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Layout O;
    public int P;
    public boolean Q;
    public Object R;
    public final df.c f59554a;
    public final ArrayList f59555b;
    public final Stack f59556c;
    public boolean d;
    public boolean f59557e;
    public boolean f59558f;
    public int h;
    public final Path f59559n;
    public boolean f59560r;
    public int f59561s;
    public l5 f59562w;
    public boolean f59563x;
    public final p0 f59564y;

    public l(Context context) {
        this(context, null, true);
    }

    public ClickableSpan a(int i3, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i3 - getPaddingLeft();
        int paddingTop = i10 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !g0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public final void b() {
        ArrayList arrayList = this.f59555b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f59556c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i3 = f.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            f.a(this, layout, 0, measuredWidth, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    public final void c(float f10, float f11) {
        this.f59557e = false;
        ArrayList arrayList = this.f59555b;
        if (arrayList.isEmpty()) {
            this.d = true;
            b();
            return;
        }
        this.f59558f = true;
        int i3 = this.h + 1;
        this.h = i3;
        ((f) arrayList.get(0)).f59521q = new k(this, i3, 0);
        float hypot = (float) Math.hypot(getWidth(), getHeight());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f) obj).j(f10, f11, hypot, false);
        }
    }

    public final void d(boolean z10) {
        int i3;
        if (getLayout() != null && getLayout().getText() != null) {
            i3 = getLayout().getText().length();
        } else {
            i3 = 0;
        }
        if (!z10 && this.O == getLayout() && this.P == i3) {
            return;
        }
        this.f59562w = p5.update(this.f59561s, this, this.f59562w, getLayout());
        this.O = getLayout();
        this.P = i3;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        p0 p0Var = this.f59564y;
        if (p0Var != null) {
            Layout layout = getLayout();
            ClickableSpan a10 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a10 != null && motionEvent.getAction() == 0) {
                t70 t70Var = new t70(a10, this.E, motionEvent.getX(), motionEvent.getY(), 0);
                t70Var.d(k6.w0(k6.f28298ze, this.E));
                this.I = t70Var;
                p0Var.b(t70Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.I.f38328i);
                int spanEnd = spannableString.getSpanEnd(this.I.f38328i);
                n70 b10 = this.I.b();
                if (this.K) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                g0.i3(new iv0(this, t70Var, a10, 29), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                p0Var.f(true);
                t70 t70Var2 = this.I;
                if (t70Var2 != null && (characterStyle = t70Var2.f38328i) == a10) {
                    r70 r70Var = this.G;
                    if (r70Var != null) {
                        r70Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.I = null;
                    return true;
                }
                this.I = null;
            }
            if (motionEvent.getAction() == 3) {
                p0Var.f(true);
                this.I = null;
            }
        }
        if (this.I != null || (this.f59560r && ((GestureDetector) ((y00) this.f59554a.d).f40562a).onTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public Layout getStaticTextLayout() {
        return getLayout();
    }

    @Override
    public final void invalidate() {
        if (!this.Q) {
            this.Q = true;
            try {
                if (T == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    S = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    T = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        U = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (U != null) {
                    if (this.R == null) {
                        this.R = S.get(this);
                    }
                    Object obj = this.R;
                    if (obj != null) {
                        U.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        ArrayList arrayList;
        Canvas canvas2;
        float f10;
        float f11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.L) {
            if (this.M) {
                f10 = 0.0f;
            } else {
                f10 = paddingLeft;
            }
            if (this.N) {
                f11 = 0.0f;
            } else {
                f11 = paddingTop;
            }
            canvas.translate(f10, f11);
        }
        p0 p0Var = this.f59564y;
        if (p0Var != null && p0Var.h(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f59555b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = true;
        Path path = this.f59559n;
        if (isEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                Rect bounds = ((f) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            i6.f23457n = this.f59563x;
            super.onDraw(canvas);
            i6.f23457n = true;
            canvas.restore();
            f fVar = (f) arrayList2.get(0);
            if (fVar.f59517m > 0.0f && fVar.f59518n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((f) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        d(false);
        if (this.f59562w != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            p5.drawAnimatedEmojis(canvas, getLayout(), this.f59562w, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.J);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((f) arrayList.get(0)).f59518n == -1.0f) {
                z10 = false;
            }
            if (z10) {
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            canvas2.translate(paddingLeft, g0.L(2.0f) + paddingTop);
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                f fVar2 = (f) obj2;
                fVar2.h(getPaint().getColor());
                fVar2.draw(canvas2);
            }
            if (z10) {
                path.rewind();
                ((f) arrayList.get(0)).e(path);
                canvas2.drawPath(path, k6.Cm);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        b();
        if (this.f59557e) {
            c((getWidth() / 2.0f) - getPaddingLeft(), ((getHeight() / 2.0f) - getPaddingTop()) + getScrollY());
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        b();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        b();
        d(true);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.L = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.M = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.N = z10;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.F != characterStyle) {
            p0 p0Var = this.f59564y;
            p0Var.g();
            this.F = characterStyle;
            w70 k10 = p0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int w02 = k6.w0(k6.f28298ze, this.E);
                k10.g(k6.r1(0.8f, w02), k6.r1(1.3f, w02), k6.r1(1.0f, w02), k6.r1(4.0f, w02));
                k10.f39944x.setStrokeWidth(g0.N(1.25f));
                p0Var.c(k10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(r70 r70Var) {
        this.H = r70Var;
    }

    public void setOnLinkPressListener(r70 r70Var) {
        this.G = r70Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.h++;
        this.f59557e = false;
        this.f59558f = false;
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i3) {
        super.setTextColor(i3);
        this.J = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.f59563x = z10;
    }

    public l(Context context, e6 e6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f59555b = arrayList;
        this.f59556c = new Stack();
        this.f59559n = new Path();
        this.f59560r = true;
        this.f59561s = 0;
        this.f59563x = true;
        this.K = true;
        this.O = null;
        this.f59564y = new p0(this);
        this.E = e6Var;
        this.f59554a = new df.c(this, arrayList, new ei.f(12, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}
