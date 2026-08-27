package rh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.ib0;

public final class d1 extends lt {
    public boolean A;
    public j80 B;
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
    public c4 N;
    public boolean O;
    public final y0 P;

    public c1 f47099c;
    public b1 d;

    public final c6 f47100e;

    public int f47101f;
    public boolean h;

    public boolean f47102n;

    public boolean f47103r;

    public boolean f47104s;
    public boolean v;

    public boolean f47105w;

    public boolean f47106x;

    public boolean f47107y;

    public d1(Context context, c6 c6Var) {
        super(context, c6Var);
        this.f47101f = UserConfig.selectedAccount;
        this.E = -1;
        this.F = true;
        this.G = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                d1 d1Var = this.f47546a;
                if (!d1Var.v || d1Var.h) {
                    return null;
                }
                c1 c1Var = d1Var.f47099c;
                if (c1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    c1Var.g1(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.I = g6.G6;
        this.P = new y0(this, 0);
        this.f47100e = c6Var;
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
        setOnLongClickListener(new lh.b5(this, 2));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new hh.k(this, 2));
        addTextChangedListener(new a1(this));
        t();
    }

    @Override
    public final void addStyle(int i10, int i11, int i12) {
        int iMin;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (iMin = Math.min(i12, text.length()))) {
            return;
        }
        v5.o(text, i11, iMin, i10, true, this.H);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    @Override
    public final t41 createUrlSpan(String str) {
        return v5.k(str);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        c1 c1Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.f47099c == null || this.f47105w) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z10 = (keyEvent.getFlags() & 2) != 0;
                if (this.f47103r && (z10 || keyEvent.isShiftPressed())) {
                    p();
                    return true;
                }
                this.f47099c.w1(this);
            }
        } else if (keyEvent.getAction() == 0 && (c1Var = this.f47099c) != null) {
            c1Var.T1(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override
    public final int getCurrentStyle(int i10, int i11) {
        int iMax;
        int iMin;
        Editable text = getText();
        if (text != null && (iMax = Math.max(0, i10)) < (iMin = Math.min(i11, text.length()))) {
            return v5.q(iMax, iMin, text);
        }
        return 0;
    }

    @Override
    public c6 getResourcesProvider() {
        return this.f47100e;
    }

    public final void m() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        c4[] c4VarArr = (c4[]) text.getSpans(0, text.length(), c4.class);
        for (c4 c4Var : c4VarArr) {
            c4Var.d(text);
        }
        for (c4 c4Var2 : c4VarArr) {
            c4Var2.a(this.f47101f, this, this.f47100e);
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

    public final c4 o(float f10, float f11) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (c4 c4Var : (c4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), c4.class)) {
                int spanStart = text.getSpanStart(c4Var);
                int spanEnd = text.getSpanEnd(c4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return c4Var;
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
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.N = null;
        this.O = false;
        Editable text = getText();
        if (text != null) {
            for (c4 c4Var : (c4[]) text.getSpans(0, text.length(), c4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = c4Var.f47089b;
                if (richButtonSpan != null && c4Var.f47090c == this) {
                    richButtonSpan.detach(this);
                    c4Var.f47090c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp;
        int iDp2;
        Layout layout = getLayout();
        j80 j80Var = null;
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
                    yz0[] yz0VarArr = (yz0[]) spanned.getSpans(0, spanned.length(), yz0.class);
                    int length = yz0VarArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        yz0 yz0Var = yz0VarArr[i10];
                        int i11 = yz0Var.f35101b.f34734a;
                        if ((65536 & i11) != 0) {
                            int spanStart = spanned.getSpanStart(yz0Var);
                            int spanEnd = spanned.getSpanEnd(yz0Var);
                            if (spanStart < 0) {
                                j80Var = j80Var;
                            } else if (spanEnd > spanStart) {
                                if (j80Var == null) {
                                    j80 j80Var2 = new j80(0);
                                    j80Var2.f29649n = false;
                                    j80Var = j80Var2;
                                }
                                j80Var.d(layout, spanStart, 0.0f);
                                if ((32768 & i11) != 0) {
                                    iDp = -AndroidUtilities.dp(6.0f);
                                } else {
                                    iDp = (i11 & 16384) != 0 ? AndroidUtilities.dp(2.0f) : 0;
                                }
                                if (iDp != 0) {
                                    iDp2 = AndroidUtilities.dp(iDp > 0 ? 5.0f : -2.0f) + iDp;
                                } else {
                                    iDp2 = 0;
                                }
                                j80Var.f29650o = iDp2;
                                layout.getSelectionPath(spanStart, spanEnd, j80Var);
                            }
                        }
                        i10++;
                        j80Var = j80Var;
                    }
                    if (j80Var != null) {
                        j80Var.f29649n = true;
                    }
                    this.B = j80Var;
                }
            }
        }
        if (this.B != null) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setPathEffect(j80.c());
            }
            this.C.setColor(g6.v0(g6.K6, this.f47100e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.B, this.C);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.f47099c != null) {
            if (length() == 0) {
                this.f47099c.K0();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f47099c.f1(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        c1 c1Var = this.f47099c;
        if (c1Var != null) {
            c1Var.N1(this, i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        c1 c1Var;
        c1 c1Var2;
        if (i10 == 16908319 && (c1Var2 = this.f47099c) != null && c1Var2.n()) {
            return true;
        }
        if (i10 == 16908322 && (c1Var = this.f47099c) != null && c1Var.o0(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.f47099c != null && isEnabled() && isFocusable()) {
            this.f47099c.g(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            r rVar = null;
            y0 y0Var = this.P;
            if (action == 0) {
                this.J = motionEvent.getX();
                this.K = motionEvent.getY();
                this.L = motionEvent.getEventTime();
                c4 c4VarO = o(motionEvent.getX(), motionEvent.getY());
                this.N = c4VarO;
                if (c4VarO != null && this.d != null) {
                    this.O = false;
                    c4VarO.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(y0Var);
                    AndroidUtilities.runOnUIThread(y0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.N = null;
            } else {
                c4 c4Var = this.N;
                if (c4Var != null) {
                    boolean z10 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z11 = motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == c4Var;
                    if (!z11 || z10) {
                        c4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(y0Var);
                    }
                    if (z10) {
                        this.N = null;
                        if (!this.O && z11 && motionEvent.getAction() == 1) {
                            ((m2) this.d).a(this, c4Var, false);
                        }
                        this.O = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.M == 0) {
                        this.M = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x8 = motionEvent.getX() - this.J;
                    float y10 = motionEvent.getY() - this.K;
                    float f10 = (y10 * y10) + (x8 * x8);
                    int i10 = this.M;
                    if (f10 <= i10 * i10 && motionEvent.getEventTime() - this.L < ViewConfiguration.getLongPressTimeout()) {
                        float x10 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y11 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x10 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                for (r rVar2 : (r[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), r.class)) {
                                    int spanStart = text.getSpanStart(rVar2);
                                    int spanEnd = text.getSpanEnd(rVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                                            rVar = rVar2;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (rVar != null) {
                            p.U(getContext(), rVar.f47398a, new ib0(21, this, rVar), this.f47100e);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        int iMax = Math.max(0, getSelectionStart());
        int iMax2 = Math.max(0, getSelectionEnd());
        if (iMax > iMax2) {
            iMax2 = iMax;
            iMax = iMax2;
        }
        this.f47102n = true;
        getText().replace(iMax, iMax2, "\n");
        this.f47102n = false;
        setSelection(iMax + 1);
    }

    public final void q() {
        if (this.f47106x) {
            this.f47107y = true;
            int iDp = AndroidUtilities.dp(2.0f);
            CharSequence hint = getHint();
            if (length() != 0 || getWidth() <= 0 || TextUtils.isEmpty(hint)) {
                super.setGravity(17);
                setPadding(iDp, getPaddingTop(), iDp, getPaddingBottom());
            } else {
                int iMax = Math.max(0, Math.round(((getWidth() - (iDp * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(iMax + iDp, getPaddingTop(), iDp, getPaddingBottom());
            }
            this.f47107y = false;
        }
    }

    public final void r() {
        c1 c1Var = this.f47099c;
        if (c1Var != null) {
            c1Var.g(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override
    public final void removeStyle(int i10, int i11, int i12) {
        int iMin;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (iMin = Math.min(i12, text.length()))) {
            return;
        }
        if ((i10 & 1) != 0) {
            this.A = false;
        }
        v5.o(text, i11, iMin, i10, false, this.H);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
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
        if (this.f47104s == z10) {
            return;
        }
        this.f47104s = z10;
        t();
    }

    public void setAllowNewlines(boolean z10) {
        this.f47105w = z10;
    }

    public void setAutoBold(boolean z10) {
        this.A = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.H = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.f47106x == z10) {
            return;
        }
        this.f47106x = z10;
        if (z10) {
            q();
        } else {
            int iDp = AndroidUtilities.dp(2.0f);
            setPadding(iDp, getPaddingTop(), iDp, getPaddingBottom());
        }
    }

    @Override
    public void setGravity(int i10) {
        if (!this.f47107y) {
            this.f47106x = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(b1 b1Var) {
        this.d = b1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f47101f = i10;
        m();
    }

    @Override
    public void setInputType(int i10) {
        InputMethodManager inputMethodManager;
        boolean z10 = getInputType() != i10;
        super.setInputType(i10);
        if (z10 && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(c1 c1Var) {
        this.f47099c = c1Var;
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
        int i10 = 0;
        while (true) {
            x0Var = this.G;
            if (i10 >= length) {
                z11 = false;
                break;
            } else {
                if (filters[i10] == x0Var) {
                    z11 = true;
                    break;
                }
                i10++;
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
        this.f47103r = z10;
    }

    public void setTextColorKey(int i10) {
        this.I = i10;
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
        int i10 = this.I;
        c6 c6Var = this.f47100e;
        setTextColor(g6.v0(i10, c6Var));
        setLinkTextColor(g6.v0(g6.gc, c6Var));
        setHintTextColor(this.f47104s ? g6.l1(0.5f, g6.v0(g6.Oh, c6Var)) : g6.v0(g6.H6, c6Var));
        setCursorColor(g6.v0(g6.G6, c6Var));
        setHandlesColor(g6.v0(g6.f23198l6, c6Var));
        m();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
