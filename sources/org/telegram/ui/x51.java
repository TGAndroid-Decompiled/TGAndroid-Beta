package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class x51 extends org.telegram.ui.Components.tk0 {
    public int f43250c0;
    public int d;
    public final s61 f43251d0;
    public int f43249c = -1;
    public int e = -1;
    public int f43252f = -1;
    public int h = -1;
    public int f43253n = -1;
    public int f43254r = -1;
    public int f43255s = -1;
    public int f43256w = -1;
    public int f43257x = -1;
    public int f43258y = -1;
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
    public final a0.g f43247a0 = new a0.g(0);
    public final a0.g f43248b0 = new a0.g(0);

    public x51(s61 s61Var) {
        this.f43251d0 = s61Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.f43254r = -1;
        this.f43256w = -1;
        this.f43257x = -1;
        this.f43258y = -1;
        this.I = -1;
        this.J = -1;
        this.f43252f = -1;
        this.H = -1;
        this.f43255s = -1;
        this.f43253n = -1;
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
        this.f43250c0 = 0;
        a0.g gVar = this.f43248b0;
        gVar.clear();
        a0.g gVar2 = this.f43247a0;
        gVar2.clear();
        s61 s61Var = this.f43251d0;
        ArrayList arrayList = s61Var.f41269y0;
        ArrayList arrayList2 = s61Var.P;
        ArrayList arrayList3 = s61Var.Q;
        ArrayList arrayList4 = s61Var.O;
        if (s61Var.f41239b0) {
            if (s61Var.G != null) {
                int i10 = this.f43250c0;
                this.f43249c = i10;
                this.f43250c0 = i10 + 2;
                this.d = i10 + 1;
            }
            e61 e61Var = s61Var.d;
            if (e61Var != null && !e61Var.f36756l) {
                int i11 = this.f43250c0;
                if (i11 > 0) {
                    this.f43250c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.f43250c0;
                this.f43250c0 = i12 + 1;
                this.e = i12;
            }
            e61 e61Var2 = s61Var.H;
            if (e61Var2 != null && !e61Var2.f36756l) {
                int i13 = this.f43250c0;
                if (i13 > 0) {
                    this.f43250c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.f43250c0;
                this.f43250c0 = i14 + 1;
                this.K = i14;
            }
            e61 e61Var3 = s61Var.I;
            if (e61Var3 != null && !e61Var3.f36756l && !e61Var3.f36748a) {
                int i15 = this.f43250c0;
                if (i15 > 0) {
                    this.f43250c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.f43250c0;
                this.f43250c0 = i16 + 1;
                this.L = i16;
            }
            e61 e61Var4 = s61Var.J;
            if (e61Var4 != null && !e61Var4.f36756l && !e61Var4.f36748a) {
                int i17 = this.f43250c0;
                if (i17 > 0) {
                    this.f43250c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.f43250c0;
                this.f43250c0 = i18 + 1;
                this.M = i18;
            }
            e61 e61Var5 = s61Var.K;
            if (e61Var5 != null && !e61Var5.f36756l && !e61Var5.f36748a) {
                int i19 = this.f43250c0;
                if (i19 > 0) {
                    this.f43250c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.f43250c0;
                this.f43250c0 = i20 + 1;
                this.N = i20;
            }
            e61 e61Var6 = s61Var.L;
            if (e61Var6 != null && !e61Var6.f36756l && !e61Var6.f36748a) {
                int i21 = this.f43250c0;
                if (i21 > 0) {
                    this.f43250c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.f43250c0;
                this.f43250c0 = i22 + 1;
                this.O = i22;
            }
            e61 e61Var7 = s61Var.e;
            if (e61Var7 != null && !e61Var7.f36756l && !e61Var7.f36748a) {
                int i23 = this.f43250c0;
                if (i23 > 0) {
                    this.f43250c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.f43250c0;
                this.f43250c0 = i24 + 1;
                this.f43253n = i24;
            }
            e61 e61Var8 = s61Var.M;
            if (e61Var8 != null && !e61Var8.f36756l && !e61Var8.f36748a) {
                int i25 = this.f43250c0;
                if (i25 > 0) {
                    this.f43250c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.f43250c0;
                this.f43250c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.f43250c0;
                if (i27 > 0) {
                    this.f43250c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.f43250c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.f43250c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.f43250c0 = size;
                if (arrayList4.size() != s61Var.N.size()) {
                    int i30 = this.f43250c0;
                    this.f43250c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.f43250c0;
                    this.f43250c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.f43250c0;
                if (i32 > 0) {
                    this.f43250c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.f43250c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.f43250c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.f43250c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.f43250c0;
                if (i35 > 0) {
                    this.f43250c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.f43250c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.f43250c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.f43250c0 = size3;
            }
            int i38 = this.f43250c0;
            if (i38 > 0) {
                this.f43250c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.f43250c0;
                this.f43250c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (s61Var.f41244f != null) {
            int i40 = this.f43250c0;
            this.f43249c = i40;
            this.f43250c0 = i40 + 2;
            this.d = i40 + 1;
        }
        e61 e61Var9 = s61Var.d;
        if (e61Var9 != null && !e61Var9.f36756l) {
            int i41 = this.f43250c0;
            if (i41 > 0) {
                this.f43250c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.f43250c0;
            this.f43250c0 = i42 + 1;
            this.e = i42;
        }
        e61 e61Var10 = s61Var.h;
        if (e61Var10 != null && !e61Var10.f36756l) {
            int i43 = this.f43250c0;
            if (i43 > 0) {
                this.f43250c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.f43250c0;
            this.f43250c0 = i44 + 1;
            this.h = i44;
        }
        e61 e61Var11 = s61Var.f41268y;
        if (e61Var11 != null && !e61Var11.f36756l) {
            int i45 = this.f43250c0;
            if (i45 > 0) {
                this.f43250c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.f43250c0;
            this.f43250c0 = i46 + 1;
            this.D = i46;
        }
        e61 e61Var12 = s61Var.e;
        if (e61Var12 != null && !e61Var12.f36756l) {
            int i47 = this.f43250c0;
            if (i47 > 0) {
                this.f43250c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.f43250c0;
            this.f43250c0 = i48 + 1;
            this.f43253n = i48;
        }
        e61 e61Var13 = s61Var.f41259s;
        if (e61Var13 != null && !e61Var13.f36756l) {
            int i49 = this.f43250c0;
            if (i49 > 0) {
                this.f43250c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.f43250c0;
            this.f43250c0 = i50 + 1;
            this.f43256w = i50;
        }
        e61 e61Var14 = s61Var.f41264w;
        if (e61Var14 != null && !e61Var14.f36756l) {
            int i51 = this.f43250c0;
            if (i51 > 0) {
                this.f43250c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.f43250c0;
            this.f43250c0 = i52 + 1;
            this.f43257x = i52;
        }
        e61 e61Var15 = s61Var.f41266x;
        if (e61Var15 != null && !e61Var15.f36756l) {
            int i53 = this.f43250c0;
            if (i53 > 0) {
                this.f43250c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.f43250c0;
            this.f43250c0 = i54 + 1;
            this.f43258y = i54;
        }
        e61 e61Var16 = s61Var.f41252n;
        if (e61Var16 != null && !e61Var16.f36756l) {
            int i55 = this.f43250c0;
            if (i55 > 0) {
                this.f43250c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.f43250c0;
            this.f43250c0 = i56 + 1;
            this.f43254r = i56;
        }
        e61 e61Var17 = s61Var.f41257r;
        if (e61Var17 != null && !e61Var17.f36755k && !e61Var17.f36748a) {
            int i57 = this.f43250c0;
            if (i57 > 0) {
                this.f43250c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.f43250c0;
            this.f43250c0 = i58 + 1;
            this.f43255s = i58;
        }
        e61 e61Var18 = s61Var.D;
        if (e61Var18 != null && !e61Var18.f36756l && !e61Var18.f36748a) {
            int i59 = this.f43250c0;
            if (i59 > 0) {
                this.f43250c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.f43250c0;
            this.f43250c0 = i60 + 1;
            this.E = i60;
        }
        e61 e61Var19 = s61Var.E;
        if (e61Var19 != null && !e61Var19.f36756l && !e61Var19.f36748a) {
            int i61 = this.f43250c0;
            if (i61 > 0) {
                this.f43250c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.f43250c0;
            this.f43250c0 = i62 + 1;
            this.F = i62;
        }
        e61 e61Var20 = s61Var.F;
        if (e61Var20 != null && !e61Var20.f36756l && !e61Var20.f36748a) {
            int i63 = this.f43250c0;
            if (i63 > 0) {
                this.f43250c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.f43250c0;
            this.f43250c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.f43250c0;
        this.f43250c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.f43250c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.f43250c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.f43250c0 = size4;
            if (s61Var.f41263v0.size() != s61Var.f41262u0.size()) {
                int i68 = this.f43250c0;
                this.f43250c0 = i68 + 1;
                this.f43252f = i68;
            } else {
                int i69 = this.f43250c0;
                this.f43250c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.f43250c0;
            this.f43250c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int b() {
        return this.f43250c0;
    }

    @Override
    public final long c(int i10) {
        int i11 = this.I;
        if (i10 >= i11 && i10 < this.J) {
            return ((p61) this.f43251d0.f41269y0.get(i10 - i11)).b();
        }
        if (i10 == this.e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f43253n) {
            return 3L;
        }
        if (i10 == this.f43254r) {
            return 4L;
        }
        if (i10 == this.D) {
            return 5L;
        }
        if (i10 == this.f43255s) {
            return 6L;
        }
        if (i10 == this.f43256w) {
            return 7L;
        }
        if (i10 == this.f43257x) {
            return 8L;
        }
        if (i10 == this.f43258y) {
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
        if (i10 != this.e && i10 != this.h && i10 != this.f43253n && i10 != this.D && i10 != this.O && i10 != this.K) {
            if (i10 != this.f43254r && i10 != this.f43255s && i10 != this.F) {
                if (i10 != this.f43256w && i10 != this.f43257x && i10 != this.L && i10 != this.N && i10 != this.E && i10 != this.G) {
                    if (i10 != this.f43258y && i10 != this.M && i10 != this.P) {
                        if (i10 >= this.I && i10 <= this.J) {
                            return 9;
                        }
                        if (i10 == this.f43252f) {
                            return 11;
                        }
                        if (this.f43248b0.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.H && i10 != this.f43249c && i10 != this.T && i10 != this.Q && i10 != this.W) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x51.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        int i11;
        int i12 = 4;
        s61 s61Var = this.f43251d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.k2) s61Var).currentAccount;
            View d61Var = new d61(s61Var, context, i11, i10, s61Var.Z);
            d61Var.setWillNotDraw(false);
            b5Var = d61Var;
        } else if (i10 == 9) {
            View a8Var = new org.telegram.ui.Cells.a8(viewGroup.getContext(), s61Var.f41236a, s61Var.getResourceProvider());
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
            if (s61Var.f41239b0) {
                i12 = 2;
            }
            b5Var = new m61(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(viewGroup.getContext());
            b5Var2.a(org.telegram.ui.ActionBar.t6.f21260v6, org.telegram.ui.ActionBar.t6.f21243u6);
            b5Var = b5Var2;
        } else {
            b5Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), 0, 0);
        }
        return sc.e.o(b5Var, b5Var, -1, -2);
    }
}
