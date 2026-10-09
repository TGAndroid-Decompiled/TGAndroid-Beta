package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class vy extends View implements NotificationCenter.NotificationCenterDelegate {
    public final Paint f42998a;
    public final Paint f42999b;
    public final int f43000c;
    public final ArrayList d;
    public float f43001e;
    public float f43002f;
    public float h;
    public final ImageReceiver f43003n;
    public final ImageReceiver f43004r;
    public final org.telegram.ui.Components.ck0 f43005s;
    public final org.telegram.ui.Components.ck0 v;
    public boolean f43006w;
    public int f43007x;
    public boolean f43008y;

    public vy(Context context, int i10) {
        super(context);
        this.f42998a = new Paint(1);
        this.f42999b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f43003n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f43004r = imageReceiver2;
        this.f43000c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f43005s = ck0Var;
        org.telegram.ui.Components.ck0 ck0Var2 = new org.telegram.ui.Components.ck0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = ck0Var2;
        imageReceiver.setImageBitmap(ck0Var);
        imageReceiver2.setImageBitmap(ck0Var2);
        imageReceiver.setAutoRepeat(1);
        ck0Var.K(1);
        ck0Var.start();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.i6.f21130v8;
        this.f43005s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i10, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i10 = this.f43000c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((uy) arrayList.get(i11)).f42582c, (uy) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                uy uyVar = (uy) hashMap.get(fileName);
                if (uyVar == null) {
                    uyVar = new uy(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, uyVar);
                arrayList.add(uyVar);
            }
        }
        if (arrayList.size() == 0 && !this.f43008y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.f43001e = 1.0f;
                this.f43002f = 1.0f;
                this.f43006w = true;
                return;
            }
            this.f43001e = 0.0f;
            this.f43002f = 0.0f;
            this.f43006w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f43000c);
        int i10 = 0;
        long j3 = 0;
        long j10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j3 += ((uy) arrayList.get(i10)).f42580a;
            j10 += ((uy) arrayList.get(i10)).f42581b;
            i10++;
        }
        if (j3 == 0) {
            this.f43001e = 1.0f;
        } else {
            this.f43001e = ((float) j10) / ((float) j3);
        }
        float f7 = this.f43001e;
        if (f7 > 1.0f) {
            this.f43001e = 1.0f;
        } else if (f7 < 0.0f) {
            this.f43001e = 0.0f;
        }
        this.h = ((this.f43001e - this.f43002f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            b();
            c();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        NotificationCenter.getInstance(this.f43000c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f43003n.onAttachedToWindow();
        this.f43004r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f43000c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f43003n.onDetachedFromWindow();
                this.f43004r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f43007x;
            int i11 = org.telegram.ui.ActionBar.i6.f21130v8;
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
            ImageReceiver imageReceiver = this.f43004r;
            ImageReceiver imageReceiver2 = this.f43003n;
            Paint paint = this.f42998a;
            Paint paint2 = this.f42999b;
            if (i10 != x02) {
                this.f43007x = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(x03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f7 = this.f43002f;
            float f10 = this.f43001e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f43002f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f43002f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f43002f = f10;
                } else {
                    invalidate();
                }
            }
            int dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(1.0f);
            float dp3 = AndroidUtilities.dp(16.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            float measuredHeight = dp + (getMeasuredHeight() / 2);
            float f13 = measuredHeight - dp2;
            float f14 = measuredHeight + dp2;
            rectF.set(dp3, f13, getMeasuredWidth() - dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint2);
            rectF.set(dp3, f13, ((getMeasuredWidth() - (2.0f * dp3)) * this.f43002f) + dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.f43001e != 1.0f) {
                this.f43006w = false;
            }
            if (this.f43006w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.f43001e == 1.0f && !this.f43006w && this.f43005s.f25395a0 == 0) {
                org.telegram.ui.Components.ck0 ck0Var = this.v;
                ck0Var.N(0, false, false);
                ck0Var.start();
                this.f43006w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f43008y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f7 = dp;
        this.f43003n.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f43004r.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.f43008y = false;
        }
        super.setAlpha(f7);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f43008y = false;
        }
        super.setVisibility(i10);
    }
}
