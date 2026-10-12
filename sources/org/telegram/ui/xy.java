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
public final class xy extends View implements NotificationCenter.NotificationCenterDelegate {
    public final Paint f44194a;
    public final Paint f44195b;
    public final int f44196c;
    public final ArrayList d;
    public float f44197e;
    public float f44198f;
    public float h;
    public final ImageReceiver f44199n;
    public final ImageReceiver f44200r;
    public final org.telegram.ui.Components.fk0 f44201s;
    public final org.telegram.ui.Components.fk0 v;
    public boolean f44202w;
    public int f44203x;
    public boolean f44204y;

    public xy(Context context, int i10) {
        super(context);
        this.f44194a = new Paint(1);
        this.f44195b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f44199n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f44200r = imageReceiver2;
        this.f44196c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f44201s = fk0Var;
        org.telegram.ui.Components.fk0 fk0Var2 = new org.telegram.ui.Components.fk0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = fk0Var2;
        imageReceiver.setImageBitmap(fk0Var);
        imageReceiver2.setImageBitmap(fk0Var2);
        imageReceiver.setAutoRepeat(1);
        fk0Var.K(1);
        fk0Var.start();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f20895v8;
        this.f44201s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i10 = this.f44196c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((wy) arrayList.get(i11)).f43698c, (wy) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                wy wyVar = (wy) hashMap.get(fileName);
                if (wyVar == null) {
                    wyVar = new wy(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, wyVar);
                arrayList.add(wyVar);
            }
        }
        if (arrayList.size() == 0 && !this.f44204y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.f44197e = 1.0f;
                this.f44198f = 1.0f;
                this.f44202w = true;
                return;
            }
            this.f44197e = 0.0f;
            this.f44198f = 0.0f;
            this.f44202w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f44196c);
        int i10 = 0;
        long j3 = 0;
        long j10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j3 += ((wy) arrayList.get(i10)).f43696a;
            j10 += ((wy) arrayList.get(i10)).f43697b;
            i10++;
        }
        if (j3 == 0) {
            this.f44197e = 1.0f;
        } else {
            this.f44197e = ((float) j10) / ((float) j3);
        }
        float f7 = this.f44197e;
        if (f7 > 1.0f) {
            this.f44197e = 1.0f;
        } else if (f7 < 0.0f) {
            this.f44197e = 0.0f;
        }
        this.h = ((this.f44197e - this.f44198f) * 16.0f) / 150.0f;
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
        NotificationCenter.getInstance(this.f44196c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f44199n.onAttachedToWindow();
        this.f44200r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f44196c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f44199n.onDetachedFromWindow();
                this.f44200r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f44203x;
            int i11 = org.telegram.ui.ActionBar.h6.f20895v8;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
            ImageReceiver imageReceiver = this.f44200r;
            ImageReceiver imageReceiver2 = this.f44199n;
            Paint paint = this.f44194a;
            Paint paint2 = this.f44195b;
            if (i10 != x02) {
                this.f44203x = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(x03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f7 = this.f44198f;
            float f10 = this.f44197e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f44198f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f44198f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f44198f = f10;
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
            rectF.set(dp3, f13, ((getMeasuredWidth() - (2.0f * dp3)) * this.f44198f) + dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.f44197e != 1.0f) {
                this.f44202w = false;
            }
            if (this.f44202w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.f44197e == 1.0f && !this.f44202w && this.f44201s.f26103a0 == 0) {
                org.telegram.ui.Components.fk0 fk0Var = this.v;
                fk0Var.N(0, false, false);
                fk0Var.start();
                this.f44202w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f44204y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f7 = dp;
        this.f44199n.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f44200r.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.f44204y = false;
        }
        super.setAlpha(f7);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f44204y = false;
        }
        super.setVisibility(i10);
    }
}
