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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.nq;
public abstract class e2 extends di.d {
    public final na f45201h0;
    public final RectF f45202i0;
    public int f45203j0;
    public final o2 f45204k0;
    public final f6 f45205l0;
    public int m0;
    public boolean f45206n0;

    public e2(o2 o2Var, ContextThemeWrapper contextThemeWrapper, f6 f6Var, ja jaVar) {
        super(contextThemeWrapper, f6Var, false);
        this.f45202i0 = new RectF();
        this.m0 = 8;
        this.f45205l0 = f6Var;
        this.f45204k0 = o2Var;
        this.f45201h0 = new na(jaVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.u(AndroidUtilities.bold());
        removeView(this.f7048r);
        setForeground(j6.Y(j6.l1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f7041d0;
        RectF rectF = this.f45202i0;
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
        if (this.f45206n0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.d()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f7) {
        l2[] l2VarArr;
        o2 o2Var = this.f45204k0;
        super.setAlpha((!o2Var.f45431y || (l2VarArr = o2Var.H) == null || l2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.f45203j0 = 2;
        g(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f45203j0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(R.drawable.media_magic_cut, 0);
        nqVar.setSize(AndroidUtilities.dp(22.0f));
        nqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        nqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        nqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f45203j0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(R.drawable.media_button_erase, 0);
        nqVar.setSize(AndroidUtilities.dp(20.0f));
        nqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f45203j0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(R.drawable.media_sticker_stroke, 0);
        nqVar.setSize(AndroidUtilities.dp(20.0f));
        nqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.m0 = i10;
        setForeground(j6.Y(j6.v0(j6.f20780i6, this.f45205l0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.f45203j0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(R.drawable.media_button_restore, 0);
        nqVar.setSize(AndroidUtilities.dp(20.0f));
        nqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f45203j0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f45203j0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        nq nqVar = new nq(R.drawable.photo_undo2, 0);
        nqVar.setSize(AndroidUtilities.dp(20.0f));
        nqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
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
