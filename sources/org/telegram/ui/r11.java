package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class r11 extends u4.t0 {
    public final int f49000a;
    public final Object f49001b;

    public r11(Object obj, int i3) {
        this.f49000a = i3;
        this.f49001b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i3) {
        switch (this.f49000a) {
            case 1:
                if (i3 == 0) {
                    c31 c31Var = (c31) this.f49001b;
                    if (c31Var.F != null) {
                        org.telegram.ui.ActionBar.f5 f5Var = c31Var.d;
                        if (f5Var == null || !f5Var.w()) {
                            float f10 = c31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 >= 0.5f) {
                                    c31Var.f44218c.w0(0, (int) (-(c31Var.f44215a0 - c31Var.Z)), org.telegram.ui.Components.xq.h);
                                    return;
                                } else {
                                    c31Var.f44218c.w0(0, (int) Math.ceil(c31Var.Z - c31Var.f44217b0), org.telegram.ui.Components.xq.h);
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
                if (i3 == 0) {
                    ((l71) this.f49001b).f47195t0 = false;
                    return;
                }
                return;
            case 4:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((d81) this.f49001b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.f49001b).f42107c);
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f49001b;
                boolean z10 = true;
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i3 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f43535g0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i3, int i10) {
        int abs;
        switch (this.f49000a) {
            case 0:
                ((s11) this.f49001b).d1();
                return;
            case 1:
                c31 c31Var = (c31) this.f49001b;
                c31Var.o0(false, true);
                c31Var.p0();
                if (c31Var.f44218c.J1) {
                    org.telegram.messenger.g0.v1(c31Var.fragmentView);
                    return;
                }
                return;
            case 2:
                r41 r41Var = (r41) this.f49001b;
                if (r41Var.f49091v0.size() != r41Var.f49093w0.size() && !r41Var.A0 && r41Var.U.N0() > r41Var.X.f50694d0 - 20) {
                    r41Var.k0();
                    return;
                }
                return;
            case 3:
                l71 l71Var = (l71) this.f49001b;
                l71Var.f47202w0.g1();
                l71Var.f47195t0 = true;
                return;
            case 4:
            case 6:
            default:
                return;
            case 5:
                i91 i91Var = (i91) this.f49001b;
                if (i91Var.f46215p0 && i91Var.f46202b0.N0() + 5 >= i91Var.f46213n0) {
                    i91Var.L(i91Var.f46205e0);
                }
                m91 m91Var = i91Var.f46222w0;
                if (m91Var.f47616t0) {
                    if (i3 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(m91Var.f47610q0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f49001b;
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
                            nc1 nc1Var = wallpapersListActivity.I;
                            if (!nc1Var.f47969f && nc1Var.f47972s == 0) {
                                nc1Var.F(nc1Var.h, nc1Var.f47971r, true);
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
