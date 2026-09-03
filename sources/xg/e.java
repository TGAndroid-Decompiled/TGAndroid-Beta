package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import hg.j1;
import java.util.HashSet;
import k7.c6;
import k7.e6;
import lf.p0;
import lf.q0;
import mh.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pr;
import org.telegram.ui.te;
import org.telegram.ui.xn;
import qh.e3;
public class e extends FrameLayout implements xd.b {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final RectF H;
    public float B;
    public final Paint C;
    public int D;
    public final o[] f50602a;
    public final View.OnClickListener[] f50603b;
    public final te[] f50604c;
    public d d;
    public final FrameLayout f50605e;
    public final HashSet f50606f;
    public final g6 h;
    public final og.a f50607n;
    public final rg.a f50608r;
    public qg.b f50609s;
    public final xd.a v;
    public final xd.a f50610w;
    public float f50611x;
    public float f50612y;

    static {
        int i10 = R.drawable.msg_search;
        int i11 = R.drawable.input_gift_s;
        int i12 = R.drawable.input_message;
        int i13 = R.drawable.msg_help;
        E = new int[]{i10, i11, i12, i13, i13};
        F = new int[]{0};
        G = new int[]{1, 2, 3, 4};
        H = new RectF();
    }

    public e(Context context, og.a aVar, g6 g6Var, rg.a aVar2) {
        super(context);
        this.f50602a = new o[5];
        this.f50603b = new View.OnClickListener[5];
        this.f50604c = new te[5];
        this.f50606f = new HashSet();
        pr prVar = pr.h;
        this.v = new xd.a(99, this, prVar, 320L, false);
        this.f50610w = new xd.a(100, this, prVar, 320L, false);
        this.C = new Paint(1);
        this.D = 0;
        this.f50607n = aVar;
        this.f50608r = aVar2;
        this.h = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50605e = frameLayout;
        frameLayout.setClipToOutline(true);
        j1 j1Var = q0.f12504a;
        frameLayout.setOutlineProvider(new p0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, c6.e(-1, 44, 16));
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 99) {
            invalidate();
            return;
        }
        if (i10 == 100) {
            a();
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.f50602a;
            if (i11 < oVarArr.length && oVarArr[i11] != null && i12 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i10;
        float f10 = 0.0f;
        this.f50612y = 0.0f;
        this.B = 0.0f;
        o[] oVarArr = this.f50602a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                wg.a aVar = (wg.a) oVar.f356b;
                float f11 = ((xd.a) oVar.f357c).f50541e * this.f50611x;
                if (f11 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                aVar.setVisibility(i10);
                aVar.setAlpha(f11);
                aVar.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
                aVar.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
            }
        }
        int[] iArr2 = F;
        o oVar2 = oVarArr[iArr2[0]];
        if (oVar2 != null) {
            float dp = ((xd.a) oVar2.f357c).f50541e * AndroidUtilities.dp(54.0f);
            ((wg.a) oVar2.f356b).setTranslationX(AndroidUtilities.dp(1.0f) + this.f50612y);
            this.f50612y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = G;
            if (i11 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i11]];
            if (oVar3 != null) {
                wg.a aVar2 = (wg.a) oVar3.f356b;
                float dp2 = ((xd.a) oVar3.f357c).f50541e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.B);
                this.B += dp2;
            }
            i11++;
        }
        if (this.f50611x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                wg.a aVar3 = (wg.a) oVar4.f356b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f50611x) * this.f50612y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                o oVar5 = oVarArr[iArr[i12]];
                if (oVar5 != null) {
                    wg.a aVar4 = (wg.a) oVar5.f356b;
                    aVar4.setTranslationX(((1.0f - this.f50611x) * this.B) + aVar4.getTranslationX());
                }
            }
            float f12 = this.f50612y;
            float f13 = this.f50611x;
            this.f50612y = f12 * f13;
            this.B *= f13;
        }
        float f14 = this.f50610w.f50541e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f50606f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f10 = Math.max(f10, childAt.getRight());
                }
            }
            if (measuredWidth > f10) {
                f10 = (measuredWidth + f10) / 2.0f;
                measuredWidth = f10;
            }
            this.f50612y = AndroidUtilities.lerp(this.f50612y, measuredWidth - AndroidUtilities.dp(3.33f), f14);
            this.B = AndroidUtilities.lerp(this.B, (getMeasuredWidth() - f10) - AndroidUtilities.dp(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.f50612y;
            float f16 = this.B;
            vg.f fVar = ((te) dVar).f41524b.P;
            fVar.f49329x = f15;
            fVar.f49330y = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z4) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = F[0];
        o[] oVarArr = this.f50602a;
        o oVar = oVarArr[i12];
        if (oVar != null) {
            if (((xd.a) oVar.f357c).f50542f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            o oVar2 = oVarArr[G[i13]];
            if (oVar2 != null) {
                if (((xd.a) oVar2.f357c).f50542f) {
                    i10 = AndroidUtilities.dp(54.0f);
                } else {
                    i10 = 0;
                }
                dp2 += i10;
            }
        }
        FrameLayout frameLayout = this.f50605e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != dp || marginLayoutParams.rightMargin != dp2) {
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp2;
            if (z4) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i10, boolean z4, boolean z10) {
        Object[] objArr;
        if (i10 >= 0) {
            o[] oVarArr = this.f50602a;
            if (i10 < oVarArr.length && ((objArr = oVarArr[i10]) != 0 || z4)) {
                if (objArr == 0) {
                    xd.a aVar = new xd.a((i10 << 16) | 1, this, pr.h, 300L, false);
                    wg.a d = wg.a.d(getContext(), this.f50607n, this.f50608r, this.h, E[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    e6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new x0(this, i10, 26));
                    addView(d, c6.c(56.0f, 56));
                    ?? obj = new Object();
                    obj.f356b = d;
                    obj.f357c = aVar;
                    oVarArr[i10] = obj;
                    a();
                }
                ((xd.a) oVarArr[i10].f357c).a(z4, z10);
            }
        }
    }

    public final void d(boolean z4) {
        boolean z10 = false;
        z10 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z11 = false;
            for (int i10 = 0; i10 < getContainer().getChildCount(); i10++) {
                View childAt = getContainer().getChildAt(i10);
                if (this.f50606f.contains(childAt) && childAt.getVisibility() == 0) {
                    z11 = true;
                }
            }
            z10 = z11;
        }
        this.f50610w.a(z10, z4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f50611x * 255.0f * this.v.f50541e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.B;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = H;
            rectF.set(this.f50612y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
            int i11 = this.D;
            Paint paint = this.C;
            paint.setColor(i11);
            paint.setAlpha(i10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f50605e && this.f50609s != null) {
            RectF rectF = H;
            rectF.set(this.f50612y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.B, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f50609s.setBounds(rect);
            this.f50609s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public FrameLayout getContainer() {
        return this.f50605e;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        b(false);
        super.onMeasure(i10, i11);
        a();
    }

    public void setAccentColor(int i10) {
        this.D = i10;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.f50611x != f10) {
            this.f50611x = f10;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d(false);
    }

    @Override
    public final void z(float f10, int i10) {
        o oVar;
        e3 e3Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.f50602a;
            if (i11 < oVarArr.length && (oVar = oVarArr[i11]) != null && i12 == 1 && ((xd.a) oVar.f357c).f50542f) {
                te teVar = this.f50604c[i11];
                if (teVar != null) {
                    final wg.a aVar = (wg.a) oVar.f356b;
                    boolean z4 = oVar.f355a;
                    int i13 = teVar.f41523a;
                    final xn xnVar = teVar.f41524b;
                    switch (i13) {
                        case 24:
                            if (xnVar.G0 == null && !z4 && (((e3Var = xnVar.I0) == null || !e3Var.S) && n40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xn xnVar2 = xnVar;
                                                if (xnVar2.getParentActivity() != null) {
                                                    float f11 = xnVar2.v.e(2).d / AndroidUtilities.density;
                                                    wg.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (xnVar2.U0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    qh.e3 e3Var2 = new qh.e3(xnVar2.getParentActivity(), 3);
                                                    xnVar2.I0 = e3Var2;
                                                    e3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    xnVar2.I0.p(false);
                                                    qh.e3 e3Var3 = xnVar2.I0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (e3Var3.getMeasuredWidth() < 0) {
                                                        e3Var3.D = string;
                                                    } else {
                                                        e3Var3.E.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    xnVar2.I0.l(1.0f, (-width) + 7.33f);
                                                    xnVar2.U0.addView(xnVar2.I0, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    qh.e3 e3Var4 = xnVar2.I0;
                                                    e3Var4.f45272i0 = new lf(xnVar2, 21);
                                                    e3Var4.u();
                                                    org.telegram.ui.Components.n40.f29376f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                xn xnVar3 = xnVar;
                                                if (xnVar3.getParentActivity() != null) {
                                                    float f12 = xnVar3.v.e(2).d / AndroidUtilities.density;
                                                    wg.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (xnVar3.U0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    qh.e3 e3Var5 = new qh.e3(xnVar3.getParentActivity(), 3);
                                                    xnVar3.G0 = e3Var5;
                                                    e3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    xnVar3.G0.p(false);
                                                    xnVar3.G0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    xnVar3.G0.l(1.0f, (-width2) + 7.33f);
                                                    xnVar3.U0.addView(xnVar3.G0, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    qh.e3 e3Var6 = xnVar3.G0;
                                                    e3Var6.f45272i0 = new ng(xnVar3, 0);
                                                    e3Var6.u();
                                                    org.telegram.ui.Components.n40.h.b();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, 400L);
                                break;
                            }
                            break;
                        default:
                            if (xnVar.I0 == null && !z4 && n40.f29376f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xn xnVar2 = xnVar;
                                                if (xnVar2.getParentActivity() != null) {
                                                    float f11 = xnVar2.v.e(2).d / AndroidUtilities.density;
                                                    wg.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (xnVar2.U0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    qh.e3 e3Var2 = new qh.e3(xnVar2.getParentActivity(), 3);
                                                    xnVar2.I0 = e3Var2;
                                                    e3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    xnVar2.I0.p(false);
                                                    qh.e3 e3Var3 = xnVar2.I0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (e3Var3.getMeasuredWidth() < 0) {
                                                        e3Var3.D = string;
                                                    } else {
                                                        e3Var3.E.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    xnVar2.I0.l(1.0f, (-width) + 7.33f);
                                                    xnVar2.U0.addView(xnVar2.I0, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    qh.e3 e3Var4 = xnVar2.I0;
                                                    e3Var4.f45272i0 = new lf(xnVar2, 21);
                                                    e3Var4.u();
                                                    org.telegram.ui.Components.n40.f29376f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                xn xnVar3 = xnVar;
                                                if (xnVar3.getParentActivity() != null) {
                                                    float f12 = xnVar3.v.e(2).d / AndroidUtilities.density;
                                                    wg.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (xnVar3.U0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    qh.e3 e3Var5 = new qh.e3(xnVar3.getParentActivity(), 3);
                                                    xnVar3.G0 = e3Var5;
                                                    e3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    xnVar3.G0.p(false);
                                                    xnVar3.G0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    xnVar3.G0.l(1.0f, (-width2) + 7.33f);
                                                    xnVar3.U0.addView(xnVar3.G0, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    qh.e3 e3Var6 = xnVar3.G0;
                                                    e3Var6.f45272i0 = new ng(xnVar3, 0);
                                                    e3Var6.u();
                                                    org.telegram.ui.Components.n40.h.b();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, 400L);
                                break;
                            }
                            break;
                    }
                }
                oVar.f355a = true;
            }
        }
    }
}
