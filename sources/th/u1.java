package th;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.sf;
import org.telegram.ui.kn;
public final class u1 implements sf {
    public final z2 f49505a;

    public u1(z2 z2Var) {
        this.f49505a = z2Var;
    }

    @Override
    public final void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        boolean z11;
        z2 z2Var = this.f49505a;
        if (z2Var.f49745p2) {
            org.telegram.messenger.i0.h3(new bi.e(this, j10, 24), 200L);
            return;
        }
        if (j10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        z2Var.i0(z11);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers F() {
        s0 s0Var;
        boolean z10;
        z2 z2Var = this.f49505a;
        if (z2Var.f49776x1.f49664f) {
            o7 o7Var = z2Var.f49755s0;
            if (o7Var != null && (s0Var = o7Var.A0) != null) {
                TLRPC.GroupCall groupCall = s0Var.f49426w;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return null;
                }
            }
            return z2Var.f49778x3;
        }
        return null;
    }

    @Override
    public final int H0() {
        return this.f49505a.getHeight();
    }

    @Override
    public final void I(float f7, int i10) {
        e50 e50Var = this.f49505a.f49757s2;
        if (e50Var != null) {
            e50Var.b(f7, i10);
        }
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return this.f49505a.f49776x1.f49661a;
    }

    @Override
    public final boolean R0(long j10) {
        z2 z2Var = this.f49505a;
        y2 y2Var = z2Var.f49776x1;
        TL_stories.StoryItem storyItem = y2Var.f49661a;
        if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
            TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
            savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) y2Var.f49661a.media).call;
            savedefaultsendas.send_as = vp.r1(z2Var.f49730l2).i1(j10);
            ConnectionsManager.getInstance(z2Var.f49730l2).sendRequest(savedefaultsendas, null);
            s0 s0Var = z2Var.f49755s0.A0;
            if (s0Var != null) {
                TLRPC.Peer y12 = vp.r1(z2Var.f49730l2).y1(j10);
                TLRPC.GroupCall groupCall = s0Var.f49426w;
                if (groupCall != null) {
                    groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, true);
                    s0Var.f49426w.default_send_as = y12;
                }
            }
            z2Var.p0(true);
            z2Var.K1.O1(true);
            z2Var.K1.F(true);
            z2Var.d1(false);
        }
        return true;
    }

    @Override
    public final boolean T0() {
        e50 e50Var = this.f49505a.f49757s2;
        if (e50Var != null && !e50Var.f25663i0) {
            return true;
        }
        return false;
    }

    @Override
    public final void T1() {
        String str;
        int i10;
        z2 z2Var = this.f49505a;
        if (z2Var.f49736n1) {
            z2.f0(z2Var);
            return;
        }
        if (z2Var.F2 == null) {
            q30 q30Var = new q30(9, z2Var.getContext(), z2Var.f49725k0, false);
            z2Var.F2 = q30Var;
            q30Var.setVisibility(8);
            z2Var.addView(z2Var.F2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        if (z2Var.f49726k1 >= 0) {
            str = h20.j(vp.r1(z2Var.f49730l2).Z1(Long.valueOf(z2Var.f49726k1)), true);
        } else {
            TLRPC.Chat L0 = vp.r1(z2Var.f49730l2).L0(Long.valueOf(-z2Var.f49726k1));
            if (L0 != null) {
                str = L0.title;
            } else {
                str = "";
            }
        }
        q30 q30Var2 = z2Var.F2;
        if (z2Var.K1.f23688c1) {
            i10 = 2131743620;
        } else {
            i10 = 2131743546;
        }
        q30Var2.setText(org.telegram.messenger.i0.W2(cd.a0(null, null, i10, str)));
        z2Var.F2.f(z2Var.K1.getAudioVideoButtonContainer(), true);
    }

    @Override
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        z2 z2Var = this.f49505a;
        if (z2Var.M2 == null) {
            v1 v1Var = new v1(z2Var, z2Var.getContext(), z2Var.f49726k1, z2Var.f49755s0.f49303f, z2Var.f49725k0);
            z2Var.M2 = v1Var;
            v1Var.p(new w1(z2Var));
            z2Var.addView(z2Var.M2, w7.b6.e(-1, -1, 83));
        }
        if (z2Var.M2.getAdapter() != null) {
            z2Var.M2.setDialogId(z2Var.f49726k1);
            if (z2Var.f49776x1.f49664f) {
                zf.x0 adapter = z2Var.M2.getAdapter();
                if (adapter.f55656j0 == 0 && adapter.f55669u0 == 0 && adapter.f55668t0 == 0 && adapter.E0 == 0) {
                    adapter.f55672w0 = null;
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
                    ArrayList arrayList3 = adapter.f55675y;
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
                    adapter.f();
                }
            } else {
                zf.x0 adapter2 = z2Var.M2.getAdapter();
                vp.r1(z2Var.f49730l2).Z1(Long.valueOf(z2Var.f49726k1));
                TLRPC.Chat L0 = vp.r1(z2Var.f49730l2).L0(Long.valueOf(-z2Var.f49726k1));
                adapter2.getClass();
                adapter2.f55658l0 = L0;
                z2Var.M2.getAdapter().U(charSequence, z2Var.K1.getCursorPosition(), null, false, false);
            }
        }
        z2Var.invalidate();
    }

    @Override
    public final void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        z2 z2Var = this.f49505a;
        boolean z11 = false;
        if (z2Var.f49757s2 == null && CameraView.isCameraAllowed()) {
            z2Var.f49757s2 = new e50(z2Var.getContext(), new c2(z2Var), z2Var.f49725k0, false);
            z2Var.addView(z2Var.f49757s2, Math.min(z2Var.indexOfChild(z2Var.K1.getRecordCircle()), z2Var.indexOfChild(z2Var.K1.O1)), w7.b6.e(-1, -1, 51));
        }
        e50 e50Var = z2Var.f49757s2;
        if (e50Var != null) {
            if (i10 == 0) {
                e50Var.i(false);
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    e50Var.a(z11);
                }
            } else {
                e50Var.g(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final void X0() {
        e50 e50Var = this.f49505a.f49757s2;
        if (e50Var != null) {
            e50Var.j();
        }
    }

    @Override
    public final boolean Y0() {
        TLRPC.User Z1;
        z2 z2Var = this.f49505a;
        if (z2Var.f49726k1 < 0 || (Z1 = vp.r1(z2Var.f49730l2).Z1(Long.valueOf(z2Var.f49726k1))) == null || h20.B(Z1) || Z1.bot) {
            return false;
        }
        return true;
    }

    @Override
    public final void a1() {
        this.f49505a.M0();
    }

    @Override
    public final kn b0() {
        return null;
    }

    @Override
    public final void d1() {
        this.f49505a.requestLayout();
    }

    @Override
    public final boolean h1() {
        return false;
    }

    @Override
    public final void h2() {
        this.f49505a.N0();
    }

    @Override
    public final boolean k0() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final int r() {
        return 0;
    }

    @Override
    public final TLRPC.Peer u() {
        s0 s0Var;
        boolean z10;
        o7 o7Var = this.f49505a.f49755s0;
        if (o7Var != null && (s0Var = o7Var.A0) != null) {
            TLRPC.GroupCall groupCall = s0Var.f49426w;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (!z10) {
                return s0Var.i();
            }
            return null;
        }
        return null;
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void G0(int i10) {
    }

    @Override
    public final void Q1(int i10) {
    }

    @Override
    public final void U1(boolean z10) {
    }

    @Override
    public final void V(boolean z10) {
    }

    @Override
    public final void g1(CharSequence charSequence) {
    }

    @Override
    public final void y(float f7) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void O1() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y1() {
    }

    @Override
    public final void b1() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void j0() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void n0() {
    }

    @Override
    public final void o1() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }
}
