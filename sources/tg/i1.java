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
import hi.j3;
import java.util.List;
import org.telegram.messenger.f3;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.k71;
public final class i1 extends LinearLayout {
    public final rh0[] f57926a;
    public h1 f57927b;
    public final Paint f57928c;
    public final int d;
    public boolean f57929e;
    public int f57930f;
    public int h;
    public float f57931n;
    public ValueAnimator f57932r;

    public i1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f10;
        float f11;
        List list = sg.h.f57224a;
        this.f57926a = new rh0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f57928c = paint;
        this.f57930f = 1;
        this.h = -1;
        this.f57931n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            List list2 = sg.h.f57224a;
            if (i7 < list2.size() + 2) {
                rh0[] rh0VarArr = this.f57926a;
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
                rh0VarArr[i10] = imageView;
                if (i7 == 0) {
                    this.f57926a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final i1 f57864b;

                        {
                            this.f57864b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f57864b.f57927b.a();
                                    return;
                                default:
                                    this.f57864b.f57927b.A();
                                    return;
                            }
                        }
                    });
                } else if (i7 > 0 && i7 <= list2.size()) {
                    sg.h hVar = (sg.h) list2.get(i7 - 1);
                    if (z10 || !(hVar instanceof sg.b)) {
                        this.f57926a[i10].f(hVar.e(), 28, 28, null);
                        this.f57926a[i10].setOnClickListener(new k5(this, i10, hVar, 25));
                    } else {
                        i7++;
                    }
                } else if (i7 == list2.size() + 1) {
                    this.f57926a[i10].setImageResource(2131232044);
                    this.f57926a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final i1 f57864b;

                        {
                            this.f57864b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f57864b.f57927b.a();
                                    return;
                                default:
                                    this.f57864b.f57927b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f57926a[i10]);
                i10++;
                i7++;
            } else {
                return;
            }
        }
    }

    public final void a(int i7) {
        if (i7 >= 0) {
            rh0[] rh0VarArr = this.f57926a;
            if (i7 < rh0VarArr.length) {
                if (this.f57932r == null || this.h != i7) {
                    rh0 rh0Var = rh0VarArr[i7];
                    if (rh0Var != null) {
                        Drawable drawable = rh0Var.getDrawable();
                        if (drawable instanceof oh0) {
                            oh0 oh0Var = (oh0) drawable;
                            oh0Var.M(0);
                            oh0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f57932r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f57930f != i7) {
                        if (this.f57929e) {
                            this.f57929e = false;
                            org.telegram.messenger.g0.P3(rh0VarArr[this.d + 1], 2131232044);
                        }
                        this.h = i7;
                        this.f57931n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f57932r = duration;
                        duration.setInterpolator(nr.f37917f);
                        this.f57932r.addUpdateListener(new j3(this, 27));
                        this.f57932r.addListener(new k71(this, 18));
                        this.f57932r.start();
                    }
                }
            }
        }
    }

    public final void b(int i7) {
        a(i7);
        this.f57927b.x().i(i7 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i7 = 1; i7 < getChildCount() - 1; i7++) {
                View childAt = getChildAt(i7);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f57932r != null) {
                        if (this.h != i7) {
                            a(i7);
                            post(new org.telegram.ui.ActionBar.j1(1, childAt));
                            return true;
                        }
                    } else if (this.f57930f != i7) {
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
        rh0 rh0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i7 = this.f57930f;
        rh0[] rh0VarArr = this.f57926a;
        rh0 rh0Var2 = rh0VarArr[i7];
        int i10 = this.h;
        if (i10 != -1) {
            rh0Var = rh0VarArr[i10];
        } else {
            rh0Var = null;
        }
        float f13 = 0.0f;
        if (rh0Var != null) {
            f10 = this.f57931n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? f3.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f14) + (Math.min((rh0Var2.getWidth() - rh0Var2.getPaddingLeft()) - rh0Var2.getPaddingRight(), (rh0Var2.getHeight() - rh0Var2.getPaddingTop()) - rh0Var2.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (rh0Var2.getWidth() / 2.0f) + rh0Var2.getX();
        int i11 = this.f57930f;
        int i12 = this.d;
        if (i11 == i12 + 1) {
            f11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f15 = f11 + width;
        if (rh0Var != null) {
            f12 = (rh0Var.getWidth() / 2.0f) + rh0Var.getX();
        } else {
            f12 = 0.0f;
        }
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f13 = org.telegram.messenger.g0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.g0.T1(f15, f12 + f13, f10), (rh0Var2.getHeight() / 2.0f) + rh0Var2.getY(), L, this.f57928c);
    }

    public void setDelegate(h1 h1Var) {
        this.f57927b = h1Var;
    }

    public void setSelectedIndex(int i7) {
        this.f57930f = i7;
        if (this.f57929e) {
            this.f57929e = false;
            org.telegram.messenger.g0.P3(this.f57926a[this.d + 1], 2131232044);
        }
        invalidate();
    }
}
