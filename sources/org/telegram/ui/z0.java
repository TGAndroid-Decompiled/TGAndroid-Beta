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
public final class z0 extends View implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.p9 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public TL_iv.pageBlockAudio K;
    public TLRPC.Document L;
    public MessageObject M;
    public final u70 f40020a;
    public final f4 f40021b;
    public a3 f40022c;
    public a3 d;
    public final RadialProgress2 e;
    public final org.telegram.ui.Components.bo0 f40023f;
    public boolean h;
    public int f40024n;
    public final int f40025r;
    public int f40026s;
    public String v;
    public a3 f40027w;
    public StaticLayout f40028x;
    public int f40029y;

    public z0(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f40025r = AndroidUtilities.dp(58.0f);
        this.f40020a = u70Var;
        this.f40021b = f4Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.e = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        this.J = DownloadController.getInstance(((h4) u70Var).X).generateObserverTag();
        org.telegram.ui.Components.bo0 bo0Var = new org.telegram.ui.Components.bo0(this);
        this.f40023f = bo0Var;
        bo0Var.h = new y0(this, 0);
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
        int i10 = ((h4) this.f40020a).X;
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
            org.telegram.ui.Components.bo0 bo0Var = this.f40023f;
            if (!bo0Var.e) {
                bo0Var.i(messageObject.audioProgress);
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
                TextPaint textPaint = h4.f34110e1;
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.f40028x = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            h4.f34110e1.setColor(this.f40020a.b());
            invalidate();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f40027w;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f40022c;
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
        a3 a3Var = this.f40027w;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.f40022c;
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
        DownloadController.getInstance(((h4) this.f40020a).X).removeLoadingFileObserver(this);
        a3 a3Var = this.f40027w;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.f40022c;
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
        int i10 = org.telegram.ui.ActionBar.i6.f18934ie;
        int i11 = org.telegram.ui.ActionBar.i6.f18952je;
        int i12 = org.telegram.ui.ActionBar.i6.f19154uc;
        int i13 = org.telegram.ui.ActionBar.i6.f19171vc;
        RadialProgress2 radialProgress2 = this.e;
        radialProgress2.g(i10, i11, i12, i13);
        int i14 = org.telegram.ui.ActionBar.i6.Bd;
        u70 u70Var = this.f40020a;
        ((h4) u70Var).getClass();
        int i15 = 0;
        radialProgress2.d = org.telegram.ui.ActionBar.i6.w0(null, i14, false);
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(this.f40029y, this.E);
        this.f40023f.b(canvas);
        canvas.restore();
        if (this.f40028x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(54.0f) + this.F, AndroidUtilities.dp(6.0f) + this.E);
            this.f40028x.draw(canvas);
            canvas.restore();
        }
        if (this.f40027w != null) {
            canvas.save();
            this.f40027w.f31679s = AndroidUtilities.dp(54.0f) + this.F;
            this.f40027w.v = this.E - AndroidUtilities.dp(16.0f);
            a3 a3Var = this.f40027w;
            canvas.translate(a3Var.f31679s, a3Var.v);
            h4.v(u70Var, canvas, this, 0);
            this.f40027w.draw(canvas, this);
            canvas.restore();
            i15 = 1;
        }
        a3 a3Var2 = this.f40022c;
        int i16 = this.f40025r;
        if (a3Var2 != null) {
            canvas.save();
            a3 a3Var3 = this.f40022c;
            int i17 = this.f40024n;
            a3Var3.f31679s = i17;
            a3Var3.v = i16;
            canvas.translate(i17, i16);
            h4.v(u70Var, canvas, this, i15);
            this.f40022c.draw(canvas, this);
            canvas.restore();
            i15++;
        }
        if (this.d != null) {
            canvas.save();
            a3 a3Var4 = this.d;
            int i18 = this.f40024n;
            a3Var4.f31679s = i18;
            int i19 = this.f40026s;
            a3Var4.v = i16 + i19;
            canvas.translate(i18, i16 + i19);
            h4.v(u70Var, canvas, this, i15);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        h4.u(canvas, u70Var, this.K, getMeasuredHeight());
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
        if (this.f40027w != null) {
            sb2.append(", ");
            sb2.append(this.f40027w.d.getText());
        }
        if (this.f40022c != null) {
            sb2.append(", ");
            sb2.append(this.f40022c.d.getText());
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
                this.f40024n = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
            } else {
                this.f40024n = AndroidUtilities.dp(18.0f);
            }
            int dp2 = (size - this.f40024n) - AndroidUtilities.dp(18.0f);
            int dp3 = AndroidUtilities.dp(44.0f);
            this.F = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(5.0f);
            this.G = dp4;
            int i14 = this.F;
            this.e.q(i14, dp4, i14 + dp3, dp4 + dp3);
            TL_iv.pageBlockAudio pageblockaudio2 = this.K;
            a3 q6 = h4.q(this.f40020a, this, null, pageblockaudio2.caption.text, dp2, this.f40025r, pageblockaudio2, this.f40021b);
            this.f40022c = q6;
            if (q6 != null) {
                int height = this.f40022c.d.getHeight() + AndroidUtilities.dp(8.0f);
                this.f40026s = height;
                dp = org.telegram.messenger.w1.C(8.0f, height, dp);
            }
            i12 = dp;
            TL_iv.pageBlockAudio pageblockaudio3 = this.K;
            TL_iv.RichText richText = pageblockaudio3.caption.credit;
            int i15 = this.f40025r + this.f40026s;
            if (this.f40021b.G) {
                alignment = org.telegram.ui.Components.jw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            a3 p5 = h4.p(this.f40020a, this, null, richText, dp2, i15, pageblockaudio3, alignment2, 0, this.f40021b);
            this.d = p5;
            if (p5 != null) {
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
            }
            if (!this.h && this.K.level <= 0) {
                i12 += AndroidUtilities.dp(8.0f);
            }
            String musicAuthor = this.M.getMusicAuthor(false);
            String musicTitle = this.M.getMusicTitle(false);
            int C = org.telegram.messenger.w1.C(50.0f, this.F, dp3);
            this.f40029y = C;
            int dp5 = (size - C) - AndroidUtilities.dp(18.0f);
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.f40027w = null;
                this.E = ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            } else {
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder = new SpannableStringBuilder(a4.a.C(musicAuthor, " - ", musicTitle));
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                }
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.i6.O2, dp5, TextUtils.TruncateAt.END);
                a3 a3Var = new a3(this.f40020a);
                this.f40027w = a3Var;
                a3Var.d = new StaticLayout(ellipsize, h4.f34110e1, dp5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f40027w.f31677n = this.K;
                this.E = AndroidUtilities.dp(11.0f) + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + this.G;
            }
            this.f40023f.j(dp5, AndroidUtilities.dp(30.0f));
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
        b();
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.e.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.H != 3) {
            a(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.e.o(1.0f, true);
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
