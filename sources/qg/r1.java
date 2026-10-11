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
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Wallet.z4;
import w7.x5;
public final class r1 extends LinearLayout {
    public final gk0[] f46643a;
    public q1 f46644b;
    public final Paint f46645c;
    public final int d;
    public boolean f46646e;
    public int f46647f;
    public int h;
    public float f46648n;
    public ValueAnimator f46649r;

    public r1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f7;
        float f10;
        List list = pg.m.f45756a;
        this.f46643a = new gk0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f46645c = paint;
        this.f46647f = 1;
        this.h = -1;
        this.f46648n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = pg.m.f45756a;
            if (i10 < list2.size() + 2) {
                gk0[] gk0VarArr = this.f46643a;
                if (i10 == 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (i10 == list2.size() + 1) {
                    objArr2 = 1;
                } else {
                    objArr2 = null;
                }
                ImageView imageView = new ImageView(getContext());
                if (objArr != null) {
                    f7 = 0.0f;
                } else {
                    f7 = 8.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                int dp2 = AndroidUtilities.dp(8.0f);
                if (objArr2 != null) {
                    f10 = 0.0f;
                } else {
                    f10 = 8.0f;
                }
                imageView.setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                imageView.setLayoutParams(x5.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                gk0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f46643a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final r1 f46625b;

                        {
                            this.f46625b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f46625b.f46644b.a();
                                    return;
                                default:
                                    this.f46625b.f46644b.y();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    pg.m mVar = (pg.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof pg.b)) {
                        this.f46643a[i11].f(mVar.e(), 28, 28, null);
                        this.f46643a[i11].setOnClickListener(new sa(this, i11, mVar, 20));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f46643a[i11].setImageResource(R.drawable.msg_add);
                    this.f46643a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final r1 f46625b;

                        {
                            this.f46625b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f46625b.f46644b.a();
                                    return;
                                default:
                                    this.f46625b.f46644b.y();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f46643a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            gk0[] gk0VarArr = this.f46643a;
            if (i10 < gk0VarArr.length) {
                if (this.f46649r == null || this.h != i10) {
                    gk0 gk0Var = gk0VarArr[i10];
                    if (gk0Var != null) {
                        Drawable drawable = gk0Var.getDrawable();
                        if (drawable instanceof dk0) {
                            dk0 dk0Var = (dk0) drawable;
                            dk0Var.M(0);
                            dk0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f46649r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f46647f != i10) {
                        if (this.f46646e) {
                            this.f46646e = false;
                            AndroidUtilities.updateImageViewImageAnimated(gk0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f46648n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f46649r = duration;
                        duration.setInterpolator(is.f27500f);
                        this.f46649r.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 9));
                        this.f46649r.addListener(new z4(this, 9));
                        this.f46649r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f46644b.v().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f46649r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.t0(childAt, 16));
                            return true;
                        }
                    } else if (this.f46647f != i10) {
                        a(i10);
                        post(new org.telegram.ui.web.t0(childAt, 16));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gk0 gk0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f46647f;
        gk0[] gk0VarArr = this.f46643a;
        gk0 gk0Var2 = gk0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            gk0Var = gk0VarArr[i11];
        } else {
            gk0Var = null;
        }
        float f12 = 0.0f;
        if (gk0Var != null) {
            f7 = this.f46648n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.q.x(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((gk0Var2.getWidth() - gk0Var2.getPaddingLeft()) - gk0Var2.getPaddingRight(), (gk0Var2.getHeight() - gk0Var2.getPaddingTop()) - gk0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (gk0Var2.getWidth() / 2.0f) + gk0Var2.getX();
        int i12 = this.f46647f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (gk0Var != null) {
            f11 = (gk0Var.getWidth() / 2.0f) + gk0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (gk0Var2.getHeight() / 2.0f) + gk0Var2.getY(), dp, this.f46645c);
    }

    public void setDelegate(q1 q1Var) {
        this.f46644b = q1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f46647f = i10;
        if (this.f46646e) {
            this.f46646e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f46643a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
