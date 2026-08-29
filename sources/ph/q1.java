package ph;

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
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
import org.telegram.ui.y21;
public final class q1 implements Runnable {
    public final int f46002a;
    public final p2 f46003b;

    public q1(p2 p2Var, int i10) {
        this.f46002a = i10;
        this.f46003b = p2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f46002a;
        int i11 = 1;
        p2 p2Var = this.f46003b;
        switch (i10) {
            case 0:
                p2.d(p2Var);
                return;
            case 1:
                if (!p2Var.Y && p2Var.F != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(p2Var.C).getInputUser(p2Var.D);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(p2Var.C).getInputPeer(p2Var.E);
                    tL_messages_prolongWebView.query_id = p2Var.F;
                    tL_messages_prolongWebView.silent = false;
                    if (p2Var.G != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(p2Var.C).createReplyInput(p2Var.G);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (p2Var.H != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(p2Var.C).getInputPeer(p2Var.H);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (p2Var.H != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(p2Var.C).getInputPeer(p2Var.H);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(p2Var.C).sendRequest(tL_messages_prolongWebView, new a2(p2Var, 0));
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
                if (!p2Var.f45987x.z()) {
                    p2Var.q();
                    return;
                }
                return;
            case 5:
                p2Var.f45982t0 = true;
                p2Var.k(true);
                return;
            case 6:
                p2Var.r();
                return;
            case 7:
                Paint paint = p2Var.K;
                g2 g2Var = p2Var.v;
                if (g2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - i7.w.a(g2Var.getSwipeOffsetY() / g2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                p2Var.f45963e.invalidate();
                p2Var.f45987x.n(false, false);
                if (p2Var.f45960c != null) {
                    if (1.0f - (Math.min(g2Var.getTopActionBarOffsetY(), g2Var.getTranslationY() - g2Var.getTopActionBarOffsetY()) / g2Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f9 = i11 * 100.0f;
                    o1.k kVar = p2Var.f45960c;
                    o1.l lVar = kVar.f19045u;
                    if (((float) lVar.f19052i) != f9) {
                        lVar.f19052i = f9;
                        kVar.f();
                    }
                }
                if (p2Var.Z) {
                    int i12 = p2Var.h.bottom;
                } else {
                    Math.max(0.0f, g2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                p2Var.f45987x.n(true, false);
                return;
            case 9:
                Activity activity = p2Var.f45967g0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).p0(tn.R9(p2Var.D));
                }
                p2Var.k(true);
                return;
            case 10:
                h2 h2Var = p2Var.f45987x;
                h2Var.getClass();
                h2Var.L = System.currentTimeMillis();
                h2Var.v("settings_button_pressed", null);
                return;
            case 11:
                n2 n2Var = p2Var.f45989y;
                h2 h2Var2 = p2Var.f45987x;
                if (h2Var2.getWebView() != null) {
                    h2Var2.getWebView().animate().cancel();
                    h2Var2.getWebView().animate().alpha(0.0f).start();
                }
                n2Var.setLoadProgress(0.0f);
                n2Var.setAlpha(1.0f);
                n2Var.setVisibility(0);
                h2Var2.setBotUser(MessagesController.getInstance(p2Var.C).getUser(Long.valueOf(p2Var.D)));
                h2Var2.q(p2Var.C, p2Var.D);
                NotificationCenter.getInstance(h2Var2.I).doOnIdle(new org.telegram.ui.web.u(h2Var2, 2));
                return;
            case 12:
                MediaDataController.getInstance(p2Var.C).installShortcut(p2Var.D, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            case 13:
                ye.d.s(p2Var.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            case 14:
                int i13 = p2Var.C;
                Context context = p2Var.getContext();
                tc tcVar = new tc(hb.a(p2Var.getContext()), p2Var.A);
                long j10 = p2Var.D;
                int i14 = y21.v;
                y21.J(i13, context, j10, false, false, new ArrayList(), tcVar, null, new byte[0], null, null);
                return;
            case 15:
                p2.j(p2Var.C, p2Var.D, new q1(p2Var, 16));
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
