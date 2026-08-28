package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yk extends FrameLayout {
    public float f44891a;
    public float f44892b;
    public final qn f44893c;

    public yk(qn qnVar, Activity activity) {
        super(activity);
        this.f44893c = qnVar;
        setOnLongClickListener(new u(this, 2));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        qn qnVar = this.f44893c;
        if (view == qnVar.f42105v2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = qnVar.f42155z2;
        if (view != h5VarArr[0] && view != h5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == qnVar.f42105v2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - AndroidUtilities.dp(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        qn qnVar = this.f44893c;
        if (qnVar.f42116w2) {
            int i11 = 0;
            while (true) {
                AnimatorSet[] animatorSetArr = qnVar.D2;
                if (i11 < animatorSetArr.length) {
                    AnimatorSet animatorSet = animatorSetArr[i11];
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    i11++;
                } else {
                    qnVar.f42116w2 = false;
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f44891a = motionEvent.getY();
        int action = motionEvent.getAction();
        qn qnVar = this.f44893c;
        if (action == 1) {
            qnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f44892b - this.f44891a;
            qnVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f44892b = this.f44891a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
