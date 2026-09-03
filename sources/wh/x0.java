package wh;

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
import java.io.File;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ai;
public final class x0 extends z implements b6, l9, j0, DownloadController.FileDownloadProgressListener {
    public final ImageReceiver B;
    public final i0 C;
    public final int D;
    public final int E;
    public final int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public StaticLayout N;
    public StaticLayout O;
    public m3 P;
    public MessageObject Q;
    public TLRPC.Document R;
    public final int f50178n;
    public final g6 f50179r;
    public final Paint f50180s;
    public final Paint v;
    public final TextPaint f50181w;
    public final TextPaint f50182x;
    public final RadialProgress2 f50183y;

    public x0(Context context, int i10, g6 g6Var) {
        super(context);
        this.f50180s = new Paint(1);
        this.v = new Paint(1);
        this.f50181w = new TextPaint(1);
        this.f50182x = new TextPaint(1);
        int dp = AndroidUtilities.dp(10.0f);
        this.E = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.F = dp2;
        this.G = AndroidUtilities.dp(16.0f);
        this.H = AndroidUtilities.dp(16.0f);
        this.f50178n = i10;
        this.f50179r = g6Var;
        setWillNotDraw(false);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        this.D = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.f50183y = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.G;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.B = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        i0 i0Var = new i0(context, g6Var, new ai(this, 20));
        this.C = i0Var;
        addView(i0Var.f49814a, c6.e(-2, -2, 51));
        e();
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.C.f(i10, i11);
    }

    @Override
    public final void b() {
        this.C.i();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.C.c(canvas);
    }

