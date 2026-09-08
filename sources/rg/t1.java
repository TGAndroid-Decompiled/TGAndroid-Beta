package rg;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.oj1;
import w7.x5;
public final class t1 extends LinearLayout {
    public final aj0[] f45519a;
    public s1 f45520b;
    public final Paint f45521c;
    public final int d;
    public boolean f45522e;
    public int f45523f;
    public int h;
    public float f45524n;
    public ValueAnimator f45525r;

    public t1(Context context, boolean z10) {
        super(context);
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        List list = qg.m.f44508a;
        this.f45519a = new aj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f45521c = paint;
        this.f45523f = 1;
        this.h = -1;
        this.f45524n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = qg.m.f44508a;
            if (i10 < list2.size() + 2) {
                aj0[] aj0VarArr = this.f45519a;
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
                aj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f45519a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final t1 f45499b;

                        {
                            this.f45499b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f45499b.f45520b.a();
                                    return;
                                default:
                                    this.f45499b.f45520b.A();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    qg.m mVar = (qg.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof qg.b)) {
                        this.f45519a[i11].f(mVar.e(), 28, 28, null);
                        this.f45519a[i11].setOnClickListener(new ua(this, i11, mVar, 18));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f45519a[i11].setImageResource(R.drawable.msg_add);
                    this.f45519a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final t1 f45499b;

                        {
                            this.f45499b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f45499b.f45520b.a();
                                    return;
                                default:
                                    this.f45499b.f45520b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f45519a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            aj0[] aj0VarArr = this.f45519a;
            if (i10 < aj0VarArr.length) {
                if (this.f45525r == null || this.h != i10) {
                    aj0 aj0Var = aj0VarArr[i10];
                    if (aj0Var != null) {
                        Drawable drawable = aj0Var.getDrawable();
                        if (drawable instanceof xi0) {
                            xi0 xi0Var = (xi0) drawable;
                            xi0Var.K(0);
                            xi0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f45525r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f45523f != i10) {
                        if (this.f45522e) {
                            this.f45522e = false;
                            AndroidUtilities.updateImageViewImageAnimated(aj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f45524n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f45525r = duration;
                        duration.setInterpolator(pr.f29493f);
                        this.f45525r.addUpdateListener(new ki.a(this, 11));
                        this.f45525r.addListener(new oj1(this, 5));
                        this.f45525r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f45520b.x().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f45525r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.b(childAt, 20));
                            return true;
                        }
                    } else if (this.f45523f != i10) {
                        a(i10);
                        post(new org.telegram.ui.web.b(childAt, 20));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        aj0 aj0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f45523f;
        aj0[] aj0VarArr = this.f45519a;
        aj0 aj0Var2 = aj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            aj0Var = aj0VarArr[i11];
        } else {
            aj0Var = null;
        }
        float f12 = 0.0f;
        if (aj0Var != null) {
            f7 = this.f45524n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.w1.y(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((aj0Var2.getWidth() - aj0Var2.getPaddingLeft()) - aj0Var2.getPaddingRight(), (aj0Var2.getHeight() - aj0Var2.getPaddingTop()) - aj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (aj0Var2.getWidth() / 2.0f) + aj0Var2.getX();
        int i12 = this.f45523f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (aj0Var != null) {
            f11 = (aj0Var.getWidth() / 2.0f) + aj0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (aj0Var2.getHeight() / 2.0f) + aj0Var2.getY(), dp, this.f45521c);
    }

    public void setDelegate(s1 s1Var) {
        this.f45520b = s1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f45523f = i10;
        if (this.f45522e) {
            this.f45522e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f45519a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
