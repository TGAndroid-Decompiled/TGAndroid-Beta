package sh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.c81;
public abstract class v extends FrameLayout {
    public ObjectAnimator f47771a;
    public c5.e f47772b;
    public c81 f47773c;
    public Paint d;
    public float f47774e;
    public boolean f47775f;
    public float h;
    public boolean f47776n;
    public qg.b f47777r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f47771a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f47771a.cancel();
            this.f47771a = null;
        }
    }

    public final void b() {
        c81 c81Var = this.f47773c;
        qg.b bVar = this.f47777r;
        if (bVar != null) {
            bVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            c81Var.invalidateOutline();
            c81Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f47775f) {
            this.f47775f = true;
            a();
            c81 c81Var = this.f47773c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c81Var, FrameLayout.TRANSLATION_Y, c81Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f47771a = ofFloat;
            ofFloat.addListener(new qh.i2(this, 8));
            this.f47771a.setDuration(150L);
            this.f47771a.setInterpolator(pr.f30168f);
            this.f47771a.start();
            z zVar = ((df) this).v.f24622i0;
            if (zVar != null) {
                zVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z4) {
        if (this.f47775f) {
            return;
        }
        c81 c81Var = this.f47773c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c81Var, FrameLayout.TRANSLATION_Y, c81Var.getTranslationY(), 0.0f);
        this.f47771a = ofFloat;
        if (z4) {
            ofFloat.setDuration(320L);
            this.f47771a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f47771a.setInterpolator(pr.f30168f);
        }
        this.f47771a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public sl0 getListView() {
        return this.f47773c;
    }

    @Override
    public int getNestedScrollAxes() {
        c5.e eVar = this.f47772b;
        return eVar.f2269b | eVar.f2268a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c81 c81Var = this.f47773c;
        super.onMeasure(i10, i11);
        if (this.f47776n && !this.f47775f) {
            c81Var.setTranslationY(AndroidUtilities.dp(16.0f) + (c81Var.getMeasuredHeight() - c81Var.getPaddingTop()));
            d(true);
            this.f47776n = false;
        }
        b();
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        c81 c81Var = this.f47773c;
        if (!this.f47775f) {
            a();
            float translationY = c81Var.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f11 = translationY - i11;
                iArr[1] = i11;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                c81Var.setTranslationY(f10);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        c81 c81Var = this.f47773c;
        if (!this.f47775f) {
            a();
            if (i13 != 0) {
                float translationY = c81Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                c81Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f47772b.f2268a = i10;
        if (this.f47775f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f47775f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f47772b.f2268a = 0;
        boolean z4 = this.f47775f;
        if (z4 || z4) {
            return;
        }
        if (this.f47773c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(qg.b bVar) {
        this.f47777r = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.f47777r.o(AndroidUtilities.dp(5.0f));
        c81 c81Var = this.f47773c;
        if (bVar.f44886i == null) {
            bVar.f44886i = new tl(bVar, 6);
        }
        c81Var.setOutlineProvider(bVar.f44886i);
    }
}
