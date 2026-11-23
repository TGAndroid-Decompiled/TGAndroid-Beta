package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi.k5;
import c8.na;
import hi.s3;
import java.util.List;
import org.telegram.messenger.f3;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.i71;
public final class m1 extends LinearLayout {
    public final qh0[] f58078a;
    public l1 f58079b;
    public final Paint f58080c;
    public final int d;
    public boolean f58081e;
    public int f58082f;
    public int h;
    public float f58083n;
    public ValueAnimator f58084r;

    public m1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f10;
        float f11;
        List list = sg.h.f57338a;
        this.f58078a = new qh0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f58080c = paint;
        this.f58082f = 1;
        this.h = -1;
        this.f58083n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            List list2 = sg.h.f57338a;
            if (i7 < list2.size() + 2) {
                qh0[] qh0VarArr = this.f58078a;
                if (i7 == 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (i7 == list2.size() + 1) {
                    objArr2 = 1;
                } else {
                    objArr2 = null;
                }
                ImageView imageView = new ImageView(getContext());
                if (objArr != null) {
                    f10 = 0.0f;
                } else {
                    f10 = 8.0f;
                }
                int L = org.telegram.messenger.g0.L(f10);
                int L2 = org.telegram.messenger.g0.L(8.0f);
                if (objArr2 != null) {
                    f11 = 0.0f;
                } else {
                    f11 = 8.0f;
                }
                imageView.setPadding(L, L2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(8.0f));
                imageView.setLayoutParams(na.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                qh0VarArr[i10] = imageView;
                if (i7 == 0) {
                    this.f58078a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final m1 f58019b;

                        {
                            this.f58019b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f58019b.f58079b.a();
                                    return;
                                default:
                                    this.f58019b.f58079b.A();
                                    return;
                            }
                        }
                    });
                } else if (i7 > 0 && i7 <= list2.size()) {
                    sg.h hVar = (sg.h) list2.get(i7 - 1);
                    if (z10 || !(hVar instanceof sg.b)) {
                        this.f58078a[i10].f(hVar.e(), 28, 28, null);
                        this.f58078a[i10].setOnClickListener(new k5(this, i10, hVar, 25));
                    } else {
                        i7++;
                    }
                } else if (i7 == list2.size() + 1) {
                    this.f58078a[i10].setImageResource(2131232047);
                    this.f58078a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final m1 f58019b;

                        {
                            this.f58019b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f58019b.f58079b.a();
                                    return;
                                default:
                                    this.f58019b.f58079b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f58078a[i10]);
                i10++;
                i7++;
            } else {
                return;
            }
        }
    }

    public final void a(int i7) {
        if (i7 >= 0) {
            qh0[] qh0VarArr = this.f58078a;
            if (i7 < qh0VarArr.length) {
                if (this.f58084r == null || this.h != i7) {
                    qh0 qh0Var = qh0VarArr[i7];
                    if (qh0Var != null) {
                        Drawable drawable = qh0Var.getDrawable();
                        if (drawable instanceof nh0) {
                            nh0 nh0Var = (nh0) drawable;
                            nh0Var.M(0);
                            nh0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f58084r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f58082f != i7) {
                        if (this.f58081e) {
                            this.f58081e = false;
                            org.telegram.messenger.g0.P3(qh0VarArr[this.d + 1], 2131232047);
                        }
                        this.h = i7;
                        this.f58083n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f58084r = duration;
                        duration.setInterpolator(kr.f36858f);
                        this.f58084r.addUpdateListener(new s3(this, 27));
                        this.f58084r.addListener(new i71(this, 18));
                        this.f58084r.start();
                    }
                }
            }
        }
    }

    public final void b(int i7) {
        a(i7);
        this.f58079b.x().i(i7 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i7 = 1; i7 < getChildCount() - 1; i7++) {
                View childAt = getChildAt(i7);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f58084r != null) {
                        if (this.h != i7) {
                            a(i7);
                            post(new org.telegram.ui.ActionBar.j1(1, childAt));
                            return true;
                        }
                    } else if (this.f58082f != i7) {
                        a(i7);
                        post(new org.telegram.ui.ActionBar.j1(1, childAt));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qh0 qh0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i7 = this.f58082f;
        qh0[] qh0VarArr = this.f58078a;
        qh0 qh0Var2 = qh0VarArr[i7];
        int i10 = this.h;
        if (i10 != -1) {
            qh0Var = qh0VarArr[i10];
        } else {
            qh0Var = null;
        }
        float f13 = 0.0f;
        if (qh0Var != null) {
            f10 = this.f58083n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? f3.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f14) + (Math.min((qh0Var2.getWidth() - qh0Var2.getPaddingLeft()) - qh0Var2.getPaddingRight(), (qh0Var2.getHeight() - qh0Var2.getPaddingTop()) - qh0Var2.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (qh0Var2.getWidth() / 2.0f) + qh0Var2.getX();
        int i11 = this.f58082f;
        int i12 = this.d;
        if (i11 == i12 + 1) {
            f11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f15 = f11 + width;
        if (qh0Var != null) {
            f12 = (qh0Var.getWidth() / 2.0f) + qh0Var.getX();
        } else {
            f12 = 0.0f;
        }
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f13 = org.telegram.messenger.g0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.g0.T1(f15, f12 + f13, f10), (qh0Var2.getHeight() / 2.0f) + qh0Var2.getY(), L, this.f58080c);
    }

    public void setDelegate(l1 l1Var) {
        this.f58079b = l1Var;
    }

    public void setSelectedIndex(int i7) {
        this.f58082f = i7;
        if (this.f58081e) {
            this.f58081e = false;
            org.telegram.messenger.g0.P3(this.f58078a[this.d + 1], 2131232047);
        }
        invalidate();
    }
}
