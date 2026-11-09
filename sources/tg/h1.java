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
import bi.la;
import c8.ha;
import fi.v3;
import java.util.List;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.t81;
public final class h1 extends LinearLayout {
    public final dh0[] f55726a;
    public g1 f55727b;
    public final Paint f55728c;
    public final int d;
    public boolean f55729e;
    public int f55730f;
    public int h;
    public float f55731n;
    public ValueAnimator f55732r;

    public h1(Context context, boolean z9) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f10;
        float f11;
        List list = sg.h.f55074a;
        this.f55726a = new dh0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f55728c = paint;
        this.f55730f = 1;
        this.h = -1;
        this.f55731n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z9 ? 1 : 0);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            List list2 = sg.h.f55074a;
            if (i7 < list2.size() + 2) {
                dh0[] dh0VarArr = this.f55726a;
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
                imageView.setLayoutParams(ha.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                dh0VarArr[i10] = imageView;
                if (i7 == 0) {
                    this.f55726a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final h1 f55672b;

                        {
                            this.f55672b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f55672b.f55727b.a();
                                    return;
                                default:
                                    this.f55672b.f55727b.A();
                                    return;
                            }
                        }
                    });
                } else if (i7 > 0 && i7 <= list2.size()) {
                    sg.h hVar = (sg.h) list2.get(i7 - 1);
                    if (z9 || !(hVar instanceof sg.b)) {
                        this.f55726a[i10].f(hVar.e(), 28, 28, null);
                        this.f55726a[i10].setOnClickListener(new la(this, i10, hVar, 22));
                    } else {
                        i7++;
                    }
                } else if (i7 == list2.size() + 1) {
                    this.f55726a[i10].setImageResource(2131232042);
                    this.f55726a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final h1 f55672b;

                        {
                            this.f55672b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f55672b.f55727b.a();
                                    return;
                                default:
                                    this.f55672b.f55727b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f55726a[i10]);
                i10++;
                i7++;
            } else {
                return;
            }
        }
    }

    public final void a(int i7) {
        if (i7 >= 0) {
            dh0[] dh0VarArr = this.f55726a;
            if (i7 < dh0VarArr.length) {
                if (this.f55732r == null || this.h != i7) {
                    dh0 dh0Var = dh0VarArr[i7];
                    if (dh0Var != null) {
                        Drawable drawable = dh0Var.getDrawable();
                        if (drawable instanceof ah0) {
                            ah0 ah0Var = (ah0) drawable;
                            ah0Var.M(0);
                            ah0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f55732r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f55730f != i7) {
                        if (this.f55729e) {
                            this.f55729e = false;
                            org.telegram.messenger.g0.R3(dh0VarArr[this.d + 1], 2131232042);
                        }
                        this.h = i7;
                        this.f55731n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f55732r = duration;
                        duration.setInterpolator(xq.f40458f);
                        this.f55732r.addUpdateListener(new v3(this, 25));
                        this.f55732r.addListener(new t81(this, 16));
                        this.f55732r.start();
                    }
                }
            }
        }
    }

    public final void b(int i7) {
        a(i7);
        this.f55727b.x().i(i7 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i7 = 1; i7 < getChildCount() - 1; i7++) {
                View childAt = getChildAt(i7);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f55732r != null) {
                        if (this.h != i7) {
                            a(i7);
                            post(new org.telegram.ui.ActionBar.j1(1, childAt));
                            return true;
                        }
                    } else if (this.f55730f != i7) {
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
        dh0 dh0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i7 = this.f55730f;
        dh0[] dh0VarArr = this.f55726a;
        dh0 dh0Var2 = dh0VarArr[i7];
        int i10 = this.h;
        if (i10 != -1) {
            dh0Var = dh0VarArr[i10];
        } else {
            dh0Var = null;
        }
        float f13 = 0.0f;
        if (dh0Var != null) {
            f10 = this.f55731n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? k5.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f14) + (Math.min((dh0Var2.getWidth() - dh0Var2.getPaddingLeft()) - dh0Var2.getPaddingRight(), (dh0Var2.getHeight() - dh0Var2.getPaddingTop()) - dh0Var2.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (dh0Var2.getWidth() / 2.0f) + dh0Var2.getX();
        int i11 = this.f55730f;
        int i12 = this.d;
        if (i11 == i12 + 1) {
            f11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f15 = f11 + width;
        if (dh0Var != null) {
            f12 = (dh0Var.getWidth() / 2.0f) + dh0Var.getX();
        } else {
            f12 = 0.0f;
        }
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f13 = org.telegram.messenger.g0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.g0.T1(f15, f12 + f13, f10), (dh0Var2.getHeight() / 2.0f) + dh0Var2.getY(), L, this.f55728c);
    }

    public void setDelegate(g1 g1Var) {
        this.f55727b = g1Var;
    }

    public void setSelectedIndex(int i7) {
        this.f55730f = i7;
        if (this.f55729e) {
            this.f55729e = false;
            org.telegram.messenger.g0.R3(this.f55726a[this.d + 1], 2131232042);
        }
        invalidate();
    }
}
