package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.nx;
public final class g extends vl0 {
    public final int X2;
    public final nx Y2;

    public g(nx nxVar, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = nxVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.X2) {
            case 1:
                nx nxVar = this.Y2;
                ArrayList arrayList = nxVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    k kVar = (k) getChildAt(i11);
                    int R = RecyclerView.R(kVar);
                    kVar.f48565b = R;
                    boolean z11 = true;
                    kVar.f48563a = true;
                    if (R == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kVar.d = z10;
                    if (R != nxVar.f48628y.size() - 1) {
                        z11 = false;
                    }
                    kVar.f48567c = z11;
                    arrayList.add(kVar);
                }
                Collections.sort(arrayList, nxVar.f48625w0);
                while (i10 < arrayList.size()) {
                    k kVar2 = (k) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(kVar2.getX(), kVar2.getY());
                    if (kVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (kVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(kVar2.getScaleX(), kVar2.getScaleY(), AndroidUtilities.dp(14.0f), kVar2.getCy());
                    kVar2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i10++;
                    canvas = canvas2;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    nx nxVar = this.Y2;
                    if (nxVar.f48601c0 > 0.2f || nxVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.X2) {
            case 0:
                if (this.Y2.P.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        switch (this.X2) {
            case 1:
                bi.x4 x4Var = this.Y2.J;
                if (x4Var != null) {
                    x4Var.e(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 0:
                ArrayList arrayList = this.Y2.f48599b0;
                super.onLayout(z10, i10, i11, i12, i13);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Runnable) arrayList.get(i14)).run();
                }
                arrayList.clear();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
