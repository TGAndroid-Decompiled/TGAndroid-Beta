package zh;

import android.view.View;
import bi.va;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.s40;
import org.telegram.ui.tn;
public final class u1 implements qg {
    public final a3 f48908a;

    public u1(a3 a3Var) {
        this.f48908a = a3Var;
    }

    @Override
    public final boolean D0() {
        return true;
    }

    @Override
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        boolean z11;
        a3 a3Var = this.f48908a;
        if (a3Var.G2) {
            AndroidUtilities.runOnUIThread(new va(this, j3, 28), 200L);
            return;
        }
        if (j3 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a3Var.k0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        t0 t0Var;
        boolean z10;
        a3 a3Var = this.f48908a;
        if (a3Var.O1.f49132f) {
            u7 u7Var = a3Var.J0;
            if (u7Var != null && (t0Var = u7Var.A0) != null) {
                TLRPC.GroupCall groupCall = t0Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return a3Var.O3;
        }
        return null;
    }

    @Override
    public final void T(float f7, int i10) {
        f60 f60Var = this.f48908a.J2;
        if (f60Var != null) {
            f60Var.e(f7, i10);
        }
    }

    @Override
    public final int b1() {
        return this.f48908a.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return this.f48908a.O1.f49129a;
    }

    @Override
    public final boolean e1(long j3) {
        boolean z10;
        a3 a3Var = this.f48908a;
        z2 z2Var = a3Var.O1;
        TL_stories.StoryItem storyItem = z2Var.f49129a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) z2Var.f49129a.media).call;
            savedefaultsendas.send_as = MessagesController.getInstance(a3Var.C2).getInputPeer(j3);
            ConnectionsManager.getInstance(a3Var.C2).sendRequest(savedefaultsendas, null);
            t0 t0Var = a3Var.J0.A0;
            if (t0Var != null) {
                TLRPC.Peer peer = MessagesController.getInstance(a3Var.C2).getPeer(j3);
                TLRPC.GroupCall groupCall = t0Var.v;
                if (groupCall != null) {
                    int i10 = groupCall.flags;
                    if (peer != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    groupCall.flags = TLObject.setFlag(i10, 2097152, z10);
                    t0Var.v.default_send_as = peer;
                }
            }
            a3Var.r0(true);
            a3Var.f48157b2.P1(true);
            a3Var.f48157b2.K(true);
            a3Var.f1(false);
        }
        return true;
    }

    @Override
    public final void g2() {
        String str;
        int i10;
        a3 a3Var = this.f48908a;
        if (a3Var.E1) {
            a3.h0(a3Var);
            return;
        }
        if (a3Var.W2 == null) {
            s40 s40Var = new s40(9, a3Var.getContext(), a3Var.B0, false);
            a3Var.W2 = s40Var;
            s40Var.setVisibility(8);
            a3Var.addView(a3Var.W2, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (a3Var.B1 >= 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1));
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
        }
        s40 s40Var2 = a3Var.W2;
        if (a3Var.f48157b2.f20832c1) {
            i10 = R.string.VideoMessagesRestrictedByPrivacy;
        } else {
            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
        }
        s40Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, str)));
        a3Var.W2.f(a3Var.f48157b2.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final boolean h1() {
        f60 f60Var = this.f48908a.J2;
        if (f60Var != null && !f60Var.f22882e0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        a3 a3Var = this.f48908a;
        boolean z11 = false;
        if (a3Var.J2 == null && CameraView.isCameraAllowed()) {
            a3Var.J2 = new f60(a3Var.getContext(), new d2(a3Var), a3Var.B0, false);
            a3Var.addView(a3Var.J2, Math.min(a3Var.indexOfChild(a3Var.f48157b2.getRecordCircle()), a3Var.indexOfChild(a3Var.f48157b2.N1)), w7.a6.e(-1, -1, 51));
        }
        f60 f60Var = a3Var.J2;
        if (f60Var != null) {
            if (i10 == 0) {
                f60Var.l(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    f60Var.d(z11);
                }
            } else {
                f60Var.k(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
        a3 a3Var = this.f48908a;
        if (a3Var.f48166d3 == null) {
            v1 v1Var = new v1(a3Var, a3Var.getContext(), a3Var.B1, a3Var.J0.f48931f, a3Var.B0);
            a3Var.f48166d3 = v1Var;
            v1Var.p(new w1(a3Var));
            a3Var.addView(a3Var.f48166d3, w7.a6.e(-1, -1, 83));
        }
        if (a3Var.f48166d3.getAdapter() != null) {
            a3Var.f48166d3.setDialogId(a3Var.B1);
            if (a3Var.O1.f49132f) {
                fg.l1 adapter = a3Var.f48166d3.getAdapter();
                if (adapter.f8113j0 == 0 && adapter.f8126u0 == 0 && adapter.f8125t0 == 0 && adapter.E0 == 0) {
                    adapter.f8129w0 = null;
                    adapter.F = null;
                    ArrayList arrayList = adapter.A0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = adapter.R;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    adapter.T = null;
                    adapter.U = null;
                    ArrayList arrayList3 = adapter.f8130x;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    ArrayList arrayList4 = adapter.I;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    ArrayList arrayList5 = adapter.J;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList arrayList6 = adapter.M;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    ArrayList arrayList7 = adapter.N;
                    if (arrayList7 != null) {
                        arrayList7.clear();
                    }
                    adapter.l();
                }
            } else {
                fg.l1 adapter2 = a3Var.f48166d3.getAdapter();
                MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1));
                TLRPC.Chat chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1));
                adapter2.getClass();
                adapter2.f8115l0 = chat;
                a3Var.f48166d3.getAdapter().U(charSequence, a3Var.f48157b2.getCursorPosition(), null, false, false);
            }
        }
        a3Var.invalidate();
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void m1() {
        f60 f60Var = this.f48908a.J2;
        if (f60Var != null) {
            f60Var.q();
        }
    }

    @Override
    public final boolean n1() {
        TLRPC.User user;
        a3 a3Var = this.f48908a;
        if (a3Var.B1 < 0 || (user = MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1))) == null || UserObject.isUserSelf(user) || user.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final tn p0() {
        return null;
    }

    @Override
    public final void p1() {
        this.f48908a.O0();
    }

    @Override
    public final void r1() {
        this.f48908a.requestLayout();
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final boolean v1() {
        return false;
    }

    @Override
    public final TLRPC.Peer w() {
        t0 t0Var;
        boolean z10;
        u7 u7Var = this.f48908a.J0;
        if (u7Var != null && (t0Var = u7Var.A0) != null) {
            TLRPC.GroupCall groupCall = t0Var.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return t0Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void y2() {
        this.f48908a.P0();
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void D1() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H0() {
    }

    @Override
    public final void J0() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void Z(boolean z10) {
    }

    @Override
    public final void a1(int i10) {
    }

    @Override
    public final void b2() {
    }

    @Override
    public final void d2(int i10) {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void h2(boolean z10) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void m0() {
    }

    @Override
    public final void m2() {
    }

    @Override
    public final void q1() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void u1(CharSequence charSequence) {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void y1() {
    }

    @Override
    public final void F0(int i10, int i11) {
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }
}
