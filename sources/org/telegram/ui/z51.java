package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class z51 extends org.telegram.ui.Components.sk0 {
    public int f44024c0;
    public int d;
    public final u61 f44025d0;
    public int f44023c = -1;
    public int e = -1;
    public int f44026f = -1;
    public int h = -1;
    public int f44027n = -1;
    public int f44028r = -1;
    public int f44029s = -1;
    public int f44030w = -1;
    public int f44031x = -1;
    public int f44032y = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public int Z = -1;
    public final a0.g f44021a0 = new a0.g(0);
    public final a0.g f44022b0 = new a0.g(0);

    public z51(u61 u61Var) {
        this.f44025d0 = u61Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.f44028r = -1;
        this.f44030w = -1;
        this.f44031x = -1;
        this.f44032y = -1;
        this.I = -1;
        this.J = -1;
        this.f44026f = -1;
        this.H = -1;
        this.f44029s = -1;
        this.f44027n = -1;
        this.D = -1;
        this.G = -1;
        this.F = -1;
        this.E = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f44024c0 = 0;
        a0.g gVar = this.f44022b0;
        gVar.clear();
        a0.g gVar2 = this.f44021a0;
        gVar2.clear();
        u61 u61Var = this.f44025d0;
        ArrayList arrayList = u61Var.f42056y0;
        ArrayList arrayList2 = u61Var.P;
        ArrayList arrayList3 = u61Var.Q;
        ArrayList arrayList4 = u61Var.O;
        if (u61Var.f42026b0) {
            if (u61Var.G != null) {
                int i10 = this.f44024c0;
                this.f44023c = i10;
                this.f44024c0 = i10 + 2;
                this.d = i10 + 1;
            }
            g61 g61Var = u61Var.d;
            if (g61Var != null && !g61Var.f37441l) {
                int i11 = this.f44024c0;
                if (i11 > 0) {
                    this.f44024c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.f44024c0;
                this.f44024c0 = i12 + 1;
                this.e = i12;
            }
            g61 g61Var2 = u61Var.H;
            if (g61Var2 != null && !g61Var2.f37441l) {
                int i13 = this.f44024c0;
                if (i13 > 0) {
                    this.f44024c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.f44024c0;
                this.f44024c0 = i14 + 1;
                this.K = i14;
            }
            g61 g61Var3 = u61Var.I;
            if (g61Var3 != null && !g61Var3.f37441l && !g61Var3.f37433a) {
                int i15 = this.f44024c0;
                if (i15 > 0) {
                    this.f44024c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.f44024c0;
                this.f44024c0 = i16 + 1;
                this.L = i16;
            }
            g61 g61Var4 = u61Var.J;
            if (g61Var4 != null && !g61Var4.f37441l && !g61Var4.f37433a) {
                int i17 = this.f44024c0;
                if (i17 > 0) {
                    this.f44024c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.f44024c0;
                this.f44024c0 = i18 + 1;
                this.M = i18;
            }
            g61 g61Var5 = u61Var.K;
            if (g61Var5 != null && !g61Var5.f37441l && !g61Var5.f37433a) {
                int i19 = this.f44024c0;
                if (i19 > 0) {
                    this.f44024c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.f44024c0;
                this.f44024c0 = i20 + 1;
                this.N = i20;
            }
            g61 g61Var6 = u61Var.L;
            if (g61Var6 != null && !g61Var6.f37441l && !g61Var6.f37433a) {
                int i21 = this.f44024c0;
                if (i21 > 0) {
                    this.f44024c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.f44024c0;
                this.f44024c0 = i22 + 1;
                this.O = i22;
            }
            g61 g61Var7 = u61Var.e;
            if (g61Var7 != null && !g61Var7.f37441l && !g61Var7.f37433a) {
                int i23 = this.f44024c0;
                if (i23 > 0) {
                    this.f44024c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.f44024c0;
                this.f44024c0 = i24 + 1;
                this.f44027n = i24;
            }
            g61 g61Var8 = u61Var.M;
            if (g61Var8 != null && !g61Var8.f37441l && !g61Var8.f37433a) {
                int i25 = this.f44024c0;
                if (i25 > 0) {
                    this.f44024c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.f44024c0;
                this.f44024c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.f44024c0;
                if (i27 > 0) {
                    this.f44024c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.f44024c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.f44024c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.f44024c0 = size;
                if (arrayList4.size() != u61Var.N.size()) {
                    int i30 = this.f44024c0;
                    this.f44024c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.f44024c0;
                    this.f44024c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.f44024c0;
                if (i32 > 0) {
                    this.f44024c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.f44024c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.f44024c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.f44024c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.f44024c0;
                if (i35 > 0) {
                    this.f44024c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.f44024c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.f44024c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.f44024c0 = size3;
            }
            int i38 = this.f44024c0;
            if (i38 > 0) {
                this.f44024c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.f44024c0;
                this.f44024c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (u61Var.f42031f != null) {
            int i40 = this.f44024c0;
            this.f44023c = i40;
            this.f44024c0 = i40 + 2;
            this.d = i40 + 1;
        }
        g61 g61Var9 = u61Var.d;
        if (g61Var9 != null && !g61Var9.f37441l) {
            int i41 = this.f44024c0;
            if (i41 > 0) {
                this.f44024c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.f44024c0;
            this.f44024c0 = i42 + 1;
            this.e = i42;
        }
        g61 g61Var10 = u61Var.h;
        if (g61Var10 != null && !g61Var10.f37441l) {
            int i43 = this.f44024c0;
            if (i43 > 0) {
                this.f44024c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.f44024c0;
            this.f44024c0 = i44 + 1;
            this.h = i44;
        }
        g61 g61Var11 = u61Var.f42055y;
        if (g61Var11 != null && !g61Var11.f37441l) {
            int i45 = this.f44024c0;
            if (i45 > 0) {
                this.f44024c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.f44024c0;
            this.f44024c0 = i46 + 1;
            this.D = i46;
        }
        g61 g61Var12 = u61Var.e;
        if (g61Var12 != null && !g61Var12.f37441l) {
            int i47 = this.f44024c0;
            if (i47 > 0) {
                this.f44024c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.f44024c0;
            this.f44024c0 = i48 + 1;
            this.f44027n = i48;
        }
        g61 g61Var13 = u61Var.f42046s;
        if (g61Var13 != null && !g61Var13.f37441l) {
            int i49 = this.f44024c0;
            if (i49 > 0) {
                this.f44024c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.f44024c0;
            this.f44024c0 = i50 + 1;
            this.f44030w = i50;
        }
        g61 g61Var14 = u61Var.f42051w;
        if (g61Var14 != null && !g61Var14.f37441l) {
            int i51 = this.f44024c0;
            if (i51 > 0) {
                this.f44024c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.f44024c0;
            this.f44024c0 = i52 + 1;
            this.f44031x = i52;
        }
        g61 g61Var15 = u61Var.f42053x;
        if (g61Var15 != null && !g61Var15.f37441l) {
            int i53 = this.f44024c0;
            if (i53 > 0) {
                this.f44024c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.f44024c0;
            this.f44024c0 = i54 + 1;
            this.f44032y = i54;
        }
        g61 g61Var16 = u61Var.f42039n;
        if (g61Var16 != null && !g61Var16.f37441l) {
            int i55 = this.f44024c0;
            if (i55 > 0) {
                this.f44024c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.f44024c0;
            this.f44024c0 = i56 + 1;
            this.f44028r = i56;
        }
        g61 g61Var17 = u61Var.f42044r;
        if (g61Var17 != null && !g61Var17.f37440k && !g61Var17.f37433a) {
            int i57 = this.f44024c0;
            if (i57 > 0) {
                this.f44024c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.f44024c0;
            this.f44024c0 = i58 + 1;
            this.f44029s = i58;
        }
        g61 g61Var18 = u61Var.D;
        if (g61Var18 != null && !g61Var18.f37441l && !g61Var18.f37433a) {
            int i59 = this.f44024c0;
            if (i59 > 0) {
                this.f44024c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.f44024c0;
            this.f44024c0 = i60 + 1;
            this.E = i60;
        }
        g61 g61Var19 = u61Var.E;
        if (g61Var19 != null && !g61Var19.f37441l && !g61Var19.f37433a) {
            int i61 = this.f44024c0;
            if (i61 > 0) {
                this.f44024c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.f44024c0;
            this.f44024c0 = i62 + 1;
            this.F = i62;
        }
        g61 g61Var20 = u61Var.F;
        if (g61Var20 != null && !g61Var20.f37441l && !g61Var20.f37433a) {
            int i63 = this.f44024c0;
            if (i63 > 0) {
                this.f44024c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.f44024c0;
            this.f44024c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.f44024c0;
        this.f44024c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.f44024c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.f44024c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.f44024c0 = size4;
            if (u61Var.f42050v0.size() != u61Var.f42049u0.size()) {
                int i68 = this.f44024c0;
                this.f44024c0 = i68 + 1;
                this.f44026f = i68;
            } else {
                int i69 = this.f44024c0;
                this.f44024c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.f44024c0;
            this.f44024c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int b() {
        return this.f44024c0;
    }

    @Override
    public final long c(int i10) {
        int i11 = this.I;
        if (i10 >= i11 && i10 < this.J) {
            return ((r61) this.f44025d0.f42056y0.get(i10 - i11)).b();
        }
        if (i10 == this.e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f44027n) {
            return 3L;
        }
        if (i10 == this.f44028r) {
            return 4L;
        }
        if (i10 == this.D) {
            return 5L;
        }
        if (i10 == this.f44029s) {
            return 6L;
        }
        if (i10 == this.f44030w) {
            return 7L;
        }
        if (i10 == this.f44031x) {
            return 8L;
        }
        if (i10 == this.f44032y) {
            return 9L;
        }
        if (i10 == this.K) {
            return 10L;
        }
        if (i10 == this.L) {
            return 11L;
        }
        if (i10 == this.M) {
            return 12L;
        }
        if (i10 == this.N) {
            return 13L;
        }
        if (i10 == this.O) {
            return 14L;
        }
        if (i10 == this.P) {
            return 15L;
        }
        if (i10 == this.E) {
            return 16L;
        }
        if (i10 == this.F) {
            return 17L;
        }
        if (i10 == this.G) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int d(int i10) {
        if (i10 != this.e && i10 != this.h && i10 != this.f44027n && i10 != this.D && i10 != this.O && i10 != this.K) {
            if (i10 != this.f44028r && i10 != this.f44029s && i10 != this.F) {
                if (i10 != this.f44030w && i10 != this.f44031x && i10 != this.L && i10 != this.N && i10 != this.E && i10 != this.G) {
                    if (i10 != this.f44032y && i10 != this.M && i10 != this.P) {
                        if (i10 >= this.I && i10 <= this.J) {
                            return 9;
                        }
                        if (i10 == this.f44026f) {
                            return 11;
                        }
                        if (this.f44022b0.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.H && i10 != this.f44023c && i10 != this.T && i10 != this.Q && i10 != this.W) {
                            if (i10 == this.d) {
                                return 14;
                            }
                            if ((i10 >= this.U && i10 <= this.V) || ((i10 >= this.R && i10 <= this.S) || (i10 >= this.X && i10 <= this.Y))) {
                                return 9;
                            }
                            if (i10 == this.Z) {
                                return 15;
                            }
                            return 10;
                        }
                        return 13;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z51.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        int i11;
        int i12 = 4;
        u61 u61Var = this.f44025d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.k2) u61Var).currentAccount;
            View f61Var = new f61(u61Var, context, i11, i10, u61Var.Z);
            f61Var.setWillNotDraw(false);
            b5Var = f61Var;
        } else if (i10 == 9) {
            View a8Var = new org.telegram.ui.Cells.a8(viewGroup.getContext(), u61Var.f42023a, u61Var.getResourceProvider());
            a8Var.setWillNotDraw(false);
            b5Var = a8Var;
        } else if (i10 == 11) {
            b5Var = new org.telegram.ui.Cells.v4(viewGroup.getContext());
        } else if (i10 == 12) {
            b5Var = new org.telegram.ui.Cells.o3(viewGroup.getContext(), org.telegram.messenger.i0.L(15.0f));
        } else if (i10 == 13) {
            View dVar = new dg.d(viewGroup.getContext(), null);
            dVar.setWillNotDraw(false);
            dVar.setPadding(dVar.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar.getRight(), org.telegram.messenger.i0.L(16.0f));
            b5Var = dVar;
        } else if (i10 == 14) {
            Context context2 = viewGroup.getContext();
            if (u61Var.f42026b0) {
                i12 = 2;
            }
            b5Var = new o61(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(viewGroup.getContext());
            b5Var2.a(org.telegram.ui.ActionBar.t6.f21259v6, org.telegram.ui.ActionBar.t6.f21242u6);
            b5Var = b5Var2;
        } else {
            b5Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), 0, 0);
        }
        return sc.e.o(b5Var, b5Var, -1, -2);
    }
}
