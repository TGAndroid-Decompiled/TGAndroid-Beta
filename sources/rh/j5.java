package rh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;

public final class j5 extends FrameLayout {

    public final d1 f47226a;

    public TL_iv.pageTableCell f47227b;

    public j5(Context context, c6 c6Var) {
        super(context);
        d1 d1Var = new d1(context, c6Var);
        this.f47226a = d1Var;
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setAllowNewlines(true);
        setCompact(false);
        addView(d1Var, z5.e(-1, -2, 51));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        d1 d1Var = this.f47226a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f47227b;
        if (pagetablecell.align_right) {
            i10 = 5;
        } else {
            i10 = pagetablecell.align_center ? 1 : 3;
        }
        if (pagetablecell.valign_middle) {
            i11 = i10 | 16;
        } else {
            i11 = pagetablecell.valign_bottom ? i10 | 80 : i10 | 48;
        }
        layoutParams.gravity = i11;
        d1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f47227b;
        if (pagetablecell2.align_right) {
            i12 = 53;
        } else {
            i12 = pagetablecell2.align_center ? 49 : 51;
        }
        d1Var.setGravity(i12);
        d1Var.setTypeface(null);
    }

    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.f47227b = pagetablecell;
        a();
        CharSequence charSequenceH = x5.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (charSequenceH.length() != 0 && (v5.q(0, charSequenceH.length(), charSequenceH) & 1) == 0) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        d1 d1Var = this.f47226a;
        d1Var.setAutoBold(z10);
        d1Var.setTextSilently(Emoji.replaceEmoji(charSequenceH, d1Var.getPaint().getFontMetricsInt(), false));
        d1Var.invalidateEffects();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d1 d1Var = this.f47226a;
        if (d1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z10 = x8 >= ((float) d1Var.getLeft()) && x8 < ((float) d1Var.getRight());
            boolean z11 = y10 < ((float) d1Var.getTop()) || y10 >= ((float) d1Var.getBottom());
            if (z10 && z11 && d1Var.getHeight() > 0) {
                float left = x8 - d1Var.getLeft();
                float fMax = Math.max(0.0f, Math.min(y10 - d1Var.getTop(), d1Var.getHeight() - 1));
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setLocation(left, fMax);
                boolean zOnTouchEvent = d1Var.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return zOnTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        d1 d1Var = this.f47226a;
        if (z10) {
            d1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            d1Var.setMinHeight(AndroidUtilities.dp(18.0f));
        } else {
            d1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
            d1Var.setMinHeight(AndroidUtilities.dp(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.f47226a.setLocked(z10);
    }
}
