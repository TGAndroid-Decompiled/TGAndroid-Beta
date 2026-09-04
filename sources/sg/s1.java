package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.f11;
public abstract class s1 extends ll0 implements NotificationCenter.NotificationCenterDelegate, m0 {
    public final ArrayList X2;
    public final s4.c0 Y2;
    public boolean Z2;
    public boolean f46267a3;
    public final int f46268b3;
    public boolean f46269c3;
    public boolean f46270d3;
    public final rg.b0 f46271e3;
    public final pr f46272f3;
    public final ArrayList f46273g3;
    public final f11 f46274h3;
    public View f46275i3;
    public boolean j3;
    public int f46276k3;
    public int f46277l3;
    public boolean f46278m3;
    public boolean f46279n3;

    public s1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.X2 = arrayList;
        this.Z2 = true;
        this.f46267a3 = true;
        u0 u0Var = (u0) this;
        this.f46271e3 = new rg.b0(u0Var, 2);
        this.f46272f3 = new pr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f46273g3 = new ArrayList();
        this.f46274h3 = new f11(8);
        this.f46277l3 = -1;
        this.f46268b3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.Y2 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new p1(u0Var));
        setClipChildren(false);
        setOnScrollListener(new lb0(u0Var, 12));
        setOnItemClickListener(new bi.d(u0Var, 17));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.X2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.f46268b3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f46278m3) {
            ArrayList arrayList = this.f46273g3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                r1 r1Var = (r1) getChildAt(i10);
                float measuredHeight = ((r1Var.getMeasuredHeight() + r1Var.getTop()) + (r1Var.getMeasuredHeight() >> 1)) / (r1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                r1Var.f46246a = clamp;
                r1Var.f46247b.setTranslationX((1.0f - this.f46272f3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(r1Var);
            }
            Collections.sort(arrayList, this.f46274h3);
            if ((this.f46267a3 || this.j3) && arrayList.size() > 0 && !this.X2.isEmpty()) {
                View view = (View) i2.g.h(1, arrayList);
                this.f46275i3 = view;
                v1(view, !this.f46267a3);
                this.f46267a3 = false;
                this.j3 = false;
            } else if (this.f46275i3 != i2.g.h(1, arrayList)) {
                this.f46275i3 = (View) i2.g.h(1, arrayList);
                if (this.f46270d3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((r1) arrayList.get(i11)).getX(), ((r1) arrayList.get(i11)).getY());
                ((r1) arrayList.get(i11)).draw(canvas);
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
        NotificationCenter.getInstance(this.f46268b3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        w1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46268b3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z2 && !this.X2.isEmpty() && getChildCount() > 0) {
            this.Z2 = false;
            AndroidUtilities.runOnUIThread(new p0(this, 2));
        }
        int i14 = this.f46277l3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                v1(K.f45738a, false);
            }
            this.f46277l3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f46276k3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f46276k3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f46279n3 != z10) {
            this.f46279n3 = z10;
            if (z10) {
                w1();
                this.j3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f46271e3);
            v1(null, true);
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
        if (this.f46278m3 != z10) {
            this.f46278m3 = z10;
            invalidate();
        }
    }

    public final void v1(View view, boolean z10) {
        boolean z11;
        if (view != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46269c3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            r1 r1Var = (r1) getChildAt(i10);
            if (r1Var == view) {
                r1Var.a(true, true, z10);
            } else {
                r1Var.a(!this.f46269c3, false, z10);
            }
        }
    }

    public final void w1() {
        if (!this.f46279n3) {
            return;
        }
        rg.b0 b0Var = this.f46271e3;
        AndroidUtilities.cancelRunOnUIThread(b0Var);
        AndroidUtilities.runOnUIThread(b0Var, 2700L);
    }
}
