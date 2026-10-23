package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class u40 extends s4.o {
    public final u50 f42164b;

    public u40(u50 u50Var) {
        this.f42164b = u50Var;
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
        u50 u50Var = this.f42164b;
        o50 o50Var = u50Var.P;
        int i17 = o50Var.f40073w;
        if (i17 >= 0) {
            int i18 = u50Var.f42203h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = o50Var.f40074x;
        if (i19 >= 0) {
            int i20 = u50Var.f42256u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = o50Var.f40075y;
        if (i21 >= 0) {
            int i22 = u50Var.f42260v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = o50Var.K;
        if (i23 >= 0) {
            int i24 = u50Var.f42199g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = o50Var.J;
        if (i25 >= 0) {
            int i26 = u50Var.f42252t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = o50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == u50Var.f42248s3) {
            return true;
        }
        int i28 = u50Var.I0;
        if (i10 == i28 - 1 && i11 == o50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != o50Var.F - 1) {
            if (i11 >= o50Var.G && i11 < o50Var.H && i10 >= (i16 = u50Var.f42238q3) && i10 < u50Var.f42243r3) {
                return ((ChatObject.VideoParticipant) u50Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) u50Var.f42235q0.get(i11 - u50Var.P.G));
            }
            if (i11 >= o50Var.d && i11 < o50Var.e && i10 >= (i15 = u50Var.f42207i3) && i10 < u50Var.f42211j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u50Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(u50Var.f42171a1.visibleParticipants.get(i11 - u50Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= o50Var.f40069f && i11 < o50Var.h && i10 >= (i14 = u50Var.f42215k3) && i10 < u50Var.f42218l3) {
                return ((Long) u50Var.F0.get(i10 - i14)).equals(u50Var.f42171a1.invitedUsers.get(i11 - u50Var.P.f40069f));
            } else {
                if (i11 >= o50Var.f40070n && i11 < o50Var.f40071r && i10 >= (i13 = u50Var.f42221m3) && i10 < u50Var.f42226n3) {
                    return ((Long) u50Var.G0.get(i10 - i13)).equals(u50Var.f42171a1.shadyJoinParticipants.get(i11 - u50Var.P.f40070n));
                }
                if (i11 >= o50Var.f40072s && i11 < o50Var.v && i10 >= (i12 = u50Var.f42230o3) && i10 < u50Var.f42234p3) {
                    return ((Long) u50Var.H0.get(i10 - i12)).equals(u50Var.f42171a1.shadyLeftParticipants.get(i11 - u50Var.P.f40072s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f42164b.P.F;
    }

    @Override
    public final int e() {
        return this.f42164b.I0;
    }
}
