package sg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MotionEvent;
import bi.g6;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.mt;
import org.telegram.ui.ms0;
public abstract class d0 extends mt implements k6 {
    public final p6 Y1;
    public final m2.t Z1;
    public Runnable a2;
    public int f48327b2;

    public d0(int i10, Context context, p6 p6Var) {
        super(context, p6Var);
        this.Y1 = p6Var;
        this.Z1 = new m2.t(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i11 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f48327b2 = i10;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(12.0f));
        a7.V(this, t6.Ie, p6Var);
        a7.H(this, t6.Vc, p6Var);
        a7.D(this, t6.f21029ig, p6Var);
        int i12 = t6.Je;
        a7.m(this, 34, i12, p6Var);
        a7.E(this, i12, p6Var);
        a7.m(this, 30, t6.Ke, p6Var);
        a7.m(this, 36, t6.f21049jg, p6Var);
        if (i11 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new g6((l) this, 7));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    public final void I() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            b bVar = new b(this.Y1);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f48285f, 255);
            ofInt.addUpdateListener(new a(bVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(bVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void J(boolean z10) {
        b[] bVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (b bVar : (b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)) {
            rh.n nVar = new rh.n(25, this, bVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f48285f, 0);
                ofInt.addUpdateListener(new a(bVar, this, 1));
                ofInt.addListener(new ms0(nVar, 28));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                nVar.run();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.Z1.f12685b).onTouchEvent(motionEvent) && !isLongClickable()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getEditTextSelectionEnd() {
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd;
    }

    public int getEditTextSelectionStart() {
        int selectionStart = getSelectionStart();
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return getPaint().getFontMetricsInt();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        menu.clear();
        menu.add(2131296494, 2131296494, 0, dd.L0(2131751599, null));
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (hasSelection() && ((b[]) getText().getSpans(i10, i11, b.class)).length != 0) {
            setSelection(i10, i11 - 1);
        }
    }

    public void setMaxLength(int i10) {
        if (this.f48327b2 != i10) {
            this.f48327b2 = i10;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.a2 = runnable;
    }

    @Override
    public final void updateColors() {
        p6 p6Var = this.Y1;
        try {
            setHintColor(t6.w0(t6.Je, p6Var));
            setCursorColor(t6.w0(t6.Ke, p6Var));
            setHandlesColor(t6.w0(t6.f21049jg, p6Var));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
