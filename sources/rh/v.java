package rh;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.d81;
public abstract class v extends FrameLayout {
    public ObjectAnimator f43871a;
    public c5.e f43872b;
    public d81 f43873c;
    public Paint d;
    public float e;
    public boolean f43874f;
    public float h;
    public boolean f43875n;
    public pg.b f43876r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f43871a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f43871a.cancel();
            this.f43871a = null;
        }
    }

    public final void b() {
        d81 d81Var = this.f43873c;
        pg.b bVar = this.f43876r;
        if (bVar != null) {
            bVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            d81Var.invalidateOutline();
            d81Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f43874f) {
            this.f43874f = true;
            a();
            d81 d81Var = this.f43873c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d81Var, FrameLayout.TRANSLATION_Y, d81Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f43871a = ofFloat;
            ofFloat.addListener(new ph.j2(this, 8));
            this.f43871a.setDuration(150L);
            this.f43871a.setInterpolator(mr.f27122f);
            this.f43871a.start();
            z zVar = ((df) this).v.f22753i0;
            if (zVar != null) {
                zVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z4) {
        if (this.f43874f) {
            return;
        }
        d81 d81Var = this.f43873c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d81Var, FrameLayout.TRANSLATION_Y, d81Var.getTranslationY(), 0.0f);
        this.f43871a = ofFloat;
        if (z4) {
            ofFloat.setDuration(320L);
            this.f43871a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f43871a.setInterpolator(mr.f27122f);
        }
        this.f43871a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public rl0 getListView() {
        return this.f43873c;
    }

    @Override
    public int getNestedScrollAxes() {
        c5.e eVar = this.f43872b;
        return eVar.f2109b | eVar.f2108a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d81 d81Var = this.f43873c;
        super.onMeasure(i10, i11);
        if (this.f43875n && !this.f43874f) {
            d81Var.setTranslationY(AndroidUtilities.dp(16.0f) + (d81Var.getMeasuredHeight() - d81Var.getPaddingTop()));
            d(true);
            this.f43875n = false;
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
        d81 d81Var = this.f43873c;
        if (!this.f43874f) {
            a();
            float translationY = d81Var.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f11 = translationY - i11;
                iArr[1] = i11;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                d81Var.setTranslationY(f10);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d81 d81Var = this.f43873c;
        if (!this.f43874f) {
            a();
            if (i13 != 0) {
                float translationY = d81Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                d81Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f43872b.f2108a = i10;
        if (this.f43874f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f43874f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f43872b.f2108a = 0;
        boolean z4 = this.f43874f;
        if (z4 || z4) {
            return;
        }
        if (this.f43873c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(pg.b bVar) {
        this.f43876r = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.f43876r.o(AndroidUtilities.dp(5.0f));
        d81 d81Var = this.f43873c;
        if (bVar.f41247i == null) {
            bVar.f41247i = new rl(bVar, 6);
        }
        d81Var.setOutlineProvider(bVar.f41247i);
    }
}
