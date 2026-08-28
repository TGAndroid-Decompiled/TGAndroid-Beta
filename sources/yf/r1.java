package yf;

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
import fh.a3;
import g7.e6;
import java.util.List;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.te1;
public final class r1 extends LinearLayout {
    public final pi0[] f50089a;
    public q1 f50090b;
    public final Paint f50091c;
    public final int d;
    public boolean f50092e;
    public int f50093f;
    public int h;
    public float f50094n;
    public ValueAnimator f50095r;

    public r1(Context context, boolean z10) {
        super(context);
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        List list = xf.m.f49272a;
        this.f50089a = new pi0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f50091c = paint;
        this.f50093f = 1;
        this.h = -1;
        this.f50094n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            List list2 = xf.m.f49272a;
            if (i9 < list2.size() + 2) {
                pi0[] pi0VarArr = this.f50089a;
                if (i9 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i9 == list2.size() + 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ImageView imageView = new ImageView(getContext());
                if (z11) {
                    f10 = 0.0f;
                } else {
                    f10 = 8.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                int dp2 = AndroidUtilities.dp(8.0f);
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 8.0f;
                }
                imageView.setPadding(dp, dp2, AndroidUtilities.dp(f11), AndroidUtilities.dp(8.0f));
                imageView.setLayoutParams(e6.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                pi0VarArr[i10] = imageView;
                if (i9 == 0) {
                    this.f50089a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final r1 f50065b;

                        {
                            this.f50065b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f50065b.f50090b.a();
                                    return;
                                default:
                                    this.f50065b.f50090b.A();
                                    return;
                            }
                        }
                    });
                } else if (i9 > 0 && i9 <= list2.size()) {
                    xf.m mVar = (xf.m) list2.get(i9 - 1);
                    if (z10 || !(mVar instanceof xf.b)) {
                        this.f50089a[i10].f(mVar.e(), 28, 28, null);
                        this.f50089a[i10].setOnClickListener(new a3(this, i10, mVar, 21));
                    } else {
                        i9++;
                    }
                } else if (i9 == list2.size() + 1) {
                    this.f50089a[i10].setImageResource(R.drawable.msg_add);
                    this.f50089a[i10].setOnClickListener(new View.OnClickListener(this) {
                        public final r1 f50065b;

                        {
                            this.f50065b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f50065b.f50090b.a();
                                    return;
                                default:
                                    this.f50065b.f50090b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f50089a[i10]);
                i10++;
                i9++;
            } else {
                return;
            }
        }
    }

    public final void a(int i9) {
        if (i9 >= 0) {
            pi0[] pi0VarArr = this.f50089a;
            if (i9 < pi0VarArr.length) {
                if (this.f50095r == null || this.h != i9) {
                    pi0 pi0Var = pi0VarArr[i9];
                    if (pi0Var != null) {
                        Drawable drawable = pi0Var.getDrawable();
                        if (drawable instanceof mi0) {
                            mi0 mi0Var = (mi0) drawable;
                            mi0Var.K(0);
                            mi0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f50095r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f50093f != i9) {
                        if (this.f50092e) {
                            this.f50092e = false;
                            AndroidUtilities.updateImageViewImageAnimated(pi0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i9;
                        this.f50094n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f50095r = duration;
                        duration.setInterpolator(gr.f28844f);
                        this.f50095r.addUpdateListener(new g4(this, 20));
                        this.f50095r.addListener(new te1(this, 11));
                        this.f50095r.start();
                    }
                }
            }
        }
    }

    public final void b(int i9) {
        a(i9);
        this.f50090b.x().i(i9 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i9 = 1; i9 < getChildCount() - 1; i9++) {
                View childAt = getChildAt(i9);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f50095r != null) {
                        if (this.h != i9) {
                            a(i9);
                            post(new pf.o1(childAt, 18));
                            return true;
                        }
                    } else if (this.f50093f != i9) {
                        a(i9);
                        post(new pf.o1(childAt, 18));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        pi0 pi0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i9 = this.f50093f;
        pi0[] pi0VarArr = this.f50089a;
        pi0 pi0Var2 = pi0VarArr[i9];
        int i10 = this.h;
        if (i10 != -1) {
            pi0Var = pi0VarArr[i10];
        } else {
            pi0Var = null;
        }
        float f13 = 0.0f;
        if (pi0Var != null) {
            f10 = this.f50094n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? org.telegram.messenger.l0.a(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f14) + (Math.min((pi0Var2.getWidth() - pi0Var2.getPaddingLeft()) - pi0Var2.getPaddingRight(), (pi0Var2.getHeight() - pi0Var2.getPaddingTop()) - pi0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (pi0Var2.getWidth() / 2.0f) + pi0Var2.getX();
        int i11 = this.f50093f;
        int i12 = this.d;
        if (i11 == i12 + 1) {
            f11 = AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f15 = f11 + width;
        if (pi0Var != null) {
            f12 = (pi0Var.getWidth() / 2.0f) + pi0Var.getX();
        } else {
            f12 = 0.0f;
        }
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f13 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f15, f12 + f13, f10), (pi0Var2.getHeight() / 2.0f) + pi0Var2.getY(), dp, this.f50091c);
    }

    public void setDelegate(q1 q1Var) {
        this.f50090b = q1Var;
    }

    public void setSelectedIndex(int i9) {
        this.f50093f = i9;
        if (this.f50092e) {
            this.f50092e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f50089a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
