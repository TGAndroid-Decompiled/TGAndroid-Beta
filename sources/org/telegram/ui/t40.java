package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class t40 extends f2.q {

    public final s50 f42779b;

    public t40(s50 s50Var) {
        this.f42779b = s50Var;
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
        s50 s50Var = this.f42779b;
        m50 m50Var = s50Var.L;
        int i17 = m50Var.f40366w;
        if (i17 >= 0) {
            int i18 = s50Var.f42425d3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = m50Var.f40367x;
        if (i19 >= 0) {
            int i20 = s50Var.f42478q3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = m50Var.f40368y;
        if (i21 >= 0) {
            int i22 = s50Var.f42483r3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = m50Var.G;
        if (i23 >= 0) {
            int i24 = s50Var.f42421c3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = m50Var.F;
        if (i25 >= 0) {
            int i26 = s50Var.f42474p3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = m50Var.E;
        if (i27 >= 0 && i27 == i11 && i10 == s50Var.f42470o3) {
            return true;
        }
        int i28 = s50Var.E0;
        if (i10 == i28 - 1 && i11 == m50Var.B - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != m50Var.B - 1) {
            if (i11 >= m50Var.C && i11 < m50Var.D && i10 >= (i16 = s50Var.f42461m3) && i10 < s50Var.f42466n3) {
                return ((ChatObject.VideoParticipant) s50Var.A0.get(i10 - i16)).equals((ChatObject.VideoParticipant) s50Var.m0.get(i11 - s50Var.L.C));
            }
            if (i11 >= m50Var.d && i11 < m50Var.f40361e && i10 >= (i15 = s50Var.f42430e3) && i10 < s50Var.f42435f3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) s50Var.f42516z0.get(i10 - i15);
                return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(s50Var.W0.visibleParticipants.get(i11 - s50Var.L.d).peer) && (i10 == i11 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
            }
            if (i11 >= m50Var.f40362f && i11 < m50Var.h && i10 >= (i14 = s50Var.f42439g3) && i10 < s50Var.f42443h3) {
                return ((Long) s50Var.B0.get(i10 - i14)).equals(s50Var.W0.invitedUsers.get(i11 - s50Var.L.f40362f));
            }
            if (i11 >= m50Var.f40363n && i11 < m50Var.f40364r && i10 >= (i13 = s50Var.f42447i3) && i10 < s50Var.f42451j3) {
                return ((Long) s50Var.C0.get(i10 - i13)).equals(s50Var.W0.shadyJoinParticipants.get(i11 - s50Var.L.f40363n));
            }
            if (i11 >= m50Var.f40365s && i11 < m50Var.v && i10 >= (i12 = s50Var.f42455k3) && i10 < s50Var.f42458l3) {
                return ((Long) s50Var.D0.get(i10 - i12)).equals(s50Var.W0.shadyLeftParticipants.get(i11 - s50Var.L.f40365s));
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f42779b.L.B;
    }

    @Override
    public final int e() {
        return this.f42779b.E0;
    }
}
