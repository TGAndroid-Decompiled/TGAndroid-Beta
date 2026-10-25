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
public final class w2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.r9 {
    public static final int V = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockVideo L;
    public x2 M;
    public TL_iv.PageBlock N;
    public TLRPC.Document O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public MessageObject.GroupedMessagePosition T;
    public boolean U;
    public final h70 f44945a;
    public final h4 f44946b;
    public a3 f44947c;
    public a3 d;
    public final ImageReceiver e;
    public final FrameLayout f44948f;
    public final m4 h;
    public final TextureView f44949n;
    public final RadialProgress2 f44950r;
    public final c1 f44951s;
    public final int v;
    public boolean f44952w;
    public int f44953x;
    public int f44954y;

    public w2(Context context, h70 h70Var, h4 h4Var, int i10) {
        super(context);
        this.f44945a = h70Var;
        this.f44946b = h4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f44950r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.K = DownloadController.getInstance(((j4) h70Var).X).generateObserverTag();
        c1 c1Var = new c1(context, h70Var, h4Var, 1);
        this.f44951s = c1Var;
        m4 m4Var = new m4(context);
        this.h = m4Var;
        m4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f44949n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f44948f = frameLayout;
        m4Var.addView(textureView, org.telegram.ui.Components.gb1.i(-1, -2, 1));
        frameLayout.addView(m4Var, org.telegram.ui.Components.gb1.i(-1, -1, 17));
        addView(frameLayout, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        addView(c1Var, org.telegram.ui.Components.gb1.g(-2.0f, -1));
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
        int i10 = ((j4) this.f44945a).X;
        int i11 = this.I;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.f44950r;
        if (i11 == 0) {
            this.S = false;
            radialProgress2.p(0.0f, false);
            boolean z10 = this.P;
            h4 h4Var = this.f44946b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.O), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.O.thumbs, 40), this.O), "80_80_b", this.O.size, null, h4Var.E, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.O, h4Var.E, 1, 1);
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

    public final void b(TL_iv.pageBlockVideo pageblockvideo, x2 x2Var, boolean z10, boolean z11) {
        boolean z12;
        h70 h70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (h70Var = this.f44945a).f39923w) != null && h70Var.f39924x == this) {
            a0.h hVar = h70Var.f39925y;
            long j10 = pageblockvideo2.video_id;
            x2 a2 = x2.a(videoPlayerHolderBase, this);
            this.M = a2;
            hVar.k(a2, j10);
        }
        this.L = pageblockvideo;
        this.M = x2Var;
        this.N = null;
        this.Q = z10;
        h4 h4Var = this.f44946b;
        if (h4Var != null) {
            this.O = f4.a(h4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        if (!MessageObject.isVideoDocument(this.O) && !MessageObject.isGifDocument(this.O)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.P = z12;
        this.f44952w = z11;
        this.f44951s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(x2 x2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        x2 x2Var2 = this.M;
        if (x2Var2 != null && (bitmap2 = x2Var.f45626b) != null && (bitmap3 = x2Var2.f45626b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.M.f45626b = null;
        }
        x2 x2Var3 = this.M;
        if (x2Var3 != null && x2Var.f45626b == null && (bitmap = x2Var3.f45626b) != null) {
            x2Var.f45625a = x2Var3.f45625a;
            x2Var.f45626b = bitmap;
        }
        this.M = x2Var;
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
            h70 h70Var = this.f44945a;
            if (pageblockvideo != null && (videoPlayerHolderBase = h70Var.f39923w) != null && h70Var.f39924x == this) {
                a0.h hVar = h70Var.f39925y;
                long j10 = pageblockvideo.video_id;
                x2 a2 = x2.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((j4) h70Var).X).removeLoadingFileObserver(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        boolean z11;
        int i10 = ((j4) this.f44945a).X;
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
        RadialProgress2 radialProgress2 = this.f44950r;
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
            x2 x2Var = this.M;
            float f7 = 0.0f;
            if (x2Var != null && x2Var.f45626b != null) {
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
                radialProgress2.p(f7, false);
            }
            z12 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
            radialProgress2.p(f7, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f44947c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    public View getChannelCell() {
        return this.f44951s;
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
        return this.f44949n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        a3 a3Var = this.f44947c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        a3 a3Var = this.f44947c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.L != null) {
            ImageReceiver imageReceiver = this.e;
            if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(imageReceiver.getDrawRegion(), j4.f40414p1);
            }
            imageReceiver.draw(canvas);
            a3 a3Var = this.f44947c;
            h70 h70Var = this.f44945a;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f44953x, this.f44954y);
                j4.v(h70Var, canvas, this, 0);
                this.f44947c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f44953x, this.f44954y + this.E);
                j4.v(h70Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
            j4.u(canvas, h70Var, this.L, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.getVisible()) {
                this.f44950r.draw(canvas);
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
        if (this.f44947c != null) {
            sb2.append(", ");
            sb2.append(this.f44947c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f44950r.p(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.I != 1) {
            e(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f44950r.p(1.0f, true);
        if (this.P) {
            this.I = 2;
            a();
            return;
        }
        e(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w2.onTouchEvent(android.view.MotionEvent):boolean");
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
