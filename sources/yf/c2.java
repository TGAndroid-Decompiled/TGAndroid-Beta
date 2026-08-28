package yf;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fa;
public abstract class c2 extends kh.d {
    public final fa f49775d0;
    public final RectF f49776e0;
    public int f49777f0;
    public final m2 f49778g0;
    public final b6 f49779h0;
    public int f49780i0;
    public boolean f49781j0;

    public c2(m2 m2Var, ContextThemeWrapper contextThemeWrapper, b6 b6Var, ba baVar) {
        super(contextThemeWrapper, b6Var, false);
        this.f49776e0 = new RectF();
        this.f49780i0 = 8;
        this.f49779h0 = b6Var;
        this.f49778g0 = m2Var;
        this.f49775d0 = new fa(baVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.u(AndroidUtilities.bold());
        removeView(this.f15072r);
        setForeground(f6.Y(f6.l1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10 = this.W;
        RectF rectF = this.f49776e0;
        if (z10) {
            float d = this.d.d() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - d) / 2.0f, 0.0f, (getMeasuredWidth() + d) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.f49781j0) {
            i9 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.d()), 1073741824);
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public void setAlpha(float f10) {
        j2[] j2VarArr;
        m2 m2Var = this.f49778g0;
        super.setAlpha((!m2Var.f50004y || (j2VarArr = m2Var.D) == null || j2VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z10) {
        this.f49777f0 = 2;
        g(LocaleController.getString(R.string.Cancel), z10, true);
    }

    public void setCutOutState(boolean z10) {
        this.f49777f0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.media_magic_cut, 0);
        eqVar.setSize(AndroidUtilities.dp(22.0f));
        eqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        eqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        eqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z10, true);
    }

    public void setEraseState(boolean z10) {
        this.f49777f0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.media_button_erase, 0);
        eqVar.setSize(AndroidUtilities.dp(20.0f));
        eqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z10, true);
    }

    public void setOutlineState(boolean z10) {
        this.f49777f0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.media_sticker_stroke, 0);
        eqVar.setSize(AndroidUtilities.dp(20.0f));
        eqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z10, true);
    }

    public void setRad(int i9) {
        this.f49780i0 = i9;
        setForeground(f6.Y(f6.v0(f6.f23092i6, this.f49779h0), i9, i9));
    }

    public void setRestoreState(boolean z10) {
        this.f49777f0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.media_button_restore, 0);
        eqVar.setSize(AndroidUtilities.dp(20.0f));
        eqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z10, true);
    }

    public void setUndoCutState(boolean z10) {
        this.f49777f0 = 1;
    }

    public void setUndoState(boolean z10) {
        this.f49777f0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        eq eqVar = new eq(R.drawable.photo_undo2, 0);
        eqVar.setSize(AndroidUtilities.dp(20.0f));
        eqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndo));
        g(spannableStringBuilder, z10, true);
    }

    @Override
    public void setVisibility(int i9) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i9);
        }
    }
}
