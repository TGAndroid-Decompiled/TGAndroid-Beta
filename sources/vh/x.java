package vh;

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
import k7.b6;
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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.qk0;
public final class x extends y implements a6, l9, i0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
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
    public final h0 R;
    public final int f46267n;
    public final f6 f46268r;
    public final Paint f46269s;
    public final TextPaint v;
    public final RadialProgress2 f46270w;
    public final go0 f46271x;
    public final int f46272y;

    public x(Context context, int i10, f6 f6Var) {
        super(context);
        this.f46269s = new Paint(1);
        this.v = new TextPaint(1);
        this.B = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.C = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.D = dp2;
        this.f46267n = i10;
        this.f46268r = f6Var;
        setWillNotDraw(false);
        this.f46272y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.f46270w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.B;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        go0 go0Var = new go0(this);
        this.f46271x = go0Var;
        go0Var.h = new qk0(this, 17);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        h0 h0Var = new h0(context, f6Var, new org.telegram.ui.Cells.f1(this, 26));
        this.R = h0Var;
        addView(h0Var.f45909a, b6.e(-2, -2, 51));
        e();
    }

    private TLRPC.Document getDisplayDocument() {
        s sVar;
        a aVar = this.f46283a;
        if (aVar != null && (sVar = aVar.f45778g) != null) {
            TLRPC.Document document = sVar.h;
            if (document != null) {
                return document;
            }
            return sVar.f46155i;
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
        if (messageObject != null && i11 == this.f46267n) {
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
        this.f46269s.setColor(j6.v0(j6.f20216uf, this.f46268r));
        h0 h0Var = this.R;
        if (h0Var != null) {
            h0Var.a();
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
        this.f46270w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.R.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.R.f45909a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.f46272y;
    }

    @Override
    public a getRow() {
        return this.f46283a;
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
        s sVar;
        this.f46283a = aVar;
        this.L = l3Var;
        if (aVar != null && aVar.f45778g == null) {
            aVar.f45778g = new s();
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
            tL_message.f19205id = -Long.valueOf(displayDocument.f19190id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.f46267n;
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
            a aVar2 = this.f46283a;
            if (aVar2 != null && (sVar = aVar2.f45778g) != null && !TextUtils.isEmpty(sVar.e)) {
                tL_message.attachPath = this.f46283a.f45778g.e;
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
        s sVar;
        a aVar = this.f46283a;
        if (aVar != null && (sVar = aVar.f45778g) != null && sVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        s sVar;
        a aVar = this.f46283a;
        if (aVar != null && (sVar = aVar.f45778g) != null && sVar.a()) {
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
            i11 = this.f46285c;
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
                spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.I = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.H, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.H, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.G = AndroidUtilities.dp(11.0f) + ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        }
        this.f46271x.j(this.H, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z4) {
        TLRPC.Document document;
        boolean z10;
        File pathToAttach;
        boolean z11;
        s sVar;
        int i10 = j6.f20003ie;
        int i11 = j6.f20020je;
        int i12 = j6.f20213uc;
        int i13 = j6.f20231vc;
        RadialProgress2 radialProgress2 = this.f46270w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = j6.v0(j6.Bd, this.f46268r);
        boolean k10 = k();
        int i14 = this.f46267n;
        if (k10) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.f46283a.f45778g.f46153f, z4);
            radialProgress2.setIcon(3, false, z4);
            n();
            return;
        }
        if (j()) {
            document = this.f46283a.f45778g.h;
        } else {
            document = null;
        }
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f46283a;
        int i15 = 1;
        if (aVar != null && (sVar = aVar.f45778g) != null && !TextUtils.isEmpty(sVar.e) && new File(this.f46283a.f45778g.e).exists()) {
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
            go0 go0Var = this.f46271x;
            if (!go0Var.e) {
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
        this.f46270w.m(this);
        this.f46271x.f25221s = this;
        m(false);
        int i10 = this.f46267n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q = false;
        int i10 = this.f46267n;
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
            this.f46270w.draw(canvas);
            int i11 = j6.f20214ud;
            f6 f6Var = this.f46268r;
            int v02 = j6.v0(i11, f6Var);
            int v03 = j6.v0(j6.f20232vd, f6Var);
            int i12 = j6.f20270xd;
            int v04 = j6.v0(i12, f6Var);
            int v05 = j6.v0(i12, f6Var);
            int v06 = j6.v0(j6.f20251wd, f6Var);
            go0 go0Var = this.f46271x;
            go0Var.h(v02, v03, v04, v05, v06);
            if (!k()) {
                canvas.save();
                canvas.translate(this.F, this.G);
                go0Var.b(canvas);
                canvas.restore();
            }
            int v07 = j6.v0(j6.f20091nd, f6Var);
            TextPaint textPaint = this.v;
            textPaint.setColor(v07);
            if (this.J != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.B, AndroidUtilities.dp(6.0f) + this.G);
                this.J.draw(canvas);
                canvas.restore();
            }
            if (this.I != null) {
                textPaint.setColor(j6.v0(j6.G6, f6Var));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.B, this.G - AndroidUtilities.dp(16.0f));
                this.I.draw(canvas);
                canvas.restore();
            }
            l3 l3Var = this.L;
            if (l3Var != null && (textSelectionHelper = l3Var.f46003a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f21401u0 && R <= textSelectionHelper.f21404x0) {
                    int i13 = 0;
                    if (this.E) {
                        i10 = 0;
                    } else {
                        i10 = this.f46285c;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + i10;
                    float dp2 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.E) {
                        i13 = this.f46285c;
                    }
                    canvas.drawRoundRect(dp, dp2, (width - i13) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f46269s);
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
            i14 = this.f46285c;
        }
        if (z10) {
            i15 = this.f46285c;
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
            i12 = this.f46285c;
        }
        if (z4) {
            i13 = this.f46285c;
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
        this.f46270w.o(Math.min(1.0f, f10), true);
        if (this.O != 3) {
            m(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f46270w.o(1.0f, true);
        m(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!k()) {
            if (this.f46271x.f(x10 - this.F, y10 - this.G, actionMasked)) {
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
                        a aVar = this.f46283a;
                        r3 r3Var = l3Var.f46003a;
                        ArrayList arrayList = r3Var.f46120i3;
                        u4 u4Var = (u4) r3Var.W3.remove(aVar.f45778g);
                        if (u4Var != null) {
                            u4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            c2 c2Var = r3Var.G3;
                            if (c2Var != null) {
                                c2Var.d();
                            }
                            arrayList.remove(indexOf);
                            r3Var.V2.N(true);
                            c2 c2Var2 = r3Var.G3;
                            if (c2Var2 != null) {
                                c2Var2.h();
                            }
                        }
                        r3Var.f46112e3.onContentChanged();
                    }
                } else if (this.M != null) {
                    if (j()) {
                        document = this.f46283a.f45778g.h;
                    } else {
                        document = null;
                    }
                    int i13 = this.O;
                    RadialProgress2 radialProgress2 = this.f46270w;
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
                        int i14 = this.f46267n;
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
