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
public final class z0 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.n9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final t70 f44537a;
    public final f4 f44538b;
    public a3 f44539c;
    public a3 d;
    public final RadialProgress2 f44540e;
    public final org.telegram.ui.Components.ip0 f44541f;
    public boolean h;
    public int f44542n;
    public final int f44543r;
    public int f44544s;
    public String v;
    public a3 f44545w;
    public StaticLayout f44546x;
    public int f44547y;

    public z0(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f44543r = AndroidUtilities.dp(58.0f);
        this.f44537a = t70Var;
        this.f44538b = f4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f44540e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((h4) t70Var).X).generateObserverTag();
        org.telegram.ui.Components.ip0 ip0Var = new org.telegram.ui.Components.ip0(this);
        this.f44541f = ip0Var;
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
        int i10 = ((h4) this.f44537a).X;
        String attachFileName = FileLoader.getAttachFileName(this.L);
        boolean exists = FileLoader.getInstance(i10).getPathToAttach(this.L, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f44540e;
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
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.H = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z10);
                } else {
                    radialProgress2.o(0.0f, z10);
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
            org.telegram.ui.Components.ip0 ip0Var = this.f44541f;
            if (!ip0Var.f27419e) {
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
                TextPaint textPaint = h4.f38244e1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f44546x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            h4.f38244e1.setColor(this.f44537a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f44545w;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f44539c;
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
        a3 a3Var = this.f44545w;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.f44539c;
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
        DownloadController.getInstance(((h4) this.f44537a).X).removeLoadingFileObserver(this);
        a3 a3Var = this.f44545w;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.f44539c;
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
        int i10 = org.telegram.ui.ActionBar.h6.f20885ie;
        int i11 = org.telegram.ui.ActionBar.h6.f20903je;
        int i12 = org.telegram.ui.ActionBar.h6.f21106uc;
        int i13 = org.telegram.ui.ActionBar.h6.f21123vc;
        RadialProgress2 radialProgress2 = this.f44540e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.h6.Bd;
        t70 t70Var = this.f44537a;
        ((h4) t70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.h6.x0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f44547y, this.E);
        this.f44541f.b(canvas);
        canvas.restore();
        if (this.f44546x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.f44546x.draw(canvas);
            canvas.restore();
        }
        if (this.f44545w != null) {
            canvas.save();
            this.f44545w.f35862s = AndroidUtilities.dp(54.0f) + this.F;
            this.f44545w.v = this.E - AndroidUtilities.dp(16.0f);
            a3 a3Var = this.f44545w;
            canvas.translate(a3Var.f35862s, a3Var.v);
            h4.v(t70Var, canvas, this, 0);
            this.f44545w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        a3 a3Var2 = this.f44539c;
        int i16 = this.f44543r;
        if (a3Var2 != null) {
            canvas.save();
            a3 a3Var3 = this.f44539c;
            int i17 = this.f44542n;
            a3Var3.f35862s = i17;
            a3Var3.v = i16;
            canvas.translate(i17, i16);
            h4.v(t70Var, canvas, this, i15);
            this.f44539c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            a3 a3Var4 = this.d;
            int i18 = this.f44542n;
            a3Var4.f35862s = i18;
            int i19 = this.f44544s;
            a3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            h4.v(t70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        h4.u(canvas, t70Var, this.K, getMeasuredHeight());
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
        if (this.f44545w != null) {
            sb2.append(", ");
            sb2.append(this.f44545w.d.getText());
        }
        if (this.f44539c != null) {
            sb2.append(", ");
            sb2.append(this.f44539c.d.getText());
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
                this.f44542n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f44542n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f44542n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i14 = this.F;
            this.f44540e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            a3 q6 = h4.q(this.f44537a, this, null, pageblockaudio2.caption.text, dp2, this.f44543r, pageblockaudio2, this.f44538b);
            this.f44539c = q6;
            if (q6 != null) {
                int height = this.f44539c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f44544s = height;
                dp = org.telegram.messenger.q.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f44543r + this.f44544s;
            if (this.f44538b.G) {
                alignment = org.telegram.ui.Components.ox0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            a3 p5 = h4.p(this.f44537a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f44538b);
            this.d = p5;
            if (p5 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int C = org.telegram.messenger.q.C(50.0f, this.F, dp3);
            this.f44547y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f44545w = null;
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
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o61(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.h6.O2, dp5, TextUtils.TruncateAt.END);
                a3 a3Var = new a3(this.f44537a);
                this.f44545w = a3Var;
                a3Var.d = new StaticLayout(ellipsize, h4.f38244e1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f44545w.f35860n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f44541f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f44540e.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f44540e.o(1.0f, true);
        a(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
