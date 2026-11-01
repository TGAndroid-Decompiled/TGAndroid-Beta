package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class u41 extends s4.s0 {
    public final int f41795a;
    public final Object f41796b;

    public u41(Object obj, int i10) {
        this.f41795a = i10;
        this.f41796b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f41795a) {
            case 0:
                if (i10 == 0) {
                    c51 c51Var = (c51) this.f41796b;
                    if (c51Var.E != null) {
                        org.telegram.ui.ActionBar.p5 p5Var = c51Var.d;
                        if (p5Var == null || !p5Var.w()) {
                            float f7 = c51Var.X;
                            if (f7 > 0.0f && f7 < 1.0f) {
                                if (f7 >= 0.5f) {
                                    c51Var.f36189c.w0(0, (int) (-(c51Var.Z - c51Var.Y)), org.telegram.ui.Components.gr.h);
                                    return;
                                } else {
                                    c51Var.f36189c.w0(0, (int) Math.ceil(c51Var.Y - c51Var.f36186a0), org.telegram.ui.Components.gr.h);
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
                    ((k91) this.f41796b).f38763s0 = false;
                    return;
                }
                return;
            case 3:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((ca1) this.f41796b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((UsersSelectActivity) this.f41796b).f34155c);
                    return;
                }
                return;
            case 6:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f41796b;
                boolean z10 = true;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i10 == 0) {
                    z10 = false;
                }
                wallpapersListActivity.f35490f0 = z10;
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        switch (this.f41795a) {
            case 0:
                c51 c51Var = (c51) this.f41796b;
                c51Var.o0(false, true);
                c51Var.p0();
                if (c51Var.f36189c.I1) {
                    org.telegram.messenger.i0.v1(c51Var.fragmentView);
                    return;
                }
                return;
            case 1:
                s61 s61Var = (s61) this.f41796b;
                if (s61Var.f41262u0.size() != s61Var.f41263v0.size() && !s61Var.f41270z0 && s61Var.T.N0() > s61Var.W.f43250c0 - 20) {
                    s61Var.k0();
                    return;
                }
                return;
            case 2:
                k91 k91Var = (k91) this.f41796b;
                k91Var.f38769v0.g1();
                k91Var.f38763s0 = true;
                return;
            case 3:
            case 5:
            default:
                return;
            case 4:
                jb1 jb1Var = (jb1) this.f41796b;
                if (jb1Var.f38349o0 && jb1Var.f38336a0.N0() + 5 >= jb1Var.m0) {
                    jb1Var.L(jb1Var.f38339d0);
                }
                nb1 nb1Var = jb1Var.f38356v0;
                if (nb1Var.f39836s0) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.messenger.i0.v1(nb1Var.f39830p0.getSearchField());
                        return;
                    }
                    return;
                }
                return;
            case 6:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f41796b;
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
                            ne1 ne1Var = wallpapersListActivity.H;
                            if (!ne1Var.f39888f && ne1Var.f39891s == 0) {
                                ne1Var.F(ne1Var.h, ne1Var.f39890r, true);
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
