package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xv0 extends v4.o {
    public int f53971b;
    public final SparseIntArray f53972c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f53973e = new ArrayList();
    public final ArrayList f53974f = new ArrayList();
    public int f53975g;
    public int h;
    public final ProfileActivity f53976i;

    public xv0(ProfileActivity profileActivity) {
        this.f53976i = profileActivity;
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
        ProfileActivity profileActivity = this.f53976i;
        if (i10 >= profileActivity.f43720x4 && i10 < profileActivity.f43728y4 && i7 >= this.f53975g && i7 < this.h) {
            ArrayList arrayList = this.f53974f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f53973e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i7 - this.f53975g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i7 - this.f53975g);
            }
            if (!profileActivity.D2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.U4.get(((Integer) profileActivity.V4.get(i10 - profileActivity.f43720x4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.U4.get(i10 - profileActivity.f43720x4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i11 = this.f53972c.get(i7, -1);
        if (i11 != this.d.get(i10, -1) || i11 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f53976i.O2;
    }

    @Override
    public final int e() {
        return this.f53971b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i7;
        int i10;
        int i11;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f53976i;
        g(1, profileActivity.P2, sparseIntArray);
        g(2, profileActivity.Q2, sparseIntArray);
        g(3, profileActivity.T2, sparseIntArray);
        g(4, profileActivity.U2, sparseIntArray);
        g(5, profileActivity.W2, sparseIntArray);
        g(6, profileActivity.X2, sparseIntArray);
        g(7, profileActivity.f43565b3, sparseIntArray);
        g(8, profileActivity.Y2, sparseIntArray);
        g(9, profileActivity.f43579d3, sparseIntArray);
        g(10, profileActivity.f43573c3, sparseIntArray);
        g(11, profileActivity.Z2, sparseIntArray);
        g(12, profileActivity.f43557a3, sparseIntArray);
        g(13, profileActivity.f43587e3, sparseIntArray);
        g(14, profileActivity.f43595f3, sparseIntArray);
        g(15, profileActivity.f43602g3, sparseIntArray);
        g(16, profileActivity.f43609h3, sparseIntArray);
        g(17, profileActivity.f43596f4, sparseIntArray);
        g(18, profileActivity.f43603g4, sparseIntArray);
        g(19, profileActivity.f43617i4, sparseIntArray);
        g(20, profileActivity.f43630k4, sparseIntArray);
        g(21, profileActivity.f43623j4, sparseIntArray);
        g(22, profileActivity.f43616i3, sparseIntArray);
        g(23, profileActivity.j3, sparseIntArray);
        g(24, profileActivity.f43641m3, sparseIntArray);
        g(25, profileActivity.f43629k3, sparseIntArray);
        g(26, profileActivity.f43635l3, sparseIntArray);
        g(27, profileActivity.f43648n3, sparseIntArray);
        g(28, profileActivity.f43655o3, sparseIntArray);
        g(29, profileActivity.f43661p3, sparseIntArray);
        g(30, profileActivity.f43668q3, sparseIntArray);
        g(31, profileActivity.f43676r3, sparseIntArray);
        g(32, profileActivity.f43684s3, sparseIntArray);
        g(33, profileActivity.f43690t3, sparseIntArray);
        g(34, profileActivity.f43696u3, sparseIntArray);
        g(35, profileActivity.f43703v3, sparseIntArray);
        g(36, profileActivity.f43711w3, sparseIntArray);
        g(37, profileActivity.f43719x3, sparseIntArray);
        g(38, profileActivity.f43727y3, sparseIntArray);
        g(39, profileActivity.f43734z3, sparseIntArray);
        g(40, profileActivity.A3, sparseIntArray);
        g(41, profileActivity.B3, sparseIntArray);
        g(42, profileActivity.C3, sparseIntArray);
        g(43, profileActivity.D3, sparseIntArray);
        g(44, profileActivity.E3, sparseIntArray);
        g(45, profileActivity.F3, sparseIntArray);
        g(46, profileActivity.G3, sparseIntArray);
        g(47, profileActivity.H3, sparseIntArray);
        g(48, profileActivity.I3, sparseIntArray);
        g(49, profileActivity.J3, sparseIntArray);
        g(50, profileActivity.K3, sparseIntArray);
        g(51, profileActivity.L3, sparseIntArray);
        g(52, profileActivity.M3, sparseIntArray);
        g(53, profileActivity.N3, sparseIntArray);
        g(54, profileActivity.Z3, sparseIntArray);
        g(55, profileActivity.O3, sparseIntArray);
        g(56, profileActivity.S3, sparseIntArray);
        g(57, profileActivity.T3, sparseIntArray);
        g(58, profileActivity.U3, sparseIntArray);
        g(59, profileActivity.f43642m4, sparseIntArray);
        g(60, profileActivity.V3, sparseIntArray);
        g(61, profileActivity.W3, sparseIntArray);
        g(62, profileActivity.X3, sparseIntArray);
        g(63, profileActivity.Y3, sparseIntArray);
        g(64, profileActivity.f43558a4, sparseIntArray);
        g(65, profileActivity.f43691t4, sparseIntArray);
        g(66, profileActivity.f43697u4, sparseIntArray);
        g(67, profileActivity.f43704v4, sparseIntArray);
        g(68, profileActivity.f43712w4, sparseIntArray);
        g(69, profileActivity.f43735z4, sparseIntArray);
        g(70, profileActivity.A4, sparseIntArray);
        g(71, profileActivity.B4, sparseIntArray);
        g(72, profileActivity.C4, sparseIntArray);
        g(73, profileActivity.D4, sparseIntArray);
        g(74, profileActivity.J4, sparseIntArray);
        g(75, profileActivity.K4, sparseIntArray);
        g(76, profileActivity.H4, sparseIntArray);
        g(77, profileActivity.N4, sparseIntArray);
        g(78, profileActivity.O4, sparseIntArray);
        g(79, profileActivity.f43566b4, sparseIntArray);
        g(80, profileActivity.f43574c4, sparseIntArray);
        g(81, profileActivity.f43580d4, sparseIntArray);
        g(82, profileActivity.f43588e4, sparseIntArray);
        g(83, profileActivity.P4, sparseIntArray);
        g(84, profileActivity.Q4, sparseIntArray);
        g(85, profileActivity.R3, sparseIntArray);
        g(86, profileActivity.P3, sparseIntArray);
        g(87, profileActivity.Q3, sparseIntArray);
        g(88, profileActivity.V2, sparseIntArray);
        g(89, profileActivity.R2, sparseIntArray);
        g(90, profileActivity.E4, sparseIntArray);
        g(91, profileActivity.F4, sparseIntArray);
        g(92, profileActivity.G4, sparseIntArray);
        g(93, profileActivity.I4, sparseIntArray);
        g(94, profileActivity.f43636l4, sparseIntArray);
        g(95, profileActivity.f43669q4, sparseIntArray);
        i7 = profileActivity.botPermissionLocation;
        g(96, i7, sparseIntArray);
        i10 = profileActivity.botPermissionEmojiStatus;
        g(97, i10, sparseIntArray);
        i11 = profileActivity.botPermissionBiometry;
        g(98, i11, sparseIntArray);
        g(99, profileActivity.f43685s4, sparseIntArray);
        g(100, profileActivity.S2, sparseIntArray);
        g(101, profileActivity.f43649n4, sparseIntArray);
        g(102, profileActivity.o4, sparseIntArray);
        g(103, profileActivity.f43662p4, sparseIntArray);
    }
}
