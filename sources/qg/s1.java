package qg;

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
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.rr;
import w7.y5;
public final class s1 extends LinearLayout {
    public final lj0[] f41919a;
    public r1 f41920b;
    public final Paint f41921c;
    public final int d;
    public boolean e;
    public int f41922f;
    public int h;
    public float f41923n;
    public ValueAnimator f41924r;

    public s1(Context context, boolean z10) {
        super(context);
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        List list = pg.m.f41170a;
        this.f41919a = new lj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f41921c = paint;
        this.f41922f = 1;
        this.h = -1;
        this.f41923n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = pg.m.f41170a;
            if (i10 < list2.size() + 2) {
                lj0[] lj0VarArr = this.f41919a;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i10 == list2.size() + 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ImageView imageView = new ImageView(getContext());
                if (z11) {
                    f7 = 0.0f;
                } else {
                    f7 = 8.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                int dp2 = AndroidUtilities.dp(8.0f);
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = 8.0f;
                }
                imageView.setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                imageView.setLayoutParams(y5.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                lj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f41919a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final s1 f41900b;

                        {
                            this.f41900b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f41900b.f41920b.a();
                                    return;
                                default:
                                    this.f41900b.f41920b.y();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    pg.m mVar = (pg.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof pg.b)) {
                        this.f41919a[i11].f(mVar.e(), 28, 28, null);
                        this.f41919a[i11].setOnClickListener(new ua(this, i11, mVar, 18));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f41919a[i11].setImageResource(R.drawable.msg_add);
                    this.f41919a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final s1 f41900b;

                        {
                            this.f41900b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f41900b.f41920b.a();
                                    return;
                                default:
                                    this.f41900b.f41920b.y();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f41919a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            lj0[] lj0VarArr = this.f41919a;
            if (i10 < lj0VarArr.length) {
                if (this.f41924r == null || this.h != i10) {
                    lj0 lj0Var = lj0VarArr[i10];
                    if (lj0Var != null) {
                        Drawable drawable = lj0Var.getDrawable();
                        if (drawable instanceof ij0) {
                            ij0 ij0Var = (ij0) drawable;
                            ij0Var.M(0);
                            ij0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f41924r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f41922f != i10) {
                        if (this.e) {
                            this.e = false;
                            AndroidUtilities.updateImageViewImageAnimated(lj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f41923n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f41924r = duration;
                        duration.setInterpolator(rr.f28031f);
                        this.f41924r.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 9));
                        this.f41924r.addListener(new pg.d0(this, 2));
                        this.f41924r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f41920b.v().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f41924r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.q0(childAt, 16));
                            return true;
                        }
                    } else if (this.f41922f != i10) {
                        a(i10);
                        post(new org.telegram.ui.web.q0(childAt, 16));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lj0 lj0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f41922f;
        lj0[] lj0VarArr = this.f41919a;
        lj0 lj0Var2 = lj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            lj0Var = lj0VarArr[i11];
        } else {
            lj0Var = null;
        }
        float f12 = 0.0f;
        if (lj0Var != null) {
            f7 = this.f41923n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.f0.x(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((lj0Var2.getWidth() - lj0Var2.getPaddingLeft()) - lj0Var2.getPaddingRight(), (lj0Var2.getHeight() - lj0Var2.getPaddingTop()) - lj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (lj0Var2.getWidth() / 2.0f) + lj0Var2.getX();
        int i12 = this.f41922f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (lj0Var != null) {
            f11 = (lj0Var.getWidth() / 2.0f) + lj0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (lj0Var2.getHeight() / 2.0f) + lj0Var2.getY(), dp, this.f41921c);
    }

    public void setDelegate(r1 r1Var) {
        this.f41920b = r1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f41922f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f41919a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
