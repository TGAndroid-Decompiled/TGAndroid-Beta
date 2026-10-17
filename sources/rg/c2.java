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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.yq;
public abstract class c2 extends ei.d {
    public final na f45335h0;
    public final RectF f45336i0;
    public int f45337j0;
    public final m2 f45338k0;
    public final d6 f45339l0;
    public int m0;
    public boolean f45340n0;

    public c2(m2 m2Var, ContextThemeWrapper contextThemeWrapper, d6 d6Var, ja jaVar) {
        super(contextThemeWrapper, d6Var, false);
        this.f45336i0 = new RectF();
        this.m0 = 8;
        this.f45339l0 = d6Var;
        this.f45338k0 = m2Var;
        this.f45335h0 = new na(jaVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(AndroidUtilities.bold());
        removeView(this.f8862r);
        setForeground(h6.Z(h6.m1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f8856d0;
        RectF rectF = this.f45336i0;
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
        if (this.f45340n0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f7) {
        j2[] j2VarArr;
        m2 m2Var = this.f45338k0;
        super.setAlpha((!m2Var.f45556y || (j2VarArr = m2Var.H) == null || j2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.f45337j0 = 2;
        g(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f45337j0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        yq yqVar = new yq(R.drawable.media_magic_cut, 0);
        yqVar.setSize(AndroidUtilities.dp(22.0f));
        yqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        yqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        yqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(yqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f45337j0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        yq yqVar = new yq(R.drawable.media_button_erase, 0);
        yqVar.setSize(AndroidUtilities.dp(20.0f));
        yqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f45337j0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        yq yqVar = new yq(R.drawable.media_sticker_stroke, 0);
        yqVar.setSize(AndroidUtilities.dp(20.0f));
        yqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.m0 = i10;
        setForeground(h6.Z(h6.w0(h6.f21075i6, this.f45339l0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.f45337j0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        yq yqVar = new yq(R.drawable.media_button_restore, 0);
        yqVar.setSize(AndroidUtilities.dp(20.0f));
        yqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f45337j0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f45337j0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        yq yqVar = new yq(R.drawable.photo_undo2, 0);
        yqVar.setSize(AndroidUtilities.dp(20.0f));
        yqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndo));
        g(spannableStringBuilder, z10, true);
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
