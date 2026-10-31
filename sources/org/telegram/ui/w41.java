package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class w41 extends s4.s0 {
    public final int f42877a;
    public final Object f42878b;

    public w41(Object obj, int i10) {
        this.f42877a = i10;
        this.f42878b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f42877a) {
            case 0:
                if (i10 == 0) {
                    e51 e51Var = (e51) this.f42878b;
                    if (e51Var.E != null) {
                        org.telegram.ui.ActionBar.p5 p5Var = e51Var.d;
                        if (p5Var == null || !p5Var.w()) {
                            float f7 = e51Var.X;
                            if (f7 > 0.0f && f7 < 1.0f) {
                                if (f7 >= 0.5f) {
                                    e51Var.f36935c.w0(0, (int) (-(e51Var.Z - e51Var.Y)), org.telegram.ui.Components.gr.h);
                                    return;
                                } else {
                                    e51Var.f36935c.w0(0, (int) Math.ceil(e51Var.Y - e51Var.f36932a0), org.telegram.ui.Components.gr.h);
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
            case 1:
            case 4:
            default:
                return;
            case 2:
                if (i10 == 0) {
                    ((m91) this.f42878b).f39588s0 = false;
                    return;
                }
                return;
            case 3:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((ea1) this.f42878b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((UsersSelectActivity) this.f42878b).f34148c);
                    return;
                }
                return;
            case 6:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42878b;
                boolean z10 = true;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35483f0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f42877a) {
            case 0:
                e51 e51Var = (e51) this.f42878b;
                e51Var.n0(false, true);
                e51Var.o0();
                if (e51Var.f36935c.I1) {
                    org.telegram.messenger.i0.v1(e51Var.fragmentView);
                    return;
                }
                return;
            case 1:
                u61 u61Var = (u61) this.f42878b;
                if (u61Var.f42049u0.size() != u61Var.f42050v0.size() && !u61Var.f42057z0 && u61Var.T.N0() > u61Var.W.f44024c0 - 20) {
                    u61Var.j0();
                    return;
                }
                return;
            case 2:
                m91 m91Var = (m91) this.f42878b;
                m91Var.f39594v0.g1();
                m91Var.f39588s0 = true;
                return;
            case 3:
            case 5:
            default:
                return;
            case 4:
                lb1 lb1Var = (lb1) this.f42878b;
                if (lb1Var.f39162o0 && lb1Var.f39149a0.N0() + 5 >= lb1Var.m0) {
                    lb1Var.L(lb1Var.f39152d0);
                }
                pb1 pb1Var = lb1Var.f39169v0;
                if (pb1Var.f40605s0) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.messenger.i0.v1(pb1Var.f40599p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 6:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42878b;
                if (wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
                    int L0 = wallpapersListActivity.I.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(wallpapersListActivity.I.N0() - L0) + 1;
                    }
                    if (abs > 0) {
                        int B = wallpapersListActivity.I.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            pe1 pe1Var = wallpapersListActivity.H;
                            if (!pe1Var.f40652f && pe1Var.f40655s == 0) {
                                pe1Var.F(pe1Var.h, pe1Var.f40654r, true);
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
