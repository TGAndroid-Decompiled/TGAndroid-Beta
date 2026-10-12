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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.ob1;
public abstract class p1 extends wm0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList V2;
    public final s4.d0 W2;
    public boolean X2;
    public boolean Y2;
    public final int Z2;
    public boolean f47595a3;
    public boolean f47596b3;
    public final p4.t0 f47597c3;
    public final js f47598d3;
    public final ArrayList f47599e3;
    public final ob1 f47600f3;
    public View f47601g3;
    public boolean f47602h3;
    public int f47603i3;
    public int j3;
    public boolean f47604k3;
    public boolean f47605l3;

    public p1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.V2 = arrayList;
        this.X2 = true;
        this.Y2 = true;
        t0 t0Var = (t0) this;
        this.f47597c3 = new p4.t0(t0Var, 5);
        this.f47598d3 = new js(0.0f, 0.5f, 0.5f, 1.0f);
        this.f47599e3 = new ArrayList();
        this.f47600f3 = new ob1(8);
        this.j3 = -1;
        this.Z2 = i10;
        s4.d0 d0Var = new s4.d0();
        this.W2 = d0Var;
        setLayoutManager(d0Var);
        setAdapter(new m1(t0Var));
        setClipChildren(false);
        setOnScrollListener(new qh0(t0Var, 14));
        setOnItemClickListener(new ai.g(t0Var, 17));
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
        if (this.f47604k3) {
            ArrayList arrayList = this.f47599e3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                o1 o1Var = (o1) getChildAt(i10);
                float measuredHeight = ((o1Var.getMeasuredHeight() + o1Var.getTop()) + (o1Var.getMeasuredHeight() >> 1)) / (o1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                o1Var.f47582a = clamp;
                o1Var.f47583b.setTranslationX((1.0f - this.f47598d3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(o1Var);
            }
            Collections.sort(arrayList, this.f47600f3);
            if ((this.Y2 || this.f47602h3) && arrayList.size() > 0 && !this.V2.isEmpty()) {
                View view = (View) hg.c.h(1, arrayList);
                this.f47601g3 = view;
                x1(view, !this.Y2);
                this.Y2 = false;
                this.f47602h3 = false;
            } else if (this.f47601g3 != hg.c.h(1, arrayList)) {
                this.f47601g3 = (View) hg.c.h(1, arrayList);
                if (this.f47596b3) {
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
                x1(K.f47889a, false);
            }
            this.j3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f47603i3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f47603i3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f47605l3 != z10) {
            this.f47605l3 = z10;
            if (z10) {
                y1();
                this.f47602h3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f47597c3);
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
        if (this.f47604k3 != z10) {
            this.f47604k3 = z10;
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
        this.f47595a3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            o1 o1Var = (o1) getChildAt(i10);
            if (o1Var == view) {
                o1Var.a(true, true, z10);
            } else {
                o1Var.a(!this.f47595a3, false, z10);
            }
        }
    }

    public final void y1() {
        if (!this.f47605l3) {
            return;
        }
        p4.t0 t0Var = this.f47597c3;
        AndroidUtilities.cancelRunOnUIThread(t0Var);
        AndroidUtilities.runOnUIThread(t0Var, 2700L);
    }
}
