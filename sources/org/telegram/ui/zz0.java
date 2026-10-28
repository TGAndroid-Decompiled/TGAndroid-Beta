package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zz0 extends s4.p {
    public int f46423b;
    public final SparseIntArray f46424c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f46425f = new ArrayList();
    public int f46426g;
    public int h;
    public final ProfileActivity f46427i;

    public zz0(ProfileActivity profileActivity) {
        this.f46427i = profileActivity;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatParticipant chatParticipant2;
        ProfileActivity profileActivity = this.f46427i;
        if (i11 >= profileActivity.f36154z4 && i11 < profileActivity.A4 && i10 >= this.f46426g && i10 < this.h) {
            ArrayList arrayList = this.f46425f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f46426g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f46426g);
            }
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.W4.get(((Integer) profileActivity.X4.get(i11 - profileActivity.f36154z4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.W4.get(i11 - profileActivity.f36154z4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f46424c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f46427i.N2;
    }

    @Override
    public final int e() {
        return this.f46423b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f46427i;
        g(1, profileActivity.O2, sparseIntArray);
        g(2, profileActivity.P2, sparseIntArray);
        g(3, profileActivity.S2, sparseIntArray);
        g(4, profileActivity.T2, sparseIntArray);
        g(5, profileActivity.V2, sparseIntArray);
        g(6, profileActivity.W2, sparseIntArray);
        g(7, profileActivity.f35975a3, sparseIntArray);
        g(8, profileActivity.X2, sparseIntArray);
        g(9, profileActivity.f35991c3, sparseIntArray);
        g(10, profileActivity.f35983b3, sparseIntArray);
        g(11, profileActivity.Y2, sparseIntArray);
        g(12, profileActivity.Z2, sparseIntArray);
        g(13, profileActivity.f35998d3, sparseIntArray);
        g(14, profileActivity.f36005e3, sparseIntArray);
        g(15, profileActivity.f36013f3, sparseIntArray);
        g(16, profileActivity.f36020g3, sparseIntArray);
        g(17, profileActivity.f35992c4, sparseIntArray);
        g(18, profileActivity.f35999d4, sparseIntArray);
        g(19, profileActivity.f36014f4, sparseIntArray);
        g(20, profileActivity.f36028h4, sparseIntArray);
        g(21, profileActivity.f36021g4, sparseIntArray);
        g(22, profileActivity.f36027h3, sparseIntArray);
        g(23, profileActivity.f36034i3, sparseIntArray);
        g(24, profileActivity.f36054l3, sparseIntArray);
        g(25, profileActivity.f36041j3, sparseIntArray);
        g(26, profileActivity.f36048k3, sparseIntArray);
        g(27, profileActivity.f36059m3, sparseIntArray);
        g(28, profileActivity.f36067n3, sparseIntArray);
        g(29, profileActivity.f36074o3, sparseIntArray);
        g(30, profileActivity.f36081p3, sparseIntArray);
        g(31, profileActivity.f36088q3, sparseIntArray);
        g(32, profileActivity.f36095r3, sparseIntArray);
        g(33, profileActivity.f36102s3, sparseIntArray);
        g(34, profileActivity.f36109t3, sparseIntArray);
        g(35, profileActivity.f36116u3, sparseIntArray);
        g(36, profileActivity.f36123v3, sparseIntArray);
        g(37, profileActivity.f36131w3, sparseIntArray);
        g(38, profileActivity.f36139x3, sparseIntArray);
        g(39, profileActivity.y3, sparseIntArray);
        g(40, profileActivity.f36153z3, sparseIntArray);
        g(41, profileActivity.A3, sparseIntArray);
        g(42, profileActivity.B3, sparseIntArray);
        g(43, profileActivity.C3, sparseIntArray);
        g(44, profileActivity.D3, sparseIntArray);
        g(45, profileActivity.E3, sparseIntArray);
        g(46, profileActivity.F3, sparseIntArray);
        g(47, profileActivity.G3, sparseIntArray);
        g(48, profileActivity.H3, sparseIntArray);
        g(49, profileActivity.I3, sparseIntArray);
        g(50, profileActivity.J3, sparseIntArray);
        g(51, profileActivity.K3, sparseIntArray);
        g(52, profileActivity.L3, sparseIntArray);
        g(53, profileActivity.M3, sparseIntArray);
        g(54, profileActivity.Y3, sparseIntArray);
        g(55, profileActivity.N3, sparseIntArray);
        g(56, profileActivity.R3, sparseIntArray);
        g(57, profileActivity.S3, sparseIntArray);
        g(58, profileActivity.T3, sparseIntArray);
        g(59, profileActivity.f36075o4, sparseIntArray);
        g(60, profileActivity.U3, sparseIntArray);
        g(61, profileActivity.V3, sparseIntArray);
        g(62, profileActivity.W3, sparseIntArray);
        g(63, profileActivity.X3, sparseIntArray);
        g(64, profileActivity.Z3, sparseIntArray);
        g(65, profileActivity.f36124v4, sparseIntArray);
        g(66, profileActivity.f36132w4, sparseIntArray);
        g(67, profileActivity.f36140x4, sparseIntArray);
        g(68, profileActivity.f36147y4, sparseIntArray);
        g(69, profileActivity.B4, sparseIntArray);
        g(70, profileActivity.C4, sparseIntArray);
        g(71, profileActivity.D4, sparseIntArray);
        g(72, profileActivity.E4, sparseIntArray);
        g(73, profileActivity.F4, sparseIntArray);
        g(74, profileActivity.L4, sparseIntArray);
        g(75, profileActivity.M4, sparseIntArray);
        g(76, profileActivity.J4, sparseIntArray);
        g(77, profileActivity.P4, sparseIntArray);
        g(78, profileActivity.Q4, sparseIntArray);
        g(79, profileActivity.f35976a4, sparseIntArray);
        g(80, profileActivity.f35984b4, sparseIntArray);
        g(81, profileActivity.R4, sparseIntArray);
        g(82, profileActivity.S4, sparseIntArray);
        g(83, profileActivity.Q3, sparseIntArray);
        g(84, profileActivity.O3, sparseIntArray);
        g(85, profileActivity.P3, sparseIntArray);
        g(86, profileActivity.U2, sparseIntArray);
        g(87, profileActivity.Q2, sparseIntArray);
        g(88, profileActivity.G4, sparseIntArray);
        g(89, profileActivity.H4, sparseIntArray);
        g(90, profileActivity.I4, sparseIntArray);
        g(91, profileActivity.K4, sparseIntArray);
        g(92, profileActivity.f36035i4, sparseIntArray);
        g(93, profileActivity.f36103s4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f36117u4, sparseIntArray);
        g(98, profileActivity.R2, sparseIntArray);
        g(99, profileActivity.f36082p4, sparseIntArray);
        g(100, profileActivity.f36089q4, sparseIntArray);
        g(101, profileActivity.f36096r4, sparseIntArray);
        g(102, profileActivity.f36042j4, sparseIntArray);
        g(103, profileActivity.f36060m4, sparseIntArray);
        int i13 = 104;
        g(104, profileActivity.f36068n4, sparseIntArray);
        for (int i14 = profileActivity.f36049k4; i14 >= 0 && i14 < profileActivity.l4; i14++) {
            i13++;
            g(i13, i14, sparseIntArray);
        }
    }
}
