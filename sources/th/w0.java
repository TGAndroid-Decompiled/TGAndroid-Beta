package th;

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
import i7.f6;
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
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
public final class w0 extends y implements org.telegram.ui.ActionBar.x5, j9, i0, DownloadController.FileDownloadProgressListener {
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
    public final int f48823n;
    public final c6 f48824r;
    public final Paint f48825s;
    public final Paint v;
    public final TextPaint f48826w;
    public final TextPaint f48827x;
    public final RadialProgress2 f48828y;

    public w0(Context context, int i10, c6 c6Var) {
        super(context);
        this.f48825s = new Paint(1);
        this.v = new Paint(1);
        this.f48826w = new TextPaint(1);
        this.f48827x = new TextPaint(1);
        int dp = AndroidUtilities.dp(10.0f);
        this.D = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.E = dp2;
        this.F = AndroidUtilities.dp(16.0f);
        this.G = AndroidUtilities.dp(16.0f);
        this.f48823n = i10;
        this.f48824r = c6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.C = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.f48828y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.F;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.A = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        h0 h0Var = new h0(context, c6Var, new o4.g(this, 16));
        this.B = h0Var;
        addView(h0Var.f48471a, f6.e(-2, -2, 51));
        e();
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
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.B.c(canvas);
    }

    @Override
    public final void e() {
        this.f48825s.setColor(g6.v0(g6.f23374uf, this.f48824r));
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void f(int i10) {
        int i11;
        int dp = AndroidUtilities.dp(16.0f);
        if (this.I) {
            i10 = 0;
        }
        int i12 = dp + i10;
        this.G = i12;
        if (this.H) {
            i12 += AndroidUtilities.dp(21.0f);
        }
        this.F = i12;
        if (this.H) {
            i11 = AndroidUtilities.dp(31.0f);
        } else {
            i11 = this.D;
        }
        int i13 = this.F;
        int i14 = this.E;
        this.f48828y.q(i13, i11, i13 + i14, i14 + i11);
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.B.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.B.f48471a;
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
        return this.f48892a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        MessageObject messageObject;
        String str3;
        s sVar;
        a aVar = this.f48892a;
        ImageLocation imageLocation = null;
        if (aVar != null && (sVar = aVar.f48332g) != null) {
            str = sVar.f48715e;
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
            i10 = 0;
        } else {
            i10 = this.f48894c;
        }
        int i12 = dp + i10;
        this.G = i12;
        if (this.H) {
            i12 += AndroidUtilities.dp(21.0f);
        }
        this.F = i12;
        if (this.H) {
            i11 = AndroidUtilities.dp(31.0f);
        } else {
            i11 = this.D;
        }
        int i13 = this.F;
        int i14 = this.E;
        this.f48828y.q(i13, i11, i13 + i14, i14 + i11);
        ImageReceiver imageReceiver = this.A;
        if (z10) {
            imageReceiver.setImageCoords(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.A.setImage(ImageLocation.getForPath(str), "86_86", null, null, document, 1);
        } else if (isDocumentHasThumb) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            k3 k3Var = this.O;
            if (k3Var == null) {
                messageObject = null;
            } else {
                messageObject = k3Var.f48546a.f48640e3;
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
        a aVar = this.f48892a;
        if (aVar != null && (sVar = aVar.f48332g) != null) {
            return sVar.h;
        }
        return null;
    }

    public final boolean j() {
        s sVar;
        a aVar = this.f48892a;
        if (aVar != null && (sVar = aVar.f48332g) != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public final void k() {
        int i10;
        float f9;
        int i11;
        int i12;
        s sVar;
        TLRPC.Document i13 = i();
        if (i13 == null) {
            return;
        }
        if (this.H) {
            i10 = this.G;
            f9 = 97.0f;
        } else {
            i10 = this.F;
            f9 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f9) + i10;
        int dp2 = AndroidUtilities.dp(40.0f);
        if (getMeasuredWidth() > 0) {
            i11 = getMeasuredWidth();
        } else {
            i11 = AndroidUtilities.displaySize.x;
        }
        int dp3 = (i11 - dp) - AndroidUtilities.dp(16.0f);
        if (this.I) {
            i12 = this.f48894c;
        } else {
            i12 = 0;
        }
        int max = Math.max(dp2, dp3 - i12);
        TextPaint textPaint = this.f48826w;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = this.f48827x;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String documentFileName = FileLoader.getDocumentFileName(i13);
        if (TextUtils.isEmpty(documentFileName) && (sVar = this.f48892a.f48332g) != null && !TextUtils.isEmpty(sVar.f48715e)) {
            documentFileName = new File(this.f48892a.f48332g.f48715e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.M = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = i13.size;
        if (j10 <= 0) {
            s sVar2 = this.f48892a.f48332g;
            if (sVar2 != null && !TextUtils.isEmpty(sVar2.f48715e)) {
                j10 = new File(this.f48892a.f48332g.f48715e).length();
            } else {
                j10 = 0;
            }
        }
        this.N = new StaticLayout(AndroidUtilities.formatFileSize(j10), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void l(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: th.w0.l(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        this.f48828y.m(this);
        this.A.onAttachedToWindow();
        l(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        this.A.onDetachedFromWindow();
        DownloadController.getInstance(this.f48823n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9;
        int height;
        k9 textSelectionHelper;
        int i11;
        float f10;
        if (i() != null) {
            boolean z10 = this.H;
            c6 c6Var = this.f48824r;
            if (z10 && !this.A.draw(canvas)) {
                int v02 = g6.v0(g6.Gd, c6Var);
                Paint paint = this.v;
                paint.setColor(v02);
                canvas.drawRoundRect(this.G, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.G, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            this.f48828y.draw(canvas);
            if (this.H) {
                i10 = this.G;
                f9 = 97.0f;
            } else {
                i10 = this.F;
                f9 = 54.0f;
            }
            int dp = AndroidUtilities.dp(f9) + i10;
            this.f48826w.setColor(g6.v0(g6.Dd, c6Var));
            int dp2 = AndroidUtilities.dp(12.0f);
            if (this.M != null) {
                canvas.save();
                canvas.translate(dp, dp2);
                this.M.draw(canvas);
                canvas.restore();
            }
            this.f48827x.setColor(g6.v0(g6.f23248nd, c6Var));
            StaticLayout staticLayout = this.M;
            int i12 = 0;
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
            if (this.O != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.O.f48546a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f24607u0 && R <= textSelectionHelper.f24610x0) {
                    if (this.I) {
                        i11 = 0;
                    } else {
                        i11 = this.f48894c;
                    }
                    float dp4 = AndroidUtilities.dp(8.0f) + i11;
                    float dp5 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.I) {
                        i12 = this.f48894c;
                    }
                    float dp6 = (width - i12) - AndroidUtilities.dp(8.0f);
                    if (this.H) {
                        f10 = 104.0f;
                    } else {
                        f10 = 64.0f;
                    }
                    canvas.drawRoundRect(dp4, dp5, dp6, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f48825s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        l(true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f9;
        boolean z11 = this.I;
        int i15 = 0;
        if (z11) {
            i14 = 0;
        } else {
            i14 = this.f48894c;
        }
        if (z11) {
            i15 = this.f48894c;
        }
        int i16 = i12 - i10;
        if (this.H) {
            f9 = 106.0f;
        } else {
            f9 = 66.0f;
        }
        this.B.g(i14, i15, i16, AndroidUtilities.dp(f9));
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f9;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.I;
        int i13 = 0;
        if (z10) {
            i12 = 0;
        } else {
            i12 = this.f48894c;
        }
        if (z10) {
            i13 = this.f48894c;
        }
        int h = this.B.h(i12, i13, size);
        if (this.H) {
            f9 = 106.0f;
        } else {
            f9 = 66.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f9) + h);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        if (j11 <= 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f48828y.o(min, true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f48828y.o(1.0f, true);
        l(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: th.w0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
