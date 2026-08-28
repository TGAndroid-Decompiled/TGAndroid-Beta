package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g7.e6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.RadialProgress2;
public final class w0 extends y implements org.telegram.ui.ActionBar.w5, m9, i0, DownloadController.FileDownloadProgressListener {
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
    public j3 O;
    public MessageObject P;
    public TLRPC.Document Q;
    public final int f46762n;
    public final b6 f46763r;
    public final Paint f46764s;
    public final Paint v;
    public final TextPaint f46765w;
    public final TextPaint f46766x;
    public final RadialProgress2 f46767y;

    public w0(Context context, int i9, b6 b6Var) {
        super(context);
        this.f46764s = new Paint(1);
        this.v = new Paint(1);
        this.f46765w = new TextPaint(1);
        this.f46766x = new TextPaint(1);
        int dp = AndroidUtilities.dp(10.0f);
        this.D = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.E = dp2;
        this.F = AndroidUtilities.dp(16.0f);
        this.G = AndroidUtilities.dp(16.0f);
        this.f46762n = i9;
        this.f46763r = b6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.C = DownloadController.getInstance(i9).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, b6Var);
        this.f46767y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i10 = this.F;
        radialProgress2.q(i10, dp, i10 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.A = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        h0 h0Var = new h0(context, b6Var, new n2.p(this, 16));
        this.B = h0Var;
        addView(h0Var.f46409a, e6.e(-2, -2, 51));
        d();
    }

    @Override
    public final boolean a(int i9, int i10) {
        return this.B.f(i9, i10);
    }

    @Override
    public final void b() {
        this.B.i();
    }

