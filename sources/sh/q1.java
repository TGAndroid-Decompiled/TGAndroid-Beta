package sh;

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
import org.telegram.ui.m31;
import org.telegram.ui.xn;
public final class q1 implements Runnable {
    public final int f47627a;
    public final p2 f47628b;

    public q1(p2 p2Var, int i10) {
        this.f47627a = i10;
        this.f47628b = p2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f47627a;
        int i11 = 1;
        p2 p2Var = this.f47628b;
        switch (i10) {
            case 0:
                p2.d(p2Var);
                return;
            case 1:
                if (!p2Var.Z && p2Var.G != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(p2Var.D).getInputUser(p2Var.E);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(p2Var.D).getInputPeer(p2Var.F);
                    tL_messages_prolongWebView.query_id = p2Var.G;
                    tL_messages_prolongWebView.silent = false;
                    if (p2Var.H != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(p2Var.D).createReplyInput(p2Var.H);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (p2Var.I != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(p2Var.D).getInputPeer(p2Var.I);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (p2Var.I != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(p2Var.D).getInputPeer(p2Var.I);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(p2Var.D).sendRequest(tL_messages_prolongWebView, new a2(p2Var, 0));
                    return;
                }
                return;
            case 2:
                p2Var.D();
                return;
            case 3:
                p2Var.v.requestLayout();
                return;
            case 4:
                if (!p2Var.f47612x.z()) {
                    p2Var.q();
                    return;
                }
                return;
            case 5:
                p2Var.f47608u0 = true;
                p2Var.k(true);
                return;
            case 6:
                p2Var.r();
                return;
            case 7:
                Paint paint = p2Var.L;
                g2 g2Var = p2Var.v;
                if (g2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - k7.o.a(g2Var.getSwipeOffsetY() / g2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                p2Var.f47588e.invalidate();
                p2Var.f47612x.n(false, false);
                if (p2Var.f47585c != null) {
                    if (1.0f - (Math.min(g2Var.getTopActionBarOffsetY(), g2Var.getTranslationY() - g2Var.getTopActionBarOffsetY()) / g2Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f10 = i11 * 100.0f;
                    o1.j jVar = p2Var.f47585c;
                    o1.k kVar = jVar.f16336u;
                    if (((float) kVar.f16343i) != f10) {
                        kVar.f16343i = f10;
                        jVar.f();
                    }
                }
                if (p2Var.f47582a0) {
                    int i12 = p2Var.h.bottom;
                } else {
                    Math.max(0.0f, g2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                p2Var.f47612x.n(true, false);
                return;
            case 9:
                Activity activity = p2Var.f47593h0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(xn.R9(p2Var.E));
                }
                p2Var.k(true);
                return;
            case 10:
                h2 h2Var = p2Var.f47612x;
                h2Var.getClass();
                h2Var.M = System.currentTimeMillis();
                h2Var.v("settings_button_pressed", null);
                return;
            case 11:
                n2 n2Var = p2Var.f47614y;
                h2 h2Var2 = p2Var.f47612x;
                if (h2Var2.getWebView() != null) {
                    h2Var2.getWebView().animate().cancel();
                    h2Var2.getWebView().animate().alpha(0.0f).start();
                }
                n2Var.setLoadProgress(0.0f);
                n2Var.setAlpha(1.0f);
                n2Var.setVisibility(0);
                h2Var2.setBotUser(MessagesController.getInstance(p2Var.D).getUser(Long.valueOf(p2Var.E)));
                h2Var2.q(p2Var.D, p2Var.E);
                NotificationCenter.getInstance(h2Var2.J).doOnIdle(new org.telegram.ui.web.u(h2Var2, 2));
                return;
            case 12:
                MediaDataController.getInstance(p2Var.D).installShortcut(p2Var.E, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 13:
                af.g.s(p2Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 14:
                int i13 = p2Var.D;
                Context context = p2Var.getContext();
                qc qcVar = new qc(cb.a(p2Var.getContext()), p2Var.B);
                long j10 = p2Var.E;
                int i14 = m31.v;
                m31.J(i13, context, j10, false, false, new ArrayList(), qcVar, null, new byte[0], null, null);
                return;
            case 15:
                p2.j(p2Var.D, p2Var.E, new q1(p2Var, 16));
                return;
            case 16:
                p2Var.k(false);
                return;
            default:
                p2Var.k(false);
                return;
        }
    }
}
