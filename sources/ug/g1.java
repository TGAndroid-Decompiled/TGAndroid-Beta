package ug;

import ai.h3;
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
import b8.mf;
import gi.j3;
import java.util.List;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
public final class g1 extends LinearLayout {
    public final fh0[] f56014a;
    public f1 f56015b;
    public final Paint f56016c;
    public final int d;
    public boolean f56017e;
    public int f56018f;
    public int h;
    public float f56019n;
    public ValueAnimator f56020r;

    public g1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f10;
        float f11;
        List list = tg.h.f55183a;
        this.f56014a = new fh0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f56016c = paint;
        this.f56018f = 1;
        this.h = -1;
        this.f56019n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i3 = 0;
        int i10 = 0;
        while (true) {
            List list2 = tg.h.f55183a;
            if (i3 < list2.size() + 2) {
                fh0[] fh0VarArr = this.f56014a;
                if (i3 == 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (i3 == list2.size() + 1) {
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
                imageView.setLayoutParams(mf.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                fh0VarArr[i10] = imageView;
                if (i3 == 0) {
                    this.f56014a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final g1 f55959b;

                        {
                            this.f55959b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f55959b.f56015b.a();
                                    return;
                                default:
                                    this.f55959b.f56015b.z();
                                    return;
                            }
                        }
                    });
                } else if (i3 > 0 && i3 <= list2.size()) {
                    tg.h hVar = (tg.h) list2.get(i3 - 1);
                    if (z10 || !(hVar instanceof tg.b)) {
                        this.f56014a[i10].f(hVar.e(), 28, 28, null);
                        this.f56014a[i10].setOnClickListener(new h3(this, i10, hVar, 24));
                    } else {
                        i3++;
                    }
                } else if (i3 == list2.size() + 1) {
                    this.f56014a[i10].setImageResource(2131232042);
                    this.f56014a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final g1 f55959b;

                        {
                            this.f55959b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f55959b.f56015b.a();
                                    return;
                                default:
                                    this.f55959b.f56015b.z();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f56014a[i10]);
                i10++;
                i3++;
            } else {
                return;
            }
        }
    }

    public final void a(int i3) {
        if (i3 >= 0) {
            fh0[] fh0VarArr = this.f56014a;
            if (i3 < fh0VarArr.length) {
                if (this.f56020r == null || this.h != i3) {
                    fh0 fh0Var = fh0VarArr[i3];
                    if (fh0Var != null) {
                        Drawable drawable = fh0Var.getDrawable();
                        if (drawable instanceof ch0) {
                            ch0 ch0Var = (ch0) drawable;
                            ch0Var.M(0);
                            ch0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f56020r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f56018f != i3) {
                        if (this.f56017e) {
                            this.f56017e = false;
                            org.telegram.messenger.g0.R3(fh0VarArr[this.d + 1], 2131232042);
                        }
                        this.h = i3;
                        this.f56019n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f56020r = duration;
                        duration.setInterpolator(xq.f40452f);
                        this.f56020r.addUpdateListener(new j3(this, 26));
                        this.f56020r.addListener(new i81(this, 17));
                        this.f56020r.start();
                    }
                }
            }
        }
    }

    public final void b(int i3) {
        a(i3);
        this.f56015b.w().i(i3 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i3 = 1; i3 < getChildCount() - 1; i3++) {
                View childAt = getChildAt(i3);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f56020r != null) {
                        if (this.h != i3) {
                            a(i3);
                            post(new org.telegram.ui.ActionBar.i1(1, childAt));
                            return true;
                        }
                    } else if (this.f56018f != i3) {
                        a(i3);
                        post(new org.telegram.ui.ActionBar.i1(1, childAt));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fh0 fh0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i3 = this.f56018f;
        fh0[] fh0VarArr = this.f56014a;
        fh0 fh0Var2 = fh0VarArr[i3];
        int i10 = this.h;
        if (i10 != -1) {
            fh0Var = fh0VarArr[i10];
        } else {
            fh0Var = null;
        }
        float f13 = 0.0f;
        if (fh0Var != null) {
            f10 = this.f56019n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? k5.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f14) + (Math.min((fh0Var2.getWidth() - fh0Var2.getPaddingLeft()) - fh0Var2.getPaddingRight(), (fh0Var2.getHeight() - fh0Var2.getPaddingTop()) - fh0Var2.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (fh0Var2.getWidth() / 2.0f) + fh0Var2.getX();
        int i11 = this.f56018f;
        int i12 = this.d;
        if (i11 == i12 + 1) {
            f11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f15 = f11 + width;
        if (fh0Var != null) {
            f12 = (fh0Var.getWidth() / 2.0f) + fh0Var.getX();
        } else {
            f12 = 0.0f;
        }
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f13 = org.telegram.messenger.g0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.g0.T1(f15, f12 + f13, f10), (fh0Var2.getHeight() / 2.0f) + fh0Var2.getY(), L, this.f56016c);
    }

    public void setDelegate(f1 f1Var) {
        this.f56015b = f1Var;
    }

    public void setSelectedIndex(int i3) {
        this.f56018f = i3;
        if (this.f56017e) {
            this.f56017e = false;
            org.telegram.messenger.g0.R3(this.f56014a[this.d + 1], 2131232042);
        }
        invalidate();
    }
}
