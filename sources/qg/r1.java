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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.tr;
import w7.z5;
public final class r1 extends LinearLayout {
    public final nj0[] f45310a;
    public q1 f45311b;
    public final Paint f45312c;
    public final int d;
    public boolean f45313e;
    public int f45314f;
    public int h;
    public float f45315n;
    public ValueAnimator f45316r;

    public r1(Context context, boolean z10) {
        super(context);
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        List list = pg.m.f44527a;
        this.f45310a = new nj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f45312c = paint;
        this.f45314f = 1;
        this.h = -1;
        this.f45315n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = pg.m.f44527a;
            if (i10 < list2.size() + 2) {
                nj0[] nj0VarArr = this.f45310a;
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
                imageView.setLayoutParams(z5.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                nj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f45310a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final r1 f45292b;

                        {
                            this.f45292b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f45292b.f45311b.a();
                                    return;
                                default:
                                    this.f45292b.f45311b.z();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    pg.m mVar = (pg.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof pg.b)) {
                        this.f45310a[i11].f(mVar.e(), 28, 28, null);
                        this.f45310a[i11].setOnClickListener(new ua(this, i11, mVar, 18));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f45310a[i11].setImageResource(R.drawable.msg_add);
                    this.f45310a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final r1 f45292b;

                        {
                            this.f45292b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f45292b.f45311b.a();
                                    return;
                                default:
                                    this.f45292b.f45311b.z();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f45310a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            nj0[] nj0VarArr = this.f45310a;
            if (i10 < nj0VarArr.length) {
                if (this.f45316r == null || this.h != i10) {
                    nj0 nj0Var = nj0VarArr[i10];
                    if (nj0Var != null) {
                        Drawable drawable = nj0Var.getDrawable();
                        if (drawable instanceof kj0) {
                            kj0 kj0Var = (kj0) drawable;
                            kj0Var.M(0);
                            kj0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f45316r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f45314f != i10) {
                        if (this.f45313e) {
                            this.f45313e = false;
                            AndroidUtilities.updateImageViewImageAnimated(nj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f45315n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f45316r = duration;
                        duration.setInterpolator(tr.f31141f);
                        this.f45316r.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 9));
                        this.f45316r.addListener(new pg.d0(this, 2));
                        this.f45316r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f45311b.w().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f45316r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.u0(childAt, 15));
                            return true;
                        }
                    } else if (this.f45314f != i10) {
                        a(i10);
                        post(new org.telegram.ui.web.u0(childAt, 15));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        nj0 nj0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f45314f;
        nj0[] nj0VarArr = this.f45310a;
        nj0 nj0Var2 = nj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            nj0Var = nj0VarArr[i11];
        } else {
            nj0Var = null;
        }
        float f12 = 0.0f;
        if (nj0Var != null) {
            f7 = this.f45315n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.f0.x(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((nj0Var2.getWidth() - nj0Var2.getPaddingLeft()) - nj0Var2.getPaddingRight(), (nj0Var2.getHeight() - nj0Var2.getPaddingTop()) - nj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (nj0Var2.getWidth() / 2.0f) + nj0Var2.getX();
        int i12 = this.f45314f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (nj0Var != null) {
            f11 = (nj0Var.getWidth() / 2.0f) + nj0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (nj0Var2.getHeight() / 2.0f) + nj0Var2.getY(), dp, this.f45312c);
    }

    public void setDelegate(q1 q1Var) {
        this.f45311b = q1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f45314f = i10;
        if (this.f45313e) {
            this.f45313e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f45310a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
