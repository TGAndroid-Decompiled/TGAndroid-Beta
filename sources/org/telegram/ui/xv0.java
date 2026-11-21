package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xv0 extends v4.o {
    public int f53967b;
    public final SparseIntArray f53968c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f53969e = new ArrayList();
    public final ArrayList f53970f = new ArrayList();
    public int f53971g;
    public int h;
    public final ProfileActivity f53972i;

    public xv0(ProfileActivity profileActivity) {
        this.f53972i = profileActivity;
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
        ProfileActivity profileActivity = this.f53972i;
        if (i10 >= profileActivity.f43716x4 && i10 < profileActivity.f43724y4 && i7 >= this.f53971g && i7 < this.h) {
            ArrayList arrayList = this.f53970f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f53969e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i7 - this.f53971g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i7 - this.f53971g);
            }
            if (!profileActivity.D2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.U4.get(((Integer) profileActivity.V4.get(i10 - profileActivity.f43716x4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.U4.get(i10 - profileActivity.f43716x4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i11 = this.f53968c.get(i7, -1);
        if (i11 != this.d.get(i10, -1) || i11 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f53972i.O2;
    }

    @Override
    public final int e() {
        return this.f53967b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i7;
        int i10;
        int i11;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f53972i;
        g(1, profileActivity.P2, sparseIntArray);
        g(2, profileActivity.Q2, sparseIntArray);
        g(3, profileActivity.T2, sparseIntArray);
        g(4, profileActivity.U2, sparseIntArray);
        g(5, profileActivity.W2, sparseIntArray);
        g(6, profileActivity.X2, sparseIntArray);
        g(7, profileActivity.f43561b3, sparseIntArray);
        g(8, profileActivity.Y2, sparseIntArray);
        g(9, profileActivity.f43575d3, sparseIntArray);
        g(10, profileActivity.f43569c3, sparseIntArray);
        g(11, profileActivity.Z2, sparseIntArray);
        g(12, profileActivity.f43553a3, sparseIntArray);
        g(13, profileActivity.f43583e3, sparseIntArray);
        g(14, profileActivity.f43591f3, sparseIntArray);
        g(15, profileActivity.f43598g3, sparseIntArray);
        g(16, profileActivity.f43605h3, sparseIntArray);
        g(17, profileActivity.f43592f4, sparseIntArray);
        g(18, profileActivity.f43599g4, sparseIntArray);
        g(19, profileActivity.f43613i4, sparseIntArray);
        g(20, profileActivity.f43626k4, sparseIntArray);
        g(21, profileActivity.f43619j4, sparseIntArray);
        g(22, profileActivity.f43612i3, sparseIntArray);
        g(23, profileActivity.j3, sparseIntArray);
        g(24, profileActivity.f43637m3, sparseIntArray);
        g(25, profileActivity.f43625k3, sparseIntArray);
        g(26, profileActivity.f43631l3, sparseIntArray);
        g(27, profileActivity.f43644n3, sparseIntArray);
        g(28, profileActivity.f43651o3, sparseIntArray);
        g(29, profileActivity.f43657p3, sparseIntArray);
        g(30, profileActivity.f43664q3, sparseIntArray);
        g(31, profileActivity.f43672r3, sparseIntArray);
        g(32, profileActivity.f43680s3, sparseIntArray);
        g(33, profileActivity.f43686t3, sparseIntArray);
        g(34, profileActivity.f43692u3, sparseIntArray);
        g(35, profileActivity.f43699v3, sparseIntArray);
        g(36, profileActivity.f43707w3, sparseIntArray);
        g(37, profileActivity.f43715x3, sparseIntArray);
        g(38, profileActivity.f43723y3, sparseIntArray);
        g(39, profileActivity.f43730z3, sparseIntArray);
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
        g(59, profileActivity.f43638m4, sparseIntArray);
        g(60, profileActivity.V3, sparseIntArray);
        g(61, profileActivity.W3, sparseIntArray);
        g(62, profileActivity.X3, sparseIntArray);
        g(63, profileActivity.Y3, sparseIntArray);
        g(64, profileActivity.f43554a4, sparseIntArray);
        g(65, profileActivity.f43687t4, sparseIntArray);
        g(66, profileActivity.f43693u4, sparseIntArray);
        g(67, profileActivity.f43700v4, sparseIntArray);
        g(68, profileActivity.f43708w4, sparseIntArray);
        g(69, profileActivity.f43731z4, sparseIntArray);
        g(70, profileActivity.A4, sparseIntArray);
        g(71, profileActivity.B4, sparseIntArray);
        g(72, profileActivity.C4, sparseIntArray);
        g(73, profileActivity.D4, sparseIntArray);
        g(74, profileActivity.J4, sparseIntArray);
        g(75, profileActivity.K4, sparseIntArray);
        g(76, profileActivity.H4, sparseIntArray);
        g(77, profileActivity.N4, sparseIntArray);
        g(78, profileActivity.O4, sparseIntArray);
        g(79, profileActivity.f43562b4, sparseIntArray);
        g(80, profileActivity.f43570c4, sparseIntArray);
        g(81, profileActivity.f43576d4, sparseIntArray);
        g(82, profileActivity.f43584e4, sparseIntArray);
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
        g(94, profileActivity.f43632l4, sparseIntArray);
        g(95, profileActivity.f43665q4, sparseIntArray);
        i7 = profileActivity.botPermissionLocation;
        g(96, i7, sparseIntArray);
        i10 = profileActivity.botPermissionEmojiStatus;
        g(97, i10, sparseIntArray);
        i11 = profileActivity.botPermissionBiometry;
        g(98, i11, sparseIntArray);
        g(99, profileActivity.f43681s4, sparseIntArray);
        g(100, profileActivity.S2, sparseIntArray);
        g(101, profileActivity.f43645n4, sparseIntArray);
        g(102, profileActivity.o4, sparseIntArray);
        g(103, profileActivity.f43658p4, sparseIntArray);
    }
}
