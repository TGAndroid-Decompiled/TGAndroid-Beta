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
import org.telegram.ui.gb1;
public abstract class q1 extends zl0 implements NotificationCenter.NotificationCenterDelegate, m0 {
    public final ArrayList f46257e3;
    public final s4.c0 f46258f3;
    public boolean f46259g3;
    public boolean f46260h3;
    public final int f46261i3;
    public boolean j3;
    public boolean f46262k3;
    public final pg.c1 f46263l3;
    public final tr f46264m3;
    public final ArrayList f46265n3;
    public final gb1 f46266o3;
    public View f46267p3;
    public boolean f46268q3;
    public int f46269r3;
    public int f46270s3;
    public boolean f46271t3;
    public boolean f46272u3;

    public q1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f46257e3 = arrayList;
        this.f46259g3 = true;
        this.f46260h3 = true;
        t0 t0Var = (t0) this;
        this.f46263l3 = new pg.c1(t0Var, 2);
        this.f46264m3 = new tr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f46265n3 = new ArrayList();
        this.f46266o3 = new gb1(6);
        this.f46270s3 = -1;
        this.f46261i3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.f46258f3 = c0Var;
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
            ArrayList arrayList = this.f46257e3;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.f46261i3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f46271t3) {
            ArrayList arrayList = this.f46265n3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                p1 p1Var = (p1) getChildAt(i10);
                float measuredHeight = ((p1Var.getMeasuredHeight() + p1Var.getTop()) + (p1Var.getMeasuredHeight() >> 1)) / (p1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                p1Var.f46235a = clamp;
                p1Var.f46236b.setTranslationX((1.0f - this.f46264m3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(p1Var);
            }
            Collections.sort(arrayList, this.f46266o3);
            if ((this.f46260h3 || this.f46268q3) && arrayList.size() > 0 && !this.f46257e3.isEmpty()) {
                View view = (View) hg.k0.g(1, arrayList);
                this.f46267p3 = view;
                y1(view, !this.f46260h3);
                this.f46260h3 = false;
                this.f46268q3 = false;
            } else if (this.f46267p3 != hg.k0.g(1, arrayList)) {
                this.f46267p3 = (View) hg.k0.g(1, arrayList);
                if (this.f46262k3) {
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
        NotificationCenter.getInstance(this.f46261i3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        z1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46261i3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f46259g3 && !this.f46257e3.isEmpty() && getChildCount() > 0) {
            this.f46259g3 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 29));
        }
        int i14 = this.f46270s3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                y1(K.f46524a, false);
            }
            this.f46270s3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f46269r3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f46269r3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f46272u3 != z10) {
            this.f46272u3 = z10;
            if (z10) {
                z1();
                this.f46268q3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f46263l3);
            y1(null, true);
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
        if (this.f46271t3 != z10) {
            this.f46271t3 = z10;
            invalidate();
        }
    }

    public final void y1(View view, boolean z10) {
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

    public final void z1() {
        if (!this.f46272u3) {
            return;
        }
        pg.c1 c1Var = this.f46263l3;
        AndroidUtilities.cancelRunOnUIThread(c1Var);
        AndroidUtilities.runOnUIThread(c1Var, 2700L);
    }
}
