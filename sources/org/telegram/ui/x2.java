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
public final class x2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.n9 {
    public static final int V = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockVideo L;
    public y2 M;
    public TL_iv.PageBlock N;
    public TLRPC.Document O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public MessageObject.GroupedMessagePosition T;
    public boolean U;
    public final t70 f43791a;
    public final g4 f43792b;
    public b3 f43793c;
    public b3 d;
    public final ImageReceiver f43794e;
    public final FrameLayout f43795f;
    public final l4 h;
    public final TextureView f43796n;
    public final RadialProgress2 f43797r;
    public final d1 f43798s;
    public final int v;
    public boolean f43799w;
    public int f43800x;
    public int f43801y;

    public x2(Context context, t70 t70Var, g4 g4Var, int i10) {
        super(context);
        this.f43791a = t70Var;
        this.f43792b = g4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f43794e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f43797r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.K = DownloadController.getInstance(((i4) t70Var).X).generateObserverTag();
        d1 d1Var = new d1(context, t70Var, g4Var, 1);
        this.f43798s = d1Var;
        l4 l4Var = new l4(context);
        this.h = l4Var;
        l4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f43796n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f43795f = frameLayout;
        l4Var.addView(textureView, w7.x5.e(-1, -2, 1));
        frameLayout.addView(l4Var, w7.x5.e(-1, -1, 17));
        addView(frameLayout, w7.x5.d(-2.0f, -1));
        addView(d1Var, w7.x5.d(-2.0f, -1));
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
        int i10 = ((i4) this.f43791a).X;
        int i11 = this.I;
        ImageReceiver imageReceiver = this.f43794e;
        RadialProgress2 radialProgress2 = this.f43797r;
        if (i11 == 0) {
            this.S = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.P;
            g4 g4Var = this.f43792b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.O), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.O.thumbs, 40), this.O), "80_80_b", this.O.size, null, g4Var.E, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.O, g4Var.E, 1, 1);
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

    public final void b(TL_iv.pageBlockVideo pageblockvideo, y2 y2Var, boolean z10, boolean z11) {
        boolean z12;
        t70 t70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (t70Var = this.f43791a).f41890w) != null && t70Var.f41891x == this) {
            a0.i iVar = t70Var.f41892y;
            long j3 = pageblockvideo2.video_id;
            y2 a2 = y2.a(videoPlayerHolderBase, this);
            this.M = a2;
            iVar.k(a2, j3);
        }
        this.L = pageblockvideo;
        this.M = y2Var;
        this.N = null;
        this.Q = z10;
        g4 g4Var = this.f43792b;
        if (g4Var != null) {
            this.O = f4.a(g4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        if (!MessageObject.isVideoDocument(this.O) && !MessageObject.isGifDocument(this.O)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.P = z12;
        this.f43799w = z11;
        this.f43798s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(y2 y2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        y2 y2Var2 = this.M;
        if (y2Var2 != null && (bitmap2 = y2Var.f44215b) != null && (bitmap3 = y2Var2.f44215b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.M.f44215b = null;
        }
        y2 y2Var3 = this.M;
        if (y2Var3 != null && y2Var.f44215b == null && (bitmap = y2Var3.f44215b) != null) {
            y2Var.f44214a = y2Var3.f44214a;
            y2Var.f44215b = bitmap;
        }
        this.M = y2Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.f43794e;
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
            t70 t70Var = this.f43791a;
            if (pageblockvideo != null && (videoPlayerHolderBase = t70Var.f41890w) != null && t70Var.f41891x == this) {
                a0.i iVar = t70Var.f41892y;
                long j3 = pageblockvideo.video_id;
                y2 a2 = y2.a(videoPlayerHolderBase, this);
                c(a2);
                iVar.k(a2, j3);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((i4) t70Var).X).removeLoadingFileObserver(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean z10) {
        boolean z11;
        int i10 = ((i4) this.f43791a).X;
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
        RadialProgress2 radialProgress2 = this.f43797r;
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
            y2 y2Var = this.M;
            float f7 = 0.0f;
            if (y2Var != null && y2Var.f44215b != null) {
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
        b3 b3Var = this.f43793c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    public View getChannelCell() {
        return this.f43798s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.L;
    }

    public ImageReceiver getImageView() {
        return this.f43794e;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    public TextureView getTextureView() {
        return this.f43796n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        b3 b3Var = this.f43793c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        b3 b3Var = this.f43793c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.L != null) {
            ImageReceiver imageReceiver = this.f43794e;
            if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(imageReceiver.getDrawRegion(), i4.f38481o1);
            }
            imageReceiver.draw(canvas);
            b3 b3Var = this.f43793c;
            t70 t70Var = this.f43791a;
            int i10 = 0;
            if (b3Var != null) {
                canvas.save();
                canvas.translate(this.f43800x, this.f43801y);
                i4.v(t70Var, canvas, this, 0);
                this.f43793c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f43800x, this.f43801y + this.E);
                i4.v(t70Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
            i4.u(canvas, t70Var, this.L, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.getVisible()) {
                this.f43797r.draw(canvas);
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
        if (this.f43793c != null) {
            sb2.append(", ");
            sb2.append(this.f43793c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f43797r.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.I != 1) {
            e(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f43797r.o(1.0f, true);
        if (this.P) {
            this.I = 2;
            a();
            return;
        }
        e(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
