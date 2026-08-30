package yg;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k;
public final class h extends RecyclerView {
    public final e R0;
    public final Paint S0;
    public RenderNode T0;
    public float U0;
    public View V0;
    public g W0;
    public a X0;
    public int Y0;
    public int Z0;
    public int f47268a1;

    public h(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.S0 = paint;
        this.Z0 = Integer.MIN_VALUE;
        this.f47268a1 = Integer.MIN_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new k(1, true, 20));
        i(new nh.k(10));
        e eVar = new e(this);
        this.R0 = eVar;
        setAdapter(eVar);
        f fVar = new f(this);
        fVar.f5818m = false;
        fVar.C = false;
        fVar.o(nr.h);
        fVar.n(320L);
        setItemAnimator(fVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f10 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                f10 = Math.min(f10, childAt.getY());
            }
        }
        return f10;
    }

    public final void C0(int i10, TLRPC.InputGroupCall inputGroupCall) {
        int i11;
        e eVar = this.R0;
        if (eVar.d && (i11 = eVar.e) != -1 && eVar.f47267f != null) {
            GroupCallMessagesController.getInstance(i11).unsubscribeFromCallMessages(eVar.f47267f.f19201id, eVar);
        }
        eVar.e = i10;
        eVar.f47267f = inputGroupCall;
        if (eVar.d) {
            eVar.f47266c = GroupCallMessagesController.getInstance(i10).getCallMessages(eVar.f47267f.f19201id);
            eVar.l();
            GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(eVar.f47267f.f19201id, eVar);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.Y0;
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = measuredHeight + dp;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f10 = i10;
        if (f10 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f11 = measuredHeight;
        float f12 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f11, f12, f10, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i10);
        this.Z0 = measuredHeight;
        this.f47268a1 = i10;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f11);
        canvas.drawRect(0.0f, 0.0f, f12, dp, this.S0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i10, measuredWidth, measuredHeight2);
        this.Z0 = i10;
        this.f47268a1 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.Z0 = Integer.MIN_VALUE;
        this.f47268a1 = Integer.MIN_VALUE;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean contains;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (y10 < getMeasuredHeight() - this.Y0) {
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
                            float x11 = x10 - childAt.getX();
                            float y11 = y10 - childAt.getY();
                            c9.a aVar = cVar.f47263w;
                            if (aVar == null) {
                                contains = false;
                            } else {
                                contains = ((RectF) aVar.f2143a).contains(x11, y11);
                            }
                            if (contains) {
                                z4 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i10++;
                } else {
                    z4 = false;
                    break;
                }
            }
            if (!z4) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.Z0 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.Z0) {
            return true;
        }
        if (this.f47268a1 != Integer.MIN_VALUE && view.getY() > this.f47268a1) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.R0;
        eVar.d = true;
        int i10 = eVar.e;
        if (i10 != -1 && eVar.f47267f != null) {
            eVar.f47266c = GroupCallMessagesController.getInstance(i10).getCallMessages(eVar.f47267f.f19201id);
            eVar.l();
            GroupCallMessagesController.getInstance(eVar.e).subscribeToCallMessages(eVar.f47267f.f19201id, eVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.R0;
        eVar.d = false;
        int i10 = eVar.e;
        if (i10 != -1 && eVar.f47267f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(eVar.f47267f.f19201id, eVar);
        }
    }

    public void setBlurRoot(View view) {
        this.V0 = view;
    }

    public void setClickCellDelegate(a aVar) {
        this.X0 = aVar;
    }

    public void setDelegate(g gVar) {
        this.W0 = gVar;
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
        if (this.Y0 != i10) {
            this.Y0 = i10;
            invalidate();
        }
    }
}
