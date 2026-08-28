package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import bg.q1;
import ff.q0;
import ff.r0;
import g7.e6;
import g7.g6;
import gh.z0;
import java.util.HashSet;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t30;
import org.telegram.ui.oe;
import org.telegram.ui.qn;
public class e extends FrameLayout implements td.b {
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final RectF G;
    public float A;
    public final Paint B;
    public int C;
    public final o[] f47179a;
    public final View.OnClickListener[] f47180b;
    public final oe[] f47181c;
    public d d;
    public final FrameLayout f47182e;
    public final HashSet f47183f;
    public final b6 h;
    public final ig.a f47184n;
    public final lg.a f47185r;
    public kg.d f47186s;
    public final td.a v;
    public final td.a f47187w;
    public float f47188x;
    public float f47189y;

    static {
        int i9 = R.drawable.msg_search;
        int i10 = R.drawable.input_gift_s;
        int i11 = R.drawable.input_message;
        int i12 = R.drawable.msg_help;
        D = new int[]{i9, i10, i11, i12, i12};
        E = new int[]{0};
        F = new int[]{1, 2, 3, 4};
        G = new RectF();
    }

    public e(Context context, ig.a aVar, lg.a aVar2, b6 b6Var) {
        super(context);
        this.f47179a = new o[5];
        this.f47180b = new View.OnClickListener[5];
        this.f47181c = new oe[5];
        this.f47183f = new HashSet();
        gr grVar = gr.h;
        this.v = new td.a(99, this, grVar, 320L, false);
        this.f47187w = new td.a(100, this, grVar, 320L, false);
        this.B = new Paint(1);
        this.C = 0;
        this.f47184n = aVar;
        this.f47185r = aVar2;
        this.h = b6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47182e = frameLayout;
        frameLayout.setClipToOutline(true);
        q1 q1Var = r0.f6254a;
        frameLayout.setOutlineProvider(new q0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, e6.e(-1, 44, 16));
    }

