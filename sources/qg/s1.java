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
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.sr;
import w7.y5;
public final class s1 extends LinearLayout {
    public final mj0[] f41917a;
    public r1 f41918b;
    public final Paint f41919c;
    public final int d;
    public boolean e;
    public int f41920f;
    public int h;
    public float f41921n;
    public ValueAnimator f41922r;

    public s1(Context context, boolean z10) {
        super(context);
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        List list = pg.m.f41168a;
        this.f41917a = new mj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f41919c = paint;
        this.f41920f = 1;
        this.h = -1;
        this.f41921n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = pg.m.f41168a;
            if (i10 < list2.size() + 2) {
                mj0[] mj0VarArr = this.f41917a;
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
                mj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f41917a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final s1 f41898b;

                        {
                            this.f41898b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f41898b.f41918b.a();
                                    return;
                                default:
                                    this.f41898b.f41918b.y();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    pg.m mVar = (pg.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof pg.b)) {
                        this.f41917a[i11].f(mVar.e(), 28, 28, null);
                        this.f41917a[i11].setOnClickListener(new ua(this, i11, mVar, 18));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f41917a[i11].setImageResource(R.drawable.msg_add);
                    this.f41917a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final s1 f41898b;

                        {
                            this.f41898b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f41898b.f41918b.a();
                                    return;
                                default:
                                    this.f41898b.f41918b.y();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f41917a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            mj0[] mj0VarArr = this.f41917a;
            if (i10 < mj0VarArr.length) {
                if (this.f41922r == null || this.h != i10) {
                    mj0 mj0Var = mj0VarArr[i10];
                    if (mj0Var != null) {
                        Drawable drawable = mj0Var.getDrawable();
                        if (drawable instanceof jj0) {
                            jj0 jj0Var = (jj0) drawable;
                            jj0Var.M(0);
                            jj0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f41922r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f41920f != i10) {
                        if (this.e) {
                            this.e = false;
                            AndroidUtilities.updateImageViewImageAnimated(mj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f41921n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f41922r = duration;
                        duration.setInterpolator(sr.f28339f);
                        this.f41922r.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 9));
                        this.f41922r.addListener(new pg.d0(this, 2));
                        this.f41922r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f41918b.v().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f41922r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.q0(childAt, 16));
                            return true;
                        }
                    } else if (this.f41920f != i10) {
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
        mj0 mj0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f41920f;
        mj0[] mj0VarArr = this.f41917a;
        mj0 mj0Var2 = mj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            mj0Var = mj0VarArr[i11];
        } else {
            mj0Var = null;
        }
        float f12 = 0.0f;
        if (mj0Var != null) {
            f7 = this.f41921n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.f0.x(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((mj0Var2.getWidth() - mj0Var2.getPaddingLeft()) - mj0Var2.getPaddingRight(), (mj0Var2.getHeight() - mj0Var2.getPaddingTop()) - mj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (mj0Var2.getWidth() / 2.0f) + mj0Var2.getX();
        int i12 = this.f41920f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (mj0Var != null) {
            f11 = (mj0Var.getWidth() / 2.0f) + mj0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (mj0Var2.getHeight() / 2.0f) + mj0Var2.getY(), dp, this.f41919c);
    }

    public void setDelegate(r1 r1Var) {
        this.f41918b = r1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f41920f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f41917a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
