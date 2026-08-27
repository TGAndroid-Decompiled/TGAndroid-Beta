package rh;

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
import h7.z5;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.mn0;

public final class x extends y implements org.telegram.ui.ActionBar.x5, i9, i0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
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

    public final int f47540n;

    public final c6 f47541r;

    public final Paint f47542s;
    public final TextPaint v;

    public final RadialProgress2 f47543w;

    public final mn0 f47544x;

    public final int f47545y;

    public x(Context context, int i10, c6 c6Var) {
        super(context);
        this.f47542s = new Paint(1);
        this.v = new TextPaint(1);
        this.A = AndroidUtilities.dp(16.0f);
        int iDp = AndroidUtilities.dp(10.0f);
        this.B = iDp;
        int iDp2 = AndroidUtilities.dp(44.0f);
        this.C = iDp2;
        this.f47540n = i10;
        this.f47541r = c6Var;
        setWillNotDraw(false);
        this.f47545y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.f47543w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.A;
        radialProgress2.q(i11, iDp, i11 + iDp2, iDp2 + iDp);
        mn0 mn0Var = new mn0(this);
        this.f47544x = mn0Var;
        mn0Var.h = new n1.d(this, 17);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        h0 h0Var = new h0(context, c6Var, new m5.o(this, 18));
        this.Q = h0Var;
        addView(h0Var.f47171a, z5.e(-2, -2, 51));
        d();
    }

    private TLRPC.Document getDisplayDocument() {
        s sVar;
        a aVar = this.f47594a;
        if (aVar == null || (sVar = aVar.f47032g) == null) {
            return null;
        }
        TLRPC.Document document = sVar.h;
        return document != null ? document : sVar.f47420i;
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
        return i10 == 3 ? 3 : 0;
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
    public final void d() {
        this.f47542s.setColor(g6.v0(g6.f23366uf, this.f47541r));
        h0 h0Var = this.Q;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.L;
        if (messageObject == null || i11 != this.f47540n) {
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            m(true);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            if (messageObject.getId() != ((Integer) objArr[0]).intValue() || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
                return;
            }
            MessageObject messageObject2 = this.L;
            messageObject2.audioProgress = playingMessageObject.audioProgress;
            messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
            messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
            n();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Q.c(canvas);
    }

    @Override
    public final void f(int i10) {
        int iDp = AndroidUtilities.dp(16.0f);
        if (this.D) {
            i10 = 0;
        }
        int i11 = iDp + i10;
        this.A = i11;
        int i12 = this.C;
        int i13 = this.B;
        this.f47543w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.Q.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.Q.f47171a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.f47545y;
    }

    @Override
    public a getRow() {
        return this.f47594a;
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
        this.f47594a = aVar;
        this.K = j3Var;
        if (aVar != null && aVar.f47032g == null) {
            aVar.f47032g = new s();
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
            int i10 = this.f47540n;
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
            a aVar2 = this.f47594a;
            if (aVar2 != null && (sVar = aVar2.f47032g) != null && !TextUtils.isEmpty(sVar.f47417e)) {
                tL_message.attachPath = this.f47594a.f47032g.f47417e;
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
        a aVar = this.f47594a;
        return (aVar == null || (sVar = aVar.f47032g) == null || !sVar.b()) ? false : true;
    }

    public final boolean k() {
        s sVar;
        a aVar = this.f47594a;
        return (aVar == null || (sVar = aVar.f47032g) == null || !sVar.a()) ? false : true;
    }

    public final void l() {
        String musicAuthor;
        String musicTitle;
        SpannableStringBuilder spannableStringBuilder;
        int iDp = AndroidUtilities.dp(50.0f) + this.A;
        int i10 = this.C;
        this.E = iDp + i10;
        this.G = Math.max(0, (((getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x) - this.E) - AndroidUtilities.dp(16.0f)) - (this.D ? this.f47596c : 0));
        MessageObject messageObject = this.L;
        if (messageObject != null) {
            musicAuthor = messageObject.getMusicAuthor(false);
        } else {
            musicAuthor = h() != null ? h().performer : null;
        }
        MessageObject messageObject2 = this.L;
        if (messageObject2 != null) {
            musicTitle = messageObject2.getMusicTitle(false);
        } else {
            musicTitle = h() != null ? h().title : null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(musicTitle);
        int i11 = this.B;
        if (zIsEmpty && TextUtils.isEmpty(musicAuthor)) {
            this.H = null;
            this.F = ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        } else {
            if (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder = !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(a9.p.w(musicAuthor, " - ", musicTitle));
            }
            if (!TextUtils.isEmpty(musicAuthor)) {
                spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
            }
            float fDp = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(fDp);
            this.H = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.G, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.G, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.F = AndroidUtilities.dp(11.0f) + ((i10 - AndroidUtilities.dp(30.0f)) / 2) + i11;
        }
        this.f47544x.j(this.G, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        s sVar;
        int i10 = g6.f23152ie;
        int i11 = g6.f23170je;
        int i12 = g6.f23363uc;
        int i13 = g6.f23379vc;
        RadialProgress2 radialProgress2 = this.f47543w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = g6.v0(g6.Bd, this.f47541r);
        boolean zK = k();
        int i14 = this.f47540n;
        if (zK) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.f47594a.f47032g.f47418f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        TLRPC.Document document = j() ? this.f47594a.f47032g.h : null;
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f47594a;
        boolean z11 = (aVar == null || (sVar = aVar.f47032g) == null || TextUtils.isEmpty(sVar.f47417e) || !new File(this.f47594a.f47032g.f47417e).exists()) ? false : true;
        File pathToAttach = document == null ? null : FileLoader.getInstance(i14).getPathToAttach(document, true);
        boolean z12 = z11 || (pathToAttach != null && pathToAttach.exists());
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            this.N = (!MediaController.getInstance().isPlayingMessage(this.L) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i14).addLoadingFileObserver(attachFileName, null, this);
            if (FileLoader.getInstance(i14).isLoadingFile(attachFileName)) {
                this.N = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                radialProgress2.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            } else {
                this.N = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.L) != null) {
            mn0 mn0Var = this.f47544x;
            if (!mn0Var.f30708e) {
                mn0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i10 = (int) d;
            }
        } else if (this.L == null || !MediaController.getInstance().isPlayingMessage(this.L)) {
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudioH = h();
            if (tL_documentAttributeAudioH != null) {
                d = tL_documentAttributeAudioH.duration;
                i10 = (int) d;
            }
        } else {
            i10 = this.L.audioProgressSec;
        }
        String shortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.J;
        if (str == null || !str.equals(shortDuration)) {
            this.J = shortDuration;
            float fDp = AndroidUtilities.dp(16.0f);
            TextPaint textPaint = this.v;
            textPaint.setTextSize(fDp);
            this.I = new StaticLayout(shortDuration, textPaint, (int) Math.ceil(textPaint.measureText(shortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        this.f47543w.m(this);
        this.f47544x.f30721s = this;
        m(false);
        int i10 = this.f47540n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P = false;
        int i10 = this.f47540n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        j9 textSelectionHelper;
        if (getDisplayDocument() == null) {
            return;
        }
        this.f47543w.draw(canvas);
        int i10 = g6.f23364ud;
        c6 c6Var = this.f47541r;
        int iV0 = g6.v0(i10, c6Var);
        int iV1 = g6.v0(g6.f23380vd, c6Var);
        int i11 = g6.f23412xd;
        int iV2 = g6.v0(i11, c6Var);
        int iV3 = g6.v0(i11, c6Var);
        int iV4 = g6.v0(g6.wd, c6Var);
        mn0 mn0Var = this.f47544x;
        mn0Var.h(iV0, iV1, iV2, iV3, iV4);
        if (!k()) {
            canvas.save();
            canvas.translate(this.E, this.F);
            mn0Var.b(canvas);
            canvas.restore();
        }
        int iV5 = g6.v0(g6.f23240nd, c6Var);
        TextPaint textPaint = this.v;
        textPaint.setColor(iV5);
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
        if (j3Var != null && (textSelectionHelper = j3Var.f47223a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int iR = RecyclerView.R(this);
            if (iR >= 0 && iR > textSelectionHelper.f24540u0 && iR <= textSelectionHelper.f24543x0) {
                canvas.drawRoundRect(AndroidUtilities.dp(8.0f) + (this.D ? 0 : this.f47596c), AndroidUtilities.dp(2.0f), (getWidth() - (this.D ? this.f47596c : 0)) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f47542s);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        m(true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.D;
        this.Q.g(z11 ? 0 : this.f47596c, z11 ? this.f47596c : 0, i12 - i10, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.D;
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.Q.h(z10 ? 0 : this.f47596c, z10 ? this.f47596c : 0, size));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f47543w.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
        if (this.N != 3) {
            m(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f47543w.o(1.0f, true);
        m(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!k()) {
            if (this.f47544x.f(x8 - this.E, y10 - this.F, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i10 = this.A;
            if (x8 >= i10) {
                int i11 = this.C;
                if (x8 <= i10 + i11) {
                    int i12 = this.B;
                    if (y10 >= i12 && y10 <= i12 + i11) {
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
                        a aVar = this.f47594a;
                        p3 p3Var = j3Var.f47223a;
                        ArrayList arrayList = p3Var.f47348h3;
                        s4 s4Var = (s4) p3Var.V3.remove(aVar.f47032g);
                        if (s4Var != null) {
                            s4Var.b();
                        }
                        int iIndexOf = arrayList.indexOf(aVar);
                        if (iIndexOf >= 0) {
                            b2 b2Var = p3Var.F3;
                            if (b2Var != null) {
                                b2Var.d();
                            }
                            arrayList.remove(iIndexOf);
                            p3Var.U2.N(true);
                            b2 b2Var2 = p3Var.F3;
                            if (b2Var2 != null) {
                                b2Var2.h();
                            }
                        }
                        p3Var.f47340d3.onContentChanged();
                    }
                } else if (this.L != null) {
                    TLRPC.Document document = j() ? this.f47594a.f47032g.h : null;
                    int i13 = this.N;
                    RadialProgress2 radialProgress2 = this.f47543w;
                    if (i13 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.L);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.L, 0L, false, null)) {
                            this.N = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i13 != 1) {
                        int i14 = this.f47540n;
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
                    } else if (MediaController.getInstance().lambda$startAudioAgain$7(this.L)) {
                        this.N = 0;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.O = false;
        }
        return this.O || super.onTouchEvent(motionEvent);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
