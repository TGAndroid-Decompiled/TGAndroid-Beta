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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.mb1;
public abstract class o1 extends vl0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList X2;
    public final s4.c0 Y2;
    public boolean Z2;
    public boolean f42703a3;
    public final int f42704b3;
    public boolean f42705c3;
    public boolean f42706d3;
    public final p8.b f42707e3;
    public final qr f42708f3;
    public final ArrayList f42709g3;
    public final mb1 f42710h3;
    public View f42711i3;
    public boolean j3;
    public int f42712k3;
    public int f42713l3;
    public boolean f42714m3;
    public boolean f42715n3;

    public o1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.X2 = arrayList;
        this.Z2 = true;
        this.f42703a3 = true;
        s0 s0Var = (s0) this;
        this.f42707e3 = new p8.b(s0Var, 3);
        this.f42708f3 = new qr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f42709g3 = new ArrayList();
        this.f42710h3 = new mb1(6);
        this.f42713l3 = -1;
        this.f42704b3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.Y2 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new l1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new sb0(s0Var, 13));
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
            ArrayList arrayList = this.X2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.f42704b3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f42714m3) {
            ArrayList arrayList = this.f42709g3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                n1 n1Var = (n1) getChildAt(i10);
                float measuredHeight = ((n1Var.getMeasuredHeight() + n1Var.getTop()) + (n1Var.getMeasuredHeight() >> 1)) / (n1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                n1Var.f42692a = clamp;
                n1Var.f42693b.setTranslationX((1.0f - this.f42708f3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(n1Var);
            }
            Collections.sort(arrayList, this.f42710h3);
            if ((this.f42703a3 || this.j3) && arrayList.size() > 0 && !this.X2.isEmpty()) {
                View view = (View) hg.k0.g(1, arrayList);
                this.f42711i3 = view;
                x1(view, !this.f42703a3);
                this.f42703a3 = false;
                this.j3 = false;
            } else if (this.f42711i3 != hg.k0.g(1, arrayList)) {
                this.f42711i3 = (View) hg.k0.g(1, arrayList);
                if (this.f42706d3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((n1) arrayList.get(i11)).getX(), ((n1) arrayList.get(i11)).getY());
                ((n1) arrayList.get(i11)).draw(canvas);
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
        NotificationCenter.getInstance(this.f42704b3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        y1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f42704b3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z2 && !this.X2.isEmpty() && getChildCount() > 0) {
            this.Z2 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(this, 29));
        }
        int i14 = this.f42713l3;
        if (i14 > 0) {
            s4.c1 L = L(i14);
            if (L != null) {
                x1(L.f42974a, false);
            }
            this.f42713l3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f42712k3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f42712k3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f42715n3 != z10) {
            this.f42715n3 = z10;
            if (z10) {
                y1();
                this.j3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f42707e3);
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
        if (this.f42714m3 != z10) {
            this.f42714m3 = z10;
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
        this.f42705c3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            n1 n1Var = (n1) getChildAt(i10);
            if (n1Var == view) {
                n1Var.a(true, true, z10);
            } else {
                n1Var.a(!this.f42705c3, false, z10);
            }
        }
    }

    public final void y1() {
        if (!this.f42715n3) {
            return;
        }
        p8.b bVar = this.f42707e3;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 2700L);
    }
}
