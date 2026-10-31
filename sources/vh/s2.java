package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.yv0;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class s2 extends FrameLayout implements RendererCommon.RendererEvents, us {
    public boolean D;
    public int f51914a;
    public final kg.x f51915b;
    public final SurfaceViewRenderer f51916c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.g9 e;
    public final TextureView f51917f;
    public View h;
    public Runnable f51918n;
    public boolean f51919r;
    public long f51920s;
    public k2.t0 f51921w;
    public boolean f51922x;
    public float f51923y;

    public s2(Context context, int i10) {
        super(context);
        this.f51914a = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.setAlpha(0.75f);
        addView(g9Var, w7.b6.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f51917f = textureView;
        addView(textureView, w7.b6.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, w7.b6.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f51916c = null;
        kg.x xVar = new kg.x(context);
        this.f51915b = xVar;
        xVar.setAlpha(0.0f);
        xVar.setVisibility(8);
        addView(xVar, w7.b6.e(-1, -1, 119));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.isAvailable();
        }
        if (this.f51916c != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f51916c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.f51919r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        og.u uVar;
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        kg.x xVar = this.f51915b;
        int i10 = 0;
        xVar.setVisibility(0);
        d dVar = (d) xVar.d;
        ViewPropertyAnimator animate = xVar.animate();
        if (this.D) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).setInterpolator(gr.h).setDuration(320L).withEndAction(new yv0(11, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 8);
        if (runnable == null) {
            uVar = null;
        } else {
            uVar = new og.u(4, runnable);
        }
        dVar.setOnClickListener(uVar);
    }

    public final void d(long r27, k2.t0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: vh.s2.d(long, k2.t0):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        th.s0 s0Var;
        th.n0 n0Var;
        if (i10 == zs.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            k2.t0 t0Var = this.f51921w;
            if (t0Var != null && (s0Var = (th.s0) t0Var.f10766a) != null && s0Var.g() == longValue) {
                boolean n10 = ((th.s0) this.f51921w.f10766a).n();
                if (((th.s0) this.f51921w.f10766a).a()) {
                    th.s0 s0Var2 = (th.s0) this.f51921w.f10766a;
                    Objects.requireNonNull(s0Var2);
                    n0Var = new th.n0(s0Var2, 12);
                } else {
                    n0Var = null;
                }
                c(n0Var, n10);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (org.telegram.messenger.i0.m0) {
            TextureView textureView = this.f51917f;
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.save();
                canvas.translate(textureView.getX(), textureView.getY());
                canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                return;
            }
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (org.telegram.messenger.i0.m0) {
            TextureViewRenderer textureViewRenderer = this.d;
            if (view == textureViewRenderer) {
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(textureViewRenderer.getX(), textureViewRenderer.getY());
                    canvas.scale((textureViewRenderer.getScaleX() * textureViewRenderer.getWidth()) / bitmap.getWidth(), (textureViewRenderer.getScaleY() * textureViewRenderer.getHeight()) / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
            TextureView textureView = this.f51917f;
            if (view == textureView) {
                Bitmap bitmap2 = textureView.getBitmap();
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(textureView.getX(), textureView.getY());
                    canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap2.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10, boolean z11) {
        if (!z10 && z11) {
            return;
        }
        float f7 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = getTextureView().animate();
            if (z10) {
                f7 = 1.0f;
            }
            z20.m(animate.alpha(f7), gr.h, 320L);
            return;
        }
        getTextureView().animate().cancel();
        View textureView = getTextureView();
        if (z10) {
            f7 = 1.0f;
        }
        textureView.setAlpha(f7);
    }

    public final void f() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (isAttachedToWindow() && measuredWidth > 0 && measuredHeight > 0) {
            View view = this.d;
            if (view == null) {
                view = this.f51916c;
            }
            TextureView textureView = this.f51917f;
            int measuredWidth2 = textureView.getMeasuredWidth();
            int measuredHeight2 = textureView.getMeasuredHeight();
            textureView.setPivotX(0.0f);
            textureView.setPivotY(0.0f);
            float f7 = measuredWidth;
            float f10 = measuredWidth2;
            float f11 = measuredHeight;
            float f12 = measuredHeight2;
            float max = Math.max(f7 / f10, f11 / f12);
            textureView.setScaleX(max);
            textureView.setScaleY(max);
            textureView.setTranslationX((f7 - (f10 * max)) / 2.0f);
            textureView.setTranslationY(((f11 - (f12 * max)) / 2.0f) - (this.f51923y / 2.0f));
            float measuredWidth3 = view.getMeasuredWidth();
            float measuredHeight3 = view.getMeasuredHeight();
            float max2 = Math.max(measuredWidth3 / f7, measuredHeight3 / f11);
            view.setScaleX(max2);
            view.setScaleY(max2);
            view.setTranslationX((f7 - (measuredWidth3 * max2)) / 2.0f);
            view.setTranslationY(((f11 - (measuredHeight3 * max2)) / 2.0f) - (this.f51923y / 2.0f));
        }
    }

    public Bitmap getBitmap() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.getBitmap();
        }
        return null;
    }

    public View getPlaceholderView() {
        if (this.h == null) {
            View view = new View(getContext());
            this.h = view;
            addView(view, w7.b6.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f51916c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f51916c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f51916c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f51917f);
        }
        zs.f(this.f51914a).c(this, zs.G2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51919r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f51916c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        zs.f(this.f51914a).n(this, zs.G2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f51919r) {
            k2.t0 t0Var = this.f51921w;
            if (t0Var != null && !t0Var.f10767b) {
                t0Var.f10767b = true;
                t0Var.b();
            }
            this.f51919r = true;
        }
        e(true, true);
        Runnable runnable = this.f51918n;
        if (runnable != null) {
            runnable.run();
            this.f51918n = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.e.layout(0, 0, i14, i15);
        this.f51915b.layout(0, 0, i14, i15);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i14, i15);
        }
        TextureView textureView = this.f51917f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f51916c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view;
        this.f51922x = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f51922x = false;
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            view = textureViewRenderer;
        } else {
            view = this.f51916c;
        }
        TextureView textureView = this.f51917f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f51922x) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i10) {
        if (this.f51914a == i10) {
            return;
        }
        if (isAttachedToWindow()) {
            zs f7 = zs.f(this.f51914a);
            int i11 = zs.G2;
            f7.n(this, i11);
            this.f51914a = i10;
            zs.f(i10).c(this, i11);
            return;
        }
        this.f51914a = i10;
    }

    public void setKeyboardOffset(float f7) {
        this.f51923y = f7;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f51918n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.f51916c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
