package th;

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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.st;
import org.telegram.ui.yu0;
public final class d1 extends st {
    public boolean A;
    public s80 B;
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
    public c1 f48399c;
    public b1 d;
    public final c6 f48400e;
    public int f48401f;
    public boolean h;
    public boolean f48402n;
    public boolean f48403r;
    public boolean f48404s;
    public boolean v;
    public boolean f48405w;
    public boolean f48406x;
    public boolean f48407y;

    public d1(Context context, c6 c6Var) {
        super(context, c6Var);
        this.f48401f = UserConfig.selectedAccount;
        this.E = -1;
        this.F = true;
        this.G = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                d1 d1Var = d1.this;
                if (!d1Var.v || d1Var.h) {
                    return null;
                }
                c1 c1Var = d1Var.f48399c;
                if (c1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    c1Var.Z0(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.I = g6.G6;
        this.P = new y0(this, 0);
        this.f48400e = c6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(5);
        z0 z0Var = new z0(this);
        setCustomSelectionActionModeCallback(k0Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(z0Var);
        }
        setOnLongClickListener(new bg.g0(this, 3));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new jh.j(this, 2));
        addTextChangedListener(new a1(this));
        t();
    }

    @Override
    public final void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            v5.o(text, i11, min, i10, true, this.H);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            notifySpansChanged();
        }
    }

    @Override
    public final c51 createUrlSpan(String str) {
        return v5.k(str);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        c1 c1Var;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (c1Var = this.f48399c) != null) {
                c1Var.t1(keyEvent.isShiftPressed());
                return true;
            }
        } else {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 66 || keyCode == 160) && this.f48399c != null && !this.f48405w) {
                if (keyEvent.getAction() == 0) {
                    if ((keyEvent.getFlags() & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f48403r && (z10 || keyEvent.isShiftPressed())) {
                        p();
                        return true;
                    }
                    this.f48399c.S0(this);
                }
            } else {
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return true;
    }

    @Override
    public final int getCurrentStyle(int i10, int i11) {
        int max;
        int min;
        Editable text = getText();
        if (text == null || (max = Math.max(0, i10)) >= (min = Math.min(i11, text.length()))) {
            return 0;
        }
        return v5.q(max, min, text);
    }

    @Override
    public c6 getResourcesProvider() {
        return this.f48400e;
    }

    public final void m() {
        Editable text = getText();
        if (text != null) {
            c4[] c4VarArr = (c4[]) text.getSpans(0, text.length(), c4.class);
            for (c4 c4Var : c4VarArr) {
                c4Var.d(text);
            }
            for (c4 c4Var2 : c4VarArr) {
                c4Var2.a(this.f48401f, this, this.f48400e);
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

    public final c4 o(float f9, float f10) {
        int totalPaddingTop;
        c4[] c4VarArr;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f10 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f9 - getTotalPaddingLeft()) + getScrollX();
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
        c4[] c4VarArr;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.N = null;
        this.O = false;
        Editable text = getText();
        if (text != null) {
            for (c4 c4Var : (c4[]) text.getSpans(0, text.length(), c4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = c4Var.f48389b;
                if (richButtonSpan != null && c4Var.f48390c == this) {
                    richButtonSpan.detach(this);
                    c4Var.f48390c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i01[] i01VarArr;
        int i10;
        int i11;
        float f9;
        Layout layout = getLayout();
        s80 s80Var = null;
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
                    for (i01 i01Var : (i01[]) spanned.getSpans(0, spanned.length(), i01.class)) {
                        int i12 = i01Var.f29294b.f29024a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(i01Var);
                            int spanEnd = spanned.getSpanEnd(i01Var);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (s80Var == null) {
                                    s80Var = new s80(0);
                                    s80Var.f32546n = false;
                                }
                                s80Var.d(layout, spanStart, 0.0f);
                                if ((32768 & i12) != 0) {
                                    i10 = -AndroidUtilities.dp(6.0f);
                                } else if ((i12 & 16384) != 0) {
                                    i10 = AndroidUtilities.dp(2.0f);
                                } else {
                                    i10 = 0;
                                }
                                if (i10 != 0) {
                                    if (i10 > 0) {
                                        f9 = 5.0f;
                                    } else {
                                        f9 = -2.0f;
                                    }
                                    i11 = AndroidUtilities.dp(f9) + i10;
                                } else {
                                    i11 = 0;
                                }
                                s80Var.f32547o = i11;
                                layout.getSelectionPath(spanStart, spanEnd, s80Var);
                            }
                        }
                    }
                    if (s80Var != null) {
                        s80Var.f32546n = true;
                    }
                    this.B = s80Var;
                }
            }
        }
        if (this.B != null) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setPathEffect(s80.c());
            }
            this.C.setColor(g6.v0(g6.K6, this.f48400e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.B, this.C);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.f48399c != null) {
            if (length() == 0) {
                this.f48399c.u0();
                return true;
            } else if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f48399c.r0(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        c1 c1Var = this.f48399c;
        if (c1Var != null) {
            c1Var.T0(this, i10, i11);
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
        if (i10 != 16908319 || (c1Var2 = this.f48399c) == null || !c1Var2.m()) {
            if (i10 == 16908322 && (c1Var = this.f48399c) != null && c1Var.i1(this)) {
                return true;
            }
            return super.onTextContextMenuItem(i10);
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f9;
        boolean z10;
        boolean z11;
        if (motionEvent.getAction() == 0 && this.f48399c != null && isEnabled() && isFocusable()) {
            this.f48399c.e(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            r rVar = null;
            y0 y0Var = this.P;
            int i10 = 0;
            if (action == 0) {
                this.J = motionEvent.getX();
                this.K = motionEvent.getY();
                this.L = motionEvent.getEventTime();
                c4 o10 = o(motionEvent.getX(), motionEvent.getY());
                this.N = o10;
                if (o10 != null && this.d != null) {
                    this.O = false;
                    o10.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(y0Var);
                    AndroidUtilities.runOnUIThread(y0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.N = null;
            } else {
                c4 c4Var = this.N;
                if (c4Var != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == c4Var) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
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
                } else if (motionEvent.getAction() == 1) {
                    if (this.M == 0) {
                        this.M = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x4 = motionEvent.getX() - this.J;
                    float y8 = motionEvent.getY() - this.K;
                    float f10 = (y8 * y8) + (x4 * x4);
                    int i11 = this.M;
                    if (f10 <= i11 * i11 && motionEvent.getEventTime() - this.L < ViewConfiguration.getLongPressTimeout()) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y10 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x10 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                r[] rVarArr = (r[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), r.class);
                                int length = rVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    r rVar2 = rVarArr[i10];
                                    int spanStart = text.getSpanStart(rVar2);
                                    int spanEnd = text.getSpanEnd(rVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        if (spanEnd <= text.length()) {
                                            f9 = layout.getPrimaryHorizontal(spanEnd);
                                        } else {
                                            f9 = primaryHorizontal;
                                        }
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, f9) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, f9) + AndroidUtilities.dp(2.0f)) {
                                            rVar = rVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (rVar != null) {
                            p.U(getContext(), rVar.f48696a, new yu0(21, this, rVar), this.f48400e);
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
        this.f48402n = true;
        getText().replace(max, max2, "\n");
        this.f48402n = false;
        setSelection(max + 1);
    }

    public final void q() {
        if (!this.f48406x) {
            return;
        }
        this.f48407y = true;
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
        this.f48407y = false;
    }

    public final void r() {
        c1 c1Var = this.f48399c;
        if (c1Var != null) {
            c1Var.e(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override
    public final void removeStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            if ((i10 & 1) != 0) {
                this.A = false;
            }
            v5.o(text, i11, min, i10, false, this.H);
            if ((i10 & 256) != 0) {
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
        if (this.f48404s == z10) {
            return;
        }
        this.f48404s = z10;
        t();
    }

    public void setAllowNewlines(boolean z10) {
        this.f48405w = z10;
    }

    public void setAutoBold(boolean z10) {
        this.A = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.H = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.f48406x == z10) {
            return;
        }
        this.f48406x = z10;
        if (z10) {
            q();
            return;
        }
        int dp = AndroidUtilities.dp(2.0f);
        setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
    }

    @Override
    public void setGravity(int i10) {
        if (!this.f48407y) {
            this.f48406x = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(b1 b1Var) {
        this.d = b1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f48401f = i10;
        m();
    }

    @Override
    public void setInputType(int i10) {
        boolean z10;
        InputMethodManager inputMethodManager;
        if (getInputType() != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setInputType(i10);
        if (z10 && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(c1 c1Var) {
        this.f48399c = c1Var;
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
            if (i10 < length) {
                if (filters[i10] == x0Var) {
                    z11 = true;
                    break;
                }
                i10++;
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
        this.f48403r = z10;
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
        int v02;
        int i10 = this.I;
        c6 c6Var = this.f48400e;
        setTextColor(g6.v0(i10, c6Var));
        setLinkTextColor(g6.v0(g6.gc, c6Var));
        if (this.f48404s) {
            v02 = g6.l1(0.5f, g6.v0(g6.Oh, c6Var));
        } else {
            v02 = g6.v0(g6.H6, c6Var);
        }
        setHintTextColor(v02);
        setCursorColor(g6.v0(g6.G6, c6Var));
        setHandlesColor(g6.v0(g6.f23206l6, c6Var));
        m();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
