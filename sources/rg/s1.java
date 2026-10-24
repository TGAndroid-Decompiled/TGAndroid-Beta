package rg;

import ai.ia;
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
import ei.i6;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.ue1;
import w7.z5;
public final class s1 extends LinearLayout {
    public final ak0[] f46065a;
    public r1 f46066b;
    public final Paint f46067c;
    public final int d;
    public boolean e;
    public int f46068f;
    public int h;
    public float f46069n;
    public ValueAnimator f46070r;

    public s1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f7;
        float f10;
        List list = qg.m.f44983a;
        this.f46065a = new ak0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f46067c = paint;
        this.f46068f = 1;
        this.h = -1;
        this.f46069n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = qg.m.f44983a;
            if (i10 < list2.size() + 2) {
                ak0[] ak0VarArr = this.f46065a;
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
                imageView.setLayoutParams(z5.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                ak0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f46065a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final s1 f46040b;

                        {
                            this.f46040b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f46040b.f46066b.a();
                                    return;
                                default:
                                    this.f46040b.f46066b.z();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    qg.m mVar = (qg.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof qg.b)) {
                        this.f46065a[i11].f(mVar.e(), 28, 28, null);
                        this.f46065a[i11].setOnClickListener(new ia(this, i11, mVar, 21));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f46065a[i11].setImageResource(R.drawable.msg_add);
                    this.f46065a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final s1 f46040b;

                        {
                            this.f46040b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f46040b.f46066b.a();
                                    return;
                                default:
                                    this.f46040b.f46066b.z();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f46065a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            ak0[] ak0VarArr = this.f46065a;
            if (i10 < ak0VarArr.length) {
                if (this.f46070r == null || this.h != i10) {
                    ak0 ak0Var = ak0VarArr[i10];
                    if (ak0Var != null) {
                        Drawable drawable = ak0Var.getDrawable();
                        if (drawable instanceof xj0) {
                            xj0 xj0Var = (xj0) drawable;
                            xj0Var.M(0);
                            xj0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f46070r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f46068f != i10) {
                        if (this.e) {
                            this.e = false;
                            AndroidUtilities.updateImageViewImageAnimated(ak0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f46069n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f46070r = duration;
                        duration.setInterpolator(zr.f33337f);
                        this.f46070r.addUpdateListener(new i6(this, 17));
                        this.f46070r.addListener(new ue1(this, 15));
                        this.f46070r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f46066b.w().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f46070r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.a2(childAt, 13));
                            return true;
                        }
                    } else if (this.f46068f != i10) {
                        a(i10);
                        post(new org.telegram.ui.web.a2(childAt, 13));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ak0 ak0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f46068f;
        ak0[] ak0VarArr = this.f46065a;
        ak0 ak0Var2 = ak0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            ak0Var = ak0VarArr[i11];
        } else {
            ak0Var = null;
        }
        float f12 = 0.0f;
        if (ak0Var != null) {
            f7 = this.f46069n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? org.telegram.messenger.v0.y(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((ak0Var2.getWidth() - ak0Var2.getPaddingLeft()) - ak0Var2.getPaddingRight(), (ak0Var2.getHeight() - ak0Var2.getPaddingTop()) - ak0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (ak0Var2.getWidth() / 2.0f) + ak0Var2.getX();
        int i12 = this.f46068f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (ak0Var != null) {
            f11 = (ak0Var.getWidth() / 2.0f) + ak0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f7), (ak0Var2.getHeight() / 2.0f) + ak0Var2.getY(), dp, this.f46067c);
    }

    public void setDelegate(r1 r1Var) {
        this.f46066b = r1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f46068f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f46065a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
