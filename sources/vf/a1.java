package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.c51;
public abstract class a1 extends LinearLayout {
    public boolean B;
    public boolean C;
    public final g6 f48978a;
    public final TextView f48979b;
    public final TextView[] f48980c;
    public final ImageView d;
    public final FrameLayout f48981e;
    public final ViewGroup[] f48982f;
    public final TextView[] h;
    public final TextView[][] f48983n;
    public final dq f48984r;
    public final FrameLayout f48985s;
    public final LinearLayout v;
    public int f48986w;
    public int f48987x;
    public boolean f48988y;

    public a1(Context context, g6 g6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f48980c = new TextView[2];
        this.f48982f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f48983n = new TextView[7];
        this.f48986w = 1;
        this.f48987x = 0;
        this.f48988y = true;
        this.f48978a = g6Var;
        setOrientation(1);
        setClipChildren(false);
        int i17 = 0;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            if (i17 == 0) {
                ViewGroup c51Var = new c51(context, 11);
                c51Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f48979b = textView;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView.setGravity(i12);
                textView.setTextSize(1, 16.0f);
                c51Var.addView(textView, c6.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i17] = new TextView(context);
                TextView textView2 = this.h[i17];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView2.setGravity(i13);
                this.h[i17].setTextSize(1, 13.0f);
                this.h[i17].setTextColor(k6.v0(k6.f22053z6, g6Var));
                c51Var.addView(this.h[i17], c6.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f48985s = new FrameLayout(context);
                this.f48983n[i17] = new TextView[2];
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f48983n[i17][i19] = new TextView(context);
                    this.f48983n[i17][i19].setTextSize(1, 14.0f);
                    this.f48983n[i17][i19].setTextColor(k6.v0(k6.f22053z6, g6Var));
                    TextView textView3 = this.f48983n[i17][i19];
                    if (LocaleController.isRTL) {
                        i16 = 3;
                    } else {
                        i16 = 5;
                    }
                    textView3.setGravity(i16);
                    this.f48985s.addView(this.f48983n[i17][i19], c6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    this.f48980c[i20] = new TextView(context);
                    this.f48980c[i20].setTextSize(1, 14.0f);
                    this.f48980c[i20].setTextColor(k6.v0(k6.f22053z6, g6Var));
                    TextView textView4 = this.f48980c[i20];
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView4.setGravity(i15);
                    this.f48985s.addView(this.f48980c[i20], c6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.f22053z6, g6Var), PorterDuff.Mode.SRC_IN));
                this.f48985s.addView(imageView, c6.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.f48985s, new LinearLayout.LayoutParams(c6.z(-1.0f), c6.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                dq dqVar = new dq(context);
                this.f48984r = dqVar;
                dqVar.getDrawable().F = true;
                dqVar.setTextSize(AndroidUtilities.dp(13.0f));
                dqVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                dqVar.setGravity(i14);
                int dp = AndroidUtilities.dp(8.0f);
                int i21 = k6.f21857o6;
                int v02 = k6.v0(i21, g6Var);
                a(v02);
                int l1 = k6.l1(0.1f, v02);
                int v03 = k6.v0(i21, g6Var);
                a(v03);
                int l12 = k6.l1(0.22f, v03);
                dqVar.setBackground(k6.i0(dp, dp, dp, dp, l1, l12, l12));
                int v04 = k6.v0(i21, g6Var);
                a(v04);
                dqVar.setTextColor(v04);
                dqVar.getDrawable().v = 0.6f;
                dqVar.setVisibility(8);
                this.v.addView(dqVar, c6.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f48981e = frameLayout;
                frameLayout.addView(this.v, c6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                c51Var.addView(frameLayout, c6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f48982f[i17] = c51Var;
                addView(c51Var, c6.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f12 = y3.f(context, 0);
                this.h[i17] = new TextView(context);
                this.h[i17].setTextSize(1, 14.0f);
                this.h[i17].setTextColor(k6.v0(k6.G6, g6Var));
                TextView textView5 = this.h[i17];
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f48983n[i17] = new TextView[2];
                for (int i22 = 0; i22 < 2; i22++) {
                    this.f48983n[i17][i22] = new TextView(context);
                    this.f48983n[i17][i22].setTextSize(1, 14.0f);
                    this.f48983n[i17][i22].setTextColor(k6.v0(k6.f22053z6, g6Var));
                    TextView textView6 = this.f48983n[i17][i22];
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    textView6.setGravity(i11);
                    frameLayout2.addView(this.f48983n[i17][i22], c6.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    f12.addView(frameLayout2, c6.q(-2, -1, 51));
                    f12.addView(this.h[i17], c6.q(-1, -1, 53));
                } else {
                    f12.addView(this.h[i17], c6.q(-2, -1, 51));
                    f12.addView(frameLayout2, c6.q(-1, -1, 53));
                }
                this.f48982f[i17] = f12;
                if (i17 == 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 11.66f;
                }
                if (i17 == 6) {
                    f11 = 16.66f;
                } else {
                    f11 = 0.0f;
                }
                addView(f12, c6.u(-1.0f, -2.0f, 51, 18.0f, f10, 28.0f, f11));
            }
            i17++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: vf.a1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.B) {
            Paint T0 = k6.T0("paintDivider", this.f48978a);
            if (T0 == null) {
                T0 = k6.f21779k0;
            }
            Paint paint = T0;
            float f11 = 21.33f;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float dp = AndroidUtilities.dp(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int dp;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.C) {
            int dp2 = AndroidUtilities.dp(60.0f);
            int i12 = this.f48986w;
            dq dqVar = this.f48984r;
            if (i12 <= 2 && dqVar.getVisibility() != 0) {
                dp = 0;
            } else {
                int dp3 = AndroidUtilities.dp(15.0f) + this.f48987x;
                if (dqVar.getVisibility() == 0) {
                    f10 = 21.0f;
                } else {
                    f10 = 0.0f;
                }
                dp = AndroidUtilities.dp(f10) + dp3;
            }
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max(dp2, dp) + (this.B ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dq dqVar = this.f48984r;
        if (dqVar != null && dqVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f48982f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f48981e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f48985s;
            return dqVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - dqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - dqVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        dq dqVar = this.f48984r;
        if (dqVar != null) {
            dqVar.setOnClickListener(onClickListener);
        }
    }
}
