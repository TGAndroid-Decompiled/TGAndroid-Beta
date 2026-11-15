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
import bi.x2;
import c8.ja;
import hi.j3;
import java.util.List;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.g71;
public final class h1 extends LinearLayout {
    public final fh0[] f57322a;
    public g1 f57323b;
    public final Paint f57324c;
    public final int d;
    public boolean f57325e;
    public int f57326f;
    public int h;
    public float f57327n;
    public ValueAnimator f57328r;

    public h1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f10;
        float f11;
        List list = sg.h.f56640a;
        this.f57322a = new fh0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f57324c = paint;
        this.f57326f = 1;
        this.h = -1;
        this.f57327n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            List list2 = sg.h.f56640a;
            if (i7 < list2.size() + 2) {
                fh0[] fh0VarArr = this.f57322a;
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
                imageView.setLayoutParams(ja.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                fh0VarArr[i10] = imageView;
                if (i7 == 0) {
                    this.f57322a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final h1 f57236b;

                        {
                            this.f57236b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f57236b.f57323b.a();
                                    return;
                                default:
                                    this.f57236b.f57323b.A();
                                    return;
                            }
                        }
                    });
                } else if (i7 > 0 && i7 <= list2.size()) {
                    sg.h hVar = (sg.h) list2.get(i7 - 1);
                    if (z10 || !(hVar instanceof sg.b)) {
                        this.f57322a[i10].f(hVar.e(), 28, 28, null);
                        this.f57322a[i10].setOnClickListener(new x2(this, i10, hVar, 25));
                    } else {
                        i7++;
                    }
                } else if (i7 == list2.size() + 1) {
                    this.f57322a[i10].setImageResource(2131232043);
                    this.f57322a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final h1 f57236b;

                        {
                            this.f57236b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f57236b.f57323b.a();
                                    return;
                                default:
                                    this.f57236b.f57323b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f57322a[i10]);
                i10++;
                i7++;
            } else {
                return;
            }
        }
    }

    public final void a(int i7) {
        if (i7 >= 0) {
            fh0[] fh0VarArr = this.f57322a;
            if (i7 < fh0VarArr.length) {
                if (this.f57328r == null || this.h != i7) {
                    fh0 fh0Var = fh0VarArr[i7];
                    if (fh0Var != null) {
                        Drawable drawable = fh0Var.getDrawable();
                        if (drawable instanceof ch0) {
                            ch0 ch0Var = (ch0) drawable;
                            ch0Var.M(0);
                            ch0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f57328r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f57326f != i7) {
                        if (this.f57325e) {
                            this.f57325e = false;
                            org.telegram.messenger.g0.Q3(fh0VarArr[this.d + 1], 2131232043);
                        }
                        this.h = i7;
                        this.f57327n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f57328r = duration;
                        duration.setInterpolator(er.f34420f);
                        this.f57328r.addUpdateListener(new j3(this, 27));
                        this.f57328r.addListener(new g71(this, 18));
                        this.f57328r.start();
                    }
                }
            }
        }
    }

    public final void b(int i7) {
        a(i7);
        this.f57323b.x().i(i7 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i7 = 1; i7 < getChildCount() - 1; i7++) {
                View childAt = getChildAt(i7);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f57328r != null) {
                        if (this.h != i7) {
                            a(i7);
                            post(new org.telegram.ui.ActionBar.j1(1, childAt));
                            return true;
                        }
                    } else if (this.f57326f != i7) {
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
        fh0 fh0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i7 = this.f57326f;
        fh0[] fh0VarArr = this.f57322a;
        fh0 fh0Var2 = fh0VarArr[i7];
        int i10 = this.h;
        if (i10 != -1) {
            fh0Var = fh0VarArr[i10];
        } else {
            fh0Var = null;
        }
        float f13 = 0.0f;
        if (fh0Var != null) {
            f10 = this.f57327n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? k5.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f14) + (Math.min((fh0Var2.getWidth() - fh0Var2.getPaddingLeft()) - fh0Var2.getPaddingRight(), (fh0Var2.getHeight() - fh0Var2.getPaddingTop()) - fh0Var2.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (fh0Var2.getWidth() / 2.0f) + fh0Var2.getX();
        int i11 = this.f57326f;
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
        canvas.drawCircle(org.telegram.messenger.g0.T1(f15, f12 + f13, f10), (fh0Var2.getHeight() / 2.0f) + fh0Var2.getY(), L, this.f57324c);
    }

    public void setDelegate(g1 g1Var) {
        this.f57323b = g1Var;
    }

    public void setSelectedIndex(int i7) {
        this.f57326f = i7;
        if (this.f57325e) {
            this.f57325e = false;
            org.telegram.messenger.g0.Q3(this.f57322a[this.d + 1], 2131232043);
        }
        invalidate();
    }
}
