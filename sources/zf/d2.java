package zf;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.z9;

public abstract class d2 extends lh.d {

    public final da f50378d0;

    public final RectF f50379e0;

    public int f50380f0;

    public final n2 f50381g0;

    public final c6 f50382h0;

    public int f50383i0;

    public boolean f50384j0;

    public d2(n2 n2Var, ContextThemeWrapper contextThemeWrapper, c6 c6Var, z9 z9Var) {
        super(contextThemeWrapper, c6Var, false);
        this.f50379e0 = new RectF();
        this.f50383i0 = 8;
        this.f50382h0 = c6Var;
        this.f50381g0 = n2Var;
        this.f50378d0 = new da(z9Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.u(AndroidUtilities.bold());
        removeView(this.f15830r);
        setForeground(g6.Y(g6.l1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.W;
        RectF rectF = this.f50379e0;
        if (z10) {
            float fD = this.d.d() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - fD) / 2.0f, 0.0f, (getMeasuredWidth() + fD) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f50384j0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.d()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f10) {
        k2[] k2VarArr;
        n2 n2Var = this.f50381g0;
        if (!n2Var.f50630y || (k2VarArr = n2Var.D) == null || k2VarArr.length <= 0) {
            f10 = 0.0f;
        }
        super.setAlpha(f10);
    }

    public void setCancelState(boolean z10) {
        this.f50380f0 = 2;
        g(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f50380f0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cq cqVar = new cq(R.drawable.media_magic_cut, 0);
        cqVar.setSize(AndroidUtilities.dp(22.0f));
        cqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        cqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        cqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(cqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f50380f0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cq cqVar = new cq(R.drawable.media_button_erase, 0);
        cqVar.setSize(AndroidUtilities.dp(20.0f));
        cqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(cqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f50380f0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cq cqVar = new cq(R.drawable.media_sticker_stroke, 0);
        cqVar.setSize(AndroidUtilities.dp(20.0f));
        cqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(cqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.f50383i0 = i10;
        setForeground(g6.Y(g6.v0(g6.f23144i6, this.f50382h0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.f50380f0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cq cqVar = new cq(R.drawable.media_button_restore, 0);
        cqVar.setSize(AndroidUtilities.dp(20.0f));
        cqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(cqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f50380f0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f50380f0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cq cqVar = new cq(R.drawable.photo_undo2, 0);
        cqVar.setSize(AndroidUtilities.dp(20.0f));
        cqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(cqVar, 0, 1, 0);
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
