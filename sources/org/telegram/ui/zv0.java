package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zv0 extends v4.o {
    public int f52679b;
    public final SparseIntArray f52680c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f52681e = new ArrayList();
    public final ArrayList f52682f = new ArrayList();
    public int f52683g;
    public int h;
    public final ProfileActivity f52684i;

    public zv0(ProfileActivity profileActivity) {
        this.f52684i = profileActivity;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatParticipant chatParticipant2;
        ProfileActivity profileActivity = this.f52684i;
        if (i10 >= profileActivity.f41836t4 && i10 < profileActivity.f41842u4 && i7 >= this.f52683g && i7 < this.h) {
            ArrayList arrayList = this.f52682f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f52681e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i7 - this.f52683g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i7 - this.f52683g);
            }
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(((Integer) profileActivity.R4.get(i10 - profileActivity.f41836t4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(i10 - profileActivity.f41836t4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i11 = this.f52680c.get(i7, -1);
        if (i11 != this.d.get(i10, -1) || i11 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f52684i.M2;
    }

    @Override
    public final int e() {
        return this.f52679b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i7;
        int i10;
        int i11;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f52684i;
        g(1, profileActivity.N2, sparseIntArray);
        g(2, profileActivity.O2, sparseIntArray);
        g(3, profileActivity.R2, sparseIntArray);
        g(4, profileActivity.S2, sparseIntArray);
        g(5, profileActivity.U2, sparseIntArray);
        g(6, profileActivity.V2, sparseIntArray);
        g(7, profileActivity.Z2, sparseIntArray);
        g(8, profileActivity.W2, sparseIntArray);
        g(9, profileActivity.f41710b3, sparseIntArray);
        g(10, profileActivity.f41702a3, sparseIntArray);
        g(11, profileActivity.X2, sparseIntArray);
        g(12, profileActivity.Y2, sparseIntArray);
        g(13, profileActivity.f41718c3, sparseIntArray);
        g(14, profileActivity.f41724d3, sparseIntArray);
        g(15, profileActivity.f41732e3, sparseIntArray);
        g(16, profileActivity.f41740f3, sparseIntArray);
        g(17, profileActivity.f41711b4, sparseIntArray);
        g(18, profileActivity.f41719c4, sparseIntArray);
        g(19, profileActivity.f41733e4, sparseIntArray);
        g(20, profileActivity.f41748g4, sparseIntArray);
        g(21, profileActivity.f41741f4, sparseIntArray);
        g(22, profileActivity.f41747g3, sparseIntArray);
        g(23, profileActivity.f41754h3, sparseIntArray);
        g(24, profileActivity.f41774k3, sparseIntArray);
        g(25, profileActivity.f41761i3, sparseIntArray);
        g(26, profileActivity.j3, sparseIntArray);
        g(27, profileActivity.f41780l3, sparseIntArray);
        g(28, profileActivity.f41786m3, sparseIntArray);
        g(29, profileActivity.f41793n3, sparseIntArray);
        g(30, profileActivity.f41800o3, sparseIntArray);
        g(31, profileActivity.f41806p3, sparseIntArray);
        g(32, profileActivity.f41813q3, sparseIntArray);
        g(33, profileActivity.f41821r3, sparseIntArray);
        g(34, profileActivity.f41829s3, sparseIntArray);
        g(35, profileActivity.f41835t3, sparseIntArray);
        g(36, profileActivity.f41841u3, sparseIntArray);
        g(37, profileActivity.f41848v3, sparseIntArray);
        g(38, profileActivity.f41856w3, sparseIntArray);
        g(39, profileActivity.f41864x3, sparseIntArray);
        g(40, profileActivity.f41872y3, sparseIntArray);
        g(41, profileActivity.f41879z3, sparseIntArray);
        g(42, profileActivity.A3, sparseIntArray);
        g(43, profileActivity.B3, sparseIntArray);
        g(44, profileActivity.C3, sparseIntArray);
        g(45, profileActivity.D3, sparseIntArray);
        g(46, profileActivity.E3, sparseIntArray);
        g(47, profileActivity.F3, sparseIntArray);
        g(48, profileActivity.G3, sparseIntArray);
        g(49, profileActivity.H3, sparseIntArray);
        g(50, profileActivity.I3, sparseIntArray);
        g(51, profileActivity.J3, sparseIntArray);
        g(52, profileActivity.K3, sparseIntArray);
        g(53, profileActivity.L3, sparseIntArray);
        g(54, profileActivity.X3, sparseIntArray);
        g(55, profileActivity.M3, sparseIntArray);
        g(56, profileActivity.Q3, sparseIntArray);
        g(57, profileActivity.R3, sparseIntArray);
        g(58, profileActivity.S3, sparseIntArray);
        g(59, profileActivity.f41762i4, sparseIntArray);
        g(60, profileActivity.T3, sparseIntArray);
        g(61, profileActivity.U3, sparseIntArray);
        g(62, profileActivity.V3, sparseIntArray);
        g(63, profileActivity.W3, sparseIntArray);
        g(64, profileActivity.Y3, sparseIntArray);
        g(65, profileActivity.f41807p4, sparseIntArray);
        g(66, profileActivity.f41814q4, sparseIntArray);
        g(67, profileActivity.f41822r4, sparseIntArray);
        g(68, profileActivity.f41830s4, sparseIntArray);
        g(69, profileActivity.f41849v4, sparseIntArray);
        g(70, profileActivity.f41857w4, sparseIntArray);
        g(71, profileActivity.f41865x4, sparseIntArray);
        g(72, profileActivity.f41873y4, sparseIntArray);
        g(73, profileActivity.f41880z4, sparseIntArray);
        g(74, profileActivity.F4, sparseIntArray);
        g(75, profileActivity.G4, sparseIntArray);
        g(76, profileActivity.D4, sparseIntArray);
        g(77, profileActivity.J4, sparseIntArray);
        g(78, profileActivity.K4, sparseIntArray);
        g(79, profileActivity.Z3, sparseIntArray);
        g(80, profileActivity.f41703a4, sparseIntArray);
        g(81, profileActivity.L4, sparseIntArray);
        g(82, profileActivity.M4, sparseIntArray);
        g(83, profileActivity.P3, sparseIntArray);
        g(84, profileActivity.N3, sparseIntArray);
        g(85, profileActivity.O3, sparseIntArray);
        g(86, profileActivity.T2, sparseIntArray);
        g(87, profileActivity.P2, sparseIntArray);
        g(88, profileActivity.A4, sparseIntArray);
        g(89, profileActivity.B4, sparseIntArray);
        g(90, profileActivity.C4, sparseIntArray);
        g(91, profileActivity.E4, sparseIntArray);
        g(92, profileActivity.f41755h4, sparseIntArray);
        g(93, profileActivity.f41787m4, sparseIntArray);
        i7 = profileActivity.botPermissionLocation;
        g(94, i7, sparseIntArray);
        i10 = profileActivity.botPermissionEmojiStatus;
        g(95, i10, sparseIntArray);
        i11 = profileActivity.botPermissionBiometry;
        g(96, i11, sparseIntArray);
        g(97, profileActivity.o4, sparseIntArray);
        g(98, profileActivity.Q2, sparseIntArray);
        g(99, profileActivity.f41768j4, sparseIntArray);
        g(100, profileActivity.f41775k4, sparseIntArray);
        g(101, profileActivity.f41781l4, sparseIntArray);
    }
}
