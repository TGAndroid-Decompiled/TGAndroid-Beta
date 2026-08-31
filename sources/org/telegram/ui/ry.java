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
public final class ry extends View implements NotificationCenter.NotificationCenterDelegate {
    public final Paint f41062a;
    public final Paint f41063b;
    public final int f41064c;
    public final ArrayList d;
    public float f41065e;
    public float f41066f;
    public float h;
    public final ImageReceiver f41067n;
    public final ImageReceiver f41068r;
    public final org.telegram.ui.Components.ij0 f41069s;
    public final org.telegram.ui.Components.ij0 v;
    public boolean f41070w;
    public int f41071x;
    public boolean f41072y;

    public ry(Context context, int i10) {
        super(context);
        this.f41062a = new Paint(1);
        this.f41063b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f41067n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f41068r = imageReceiver2;
        this.f41064c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.download_progress, "download_progress", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f41069s = ij0Var;
        org.telegram.ui.Components.ij0 ij0Var2 = new org.telegram.ui.Components.ij0(R.raw.download_finish, "download_finish", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = ij0Var2;
        imageReceiver.setImageBitmap(ij0Var);
        imageReceiver2.setImageBitmap(ij0Var2);
        imageReceiver.setAutoRepeat(1);
        ij0Var.I(1);
        ij0Var.start();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.k6.f21981v8;
        this.f41069s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i10 = this.f41064c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((qy) arrayList.get(i11)).f40720c, (qy) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                qy qyVar = (qy) hashMap.get(fileName);
                if (qyVar == null) {
                    qyVar = new qy(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, qyVar);
                arrayList.add(qyVar);
            }
        }
        if (arrayList.size() == 0 && !this.f41072y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.f41065e = 1.0f;
                this.f41066f = 1.0f;
                this.f41070w = true;
                return;
            }
            this.f41065e = 0.0f;
            this.f41066f = 0.0f;
            this.f41070w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f41064c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((qy) arrayList.get(i10)).f40718a;
            j11 += ((qy) arrayList.get(i10)).f40719b;
            i10++;
        }
        if (j10 == 0) {
            this.f41065e = 1.0f;
        } else {
            this.f41065e = ((float) j11) / ((float) j10);
        }
        float f10 = this.f41065e;
        if (f10 > 1.0f) {
            this.f41065e = 1.0f;
        } else if (f10 < 0.0f) {
            this.f41065e = 0.0f;
        }
        this.h = ((this.f41065e - this.f41066f) * 16.0f) / 150.0f;
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
        NotificationCenter.getInstance(this.f41064c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f41067n.onAttachedToWindow();
        this.f41068r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f41064c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f41067n.onDetachedFromWindow();
                this.f41068r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f41071x;
            int i11 = org.telegram.ui.ActionBar.k6.f21981v8;
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
            ImageReceiver imageReceiver = this.f41068r;
            ImageReceiver imageReceiver2 = this.f41067n;
            Paint paint = this.f41062a;
            Paint paint2 = this.f41063b;
            if (i10 != w02) {
                this.f41071x = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                int w03 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(w03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f10 = this.f41066f;
            float f11 = this.f41065e;
            if (f10 != f11) {
                float f12 = this.h;
                float f13 = f10 + f12;
                this.f41066f = f13;
                if (f12 > 0.0f && f13 > f11) {
                    this.f41066f = f11;
                } else if (f12 < 0.0f && f13 < f11) {
                    this.f41066f = f11;
                } else {
                    invalidate();
                }
            }
            int dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(1.0f);
            float dp3 = AndroidUtilities.dp(16.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            float measuredHeight = dp + (getMeasuredHeight() / 2);
            float f14 = measuredHeight - dp2;
            float f15 = measuredHeight + dp2;
            rectF.set(dp3, f14, getMeasuredWidth() - dp3, f15);
            canvas.drawRoundRect(rectF, dp2, dp2, paint2);
            rectF.set(dp3, f14, ((getMeasuredWidth() - (2.0f * dp3)) * this.f41066f) + dp3, f15);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
            if (this.f41065e != 1.0f) {
                this.f41070w = false;
            }
            if (this.f41070w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.f41065e == 1.0f && !this.f41070w && this.f41069s.Y == 0) {
                org.telegram.ui.Components.ij0 ij0Var = this.v;
                ij0Var.L(0, false, false);
                ij0Var.start();
                this.f41070w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f41072y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f10 = dp;
        this.f41067n.setImageCoords(f10, f10, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f41068r.setImageCoords(f10, f10, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.f41072y = false;
        }
        super.setAlpha(f10);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f41072y = false;
        }
        super.setVisibility(i10);
    }
}
