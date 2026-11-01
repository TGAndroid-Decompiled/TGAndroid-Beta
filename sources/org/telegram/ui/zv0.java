package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class zv0 implements org.telegram.ui.ActionBar.q0, ns0, wg.a, org.telegram.ui.Components.a8 {
    public final ProfileActivity f44108a;

    public zv0(ProfileActivity profileActivity) {
        this.f44108a = profileActivity;
    }

    @Override
    public int E() {
        ProfileActivity profileActivity = this.f44108a;
        wg.d dVar = profileActivity.G5;
        return i0.b.f(profileActivity.l4(), 352321535, dVar.a(dVar.d));
    }

    @Override
    public void H0(org.telegram.messenger.kj kjVar) {
        ProfileActivity profileActivity = this.f44108a;
        profileActivity.f33779a.I0(true);
        hx0 hx0Var = profileActivity.N;
        if (hx0Var != null && hx0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.f33796c1.setBackgroundColor(i0.b.f(0.1f, profileActivity.f4(profileActivity.V4.f40593f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, profileActivity.f33957z0)));
    }

    @Override
    public void I(org.telegram.messenger.kj kjVar) {
        org.telegram.ui.Components.ng0 ng0Var = this.f44108a.m0;
        if (ng0Var != null && ng0Var.f28816a) {
            ng0Var.K.e(true, 0.0f);
            ng0Var.invalidate();
        }
    }

    @Override
    public float N() {
        return -1.0f;
    }

    @Override
    public float X() {
        return -1.0f;
    }

    @Override
    public void Y0(int i10, int i11) {
        int i12;
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.f44108a;
        long a2 = profileActivity.a();
        profileActivity.getMessagesController().F4(i10, a2);
        if (profileActivity.f33922u2 == null && profileActivity.f33915t2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(a2));
        TLRPC.UserFull userFull = profileActivity.f33922u2;
        if (userFull != null) {
            i12 = userFull.ttl_period;
        } else {
            i12 = profileActivity.f33915t2.ttl_period;
        }
        undoView.k(a2, i11, Z1, Integer.valueOf(i12), null, null);
    }

    @Override
    public float b0() {
        return 0.0f;
    }

    @Override
    public void dismiss() {
        this.f44108a.S0.U(null, null);
    }

    @Override
    public void e() {
        RectF rectF = ProfileActivity.S6;
        org.telegram.ui.Components.ol0.d(new z4(this.f44108a, 18));
    }

    @Override
    public int h0() {
        return 0;
    }

    @Override
    public int j0() {
        ProfileActivity profileActivity = this.f44108a;
        wg.d dVar = profileActivity.G5;
        return org.telegram.ui.ActionBar.t6.r1(profileActivity.l4(), dVar.a(dVar.f52864b));
    }

    @Override
    public TextureView k0() {
        return null;
    }

    @Override
    public int n0() {
        ProfileActivity profileActivity = this.f44108a;
        wg.d dVar = profileActivity.G5;
        return org.telegram.ui.ActionBar.t6.r1(profileActivity.l4(), dVar.a(dVar.e));
    }

    @Override
    public void t1() {
        this.f44108a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public int u() {
        ProfileActivity profileActivity = this.f44108a;
        wg.d dVar = profileActivity.G5;
        return i0.b.f(profileActivity.l4(), 553648127, dVar.a(dVar.f52865c));
    }

    @Override
    public int w() {
        return 0;
    }

    @Override
    public void a() {
    }
}
