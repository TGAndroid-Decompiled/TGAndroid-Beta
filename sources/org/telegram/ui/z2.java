package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class z2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.l9 {
    public static final int S = 0;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public final int H;
    public TL_iv.pageBlockVideo I;
    public a3 J;
    public TL_iv.PageBlock K;
    public TLRPC.Document L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public MessageObject.GroupedMessagePosition Q;
    public boolean R;
    public final n70 f40640a;
    public final j4 f40641b;
    public d3 f40642c;
    public d3 d;
    public final ImageReceiver e;
    public final FrameLayout f40643f;
    public final o4 h;
    public final TextureView f40644n;
    public final RadialProgress2 f40645r;
    public final e1 f40646s;
    public final int v;
    public boolean f40647w;
    public int f40648x;
    public int f40649y;

    public z2(Context context, n70 n70Var, j4 j4Var, int i10) {
        super(context);
        this.f40640a = n70Var;
        this.f40641b = j4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f40645r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.H = DownloadController.getInstance(((l4) n70Var).U).generateObserverTag();
        e1 e1Var = new e1(context, n70Var, j4Var, 1);
        this.f40646s = e1Var;
        o4 o4Var = new o4(context);
        this.h = o4Var;
        o4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f40644n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f40643f = frameLayout;
        o4Var.addView(textureView, k7.b6.e(-1, -2, 1));
        frameLayout.addView(o4Var, k7.b6.e(-1, -1, 17));
        addView(frameLayout, k7.b6.c(-2.0f, -1));
        addView(e1Var, k7.b6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 8;
        }
        if (i10 == 3) {
            return 0;
        }
        return 4;
    }

    public final void a() {
        int i10 = ((l4) this.f40640a).U;
        int i11 = this.F;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.f40645r;
        if (i11 == 0) {
            this.P = false;
            radialProgress2.o(0.0f, false);
            boolean z4 = this.M;
            j4 j4Var = this.f40641b;
            if (z4) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.L), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.L.thumbs, 40), this.L), "80_80_b", this.L.size, null, j4Var.B, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.L, j4Var.B, 1, 1);
            }
            this.F = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i11 == 1) {
            this.P = true;
            if (this.M) {
                imageReceiver.cancelLoadImage();
            } else {
                FileLoader.getInstance(i10).cancelLoadFile(this.L);
            }
            this.F = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 2) {
            imageReceiver.setAllowStartAnimation(true);
            imageReceiver.startAnimation();
            this.F = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, a3 a3Var, boolean z4, boolean z10) {
        boolean z11;
        n70 n70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.I;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (n70Var = this.f40640a).f36482w) != null && n70Var.f36483x == this) {
            a0.h hVar = n70Var.f36484y;
            long j10 = pageblockvideo2.video_id;
            a3 a2 = a3.a(videoPlayerHolderBase, this);
            this.J = a2;
            hVar.k(a2, j10);
        }
        this.I = pageblockvideo;
        this.J = a3Var;
        this.K = null;
        this.N = z4;
        j4 j4Var = this.f40641b;
        if (j4Var != null) {
            this.L = i4.a(j4Var.B, pageblockvideo.video_id);
        } else {
            this.L = null;
        }
        if (!MessageObject.isVideoDocument(this.L) && !MessageObject.isGifDocument(this.L)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.M = z11;
        this.f40647w = z10;
        this.f40646s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(a3 a3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        a3 a3Var2 = this.J;
        if (a3Var2 != null && (bitmap2 = a3Var.f32449b) != null && (bitmap3 = a3Var2.f32449b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.J.f32449b = null;
        }
        a3 a3Var3 = this.J;
        if (a3Var3 != null && a3Var.f32449b == null && (bitmap = a3Var3.f32449b) != null) {
            a3Var.f32448a = a3Var3.f32448a;
            a3Var.f32449b = bitmap;
        }
        this.J = a3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (!this.R) {
                this.R = true;
                imageReceiver.onAttachedToWindow();
                e(false);
            }
        } else if (!this.R) {
        } else {
            this.R = false;
            TL_iv.pageBlockVideo pageblockvideo = this.I;
            n70 n70Var = this.f40640a;
            if (pageblockvideo != null && (videoPlayerHolderBase = n70Var.f36482w) != null && n70Var.f36483x == this) {
                a0.h hVar = n70Var.f36484y;
                long j10 = pageblockvideo.video_id;
                a3 a2 = a3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((l4) n70Var).U).removeLoadingFileObserver(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z4) {
        boolean z10;
        int i10 = ((l4) this.f40640a).U;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.L);
        boolean z11 = true;
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.L, true);
        if (!pathToAttach.exists() && !pathToAttach2.exists()) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f40645r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z10) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            if (!this.M) {
                this.F = 3;
            } else {
                this.F = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            a3 a3Var = this.J;
            float f10 = 0.0f;
            if (a3Var != null && a3Var.f32449b != null) {
                this.F = -1;
            } else {
                if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                    if (!this.P && this.O && this.M) {
                        this.F = 1;
                    } else {
                        this.F = 0;
                    }
                } else {
                    this.F = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z4);
                radialProgress2.o(f10, false);
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z4);
            radialProgress2.o(f10, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f40642c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    public View getChannelCell() {
        return this.f40646s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.I;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.H;
    }

    public TextureView getTextureView() {
        return this.f40644n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        d3 d3Var = this.f40642c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        d3 d3Var = this.f40642c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.I != null) {
            ImageReceiver imageReceiver = this.e;
            if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(imageReceiver.getDrawRegion(), l4.l1);
            }
            imageReceiver.draw(canvas);
            d3 d3Var = this.f40642c;
            n70 n70Var = this.f40640a;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f40648x, this.f40649y);
                l4.v(n70Var, canvas, this, 0);
                this.f40642c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f40648x, this.f40649y + this.B);
                l4.v(n70Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
            l4.u(canvas, n70Var, this.I, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.getVisible()) {
                this.f40645r.draw(canvas);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        e(false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
        if (this.f40642c != null) {
            sb.append(", ");
            sb.append(this.f40642c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f40645r.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.F != 1) {
            e(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f40645r.o(1.0f, true);
        if (this.M) {
            this.F = 2;
            a();
            return;
        }
        e(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
