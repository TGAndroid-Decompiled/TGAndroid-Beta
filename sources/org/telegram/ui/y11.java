package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class y11 extends v4.t0 {
    public final int f53387a;
    public final Object f53388b;

    public y11(Object obj, int i7) {
        this.f53387a = i7;
        this.f53388b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f53387a) {
            case 1:
                if (i7 == 0) {
                    k31 k31Var = (k31) this.f53388b;
                    if (k31Var.F != null) {
                        org.telegram.ui.ActionBar.d5 d5Var = k31Var.d;
                        if (d5Var == null || !d5Var.x()) {
                            float f10 = k31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    k31Var.f48519c.w0(0, (int) (-(k31Var.f48516a0 - k31Var.Z)), org.telegram.ui.Components.er.h);
                                    return;
                                } else {
                                    k31Var.f48519c.w0(0, (int) Math.ceil(k31Var.Z - k31Var.f48518b0), org.telegram.ui.Components.er.h);
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
                    ((t71) this.f53388b).f51463t0 = false;
                    return;
                }
                return;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((l81) this.f53388b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f53388b).f43450c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f53388b;
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
        switch (this.f53387a) {
            case 0:
                ((z11) this.f53388b).d1();
                return;
            case 1:
                k31 k31Var = (k31) this.f53388b;
                k31Var.o0(false, true);
                k31Var.p0();
                if (k31Var.f48519c.J1) {
                    org.telegram.messenger.g0.v1(k31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                z41 z41Var = (z41) this.f53388b;
                if (z41Var.f53835v0.size() != z41Var.f53837w0.size() && !z41Var.A0 && z41Var.U.N0() > z41Var.X.f46543d0 - 20) {
                    z41Var.k0();
                    return;
                }
                return;
            case 3:
                t71 t71Var = (t71) this.f53388b;
                t71Var.f51470w0.g1();
                t71Var.f51463t0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                q91 q91Var = (q91) this.f53388b;
                if (q91Var.f50523p0 && q91Var.f50510b0.N0() + 5 >= q91Var.f50521n0) {
                    q91Var.J(q91Var.f50513e0);
                }
                u91 u91Var = q91Var.f50530w0;
                if (u91Var.f51876t0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(u91Var.f51870q0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f53388b;
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
                            if (!rc1Var.f50920f && rc1Var.f50923s == 0) {
                                rc1Var.F(rc1Var.h, rc1Var.f50922r, true);
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
