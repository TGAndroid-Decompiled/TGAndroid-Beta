package ph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.nr;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class k3 extends FrameLayout implements RendererCommon.RendererEvents, NotificationCenter.NotificationCenterDelegate {
    public int f41843a;
    public final j3 f41844b;
    public final SurfaceViewRenderer f41845c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.p9 e;
    public final TextureView f41846f;
    public View h;
    public Runnable f41847n;
    public boolean f41848r;
    public long f41849s;
    public nh.c4 v;
    public boolean f41850w;
    public float f41851x;
    public boolean f41852y;

    public k3(Context context, int i10) {
        super(context);
        this.f41843a = i10;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.e = p9Var;
        p9Var.setAlpha(0.75f);
        addView(p9Var, k7.b6.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f41846f = textureView;
        addView(textureView, k7.b6.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, k7.b6.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f41845c = null;
        j3 j3Var = new j3(context);
        this.f41844b = j3Var;
        j3Var.setAlpha(0.0f);
        j3Var.setVisibility(8);
        addView(j3Var, k7.b6.e(-1, -1, 119));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.isAvailable();
        }
        if (this.f41845c != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f41845c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.f41848r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z4) {
        float f10;
        ig.u uVar;
        if (this.f41852y == z4) {
            return;
        }
        this.f41852y = z4;
        j3 j3Var = this.f41844b;
        int i10 = 0;
        j3Var.setVisibility(0);
        d dVar = j3Var.f41778b;
        ViewPropertyAnimator animate = j3Var.animate();
        if (this.f41852y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).setInterpolator(nr.h).setDuration(320L).withEndAction(new kv0(12, this, z4)).start();
        dVar.setVisibility((!z4 || runnable == null) ? 8 : 8);
        if (runnable == null) {
            uVar = null;
        } else {
            uVar = new ig.u(4, runnable);
        }
        dVar.setOnClickListener(uVar);
    }

    public final void d(long j10, nh.c4 c4Var) {
        nh.z0 z0Var;
        nh.e1 e1Var;
        nh.e1 e1Var2;
        int d;
        int d10;
        TextureViewRenderer textureViewRenderer;
        int dp;
        int width;
        if (c4Var == null) {
            long j11 = this.f41849s;
            if (j11 != 0 && this.f41848r && (textureViewRenderer = this.d) != null) {
                File file = new File(FileLoader.getDirectory(4), e2.c.i(j11, "live", ".jpg"));
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = AndroidUtilities.dp(100.0f);
                        dp = (int) ((bitmap.getHeight() / bitmap.getWidth()) * AndroidUtilities.dp(100.0f));
                    } else {
                        dp = AndroidUtilities.dp(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * AndroidUtilities.dp(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, dp, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, AndroidUtilities.dp(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }
        boolean z4 = true;
        if (this.f41849s != j10) {
            org.telegram.ui.Components.p9 p9Var = this.e;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 == 0) {
                p9Var.b();
            } else {
                String absolutePath = new File(FileLoader.getDirectory(4), e2.c.i(j10, "live", ".jpg")).getAbsolutePath();
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.f41843a).getUser(Long.valueOf(j10));
                    ImageLocation forUser = ImageLocation.getForUser(this.f41843a, user, 1);
                    if (user != null) {
                        d10 = org.telegram.ui.Components.z8.d(user.f19331id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    p9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forUser, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), 0L, null, user, 0);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.f41843a).getChat(Long.valueOf(-j10));
                    ImageLocation forChat = ImageLocation.getForChat(this.f41843a, chat, 1);
                    if (chat != null) {
                        d = org.telegram.ui.Components.z8.d(chat.f19184id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    p9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forChat, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), 0L, null, chat, 0);
                }
            }
        }
        this.f41849s = j10;
        this.v = c4Var;
        if (this.f41848r && c4Var != null && !c4Var.f15144f) {
            c4Var.f15144f = true;
            c4Var.a();
        }
        z4 = (c4Var == null || (e1Var2 = c4Var.f15141a) == null || !e1Var2.n()) ? false : false;
        if (c4Var != null && (e1Var = c4Var.f15141a) != null && e1Var.a()) {
            nh.e1 e1Var3 = c4Var.f15141a;
            Objects.requireNonNull(e1Var3);
            z0Var = new nh.z0(e1Var3, 12);
        } else {
            z0Var = null;
        }
        c(z0Var, z4);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        nh.e1 e1Var;
        nh.z0 z0Var;
        if (i10 == NotificationCenter.liveStoryUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            nh.c4 c4Var = this.v;
            if (c4Var != null && (e1Var = c4Var.f15141a) != null && e1Var.g() == longValue) {
                boolean n10 = this.v.f15141a.n();
                if (this.v.f15141a.a()) {
                    nh.e1 e1Var2 = this.v.f15141a;
                    Objects.requireNonNull(e1Var2);
                    z0Var = new nh.z0(e1Var2, 12);
                } else {
                    z0Var = null;
                }
                c(z0Var, n10);
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
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureView textureView = this.f41846f;
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
        if (AndroidUtilities.makingGlobalBlurBitmap) {
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
            TextureView textureView = this.f41846f;
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

    public final void e(boolean z4, boolean z10) {
        if (!z4 && z10) {
            return;
        }
        float f10 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = getTextureView().animate();
            if (z4) {
                f10 = 1.0f;
            }
            org.telegram.ui.b.p(animate.alpha(f10), nr.h, 320L);
            return;
        }
        getTextureView().animate().cancel();
        View textureView = getTextureView();
        if (z4) {
            f10 = 1.0f;
        }
        textureView.setAlpha(f10);
    }

    public final void f() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (isAttachedToWindow() && measuredWidth > 0 && measuredHeight > 0) {
            View view = this.d;
            if (view == null) {
                view = this.f41845c;
            }
            TextureView textureView = this.f41846f;
            int measuredWidth2 = textureView.getMeasuredWidth();
            int measuredHeight2 = textureView.getMeasuredHeight();
            textureView.setPivotX(0.0f);
            textureView.setPivotY(0.0f);
            float f10 = measuredWidth;
            float f11 = measuredWidth2;
            float f12 = measuredHeight;
            float f13 = measuredHeight2;
            float max = Math.max(f10 / f11, f12 / f13);
            textureView.setScaleX(max);
            textureView.setScaleY(max);
            textureView.setTranslationX((f10 - (f11 * max)) / 2.0f);
            textureView.setTranslationY(((f12 - (f13 * max)) / 2.0f) - (this.f41851x / 2.0f));
            float measuredWidth3 = view.getMeasuredWidth();
            float measuredHeight3 = view.getMeasuredHeight();
            float max2 = Math.max(measuredWidth3 / f10, measuredHeight3 / f12);
            view.setScaleX(max2);
            view.setScaleY(max2);
            view.setTranslationX((f10 - (measuredWidth3 * max2)) / 2.0f);
            view.setTranslationY(((f12 - (measuredHeight3 * max2)) / 2.0f) - (this.f41851x / 2.0f));
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
            addView(view, k7.b6.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f41845c;
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
        SurfaceViewRenderer surfaceViewRenderer = this.f41845c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f41845c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f41846f);
        }
        NotificationCenter.getInstance(this.f41843a).addObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41848r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f41845c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        NotificationCenter.getInstance(this.f41843a).removeObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f41848r) {
            nh.c4 c4Var = this.v;
            if (c4Var != null && !c4Var.f15144f) {
                c4Var.f15144f = true;
                c4Var.a();
            }
            this.f41848r = true;
        }
        e(true, true);
        Runnable runnable = this.f41847n;
        if (runnable != null) {
            runnable.run();
            this.f41847n = null;
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.e.layout(0, 0, i14, i15);
        this.f41844b.layout(0, 0, i14, i15);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i14, i15);
        }
        TextureView textureView = this.f41846f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f41845c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view;
        this.f41850w = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f41850w = false;
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            view = textureViewRenderer;
        } else {
            view = this.f41845c;
        }
        TextureView textureView = this.f41846f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f41850w) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i10) {
        if (this.f41843a == i10) {
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f41843a);
            int i11 = NotificationCenter.liveStoryUpdated;
            notificationCenter.removeObserver(this, i11);
            this.f41843a = i10;
            NotificationCenter.getInstance(i10).addObserver(this, i11);
            return;
        }
        this.f41843a = i10;
    }

    public void setKeyboardOffset(float f10) {
        this.f41851x = f10;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f41847n = runnable;
    }

    public void setSecure(boolean z4) {
        SurfaceViewRenderer surfaceViewRenderer = this.f41845c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z4);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
