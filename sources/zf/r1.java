package zf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import h7.z5;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.zb1;

public final class r1 extends LinearLayout {

    public final ri0[] f50684a;

    public q1 f50685b;

    public final Paint f50686c;
    public final int d;

    public boolean f50687e;

    public int f50688f;
    public int h;

    public float f50689n;

    public ValueAnimator f50690r;

    public r1(Context context, boolean z10) {
        super(context);
        List list = yf.m.f49979a;
        this.f50684a = new ri0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f50686c = paint;
        this.f50688f = 1;
        this.h = -1;
        this.f50689n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = yf.m.f49979a;
            if (i10 >= list2.size() + 2) {
                return;
            }
            ri0[] ri0VarArr = this.f50684a;
            boolean z11 = i10 == 0;
            boolean z12 = i10 == list2.size() + 1;
            ri0 ri0Var = new ri0(getContext());
            ri0Var.setPadding(AndroidUtilities.dp(z11 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(z12 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
            ri0Var.setLayoutParams(z5.l(1.0f, 0, 40));
            ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ri0VarArr[i11] = ri0Var;
            if (i10 == 0) {
                final int i12 = 0;
                this.f50684a[i11].setOnClickListener(new View.OnClickListener(this) {

                    public final r1 f50660b;

                    {
                        this.f50660b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.f50660b.f50685b.a();
                                break;
                            default:
                                this.f50660b.f50685b.A();
                                break;
                        }
                    }
                });
            } else if (i10 > 0 && i10 <= list2.size()) {
                yf.m mVar = (yf.m) list2.get(i10 - 1);
                if (z10 || !(mVar instanceof yf.b)) {
                    this.f50684a[i11].f(mVar.e(), 28, 28, null);
                    this.f50684a[i11].setOnClickListener(new gh.v2(this, i11, mVar, 21));
                }
                i10++;
            } else if (i10 == list2.size() + 1) {
                this.f50684a[i11].setImageResource(R.drawable.msg_add);
                final int i13 = 1;
                this.f50684a[i11].setOnClickListener(new View.OnClickListener(this) {

                    public final r1 f50660b;

                    {
                        this.f50660b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.f50660b.f50685b.a();
                                break;
                            default:
                                this.f50660b.f50685b.A();
                                break;
                        }
                    }
                });
            }
            addView(this.f50684a[i11]);
            i11++;
            i10++;
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            ri0[] ri0VarArr = this.f50684a;
            if (i10 >= ri0VarArr.length) {
                return;
            }
            if (this.f50690r == null || this.h != i10) {
                ri0 ri0Var = ri0VarArr[i10];
                if (ri0Var != null) {
                    Drawable drawable = ri0Var.getDrawable();
                    if (drawable instanceof oi0) {
                        oi0 oi0Var = (oi0) drawable;
                        oi0Var.K(0);
                        oi0Var.start();
                    }
                }
                ValueAnimator valueAnimator = this.f50690r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.f50688f == i10) {
                    return;
                }
                if (this.f50687e) {
                    this.f50687e = false;
                    AndroidUtilities.updateImageViewImageAnimated(ri0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i10;
                this.f50689n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.f50690r = duration;
                duration.setInterpolator(er.f28122f);
                this.f50690r.addUpdateListener(new lh.m2(this, 23));
                this.f50690r.addListener(new zb1(this, 13));
                this.f50690r.start();
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f50685b.x().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x8 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x8 >= childAt.getLeft() && x8 <= childAt.getRight()) {
                    if (this.f50690r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new qf.b(childAt, 25));
                            return true;
                        }
                    } else if (this.f50688f != i10) {
                        a(i10);
                        post(new qf.b(childAt, 25));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width;
        super.onDraw(canvas);
        int i10 = this.f50688f;
        ri0[] ri0VarArr = this.f50684a;
        ri0 ri0Var = ri0VarArr[i10];
        int i11 = this.h;
        ri0 ri0Var2 = i11 != -1 ? ri0VarArr[i11] : null;
        float fDp = 0.0f;
        float f10 = ri0Var2 != null ? this.f50689n : 0.0f;
        float fA = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            fA = (f10 <= 0.25f || f10 >= 0.5f) ? org.telegram.messenger.y1.a(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float fDp2 = (AndroidUtilities.dp(3.0f) * fA) + (Math.min((ri0Var.getWidth() - ri0Var.getPaddingLeft()) - ri0Var.getPaddingRight(), (ri0Var.getHeight() - ri0Var.getPaddingTop()) - ri0Var.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width2 = (ri0Var.getWidth() / 2.0f) + ri0Var.getX();
        int i12 = this.f50688f;
        int i13 = this.d;
        float fDp3 = (i12 == i13 + 1 ? AndroidUtilities.dp(4.0f) : 0.0f) + width2;
        if (ri0Var2 != null) {
            width = (ri0Var2.getWidth() / 2.0f) + ri0Var2.getX();
        } else {
            width = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            fDp = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(fDp3, width + fDp, f10), (ri0Var.getHeight() / 2.0f) + ri0Var.getY(), fDp2, this.f50686c);
    }

    public void setDelegate(q1 q1Var) {
        this.f50685b = q1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f50688f = i10;
        if (this.f50687e) {
            this.f50687e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f50684a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
