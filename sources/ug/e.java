package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.n;
import eg.k1;
import i7.f6;
import i7.h6;
import java.util.HashSet;
import jf.p0;
import jf.q0;
import jh.y0;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.jr;
import org.telegram.ui.me;
import org.telegram.ui.tn;
public class e extends FrameLayout implements vd.b {
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final RectF G;
    public float A;
    public final Paint B;
    public int C;
    public final n[] f49216a;
    public final View.OnClickListener[] f49217b;
    public final me[] f49218c;
    public d d;
    public final FrameLayout f49219e;
    public final HashSet f49220f;
    public final c6 h;
    public final lg.a f49221n;
    public final og.a f49222r;
    public ng.d f49223s;
    public final vd.a v;
    public final vd.a f49224w;
    public float f49225x;
    public float f49226y;

    static {
        int i10 = R.drawable.msg_search;
        int i11 = R.drawable.input_gift_s;
        int i12 = R.drawable.input_message;
        int i13 = R.drawable.msg_help;
        D = new int[]{i10, i11, i12, i13, i13};
        E = new int[]{0};
        F = new int[]{1, 2, 3, 4};
        G = new RectF();
    }

    public e(Context context, lg.a aVar, og.a aVar2, c6 c6Var) {
        super(context);
        this.f49216a = new n[5];
        this.f49217b = new View.OnClickListener[5];
        this.f49218c = new me[5];
        this.f49220f = new HashSet();
        jr jrVar = jr.h;
        this.v = new vd.a(99, this, jrVar, 320L, false);
        this.f49224w = new vd.a(100, this, jrVar, 320L, false);
        this.B = new Paint(1);
        this.C = 0;
        this.f49221n = aVar;
        this.f49222r = aVar2;
        this.h = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49219e = frameLayout;
        frameLayout.setClipToOutline(true);
        k1 k1Var = q0.f11668a;
        frameLayout.setOutlineProvider(new p0(0, AndroidUtilities.dp(22.0f)));
        addView(frameLayout, f6.e(-1, 44, 16));
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
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
            n[] nVarArr = this.f49216a;
            if (i11 < nVarArr.length && nVarArr[i11] != null && i12 == 1) {
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
        float f9 = 0.0f;
        this.f49226y = 0.0f;
        this.A = 0.0f;
        n[] nVarArr = this.f49216a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                tg.a aVar = (tg.a) nVar.f881b;
                float f10 = ((vd.a) nVar.f882c).f49505e * this.f49225x;
                if (f10 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                aVar.setVisibility(i10);
                aVar.setAlpha(f10);
                aVar.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
                aVar.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            }
        }
        int[] iArr2 = E;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float dp = ((vd.a) nVar2.f882c).f49505e * AndroidUtilities.dp(54.0f);
            ((tg.a) nVar2.f881b).setTranslationX(AndroidUtilities.dp(1.0f) + this.f49226y);
            this.f49226y += dp;
        }
        int i11 = 0;
        while (true) {
            iArr = F;
            if (i11 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i11]];
            if (nVar3 != null) {
                tg.a aVar2 = (tg.a) nVar3.f881b;
                float dp2 = ((vd.a) nVar3.f882c).f49505e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.A);
                this.A += dp2;
            }
            i11++;
        }
        if (this.f49225x < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                tg.a aVar3 = (tg.a) nVar4.f881b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f49225x) * this.f49226y));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                n nVar5 = nVarArr[iArr[i12]];
                if (nVar5 != null) {
                    tg.a aVar4 = (tg.a) nVar5.f881b;
                    aVar4.setTranslationX(((1.0f - this.f49225x) * this.A) + aVar4.getTranslationX());
                }
            }
            float f11 = this.f49226y;
            float f12 = this.f49225x;
            this.f49226y = f11 * f12;
            this.A *= f12;
        }
        float f13 = this.f49224w.f49505e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f49220f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f9 = Math.max(f9, childAt.getRight());
                }
            }
            if (measuredWidth > f9) {
                f9 = (measuredWidth + f9) / 2.0f;
                measuredWidth = f9;
            }
            this.f49226y = AndroidUtilities.lerp(this.f49226y, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.A = AndroidUtilities.lerp(this.A, (getMeasuredWidth() - f9) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.f49226y;
            float f15 = this.A;
            sg.f fVar = ((me) dVar).f40541b.O;
            fVar.f48057x = f14;
            fVar.f48058y = f15;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i12 = E[0];
        n[] nVarArr = this.f49216a;
        n nVar = nVarArr[i12];
        if (nVar != null) {
            if (((vd.a) nVar.f882c).f49506f) {
                i11 = AndroidUtilities.dp(54.0f);
            } else {
                i11 = 0;
            }
            dp += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            n nVar2 = nVarArr[F[i13]];
            if (nVar2 != null) {
                if (((vd.a) nVar2.f882c).f49506f) {
                    i10 = AndroidUtilities.dp(54.0f);
                } else {
                    i10 = 0;
                }
                dp2 += i10;
            }
        }
        FrameLayout frameLayout = this.f49219e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != dp || marginLayoutParams.rightMargin != dp2) {
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp2;
            if (z10) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i10, boolean z10, boolean z11) {
        Object[] objArr;
        if (i10 >= 0) {
            n[] nVarArr = this.f49216a;
            if (i10 < nVarArr.length && ((objArr = nVarArr[i10]) != 0 || z10)) {
                if (objArr == 0) {
                    vd.a aVar = new vd.a((i10 << 16) | 1, this, jr.h, 300L, false);
                    tg.a d = tg.a.d(getContext(), this.f49221n, this.f49222r, this.h, D[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    h6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new y0(this, i10, 26));
                    addView(d, f6.c(56.0f, 56));
                    ?? obj = new Object();
                    obj.f881b = d;
                    obj.f882c = aVar;
                    nVarArr[i10] = obj;
                    a();
                }
                ((vd.a) nVarArr[i10].f882c).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i10 = 0; i10 < getContainer().getChildCount(); i10++) {
                View childAt = getContainer().getChildAt(i10);
                if (this.f49220f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f49224w.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f49225x * 255.0f * this.v.f49505e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.A;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = G;
            rectF.set(this.f49226y + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), measuredWidth, measuredHeight);
            int i11 = this.C;
            Paint paint = this.B;
            paint.setColor(i11);
            paint.setAlpha(i10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f49219e && this.f49223s != null) {
            RectF rectF = G;
            rectF.set(this.f49226y + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.A, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.f49223s.setBounds(rect);
            this.f49223s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public FrameLayout getContainer() {
        return this.f49219e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        b(false);
        super.onMeasure(i10, i11);
        a();
    }

    public void setAccentColor(int i10) {
        this.C = i10;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f9) {
        if (this.f49225x != f9) {
            this.f49225x = f9;
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
    public final void z(float f9, int i10) {
        n nVar;
        t3 t3Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            n[] nVarArr = this.f49216a;
            if (i11 < nVarArr.length && (nVar = nVarArr[i11]) != null && i12 == 1 && ((vd.a) nVar.f882c).f49506f) {
                me meVar = this.f49218c[i11];
                if (meVar != null) {
                    final tg.a aVar = (tg.a) nVar.f881b;
                    boolean z10 = nVar.f880a;
                    int i13 = meVar.f40540a;
                    final tn tnVar = meVar.f40541b;
                    switch (i13) {
                        case 24:
                            if (tnVar.F0 == null && !z10 && (((t3Var = tnVar.H0) == null || !t3Var.R) && h40.h.c())) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tn tnVar2 = tnVar;
                                                if (tnVar2.getParentActivity() != null) {
                                                    float f10 = tnVar2.v.e(2).d / AndroidUtilities.density;
                                                    tg.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (tnVar2.T0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    nh.t3 t3Var2 = new nh.t3(tnVar2.getParentActivity(), 3);
                                                    tnVar2.H0 = t3Var2;
                                                    t3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    tnVar2.H0.q(false);
                                                    nh.t3 t3Var3 = tnVar2.H0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (t3Var3.getMeasuredWidth() < 0) {
                                                        t3Var3.C = string;
                                                    } else {
                                                        t3Var3.D.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    tnVar2.H0.m(1.0f, (-width) + 7.33f);
                                                    tnVar2.T0.addView(tnVar2.H0, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    nh.t3 t3Var4 = tnVar2.H0;
                                                    t3Var4.f18597h0 = new df(tnVar2, 21);
                                                    t3Var4.v();
                                                    org.telegram.ui.Components.h40.f29054f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                tn tnVar3 = tnVar;
                                                if (tnVar3.getParentActivity() != null) {
                                                    float f11 = tnVar3.v.e(2).d / AndroidUtilities.density;
                                                    tg.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (tnVar3.T0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    nh.t3 t3Var5 = new nh.t3(tnVar3.getParentActivity(), 3);
                                                    tnVar3.F0 = t3Var5;
                                                    t3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    tnVar3.F0.q(false);
                                                    tnVar3.F0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    tnVar3.F0.m(1.0f, (-width2) + 7.33f);
                                                    tnVar3.T0.addView(tnVar3.F0, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    nh.t3 t3Var6 = tnVar3.F0;
                                                    t3Var6.f18597h0 = new ig(tnVar3, 0);
                                                    t3Var6.v();
                                                    org.telegram.ui.Components.h40.h.b();
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
                            if (tnVar.H0 == null && !z10 && h40.f29054f.c()) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tn tnVar2 = tnVar;
                                                if (tnVar2.getParentActivity() != null) {
                                                    float f10 = tnVar2.v.e(2).d / AndroidUtilities.density;
                                                    tg.a aVar2 = aVar;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (tnVar2.T0.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / AndroidUtilities.density;
                                                    nh.t3 t3Var2 = new nh.t3(tnVar2.getParentActivity(), 3);
                                                    tnVar2.H0 = t3Var2;
                                                    t3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    tnVar2.H0.q(false);
                                                    nh.t3 t3Var3 = tnVar2.H0;
                                                    String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                    if (t3Var3.getMeasuredWidth() < 0) {
                                                        t3Var3.C = string;
                                                    } else {
                                                        t3Var3.D.q(string, !LocaleController.isRTL, true);
                                                    }
                                                    tnVar2.H0.m(1.0f, (-width) + 7.33f);
                                                    tnVar2.T0.addView(tnVar2.H0, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    nh.t3 t3Var4 = tnVar2.H0;
                                                    t3Var4.f18597h0 = new df(tnVar2, 21);
                                                    t3Var4.v();
                                                    org.telegram.ui.Components.h40.f29054f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                tn tnVar3 = tnVar;
                                                if (tnVar3.getParentActivity() != null) {
                                                    float f11 = tnVar3.v.e(2).d / AndroidUtilities.density;
                                                    tg.a aVar3 = aVar;
                                                    float width2 = ((aVar3.getWidth() / 2.0f) + (tnVar3.T0.getWidth() - (aVar3.getX() + aVar3.getWidth()))) / AndroidUtilities.density;
                                                    nh.t3 t3Var5 = new nh.t3(tnVar3.getParentActivity(), 3);
                                                    tnVar3.F0 = t3Var5;
                                                    t3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                    tnVar3.F0.q(false);
                                                    tnVar3.F0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                    tnVar3.F0.m(1.0f, (-width2) + 7.33f);
                                                    tnVar3.T0.addView(tnVar3.F0, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    nh.t3 t3Var6 = tnVar3.F0;
                                                    t3Var6.f18597h0 = new ig(tnVar3, 0);
                                                    t3Var6.v();
                                                    org.telegram.ui.Components.h40.h.b();
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
                nVar.f880a = true;
            }
        }
    }
}
