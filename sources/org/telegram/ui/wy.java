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
public final class wy extends View implements NotificationCenter.NotificationCenterDelegate {
    public final Paint f42503a;
    public final Paint f42504b;
    public final int f42505c;
    public final ArrayList d;
    public float f42506e;
    public float f42507f;
    public float h;
    public final ImageReceiver f42508n;
    public final ImageReceiver f42509r;
    public final org.telegram.ui.Components.xi0 f42510s;
    public final org.telegram.ui.Components.xi0 v;
    public boolean f42511w;
    public int f42512x;
    public boolean f42513y;

    public wy(Context context, int i10) {
        super(context);
        this.f42503a = new Paint(1);
        this.f42504b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f42508n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f42509r = imageReceiver2;
        this.f42505c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f42510s = xi0Var;
        org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = xi0Var2;
        imageReceiver.setImageBitmap(xi0Var);
        imageReceiver2.setImageBitmap(xi0Var2);
        imageReceiver.setAutoRepeat(1);
        xi0Var.I(1);
        xi0Var.start();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f20992v8;
        this.f42510s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i10 = this.f42505c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((vy) arrayList.get(i11)).f41711c, (vy) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                vy vyVar = (vy) hashMap.get(fileName);
                if (vyVar == null) {
                    vyVar = new vy(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, vyVar);
                arrayList.add(vyVar);
            }
        }
        if (arrayList.size() == 0 && !this.f42513y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.f42506e = 1.0f;
                this.f42507f = 1.0f;
                this.f42511w = true;
                return;
            }
            this.f42506e = 0.0f;
            this.f42507f = 0.0f;
            this.f42511w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f42505c);
        int i10 = 0;
        long j3 = 0;
        long j10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j3 += ((vy) arrayList.get(i10)).f41709a;
            j10 += ((vy) arrayList.get(i10)).f41710b;
            i10++;
        }
        if (j3 == 0) {
            this.f42506e = 1.0f;
        } else {
            this.f42506e = ((float) j10) / ((float) j3);
        }
        float f7 = this.f42506e;
        if (f7 > 1.0f) {
            this.f42506e = 1.0f;
        } else if (f7 < 0.0f) {
            this.f42506e = 0.0f;
        }
        this.h = ((this.f42506e - this.f42507f) * 16.0f) / 150.0f;
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
        NotificationCenter.getInstance(this.f42505c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f42508n.onAttachedToWindow();
        this.f42509r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f42505c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f42508n.onDetachedFromWindow();
                this.f42509r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f42512x;
            int i11 = org.telegram.ui.ActionBar.j6.f20992v8;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            ImageReceiver imageReceiver = this.f42509r;
            ImageReceiver imageReceiver2 = this.f42508n;
            Paint paint = this.f42503a;
            Paint paint2 = this.f42504b;
            if (i10 != w02) {
                this.f42512x = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(w03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f7 = this.f42507f;
            float f10 = this.f42506e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f42507f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f42507f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f42507f = f10;
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
            rectF.set(dp3, f13, ((getMeasuredWidth() - (2.0f * dp3)) * this.f42507f) + dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.f42506e != 1.0f) {
                this.f42511w = false;
            }
            if (this.f42511w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.f42506e == 1.0f && !this.f42511w && this.f42510s.f32553b0 == 0) {
                org.telegram.ui.Components.xi0 xi0Var = this.v;
                xi0Var.L(0, false, false);
                xi0Var.start();
                this.f42511w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f42513y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f7 = dp;
        this.f42508n.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f42509r.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.f42513y = false;
        }
        super.setAlpha(f7);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f42513y = false;
        }
        super.setVisibility(i10);
    }
}
