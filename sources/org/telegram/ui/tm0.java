package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
public final class tm0 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final TextView f42730a;
    public final TextView f42731b;
    public final org.telegram.ui.Components.t9 f42732c;
    public final org.telegram.ui.Components.bj0 d;
    public int f42733e;
    public SecureDocument f42734f;
    public final int h;
    public final vm0 f42735n;

    public tm0(vm0 vm0Var, Activity activity) {
        super(activity);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f42735n = vm0Var;
        i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
        this.h = DownloadController.getInstance(i10).generateObserverTag();
        this.d = new org.telegram.ui.Components.bj0(this);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(activity);
        this.f42732c = t9Var;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(t9Var, i7.f6.d(48, 48.0f, i11 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f42730a = textView;
        b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i18 = i13 | 48;
        if (z10) {
            i14 = 21;
        } else {
            i14 = 81;
        }
        float f9 = i14;
        if (z10) {
            i15 = 81;
        } else {
            i15 = 21;
        }
        addView(textView, i7.f6.d(-2, -2.0f, i18, f9, 10.0f, i15, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f42731b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false));
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        int i19 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i17 = 21;
        } else {
            i17 = 81;
        }
        addView(textView2, i7.f6.d(-2, -2.0f, i19, i17, 35.0f, z11 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        String attachFileName = FileLoader.getAttachFileName(this.f42734f);
        boolean exists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.f42734f).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (isEmpty) {
            bj0Var.d(null, false, false);
            return;
        }
        SecureDocument secureDocument = this.f42734f;
        String str = secureDocument.path;
        float f9 = 0.0f;
        vm0 vm0Var = this.f42735n;
        if (str != null) {
            if (secureDocument.inputFile != null) {
                i13 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                DownloadController.getInstance(i13).removeLoadingFileObserver(this);
                bj0Var.d(null, false, z10);
                this.f42733e = -1;
                return;
            }
            i12 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
            DownloadController.getInstance(i12).addLoadingFileObserver(this.f42734f.path, this);
            this.f42733e = 1;
            Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f42734f.path);
            bj0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
            if (fileProgress != null) {
                f9 = fileProgress.floatValue();
            }
            bj0Var.e(f9, false);
            invalidate();
        } else if (exists) {
            i11 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            this.f42733e = -1;
            bj0Var.d(null, false, z10);
            invalidate();
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this);
            this.f42733e = 1;
            Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
            bj0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
            if (fileProgress2 != null) {
                f9 = fileProgress2.floatValue();
            }
            bj0Var.e(f9, z10);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.f42732c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override
    public int getObserverTag() {
        return this.h;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f42730a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        a(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        org.telegram.ui.Components.t9 t9Var = this.f42732c;
        int measuredWidth = ((t9Var.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2) + t9Var.getLeft();
        int measuredHeight = ((t9Var.getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2) + t9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), b.B(64.0f, 1, 1073741824));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.d.e(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.f42733e != 1) {
            a(false);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        this.d.e(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.d.e(1.0f, true);
        a(true);
    }

    public void setValue(CharSequence charSequence) {
        this.f42731b.setText(charSequence);
    }
}
