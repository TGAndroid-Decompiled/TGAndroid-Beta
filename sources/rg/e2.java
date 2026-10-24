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
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.vq;
public abstract class e2 extends ei.d {
    public final la f45756k0;
    public final RectF f45757l0;
    public int m0;
    public final o2 f45758n0;
    public final g6 f45759o0;
    public int f45760p0;
    public boolean f45761q0;

    public e2(o2 o2Var, ContextThemeWrapper contextThemeWrapper, g6 g6Var, ha haVar) {
        super(contextThemeWrapper, g6Var, false);
        this.f45757l0 = new RectF();
        this.f45760p0 = 8;
        this.f45759o0 = g6Var;
        this.f45758n0 = o2Var;
        this.f45756k0 = new la(haVar, this, 0, true);
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
        RectF rectF = this.f45757l0;
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
        if (this.f45761q0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f7) {
        l2[] l2VarArr;
        o2 o2Var = this.f45758n0;
        super.setAlpha((!o2Var.f46010y || (l2VarArr = o2Var.H) == null || l2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.m0 = 2;
        i(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.m0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        vq vqVar = new vq(R.drawable.media_magic_cut, 0);
        vqVar.setSize(AndroidUtilities.dp(22.0f));
        vqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        vqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        vqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(vqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        i(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.m0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        vq vqVar = new vq(R.drawable.media_button_erase, 0);
        vqVar.setSize(AndroidUtilities.dp(20.0f));
        vqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(vqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        i(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.m0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        vq vqVar = new vq(R.drawable.media_sticker_stroke, 0);
        vqVar.setSize(AndroidUtilities.dp(20.0f));
        vqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(vqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        i(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.f45760p0 = i10;
        setForeground(k6.Z(k6.w0(k6.f21273i6, this.f45759o0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.m0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        vq vqVar = new vq(R.drawable.media_button_restore, 0);
        vqVar.setSize(AndroidUtilities.dp(20.0f));
        vqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(vqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        i(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.m0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.m0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        vq vqVar = new vq(R.drawable.photo_undo2, 0);
        vqVar.setSize(AndroidUtilities.dp(20.0f));
        vqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(vqVar, 0, 1, 0);
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
