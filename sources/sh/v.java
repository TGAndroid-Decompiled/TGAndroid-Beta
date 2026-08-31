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
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.tl0;
public abstract class v extends FrameLayout {
    public ObjectAnimator f47735a;
    public c5.e f47736b;
    public qh.e1 f47737c;
    public Paint d;
    public float f47738e;
    public boolean f47739f;
    public float h;
    public boolean f47740n;
    public qg.b f47741r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f47735a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f47735a.cancel();
            this.f47735a = null;
        }
    }

    public final void b() {
        qh.e1 e1Var = this.f47737c;
        qg.b bVar = this.f47741r;
        if (bVar != null) {
            bVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            e1Var.invalidateOutline();
            e1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f47739f) {
            this.f47739f = true;
            a();
            qh.e1 e1Var = this.f47737c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e1Var, FrameLayout.TRANSLATION_Y, e1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f47735a = ofFloat;
            ofFloat.addListener(new qh.j2(this, 8));
            this.f47735a.setDuration(150L);
            this.f47735a.setInterpolator(pr.f30183f);
            this.f47735a.start();
            z zVar = ((df) this).v.f24620i0;
            if (zVar != null) {
                zVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z4) {
        if (this.f47739f) {
            return;
        }
        qh.e1 e1Var = this.f47737c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e1Var, FrameLayout.TRANSLATION_Y, e1Var.getTranslationY(), 0.0f);
        this.f47735a = ofFloat;
        if (z4) {
            ofFloat.setDuration(320L);
            this.f47735a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f47735a.setInterpolator(pr.f30183f);
        }
        this.f47735a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public tl0 getListView() {
        return this.f47737c;
    }

    @Override
    public int getNestedScrollAxes() {
        c5.e eVar = this.f47736b;
        return eVar.f2269b | eVar.f2268a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qh.e1 e1Var = this.f47737c;
        super.onMeasure(i10, i11);
        if (this.f47740n && !this.f47739f) {
            e1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (e1Var.getMeasuredHeight() - e1Var.getPaddingTop()));
            d(true);
            this.f47740n = false;
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
        qh.e1 e1Var = this.f47737c;
        if (!this.f47739f) {
            a();
            float translationY = e1Var.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f11 = translationY - i11;
                iArr[1] = i11;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                e1Var.setTranslationY(f10);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        qh.e1 e1Var = this.f47737c;
        if (!this.f47739f) {
            a();
            if (i13 != 0) {
                float translationY = e1Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                e1Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f47736b.f2268a = i10;
        if (this.f47739f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f47739f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f47736b.f2268a = 0;
        boolean z4 = this.f47739f;
        if (z4 || z4) {
            return;
        }
        if (this.f47737c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(qg.b bVar) {
        this.f47741r = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.f47741r.o(AndroidUtilities.dp(5.0f));
        qh.e1 e1Var = this.f47737c;
        if (bVar.f44855i == null) {
            bVar.f44855i = new tl(bVar, 6);
        }
        e1Var.setOutlineProvider(bVar.f44855i);
    }
}
