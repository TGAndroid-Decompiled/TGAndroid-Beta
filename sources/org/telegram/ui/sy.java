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
    public final Paint f37883a;
    public final Paint f37884b;
    public final int f37885c;
    public final ArrayList d;
    public float e;
    public float f37886f;
    public float h;
    public final ImageReceiver f37887n;
    public final ImageReceiver f37888r;
    public final org.telegram.ui.Components.ij0 f37889s;
    public final org.telegram.ui.Components.ij0 v;
    public boolean f37890w;
    public int f37891x;
    public boolean f37892y;

    public sy(Context context, int i10) {
        super(context);
        this.f37883a = new Paint(1);
        this.f37884b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f37887n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f37888r = imageReceiver2;
        this.f37885c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f37889s = ij0Var;
        org.telegram.ui.Components.ij0 ij0Var2 = new org.telegram.ui.Components.ij0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = ij0Var2;
        imageReceiver.setImageBitmap(ij0Var);
        imageReceiver2.setImageBitmap(ij0Var2);
        imageReceiver.setAutoRepeat(1);
        ij0Var.K(1);
        ij0Var.start();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f19392v8;
        this.f37889s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i10, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i10 = this.f37885c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((ry) arrayList.get(i11)).f37537c, (ry) arrayList.get(i11));
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
        if (arrayList.size() == 0 && !this.f37892y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.e = 1.0f;
                this.f37886f = 1.0f;
                this.f37890w = true;
                return;
            }
            this.e = 0.0f;
            this.f37886f = 0.0f;
            this.f37890w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f37885c);
        int i10 = 0;
        long j3 = 0;
        long j10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j3 += ((ry) arrayList.get(i10)).f37535a;
            j10 += ((ry) arrayList.get(i10)).f37536b;
            i10++;
        }
        if (j3 == 0) {
            this.e = 1.0f;
        } else {
            this.e = ((float) j10) / ((float) j3);
        }
        float f7 = this.e;
        if (f7 > 1.0f) {
            this.e = 1.0f;
        } else if (f7 < 0.0f) {
            this.e = 0.0f;
        }
        this.h = ((this.e - this.f37886f) * 16.0f) / 150.0f;
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
        NotificationCenter.getInstance(this.f37885c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f37887n.onAttachedToWindow();
        this.f37888r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f37885c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f37887n.onDetachedFromWindow();
                this.f37888r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f37891x;
            int i11 = org.telegram.ui.ActionBar.h6.f19392v8;
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
            ImageReceiver imageReceiver = this.f37888r;
            ImageReceiver imageReceiver2 = this.f37887n;
            Paint paint = this.f37883a;
            Paint paint2 = this.f37884b;
            if (i10 != w02) {
                this.f37891x = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                int w03 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(w03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f7 = this.f37886f;
            float f10 = this.e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f37886f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f37886f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f37886f = f10;
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
            rectF.set(dp3, f13, ((getMeasuredWidth() - (2.0f * dp3)) * this.f37886f) + dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.e != 1.0f) {
                this.f37890w = false;
            }
            if (this.f37890w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.e == 1.0f && !this.f37890w && this.f37889s.f25068a0 == 0) {
                org.telegram.ui.Components.ij0 ij0Var = this.v;
                ij0Var.N(0, false, false);
                ij0Var.start();
                this.f37890w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f37892y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f7 = dp;
        this.f37887n.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f37888r.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.f37892y = false;
        }
        super.setAlpha(f7);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f37892y = false;
        }
        super.setVisibility(i10);
    }
}
