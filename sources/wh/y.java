package wh;

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
import java.io.File;
import java.util.ArrayList;
import k7.c6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.go0;
public final class y extends z implements b6, l9, j0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public int B;
    public final int C;
    public final int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public StaticLayout I;
    public StaticLayout J;
    public String K;
    public l3 L;
    public MessageObject M;
    public TLRPC.Document N;
    public int O;
    public boolean P;
    public boolean Q;
    public final i0 R;
    public final int f50195n;
    public final g6 f50196r;
    public final Paint f50197s;
    public final TextPaint v;
    public final RadialProgress2 f50198w;
    public final go0 f50199x;
    public final int f50200y;

    public y(Context context, int i10, g6 g6Var) {
        super(context);
        this.f50197s = new Paint(1);
        this.v = new TextPaint(1);
        this.B = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.C = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.D = dp2;
        this.f50195n = i10;
        this.f50196r = g6Var;
        setWillNotDraw(false);
        this.f50200y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.f50198w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.B;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        go0 go0Var = new go0(this);
        this.f50199x = go0Var;
        go0Var.h = new org.telegram.ui.web.e0(this, 19);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        i0 i0Var = new i0(context, g6Var, new org.telegram.ui.Cells.f1(this, 26));
        this.R = i0Var;
        addView(i0Var.f49814a, c6.e(-2, -2, 51));
        e();
    }

    private TLRPC.Document getDisplayDocument() {
        t tVar;
        a aVar = this.f50211a;
        if (aVar != null && (tVar = aVar.f49657g) != null) {
            TLRPC.Document document = tVar.h;
            if (document != null) {
                return document;
            }
            return tVar.f50072i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (k()) {
            return 3;
        }
        int i10 = this.O;
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
        return this.R.f(i10, i11);
    }

    @Override
    public final void b() {
        this.R.i();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.M;
        if (messageObject != null && i11 == this.f50195n) {
            if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (i10 == NotificationCenter.messagePlayingProgressDidChanged && messageObject.getId() == ((Integer) objArr[0]).intValue() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    MessageObject messageObject2 = this.M;
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
        this.R.c(canvas);
    }

    @Override
    public final void e() {
        this.f50197s.setColor(k6.v0(k6.f21972uf, this.f50196r));
        i0 i0Var = this.R;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.E) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.B = i11;
        int i12 = this.D;
        int i13 = this.C;
        this.f50198w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.R.e(arrayList);
    }

    @Override
    public e1 getCaptionEditText() {
        return this.R.f49814a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.f50200y;
    }

    @Override
    public a getRow() {
        return this.f50211a;
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

    public final void i(a aVar, l3 l3Var) {
        t tVar;
        this.f50211a = aVar;
        this.L = l3Var;
        if (aVar != null && aVar.f49657g == null) {
            aVar.f49657g = new t();
        }
        this.E = LocaleController.isRTL;
        c(aVar);
        this.R.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.N) {
            this.N = displayDocument;
            this.M = null;
            this.K = null;
            this.J = null;
        }
        if (j() && this.M == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f20866id = -Long.valueOf(displayDocument.f20851id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.f50195n;
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
            a aVar2 = this.f50211a;
            if (aVar2 != null && (tVar = aVar2.f49657g) != null && !TextUtils.isEmpty(tVar.f50069e)) {
                tL_message.attachPath = this.f50211a.f49657g.f50069e;
            }
            this.M = new MessageObject(i10, tL_message, false, true);
        }
        l();
        if (this.Q) {
            m(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean j() {
        t tVar;
        a aVar = this.f50211a;
        if (aVar != null && (tVar = aVar.f49657g) != null && tVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        t tVar;
        a aVar = this.f50211a;
        if (aVar != null && (tVar = aVar.f49657g) != null && tVar.a()) {
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
        int dp = AndroidUtilities.dp(50.0f) + this.B;
        int i12 = this.D;
        this.F = dp + i12;
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = AndroidUtilities.displaySize.x;
        }
        if (this.E) {
            i11 = this.f50213c;
        } else {
            i11 = 0;
        }
        this.H = Math.max(0, ((i10 - this.F) - AndroidUtilities.dp(16.0f)) - i11);
        MessageObject messageObject = this.M;
        if (messageObject != null) {
            str = messageObject.getMusicAuthor(false);
        } else if (h() != null) {
            str = h().performer;
        } else {
            str = null;
        }
        MessageObject messageObject2 = this.M;
        if (messageObject2 != null) {
            str2 = messageObject2.getMusicTitle(false);
        } else if (h() != null) {
            str2 = h().title;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i13 = this.C;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.I = null;
            this.G = ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(android.support.v4.media.a.z(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.I = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.H, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.H, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.G = AndroidUtilities.dp(11.0f) + ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        }
        this.f50199x.j(this.H, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z4) {
        TLRPC.Document document;
        boolean z10;
        File pathToAttach;
        boolean z11;
        t tVar;
        int i10 = k6.f21759ie;
        int i11 = k6.f21776je;
        int i12 = k6.f21969uc;
        int i13 = k6.f21987vc;
        RadialProgress2 radialProgress2 = this.f50198w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = k6.v0(k6.Bd, this.f50196r);
        boolean k10 = k();
        int i14 = this.f50195n;
        if (k10) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.f50211a.f49657g.f50070f, z4);
            radialProgress2.setIcon(3, false, z4);
            n();
            return;
        }
        if (j()) {
            document = this.f50211a.f49657g.h;
        } else {
            document = null;
        }
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f50211a;
        int i15 = 1;
        if (aVar != null && (tVar = aVar.f49657g) != null && !TextUtils.isEmpty(tVar.f50069e) && new File(this.f50211a.f49657g.f50069e).exists()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (document == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i14).getPathToAttach(document, true);
        }
        if (!z10 && (pathToAttach == null || !pathToAttach.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            this.O = (!MediaController.getInstance().isPlayingMessage(this.M) || MediaController.getInstance().isMessagePaused()) ? 0 : 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i14).addLoadingFileObserver(attachFileName, null, this);
            boolean isLoadingFile = FileLoader.getInstance(i14).isLoadingFile(attachFileName);
            float f10 = 0.0f;
            if (!isLoadingFile) {
                this.O = 2;
                radialProgress2.o(0.0f, z4);
                radialProgress2.setIcon(getIconForCurrentState(), false, z4);
            } else {
                this.O = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f10 = fileProgress.floatValue();
                }
                radialProgress2.o(f10, z4);
                radialProgress2.setIcon(getIconForCurrentState(), true, z4);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.M) != null) {
            go0 go0Var = this.f50199x;
            if (!go0Var.f27207e) {
                go0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i10 = (int) d;
            }
        } else if (this.M != null && MediaController.getInstance().isPlayingMessage(this.M)) {
            i10 = this.M.audioProgressSec;
        } else {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i10 = (int) d;
            }
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.K;
        if (str == null || !str.equals(formatShortDuration)) {
            this.K = formatShortDuration;
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.J = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.f50198w.m(this);
        this.f50199x.f27220s = this;
        m(false);
        int i10 = this.f50195n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q = false;
        int i10 = this.f50195n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m9 textSelectionHelper;
        int i10;
        if (getDisplayDocument() != null) {
            this.f50198w.draw(canvas);
            int i11 = k6.f21970ud;
            g6 g6Var = this.f50196r;
            int v02 = k6.v0(i11, g6Var);
            int v03 = k6.v0(k6.f21988vd, g6Var);
            int i12 = k6.f22026xd;
            int v04 = k6.v0(i12, g6Var);
            int v05 = k6.v0(i12, g6Var);
            int v06 = k6.v0(k6.f22007wd, g6Var);
            go0 go0Var = this.f50199x;
            go0Var.h(v02, v03, v04, v05, v06);
            if (!k()) {
                canvas.save();
                canvas.translate(this.F, this.G);
                go0Var.b(canvas);
                canvas.restore();
            }
            int v07 = k6.v0(k6.f21847nd, g6Var);
            TextPaint textPaint = this.v;
            textPaint.setColor(v07);
            if (this.J != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.B, AndroidUtilities.dp(6.0f) + this.G);
                this.J.draw(canvas);
                canvas.restore();
            }
            if (this.I != null) {
                textPaint.setColor(k6.v0(k6.G6, g6Var));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.B, this.G - AndroidUtilities.dp(16.0f));
                this.I.draw(canvas);
                canvas.restore();
            }
            l3 l3Var = this.L;
            if (l3Var != null && (textSelectionHelper = l3Var.f49900a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f23177u0 && R <= textSelectionHelper.f23180x0) {
                    int i13 = 0;
                    if (this.E) {
                        i10 = 0;
                    } else {
                        i10 = this.f50213c;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + i10;
                    float dp2 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.E) {
                        i13 = this.f50213c;
                    }
                    canvas.drawRoundRect(dp, dp2, (width - i13) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f50197s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        m(true);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = this.E;
        int i15 = 0;
        if (z10) {
            i14 = 0;
        } else {
            i14 = this.f50213c;
        }
        if (z10) {
            i15 = this.f50213c;
        }
        this.R.g(i14, i15, i12 - i10, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z4 = this.E;
        int i13 = 0;
        if (z4) {
            i12 = 0;
        } else {
            i12 = this.f50213c;
        }
        if (z4) {
            i13 = this.f50213c;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.R.h(i12, i13, size));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float f10;
        if (j11 <= 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) j10) / ((float) j11);
        }
        this.f50198w.o(Math.min(1.0f, f10), true);
        if (this.O != 3) {
            m(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f50198w.o(1.0f, true);
        m(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!k()) {
            if (this.f50199x.f(x10 - this.F, y10 - this.G, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i10 = this.B;
            if (x10 >= i10) {
                int i11 = this.D;
                if (x10 <= i10 + i11) {
                    int i12 = this.C;
                    if (y10 >= i12 && y10 <= i12 + i11) {
                        this.P = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.P) {
                this.P = false;
                playSoundEffect(0);
                if (k()) {
                    l3 l3Var = this.L;
                    if (l3Var != null) {
                        a aVar = this.f50211a;
                        r3 r3Var = l3Var.f49900a;
                        ArrayList arrayList = r3Var.f50024i3;
                        u4 u4Var = (u4) r3Var.W3.remove(aVar.f49657g);
                        if (u4Var != null) {
                            u4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            d2 d2Var = r3Var.G3;
                            if (d2Var != null) {
                                d2Var.d();
                            }
                            arrayList.remove(indexOf);
                            r3Var.V2.N(true);
                            d2 d2Var2 = r3Var.G3;
                            if (d2Var2 != null) {
                                d2Var2.h();
                            }
                        }
                        r3Var.f50016e3.onContentChanged();
                    }
                } else if (this.M != null) {
                    if (j()) {
                        document = this.f50211a.f49657g.h;
                    } else {
                        document = null;
                    }
                    int i13 = this.O;
                    RadialProgress2 radialProgress2 = this.f50198w;
                    if (i13 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.M);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.M, 0L, false, null)) {
                            this.O = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i13 == 1) {
                        if (MediaController.getInstance().lambda$startAudioAgain$7(this.M)) {
                            this.O = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i14 = this.f50195n;
                        if (i13 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i14).loadFile(document, this.M, 1, 1);
                            this.O = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i13 == 3) {
                            FileLoader.getInstance(i14).cancelLoadFile(document);
                            this.O = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.P = false;
        }
        if (this.P || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
