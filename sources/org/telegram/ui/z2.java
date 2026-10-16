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
public final class z2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.n9 {
    public static final int V = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockVideo L;
    public a3 M;
    public TL_iv.PageBlock N;
    public TLRPC.Document O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public MessageObject.GroupedMessagePosition T;
    public boolean U;
    public final z70 f42132a;
    public final i4 f42133b;
    public d3 f42134c;
    public d3 d;
    public final ImageReceiver e;
    public final FrameLayout f42135f;
    public final n4 h;
    public final TextureView f42136n;
    public final RadialProgress2 f42137r;
    public final f1 f42138s;
    public final int v;
    public boolean f42139w;
    public int f42140x;
    public int f42141y;

    public z2(Context context, z70 z70Var, i4 i4Var, int i10) {
        super(context);
        this.f42132a = z70Var;
        this.f42133b = i4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f42137r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.K = DownloadController.getInstance(((k4) z70Var).X).generateObserverTag();
        f1 f1Var = new f1(context, z70Var, i4Var, 1);
        this.f42138s = f1Var;
        n4 n4Var = new n4(context);
        this.h = n4Var;
        n4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f42136n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f42135f = frameLayout;
        n4Var.addView(textureView, w7.z5.e(-1, -2, 1));
        frameLayout.addView(n4Var, w7.z5.e(-1, -1, 17));
        addView(frameLayout, w7.z5.d(-2.0f, -1));
        addView(f1Var, w7.z5.d(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.I;
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
        int i10 = ((k4) this.f42132a).X;
        int i11 = this.I;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.f42137r;
        if (i11 == 0) {
            this.S = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.P;
            i4 i4Var = this.f42133b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.O), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.O.thumbs, 40), this.O), "80_80_b", this.O.size, null, i4Var.E, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.O, i4Var.E, 1, 1);
            }
            this.I = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i11 == 1) {
            this.S = true;
            if (this.P) {
                imageReceiver.cancelLoadImage();
            } else {
                FileLoader.getInstance(i10).cancelLoadFile(this.O);
            }
            this.I = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 2) {
            imageReceiver.setAllowStartAnimation(true);
            imageReceiver.startAnimation();
            this.I = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, a3 a3Var, boolean z10, boolean z11) {
        boolean z12;
        z70 z70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (z70Var = this.f42132a).f42181w) != null && z70Var.f42182x == this) {
            a0.h hVar = z70Var.f42183y;
            long j10 = pageblockvideo2.video_id;
            a3 a2 = a3.a(videoPlayerHolderBase, this);
            this.M = a2;
            hVar.k(a2, j10);
        }
        this.L = pageblockvideo;
        this.M = a3Var;
        this.N = null;
        this.Q = z10;
        i4 i4Var = this.f42133b;
        if (i4Var != null) {
            this.O = h4.a(i4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        if (!MessageObject.isVideoDocument(this.O) && !MessageObject.isGifDocument(this.O)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.P = z12;
        this.f42139w = z11;
        this.f42138s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(a3 a3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        a3 a3Var2 = this.M;
        if (a3Var2 != null && (bitmap2 = a3Var.f33730b) != null && (bitmap3 = a3Var2.f33730b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.M.f33730b = null;
        }
        a3 a3Var3 = this.M;
        if (a3Var3 != null && a3Var.f33730b == null && (bitmap = a3Var3.f33730b) != null) {
            a3Var.f33729a = a3Var3.f33729a;
            a3Var.f33730b = bitmap;
        }
        this.M = a3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (!this.U) {
                this.U = true;
                imageReceiver.onAttachedToWindow();
                e(false);
            }
        } else if (!this.U) {
        } else {
            this.U = false;
            TL_iv.pageBlockVideo pageblockvideo = this.L;
            z70 z70Var = this.f42132a;
            if (pageblockvideo != null && (videoPlayerHolderBase = z70Var.f42181w) != null && z70Var.f42182x == this) {
                a0.h hVar = z70Var.f42183y;
                long j10 = pageblockvideo.video_id;
                a3 a2 = a3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((k4) z70Var).X).removeLoadingFileObserver(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        boolean z11;
        int i10 = ((k4) this.f42132a).X;
        String attachFileName = FileLoader.getAttachFileName(this.O);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.O);
        boolean z12 = true;
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.O, true);
        if (!pathToAttach.exists() && !pathToAttach2.exists()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f42137r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            if (!this.P) {
                this.I = 3;
            } else {
                this.I = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            a3 a3Var = this.M;
            float f7 = 0.0f;
            if (a3Var != null && a3Var.f33730b != null) {
                this.I = -1;
            } else {
                if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                    if (!this.S && this.R && this.P) {
                        this.I = 1;
                    } else {
                        this.I = 0;
                    }
                } else {
                    this.I = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f7 = fileProgress.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
                radialProgress2.o(f7, false);
            }
            z12 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
            radialProgress2.o(f7, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42134c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    public View getChannelCell() {
        return this.f42138s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.L;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    public TextureView getTextureView() {
        return this.f42136n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        d3 d3Var = this.f42134c;
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
        d3 d3Var = this.f42134c;
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
        if (this.L != null) {
            ImageReceiver imageReceiver = this.e;
            if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(imageReceiver.getDrawRegion(), k4.f37246o1);
            }
            imageReceiver.draw(canvas);
            d3 d3Var = this.f42134c;
            z70 z70Var = this.f42132a;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f42140x, this.f42141y);
                k4.v(z70Var, canvas, this, 0);
                this.f42134c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f42140x, this.f42141y + this.E);
                k4.v(z70Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
            k4.u(canvas, z70Var, this.L, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.getVisible()) {
                this.f42137r.draw(canvas);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        e(false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
        if (this.f42134c != null) {
            sb2.append(", ");
            sb2.append(this.f42134c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f42137r.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.I != 1) {
            e(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f42137r.o(1.0f, true);
        if (this.P) {
            this.I = 2;
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
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
