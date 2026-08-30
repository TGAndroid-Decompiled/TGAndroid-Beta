package ph;

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
import org.telegram.ui.Components.nr;
public abstract class g7 extends FrameLayout implements c2 {
    public final f7 f41687a;
    public final FrameLayout f41688b;
    public final TextView f41689c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f41690f;
    public final TextView h;
    public float f41691n;
    public float f41692r;
    public int f41693s;
    public ValueAnimator v;
    public Utilities.Callback f41694w;
    public Utilities.Callback f41695x;

    public g7(Context context) {
        super(context);
        f7 f7Var = new f7(this, context);
        this.f41687a = f7Var;
        f7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41688b = frameLayout;
        TextView textView = new TextView(context);
        this.f41689c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        f7Var.addView(frameLayout, k7.b6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final g7 f41579b;

            {
                this.f41579b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41579b.b(-1);
                        return;
                    case 1:
                        this.f41579b.b(0);
                        return;
                    default:
                        this.f41579b.b(1);
                        return;
                }
            }
        });
        k7.d6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, k7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        f7Var.addView(frameLayout2, k7.b6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final g7 f41579b;

            {
                this.f41579b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41579b.b(-1);
                        return;
                    case 1:
                        this.f41579b.b(0);
                        return;
                    default:
                        this.f41579b.b(1);
                        return;
                }
            }
        });
        k7.d6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41690f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, k7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        f7Var.addView(frameLayout3, k7.b6.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final g7 f41579b;

            {
                this.f41579b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f41579b.b(-1);
                        return;
                    case 1:
                        this.f41579b.b(0);
                        return;
                    default:
                        this.f41579b.b(1);
                        return;
                }
            }
        });
        k7.d6.a(frameLayout3);
        addView(f7Var, k7.b6.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f41693s == i10) {
            return;
        }
        this.f41693s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41692r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 21));
        this.v.setDuration(320L);
        this.v.setInterpolator(nr.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.f41693s != i10) {
            a(i10);
            Utilities.Callback callback = this.f41694w;
            if (callback != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((x8) this).f42566y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f41687a.invalidate();
    }

    @Override
    public void setInvert(float f10) {
        this.f41691n = f10;
        this.f41689c.setTextColor(i0.a.d(f10, -1, -16777216));
        this.e.setTextColor(i0.a.d(f10, -1, -16777216));
        this.h.setTextColor(i0.a.d(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.f41694w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.f41695x = callback;
    }
}
