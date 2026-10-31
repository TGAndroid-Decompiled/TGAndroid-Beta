package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.gr;
public abstract class w5 extends FrameLayout implements y1 {
    public final v5 f52090a;
    public final FrameLayout f52091b;
    public final TextView f52092c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f52093f;
    public final TextView h;
    public float f52094n;
    public float f52095r;
    public int f52096s;
    public ValueAnimator f52097w;
    public q20 f52098x;
    public q20 f52099y;

    public w5(Context context) {
        super(context);
        v5 v5Var = new v5(this, context);
        this.f52090a = v5Var;
        v5Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f52091b = frameLayout;
        TextView textView = new TextView(context);
        this.f52092c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131744650, null));
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v5Var.addView(frameLayout, w7.b6.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f52016b;

            {
                this.f52016b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52016b.b(-1);
                        return;
                    case 1:
                        this.f52016b.b(0);
                        return;
                    default:
                        this.f52016b.b(1);
                        return;
                }
            }
        });
        w7.e6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextColor(-1);
        textView2.setText(cd.L0(2131744604, null));
        frameLayout2.addView(textView2, w7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v5Var.addView(frameLayout2, w7.b6.s(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f52016b;

            {
                this.f52016b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52016b.b(-1);
                        return;
                    case 1:
                        this.f52016b.b(0);
                        return;
                    default:
                        this.f52016b.b(1);
                        return;
                }
            }
        });
        w7.e6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f52093f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextColor(-1);
        textView3.setText(cd.L0(2131744476, null));
        frameLayout3.addView(textView3, w7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v5Var.addView(frameLayout3, w7.b6.t(-2, -1, 112, 0, 0, 0, 0));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f52016b;

            {
                this.f52016b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52016b.b(-1);
                        return;
                    case 1:
                        this.f52016b.b(0);
                        return;
                    default:
                        this.f52016b.b(1);
                        return;
                }
            }
        });
        w7.e6.a(frameLayout3);
        addView(v5Var, w7.b6.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.f52096s == i10) {
            return;
        }
        this.f52096s = i10;
        ValueAnimator valueAnimator = this.f52097w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52095r, i10);
        this.f52097w = ofFloat;
        ofFloat.addUpdateListener(new c4(3, this));
        this.f52097w.setDuration(320L);
        this.f52097w.setInterpolator(gr.h);
        this.f52097w.start();
    }

    public final void b(int i10) {
        if (this.f52096s != i10) {
            a(i10);
            q20 q20Var = this.f52098x;
            if (q20Var != null) {
                q20Var.a(Integer.valueOf(i10));
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((l7) this).D.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f52090a.invalidate();
    }

    @Override
    public void setInvert(float f7) {
        this.f52094n = f7;
        this.f52092c.setTextColor(i0.b.f(f7, -1, -16777216));
        this.e.setTextColor(i0.b.f(f7, -1, -16777216));
        this.h.setTextColor(i0.b.f(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(q20 q20Var) {
        this.f52098x = q20Var;
    }

    public void setOnSwitchingModeListener(q20 q20Var) {
        this.f52099y = q20Var;
    }
}
