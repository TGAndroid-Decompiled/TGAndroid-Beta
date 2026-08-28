package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.wk0;
public abstract class o1 extends wk0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList T2;
    public final f2.m0 U2;
    public boolean V2;
    public boolean W2;
    public final int X2;
    public boolean Y2;
    public boolean Z2;
    public final ju0 a3;
    public final gr f50633b3;
    public final ArrayList f50634c3;
    public final jn0 f50635d3;
    public View f50636e3;
    public boolean f50637f3;
    public int f50638g3;
    public int f50639h3;
    public boolean f50640i3;
    public boolean f50641j3;

    public o1(Context context, int i9) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.T2 = arrayList;
        this.V2 = true;
        this.W2 = true;
        s0 s0Var = (s0) this;
        this.a3 = new ju0(s0Var, 12);
        this.f50633b3 = new gr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f50634c3 = new ArrayList();
        this.f50635d3 = new jn0(25);
        this.f50639h3 = -1;
        this.X2 = i9;
        f2.m0 m0Var = new f2.m0();
        this.U2 = m0Var;
        setLayoutManager(m0Var);
        setAdapter(new l1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new kn(s0Var, 21));
        setOnItemClickListener(new eh.j(s0Var, 24));
        MediaDataController.getInstance(i9).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i9).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.T2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.X2).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f50640i3) {
            ArrayList arrayList = this.f50634c3;
            arrayList.clear();
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                n1 n1Var = (n1) getChildAt(i9);
                float measuredHeight = ((n1Var.getMeasuredHeight() + n1Var.getTop()) + (n1Var.getMeasuredHeight() >> 1)) / (n1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                n1Var.f50621a = clamp;
                n1Var.f50622b.setTranslationX((1.0f - this.f50633b3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(n1Var);
            }
            Collections.sort(arrayList, this.f50635d3);
            if ((this.W2 || this.f50637f3) && arrayList.size() > 0 && !this.T2.isEmpty()) {
                View view = (View) j3.r0.j(1, arrayList);
                this.f50636e3 = view;
                w1(view, !this.W2);
                this.W2 = false;
                this.f50637f3 = false;
            } else if (this.f50636e3 != j3.r0.j(1, arrayList)) {
                this.f50636e3 = (View) j3.r0.j(1, arrayList);
                if (this.Z2) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                canvas.save();
                canvas.translate(((n1) arrayList.get(i10)).getX(), ((n1) arrayList.get(i10)).getY());
                ((n1) arrayList.get(i10)).draw(canvas);
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
        NotificationCenter.getInstance(this.X2).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        x1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.X2).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.V2 && !this.T2.isEmpty() && getChildCount() > 0) {
            this.V2 = false;
            AndroidUtilities.runOnUIThread(new pf.o1(this, 29));
        }
        int i13 = this.f50639h3;
        if (i13 > 0) {
            f2.q1 K = K(i13);
            if (K != null) {
                w1(K.f5501a, false);
            }
            this.f50639h3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i9)) {
            this.f50638g3 = View.MeasureSpec.getSize(i9);
        } else {
            this.f50638g3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i9, i10);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f50641j3 != z10) {
            this.f50641j3 = z10;
            if (z10) {
                x1();
                this.f50637f3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.a3);
            w1(null, true);
        }
    }

    @Override
    public void setOffset(float f10) {
        boolean z10;
        if (Math.abs(f10 / getMeasuredWidth()) < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50640i3 != z10) {
            this.f50640i3 = z10;
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
        this.Y2 = z11;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            n1 n1Var = (n1) getChildAt(i9);
            if (n1Var == view) {
                n1Var.a(true, true, z10);
            } else {
                n1Var.a(!this.Y2, false, z10);
            }
        }
    }

    public final void x1() {
        if (!this.f50641j3) {
            return;
        }
        ju0 ju0Var = this.a3;
        AndroidUtilities.cancelRunOnUIThread(ju0Var);
        AndroidUtilities.runOnUIThread(ju0Var, 2700L);
    }
}
