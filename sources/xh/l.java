package xh;

import ab.y;
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
import n2.n0;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.x70;
public class l extends TextView implements r9 {
    public static Field R;
    public static Class S;
    public static Method T;
    public final f6 D;
    public CharacterStyle E;
    public v70 F;
    public v70 G;
    public x70 H;
    public PorterDuffColorFilter I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public Layout N;
    public int O;
    public boolean P;
    public Object Q;
    public final gf.c f58837a;
    public final ArrayList f58838b;
    public final Stack f58839c;
    public boolean d;
    public boolean f58840e;
    public boolean f58841f;
    public int h;
    public final Path f58842n;
    public boolean f58843r;
    public int f58844s;
    public n5 f58845w;
    public boolean f58846x;
    public final n0 f58847y;

    public l(Context context) {
        this(context, null, true);
    }

    public ClickableSpan a(int i7, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i7 - getPaddingLeft();
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
        ArrayList arrayList = this.f58838b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f58839c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i7 = f.A;
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
        this.f58840e = false;
        ArrayList arrayList = this.f58838b;
        if (arrayList.isEmpty()) {
            this.d = true;
            b();
            return;
        }
        this.f58841f = true;
        int i7 = this.h + 1;
        this.h = i7;
        ((f) arrayList.get(0)).f58804q = new k(this, i7, 0);
        float hypot = (float) Math.hypot(getWidth(), getHeight());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f) obj).j(f10, f11, hypot, false);
        }
    }

    public final void d(boolean z9) {
        int i7;
        if (getLayout() != null && getLayout().getText() != null) {
            i7 = getLayout().getText().length();
        } else {
            i7 = 0;
        }
        if (!z9 && this.N == getLayout() && this.O == i7) {
            return;
        }
        this.f58845w = r5.update(this.f58844s, this, this.f58845w, getLayout());
        this.N = getLayout();
        this.O = i7;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        n0 n0Var = this.f58847y;
        if (n0Var != null) {
            Layout layout = getLayout();
            ClickableSpan a10 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a10 != null && motionEvent.getAction() == 0) {
                x70 x70Var = new x70(a10, this.D, motionEvent.getX(), motionEvent.getY(), 0);
                x70Var.d(k6.w0(k6.f28269ze, this.D));
                this.H = x70Var;
                n0Var.b(x70Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.H.f40246i);
                int spanEnd = spannableString.getSpanEnd(this.H.f40246i);
                r70 b10 = this.H.b();
                if (this.J) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                g0.i3(new r31(this, x70Var, a10, 27), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                n0Var.f(true);
                x70 x70Var2 = this.H;
                if (x70Var2 != null && (characterStyle = x70Var2.f40246i) == a10) {
                    v70 v70Var = this.F;
                    if (v70Var != null) {
                        v70Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.H = null;
                    return true;
                }
                this.H = null;
            }
            if (motionEvent.getAction() == 3) {
                n0Var.f(true);
                this.H = null;
            }
        }
        if (this.H != null || (this.f58843r && ((GestureDetector) ((vy) this.f58837a.d).f39747b).onTouchEvent(motionEvent))) {
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
        if (!this.P) {
            this.P = true;
            try {
                if (S == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    R = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    S = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        T = declaredMethod;
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
                if (T != null) {
                    if (this.Q == null) {
                        this.Q = R.get(this);
                    }
                    Object obj = this.Q;
                    if (obj != null) {
                        T.invoke(obj, null);
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
        if (!this.K) {
            if (this.L) {
                f10 = 0.0f;
            } else {
                f10 = paddingLeft;
            }
            if (this.M) {
                f11 = 0.0f;
            } else {
                f11 = paddingTop;
            }
            canvas.translate(f10, f11);
        }
        n0 n0Var = this.f58847y;
        if (n0Var != null && n0Var.h(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f58838b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z9 = true;
        Path path = this.f58842n;
        if (isEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                Rect bounds = ((f) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            i6.f23063n = this.f58846x;
            super.onDraw(canvas);
            i6.f23063n = true;
            canvas.restore();
            f fVar = (f) arrayList2.get(0);
            if (fVar.f58800m > 0.0f && fVar.f58801n > 0.0f) {
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
        if (this.f58845w != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            r5.drawAnimatedEmojis(canvas, getLayout(), this.f58845w, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.I);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((f) arrayList.get(0)).f58801n == -1.0f) {
                z9 = false;
            }
            if (z9) {
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
            if (z9) {
                path.rewind();
                ((f) arrayList.get(0)).e(path);
                canvas2.drawPath(path, k6.Cm);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b();
        if (this.f58840e) {
            c((getWidth() / 2.0f) - getPaddingLeft(), ((getHeight() / 2.0f) - getPaddingTop()) + getScrollY());
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        b();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        b();
        d(true);
    }

    public void setDisablePaddingsOffset(boolean z9) {
        this.K = z9;
    }

    public void setDisablePaddingsOffsetX(boolean z9) {
        this.L = z9;
    }

    public void setDisablePaddingsOffsetY(boolean z9) {
        this.M = z9;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.E != characterStyle) {
            n0 n0Var = this.f58847y;
            n0Var.g();
            this.E = characterStyle;
            a80 k10 = n0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int w02 = k6.w0(k6.f28269ze, this.D);
                k10.g(k6.r1(0.8f, w02), k6.r1(1.3f, w02), k6.r1(1.0f, w02), k6.r1(4.0f, w02));
                k10.f31751x.setStrokeWidth(g0.N(1.25f));
                n0Var.c(k10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(v70 v70Var) {
        this.G = v70Var;
    }

    public void setOnLinkPressListener(v70 v70Var) {
        this.F = v70Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.h++;
        this.f58840e = false;
        this.f58841f = false;
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.I = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z9) {
        this.f58846x = z9;
    }

    public l(Context context, f6 f6Var, boolean z9) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f58838b = arrayList;
        this.f58839c = new Stack();
        this.f58842n = new Path();
        this.f58843r = true;
        this.f58844s = 0;
        this.f58846x = true;
        this.J = true;
        this.N = null;
        this.f58847y = new n0(this);
        this.D = f6Var;
        this.f58837a = new gf.c(this, arrayList, new y(12, this, z9));
    }

    public void setClearLinkOnLongPress(boolean z9) {
    }
}
