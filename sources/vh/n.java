package vh;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.y90;
import tg.q;
public class n extends TextView implements x9 {
    public static Field R;
    public static Class S;
    public static Method T;
    public CharacterStyle E;
    public da0 F;
    public da0 G;
    public fa0 H;
    public PorterDuffColorFilter I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public Layout N;
    public int O;
    public boolean P;
    public Object Q;
    public final l f49728a;
    public final ArrayList f49729b;
    public final Stack f49730c;
    public boolean d;
    public boolean f49731e;
    public boolean f49732f;
    public int h;
    public final Path f49733n;
    public boolean f49734r;
    public int f49735s;
    public x5 v;
    public boolean f49736w;
    public final ba0 f49737x;
    public final e6 f49738y;

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
        ArrayList arrayList = this.f49729b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f49730c;
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
        this.f49731e = false;
        ArrayList arrayList = this.f49729b;
        if (arrayList.isEmpty()) {
            this.d = true;
            b();
            return;
        }
        this.f49732f = true;
        int i10 = this.h + 1;
        this.h = i10;
        ((g) arrayList.get(0)).f49692q = new m(this, i10, 0);
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
        this.v = b6.update(this.f49735s, this, this.v, getLayout());
        this.N = getLayout();
        this.O = i10;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        ba0 ba0Var = this.f49737x;
        if (ba0Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                fa0 fa0Var = new fa0(a2, this.f49738y, motionEvent.getX(), motionEvent.getY(), 0);
                fa0Var.d(i6.w0(i6.Ld, this.f49738y));
                this.H = fa0Var;
                ba0Var.a(fa0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.H.f26330i);
                int spanEnd = spannableString.getSpanEnd(this.H.f26330i);
                y90 b10 = this.H.b();
                if (this.J) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new q(this, fa0Var, a2, 4), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                ba0Var.d(true);
                fa0 fa0Var2 = this.H;
                if (fa0Var2 != null && (characterStyle = fa0Var2.f26330i) == a2) {
                    da0 da0Var = this.F;
                    if (da0Var != null) {
                        da0Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.H = null;
                    return true;
                }
                this.H = null;
            }
            if (motionEvent.getAction() == 3) {
                ba0Var.d(true);
                this.H = null;
            }
        }
        if (this.H != null || (this.f49734r && ((GestureDetector) this.f49728a.f49722a.f15668b).onTouchEvent(motionEvent))) {
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
        ba0 ba0Var = this.f49737x;
        if (ba0Var != null && ba0Var.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f49729b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = true;
        Path path = this.f49733n;
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
            Emoji.emojiDrawingUseAlpha = this.f49736w;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            g gVar = (g) arrayList2.get(0);
            if (gVar.f49688m > 0.0f && gVar.f49689n > 0.0f) {
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
            b6.drawAnimatedEmojis(canvas, getLayout(), this.v, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.I);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((g) arrayList.get(0)).f49689n == -1.0f) {
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
                canvas2.drawPath(path, i6.Ll);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
        if (this.f49731e) {
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
            ba0 ba0Var = this.f49737x;
            ba0Var.e();
            this.E = characterStyle;
            ia0 i10 = ba0.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int w02 = i6.w0(i6.Ld, this.f49738y);
                i10.g(i6.m1(0.8f, w02), i6.m1(1.3f, w02), i6.m1(1.0f, w02), i6.m1(4.0f, w02));
                i10.f27340x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                ba0Var.b(i10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(da0 da0Var) {
        this.G = da0Var;
    }

    public void setOnLinkPressListener(da0 da0Var) {
        this.F = da0Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.h++;
        this.f49731e = false;
        this.f49732f = false;
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.I = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.f49736w = z10;
    }

    public n(Context context, e6 e6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f49729b = arrayList;
        this.f49730c = new Stack();
        this.f49733n = new Path();
        this.f49734r = true;
        this.f49735s = 0;
        this.f49736w = true;
        this.J = true;
        this.N = null;
        this.f49737x = new ba0(this);
        this.f49738y = e6Var;
        this.f49728a = new l(this, arrayList, new ai.k(12, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}
