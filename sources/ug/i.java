package ug;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j;

public final class i extends RecyclerView {
    public final f Q0;
    public final Paint R0;
    public RenderNode S0;
    public float T0;
    public View U0;
    public h V0;
    public a W0;
    public int X0;
    public int Y0;
    public int Z0;

    public i(LaunchActivity launchActivity) {
        super(launchActivity, null);
        Paint paint = new Paint(1);
        this.R0 = paint;
        this.Y0 = Integer.MIN_VALUE;
        this.Z0 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new j(1, 1 == true ? 1 : 0, 20));
        i(new jh.j(10));
        f fVar = new f(this);
        this.Q0 = fVar;
        setAdapter(fVar);
        g gVar = new g(this);
        gVar.f5819m = false;
        gVar.C = false;
        gVar.o(er.h);
        gVar.n(320L);
        setItemAnimator(gVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float fMin = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                fMin = Math.min(fMin, childAt.getY());
            }
        }
        return fMin;
    }

    public final void C0(int i10, TLRPC.InputGroupCall inputGroupCall) {
        int i11;
        f fVar = this.Q0;
        if (fVar.d && (i11 = fVar.f48655e) != -1 && fVar.f48656f != null) {
            GroupCallMessagesController.getInstance(i11).unsubscribeFromCallMessages(fVar.f48656f.f22397id, fVar);
        }
        fVar.f48655e = i10;
        fVar.f48656f = inputGroupCall;
        if (fVar.d) {
            fVar.f48654c = GroupCallMessagesController.getInstance(i10).getCallMessages(fVar.f48656f.f22397id);
            fVar.l();
            GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(fVar.f48656f.f22397id, fVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.X0;
        int iDp = AndroidUtilities.dp(16.0f);
        int i10 = measuredHeight + iDp;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f10 = i10;
        if (f10 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f11 = measuredHeight;
        float f12 = measuredWidth;
        int iSaveLayer = canvas.saveLayer(0.0f, f11, f12, f10, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i10);
        this.Y0 = measuredHeight;
        this.Z0 = i10;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f11);
        canvas.drawRect(0.0f, 0.0f, f12, iDp, this.R0);
        canvas.restoreToCount(iSaveLayer);
        canvas.save();
        canvas.clipRect(0, i10, measuredWidth, measuredHeight2);
        this.Y0 = i10;
        this.Z0 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.Y0 = Integer.MIN_VALUE;
        this.Z0 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (y10 < getMeasuredHeight() - this.X0) {
                return false;
            }
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    z10 = false;
                    break;
                }
                View childAt = getChildAt(i10);
                if (childAt instanceof d) {
                    d dVar = (d) childAt;
                    if (dVar.getVisibility() == 0) {
                        float x10 = x8 - childAt.getX();
                        float y11 = y10 - childAt.getY();
                        b bVar = dVar.f48651w;
                        if (bVar == null ? false : ((RectF) bVar.f48639c).contains(x10, y11)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i10++;
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.Y0 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.Y0) {
            return true;
        }
        if (this.Z0 == Integer.MIN_VALUE || view.getY() <= this.Z0) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = this.Q0;
        fVar.d = true;
        int i10 = fVar.f48655e;
        if (i10 == -1 || fVar.f48656f == null) {
            return;
        }
        fVar.f48654c = GroupCallMessagesController.getInstance(i10).getCallMessages(fVar.f48656f.f22397id);
        fVar.l();
        GroupCallMessagesController.getInstance(fVar.f48655e).subscribeToCallMessages(fVar.f48656f.f22397id, fVar);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.Q0;
        fVar.d = false;
        int i10 = fVar.f48655e;
        if (i10 == -1 || fVar.f48656f == null) {
            return;
        }
        GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(fVar.f48656f.f22397id, fVar);
    }

    public void setBlurRoot(View view) {
        this.U0 = view;
    }

    public void setClickCellDelegate(a aVar) {
        this.W0 = aVar;
    }

    public void setDelegate(h hVar) {
        this.V0 = hVar;
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            invalidate();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i10) {
        if (this.X0 != i10) {
            this.X0 = i10;
            invalidate();
        }
    }
}
