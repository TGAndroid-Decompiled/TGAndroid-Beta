package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class t40 extends s4.o {
    public final s50 f41577b;

    public t40(s50 s50Var) {
        this.f41577b = s50Var;
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
        s50 s50Var = this.f41577b;
        m50 m50Var = s50Var.P;
        int i17 = m50Var.f38988w;
        if (i17 >= 0) {
            int i18 = s50Var.f40928h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = m50Var.f38989x;
        if (i19 >= 0) {
            int i20 = s50Var.f40981u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = m50Var.f38990y;
        if (i21 >= 0) {
            int i22 = s50Var.f40985v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = m50Var.K;
        if (i23 >= 0) {
            int i24 = s50Var.f40924g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = m50Var.J;
        if (i25 >= 0) {
            int i26 = s50Var.f40977t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = m50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == s50Var.f40973s3) {
            return true;
        }
        int i28 = s50Var.I0;
        if (i10 == i28 - 1 && i11 == m50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != m50Var.F - 1) {
            if (i11 >= m50Var.G && i11 < m50Var.H && i10 >= (i16 = s50Var.f40963q3) && i10 < s50Var.f40968r3) {
                return ((ChatObject.VideoParticipant) s50Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) s50Var.f40960q0.get(i11 - s50Var.P.G));
            }
            if (i11 >= m50Var.d && i11 < m50Var.e && i10 >= (i15 = s50Var.f40932i3) && i10 < s50Var.f40936j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) s50Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(s50Var.f40896a1.visibleParticipants.get(i11 - s50Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= m50Var.f38984f && i11 < m50Var.h && i10 >= (i14 = s50Var.f40940k3) && i10 < s50Var.f40943l3) {
                return ((Long) s50Var.F0.get(i10 - i14)).equals(s50Var.f40896a1.invitedUsers.get(i11 - s50Var.P.f38984f));
            } else {
                if (i11 >= m50Var.f38985n && i11 < m50Var.f38986r && i10 >= (i13 = s50Var.f40946m3) && i10 < s50Var.f40951n3) {
                    return ((Long) s50Var.G0.get(i10 - i13)).equals(s50Var.f40896a1.shadyJoinParticipants.get(i11 - s50Var.P.f38985n));
                }
                if (i11 >= m50Var.f38987s && i11 < m50Var.v && i10 >= (i12 = s50Var.f40955o3) && i10 < s50Var.f40959p3) {
                    return ((Long) s50Var.H0.get(i10 - i12)).equals(s50Var.f40896a1.shadyLeftParticipants.get(i11 - s50Var.P.f38987s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f41577b.P.F;
    }

    @Override
    public final int e() {
        return this.f41577b.I0;
    }
}
