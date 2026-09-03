package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
public abstract class d7 extends FrameLayout implements b2 {
    public final c7 f45235a;
    public final FrameLayout f45236b;
    public final TextView f45237c;
    public final FrameLayout d;
    public final TextView f45238e;
    public final FrameLayout f45239f;
    public final TextView h;
    public float f45240n;
    public float f45241r;
    public int f45242s;
    public ValueAnimator v;
    public Utilities.Callback f45243w;
    public Utilities.Callback f45244x;

    public d7(Context context) {
        super(context);
        c7 c7Var = new c7(this, context);
        this.f45235a = c7Var;
        c7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45236b = frameLayout;
        TextView textView = new TextView(context);
        this.f45237c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        c7Var.addView(frameLayout, k7.c6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final d7 f45027b;

            {
                this.f45027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45027b.b(-1);
                        return;
                    case 1:
                        this.f45027b.b(0);
                        return;
                    default:
                        this.f45027b.b(1);
                        return;
                }
            }
        });
        k7.e6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.f45238e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, k7.c6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        c7Var.addView(frameLayout2, k7.c6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final d7 f45027b;

            {
                this.f45027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45027b.b(-1);
                        return;
                    case 1:
                        this.f45027b.b(0);
                        return;
                    default:
                        this.f45027b.b(1);
                        return;
                }
            }
        });
        k7.e6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f45239f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, k7.c6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        c7Var.addView(frameLayout3, k7.c6.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final d7 f45027b;

            {
                this.f45027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45027b.b(-1);
                        return;
                    case 1:
                        this.f45027b.b(0);
                        return;
                    default:
                        this.f45027b.b(1);
                        return;
                }
            }
        });
        k7.e6.a(frameLayout3);
        addView(c7Var, k7.c6.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f45242s == i10) {
            return;
        }
        this.f45242s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45241r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new oh.f5(this, 21));
        this.v.setDuration(320L);
        this.v.setInterpolator(pr.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f45242s != i10) {
            a(i10);
            Utilities.Callback callback = this.f45243w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((u8) this).f46178y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f45235a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f45240n = f10;
        this.f45237c.setTextColor(i0.a.d(f10, -1, -16777216));
        this.f45238e.setTextColor(i0.a.d(f10, -1, -16777216));
        this.h.setTextColor(i0.a.d(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f45243w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f45244x = callback;
    }
}
