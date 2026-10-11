package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.lb1;
public abstract class p1 extends rm0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList V2;
    public final s4.d0 W2;
    public boolean X2;
    public boolean Y2;
    public final int Z2;
    public boolean f47514a3;
    public boolean f47515b3;
    public final p5 f47516c3;
    public final is f47517d3;
    public final ArrayList f47518e3;
    public final lb1 f47519f3;
    public View f47520g3;
    public boolean f47521h3;
    public int f47522i3;
    public int j3;
    public boolean f47523k3;
    public boolean f47524l3;

    public p1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.V2 = arrayList;
        this.X2 = true;
        this.Y2 = true;
        s0 s0Var = (s0) this;
        this.f47516c3 = new p5(s0Var, 5);
        this.f47517d3 = new is(0.0f, 0.5f, 0.5f, 1.0f);
        this.f47518e3 = new ArrayList();
        this.f47519f3 = new lb1(8);
        this.j3 = -1;
        this.Z2 = i10;
        s4.d0 d0Var = new s4.d0();
        this.W2 = d0Var;
        setLayoutManager(d0Var);
        setAdapter(new m1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new nh0(s0Var, 14));
        setOnItemClickListener(new ai.g(s0Var, 17));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.V2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.Z2).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f47523k3) {
            ArrayList arrayList = this.f47518e3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                o1 o1Var = (o1) getChildAt(i10);
                float measuredHeight = ((o1Var.getMeasuredHeight() + o1Var.getTop()) + (o1Var.getMeasuredHeight() >> 1)) / (o1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                o1Var.f47492a = clamp;
                o1Var.f47493b.setTranslationX((1.0f - this.f47517d3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(o1Var);
            }
            Collections.sort(arrayList, this.f47519f3);
            if ((this.Y2 || this.f47521h3) && arrayList.size() > 0 && !this.V2.isEmpty()) {
                View view = (View) hg.c.g(1, arrayList);
                this.f47520g3 = view;
                x1(view, !this.Y2);
                this.Y2 = false;
                this.f47521h3 = false;
            } else if (this.f47520g3 != hg.c.g(1, arrayList)) {
                this.f47520g3 = (View) hg.c.g(1, arrayList);
                if (this.f47515b3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((o1) arrayList.get(i11)).getX(), ((o1) arrayList.get(i11)).getY());
                ((o1) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.Z2).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        y1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.Z2).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.X2 && !this.V2.isEmpty() && getChildCount() > 0) {
            this.X2 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(this, 28));
        }
        int i14 = this.j3;
        if (i14 > 0) {
            s4.d1 K = K(i14);
            if (K != null) {
                x1(K.f47782a, false);
            }
            this.j3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f47522i3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f47522i3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f47524l3 != z10) {
            this.f47524l3 = z10;
            if (z10) {
                y1();
                this.f47521h3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f47516c3);
            x1(null, true);
        }
    }

    @Override
    public void setOffset(float f7) {
        boolean z10;
        if (Math.abs(f7 / getMeasuredWidth()) < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f47523k3 != z10) {
            this.f47523k3 = z10;
            invalidate();
        }
    }

    public final void x1(View view, boolean z10) {
        boolean z11;
        if (view != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47514a3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            o1 o1Var = (o1) getChildAt(i10);
            if (o1Var == view) {
                o1Var.a(true, true, z10);
            } else {
                o1Var.a(!this.f47514a3, false, z10);
            }
        }
    }

    public final void y1() {
        if (!this.f47524l3) {
            return;
        }
        p5 p5Var = this.f47516c3;
        AndroidUtilities.cancelRunOnUIThread(p5Var);
        AndroidUtilities.runOnUIThread(p5Var, 2700L);
    }
}
