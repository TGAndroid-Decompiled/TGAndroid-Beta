package th;

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
import i7.f6;
import java.io.File;
import java.util.ArrayList;
import nh.d6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.wn0;
public final class x extends y implements org.telegram.ui.ActionBar.x5, j9, i0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
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
    public j3 K;
    public MessageObject L;
    public TLRPC.Document M;
    public int N;
    public boolean O;
    public boolean P;
    public final h0 Q;
    public final int f48838n;
    public final c6 f48839r;
    public final Paint f48840s;
    public final TextPaint v;
    public final RadialProgress2 f48841w;
    public final wn0 f48842x;
    public final int f48843y;

    public x(Context context, int i10, c6 c6Var) {
        super(context);
        this.f48840s = new Paint(1);
        this.v = new TextPaint(1);
        this.A = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.B = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.C = dp2;
        this.f48838n = i10;
        this.f48839r = c6Var;
        setWillNotDraw(false);
        this.f48843y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.f48841w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.A;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        wn0 wn0Var = new wn0(this);
        this.f48842x = wn0Var;
        wn0Var.h = new d6(this, 25);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        h0 h0Var = new h0(context, c6Var, new o1.a(this, 23));
        this.Q = h0Var;
        addView(h0Var.f48471a, f6.e(-2, -2, 51));
        e();
    }

    private TLRPC.Document getDisplayDocument() {
        s sVar;
        a aVar = this.f48892a;
        if (aVar != null && (sVar = aVar.f48332g) != null) {
            TLRPC.Document document = sVar.h;
            if (document != null) {
                return document;
            }
            return sVar.f48718i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (k()) {
            return 3;
        }
        int i10 = this.N;
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

    @Override
    public final boolean a(int i10, int i11) {
        return this.Q.f(i10, i11);
    }

    @Override
    public final void b() {
        this.Q.i();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.L;
        if (messageObject != null && i11 == this.f48838n) {
            if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (i10 == NotificationCenter.messagePlayingProgressDidChanged && messageObject.getId() == ((Integer) objArr[0]).intValue() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
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
    public final void e() {
        this.f48840s.setColor(g6.v0(g6.f23374uf, this.f48839r));
        h0 h0Var = this.Q;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.D) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.A = i11;
        int i12 = this.C;
        int i13 = this.B;
        this.f48841w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.Q.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.Q.f48471a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.f48843y;
    }

    @Override
    public a getRow() {
        return this.f48892a;
    }

    public final TLRPC.TL_documentAttributeAudio h() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i10 = 0; i10 < displayDocument.attributes.size(); i10++) {
            if (displayDocument.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i10);
            }
        }
        return null;
    }

    public final void i(a aVar, j3 j3Var) {
        s sVar;
        this.f48892a = aVar;
        this.K = j3Var;
        if (aVar != null && aVar.f48332g == null) {
            aVar.f48332g = new s();
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
            tL_message.f22413id = -Long.valueOf(displayDocument.f22398id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.f48838n;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            peer.user_id = clientUserId;
            tL_peerUser.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.f48892a;
            if (aVar2 != null && (sVar = aVar2.f48332g) != null && !TextUtils.isEmpty(sVar.f48715e)) {
                tL_message.attachPath = this.f48892a.f48332g.f48715e;
            }
            this.L = new MessageObject(i10, tL_message, false, true);
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
        a aVar = this.f48892a;
        if (aVar != null && (sVar = aVar.f48332g) != null && sVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        s sVar;
        a aVar = this.f48892a;
        if (aVar != null && (sVar = aVar.f48332g) != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i10;
        int i11;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        int dp = AndroidUtilities.dp(50.0f) + this.A;
        int i12 = this.C;
        this.E = dp + i12;
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = AndroidUtilities.displaySize.x;
        }
        if (this.D) {
            i11 = this.f48894c;
        } else {
            i11 = 0;
        }
        this.G = Math.max(0, ((i10 - this.E) - AndroidUtilities.dp(16.0f)) - i11);
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
        int i13 = this.B;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.H = null;
            this.F = ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a4.w.y(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.H = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.G, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.G, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.F = AndroidUtilities.dp(11.0f) + ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        }
        this.f48842x.j(this.G, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File pathToAttach;
        boolean z12;
        s sVar;
        int i10 = g6.f23160ie;
        int i11 = g6.f23178je;
        int i12 = g6.f23371uc;
        int i13 = g6.f23389vc;
        RadialProgress2 radialProgress2 = this.f48841w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = g6.v0(g6.Bd, this.f48839r);
        boolean k9 = k();
        int i14 = this.f48838n;
        if (k9) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.f48892a.f48332g.f48716f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        if (j()) {
            document = this.f48892a.f48332g.h;
        } else {
            document = null;
        }
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f48892a;
        int i15 = 1;
        if (aVar != null && (sVar = aVar.f48332g) != null && !TextUtils.isEmpty(sVar.f48715e) && new File(this.f48892a.f48332g.f48715e).exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (document == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i14).getPathToAttach(document, true);
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
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            this.N = (!MediaController.getInstance().isPlayingMessage(this.L) || MediaController.getInstance().isMessagePaused()) ? 0 : 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i14).addLoadingFileObserver(attachFileName, null, this);
            boolean isLoadingFile = FileLoader.getInstance(i14).isLoadingFile(attachFileName);
            float f9 = 0.0f;
            if (!isLoadingFile) {
                this.N = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.N = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f9 = fileProgress.floatValue();
                }
                radialProgress2.o(f9, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.L) != null) {
            wn0 wn0Var = this.f48842x;
            if (!wn0Var.f34449e) {
                wn0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i10 = (int) d;
            }
        } else if (this.L != null && MediaController.getInstance().isPlayingMessage(this.L)) {
            i10 = this.L.audioProgressSec;
        } else {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i10 = (int) d;
            }
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
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
        this.f48841w.m(this);
        this.f48842x.f34462s = this;
        m(false);
        int i10 = this.f48838n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P = false;
        int i10 = this.f48838n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k9 textSelectionHelper;
        int i10;
        if (getDisplayDocument() != null) {
            this.f48841w.draw(canvas);
            int i11 = g6.f23372ud;
            c6 c6Var = this.f48839r;
            int v02 = g6.v0(i11, c6Var);
            int v03 = g6.v0(g6.f23390vd, c6Var);
            int i12 = g6.xd;
            int v04 = g6.v0(i12, c6Var);
            int v05 = g6.v0(i12, c6Var);
            int v06 = g6.v0(g6.f23408wd, c6Var);
            wn0 wn0Var = this.f48842x;
            wn0Var.h(v02, v03, v04, v05, v06);
            if (!k()) {
                canvas.save();
                canvas.translate(this.E, this.F);
                wn0Var.b(canvas);
                canvas.restore();
            }
            int v07 = g6.v0(g6.f23248nd, c6Var);
            TextPaint textPaint = this.v;
            textPaint.setColor(v07);
            if (this.I != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.A, AndroidUtilities.dp(6.0f) + this.F);
                this.I.draw(canvas);
                canvas.restore();
            }
            if (this.H != null) {
                textPaint.setColor(g6.v0(g6.G6, c6Var));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.A, this.F - AndroidUtilities.dp(16.0f));
                this.H.draw(canvas);
                canvas.restore();
            }
            j3 j3Var = this.K;
            if (j3Var != null && (textSelectionHelper = j3Var.f48523a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f24607u0 && R <= textSelectionHelper.f24610x0) {
                    int i13 = 0;
                    if (this.D) {
                        i10 = 0;
                    } else {
                        i10 = this.f48894c;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + i10;
                    float dp2 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.D) {
                        i13 = this.f48894c;
                    }
                    canvas.drawRoundRect(dp, dp2, (width - i13) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f48840s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        m(true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z11 = this.D;
        int i15 = 0;
        if (z11) {
            i14 = 0;
        } else {
            i14 = this.f48894c;
        }
        if (z11) {
            i15 = this.f48894c;
        }
        this.Q.g(i14, i15, i12 - i10, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.D;
        int i13 = 0;
        if (z10) {
            i12 = 0;
        } else {
            i12 = this.f48894c;
        }
        if (z10) {
            i13 = this.f48894c;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.Q.h(i12, i13, size));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float f9;
        if (j11 <= 0) {
            f9 = 0.0f;
        } else {
            f9 = ((float) j10) / ((float) j11);
        }
        this.f48841w.o(Math.min(1.0f, f9), true);
        if (this.N != 3) {
            m(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f48841w.o(1.0f, true);
        m(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (!k()) {
            if (this.f48842x.f(x4 - this.E, y8 - this.F, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i10 = this.A;
            if (x4 >= i10) {
                int i11 = this.C;
                if (x4 <= i10 + i11) {
                    int i12 = this.B;
                    if (y8 >= i12 && y8 <= i12 + i11) {
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
                    j3 j3Var = this.K;
                    if (j3Var != null) {
                        a aVar = this.f48892a;
                        p3 p3Var = j3Var.f48523a;
                        ArrayList arrayList = p3Var.f48646h3;
                        s4 s4Var = (s4) p3Var.V3.remove(aVar.f48332g);
                        if (s4Var != null) {
                            s4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            b2 b2Var = p3Var.F3;
                            if (b2Var != null) {
                                b2Var.d();
                            }
                            arrayList.remove(indexOf);
                            p3Var.U2.N(true);
                            b2 b2Var2 = p3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                        }
                        p3Var.f48638d3.onContentChanged();
                    }
                } else if (this.L != null) {
                    if (j()) {
                        document = this.f48892a.f48332g.h;
                    } else {
                        document = null;
                    }
                    int i13 = this.N;
                    RadialProgress2 radialProgress2 = this.f48841w;
                    if (i13 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.L);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.L, 0L, false, null)) {
                            this.N = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i13 == 1) {
                        if (MediaController.getInstance().lambda$startAudioAgain$7(this.L)) {
                            this.N = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i14 = this.f48838n;
                        if (i13 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i14).loadFile(document, this.L, 1, 1);
                            this.N = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i13 == 3) {
                            FileLoader.getInstance(i14).cancelLoadFile(document);
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
