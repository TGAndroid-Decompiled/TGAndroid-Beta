package vh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
public final class l5 extends FrameLayout {
    public final d1 f46006a;
    public TL_iv.pageTableCell f46007b;

    public l5(Context context, f6 f6Var) {
        super(context);
        d1 d1Var = new d1(context, f6Var);
        this.f46006a = d1Var;
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setAllowNewlines(true);
        setCompact(false);
        addView(d1Var, b6.e(-1, -2, 51));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        d1 d1Var = this.f46006a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f46007b;
        if (pagetablecell.align_right) {
            i10 = 5;
        } else if (pagetablecell.align_center) {
            i10 = 1;
        } else {
            i10 = 3;
        }
        if (pagetablecell.valign_middle) {
            i11 = i10 | 16;
        } else if (pagetablecell.valign_bottom) {
            i11 = i10 | 80;
        } else {
            i11 = i10 | 48;
        }
        layoutParams.gravity = i11;
        d1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f46007b;
        if (pagetablecell2.align_right) {
            i12 = 53;
        } else if (pagetablecell2.align_center) {
            i12 = 49;
        } else {
            i12 = 51;
        }
        d1Var.setGravity(i12);
        d1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r4) {
        throw new UnsupportedOperationException("Method not decompiled: vh.l5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        d1 d1Var = this.f46006a;
        if (d1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z10 = false;
            if (x10 >= d1Var.getLeft() && x10 < d1Var.getRight()) {
                z4 = true;
            } else {
                z4 = false;
            }
            z10 = (y10 < ((float) d1Var.getTop()) || y10 >= ((float) d1Var.getBottom())) ? true : true;
            if (z4 && z10 && d1Var.getHeight() > 0) {
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

    public void setCompact(boolean z4) {
        d1 d1Var = this.f46006a;
        if (z4) {
            d1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            d1Var.setMinHeight(AndroidUtilities.dp(18.0f));
            return;
        }
        d1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
        d1Var.setMinHeight(AndroidUtilities.dp(36.0f));
    }

    public void setLocked(boolean z4) {
        this.f46006a.setLocked(z4);
    }
}
