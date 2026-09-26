package qg;

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
import org.telegram.ui.Components.qq;
public abstract class d2 extends ci.d {
    public final na f41613h0;
    public final RectF f41614i0;
    public int f41615j0;
    public final n2 f41616k0;
    public final d6 f41617l0;
    public int m0;
    public boolean f41618n0;

    public d2(n2 n2Var, ContextThemeWrapper contextThemeWrapper, d6 d6Var, ja jaVar) {
        super(contextThemeWrapper, d6Var, false);
        this.f41614i0 = new RectF();
        this.m0 = 8;
        this.f41617l0 = d6Var;
        this.f41616k0 = n2Var;
        this.f41613h0 = new na(jaVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.u(AndroidUtilities.bold());
        removeView(this.f4473r);
        setForeground(h6.Y(h6.l1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f4467d0;
        RectF rectF = this.f41614i0;
        if (z10) {
            float d = this.d.d() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - d) / 2.0f, 0.0f, (getMeasuredWidth() + d) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f41618n0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.d()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f7) {
        k2[] k2VarArr;
        n2 n2Var = this.f41616k0;
        super.setAlpha((!n2Var.f41833y || (k2VarArr = n2Var.H) == null || k2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.f41615j0 = 2;
        g(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f41615j0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        qq qqVar = new qq(R.drawable.media_magic_cut, 0);
        qqVar.setSize(AndroidUtilities.dp(22.0f));
        qqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        qqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        qqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(qqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f41615j0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        qq qqVar = new qq(R.drawable.media_button_erase, 0);
        qqVar.setSize(AndroidUtilities.dp(20.0f));
        qqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(qqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f41615j0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        qq qqVar = new qq(R.drawable.media_sticker_stroke, 0);
        qqVar.setSize(AndroidUtilities.dp(20.0f));
        qqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(qqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.m0 = i10;
        setForeground(h6.Y(h6.v0(h6.f19148i6, this.f41617l0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.f41615j0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        qq qqVar = new qq(R.drawable.media_button_restore, 0);
        qqVar.setSize(AndroidUtilities.dp(20.0f));
        qqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(qqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f41615j0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f41615j0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        qq qqVar = new qq(R.drawable.photo_undo2, 0);
        qqVar.setSize(AndroidUtilities.dp(20.0f));
        qqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(qqVar, 0, 1, 0);
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
