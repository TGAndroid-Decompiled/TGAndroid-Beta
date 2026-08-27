package rh;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.RadialProgress2;

public final class w0 extends y implements org.telegram.ui.ActionBar.x5, i9, i0, DownloadController.FileDownloadProgressListener {
    public final ImageReceiver A;
    public final h0 B;
    public final int C;
    public final int D;
    public final int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public StaticLayout M;
    public StaticLayout N;
    public k3 O;
    public MessageObject P;
    public TLRPC.Document Q;

    public final int f47525n;

    public final c6 f47526r;

    public final Paint f47527s;
    public final Paint v;

    public final TextPaint f47528w;

    public final TextPaint f47529x;

    public final RadialProgress2 f47530y;

    public w0(Context context, int i10, c6 c6Var) {
        super(context);
        this.f47527s = new Paint(1);
        this.v = new Paint(1);
        this.f47528w = new TextPaint(1);
        this.f47529x = new TextPaint(1);
        int iDp = AndroidUtilities.dp(10.0f);
        this.D = iDp;
        int iDp2 = AndroidUtilities.dp(44.0f);
        this.E = iDp2;
        this.F = AndroidUtilities.dp(16.0f);
        this.G = AndroidUtilities.dp(16.0f);
        this.f47525n = i10;
        this.f47526r = c6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.C = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.f47530y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.F;
        radialProgress2.q(i11, iDp, i11 + iDp2, iDp2 + iDp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.A = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        h0 h0Var = new h0(context, c6Var, new n2.b0(this, 18));
        this.B = h0Var;
        addView(h0Var.f47171a, z5.e(-2, -2, 51));
        d();
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.B.f(i10, i11);
    }

    @Override
    public final void b() {
        this.B.i();
    }

    @Override
    public final void d() {
        this.f47527s.setColor(g6.v0(g6.f23366uf, this.f47526r));
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.B.c(canvas);
    }

    @Override
    public final void f(int i10) {
        int iDp = AndroidUtilities.dp(16.0f);
        if (this.I) {
            i10 = 0;
        }
        int iDp2 = iDp + i10;
        this.G = iDp2;
        if (this.H) {
            iDp2 += AndroidUtilities.dp(21.0f);
        }
        this.F = iDp2;
        int iDp3 = this.H ? AndroidUtilities.dp(31.0f) : this.D;
        int i11 = this.F;
        int i12 = this.E;
        this.f47530y.q(i11, iDp3, i11 + i12, i12 + iDp3);
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.B.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.B.f47171a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.C;
    }

    @Override
    public a getRow() {
        return this.f47594a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        s sVar;
        a aVar = this.f47594a;
        String str2 = (aVar == null || (sVar = aVar.f47032g) == null) ? null : sVar.f47417e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z10 = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean zIsDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        this.H = z10 || zIsDocumentHasThumb;
        int iDp = AndroidUtilities.dp(16.0f) + (this.I ? 0 : this.f47596c);
        this.G = iDp;
        if (this.H) {
            iDp += AndroidUtilities.dp(21.0f);
        }
        this.F = iDp;
        int iDp2 = this.H ? AndroidUtilities.dp(31.0f) : this.D;
        int i10 = this.F;
        int i11 = this.E;
        this.f47530y.q(i10, iDp2, i10 + i11, i11 + iDp2);
        ImageReceiver imageReceiver = this.A;
        if (z10) {
            imageReceiver.setImageCoords(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.A.setImage(ImageLocation.getForPath(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!zIsDocumentHasThumb) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
        k3 k3Var = this.O;
        MessageObject messageObject = k3Var == null ? null : k3Var.f47246a.f47342e3;
        imageReceiver.setImageCoords(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
        ImageLocation forDocument = closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null;
        Drawable drawableCreateStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
        if (messageObject == null) {
            messageObject = this.P;
        }
        this.A.setImage(forDocument, "86_86", drawableCreateStripedBitmap, null, messageObject, 1);
    }

    public final TLRPC.Document i() {
        s sVar;
        a aVar = this.f47594a;
        if (aVar == null || (sVar = aVar.f47032g) == null) {
            return null;
        }
        return sVar.h;
    }

    public final boolean j() {
        s sVar;
        a aVar = this.f47594a;
        return (aVar == null || (sVar = aVar.f47032g) == null || !sVar.a()) ? false : true;
    }

    public final void k() {
        int i10;
        float f10;
        s sVar;
        TLRPC.Document documentI = i();
        if (documentI == null) {
            return;
        }
        if (this.H) {
            i10 = this.G;
            f10 = 97.0f;
        } else {
            i10 = this.F;
            f10 = 54.0f;
        }
        int iMax = Math.max(AndroidUtilities.dp(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - (AndroidUtilities.dp(f10) + i10)) - AndroidUtilities.dp(16.0f)) - (this.I ? this.f47596c : 0));
        float fDp = AndroidUtilities.dp(15.0f);
        TextPaint textPaint = this.f47528w;
        textPaint.setTextSize(fDp);
        textPaint.setTypeface(AndroidUtilities.bold());
        float fDp2 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.f47529x;
        textPaint2.setTextSize(fDp2);
        String documentFileName = FileLoader.getDocumentFileName(documentI);
        if (TextUtils.isEmpty(documentFileName) && (sVar = this.f47594a.f47032g) != null && !TextUtils.isEmpty(sVar.f47417e)) {
            documentFileName = new File(this.f47594a.f47032g.f47417e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(documentFileName, textPaint, iMax, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.M = new StaticLayout(charSequenceEllipsize, textPaint, iMax, alignment, 1.0f, 0.0f, false);
        long length = documentI.size;
        if (length <= 0) {
            s sVar2 = this.f47594a.f47032g;
            length = (sVar2 == null || TextUtils.isEmpty(sVar2.f47417e)) ? 0L : new File(this.f47594a.f47032g.f47417e).length();
        }
        this.N = new StaticLayout(AndroidUtilities.formatFileSize(length), textPaint2, iMax, alignment, 1.0f, 0.0f, false);
    }

    public final void l(boolean z10) {
        File pathToAttach;
        s sVar;
        boolean z11 = this.H;
        c6 c6Var = this.f47526r;
        RadialProgress2 radialProgress2 = this.f47530y;
        if (z11) {
            radialProgress2.g(g6.f23205le, g6.f23223me, g6.f23241ne, g6.f23258oe);
            radialProgress2.d = g6.v0(g6.f23132hd, c6Var);
        } else {
            radialProgress2.g(g6.f23152ie, g6.f23170je, g6.f23363uc, g6.f23379vc);
            radialProgress2.d = g6.v0(g6.Bd, c6Var);
        }
        boolean zJ = j();
        int i10 = this.f47525n;
        if (zJ) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            radialProgress2.o(this.f47594a.f47032g.f47418f, z10);
            radialProgress2.setIcon(3, false, z10);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(i());
        a aVar = this.f47594a;
        if (aVar != null && (sVar = aVar.f47032g) != null && !TextUtils.isEmpty(sVar.f47417e)) {
            pathToAttach = new File(this.f47594a.f47032g.f47417e);
            if (!pathToAttach.exists()) {
                if (i() == null) {
                    pathToAttach = null;
                } else {
                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), false);
                    if (pathToAttach != null) {
                        pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), true);
                    } else {
                        pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), true);
                    }
                }
            }
        } else if (i() == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), false);
            if (pathToAttach != null || !pathToAttach.exists()) {
                pathToAttach = FileLoader.getInstance(i10).getPathToAttach(i(), true);
            }
        }
        if (pathToAttach != null && pathToAttach.exists()) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.L = 0;
            radialProgress2.setIcon(this.H ? 4 : 5, false, z10);
        } else {
            if (TextUtils.isEmpty(attachFileName)) {
                return;
            }
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.L = 1;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(2, false, z10);
            } else {
                this.L = 2;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                radialProgress2.setIcon(3, true, z10);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        this.f47530y.m(this);
        this.A.onAttachedToWindow();
        l(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        this.A.onDetachedFromWindow();
        DownloadController.getInstance(this.f47525n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        j9 textSelectionHelper;
        if (i() == null) {
            return;
        }
        boolean z10 = this.H;
        c6 c6Var = this.f47526r;
        if (z10 && !this.A.draw(canvas)) {
            int iV0 = g6.v0(g6.Gd, c6Var);
            Paint paint = this.v;
            paint.setColor(iV0);
            canvas.drawRoundRect(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.G, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.f47530y.draw(canvas);
        if (this.H) {
            i10 = this.G;
            f10 = 97.0f;
        } else {
            i10 = this.F;
            f10 = 54.0f;
        }
        int iDp = AndroidUtilities.dp(f10) + i10;
        this.f47528w.setColor(g6.v0(g6.Dd, c6Var));
        int iDp2 = AndroidUtilities.dp(12.0f);
        if (this.M != null) {
            canvas.save();
            canvas.translate(iDp, iDp2);
            this.M.draw(canvas);
            canvas.restore();
        }
        this.f47529x.setColor(g6.v0(g6.f23240nd, c6Var));
        StaticLayout staticLayout = this.M;
        int iDp3 = AndroidUtilities.dp(2.0f) + iDp2 + (staticLayout == null ? 0 : staticLayout.getHeight());
        if (this.N != null) {
            canvas.save();
            canvas.translate(iDp, iDp3);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.O == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.O.f47246a.getTextSelectionHelper()) == null || !textSelectionHelper.y()) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int iR = RecyclerView.R(this);
        if (iR <= textSelectionHelper.f24540u0 || iR > textSelectionHelper.f24543x0) {
            return;
        }
        canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.I ? 0 : this.f47596c), AndroidUtilities.dp(2.0f), (getWidth() - (this.I ? this.f47596c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.H ? 104.0f : 64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f47527s);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        l(true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.I;
        this.B.g(z11 ? 0 : this.f47596c, z11 ? this.f47596c : 0, i12 - i10, AndroidUtilities.dp(this.H ? 106.0f : 66.0f));
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.I;
        setMeasuredDimension(size, AndroidUtilities.dp(this.H ? 106.0f : 66.0f) + this.B.h(z10 ? 0 : this.f47596c, z10 ? this.f47596c : 0, size));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f47530y.o(j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f47530y.o(1.0f, true);
        l(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        MessageObject messageObject;
        if (motionEvent.getX() < this.G || motionEvent.getX() > getWidth() - AndroidUtilities.dp(12.0f) || motionEvent.getY() < AndroidUtilities.dp(10.0f)) {
            z10 = false;
        } else {
            if (motionEvent.getY() <= AndroidUtilities.dp(this.H ? 96.0f : 54.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (motionEvent.getActionMasked() == 0 && z10) {
            this.K = true;
            return true;
        }
        if (motionEvent.getActionMasked() == 1 && this.K) {
            this.K = false;
            if (z10) {
                playSoundEffect(0);
                if (j()) {
                    k3 k3Var = this.O;
                    if (k3Var != null) {
                        a aVar = this.f47594a;
                        p3 p3Var = k3Var.f47246a;
                        s4 s4Var = (s4) p3Var.V3.remove(aVar.f47032g);
                        if (s4Var != null) {
                            s4Var.b();
                        }
                        b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        p3Var.f47348h3.remove(aVar);
                        p3Var.U2.N(true);
                        b2 b2Var2 = p3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        p3Var.f47340d3.onContentChanged();
                    }
                } else {
                    int i10 = this.L;
                    Activity activity = null;
                    if (i10 == 0) {
                        Context context = getContext();
                        while (true) {
                            if (!(context instanceof ContextWrapper)) {
                                if (!(context instanceof Activity)) {
                                    break;
                                }
                                activity = (Activity) context;
                                break;
                            }
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                        if (activity != null && (messageObject = this.P) != null) {
                            AndroidUtilities.openForView(messageObject, activity, this.f47526r, false);
                        }
                    } else {
                        RadialProgress2 radialProgress2 = this.f47530y;
                        int i11 = this.f47525n;
                        if (i10 == 1 && i() != null) {
                            k3 k3Var2 = this.O;
                            MessageObject messageObject2 = k3Var2 != null ? k3Var2.f47246a.f47342e3 : null;
                            FileLoader fileLoader = FileLoader.getInstance(i11);
                            TLRPC.Document documentI = i();
                            if (messageObject2 == null) {
                                messageObject2 = this.P;
                            }
                            fileLoader.loadFile(documentI, messageObject2, 1, 1);
                            this.L = 2;
                            radialProgress2.setIcon(3, true, true);
                        } else if (this.L == 2 && i() != null) {
                            FileLoader.getInstance(i11).cancelLoadFile(i());
                            this.L = 1;
                            radialProgress2.setIcon(2, false, true);
                        }
                    }
                }
                invalidate();
                return true;
            }
        } else {
            if (motionEvent.getActionMasked() == 3) {
                this.K = false;
            }
            if (!this.K && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
