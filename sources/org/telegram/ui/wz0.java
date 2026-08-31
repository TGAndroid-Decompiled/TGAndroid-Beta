package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wz0 extends f2.q {
    public int f42912b;
    public final SparseIntArray f42913c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f42914e = new ArrayList();
    public final ArrayList f42915f = new ArrayList();
    public int f42916g;
    public int h;
    public final ProfileActivity f42917i;

    public wz0(ProfileActivity profileActivity) {
        this.f42917i = profileActivity;
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
        ProfileActivity profileActivity = this.f42917i;
        if (i11 >= profileActivity.f34685r4 && i11 < profileActivity.f34693s4 && i10 >= this.f42916g && i10 < this.h) {
            ArrayList arrayList = this.f42915f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f42914e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f42916g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f42916g);
            }
            if (!profileActivity.f34736z2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.N4.get(((Integer) profileActivity.O4.get(i11 - profileActivity.f34685r4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.N4.get(i11 - profileActivity.f34685r4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f42913c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f42917i.K2;
    }

    @Override
    public final int e() {
        return this.f42912b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f42917i;
        g(1, profileActivity.L2, sparseIntArray);
        g(2, profileActivity.M2, sparseIntArray);
        g(3, profileActivity.P2, sparseIntArray);
        g(4, profileActivity.Q2, sparseIntArray);
        g(5, profileActivity.S2, sparseIntArray);
        g(6, profileActivity.T2, sparseIntArray);
        g(7, profileActivity.X2, sparseIntArray);
        g(8, profileActivity.U2, sparseIntArray);
        g(9, profileActivity.Z2, sparseIntArray);
        g(10, profileActivity.Y2, sparseIntArray);
        g(11, profileActivity.V2, sparseIntArray);
        g(12, profileActivity.W2, sparseIntArray);
        g(13, profileActivity.f34563a3, sparseIntArray);
        g(14, profileActivity.f34571b3, sparseIntArray);
        g(15, profileActivity.c3, sparseIntArray);
        g(16, profileActivity.f34585d3, sparseIntArray);
        g(17, profileActivity.Z3, sparseIntArray);
        g(18, profileActivity.f34564a4, sparseIntArray);
        g(19, profileActivity.f34579c4, sparseIntArray);
        g(20, profileActivity.f34594e4, sparseIntArray);
        g(21, profileActivity.f34586d4, sparseIntArray);
        g(22, profileActivity.f34593e3, sparseIntArray);
        g(23, profileActivity.f34600f3, sparseIntArray);
        g(24, profileActivity.f34621i3, sparseIntArray);
        g(25, profileActivity.f34607g3, sparseIntArray);
        g(26, profileActivity.f34614h3, sparseIntArray);
        g(27, profileActivity.f34628j3, sparseIntArray);
        g(28, profileActivity.f34635k3, sparseIntArray);
        g(29, profileActivity.f34641l3, sparseIntArray);
        g(30, profileActivity.f34647m3, sparseIntArray);
        g(31, profileActivity.f34655n3, sparseIntArray);
        g(32, profileActivity.f34662o3, sparseIntArray);
        g(33, profileActivity.f34669p3, sparseIntArray);
        g(34, profileActivity.f34676q3, sparseIntArray);
        g(35, profileActivity.f34684r3, sparseIntArray);
        g(36, profileActivity.f34692s3, sparseIntArray);
        g(37, profileActivity.f34698t3, sparseIntArray);
        g(38, profileActivity.f34704u3, sparseIntArray);
        g(39, profileActivity.f34710v3, sparseIntArray);
        g(40, profileActivity.f34717w3, sparseIntArray);
        g(41, profileActivity.f34724x3, sparseIntArray);
        g(42, profileActivity.f34731y3, sparseIntArray);
        g(43, profileActivity.f34737z3, sparseIntArray);
        g(44, profileActivity.A3, sparseIntArray);
        g(45, profileActivity.B3, sparseIntArray);
        g(46, profileActivity.C3, sparseIntArray);
        g(47, profileActivity.D3, sparseIntArray);
        g(48, profileActivity.E3, sparseIntArray);
        g(49, profileActivity.F3, sparseIntArray);
        g(50, profileActivity.G3, sparseIntArray);
        g(51, profileActivity.H3, sparseIntArray);
        g(52, profileActivity.I3, sparseIntArray);
        g(53, profileActivity.J3, sparseIntArray);
        g(54, profileActivity.V3, sparseIntArray);
        g(55, profileActivity.K3, sparseIntArray);
        g(56, profileActivity.O3, sparseIntArray);
        g(57, profileActivity.P3, sparseIntArray);
        g(58, profileActivity.Q3, sparseIntArray);
        g(59, profileActivity.f34608g4, sparseIntArray);
        g(60, profileActivity.R3, sparseIntArray);
        g(61, profileActivity.S3, sparseIntArray);
        g(62, profileActivity.T3, sparseIntArray);
        g(63, profileActivity.U3, sparseIntArray);
        g(64, profileActivity.W3, sparseIntArray);
        g(65, profileActivity.f34656n4, sparseIntArray);
        g(66, profileActivity.f34663o4, sparseIntArray);
        g(67, profileActivity.f34670p4, sparseIntArray);
        g(68, profileActivity.f34677q4, sparseIntArray);
        g(69, profileActivity.f34699t4, sparseIntArray);
        g(70, profileActivity.f34705u4, sparseIntArray);
        g(71, profileActivity.f34711v4, sparseIntArray);
        g(72, profileActivity.f34718w4, sparseIntArray);
        g(73, profileActivity.f34725x4, sparseIntArray);
        g(74, profileActivity.D4, sparseIntArray);
        g(75, profileActivity.E4, sparseIntArray);
        g(76, profileActivity.B4, sparseIntArray);
        g(77, profileActivity.G4, sparseIntArray);
        g(78, profileActivity.H4, sparseIntArray);
        g(79, profileActivity.X3, sparseIntArray);
        g(80, profileActivity.Y3, sparseIntArray);
        g(81, profileActivity.I4, sparseIntArray);
        g(82, profileActivity.J4, sparseIntArray);
        g(83, profileActivity.N3, sparseIntArray);
        g(84, profileActivity.L3, sparseIntArray);
        g(85, profileActivity.M3, sparseIntArray);
        g(86, profileActivity.R2, sparseIntArray);
        g(87, profileActivity.N2, sparseIntArray);
        g(88, profileActivity.f34732y4, sparseIntArray);
        g(89, profileActivity.z4, sparseIntArray);
        g(90, profileActivity.A4, sparseIntArray);
        g(91, profileActivity.C4, sparseIntArray);
        g(92, profileActivity.f34601f4, sparseIntArray);
        g(93, profileActivity.f34636k4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f34648m4, sparseIntArray);
        g(98, profileActivity.O2, sparseIntArray);
        g(99, profileActivity.f34615h4, sparseIntArray);
        g(100, profileActivity.f34622i4, sparseIntArray);
        g(101, profileActivity.f34629j4, sparseIntArray);
    }
}
