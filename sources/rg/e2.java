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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.pa;
public abstract class e2 extends di.d {
    public final pa f44003h0;
    public final RectF f44004i0;
    public int f44005j0;
    public final p2 f44006k0;
    public final c6 f44007l0;
    public int m0;
    public boolean f44008n0;

    public e2(p2 p2Var, ContextThemeWrapper contextThemeWrapper, c6 c6Var, la laVar) {
        super(contextThemeWrapper, c6Var, false);
        this.f44004i0 = new RectF();
        this.m0 = 8;
        this.f44007l0 = c6Var;
        this.f44006k0 = p2Var;
        this.f44003h0 = new pa(laVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(AndroidUtilities.bold());
        removeView(this.f6763r);
        setForeground(g6.Z(g6.m1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.f6757d0;
        RectF rectF = this.f44004i0;
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
        if (this.f44008n0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f7) {
        m2[] m2VarArr;
        p2 p2Var = this.f44006k0;
        super.setAlpha((!p2Var.f44237y || (m2VarArr = p2Var.H) == null || m2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.f44005j0 = 2;
        g(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f44005j0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        br brVar = new br(R.drawable.media_magic_cut, 0);
        brVar.setSize(AndroidUtilities.dp(22.0f));
        brVar.setTranslateX(AndroidUtilities.dp(1.0f));
        brVar.setTranslateY(AndroidUtilities.dp(2.0f));
        brVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(brVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f44005j0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        br brVar = new br(R.drawable.media_button_erase, 0);
        brVar.setSize(AndroidUtilities.dp(20.0f));
        brVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(brVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f44005j0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        br brVar = new br(R.drawable.media_sticker_stroke, 0);
        brVar.setSize(AndroidUtilities.dp(20.0f));
        brVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(brVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z10, true);
    }

    public void setRad(int i10) {
        this.m0 = i10;
        setForeground(g6.Z(g6.w0(g6.f19690i6, this.f44007l0), i10, i10));
    }

    public void setRestoreState(boolean z10) {
        this.f44005j0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        br brVar = new br(R.drawable.media_button_restore, 0);
        brVar.setSize(AndroidUtilities.dp(20.0f));
        brVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(brVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f44005j0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f44005j0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        br brVar = new br(R.drawable.photo_undo2, 0);
        brVar.setSize(AndroidUtilities.dp(20.0f));
        brVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(brVar, 0, 1, 0);
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
