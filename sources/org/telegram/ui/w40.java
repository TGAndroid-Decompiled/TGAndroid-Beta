package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class w40 extends s4.p {
    public final v50 f44971b;

    public w40(v50 v50Var) {
        this.f44971b = v50Var;
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
        v50 v50Var = this.f44971b;
        p50 p50Var = v50Var.P;
        int i17 = p50Var.f42357w;
        if (i17 >= 0) {
            int i18 = v50Var.f44639h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = p50Var.f42358x;
        if (i19 >= 0) {
            int i20 = v50Var.f44692u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = p50Var.f42359y;
        if (i21 >= 0) {
            int i22 = v50Var.f44696v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = p50Var.K;
        if (i23 >= 0) {
            int i24 = v50Var.f44635g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = p50Var.J;
        if (i25 >= 0) {
            int i26 = v50Var.f44688t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = p50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == v50Var.f44684s3) {
            return true;
        }
        int i28 = v50Var.I0;
        if (i10 == i28 - 1 && i11 == p50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != p50Var.F - 1) {
            if (i11 >= p50Var.G && i11 < p50Var.H && i10 >= (i16 = v50Var.f44674q3) && i10 < v50Var.f44679r3) {
                return ((ChatObject.VideoParticipant) v50Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) v50Var.f44671q0.get(i11 - v50Var.P.G));
            }
            if (i11 >= p50Var.d && i11 < p50Var.e && i10 >= (i15 = v50Var.f44643i3) && i10 < v50Var.f44647j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) v50Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(v50Var.f44607a1.visibleParticipants.get(i11 - v50Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= p50Var.f42353f && i11 < p50Var.h && i10 >= (i14 = v50Var.f44651k3) && i10 < v50Var.f44654l3) {
                return ((Long) v50Var.F0.get(i10 - i14)).equals(v50Var.f44607a1.invitedUsers.get(i11 - v50Var.P.f42353f));
            } else {
                if (i11 >= p50Var.f42354n && i11 < p50Var.f42355r && i10 >= (i13 = v50Var.f44657m3) && i10 < v50Var.f44662n3) {
                    return ((Long) v50Var.G0.get(i10 - i13)).equals(v50Var.f44607a1.shadyJoinParticipants.get(i11 - v50Var.P.f42354n));
                }
                if (i11 >= p50Var.f42356s && i11 < p50Var.v && i10 >= (i12 = v50Var.f44666o3) && i10 < v50Var.f44670p3) {
                    return ((Long) v50Var.H0.get(i10 - i12)).equals(v50Var.f44607a1.shadyLeftParticipants.get(i11 - v50Var.P.f42356s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f44971b.P.F;
    }

    @Override
    public final int e() {
        return this.f44971b.I0;
    }
}
