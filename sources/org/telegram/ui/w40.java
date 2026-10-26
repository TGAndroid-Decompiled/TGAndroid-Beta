package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class w40 extends s4.p {
    public final v50 f44974b;

    public w40(v50 v50Var) {
        this.f44974b = v50Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        v50 v50Var = this.f44974b;
        p50 p50Var = v50Var.P;
        int i17 = p50Var.f42360w;
        if (i17 >= 0) {
            int i18 = v50Var.f44642h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = p50Var.f42361x;
        if (i19 >= 0) {
            int i20 = v50Var.f44695u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = p50Var.f42362y;
        if (i21 >= 0) {
            int i22 = v50Var.f44699v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = p50Var.K;
        if (i23 >= 0) {
            int i24 = v50Var.f44638g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = p50Var.J;
        if (i25 >= 0) {
            int i26 = v50Var.f44691t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = p50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == v50Var.f44687s3) {
            return true;
        }
        int i28 = v50Var.I0;
        if (i10 == i28 - 1 && i11 == p50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != p50Var.F - 1) {
            if (i11 >= p50Var.G && i11 < p50Var.H && i10 >= (i16 = v50Var.f44677q3) && i10 < v50Var.f44682r3) {
                return ((ChatObject.VideoParticipant) v50Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) v50Var.f44674q0.get(i11 - v50Var.P.G));
            }
            if (i11 >= p50Var.d && i11 < p50Var.e && i10 >= (i15 = v50Var.f44646i3) && i10 < v50Var.f44650j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) v50Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(v50Var.f44610a1.visibleParticipants.get(i11 - v50Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= p50Var.f42356f && i11 < p50Var.h && i10 >= (i14 = v50Var.f44654k3) && i10 < v50Var.f44657l3) {
                return ((Long) v50Var.F0.get(i10 - i14)).equals(v50Var.f44610a1.invitedUsers.get(i11 - v50Var.P.f42356f));
            } else {
                if (i11 >= p50Var.f42357n && i11 < p50Var.f42358r && i10 >= (i13 = v50Var.f44660m3) && i10 < v50Var.f44665n3) {
                    return ((Long) v50Var.G0.get(i10 - i13)).equals(v50Var.f44610a1.shadyJoinParticipants.get(i11 - v50Var.P.f42357n));
                }
                if (i11 >= p50Var.f42359s && i11 < p50Var.v && i10 >= (i12 = v50Var.f44669o3) && i10 < v50Var.f44673p3) {
                    return ((Long) v50Var.H0.get(i10 - i12)).equals(v50Var.f44610a1.shadyLeftParticipants.get(i11 - v50Var.P.f42359s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f44974b.P.F;
    }

    @Override
    public final int e() {
        return this.f44974b.I0;
    }
}
