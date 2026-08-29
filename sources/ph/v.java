package ph;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.cc1;
import org.telegram.ui.i71;
public abstract class v extends FrameLayout {
    public ObjectAnimator f46110a;
    public a5.e f46111b;
    public i71 f46112c;
    public Paint d;
    public float f46113e;
    public boolean f46114f;
    public float h;
    public boolean f46115n;
    public ng.d f46116r;

    public final void a() {
        ObjectAnimator objectAnimator = this.f46110a;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f46110a.cancel();
            this.f46110a = null;
        }
    }

    public final void b() {
        i71 i71Var = this.f46112c;
        ng.d dVar = this.f46116r;
        if (dVar != null) {
            dVar.setBounds(0, ((int) this.h) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            i71Var.invalidateOutline();
            i71Var.invalidate();
        }
    }

    public final void c() {
        if (!this.f46114f) {
            this.f46114f = true;
            a();
            i71 i71Var = this.f46112c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i71Var, FrameLayout.TRANSLATION_Y, i71Var.getTranslationY(), (getMeasuredHeight() - this.h) + AndroidUtilities.dp(40.0f));
            this.f46110a = ofFloat;
            ofFloat.addListener(new cc1(this, 7));
            this.f46110a.setDuration(150L);
            this.f46110a.setInterpolator(jr.f29800f);
            this.f46110a.start();
            z zVar = ((gf) this).v.f26131h0;
            if (zVar != null) {
                zVar.setOpened(false);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f46114f) {
            return;
        }
        i71 i71Var = this.f46112c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i71Var, FrameLayout.TRANSLATION_Y, i71Var.getTranslationY(), 0.0f);
        this.f46110a = ofFloat;
        if (z10) {
            ofFloat.setDuration(320L);
            this.f46110a.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            ofFloat.setDuration(150L);
            this.f46110a.setInterpolator(jr.f29800f);
        }
        this.f46110a.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.h - AndroidUtilities.dp(24.0f)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public jl0 getListView() {
        return this.f46112c;
    }

    @Override
    public int getNestedScrollAxes() {
        a5.e eVar = this.f46111b;
        return eVar.f166b | eVar.f165a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        i71 i71Var = this.f46112c;
        super.onMeasure(i10, i11);
        if (this.f46115n && !this.f46114f) {
            i71Var.setTranslationY(AndroidUtilities.dp(16.0f) + (i71Var.getMeasuredHeight() - i71Var.getPaddingTop()));
            d(true);
            this.f46115n = false;
        }
        b();
    }

    @Override
    public final boolean onNestedFling(View view, float f9, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        i71 i71Var = this.f46112c;
        if (!this.f46114f) {
            a();
            float translationY = i71Var.getTranslationY();
            float f9 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f9 = f10;
                }
                i71Var.setTranslationY(f9);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        i71 i71Var = this.f46112c;
        if (!this.f46114f) {
            a();
            if (i13 != 0) {
                float translationY = i71Var.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                i71Var.setTranslationY(translationY);
                invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f46111b.f165a = i10;
        if (this.f46114f) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!this.f46114f && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f46111b.f165a = 0;
        boolean z10 = this.f46114f;
        if (z10 || z10) {
            return;
        }
        if (this.f46112c.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            c();
        } else {
            d(false);
        }
    }

    public void setBackgroundDrawable(ng.d dVar) {
        this.f46116r = dVar;
        dVar.p(AndroidUtilities.dp(22.0f));
        this.f46116r.o(AndroidUtilities.dp(5.0f));
        i71 i71Var = this.f46112c;
        if (dVar.f17345i == null) {
            dVar.f17345i = new ng.b(dVar, 0);
        }
        i71Var.setOutlineProvider(dVar.f17345i);
    }
}
