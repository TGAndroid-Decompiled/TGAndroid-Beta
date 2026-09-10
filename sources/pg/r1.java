package pg;

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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.mv0;
import w7.a6;
public final class r1 extends LinearLayout {
    public final kj0[] f40272a;
    public q1 f40273b;
    public final Paint f40274c;
    public final int d;
    public boolean e;
    public int f40275f;
    public int h;
    public float f40276n;
    public ValueAnimator f40277r;

    public r1(Context context, boolean z10) {
        super(context);
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        List list = og.m.f14420a;
        this.f40272a = new kj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f40274c = paint;
        this.f40275f = 1;
        this.h = -1;
        this.f40276n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = og.m.f14420a;
            if (i10 < list2.size() + 2) {
                kj0[] kj0VarArr = this.f40272a;
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
                imageView.setLayoutParams(a6.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                kj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f40272a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final r1 f40254b;

                        {
                            this.f40254b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f40254b.f40273b.a();
                                    return;
                                default:
                                    this.f40254b.f40273b.x();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    og.m mVar = (og.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof og.b)) {
                        this.f40272a[i11].f(mVar.e(), 28, 28, null);
                        this.f40272a[i11].setOnClickListener(new wa(this, i11, mVar, 18));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f40272a[i11].setImageResource(R.drawable.msg_add);
                    this.f40272a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final r1 f40254b;

                        {
                            this.f40254b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f40254b.f40273b.a();
                                    return;
                                default:
                                    this.f40254b.f40273b.x();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f40272a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            kj0[] kj0VarArr = this.f40272a;
            if (i10 < kj0VarArr.length) {
                if (this.f40277r == null || this.h != i10) {
                    kj0 kj0Var = kj0VarArr[i10];
                    if (kj0Var != null) {
                        Drawable drawable = kj0Var.getDrawable();
                        if (drawable instanceof hj0) {
                            hj0 hj0Var = (hj0) drawable;
                            hj0Var.M(0);
                            hj0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f40277r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f40275f != i10) {
                        if (this.e) {
                            this.e = false;
                            AndroidUtilities.updateImageViewImageAnimated(kj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f40276n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f40277r = duration;
                        duration.setInterpolator(wr.f28819f);
                        this.f40277r.addUpdateListener(new ai.a(this, 25));
                        this.f40277r.addListener(new mv0(this, 20));
                        this.f40277r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f40273b.u().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f40277r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.Components.voip.x(childAt, 22));
                            return true;
                        }
                    } else if (this.f40275f != i10) {
                        a(i10);
                        post(new org.telegram.ui.Components.voip.x(childAt, 22));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        kj0 kj0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f40275f;
        kj0[] kj0VarArr = this.f40272a;
        kj0 kj0Var2 = kj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            kj0Var = kj0VarArr[i11];
        } else {
            kj0Var = null;
        }
        float f12 = 0.0f;
        if (kj0Var != null) {
            f7 = this.f40276n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.a2.y(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((kj0Var2.getWidth() - kj0Var2.getPaddingLeft()) - kj0Var2.getPaddingRight(), (kj0Var2.getHeight() - kj0Var2.getPaddingTop()) - kj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (kj0Var2.getWidth() / 2.0f) + kj0Var2.getX();
        int i12 = this.f40275f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (kj0Var != null) {
            f11 = (kj0Var.getWidth() / 2.0f) + kj0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (kj0Var2.getHeight() / 2.0f) + kj0Var2.getY(), dp, this.f40274c);
    }

    public void setDelegate(q1 q1Var) {
        this.f40273b = q1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f40275f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f40272a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
