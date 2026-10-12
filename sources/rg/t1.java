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
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.fi1;
import w7.a6;
public final class t1 extends LinearLayout {
    public final bk0[] f44551a;
    public s1 f44552b;
    public final Paint f44553c;
    public final int d;
    public boolean e;
    public int f44554f;
    public int h;
    public float f44555n;
    public ValueAnimator f44556r;

    public t1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f7;
        float f10;
        List list = qg.m.f43485a;
        this.f44551a = new bk0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f44553c = paint;
        this.f44554f = 1;
        this.h = -1;
        this.f44555n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = qg.m.f43485a;
            if (i10 < list2.size() + 2) {
                bk0[] bk0VarArr = this.f44551a;
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
                imageView.setLayoutParams(a6.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                bk0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f44551a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final t1 f44531b;

                        {
                            this.f44531b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f44531b.f44552b.a();
                                    return;
                                default:
                                    this.f44531b.f44552b.A();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    qg.m mVar = (qg.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof qg.b)) {
                        this.f44551a[i11].f(mVar.e(), 28, 28, null);
                        this.f44551a[i11].setOnClickListener(new sa(this, i11, mVar, 20));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f44551a[i11].setImageResource(R.drawable.msg_add);
                    this.f44551a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final t1 f44531b;

                        {
                            this.f44531b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f44531b.f44552b.a();
                                    return;
                                default:
                                    this.f44531b.f44552b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f44551a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            bk0[] bk0VarArr = this.f44551a;
            if (i10 < bk0VarArr.length) {
                if (this.f44556r == null || this.h != i10) {
                    bk0 bk0Var = bk0VarArr[i10];
                    if (bk0Var != null) {
                        Drawable drawable = bk0Var.getDrawable();
                        if (drawable instanceof yj0) {
                            yj0 yj0Var = (yj0) drawable;
                            yj0Var.M(0);
                            yj0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f44556r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f44554f != i10) {
                        if (this.e) {
                            this.e = false;
                            AndroidUtilities.updateImageViewImageAnimated(bk0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f44555n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f44556r = duration;
                        duration.setInterpolator(es.f24771f);
                        this.f44556r.addUpdateListener(new ki.a(this, 10));
                        this.f44556r.addListener(new fi1(this, 12));
                        this.f44556r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f44552b.x().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f44556r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.Components.voip.m2(childAt, 24));
                            return true;
                        }
                    } else if (this.f44554f != i10) {
                        a(i10);
                        post(new org.telegram.ui.Components.voip.m2(childAt, 24));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bk0 bk0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f44554f;
        bk0[] bk0VarArr = this.f44551a;
        bk0 bk0Var2 = bk0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            bk0Var = bk0VarArr[i11];
        } else {
            bk0Var = null;
        }
        float f12 = 0.0f;
        if (bk0Var != null) {
            f7 = this.f44555n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.q.y(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((bk0Var2.getWidth() - bk0Var2.getPaddingLeft()) - bk0Var2.getPaddingRight(), (bk0Var2.getHeight() - bk0Var2.getPaddingTop()) - bk0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (bk0Var2.getWidth() / 2.0f) + bk0Var2.getX();
        int i12 = this.f44554f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (bk0Var != null) {
            f11 = (bk0Var.getWidth() / 2.0f) + bk0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (bk0Var2.getHeight() / 2.0f) + bk0Var2.getY(), dp, this.f44553c);
    }

    public void setDelegate(s1 s1Var) {
        this.f44552b = s1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f44554f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f44551a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
