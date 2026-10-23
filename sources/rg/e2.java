package rg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.xq;
public abstract class e2 extends ei.d {
    public final na f45757k0;
    public final RectF f45758l0;
    public int m0;
    public final o2 f45759n0;
    public final g6 f45760o0;
    public int f45761p0;
    public boolean f45762q0;

    public e2(o2 o2Var, ContextThemeWrapper contextThemeWrapper, g6 g6Var, ja jaVar) {
        super(contextThemeWrapper, g6Var, false);
        this.f45758l0 = new RectF();
        this.f45761p0 = 8;
        this.f45760o0 = g6Var;
        this.f45759n0 = o2Var;
        this.f45757k0 = new na(jaVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(AndroidUtilities.bold());
        removeView(this.f8872r);
        setForeground(k6.Z(k6.o1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f8867g0;
        RectF rectF = this.f45758l0;
        if (z10) {
            float c10 = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c10) / 2.0f, 0.0f, (getMeasuredWidth() + c10) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f45762q0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f7) {
        l2[] l2VarArr;
        o2 o2Var = this.f45759n0;
        super.setAlpha((!o2Var.f46011y || (l2VarArr = o2Var.H) == null || l2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.m0 = 2;
        i(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.m0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        xq xqVar = new xq(R.drawable.media_magic_cut, 0);
        xqVar.setSize(AndroidUtilities.dp(22.0f));
        xqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        xqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        xqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(xqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.m0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        xq xqVar = new xq(R.drawable.media_button_erase, 0);
        xqVar.setSize(AndroidUtilities.dp(20.0f));
        xqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(xqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.m0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        xq xqVar = new xq(R.drawable.media_sticker_stroke, 0);
        xqVar.setSize(AndroidUtilities.dp(20.0f));
        xqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(xqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.f45761p0 = i10;
        setForeground(k6.Z(k6.w0(k6.f21272i6, this.f45760o0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.m0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        xq xqVar = new xq(R.drawable.media_button_restore, 0);
        xqVar.setSize(AndroidUtilities.dp(20.0f));
        xqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(xqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.m0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.m0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        xq xqVar = new xq(R.drawable.photo_undo2, 0);
        xqVar.setSize(AndroidUtilities.dp(20.0f));
        xqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(xqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndo));
        i(spannableStringBuilder, z10, true);
    }

    @Override
    public void setVisibility(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i10);
        }
    }
}
