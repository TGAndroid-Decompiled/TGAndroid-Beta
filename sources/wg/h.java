package wg;

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
import lh.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k;
public final class h extends RecyclerView {
    public final e Q0;
    public final Paint R0;
    public RenderNode S0;
    public float T0;
    public View U0;
    public g V0;
    public a W0;
    public int X0;
    public int Y0;
    public int Z0;

    public h(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.R0 = paint;
        this.Y0 = Integer.MIN_VALUE;
        this.Z0 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new k(1, true, 20));
        i(new j(10));
        e eVar = new e(this);
        this.Q0 = eVar;
        setAdapter(eVar);
        f fVar = new f(this);
        fVar.f6463m = false;
        fVar.C = false;
        fVar.o(jr.h);
        fVar.n(320L);
        setItemAnimator(fVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f9 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                f9 = Math.min(f9, childAt.getY());
            }
        }
        return f9;
    }

    public final void C0(int i10, TLRPC.InputGroupCall inputGroupCall) {
        int i11;
        e eVar = this.Q0;
        if (eVar.d && (i11 = eVar.f49976e) != -1 && eVar.f49977f != null) {
            GroupCallMessagesController.getInstance(i11).unsubscribeFromCallMessages(eVar.f49977f.f22409id, eVar);
        }
        eVar.f49976e = i10;
        eVar.f49977f = inputGroupCall;
        if (eVar.d) {
            eVar.f49975c = GroupCallMessagesController.getInstance(i10).getCallMessages(eVar.f49977f.f22409id);
            eVar.l();
            GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(eVar.f49977f.f22409id, eVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.X0;
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = measuredHeight + dp;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f9 = i10;
        if (f9 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f10 = measuredHeight;
        float f11 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f10, f11, f9, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i10);
        this.Y0 = measuredHeight;
        this.Z0 = i10;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f10);
        canvas.drawRect(0.0f, 0.0f, f11, dp, this.R0);
        canvas.restoreToCount(saveLayer);
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
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (y8 < getMeasuredHeight() - this.X0) {
                return false;
            }
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = getChildAt(i10);
                    if (childAt instanceof c) {
                        c cVar = (c) childAt;
                        if (cVar.getVisibility() == 0) {
                            float x10 = x4 - childAt.getX();
                            float y10 = y8 - childAt.getY();
                            a9.a aVar = cVar.f49972w;
                            if (aVar == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) aVar.f228c).contains(x10, y10);
                            }
                            if (contains) {
                                z10 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i10++;
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
        e eVar = this.Q0;
        eVar.d = true;
        int i10 = eVar.f49976e;
        if (i10 != -1 && eVar.f49977f != null) {
            eVar.f49975c = GroupCallMessagesController.getInstance(i10).getCallMessages(eVar.f49977f.f22409id);
            eVar.l();
            GroupCallMessagesController.getInstance(eVar.f49976e).subscribeToCallMessages(eVar.f49977f.f22409id, eVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.Q0;
        eVar.d = false;
        int i10 = eVar.f49976e;
        if (i10 != -1 && eVar.f49977f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(eVar.f49977f.f22409id, eVar);
        }
    }

    public void setBlurRoot(View view) {
        this.U0 = view;
    }

    public void setClickCellDelegate(a aVar) {
        this.W0 = aVar;
    }

    public void setDelegate(g gVar) {
        this.V0 = gVar;
    }

    @Override
    public void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            super.setTranslationY(f9);
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
