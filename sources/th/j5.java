package th;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
public final class j5 extends FrameLayout {
    public final d1 f48526a;
    public TL_iv.pageTableCell f48527b;

    public j5(Context context, c6 c6Var) {
        super(context);
        d1 d1Var = new d1(context, c6Var);
        this.f48526a = d1Var;
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setAllowNewlines(true);
        setCompact(false);
        addView(d1Var, f6.e(-1, -2, 51));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        d1 d1Var = this.f48526a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f48527b;
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
        TL_iv.pageTableCell pagetablecell2 = this.f48527b;
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
        throw new UnsupportedOperationException("Method not decompiled: th.j5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        d1 d1Var = this.f48526a;
        if (d1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            boolean z11 = false;
            if (x4 >= d1Var.getLeft() && x4 < d1Var.getRight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = (y8 < ((float) d1Var.getTop()) || y8 >= ((float) d1Var.getBottom())) ? true : true;
            if (z10 && z11 && d1Var.getHeight() > 0) {
                float left = x4 - d1Var.getLeft();
                float max = Math.max(0.0f, Math.min(y8 - d1Var.getTop(), d1Var.getHeight() - 1));
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
        d1 d1Var = this.f48526a;
        if (z10) {
            d1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            d1Var.setMinHeight(AndroidUtilities.dp(18.0f));
            return;
        }
        d1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
        d1Var.setMinHeight(AndroidUtilities.dp(36.0f));
    }

    public void setLocked(boolean z10) {
        this.f48526a.setLocked(z10);
    }
}
