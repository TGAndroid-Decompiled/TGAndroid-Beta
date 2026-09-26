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
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.db1;
public abstract class o1 extends xl0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList X2;
    public final s4.c0 Y2;
    public boolean Z2;
    public boolean f42688a3;
    public final int f42689b3;
    public boolean f42690c3;
    public boolean f42691d3;
    public final pg.c1 f42692e3;
    public final sr f42693f3;
    public final ArrayList f42694g3;
    public final db1 f42695h3;
    public View f42696i3;
    public boolean j3;
    public int f42697k3;
    public int f42698l3;
    public boolean f42699m3;
    public boolean f42700n3;

    public o1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.X2 = arrayList;
        this.Z2 = true;
        this.f42688a3 = true;
        s0 s0Var = (s0) this;
        this.f42692e3 = new pg.c1(s0Var, 2);
        this.f42693f3 = new sr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f42694g3 = new ArrayList();
        this.f42695h3 = new db1(6);
        this.f42698l3 = -1;
        this.f42689b3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.Y2 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new l1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new vg0(s0Var, 11));
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
            arrayList.addAll(MediaDataController.getInstance(this.f42689b3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f42699m3) {
            ArrayList arrayList = this.f42694g3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                n1 n1Var = (n1) getChildAt(i10);
                float measuredHeight = ((n1Var.getMeasuredHeight() + n1Var.getTop()) + (n1Var.getMeasuredHeight() >> 1)) / (n1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                n1Var.f42677a = clamp;
                n1Var.f42678b.setTranslationX((1.0f - this.f42693f3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(n1Var);
            }
            Collections.sort(arrayList, this.f42695h3);
            if ((this.f42688a3 || this.j3) && arrayList.size() > 0 && !this.X2.isEmpty()) {
                View view = (View) hg.c.g(1, arrayList);
                this.f42696i3 = view;
                w1(view, !this.f42688a3);
                this.f42688a3 = false;
                this.j3 = false;
            } else if (this.f42696i3 != hg.c.g(1, arrayList)) {
                this.f42696i3 = (View) hg.c.g(1, arrayList);
                if (this.f42691d3) {
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
        NotificationCenter.getInstance(this.f42689b3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        x1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f42689b3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z2 && !this.X2.isEmpty() && getChildCount() > 0) {
            this.Z2 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 29));
        }
        int i14 = this.f42698l3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                w1(K.f42959a, false);
            }
            this.f42698l3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f42697k3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f42697k3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f42700n3 != z10) {
            this.f42700n3 = z10;
            if (z10) {
                x1();
                this.j3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f42692e3);
            w1(null, true);
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
        if (this.f42699m3 != z10) {
            this.f42699m3 = z10;
            invalidate();
        }
    }

    public final void w1(View view, boolean z10) {
        boolean z11;
        if (view != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42690c3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            n1 n1Var = (n1) getChildAt(i10);
            if (n1Var == view) {
                n1Var.a(true, true, z10);
            } else {
                n1Var.a(!this.f42690c3, false, z10);
            }
        }
    }

    public final void x1() {
        if (!this.f42700n3) {
            return;
        }
        pg.c1 c1Var = this.f42692e3;
        AndroidUtilities.cancelRunOnUIThread(c1Var);
        AndroidUtilities.runOnUIThread(c1Var, 2700L);
    }
}
