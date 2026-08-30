package rh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.sl0;
public abstract class w extends FrameLayout {
    public ObjectAnimator f43819a;
    public c5.e f43820b;
    public ph.e1 f43821c;
    public Paint d;
    public float e;
    public boolean f43822f;
    public float h;
    public boolean f43823n;
    public pg.b f43824r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f43819a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f43819a.cancel();
            this.f43819a = null;
        }
    }

    public final void b() {
        ph.e1 e1Var = this.f43821c;
        pg.b bVar = this.f43824r;
        if (bVar != null) {
            bVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            e1Var.invalidateOutline();
            e1Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f43822f) {
            this.f43822f = true;
            a();
            ph.e1 e1Var = this.f43821c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e1Var, FrameLayout.TRANSLATION_Y, e1Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f43819a = ofFloat;
            ofFloat.addListener(new ph.j2(this, 8));
            this.f43819a.setDuration(150L);
            this.f43819a.setInterpolator(nr.f27346f);
            this.f43819a.start();
            a0 a0Var = ((df) this).v.f22780i0;
            if (a0Var != null) {
                a0Var.setOpened(false);
            }
        }
    }

    public final void d(boolean z4) {
        if (this.f43822f) {
            return;
        }
        ph.e1 e1Var = this.f43821c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e1Var, FrameLayout.TRANSLATION_Y, e1Var.getTranslationY(), 0.0f);
        this.f43819a = ofFloat;
        if (z4) {
            ofFloat.setDuration(320L);
            this.f43819a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f43819a.setInterpolator(nr.f27346f);
        }
        this.f43819a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public sl0 getListView() {
        return this.f43821c;
    }

    @Override
    public int getNestedScrollAxes() {
        c5.e eVar = this.f43820b;
        return eVar.f2086b | eVar.f2085a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ph.e1 e1Var = this.f43821c;
        super.onMeasure(i10, i11);
        if (this.f43823n && !this.f43822f) {
            e1Var.setTranslationY(AndroidUtilities.dp(16.0f) + (e1Var.getMeasuredHeight() - e1Var.getPaddingTop()));
            d(true);
            this.f43823n = false;
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
        ph.e1 e1Var = this.f43821c;
        if (!this.f43822f) {
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
        ph.e1 e1Var = this.f43821c;
        if (!this.f43822f) {
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
        this.f43820b.f2085a = i10;
        if (this.f43822f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f43822f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f43820b.f2085a = 0;
        boolean z4 = this.f43822f;
        if (z4 || z4) {
            return;
        }
        if (this.f43821c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(pg.b bVar) {
        this.f43824r = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.f43824r.o(AndroidUtilities.dp(5.0f));
        ph.e1 e1Var = this.f43821c;
        if (bVar.f41220i == null) {
            bVar.f41220i = new sl(bVar, 6);
        }
        e1Var.setOutlineProvider(bVar.f41220i);
    }
}