    @Override
    public final void d() {
        this.f46764s.setColor(f6.v0(f6.f23312uf, this.f46763r));
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
    public final void f(int i9) {
        int i10;
        int dp = AndroidUtilities.dp(16.0f);
        if (this.I) {
            i9 = 0;
        }
        int i11 = dp + i9;
        this.G = i11;
        if (this.H) {
            i11 += AndroidUtilities.dp(21.0f);
        }
        this.F = i11;
        if (this.H) {
            i10 = AndroidUtilities.dp(31.0f);
        } else {
            i10 = this.D;
        }
        int i12 = this.F;
        int i13 = this.E;
        this.f46767y.q(i12, i10, i12 + i13, i13 + i10);
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.B.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.B.f46409a;
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
        return this.f46834a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z10;
        boolean z11;
        int i9;
        int i10;
        MessageObject messageObject;
        String str3;
        s sVar;
        a aVar = this.f46834a;
        ImageLocation imageLocation = null;
        if (aVar != null && (sVar = aVar.f46273g) != null) {
            str = sVar.f46671e;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            file = null;
        } else {
            file = new File(str);
        }
        if (document != null && (str3 = document.mime_type) != null) {
            str2 = str3.toLowerCase();
        } else {
            str2 = "";
        }
        if (j() && file != null && file.exists() && (str2.startsWith("image/") || str2.equals("video/mp4"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        if (!z10 && !isDocumentHasThumb) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.H = z11;
        int dp = AndroidUtilities.dp(16.0f);
        if (this.I) {
            i9 = 0;
        } else {
            i9 = this.f46836c;
        }
        int i11 = dp + i9;
        this.G = i11;
        if (this.H) {
            i11 += AndroidUtilities.dp(21.0f);
        }
        this.F = i11;
        if (this.H) {
            i10 = AndroidUtilities.dp(31.0f);
        } else {
            i10 = this.D;
        }
        int i12 = this.F;
        int i13 = this.E;
        this.f46767y.q(i12, i10, i12 + i13, i13 + i10);
        ImageReceiver imageReceiver = this.A;
        if (z10) {
            imageReceiver.setImageCoords(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.A.setImage(ImageLocation.getForPath(str), "86_86", null, null, document, 1);
        } else if (isDocumentHasThumb) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            j3 j3Var = this.O;
            if (j3Var == null) {
                messageObject = null;
            } else {
                messageObject = j3Var.f46464a.f46567e3;
            }
            imageReceiver.setImageCoords(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            if (closestPhotoSizeWithSize != null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            ImageLocation imageLocation2 = imageLocation;
            Drawable createStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
            if (messageObject == null) {
                messageObject = this.P;
            }
            this.A.setImage(imageLocation2, "86_86", createStripedBitmap, null, messageObject, 1);
        } else {
            imageReceiver.clearImage();
        }
    }

    public final TLRPC.Document i() {
        s sVar;
        a aVar = this.f46834a;
        if (aVar != null && (sVar = aVar.f46273g) != null) {
            return sVar.h;
        }
        return null;
    }

    public final boolean j() {
        s sVar;
        a aVar = this.f46834a;
        if (aVar != null && (sVar = aVar.f46273g) != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public final void k() {
        int i9;
        float f10;
        int i10;
        int i11;
        s sVar;
        TLRPC.Document i12 = i();
        if (i12 == null) {
            return;
        }
        if (this.H) {
            i9 = this.G;
            f10 = 97.0f;
        } else {
            i9 = this.F;
            f10 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f10) + i9;
        int dp2 = AndroidUtilities.dp(40.0f);
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = AndroidUtilities.displaySize.x;
        }
        int dp3 = (i10 - dp) - AndroidUtilities.dp(16.0f);
        if (this.I) {
            i11 = this.f46836c;
        } else {
            i11 = 0;
        }
        int max = Math.max(dp2, dp3 - i11);
        TextPaint textPaint = this.f46765w;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = this.f46766x;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String documentFileName = FileLoader.getDocumentFileName(i12);
        if (TextUtils.isEmpty(documentFileName) && (sVar = this.f46834a.f46273g) != null && !TextUtils.isEmpty(sVar.f46671e)) {
            documentFileName = new File(this.f46834a.f46273g.f46671e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.M = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = i12.size;
        if (j10 <= 0) {
            s sVar2 = this.f46834a.f46273g;
            if (sVar2 != null && !TextUtils.isEmpty(sVar2.f46671e)) {
                j10 = new File(this.f46834a.f46273g.f46671e).length();
            } else {
                j10 = 0;
            }
        }
        this.N = new StaticLayout(AndroidUtilities.formatFileSize(j10), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void l(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: qh.w0.l(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        this.f46767y.m(this);
        this.A.onAttachedToWindow();
        l(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        this.A.onDetachedFromWindow();
        DownloadController.getInstance(this.f46762n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        int height;
        n9 textSelectionHelper;
        int i10;
        float f11;
        if (i() != null) {
            boolean z10 = this.H;
            b6 b6Var = this.f46763r;
            if (z10 && !this.A.draw(canvas)) {
                int v02 = f6.v0(f6.Gd, b6Var);
                Paint paint = this.v;
                paint.setColor(v02);
                canvas.drawRoundRect(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.G, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            this.f46767y.draw(canvas);
            if (this.H) {
                i9 = this.G;
                f10 = 97.0f;
            } else {
                i9 = this.F;
                f10 = 54.0f;
            }
            int dp = AndroidUtilities.dp(f10) + i9;
            this.f46765w.setColor(f6.v0(f6.Dd, b6Var));
            int dp2 = AndroidUtilities.dp(12.0f);
            if (this.M != null) {
                canvas.save();
                canvas.translate(dp, dp2);
                this.M.draw(canvas);
                canvas.restore();
            }
            this.f46766x.setColor(f6.v0(f6.nd, b6Var));
            StaticLayout staticLayout = this.M;
            int i11 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int dp3 = AndroidUtilities.dp(2.0f) + dp2 + height;
            if (this.N != null) {
                canvas.save();
                canvas.translate(dp, dp3);
                this.N.draw(canvas);
                canvas.restore();
            }
            if (this.O != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.O.f46464a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f24774u0 && R <= textSelectionHelper.f24777x0) {
                    if (this.I) {
                        i10 = 0;
                    } else {
                        i10 = this.f46836c;
                    }
                    float dp4 = AndroidUtilities.dp(8.0f) + i10;
                    float dp5 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.I) {
                        i11 = this.f46836c;
                    }
                    float dp6 = (width - i11) - AndroidUtilities.dp(8.0f);
                    if (this.H) {
                        f11 = 104.0f;
                    } else {
                        f11 = 64.0f;
                    }
                    canvas.drawRoundRect(dp4, dp5, dp6, AndroidUtilities.dp(f11), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f46764s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        l(true);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        float f10;
        boolean z11 = this.I;
        int i14 = 0;
        if (z11) {
            i13 = 0;
        } else {
            i13 = this.f46836c;
        }
        if (z11) {
            i14 = this.f46836c;
        }
        int i15 = i11 - i9;
        if (this.H) {
            f10 = 106.0f;
        } else {
            f10 = 66.0f;
        }
        this.B.g(i13, i14, i15, AndroidUtilities.dp(f10));
        k();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i9);
        boolean z10 = this.I;
        int i12 = 0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = this.f46836c;
        }
        if (z10) {
            i12 = this.f46836c;
        }
        int h = this.B.h(i11, i12, size);
        if (this.H) {
            f10 = 106.0f;
        } else {
            f10 = 66.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f10) + h);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        if (j11 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f46767y.o(min, true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f46767y.o(1.0f, true);
        l(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: qh.w0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
