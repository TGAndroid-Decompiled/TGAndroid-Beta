package org.telegram.ui;

import android.graphics.RectF;
import android.view.TextureView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ru0 implements org.telegram.ui.ActionBar.o0, fr0, gh.a, org.telegram.ui.Components.f8 {
    public final ProfileActivity f49606a;

    public ru0(ProfileActivity profileActivity) {
        this.f49606a = profileActivity;
    }

    @Override
    public int A() {
        ProfileActivity profileActivity = this.f49606a;
        gh.e eVar = profileActivity.I5;
        return i0.a.f(profileActivity.l4(), 553648127, eVar.a(eVar.f13970c));
    }

    @Override
    public int C0() {
        return 0;
    }

    @Override
    public void I(org.telegram.messenger.ij ijVar) {
        org.telegram.ui.Components.lf0 lf0Var = this.f49606a.m0;
        if (lf0Var != null && lf0Var.f35703a) {
            lf0Var.K.e(true, 0.0f);
            lf0Var.invalidate();
        }
    }

    @Override
    public void I0(org.telegram.messenger.ij ijVar) {
        ProfileActivity profileActivity = this.f49606a;
        profileActivity.f41698a.I0(true);
        xv0 xv0Var = profileActivity.N;
        if (xv0Var != null && xv0Var.getCurrentListView() != null) {
            profileActivity.N.getCurrentListView().I0(true);
        }
        profileActivity.f41716c1.setBackgroundColor(i0.a.f(0.1f, profileActivity.f4(profileActivity.V4.f46383f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, profileActivity.f41876z0)));
    }

    @Override
    public int M() {
        return 0;
    }

    @Override
    public int O() {
        ProfileActivity profileActivity = this.f49606a;
        gh.e eVar = profileActivity.I5;
        return i0.a.f(profileActivity.l4(), 352321535, eVar.a(eVar.d));
    }

    @Override
    public int R0() {
        ProfileActivity profileActivity = this.f49606a;
        gh.e eVar = profileActivity.I5;
        return org.telegram.ui.ActionBar.l6.r1(profileActivity.l4(), eVar.a(eVar.f13969b));
    }

    @Override
    public void X0(int i7, int i10) {
        int i11;
        RectF rectF = ProfileActivity.V6;
        ProfileActivity profileActivity = this.f49606a;
        long a10 = profileActivity.a();
        profileActivity.getMessagesController().I4(i7, a10);
        if (profileActivity.f41840u2 == null && profileActivity.f41834t2 == null) {
            return;
        }
        UndoView undoView = profileActivity.L;
        TLRPC.User a22 = profileActivity.getMessagesController().a2(Long.valueOf(a10));
        TLRPC.UserFull userFull = profileActivity.f41840u2;
        if (userFull != null) {
            i11 = userFull.ttl_period;
        } else {
            i11 = profileActivity.f41834t2.ttl_period;
        }
        undoView.k(a10, i10, a22, Integer.valueOf(i11), null, null);
    }

    @Override
    public void dismiss() {
        this.f49606a.S0.U(null, null);
    }

    @Override
    public int e1() {
        ProfileActivity profileActivity = this.f49606a;
        gh.e eVar = profileActivity.I5;
        return org.telegram.ui.ActionBar.l6.r1(profileActivity.l4(), eVar.a(eVar.f13971e));
    }

    @Override
    public void i1() {
        this.f49606a.presentFragment(new p4());
        dismiss();
    }

    @Override
    public float j0() {
        return -1.0f;
    }

    @Override
    public TextureView l0() {
        return null;
    }

    @Override
    public void n() {
        RectF rectF = ProfileActivity.V6;
        org.telegram.ui.Components.kk0.d(new a5(this.f49606a, 19));
    }

    @Override
    public float o0() {
        return -1.0f;
    }

    @Override
    public float v0() {
        return 0.0f;
    }

    @Override
    public void i() {
    }
}