    @Override
    public final void e() {
        this.f50180s.setColor(k6.v0(k6.f21972uf, this.f50179r));
        i0 i0Var = this.C;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public final void f(int i10) {
        int i11;
        int dp = AndroidUtilities.dp(16.0f);
        if (this.J) {
            i10 = 0;
        }
        int i12 = dp + i10;
        this.H = i12;
        if (this.I) {
            i12 += AndroidUtilities.dp(21.0f);
        }
        this.G = i12;
        if (this.I) {
            i11 = AndroidUtilities.dp(31.0f);
        } else {
            i11 = this.E;
        }
        int i13 = this.G;
        int i14 = this.F;
        this.f50183y.q(i13, i11, i13 + i14, i14 + i11);
        requestLayout();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.C.e(arrayList);
    }

    @Override
    public e1 getCaptionEditText() {
        return this.C.f49814a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.D;
    }

    @Override
    public a getRow() {
        return this.f50211a;
    }

    public final void h(TLRPC.Document document) {
        String str;
        File file;
        String str2;
        boolean z4;
        boolean z10;
        int i10;
        int i11;
        MessageObject messageObject;
        String str3;
        t tVar;
        a aVar = this.f50211a;
        ImageLocation imageLocation = null;
        if (aVar != null && (tVar = aVar.f49657g) != null) {
            str = tVar.f50069e;
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
            z4 = true;
        } else {
            z4 = false;
        }
        boolean isDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
        if (!z4 && !isDocumentHasThumb) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.I = z10;
        int dp = AndroidUtilities.dp(16.0f);
        if (this.J) {
            i10 = 0;
        } else {
            i10 = this.f50213c;
        }
        int i12 = dp + i10;
        this.H = i12;
        if (this.I) {
            i12 += AndroidUtilities.dp(21.0f);
        }
        this.G = i12;
        if (this.I) {
            i11 = AndroidUtilities.dp(31.0f);
        } else {
            i11 = this.E;
        }
        int i13 = this.G;
        int i14 = this.F;
        this.f50183y.q(i13, i11, i13 + i14, i14 + i11);
        ImageReceiver imageReceiver = this.B;
        if (z4) {
            imageReceiver.setImageCoords(this.H, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            this.B.setImage(ImageLocation.getForPath(str), "86_86", null, null, document, 1);
        } else if (isDocumentHasThumb) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            m3 m3Var = this.P;
            if (m3Var == null) {
                messageObject = null;
            } else {
                messageObject = m3Var.f49913a.f50018f3;
            }
            imageReceiver.setImageCoords(this.H, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
            if (closestPhotoSizeWithSize != null) {
                imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            ImageLocation imageLocation2 = imageLocation;
            Drawable createStripedBitmap = ImageLoader.createStripedBitmap(document.thumbs);
            if (messageObject == null) {
                messageObject = this.Q;
            }
            this.B.setImage(imageLocation2, "86_86", createStripedBitmap, null, messageObject, 1);
        } else {
            imageReceiver.clearImage();
        }
    }

    public final TLRPC.Document i() {
        t tVar;
        a aVar = this.f50211a;
        if (aVar != null && (tVar = aVar.f49657g) != null) {
            return tVar.h;
        }
        return null;
    }

    public final boolean j() {
        t tVar;
        a aVar = this.f50211a;
        if (aVar != null && (tVar = aVar.f49657g) != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public final void k() {
        int i10;
        float f10;
        int i11;
        int i12;
        t tVar;
        TLRPC.Document i13 = i();
        if (i13 == null) {
            return;
        }
        if (this.I) {
            i10 = this.H;
            f10 = 97.0f;
        } else {
            i10 = this.G;
            f10 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f10) + i10;
        int dp2 = AndroidUtilities.dp(40.0f);
        if (getMeasuredWidth() > 0) {
            i11 = getMeasuredWidth();
        } else {
            i11 = AndroidUtilities.displaySize.x;
        }
        int dp3 = (i11 - dp) - AndroidUtilities.dp(16.0f);
        if (this.J) {
            i12 = this.f50213c;
        } else {
            i12 = 0;
        }
        int max = Math.max(dp2, dp3 - i12);
        TextPaint textPaint = this.f50181w;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = this.f50182x;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        String documentFileName = FileLoader.getDocumentFileName(i13);
        if (TextUtils.isEmpty(documentFileName) && (tVar = this.f50211a.f49657g) != null && !TextUtils.isEmpty(tVar.f50069e)) {
            documentFileName = new File(this.f50211a.f49657g.f50069e).getName();
        }
        if (documentFileName == null) {
            documentFileName = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(documentFileName, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.N = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = i13.size;
        if (j10 <= 0) {
            t tVar2 = this.f50211a.f49657g;
            if (tVar2 != null && !TextUtils.isEmpty(tVar2.f50069e)) {
                j10 = new File(this.f50211a.f49657g.f50069e).length();
            } else {
                j10 = 0;
            }
        }
        this.O = new StaticLayout(AndroidUtilities.formatFileSize(j10), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    public final void l(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: wh.x0.l(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        this.f50183y.m(this);
        this.B.onAttachedToWindow();
        l(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.B.onDetachedFromWindow();
        DownloadController.getInstance(this.f50178n).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int height;
        m9 textSelectionHelper;
        int i11;
        float f11;
        if (i() != null) {
            boolean z4 = this.I;
            g6 g6Var = this.f50179r;
            if (z4 && !this.B.draw(canvas)) {
                int v02 = k6.v0(k6.Gd, g6Var);
                Paint paint = this.v;
                paint.setColor(v02);
                canvas.drawRoundRect(this.H, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.H, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            this.f50183y.draw(canvas);
            if (this.I) {
                i10 = this.H;
                f10 = 97.0f;
            } else {
                i10 = this.G;
                f10 = 54.0f;
            }
            int dp = AndroidUtilities.dp(f10) + i10;
            this.f50181w.setColor(k6.v0(k6.Dd, g6Var));
            int dp2 = AndroidUtilities.dp(12.0f);
            if (this.N != null) {
                canvas.save();
                canvas.translate(dp, dp2);
                this.N.draw(canvas);
                canvas.restore();
            }
            this.f50182x.setColor(k6.v0(k6.f21847nd, g6Var));
            StaticLayout staticLayout = this.N;
            int i12 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            int dp3 = AndroidUtilities.dp(2.0f) + dp2 + height;
            if (this.O != null) {
                canvas.save();
                canvas.translate(dp, dp3);
                this.O.draw(canvas);
                canvas.restore();
            }
            if (this.P != null && (getParent() instanceof RecyclerView) && (textSelectionHelper = this.P.f49913a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R > textSelectionHelper.f23177u0 && R <= textSelectionHelper.f23180x0) {
                    if (this.J) {
                        i11 = 0;
                    } else {
                        i11 = this.f50213c;
                    }
                    float dp4 = AndroidUtilities.dp(8.0f) + i11;
                    float dp5 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.J) {
                        i12 = this.f50213c;
                    }
                    float dp6 = (width - i12) - AndroidUtilities.dp(8.0f);
                    if (this.I) {
                        f11 = 104.0f;
                    } else {
                        f11 = 64.0f;
                    }
                    canvas.drawRoundRect(dp4, dp5, dp6, AndroidUtilities.dp(f11), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f50180s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        l(true);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        float f10;
        boolean z10 = this.J;
        int i15 = 0;
        if (z10) {
            i14 = 0;
        } else {
            i14 = this.f50213c;
        }
        if (z10) {
            i15 = this.f50213c;
        }
        int i16 = i12 - i10;
        if (this.I) {
            f10 = 106.0f;
        } else {
            f10 = 66.0f;
        }
        this.C.g(i14, i15, i16, AndroidUtilities.dp(f10));
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        boolean z4 = this.J;
        int i13 = 0;
        if (z4) {
            i12 = 0;
        } else {
            i12 = this.f50213c;
        }
        if (z4) {
            i13 = this.f50213c;
        }
        int h = this.C.h(i12, i13, size);
        if (this.I) {
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
        this.f50183y.o(min, true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f50183y.o(1.0f, true);
        l(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: wh.x0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
