package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class y40 extends s4.p {
    public final x50 f45847b;

    public y40(x50 x50Var) {
        this.f45847b = x50Var;
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
        x50 x50Var = this.f45847b;
        r50 r50Var = x50Var.P;
        int i17 = r50Var.f42853w;
        if (i17 >= 0) {
            int i18 = x50Var.f45523h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = r50Var.f42854x;
        if (i19 >= 0) {
            int i20 = x50Var.f45576u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = r50Var.f42855y;
        if (i21 >= 0) {
            int i22 = x50Var.f45580v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = r50Var.K;
        if (i23 >= 0) {
            int i24 = x50Var.f45519g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = r50Var.J;
        if (i25 >= 0) {
            int i26 = x50Var.f45572t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = r50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == x50Var.f45568s3) {
            return true;
        }
        int i28 = x50Var.I0;
        if (i10 == i28 - 1 && i11 == r50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != r50Var.F - 1) {
            if (i11 >= r50Var.G && i11 < r50Var.H && i10 >= (i16 = x50Var.f45558q3) && i10 < x50Var.f45563r3) {
                return ((ChatObject.VideoParticipant) x50Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) x50Var.f45555q0.get(i11 - x50Var.P.G));
            }
            if (i11 >= r50Var.d && i11 < r50Var.e && i10 >= (i15 = x50Var.f45527i3) && i10 < x50Var.f45531j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) x50Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(x50Var.f45491a1.visibleParticipants.get(i11 - x50Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= r50Var.f42849f && i11 < r50Var.h && i10 >= (i14 = x50Var.f45535k3) && i10 < x50Var.f45538l3) {
                return ((Long) x50Var.F0.get(i10 - i14)).equals(x50Var.f45491a1.invitedUsers.get(i11 - x50Var.P.f42849f));
            } else {
                if (i11 >= r50Var.f42850n && i11 < r50Var.f42851r && i10 >= (i13 = x50Var.f45541m3) && i10 < x50Var.f45546n3) {
                    return ((Long) x50Var.G0.get(i10 - i13)).equals(x50Var.f45491a1.shadyJoinParticipants.get(i11 - x50Var.P.f42850n));
                }
                if (i11 >= r50Var.f42852s && i11 < r50Var.v && i10 >= (i12 = x50Var.f45550o3) && i10 < x50Var.f45554p3) {
                    return ((Long) x50Var.H0.get(i10 - i12)).equals(x50Var.f45491a1.shadyLeftParticipants.get(i11 - x50Var.P.f42852s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f45847b.P.F;
    }

    @Override
    public final int e() {
        return this.f45847b.I0;
    }
}
