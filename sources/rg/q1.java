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
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.eb1;
public abstract class q1 extends zl0 implements NotificationCenter.NotificationCenterDelegate, m0 {
    public final ArrayList f46271e3;
    public final s4.c0 f46272f3;
    public boolean f46273g3;
    public boolean f46274h3;
    public final int f46275i3;
    public boolean j3;
    public boolean f46276k3;
    public final pg.c1 f46277l3;
    public final tr f46278m3;
    public final ArrayList f46279n3;
    public final eb1 f46280o3;
    public View f46281p3;
    public boolean f46282q3;
    public int f46283r3;
    public int f46284s3;
    public boolean f46285t3;
    public boolean f46286u3;

    public q1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f46271e3 = arrayList;
        this.f46273g3 = true;
        this.f46274h3 = true;
        t0 t0Var = (t0) this;
        this.f46277l3 = new pg.c1(t0Var, 2);
        this.f46278m3 = new tr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f46279n3 = new ArrayList();
        this.f46280o3 = new eb1(6);
        this.f46284s3 = -1;
        this.f46275i3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.f46272f3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new n1(t0Var));
        setClipChildren(false);
        setOnScrollListener(new xb0(t0Var, 13));
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
            ArrayList arrayList = this.f46271e3;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.f46275i3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f46285t3) {
            ArrayList arrayList = this.f46279n3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                p1 p1Var = (p1) getChildAt(i10);
                float measuredHeight = ((p1Var.getMeasuredHeight() + p1Var.getTop()) + (p1Var.getMeasuredHeight() >> 1)) / (p1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                p1Var.f46249a = clamp;
                p1Var.f46250b.setTranslationX((1.0f - this.f46278m3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(p1Var);
            }
            Collections.sort(arrayList, this.f46280o3);
            if ((this.f46274h3 || this.f46282q3) && arrayList.size() > 0 && !this.f46271e3.isEmpty()) {
                View view = (View) hg.c.g(1, arrayList);
                this.f46281p3 = view;
                x1(view, !this.f46274h3);
                this.f46274h3 = false;
                this.f46282q3 = false;
            } else if (this.f46281p3 != hg.c.g(1, arrayList)) {
                this.f46281p3 = (View) hg.c.g(1, arrayList);
                if (this.f46276k3) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f46275i3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        y1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46275i3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f46273g3 && !this.f46271e3.isEmpty() && getChildCount() > 0) {
            this.f46273g3 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 29));
        }
        int i14 = this.f46284s3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                x1(K.f46538a, false);
            }
            this.f46284s3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f46283r3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f46283r3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f46286u3 != z10) {
            this.f46286u3 = z10;
            if (z10) {
                y1();
                this.f46282q3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f46277l3);
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
        if (this.f46285t3 != z10) {
            this.f46285t3 = z10;
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
        this.j3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            p1 p1Var = (p1) getChildAt(i10);
            if (p1Var == view) {
                p1Var.a(true, true, z10);
            } else {
                p1Var.a(!this.j3, false, z10);
            }
        }
    }

    public final void y1() {
        if (!this.f46286u3) {
            return;
        }
        pg.c1 c1Var = this.f46277l3;
        AndroidUtilities.cancelRunOnUIThread(c1Var);
        AndroidUtilities.runOnUIThread(c1Var, 2700L);
    }
}
