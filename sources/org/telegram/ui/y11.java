package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class y11 extends v4.t0 {
    public final int f53383a;
    public final Object f53384b;

    public y11(Object obj, int i7) {
        this.f53383a = i7;
        this.f53384b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f53383a) {
            case 1:
                if (i7 == 0) {
                    k31 k31Var = (k31) this.f53384b;
                    if (k31Var.F != null) {
                        org.telegram.ui.ActionBar.d5 d5Var = k31Var.d;
                        if (d5Var == null || !d5Var.x()) {
                            float f10 = k31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    k31Var.f48565c.w0(0, (int) (-(k31Var.f48562a0 - k31Var.Z)), org.telegram.ui.Components.er.h);
                                    return;
                                } else {
                                    k31Var.f48565c.w0(0, (int) Math.ceil(k31Var.Z - k31Var.f48564b0), org.telegram.ui.Components.er.h);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 5:
            default:
                return;
            case 3:
                if (i7 == 0) {
                    ((t71) this.f53384b).f51462t0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((l81) this.f53384b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f53384b).f43450c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f53384b;
                boolean z10 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i7 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f44882g0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int abs;
        switch (this.f53383a) {
            case 0:
                ((z11) this.f53384b).d1();
                return;
            case 1:
                k31 k31Var = (k31) this.f53384b;
                k31Var.o0(false, true);
                k31Var.p0();
                if (k31Var.f48565c.J1) {
                    org.telegram.messenger.g0.v1(k31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                z41 z41Var = (z41) this.f53384b;
                if (z41Var.f53870v0.size() != z41Var.f53872w0.size() && !z41Var.A0 && z41Var.U.N0() > z41Var.X.f46553d0 - 20) {
                    z41Var.k0();
                    return;
                }
                return;
            case 3:
                t71 t71Var = (t71) this.f53384b;
                t71Var.f51469w0.g1();
                t71Var.f51462t0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                q91 q91Var = (q91) this.f53384b;
                if (q91Var.f50532p0 && q91Var.f50519b0.N0() + 5 >= q91Var.f50530n0) {
                    q91Var.J(q91Var.f50522e0);
                }
                u91 u91Var = q91Var.f50539w0;
                if (u91Var.f51875t0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(u91Var.f51869q0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f53384b;
                if (wallpapersListActivity.G.getAdapter() == wallpapersListActivity.I) {
                    int L0 = wallpapersListActivity.J.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.J.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.J.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            rc1 rc1Var = wallpapersListActivity.I;
                            if (!rc1Var.f50921f && rc1Var.f50924s == 0) {
                                rc1Var.F(rc1Var.h, rc1Var.f50923r, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
