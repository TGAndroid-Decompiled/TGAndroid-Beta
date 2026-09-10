package uh;

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
import gg.d0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.y5;
public class o extends TextView implements ba {
    public static Field O;
    public static Class P;
    public static Method Q;
    public n90 E;
    public PorterDuffColorFilter F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public Layout K;
    public int L;
    public boolean M;
    public Object N;
    public final m f42819a;
    public final ArrayList f42820b;
    public final Stack f42821c;
    public boolean d;
    public final Path e;
    public boolean f42822f;
    public int h;
    public u5 f42823n;
    public boolean f42824r;
    public final j90 f42825s;
    public final f6 v;
    public CharacterStyle f42826w;
    public l90 f42827x;
    public l90 f42828y;

    public o(Context context) {
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
        int i10;
        ArrayList arrayList = this.f42820b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.f42821c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i11 = h.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout = getLayout();
            if (measuredWidth > 0) {
                i10 = measuredWidth;
            } else {
                i10 = -2;
            }
            h.a(this, layout, 0, i10, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    public final void c(boolean z10) {
        int i10;
        if (getLayout() != null && getLayout().getText() != null) {
            i10 = getLayout().getText().length();
        } else {
            i10 = 0;
        }
        if (!z10 && this.K == getLayout() && this.L == i10) {
            return;
        }
        this.f42823n = y5.update(this.h, this, this.f42823n, getLayout());
        this.K = getLayout();
        this.L = i10;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        float paddingTop;
        j90 j90Var = this.f42825s;
        if (j90Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                n90 n90Var = new n90(a2, this.v, motionEvent.getX(), motionEvent.getY(), 0);
                n90Var.d(j6.v0(j6.Ld, this.v));
                this.E = n90Var;
                j90Var.a(n90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.E.f25465i);
                int spanEnd = spannableString.getSpanEnd(this.E.f25465i);
                g90 b10 = this.E.b();
                if (this.G) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop = getPaddingTop();
                }
                b10.d(layout, spanStart, paddingTop);
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new sx0(this, n90Var, a2, 21), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                j90Var.d(true);
                n90 n90Var2 = this.E;
                if (n90Var2 != null && (characterStyle = n90Var2.f25465i) == a2) {
                    l90 l90Var = this.f42827x;
                    if (l90Var != null) {
                        l90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.E = null;
                    return true;
                }
                this.E = null;
            }
            if (motionEvent.getAction() == 3) {
                j90Var.d(true);
                this.E = null;
            }
        }
        if (this.E != null || (this.f42822f && ((GestureDetector) this.f42819a.f42814a.f12721b).onTouchEvent(motionEvent))) {
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
        if (!this.M) {
            this.M = true;
            try {
                if (P == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    O = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    P = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        Q = declaredMethod;
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
                if (Q != null) {
                    if (this.N == null) {
                        this.N = O.get(this);
                    }
                    Object obj = this.N;
                    if (obj != null) {
                        Q.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(true);
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
        if (!this.H) {
            if (this.I) {
                f7 = 0.0f;
            } else {
                f7 = paddingLeft;
            }
            if (this.J) {
                f10 = 0.0f;
            } else {
                f10 = paddingTop;
            }
            canvas.translate(f7, f10);
        }
        j90 j90Var = this.f42825s;
        if (j90Var != null && j90Var.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.f42820b;
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = true;
        Path path = this.e;
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
                Rect bounds = ((h) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Emoji.emojiDrawingUseAlpha = this.f42824r;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            h hVar = (h) arrayList2.get(0);
            if (hVar.f42781m > 0.0f && hVar.f42782n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((h) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        c(false);
        if (this.f42823n != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            y5.drawAnimatedEmojis(canvas, getLayout(), this.f42823n, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.F);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            if (((h) arrayList.get(0)).f42782n == -1.0f) {
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
                h hVar2 = (h) obj2;
                hVar2.h(getPaint().getColor());
                hVar2.draw(canvas2);
            }
            if (z10) {
                path.rewind();
                ((h) arrayList.get(0)).e(path);
                canvas2.drawPath(path, j6.Il);
            }
            canvas2.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
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
        c(true);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.H = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.I = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.J = z10;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.f42826w != characterStyle) {
            j90 j90Var = this.f42825s;
            j90Var.e();
            this.f42826w = characterStyle;
            q90 i10 = j90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int v02 = j6.v0(j6.Ld, this.v);
                i10.f(j6.l1(0.8f, v02), j6.l1(1.3f, v02), j6.l1(1.0f, v02), j6.l1(4.0f, v02));
                i10.f26363w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                j90Var.b(i10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(l90 l90Var) {
        this.f42828y = l90Var;
    }

    public void setOnLinkPressListener(l90 l90Var) {
        this.f42827x = l90Var;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.F = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.f42824r = z10;
    }

    public o(Context context, f6 f6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f42820b = arrayList;
        this.f42821c = new Stack();
        this.e = new Path();
        this.f42822f = true;
        this.h = 0;
        this.f42824r = true;
        this.G = true;
        this.K = null;
        this.f42825s = new j90(this);
        this.v = f6Var;
        this.f42819a = new m(this, arrayList, new d0(10, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}
