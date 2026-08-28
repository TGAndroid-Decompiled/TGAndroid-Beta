package pf;

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
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.b81;
public abstract class b1 extends LinearLayout {
    public boolean A;
    public boolean B;
    public final b6 f45571a;
    public final TextView f45572b;
    public final TextView[] f45573c;
    public final ImageView d;
    public final FrameLayout f45574e;
    public final ViewGroup[] f45575f;
    public final TextView[] h;
    public final TextView[][] f45576n;
    public final tp f45577r;
    public final FrameLayout f45578s;
    public final LinearLayout v;
    public int f45579w;
    public int f45580x;
    public boolean f45581y;

    public b1(Context context, b6 b6Var) {
        super(context);
        int i9;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f45573c = new TextView[2];
        this.f45575f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f45576n = new TextView[7];
        this.f45579w = 1;
        this.f45580x = 0;
        this.f45581y = true;
        this.f45571a = b6Var;
        setOrientation(1);
        setClipChildren(false);
        int i16 = 0;
        for (int i17 = 7; i16 < i17; i17 = 7) {
            if (i16 == 0) {
                ViewGroup b81Var = new b81(context, 8);
                b81Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f45572b = textView;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11);
                textView.setTextSize(1, 16.0f);
                b81Var.addView(textView, e6.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i16] = new TextView(context);
                TextView textView2 = this.h[i16];
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12);
                this.h[i16].setTextSize(1, 13.0f);
                this.h[i16].setTextColor(f6.v0(f6.f23386z6, b6Var));
                b81Var.addView(this.h[i16], e6.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f45578s = new FrameLayout(context);
                this.f45576n[i16] = new TextView[2];
                for (int i18 = 0; i18 < 2; i18++) {
                    this.f45576n[i16][i18] = new TextView(context);
                    this.f45576n[i16][i18].setTextSize(1, 14.0f);
                    this.f45576n[i16][i18].setTextColor(f6.v0(f6.f23386z6, b6Var));
                    TextView textView3 = this.f45576n[i16][i18];
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView3.setGravity(i15);
                    this.f45578s.addView(this.f45576n[i16][i18], e6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f45573c[i19] = new TextView(context);
                    this.f45573c[i19].setTextSize(1, 14.0f);
                    this.f45573c[i19].setTextColor(f6.v0(f6.f23386z6, b6Var));
                    TextView textView4 = this.f45573c[i19];
                    if (LocaleController.isRTL) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    textView4.setGravity(i14);
                    this.f45578s.addView(this.f45573c[i19], e6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.f23386z6, b6Var), PorterDuff.Mode.SRC_IN));
                this.f45578s.addView(imageView, e6.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.f45578s, new LinearLayout.LayoutParams(e6.z(-1.0f), e6.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                tp tpVar = new tp(context);
                this.f45577r = tpVar;
                tpVar.getDrawable().F = true;
                tpVar.setTextSize(AndroidUtilities.dp(13.0f));
                tpVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                if (LocaleController.isRTL) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                tpVar.setGravity(i13);
                int dp = AndroidUtilities.dp(8.0f);
                int i20 = f6.o6;
                int v02 = f6.v0(i20, b6Var);
                a(v02);
                int l1 = f6.l1(0.1f, v02);
                int v03 = f6.v0(i20, b6Var);
                a(v03);
                int l12 = f6.l1(0.22f, v03);
                tpVar.setBackground(f6.i0(dp, dp, dp, dp, l1, l12, l12));
                int v04 = f6.v0(i20, b6Var);
                a(v04);
                tpVar.setTextColor(v04);
                tpVar.getDrawable().v = 0.6f;
                tpVar.setVisibility(8);
                this.v.addView(tpVar, e6.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f45574e = frameLayout;
                frameLayout.addView(this.v, e6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                b81Var.addView(frameLayout, e6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f45575f[i16] = b81Var;
                addView(b81Var, e6.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f12 = ll.f(context, 0);
                this.h[i16] = new TextView(context);
                this.h[i16].setTextSize(1, 14.0f);
                this.h[i16].setTextColor(f6.v0(f6.G6, b6Var));
                TextView textView5 = this.h[i16];
                if (LocaleController.isRTL) {
                    i9 = 5;
                } else {
                    i9 = 3;
                }
                textView5.setGravity(i9);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f45576n[i16] = new TextView[2];
                for (int i21 = 0; i21 < 2; i21++) {
                    this.f45576n[i16][i21] = new TextView(context);
                    this.f45576n[i16][i21].setTextSize(1, 14.0f);
                    this.f45576n[i16][i21].setTextColor(f6.v0(f6.f23386z6, b6Var));
                    TextView textView6 = this.f45576n[i16][i21];
                    if (LocaleController.isRTL) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    textView6.setGravity(i10);
                    frameLayout2.addView(this.f45576n[i16][i21], e6.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    f12.addView(frameLayout2, e6.q(-2, -1, 51));
                    f12.addView(this.h[i16], e6.q(-1, -1, 53));
                } else {
                    f12.addView(this.h[i16], e6.q(-2, -1, 51));
                    f12.addView(frameLayout2, e6.q(-1, -1, 53));
                }
                this.f45575f[i16] = f12;
                if (i16 == 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 11.66f;
                }
                if (i16 == 6) {
                    f11 = 16.66f;
                } else {
                    f11 = 0.0f;
                }
                addView(f12, e6.u(-1.0f, -2.0f, 51, 18.0f, f10, 28.0f, f11));
            }
            i16++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i9);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.A) {
            Paint T0 = f6.T0("paintDivider", this.f45571a);
            if (T0 == null) {
                T0 = f6.f23121k0;
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
    public final void onMeasure(int i9, int i10) {
        float f10;
        int dp;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (!this.B) {
            int dp2 = AndroidUtilities.dp(60.0f);
            int i11 = this.f45579w;
            tp tpVar = this.f45577r;
            if (i11 <= 2 && tpVar.getVisibility() != 0) {
                dp = 0;
            } else {
                int dp3 = AndroidUtilities.dp(15.0f) + this.f45580x;
                if (tpVar.getVisibility() == 0) {
                    f10 = 21.0f;
                } else {
                    f10 = 0.0f;
                }
                dp = AndroidUtilities.dp(f10) + dp3;
            }
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max(dp2, dp) + (this.A ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tp tpVar = this.f45577r;
        if (tpVar != null && tpVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f45575f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f45574e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f45578s;
            return tpVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - tpVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - tpVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        tp tpVar = this.f45577r;
        if (tpVar != null) {
            tpVar.setOnClickListener(onClickListener);
        }
    }
}
