package yg;

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
import hi.y5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fu;
public abstract class e0 extends fu {
    public final f6 f46991c;
    public final l2.h d;
    public Runnable e;
    public int f46992f;

    public e0(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.f46991c = f6Var;
        this.d = new l2.h(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i11 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f46992f = i10;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        setTextColor(j6.v0(j6.Ud, f6Var));
        setLinkTextColor(j6.v0(j6.f18004hc, f6Var));
        setHighlightColor(j6.v0(j6.f18245uf, f6Var));
        int i12 = j6.Vd;
        setHintColor(j6.v0(i12, f6Var));
        setHintTextColor(j6.v0(i12, f6Var));
        setCursorColor(j6.v0(j6.Wd, f6Var));
        setHandlesColor(j6.v0(j6.vf, f6Var));
        if (i11 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new y5((p) this, 7));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.d.f12721b).onTouchEvent(motionEvent) && !isLongClickable()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        menu.clear();
        int i10 = R.id.menu_delete;
        menu.add(i10, i10, 0, LocaleController.getString(R.string.Delete));
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

    public final void m() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            c cVar = new c(this.f46991c);
            ValueAnimator ofInt = ValueAnimator.ofInt(cVar.f46949f, 255);
            ofInt.addUpdateListener(new a(cVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(cVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void n(boolean z10) {
        c[] cVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (c cVar : (c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)) {
            q qVar = new q(2, this, cVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(cVar.f46949f, 0);
                ofInt.addUpdateListener(new a(cVar, this, 1));
                ofInt.addListener(new b(qVar, 0));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                qVar.run();
            }
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (hasSelection() && ((c[]) getText().getSpans(i10, i11, c.class)).length != 0) {
            setSelection(i10, i11 - 1);
        }
    }

    public void setMaxLength(int i10) {
        if (this.f46992f != i10) {
            this.f46992f = i10;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.e = runnable;
    }
}
