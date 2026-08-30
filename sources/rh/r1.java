package rh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k31;
import org.telegram.ui.xn;
public final class r1 implements Runnable {
    public final int f43722a;
    public final q2 f43723b;

    public r1(q2 q2Var, int i10) {
        this.f43722a = i10;
        this.f43723b = q2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f43722a;
        int i11 = 1;
        q2 q2Var = this.f43723b;
        switch (i10) {
            case 0:
                q2.d(q2Var);
                return;
            case 1:
                if (!q2Var.Z && q2Var.G != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(q2Var.D).getInputUser(q2Var.E);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(q2Var.D).getInputPeer(q2Var.F);
                    tL_messages_prolongWebView.query_id = q2Var.G;
                    tL_messages_prolongWebView.silent = false;
                    if (q2Var.H != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(q2Var.D).createReplyInput(q2Var.H);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (q2Var.I != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(q2Var.D).getInputPeer(q2Var.I);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (q2Var.I != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(q2Var.D).getInputPeer(q2Var.I);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(q2Var.D).sendRequest(tL_messages_prolongWebView, new b2(q2Var, 0));
                    return;
                }
                return;
            case 2:
                q2Var.D();
                return;
            case 3:
                q2Var.v.requestLayout();
                return;
            case 4:
                if (!q2Var.f43708x.z()) {
                    q2Var.q();
                    return;
                }
                return;
            case 5:
                q2Var.f43704u0 = true;
                q2Var.k(true);
                return;
            case 6:
                q2Var.r();
                return;
            case 7:
                Paint paint = q2Var.L;
                h2 h2Var = q2Var.v;
                if (h2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - k7.n.a(h2Var.getSwipeOffsetY() / h2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                q2Var.e.invalidate();
                q2Var.f43708x.n(false, false);
                if (q2Var.f43682c != null) {
                    if (1.0f - (Math.min(h2Var.getTopActionBarOffsetY(), h2Var.getTranslationY() - h2Var.getTopActionBarOffsetY()) / h2Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f10 = i11 * 100.0f;
                    o1.j jVar = q2Var.f43682c;
                    o1.k kVar = jVar.f16198u;
                    if (((float) kVar.f16204i) != f10) {
                        kVar.f16204i = f10;
                        jVar.f();
                    }
                }
                if (q2Var.f43679a0) {
                    int i12 = q2Var.h.bottom;
                } else {
                    Math.max(0.0f, h2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                q2Var.f43708x.n(true, false);
                return;
            case 9:
                Activity activity = q2Var.f43689h0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(xn.R9(q2Var.E));
                }
                q2Var.k(true);
                return;
            case 10:
                i2 i2Var = q2Var.f43708x;
                i2Var.getClass();
                i2Var.M = System.currentTimeMillis();
                i2Var.v("settings_button_pressed", null);
                return;
            case 11:
                o2 o2Var = q2Var.f43710y;
                i2 i2Var2 = q2Var.f43708x;
                if (i2Var2.getWebView() != null) {
                    i2Var2.getWebView().animate().cancel();
                    i2Var2.getWebView().animate().alpha(0.0f).start();
                }
                o2Var.setLoadProgress(0.0f);
                o2Var.setAlpha(1.0f);
                o2Var.setVisibility(0);
                i2Var2.setBotUser(MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E)));
                i2Var2.q(q2Var.D, q2Var.E);
                NotificationCenter.getInstance(i2Var2.J).doOnIdle(new org.telegram.ui.web.u(i2Var2, 2));
                return;
            case 12:
                MediaDataController.getInstance(q2Var.D).installShortcut(q2Var.E, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 13:
                af.g.s(q2Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 14:
                int i13 = q2Var.D;
                Context context = q2Var.getContext();
                qc qcVar = new qc(cb.a(q2Var.getContext()), q2Var.B);
                long j10 = q2Var.E;
                int i14 = k31.v;
                k31.J(i13, context, j10, false, false, new ArrayList(), qcVar, null, new byte[0], null, null);
                return;
            case 15:
                q2.j(q2Var.D, q2Var.E, new r1(q2Var, 16));
                return;
            case 16:
                q2Var.k(false);
                return;
            default:
                q2Var.k(false);
                return;
        }
    }
}
