package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class z0 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.r9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final h70 f46135a;
    public final h4 f46136b;
    public a3 f46137c;
    public a3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.ip0 f46138f;
    public boolean h;
    public int f46139n;
    public final int f46140r;
    public int f46141s;
    public String v;
    public a3 f46142w;
    public StaticLayout f46143x;
    public int f46144y;

    public z0(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f46140r = AndroidUtilities.dp(58.0f);
        this.f46135a = h70Var;
        this.f46136b = h4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((j4) h70Var).X).generateObserverTag();
        org.telegram.ui.Components.ip0 ip0Var = new org.telegram.ui.Components.ip0(this);
        this.f46138f = ip0Var;
        ip0Var.h = new y0(this, 0);
    }

    private int getIconForCurrentState() {
        int i10 = this.H;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    public final void a(boolean z10) {
        int i10 = ((j4) this.f46135a).X;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.L, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.e;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (exists) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.M);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.H = 1;
            } else {
                this.H = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            if (!FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.H = 2;
                radialProgress2.p(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.H = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.p(fileProgress.floatValue(), z10);
                } else {
                    radialProgress2.p(0.0f, z10);
                }
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        b();
    }

    public final void b() {
        MessageObject messageObject;
        int i10;
        if (this.L != null && (messageObject = this.M) != null) {
            org.telegram.ui.Components.ip0 ip0Var = this.f46138f;
            if (!ip0Var.e) {
                ip0Var.i(messageObject.audioProgress);
            }
            if (MediaController.getInstance().isPlayingMessage(this.M)) {
                i10 = this.M.audioProgressSec;
            } else {
                i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.L.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i10 = (int) documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            String str = this.v;
            if (str == null || !str.equals(formatShortDuration)) {
                this.v = formatShortDuration;
                TextPaint textPaint = j4.f40405f1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f46143x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            j4.f40405f1.setColor(this.f46135a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f46142w;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f46137c;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            arrayList.add(a3Var3);
        }
    }

    public MessageObject getMessageObject() {
        return this.M;
    }

    @Override
    public int getObserverTag() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        a3 a3Var = this.f46142w;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.f46137c;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            a3Var3.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(((j4) this.f46135a).X).removeLoadingFileObserver(this);
        a3 a3Var = this.f46142w;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.f46137c;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
        a3 a3Var3 = this.d;
        if (a3Var3 != null) {
            a3Var3.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.K == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.ie;
        int i11 = org.telegram.ui.ActionBar.y6.f23470je;
        int i12 = org.telegram.ui.ActionBar.y6.f23677uc;
        int i13 = org.telegram.ui.ActionBar.y6.f23695vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.y6.Bd;
        h70 h70Var = this.f46135a;
        ((j4) h70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.y6.x0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f46144y, this.E);
        int i16 = org.telegram.ui.ActionBar.y6.f23678ud;
        ((j4) h70Var).getClass();
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i16, false);
        int i17 = org.telegram.ui.ActionBar.y6.f23696vd;
        ((j4) h70Var).getClass();
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.y6.f23735xd;
        ((j4) h70Var).getClass();
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, i18, false);
        ((j4) h70Var).getClass();
        int x05 = org.telegram.ui.ActionBar.y6.x0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.y6.f23716wd;
        ((j4) h70Var).getClass();
        int x06 = org.telegram.ui.ActionBar.y6.x0(null, i19, false);
        org.telegram.ui.Components.ip0 ip0Var = this.f46138f;
        ip0Var.h(x02, x03, x04, x05, x06);
        ip0Var.b(canvas);
        canvas.restore();
        if (this.f46143x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.f46143x.draw(canvas);
            canvas.restore();
        }
        if (this.f46142w != null) {
            canvas.save();
            this.f46142w.f37631s = AndroidUtilities.dp(54.0f) + this.F;
            this.f46142w.v = this.E - AndroidUtilities.dp(16.0f);
            a3 a3Var = this.f46142w;
            canvas.translate(a3Var.f37631s, a3Var.v);
            j4.v(h70Var, canvas, this, 0);
            this.f46142w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        a3 a3Var2 = this.f46137c;
        int i20 = this.f46140r;
        if (a3Var2 != null) {
            canvas.save();
            a3 a3Var3 = this.f46137c;
            int i21 = this.f46139n;
            a3Var3.f37631s = i21;
            a3Var3.v = i20;
            canvas.translate(i21, i20);
            j4.v(h70Var, canvas, this, i15);
            this.f46137c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            a3 a3Var4 = this.d;
            int i22 = this.f46139n;
            a3Var4.f37631s = i22;
            int i23 = this.f46141s;
            a3Var4.v = i20 + i23;
            canvas.translate(i22, i20 + i23);
            j4.v(h70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, h70Var, this.K, getMeasuredHeight());
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        a(true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVAudio));
        if (this.f46142w != null) {
            sb2.append(", ");
            sb2.append(this.f46142w.d.getText());
        }
        if (this.f46137c != null) {
            sb2.append(", ");
            sb2.append(this.f46137c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        SpannableStringBuilder spannableStringBuilder;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(54.0f);
        TL_iv.pageBlockAudio pageblockaudio = this.K;
        if (pageblockaudio != null) {
            int i13 = pageblockaudio.level;
            if (i13 > 0) {
                this.f46139n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f46139n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f46139n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i14 = this.F;
            this.e.r(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            a3 q5 = j4.q(this.f46135a, this, null, pageblockaudio2.caption.text, dp2, this.f46140r, pageblockaudio2, this.f46136b);
            this.f46137c = q5;
            if (q5 != null) {
                int height = this.f46137c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f46141s = height;
                dp = org.telegram.messenger.t.D(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f46140r + this.f46141s;
            if (this.f46136b.G) {
                alignment = org.telegram.ui.Components.px0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            a3 p10 = j4.p(this.f46135a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f46136b);
            this.d = p10;
            if (p10 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int D = org.telegram.messenger.t.D(50.0f, this.F, dp3);
            this.f46144y = D;
            int dp5 = (size - D) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f46142w = null;
                this.E = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(a1.g.D(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.y6.O2, dp5, TextUtils.TruncateAt.END);
                a3 a3Var = new a3(this.f46135a);
                this.f46142w = a3Var;
                a3Var.d = new StaticLayout(ellipsize, j4.f40405f1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f46142w.f37629n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f46138f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.e.p(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.e.p(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
