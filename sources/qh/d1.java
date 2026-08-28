package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.eb0;
public final class d1 extends mt {
    public boolean A;
    public f80 B;
    public Paint C;
    public Layout D;
    public int E;
    public boolean F;
    public final x0 G;
    public TL_iv.PageBlock H;
    public int I;
    public float J;
    public float K;
    public long L;
    public int M;
    public b4 N;
    public boolean O;
    public final y0 P;
    public c1 f46335c;
    public b1 d;
    public final b6 f46336e;
    public int f46337f;
    public boolean h;
    public boolean f46338n;
    public boolean f46339r;
    public boolean f46340s;
    public boolean v;
    public boolean f46341w;
    public boolean f46342x;
    public boolean f46343y;

    public d1(Context context, b6 b6Var) {
        super(context, b6Var);
        this.f46337f = UserConfig.selectedAccount;
        this.E = -1;
        this.F = true;
        this.G = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
                d1 d1Var = d1.this;
                if (!d1Var.v || d1Var.h) {
                    return null;
                }
                c1 c1Var = d1Var.f46335c;
                if (c1Var != null && charSequence != null && i10 > i9 && i11 == i12) {
                    c1Var.h1(charSequence.subSequence(i9, i10));
                }
                return spanned.subSequence(i11, i12);
            }
        };
        this.I = f6.G6;
        this.P = new y0(this, 0);
        this.f46336e = b6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(5);
        z0 z0Var = new z0(this);
        setCustomSelectionActionModeCallback(j0Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(z0Var);
        }
        setOnLongClickListener(new kh.d5(this, 2));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new gh.k(this, 2));
        addTextChangedListener(new a1(this));
        t();
    }

    @Override
    public final void addStyle(int i9, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            u5.o(text, i10, min, i9, true, this.H);
            if ((i9 & 256) != 0) {
                invalidateSpoilers();
            }
            notifySpansChanged();
        }
    }

    @Override
    public final r41 createUrlSpan(String str) {
        return u5.k(str);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        c1 c1Var;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (c1Var = this.f46335c) != null) {
                c1Var.T1(keyEvent.isShiftPressed());
                return true;
            }
        } else {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 66 || keyCode == 160) && this.f46335c != null && !this.f46341w) {
                if (keyEvent.getAction() == 0) {
                    if ((keyEvent.getFlags() & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f46339r && (z10 || keyEvent.isShiftPressed())) {
                        p();
                        return true;
                    }
                    this.f46335c.L0(this);
                }
            } else {
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return true;
    }

    @Override
    public final int getCurrentStyle(int i9, int i10) {
        int max;
        int min;
        Editable text = getText();
        if (text == null || (max = Math.max(0, i9)) >= (min = Math.min(i10, text.length()))) {
            return 0;
        }
        return u5.q(max, min, text);
    }

    @Override
    public b6 getResourcesProvider() {
        return this.f46336e;
    }

    public final void m() {
        Editable text = getText();
        if (text != null) {
            b4[] b4VarArr = (b4[]) text.getSpans(0, text.length(), b4.class);
            for (b4 b4Var : b4VarArr) {
                b4Var.d(text);
            }
            for (b4 b4Var2 : b4VarArr) {
                b4Var2.a(this.f46337f, this, this.f46336e);
            }
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.g4 g4Var = this.floatingActionMode;
        if (g4Var != null) {
            try {
                g4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.F = true;
        invalidate();
    }

    public final b4 o(float f10, float f11) {
        int totalPaddingTop;
        b4[] b4VarArr;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (b4 b4Var : (b4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), b4.class)) {
                int spanStart = text.getSpanStart(b4Var);
                int spanEnd = text.getSpanEnd(b4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return b4Var;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override
    public final void onDetachedFromWindow() {
        b4[] b4VarArr;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.N = null;
        this.O = false;
        Editable text = getText();
        if (text != null) {
            for (b4 b4Var : (b4[]) text.getSpans(0, text.length(), b4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = b4Var.f46314b;
                if (richButtonSpan != null && b4Var.f46315c == this) {
                    richButtonSpan.detach(this);
                    b4Var.f46315c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wz0[] wz0VarArr;
        int i9;
        int i10;
        float f10;
        Layout layout = getLayout();
        f80 f80Var = null;
        if (layout == null) {
            this.B = null;
            this.D = null;
            this.E = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.F || layout != this.D || text.length() != this.E) {
                this.F = false;
                this.D = layout;
                this.E = text.length();
                this.B = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    for (wz0 wz0Var : (wz0[]) spanned.getSpans(0, spanned.length(), wz0.class)) {
                        int i11 = wz0Var.f34479b.f34062a;
                        if ((65536 & i11) != 0) {
                            int spanStart = spanned.getSpanStart(wz0Var);
                            int spanEnd = spanned.getSpanEnd(wz0Var);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (f80Var == null) {
                                    f80Var = new f80(0);
                                    f80Var.f28333n = false;
                                }
                                f80Var.d(layout, spanStart, 0.0f);
                                if ((32768 & i11) != 0) {
                                    i9 = -AndroidUtilities.dp(6.0f);
                                } else if ((i11 & 16384) != 0) {
                                    i9 = AndroidUtilities.dp(2.0f);
                                } else {
                                    i9 = 0;
                                }
                                if (i9 != 0) {
                                    if (i9 > 0) {
                                        f10 = 5.0f;
                                    } else {
                                        f10 = -2.0f;
                                    }
                                    i10 = AndroidUtilities.dp(f10) + i9;
                                } else {
                                    i10 = 0;
                                }
                                f80Var.f28334o = i10;
                                layout.getSelectionPath(spanStart, spanEnd, f80Var);
                            }
                        }
                    }
                    if (f80Var != null) {
                        f80Var.f28333n = true;
                    }
                    this.B = f80Var;
                }
            }
        }
        if (this.B != null) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setPathEffect(f80.c());
            }
            this.C.setColor(f6.v0(f6.K6, this.f46336e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.B, this.C);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 67 && this.f46335c != null) {
            if (length() == 0) {
                this.f46335c.J0();
                return true;
            } else if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f46335c.A(this)) {
                return true;
            }
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i9, int i10) {
        super.onSelectionChanged(i9, i10);
        c1 c1Var = this.f46335c;
        if (c1Var != null) {
            c1Var.k1(this, i9, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        q();
    }

    @Override
    public final boolean onTextContextMenuItem(int i9) {
        c1 c1Var;
        c1 c1Var2;
        if (i9 != 16908319 || (c1Var2 = this.f46335c) == null || !c1Var2.p()) {
            if (i9 == 16908322 && (c1Var = this.f46335c) != null && c1Var.U1(this)) {
                return true;
            }
            return super.onTextContextMenuItem(i9);
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10;
        boolean z11;
        if (motionEvent.getAction() == 0 && this.f46335c != null && isEnabled() && isFocusable()) {
            this.f46335c.d(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            r rVar = null;
            y0 y0Var = this.P;
            int i9 = 0;
            if (action == 0) {
                this.J = motionEvent.getX();
                this.K = motionEvent.getY();
                this.L = motionEvent.getEventTime();
                b4 o6 = o(motionEvent.getX(), motionEvent.getY());
                this.N = o6;
                if (o6 != null && this.d != null) {
                    this.O = false;
                    o6.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(y0Var);
                    AndroidUtilities.runOnUIThread(y0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.N = null;
            } else {
                b4 b4Var = this.N;
                if (b4Var != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == b4Var) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 || z10) {
                        b4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(y0Var);
                    }
                    if (z10) {
                        this.N = null;
                        if (!this.O && z11 && motionEvent.getAction() == 1) {
                            ((m2) this.d).a(this, b4Var, false);
                        }
                        this.O = false;
                    }
                    return true;
                } else if (motionEvent.getAction() == 1) {
                    if (this.M == 0) {
                        this.M = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.J;
                    float y10 = motionEvent.getY() - this.K;
                    float f11 = (y10 * y10) + (x10 * x10);
                    int i10 = this.M;
                    if (f11 <= i10 * i10 && motionEvent.getEventTime() - this.L < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y11 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                r[] rVarArr = (r[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), r.class);
                                int length = rVarArr.length;
                                while (true) {
                                    if (i9 >= length) {
                                        break;
                                    }
                                    r rVar2 = rVarArr[i9];
                                    int spanStart = text.getSpanStart(rVar2);
                                    int spanEnd = text.getSpanEnd(rVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        if (spanEnd <= text.length()) {
                                            f10 = layout.getPrimaryHorizontal(spanEnd);
                                        } else {
                                            f10 = primaryHorizontal;
                                        }
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, f10) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, f10) + AndroidUtilities.dp(2.0f)) {
                                            rVar = rVar2;
                                            break;
                                        }
                                    }
                                    i9++;
                                }
                            }
                        }
                        if (rVar != null) {
                            p.T(getContext(), rVar.f46640a, new eb0(21, this, rVar), this.f46336e);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.f46338n = true;
        getText().replace(max, max2, "\n");
        this.f46338n = false;
        setSelection(max + 1);
    }

    public final void q() {
        if (!this.f46342x) {
            return;
        }
        this.f46343y = true;
        int dp = AndroidUtilities.dp(2.0f);
        CharSequence hint = getHint();
        if (length() == 0 && getWidth() > 0 && !TextUtils.isEmpty(hint)) {
            int max = Math.max(0, Math.round(((getWidth() - (dp * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
            super.setGravity(51);
            setPadding(max + dp, getPaddingTop(), dp, getPaddingBottom());
        } else {
            super.setGravity(17);
            setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
        }
        this.f46343y = false;
    }

    public final void r() {
        c1 c1Var = this.f46335c;
        if (c1Var != null) {
            c1Var.d(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override
    public final void removeStyle(int i9, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            if ((i9 & 1) != 0) {
                this.A = false;
            }
            u5.o(text, i10, min, i9, false, this.H);
            if ((i9 & 256) != 0) {
                invalidateSpoilers();
            }
            notifySpansChanged();
        }
    }

    public final void s() {
        n();
        if (isFocused()) {
            clearFocus();
        }
        r();
        n();
        post(new y0(this, 1));
    }

    public void setAccentHint(boolean z10) {
        if (this.f46340s == z10) {
            return;
        }
        this.f46340s = z10;
        t();
    }

    public void setAllowNewlines(boolean z10) {
        this.f46341w = z10;
    }

    public void setAutoBold(boolean z10) {
        this.A = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.H = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.f46342x == z10) {
            return;
        }
        this.f46342x = z10;
        if (z10) {
            q();
            return;
        }
        int dp = AndroidUtilities.dp(2.0f);
        setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
    }

    @Override
    public void setGravity(int i9) {
        if (!this.f46343y) {
            this.f46342x = false;
        }
        super.setGravity(i9);
    }

    public void setInlineButtonClickListener(b1 b1Var) {
        this.d = b1Var;
    }

    public void setInlineButtonContext(int i9) {
        this.f46337f = i9;
        m();
    }

    @Override
    public void setInputType(int i9) {
        boolean z10;
        InputMethodManager inputMethodManager;
        if (getInputType() != i9) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setInputType(i9);
        if (z10 && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(c1 c1Var) {
        this.f46335c = c1Var;
    }

    public void setLocked(boolean z10) {
        x0 x0Var;
        boolean z11;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i9 = 0;
        while (true) {
            x0Var = this.G;
            if (i9 < length) {
                if (filters[i9] == x0Var) {
                    z11 = true;
                    break;
                }
                i9++;
            } else {
                z11 = false;
                break;
            }
        }
        if (z10 && !z11) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = x0Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.f46339r = z10;
    }

    public void setTextColorKey(int i9) {
        this.I = i9;
        t();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.h = true;
        setText(charSequence);
        m();
        setSelection(length());
        this.h = false;
    }

    public final void t() {
        int v02;
        int i9 = this.I;
        b6 b6Var = this.f46336e;
        setTextColor(f6.v0(i9, b6Var));
        setLinkTextColor(f6.v0(f6.f23061gc, b6Var));
        if (this.f46340s) {
            v02 = f6.l1(0.5f, f6.v0(f6.Oh, b6Var));
        } else {
            v02 = f6.v0(f6.H6, b6Var);
        }
        setHintTextColor(v02);
        setCursorColor(f6.v0(f6.G6, b6Var));
        setHandlesColor(f6.v0(f6.f23144l6, b6Var));
        m();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