    @Override
    public final void B(float f10, int i9) {
        o oVar;
        x3 x3Var;
        if (i9 == 99 || i9 == 100) {
            invalidate();
        }
        int i10 = i9 >> 16;
        int i11 = i9 & 65535;
        if (i10 >= 0) {
            o[] oVarArr = this.f47179a;
            if (i10 < oVarArr.length && (oVar = oVarArr[i10]) != null && i11 == 1 && ((td.a) oVar.f389c).f47776f) {
                oe oeVar = this.f47181c[i10];
                if (oeVar != null) {
                    final qg.a aVar = (qg.a) oVar.f388b;
                    boolean z10 = oVar.f387a;
                    int i12 = oeVar.f41127a;
                    final qn qnVar = oeVar.f41128b;
                    switch (i12) {
                        case 24:
                            if (qnVar.F0 == null && !z10 && (((x3Var = qnVar.H0) == null || !x3Var.R) && t30.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qn qnVar2 = qnVar;
                                                if (qnVar2.getParentActivity() != null) {
                                                    float f11 = qnVar2.v.e(2).d / AndroidUtilities.density;
                                                    qg.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (qnVar2.T0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    kh.x3 x3Var2 = new kh.x3(qnVar2.getParentActivity(), 3);
                                                    qnVar2.H0 = x3Var2;
                                                    x3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    qnVar2.H0.q(false);
                                                    kh.x3 x3Var3 = qnVar2.H0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (x3Var3.getMeasuredWidth() < 0) {
                                                        x3Var3.C = string;
                                                    } else {
                                                        x3Var3.D.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    qnVar2.H0.m(1.0f, (-width) + 7.33f);
                                                    qnVar2.T0.addView(qnVar2.H0, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    kh.x3 x3Var4 = qnVar2.H0;
                                                    x3Var4.f16352h0 = new gf(qnVar2, 21);
                                                    x3Var4.v();
                                                    org.telegram.ui.Components.t30.f32609f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                qn qnVar3 = qnVar;
                                                if (qnVar3.getParentActivity() != null) {
                                                    float f12 = qnVar3.v.e(2).d / AndroidUtilities.density;
                                                    qg.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (qnVar3.T0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    kh.x3 x3Var5 = new kh.x3(qnVar3.getParentActivity(), 3);
                                                    qnVar3.F0 = x3Var5;
                                                    x3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    qnVar3.F0.q(false);
                                                    qnVar3.F0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    qnVar3.F0.m(1.0f, (-width2) + 7.33f);
                                                    qnVar3.T0.addView(qnVar3.F0, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    kh.x3 x3Var6 = qnVar3.F0;
                                                    x3Var6.f16352h0 = new jg(qnVar3, 0);
                                                    x3Var6.v();
                                                    org.telegram.ui.Components.t30.h.b();
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
                            if (qnVar.H0 == null && !z10 && t30.f32609f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qn qnVar2 = qnVar;
                                                if (qnVar2.getParentActivity() != null) {
                                                    float f11 = qnVar2.v.e(2).d / AndroidUtilities.density;
                                                    qg.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (qnVar2.T0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    kh.x3 x3Var2 = new kh.x3(qnVar2.getParentActivity(), 3);
                                                    qnVar2.H0 = x3Var2;
                                                    x3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    qnVar2.H0.q(false);
                                                    kh.x3 x3Var3 = qnVar2.H0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (x3Var3.getMeasuredWidth() < 0) {
                                                        x3Var3.C = string;
                                                    } else {
                                                        x3Var3.D.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    qnVar2.H0.m(1.0f, (-width) + 7.33f);
                                                    qnVar2.T0.addView(qnVar2.H0, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    kh.x3 x3Var4 = qnVar2.H0;
                                                    x3Var4.f16352h0 = new gf(qnVar2, 21);
                                                    x3Var4.v();
                                                    org.telegram.ui.Components.t30.f32609f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                qn qnVar3 = qnVar;
                                                if (qnVar3.getParentActivity() != null) {
                                                    float f12 = qnVar3.v.e(2).d / AndroidUtilities.density;
                                                    qg.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (qnVar3.T0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    kh.x3 x3Var5 = new kh.x3(qnVar3.getParentActivity(), 3);
                                                    qnVar3.F0 = x3Var5;
                                                    x3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    qnVar3.F0.q(false);
                                                    qnVar3.F0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    qnVar3.F0.m(1.0f, (-width2) + 7.33f);
                                                    qnVar3.T0.addView(qnVar3.F0, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    kh.x3 x3Var6 = qnVar3.F0;
                                                    x3Var6.f16352h0 = new jg(qnVar3, 0);
                                                    x3Var6.v();
                                                    org.telegram.ui.Components.t30.h.b();
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
                oVar.f387a = true;
            }
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 99) {
            invalidate();
            return;
        }
        if (i9 == 100) {
            a();
            invalidate();
        }
        int i10 = i9 >> 16;
        int i11 = i9 & 65535;
        if (i10 >= 0) {
            o[] oVarArr = this.f47179a;
            if (i10 < oVarArr.length && oVarArr[i10] != null && i11 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i9;
        float f10 = 0.0f;
        this.f47189y = 0.0f;
        this.A = 0.0f;
        o[] oVarArr = this.f47179a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                qg.a aVar = (qg.a) oVar.f388b;
                float f11 = ((td.a) oVar.f389c).f47775e * this.f47188x;
                if (f11 > 0.0f) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                aVar.setVisibility(i9);
                aVar.setAlpha(f11);
                aVar.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
                aVar.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
            }
        }
        int[] iArr2 = E;
        o oVar2 = oVarArr[iArr2[0]];
        if (oVar2 != null) {
            float dp = ((td.a) oVar2.f389c).f47775e * AndroidUtilities.dp(54.0f);
            ((qg.a) oVar2.f388b).setTranslationX(AndroidUtilities.dp(1.0f) + this.f47189y);
            this.f47189y += dp;
        }
        int i10 = 0;
        while (true) {
            iArr = F;
            if (i10 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i10]];
            if (oVar3 != null) {
                qg.a aVar2 = (qg.a) oVar3.f388b;
                float dp2 = ((td.a) oVar3.f389c).f47775e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.A);
                this.A += dp2;
            }
            i10++;
        }
        if (this.f47188x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                qg.a aVar3 = (qg.a) oVar4.f388b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f47188x) * this.f47189y));
            }
            for (int i11 = 0; i11 < 4; i11++) {
                o oVar5 = oVarArr[iArr[i11]];
                if (oVar5 != null) {
                    qg.a aVar4 = (qg.a) oVar5.f388b;
                    aVar4.setTranslationX(((1.0f - this.f47188x) * this.A) + aVar4.getTranslationX());
                }
            }
            float f12 = this.f47189y;
            float f13 = this.f47188x;
            this.f47189y = f12 * f13;
            this.A *= f13;
        }
        float f14 = this.f47187w.f47775e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i12 = 0; i12 < getContainer().getChildCount(); i12++) {
                if (this.f47183f.contains(getContainer().getChildAt(i12))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f10 = Math.max(f10, childAt.getRight());
                }
            }
            if (measuredWidth > f10) {
                f10 = (measuredWidth + f10) / 2.0f;
                measuredWidth = f10;
            }
            this.f47189y = AndroidUtilities.lerp(this.f47189y, measuredWidth - AndroidUtilities.dp(3.33f), f14);
            this.A = AndroidUtilities.lerp(this.A, (getMeasuredWidth() - f10) - AndroidUtilities.dp(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.f47189y;
            float f16 = this.A;
            pg.f fVar = ((oe) dVar).f41128b.O;
            fVar.f45877x = f15;
            fVar.f45878y = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i9;
        int i10;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i11 = E[0];
        o[] oVarArr = this.f47179a;
        o oVar = oVarArr[i11];
        if (oVar != null) {
            if (((td.a) oVar.f389c).f47776f) {
                i10 = AndroidUtilities.dp(54.0f);
            } else {
                i10 = 0;
            }
            dp += i10;
        }
        for (int i12 = 0; i12 < 4; i12++) {
            o oVar2 = oVarArr[F[i12]];
            if (oVar2 != null) {
                if (((td.a) oVar2.f389c).f47776f) {
                    i9 = AndroidUtilities.dp(54.0f);
                } else {
                    i9 = 0;
                }
                dp2 += i9;
            }
        }
        FrameLayout frameLayout = this.f47182e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != dp || marginLayoutParams.rightMargin != dp2) {
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp2;
            if (z10) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i9, boolean z10, boolean z11) {
        Object[] objArr;
        if (i9 >= 0) {
            o[] oVarArr = this.f47179a;
            if (i9 < oVarArr.length && ((objArr = oVarArr[i9]) != 0 || z10)) {
                if (objArr == 0) {
                    td.a aVar = new td.a((i9 << 16) | 1, this, gr.h, 300L, false);
                    qg.a d = qg.a.d(getContext(), this.f47184n, this.f47185r, this.h, D[i9], 48);
                    if (i9 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i9 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i9 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i9 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    g6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new z0(this, i9, 26));
                    addView(d, e6.c(56.0f, 56));
                    ?? obj = new Object();
                    obj.f388b = d;
                    obj.f389c = aVar;
                    oVarArr[i9] = obj;
                    a();
                }
                ((td.a) oVarArr[i9].f389c).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i9 = 0; i9 < getContainer().getChildCount(); i9++) {
                View childAt = getContainer().getChildAt(i9);
                if (this.f47183f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f47187w.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9 = (int) (this.f47188x * 255.0f * this.v.f47775e);
        if (i9 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.A;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = G;
            rectF.set(this.f47189y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
            int i10 = this.C;
            Paint paint = this.B;
            paint.setColor(i10);
            paint.setAlpha(i9);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f47182e && this.f47186s != null) {
            RectF rectF = G;
            rectF.set(this.f47189y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.A, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f47186s.setBounds(rect);
            this.f47186s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public FrameLayout getContainer() {
        return this.f47182e;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        b(false);
        super.onMeasure(i9, i10);
        a();
    }

    public void setAccentColor(int i9) {
        this.C = i9;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.f47188x != f10) {
            this.f47188x = f10;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        d(false);
    }
}
