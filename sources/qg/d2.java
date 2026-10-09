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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.qa;
public abstract class d2 extends ci.d {
    public final qa f46218h0;
    public final RectF f46219i0;
    public int f46220j0;
    public final o2 f46221k0;
    public final e6 f46222l0;
    public int m0;
    public boolean f46223n0;

    public d2(o2 o2Var, ContextThemeWrapper contextThemeWrapper, e6 e6Var, ma maVar) {
        super(contextThemeWrapper, e6Var, false);
        this.f46219i0 = new RectF();
        this.m0 = 8;
        this.f46222l0 = e6Var;
        this.f46221k0 = o2Var;
        this.f46218h0 = new qa(maVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(AndroidUtilities.bold());
        removeView(this.f4874r);
        setForeground(i6.Z(i6.m1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f4867d0;
        RectF rectF = this.f46219i0;
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
        if (this.f46223n0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f7) {
        l2[] l2VarArr;
        o2 o2Var = this.f46221k0;
        super.setAlpha((!o2Var.f46497y || (l2VarArr = o2Var.H) == null || l2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.f46220j0 = 2;
        g(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f46220j0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        er erVar = new er(R.drawable.media_magic_cut, 0);
        erVar.setSize(AndroidUtilities.dp(22.0f));
        erVar.setTranslateX(AndroidUtilities.dp(1.0f));
        erVar.setTranslateY(AndroidUtilities.dp(2.0f));
        erVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(erVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f46220j0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        er erVar = new er(R.drawable.media_button_erase, 0);
        erVar.setSize(AndroidUtilities.dp(20.0f));
        erVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(erVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f46220j0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        er erVar = new er(R.drawable.media_sticker_stroke, 0);
        erVar.setSize(AndroidUtilities.dp(20.0f));
        erVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(erVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.m0 = i10;
        setForeground(i6.Z(i6.w0(i6.f20888i6, this.f46222l0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.f46220j0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        er erVar = new er(R.drawable.media_button_restore, 0);
        erVar.setSize(AndroidUtilities.dp(20.0f));
        erVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(erVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f46220j0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f46220j0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        er erVar = new er(R.drawable.photo_undo2, 0);
        erVar.setSize(AndroidUtilities.dp(20.0f));
        erVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(erVar, 0, 1, 0);
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
