package tg;

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
import ih.l;
import of.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;
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
        super(launchActivity);
        Paint paint = new Paint(1);
        this.R0 = paint;
        this.Y0 = Integer.MIN_VALUE;
        this.Z0 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new y(1, true, 20));
        i(new l(10));
        f fVar = new f(this);
        this.Q0 = fVar;
        setAdapter(fVar);
        g gVar = new g(this);
        gVar.f5532m = false;
        gVar.C = false;
        gVar.o(gr.h);
        gVar.n(320L);
        setItemAnimator(gVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f10 = 2.1474836E9f;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0) {
                f10 = Math.min(f10, childAt.getY());
            }
        }
        return f10;
    }

    public final void C0(int i9, TLRPC.InputGroupCall inputGroupCall) {
        int i10;
        f fVar = this.Q0;
        if (fVar.d && (i10 = fVar.f47933e) != -1 && fVar.f47934f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(fVar.f47934f.f22397id, fVar);
        }
        fVar.f47933e = i9;
        fVar.f47934f = inputGroupCall;
        if (fVar.d) {
            fVar.f47932c = GroupCallMessagesController.getInstance(i9).getCallMessages(fVar.f47934f.f22397id);
            fVar.l();
            GroupCallMessagesController.getInstance(i9).subscribeToCallMessages(fVar.f47934f.f22397id, fVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.X0;
        int dp = AndroidUtilities.dp(16.0f);
        int i9 = measuredHeight + dp;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f10 = i9;
        if (f10 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f11 = measuredHeight;
        float f12 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f11, f12, f10, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i9);
        this.Y0 = measuredHeight;
        this.Z0 = i9;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f11);
        canvas.drawRect(0.0f, 0.0f, f12, dp, this.R0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i9, measuredWidth, measuredHeight2);
        this.Y0 = i9;
        this.Z0 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.Y0 = Integer.MIN_VALUE;
        this.Z0 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (y10 < getMeasuredHeight() - this.X0) {
                return false;
            }
            int childCount = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 < childCount) {
                    View childAt = getChildAt(i9);
                    if (childAt instanceof d) {
                        d dVar = (d) childAt;
                        if (dVar.getVisibility() == 0) {
                            float x11 = x10 - childAt.getX();
                            float y11 = y10 - childAt.getY();
                            b bVar = dVar.f47929w;
                            if (bVar == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) bVar.f47917c).contains(x11, y11);
                            }
                            if (contains) {
                                z10 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i9++;
                } else {
                    z10 = false;
                    break;
                }
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
        if (this.Z0 != Integer.MIN_VALUE && view.getY() > this.Z0) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = this.Q0;
        fVar.d = true;
        int i9 = fVar.f47933e;
        if (i9 != -1 && fVar.f47934f != null) {
            fVar.f47932c = GroupCallMessagesController.getInstance(i9).getCallMessages(fVar.f47934f.f22397id);
            fVar.l();
            GroupCallMessagesController.getInstance(fVar.f47933e).subscribeToCallMessages(fVar.f47934f.f22397id, fVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.Q0;
        fVar.d = false;
        int i9 = fVar.f47933e;
        if (i9 != -1 && fVar.f47934f != null) {
            GroupCallMessagesController.getInstance(i9).unsubscribeFromCallMessages(fVar.f47934f.f22397id, fVar);
        }
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
            for (int i9 = 0; i9 < childCount; i9++) {
                getChildAt(i9).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i9) {
        if (this.X0 != i9) {
            this.X0 = i9;
            invalidate();
        }
    }
}
