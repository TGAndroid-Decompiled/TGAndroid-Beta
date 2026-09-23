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
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.yi0;
import w7.x5;
public final class u1 extends LinearLayout {
    public final bj0[] f41616a;
    public t1 f41617b;
    public final Paint f41618c;
    public final int d;
    public boolean e;
    public int f41619f;
    public int h;
    public float f41620n;
    public ValueAnimator f41621r;

    public u1(Context context, boolean z10) {
        super(context);
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        List list = pg.m.f40862a;
        this.f41616a = new bj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f41618c = paint;
        this.f41619f = 1;
        this.h = -1;
        this.f41620n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = pg.m.f40862a;
            if (i10 < list2.size() + 2) {
                bj0[] bj0VarArr = this.f41616a;
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
                imageView.setLayoutParams(x5.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                bj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f41616a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final u1 f41597b;

                        {
                            this.f41597b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f41597b.f41617b.a();
                                    return;
                                default:
                                    this.f41597b.f41617b.y();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    pg.m mVar = (pg.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof pg.b)) {
                        this.f41616a[i11].f(mVar.e(), 28, 28, null);
                        this.f41616a[i11].setOnClickListener(new wa(this, i11, mVar, 18));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f41616a[i11].setImageResource(R.drawable.msg_add);
                    this.f41616a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final u1 f41597b;

                        {
                            this.f41597b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f41597b.f41617b.a();
                                    return;
                                default:
                                    this.f41597b.f41617b.y();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f41616a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            bj0[] bj0VarArr = this.f41616a;
            if (i10 < bj0VarArr.length) {
                if (this.f41621r == null || this.h != i10) {
                    bj0 bj0Var = bj0VarArr[i10];
                    if (bj0Var != null) {
                        Drawable drawable = bj0Var.getDrawable();
                        if (drawable instanceof yi0) {
                            yi0 yi0Var = (yi0) drawable;
                            yi0Var.M(0);
                            yi0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f41621r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f41619f != i10) {
                        if (this.e) {
                            this.e = false;
                            AndroidUtilities.updateImageViewImageAnimated(bj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f41620n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f41621r = duration;
                        duration.setInterpolator(rr.f27701f);
                        this.f41621r.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 9));
                        this.f41621r.addListener(new n0(this, 1));
                        this.f41621r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f41617b.v().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f41621r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.t0(childAt, 15));
                            return true;
                        }
                    } else if (this.f41619f != i10) {
                        a(i10);
                        post(new org.telegram.ui.web.t0(childAt, 15));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bj0 bj0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f41619f;
        bj0[] bj0VarArr = this.f41616a;
        bj0 bj0Var2 = bj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            bj0Var = bj0VarArr[i11];
        } else {
            bj0Var = null;
        }
        float f12 = 0.0f;
        if (bj0Var != null) {
            f7 = this.f41620n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.z0.y(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((bj0Var2.getWidth() - bj0Var2.getPaddingLeft()) - bj0Var2.getPaddingRight(), (bj0Var2.getHeight() - bj0Var2.getPaddingTop()) - bj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (bj0Var2.getWidth() / 2.0f) + bj0Var2.getX();
        int i12 = this.f41619f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (bj0Var != null) {
            f11 = (bj0Var.getWidth() / 2.0f) + bj0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (bj0Var2.getHeight() / 2.0f) + bj0Var2.getY(), dp, this.f41618c);
    }

    public void setDelegate(t1 t1Var) {
        this.f41617b = t1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f41619f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f41616a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
