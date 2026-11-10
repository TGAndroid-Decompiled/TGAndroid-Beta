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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.u81;
public final class h1 extends LinearLayout {
    public final ch0[] f55725a;
    public g1 f55726b;
    public final Paint f55727c;
    public final int d;
    public boolean f55728e;
    public int f55729f;
    public int h;
    public float f55730n;
    public ValueAnimator f55731r;

    public h1(Context context, boolean z9) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f10;
        float f11;
        List list = sg.h.f55073a;
        this.f55725a = new ch0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f55727c = paint;
        this.f55729f = 1;
        this.h = -1;
        this.f55730n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z9 ? 1 : 0);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            List list2 = sg.h.f55073a;
            if (i7 < list2.size() + 2) {
                ch0[] ch0VarArr = this.f55725a;
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
                ch0VarArr[i10] = imageView;
                if (i7 == 0) {
                    this.f55725a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final h1 f55671b;

                        {
                            this.f55671b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f55671b.f55726b.a();
                                    return;
                                default:
                                    this.f55671b.f55726b.A();
                                    return;
                            }
                        }
                    });
                } else if (i7 > 0 && i7 <= list2.size()) {
                    sg.h hVar = (sg.h) list2.get(i7 - 1);
                    if (z9 || !(hVar instanceof sg.b)) {
                        this.f55725a[i10].f(hVar.e(), 28, 28, null);
                        this.f55725a[i10].setOnClickListener(new la(this, i10, hVar, 22));
                    } else {
                        i7++;
                    }
                } else if (i7 == list2.size() + 1) {
                    this.f55725a[i10].setImageResource(2131232042);
                    this.f55725a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final h1 f55671b;

                        {
                            this.f55671b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f55671b.f55726b.a();
                                    return;
                                default:
                                    this.f55671b.f55726b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f55725a[i10]);
                i10++;
                i7++;
            } else {
                return;
            }
        }
    }

    public final void a(int i7) {
        if (i7 >= 0) {
            ch0[] ch0VarArr = this.f55725a;
            if (i7 < ch0VarArr.length) {
                if (this.f55731r == null || this.h != i7) {
                    ch0 ch0Var = ch0VarArr[i7];
                    if (ch0Var != null) {
                        Drawable drawable = ch0Var.getDrawable();
                        if (drawable instanceof zg0) {
                            zg0 zg0Var = (zg0) drawable;
                            zg0Var.M(0);
                            zg0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f55731r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f55729f != i7) {
                        if (this.f55728e) {
                            this.f55728e = false;
                            org.telegram.messenger.g0.R3(ch0VarArr[this.d + 1], 2131232042);
                        }
                        this.h = i7;
                        this.f55730n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f55731r = duration;
                        duration.setInterpolator(wq.f40046f);
                        this.f55731r.addUpdateListener(new v3(this, 25));
                        this.f55731r.addListener(new u81(this, 16));
                        this.f55731r.start();
                    }
                }
            }
        }
    }

    public final void b(int i7) {
        a(i7);
        this.f55726b.x().i(i7 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i7 = 1; i7 < getChildCount() - 1; i7++) {
                View childAt = getChildAt(i7);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f55731r != null) {
                        if (this.h != i7) {
                            a(i7);
                            post(new org.telegram.ui.ActionBar.j1(1, childAt));
                            return true;
                        }
                    } else if (this.f55729f != i7) {
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
        ch0 ch0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i7 = this.f55729f;
        ch0[] ch0VarArr = this.f55725a;
        ch0 ch0Var2 = ch0VarArr[i7];
        int i10 = this.h;
        if (i10 != -1) {
            ch0Var = ch0VarArr[i10];
        } else {
            ch0Var = null;
        }
        float f13 = 0.0f;
        if (ch0Var != null) {
            f10 = this.f55730n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? k5.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f14) + (Math.min((ch0Var2.getWidth() - ch0Var2.getPaddingLeft()) - ch0Var2.getPaddingRight(), (ch0Var2.getHeight() - ch0Var2.getPaddingTop()) - ch0Var2.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (ch0Var2.getWidth() / 2.0f) + ch0Var2.getX();
        int i11 = this.f55729f;
        int i12 = this.d;
        if (i11 == i12 + 1) {
            f11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f15 = f11 + width;
        if (ch0Var != null) {
            f12 = (ch0Var.getWidth() / 2.0f) + ch0Var.getX();
        } else {
            f12 = 0.0f;
        }
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f13 = org.telegram.messenger.g0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.g0.T1(f15, f12 + f13, f10), (ch0Var2.getHeight() / 2.0f) + ch0Var2.getY(), L, this.f55727c);
    }

    public void setDelegate(g1 g1Var) {
        this.f55726b = g1Var;
    }

    public void setSelectedIndex(int i7) {
        this.f55729f = i7;
        if (this.f55728e) {
            this.f55728e = false;
            org.telegram.messenger.g0.R3(this.f55725a[this.d + 1], 2131232042);
        }
        invalidate();
    }
}
