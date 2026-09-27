package zg;

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
import ii.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.du;
public abstract class e0 extends du {
    public final e6 f49333c;
    public final o0.c d;
    public Runnable e;
    public int f49334f;

    public e0(Context context, int i10, e6 e6Var) {
        super(context, e6Var);
        this.f49333c = e6Var;
        this.d = new o0.c(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i11 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f49334f = i10;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        setTextColor(i6.v0(i6.Ud, e6Var));
        setLinkTextColor(i6.v0(i6.f19134hc, e6Var));
        setHighlightColor(i6.v0(i6.f19381uf, e6Var));
        int i12 = i6.Vd;
        setHintColor(i6.v0(i12, e6Var));
        setHintTextColor(i6.v0(i12, e6Var));
        setCursorColor(i6.v0(i6.Wd, e6Var));
        setHandlesColor(i6.v0(i6.f19398vf, e6Var));
        if (i11 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new w5((p) this, 7));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.d.f15522b).onTouchEvent(motionEvent) && !isLongClickable()) {
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
        if (((b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            b bVar = new b(this.f49333c);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f49281f, 255);
            ofInt.addUpdateListener(new a(bVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(bVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void n(boolean z10) {
        b[] bVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (b bVar : (b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)) {
            k kVar = new k(4, this, bVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f49281f, 0);
                ofInt.addUpdateListener(new a(bVar, this, 1));
                ofInt.addListener(new pg.d0(kVar, 12));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                kVar.run();
            }
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (hasSelection() && ((b[]) getText().getSpans(i10, i11, b.class)).length != 0) {
            setSelection(i10, i11 - 1);
        }
    }

    public void setMaxLength(int i10) {
        if (this.f49334f != i10) {
            this.f49334f = i10;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.e = runnable;
    }
}
