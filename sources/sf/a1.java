package sf;

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
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xp;
import org.telegram.ui.n31;
public abstract class a1 extends LinearLayout {
    public boolean A;
    public boolean B;
    public final c6 f47738a;
    public final TextView f47739b;
    public final TextView[] f47740c;
    public final ImageView d;
    public final FrameLayout f47741e;
    public final ViewGroup[] f47742f;
    public final TextView[] h;
    public final TextView[][] f47743n;
    public final xp f47744r;
    public final FrameLayout f47745s;
    public final LinearLayout v;
    public int f47746w;
    public int f47747x;
    public boolean f47748y;

    public a1(Context context, c6 c6Var) {
        super(context);
        int i10;
        float f9;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f47740c = new TextView[2];
        this.f47742f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f47743n = new TextView[7];
        this.f47746w = 1;
        this.f47747x = 0;
        this.f47748y = true;
        this.f47738a = c6Var;
        setOrientation(1);
        setClipChildren(false);
        int i17 = 0;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            if (i17 == 0) {
                ViewGroup n31Var = new n31(context, 11);
                n31Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f47739b = textView;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView.setGravity(i12);
                textView.setTextSize(1, 16.0f);
                n31Var.addView(textView, f6.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i17] = new TextView(context);
                TextView textView2 = this.h[i17];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView2.setGravity(i13);
                this.h[i17].setTextSize(1, 13.0f);
                this.h[i17].setTextColor(g6.v0(g6.f23450z6, c6Var));
                n31Var.addView(this.h[i17], f6.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f47745s = new FrameLayout(context);
                this.f47743n[i17] = new TextView[2];
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f47743n[i17][i19] = new TextView(context);
                    this.f47743n[i17][i19].setTextSize(1, 14.0f);
                    this.f47743n[i17][i19].setTextColor(g6.v0(g6.f23450z6, c6Var));
                    TextView textView3 = this.f47743n[i17][i19];
                    if (LocaleController.isRTL) {
                        i16 = 3;
                    } else {
                        i16 = 5;
                    }
                    textView3.setGravity(i16);
                    this.f47745s.addView(this.f47743n[i17][i19], f6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    this.f47740c[i20] = new TextView(context);
                    this.f47740c[i20].setTextSize(1, 14.0f);
                    this.f47740c[i20].setTextColor(g6.v0(g6.f23450z6, c6Var));
                    TextView textView4 = this.f47740c[i20];
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView4.setGravity(i15);
                    this.f47745s.addView(this.f47740c[i20], f6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23450z6, c6Var), PorterDuff.Mode.SRC_IN));
                this.f47745s.addView(imageView, f6.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.f47745s, new LinearLayout.LayoutParams(f6.z(-1.0f), f6.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                xp xpVar = new xp(context);
                this.f47744r = xpVar;
                xpVar.getDrawable().F = true;
                xpVar.setTextSize(AndroidUtilities.dp(13.0f));
                xpVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                xpVar.setGravity(i14);
                int dp = AndroidUtilities.dp(8.0f);
                int i21 = g6.f23260o6;
                int v02 = g6.v0(i21, c6Var);
                a(v02);
                int l1 = g6.l1(0.1f, v02);
                int v03 = g6.v0(i21, c6Var);
                a(v03);
                int l12 = g6.l1(0.22f, v03);
                xpVar.setBackground(g6.i0(dp, dp, dp, dp, l1, l12, l12));
                int v04 = g6.v0(i21, c6Var);
                a(v04);
                xpVar.setTextColor(v04);
                xpVar.getDrawable().v = 0.6f;
                xpVar.setVisibility(8);
                this.v.addView(xpVar, f6.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f47741e = frameLayout;
                frameLayout.addView(this.v, f6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                n31Var.addView(frameLayout, f6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f47742f[i17] = n31Var;
                addView(n31Var, f6.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup g10 = x3.g(context, 0);
                this.h[i17] = new TextView(context);
                this.h[i17].setTextSize(1, 14.0f);
                this.h[i17].setTextColor(g6.v0(g6.G6, c6Var));
                TextView textView5 = this.h[i17];
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f47743n[i17] = new TextView[2];
                for (int i22 = 0; i22 < 2; i22++) {
                    this.f47743n[i17][i22] = new TextView(context);
                    this.f47743n[i17][i22].setTextSize(1, 14.0f);
                    this.f47743n[i17][i22].setTextColor(g6.v0(g6.f23450z6, c6Var));
                    TextView textView6 = this.f47743n[i17][i22];
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    textView6.setGravity(i11);
                    frameLayout2.addView(this.f47743n[i17][i22], f6.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    g10.addView(frameLayout2, f6.q(-2, -1, 51));
                    g10.addView(this.h[i17], f6.q(-1, -1, 53));
                } else {
                    g10.addView(this.h[i17], f6.q(-2, -1, 51));
                    g10.addView(frameLayout2, f6.q(-1, -1, 53));
                }
                this.f47742f[i17] = g10;
                if (i17 == 1) {
                    f9 = 1.0f;
                } else {
                    f9 = 11.66f;
                }
                if (i17 == 6) {
                    f10 = 16.66f;
                } else {
                    f10 = 0.0f;
                }
                addView(g10, f6.u(-1.0f, -2.0f, 51, 18.0f, f9, 28.0f, f10));
            }
            i17++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: sf.a1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        super.onDraw(canvas);
        if (this.A) {
            Paint T0 = g6.T0("paintDivider", this.f47738a);
            if (T0 == null) {
                T0 = g6.f23183k0;
            }
            Paint paint = T0;
            float f10 = 21.33f;
            if (LocaleController.isRTL) {
                f9 = 0.0f;
            } else {
                f9 = 21.33f;
            }
            float dp = AndroidUtilities.dp(f9);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int dp;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.B) {
            int dp2 = AndroidUtilities.dp(60.0f);
            int i12 = this.f47746w;
            xp xpVar = this.f47744r;
            if (i12 <= 2 && xpVar.getVisibility() != 0) {
                dp = 0;
            } else {
                int dp3 = AndroidUtilities.dp(15.0f) + this.f47747x;
                if (xpVar.getVisibility() == 0) {
                    f9 = 21.0f;
                } else {
                    f9 = 0.0f;
                }
                dp = AndroidUtilities.dp(f9) + dp3;
            }
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max(dp2, dp) + (this.A ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xp xpVar = this.f47744r;
        if (xpVar != null && xpVar.getVisibility() == 0) {
            float x4 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f47742f;
            float x10 = x4 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f47741e;
            float x11 = x10 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f47745s;
            return xpVar.getClickBounds().contains((int) ((x11 - frameLayout2.getX()) - xpVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - xpVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        xp xpVar = this.f47744r;
        if (xpVar != null) {
            xpVar.setOnClickListener(onClickListener);
        }
    }
}
