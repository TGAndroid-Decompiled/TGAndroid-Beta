package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import gg.j1;
import java.util.HashSet;
import k7.b6;
import k7.d6;
import kf.q0;
import kf.r0;
import lh.y0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ve;
import org.telegram.ui.zn;
import ph.f3;
public class e extends FrameLayout implements xd.b {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final RectF H;
    public float B;
    public final Paint C;
    public int D;
    public final o[] f46623a;
    public final View.OnClickListener[] f46624b;
    public final ve[] f46625c;
    public d d;
    public final FrameLayout e;
    public final HashSet f46626f;
    public final f6 h;
    public final ng.a f46627n;
    public final qg.a f46628r;
    public pg.b f46629s;
    public final xd.a v;
    public final xd.a f46630w;
    public float f46631x;
    public float f46632y;

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

    public e(Context context, ng.a aVar, f6 f6Var, qg.a aVar2) {
        super(context);
        this.f46623a = new o[5];
        this.f46624b = new View.OnClickListener[5];
        this.f46625c = new ve[5];
        this.f46626f = new HashSet();
        mr mrVar = mr.h;
        this.v = new xd.a(99, this, mrVar, 320L, false);
        this.f46630w = new xd.a(100, this, mrVar, 320L, false);
        this.C = new Paint(1);
        this.D = 0;
        this.f46627n = aVar;
        this.f46628r = aVar2;
        this.h = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        j1 j1Var = r0.f10496a;
        frameLayout.setOutlineProvider(new q0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, b6.e(-1, 44, 16));
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
            o[] oVarArr = this.f46623a;
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
        this.f46632y = 0.0f;
        this.B = 0.0f;
        o[] oVarArr = this.f46623a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                vg.a aVar = (vg.a) oVar.f333b;
                float f11 = ((xd.a) oVar.f334c).e * this.f46631x;
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
            float dp = ((xd.a) oVar2.f334c).e * AndroidUtilities.dp(54.0f);
            ((vg.a) oVar2.f333b).setTranslationX(AndroidUtilities.dp(1.0f) + this.f46632y);
            this.f46632y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = G;
            if (i11 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i11]];
            if (oVar3 != null) {
                vg.a aVar2 = (vg.a) oVar3.f333b;
                float dp2 = ((xd.a) oVar3.f334c).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.B);
                this.B += dp2;
            }
            i11++;
        }
        if (this.f46631x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                vg.a aVar3 = (vg.a) oVar4.f333b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f46631x) * this.f46632y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                o oVar5 = oVarArr[iArr[i12]];
                if (oVar5 != null) {
                    vg.a aVar4 = (vg.a) oVar5.f333b;
                    aVar4.setTranslationX(((1.0f - this.f46631x) * this.B) + aVar4.getTranslationX());
                }
            }
            float f12 = this.f46632y;
            float f13 = this.f46631x;
            this.f46632y = f12 * f13;
            this.B *= f13;
        }
        float f14 = this.f46630w.e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f46626f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f10 = Math.max(f10, childAt.getRight());
                }
            }
            if (measuredWidth > f10) {
                f10 = (measuredWidth + f10) / 2.0f;
                measuredWidth = f10;
            }
            this.f46632y = AndroidUtilities.lerp(this.f46632y, measuredWidth - AndroidUtilities.dp(3.33f), f14);
            this.B = AndroidUtilities.lerp(this.B, (getMeasuredWidth() - f10) - AndroidUtilities.dp(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.f46632y;
            float f16 = this.B;
            ug.f fVar = ((ve) dVar).f39079b.P;
            fVar.f45590x = f15;
            fVar.f45591y = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z4) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = F[0];
        o[] oVarArr = this.f46623a;
        o oVar = oVarArr[i12];
        if (oVar != null) {
            if (((xd.a) oVar.f334c).f46961f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            o oVar2 = oVarArr[G[i13]];
            if (oVar2 != null) {
                if (((xd.a) oVar2.f334c).f46961f) {
                    i10 = AndroidUtilities.dp(54.0f);
                } else {
                    i10 = 0;
                }
                dp2 += i10;
            }
        }
        FrameLayout frameLayout = this.e;
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
            o[] oVarArr = this.f46623a;
            if (i10 < oVarArr.length && ((objArr = oVarArr[i10]) != 0 || z4)) {
                if (objArr == 0) {
                    xd.a aVar = new xd.a((i10 << 16) | 1, this, mr.h, 300L, false);
                    vg.a d = vg.a.d(getContext(), this.f46627n, this.f46628r, this.h, E[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    d6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new y0(this, i10, 26));
                    addView(d, b6.c(56.0f, 56));
                    ?? obj = new Object();
                    obj.f333b = d;
                    obj.f334c = aVar;
                    oVarArr[i10] = obj;
                    a();
                }
                ((xd.a) oVarArr[i10].f334c).a(z4, z10);
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
                if (this.f46626f.contains(childAt) && childAt.getVisibility() == 0) {
                    z11 = true;
                }
            }
            z10 = z11;
        }
        this.f46630w.a(z10, z4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f46631x * 255.0f * this.v.e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.B;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = H;
            rectF.set(this.f46632y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
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
        if (view == this.e && this.f46629s != null) {
            RectF rectF = H;
            rectF.set(this.f46632y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.B, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f46629s.setBounds(rect);
            this.f46629s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public FrameLayout getContainer() {
        return this.e;
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
        if (this.f46631x != f10) {
            this.f46631x = f10;
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
        f3 f3Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.f46623a;
            if (i11 < oVarArr.length && (oVar = oVarArr[i11]) != null && i12 == 1 && ((xd.a) oVar.f334c).f46961f) {
                ve veVar = this.f46625c[i11];
                if (veVar != null) {
                    final vg.a aVar = (vg.a) oVar.f333b;
                    boolean z4 = oVar.f332a;
                    int i13 = veVar.f39078a;
                    final zn znVar = veVar.f39079b;
                    switch (i13) {
                        case 24:
                            if (znVar.G0 == null && !z4 && (((f3Var = znVar.I0) == null || !f3Var.S) && m40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zn znVar2 = znVar;
                                                if (znVar2.getParentActivity() != null) {
                                                    float f11 = znVar2.v.e(2).d / AndroidUtilities.density;
                                                    vg.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (znVar2.U0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ph.f3 f3Var2 = new ph.f3(znVar2.getParentActivity(), 3);
                                                    znVar2.I0 = f3Var2;
                                                    f3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar2.I0.p(false);
                                                    ph.f3 f3Var3 = znVar2.I0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (f3Var3.getMeasuredWidth() < 0) {
                                                        f3Var3.D = string;
                                                    } else {
                                                        f3Var3.E.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    znVar2.I0.l(1.0f, (-width) + 7.33f);
                                                    znVar2.U0.addView(znVar2.I0, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    ph.f3 f3Var4 = znVar2.I0;
                                                    f3Var4.f41662i0 = new nf(znVar2, 21);
                                                    f3Var4.u();
                                                    org.telegram.ui.Components.m40.f26950f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                zn znVar3 = znVar;
                                                if (znVar3.getParentActivity() != null) {
                                                    float f12 = znVar3.v.e(2).d / AndroidUtilities.density;
                                                    vg.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (znVar3.U0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ph.f3 f3Var5 = new ph.f3(znVar3.getParentActivity(), 3);
                                                    znVar3.G0 = f3Var5;
                                                    f3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar3.G0.p(false);
                                                    znVar3.G0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    znVar3.G0.l(1.0f, (-width2) + 7.33f);
                                                    znVar3.U0.addView(znVar3.G0, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    ph.f3 f3Var6 = znVar3.G0;
                                                    f3Var6.f41662i0 = new pg(znVar3, 0);
                                                    f3Var6.u();
                                                    org.telegram.ui.Components.m40.h.b();
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
                            if (znVar.I0 == null && !z4 && m40.f26950f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zn znVar2 = znVar;
                                                if (znVar2.getParentActivity() != null) {
                                                    float f11 = znVar2.v.e(2).d / AndroidUtilities.density;
                                                    vg.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (znVar2.U0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    ph.f3 f3Var2 = new ph.f3(znVar2.getParentActivity(), 3);
                                                    znVar2.I0 = f3Var2;
                                                    f3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar2.I0.p(false);
                                                    ph.f3 f3Var3 = znVar2.I0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (f3Var3.getMeasuredWidth() < 0) {
                                                        f3Var3.D = string;
                                                    } else {
                                                        f3Var3.E.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    znVar2.I0.l(1.0f, (-width) + 7.33f);
                                                    znVar2.U0.addView(znVar2.I0, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    ph.f3 f3Var4 = znVar2.I0;
                                                    f3Var4.f41662i0 = new nf(znVar2, 21);
                                                    f3Var4.u();
                                                    org.telegram.ui.Components.m40.f26950f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                zn znVar3 = znVar;
                                                if (znVar3.getParentActivity() != null) {
                                                    float f12 = znVar3.v.e(2).d / AndroidUtilities.density;
                                                    vg.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (znVar3.U0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    ph.f3 f3Var5 = new ph.f3(znVar3.getParentActivity(), 3);
                                                    znVar3.G0 = f3Var5;
                                                    f3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    znVar3.G0.p(false);
                                                    znVar3.G0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    znVar3.G0.l(1.0f, (-width2) + 7.33f);
                                                    znVar3.U0.addView(znVar3.G0, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                    ph.f3 f3Var6 = znVar3.G0;
                                                    f3Var6.f41662i0 = new pg(znVar3, 0);
                                                    f3Var6.u();
                                                    org.telegram.ui.Components.m40.h.b();
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
                oVar.f332a = true;
            }
        }
    }
}
