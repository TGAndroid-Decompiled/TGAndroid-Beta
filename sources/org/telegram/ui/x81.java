package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x81 extends org.telegram.ui.Components.vk0 {
    public int Y;
    public final s91 Z;
    public int d;
    public int f44397c = -1;
    public int f44398e = -1;
    public int f44399f = -1;
    public int h = -1;
    public int f44400n = -1;
    public int f44401r = -1;
    public int f44402s = -1;
    public int v = -1;
    public int f44403w = -1;
    public int f44404x = -1;
    public int f44405y = -1;
    public int A = -1;
    public int B = -1;
    public int C = -1;
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
    public final a0.g W = new a0.g(0);
    public final a0.g X = new a0.g(0);

    public x81(s91 s91Var) {
        this.Z = s91Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 9 && i9 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.f44398e = -1;
        this.h = -1;
        this.f44401r = -1;
        this.v = -1;
        this.f44403w = -1;
        this.f44404x = -1;
        this.E = -1;
        this.F = -1;
        this.f44399f = -1;
        this.D = -1;
        this.f44402s = -1;
        this.f44400n = -1;
        this.f44405y = -1;
        this.C = -1;
        this.B = -1;
        this.A = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
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
        this.Y = 0;
        a0.g gVar = this.X;
        gVar.clear();
        a0.g gVar2 = this.W;
        gVar2.clear();
        s91 s91Var = this.Z;
        ArrayList arrayList = s91Var.f42629r0;
        ArrayList arrayList2 = s91Var.L;
        ArrayList arrayList3 = s91Var.M;
        ArrayList arrayList4 = s91Var.K;
        if (s91Var.Y) {
            if (s91Var.C != null) {
                int i9 = this.Y;
                this.f44397c = i9;
                this.Y = i9 + 2;
                this.d = i9 + 1;
            }
            e91 e91Var = s91Var.d;
            if (e91Var != null && !e91Var.f37878l) {
                int i10 = this.Y;
                if (i10 > 0) {
                    this.Y = i10 + 1;
                    gVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.Y;
                this.Y = i11 + 1;
                this.f44398e = i11;
            }
            e91 e91Var2 = s91Var.D;
            if (e91Var2 != null && !e91Var2.f37878l) {
                int i12 = this.Y;
                if (i12 > 0) {
                    this.Y = i12 + 1;
                    gVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.Y;
                this.Y = i13 + 1;
                this.G = i13;
            }
            e91 e91Var3 = s91Var.E;
            if (e91Var3 != null && !e91Var3.f37878l && !e91Var3.f37869a) {
                int i14 = this.Y;
                if (i14 > 0) {
                    this.Y = i14 + 1;
                    gVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.Y;
                this.Y = i15 + 1;
                this.H = i15;
            }
            e91 e91Var4 = s91Var.F;
            if (e91Var4 != null && !e91Var4.f37878l && !e91Var4.f37869a) {
                int i16 = this.Y;
                if (i16 > 0) {
                    this.Y = i16 + 1;
                    gVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.Y;
                this.Y = i17 + 1;
                this.I = i17;
            }
            e91 e91Var5 = s91Var.G;
            if (e91Var5 != null && !e91Var5.f37878l && !e91Var5.f37869a) {
                int i18 = this.Y;
                if (i18 > 0) {
                    this.Y = i18 + 1;
                    gVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.Y;
                this.Y = i19 + 1;
                this.J = i19;
            }
            e91 e91Var6 = s91Var.H;
            if (e91Var6 != null && !e91Var6.f37878l && !e91Var6.f37869a) {
                int i20 = this.Y;
                if (i20 > 0) {
                    this.Y = i20 + 1;
                    gVar2.add(Integer.valueOf(i20));
                }
                int i21 = this.Y;
                this.Y = i21 + 1;
                this.K = i21;
            }
            e91 e91Var7 = s91Var.f42613e;
            if (e91Var7 != null && !e91Var7.f37878l && !e91Var7.f37869a) {
                int i22 = this.Y;
                if (i22 > 0) {
                    this.Y = i22 + 1;
                    gVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.Y;
                this.Y = i23 + 1;
                this.f44400n = i23;
            }
            e91 e91Var8 = s91Var.I;
            if (e91Var8 != null && !e91Var8.f37878l && !e91Var8.f37869a) {
                int i24 = this.Y;
                if (i24 > 0) {
                    this.Y = i24 + 1;
                    gVar2.add(Integer.valueOf(i24));
                }
                int i25 = this.Y;
                this.Y = i25 + 1;
                this.L = i25;
            }
            if (arrayList4.size() > 0) {
                int i26 = this.Y;
                if (i26 > 0) {
                    this.Y = i26 + 1;
                    gVar2.add(Integer.valueOf(i26));
                }
                int i27 = this.Y;
                int i28 = i27 + 1;
                this.M = i27;
                this.Y = i27 + 2;
                this.N = i28;
                int size = arrayList4.size() + i28;
                this.O = size - 1;
                this.Y = size;
                if (arrayList4.size() != s91Var.J.size()) {
                    int i29 = this.Y;
                    this.Y = i29 + 1;
                    this.V = i29;
                } else {
                    int i30 = this.Y;
                    this.Y = i30 + 1;
                    gVar.add(Integer.valueOf(i30));
                }
            }
            if (arrayList3.size() > 0) {
                int i31 = this.Y;
                if (i31 > 0) {
                    this.Y = i31 + 1;
                    gVar2.add(Integer.valueOf(i31));
                }
                int i32 = this.Y;
                int i33 = i32 + 1;
                this.P = i32;
                this.Y = i32 + 2;
                this.Q = i33;
                int size2 = arrayList3.size() + i33;
                this.R = size2 - 1;
                this.Y = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i34 = this.Y;
                if (i34 > 0) {
                    this.Y = i34 + 1;
                    gVar2.add(Integer.valueOf(i34));
                }
                int i35 = this.Y;
                int i36 = i35 + 1;
                this.S = i35;
                this.Y = i35 + 2;
                this.T = i36;
                int size3 = arrayList2.size() + i36;
                this.U = size3 - 1;
                this.Y = size3;
            }
            int i37 = this.Y;
            if (i37 > 0) {
                this.Y = i37 + 1;
                gVar.add(Integer.valueOf(i37));
                int i38 = this.Y;
                this.Y = i38 + 1;
                gVar2.add(Integer.valueOf(i38));
                return;
            }
            return;
        }
        if (s91Var.f42615f != null) {
            int i39 = this.Y;
            this.f44397c = i39;
            this.Y = i39 + 2;
            this.d = i39 + 1;
        }
        e91 e91Var9 = s91Var.d;
        if (e91Var9 != null && !e91Var9.f37878l) {
            int i40 = this.Y;
            if (i40 > 0) {
                this.Y = i40 + 1;
                gVar2.add(Integer.valueOf(i40));
            }
            int i41 = this.Y;
            this.Y = i41 + 1;
            this.f44398e = i41;
        }
        e91 e91Var10 = s91Var.h;
        if (e91Var10 != null && !e91Var10.f37878l) {
            int i42 = this.Y;
            if (i42 > 0) {
                this.Y = i42 + 1;
                gVar2.add(Integer.valueOf(i42));
            }
            int i43 = this.Y;
            this.Y = i43 + 1;
            this.h = i43;
        }
        e91 e91Var11 = s91Var.f42637x;
        if (e91Var11 != null && !e91Var11.f37878l) {
            int i44 = this.Y;
            if (i44 > 0) {
                this.Y = i44 + 1;
                gVar2.add(Integer.valueOf(i44));
            }
            int i45 = this.Y;
            this.Y = i45 + 1;
            this.f44405y = i45;
        }
        e91 e91Var12 = s91Var.f42613e;
        if (e91Var12 != null && !e91Var12.f37878l) {
            int i46 = this.Y;
            if (i46 > 0) {
                this.Y = i46 + 1;
                gVar2.add(Integer.valueOf(i46));
            }
            int i47 = this.Y;
            this.Y = i47 + 1;
            this.f44400n = i47;
        }
        e91 e91Var13 = s91Var.f42630s;
        if (e91Var13 != null && !e91Var13.f37878l) {
            int i48 = this.Y;
            if (i48 > 0) {
                this.Y = i48 + 1;
                gVar2.add(Integer.valueOf(i48));
            }
            int i49 = this.Y;
            this.Y = i49 + 1;
            this.v = i49;
        }
        e91 e91Var14 = s91Var.v;
        if (e91Var14 != null && !e91Var14.f37878l) {
            int i50 = this.Y;
            if (i50 > 0) {
                this.Y = i50 + 1;
                gVar2.add(Integer.valueOf(i50));
            }
            int i51 = this.Y;
            this.Y = i51 + 1;
            this.f44403w = i51;
        }
        e91 e91Var15 = s91Var.f42635w;
        if (e91Var15 != null && !e91Var15.f37878l) {
            int i52 = this.Y;
            if (i52 > 0) {
                this.Y = i52 + 1;
                gVar2.add(Integer.valueOf(i52));
            }
            int i53 = this.Y;
            this.Y = i53 + 1;
            this.f44404x = i53;
        }
        e91 e91Var16 = s91Var.f42623n;
        if (e91Var16 != null && !e91Var16.f37878l) {
            int i54 = this.Y;
            if (i54 > 0) {
                this.Y = i54 + 1;
                gVar2.add(Integer.valueOf(i54));
            }
            int i55 = this.Y;
            this.Y = i55 + 1;
            this.f44401r = i55;
        }
        e91 e91Var17 = s91Var.f42628r;
        if (e91Var17 != null && !e91Var17.f37877k && !e91Var17.f37869a) {
            int i56 = this.Y;
            if (i56 > 0) {
                this.Y = i56 + 1;
                gVar2.add(Integer.valueOf(i56));
            }
            int i57 = this.Y;
            this.Y = i57 + 1;
            this.f44402s = i57;
        }
        e91 e91Var18 = s91Var.f42639y;
        if (e91Var18 != null && !e91Var18.f37878l && !e91Var18.f37869a) {
            int i58 = this.Y;
            if (i58 > 0) {
                this.Y = i58 + 1;
                gVar2.add(Integer.valueOf(i58));
            }
            int i59 = this.Y;
            this.Y = i59 + 1;
            this.A = i59;
        }
        e91 e91Var19 = s91Var.A;
        if (e91Var19 != null && !e91Var19.f37878l && !e91Var19.f37869a) {
            int i60 = this.Y;
            if (i60 > 0) {
                this.Y = i60 + 1;
                gVar2.add(Integer.valueOf(i60));
            }
            int i61 = this.Y;
            this.Y = i61 + 1;
            this.B = i61;
        }
        e91 e91Var20 = s91Var.B;
        if (e91Var20 != null && !e91Var20.f37878l && !e91Var20.f37869a) {
            int i62 = this.Y;
            if (i62 > 0) {
                this.Y = i62 + 1;
                gVar2.add(Integer.valueOf(i62));
            }
            int i63 = this.Y;
            this.Y = i63 + 1;
            this.C = i63;
        }
        int i64 = this.Y;
        this.Y = i64 + 1;
        gVar2.add(Integer.valueOf(i64));
        if (arrayList.size() > 0) {
            int i65 = this.Y;
            int i66 = i65 + 1;
            this.D = i65;
            this.Y = i65 + 2;
            this.E = i66;
            int size4 = arrayList.size() + i66;
            this.F = size4 - 1;
            this.Y = size4;
            if (s91Var.f42625o0.size() != s91Var.f42624n0.size()) {
                int i67 = this.Y;
                this.Y = i67 + 1;
                this.f44399f = i67;
            } else {
                int i68 = this.Y;
                this.Y = i68 + 1;
                gVar.add(Integer.valueOf(i68));
            }
            int i69 = this.Y;
            this.Y = i69 + 1;
            gVar2.add(Integer.valueOf(i69));
        }
    }

    @Override
    public final int h() {
        return this.Y;
    }

    @Override
    public final long i(int i9) {
        int i10 = this.E;
        if (i9 >= i10 && i9 < this.F) {
            return ((p91) this.Z.f42629r0.get(i9 - i10)).b();
        }
        if (i9 == this.f44398e) {
            return 1L;
        }
        if (i9 == this.h) {
            return 2L;
        }
        if (i9 == this.f44400n) {
            return 3L;
        }
        if (i9 == this.f44401r) {
            return 4L;
        }
        if (i9 == this.f44405y) {
            return 5L;
        }
        if (i9 == this.f44402s) {
            return 6L;
        }
        if (i9 == this.v) {
            return 7L;
        }
        if (i9 == this.f44403w) {
            return 8L;
        }
        if (i9 == this.f44404x) {
            return 9L;
        }
        if (i9 == this.G) {
            return 10L;
        }
        if (i9 == this.H) {
            return 11L;
        }
        if (i9 == this.I) {
            return 12L;
        }
        if (i9 == this.J) {
            return 13L;
        }
        if (i9 == this.K) {
            return 14L;
        }
        if (i9 == this.L) {
            return 15L;
        }
        if (i9 == this.A) {
            return 16L;
        }
        if (i9 == this.B) {
            return 17L;
        }
        if (i9 == this.C) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int j(int i9) {
        if (i9 != this.f44398e && i9 != this.h && i9 != this.f44400n && i9 != this.f44405y && i9 != this.K && i9 != this.G) {
            if (i9 != this.f44401r && i9 != this.f44402s && i9 != this.B) {
                if (i9 != this.v && i9 != this.f44403w && i9 != this.H && i9 != this.J && i9 != this.A && i9 != this.C) {
                    if (i9 != this.f44404x && i9 != this.I && i9 != this.L) {
                        if (i9 >= this.E && i9 <= this.F) {
                            return 9;
                        }
                        if (i9 == this.f44399f) {
                            return 11;
                        }
                        if (this.X.contains(Integer.valueOf(i9))) {
                            return 12;
                        }
                        if (i9 != this.D && i9 != this.f44397c && i9 != this.P && i9 != this.M && i9 != this.S) {
                            if (i9 == this.d) {
                                return 14;
                            }
                            if ((i9 >= this.Q && i9 <= this.R) || ((i9 >= this.N && i9 <= this.O) || (i9 >= this.T && i9 <= this.U))) {
                                return 9;
                            }
                            if (i9 == this.V) {
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
    public final void v(f2.q1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x81.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.y4 y4Var;
        int i10;
        int i11 = 4;
        s91 s91Var = this.Z;
        if (i9 >= 0 && i9 <= 4) {
            Context context = viewGroup.getContext();
            i10 = ((org.telegram.ui.ActionBar.o2) s91Var).currentAccount;
            View d91Var = new d91(s91Var, context, i10, i9, s91Var.W);
            d91Var.setWillNotDraw(false);
            y4Var = d91Var;
        } else if (i9 == 9) {
            View a8Var = new org.telegram.ui.Cells.a8(viewGroup.getContext(), s91Var.f42606a, s91Var.getResourceProvider());
            a8Var.setWillNotDraw(false);
            y4Var = a8Var;
        } else if (i9 == 11) {
            y4Var = new org.telegram.ui.Cells.s4(viewGroup.getContext());
        } else if (i9 == 12) {
            y4Var = new org.telegram.ui.Cells.l3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i9 == 13) {
            View cVar = new sf.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
            y4Var = cVar;
        } else if (i9 == 14) {
            Context context2 = viewGroup.getContext();
            if (s91Var.Y) {
                i11 = 2;
            }
            y4Var = new m91(context2, i11);
        } else if (i9 == 15) {
            org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var2.a(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
            y4Var = y4Var2;
        } else {
            y4Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
        }
        return j3.r0.s(y4Var, y4Var, -1, -2);
    }
}
