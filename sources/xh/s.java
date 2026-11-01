package xh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qe;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.mb0;
import org.telegram.ui.ol;
public abstract class s extends FrameLayout {
    public ObjectAnimator f54028a;
    public ac.g f54029b;
    public mb0 f54030c;
    public Paint d;
    public float e;
    public boolean f54031f;
    public float h;
    public boolean f54032n;
    public vg.f f54033r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f54028a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f54028a.cancel();
            this.f54028a = null;
        }
    }

    public final void b() {
        mb0 mb0Var = this.f54030c;
        vg.f fVar = this.f54033r;
        if (fVar != null) {
            fVar.setBounds(0, ((int) this.h) - org.telegram.messenger.i0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.i0.L(5.0f) + getMeasuredHeight());
            mb0Var.invalidateOutline();
            mb0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f54031f) {
            this.f54031f = true;
            a();
            mb0 mb0Var = this.f54030c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mb0Var, FrameLayout.TRANSLATION_Y, mb0Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.i0.L(40.0f));
            this.f54028a = ofFloat;
            ofFloat.addListener(new sg.r(this, 23));
            this.f54028a.setDuration(150L);
            this.f54028a.setInterpolator(gr.f26523f);
            this.f54028a.start();
            w wVar = ((qe) this).f29720w.f23743l0;
            if (wVar != null) {
                wVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f54031f) {
            return;
        }
        mb0 mb0Var = this.f54030c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mb0Var, FrameLayout.TRANSLATION_Y, mb0Var.getTranslationY(), 0.0f);
        this.f54028a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f54028a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f54028a.setInterpolator(gr.f26523f);
        }
        this.f54028a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.i0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public uk0 getListView() {
        return this.f54030c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f54029b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        mb0 mb0Var = this.f54030c;
        super.onMeasure(i10, i11);
        if (this.f54032n && !this.f54031f) {
            mb0Var.setTranslationY(org.telegram.messenger.i0.L(16.0f) + (mb0Var.getMeasuredHeight() - mb0Var.getPaddingTop()));
            d(true);
            this.f54032n = false;
        }
        b();
    }

    @Override
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mb0 mb0Var = this.f54030c;
        if (!this.f54031f) {
            a();
            float translationY = mb0Var.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                mb0Var.setTranslationY(f7);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mb0 mb0Var = this.f54030c;
        if (!this.f54031f) {
            a();
            if (i13 != 0) {
                float translationY = mb0Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                mb0Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f54029b.f385a = i10;
        if (this.f54031f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f54031f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f54029b.f385a = 0;
        boolean z10 = this.f54031f;
        if (z10 || z10) {
            return;
        }
        if (this.f54030c.getTranslationY() > org.telegram.messenger.i0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(vg.f fVar) {
        this.f54033r = fVar;
        fVar.q(org.telegram.messenger.i0.L(22.0f));
        this.f54033r.p(org.telegram.messenger.i0.L(5.0f));
        mb0 mb0Var = this.f54030c;
        if (fVar.Q == null) {
            fVar.Q = new ol(fVar, 8);
        }
        mb0Var.setOutlineProvider(fVar.Q);
    }
}
