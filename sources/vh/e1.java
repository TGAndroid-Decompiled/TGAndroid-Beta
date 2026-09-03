package vh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.y80;
public final class e1 extends ut {
    public boolean B;
    public y80 C;
    public Paint D;
    public Layout E;
    public int F;
    public boolean G;
    public final y0 H;
    public TL_iv.PageBlock I;
    public int J;
    public float K;
    public float L;
    public long M;
    public int N;
    public f4 O;
    public boolean P;
    public final z0 Q;
    public d1 f45942c;
    public c1 d;
    public final f6 e;
    public int f45943f;
    public boolean h;
    public boolean f45944n;
    public boolean f45945r;
    public boolean f45946s;
    public boolean v;
    public boolean f45947w;
    public boolean f45948x;
    public boolean f45949y;

    public e1(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f45943f = UserConfig.selectedAccount;
        this.F = -1;
        this.G = true;
        this.H = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                e1 e1Var = e1.this;
                if (!e1Var.v || e1Var.h) {
                    return null;
                }
                d1 d1Var = e1Var.f45942c;
                if (d1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    d1Var.Q0(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.J = j6.G6;
        this.Q = new z0(this, 0);
        this.e = f6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(5);
        a1 a1Var = new a1(this);
        setCustomSelectionActionModeCallback(j0Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(a1Var);
        }
        setOnLongClickListener(new dg.f0(this, 3));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new lh.k(this, 2));
        addTextChangedListener(new b1(this));
        t();
    }

    @Override
    public final void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            y5.o(text, i11, min, i10, true, this.I);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            notifySpansChanged();
        }
    }

    @Override
    public final o51 createUrlSpan(String str) {
        return y5.k(str);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4;
        d1 d1Var;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (d1Var = this.f45942c) != null) {
                d1Var.w1(keyEvent.isShiftPressed());
                return true;
            }
        } else {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 66 || keyCode == 160) && this.f45942c != null && !this.f45947w) {
                if (keyEvent.getAction() == 0) {
                    if ((keyEvent.getFlags() & 2) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.f45945r && (z4 || keyEvent.isShiftPressed())) {
                        p();
                        return true;
                    }
                    this.f45942c.g1(this);
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
        return y5.q(max, min, text);
    }

    @Override
    public f6 getResourcesProvider() {
        return this.e;
    }

    public final void m() {
        Editable text = getText();
        if (text != null) {
            f4[] f4VarArr = (f4[]) text.getSpans(0, text.length(), f4.class);
            for (f4 f4Var : f4VarArr) {
                f4Var.d(text);
            }
            for (f4 f4Var2 : f4VarArr) {
                f4Var2.a(this.f45943f, this, this.e);
            }
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.j4 j4Var = this.floatingActionMode;
        if (j4Var != null) {
            try {
                j4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.G = true;
        invalidate();
    }

    public final f4 o(float f10, float f11) {
        int totalPaddingTop;
        f4[] f4VarArr;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (f4 f4Var : (f4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), f4.class)) {
                int spanStart = text.getSpanStart(f4Var);
                int spanEnd = text.getSpanEnd(f4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return f4Var;
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
        f4[] f4VarArr;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        this.O = null;
        this.P = false;
        Editable text = getText();
        if (text != null) {
            for (f4 f4Var : (f4[]) text.getSpans(0, text.length(), f4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = f4Var.f45976b;
                if (richButtonSpan != null && f4Var.f45977c == this) {
                    richButtonSpan.detach(this);
                    f4Var.f45977c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        t01[] t01VarArr;
        int i10;
        int i11;
        float f10;
        Layout layout = getLayout();
        y80 y80Var = null;
        if (layout == null) {
            this.C = null;
            this.E = null;
            this.F = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.G || layout != this.E || text.length() != this.F) {
                this.G = false;
                this.E = layout;
                this.F = text.length();
                this.C = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    for (t01 t01Var : (t01[]) spanned.getSpans(0, spanned.length(), t01.class)) {
                        int i12 = t01Var.f28862b.f28632a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(t01Var);
                            int spanEnd = spanned.getSpanEnd(t01Var);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (y80Var == null) {
                                    y80Var = new y80(0);
                                    y80Var.f30951n = false;
                                }
                                y80Var.d(layout, spanStart, 0.0f);
                                if ((32768 & i12) != 0) {
                                    i10 = -AndroidUtilities.dp(6.0f);
                                } else if ((i12 & 16384) != 0) {
                                    i10 = AndroidUtilities.dp(2.0f);
                                } else {
                                    i10 = 0;
                                }
                                if (i10 != 0) {
                                    if (i10 > 0) {
                                        f10 = 5.0f;
                                    } else {
                                        f10 = -2.0f;
                                    }
                                    i11 = AndroidUtilities.dp(f10) + i10;
                                } else {
                                    i11 = 0;
                                }
                                y80Var.f30952o = i11;
                                layout.getSelectionPath(spanStart, spanEnd, y80Var);
                            }
                        }
                    }
                    if (y80Var != null) {
                        y80Var.f30951n = true;
                    }
                    this.C = y80Var;
                }
            }
        }
        if (this.C != null) {
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setPathEffect(y80.c());
            }
            this.D.setColor(j6.v0(j6.K6, this.e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.C, this.D);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.f45942c != null) {
            if (length() == 0) {
                this.f45942c.q0();
                return true;
            } else if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f45942c.h0(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        d1 d1Var = this.f45942c;
        if (d1Var != null) {
            d1Var.n1(this, i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        d1 d1Var;
        d1 d1Var2;
        if (i10 != 16908319 || (d1Var2 = this.f45942c) == null || !d1Var2.h()) {
            if (i10 == 16908322 && (d1Var = this.f45942c) != null && d1Var.V0(this)) {
                return true;
            }
            return super.onTextContextMenuItem(i10);
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z4;
        boolean z10;
        if (motionEvent.getAction() == 0 && this.f45942c != null && isEnabled() && isFocusable()) {
            this.f45942c.c(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            s sVar = null;
            z0 z0Var = this.Q;
            int i10 = 0;
            if (action == 0) {
                this.K = motionEvent.getX();
                this.L = motionEvent.getY();
                this.M = motionEvent.getEventTime();
                f4 o10 = o(motionEvent.getX(), motionEvent.getY());
                this.O = o10;
                if (o10 != null && this.d != null) {
                    this.P = false;
                    o10.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(z0Var);
                    AndroidUtilities.runOnUIThread(z0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.O = null;
            } else {
                f4 f4Var = this.O;
                if (f4Var != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == f4Var) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 || z4) {
                        f4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(z0Var);
                    }
                    if (z4) {
                        this.O = null;
                        if (!this.P && z10 && motionEvent.getAction() == 1) {
                            ((o2) this.d).a(this, f4Var, false);
                        }
                        this.P = false;
                    }
                    return true;
                } else if (motionEvent.getAction() == 1) {
                    if (this.N == 0) {
                        this.N = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.K;
                    float y10 = motionEvent.getY() - this.L;
                    float f11 = (y10 * y10) + (x10 * x10);
                    int i11 = this.N;
                    if (f11 <= i11 * i11 && motionEvent.getEventTime() - this.M < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y11 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                s[] sVarArr = (s[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), s.class);
                                int length = sVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    s sVar2 = sVarArr[i10];
                                    int spanStart = text.getSpanStart(sVar2);
                                    int spanEnd = text.getSpanEnd(sVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        if (spanEnd <= text.length()) {
                                            f10 = layout.getPrimaryHorizontal(spanEnd);
                                        } else {
                                            f10 = primaryHorizontal;
                                        }
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, f10) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, f10) + AndroidUtilities.dp(2.0f)) {
                                            sVar = sVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (sVar != null) {
                            q.U(getContext(), sVar.f46197a, new ph.s1(19, this, sVar), this.e);
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
        this.f45944n = true;
        getText().replace(max, max2, "\n");
        this.f45944n = false;
        setSelection(max + 1);
    }

    public final void q() {
        if (!this.f45948x) {
            return;
        }
        this.f45949y = true;
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
        this.f45949y = false;
    }

    public final void r() {
        d1 d1Var = this.f45942c;
        if (d1Var != null) {
            d1Var.c(this);
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
                this.B = false;
            }
            y5.o(text, i11, min, i10, false, this.I);
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
        post(new z0(this, 1));
    }

    public void setAccentHint(boolean z4) {
        if (this.f45946s == z4) {
            return;
        }
        this.f45946s = z4;
        t();
    }

    public void setAllowNewlines(boolean z4) {
        this.f45947w = z4;
    }

    public void setAutoBold(boolean z4) {
        this.B = z4;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.I = pageBlock;
    }

    public void setCenterEmptyHint(boolean z4) {
        if (this.f45948x == z4) {
            return;
        }
        this.f45948x = z4;
        if (z4) {
            q();
            return;
        }
        int dp = AndroidUtilities.dp(2.0f);
        setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
    }

    @Override
    public void setGravity(int i10) {
        if (!this.f45949y) {
            this.f45948x = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(c1 c1Var) {
        this.d = c1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f45943f = i10;
        m();
    }

    @Override
    public void setInputType(int i10) {
        boolean z4;
        InputMethodManager inputMethodManager;
        if (getInputType() != i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        super.setInputType(i10);
        if (z4 && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(d1 d1Var) {
        this.f45942c = d1Var;
    }

    public void setLocked(boolean z4) {
        y0 y0Var;
        boolean z10;
        if (this.v == z4) {
            return;
        }
        this.v = z4;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            y0Var = this.H;
            if (i10 < length) {
                if (filters[i10] == y0Var) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z4 && !z10) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = y0Var;
            setFilters(inputFilterArr);
        }
        boolean z11 = !z4;
        setAllowDrawCursor(z11);
        setCursorVisible(z11);
    }

    public void setSoftEnterNewline(boolean z4) {
        this.f45945r = z4;
    }

    public void setTextColorKey(int i10) {
        this.J = i10;
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
        int i10 = this.J;
        f6 f6Var = this.e;
        setTextColor(j6.v0(i10, f6Var));
        setLinkTextColor(j6.v0(j6.f19941gc, f6Var));
        if (this.f45946s) {
            v02 = j6.l1(0.5f, j6.v0(j6.Oh, f6Var));
        } else {
            v02 = j6.v0(j6.H6, f6Var);
        }
        setHintTextColor(v02);
        setCursorColor(j6.v0(j6.G6, f6Var));
        setHandlesColor(j6.v0(j6.f20024l6, f6Var));
        m();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
