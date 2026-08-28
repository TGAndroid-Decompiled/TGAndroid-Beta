package qh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
public final class i5 extends FrameLayout {
    public final d1 f46448a;
    public TL_iv.pageTableCell f46449b;

    public i5(Context context, b6 b6Var) {
        super(context);
        d1 d1Var = new d1(context, b6Var);
        this.f46448a = d1Var;
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setAllowNewlines(true);
        setCompact(false);
        addView(d1Var, e6.e(-1, -2, 51));
    }

    public final void a() {
        int i9;
        int i10;
        int i11;
        d1 d1Var = this.f46448a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f46449b;
        if (pagetablecell.align_right) {
            i9 = 5;
        } else if (pagetablecell.align_center) {
            i9 = 1;
        } else {
            i9 = 3;
        }
        if (pagetablecell.valign_middle) {
            i10 = i9 | 16;
        } else if (pagetablecell.valign_bottom) {
            i10 = i9 | 80;
        } else {
            i10 = i9 | 48;
        }
        layoutParams.gravity = i10;
        d1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f46449b;
        if (pagetablecell2.align_right) {
            i11 = 53;
        } else if (pagetablecell2.align_center) {
            i11 = 49;
        } else {
            i11 = 51;
        }
        d1Var.setGravity(i11);
        d1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r4) {
        throw new UnsupportedOperationException("Method not decompiled: qh.i5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        d1 d1Var = this.f46448a;
        if (d1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z11 = false;
            if (x10 >= d1Var.getLeft() && x10 < d1Var.getRight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = (y10 < ((float) d1Var.getTop()) || y10 >= ((float) d1Var.getBottom())) ? true : true;
            if (z10 && z11 && d1Var.getHeight() > 0) {
                float left = x10 - d1Var.getLeft();
                float max = Math.max(0.0f, Math.min(y10 - d1Var.getTop(), d1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(left, max);
                boolean onTouchEvent = d1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        d1 d1Var = this.f46448a;
        if (z10) {
            d1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            d1Var.setMinHeight(AndroidUtilities.dp(18.0f));
            return;
        }
        d1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
        d1Var.setMinHeight(AndroidUtilities.dp(36.0f));
    }

    public void setLocked(boolean z10) {
        this.f46448a.setLocked(z10);
    }
}
