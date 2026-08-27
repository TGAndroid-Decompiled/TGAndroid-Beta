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

public final class vm0 extends FrameLayout implements DownloadController.FileDownloadProgressListener {

    public final TextView f43485a;

    public final TextView f43486b;

    public final org.telegram.ui.Components.n9 f43487c;
    public final org.telegram.ui.Components.si0 d;

    public int f43488e;

    public SecureDocument f43489f;
    public final int h;

    public final xm0 f43490n;

    public vm0(xm0 xm0Var, Activity activity) {
        super(activity);
        this.f43490n = xm0Var;
        this.h = DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).generateObserverTag();
        this.d = new org.telegram.ui.Components.si0(this);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(activity);
        this.f43487c = n9Var;
        addView(n9Var, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f43485a = textView;
        org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z10 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 81, 10.0f, z10 ? 81 : 21, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f43486b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, h7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 81, 35.0f, z11 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        String attachFileName = FileLoader.getAttachFileName(this.f43489f);
        boolean zExists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.f43489f).exists();
        boolean zIsEmpty = TextUtils.isEmpty(attachFileName);
        org.telegram.ui.Components.si0 si0Var = this.d;
        if (zIsEmpty) {
            si0Var.d(null, false, false);
            return;
        }
        SecureDocument secureDocument = this.f43489f;
        String str = secureDocument.path;
        xm0 xm0Var = this.f43490n;
        if (str != null) {
            if (secureDocument.inputFile != null) {
                DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).removeLoadingFileObserver(this);
                si0Var.d(null, false, z10);
                this.f43488e = -1;
                return;
            } else {
                DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).addLoadingFileObserver(this.f43489f.path, this);
                this.f43488e = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f43489f.path);
                si0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
                si0Var.e(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
                invalidate();
                return;
            }
        }
        if (zExists) {
            DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).removeLoadingFileObserver(this);
            this.f43488e = -1;
            si0Var.d(null, false, z10);
            invalidate();
            return;
        }
        DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).addLoadingFileObserver(attachFileName, this);
        this.f43488e = 1;
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
        si0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
        si0Var.e(fileProgress2 != null ? fileProgress2.floatValue() : 0.0f, z10);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (view == this.f43487c) {
            this.d.a(canvas);
        }
        return zDrawChild;
    }

    @Override
    public int getObserverTag() {
        return this.h;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f43485a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        a(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        org.telegram.ui.Components.n9 n9Var = this.f43487c;
        int measuredWidth = ((n9Var.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2) + n9Var.getLeft();
        int measuredHeight = ((n9Var.getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2) + n9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.messenger.rl.B(64.0f, 1, 1073741824));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.d.e(Math.min(1.0f, j10 / j11), true);
        if (this.f43488e != 1) {
            a(false);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        this.d.e(Math.min(1.0f, j10 / j11), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.d.e(1.0f, true);
        a(true);
    }

    public void setValue(CharSequence charSequence) {
        this.f43486b.setText(charSequence);
    }
}
