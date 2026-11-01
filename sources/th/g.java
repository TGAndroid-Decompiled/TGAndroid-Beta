package th;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.tw;
public final class g extends uk0 {
    public final int f48994e3;
    public final tw f48995f3;

    public g(tw twVar, Context context, int i10) {
        super(context, null);
        this.f48994e3 = i10;
        this.f48995f3 = twVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        switch (this.f48994e3) {
            case 1:
                tw twVar = this.f48995f3;
                ArrayList arrayList = twVar.P;
                arrayList.clear();
                int i10 = 0;
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    l lVar = (l) getChildAt(i11);
                    int R = RecyclerView.R(lVar);
                    lVar.f49165b = R;
                    boolean z11 = true;
                    lVar.f49163a = true;
                    if (R == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lVar.d = z10;
                    if (R != twVar.D.size() - 1) {
                        z11 = false;
                    }
                    lVar.f49167c = z11;
                    arrayList.add(lVar);
                }
                Collections.sort(arrayList, twVar.f49238w0);
                while (i10 < arrayList.size()) {
                    l lVar2 = (l) arrayList.get(i10);
                    int save = canvas.save();
                    canvas.translate(lVar2.getX(), lVar2.getY());
                    if (lVar2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), (int) (lVar2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(lVar2.getScaleX(), lVar2.getScaleY(), org.telegram.messenger.i0.L(14.0f), lVar2.getCy());
                    lVar2.draw(canvas2);
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
        switch (this.f48994e3) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    tw twVar = this.f48995f3;
                    if (twVar.f49214c0 > 0.2f || twVar.getAlpha() == 0.0f) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return false;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f48994e3) {
            case 0:
                if (this.f48995f3.P.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void l0(int i10) {
        switch (this.f48994e3) {
            case 1:
                vh.p2 p2Var = this.f48995f3.J;
                if (p2Var != null) {
                    p2Var.e(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f48994e3) {
            case 1:
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f48994e3) {
            case 0:
                ArrayList arrayList = this.f48995f3.f49212b0;
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
        switch (this.f48994e3) {
            case 1:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
