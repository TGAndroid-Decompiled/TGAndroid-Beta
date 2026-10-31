package xh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qe;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.nb0;
import org.telegram.ui.ol;
public abstract class s extends FrameLayout {
    public ObjectAnimator f54010a;
    public ac.g f54011b;
    public nb0 f54012c;
    public Paint d;
    public float e;
    public boolean f54013f;
    public float h;
    public boolean f54014n;
    public vg.f f54015r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f54010a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f54010a.cancel();
            this.f54010a = null;
        }
    }

    public final void b() {
        nb0 nb0Var = this.f54012c;
        vg.f fVar = this.f54015r;
        if (fVar != null) {
            fVar.setBounds(0, ((int) this.h) - org.telegram.messenger.i0.L(25.0f), getMeasuredWidth(), org.telegram.messenger.i0.L(5.0f) + getMeasuredHeight());
            nb0Var.invalidateOutline();
            nb0Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f54013f) {
            this.f54013f = true;
            a();
            nb0 nb0Var = this.f54012c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nb0Var, FrameLayout.TRANSLATION_Y, nb0Var.getTranslationY(), (getMeasuredHeight() - this.h) + org.telegram.messenger.i0.L(40.0f));
            this.f54010a = ofFloat;
            ofFloat.addListener(new sg.r(this, 23));
            this.f54010a.setDuration(150L);
            this.f54010a.setInterpolator(gr.f26495f);
            this.f54010a.start();
            w wVar = ((qe) this).f29639w.f23742l0;
            if (wVar != null) {
                wVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f54013f) {
            return;
        }
        nb0 nb0Var = this.f54012c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nb0Var, FrameLayout.TRANSLATION_Y, nb0Var.getTranslationY(), 0.0f);
        this.f54010a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f54010a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f54010a.setInterpolator(gr.f26495f);
        }
        this.f54010a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - org.telegram.messenger.i0.L(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public tk0 getListView() {
        return this.f54012c;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f54011b.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        nb0 nb0Var = this.f54012c;
        super.onMeasure(i10, i11);
        if (this.f54014n && !this.f54013f) {
            nb0Var.setTranslationY(org.telegram.messenger.i0.L(16.0f) + (nb0Var.getMeasuredHeight() - nb0Var.getPaddingTop()));
            d(true);
            this.f54014n = false;
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
        nb0 nb0Var = this.f54012c;
        if (!this.f54013f) {
            a();
            float translationY = nb0Var.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                nb0Var.setTranslationY(f7);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        nb0 nb0Var = this.f54012c;
        if (!this.f54013f) {
            a();
            if (i13 != 0) {
                float translationY = nb0Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                nb0Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f54011b.f385a = i10;
        if (this.f54013f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f54013f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f54011b.f385a = 0;
        boolean z10 = this.f54013f;
        if (z10 || z10) {
            return;
        }
        if (this.f54012c.getTranslationY() > org.telegram.messenger.i0.L(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(vg.f fVar) {
        this.f54015r = fVar;
        fVar.q(org.telegram.messenger.i0.L(22.0f));
        this.f54015r.p(org.telegram.messenger.i0.L(5.0f));
        nb0 nb0Var = this.f54012c;
        if (fVar.N == null) {
            fVar.N = new ol(fVar, 8);
        }
        nb0Var.setOutlineProvider(fVar.N);
    }
}
