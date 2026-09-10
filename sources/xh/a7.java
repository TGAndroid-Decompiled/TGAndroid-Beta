package xh;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.wr;
public final class a7 extends FrameLayout {
    public final int f45250a;
    public Object f45251b;

    public a7(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.f45250a = i10;
        this.f45251b = p2Var;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int dp;
        switch (this.f45250a) {
            case 0:
                if (((z7) this.f45251b).f46393f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                int action = motionEvent.getAction();
                zh.x0 x0Var = zh.x0.Z;
                if (x0Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(x0Var.G.getX(), x0Var.G.getY());
                    boolean dispatchTouchEvent = x0Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        x0Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = x0Var.f49033x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!x0Var.f49033x.isInProgress() && ((GestureDetector) x0Var.f49034y.f12721b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    x0Var.E = false;
                    x0Var.F = false;
                    o1.k kVar = x0Var.P;
                    if (!kVar.f14127f) {
                        float f7 = x0Var.N;
                        kVar.f14125b = f7;
                        kVar.f14126c = true;
                        o1.l lVar = kVar.f14134u;
                        int i10 = x0Var.J;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f14140i = dp;
                        x0Var.P.f();
                    }
                    o1.k kVar2 = x0Var.Q;
                    if (!kVar2.f14127f) {
                        float f11 = x0Var.O;
                        kVar2.f14125b = f11;
                        kVar2.f14126c = true;
                        kVar2.f14134u.f14140i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - x0Var.K) - AndroidUtilities.dp(16.0f));
                        x0Var.Q.f();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f45250a) {
            case 3:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                zh.x0 x0Var = zh.x0.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(x0Var.f49026b, x0Var.d, x0Var.f49027c);
                x0Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f45250a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                yg.s sVar = (yg.s) this.f45251b;
                if (sVar.K && z10) {
                    sVar.f47140w.setTranslationY(-sVar.f47135c.getMeasuredHeight());
                    int measuredHeight = sVar.f47135c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f47142y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.f47142y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f45250a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f45251b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public a7(Context context) {
        super(context);
        this.f45250a = 3;
    }

    public a7(Context context, String str, zh.b bVar) {
        super(context);
        this.f45250a = 2;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.06f, bVar.F0(i10))));
        LinearLayout f7 = em.f(context, 1);
        addView(f7, w7.a6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f45251b = o6Var;
        o6Var.b(0.6f, 450L, wr.h);
        o6Var.setTextSize(AndroidUtilities.dp(17.0f));
        o6Var.setTextColor(bVar.F0(i10));
        o6Var.setScaleProperty(0.7f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setAllowCancel(true);
        f7.addView(o6Var, w7.a6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.F0(i10));
        textView.setGravity(17);
        f7.addView(textView, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }
}
