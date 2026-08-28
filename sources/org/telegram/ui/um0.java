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
public final class um0 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final TextView f43268a;
    public final TextView f43269b;
    public final org.telegram.ui.Components.o9 f43270c;
    public final org.telegram.ui.Components.qi0 d;
    public int f43271e;
    public SecureDocument f43272f;
    public final int h;
    public final wm0 f43273n;

    public um0(wm0 wm0Var, Activity activity) {
        super(activity);
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f43273n = wm0Var;
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        this.h = DownloadController.getInstance(i9).generateObserverTag();
        this.d = new org.telegram.ui.Components.qi0(this);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(activity);
        this.f43270c = o9Var;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(o9Var, g7.e6.d(48, 48.0f, i10 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f43268a = textView;
        org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z10) {
            i13 = 21;
        } else {
            i13 = 81;
        }
        float f10 = i13;
        if (z10) {
            i14 = 81;
        } else {
            i14 = 21;
        }
        addView(textView, g7.e6.d(-2, -2.0f, i17, f10, 10.0f, i14, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f43269b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false));
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        int i18 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i16 = 21;
        } else {
            i16 = 81;
        }
        addView(textView2, g7.e6.d(-2, -2.0f, i18, i16, 35.0f, z11 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        String attachFileName = FileLoader.getAttachFileName(this.f43272f);
        boolean exists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.f43272f).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        org.telegram.ui.Components.qi0 qi0Var = this.d;
        if (isEmpty) {
            qi0Var.d(null, false, false);
            return;
        }
        SecureDocument secureDocument = this.f43272f;
        String str = secureDocument.path;
        float f10 = 0.0f;
        wm0 wm0Var = this.f43273n;
        if (str != null) {
            if (secureDocument.inputFile != null) {
                i12 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                DownloadController.getInstance(i12).removeLoadingFileObserver(this);
                qi0Var.d(null, false, z10);
                this.f43271e = -1;
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
            DownloadController.getInstance(i11).addLoadingFileObserver(this.f43272f.path, this);
            this.f43271e = 1;
            Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f43272f.path);
            qi0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
            if (fileProgress != null) {
                f10 = fileProgress.floatValue();
            }
            qi0Var.e(f10, false);
            invalidate();
        } else if (exists) {
            i10 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.f43271e = -1;
            qi0Var.d(null, false, z10);
            invalidate();
        } else {
            i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
            DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, this);
            this.f43271e = 1;
            Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
            qi0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
            if (fileProgress2 != null) {
                f10 = fileProgress2.floatValue();
            }
            qi0Var.e(f10, z10);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.f43270c) {
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
        this.f43268a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i9 = AndroidUtilities.dp(20.0f);
        } else {
            i9 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        a(false);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        org.telegram.ui.Components.o9 o9Var = this.f43270c;
        int measuredWidth = ((o9Var.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2) + o9Var.getLeft();
        int measuredHeight = ((o9Var.getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2) + o9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), org.telegram.messenger.ll.C(64.0f, 1, 1073741824));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.d.e(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.f43271e != 1) {
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
        this.f43269b.setText(charSequence);
    }
}
