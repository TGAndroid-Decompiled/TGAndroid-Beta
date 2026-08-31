package wh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
public final class l5 extends FrameLayout {
    public final e1 f49866a;
    public TL_iv.pageTableCell f49867b;

    public l5(Context context, g6 g6Var) {
        super(context);
        e1 e1Var = new e1(context, g6Var);
        this.f49866a = e1Var;
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setAllowNewlines(true);
        setCompact(false);
        addView(e1Var, c6.e(-1, -2, 51));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        e1 e1Var = this.f49866a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.f49867b;
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
        e1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.f49867b;
        if (pagetablecell2.align_right) {
            i12 = 53;
        } else if (pagetablecell2.align_center) {
            i12 = 49;
        } else {
            i12 = 51;
        }
        e1Var.setGravity(i12);
        e1Var.setTypeface(null);
    }

    public final void b(org.telegram.tgnet.tl.TL_iv.pageTableCell r4) {
        throw new UnsupportedOperationException("Method not decompiled: wh.l5.b(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        e1 e1Var = this.f49866a;
        if (e1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z10 = false;
            if (x10 >= e1Var.getLeft() && x10 < e1Var.getRight()) {
                z4 = true;
            } else {
                z4 = false;
            }
            z10 = (y10 < ((float) e1Var.getTop()) || y10 >= ((float) e1Var.getBottom())) ? true : true;
            if (z4 && z10 && e1Var.getHeight() > 0) {
                float left = x10 - e1Var.getLeft();
                float max = Math.max(0.0f, Math.min(y10 - e1Var.getTop(), e1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(left, max);
                boolean onTouchEvent = e1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z4) {
        e1 e1Var = this.f49866a;
        if (z4) {
            e1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            e1Var.setMinHeight(AndroidUtilities.dp(18.0f));
            return;
        }
        e1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
        e1Var.setMinHeight(AndroidUtilities.dp(36.0f));
    }

    public void setLocked(boolean z4) {
        this.f49866a.setLocked(z4);
    }
}
