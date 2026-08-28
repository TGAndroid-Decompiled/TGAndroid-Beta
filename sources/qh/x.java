package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g7.e6;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ln0;
public final class x extends y implements org.telegram.ui.ActionBar.w5, m9, i0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public int A;
    public final int B;
    public final int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public StaticLayout I;
    public String J;
    public i3 K;
    public MessageObject L;
    public TLRPC.Document M;
    public int N;
    public boolean O;
    public boolean P;
    public final h0 Q;
    public final int f46784n;
    public final b6 f46785r;
    public final Paint f46786s;
    public final TextPaint v;
    public final RadialProgress2 f46787w;
    public final ln0 f46788x;
    public final int f46789y;

    public x(Context context, int i9, b6 b6Var) {
        super(context);
        this.f46786s = new Paint(1);
        this.v = new TextPaint(1);
        this.A = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.B = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.C = dp2;
        this.f46784n = i9;
        this.f46785r = b6Var;
        setWillNotDraw(false);
        this.f46789y = DownloadController.getInstance(i9).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, b6Var);
        this.f46787w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i10 = this.A;
        radialProgress2.q(i10, dp, i10 + dp2, dp2 + dp);
        ln0 ln0Var = new ln0(this);
        this.f46788x = ln0Var;
        ln0Var.h = new m5.c0(this, 20);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        h0 h0Var = new h0(context, b6Var, new n5.e0(this, 17));
        this.Q = h0Var;
        addView(h0Var.f46409a, e6.e(-2, -2, 51));
        d();
    }

    private TLRPC.Document getDisplayDocument() {
        s sVar;
        a aVar = this.f46834a;
        if (aVar != null && (sVar = aVar.f46273g) != null) {
            TLRPC.Document document = sVar.h;
            if (document != null) {
                return document;
            }
            return sVar.f46674i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (k()) {
            return 3;
        }
        int i9 = this.N;
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        if (i9 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final boolean a(int i9, int i10) {
        return this.Q.f(i9, i10);
    }

    @Override
    public final void b() {
        this.Q.i();
    }

    @Override
    public final void d() {
        this.f46786s.setColor(f6.v0(f6.f23312uf, this.f46785r));
        h0 h0Var = this.Q;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.L;
        if (messageObject != null && i10 == this.f46784n) {
            if (i9 != NotificationCenter.messagePlayingDidStart && i9 != NotificationCenter.messagePlayingDidReset && i9 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (i9 == NotificationCenter.messagePlayingProgressDidChanged && messageObject.getId() == ((Integer) objArr[0]).intValue() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    MessageObject messageObject2 = this.L;
                    messageObject2.audioProgress = playingMessageObject.audioProgress;
                    messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                    messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                    n();
                    return;
                }
                return;
            }
            m(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Q.c(canvas);
    }

    @Override
    public final void f(int i9) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.D) {
            i9 = 0;
        }
        int i10 = dp + i9;
        this.A = i10;
        int i11 = this.C;
        int i12 = this.B;
        this.f46787w.q(i10, i12, i10 + i11, i11 + i12);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.Q.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.Q.f46409a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.f46789y;
    }

    @Override
    public a getRow() {
        return this.f46834a;
    }

    public final TLRPC.TL_documentAttributeAudio h() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i9 = 0; i9 < displayDocument.attributes.size(); i9++) {
            if (displayDocument.attributes.get(i9) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i9);
            }
        }
        return null;
    }

    public final void i(a aVar, i3 i3Var) {
        s sVar;
        this.f46834a = aVar;
        this.K = i3Var;
        if (aVar != null && aVar.f46273g == null) {
            aVar.f46273g = new s();
        }
        this.D = LocaleController.isRTL;
        c(aVar);
        this.Q.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.M) {
            this.M = displayDocument;
            this.L = null;
            this.J = null;
            this.I = null;
        }
        if (j() && this.L == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f22401id = -Long.valueOf(displayDocument.f22386id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i9 = this.f46784n;
            long clientUserId = UserConfig.getInstance(i9).getClientUserId();
            peer.user_id = clientUserId;
            tL_peerUser.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.f46834a;
            if (aVar2 != null && (sVar = aVar2.f46273g) != null && !TextUtils.isEmpty(sVar.f46671e)) {
                tL_message.attachPath = this.f46834a.f46273g.f46671e;
            }
            this.L = new MessageObject(i9, tL_message, false, true);
        }
        l();
        if (this.P) {
            m(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean j() {
        s sVar;
        a aVar = this.f46834a;
        if (aVar != null && (sVar = aVar.f46273g) != null && sVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        s sVar;
        a aVar = this.f46834a;
        if (aVar != null && (sVar = aVar.f46273g) != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i9;
        int i10;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        int dp = AndroidUtilities.dp(50.0f) + this.A;
        int i11 = this.C;
        this.E = dp + i11;
        if (getMeasuredWidth() > 0) {
            i9 = getMeasuredWidth();
        } else {
            i9 = AndroidUtilities.displaySize.x;
        }
        if (this.D) {
            i10 = this.f46836c;
        } else {
            i10 = 0;
        }
        this.G = Math.max(0, ((i9 - this.E) - AndroidUtilities.dp(16.0f)) - i10);
        MessageObject messageObject = this.L;
        if (messageObject != null) {
            str = messageObject.getMusicAuthor(false);
        } else if (h() != null) {
            str = h().performer;
        } else {
            str = null;
        }
        MessageObject messageObject2 = this.L;
        if (messageObject2 != null) {
            str2 = messageObject2.getMusicTitle(false);
        } else if (h() != null) {
            str2 = h().title;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.B;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.H = null;
            this.F = ((i11 - AndroidUtilities.dp(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(aa.d.z(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.H = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.G, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.G, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.F = AndroidUtilities.dp(11.0f) + ((i11 - AndroidUtilities.dp(30.0f)) / 2) + i12;
        }
        this.f46788x.j(this.G, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File pathToAttach;
        boolean z12;
        s sVar;
        int i9 = f6.f23099ie;
        int i10 = f6.f23116je;
        int i11 = f6.f23309uc;
        int i12 = f6.f23323vc;
        RadialProgress2 radialProgress2 = this.f46787w;
        radialProgress2.g(i9, i10, i11, i12);
        radialProgress2.d = f6.v0(f6.Bd, this.f46785r);
        boolean k10 = k();
        int i13 = this.f46784n;
        if (k10) {
            DownloadController.getInstance(i13).removeLoadingFileObserver(this);
            radialProgress2.o(this.f46834a.f46273g.f46672f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        if (j()) {
            document = this.f46834a.f46273g.h;
        } else {
            document = null;
        }
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f46834a;
        int i14 = 1;
        if (aVar != null && (sVar = aVar.f46273g) != null && !TextUtils.isEmpty(sVar.f46671e) && new File(this.f46834a.f46273g.f46671e).exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (document == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i13).getPathToAttach(document, true);
        }
        if (!z11 && (pathToAttach == null || !pathToAttach.exists())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i13).removeLoadingFileObserver(this);
            this.N = (!MediaController.getInstance().isPlayingMessage(this.L) || MediaController.getInstance().isMessagePaused()) ? 0 : 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i13).addLoadingFileObserver(attachFileName, null, this);
            boolean isLoadingFile = FileLoader.getInstance(i13).isLoadingFile(attachFileName);
            float f10 = 0.0f;
            if (!isLoadingFile) {
                this.N = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.N = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f10 = fileProgress.floatValue();
                }
                radialProgress2.o(f10, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.L) != null) {
            ln0 ln0Var = this.f46788x;
            if (!ln0Var.f30490e) {
                ln0Var.i(messageObject.audioProgress);
            }
        }
        int i9 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i9 = (int) d;
            }
        } else if (this.L != null && MediaController.getInstance().isPlayingMessage(this.L)) {
            i9 = this.L.audioProgressSec;
        } else {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i9 = (int) d;
            }
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i9);
        String str = this.J;
        if (str == null || !str.equals(formatShortDuration)) {
            this.J = formatShortDuration;
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.I = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        this.f46787w.m(this);
        this.f46788x.f30503s = this;
        m(false);
        int i9 = this.f46784n;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P = false;
        int i9 = this.f46784n;
        DownloadController.getInstance(i9).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        n9 textSelectionHelper;
        int i9;
        if (getDisplayDocument() != null) {
            this.f46787w.draw(canvas);
            int i10 = f6.f23310ud;
            b6 b6Var = this.f46785r;
            int v02 = f6.v0(i10, b6Var);
            int v03 = f6.v0(f6.vd, b6Var);
            int i11 = f6.f23358xd;
            int v04 = f6.v0(i11, b6Var);
            int v05 = f6.v0(i11, b6Var);
            int v06 = f6.v0(f6.f23340wd, b6Var);
            ln0 ln0Var = this.f46788x;
            ln0Var.h(v02, v03, v04, v05, v06);
            if (!k()) {
                canvas.save();
                canvas.translate(this.E, this.F);
                ln0Var.b(canvas);
                canvas.restore();
            }
            int v07 = f6.v0(f6.nd, b6Var);
            TextPaint textPaint = this.v;
            textPaint.setColor(v07);
            if (this.I != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.A, AndroidUtilities.dp(6.0f) + this.F);
                this.I.draw(canvas);
                canvas.restore();
            }
            if (this.H != null) {
                textPaint.setColor(f6.v0(f6.G6, b6Var));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.A, this.F - AndroidUtilities.dp(16.0f));
                this.H.draw(canvas);
                canvas.restore();
            }
            i3 i3Var = this.K;
            if (i3Var != null && (textSelectionHelper = i3Var.f46445a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f24774u0 && R <= textSelectionHelper.f24777x0) {
                    int i12 = 0;
                    if (this.D) {
                        i9 = 0;
                    } else {
                        i9 = this.f46836c;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + i9;
                    float dp2 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.D) {
                        i12 = this.f46836c;
                    }
                    canvas.drawRoundRect(dp, dp2, (width - i12) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f46786s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        m(true);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        boolean z11 = this.D;
        int i14 = 0;
        if (z11) {
            i13 = 0;
        } else {
            i13 = this.f46836c;
        }
        if (z11) {
            i14 = this.f46836c;
        }
        this.Q.g(i13, i14, i11 - i9, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        boolean z10 = this.D;
        int i12 = 0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = this.f46836c;
        }
        if (z10) {
            i12 = this.f46836c;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.Q.h(i11, i12, size));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float f10;
        if (j11 <= 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) j10) / ((float) j11);
        }
        this.f46787w.o(Math.min(1.0f, f10), true);
        if (this.N != 3) {
            m(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f46787w.o(1.0f, true);
        m(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!k()) {
            if (this.f46788x.f(x10 - this.E, y10 - this.F, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i9 = this.A;
            if (x10 >= i9) {
                int i10 = this.C;
                if (x10 <= i9 + i10) {
                    int i11 = this.B;
                    if (y10 >= i11 && y10 <= i11 + i10) {
                        this.O = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.O) {
                this.O = false;
                playSoundEffect(0);
                if (k()) {
                    i3 i3Var = this.K;
                    if (i3Var != null) {
                        a aVar = this.f46834a;
                        o3 o3Var = i3Var.f46445a;
                        ArrayList arrayList = o3Var.f46573h3;
                        r4 r4Var = (r4) o3Var.V3.remove(aVar.f46273g);
                        if (r4Var != null) {
                            r4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            b2 b2Var = o3Var.F3;
                            if (b2Var != null) {
                                b2Var.d();
                            }
                            arrayList.remove(indexOf);
                            o3Var.U2.N(true);
                            b2 b2Var2 = o3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                        }
                        o3Var.f46565d3.onContentChanged();
                    }
                } else if (this.L != null) {
                    if (j()) {
                        document = this.f46834a.f46273g.h;
                    } else {
                        document = null;
                    }
                    int i12 = this.N;
                    RadialProgress2 radialProgress2 = this.f46787w;
                    if (i12 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.L);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.L, 0L, false, null)) {
                            this.N = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i12 == 1) {
                        if (MediaController.getInstance().lambda$startAudioAgain$7(this.L)) {
                            this.N = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i13 = this.f46784n;
                        if (i12 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i13).loadFile(document, this.L, 1, 1);
                            this.N = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i12 == 3) {
                            FileLoader.getInstance(i13).cancelLoadFile(document);
                            this.N = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.O = false;
        }
        if (this.O || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
