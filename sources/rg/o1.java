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
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.db1;
public abstract class o1 extends zl0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList f42794e3;
    public final s4.c0 f42795f3;
    public boolean f42796g3;
    public boolean f42797h3;
    public final int f42798i3;
    public boolean j3;
    public boolean f42799k3;
    public final pg.c1 f42800l3;
    public final tr f42801m3;
    public final ArrayList f42802n3;
    public final db1 f42803o3;
    public View f42804p3;
    public boolean f42805q3;
    public int f42806r3;
    public int f42807s3;
    public boolean f42808t3;
    public boolean f42809u3;

    public o1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f42794e3 = arrayList;
        this.f42796g3 = true;
        this.f42797h3 = true;
        s0 s0Var = (s0) this;
        this.f42800l3 = new pg.c1(s0Var, 2);
        this.f42801m3 = new tr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f42802n3 = new ArrayList();
        this.f42803o3 = new db1(6);
        this.f42807s3 = -1;
        this.f42798i3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.f42795f3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new l1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new xg0(s0Var, 11));
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
            ArrayList arrayList = this.f42794e3;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.f42798i3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f42808t3) {
            ArrayList arrayList = this.f42802n3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                n1 n1Var = (n1) getChildAt(i10);
                float measuredHeight = ((n1Var.getMeasuredHeight() + n1Var.getTop()) + (n1Var.getMeasuredHeight() >> 1)) / (n1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                n1Var.f42783a = clamp;
                n1Var.f42784b.setTranslationX((1.0f - this.f42801m3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(n1Var);
            }
            Collections.sort(arrayList, this.f42803o3);
            if ((this.f42797h3 || this.f42805q3) && arrayList.size() > 0 && !this.f42794e3.isEmpty()) {
                View view = (View) hg.c.g(1, arrayList);
                this.f42804p3 = view;
                y1(view, !this.f42797h3);
                this.f42797h3 = false;
                this.f42805q3 = false;
            } else if (this.f42804p3 != hg.c.g(1, arrayList)) {
                this.f42804p3 = (View) hg.c.g(1, arrayList);
                if (this.f42799k3) {
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
        NotificationCenter.getInstance(this.f42798i3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        z1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f42798i3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f42796g3 && !this.f42794e3.isEmpty() && getChildCount() > 0) {
            this.f42796g3 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 29));
        }
        int i14 = this.f42807s3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                y1(K.f43068a, false);
            }
            this.f42807s3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f42806r3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f42806r3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f42809u3 != z10) {
            this.f42809u3 = z10;
            if (z10) {
                z1();
                this.f42805q3 = true;
                invalidate();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.f42800l3);
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
        if (this.f42808t3 != z10) {
            this.f42808t3 = z10;
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
            n1 n1Var = (n1) getChildAt(i10);
            if (n1Var == view) {
                n1Var.a(true, true, z10);
            } else {
                n1Var.a(!this.j3, false, z10);
            }
        }
    }

    public final void z1() {
        if (!this.f42809u3) {
            return;
        }
        pg.c1 c1Var = this.f42800l3;
        AndroidUtilities.cancelRunOnUIThread(c1Var);
        AndroidUtilities.runOnUIThread(c1Var, 2700L);
    }
}
