package xh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.rz;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ra;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b01;
import org.telegram.ui.un;
public final class q1 implements Runnable {
    public final int f53998a;
    public final m2 f53999b;

    public q1(m2 m2Var, int i10) {
        this.f53998a = i10;
        this.f53999b = m2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f53998a;
        int i11 = 1;
        m2 m2Var = this.f53999b;
        switch (i10) {
            case 0:
                m2.f(m2Var);
                return;
            case 1:
                if (!m2Var.f53897d0 && m2Var.K != 0) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = wp.r1(m2Var.H).n1(m2Var.I);
                    tL_messages_prolongWebView.peer = wp.r1(m2Var.H).i1(m2Var.J);
                    tL_messages_prolongWebView.query_id = m2Var.K;
                    tL_messages_prolongWebView.silent = false;
                    if (m2Var.L != 0) {
                        rz.C(m2Var.H);
                        int i12 = m2Var.L;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i12;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (m2Var.M != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = wp.r1(m2Var.H).i1(m2Var.M);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (m2Var.M != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = wp.r1(m2Var.H).i1(m2Var.M);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    ConnectionsManager.getInstance(m2Var.H).sendRequest(tL_messages_prolongWebView, new x1(m2Var, 0));
                    return;
                }
                return;
            case 2:
                m2Var.I();
                return;
            case 3:
                m2Var.f53921x.requestLayout();
                return;
            case 4:
                if (!m2Var.D.C()) {
                    m2Var.v();
                    return;
                }
                return;
            case 5:
                m2Var.f53924y0 = true;
                m2Var.o(true);
                return;
            case 6:
                m2Var.w();
                return;
            case 7:
                Paint paint = m2Var.P;
                d2 d2Var = m2Var.f53921x;
                if (d2Var.getSwipeOffsetY() > 0.0f) {
                    paint.setAlpha((int) ((1.0f - w7.u.a(d2Var.getSwipeOffsetY() / d2Var.getHeight(), 0.0f, 1.0f)) * 64.0f));
                } else {
                    paint.setAlpha(64);
                }
                m2Var.f53899f.invalidate();
                m2Var.D.n(false, false);
                if (m2Var.d != null) {
                    if (1.0f - (Math.min(d2Var.getTopActionBarOffsetY(), d2Var.getTranslationY() - d2Var.getTopActionBarOffsetY()) / d2Var.getTopActionBarOffsetY()) <= 0.5f) {
                        i11 = 0;
                    }
                    float f7 = i11 * 100.0f;
                    o1.j jVar = m2Var.d;
                    o1.k kVar = jVar.f13958m;
                    if (((float) kVar.f13965i) != f7) {
                        kVar.f13965i = f7;
                        jVar.h();
                    }
                }
                if (m2Var.f53898e0) {
                    int i13 = m2Var.f53907n.bottom;
                } else {
                    Math.max(0.0f, d2Var.getSwipeOffsetY());
                }
                System.currentTimeMillis();
                return;
            case 8:
                m2Var.D.n(true, false);
                return;
            case 9:
                Activity activity = m2Var.f53906l0;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).t0(un.ma(m2Var.I));
                }
                m2Var.o(true);
                return;
            case 10:
                e2 e2Var = m2Var.D;
                e2Var.getClass();
                e2Var.P = System.currentTimeMillis();
                e2Var.x("settings_button_pressed", null);
                return;
            case 11:
                vi.b0(m2Var.H).y0(m2Var.I, vi.f18630c2, null);
                return;
            case 12:
                gf.f.r(m2Var.getContext(), dd.L0(2131752893, null));
                return;
            case 13:
                int i14 = m2Var.H;
                Context context = m2Var.getContext();
                cc ccVar = new cc(ra.a(m2Var.getContext()), m2Var.F);
                long j10 = m2Var.I;
                int i15 = b01.f35885s1;
                b01.J0(i14, context, j10, false, false, new ArrayList(), ccVar, null, new byte[0], null, null);
                return;
            case 14:
                m2.n(m2Var.H, m2Var.I, new q1(m2Var, 15));
                return;
            case 15:
                m2Var.o(false);
                return;
            default:
                m2Var.o(false);
                return;
        }
    }
}
