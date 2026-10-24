package sg;

import ai.xa;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.o70;
public abstract class q1 extends lm0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList Y2;
    public final s4.b0 Z2;
    public boolean f46821a3;
    public boolean f46822b3;
    public final int f46823c3;
    public boolean f46824d3;
    public boolean f46825e3;
    public final m4 f46826f3;
    public final zr f46827g3;
    public final ArrayList f46828h3;
    public final o70 f46829i3;
    public View f46830j3;
    public boolean f46831k3;
    public int f46832l3;
    public int f46833m3;
    public boolean f46834n3;
    public boolean f46835o3;

    public q1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.Y2 = arrayList;
        this.f46821a3 = true;
        this.f46822b3 = true;
        s0 s0Var = (s0) this;
        this.f46826f3 = new m4(s0Var, 7);
        this.f46827g3 = new zr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f46828h3 = new ArrayList();
        this.f46829i3 = new o70(16);
        this.f46833m3 = -1;
        this.f46823c3 = i10;
        s4.b0 b0Var = new s4.b0();
        this.Z2 = b0Var;
        setLayoutManager(b0Var);
        setAdapter(new n1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new iv(s0Var, 19));
        setOnItemClickListener(new xa(s0Var, 21));
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
        this.f46824d3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            p1 p1Var = (p1) getChildAt(i10);
            if (p1Var == view) {
                p1Var.a(true, true, z10);
            } else {
                p1Var.a(!this.f46824d3, false, z10);
            }
        }
    }

    public final void D1() {
        if (!this.f46835o3) {
            return;
        }
        m4 m4Var = this.f46826f3;
        AndroidUtilities.cancelRunOnUIThread(m4Var);
        AndroidUtilities.runOnUIThread(m4Var, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.Y2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.f46823c3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f46834n3) {
            ArrayList arrayList = this.f46828h3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                p1 p1Var = (p1) getChildAt(i10);
                float measuredHeight = ((p1Var.getMeasuredHeight() + p1Var.getTop()) + (p1Var.getMeasuredHeight() >> 1)) / (p1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                p1Var.f46809a = clamp;
                p1Var.f46810b.setTranslationX((1.0f - this.f46827g3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(p1Var);
            }
            Collections.sort(arrayList, this.f46829i3);
            if ((this.f46822b3 || this.f46831k3) && arrayList.size() > 0 && !this.Y2.isEmpty()) {
                View view = (View) i2.o1.i(1, arrayList);
                this.f46830j3 = view;
                C1(view, !this.f46822b3);
                this.f46822b3 = false;
                this.f46831k3 = false;
            } else if (this.f46830j3 != i2.o1.i(1, arrayList)) {
                this.f46830j3 = (View) i2.o1.i(1, arrayList);
                if (this.f46825e3) {
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
        NotificationCenter.getInstance(this.f46823c3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        D1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46823c3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f46821a3 && !this.Y2.isEmpty() && getChildCount() > 0) {
            this.f46821a3 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(this, 24));
        }
        int i14 = this.f46833m3;
        if (i14 > 0) {
            s4.b1 K = K(i14);
            if (K != null) {
                C1(K.f46342a, false);
            }
            this.f46833m3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f46832l3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f46832l3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f46835o3 != z10) {
            this.f46835o3 = z10;
            if (z10) {
                D1();
                this.f46831k3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f46826f3);
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
        if (this.f46834n3 != z10) {
            this.f46834n3 = z10;
            invalidate();
        }
    }
}
