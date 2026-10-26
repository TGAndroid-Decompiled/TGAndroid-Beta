package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.bv;
public abstract class q1 extends mm0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList f49000f3;
    public final s4.c0 f49001g3;
    public boolean f49002h3;
    public boolean f49003i3;
    public final int f49004j3;
    public boolean f49005k3;
    public boolean f49006l3;
    public final cy0 f49007m3;
    public final ds f49008n3;
    public final ArrayList f49009o3;
    public final bv f49010p3;
    public View f49011q3;
    public boolean f49012r3;
    public int f49013s3;
    public int f49014t3;
    public boolean f49015u3;
    public boolean f49016v3;

    public q1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f49000f3 = arrayList;
        this.f49002h3 = true;
        this.f49003i3 = true;
        s0 s0Var = (s0) this;
        this.f49007m3 = new cy0(s0Var, 13);
        this.f49008n3 = new ds(0.0f, 0.5f, 0.5f, 1.0f);
        this.f49009o3 = new ArrayList();
        this.f49010p3 = new bv(19);
        this.f49014t3 = -1;
        this.f49004j3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.f49001g3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new n1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new ml(s0Var, 24));
        setOnItemClickListener(new ai.k(s0Var, 22));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    public final void C1(View view, boolean z10) {
        boolean z11;
        if (view != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f49005k3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            p1 p1Var = (p1) getChildAt(i10);
            if (p1Var == view) {
                p1Var.a(true, true, z10);
            } else {
                p1Var.a(!this.f49005k3, false, z10);
            }
        }
    }

    public final void D1() {
        if (!this.f49016v3) {
            return;
        }
        cy0 cy0Var = this.f49007m3;
        AndroidUtilities.cancelRunOnUIThread(cy0Var);
        AndroidUtilities.runOnUIThread(cy0Var, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.f49000f3;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.f49004j3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f49015u3) {
            ArrayList arrayList = this.f49009o3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                p1 p1Var = (p1) getChildAt(i10);
                float measuredHeight = ((p1Var.getMeasuredHeight() + p1Var.getTop()) + (p1Var.getMeasuredHeight() >> 1)) / (p1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                p1Var.f48988a = clamp;
                p1Var.f48989b.setTranslationX((1.0f - this.f49008n3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(p1Var);
            }
            Collections.sort(arrayList, this.f49010p3);
            if ((this.f49003i3 || this.f49012r3) && arrayList.size() > 0 && !this.f49000f3.isEmpty()) {
                View view = (View) ic.a.g(1, arrayList);
                this.f49011q3 = view;
                C1(view, !this.f49003i3);
                this.f49003i3 = false;
                this.f49012r3 = false;
            } else if (this.f49011q3 != ic.a.g(1, arrayList)) {
                this.f49011q3 = (View) ic.a.g(1, arrayList);
                if (this.f49006l3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((p1) arrayList.get(i11)).getX(), ((p1) arrayList.get(i11)).getY());
                ((p1) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f49004j3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        D1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f49004j3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f49002h3 && !this.f49000f3.isEmpty() && getChildCount() > 0) {
            this.f49002h3 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(this, 27));
        }
        int i14 = this.f49014t3;
        if (i14 > 0) {
            s4.e1 K = K(i14);
            if (K != null) {
                C1(K.f47738a, false);
            }
            this.f49014t3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f49013s3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f49013s3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f49016v3 != z10) {
            this.f49016v3 = z10;
            if (z10) {
                D1();
                this.f49012r3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f49007m3);
            C1(null, true);
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
        if (this.f49015u3 != z10) {
            this.f49015u3 = z10;
            invalidate();
        }
    }
}
