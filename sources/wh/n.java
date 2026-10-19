package wh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.y90;
public class n extends TextView implements w9 {
    public static Field R;
    public static Class S;
    public static Method T;
    public CharacterStyle E;
    public w90 F;
    public w90 G;
    public y90 H;
    public PorterDuffColorFilter I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public Layout N;
    public int O;
    public boolean P;
    public Object Q;
    public final l f49095a;
    public final ArrayList f49096b;
    public final Stack f49097c;
    public boolean d;
    public boolean e;
    public boolean f49098f;
    public int h;
    public final Path f49099n;
    public boolean f49100r;
    public int f49101s;
    public w5 v;
    public boolean f49102w;
    public final u90 f49103x;
    public final d6 f49104y;

    public n(Context context) {
        this(context, null, true);
    }

    public ClickableSpan a(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int paddingTop = i11 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f7 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f7);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f7 && layout.getLineWidth(lineForVertical) + lineLeft >= f7 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public final void b() {
        ArrayList arrayList = this.f49096b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f49097c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i10 = g.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            g.a(this, layout, 0, measuredWidth, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    public final void c(float f7, float f10) {
        this.e = false;
        ArrayList arrayList = this.f49096b;
        if (arrayList.isEmpty()) {
            this.d = true;
            b();
            return;
        }
        this.f49098f = true;
        int i10 = this.h + 1;
        this.h = i10;
        ((g) arrayList.get(0)).f49060q = new m(this, i10, 0);
        float hypot = (float) Math.hypot(getWidth(), getHeight());
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((g) obj).j(f7, f10, hypot, false);
        }
    }

    public final void d(boolean z10) {
        int i10;
        if (getLayout() != null && getLayout().getText() != null) {
            i10 = getLayout().getText().length();
        } else {
            i10 = 0;
        }
        if (!z10 && this.N == getLayout() && this.O == i10) {
            return;
        }
        this.v = a6.update(this.f49101s, this, this.v, getLayout());
        this.N = getLayout();
        this.O = i10;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        u90 u90Var = this.f49103x;
        if (u90Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                y90 y90Var = new y90(a2, this.f49104y, motionEvent.getX(), motionEvent.getY(), 0);
                y90Var.d(h6.w0(h6.Ld, this.f49104y));
                this.H = y90Var;
                u90Var.a(y90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.H.f32578i);
                int spanEnd = spannableString.getSpanEnd(this.H.f32578i);
                r90 b10 = this.H.b();
                if (this.J) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new by0(this, y90Var, a2, 28), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                u90Var.d(true);
                y90 y90Var2 = this.H;
                if (y90Var2 != null && (characterStyle = y90Var2.f32578i) == a2) {
                    w90 w90Var = this.F;
                    if (w90Var != null) {
                        w90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.H = null;
                    return true;
                }
                this.H = null;
            }
            if (motionEvent.getAction() == 3) {
                u90Var.d(true);
                this.H = null;
            }
        }
        if (this.H != null || (this.f49100r && ((GestureDetector) this.f49095a.f49089a.f16009b).onTouchEvent(motionEvent))) {
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
                FileLog.e(th2);
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
        float f7;
        float f10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.K) {
            if (this.L) {
                f7 = 0.0f;
            } else {
                f7 = paddingLeft;
            }
            if (this.M) {
                f10 = 0.0f;
            } else {
                f10 = paddingTop;
            }
            canvas.translate(f7, f10);
        }
        u90 u90Var = this.f49103x;
        if (u90Var != null && u90Var.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f49096b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = true;
        Path path = this.f49099n;
        if (isEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                Rect bounds = ((g) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Emoji.emojiDrawingUseAlpha = this.f49102w;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            g gVar = (g) arrayList2.get(0);
            if (gVar.f49056m > 0.0f && gVar.f49057n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((g) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        d(false);
        if (this.v != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            a6.drawAnimatedEmojis(canvas, getLayout(), this.v, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.I);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((g) arrayList.get(0)).f49057n == -1.0f) {
                z10 = false;
            }
            if (z10) {
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            canvas2.translate(paddingLeft, AndroidUtilities.dp(2.0f) + paddingTop);
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                g gVar2 = (g) obj2;
                gVar2.h(getPaint().getColor());
                gVar2.draw(canvas2);
            }
            if (z10) {
                path.rewind();
                ((g) arrayList.get(0)).e(path);
                canvas2.drawPath(path, h6.Ll);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
        if (this.e) {
            c((getWidth() / 2.0f) - getPaddingLeft(), ((getHeight() / 2.0f) - getPaddingTop()) + getScrollY());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b();
        d(true);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.K = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.L = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.M = z10;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.E != characterStyle) {
            u90 u90Var = this.f49103x;
            u90Var.e();
            this.E = characterStyle;
            ba0 i10 = u90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int w02 = h6.w0(h6.Ld, this.f49104y);
                i10.g(h6.m1(0.8f, w02), h6.m1(1.3f, w02), h6.m1(1.0f, w02), h6.m1(4.0f, w02));
                i10.f24891x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                u90Var.b(i10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(w90 w90Var) {
        this.G = w90Var;
    }

    public void setOnLinkPressListener(w90 w90Var) {
        this.F = w90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.h++;
        this.e = false;
        this.f49098f = false;
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.I = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.f49102w = z10;
    }

    public n(Context context, d6 d6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f49096b = arrayList;
        this.f49097c = new Stack();
        this.f49099n = new Path();
        this.f49100r = true;
        this.f49101s = 0;
        this.f49102w = true;
        this.J = true;
        this.N = null;
        this.f49103x = new u90(this);
        this.f49104y = d6Var;
        this.f49095a = new l(this, arrayList, new ci.f(12, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}
