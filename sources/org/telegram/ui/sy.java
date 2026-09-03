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
public final class sy extends View implements NotificationCenter.NotificationCenterDelegate {
    public final Paint f38325a;
    public final Paint f38326b;
    public final int f38327c;
    public final ArrayList d;
    public float e;
    public float f38328f;
    public float h;
    public final ImageReceiver f38329n;
    public final ImageReceiver f38330r;
    public final org.telegram.ui.Components.gj0 f38331s;
    public final org.telegram.ui.Components.gj0 v;
    public boolean f38332w;
    public int f38333x;
    public boolean f38334y;

    public sy(Context context, int i10) {
        super(context);
        this.f38325a = new Paint(1);
        this.f38326b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f38329n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f38330r = imageReceiver2;
        this.f38327c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f38331s = gj0Var;
        org.telegram.ui.Components.gj0 gj0Var2 = new org.telegram.ui.Components.gj0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = gj0Var2;
        imageReceiver.setImageBitmap(gj0Var);
        imageReceiver2.setImageBitmap(gj0Var2);
        imageReceiver.setAutoRepeat(1);
        gj0Var.I(1);
        gj0Var.start();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f20202v8;
        this.f38331s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i10 = this.f38327c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((ry) arrayList.get(i11)).f38073c, (ry) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                ry ryVar = (ry) hashMap.get(fileName);
                if (ryVar == null) {
                    ryVar = new ry(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, ryVar);
                arrayList.add(ryVar);
            }
        }
        if (arrayList.size() == 0 && !this.f38334y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.e = 1.0f;
                this.f38328f = 1.0f;
                this.f38332w = true;
                return;
            }
            this.e = 0.0f;
            this.f38328f = 0.0f;
            this.f38332w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f38327c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((ry) arrayList.get(i10)).f38071a;
            j11 += ((ry) arrayList.get(i10)).f38072b;
            i10++;
        }
        if (j10 == 0) {
            this.e = 1.0f;
        } else {
            this.e = ((float) j11) / ((float) j10);
        }
        float f10 = this.e;
        if (f10 > 1.0f) {
            this.e = 1.0f;
        } else if (f10 < 0.0f) {
            this.e = 0.0f;
        }
        this.h = ((this.e - this.f38328f) * 16.0f) / 150.0f;
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
        NotificationCenter.getInstance(this.f38327c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f38329n.onAttachedToWindow();
        this.f38330r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f38327c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f38329n.onDetachedFromWindow();
                this.f38330r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f38333x;
            int i11 = org.telegram.ui.ActionBar.j6.f20202v8;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            ImageReceiver imageReceiver = this.f38330r;
            ImageReceiver imageReceiver2 = this.f38329n;
            Paint paint = this.f38325a;
            Paint paint2 = this.f38326b;
            if (i10 != w02) {
                this.f38333x = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(w03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f10 = this.f38328f;
            float f11 = this.e;
            if (f10 != f11) {
                float f12 = this.h;
                float f13 = f10 + f12;
                this.f38328f = f13;
                if (f12 > 0.0f && f13 > f11) {
                    this.f38328f = f11;
                } else if (f12 < 0.0f && f13 < f11) {
                    this.f38328f = f11;
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
            rectF.set(dp3, f14, ((getMeasuredWidth() - (2.0f * dp3)) * this.f38328f) + dp3, f15);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
            if (this.e != 1.0f) {
                this.f38332w = false;
            }
            if (this.f38332w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.e == 1.0f && !this.f38332w && this.f38331s.Y == 0) {
                org.telegram.ui.Components.gj0 gj0Var = this.v;
                gj0Var.L(0, false, false);
                gj0Var.start();
                this.f38332w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f38334y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f10 = dp;
        this.f38329n.setImageCoords(f10, f10, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f38330r.setImageCoords(f10, f10, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.f38334y = false;
        }
        super.setAlpha(f10);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f38334y = false;
        }
        super.setVisibility(i10);
    }
}
